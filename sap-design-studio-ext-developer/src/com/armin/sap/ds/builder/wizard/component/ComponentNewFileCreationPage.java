package com.armin.sap.ds.builder.wizard.component;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import com.armin.sap.ds.builder.common.IHelper;
import com.armin.sap.ds.builder.project.models.IModel;
import com.armin.sap.ds.builder.wizard.IWizardDetailsPage;


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
	public boolean validatePage() {
		return false;
	}

	@Override
	public IModel getModel() {
		// TODO Auto-generated method stub
		return null;
	}

}
