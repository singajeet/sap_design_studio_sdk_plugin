package com.armin.sap.ds.builder.wizard.extension;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import com.armin.sap.ds.builder.common.IHelper;
import com.armin.sap.ds.builder.project.models.IModel;
import com.armin.sap.ds.builder.wizard.IWizardDetailsPage;


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
	public boolean validatePage() {
		return false;
	}

	@Override
	public IModel getModel() {
		// TODO Auto-generated method stub
		return null;
	}

}
