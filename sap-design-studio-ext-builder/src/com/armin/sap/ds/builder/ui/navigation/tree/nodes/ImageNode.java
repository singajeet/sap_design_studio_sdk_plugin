package com.armin.sap.ds.builder.ui.navigation.tree.nodes;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.views.properties.IPropertySource;

import com.armin.sap.ds.builder.models.domain.Resource;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.properties.tree.nodes.ImageNodeProperties;

public class ImageNode extends GenericFileNode {

	private String _imagePath;
	private String _imageFileName;
	private IResource _file;
	
	public ImageNode(IProject project, String imagePath, String imageFileName, IProjectItemNode parent) {
		super(project, project.getFile(imagePath + "/" + imageFileName), parent);
		_imagePath = imagePath;
		_imageFileName = imageFileName;
		_file = project.getFile(imagePath + "/" + imageFileName); 
	}
	
	public ImageNode(IProject project, String imagePath, IProjectItemNode parent) {
		super(project, project.getFile(imagePath), parent);
		_imagePath = imagePath;
		_file = project.findMember(_imagePath);
		if(_file != null) {
			_item = new Resource(_file);
		}
	}

	@Override
	public IResource getAsResource() {		
		return this._file;
	}
	
	@Override
	public ProjectItemNodeType getType() {
		return ProjectItemNodeType.IMAGE;
	}
	
	public String getImagePath() {
		return _imagePath;
	}
	
	public String getImageFileName() {
		return _imageFileName;
	}
	
	@Override
	public String getFilePath() {
		return _imageFileName==null ? _imagePath : _imagePath + "/" + _imageFileName;
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
		int size = Integer.parseInt(Settings.store().get(Settings.FOR.ICON_SIZE_ID));
		IResource imageResource = this.getProject().findMember(imagePath);
		
		ImageData imgData = new ImageData(imageResource.getLocation().toFile().getAbsolutePath()).scaledTo(size, size);		
		_image = new Image(Display.getCurrent(), imgData);
		return _image;
	}

//	@Override
//	public Object[] getElements(Object input) {
//		return getChildren(input);
//	}
//
//	@Override
//	public Object[] getChildren(Object parent) {
//		return new Object[0];
//	}
//
//	@Override
//	public Object getParent(Object element) {
//		return super.getParent(element);
//	}

	@Override
	public boolean hasChildren(Object parent) {
		return false;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> adapter) {
		 if (adapter == IWorkbenchAdapter.class)
			 return (T)this;
	     if (adapter == IPropertySource.class)
	         return (T)(new ImageNodeProperties(this));
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
