package com.armin.sap.ds.builder.navigator.tree;

import java.util.ArrayList;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.api.models.Component;
import com.armin.sap.ds.builder.preferences.Settings;

public class ComponentNode extends ProjectItemNode {

	public ComponentNode(IProject project, Component component, IProjectItemNode parent) {
		super(project, component, parent);		
		_children = initializeChildren(component);
	}

	@Override
	public ProjectItemType getType() {
		return ProjectItemType.COMPONENT;
	}
	
	public Component getComponent() {
		return (Component)_item;
	}
	
	public String getId() {
		return _item.getId();
	}

	/**************************
	 * Required to be overridden
	 ********************************/

	@Override
	public String getName() {
		return ((Component)_item).getTitle();
	}

	@Override
	public Image getImage() {
		Image image = Activator.getImage("images/component_16x16.png");
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
//		return super.getParent(element);
//	}
//
//	@Override
//	public boolean hasChildren(Object parent) {		
//		return (_children.size() > 0);
//	}

	/************************************************************************************/

	protected ArrayList<IProjectItemNode> initializeChildren(Component component) {
		ArrayList<IProjectItemNode> children = new ArrayList<IProjectItemNode>();
		try {			
			
			String aps = component.getPropertySheetPath();
			if(aps != null && !aps.isEmpty()) {								
				IProjectItemNode apsNode = new AdvancedPropertySheetNode(this.getProject(), aps, this);
				children.add(apsNode);
			}
			
			IProjectItemNode css = new CascadeStyleSheetCollectionNode(this.getProject(), component.getCssInclude(), this);
			children.add(css);
			
			GroupNode groupNode = (GroupNode)this.getParent(this);
			ExtensionNode extensionNode = (ExtensionNode)groupNode.getParent(groupNode);
			
			IProjectItemNode images = new ImagesFolderNode(this.getProject(), extensionNode.getExtension().getId(), this);
			children.add(images);
			
			//Sub folders under this "res" folder
			String resPath = extensionNode.getExtension().getId() + "/res";
			IFolder resFolder = this.getProject().getFolder(resPath);
			if(resFolder.exists()) {
				for(IResource folder : resFolder.members()) {
					if(folder.getType() == IResource.FOLDER) {
						if(!folder.getName().toUpperCase().equals("CSS") && 
								!folder.getName().toUpperCase().equals("JS") &&
								!folder.getName().toUpperCase().equals("IMAGES") &&
								!folder.getName().toUpperCase().equals("ADDITIONAL_PROPERTIES_SHEET")
								) {
							IProjectItemNode subFolder = new GenericFolderNode(this.getProject(), folder.getName(), this);
							children.add(subFolder);
						}
					}
				}
			}			
			
			return children;
		} catch (Exception e) {
			e.printStackTrace();
			children.add(new ErrorNode("Error while searching images, css or APS nodes: " + e.getMessage(), this));
			return children;
		}

	}

}
