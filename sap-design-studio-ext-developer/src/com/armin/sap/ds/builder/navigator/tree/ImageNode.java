package com.armin.sap.ds.builder.navigator.tree;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.project.models.ResourceModel;

public class ImageNode extends GenericFileNode {

	private String _imagePath;
	private String _imageFileName;
	
	
	public ImageNode(IProject project, String imagePath, String imageFileName, IProjectItemNode parent) {
		super(project, imagePath + "/" + imageFileName, parent);
		_imagePath = imagePath;
		_imageFileName = imageFileName;		
	}
	
	public ImageNode(IProject project, String imagePath, IProjectItemNode parent) {
		super(project, imagePath, parent);
		_imagePath = imagePath;
		IResource item = project.findMember(_imagePath);
		if(item != null) {
			_item = new ResourceModel(item);
		} else {
			_item = new ResourceModel();
			_item.setId(_imagePath);
			_item.setName(_imagePath);
		}
	}

	@Override
	public ProjectItemType getType() {
		return ProjectItemType.IMAGE;
	}
	
	public String getImagePath() {
		return _imagePath;
	}
	
	public String getImageFileName() {
		return _imageFileName;
	}
	
	/**************************
	 * Required to be overridden
	 ********************************/

	@Override
	public String getName() {
		String strPath = _imageFileName==null ? _imagePath : _imagePath + "/" + _imageFileName;
		IPath path = new Path(strPath);
		return path.toFile().getName();
	}

	@Override
	public Image getImage() {
		
		String imagePath = _imageFileName == null ? (_imagePath) : (_imagePath + "/" + _imageFileName);
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
		return super.getParent(element);
	}

	@Override
	public boolean hasChildren(Object parent) {
		return false;
	}
}