package com.armin.sap.ds.builder.providers;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;

import com.armin.sap.ds.builder.navigator.tree.ExtensionCollectionNode;

public class ExtensionCollectionEditorContentProvider implements IStructuredContentProvider, IResourceChangeListener {

	private Viewer _viewer;
    private ExtensionCollectionNode _input;
    
    public ExtensionCollectionEditorContentProvider() {
    	ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
    }
    
    public ExtensionCollectionEditorContentProvider(ExtensionCollectionNode input) {
    	_input = input;
    	ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
    }

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		WorkspaceJob job = new WorkspaceJob("Refresh List...") {
			
			public IStatus runInWorkspace(IProgressMonitor monitor) {
				
				try {
					Display.getDefault().asyncExec(new Runnable() {
						public void run() {
							//ListViewer viewer = (ListViewer)_viewer;
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
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		IStructuredContentProvider.super.inputChanged(viewer, oldInput, newInput);
		_viewer = viewer;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if(_input != null) {
			return _input.getChildren(inputElement);
		}
		
		return null;
	}
}