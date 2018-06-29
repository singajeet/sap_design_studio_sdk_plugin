package com.armin.sap.ds.builder.common;

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

import com.armin.sap.ds.builder.DesignStudioProjectNature;
import com.armin.sap.ds.builder.project.models.Extension;
import com.armin.sap.ds.builder.project.models.IModel;


public class DesignStudioProjectHelper {
	
	private IModel _extensionModel;
	private IModel _componentModel;
	private IProject _project;
	private Map<String, JAXBElement<Extension>> _extensions;
	
	private static DesignStudioProjectHelper _singleton;
	
	private DesignStudioProjectHelper() {
		_extensions = new HashMap<String, JAXBElement<Extension>>();
	}
	
	public static DesignStudioProjectHelper get() {
		if(_singleton == null) {
			_singleton = new DesignStudioProjectHelper();
		}
		
		return _singleton;
	}
		
	public IProject getCurrentProject() {
		return _project;
	}
	
	public Map<String, JAXBElement<Extension>> getExtensionsMap(){
		return _extensions;
	}
	
	public IModel getCurrentExtensionHelper() {
		return _extensionModel;
	}
	
	public IModel getCurrentComponentHelper() {
		return _componentModel;
	}
	
	public IProject createProject(String projectName, URI location, IModel extensionModel, IModel componentModel) {		
		
		_extensionModel = extensionModel;
		_componentModel = componentModel;
		
		try {
			_project = createBaseProject(projectName, location);			
			addNature(_project);			
			createExtension(extensionModel, componentModel);			
		}catch(Exception e) {
			e.printStackTrace();
			_project = null;
		}
		
		return _project;
	}
	
	public void createExtension(IModel extensionModel, IModel componentModel) throws Exception {
		_extensionModel = extensionModel;
		_componentModel = componentModel;
		
		String[] folderPaths = { 
				extensionModel.getId() + "/META-INF",
				extensionModel.getId() + "/res/js",
				extensionModel.getId() + "/res/css",
				extensionModel.getId() + "/res/images",
				extensionModel.getId() + "/res/additional_properties_sheet"
		};
		
		addFoldersToProjectStructure(_project, folderPaths);
		addFilesToProjectStructure(_project);
	}
	
	public IProject getProject() {
		return _project;		
	}

	private void addFilesToProjectStructure(IProject project) {			
		ProjectFilesBuilder.getInstance().setupExtensionFiles(_extensionModel, _componentModel, project, _extensions);
	}

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

	private static IProject createBaseProject(String projectName, URI location) {
		
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
	
	private static void createFolder(IFolder folder) throws Exception{
		IContainer parent = folder.getParent();
		if(parent instanceof IFolder) {
			createFolder((IFolder)parent);
		}
		if(!folder.exists()) {
			folder.create(false, true, null);
		}
	}
}
