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
	
	private IModel _extensionModel;
	private IModel _componentModel;
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
	
	public void setModels(IModel extensionModel, IModel componentModel) {
		setExtensionModel(extensionModel);
		setComponentModel(componentModel);
	}
	
	/**
	 * @param _extensionModel the _extensionModel to set
	 */
	private void setExtensionModel(IModel _extensionModel) {
		this._extensionModel = _extensionModel;
	}

	/**
	 * @param _componentModel the _componentModel to set
	 */
	private void setComponentModel(IModel _componentModel) {
		this._componentModel = _componentModel;
	}

	private void setProject(IProject project) {
		this._project = project;
	}
	
	public IModel getExtensionModel() {
		return _extensionModel;
	}
	
	public IModel getComponentModel() {
		return _componentModel;
	}
	
	public IProject getProject() {
		return _project;		
	}
	
	
	public IProject createProject(String projectName, URI location) throws Exception{	
		logger.log(new Status(IStatus.OK, this.getClass().getName(), "CreateProject() started"));
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Parameters Passed: Name=" + projectName + ", Location=" + location.getPath()));
		
		if(_project == null) {
			_project = createBaseProject(projectName, location);			
			addNature(_project);
		} else {
			logger.log(new Status(IStatus.ERROR, this.getClass().getName(), "Project creation failed. Reason: Close already opened project first!"));
			throw new Exception("Cann't create new project: " + projectName + "! Please close current project first");
		}		
		
		if(this._extensionModel != null) {
			createExtension();	
			
			_extensionModel = _filesBuilderService.saveExtension(_extensionModel, _project);
			logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Extension [Id=" + _extensionModel.getId() + "] created and saved!"));
			
		} else {
			logger.log(new Status(IStatus.WARNING, this.getClass().getName(), "Extension model is empty, no extension will be created"));
		}
		
		if(this._componentModel != null) {
			createComponent(_extensionModel, _componentModel);
			_componentModel = _filesBuilderService.saveComponent(_componentModel, _extensionModel, _project);
			
			//Process the groups related to components available in current extension
			//	1. Get group id/name from the current 'Component' node
			//	2. Return without any action if group is already available under 'Extension' node
			//	3. Check if group already exist in the groups list configured in preferences
			//	4. If available, create a 'Group' node and add it under 'Extension' node
			//	5. If not available, create a new 'Group' node, add it under 'Extension' node
			//			and save it under the 'Groups' preferences
			//Group group = _filesBuilderService.buildAndSaveGroup(((Component)_componentModel).getGroup(), _extensionModel, _project, rootElement);
			//((Extension)_extensionModel).getGroup().add(group);
			_addNewGroup(((Component)_componentModel).getGroup(), _extensionModel, _project);
			//Insert "RequireJS" node in contribution.xml file and create JS file: res/js/"component_name".js
			List<UI5Mode> modes = ((Component)_componentModel).getModes();			
			RequireJSType jsNode = _factory.createRequireJSType();
			String jsFilePath = _filesBuilderService.setupRequireJSNode(_project, _componentModel, _extensionModel, jsNode);
			jsNode.getModes().addAll(modes);
			jsNode.setValue(jsFilePath);
			((Component)_componentModel).getRequireJs().add(jsNode);
			
			//Insert "cssInclude" node and create a css file
			String cssFilePath = _filesBuilderService.setupCSSIncludeNode(_componentModel, _project, _extensionModel);
			((Component)_componentModel).getCssInclude().add(cssFilePath);
			
			//Setup icon file in the project
			String iconPath = _filesBuilderService.setupIconFile(_project, _componentModel, _extensionModel);
			((Component)_componentModel).setIcon(iconPath);
			
			logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Component [Id=" + _componentModel.getId() + "] created and saved!"));
			if(_componentModel != null) {				
				_filesBuilderService.updateExtension(_componentModel, _extensionModel, _project);
				
				logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Extension [Id=" + _extensionModel.getId() + "] updated with Component [ID=" + _componentModel.getId() + "] data"));
			} else {
				logger.log(new Status(IStatus.WARNING, this.getClass().getName(), "Component model is empty, no component will be created"));
			}
			
		}
	
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "CreateProject() finished!"));
		return _project;
	}
	
	public IProject createProject(String projectName, URI location, IModel extensionModel, IModel componentModel) throws Exception{		
		
		_extensionModel = extensionModel;
		_componentModel = componentModel;
		
		IProject project = null;
		if(_project == null) {
			project = this.createProject(projectName, location);
		} else {
			_project.close(null);
			project = this.createProject(projectName, location);
		}
		return project;
	}
	
	
	private void createExtension() throws Exception {
		
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "CreateExtension() started"));
		
		Extension extensionModel = (Extension)_extensionModel;
		String[] folderPaths = {				
				extensionModel.getId() + "/META-INF",
				extensionModel.getId() + "/res/js",
				extensionModel.getId() + "/res/css",
				extensionModel.getId() + "/res/images",
				extensionModel.getId() + "/res/additional_properties_sheet"
		};
		
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Create folders: " + Arrays.toString(folderPaths)));
		addFoldersToProjectStructure(_project, folderPaths);		
	}
	
	public IModel addNewExtension(IModel extensionModel) throws Exception{
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "AddNewExtension() started"));
		
		if(_project != null && extensionModel != null) {
			this.setExtensionModel(extensionModel);
			this.createExtension();
			
			extensionModel = _filesBuilderService.saveExtension(extensionModel, _project);
			
			logger.log(new Status(IStatus.INFO, this.getClass().getName(), "AddNewExtension() completed"));
			return _extensionModel;
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
		((Extension)extensionModel).getComponent().add((Component)componentModel);
	}
	
	public IModel addNewComponent(IModel componentModel, IModel extensionModel) throws Exception{
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "AddNewComponent() started"));
		if(_project != null) {
			this.setComponentModel(componentModel);
			this.setExtensionModel(extensionModel);
			this.createComponent(extensionModel, componentModel);
			
			_componentModel = _filesBuilderService.saveComponent(_componentModel, _extensionModel, _project);
			
			if(_componentModel != null) {
				
				((Extension)_extensionModel).getComponent().add((Component)_componentModel);
				
				logger.log(new Status(IStatus.INFO, this.getClass().getName(), 
						"Component [ID=" + _componentModel.getId() + "] saved under Extension [ID=" + _extensionModel.getId() + ", Project=" + _project.getName() + "]"));
			
				_extensionModel = _filesBuilderService.updateExtension(_componentModel, _extensionModel, _project);
				if(_componentModel != null) {
					logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Extension [ID=" + _extensionModel.getId() + ", Project=" + _project.getName() + " ] updated with new Component [ID=" + _componentModel.getId() + "]"));
					return _componentModel;
				} else {
					logger.log(new Status(IStatus.WARNING, this.getClass().getName(), "Unable to update Extension [ID=" + _extensionModel.getId() + ", Project=" + _project.getName() + " ] with new Component [ID=" + _componentModel.getId() + "] details"));
					return null;
				}
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
		IModel group = _addNewGroup(groupName, extensionModel, project);
		
		_filesBuilderService.updateExtension(null, extensionModel, project);
		return group;
	}
	
	private IModel _addNewGroup(String groupName, IModel extensionModel, IProject project) {
		//JAXBElement<Extension> rootElement = this.getProjectItemsRoot(extensionNode.getId());
		Group group = _filesBuilderService.buildAndSaveGroup(groupName, extensionModel, project);
		((Extension)_extensionModel).getGroup().add(group);		
		return group;
	}
}
