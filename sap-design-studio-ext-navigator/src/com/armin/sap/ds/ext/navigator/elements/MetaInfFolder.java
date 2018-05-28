package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;

public class MetaInfFolder extends GenericFolder {

	public MetaInfFolder(IProjectElement parent) {
		// TODO Auto-generated constructor stub
	}

	public MetaInfFolder(IResource resource) {
		super(resource);
	}
	
	@Override
	public ProjectElementType getType() {
		return ProjectElementType.META_INF_FOLDER;
	}
}
