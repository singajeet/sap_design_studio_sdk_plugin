package com.armin.sap.ds.builder.navigator.tree;

import java.util.ArrayList;

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
import com.armin.sap.ds.builder.api.models.Component;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.properties.ComponentNodeProperties;

public class ComponentNode extends GenericFileNode {

	public ComponentNode(IProject project, Component component, IProjectItemNode parent) {
		super(project, component, parent);		
		_children = initializeChildren(component);
	}
	
	public ComponentNode(IProject project, Component component, IProjectItemNode parent, TreeNodeAccessMode mode) {
		this(project, component, parent);
		setAccessMode(mode);
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

	public void addAdvancedPropertySheet(String path) {
		if(path != null && !getComponent().getPropertySheetPath().equalsIgnoreCase(path)) {
			getComponent().setPropertySheetPath(path);
			for(int i=0; i< _children.size(); i++) {
				IProjectItemNode node = _children.get(i);
				if(node instanceof AdvancedPropertySheetNode) {
					_children.remove(i);
					AdvancedPropertySheetNode newPathNode = new AdvancedPropertySheetNode(this.getProject(), path, this);
					_children.add(newPathNode);
					
				}
			}
		}
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
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> adapter) {
		 if (adapter == IWorkbenchAdapter.class)
			 return (T)this;
	     if (adapter == IPropertySource.class)
	         return (T)(new ComponentNodeProperties(this));
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
