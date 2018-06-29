package com.armin.sap.ds.builder.wizard.extension;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.armin.sap.ds.builder.controls.ExtensionControl;
import com.armin.sap.ds.builder.controls.IExtensionChangedListener;
import com.armin.sap.ds.builder.navigator.tree.ExtensionCollectionNode;
import com.armin.sap.ds.builder.project.models.Extension;
import com.armin.sap.ds.builder.project.models.IModel;
import com.armin.sap.ds.builder.wizard.IWizardDetailsPage;


public class ExtensionCreationPage extends WizardPage implements IWizardDetailsPage {

	private IStructuredSelection _selection;
	private Extension _model;
	private ExtensionCollectionNode _parentTreeNode;
	private ExtensionControl extensionCtl;
	
	public ExtensionCreationPage(String pageName, IStructuredSelection selection) {
		super(pageName);
		setPageComplete(false);
		_selection = selection;
		_model = new Extension();
	}
	
	public ExtensionCreationPage(IStructuredSelection selection) {
		super("Extension Details");
		setPageComplete(false);
		_selection = selection;
		_model = new Extension();
	}
	
	@Override
	public boolean validatePage() {
		boolean isValid = extensionCtl.validateControl();
		setPageComplete(isValid);
		return isValid;
	}

	@Override
	public IModel getModel() {		
		return _model;
	}

	@Override
	public void createControl(Composite parent) {
		Composite topLevel = new Composite(parent, SWT.NONE);
		topLevel.setLayout(new GridLayout());
		topLevel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
				| GridData.HORIZONTAL_ALIGN_FILL));
		topLevel.setFont(parent.getFont());
		
		setErrorMessage(null);
		setMessage(null);
		setControl(topLevel);
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
				_parentTreeNode = (ExtensionCollectionNode)selectedObj;								
			}
		}
		
	}

	private void createCompositeChildControls() {
		Composite area = (Composite)this.getControl();
		extensionCtl = new ExtensionControl(area, SWT.NONE, _model);
		extensionCtl.addExtensionChangedListener(new IExtensionChangedListener() {
			
			@Override
			public void OnExtensionChanged(boolean isValid) {
				setPageComplete(isValid);
			}
		});
	
	}

	public ExtensionCollectionNode getParentExtensionCollectionTreeNode() {
		return _parentTreeNode;
	}

}
