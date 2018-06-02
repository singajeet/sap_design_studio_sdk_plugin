package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;

public class ManifestNode extends GenericFileNode {

	public ManifestNode() {
		// TODO Auto-generated constructor stub
	}
	
	public ManifestNode(IResource resource, IProjectItemNode parent) {
		super(resource, parent);
	}

	@Override
	public ProjectItemType getType() {
		return ProjectItemType.MANIFEST_FILE;
	}
	
}
