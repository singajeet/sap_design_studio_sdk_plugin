package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;
import org.eclipse.swt.graphics.Image;

import com.armin.sap.ds.ext.navigator.Activator;

public class ComponentFile extends GenericFile {

	public ComponentFile() {
		// TODO Auto-generated constructor stub
	}
	
	public ComponentFile(IResource resource, IProjectElement parent) {
		super(resource, parent);
	}

	@Override
	public ProjectElementType getType() {
		return ProjectElementType.COMPONENT_FILE;
	}
	
	@Override
    public Image getImage() {
        return Activator.getImage("images/contribute_ztl.png");
    }
	
}
