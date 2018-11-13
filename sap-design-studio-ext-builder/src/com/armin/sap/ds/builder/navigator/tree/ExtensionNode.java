package com.armin.sap.ds.builder.navigator.tree;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.views.properties.IPropertySource;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.api.common.IDEConstants;
import com.armin.sap.ds.builder.api.models.Component;
import com.armin.sap.ds.builder.api.models.Extension;
import com.armin.sap.ds.builder.api.models.Group;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.properties.ExtensionNodeProperties;

public class ExtensionNode extends GenericFileNode {

	//private IProjectItemNode _parent;
	//private IProjectItemNode[] _children;
	
	public ExtensionNode(IProject project, Extension extension, IProjectItemNode parent) {
		super(project, project.getFile(extension.getId() + "/contribution.xml"), parent);
		_item = extension;
		_children = initializeChildren(extension);
	}
	
	public ExtensionNode(IProject project, Extension extension, IProjectItemNode parent, TreeNodeAccessMode mode) {
		this(project, extension, parent);
		setAccessMode(mode);
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
			
			if(getAccessMode() == TreeNodeAccessMode.READ_ONLY) {
				//Just add group as TreeNode in the explorer
				GroupNode node = new GroupNode(this.getProject(), group, this);
				_children.add(node);				
			} 
			else if(getAccessMode() == TreeNodeAccessMode.EDIT){				
				//Add a new Group model instance, save it to XML file
				//and add it to TreeNode in explorer
				
				//DO NOT CHANGE SEQUENCE OF NEXT 2 LINES
				_projectService.addNewGroup(group.getName(), extension, this.getProject());
				
				GroupNode node = new GroupNode(this.getProject(), group, this);
				_children.add(node);
				
			} 
			else {
				throw new Exception("Failed while adding new Group node. Reason: Invalid "
						+ "access mode for extension node [Id=" + extension.getId() + "]");
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
		    			if(!exists(group)) {
		    				IProjectItemNode groupNode = new GroupNode(this.getProject(), group, this);
		    				children.add(groupNode);
		    			}
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
				    			break;
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
									!member.getName().toUpperCase().equals("META-INF") &&
									!this.isComponentFolder(member)
									) {
								IProjectItemNode subFolder = new GenericFolderNode(this.getProject(), member, this);
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
								IProjectItemNode subFile = new GenericFileNode(this.getProject(), member, this);
								
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
	
	private boolean isComponentFolder(IResource member) {
		Extension extension = (Extension)this._item;
		List<Component> components = extension.getComponent();
		String memberName = member.getName().toUpperCase();
		for(Component comp : components) {
			if(comp.getId().toUpperCase().equals(memberName)) {
				return true;
			}
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> adapter) {
		 if (adapter == IWorkbenchAdapter.class)
			 return (T)this;
	     if (adapter == IPropertySource.class)
	         return (T)(new ExtensionNodeProperties(this));
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
