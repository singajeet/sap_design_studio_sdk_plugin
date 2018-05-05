package com.armin.sap.ds.wizard.pages.contribution;

import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import com.armin.sap.ds.support.ContributionXMLHelper;
import com.armin.sap.ds.wizard.IWizardDetailsPage;

public class ContributionNewFileCreationPage extends WizardNewFileCreationPage implements IWizardDetailsPage {

	private ContributionXMLHelper _helper;
	
	public ContributionNewFileCreationPage(IStructuredSelection selection) {
		super("SAP Design Studio Contribution File", selection);
		
		setTitle("Contribution File Details");
		setDescription("Create a contribution file for SAP Design Studio Extension");
		setFileName("contribution");
		setFileExtension("xml");
		
		setAllowExistingResources(false);
		
		_helper = new ContributionXMLHelper();
		
	}
	
	public ContributionNewFileCreationPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected InputStream getInitialContents() {
		return _helper.getContent();
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		_helper.createControl(this);
	}

	@Override
	public boolean validatePage() {
		// TODO Auto-generated method stub
		if(_helper.getId() != null && _helper.getName() != null && 
				_helper.getVendor() != null && _helper.getVersion() != null) {
		return super.validatePage() && !_helper.getId().isEmpty() 
				&& !_helper.getName().isEmpty() && !_helper.getVendor().isEmpty()
				&& !_helper.getVersion().isEmpty();
		} else {
			return false;
		}
	}
	

}
