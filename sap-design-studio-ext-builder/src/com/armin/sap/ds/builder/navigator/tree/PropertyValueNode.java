package com.armin.sap.ds.builder.navigator.tree;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.api.models.PossibleValueType;
import com.armin.sap.ds.builder.preferences.Settings;

public class PropertyValueNode extends ProjectItemNode {
	
	PossibleValueType _value;

	public PropertyValueNode(IProject project, PossibleValueType value, IProjectItemNode parent) {
		super(project, value, parent);		
	}
	
	/**************************
	 * Required to be overridden
	 ********************************/

	@Override
	public String getName() {
		return _value.getName();
	}

	@Override
	public Image getImage() {
		Image image = Activator.getImage("images/property_value_28x28.png");
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
//
//	@Override
//	public Object[] getChildren(Object parent) {
//		return _children.toArray();
//	}
//
//	@Override
//	public Object getParent(Object element) {
//		return _parent;
//	}

	@Override
	public boolean hasChildren(Object parent) {		
		return false;
	}


}
