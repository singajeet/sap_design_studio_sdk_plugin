package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;

public class CascadeStyleSheetNode extends GenericFileNode {
	
	public CascadeStyleSheetNode(IResource resource, IProjectItemNode parent) {
		super(resource, parent);
	}
	
	@Override
	public ProjectItemType getType() {
		return ProjectItemType.CASCADE_STYLE_SHEET_FILE;
	}
	
}
