package com.armin.sap.ds.builder.wizard.project;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.armin.sap.ds.builder.api.models.Extension;
import com.armin.sap.ds.builder.controls.ExtensionControl;
import com.armin.sap.ds.builder.controls.IExtensionChangedListener;
import com.armin.sap.ds.builder.shared.ISharedData;
import com.armin.sap.ds.builder.wizard.IWizardDetailsPage;


public class DesignStudioNewProjectExtensionPage extends WizardPage implements IWizardDetailsPage {

	public String EXTENSION_XML_FILE_NAME = "contribution.xml";
	private ISharedData _data;
	private Extension _model;
	private ExtensionControl extensionCtl;
	private Composite topLevel;
	
	/**
	 * @wbp.parser.constructor
	 */
	public DesignStudioNewProjectExtensionPage() {
		super("Extension Details");
		setDescription("Create a SAP Design Studio SDK Extension");
		setTitle("Extension Details");
		setPageComplete(false);
		_model = new Extension();
	}

	public DesignStudioNewProjectExtensionPage(String pageName, ISharedData data) {
		super(pageName);
		setDescription("Create a SAP Design Studio SDK Extension");
		setTitle("Extension Details");
		setPageComplete(false);
		_data = data;
		_model = new Extension();
	}

	public DesignStudioNewProjectExtensionPage(String pageName, String title, ImageDescriptor titleImage) {
		super(pageName, title, titleImage);
		setDescription("Create a SAP Design Studio SDK Extension");
		setTitle("Extension Details");
		setPageComplete(false);
		_model = new Extension();
	}
	
	public Extension getModel() {
		return _model;
	}

	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);
		topLevel = new Composite(parent, SWT.NONE);		
		topLevel.setFont(parent.getFont());
//		PlatformUI.getWorkbench().getHelpSystem().setHelp(topLevel,
//				"com.armin.sap.ds.sdk.help." + "new_file_wizard_page_context"); //$NON-NLS-1$
		
		setErrorMessage(null);
		setMessage(null);
		setControl(topLevel);
		GridData topLevelLayoutData = new GridData(SWT.FILL, SWT.FILL, true, false);
		
		topLevel.setLayoutData(topLevelLayoutData);
		topLevel.setLayout(new GridLayout(1, false));
		createCompositeChildControls();
	}
	
	private void createCompositeChildControls() {
		if(_model == null) {
			extensionCtl = new ExtensionControl(topLevel, SWT.NONE);
			extensionCtl.addExtensionChangedListener(new IExtensionChangedListener() {
				
				@Override
				public void OnExtensionChanged(boolean isValid) {					
					if(_data != null) {
						extensionCtl.setSharedData(_data);
					}
					_model = extensionCtl.getModel();
					setPageComplete(isValid);
				}
			});			
		} else {
			extensionCtl = new ExtensionControl(topLevel, SWT.NONE, _model);
			extensionCtl.addExtensionChangedListener(new IExtensionChangedListener() {
				
				@Override
				public void OnExtensionChanged(boolean isValid) {
					if(_data != null) {
						extensionCtl.setSharedData(_data);
					}
					setPageComplete(isValid);
				}
			});
		}
	}

	@Override
	public boolean validatePage() {
		boolean isValid = extensionCtl.validateControl();
		setPageComplete(isValid);
		return isValid;
	}

}
