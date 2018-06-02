package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.swt.graphics.Image;

public interface IProjectItemNode {
	public Image getImage();
	 
	public Object[] getElements(Object input);
	
    public Object[] getChildren(Object parent);
 
    public byte[] getContent();
 
    public boolean hasChildren(Object element);
 
    public IProject getProject();
 
    public Object getParent(Object element);
    
    public ProjectItemType getType();
    
    public String getName();
    
    public String getDescription();
    
    public String getTooltip();
    
    public IResource getElementAsResource();
}
