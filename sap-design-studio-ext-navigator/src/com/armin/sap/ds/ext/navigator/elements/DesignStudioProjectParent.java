package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.graphics.Image;

import com.armin.sap.ds.ext.navigator.Activator;

public class DesignStudioProjectParent implements IDesignStudioProjectElement {
	
	private IProject _project;
	private Image _image;
	private IDesignStudioProjectElement[] _children;
	 
    public DesignStudioProjectParent(IProject iProject) {
        _project = iProject;
    }
 
    public String getProjectName() {
        return _project.getName();
    }
    
    public Image getImage() {
        if (_image == null) {
            _image = Activator.getImage("images/project_open.png"); //$NON-NLS-1$
        }
 
        return _image;
    }
    
    public IDesignStudioProjectElement[] getChildren() {
        if (_children == null) {
            _children = initializeChildren(_project);
        }
        // else we have already initialized them
 
        return _children;
    }
    
    private IDesignStudioProjectElement[] initializeChildren(IProject project) {
    	IDesignStudioProjectElement[] children = {
                new DesignStudioProjectRes(this),
                new DesignStudioProjectMetaInf(this)
        };
 
        return children;
    }

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasChildren() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IProject getProject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getParent() {
		// TODO Auto-generated method stub
		return null;
	}
}
