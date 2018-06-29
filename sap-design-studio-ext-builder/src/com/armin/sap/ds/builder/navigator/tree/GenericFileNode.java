package com.armin.sap.ds.builder.navigator.tree;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.project.models.ResourceModel;

public class GenericFileNode extends ProjectItemNode {

	protected String _filePath;
	
	public GenericFileNode(IProject project, IProjectItemNode parent) {
		super(project, parent);
		_item = new ResourceModel();
	}
	
	public GenericFileNode(IProject project, String filePath, IProjectItemNode parent) {
		super(project, parent);
		_filePath = filePath;
		IResource item = project.findMember(filePath);
		if(item != null) {
			_item = new ResourceModel(item);
		} else {
			_item = new ResourceModel();
			_item.setId(filePath);
			_item.setName(filePath);
		}
	}

	@Override
	public ProjectItemType getType() {
		return ProjectItemType.GENERIC_FILE;
	}
	
	@Override
	public String getName() {
		IPath path = new Path(_filePath);
		return path.toFile().getName();
	}
	
	@Override
	public Image getImage() {
		Image image = Activator.getImage("images/file_28x28.png");
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
		return _children.toArray();
	}

	@Override
	public Object getParent(Object element) {
		return super.getParent(element);
	}

	@Override
	public boolean hasChildren(Object parent) {
		return (_children.size() > 0);
	}
}
