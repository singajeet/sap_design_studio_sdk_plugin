package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;

public class AdvancedPropertySheetNode extends GenericFileNode {
	
	public AdvancedPropertySheetNode(IResource resource, IProjectItemNode parent) {
		super(resource, parent);
	}
	
	@Override
	public ProjectItemType getType() {
		return ProjectItemType.ADVANCED_PROPERTY_SHEET_FILE;
	}
	
}
