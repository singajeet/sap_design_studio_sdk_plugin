package com.armin.sap.ds.builder.navigator.tree;

import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.preferences.Settings;

public class ProjectNode extends ProjectItemNode {

	@SuppressWarnings("unused")
	private IWorkspaceRoot _parent;
	private IProject _project;
	//private IProjectItemNode[] _children;
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
	public String getName() {
		return _name;
	}
	
	@Override
	public Image getImage() {
		Image image = Activator.getImage("images/project_28x28.png");
		int size = Integer.parseInt(Settings.store().get(Settings.FOR.ICON_SIZE));
		ImageData imgData = image.getImageData().scaledTo(size, size);
		_image = new Image(Display.getCurrent(), imgData);
		image.dispose();
		return _image;
	}
	
//	@Override
//	public IProject getProject() {
//		return _project;
//	}
	
//	@Override
//	public Object[] getElements(Object input) {
//		return getChildren(input);
//	}
	
//	@Override
//	public Object[] getChildren(Object parent) {
//		return _children.toArray();
//	}
	
//	@Override
//	public Object getParent(Object element) {
//		return _parent;
//	}
	
//	@Override
//	public boolean hasChildren(Object parent) {				
//		return (_children.size() > 0);
//	}
	
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
	public ProjectItemType getType() {
		return ProjectItemType.WORKSPACE;
	}


}
