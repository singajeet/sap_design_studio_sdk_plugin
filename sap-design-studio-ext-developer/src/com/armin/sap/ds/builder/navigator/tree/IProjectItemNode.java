package com.armin.sap.ds.builder.navigator.tree;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.swt.graphics.Image;

import com.armin.sap.ds.builder.project.models.IModel;

public interface IProjectItemNode {
	public Image getImage();
	 
	public Object[] getElements(Object input);
	
    public Object[] getChildren(Object parent);
 
    public Stream<Object> getContent();
 
    public boolean hasChildren(Object element);
 
    public IProject getProject();
 
    public Object getParent(Object element);
    
    public ProjectItemType getType();
    
    public String getName();
    
    public String getDescription();
    
    public String getTooltip();
    
    public void addItem(IProjectItemNode item);
    
    public void addItem(IResource item);
    
    public void addItem(IModel model);
    
    public void addItem(String path);
    
    public void removeItem(IProjectItemNode item);
    
    public void removeItem(IResource item);

    public void removeItem(IModel model);
    
	public void removeItem(String id);
	
	public boolean exists(String id);
	
	public boolean exists(IProjectItemNode item);
	
	public boolean exists(IModel item);
	
	public boolean exists(IResource item);
	
	public IModel getModel();
	
	public void updateItemsListFromResource(ArrayList<IResource> items, boolean merge);
	
	public void updateItemsList(ArrayList<IProjectItemNode> items, boolean merge);
    //public IResource getElementAsResource();
}
