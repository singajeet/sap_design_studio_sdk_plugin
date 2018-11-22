package com.armin.sap.ds.builder.ui.wizards;

import org.eclipse.jface.wizard.IWizardPage;

import com.armin.sap.ds.builder.api.models.domain.IModel;


public interface IWizardDetailsPage extends IWizardPage {
	boolean validatePage();
	void setPageComplete(boolean status);
	IModel getModel();
}
