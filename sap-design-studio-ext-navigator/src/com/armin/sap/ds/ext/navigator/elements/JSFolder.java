package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;

public class JSFolder extends GenericFolder {

	public JSFolder() {
		// TODO Auto-generated constructor stub
	}
	
	public JSFolder(IResource resource, IProjectElement parent) {
		super(resource, parent);
	}

	@Override
	public ProjectElementType getType() {
		return ProjectElementType.JS_FOLDER;
	}
}
