package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;

public class BuildPropertiesFile extends GenericFile {

	public BuildPropertiesFile() {
		// TODO Auto-generated constructor stub
	}
	
	public BuildPropertiesFile(IResource resource) {
		super(resource);
	}

	@Override
	public ProjectElementType getType() {
		return ProjectElementType.BUILD_PROPERTIES_FILE;
	}
	
}
