package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.widgets.Display;

import com.armin.sap.ds.ext.plugin.preferences.Settings;
import com.armin.sap.ds.xml.Component;

public class ImageNode extends GenericFolderNode {

	private Component _model;
	private String _name;
	private IProjectItemNode _parent;
	private IResource _extensionResource, _imageResource;
	
	public ImageNode() {
		// TODO Auto-generated constructor stub
	}
	
	public ImageNode(IResource imageResource, IResource extensionResource, IProjectItemNode parent) {
		super(extensionResource, parent);
		
		_name = imageResource.getName();
		_imageResource = imageResource;
		_extensionResource = extensionResource;
	}
	
	public ImageNode(Component model, IResource resource, IProjectItemNode parent) {
		super(resource, parent);
	}

	@Override
	public ProjectItemType getType() {
		return ProjectItemType.IMAGE;
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
		
		String imagePath = _imageResource.getLocation().toFile().getAbsolutePath();
		System.out.println("Image Path: " + imagePath);
		int size = Integer.parseInt(Settings.store().get(Settings.FOR.ICON_SIZE));
		ImageData imgData = new ImageData(imagePath).scaledTo(size, size);		
		_image = new Image(Display.getCurrent(), imgData);
		return _image;
	}

	@Override
	public Object[] getElements(Object input) {
		return getChildren(input);
	}

	@Override
	public Object[] getChildren(Object parent) {
		return new Object[0];
	}

	@Override
	public Object getParent(Object element) {
		return _parent;
	}

	@Override
	public boolean hasChildren(Object parent) {
		return false;
	}
}
