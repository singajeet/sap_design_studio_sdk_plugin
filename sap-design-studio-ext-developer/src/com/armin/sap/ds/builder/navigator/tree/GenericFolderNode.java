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

public class GenericFolderNode extends ProjectItemNode {

	private String _folderName;
	
	public GenericFolderNode(IProject project, String folderName, IProjectItemNode parent) {
		super(project, parent);
		_folderName = folderName;
		IResource item = project.findMember(folderName);
		if(item != null) {
			_item = new ResourceModel(item);
		} else {
			_item = new ResourceModel();
			_item.setId(folderName);
			_item.setName(folderName);
		}
	}
	
	public GenericFolderNode(String name, IProjectItemNode parent) {
		super(name, parent);
		_item = new ResourceModel();
	}

	@Override
	public ProjectItemType getType() {
		return ProjectItemType.GENERIC_FOLDER;
	}
	
	@Override
	public String getName() {
		IPath path = new Path(_folderName);
		return path.lastSegment();
	}
	
	@Override
	public Image getImage() {
		Image image = Activator.getImage("images/folder_28x28.png");
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
