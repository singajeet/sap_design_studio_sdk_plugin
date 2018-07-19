package com.armin.sap.ds.builder.navigator.tree;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.api.models.Component;
import com.armin.sap.ds.builder.api.models.Extension;
import com.armin.sap.ds.builder.api.models.Group;
import com.armin.sap.ds.builder.preferences.Settings;

public class ExtensionNode extends GenericFileNode {

	private IProjectItemNode _parent;
	//private IProjectItemNode[] _children;
	
	public ExtensionNode(IProject project, Extension extension, IProjectItemNode parent) {
		super(project, parent);
		_item = extension;
		_children = initializeChildren(extension);
	}

	@Override
	public ProjectItemType getType() {
		return ProjectItemType.EXTENSION_FILE;
	}
	
	public Extension getExtension() {
		return (Extension)_item;
	}
	
	public List<Group> getGroups(){
		return ((Extension)_item).getGroup();
	}
	
	public Group getGroup(String name) {
		for(Group group : ((Extension)_item).getGroup()) {
			if(group.getTitle().toUpperCase().equals(name.toUpperCase())) {
				return group;
			}
		}
		return null;
	}
	
	public List<Component> getComponents(){
		return ((Extension)_item).getComponent();
	}
	
	public Component getComponent(String id) {
		for(Component component : ((Extension)_item).getComponent()) {
			if(component.getId().equals(id)) {
				return component;
			}
		}		
		return null;
	}
	
	
	
	public void addComponent(Component component) throws Exception{
		if(this._item != null) {
			if(!this.exists(component)) {
				Extension extension = ((Extension)this._item); 
				
				//Add the new "Component" model to the current "Extension" model
				//The tree node for the new "Component" model will be added automatically
				//under an group, once the "Group" information is processed in following steps 
				extension.getComponent().add(component);
				
				//if group is not blank
				if(component.getGroup() != null && !component.getGroup().isEmpty()) {
					String groupName = component.getGroup().toUpperCase();
					boolean groupFound = false;
					
					//Search for the "Group" model under the current "Extension" model object
					for(Group group : extension.getGroup()) {
						if(group.getId().toUpperCase().equals(groupName)) {
							groupFound = true;
						}
					}
					
					//If no such group exists under current "Extension", new model will be created
					//and added to the current "Extension" model as its child and to the extension 
					//tree node as well
					if(!groupFound) {
						Group groupModel = new Group();
						groupModel.setId(groupName);
						groupModel.setName(groupName);
						groupModel.setTitle(groupName);
						
						//Added to Extension's group attribute available in its Model 
						extension.getGroup().add(groupModel);
						
						//Add same to the Tree Node to be shown in Project Navigator
						IProjectItemNode groupNode = new GroupNode(this.getProject(), groupModel, this);
						
						//This will also add the Component as TreeNode under this GroupNode in Navigator
						//Tree, if the Component's group name attribute is same as this group's name
						_children.add(groupNode);
						
					} else {
						//if group is available under current extension model object
						if(this.exists(groupName, true)) {
							GroupNode groupNode = (GroupNode)this.findItem(groupName);
							//Add Component as TreeNode under this Group's TreeNode object 
							groupNode.addComponent(component);
						} else {
							throw new Exception("Inconsistent Navigator Tree: Group [" + groupName + "] exists under current "
										+ "Extension's Model (" + this.getName() + ") but same is not"
										+ " available under Navigator Tree");
						}
					}
					
					
				} else {
	    			Group group = new Group();
	    			group.setId("DEFAULT");
	    			group.setTitle("DEFAULT");
	    			group.setTooltip("Default Group");
	    			
	    			//This will also add the Component as TreeNode under this GroupNode in Navigator
					//Tree, if the Component's group name attribute is same as this group's name
	    			IProjectItemNode groupNode = new GroupNode(this.getProject(), group, this);
	    			_children.add(groupNode);
	    		}
				
			}
		}
	}
	
	/************************** Required to be overridden ********************************/
	
	@Override
	public String getName() {
		return ((Extension)_item).getId() + " - (" + ((Extension)_item).getTitle() + ")";
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
//	
//	@Override
//	public boolean hasChildren(Object parent) {				
//		return (_children.size() > 0);
//	}
	
	/************************************************************************************/

	protected ArrayList<IProjectItemNode> initializeChildren(Extension extension) {
		ArrayList<IProjectItemNode> children = new ArrayList<IProjectItemNode>();
		
		try {    			
	    		List<Group> groups = extension.getGroup();
	    		
	    		if(groups.size() > 0) {
		    		for(int i=0;i<groups.size();i++) {
		    			Group group = groups.get(i);
		    			IProjectItemNode groupNode = new GroupNode(this.getProject(), group, this);
		    			children.add(groupNode);
		    		}
	    		} else {
	    			Group group = new Group();
	    			group.setId("DEFAULT");
	    			group.setTitle("DEFAULT");
	    			group.setTooltip("Default Group");
	    			IProjectItemNode groupNode = new GroupNode(this.getProject(), group, this);
	    			children.add(groupNode);
	    		}
	    		
	    		//Path to resources folder under this component
				String extensionPath = extension.getId() + "/";
				IFolder extensionFolder = this.getProject().getFolder(extensionPath);
				if(extensionFolder.exists()) {
					for(IResource member : extensionFolder.members()) {
						if(member.getType() == IResource.FOLDER) {
							if(!member.getName().toUpperCase().equals("RES") && 
									!member.getName().toUpperCase().equals("META-INF")
									) {
								IProjectItemNode subFolder = new GenericFolderNode(this.getProject(), member.getName(), this);
								children.add(subFolder);
							}
						} else if(member.getType() == IResource.FILE) {
							String fileName = member.getName();
							if(!fileName.toUpperCase().equals(".PROJECT") &&
									!fileName.toUpperCase().equals("BUILD.PROPERTIES") &&
									!fileName.toUpperCase().equals("CONTRIBUTION.XML") &&
									!fileName.toUpperCase().equals("CONTRIBUTION.ZTL") &&
									!fileName.toUpperCase().equals("DESIGNSTUDIO.TARGET") &&
									!fileName.toUpperCase().equals("PLUGIN.XML")
									) {
								IProjectItemNode subFile = new GenericFileNode(this.getProject(), fileName, this);
								children.add(subFile);
							}
						}
					}
				}
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    		children.add(new ErrorNode("Error while searching groups: " + e.getMessage(), this));
    	}
        return children;
    }

}
