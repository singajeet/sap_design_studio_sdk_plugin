package com.armin.sap.ds.builder.wizard;

import org.eclipse.jface.wizard.IWizardPage;

import com.armin.sap.ds.builder.api.models.IModel;


public interface IWizardDetailsPage extends IWizardPage {
	boolean validatePage();
	void setPageComplete(boolean status);
	IModel getModel();
}
