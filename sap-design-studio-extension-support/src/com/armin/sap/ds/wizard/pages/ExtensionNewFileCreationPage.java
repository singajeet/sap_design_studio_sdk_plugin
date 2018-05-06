package com.armin.sap.ds.wizard.pages;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import com.armin.sap.ds.support.IHelper;

public class ExtensionNewFileCreationPage extends WizardNewFileCreationPage implements IWizardDetailsPage {

	public ExtensionNewFileCreationPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
		// TODO Auto-generated constructor stub
	}
	
	public ExtensionNewFileCreationPage(IStructuredSelection selection) {
		super("Extension Details", selection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IHelper getDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean validatePage() {
		return false;
	}

}
