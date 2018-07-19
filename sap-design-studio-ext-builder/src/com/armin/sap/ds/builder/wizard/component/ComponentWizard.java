package com.armin.sap.ds.builder.wizard.component;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

import com.armin.sap.ds.builder.api.models.IModel;
import com.armin.sap.ds.builder.navigator.tree.ExtensionNode;
import com.armin.sap.ds.builder.service.IProjectService;
import com.armin.sap.ds.builder.service.ProjectService;


public class ComponentWizard extends Wizard implements INewWizard {

	private IStructuredSelection _selection;
	private WizardPage _pageOne;	
	private ExtensionNode _parentTreeNode;
	private IProjectService _projectService;
	
	public ComponentWizard() {
		setWindowTitle("New Component");
		setNeedsProgressMonitor(true);
		_projectService = (IProjectService) PlatformUI.getWorkbench().getService(IProjectService.class);
		if(_projectService == null) {
			_projectService = new ProjectService();
		}
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {	
	    _selection = selection;	    
	    
	    if(_selection != null && _selection.isEmpty() == false 
				&& _selection instanceof IStructuredSelection ) {
			if(_selection.size() > 1)
				return;
			if(_selection.size() <= 0)
				return;
			Object selectedObj = _selection.getFirstElement();
			if(selectedObj instanceof ExtensionNode) {				
				_parentTreeNode = (ExtensionNode)selectedObj;								
			}
		}
	}	
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		super.addPages();
		
		_pageOne = new ComponentCreationPage(_selection);
		addPage(_pageOne);
	}

	@Override
	public boolean performFinish() {
		IModel component = ((ComponentCreationPage)_pageOne).getModel();
		IProject project = _parentTreeNode.getProject();
		
		WorkspaceJob job = new WorkspaceJob("Create component under selected extension") {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) {
				try {
					monitor.beginTask("Creating component - " + ((ComponentCreationPage)_pageOne).getModel().getId(), 2);
					
					_projectService.addNewComponent(component, _parentTreeNode.getExtension(), project);
					
					monitor.worked(1);
					monitor.setTaskName("Adding component [" + component.getId() + "] to extension...");
					
					project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
					
					return Status.OK_STATUS;
				}catch(Exception e) {
					e.printStackTrace();
					MessageDialog.openError(getShell(), "Error", e.getMessage());
				}finally {
					monitor.done();
				}			
				return Status.CANCEL_STATUS;
			}			
		};
		
		job.setRule(project);
		job.schedule();
		
		return true;		
	}
	
}
