package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;

public class CascadeStyleSheetFile extends GenericFile {
	
	public CascadeStyleSheetFile(IResource resource) {
		super(resource);
	}
	
	@Override
	public ProjectElementType getType() {
		return ProjectElementType.CASCADE_STYLE_SHEET_FILE;
	}
	
}
