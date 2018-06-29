package com.armin.sap.ds.builder.wizard.component;

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

import com.armin.sap.ds.builder.navigator.tree.ComponentNode;
import com.armin.sap.ds.builder.navigator.tree.ExtensionNode;
import com.armin.sap.ds.builder.project.models.Component;
import com.armin.sap.ds.builder.project.models.IModel;


public class ComponentWizard extends Wizard implements INewWizard {

	private IStructuredSelection _selection;
	private WizardPage _pageOne;	
	
	public ComponentWizard() {
		setWindowTitle("New Component");
		setNeedsProgressMonitor(true);
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
		
		_pageOne = new ComponentCreationPage(_selection);
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
		monitor.beginTask("Creating component - " + ((ComponentCreationPage)_pageOne).getModel().getId(), 2);
		
		IModel component = ((ComponentCreationPage)_pageOne).getModel();		
		ExtensionNode parentNode = ((ComponentCreationPage)_pageOne).getParentExtensionTreeNode();
		
		monitor.worked(1);
		monitor.setTaskName("Adding component [" + component.getId() + "] to extension [" + parentNode.getExtension().getId() + "]...");
		
		try {
			//maintains the parent-child nodes for contribution.xml file
			parentNode.getExtension().getComponent().add((Component)component);
			
			//Update the extension node in visual tree to reflect new component node 
			ComponentNode node = new ComponentNode(parentNode.getProject(), (Component)component, parentNode);
			parentNode.addItem(node);
		}catch(Exception e) {
			e.printStackTrace();		
		}
		
		monitor.worked(1);
	}

}
