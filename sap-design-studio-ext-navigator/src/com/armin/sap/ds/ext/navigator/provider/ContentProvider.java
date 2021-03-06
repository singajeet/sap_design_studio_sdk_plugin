package com.armin.sap.ds.ext.navigator.provider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;

import com.armin.sap.ds.ext.navigator.elements.IProjectItemNode;
import com.armin.sap.ds.ext.navigator.elements.ProjectNode;
import com.armin.sap.ds.sdk.project.natures.ProjectNature;

public class ContentProvider implements ITreeContentProvider, IResourceChangeListener {

	private static final Object[] NO_CHILDREN = {};
    Viewer _viewer;
    private Map<String, Object> _wrapperCache = new HashMap<String, Object>();
    
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
            children = createDesignStudioProjects(projects);
        } else if(IProjectItemNode.class.isInstance(parentElement)) {
        	children = ((IProjectItemNode)parentElement).getChildren(parentElement);
        } 
        else {
            children = NO_CHILDREN;
        }
 
        return children;
	}

	private Object[] createDesignStudioProjects(IProject[] projects) {
		Object[] result = null;
		
		List<Object> list = new ArrayList<Object>();
		for(int i=0; i < projects.length; i++) {
			try {
					Object designStudioProjectParent = _wrapperCache.get(projects[i].getName());
					if(designStudioProjectParent == null) {
						designStudioProjectParent = createProjectParent(projects[i]);							
					}
							
					if(designStudioProjectParent != null) {
						_wrapperCache.put(projects[i].getName(), designStudioProjectParent);
						list.add(designStudioProjectParent);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		
		result = new Object[list.size()];
		list.toArray(result);
		
		return result;
	}

	private Object createProjectParent(IProject project) {
		Object result = null;
		try {
			if(project.getNature(ProjectNature.NATURE_ID) != null) {
				result = new ProjectNode(project);
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
		else if(IProjectItemNode.class.isInstance(element)) {
			parent = ((IProjectItemNode)element).getParent(element);
		}
		
		return parent;
	}

	@Override
	public boolean hasChildren(Object element) {
		boolean hasChildren = false;
		
		if (IWorkspaceRoot.class.isInstance(element)) {
            hasChildren = ((IWorkspaceRoot)element).getProjects().length > 0;
        } else if (IProjectItemNode.class.isInstance(element)) {
            hasChildren = ((IProjectItemNode)element).hasChildren(element);
        }
         
        return hasChildren;
	}

	@Override
    public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);        
    }
	
	@Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		_viewer = viewer; 
    }

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		TreeViewer viewer = (TreeViewer)_viewer;
		TreePath[] treePaths = viewer.getExpandedTreePaths();
		viewer.refresh();
		viewer.setExpandedTreePaths(treePaths);		
	}

}
