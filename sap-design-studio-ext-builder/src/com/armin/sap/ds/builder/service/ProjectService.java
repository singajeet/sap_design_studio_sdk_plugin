package com.armin.sap.ds.builder.service;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBElement;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.services.IServiceLocator;

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
	
	//private static ProjectService _singleton;
	
	public ProjectService() {
		_extensions = new HashMap<String, JAXBElement<Extension>>();
		_filesBuilderService = new ProjectFilesBuilderService();
	}
	
	public ProjectService(IServiceLocator locator) {
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
		if(_project == null) {
			_project = createBaseProject(projectName, location);			
			addNature(_project);
		} else {
			throw new Exception("Cann't create new project: " + projectName + "! Please close current project first");
		}		
		
		if(this._extensionModel != null) {
			createExtension();	
			_filesBuilderService.saveExtension(_extensionModel, _project, _extensions);
		}
		
		if(this._componentModel != null) {
			createComponent();
			_filesBuilderService.saveComponent(_componentModel, _extensionModel, _project);
			_filesBuilderService.updateExtension(_componentModel, _extensionModel, _project, _extensions);
		}
	
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
		
		Extension extensionModel = (Extension)_extensionModel;
		String[] folderPaths = {				
				extensionModel.getId() + "/META-INF",
				extensionModel.getId() + "/res/js",
				extensionModel.getId() + "/res/css",
				extensionModel.getId() + "/res/images",
				extensionModel.getId() + "/res/additional_properties_sheet"
		};
		
		addFoldersToProjectStructure(_project, folderPaths);		
	}
	
	public void addNewExtension(IModel extensionModel) throws Exception{
		if(_project != null && extensionModel != null) {
			this.setExtensionModel(extensionModel);
			this.createExtension();
			_filesBuilderService.saveExtension(extensionModel, _project, _extensions);
		} else {
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
		if(_project != null) {
			this.setComponentModel(componentModel);
			this.setExtensionModel(extensionModel);
			this.createComponent();
			_filesBuilderService.saveComponent(_componentModel, _extensionModel, _project);
			_filesBuilderService.updateExtension(_componentModel, _extensionModel, _project, _extensions);
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
		for(String path: paths) {
			IFolder etcFolders = project.getFolder(path);
			createFolder(etcFolders);
		}
	}
	
	public Extension getExtension(String id){
		JAXBElement<Extension> ext = _extensions.get(id);
		return ext.getValue();		
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
				e.printStackTrace();
			}
		}
		return newProject;
	}
	
	private void createFolder(IFolder folder) throws Exception{
		IContainer parent = folder.getParent();
		if(parent instanceof IFolder) {
			createFolder((IFolder)parent);
		}
		if(!folder.exists()) {
			folder.create(false, true, null);
		}
	}
}
