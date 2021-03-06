package com.armin.sap.ds.builder.ui.wizards.group;

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
import com.armin.sap.ds.builder.models.domain.Group;
import com.armin.sap.ds.builder.models.domain.IModel;
import com.armin.sap.ds.builder.service.IProjectService;
import com.armin.sap.ds.builder.service.ProjectService;
import com.armin.sap.ds.builder.ui.navigation.tree.TreeNodeAccessMode;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ExtensionNode;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.IProjectItemNode;
import com.armin.sap.ds.builder.ui.wizards.IWizardDetailsPage;
import com.armin.sap.ds.builder.ui.wizards.extension.ExtensionCreationPage;

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
		
		WorkspaceJob job = new WorkspaceJob("Create new group") {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) {
				try {
					logger.log(new Status(IStatus.OK, this.getClass().getName(), "RunInWorkspace() started"));
					
					try {						
						monitor.beginTask("Creating group - " + group.getId(), 2);
						
						monitor.beginTask("Changing access mode of ExtensionNode to EDIT - " + ((ExtensionCreationPage)_pageOne).getModel().getId(), 2);					
						_parentTreeNode.setAccessMode(TreeNodeAccessMode.EDIT);
						monitor.worked(1);
						
						logger.log(new Status(IStatus.OK, this.getClass().getName(), "Adding group [" + group.getId() + "] to extension [" + parentNode.getModel().getId() + "]"));
						parentNode.addGroup((Group)group);
						
						_parentTreeNode.setAccessMode(TreeNodeAccessMode.READ_ONLY);
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
