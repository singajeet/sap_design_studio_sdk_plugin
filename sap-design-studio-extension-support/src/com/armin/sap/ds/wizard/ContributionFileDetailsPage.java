package com.armin.sap.ds.wizard;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;

import com.armin.sap.ds.support.ContributionXMLModel;

public class ContributionFileDetailsPage extends WizardPage {

	private ContributionXMLModel _model;
	
	public ContributionFileDetailsPage() {
		super("Contribution File Details");
		// TODO Auto-generated constructor stub
	}
	
	public ContributionFileDetailsPage(String pageName) {
		super(pageName);
		// TODO Auto-generated constructor stub
	}

	public ContributionFileDetailsPage(String pageName, String title, ImageDescriptor titleImage) {
		super(pageName, title, titleImage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub

	}
	
	public ContributionXMLModel getDetails() {
		
		return _model;		
	}

}
