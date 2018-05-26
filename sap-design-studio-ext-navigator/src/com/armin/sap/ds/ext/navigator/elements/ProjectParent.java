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
    		
//    		for(int i=0; i<children.length; i++) {
//    			
//    		}
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
}
