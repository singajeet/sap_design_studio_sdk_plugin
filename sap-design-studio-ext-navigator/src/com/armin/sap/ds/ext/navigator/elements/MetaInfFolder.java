package com.armin.sap.ds.ext.navigator.elements;

import java.util.ArrayList;

import org.eclipse.core.resources.IResource;
import org.eclipse.swt.graphics.Image;

import com.armin.sap.ds.ext.logs.Logger;
import com.armin.sap.ds.ext.navigator.Activator;

public class MetaInfFolder extends GenericFolder {

	private IProjectElement[] _children;
	
	public MetaInfFolder(IProjectElement parent) {
		// TODO Auto-generated constructor stub
	}

	public MetaInfFolder(IResource resource, IProjectElement parent) {
		super(resource, parent);
		
		try {
			_children = initializeChildren(resource.getProject().members());
		}catch(Exception e) {
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
    		Logger.debug("MetaInfFolder => CREATE CHILDREN");
    		ArrayList<IProjectElement> children = new ArrayList<IProjectElement>();
    		for(int i=0;i<members.length;i++) {    			
    			switch(members[i].getType()) {    				
    				case IResource.FILE:
    					IProjectElement ele = createFileResource(members[i]);
    					if(ele != null) {
    						children.add(ele);
    					}
    					break;
    			}
    		}
    		Logger.debug("MetaInfFolder => DONE!");
    		IProjectElement[] childrenArray = new IProjectElement[children.size()];
    		children.toArray(childrenArray);
    		return childrenArray;
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    		return null;
    	}
        
    }
	
	private IProjectElement createFileResource(IResource resource) {
		IProjectElement element = null;
		Logger.debug("MetaInfFolder => CreateFile: " + resource.getFileExtension().toUpperCase());
		switch(resource.getFileExtension().toUpperCase()) {			
			case "MF":
				Logger.debug("...created!");
				element = new ManifestFile(resource, this);
				break;			
			default:
				Logger.debug("...skipped!");
		}
		return element;
	}

	
	@Override
	public ProjectElementType getType() {
		return ProjectElementType.META_INF_FOLDER;
	}
}
