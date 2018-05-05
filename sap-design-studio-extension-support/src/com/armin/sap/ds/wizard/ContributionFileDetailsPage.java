package com.armin.sap.ds.wizard;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import com.armin.sap.ds.support.ContributionXMLHelper;

public class ContributionFileDetailsPage extends WizardPage implements IWizardDetailsPage {

	private ContributionXMLHelper _helper;

	public ContributionFileDetailsPage() {
		super("Contribution File Details");
		setPageComplete(false);
		_helper = new ContributionXMLHelper();
	}

	public ContributionFileDetailsPage(String pageName) {
		super(pageName);
		setPageComplete(false);
		_helper = new ContributionXMLHelper();
	}

	public ContributionFileDetailsPage(String pageName, String title, ImageDescriptor titleImage) {
		super(pageName, title, titleImage);
		setPageComplete(false);
		_helper = new ContributionXMLHelper();
	}

	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);
		Composite topLevel = new Composite(parent, SWT.NONE);
		topLevel.setLayout(new GridLayout());
		topLevel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
				| GridData.HORIZONTAL_ALIGN_FILL));
		topLevel.setFont(parent.getFont());
		PlatformUI.getWorkbench().getHelpSystem().setHelp(topLevel,
				"com.armin.sap.ds.sdk.help." + "new_file_wizard_page_context"); //$NON-NLS-1$
		
		setErrorMessage(null);
		setMessage(null);
		setControl(topLevel);
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
