package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;

public class ExtensionFile extends GenericFile {

	public ExtensionFile() {
		// TODO Auto-generated constructor stub
	}
	
	public ExtensionFile(IResource resource) {
		super(resource);
	}

	@Override
	public ProjectElementType getType() {
		return ProjectElementType.EXTENSION_FILE;
	}
}
