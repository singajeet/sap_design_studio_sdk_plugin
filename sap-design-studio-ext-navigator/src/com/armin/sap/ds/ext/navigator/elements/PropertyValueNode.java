package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

import com.armin.sap.ds.ext.navigator.Activator;
import com.armin.sap.ds.ext.plugin.preferences.Settings;

public class PropertyValueNode extends ProjectItemNode {
	
	private String _name;
	private IResource _extensionResource;
	private IProjectItemNode _parent;

	public PropertyValueNode() {
		// TODO Auto-generated constructor stub
	}

	public PropertyValueNode(String value, IResource extensionResource, IProjectItemNode parent) {
		super(extensionResource, parent);
		_name = value;		
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
		_image = Activator.getImage("images/value_token.gif");		
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
