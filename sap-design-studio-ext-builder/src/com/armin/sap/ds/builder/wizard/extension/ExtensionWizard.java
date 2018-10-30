package com.armin.sap.ds.builder.wizard.extension;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.ILog;
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

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.api.models.Extension;
import com.armin.sap.ds.builder.api.models.IModel;
import com.armin.sap.ds.builder.navigator.tree.ExtensionCollectionNode;
import com.armin.sap.ds.builder.navigator.tree.TreeNodeAccessMode;
import com.armin.sap.ds.builder.service.IProjectService;
import com.armin.sap.ds.builder.service.ProjectService;


public class ExtensionWizard extends Wizard implements INewWizard {

	private IStructuredSelection _selection;
	private WizardPage _pageOne;
	private ExtensionCollectionNode _parentTreeNode;
	private IProjectService _projectService;
	private ILog logger;
	
	public ExtensionWizard() {
		logger = Activator.getDefault().getLog();
		logger.log(new Status(IStatus.OK, this.getClass().getName(), "Object created"));
		
		setWindowTitle("New Extension");
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
			if(selectedObj instanceof ExtensionCollectionNode) {				
				_parentTreeNode = (ExtensionCollectionNode)selectedObj;
				logger.log(new Status(IStatus.OK, this.getClass().getName(), "Selected object is of type: ExtensionCollectionNode"));
			}
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		super.addPages();
		
		_pageOne = new ExtensionCreationPage(_selection);
		addPage(_pageOne);
		
		logger.log(new Status(IStatus.OK, this.getClass().getName(), "Page added to wizard: " + _pageOne.getName()));
	}

	@Override
	public boolean performFinish() {
		logger.log(new Status(IStatus.OK, this.getClass().getName(), "PerformFinish() has been started..."));
		IModel extension = ((ExtensionCreationPage)_pageOne).getModel();
		IProject project = _parentTreeNode.getProject();
		
		WorkspaceJob job = new WorkspaceJob("Create a new extension") {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) {
				try {
					logger.log(new Status(IStatus.OK, this.getClass().getName(), "WorkspaceJob has been started"));
					
					monitor.beginTask("Changing access mode of ExtensionCollectionNode to EDIT - " + ((ExtensionCreationPage)_pageOne).getModel().getId(), 2);
					//IModel model = _projectService.addNewExtension(extension, project);
					_parentTreeNode.setAccessMode(TreeNodeAccessMode.EDIT);					
					monitor.worked(1);
					
					
					monitor.setTaskName("Creating Extension [Id: " + extension.getId() + "]...");
					_parentTreeNode.addExtension((Extension)extension);
					logger.log(new Status(IStatus.OK, this.getClass().getName(), "Extension created and added under ExtensionCollectionNode"));
					_parentTreeNode.setAccessMode(TreeNodeAccessMode.READ_ONLY);
					monitor.worked(1);
					
					project.refreshLocal(IResource.DEPTH_INFINITE, monitor);					
					
					logger.log(new Status(IStatus.OK, this.getClass().getName(), "WorkspaceJob is completed!"));
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
		logger.log(new Status(IStatus.OK, this.getClass().getName(), "WorkspaceJob has been scheduled"));
		return true;
	}
	
}
