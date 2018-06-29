package com.armin.sap.ds.builder.wizard.component;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import com.armin.sap.ds.builder.controls.ComponentControl;
import com.armin.sap.ds.builder.controls.IComponentChangedListener;
import com.armin.sap.ds.builder.navigator.tree.ExtensionNode;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.project.models.Component;
import com.armin.sap.ds.builder.project.models.ComponentExtended;
import com.armin.sap.ds.builder.project.models.IModel;
import com.armin.sap.ds.builder.wizard.IWizardDetailsPage;


public class ComponentCreationPage extends WizardPage implements IWizardDetailsPage {

	//Id of selected Extension Model is also considered as package name for child component models
	private String _componentPackage;
	private IStructuredSelection _selection;
		
	private Composite container;
	private Text txtPackage;
	private Text txtDescription;
	private Combo comboExtends;		
	private ComponentControl componentCtl;
	
	public String COMPONENT_ZTL_FILE_NAME = "contribution.ztl";
	@SuppressWarnings("unused")
	private String INIT_CLASS_TO_EXTEND = "Component";
	public String EXTENDS_KEYWORD = " extends ";	
	
	private Component _model;
	private ExtensionNode _parentTreeNode;
	
	public ComponentCreationPage(String pageName, IStructuredSelection selection) {
		super(pageName);
		setPageComplete(false);
		_model = new ComponentExtended();
	}
	
	public ComponentCreationPage(IStructuredSelection selection) {
		super("Component Details");
		_selection = selection;
		setPageComplete(false);
		_model = new ComponentExtended();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub		
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
	
	private void createCompositeChildControls() {
		Composite area = (Composite) this.getControl();
		
		container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout layout = new GridLayout(2, false);
		container.setLayout(layout);
		
		//--- Package Name Row
		Label lblPackage = new Label(container, SWT.NONE);
		lblPackage.setText("Component Package Name:");
		txtPackage = new Text(container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtPackage.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtPackage.setEnabled(false); 		
		
		//--- Super Class Row
		Label lblExtends = new Label(container, SWT.NONE);
		lblExtends.setText("Component Inherit From:");
		comboExtends = new Combo(container, SWT.READ_ONLY | SWT.BORDER);
		
		String parentClassStr = Settings.store().get(Settings.FOR.COMPONENT_PARENT_CLASSES);
		String[] parentClasses = parentClassStr.split(";");
		for(String parent : parentClasses) {
			comboExtends.add(parent);
		}		
		comboExtends.select(0); //Select component by default
		((ComponentExtended)_model).setClassToExtend(comboExtends.getItem(0));
		comboExtends.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		comboExtends.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				int index = comboExtends.getSelectionIndex();
				((ComponentExtended)_model).setClassToExtend(comboExtends.getItem(index));
			}
		});
		//--- Description Row
		Label lblDescription = new Label(container, SWT.NONE);
		lblDescription.setText("Description");
		txtDescription = new Text(container, SWT.MULTI | SWT.BORDER | SWT.WRAP);
		GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.verticalAlignment = SWT.FILL;
		gridData.grabExcessVerticalSpace = true;
		gridData.minimumHeight = 100;
		txtDescription.setLayoutData(gridData);
		txtDescription.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				((ComponentExtended)_model).setDescription(txtDescription.getText());
			}
		});
		
		if(_model == null) {
			componentCtl = new ComponentControl(container, SWT.NONE);			
			_model = componentCtl.getModel();
		} else {
			componentCtl = new ComponentControl(container, SWT.NONE, _model);
		}
		
		componentCtl.addComponentChangedListener(new IComponentChangedListener() {
			@Override
			public void OnComponentChanged(boolean isValid) {				
					setPageComplete(isValid);
			}			
		});

	}


	private void initialize() {
		if(_selection != null && _selection.isEmpty() == false 
				&& _selection instanceof IStructuredSelection ) {
			if(_selection.size() > 1)
				return;
			if(_selection.size() <= 0)
				return;
			Object selectedObj = _selection.getFirstElement();
			if(selectedObj instanceof ExtensionNode) {
				_componentPackage = ((ExtensionNode)selectedObj).getExtension().getId();
				_parentTreeNode = (ExtensionNode)selectedObj;
				txtPackage.setText(_componentPackage);				
			}
		}
	}
	
	public ExtensionNode getParentExtensionTreeNode() {
		return _parentTreeNode;
	}
	
	public String getPackageName() {
		return _componentPackage;
	}
	
	@Override
	public boolean validatePage() {
		boolean isValid = componentCtl.validateControl();
		setPageComplete(isValid);
		return isValid;
	}

	@Override
	public IModel getModel() {		
		return _model;
	}

}
