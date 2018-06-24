package com.armin.sap.ds.builder.wizard.pages;

import org.eclipse.jface.wizard.IWizardPage;

import com.armin.sap.ds.builder.common.IHelper;


public interface IWizardDetailsPage extends IWizardPage {
	boolean validatePage();
	void setPageComplete(boolean status);
	IHelper getDetails();
}
