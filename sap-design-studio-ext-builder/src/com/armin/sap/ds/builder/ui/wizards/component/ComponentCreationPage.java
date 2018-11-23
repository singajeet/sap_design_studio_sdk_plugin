package com.armin.sap.ds.builder.ui.wizards.component;

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
import org.eclipse.wb.swt.ResourceManager;

import com.armin.sap.ds.builder.api.models.domain.Component;
import com.armin.sap.ds.builder.api.models.domain.ComponentExtended;
import com.armin.sap.ds.builder.api.models.domain.IModel;
import com.armin.sap.ds.builder.controls.ComponentFormControl;
import com.armin.sap.ds.builder.controls.IComponentChangedListener;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ExtensionNode;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.GroupNode;
import com.armin.sap.ds.builder.ui.wizards.IWizardDetailsPage;


public class ComponentCreationPage extends WizardPage implements IWizardDetailsPage {

	//Id of selected Extension Model is also considered as package name for child component models
	private String _componentPackage;
	private IStructuredSelection _selection;
		
	private Composite container;
	private Text txtPackage;
	private Text txtDescription;
	private Combo comboExtends;		
	private ComponentFormControl componentCtl;
	
	public String COMPONENT_ZTL_FILE_NAME = "contribution.ztl";
	@SuppressWarnings("unused")
	private String INIT_CLASS_TO_EXTEND = "Component";
	public String EXTENDS_KEYWORD = " extends ";	
	
	private Component _model;
	private GroupNode _parentTreeNode;
	private Composite topLevel;
	private Composite composite_top;
	private Composite composite_bottom;
	
	public ComponentCreationPage(String pageName, IStructuredSelection selection) {
		super(pageName);
		setDescription("Provide details below for the default component");
		setTitle("Component Details");
		setPageComplete(false);
		_model = new ComponentExtended();
	}
	
	/**
	 * @wbp.parser.constructor
	 */
	public ComponentCreationPage(IStructuredSelection selection) {
		super("Component Details");
		setImageDescriptor(ResourceManager.getImageDescriptor("/home/armin/eclipse-workspace/sap-design-studio-ext-builder/images/component_64x64.png"));
		setDescription("Provide details below for the default component");
		setTitle("Component Details");
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
		topLevel = new Composite(parent, SWT.NONE);
		topLevel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true)); //GridData.VERTICAL_ALIGN_FILL
				//| GridData.HORIZONTAL_ALIGN_FILL));
		topLevel.setFont(parent.getFont());
		
		setErrorMessage(null);
		setMessage(null);
		setControl(topLevel);
		createCompositeChildControls();
		initialize();
	}
	
	private void createCompositeChildControls() {
		Composite area = (Composite) this.getControl();
		topLevel.setLayout(new GridLayout(1, false));
		
		container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		container.setLayout(new GridLayout(1, false));
		
		composite_top = new Composite(container, SWT.NONE);
		composite_top.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		composite_top.setLayout(new GridLayout(2, false));
		
		//--- Package Name Row
		Label lblPackage = new Label(composite_top, SWT.NONE);
		lblPackage.setText("Component Package Name:");
		txtPackage = new Text(composite_top, SWT.NONE);
		txtPackage.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtPackage.setEnabled(false); 		
		
		//--- Super Class Row
		Label lblExtends = new Label(composite_top, SWT.NONE);
		lblExtends.setText("Component Inherit From:");
		comboExtends = new Combo(composite_top, SWT.READ_ONLY | SWT.BORDER);
		comboExtends.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		String parentClassStr = Settings.store().get(Settings.FOR.COMPONENT_PARENT_CLASSES);
		String[] parentClasses = parentClassStr.split(";");
		for(String parent : parentClasses) {
			comboExtends.add(parent);
		}		
		comboExtends.select(0); //Select component by default
		((ComponentExtended)_model).setClassToExtend(comboExtends.getItem(0));
		comboExtends.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				int index = comboExtends.getSelectionIndex();
				((ComponentExtended)_model).setClassToExtend(comboExtends.getItem(index));
			}
		});
		//--- Description Row
		Label lblDescription = new Label(composite_top, SWT.NONE);
		lblDescription.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		lblDescription.setText("Description");
		txtDescription = new Text(composite_top, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.MULTI);
		GridData gd_txtDescription = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd_txtDescription.heightHint = 80;
		gd_txtDescription.minimumHeight = 80;
		txtDescription.setLayoutData(gd_txtDescription);
		txtDescription.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				((ComponentExtended)_model).setDescription(txtDescription.getText());
			}
		});
		
		composite_bottom = new Composite(container, SWT.NONE);
		composite_bottom.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		composite_bottom.setLayout(new GridLayout(1, false));
		
		componentCtl = new ComponentFormControl(composite_bottom, SWT.NONE, _model);
		componentCtl.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayout gl_componentCtl = new GridLayout(1, false);
		gl_componentCtl.verticalSpacing = 0;
		gl_componentCtl.marginWidth = 0;
		gl_componentCtl.marginHeight = 0;
		gl_componentCtl.horizontalSpacing = 0;
		componentCtl.setLayout(gl_componentCtl);
		
		componentCtl.addComponentChangedListener(new IComponentChangedListener() {
			@Override
			public void OnComponentChanged(boolean isValid) {	
				_model = componentCtl.getModel();
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
			if(selectedObj instanceof GroupNode) {
				_componentPackage = ((ExtensionNode)((GroupNode)selectedObj).getParent(this)).getExtension().getId();
				_parentTreeNode = (GroupNode)selectedObj;
				txtPackage.setText(_componentPackage);		
				if(componentCtl != null) {
					componentCtl.setSelectedGroup(_parentTreeNode.getModel().getId());
				}
			}
		}
	}
	
	public GroupNode getParentExtensionTreeNode() {
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
