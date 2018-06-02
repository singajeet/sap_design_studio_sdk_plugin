package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;

public class GenericFolderNode extends ProjectItemNode {

	public GenericFolderNode() {
		// TODO Auto-generated constructor stub
	}
	
	public GenericFolderNode(IResource resource, IProjectItemNode parent) {
		super(resource, parent);
	}

	@Override
	public ProjectItemType getType() {
		return ProjectItemType.GENERIC_FOLDER;
	}
}
