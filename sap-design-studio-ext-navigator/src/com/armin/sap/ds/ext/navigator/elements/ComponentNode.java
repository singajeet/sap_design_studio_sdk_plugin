package com.armin.sap.ds.ext.navigator.elements;

import java.util.ArrayList;

import org.eclipse.core.resources.IResource;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

import com.armin.sap.ds.ext.navigator.Activator;
import com.armin.sap.ds.ext.plugin.preferences.Settings;
import com.armin.sap.ds.xml.Component;

public class ComponentNode extends GenericFileNode {

	private String _name;
	private IProjectItemNode[] _children;
	private IProjectItemNode _parent;
	private Component _model;

	public ComponentNode() {
		// TODO Auto-generated constructor stub
	}

	public ComponentNode(Component model, IResource extensionResource, IProjectItemNode parent) {
		_model = model;
		_name = _model.getTitle();
		_parent = parent;
		_children = initializeChildren(extensionResource);
	}

	public ComponentNode(IResource resource, IProjectItemNode parent) {
		super(resource, parent);
	}

	@Override
	public ProjectItemType getType() {
		return ProjectItemType.COMPONENT_FILE;
	}

	/**************************
	 * Required to be overridden
	 ********************************/

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public Image getImage() {
		Image image = Activator.getImage("images/component_28x28.png");
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

	protected IProjectItemNode[] initializeChildren(IResource extensionResource) {
		try {
			ArrayList<IProjectItemNode> children = new ArrayList<IProjectItemNode>();
			
			String aps = _model.getPropertySheetPath();
			if(aps != null && !aps.isEmpty()) {								
				IProjectItemNode apsNode = new AdvancedPropertySheetNode(aps, _model, extensionResource, _parent);
				children.add(apsNode);
			}
			
			IProjectItemNode css = new CascadeStyleSheetCollectionNode(_model.getCssInclude(), extensionResource, _parent);
			children.add(css);
			
//			IProjectItemNode images = new ImagesFolderNode(_model, extensionResource, _parent);
//			children.add(images);
			
			IProjectItemNode[] childrenArray = new IProjectItemNode[children.size()];
			children.toArray(childrenArray);
			return childrenArray;
		} catch (Exception e) {
			e.printStackTrace();
			return new IProjectItemNode[]{ new ProjectItemNode("Error while searching images, css or APS nodes: " + e.getMessage(), this) };
		}

	}

}
