package com.armin.sap.ds.builder.ui.navigation.tree.nodes;

import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.views.properties.IPropertySource;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.properties.tree.nodes.ProjectNodeProperties;

public class ProjectNode extends ProjectItemNode {

	@SuppressWarnings("unused")
	private IWorkspaceRoot _parent;
	private IProject _project;	
	private String _name;
	
	public ProjectNode(IProject project) { 
		super(project);
		_project = project;
		_parent = (IWorkspaceRoot)project.getParent();
		_name = project.getName();
		
		try {
			_children = initializeChildren(_project.members());	        
		}catch(Exception e) {
			e.printStackTrace();			
		}
	}
	
	/************************** Required to be overridden ********************************/
	
	@Override
	public IResource getAsResource() {		
		return this._project;
	}
	
	@Override
	public String getName() {
		return _name;
	}
	
	@Override
	public Image getImage() {
		Image image = Activator.getImage("images/project_28x28.png");
		int size = Integer.parseInt(Settings.store().get(Settings.FOR.ICON_SIZE_ID));
		ImageData imgData = image.getImageData().scaledTo(size, size);
		_image = new Image(Display.getCurrent(), imgData);
		image.dispose();
		return _image;
	}
	
	/************************************************************************************/
	
	protected ArrayList<IProjectItemNode> initializeChildren(IResource[] resources) {
		ArrayList<IProjectItemNode> children = new ArrayList<IProjectItemNode>();
    	try {
    		
    		ArrayList<IResource> extensionFolders = new ArrayList<IResource>();
    		
    		for(int i=0;i<resources.length;i++) {    			
    			if(resources[i].getType() == IResource.FOLDER) {    				
    				extensionFolders.add(resources[i]);
    			}    			
    		}
    		
    		if(extensionFolders.size() <= 0) {
				children.add(new InfoNode("No extensions found!", this));
			} else {
				IProjectItemNode extCollectionNode = new ExtensionCollectionNode(this.getProject(), extensionFolders, this);
				children.add(extCollectionNode);
			}
    		
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    		children.add(new ErrorNode("Error while creating package node: " + e.getMessage(), this));
    	}
        return children;
    }	
	
	@Override
	public ProjectItemNodeType getType() {
		return ProjectItemNodeType.PROJECT;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> adapter) {
		 if (adapter == IWorkbenchAdapter.class)
			 return (T)this;
	     if (adapter == IPropertySource.class)
	         return (T)(new ProjectNodeProperties(this));
		return null;
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {		
		return ImageDescriptor.createFromImage(getImage());
	}

	@Override
	public String getLabel(Object o) {		
		return this.getName();
	}


}
