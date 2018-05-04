package com.armin.sap.ds.wizard;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;

import com.armin.sap.ds.support.ContributionXMLHelper;

public class ContributionFileDetailsPage extends WizardPage implements IWizardDetailsPage {

	private ContributionXMLHelper _helper;

	public ContributionFileDetailsPage() {
		super("Contribution File Details");
		_helper = new ContributionXMLHelper();
	}

	public ContributionFileDetailsPage(String pageName) {
		super(pageName);
		_helper = new ContributionXMLHelper();
	}

	public ContributionFileDetailsPage(String pageName, String title, ImageDescriptor titleImage) {
		super(pageName, title, titleImage);

		_helper = new ContributionXMLHelper();
	}

	@Override
	public void createControl(Composite parent) {
		_helper.createControl(this);
	}

	public ContributionXMLHelper getDetails() {
		return _helper;
	}

	@Override
	public boolean validatePage() {
		// TODO Auto-generated method stub
		if (_helper.getId() != null && _helper.getName() != null && _helper.getVendor() != null
				&& _helper.getVersion() != null) {
			return !_helper.getId().isEmpty() && !_helper.getName().isEmpty()
					&& !_helper.getVendor().isEmpty()
					&& !_helper.getVersion().isEmpty();
		} else {
			return false;
		}
	}

}
