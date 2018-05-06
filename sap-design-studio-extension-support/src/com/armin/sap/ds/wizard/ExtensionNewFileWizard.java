package com.armin.sap.ds.wizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;

import com.armin.sap.ds.wizard.pages.ExtensionNewFileCreationPage;

public class ExtensionNewFileWizard extends Wizard implements INewWizard {

	private IWorkbench _workbench;
	private IStructuredSelection _selection;
	private WizardNewFileCreationPage _pageOne;
	
	public ExtensionNewFileWizard() {
		setWindowTitle("New Extension File");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		_workbench = workbench;
	    _selection = selection;
	}
	
	@Override
	public void addPages() {		
		super.addPages();
		
		_pageOne = new ExtensionNewFileCreationPage(_selection);
		addPage(_pageOne);
	}

	@Override
	public boolean performFinish() {
		boolean result = false;
		IFile file = _pageOne.createNewFile();
		
		if(file != null)
			result = true;
			
		if(result) {
			try {
				IDE.openEditor(_workbench.getActiveWorkbenchWindow().getActivePage(), file);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
