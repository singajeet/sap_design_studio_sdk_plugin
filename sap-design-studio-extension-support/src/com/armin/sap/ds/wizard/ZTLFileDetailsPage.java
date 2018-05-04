package com.armin.sap.ds.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;

import com.armin.sap.ds.support.ContributionZTLModel;

public class ZTLFileDetailsPage extends WizardPage {

	private ContributionZTLModel _model;
	
	protected ZTLFileDetailsPage() {
		super("ZTL File Details");
		// TODO Auto-generated constructor stub
	}
	
	protected ZTLFileDetailsPage(String pageName) {
		super(pageName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub

	}
	
	public ContributionZTLModel getDetails() {
		
		return _model;
	}

	public boolean validatePage() {
		return false;
	}
	
}
