package com.armin.sap.ds.builder.wizard.project;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;

import com.armin.sap.ds.builder.controls.ExtensionControl;
import com.armin.sap.ds.builder.project.models.Extension;
import com.armin.sap.ds.builder.shared.ISharedData;
import com.armin.sap.ds.builder.wizard.IWizardDetailsPage;


public class DesignStudioNewProjectExtensionPage extends WizardPage implements IWizardDetailsPage {

	public String EXTENSION_XML_FILE_NAME = "contribution.xml";
	private ISharedData _data;
	private Extension _model;
	private ExtensionControl extensionCtl;

	public DesignStudioNewProjectExtensionPage() {
		super("Extension Details");
		setPageComplete(false);
		_model = new Extension();
	}

	public DesignStudioNewProjectExtensionPage(String pageName, ISharedData data) {
		super(pageName);
		setPageComplete(false);
		_data = data;
		_model = new Extension();
	}

	public DesignStudioNewProjectExtensionPage(String pageName, String title, ImageDescriptor titleImage) {
		super(pageName, title, titleImage);
		setPageComplete(false);
		_model = new Extension();
	}
	
	public Extension getModel() {
		return _model;
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
		createCompositeChildControls();
	}
	
	private void createCompositeChildControls() {
		Composite area = (Composite)this.getControl();
		
		if(_model == null) {
			extensionCtl = new ExtensionControl(area, SWT.NONE);
			if(_data != null) {
				extensionCtl.setExtensionId((String)_data.getData("packageName"));
			}
			_model = extensionCtl.getModel();
		} else {
			extensionCtl = new ExtensionControl(area, SWT.NONE, _model);
			if(_data != null) {
				extensionCtl.setExtensionId((String)_data.getData("packageName"));
			}
		}
	}

	@Override
	public boolean validatePage() {
		return extensionCtl.validateControl();
	}

}
