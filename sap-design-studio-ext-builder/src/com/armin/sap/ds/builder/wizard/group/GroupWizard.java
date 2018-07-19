package com.armin.sap.ds.builder.wizard.group;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import com.armin.sap.ds.builder.api.models.Group;
import com.armin.sap.ds.builder.api.models.IModel;
import com.armin.sap.ds.builder.navigator.tree.ExtensionNode;
import com.armin.sap.ds.builder.navigator.tree.GroupNode;
import com.armin.sap.ds.builder.wizard.IWizardDetailsPage;

public class GroupWizard extends Wizard implements INewWizard {

	private IStructuredSelection _selection;
	private IWizardDetailsPage _pageOne;
	
	public GroupWizard() {
		setWindowTitle("New Group");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		_selection = selection;
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
		IRunnableWithProgress op = new IRunnableWithProgress() {
			@Override
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(monitor);
				}catch(CoreException e) {
					throw new InvocationTargetException(e);
				}finally {
					monitor.done();
				}				
			}			
		};
		
		try {
			getContainer().run(true, true, op);
		}catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		
		return true;
	}
	
	private void doFinish(IProgressMonitor monitor) throws CoreException {
		monitor.beginTask("Creating group - " + ((GroupCreationPage)_pageOne).getModel().getId(), 2);
		
		IModel group = ((GroupCreationPage)_pageOne).getModel();
		ExtensionNode parentNode = ((GroupCreationPage)_pageOne).getParentExtensionTreeNode();
		
		monitor.worked(1);
		monitor.setTaskName("Adding group [" + group.getId() + "] to extension [" + parentNode.getModel().getId() + "]...");
		
		try {
			//Update the extension node in visual tree to reflect new group node
			GroupNode groupItem = new GroupNode(parentNode.getProject(), (Group)group, parentNode);
			parentNode.getExtension().getGroup().add((Group)group);
			parentNode.addItem(groupItem);
			
			parentNode.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
		}catch(Exception e) {
			e.printStackTrace();		
		}
		
		monitor.worked(1);
	}

}
