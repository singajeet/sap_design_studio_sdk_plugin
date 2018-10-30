package com.armin.sap.ds.builder.wizard.project;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import com.armin.sap.ds.builder.api.models.Component;
import com.armin.sap.ds.builder.api.models.ComponentExtended;
import com.armin.sap.ds.builder.api.models.IModel;
import com.armin.sap.ds.builder.controls.ComponentFormControl;
import com.armin.sap.ds.builder.controls.IComponentChangedListener;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.shared.ISharedData;
import com.armin.sap.ds.builder.shared.ISharedDataSubscriber;
import com.armin.sap.ds.builder.wizard.IWizardDetailsPage;


public class DesignStudioNewProjectComponentPage extends WizardPage implements IWizardDetailsPage, ISharedDataSubscriber {

	private ISharedData _data;
	private Composite middleSection;
	private Composite topSection;
	private Text txtPackage;
	private Text txtDescription;
	private Combo comboExtends;
	private Button checkCreateComponentFile;	
	private ComponentFormControl componentCtl;
	
	public String COMPONENT_ZTL_FILE_NAME = "contribution.ztl";
	@SuppressWarnings("unused")
	private String INIT_CLASS_TO_EXTEND = "Component";
	public String EXTENDS_KEYWORD = " extends ";	
	
	private Component _model;
	private Composite baseContainer;
	private Composite bottomSection;
	

	/**
	 * @wbp.parser.constructor
	 */
	public DesignStudioNewProjectComponentPage() {
		super("Component Details");
		setDescription("Provide details below for the default component");
		setTitle("Component Details");
		setPageComplete(false);
		_model = new ComponentExtended();
	}
	
	public DesignStudioNewProjectComponentPage(String pageName, ISharedData data) {
		super(pageName);
		setDescription("Provide details below for the default component");
		setTitle("Component Details");
		setPageComplete(false);
		_data = data;		
		_data.registerSubscriber(this);
		_model = new ComponentExtended();
	}
	
	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);
		baseContainer = new Composite(parent, SWT.NONE);
		baseContainer.setLayout(new GridLayout(1, false));
		baseContainer.setFont(parent.getFont());
			
		setErrorMessage(null);
		setMessage(null);
		createCompositeChildControls();
		setControl(baseContainer);
	}
	
	private void createCompositeChildControls() {
		
		//################### START - TOP SECTION ##########################
		topSection = new Composite(baseContainer, SWT.NONE);
		topSection.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		GridLayout topSectionLayout = new GridLayout(1, false);
		topSectionLayout.verticalSpacing = 0;
		topSectionLayout.marginWidth = 0;
		topSectionLayout.marginHeight = 0;
		topSection.setLayout(topSectionLayout);
		
		//--- Checkbox to ask if component file is required or not
		checkCreateComponentFile = new Button(topSection, SWT.CHECK);
		GridData checkBoxGridData = new GridData();
		checkBoxGridData.horizontalAlignment = GridData.FILL;		
		checkCreateComponentFile.setLayoutData(checkBoxGridData);
		checkCreateComponentFile.setText("Create component contribution file (.ztl) for this extension");
		checkCreateComponentFile.setSelection(true);
		checkCreateComponentFile.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent event) {
				if(checkCreateComponentFile.getSelection()) {
					enableControls(true);
				} else {
					enableControls(false);
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent event) {
				
			}
		});
		
		((ComponentExtended)_model).setComponentFileCreationEnabled(true);
		//################## END - TOP SECTION ##############################
		
		//################## START - MIDDLE SECTION #########################
		middleSection = new Composite(baseContainer, SWT.NONE);
		middleSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout middleSectionLayout = new GridLayout(2, false);
		middleSection.setLayout(middleSectionLayout);
		
		//--- Package Name Row
		Label lblPackage = new Label(middleSection, SWT.NONE);
		lblPackage.setText("Component Package Name:");
		txtPackage = new Text(middleSection, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtPackage.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtPackage.setEnabled(false); 
				
		//--- Super Class Row
		Label lblExtends = new Label(middleSection, SWT.NONE);
		lblExtends.setText("Component Inherit From:");
		comboExtends = new Combo(middleSection, SWT.READ_ONLY | SWT.BORDER);
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
		Label lblDescription = new Label(middleSection, SWT.NONE);
		lblDescription.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		lblDescription.setText("Description");
		txtDescription = new Text(middleSection, SWT.MULTI | SWT.BORDER | SWT.WRAP);
		GridData txtDescriptionGridData = new GridData();
		txtDescriptionGridData.verticalAlignment = SWT.FILL;
		txtDescriptionGridData.grabExcessVerticalSpace = true;
		txtDescriptionGridData.horizontalAlignment = SWT.FILL;
		txtDescriptionGridData.grabExcessHorizontalSpace = true;
		//txtDescriptionGridData.verticalAlignment = SWT.FILL;
		//txtDescriptionGridData.grabExcessVerticalSpace = true;
		txtDescriptionGridData.minimumHeight = 100;
		txtDescription.setLayoutData(txtDescriptionGridData);
		txtDescription.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				((ComponentExtended)_model).setDescription(txtDescription.getText());
			}
		});
		
		//################## END - MIDDLE SECTION #########################
		
		//################## START - BOTTOM SECTION #########################
		bottomSection = new Composite(baseContainer, SWT.BORDER);
		bottomSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayout bottomSectionLayout = new GridLayout(1, false);		
		bottomSection.setLayout(bottomSectionLayout);
		componentCtl = new ComponentFormControl(bottomSection, SWT.NONE, _model);
				
		componentCtl.addComponentChangedListener(new IComponentChangedListener() {
			@Override
			public void OnComponentChanged(boolean isValid) {
				_model = componentCtl.getModel();
				setPageComplete(isValid);
			}
		});
	}
	
	/**
	 * A private function to enable or disable wizard components based on the 
	 * parameter passed to this function.
	 * 
	 * @param state		<code>true</code> or <code>false</code> to enable or
	 * 					disable the components
	 */
	private void enableControls(boolean state) {
		middleSection.setVisible(state);
		bottomSection.setVisible(state);
		((ComponentExtended)_model).setComponentFileCreationEnabled(state);
	}
	
	@Override
	public void onSharedDataChanged(String key, Object value) {
		if(key.equals("packageName")) {
			txtPackage.setText((String)value);		
			((ComponentExtended)_model).setPackageName((String)value);
		}
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
