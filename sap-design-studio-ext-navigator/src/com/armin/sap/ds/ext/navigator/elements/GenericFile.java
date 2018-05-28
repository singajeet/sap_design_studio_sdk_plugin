package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;

public class GenericFile extends ProjectElement {

	public GenericFile() {
		// TODO Auto-generated constructor stub
	}
	
	public GenericFile(IResource resource, IProjectElement parent) {
		super(resource, parent);
	}

	@Override
	public ProjectElementType getType() {
		return ProjectElementType.GENERIC_FILE;
	}
}
