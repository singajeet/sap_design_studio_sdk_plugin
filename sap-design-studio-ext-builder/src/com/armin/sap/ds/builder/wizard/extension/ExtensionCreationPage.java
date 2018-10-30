package com.armin.sap.ds.builder.wizard.extension;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.armin.sap.ds.builder.api.models.Extension;
import com.armin.sap.ds.builder.api.models.IModel;
import com.armin.sap.ds.builder.controls.ExtensionFormControl;
import com.armin.sap.ds.builder.controls.IExtensionChangedListener;
import com.armin.sap.ds.builder.navigator.tree.ExtensionCollectionNode;
import com.armin.sap.ds.builder.wizard.IWizardDetailsPage;


public class ExtensionCreationPage extends WizardPage implements IWizardDetailsPage {

	private Extension _model;
	private ExtensionFormControl extensionFormControl;
	private Composite topLevel;
	private IStructuredSelection _selection;
	
	public ExtensionCreationPage(String pageName, IStructuredSelection selection) {
		super(pageName);
		setDescription("Creates an additional extension under selected extension collection");
		setTitle("Extension Details");
		setPageComplete(false);
		_model = new Extension();
	}
	
	/**
	 * @wbp.parser.constructor
	 */
	public ExtensionCreationPage(IStructuredSelection selection) {
		super("Extension Details");
		setDescription("Creates an additional extension under selected extension collection");
		setTitle("Extension Details");
		setPageComplete(false);
		_model = new Extension();
	}
	
	@Override
	public boolean validatePage() {
		boolean isValid = extensionFormControl.validateControl();
		setPageComplete(isValid);
		return isValid;
	}

	@Override
	public IModel getModel() {		
		return _model;
	}

	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);
		topLevel = new Composite(parent, SWT.NONE);		
		topLevel.setFont(parent.getFont());
		
		setErrorMessage(null);
		setMessage(null);
		setControl(topLevel);
		
		GridData topLevelLayoutData = new GridData();
		topLevelLayoutData.horizontalAlignment = GridData.FILL_HORIZONTAL;
		//topLevelLayoutData.verticalAlignment = GridData.FILL_VERTICAL;
		topLevel.setLayoutData(topLevelLayoutData);
		topLevel.setLayout(new GridLayout(1, false));
		
		createCompositeChildControls();
		initialize();		
	}
	
	private void initialize() {
		if(_selection != null && _selection.isEmpty() == false 
				&& _selection instanceof IStructuredSelection ) {
			if(_selection.size() > 1)
				return;
			if(_selection.size() <= 0)
				return;
			Object selectedObj = _selection.getFirstElement();
			if(selectedObj instanceof ExtensionCollectionNode) {								
			}
		}
		
	}

	private void createCompositeChildControls() {
		if(_model == null) {
			extensionFormControl = new ExtensionFormControl(topLevel, SWT.NONE);		
			extensionFormControl.setLayout(new GridLayout(1, false));
			extensionFormControl.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 2));
			
			extensionFormControl.addExtensionChangedListener(new IExtensionChangedListener() {
				
				@Override
				public void OnExtensionChanged(boolean isValid) {
					setPageComplete(isValid);
					_model = extensionFormControl.getModel();
				}
			});
		} else {
			extensionFormControl = new ExtensionFormControl(topLevel, SWT.NONE, _model);		
			extensionFormControl.setLayout(new GridLayout(1, false));
			extensionFormControl.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 2));
			
			extensionFormControl.addExtensionChangedListener(new IExtensionChangedListener() {
				
				@Override
				public void OnExtensionChanged(boolean isValid) {
					setPageComplete(isValid);
				}
			});
		}
	}

}
