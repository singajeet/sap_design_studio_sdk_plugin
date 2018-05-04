package com.armin.sap.ds.wizard.pages.ztl;

import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import com.armin.sap.ds.support.ContributionZTLHelper;
import com.armin.sap.ds.wizard.IWizardDetailsPage;

public class ZTLNewFileCreationPage extends WizardNewFileCreationPage implements IWizardDetailsPage {

	private ContributionZTLHelper _helper;
	
	public ZTLNewFileCreationPage(IStructuredSelection selection) {
		super("SAP Design Studio ZTL File", selection);
		
		setTitle("ZTL File Details");
		setDescription("Create a ztl file for SAP Design Studio Extension");
		setFileName("contribution");
		setFileExtension("ztl");
		
		setAllowExistingResources(false);
		_helper = new ContributionZTLHelper();
	}
	
	public ZTLNewFileCreationPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
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
		if(_helper.getPackageName() != null && _helper.getClassName() != null 
				&& _helper.getDescription() != null) {
			return super.validatePage() && !_helper.getPackageName().isEmpty() 
					&& !_helper.getClassName().isEmpty() && !_helper.getDescription().isEmpty();
		} else {
			return false;
		}
	}


}
