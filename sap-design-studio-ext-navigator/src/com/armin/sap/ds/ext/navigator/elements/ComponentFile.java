package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;

public class ComponentFile extends GenericFile {

	public ComponentFile() {
		// TODO Auto-generated constructor stub
	}
	
	public ComponentFile(IResource resource) {
		super(resource);
	}

	@Override
	public ProjectElementType getType() {
		return ProjectElementType.COMPONENT_FILE;
	}
	
}
