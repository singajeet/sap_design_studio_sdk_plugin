package com.armin.sap.ds.builder.navigator.tree;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.api.models.Component;
import com.armin.sap.ds.builder.api.models.Extension;
import com.armin.sap.ds.builder.api.models.Group;
import com.armin.sap.ds.builder.preferences.Settings;

public class GroupNode extends GenericFileNode {

	public GroupNode(IProject project, Group group, IProjectItemNode parent) {
		super(project, parent);
		_item = group;
		_children = initializeChildren(group);
	}
	
	@Override
	public ProjectItemType getType() {
		return ProjectItemType.GROUP_NODE;
	}
	
	/************************** Required to be overridden ********************************/
	
	@Override
	public String getName() {
		return ((Group)_item).getTitle().toUpperCase();
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
	
	
	public void addComponent(Component component) throws Exception{
		if(!exists(component)) {
			
			//check if provided component is a valid model under this group's parent (i.e., 
			//component model should exists under extension model's "Component" property.
			ExtensionNode _parent = (ExtensionNode)this.getParent(this);
			Extension extension = _parent.getExtension();
			
			boolean found = false;
			for(Component comp : extension.getComponent()) {
				if(comp.getId().toUpperCase().equals(component.getId().toUpperCase())) {
					found = true;
				}
			}
			if(found) {
				IProjectItemNode node = new ComponentNode(this.getProject(), component, this);
				_children.add(node);
			} else {
				throw new Exception("Failed while adding new Component node. Reason: Unable to find Component model with [Id=" + component.getId() 
										+ "] under Extension model [Id=" + extension.getId() + "]");
				
			}
		}
	}
	
	
	/************************************************************************************/

	protected ArrayList<IProjectItemNode> initializeChildren(Group group) {
		ArrayList<IProjectItemNode> children = new ArrayList<IProjectItemNode>();
    	try {	
	    		List<Component> components = ((ExtensionNode)this.getParent(this)).getExtension().getComponent();
	    		
	    		for(int i=0;i<components.size();i++) {
	    			Component component = components.get(i);
	    			String groupName = "DEFAULT";
	    			if(component.getGroup() != null && !component.getGroup().isEmpty())
	    				groupName = component.getGroup().toUpperCase();
	    			
	    			if(groupName.equals(this.getName())) {
	    				IProjectItemNode componentNode = new ComponentNode(this.getProject(), component, this);
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


}
