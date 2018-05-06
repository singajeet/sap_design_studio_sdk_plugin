package com.armin.sap.ds.wizard.pages;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class ComponentNewFileCreationPage extends WizardNewFileCreationPage {

	public ComponentNewFileCreationPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
		// TODO Auto-generated constructor stub
	}
	
	public ComponentNewFileCreationPage(IStructuredSelection selection) {
		super("Component Details", selection);
		// TODO Auto-generated constructor stub
	}

}
