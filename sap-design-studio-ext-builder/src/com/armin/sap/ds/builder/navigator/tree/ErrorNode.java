package com.armin.sap.ds.builder.navigator.tree;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.views.properties.IPropertySource;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.api.models.Error;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.properties.ErrorNodeProperties;

public class ErrorNode extends ProjectItemNode {

	public ErrorNode(IProject project, Error item, IProjectItemNode parent) {
		super(project, item, parent);		
	}

	public ErrorNode(IProject project, IProjectItemNode parent) {
		super(project, parent);		
	}

	public ErrorNode(IProject project) {
		super(project);		
	}

	public ErrorNode(String msg, IProjectItemNode parent) {
		super(msg, parent);
		_item = new Error(msg);
	}
	
	@Override
	public String getName() {
		return this._item.getId();
	}
	
	@Override
	public Image getImage() {
		Image image = Activator.getImage("images/error_16x16.gif");
		int size = Integer.parseInt(Settings.store().get(Settings.FOR.ICON_SIZE));
		ImageData imgData = image.getImageData().scaledTo(size, size);
		_image = new Image(Display.getCurrent(), imgData);
		image.dispose();
		return _image;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> adapter) {
		 if (adapter == IWorkbenchAdapter.class)
			 return (T)this;
	     if (adapter == IPropertySource.class)
	         return (T)(new ErrorNodeProperties(this));
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
