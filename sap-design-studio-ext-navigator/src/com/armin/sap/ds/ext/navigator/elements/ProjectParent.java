package com.armin.sap.ds.ext.navigator.elements;

import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.swt.graphics.Image;

import com.armin.sap.ds.ext.logs.Logger;
import com.armin.sap.ds.ext.navigator.Activator;

public class ProjectParent extends ProjectElement {

	private IWorkspaceRoot _parent;
	private IProject _project;
	private IProjectElement[] _children;
	private String _name;
	private String _description;
	
	public ProjectParent() {
		// TODO Auto-generated constructor stub
	}

	public ProjectParent(IProject project) {
		_project = project;
		_parent = (IWorkspaceRoot)project.getParent();
		_name = project.getName();
		try {
			_description = project.getDescription().getComment();
		}catch(Exception e) {
			
		}
		
		try {
			if (_children == null) {
	            _children = initializeChildren(_project.members());
	        }
			
		}catch(Exception e) {
			e.printStackTrace();			
		}
	}
	
	/************************** Required to be overridden ********************************/
	
	@Override
	public String getName() {
		return _name;
	}
	
	@Override
	public Image getImage() {
		return Activator.getImage("images/application-javascript.png");
	}
	
	@Override
	public Object[] getElements(Object input) {
		return getChildren(input);
	}
	
	@Override
	public Object[] getChildren(Object parent) {
		return _children;
	}
	
	@Override
	public Object getParent(Object element) {
		return _parent;
	}
	
	@Override
	public boolean hasChildren(Object parent) {				
		return (_children.length > 0);
	}
	
	/************************************************************************************/
	
	protected IProjectElement[] initializeChildren(IResource[] members) {
    	try {
    		Logger.debug("ProjectParent => CREATE CHILDREN");
    		ArrayList<IProjectElement> children = new ArrayList<IProjectElement>();
    		for(int i=0;i<members.length;i++) {    			
    			switch(members[i].getType()) {
    				case IResource.FILE:
    					IProjectElement elefile = createFileResource(members[i]);
    					if(elefile != null) {
    						children.add(elefile);
    					}
    					break;
    				case IResource.FOLDER:
    					IProjectElement elefolder = createFolderResource(members[i]);
    					if(elefolder != null) {
    						children.add(elefolder);
    					}
    					break;
//    				case IResource.PROJECT:
//    					Logger.debug("Current member is a project and will be skipped: " + members[i].getName());
//    					break;
//    				case IResource.ROOT:
//    					Logger.debug("Current member is a workspace root and will be skipped: " + members[i].getName());
//    					break;
//    				default:
//    					Logger.debug("Unknown resource type found: " + members[i].getName() + " - " + members[i].getType());
//    					break;
    			}
    		}
    		Logger.debug("ProjectParent => DONE!");
    		IProjectElement[] childrenArray = new IProjectElement[children.size()];
    		children.toArray(childrenArray);
    		return childrenArray;
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    		return null;
    	}
        
    }
	
	private IProjectElement createFolderResource(IResource resource) {
		
		IProjectElement element = null;
		System.out.print("ProjectParent => CreateFolder: " + resource.getName().toUpperCase());
		switch(resource.getName().toUpperCase()) {
			case "RES":
				element = new ResourceFolder(resource, this);
				Logger.debug("...created!");
				break;
			case "META-INF":
				Logger.debug("...created!");
				element = new MetaInfFolder(resource, this);
				break;			
			default:
				Logger.debug("...skipped!");
		}
		return element;
	}

	private IProjectElement createFileResource(IResource resource) {
		IProjectElement element = null;
		System.out.print("ProjectParent => CreateFile: " + resource.getFileExtension().toUpperCase());
		switch(resource.getFileExtension().toUpperCase()) {
			case "XML":
				if(resource.getName().toUpperCase().startsWith("PLUGIN")) {
					Logger.debug("...created!");
					element = new PluginFile(resource, this);
				} else
				if(resource.getName().toUpperCase().startsWith("CONTRIBUTION")) {
					Logger.debug("...created!");
					element = new ExtensionFile(resource, this);
				} else {
					Logger.debug("...skipped!");
				}
				break;
			case "PROPERTIES":
				Logger.debug("...created!");
				element = new BuildPropertiesFile(resource, this);
				break;
			case "ZTL":
				Logger.debug("...created!");
				element = new ComponentFile(resource, this);
				break;
//			case "MF":
//				element = new ManifestFile(resource, this);
//				break;
//			case "HTML":
//				element = new HTMLFile(resource, this);
//				break;
//			case "JS":				
//				element = new JavaScriptFile(resource, this);
//				break;
//			case "CSS":
//				element = new CascadeStyleSheetFile(resource, this);
//				break;
			case "TARGET":
				Logger.debug("...created!");
				element = new TargetFile(resource, this);
				break;
			default:
				Logger.debug("...skipped!");
		}
		
		return element;
	}

	@Override
	public ProjectElementType getType() {
		return ProjectElementType.PROJECT_PARENT;
	}


}
