package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;

public class ImagesFolderNode extends GenericFolderNode {

	public ImagesFolderNode() {
		// TODO Auto-generated constructor stub
	}
	
	public ImagesFolderNode(IResource resource, IProjectItemNode parent) {
		super(resource, parent);
	}

	@Override
	public ProjectItemType getType() {
		return ProjectItemType.IMAGES_FOLDER;
	}

}
