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

import com.armin.sap.ds.builder.controls.ComponentControl;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.project.models.Component;
import com.armin.sap.ds.builder.project.models.ComponentExtended;
import com.armin.sap.ds.builder.project.models.IModel;
import com.armin.sap.ds.builder.shared.ISharedData;
import com.armin.sap.ds.builder.shared.ISharedDataSubscriber;
import com.armin.sap.ds.builder.wizard.IWizardDetailsPage;


public class DesignStudioNewProjectComponentPage extends WizardPage implements IWizardDetailsPage, ISharedDataSubscriber {

	private ISharedData _data;
	private Composite container;
	private Composite topContainer;
	private Text txtPackage;
	private Text txtDescription;
	private Combo comboExtends;
	private Button checkCreateComponentFile;	
	private ComponentControl componentCtl;
	
	public String COMPONENT_ZTL_FILE_NAME = "contribution.ztl";
	@SuppressWarnings("unused")
	private String INIT_CLASS_TO_EXTEND = "Component";
	public String EXTENDS_KEYWORD = " extends ";	
	
	private Component _model;
	

	public DesignStudioNewProjectComponentPage() {
		super("Component Details");
		setPageComplete(false);
		_model = new ComponentExtended();
	}
	
	public DesignStudioNewProjectComponentPage(String pageName, ISharedData data) {
		super(pageName);
		setPageComplete(false);
		_data = data;		
		_data.registerSubscriber(this);
		_model = new ComponentExtended();
	}
	
	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);
		Composite topLevel = new Composite(parent, SWT.NONE);
		topLevel.setLayout(new GridLayout());
		topLevel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
				| GridData.HORIZONTAL_ALIGN_FILL));
		topLevel.setFont(parent.getFont());
		
		setErrorMessage(null);
		setMessage(null);
		setControl(topLevel);
		createCompositeChildControls();
	}
	
	private void createCompositeChildControls() {
		Composite area = (Composite) this.getControl();
		
		topContainer = new Composite(area, SWT.NONE);
		topContainer.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		GridLayout topLayout = new GridLayout(1, false);
		topContainer.setLayout(topLayout);
		
		//--- Checkbox to ask if component file is required or not
		checkCreateComponentFile = new Button(topContainer, SWT.CHECK);
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
		
		container = new Composite(topContainer, SWT.NONE);
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

	}
	
	/**
	 * A private function to enable or disable wizard components based on the 
	 * parameter passed to this function.
	 * 
	 * @param state		<code>true</code> or <code>false</code> to enable or
	 * 					disable the components
	 */
	private void enableControls(boolean state) {
		container.setVisible(state);
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
		return componentCtl.validateControl();
	}	
	
	@Override
	public IModel getModel() {
		return _model;
	}
}
