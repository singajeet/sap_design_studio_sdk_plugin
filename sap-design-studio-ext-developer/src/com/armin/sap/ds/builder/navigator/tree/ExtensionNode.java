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
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.project.models.Component;
import com.armin.sap.ds.builder.project.models.Extension;
import com.armin.sap.ds.builder.project.models.Group;

public class ExtensionNode extends GenericFileNode {

	private IProjectItemNode _parent;
	private IProjectItemNode[] _children;
	
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
			if(group.getTitle().equals(name)) {
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
		return _parent;
	}
	
	@Override
	public boolean hasChildren(Object parent) {				
		return (_children.length > 0);
	}
	
	/************************************************************************************/

	protected IProjectItemNode[] initializeChildren(Extension extension) {
    	try {    			
	    		List<Group> groups = extension.getGroup();
	    		ArrayList<IProjectItemNode> children = new ArrayList<IProjectItemNode>();
	    		
	    		if(groups.size() > 0) {
		    		for(int i=0;i<groups.size();i++) {
		    			Group group = groups.get(i);
		    			IProjectItemNode groupNode = new GroupNode(this.getProject(), group, this);
		    			children.add(groupNode);
		    		}
	    		} else {
	    			Group group = new Group();
	    			group.setId("default");
	    			group.setTitle("Default");
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
