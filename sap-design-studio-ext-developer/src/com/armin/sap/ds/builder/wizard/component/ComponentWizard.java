package com.armin.sap.ds.builder.wizard.component;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import com.armin.sap.ds.builder.navigator.tree.ExtensionNode;
import com.armin.sap.ds.builder.project.models.Component;
import com.armin.sap.ds.builder.project.models.IModel;


public class ComponentWizard extends Wizard implements INewWizard {

	private IStructuredSelection _selection;
	private WizardPage _pageOne;	
	
	public ComponentWizard() {
		setWindowTitle("New Component");
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
		IModel component = ((ComponentCreationPage)_pageOne).getModel();		
		ExtensionNode parentNode = ((ComponentCreationPage)_pageOne).getParentExtensionTreeNode();
		
		try {
			parentNode.getExtension().getComponent().add((Component)component);
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}	
		
		return true;
	}

}
