package com.armin.sap.ds.support;

import java.net.URI;

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
	
	private static ContributionXMLHelper _contribXMLHelper;
	private static ContributionZTLHelper _contribZTLHelper;
	
	public static IProject createProject(String projectName, URI location, ContributionXMLHelper contribXMLHelper, ContributionZTLHelper contribZTLHelper) {		
		
		_contribXMLHelper = contribXMLHelper;
		_contribZTLHelper = contribZTLHelper;
		
		IProject project = createBaseProject(projectName, location);
		try {
			addNature(project);
			
			String[] folderPaths = { 
					"META-INF",
					"res/js",
					"res/css",
					"res/additional_properties_sheet"
			};
			
			String[] filePaths = {
					"contribution.xml",
					"contribution.ztl"
			};
			
			addFoldersToProjectStructure(project, folderPaths);
			addFilesToProjectStructure(project, filePaths);
			
		}catch(Exception e) {
			e.printStackTrace();
			project = null;
		}
		
		return project;
	}

	private static void addFilesToProjectStructure(IProject project, String[] filePaths) {
		for(String path: filePaths) {
			IFile file = project.getFile(path);
			createFile(file);
		}
		
	}

	private static void createFile(IFile file) {
		if(file.getName().equalsIgnoreCase("contribution.xml")) {
			if(!file.exists()) {
				try {
					file.create(_contribXMLHelper.getContent(), IResource.NONE, null);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		} 
		else if(file.getName().equalsIgnoreCase("contribution.ztl")) {
			if(!file.exists()) {
				try {
					if(_contribZTLHelper.isCreateZTLFile()) {
						file.create(_contribZTLHelper.getContent(), IResource.NONE, null);
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("Unknown file: " + file.getName());
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