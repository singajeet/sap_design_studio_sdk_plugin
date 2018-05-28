package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.swt.graphics.Image;

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
    		IProjectElement[] children = new IProjectElement[members.length];
    		
    		for(int i=0;i<members.length;i++) {
    			System.out.println("Name: " + members[i].getName() + ", Type: " + members[i].getType());
    			switch(members[i].getType()) {
    				case IResource.FILE:
    					children[i] = createFileResource(members[i]);
    					break;
    				case IResource.FOLDER:
    					children[i] = createFolderResource(members[i]);
    					break;
    				case IResource.PROJECT:
    					System.out.println("Current member is a project and will be skipped: " + members[i].getName());
    					break;
    				case IResource.ROOT:
    					System.out.println("Current member is a workspace root and will be skipped: " + members[i].getName());
    					break;
    				default:
    					System.out.println("Unknown resource type found: " + members[i].getName() + " - " + members[i].getType());
    					break;
    			}
    		}
    		
    		return children;
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    		return null;
    	}
        
    }
	
	private IProjectElement createFolderResource(IResource resource) {
		
		IProjectElement element = null;
		switch(resource.getName().toUpperCase()) {
			case "RES":
				element = new ResourceFolder(resource, this);
				break;
			case "META-INF":
				element = new MetaInfFolder(resource);
				break;
			case "JS":
				element = new JSFolder(resource);
				break;
			case "CSS":
				element = new CSSFolder(resource);
				break;
			case "IMAGES":
				element = new ImagesFolder(resource);
				break;
			default:
				element = new GenericFolder(resource, this);
				break;
		}
		return element;
	}

	private IProjectElement createFileResource(IResource resource) {
		IProjectElement element = null;
		
		switch(resource.getFileExtension().toUpperCase()) {
			case "XML":
				if(resource.getName().toUpperCase().startsWith("PLUGIN")) {
					element = new PluginFile(resource);
				} else
				if(resource.getName().toUpperCase().startsWith("CONTRIBUTION")) {
					element = new ExtensionFile(resource);
				} else {
					element = new GenericFile(resource);
				}
				break;
			case "PROPERTIES":
				element = new BuildPropertiesFile(resource);
				break;
			case "ZTL":
				element = new ComponentFile(resource);
				break;
			case "MF":
				element = new ManifestFile(resource);
				break;
			case "HTML":
				element = new HTMLFile(resource);
				break;
			case "JS":				
				element = new JavaScriptFile(resource);
				break;
			case "CSS":
				element = new CascadeStyleSheetFile(resource);
				break;
			case "TARGET":
				element = new TargetFile(resource);
				break;
		}
		
		return element;
	}

	@Override
	public ProjectElementType getType() {
		return ProjectElementType.PROJECT_PARENT;
	}


}
