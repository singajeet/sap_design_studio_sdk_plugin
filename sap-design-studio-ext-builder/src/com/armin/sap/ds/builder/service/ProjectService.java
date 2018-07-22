package com.armin.sap.ds.builder.service;

import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBElement;

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
import com.armin.sap.ds.builder.api.models.Extension;
import com.armin.sap.ds.builder.api.models.IModel;


public class ProjectService implements IProjectService {
	
	private IModel _extensionModel;
	private IModel _componentModel;
	private IProject _project;
	private Map<String, JAXBElement<Extension>> _extensions;
	private IProjectFilesBuilderService _filesBuilderService;
	private IServiceLocator _locator;
	private ILog logger;
	
	//private static ProjectService _singleton;
	
	public ProjectService() {
		logger = Activator.getDefault().getLog();
		
		logger.log(new Status(IStatus.OK, this.getClass().getName(), "ProjectService instance created"));
		
		_extensions = new HashMap<String, JAXBElement<Extension>>();
		_filesBuilderService = new ProjectFilesBuilderService();
	}
	
	public ProjectService(IServiceLocator locator) {
		logger = Activator.getDefault().getLog();
		
		logger.log(new Status(IStatus.OK, this.getClass().getName(), "ProjectService instance created"));
		
		_locator = locator;
		locator.hasService(IHandlerService.class);
		_extensions = new HashMap<String, JAXBElement<Extension>>();		
		
		_filesBuilderService = (IProjectFilesBuilderService) _locator.getService(IProjectFilesBuilderService.class);
		
		if(_filesBuilderService == null) {
			_filesBuilderService = new ProjectFilesBuilderService();
		}
	}	
	
//	public static ProjectService get() {
//		if(_singleton == null) {
//			_singleton = new ProjectService();
//		}
//		
//		return _singleton;
//	}
	
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
	
	public Map<String, JAXBElement<Extension>> getExtensionsMap(){
		return _extensions;
	}
	
	public IProject createProject(String projectName, URI location) throws Exception{	
		JAXBElement<Extension> rootElement = null;
		
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
			rootElement = _filesBuilderService.saveExtension(_extensionModel, _project);
			_extensions.put(_extensionModel.getId(), rootElement);
			
			if(rootElement == null) {
				logger.log(new Status(IStatus.WARNING, this.getClass().getName(), "Unable to save Extension [Id=" + _extensionModel.getId() + "]"));
				return null;
			} else {
				logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Extension [Id=" + _extensionModel.getId() + "] created and saved!"));
			}
		} else {
			logger.log(new Status(IStatus.WARNING, this.getClass().getName(), "Extension model is empty, no extension will be created"));
		}
		
		if(this._componentModel != null) {
			createComponent();
			JAXBElement<Extension> element = _filesBuilderService.saveComponent(_componentModel, _extensionModel, _project, rootElement);
			logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Component [Id=" + _componentModel.getId() + "] created and saved!"));
			if(element != null) {
				_filesBuilderService.updateExtension(_componentModel, _extensionModel, _project, rootElement);
				
				_extensions.remove(_extensionModel.getId());
				_extensions.put(_extensionModel.getId(), rootElement);
				
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
	
	public void addNewExtension(IModel extensionModel) throws Exception{
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "AddNewExtension() started"));
		
		if(_project != null && extensionModel != null) {
			this.setExtensionModel(extensionModel);
			this.createExtension();
			JAXBElement<Extension> rootElement = _filesBuilderService.saveExtension(extensionModel, _project);
			_extensions.put(_extensionModel.getId(), rootElement);
			logger.log(new Status(IStatus.INFO, this.getClass().getName(), "AddNewExtension() completed"));
		} else {
			logger.log(new Status(IStatus.ERROR, this.getClass().getName(), "Parent project do not exists!"));
			throw new Exception("Unable to add extension as no project is opened or created yet!");
		}
	}
	
	public void addNewExtension(IModel extensionModel, IProject project) throws Exception{
		this.setProject(project);
		this.addNewExtension(extensionModel);
	}
	
	private void createComponent() throws Exception{
				
	}
	
	public void addNewComponent(IModel componentModel, IModel extensionModel) throws Exception{
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "AddNewComponent() started"));
		if(_project != null) {
			this.setComponentModel(componentModel);
			this.setExtensionModel(extensionModel);
			this.createComponent();
			
			JAXBElement<Extension> rootElement = this.getProjectItemsRoot(extensionModel.getId());
			
			rootElement = _filesBuilderService.saveComponent(_componentModel, _extensionModel, _project, rootElement);
			if(rootElement != null) {
				logger.log(new Status(IStatus.INFO, this.getClass().getName(), 
						"Component [ID=" + _componentModel.getId() + "] saved under Extension [ID=" + _extensionModel.getId() + ", Project=" + _project.getName() + "]"));
			
				rootElement = _filesBuilderService.updateExtension(_componentModel, _extensionModel, _project, rootElement);
				if(rootElement != null) {
					logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Extension [ID=" + _extensionModel.getId() + ", Project=" + _project.getName() + " ] updated with new Component [ID=" + _componentModel.getId() + "]"));
					_extensions.remove(extensionModel.getId());
					_extensions.put(extensionModel.getId(), rootElement);
				} else {
					logger.log(new Status(IStatus.WARNING, this.getClass().getName(), "Unable to update Extension [ID=" + _extensionModel.getId() + ", Project=" + _project.getName() + " ] with new Component [ID=" + _componentModel.getId() + "] details"));
				}
			}
		}
	}
	
	public void addNewComponent(IModel componentModel, IModel extensionModel, IProject project) throws Exception{
		this.setProject(project);
		this.addNewComponent(componentModel, extensionModel);
	}
	
	public void addNewComponent(IModel componentModel, String extId) throws Exception{
		addNewComponent(componentModel, this.getExtension(extId));
	}
	
	public void addNewComponent(IModel componentModel, String extensionId, IProject project) throws Exception{
		addNewComponent(componentModel, this.getExtension(extensionId), project);
	}

//	private void addFilesToProjectStructure() {			
//		ProjectFilesBuilderService.getInstance().setupAllFiles(_extensionModel, _componentModel, _project, _extensions);
//	}

	private void addFoldersToProjectStructure(IProject project, String[] paths) throws Exception{
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Add folders to project ["+project.getName() + "] started"));
		for(String path: paths) {
			IFolder etcFolders = project.getFolder(path);
			createFolder(etcFolders);
		}
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Folder creation completed"));
	}
	
	public Extension getExtension(String id){
		JAXBElement<Extension> ext = _extensions.get(id);
		return ext.getValue();		
	}
	
	public JAXBElement<Extension> getProjectItemsRoot(String id){
		JAXBElement<Extension> ext = _extensions.get(id);
		return ext;
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
	public void addNewGroup(String groupName, IModel extensionNode, IProject project) {
		JAXBElement<Extension> rootElement = this.getProjectItemsRoot(extensionNode.getId());
		rootElement = _filesBuilderService.buildAndSaveGroup(groupName, extensionNode, project, rootElement);
		_extensions.remove(extensionNode.getId());
		_extensions.put(extensionNode.getId(), rootElement);
	}
}
