package com.armin.sap.ds.builder.service;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.commons.text.StringSubstitutor;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.services.IServiceLocator;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.api.common.IDEConstants;
import com.armin.sap.ds.builder.api.models.Component;
import com.armin.sap.ds.builder.api.models.ComponentExtended;
import com.armin.sap.ds.builder.api.models.Extension;
import com.armin.sap.ds.builder.api.models.Group;
import com.armin.sap.ds.builder.api.models.IModel;
import com.armin.sap.ds.builder.api.models.ObjectFactory;
import com.armin.sap.ds.builder.api.models.RequireJSType;
import com.armin.sap.ds.builder.preferences.Settings;


public class ProjectFilesBuilderService implements IProjectFilesBuilderService {
	
	private ILog logger;
	
	
	public ProjectFilesBuilderService() {
		logger = Activator.getDefault().getLog();
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Project Files Builder service started"));
	}
	
	public ProjectFilesBuilderService(IServiceLocator locator) {
		logger = Activator.getDefault().getLog();		
		locator.hasService(IHandlerService.class);
		
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Project Files Builder service started"));
	}
	
	/* (non-Javadoc)
	 * @see com.armin.sap.ds.builder.service.IProjectFilesBuilderService#saveExtension(com.armin.sap.ds.builder.api.models.IModel, org.eclipse.core.resources.IProject, java.util.Map)
	 */
	@Override
	public Extension saveExtension(IModel extensionModel, IProject project) {
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Save extension started - [ID=" + extensionModel.getId() + ", Project=" + project.getName() + "]"));
		
		IFile extensionFile = null;
		
		//Get reference to contribution.xml file
		extensionFile = project.getFile(extensionModel.getId() + "/" + Settings.store().get(Settings.FOR.EXTENSION_XML_FILE_NAME));
		
		//Create contribution.xml (extension file) if not already created
		if(!extensionFile.exists()) {
			try {
				
//				String folderName = extensionModel.getId();
//				IFolder folder = project.getFolder(folderName);
//				if(!folder.exists()) {
//					folder.create(true, true, null);
//				}
				
				boolean saved = _saveExtension(extensionFile, extensionModel);
				
				if(saved) {
					//prepare manifest file under meta-inf folder
					
					IFile manifest = project.getFile(extensionModel.getId() + "/META-INF/manifest.mf");
					_saveManifest(manifest, extensionModel);
					logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Save extension finished"));
				}
				return (Extension)extensionModel;
			}
			catch (Exception e) {
				MessageDialog.open(MessageDialog.ERROR, null, "Error while generating file", e.toString(), SWT.SHEET);
				e.printStackTrace();
				logger.log(new Status(IStatus.ERROR, this.getClass().getName(), "Error while saving extension: " + e.getMessage()));				
			}
		} else {
			logger.log(new Status(IStatus.WARNING, this.getClass().getName(), "Extension file already exists. Use update method instead"));			
		}		
		return null;
	}
	
	/* (non-Javadoc)
	 * @see com.armin.sap.ds.builder.service.IProjectFilesBuilderService#saveComponent(com.armin.sap.ds.builder.api.models.IModel, com.armin.sap.ds.builder.api.models.IModel, org.eclipse.core.resources.IProject)
	 */
	@Override
	public IModel saveComponent(IModel componentModel, IModel extensionModel, IProject project) {
		
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Save component started"));
		IFile componentFile = null;		
		
		//Get reference to contribution.ztl file
		componentFile = project.getFile(extensionModel.getId() + "/" + Settings.store().get(Settings.FOR.COMPONENT_ZTL_FILE_NAME));
			
		//setup contribute.ztl file
		boolean saved = _saveComponent(componentFile, extensionModel, componentModel);	
		if(saved) {
			logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Component [ID=" + componentModel.getId() + ", Ext ID=" + extensionModel.getId() + "] saved!"));		
			return componentModel;
		} else {
			logger.log(new Status(IStatus.ERROR, this.getClass().getName(), "Cannot save Component [ID=" + componentModel.getId() + "] under Extension [ID=" + extensionModel.getId() + "], please see logs for more info"));
			return null;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.armin.sap.ds.builder.service.IProjectFilesBuilderService#setupAllFiles(com.armin.sap.ds.builder.api.models.IModel, com.armin.sap.ds.builder.api.models.IModel, org.eclipse.core.resources.IProject, java.util.Map)
	 */
	@Override
	public Extension setupAllFiles(IModel extensionModel, IModel componentModel, IProject project) {
		Extension element = this.saveExtension(extensionModel, project);
		this.saveComponent(componentModel, extensionModel, project);
		return element;
	}
	
	private boolean _saveComponent(IFile componentFile, IModel extensionNode, 
			IModel componentNode) {
		String ztlTemplate = Settings.store().get(Settings.FOR.ZTL_TEMPLATE);
		Map<String, String> fieldMap = new HashMap<String, String>();
		fieldMap.put("package", extensionNode.getId());
		fieldMap.put("class", componentNode.getId());
		fieldMap.put("parentclass", ((ComponentExtended)componentNode).getClassToExtend());
		
		StringSubstitutor parser = new StringSubstitutor(fieldMap);
		String content = parser.replace(ztlTemplate);
		content = content + "\n\n";
		
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Component Save: ZTL Template parsed with fieldmap - " + fieldMap.values().toString()));
		if(!componentFile.exists()) {
			try {
				componentFile.create(new ByteArrayInputStream(content.getBytes()), true, null);
				logger.log(new Status(IStatus.INFO, this.getClass().getName(), "New file created and saved"));
				return true;
			} catch (CoreException e) {
				e.printStackTrace();
				logger.log(new Status(IStatus.ERROR, this.getClass().getName(), "Error creating new file: " + e.getMessage()));
				return false;
			}
		} else {
			try {
				if(componentFile.isAccessible() && !componentFile.isReadOnly()) {
					componentFile.appendContents(new ByteArrayInputStream(content.getBytes()), true, true, null);
					logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Component file updated and saved"));
					return true;
				} else {
					logger.log(new Status(IStatus.ERROR, this.getClass().getName(), "Error updating component file: Component file is either not accessible or is readonly!"));
					return false;
				}
			}catch(Exception e) {
				e.printStackTrace();
				logger.log(new Status(IStatus.ERROR, this.getClass().getName(), "Error creating new file: " + e.getMessage()));
				return false;
			}
		}
	}
	
	private boolean _saveManifest(IFile manifest, IModel extensionModel) {
		String mfTemplate = Settings.store().get(Settings.FOR.MF_TEMPLATE);
		Map<String, String> fieldMap = new HashMap<String, String>();
		fieldMap.put("ext_title", ((Extension)extensionModel).getTitle());
		fieldMap.put("ext_id",  ((Extension)extensionModel).getId());
		fieldMap.put("version", ((Extension)extensionModel).getVersion());
		fieldMap.put("vendor",  ((Extension)extensionModel).getVendor());
		StringSubstitutor parser = new StringSubstitutor(fieldMap);
		String content = parser.replace(mfTemplate);
		try {
			if(!manifest.exists()) {
				manifest.create(new ByteArrayInputStream(content.getBytes()), true,	null);
			}
		return true;
		}catch(Exception e) {
			e.printStackTrace();
			logger.log(new Status(IStatus.ERROR, this.getClass().getName(), "Error creating manifest file: " + e.getMessage()));
			return false;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.armin.sap.ds.builder.service.IProjectFilesBuilderService#updateExtension(com.armin.sap.ds.builder.api.models.IModel, com.armin.sap.ds.builder.api.models.IModel, org.eclipse.core.resources.IProject, java.util.Map)
	 */
	@Override
	public Extension updateExtension(IModel componentModel, IModel extensionModel, IProject project) {
		try {
			IFile extensionFile = project.getFile(extensionModel.getId() + "/" + Settings.store().get(Settings.FOR.EXTENSION_XML_FILE_NAME));
			
			if(extensionFile.exists()) {
				extensionFile.delete(true, null);
			}
			boolean saved = _saveExtension(extensionFile, extensionModel);
			if(saved)
				return (Extension)extensionModel;
			else
				return null;
		}catch(Exception e) {
			e.printStackTrace();
			logger.log(new Status(IStatus.ERROR, this.getClass().getName(), "Error updating extension file: " + e.getMessage()));			
		}
		return null;
	}
	
	private boolean _saveExtension(IFile extensionFile, IModel model) {
		//Marshal/Save XML to contribution.xml file with pretty format
		JAXBContext context;
		Marshaller marshaller;
		try {
			JAXBElement<Extension> rootElement = (new ObjectFactory()).createSdkExtension((Extension)model);
			context = JAXBContext.newInstance(Extension.class);
			marshaller = context.createMarshaller();
			extensionFile.create(new ByteArrayInputStream("<!-- contribution.xml -->".getBytes()), true, null);
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(rootElement, extensionFile.getRawLocation().toFile().getAbsoluteFile());
			return true;
		} catch (JAXBException | CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.log(new Status(IStatus.ERROR, this.getClass().getName(), "Error saving extension file: " + e.getMessage()));
			return false;
		}
		
	}

	public String setupIconFile(IProject project, IModel componentModel, IModel extensionModel) {
		String iconPath = ((Component)componentModel).getIcon();
		if(iconPath != null && !iconPath.isEmpty()) {
			File fsIconFile = new File(iconPath);
			IFile iconFile = project.getFile(extensionModel.getId() + "/res/images/" + fsIconFile.getName());
			try {
				if(!iconFile.exists()) {
					iconFile.create(new FileInputStream(fsIconFile), true, null);
				}				
				return extensionModel.getId() + "/res/images/" + fsIconFile.getName();
			} catch (FileNotFoundException e) {				
				e.printStackTrace();
				logger.log(new Status(IStatus.ERROR, this.getClass().getName(), "Error setting up icon file: " + e.getMessage()));
				return null;
			} catch (CoreException e) {				
				e.printStackTrace();
				logger.log(new Status(IStatus.ERROR, this.getClass().getName(), "Error setting up icon file: " + e.getMessage()));
				return null;
			}
		}
		return null;
	}
	
	public String setupCSSIncludeNode(IModel componentModel, IProject project, IModel extension) {
		//Create cssInclude node		
		String cssFilePath = extension.getId() + "/res/css/" + componentModel.getId() + ".css";		
		createComponentSupportingFile(project, cssFilePath, Settings.store().get(Settings.FOR.CSS_TEMPLATE));
		return cssFilePath;
	}

	
	public boolean createComponentSupportingFile(IProject project, String path, String content) {
		IFile file = project.getFile(path);		
		try {
			if(!file.exists()) {
				file.create(new ByteArrayInputStream(content.getBytes()), true, null);
			}
			return true;
		} catch (CoreException e) {	
			logger.log(new Status(IStatus.ERROR, this.getClass().getName(), "Error creating new file" + path + ": " + e.getMessage()));
			e.printStackTrace();
			return false;
		}
	}
	
	public String setupRequireJSNode(IProject project, IModel componentModel, IModel extensionModel, RequireJSType jsNodeModel) {
		//Get the mode from the component		
		String jsFilePath = extensionModel.getId() + "/res/js/" + componentModel.getId();
		createComponentSupportingFile(project, jsFilePath + ".js", Settings.store().get(Settings.FOR.JS_TEMPLATE));
		return jsFilePath;		
	}

	public Group buildAndSaveGroup(String groupId, IModel extensionModel, IProject project) {
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Group creation started"));
		//Check if there is an group attribute in component and create new group if it don't exists
		//String groupName = ((Component)componentNode).getGroup().toUpperCase();
		if(groupId != null) {
			groupId = groupId.toUpperCase();
			if(!groupId.equals(IDEConstants.DEFAULT.toUpperCase()) && !groupId.equals(IDEConstants.TECHNICAL_COMPONENT.toUpperCase())) {
				logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Group type: CUSTOM - " + groupId));
				Group group = null;
				
				//check whether the group is already added in the current extension node
				for(Group g : ((Extension)extensionModel).getGroup()) {
					if(g.getId().toUpperCase().equals(groupId)) {
						group = g;
						logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Group found in Extension model instance"));
						if(!isGroupSavedInPreferences(groupId)) {
							saveGroupInPreferences(groupId);
						}
						return group;
					}							
				}
				//if not found, check if group exists in the preferences of this plugin
				//if available then add it under the current extension node				
				String rawGroups = Settings.store().get(Settings.FOR.GROUPS_LIST);
				String[] groups = null;
				if(rawGroups != null)
					groups = rawGroups.split(";");
				else
					groups = new String[] {IDEConstants.DEFAULT.toUpperCase(), IDEConstants.TECHNICAL_COMPONENT.toUpperCase()};
									
				if(group == null) {	
					for(String g : groups) {
						g = g.toUpperCase();
						if(g.equals(groupId)) {
							logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Group found in already saved groups list"));
							group = new Group();
							group.setId(g);
							group.setTitle(g.toUpperCase());
							group.setName(g.toUpperCase());
							logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Group added: [ID=" + groupId + "] to Extension [ID=" + extensionModel.getId() + "]"));
							group.setVisible(true);
							
							//updateExtension(null, extensionNode, project, rootElement);
							return group;
						}
					}
				}
				
				//if group is still not available in list too, add same to extension and custom list
				if(group == null) {
					logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Group not found, creating it now"));
					group = new Group();
					group.setId(groupId);
					group.setTitle(groupId.toUpperCase());
					group.setName(groupId.toUpperCase());
					group.setTooltip("Group assigned to component");
					group.setVisible(true);
					
					//add new group to preferences also
					if(rawGroups != null) {
						rawGroups = rawGroups + ";" + groupId;						
					} else {
						rawGroups = groupId;
					}
					
					Settings.store().set(Settings.FOR.GROUPS_LIST, rawGroups);
					logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Groups saved to local preferences"));
					return group;
				}
			}
			Group group = new Group();
			group.setId(groupId);
			group.setTitle(groupId.toUpperCase());
			group.setName(groupId.toUpperCase());
			group.setTooltip("Group assigned to component");
			group.setVisible(true);
			return group;
		}
		Group group = new Group();
		group.setId(IDEConstants.DEFAULT);
		group.setName(IDEConstants.DEFAULT.toUpperCase());
		group.setTitle(IDEConstants.DEFAULT.toUpperCase());
		group.setTooltip(IDEConstants.DEFAULT);
		return group;
	}

	private void saveGroupInPreferences(String groupId) {
		String rawGroups = Settings.store().get(Settings.FOR.GROUPS_LIST);
		if(rawGroups != null) {
			rawGroups = rawGroups + ";" + groupId.toUpperCase();
		} else {
			rawGroups = groupId.toUpperCase();
		}
		Settings.store().set(Settings.FOR.GROUPS_LIST, rawGroups);
	}

	private boolean isGroupSavedInPreferences(String groupId) {
		String rawGroups = Settings.store().get(Settings.FOR.GROUPS_LIST);
		if(rawGroups != null) {
			String[] groups = rawGroups.split(";");
			for(String group : groups) {
				if(group.toUpperCase().equals(groupId.toUpperCase()))
					return true;
			}
		}
		return false;
	}
}
