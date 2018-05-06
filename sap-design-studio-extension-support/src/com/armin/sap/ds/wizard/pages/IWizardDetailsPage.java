package com.armin.sap.ds.wizard.pages;

import org.eclipse.jface.wizard.IWizardPage;

public interface IWizardDetailsPage extends IWizardPage {
	boolean validatePage();
	void setPageComplete(boolean status);
}
