package com.armin.sap.ds.builder.wizard.pages;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import com.armin.sap.ds.builder.common.IHelper;


public class ComponentNewFileCreationPage extends WizardNewFileCreationPage implements IWizardDetailsPage {

	public ComponentNewFileCreationPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
		// TODO Auto-generated constructor stub
	}
	
	public ComponentNewFileCreationPage(IStructuredSelection selection) {
		super("Component Details", selection);
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
