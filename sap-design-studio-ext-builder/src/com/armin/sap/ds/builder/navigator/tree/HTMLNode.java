package com.armin.sap.ds.builder.navigator.tree;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.views.properties.IPropertySource;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.properties.projectitemnode.HTMLNodeProperties;

public class HTMLNode extends GenericFileNode {

	private String _htmlPath;

	public HTMLNode(IProject project, String htmlPath, IProjectItemNode parent) {
		super(project, htmlPath, parent);
		_htmlPath = htmlPath;		
	}
	
	@Override
	public ProjectItemType getType() {
		return ProjectItemType.HTML;
	}
	
	public String getHTMLPath() {
		return _htmlPath;
	}
	
	/**************************
	 * Required to be overridden
	 ********************************/

	@Override
	public String getName() {
		IPath path = new Path(_htmlPath);
		return path.toFile().getName();
	}

	@Override
	public Image getImage() {
		Image image = Activator.getImage("images/text-html_28x28.png");
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
//		return new Object[0];
//	}
//
//	@Override
//	public Object getParent(Object element) {
//		return this.getParent(element);
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
	         return (T)(new HTMLNodeProperties(this));
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
