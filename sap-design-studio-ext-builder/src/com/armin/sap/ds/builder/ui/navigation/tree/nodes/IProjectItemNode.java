package com.armin.sap.ds.builder.ui.navigation.tree.nodes;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.swt.graphics.Image;

import com.armin.sap.ds.builder.models.domain.IModel;
import com.armin.sap.ds.builder.ui.navigation.tree.TreeNodeAccessMode;

public interface IProjectItemNode {
	public Image getImage();
	
	public void setImage(String image);
	 
	public Object[] getElements(Object input);
	
    public Object[] getChildren(Object parent);
 
    public Stream<Object> getContent();
 
    public boolean hasChildren(Object element);
 
    public IProject getProject();
 
    public Object getParent(Object element);
    
    public ProjectItemNodeType getType();
    
    public String getName();
    
    public String getDescription();
    
    public void setDescription(String desc);
    
    public String getTooltip();
    
    public void setTooltip(String tooltip);
    
    public void addItem(IProjectItemNode item);
    
    public void addItem(IResource item);
    
    public void addItem(IModel model);
    
    public void addItem(String path);
    
    public void removeItem(IProjectItemNode item);
    
    public void removeItem(IResource item);

    public void removeItem(IModel model);
    
	public void removeItem(String id);
	
	public IProjectItemNode findItem(String id);
	
	public boolean exists(String id);
	
	public boolean exists(String id, boolean ignorecase);
	
	public boolean exists(IProjectItemNode item);
	
	public boolean exists(IModel item);
	
	public boolean exists(IResource item);
	
	public IModel getModel();
	
	public void updateItemsListFromResource(ArrayList<IResource> items, boolean merge);
	
	public void updateItemsList(ArrayList<IProjectItemNode> items, boolean merge);
    //public IResource getElementAsResource();
	
	public TreeNodeAccessMode getAccessMode();
	
	public void setAccessMode(TreeNodeAccessMode mode);
	
	public IResource getAsResource();
}
