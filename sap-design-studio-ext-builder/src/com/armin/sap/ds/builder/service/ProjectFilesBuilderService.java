package com.armin.sap.ds.builder.service;

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
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.services.IServiceLocator;

import com.armin.sap.ds.builder.api.models.Component;
import com.armin.sap.ds.builder.api.models.ComponentExtended;
import com.armin.sap.ds.builder.api.models.Extension;
import com.armin.sap.ds.builder.api.models.Group;
import com.armin.sap.ds.builder.api.models.IModel;
import com.armin.sap.ds.builder.api.models.ObjectFactory;
import com.armin.sap.ds.builder.api.models.RequireJSType;
import com.armin.sap.ds.builder.api.models.UI5Mode;
import com.armin.sap.ds.builder.preferences.Settings;


public class ProjectFilesBuilderService implements IProjectFilesBuilderService {
	
	private ObjectFactory _factory;
	private IServiceLocator _locator;
	
	public ProjectFilesBuilderService() {
		_factory = new ObjectFactory();
	}
	
	public ProjectFilesBuilderService(IServiceLocator locator) {
		_factory = new ObjectFactory();
		_locator = locator;
		locator.hasService(IHandlerService.class);
	}
	
	/* (non-Javadoc)
	 * @see com.armin.sap.ds.builder.service.IProjectFilesBuilderService#saveExtension(com.armin.sap.ds.builder.api.models.IModel, org.eclipse.core.resources.IProject, java.util.Map)
	 */
	@Override
	public void saveExtension(IModel extensionModel, IProject project, Map<String, JAXBElement<Extension>> extensions) {
		IFile extensionFile = null;		
		JAXBElement<Extension> rootElement = null;
		
		//Get reference to contribution.xml file
		extensionFile = project.getFile(extensionModel.getId() + "/" + Settings.store().get(Settings.FOR.EXTENSION_XML_FILE_NAME));
		
		//Create contribution.xml (extension file) if not already created
		if(!extensionFile.exists()) {
			try {
				//Get Extension and component nodes from project wizard
				//extensionNode = extensionModel;
				
				//Create SDKExtension element and add current component node to it
				rootElement = _factory.createSdkExtension((Extension)extensionModel);
				extensions.put(extensionModel.getId(), rootElement);
				_saveExtension(extensionFile, rootElement);
				
				//prepare manifest file under meta-inf folder
				IFile manifest = project.getFile(extensionModel.getId() + "/META-INF/manifest.mf");
				_saveManifest(manifest, extensionModel);
			}
			catch (Exception e) {
				MessageDialog.open(MessageDialog.ERROR, null, "Error while generating file", e.toString(), SWT.SHEET);
				e.printStackTrace();
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see com.armin.sap.ds.builder.service.IProjectFilesBuilderService#saveComponent(com.armin.sap.ds.builder.api.models.IModel, com.armin.sap.ds.builder.api.models.IModel, org.eclipse.core.resources.IProject)
	 */
	@Override
	public void saveComponent(IModel componentModel, IModel extensionModel, IProject project) {
		IFile componentFile = null;		
		
		//Get reference to contribution.ztl file
		componentFile = project.getFile(extensionModel.getId() + "/" + Settings.store().get(Settings.FOR.COMPONENT_ZTL_FILE_NAME));
		
			
		//Process the groups related to components available in current extension
		//	1. Get group id/name from the current 'Component' node
		//	2. Return without any action if group is already available under 'Extension' node
		//	3. Check if group already exist in the groups list configured in preferences
		//	4. If available, create a 'Group' node and add it under 'Extension' node
		//	5. If not available, create a new 'Group' node, add it under 'Extension' node
		//			and save it under the 'Groups' preferences
		setupComponentGroupNode(componentModel, extensionModel, _factory);
		//Insert "RequireJS" node in contribution.xml file and create JS file: res/js/"component_name".js
		setupRequireJSNode(project, componentModel, extensionModel, _factory);
		//Insert "cssInclude" node and create a css file
		setupCSSIncludeNode(componentModel, project, extensionModel);
		//Setup icon file in the project
		setupIconFile(project, componentModel, extensionModel);
		
		if(!componentFile.exists()) {
			((Extension)extensionModel).getComponent().add((Component)componentModel);	
			//setup contribute.ztl file
			_saveComponent(componentFile, extensionModel, componentModel);		
		}
		
	}
	
	/* (non-Javadoc)
	 * @see com.armin.sap.ds.builder.service.IProjectFilesBuilderService#setupAllFiles(com.armin.sap.ds.builder.api.models.IModel, com.armin.sap.ds.builder.api.models.IModel, org.eclipse.core.resources.IProject, java.util.Map)
	 */
	@Override
	public void setupAllFiles(IModel extensionModel, IModel componentModel, IProject project, Map<String, JAXBElement<Extension>> extensions) {
		this.saveExtension(extensionModel, project, extensions);
		this.saveComponent(componentModel, extensionModel, project);
	}
	
	private void _saveComponent(IFile componentFile, IModel extensionNode, 
			IModel componentNode) {
		if(!componentFile.exists()) {
			String ztlTemplate = Settings.store().get(Settings.FOR.ZTL_TEMPLATE);
			Map<String, String> fieldMap = new HashMap<String, String>();
			fieldMap.put("package", extensionNode.getId());
			fieldMap.put("class", componentNode.getId());
			fieldMap.put("parentclass", ((ComponentExtended)componentNode).getClassToExtend());
			
			StringSubstitutor parser = new StringSubstitutor(fieldMap);
			String content = parser.replace(ztlTemplate);
			
			try {
				componentFile.create(new ByteArrayInputStream(content.getBytes()), true, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void _saveManifest(IFile manifest, IModel extensionNode) {
		String mfTemplate = Settings.store().get(Settings.FOR.MF_TEMPLATE);
		Map<String, String> fieldMap = new HashMap<String, String>();
		fieldMap.put("ext_title", ((Extension)extensionNode).getTitle());
		fieldMap.put("ext_id",  ((Extension)extensionNode).getId());
		fieldMap.put("version", ((Extension)extensionNode).getVersion());
		fieldMap.put("vendor",  ((Extension)extensionNode).getVendor());
		StringSubstitutor parser = new StringSubstitutor(fieldMap);
		String content = parser.replace(mfTemplate);
		try {
			if(!manifest.exists()) {
				manifest.create(new ByteArrayInputStream(content.getBytes()), true,	null);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/* (non-Javadoc)
	 * @see com.armin.sap.ds.builder.service.IProjectFilesBuilderService#updateExtension(com.armin.sap.ds.builder.api.models.IModel, com.armin.sap.ds.builder.api.models.IModel, org.eclipse.core.resources.IProject, java.util.Map)
	 */
	@Override
	public void updateExtension(IModel componentModel, IModel extensionModel, IProject project, Map<String, JAXBElement<Extension>> extensions) {
		try {
			IFile extensionFile = project.getFile(extensionModel.getId() + "/" + Settings.store().get(Settings.FOR.EXTENSION_XML_FILE_NAME));
			
			//search for extension's root element in extensions map table
			JAXBElement<Extension> extension = extensions.get(extensionModel.getId());
			if(extension == null) {
				extension = _factory.createSdkExtension((Extension)extensionModel);
			}
			if(extensionFile.exists()) {
//				IPath backupFolder = extensionFile.getParent().getFullPath();
//				String backupFileName = extensionFile.getName() + ".backup";
//				IPath destination = backupFolder.append(backupFileName);
//				extensionFile.move(destination, true, null);
				extensionFile.delete(true, null);
			}
			_saveExtension(extensionFile, extension);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void _saveExtension(IFile extensionFile, JAXBElement<Extension> rootElement) {
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

	private void setupIconFile(IProject project, IModel componentNode, IModel extensionNode) {
		String iconPath = ((Component)componentNode).getIcon();
		if(iconPath != null && !iconPath.isEmpty()) {
			File fsIconFile = new File(iconPath);
			IFile iconFile = project.getFile(extensionNode.getId() + "/res/images/" + fsIconFile.getName());
			try {
				if(!iconFile.exists()) {
					iconFile.create(new FileInputStream(fsIconFile), true, null);
				}
				((Component)componentNode).setIcon(extensionNode.getId() + "/res/images/" + fsIconFile.getName());
			} catch (FileNotFoundException e) {				
				e.printStackTrace();
			} catch (CoreException e) {				
				e.printStackTrace();
			}
		}
	}
	
	private void setupCSSIncludeNode(IModel componentNode, IProject project, IModel extension) {
		//Create cssInclude node		
		String cssFilePath = extension.getId() + "/res/css/" + componentNode.getId() + ".css";		
		createComponentSupportingFile(project, cssFilePath, Settings.store().get(Settings.FOR.CSS_TEMPLATE));
		((Component)componentNode).getCssInclude().add(cssFilePath);
	}

	
	private void createComponentSupportingFile(IProject project, String path, String content) {
		IFile file = project.getFile(path);		
		try {
			if(!file.exists()) {
				file.create(new ByteArrayInputStream(content.getBytes()), true, null);
			}
		} catch (CoreException e) {			
			e.printStackTrace();
		}
	}
	
	private void setupRequireJSNode(IProject project, IModel componentNode, IModel extensionNode, ObjectFactory factory) {
		//Get the mode from the component
		List<UI5Mode> modes = ((Component)componentNode).getModes();
		//Create requireJS node
		RequireJSType jsNode = factory.createRequireJSType();
		String jsFilePath = extensionNode.getId() + "/res/js/" + componentNode.getId();
		jsNode.getModes().addAll(modes);
		jsNode.setValue(jsFilePath);
		createComponentSupportingFile(project, jsFilePath + ".js", Settings.store().get(Settings.FOR.JS_TEMPLATE));
		((Component)componentNode).getRequireJs().add(jsNode);		
	}

	public void setupComponentGroupNode(IModel componentNode, IModel extensionNode, ObjectFactory factory) {
		//Check if there is an group attribute in component and create new group if it don't exists
		String groupName = ((Component)componentNode).getGroup().toUpperCase();
		if(groupName != null) {
			if(!groupName.equals("DEFAULT") && !groupName.equals("TECHNICAL_COMPONENT")) {
				Group group = null;
				
				//check whether the group is already added in the current extension node
				for(Group g : ((Extension)extensionNode).getGroup()) {
					if(g.getId().toUpperCase().equals(groupName)) {
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
					groups = new String[] {"DEFAULT", "TECHNICAL_COMPONENT"};
									
				if(group == null) {	
					for(String g : groups) {
						g = g.toUpperCase();
						if(g.equals(groupName)) {
							group = factory.createGroup();
							group.setId(g);
							group.setTitle(g);
							group.setTooltip("Group assigned to component");
							group.setVisible(true);
							((Extension)extensionNode).getGroup().add(group);
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
					((Extension)extensionNode).getGroup().add(group);
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
			
				if(groupName.equals("DEFAULT")) {
					((Component)componentNode).setGroup(null);
				}
			}
		}
	}
}
