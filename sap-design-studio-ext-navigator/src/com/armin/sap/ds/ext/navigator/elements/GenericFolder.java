package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;

public class GenericFolder extends ProjectElement {

	public GenericFolder() {
		// TODO Auto-generated constructor stub
	}
	
	public GenericFolder(IResource resource, IProjectElement parent) {
		super(resource, parent);
	}

	@Override
	public ProjectElementType getType() {
		return ProjectElementType.GENERIC_FOLDER;
	}
}
