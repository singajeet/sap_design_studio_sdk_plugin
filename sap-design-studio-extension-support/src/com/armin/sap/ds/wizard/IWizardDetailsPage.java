package com.armin.sap.ds.wizard;

import org.eclipse.jface.wizard.IWizardPage;

public interface IWizardDetailsPage extends IWizardPage {
	boolean validatePage();
	void setPageComplete(boolean status);
}
