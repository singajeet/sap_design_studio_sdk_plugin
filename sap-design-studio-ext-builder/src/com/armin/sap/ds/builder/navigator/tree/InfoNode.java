package com.armin.sap.ds.builder.navigator.tree;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.views.properties.IPropertySource;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.api.models.Info;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.properties.InfoNodeProperties;

public class InfoNode extends ProjectItemNode {

	public InfoNode(IProject project, Info item, IProjectItemNode parent) {
		super(project, item, parent);		
	}

	public InfoNode(IProject project, IProjectItemNode parent) {
		super(project, parent);
	}

	public InfoNode(IProject project) {
		super(project);		
	}

	public InfoNode(String msg, IProjectItemNode parent) {
		super(msg, parent);
		_item = new Info(msg);
	}
	
	public InfoNode(String msg) {
		super(msg);
		_item = new Info(msg);
	}
	
	@Override
	public String getName() {
		return this._item.getId();
	}
	
	@Override
	public Image getImage() {
		Image image = Activator.getImage("images/message_info_16x16.png");
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
	         return (T)(new InfoNodeProperties(this));
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
