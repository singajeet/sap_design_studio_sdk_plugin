package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;

public class AdvancedPropertySheetFile extends GenericFile {
	
	public AdvancedPropertySheetFile(IResource resource, IProjectElement parent) {
		super(resource, parent);
	}
	
	@Override
	public ProjectElementType getType() {
		return ProjectElementType.ADVANCED_PROPERTY_SHEET_FILE;
	}
	
}
