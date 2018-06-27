package com.armin.sap.ds.builder.wizard.extension;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import com.armin.sap.ds.builder.navigator.tree.ExtensionCollectionNode;
import com.armin.sap.ds.builder.project.models.Extension;
import com.armin.sap.ds.builder.project.models.IModel;


public class ExtensionWizard extends Wizard implements INewWizard {

	private IStructuredSelection _selection;
	private WizardPage _pageOne;
	
	public ExtensionWizard() {
		setWindowTitle("New Extension File");
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
		
		_pageOne = new ExtensionCreationPage(_selection);
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
		monitor.beginTask("Creating extension - " + ((ExtensionCreationPage)_pageOne).getModel().getId(), 2);
		
		IModel extension = ((ExtensionCreationPage)_pageOne).getModel();
		ExtensionCollectionNode parentNode = ((ExtensionCreationPage)_pageOne).getParentExtensionCollectionTreeNode();
		
		monitor.worked(1);
		monitor.setTaskName("Adding extension [" + extension.getId() + "] to extension collection [" + parentNode.getName() + "]...");
		
		try {
			//Update the extension collection node in visual tree to reflect new extension node
			parentNode.addExtension((Extension)extension);			
		}catch(Exception e) {
			e.printStackTrace();		
		}
		
		monitor.worked(1);
	}

}
