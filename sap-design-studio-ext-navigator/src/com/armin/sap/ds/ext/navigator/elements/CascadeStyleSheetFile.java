package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;

public class CascadeStyleSheetFile extends GenericFile {
	
	public CascadeStyleSheetFile(IResource resource, IProjectElement parent) {
		super(resource, parent);
	}
	
	@Override
	public ProjectElementType getType() {
		return ProjectElementType.CASCADE_STYLE_SHEET_FILE;
	}
	
}
