package com.armin.sap.ds.support;

import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import com.armin.sap.ds.sdk.project.natures.ProjectNature;

public class DesignStudioProjectHelper {
	
	private static ExtensionHelper _extensionHelper;
	private static ComponentHelper _componentHelper;
	private static String _projectName;
	private static URI _projectLocation;
	private static TemplateParser _parser;
	private static Map<String, String> _fieldMap;
	
	public static String getProjectName() {
		return _projectName;
	}
	
	public static URI getProjectLocation() {
		return _projectLocation;
	}
	
	public static IProject createProject(String projectName, URI location, ExtensionHelper extensionHelper, ComponentHelper componentHelper) {		
		
		_extensionHelper = extensionHelper;
		_componentHelper = componentHelper;
		_projectName = projectName;
		_projectLocation = location;
		
		IProject project = createBaseProject(projectName, location);
		try {
			addNature(project);
			
			String[] folderPaths = { 
					"META-INF",
					"res/js",
					"res/css",
					"res/images",
					"res/additional_properties_sheet"
			};
			
			addFoldersToProjectStructure(project, folderPaths);
			addFilesToProjectStructure(project);
			
		}catch(Exception e) {
			e.printStackTrace();
			project = null;
		}
		
		return project;
	}

	private static void addFilesToProjectStructure(IProject project) {
			IFile componentFile = project.getFile(_componentHelper.COMPONENT_ZTL_FILE_NAME);
			IFile extensionFile = project.getFile(_extensionHelper.EXTENSION_XML_FILE_NAME);
			createFile(extensionFile, componentFile);
	}

	private static void createFile(IFile extensionFile, IFile componentFile) {
		if(!extensionFile.exists()) {
			populateSDKExtensionNode(extensionFile);
		}
	
		if(!componentFile.exists()) {
			populateComponentZTLFile(componentFile);
		}
	}
	
	private static void populateComponentZTLFile(IFile componentFile) {
		try {
			_fieldMap = new HashMap<String, String>();
			_fieldMap.put("description", _componentHelper.getDescription());
			_fieldMap.put("author", "");
			_fieldMap.put("date", new Date().toString());
			_fieldMap.put("packageName", _componentHelper.getPackageName());
			_fieldMap.put("className", _componentHelper.getClassName());
			if(_componentHelper.getClassToExtend().equals("-- None --")) {
				_fieldMap.put("superClassName", "");
				_fieldMap.put("extends", "");
			} else {
				_fieldMap.put("superClassName", _componentHelper.getClassToExtend());
				_fieldMap.put("extends", _componentHelper.EXTENDS_KEYWORD);
			}
			
			_parser = new TemplateParser(_fieldMap);
			_parser.loadTemplate("ztl-template");
			_parser.parse();
			componentFile.create(_parser.getCompiledTextAsStream(), IResource.NONE, null);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void populateSDKExtensionNode(IFile extensionFile) {
		try {
			_fieldMap = new HashMap<String, String>();
			_fieldMap.put("id", _extensionHelper.getId());
			_fieldMap.put("title", _extensionHelper.getTitle());
			_fieldMap.put("version", _extensionHelper.getVersion());
			_fieldMap.put("vendor", _extensionHelper.getVendor());
			_fieldMap.put("eula", _extensionHelper.getEula());
			_parser = new TemplateParser(_fieldMap);
			_parser.loadTemplate("extension-template");
			_parser.parse();
			extensionFile.create(_parser.getCompiledTextAsStream(), IResource.NONE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	private static void addFoldersToProjectStructure(IProject project, String[] paths) throws Exception{
		for(String path: paths) {
			IFolder etcFolders = project.getFolder(path);
			createFolder(etcFolders);
		}
	}

	private static void addNature(IProject project) throws Exception{
		if(!project.hasNature(ProjectNature.NATURE_ID)) {
			IProjectDescription description = project.getDescription();
			String[] prevNatures = description.getNatureIds();
			String[] newNatures = new String[prevNatures.length + 1];
			System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
			newNatures[prevNatures.length] = ProjectNature.NATURE_ID;
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
