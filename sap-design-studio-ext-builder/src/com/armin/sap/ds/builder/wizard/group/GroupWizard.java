package com.armin.sap.ds.builder.wizard.group;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.api.models.Group;
import com.armin.sap.ds.builder.api.models.IModel;
import com.armin.sap.ds.builder.navigator.tree.ExtensionNode;
import com.armin.sap.ds.builder.navigator.tree.IProjectItemNode;
import com.armin.sap.ds.builder.service.IProjectService;
import com.armin.sap.ds.builder.service.ProjectService;
import com.armin.sap.ds.builder.wizard.IWizardDetailsPage;

public class GroupWizard extends Wizard implements INewWizard {

	private IStructuredSelection _selection;
	private IWizardDetailsPage _pageOne;
	private IProjectService _projectService;
	private ILog logger;
	private IProjectItemNode _parentTreeNode;
	
	public GroupWizard() {
		setWindowTitle("New Group");
		_projectService = (IProjectService) PlatformUI.getWorkbench().getService(IProjectService.class);
		if(_projectService == null) {
			_projectService = new ProjectService();
		}
		logger = Activator.getDefault().getLog();
		logger.log(new Status(IStatus.OK, this.getClass().getName(), "Object created"));
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		_selection = selection;
		
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Init() started"));
	    
	    if(_selection != null && _selection.isEmpty() == false 
				&& _selection instanceof IStructuredSelection ) {
			if(_selection.size() > 1)
				return;
			if(_selection.size() <= 0)
				return;
			Object selectedObj = _selection.getFirstElement();
			if(selectedObj instanceof ExtensionNode) {				
				_parentTreeNode = (ExtensionNode)selectedObj;							
				logger.log(new Status(IStatus.INFO, this.getClass().getName(), 
						"Selected object is of type: ExtensionNode with ID=" + _parentTreeNode.getName()));
			}
		}
	    logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Init() completed"));
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		super.addPages();
		
		_pageOne = new GroupCreationPage(_selection);
		addPage(_pageOne);
	}

	@Override
	public boolean performFinish() {
		logger.log(new Status(IStatus.OK, this.getClass().getName(), "PerformFinish() started"));
		
		IModel group = ((GroupCreationPage)_pageOne).getModel();
		ExtensionNode parentNode = (ExtensionNode)_parentTreeNode;
		IProject project = parentNode.getProject();
		
		WorkspaceJob job = new WorkspaceJob("Create new group") {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) {
				try {
					logger.log(new Status(IStatus.OK, this.getClass().getName(), "RunInWorkspace() started"));
					
					try {
						IModel groupModel = _pageOne.getModel();
						monitor.beginTask("Creating group - " + group.getId(), 2);
						
						monitor.setTaskName("Adding group [" + group.getId() + "] to extension [" + parentNode.getModel().getId() + "]...");
						_projectService.addNewGroup(groupModel.getId(), parentNode.getModel(), project);
						monitor.worked(1);
						
						logger.log(new Status(IStatus.OK, this.getClass().getName(), "Adding group [" + group.getId() + "] to extension [" + parentNode.getModel().getId() + "]"));
						parentNode.addGroup((Group)group);
						monitor.worked(1);
						
						parentNode.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
						logger.log(new Status(IStatus.OK, this.getClass().getName(), "RunInWorkspace() completed"));
						return Status.OK_STATUS;
					}catch(Exception e) {
						e.printStackTrace();	
						logger.log(new Status(IStatus.OK, this.getClass().getName(), "Error creating group: " + e.getMessage()));
						return Status.CANCEL_STATUS;
					}
				}catch(Exception e) {
					e.printStackTrace();
					logger.log(new Status(IStatus.OK, this.getClass().getName(), "Error creating group: " + e.getMessage()));
					return Status.CANCEL_STATUS;
				}finally {
					monitor.done();
				}				
			}			
		};
		
		job.setRule(parentNode.getProject());
		job.schedule();
		logger.log(new Status(IStatus.OK, this.getClass().getName(), "WorkspaceJob scheduled"));
		logger.log(new Status(IStatus.OK, this.getClass().getName(), "PerformFinish() completed"));
		return true;
	}
}
