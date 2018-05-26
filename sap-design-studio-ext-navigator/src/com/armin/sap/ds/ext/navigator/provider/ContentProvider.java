package com.armin.sap.ds.ext.navigator.provider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.armin.sap.ds.ext.navigator.elements.ProjectParent;
import com.armin.sap.ds.ext.navigator.elements.IProjectElement;
import com.armin.sap.ds.sdk.project.natures.ProjectNature;

public class ContentProvider implements ITreeContentProvider, IResourceChangeListener {

	private static final Object[] NO_CHILDREN = {};
    Viewer _viewer;
    
    public ContentProvider() {
    	ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
    }
    
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
        } else if(IProjectElement.class.isInstance(parentElement)) {
        	children = ((IProjectElement)parentElement).getChildren();
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
			try {
					if(projects[i].hasNature(ProjectNature.NATURE_ID)){
						Object designStudioProjectParent = createCustomProjectParent(projects[i]);
						if(designStudioProjectParent != null) {
							list.add(designStudioProjectParent);
						}
					}
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
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
				result = new ProjectParent(iProject);
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
		else if(IProjectElement.class.isInstance(element)) {
			parent = ((IProjectElement)element).getParent();
		}
		
		return parent;
	}

	@Override
	public boolean hasChildren(Object element) {
		boolean hasChildren = false;
		
		if (IWorkspaceRoot.class.isInstance(element)) {
            hasChildren = ((IWorkspaceRoot)element).getProjects().length > 0;
        } else if (IProjectElement.class.isInstance(element)) {
            hasChildren = ((IProjectElement)element).hasChildren();
        }
        // else it is not one of these so return false
         
        return hasChildren;
	}
	
//	private ProjectParent[] initializeParent(Object parentElement) {
//        IProject [] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
//        
//        List<ProjectParent> list = new Vector<ProjectParent>();
//        for (int i = 0; i < projects.length; i++) {
//        	try {
//        		if(projects[i].getNature(ProjectNature.NATURE_ID) != null) {
//        			list.add(new ProjectParent(projects[i]));
//        		}
//        	}catch(Exception e) {}
//            
//        }        
//        
//        ProjectParent[] result = new ProjectParent[list.size()];
//        list.toArray(result); 
//        return result;
//    }
	
	@Override
    public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
        System.out.println("ContentProvider.dispose"); //$NON-NLS-1$
        // TODO Auto-generated method stub
 
    }
	
	@Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
//        if(oldInput != null && newInput != null) {
//        		System.out
//                		.println("ContentProvider.inputChanged: old: " + oldInput.getClass().getName() + " new: " + newInput.getClass().getName()); //$NON-NLS-1$ //$NON-NLS-2$
//        } else if(oldInput != null) {
//        	System.out
//    		.println("ContentProvider.inputChanged: old: " + oldInput.getClass().getName());
//        } else if(newInput != null) {
//        	System.out
//    		.println("ContentProvider.inputChanged: new: " + newInput.getClass().getName());
//        }else {
//        	System.out.println("No old or new input is passed!");
//        }
		_viewer = viewer;
 
    }

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		_viewer.refresh();
		
	}

}
