package com.armin.sap.ds.ext.navigator.elements;

import java.util.ArrayList;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.graphics.Image;

import com.armin.sap.ds.ext.logs.Logger;
import com.armin.sap.ds.ext.navigator.Activator;

public class ResourceFolder extends GenericFolder {

	IProjectElement[] _children;
	
	public ResourceFolder(IProjectElement parent) {
		
	}
	
	public ResourceFolder(IResource resource, IProjectElement parent) {
		super(resource, parent);
		try {
			_children = initializeChildren(resource.getProject().members());
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/************************** Required to be overridden ********************************/
	
	@Override
	public String getName() {
		return super.getName();
	}
	
	@Override
	public Image getImage() {
		return Activator.getImage("images/folder.png");
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
		return super.getParent(element);
	}
	
	@Override
	public boolean hasChildren(Object parent) {				
		return (_children.length > 0);
	}
	
	/************************************************************************************/

	protected IProjectElement[] initializeChildren(IResource[] members) {
    	try {
    		Logger.debug("ResourceFolder => CREATE CHILDREN");
    		ArrayList<IProjectElement> children = new ArrayList<IProjectElement>();
    		for(int i=0;i<members.length;i++) {    			
    			switch(members[i].getType()) {    				
    				case IResource.FOLDER:
    					IProjectElement ele = createFolderResource(members[i]);
    					if(ele != null) {
    						children.add(ele);
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
    		Logger.debug("ResourceFolder => DONE!");
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
		System.out.print("ResourceFolder => CreateFolder: " + resource.getName().toUpperCase());
		IProjectElement element = null;
		switch(resource.getName().toUpperCase()) {			
			case "JS":
				Logger.debug("...created!");
				element = new JSFolder(resource, this);
				break;
			case "CSS":
				Logger.debug("...created!");
				element = new CSSFolder(resource, this);
				break;
			case "IMAGES":
				Logger.debug("...created!");
				element = new ImagesFolder(resource, this);
				break;			
			default:
				Logger.debug("...skipped!");
				break;
		}
		return element;
	}

	
	@Override
	public ProjectElementType getType() {
		return ProjectElementType.RESOURCE_FOLDER;
	}
}
