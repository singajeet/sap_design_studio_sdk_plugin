package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;

public class ImagesFolder extends GenericFolder {

	public ImagesFolder() {
		// TODO Auto-generated constructor stub
	}
	
	public ImagesFolder(IResource resource) {
		super(resource);
	}

	@Override
	public ProjectElementType getType() {
		return ProjectElementType.IMAGES_FOLDER;
	}

}
