package com.armin.sap.ds.builder.wizard.pages;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;

import com.armin.sap.ds.builder.common.ExtensionHelper;
import com.armin.sap.ds.builder.shared.ISharedData;


public class ExtensionDetailsPage extends WizardPage implements IWizardDetailsPage {

	private ExtensionHelper _helper;
	ISharedData _data;

	public ExtensionDetailsPage() {
		super("Extension Details");
		setPageComplete(false);
		_helper = new ExtensionHelper();
	}

	public ExtensionDetailsPage(String pageName, ISharedData data) {
		super(pageName);
		setPageComplete(false);
		_data = data;
		_helper = new ExtensionHelper(_data);
	}

	public ExtensionDetailsPage(String pageName, String title, ImageDescriptor titleImage) {
		super(pageName, title, titleImage);
		setPageComplete(false);
		_helper = new ExtensionHelper();
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

	public ExtensionHelper getDetails() {
		return _helper;
	}

	@Override
	public boolean validatePage() {
		// TODO Auto-generated method stub
		if (_helper.getId() != null && _helper.getTitle() != null && _helper.getVendor() != null
				&& _helper.getVersion() != null) {
			return !_helper.getId().isEmpty() && !_helper.getTitle().isEmpty()
					&& !_helper.getVendor().isEmpty()
					&& !_helper.getVersion().isEmpty();
		} else {
			return false;
		}
	}

}
