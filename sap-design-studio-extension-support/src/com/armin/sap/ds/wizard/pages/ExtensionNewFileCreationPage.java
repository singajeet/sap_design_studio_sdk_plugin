package com.armin.sap.ds.wizard.pages;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class ExtensionNewFileCreationPage extends WizardNewFileCreationPage {

	public ExtensionNewFileCreationPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
		// TODO Auto-generated constructor stub
	}
	
	public ExtensionNewFileCreationPage(IStructuredSelection selection) {
		super("Extension Details", selection);
		// TODO Auto-generated constructor stub
	}

}
