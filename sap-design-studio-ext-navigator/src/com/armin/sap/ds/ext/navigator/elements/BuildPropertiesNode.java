package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;

public class BuildPropertiesNode extends GenericFileNode {

	public BuildPropertiesNode() {
		// TODO Auto-generated constructor stub
	}
	
	public BuildPropertiesNode(IResource resource, IProjectItemNode parent) {
		super(resource, parent);
	}

	@Override
	public ProjectItemType getType() {
		return ProjectItemType.BUILD_PROPERTIES_FILE;
	}
	
}
