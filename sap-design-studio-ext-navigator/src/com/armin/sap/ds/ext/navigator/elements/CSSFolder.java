package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;

public class CSSFolder extends GenericFolder {

	public CSSFolder() {
		// TODO Auto-generated constructor stub
	}
	
	public CSSFolder(IResource resource, IProjectElement parent) {
		super(resource, parent);
	}

	@Override
	public ProjectElementType getType() {
		return ProjectElementType.CSS_FOLDER;
	}
}
