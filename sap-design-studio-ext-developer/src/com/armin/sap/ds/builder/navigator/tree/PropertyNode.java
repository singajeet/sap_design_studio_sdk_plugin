package com.armin.sap.ds.builder.navigator.tree;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.project.models.PossibleValueType;
import com.armin.sap.ds.builder.project.models.Property;

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

	@Override
	public Object[] getElements(Object input) {
		return getChildren(input);
	}

	@Override
	public Object[] getChildren(Object parent) {
		return _children.toArray();
	}

	@Override
	public Object getParent(Object element) {
		return _parent;
	}

	@Override
	public boolean hasChildren(Object parent) {		
		return (_children.size() > 0);
	}

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
			children.add(new ProjectItemNode("Error while creating property node: " + e.getMessage(), this));
		}	
		return children;
	}

}