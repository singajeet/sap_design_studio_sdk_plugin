package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.swt.graphics.Image;

import com.armin.sap.ds.ext.navigator.Activator;

public class ProjectItemNode implements IProjectItemNode {
	
	private IResource _elementAsResource;
	private IProjectItemNode _parent;
	private IProject _project;	
	private String _name;
	private String _description;
	
	public ProjectItemNode()
	{
		
	}
	
    public ProjectItemNode(IResource resource, IProjectItemNode parent) {
    	_elementAsResource = resource;
    	_parent = parent;
    	_project = resource.getProject();
    	_name = resource.getName();
    	_description = resource.getName();
    }
    
    public IResource getElementAsResource() {
    	return _elementAsResource;
    }
    
    public String getProjectName() {
        return _project.getName();
    }
    
    @Override
    public Image getImage() {
        return Activator.getImage("images/file.png");
    }
    
    @Override
    public Object[] getElements(Object input) {
    	return null;
    }
    
    @Override
    public Object[] getChildren(Object parent) {
        return null;
    }
    
	@Override
	public byte[] getContent() {
		return null;
	}

	@Override
	public boolean hasChildren(Object parent) {		
		return false;
	}

	@Override
	public IProject getProject() {		
		return _project;
	}

	@Override
	public Object getParent(Object element) {		
		return _parent;
		
	}

	@Override
	public ProjectItemType getType() {		
		return ProjectItemType.UNKNOWN;
	}

	@Override
	public String getName() {		
		return _name;
	}

	@Override
	public String getDescription() {		
		return _description;
	}

	@Override
	public String getTooltip() {		
		return _description;
	}
	
	/*
	 for(int i=0; i<children.length; i++) {
    			switch (children[i].getType()) {
					case GENERIC_FOLDER:
						break;					
					case IMAGES_FOLDER:
						break;
					case CSS_FOLDER:
						break;
					case JS_FOLDER:
						break;
					case META_INF_FOLDER:
						break;
					case RESOURCE_FOLDER:
						break;
					case ADVANCED_PROPERTY_SHEET_FILE:
						break;
					case BUILD_PROPERTIES_FILE:
						break;
					case CASCADE_STYLE_SHEET_FILE:
						break;
					case COMPONENT_FILE:
						break;
					case EXTENSION_FILE:
						break;
					case GENERIC_FILE:
						break;
					case JAVASCRIPT_FILE:
						break;
					case MANIFEST_FILE:
						break;
					case PLUGIN_FILE:
						break;
					case TARGET_FILE:
						break;
					case PROJECT_PARENT:
						break;
					default:
						Logger.debug("File with unknown type found: " + children[i].getContent());
						break;
				}
    		}
	 * */
}
