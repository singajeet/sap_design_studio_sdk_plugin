package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;
import org.eclipse.swt.graphics.Image;

import com.armin.sap.ds.ext.navigator.Activator;

public class GenericFileNode extends ProjectItemNode {

	public GenericFileNode() {
		// TODO Auto-generated constructor stub
	}
	
	public GenericFileNode(IResource resource, IProjectItemNode parent) {
		super(resource, parent);
	}

	@Override
	public ProjectItemType getType() {
		return ProjectItemType.GENERIC_FILE;
	}
	
	@Override
    public Image getImage() {
        _image = Activator.getImage("images/file.png");
        return _image;
    }
}
