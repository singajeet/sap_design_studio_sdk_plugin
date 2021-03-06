package com.armin.sap.ds.ext.navigator.elements;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

import com.armin.sap.ds.ext.navigator.Activator;
import com.armin.sap.ds.ext.plugin.preferences.Settings;
import com.armin.sap.ds.xml.Component;

public class CascadeStyleSheetNode extends GenericFileNode {
	
	private String _name;	
	private String _path;	
	private IResource _extensionResource;
	private IProjectItemNode _parent;
	
	public CascadeStyleSheetNode(String path, IResource extensionResource, IProjectItemNode parent) {
		_path = path;
		_extensionResource = extensionResource;
		_parent = parent;		
		Path osPath = new Path(path);
		_name = osPath.toFile().getName();
	}
	
	public CascadeStyleSheetNode(Component model, IResource resource, IProjectItemNode parent) {
		super(resource, parent);
	}
	
	@Override
	public ProjectItemType getType() {
		return ProjectItemType.CASCADE_STYLE_SHEET_FILE;
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
		Image image = Activator.getImage("images/file_obj.png");
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
