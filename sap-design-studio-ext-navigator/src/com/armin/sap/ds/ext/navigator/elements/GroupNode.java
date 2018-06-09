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
import com.armin.sap.ds.xml.Component;
import com.armin.sap.ds.xml.Extension;
import com.armin.sap.ds.xml.Group;

public class GroupNode extends GenericFileNode {

	private IProjectItemNode[] _children;
	private String _name;
	private List<Component> _components;
	private Group _group;
	
	public GroupNode() {
		// TODO Auto-generated constructor stub
	}

	public GroupNode(Group group, List<Component> components, IResource extensionResource, IProjectItemNode parent) {
		super(extensionResource, parent);
		_components = components;
		_group = group;
		_children = initializeChildren(extensionResource);
	}
	
	@Override
	public ProjectItemType getType() {
		return ProjectItemType.GROUP_NODE;
	}
	
	/************************** Required to be overridden ********************************/
	
	@Override
	public String getName() {
		_name = _group.getTitle();
		return _name;
	}
	
	@Override
    public Image getImage() {
		Image image = Activator.getImage("images/group_28x28.png");
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
	    		ArrayList<IProjectItemNode> children = new ArrayList<IProjectItemNode>();
	    		
	    		for(int i=0;i<_components.size();i++) {
	    			Component component = _components.get(i);
	    			String groupName = "Default";
	    			if(component.getGroup() != null && !component.getGroup().isEmpty())
	    				groupName = component.getGroup();
	    			
	    			if(groupName.equals(_group.getTitle())) {
	    				IProjectItemNode componentNode = new ComponentNode(component, extensionResource, this);
	    				children.add(componentNode);
	    			}
	    		}
	    		
	    		if(children.size() <= 0) {
					return new IProjectItemNode[] { new ProjectItemNode("No components found!", this) };
				}
	    		
	    		IProjectItemNode[] childrenArray = new IProjectItemNode[children.size()];
	    		children.toArray(childrenArray);
	    		return childrenArray;
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    		return new IProjectItemNode[]{ new ProjectItemNode("Error while searching components: " + e.getMessage(), this) };
    	}
        
    }


}
