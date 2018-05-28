package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;
import org.eclipse.swt.graphics.Image;

import com.armin.sap.ds.ext.navigator.Activator;

public class ResourceFolder extends GenericFolder {

	IProjectElement[] _children;
	
	public ResourceFolder(IProjectElement parent) {
		
	}
	
	public ResourceFolder(IResource resource, IProjectElement parent) {
		super(resource, parent);
		initChildren();
	}
	
	
	/************************** Required to be overridden ********************************/
	
	@Override
	public String getName() {
		return super.getName();
	}
	
	@Override
	public Image getImage() {
		return Activator.getImage("images/application-javascript.png");
	}
	
	@Override
	public Object[] getElements(Object input) {
		return getChildren(input);
	}
	
	@Override
	public Object[] getChildren(Object parent) {
		return _children;
	}
	
	@Override
	public Object getParent(Object element) {
		return super.getParent(element);
	}
	
	@Override
	public boolean hasChildren(Object parent) {				
		return (_children.length > 0);
	}
	
	/************************************************************************************/

	private void initChildren() {
		try {
			IResource[] members = super.getElementAsResource().getProject().members();
			for(int i=0; i<members.length; i++) {
				if(members[i].getProjectRelativePath().segmentCount() > 0) {
					if(members[i].getProjectRelativePath().segment(0).toUpperCase().equals("RES")) {
						
					}
				}
			}
		}catch(Exception e) {
			
		}
	}
	
	@Override
	public ProjectElementType getType() {
		return ProjectElementType.RESOURCE_FOLDER;
	}
}
