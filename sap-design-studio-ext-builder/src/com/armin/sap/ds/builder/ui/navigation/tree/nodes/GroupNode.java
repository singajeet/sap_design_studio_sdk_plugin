package com.armin.sap.ds.builder.ui.navigation.tree.nodes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.views.properties.IPropertySource;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.models.domain.ComponentExtended;
import com.armin.sap.ds.builder.models.domain.Extension;
import com.armin.sap.ds.builder.models.domain.Group;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.properties.tree.nodes.GroupNodeProperties;
import com.armin.sap.ds.builder.ui.navigation.tree.TreeNodeAccessMode;

public class GroupNode extends ProjectItemNode {

	public GroupNode(IProject project, Group group, IProjectItemNode parent) {
		super(project, parent);
		_item = group;		
		_children = initializeChildren(group);
	}
	
	@Override
	public ProjectItemNodeType getType() {
		return ProjectItemNodeType.GROUP;
	}
	
	/************************** Required to be overridden ********************************/
	
	@Override
	public String getName() {
		return ((Group)_item).getTitle().toUpperCase();
	}
	
	@Override
    public Image getImage() {
		Image image = Activator.getImage("images/group_28x28.png");
		int size = Integer.parseInt(Settings.store().get(Settings.FOR.ICON_SIZE_ID));
		ImageData imgData = image.getImageData().scaledTo(size, size);
		_image = new Image(Display.getCurrent(), imgData);
		image.dispose();
		return _image;
    }
	
	
	public IProjectItemNode addComponent(ComponentExtended component) throws Exception{
		if(!exists(component)) {
			
			ExtensionNode _parent = (ExtensionNode)this.getParent(this);
			Extension extension = _parent.getExtension();
			
			
			if(getAccessMode() == TreeNodeAccessMode.READ_ONLY) {
				IProjectItemNode node = new ComponentExtendedNode(this.getProject(), component, this);
				_children.add(node);
				return node;
			} else if(getAccessMode() == TreeNodeAccessMode.EDIT) {
				//DO NOT CHANGE SEQUENCE OF NEXT 2 LINES
				_projectService.addNewComponent(component, extension);
				IProjectItemNode node = new ComponentExtendedNode(this.getProject(), component, this);
				_children.add(node);
				return node;
			} 
			else {
				throw new Exception("Failed while adding new Component node. "
						+ "Reason: Invalid access mode for Group [Name=" + this.getName() + "]");				
			}
		}
		return null;
	}
	
	
	/************************************************************************************/

	protected ArrayList<IProjectItemNode> initializeChildren(Group group) {
		ArrayList<IProjectItemNode> children = new ArrayList<IProjectItemNode>();
    	try {	
	    		List<ComponentExtended> components = ((ExtensionNode)this.getParent(this)).getExtension().getComponent();
	    		
	    		for(int i=0;i<components.size();i++) {
	    			ComponentExtended component = components.get(i);
	    			String groupName = "DEFAULT";
	    			if(component.getGroup() != null && !component.getGroup().isEmpty())
	    				groupName = component.getGroup().toUpperCase();
	    			
	    			if(groupName.equals(this.getName())) {
	    				IProjectItemNode componentNode = new ComponentExtendedNode(this.getProject(), component, this);
	    				children.add(componentNode);
	    			}
	    		}
	    		
	    		if(children.size() <= 0) {
					children.add( new InfoNode("No components found!", this));
				}
	    		
	    		
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    		children.add(new ErrorNode("Error while searching components: " + e.getMessage(), this));
    	}
    	return children;
    }


	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> adapter) {
		 if (adapter == IWorkbenchAdapter.class)
			 return (T)this;
	     if (adapter == IPropertySource.class)
	         return (T)(new GroupNodeProperties(this));
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
