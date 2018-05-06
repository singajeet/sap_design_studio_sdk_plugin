package com.armin.sap.ds.ext.navigator.provider;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.armin.sap.ds.ext.navigator.elements.DesignStudioProjectParent;
import com.armin.sap.ds.ext.navigator.elements.IDesignStudioProjectElement;
import com.armin.sap.ds.sdk.project.natures.ProjectNature;

public class ContentProvider implements ITreeContentProvider {

	private static final Object[] NO_CHILDREN = {};
    private IDesignStudioProjectElement[] _designStudioProjectParents;
    
	@Override
	public Object[] getElements(Object inputElement) {		
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		Object[] children = null;
        if (IWorkspaceRoot.class.isInstance(parentElement)) {
            IProject[] projects = ((IWorkspaceRoot)parentElement).getProjects();
            children = createDesignStudioParents(projects);
        } else if(IDesignStudioProjectElement.class.isInstance(parentElement)) {
        	children = ((IDesignStudioProjectElement)parentElement).getChildren();
        } 
        else {
            children = NO_CHILDREN;
        }
 
        return children;
	}

	private Object[] createDesignStudioParents(IProject[] projects) {
		Object[] result = null;
		
		List<Object> list = new ArrayList<Object>();
		for(int i=0; i < projects.length; i++) {
			Object designStudioProjectParent = createCustomProjectParent(projects[i]);
			if(designStudioProjectParent != null) {
				list.add(designStudioProjectParent);
			}
		}
		
		result = new Object[list.size()];
		list.toArray(result);
		
		return result;
	}

	private Object createCustomProjectParent(IProject iProject) {
		Object result = null;
		try {
			if(iProject.getNature(ProjectNature.NATURE_ID) != null) {
				result = new DesignStudioProjectParent(iProject);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Object getParent(Object element) {
		Object parent = null;
		if(IProject.class.isInstance(element)) {
			parent = ((IProject)element).getWorkspace().getRoot();
		}
		else if(IDesignStudioProjectElement.class.isInstance(element)) {
			parent = ((IDesignStudioProjectElement)element).getParent();
		}
		
		return parent;
	}

	@Override
	public boolean hasChildren(Object element) {
		boolean hasChildren = false;
		
		if (IWorkspaceRoot.class.isInstance(element)) {
            hasChildren = ((IWorkspaceRoot)element).getProjects().length > 0;
        } else if (IDesignStudioProjectElement.class.isInstance(element)) {
            hasChildren = ((IDesignStudioProjectElement)element).hasChildren();
        }
        // else it is not one of these so return false
         
        return hasChildren;
	}
	
	private DesignStudioProjectParent[] initializeParent(Object parentElement) {
        IProject [] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
        
        List<DesignStudioProjectParent> list = new Vector<DesignStudioProjectParent>();
        for (int i = 0; i < projects.length; i++) {
        	try {
        		if(projects[i].getNature(ProjectNature.NATURE_ID) != null) {
        			list.add(new DesignStudioProjectParent(projects[i]));
        		}
        	}catch(Exception e) {}
            
        }        
        
        DesignStudioProjectParent[] result = new DesignStudioProjectParent[list.size()];
        list.toArray(result); 
        return result;
    }
	
	@Override
    public void dispose() {
        System.out.println("ContentProvider.dispose"); //$NON-NLS-1$
        // TODO Auto-generated method stub
 
    }
	
	@Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        if(oldInput != null && newInput != null) {
        		System.out
                		.println("ContentProvider.inputChanged: old: " + oldInput.getClass().getName() + " new: " + newInput.getClass().getName()); //$NON-NLS-1$ //$NON-NLS-2$
        } else if(oldInput != null) {
        	System.out
    		.println("ContentProvider.inputChanged: old: " + oldInput.getClass().getName());
        } else if(newInput != null) {
        	System.out
    		.println("ContentProvider.inputChanged: new: " + newInput.getClass().getName());
        }else {
        	System.out.println("No old or new input is passed!");
        }
 
    }

}
