package com.armin.sap.ds.builder.service;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.services.IServiceLocator;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.DesignStudioProjectNature;
import com.armin.sap.ds.builder.api.models.Component;
import com.armin.sap.ds.builder.api.models.Extension;
import com.armin.sap.ds.builder.api.models.Group;
import com.armin.sap.ds.builder.api.models.IModel;
import com.armin.sap.ds.builder.api.models.ObjectFactory;
import com.armin.sap.ds.builder.api.models.RequireJSType;
import com.armin.sap.ds.builder.api.models.UI5Mode;


public class ProjectService implements IProjectService {
	
//	private IModel _extensionModel;
//	private IModel _componentModel;
	private IProject _project;
	private IProjectFilesBuilderService _filesBuilderService;
	private IServiceLocator _locator;
	private ILog logger;
	private ObjectFactory _factory;
	
	//private static ProjectService _singleton;
	
	public ProjectService() {
		logger = Activator.getDefault().getLog();
		
		logger.log(new Status(IStatus.OK, this.getClass().getName(), "ProjectService instance created"));
		
		_factory = new ObjectFactory();		
		_filesBuilderService = new ProjectFilesBuilderService();		
	}
	
	public ProjectService(IServiceLocator locator) {
		logger = Activator.getDefault().getLog();
		
		logger.log(new Status(IStatus.OK, this.getClass().getName(), "ProjectService instance created"));
		_factory = new ObjectFactory();
		_locator = locator;
		locator.hasService(IHandlerService.class);
		
		_filesBuilderService = (IProjectFilesBuilderService) _locator.getService(IProjectFilesBuilderService.class);
		
		if(_filesBuilderService == null) {
			_filesBuilderService = new ProjectFilesBuilderService();
		}
	}	
	
//	public void setModels(IModel extensionModel, IModel componentModel) {
//		setExtensionModel(extensionModel);
//		setComponentModel(componentModel);
//	}
	
	/**
	 * @param _extensionModel the _extensionModel to set
	 */
//	private void setExtensionModel(IModel _extensionModel) {
//		this._extensionModel = _extensionModel;
//	}
//
//	/**
//	 * @param _componentModel the _componentModel to set
//	 */
//	private void setComponentModel(IModel _componentModel) {
//		this._componentModel = _componentModel;
//	}

	private void setProject(IProject project) {
		this._project = project;
	}
	
//	public IModel getExtensionModel() {
//		return _extensionModel;
//	}
//	
//	public IModel getComponentModel() {
//		return _componentModel;
//	}
	
	public IProject getProject() {
		return _project;		
	}
	
	
	public IProject createProject(String projectName, URI location, IModel extensionModel, IModel componentModel) throws Exception{	
		logger.log(new Status(IStatus.OK, this.getClass().getName(), "CreateProject() started"));
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Parameters Passed: Name=" + projectName + ", Location=" + location.getPath()));
		
		if(_project != null) {
			_project.close(null);
			_project = null;
		}
			_project = createBaseProject(projectName, location);			
			addNature(_project);
//		} else {
//			logger.log(new Status(IStatus.ERROR, this.getClass().getName(), "Project creation failed. Reason: Close already opened project first!"));
//			throw new Exception("Cann't create new project: " + projectName + "! Please close current project first");
//		}		
		
		if(extensionModel != null) {
			createExtension(extensionModel);	
			
			extensionModel = _filesBuilderService.saveExtension(extensionModel, _project);
			logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Extension [Id=" + extensionModel.getId() + "] created and saved!"));
			
		} else {
			logger.log(new Status(IStatus.WARNING, this.getClass().getName(), "Extension model is empty, no extension will be created"));
		}
		
		if(componentModel != null) {
			createComponent(extensionModel, componentModel);
			componentModel = _filesBuilderService.saveComponent(componentModel, extensionModel, _project);
			
			//Process the groups related to components available in current extension
			//	1. Get group id/name from the current 'Component' node
			//	2. Return without any action if group is already available under 'Extension' node
			//	3. Check if group already exist in the groups list configured in preferences
			//	4. If available, create a 'Group' node and add it under 'Extension' node
			//	5. If not available, create a new 'Group' node, add it under 'Extension' node
			//			and save it under the 'Groups' preferences
		
//			assignGroup(((Component)componentModel).getGroup(), extensionModel, _project);
			
			//Insert "RequireJS" node in contribution.xml file and create JS file: res/js/"component_name".js
//			List<UI5Mode> modes = ((Component)componentModel).getModes();			
//			RequireJSType jsNode = _factory.createRequireJSType();
//			String jsFilePath = _filesBuilderService.setupRequireJSNode(_project, componentModel, extensionModel, jsNode);
//			jsNode.getModes().addAll(modes);
//			jsNode.setValue(jsFilePath);
//			((Component)componentModel).getRequireJs().add(jsNode);
//			
			//Insert "cssInclude" node and create a css file
//			String cssFilePath = _filesBuilderService.setupCSSIncludeNode(componentModel, _project, extensionModel);
//			((Component)componentModel).getCssInclude().add(cssFilePath);
//			
			//Setup icon file in the project
//			String iconPath = _filesBuilderService.setupIconFile(_project, componentModel, extensionModel);
//			((Component)componentModel).setIcon(iconPath);
//			
			logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Component [Id=" + componentModel.getId() + "] created and saved!"));
			if(componentModel != null) {				
				_filesBuilderService.updateExtension(extensionModel, _project);
				
				logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Extension [Id=" + extensionModel.getId() + "] updated with Component [ID=" + componentModel.getId() + "] data"));
			} 
		}
	
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "CreateProject() finished!"));
		return _project;
	}
	
	public IModel updateExtension(IModel extensionModel, IProject project) {
		if(project == null)
			project = _project;
		return _filesBuilderService.updateExtension(extensionModel, project);
	}
	
	
	private void createExtension(IModel model) throws Exception {
		
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "CreateExtension() started"));
		
		Extension extensionModel = (Extension)model;
		String[] folderPaths = {				
				extensionModel.getId() + "/META-INF",
				extensionModel.getId() + "/res" 
		};
		
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Create folders: " + Arrays.toString(folderPaths)));
		addFoldersToProjectStructure(_project, folderPaths);		
	}
	
	public IModel addNewExtension(IModel extensionModel) throws Exception{
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "AddNewExtension() started"));
		
		if(_project != null && extensionModel != null) {
			this.createExtension(extensionModel);
			
			extensionModel = _filesBuilderService.saveExtension(extensionModel, _project);
			
			logger.log(new Status(IStatus.INFO, this.getClass().getName(), "AddNewExtension() completed"));
			return extensionModel;
		} else {
			logger.log(new Status(IStatus.ERROR, this.getClass().getName(), "Parent project do not exists!"));
			throw new Exception("Unable to add extension as no project is opened or created yet!");
		}		
	}
	
	public IModel addNewExtension(IModel extensionModel, IProject project) throws Exception{
		this.setProject(project);
		return this.addNewExtension(extensionModel);
	}
	
	private void createComponent(IModel extensionModel, IModel componentModel) throws Exception{
		String[] folderPaths = {				
				extensionModel.getId() + "/" + componentModel.getId() + "/res/js",
				extensionModel.getId() + "/" + componentModel.getId() + "/res/css",
				extensionModel.getId() + "/" + componentModel.getId() + "/res/images",
				extensionModel.getId() + "/" + componentModel.getId() + "/res/diagrams"
		};
		
		addFoldersToProjectStructure(_project, folderPaths);
		((Extension)extensionModel).getComponent().add((Component)componentModel);
		
		assignGroup(((Component)componentModel).getGroup(), extensionModel, _project);

		//Insert "RequireJS" node in contribution.xml file and create JS file: res/js/"component_name".js
		List<UI5Mode> modes = ((Component)componentModel).getModes();			
		RequireJSType jsNode = _factory.createRequireJSType();
		String jsFilePath = _filesBuilderService.setupRequireJSNode(_project, componentModel, extensionModel, jsNode);
		jsNode.getModes().addAll(modes);
		jsNode.setValue(jsFilePath);
		((Component)componentModel).getRequireJs().add(jsNode);
		
		//Insert "cssInclude" node and create a css file
		String cssFilePath = _filesBuilderService.setupCSSIncludeNode(componentModel, _project, extensionModel);
		((Component)componentModel).getCssInclude().add(cssFilePath);
		
		//Setup icon file in the project
		String iconPath = _filesBuilderService.setupIconFile(_project, componentModel, extensionModel);
		((Component)componentModel).setIcon(iconPath);		
		
		//Setup advanced property sheet path if required
		Component comp = (Component)componentModel;
		if(comp.getPropertySheetPath() != null && !comp.getPropertySheetPath().isEmpty()) {
			String[] apsFolder = {				
					extensionModel.getId() + "/" + componentModel.getId() + "/res/additional_properties_sheet"
			};
			addFoldersToProjectStructure(_project, apsFolder);
			_filesBuilderService.setupAdvancedPropertySheet(_project, componentModel, extensionModel);
		}
	}
	
	public IModel addNewComponent(IModel componentModel, IModel extensionModel) throws Exception{
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "AddNewComponent() started"));
		if(_project != null) {
			this.createComponent(extensionModel, componentModel);
			
			componentModel = _filesBuilderService.saveComponent(componentModel, extensionModel, _project);
			
			if(componentModel != null) {
				
				//((Extension)extensionModel).getComponent().add((Component)componentModel);
				
				logger.log(new Status(IStatus.INFO, this.getClass().getName(), 
						"Component [ID=" + componentModel.getId() + "] saved under Extension [ID=" + extensionModel.getId() + ", Project=" + _project.getName() + "]"));
			
				extensionModel = _filesBuilderService.updateExtension(extensionModel, _project);
				
				logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Extension [ID=" + extensionModel.getId() + ", Project=" + _project.getName() + " ] updated with new Component [ID=" + componentModel.getId() + "]"));
				return componentModel;				
			}
		}
		return null;
	}
	
	public IModel addNewComponent(IModel componentModel, IModel extensionModel, IProject project) throws Exception{
		this.setProject(project);
		return this.addNewComponent(componentModel, extensionModel);
	}
	
	private void addFoldersToProjectStructure(IProject project, String[] paths) throws Exception{
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Add folders to project ["+project.getName() + "] started"));
		for(String path: paths) {
			IFolder etcFolders = project.getFolder(path);
			createFolder(etcFolders);
		}
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Folder creation completed"));
	}
	
	private void addNature(IProject project) throws Exception{
		if(!project.hasNature(DesignStudioProjectNature.NATURE_ID)) {
			IProjectDescription description = project.getDescription();
			String[] prevNatures = description.getNatureIds();
			String[] newNatures = new String[prevNatures.length + 1];
			System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
			newNatures[prevNatures.length] = DesignStudioProjectNature.NATURE_ID;
			description.setNatureIds(newNatures);
			
			IProgressMonitor monitor = null;
			project.setDescription(description, monitor);
		}
		
	}

	private IProject createBaseProject(String projectName, URI location) {
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Create base project started"));
		
		IProject newProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		
		if(!newProject.exists()) {
			URI projectLocation = location;
			IProjectDescription desc = newProject.getWorkspace().newProjectDescription(newProject.getName());
			if(location != null && ResourcesPlugin.getWorkspace().getRoot().getLocationURI().equals(location)) {
				projectLocation = null;
			}
			
			desc.setLocationURI(projectLocation);
			try {
				newProject.create(desc, null);
				if(!newProject.isOpen()) {
					newProject.open(null);
				}
			}catch(Exception e) {
				logger.log(new Status(IStatus.ERROR, this.getClass().getName(), "Create base project: Error while creating project: " + e.getMessage()));
				e.printStackTrace();
			}
		}
		
		logger.log(new Status(IStatus.OK, this.getClass().getName(), "Create base project finishe"));
		return newProject;
	}
	
	private void createFolder(IFolder folder) throws Exception{
		IContainer parent = folder.getParent();
		if(parent instanceof IFolder) {
			createFolder((IFolder)parent);
		}
		if(!folder.exists()) {
			folder.create(false, true, null);
			logger.log(new Status(IStatus.INFO, this.getClass().getName(), "New folder created: " + folder.getLocation()));
		}
	}

	@Override
	public IModel addNewGroup(String groupName, IModel extensionModel, IProject project) {				
		_filesBuilderService.updateExtension(extensionModel, project);
		return _filesBuilderService.findGroup(groupName, extensionModel, project);
	}
	
	private IModel assignGroup(String groupName, IModel extensionModel, IProject project) {		
		Group group = _filesBuilderService.findGroup(groupName, extensionModel, project);
		((Extension)extensionModel).getGroup().add(group);		
		return group;
	}

	@Override
	public boolean saveExtensionFile(String content) {
		return _filesBuilderService.saveExtensionFile(_project, content);		
	}

	@Override
	public boolean saveExtensionFile(String content, IProject project) {		
		return _filesBuilderService.saveExtensionFile(project, content);
	}
}
