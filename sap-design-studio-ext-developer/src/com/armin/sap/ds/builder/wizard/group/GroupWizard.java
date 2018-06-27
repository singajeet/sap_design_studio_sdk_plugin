package com.armin.sap.ds.builder.wizard.group;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.ide.IDE;

import com.armin.sap.ds.builder.wizard.IWizardDetailsPage;
import com.armin.sap.ds.builder.wizard.extension.ExtensionCreationPage;

public class GroupWizard extends Wizard implements INewWizard {

	private IWorkbench _workbench;
	private IStructuredSelection _selection;
	private IWizardDetailsPage _pageOne;
	
	public GroupWizard() {
		setWindowTitle("New Group");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		_workbench = workbench;
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
		boolean result = false;
		//IFile file = _pageOne.createNewFile();
		
//		if(file != null)
//			result = true;
			
		if(result) {
			try {
				//IDE.openEditor(_workbench.getActiveWorkbenchWindow().getActivePage(), file);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
