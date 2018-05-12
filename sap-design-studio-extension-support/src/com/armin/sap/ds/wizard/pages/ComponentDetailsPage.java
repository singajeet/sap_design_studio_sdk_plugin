package com.armin.sap.ds.wizard.pages;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

import com.armin.sap.ds.data.shared.ISharedData;
import com.armin.sap.ds.support.ComponentHelper;

public class ComponentDetailsPage extends WizardPage implements IWizardDetailsPage {

	private ComponentHelper _helper;
	private ISharedData _data;
	
	public ComponentDetailsPage() {
		super("Component Details");
		setPageComplete(false);
		_helper = new ComponentHelper();
	}
	
	public ComponentDetailsPage(String pageName, ISharedData data) {
		super(pageName);
		setPageComplete(false);
		_data = data;
		_helper = new ComponentHelper();
		_data.registerSubscriber(_helper);
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
	
	public ComponentHelper getDetails() {
		
		return _helper;
	}

	@Override
	public boolean validatePage() {
		return _helper.validatePage();
	}	
	
}
