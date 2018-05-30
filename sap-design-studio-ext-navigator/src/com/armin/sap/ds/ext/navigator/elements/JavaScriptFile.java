package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;

public class JavaScriptFile extends GenericFile {
	
	public JavaScriptFile(IResource resource, IProjectElement parent) {
		super(resource, parent);
	}
	
	@Override
	public ProjectElementType getType() {
		return ProjectElementType.JAVASCRIPT_FILE;
	}
}
