package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;

public class JavaScriptNode extends GenericFileNode {
	
	public JavaScriptNode(IResource resource, IProjectItemNode parent) {
		super(resource, parent);
	}
	
	@Override
	public ProjectItemType getType() {
		return ProjectItemType.JAVASCRIPT_FILE;
	}
}
