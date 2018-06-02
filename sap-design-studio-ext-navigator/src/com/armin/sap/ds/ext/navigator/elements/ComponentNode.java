package com.armin.sap.ds.ext.navigator.elements;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import com.armin.sap.ds.ext.navigator.Activator;
import com.armin.sap.ds.ext.plugin.preferences.Settings;
import com.armin.sap.ds.xml.Component;

public class ComponentNode extends GenericFileNode {

	private String _name;
	private Image _image;
	private IProjectItemNode[] _children;
	private IResource _resource;
	private IProjectItemNode _parent;
	private Component _model;
	
	public ComponentNode() {
		// TODO Auto-generated constructor stub
	}
	
	public ComponentNode(Component model, IResource resource, IProjectItemNode parent) {
		_model = model;
		_name = _model.getTitle();
		_resource = resource;
		_parent = parent;
	}
	
	public ComponentNode(IResource resource, IProjectItemNode parent) {
		super(resource, parent);
	}

	@Override
	public ProjectItemType getType() {
		return ProjectItemType.COMPONENT_FILE;
	}
	
	/************************** Required to be overridden ********************************/
	
	@Override
	public String getName() {
		return _name;
	}
	
	@Override
    public Image getImage() {
		Image image = Activator.getImage("images/component.png");
		int size = Integer.parseInt(Settings.store().get(Settings.FOR.ICON_SIZE));
		ImageData imgData = image.getImageData().scaledTo(size, size);
		return new Image(Display.getCurrent(), imgData);
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
		return false;
		//return (_children.length > 0);
	}
	
}
