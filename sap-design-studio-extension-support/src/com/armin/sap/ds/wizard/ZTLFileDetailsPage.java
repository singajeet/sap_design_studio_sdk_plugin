package com.armin.sap.ds.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;

import com.armin.sap.ds.support.ContributionZTLHelper;

public class ZTLFileDetailsPage extends WizardPage implements IWizardDetailsPage {

	private ContributionZTLHelper _helper;
	
	protected ZTLFileDetailsPage() {
		super("ZTL File Details");
		_helper = new ContributionZTLHelper();
	}
	
	protected ZTLFileDetailsPage(String pageName) {
		super(pageName);
		_helper = new ContributionZTLHelper();
	}

	@Override
	public void createControl(Composite parent) {
		_helper.createControl(this);
	}
	
	public ContributionZTLHelper getDetails() {
		
		return _helper;
	}

	public boolean validatePage() {
		if(_helper.getPackageName() != null && _helper.getClassName() != null 
				&& _helper.getDescription() != null) {
			return !_helper.getPackageName().isEmpty() 
					&& !_helper.getClassName().isEmpty() && !_helper.getDescription().isEmpty();
		} else {
			return false;
		}
	}
	
}
