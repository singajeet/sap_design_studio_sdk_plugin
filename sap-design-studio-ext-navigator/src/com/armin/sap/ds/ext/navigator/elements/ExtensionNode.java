package com.armin.sap.ds.ext.navigator.elements;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

import com.armin.sap.ds.ext.navigator.Activator;
import com.armin.sap.ds.ext.navigator.helper.ProjectFilesReader;
import com.armin.sap.ds.ext.plugin.preferences.Settings;
import com.armin.sap.ds.support.DesignStudioProjectHelper;
import com.armin.sap.ds.xml.Component;
import com.armin.sap.ds.xml.Extension;
import com.armin.sap.ds.xml.Group;

public class ExtensionNode extends GenericFileNode {

	private IProjectItemNode[] _children;
	private String _name; 
	private Extension _model;
	
	public ExtensionNode() {
		// TODO Auto-generated constructor stub
	}
	
	public ExtensionNode(IResource extensionResource, IProjectItemNode parent) {
		super(extensionResource, parent);
		_children = initializeChildren(extensionResource);
	}

	@Override
	public ProjectItemType getType() {
		return ProjectItemType.EXTENSION_FILE;
	}
	
	/************************** Required to be overridden ********************************/
	
	public Extension getExtension() {
		return _model;
	}
	
	@Override
	public String getName() {
		return _name;
	}
		
	@Override
    public Image getImage() {
		Image image = Activator.getImage("images/extension_28x28.png");
		int size = Integer.parseInt(Settings.store().get(Settings.FOR.ICON_SIZE));
		ImageData imgData = image.getImageData().scaledTo(size, size);
		_image = new Image(Display.getCurrent(), imgData);
		image.dispose();
		return _image;
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

	protected IProjectItemNode[] initializeChildren(IResource extensionResource) {
    	try {    			
	    		//Logger.debug("Extension => CREATE CHILDREN");
	    		Extension _model = ProjectFilesReader.getInstance().getExtensionModel(extensionResource);
	    		_name = _model.getTitle();
	    		
	    		List<Component> components = _model.getComponent();
	    		List<Group> groups = _model.getGroup();
	    		ArrayList<IProjectItemNode> children = new ArrayList<IProjectItemNode>();
	    		
	    		if(groups.size() > 0) {
		    		for(int i=0;i<groups.size();i++) {
		    			Group group = groups.get(i);
		    			IProjectItemNode groupNode = new GroupNode(group, components, extensionResource, this);
		    			children.add(groupNode);
		    		}
	    		} else {
	    			Group group = new Group();
	    			group.setId("default");
	    			group.setTitle("Default");
	    			group.setTooltip("Default Group");
	    			IProjectItemNode groupNode = new GroupNode(group, components, extensionResource, this);
	    			children.add(groupNode);
	    		}
	    		
	    		IProjectItemNode[] childrenArray = new IProjectItemNode[children.size()];
	    		
	    		if(children.size() <= 0) {
	    				return new IProjectItemNode[] { new ProjectItemNode("No groups or components found!", this)};
	    		}
	    		
	    		children.toArray(childrenArray);
	    		return childrenArray;
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    		return new IProjectItemNode[]{ new ProjectItemNode("Error while searching groups: " + e.getMessage(), this) };
    	}
        
    }

}
