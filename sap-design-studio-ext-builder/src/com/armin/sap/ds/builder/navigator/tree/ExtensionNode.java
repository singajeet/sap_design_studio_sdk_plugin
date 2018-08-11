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
import com.armin.sap.ds.builder.api.common.IDEConstants;
import com.armin.sap.ds.builder.api.models.Component;
import com.armin.sap.ds.builder.api.models.Extension;
import com.armin.sap.ds.builder.api.models.Group;
import com.armin.sap.ds.builder.preferences.Settings;

public class ExtensionNode extends GenericFileNode {

	//private IProjectItemNode _parent;
	//private IProjectItemNode[] _children;
	
	public ExtensionNode(IProject project, Extension extension, IProjectItemNode parent) {
		super(project, parent);
		_item = extension;
		_children = initializeChildren(extension);
	}

	@Override
	public ProjectItemType getType() {
		return ProjectItemType.EXTENSION;
	}
	
	public Extension getExtension() {
		return (Extension)_item;
	}
	
	public void setExtension(Extension item) {
		this._item = item;
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
	
	public void addGroup(Group group) throws Exception{
		if(!exists(group)) {
			Extension extension = this.getExtension();
			
			//Check whether the passed group model exists under the current extension model
			boolean found = false;
			for(Group g : extension.getGroup()) {
				if(g.getId().toUpperCase().equals(group.getId().toUpperCase())) {
					found = true;
				}
			}
			
			if(found) {
				GroupNode node = new GroupNode(this.getProject(), group, this);
				_children.add(node);
			} else {
				throw new Exception("Failed while adding new Group node. Reason: Unable to find Group model with [Id=" + group.getId() 
				+ "] under Extension model [Id=" + extension.getId() + "]");
			}
			
		}
	}
		
	
	/************************** Required to be overridden ********************************/
	
	@Override
	public String getName() {
		return ((Extension)_item).getId() + "." + ((Extension)_item).getTitle();
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
		    		
		    		if(this.getGroup("DEFAULT") == null) {
			    		for(Component comp : extension.getComponent()) {
			    			if(comp.getGroup().toUpperCase().equals(IDEConstants.DEFAULT.toUpperCase())) {
			    				Group group = new Group();
				    			group.setId(IDEConstants.DEFAULT.toUpperCase());
				    			group.setTitle(IDEConstants.DEFAULT.toUpperCase());
				    			group.setTooltip(IDEConstants.DEFAULT.toUpperCase());
				    			IProjectItemNode groupNode = new GroupNode(this.getProject(), group, this);
				    			children.add(groupNode);
			    			}
			    		}
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
