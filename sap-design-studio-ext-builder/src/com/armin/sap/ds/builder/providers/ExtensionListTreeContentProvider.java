package com.armin.sap.ds.builder.providers;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;

import com.armin.sap.ds.builder.navigator.tree.ComponentNode;
import com.armin.sap.ds.builder.navigator.tree.ExtensionCollectionNode;
import com.armin.sap.ds.builder.navigator.tree.ExtensionNode;
import com.armin.sap.ds.builder.navigator.tree.IProjectItemNode;

public class ExtensionListTreeContentProvider implements ITreeContentProvider, IResourceChangeListener {
	
	private static final Object[] NO_CHILDREN = {};
    Viewer _viewer;
	
	public ExtensionListTreeContentProvider() {	
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
	}
	
	
	
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		_viewer = viewer;
	}
	
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
	}
	
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}
	
	public Object[] getChildren(Object parentElement) {
		Object[] children = null;
		
		if((ExtensionCollectionNode.class.isInstance(parentElement)) || 
				(ExtensionNode.class.isInstance(parentElement))) {
        	children = ((IProjectItemNode)parentElement).getChildren(parentElement);
        } 
        else {
            children = NO_CHILDREN;
        }
		
		return children;
	}
	
	public Object getParent(Object element) {
		Object parent = null;
		if((ExtensionNode.class.isInstance(element)) || 
				(ComponentNode.class.isInstance(element))) {
			parent = ((IProjectItemNode)element).getParent(element);
		}
		
		return parent;
	}
	
	public boolean hasChildren(Object element) {
		boolean hasChildren = false;
		
		if ((ExtensionCollectionNode.class.isInstance(element)) || 
				(ExtensionNode.class.isInstance(element))) {
            hasChildren = ((IProjectItemNode)element).hasChildren(element);
        }
         
        return hasChildren;
	}
	
	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		WorkspaceJob job = new WorkspaceJob("Refresh extensions tree") {
			
			public IStatus runInWorkspace(IProgressMonitor monitor) {
				
				try {
					Display.getDefault().asyncExec(new Runnable() {
						public void run() {
							TreeViewer viewer = (TreeViewer)_viewer;
							TreePath[] treePaths = viewer.getExpandedTreePaths();
							viewer.refresh();
							viewer.setExpandedTreePaths(treePaths);	
						}
					});
					return Status.OK_STATUS;
				}catch(Exception e) {
					e.printStackTrace();
					MessageDialog.openError(_viewer.getControl().getShell(), "Error", e.getMessage());
				}
				return Status.CANCEL_STATUS;
			}
		};
		
		job.setRule(event.getResource());
		job.schedule();
	}
}