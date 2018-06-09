package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

import com.armin.sap.ds.ext.navigator.Activator;
import com.armin.sap.ds.ext.plugin.preferences.Settings;
import com.armin.sap.ds.xml.Component;

public class AdvancedPropertySheetNode extends GenericFileNode {
	
	private String _apsPath;
	private Component _model;
	private static final String _name = "Advanced Property Sheet";	
	private IProjectItemNode _parent;
	private IProjectItemNode[] _children;
	
	public AdvancedPropertySheetNode(IResource resource, IProjectItemNode parent) {
		super(resource, parent);
	}
	
	public AdvancedPropertySheetNode(String apsPath, Component model, IResource resource, IProjectItemNode parent) {
		super(resource, parent);
		_apsPath = apsPath;
		_model = model;
		
	}
	
	@Override
	public ProjectItemType getType() {
		return ProjectItemType.ADVANCED_PROPERTY_SHEET_FILE;
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
		Image image = Activator.getImage("images/properties_28x28.png");
		int size = Integer.parseInt(Settings.store().get(Settings.FOR.ICON_SIZE));
		ImageData imgData = image.getImageData().scaledTo(size, size);
		image.dispose();
		_image = new Image(Display.getCurrent(), imgData);
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
		return false;
		// return (_children.length > 0);
	}

	
}
