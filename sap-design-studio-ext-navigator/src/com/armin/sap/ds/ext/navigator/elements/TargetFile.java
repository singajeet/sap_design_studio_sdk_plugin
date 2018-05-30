package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;

public class TargetFile extends GenericFile {

	public TargetFile() {
		// TODO Auto-generated constructor stub
	}
	
	public TargetFile(IResource resource, IProjectElement parent) {
		super(resource, parent);
	}

	@Override
	public ProjectElementType getType() {
		return ProjectElementType.TARGET_FILE;
	}
}
