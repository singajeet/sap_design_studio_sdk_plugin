package com.armin.sap.ds.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;

import com.armin.sap.ds.support.ContributionZTLHelper;

public class ZTLFileDetailsPage extends WizardPage implements IWizardDetailsPage {

	private ContributionZTLHelper _helper;
	
	protected ZTLFileDetailsPage() {
		super("Component Details");
		setPageComplete(false);
		_helper = new ContributionZTLHelper();
	}
	
	protected ZTLFileDetailsPage(String pageName) {
		super(pageName);
		setPageComplete(false);
		_helper = new ContributionZTLHelper();
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
