package com.armin.sap.ds.support;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
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
	
	private ObjectFactory _factory;
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
	
	public void setupExtensionFiles(ExtensionHelper extensionHelper, ComponentHelper componentHelper, IProject project, List<JAXBElement<Extension>> extensions) {
		IFile componentFile = null;
		IFile extensionFile = null;
		Extension extensionNode = null;
		Component componentNode = null;
		JAXBElement<Extension> rootElement = null;
				
		//Get reference to contribution.xml and contribution.ztl files
		componentFile = project.getFile(extensionHelper.getId() + "/" + Settings.store().get(Settings.FOR.COMPONENT_ZTL_FILE_NAME));
		extensionFile = project.getFile(extensionHelper.getId() + "/" + Settings.store().get(Settings.FOR.EXTENSION_XML_FILE_NAME));
				
		//Create contribution.xml (extension file) if not already created
		if(!extensionFile.exists()) {		
			try {
				//Get Extension and component nodes from project wizard
				extensionNode = extensionHelper.getModel();
				componentNode = componentHelper.getModel();
				
				//Create SDKExtension element and add current component node to it
				rootElement = _factory.createSdkExtension(extensionNode);
				extensions.add(rootElement);
				extensionNode.getComponent().add(componentNode);
				
				//Process the groups related to components available in current extension
				//	1. Get group id/name from the current 'Component' node
				//	2. Return without any action if group is already available under 'Extension' node
				//	3. Check if group already exist in the groups list configured in preferences
				//	4. If available, create a 'Group' node and add it under 'Extension' node
				//	5. If not available, create a new 'Group' node, add it under 'Extension' node
				//			and save it under the 'Groups' preferences
				setupComponentGroupNode(componentNode, extensionNode, _factory);
				//Insert "RequireJS" node in contribution.xml file and create JS file: res/js/"component_name".js
				setupRequireJSNode(project, componentNode, extensionNode, _factory);
				//Insert "cssInclude" node and create a css file
				setupCSSIncludeNode(componentNode, project, extensionNode);
				//Setup icon file in the project
				setupIconFile(project, componentNode, extensionNode);
								
				saveExtension(extensionFile, rootElement);			
				
			} catch (Exception e) {
				MessageDialog.open(MessageDialog.ERROR, null, "Error while generating file", e.toString(), SWT.SHEET);
				e.printStackTrace();
			}
		}
		
		//setup contribute.ztl file
		saveComponent(componentFile, extensionNode, componentNode, componentHelper);
		
		//prepare manifest file under meta-inf folder
		IFile manifest = project.getFile(extensionNode.getId() + "/META-INF/manifest.mf");
		saveManifest(manifest, extensionNode);
	}
	
	private void saveComponent(IFile componentFile, Extension extensionNode, 
			Component componentNode, ComponentHelper componentHelper) {
		if(!componentFile.exists()) {
			String ztlTemplate = Settings.store().get(Settings.FOR.ZTL_TEMPLATE);
			Map<String, String> fieldMap = new HashMap<String, String>();
			fieldMap.put("package", extensionNode.getId());
			fieldMap.put("class", componentNode.getId());
			fieldMap.put("parentclass", componentHelper.getClassToExtend());
			
			StringSubstitutor parser = new StringSubstitutor(fieldMap);
			String content = parser.replace(ztlTemplate);
			
			try {
				componentFile.create(new ByteArrayInputStream(content.getBytes()), true, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void saveManifest(IFile manifest, Extension extensionNode) {
		String mfTemplate = Settings.store().get(Settings.FOR.MF_TEMPLATE);
		Map<String, String> fieldMap = new HashMap<String, String>();
		fieldMap.put("ext_title", extensionNode.getTitle());
		fieldMap.put("ext_id",  extensionNode.getId());
		fieldMap.put("version", extensionNode.getVersion());
		fieldMap.put("vendor",  extensionNode.getVendor());
		StringSubstitutor parser = new StringSubstitutor(fieldMap);
		String content = parser.replace(mfTemplate);
		try {
			manifest.create(new ByteArrayInputStream(content.getBytes()), true,	null);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void saveExtension(IFile extensionFile, JAXBElement<Extension> rootElement) {
		//Marshal/Save XML to contribution.xml file with pretty format
		JAXBContext context;
		Marshaller marshaller;
		try {
			context = JAXBContext.newInstance(Extension.class);
			marshaller = context.createMarshaller();
			extensionFile.create(new ByteArrayInputStream("<!-- contribution.xml -->".getBytes()), true, null);
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(rootElement, extensionFile.getRawLocation().toFile().getAbsoluteFile());
		} catch (JAXBException | CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void setupIconFile(IProject project, Component componentNode, Extension extensionNode) {
		String iconPath = componentNode.getIcon();
		if(iconPath != null && !iconPath.isEmpty()) {
			File fsIconFile = new File(iconPath);
			IFile iconFile = project.getFile(extensionNode.getId() + "/res/images/" + fsIconFile.getName());
			try {
				iconFile.create(new FileInputStream(fsIconFile), true, null);
				componentNode.setIcon(extensionNode.getId() + "/res/images/" + fsIconFile.getName());
			} catch (FileNotFoundException e) {				
				e.printStackTrace();
			} catch (CoreException e) {				
				e.printStackTrace();
			}
		}
	}
	
	private void setupCSSIncludeNode(Component componentNode, IProject project, Extension extension) {
		//Create cssInclude node		
		String cssFilePath = extension.getId() + "/res/css/" + componentNode.getId() + ".css";		
		createComponentSupportingFile(project, cssFilePath, Settings.store().get(Settings.FOR.CSS_TEMPLATE));
		componentNode.getCssInclude().add(cssFilePath);
	}

	
	private void createComponentSupportingFile(IProject project, String path, String content) {
		IFile file = project.getFile(path);		
		try {
			file.create(new ByteArrayInputStream(content.getBytes()), true, null);
		} catch (CoreException e) {			
			e.printStackTrace();
		}
	}
	
	private void setupRequireJSNode(IProject project, Component componentNode, Extension extensionNode, ObjectFactory factory) {
		//Get the mode from the component
		List<UI5Mode> modes = componentNode.getModes();
		//Create requireJS node
		RequireJSType jsNode = factory.createRequireJSType();
		String jsFilePath = extensionNode.getId() + "/res/js/" + componentNode.getId();
		jsNode.getModes().addAll(modes);
		jsNode.setValue(jsFilePath);
		createComponentSupportingFile(project, jsFilePath + ".js", Settings.store().get(Settings.FOR.JS_TEMPLATE));
		componentNode.getRequireJs().add(jsNode);		
	}

	public void setupComponentGroupNode(Component componentNode, Extension extensionNode, ObjectFactory factory) {
		//Check if there is an group attribute in component and create new group if it don't exists
		String groupName = componentNode.getGroup();
		if(groupName != null) {
			if(!groupName.equals("Default") && !groupName.equals("TECHNICAL_COMPONENT")) {
				Group group = null;
				
				//check whether the group is already added in the current extension node
				for(Group g : extensionNode.getGroup()) {
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
							group = factory.createGroup();
							group.setId(g);
							group.setTitle(g);
							group.setTooltip("Group assigned to component");
							group.setVisible(true);
							extensionNode.getGroup().add(group);
							break;
						}
					}
				}
				
				//if group is still not available in list too, add same to extension and custom list
				if(group == null) {
					group = factory.createGroup();
					group.setId(groupName);
					group.setTitle(groupName);
					group.setTooltip("Group assigned to component");
					group.setVisible(true);
					extensionNode.getGroup().add(group);
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
					componentNode.setGroup(null);
				}
			}
		}
	}
}
