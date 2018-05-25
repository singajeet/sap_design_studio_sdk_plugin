package com.armin.sap.ds.support;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.text.StringSubstitutor;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;

import com.armin.sap.ds.ext.plugin.preferences.Settings;
import com.armin.sap.ds.xml.Component;
import com.armin.sap.ds.xml.Extension;
import com.armin.sap.ds.xml.Group;
import com.armin.sap.ds.xml.ObjectFactory;
import com.armin.sap.ds.xml.RequireJSType;
import com.armin.sap.ds.xml.UI5Mode;

public class ProjectFilesBuilder {
	
	private ExtensionHelper _extensionHelper;
	private ComponentHelper _componentHelper;
	private IProject _project;
	private IFile _componentFile;
	private IFile _extensionFile;	 
	private Extension _extensionNode;
	private Component _componentNode;
	private ObjectFactory _factory;
	private JAXBElement<Extension> _rootElement;
	private static ProjectFilesBuilder _singletonInstance;
	
	
	private ProjectFilesBuilder() {
		_factory = new ObjectFactory();
	}
	
	public static ProjectFilesBuilder getInstance() {
		if(_singletonInstance == null) {
			_singletonInstance = new ProjectFilesBuilder();			
		}
		return _singletonInstance;
	}
	
	public void setupProjectFiles(ExtensionHelper extensionHelper, ComponentHelper componentHelper, IProject project) {
		
		_project = project;
		
		//Reference to Extension and Component helper classes
		_extensionHelper = extensionHelper;
		_componentHelper = componentHelper;
		
		//Get reference to contribution.xml and contribution.ztl files
		_componentFile = project.getFile(Settings.store().get(Settings.FOR.COMPONENT_ZTL_FILE_NAME));
		_extensionFile = project.getFile(Settings.store().get(Settings.FOR.EXTENSION_XML_FILE_NAME));
				
		//Create contribution.xml (extension file) if not already created
		if(!_extensionFile.exists()) {		
			try {
				//Get Extension and component nodes from project wizard
				_extensionNode = _extensionHelper.getModel();
				_componentNode = _componentHelper.getModel();
				
				//Create SDKExtension element and add current component node to it
				_rootElement = _factory.createSdkExtension(_extensionNode);
				_extensionNode.getComponent().add(_componentNode);
				
				//Process the groups related to components available in current extension
				//	1. Get group id/name from the current 'Component' node
				//	2. Return without any action if group is already available under 'Extension' node
				//	3. Check if group already exist in the groups list configured in preferences
				//	4. If available, create a 'Group' node and add it under 'Extension' node
				//	5. If not available, create a new 'Group' node, add it under 'Extension' node
				//			and save it under the 'Groups' preferences
				setupComponentGroupNode();
				//Insert "RequireJS" node in contribution.xml file and create JS file: res/js/"component_name".js
				setupRequireJSNode();
				//Insert "cssInclude" node and create a css file
				setupCSSIncludeNode();
			
				//Marshal/Save XML to contribution.xml file with pretty format
				JAXBContext context = JAXBContext.newInstance(Extension.class);
				Marshaller marshaller = context.createMarshaller();
				_extensionFile.create(new ByteArrayInputStream("<!-- contribution.xml -->".getBytes()), true, null);
				marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				marshaller.marshal(_rootElement, _extensionFile.getRawLocation().toFile().getAbsoluteFile());
				
			} catch (Exception e) {
				MessageDialog.open(MessageDialog.ERROR, null, "Error while generating file", e.toString(), SWT.SHEET);
				e.printStackTrace();
			}
		}
	
		if(!_componentFile.exists()) {
			String ztlTemplate = Settings.store().get(Settings.FOR.ZTL_TEMPLATE);
			Map<String, String> fieldMap = new HashMap<String, String>();
			fieldMap.put("package", _extensionNode.getId());
			fieldMap.put("class", _componentNode.getId());
			fieldMap.put("superClass", _componentHelper.getClassToExtend());
			
			StringSubstitutor parser = new StringSubstitutor(fieldMap);
			String content = parser.replace(ztlTemplate);
			
			try {
				_componentFile.create(new ByteArrayInputStream(content.getBytes()), true, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void setupCSSIncludeNode() {
		//Create cssInclude node		
		String cssFilePath = "res/css/" + _componentNode.getId() + ".css";		
		createComponentSupportingFile(cssFilePath, Settings.store().get(Settings.FOR.CSS_TEMPLATE));
		_componentNode.getCssInclude().add(cssFilePath);
	}

	
	private void createComponentSupportingFile(String path, String content) {
		IFile file = _project.getFile(path);		
		try {
			file.create(new ByteArrayInputStream(content.getBytes()), true, null);
		} catch (CoreException e) {			
			e.printStackTrace();
		}
	}
	
	private void setupRequireJSNode() {
		//Get the mode from the component
		List<UI5Mode> modes = _componentNode.getModes();
		//Create requireJS node
		RequireJSType jsNode = _factory.createRequireJSType();
		String jsFilePath = "res/js/" + _componentNode.getId();
		jsNode.getModes().addAll(modes);
		jsNode.setValue(jsFilePath);
		createComponentSupportingFile(jsFilePath + ".js", Settings.store().get(Settings.FOR.JS_TEMPLATE));
		_componentNode.getRequireJs().add(jsNode);		
	}

	public void setupComponentGroupNode() {
		//Check if there is an group attribute in component and create new group if it don't exists
		String groupName = _componentNode.getGroup();
		if(groupName != null) {
			if(!groupName.equals("Default") && !groupName.equals("TECHNICAL_COMPONENT")) {
				Group group = null;
				
				//check whether the group is already added in the current extension node
				for(Group g : _extensionNode.getGroup()) {
					if(g.getId().equals(groupName)) {
						group = g;
						break;
					}							
				}
				//if not found, check if group exists in the preferences of this plugin
				//if available then add it under the current extension node				
				String rawGroups = Settings.store().get(Settings.FOR.GROUPS_LIST);
				String[] groups = null;
				if(rawGroups != null)
					groups = rawGroups.split(";");
				else
					groups = new String[] {"Default", "TECHNICAL_COMPONENT"};
									
				if(group == null) {	
					for(String g : groups) {
						if(g.equals(groupName)) {
							group = _factory.createGroup();
							group.setId(g);
							group.setTitle(g);
							group.setTooltip("Group assigned to component");
							group.setVisible(true);
							_extensionNode.getGroup().add(group);
							break;
						}
					}
				}
				
				//if group is still not available in list too, add same to extension and custom list
				if(group == null) {
					group = _factory.createGroup();
					group.setId(groupName);
					group.setTitle(groupName);
					group.setTooltip("Group assigned to component");
					group.setVisible(true);
					_extensionNode.getGroup().add(group);
					//add new group to preferences also
					
					if(ArrayUtils.isNotEmpty(groups)) {
						ArrayUtils.add(groups, groupName);
					} else {
						groups = new String[1];
						groups[0] = new String(groupName);
					}
					if(groups.length > 0) {
						String buf = groups[0];
						for(int i=1; i<groups.length; i++) {
							buf+= ";" + groups[i];
						}
						Settings.store().set(Settings.FOR.GROUPS_LIST, buf);
					}
				}
			} else {
			
				if(groupName.equals("Default")) {
					_componentNode.setGroup(null);
				}
			}
		}
	}
}
