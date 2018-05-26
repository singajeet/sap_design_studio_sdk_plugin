package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.graphics.Image;

import com.armin.sap.ds.ext.navigator.Activator;

public class ProjectParent implements IProjectElement {
	
	private IProject _project;
	private Image _image;
	private IProjectElement[] _children;
	 
    public ProjectParent(IProject iProject) {
        _project = iProject;
    }
 
    public String getProjectName() {
        return _project.getName();
    }
    
    public Image getImage() {
        if (_image == null) {
            _image = Activator.getImage("images/application-javascript.png"); //$NON-NLS-1$
        }
 
        return _image;
    }
    
    public IProjectElement[] getChildren() {
        if (_children == null) {
            _children = initializeChildren(_project);
        }
        // else we have already initialized them
 
        return _children;
    }
    
    private IProjectElement[] initializeChildren(IProject project) {
    	try {
    		IProjectElement[] children = new IProjectElement[project.members().length];
    		
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
					default:
						System.out.println("File with unknown type found: " + children[i].getText());
						break;
				}
    		}
    		return children;
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    		return null;
    	}
        
    }

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		try {
			return _project.getDescription().getComment();
		} catch (CoreException e) {			
			e.printStackTrace();
			return "No description found!";
		}
	}

	@Override
	public boolean hasChildren() {
		// TODO Auto-generated method stub
		return (_children.length > 0);
	}

	@Override
	public IProject getProject() {
		// TODO Auto-generated method stub
		return _project;
	}

	@Override
	public Object getParent() {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public ProjectElementType getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
