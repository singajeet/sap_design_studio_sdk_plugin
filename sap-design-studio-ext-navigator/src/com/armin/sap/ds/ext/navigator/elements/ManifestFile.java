package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;

public class ManifestFile extends GenericFile {

	public ManifestFile() {
		// TODO Auto-generated constructor stub
	}
	
	public ManifestFile(IResource resource) {
		super(resource);
	}

	@Override
	public ProjectElementType getType() {
		return ProjectElementType.MANIFEST_FILE;
	}
	
}
