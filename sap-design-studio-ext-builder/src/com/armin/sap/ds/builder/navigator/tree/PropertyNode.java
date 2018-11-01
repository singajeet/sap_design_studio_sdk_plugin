package com.armin.sap.ds.builder.navigator.tree;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.views.properties.IPropertySource;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.api.models.PossibleValueType;
import com.armin.sap.ds.builder.api.models.Property;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.properties.PropertyNodeProperties;

public class PropertyNode extends ProjectItemNode {

	public PropertyNode(IProject project, Property item, IProjectItemNode parent) {
		super(project, item, parent);
		_children = initializeChildren(item.getPossibleValue());
	}
	
	/**************************
	 * Required to be overridden
	 ********************************/

	@Override
	public String getName() {
		return ((Property)_item).getTitle();
	}

	@Override
	public Image getImage() {
		Image image = Activator.getImage("images/property_28x28.png");
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
//
//	@Override
//	public boolean hasChildren(Object parent) {		
//		return (_children.size() > 0);
//	}

	/************************************************************************************/

	protected ArrayList<IProjectItemNode> initializeChildren(List<PossibleValueType> values) {
		ArrayList<IProjectItemNode> children = new ArrayList<IProjectItemNode>();
		try {
			for(int i=0;i<values.size();i++) {
				IProjectItemNode token = new PropertyValueNode(this.getProject(), values.get(i), this);
				children.add(token);
			}						
			
		} catch (Exception e) {
			e.printStackTrace();
			children.add(new ErrorNode("Error while creating property node: " + e.getMessage(), this));
		}	
		return children;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> adapter) {
		 if (adapter == IWorkbenchAdapter.class)
			 return (T)this;
	     if (adapter == IPropertySource.class)
	         return (T)(new PropertyNodeProperties(this));
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
