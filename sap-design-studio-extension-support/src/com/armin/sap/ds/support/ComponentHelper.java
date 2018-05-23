package com.armin.sap.ds.support;

import org.eclipse.jface.preference.IPreferenceStore;
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

import com.armin.sap.ds.data.shared.ISharedData;
import com.armin.sap.ds.data.shared.ISharedDataSubscriber;
import com.armin.sap.ds.ext.plugin.Activator;
import com.armin.sap.ds.ext.plugin.controls.ComponentControlFactory;
import com.armin.sap.ds.ext.plugin.preferences.Settings;
import com.armin.sap.ds.wizard.pages.IWizardDetailsPage;
import com.armin.sap.ds.xml.Component;
import com.armin.sap.ds.xml.UI5Mode;

public class ComponentHelper implements IHelper, ISharedDataSubscriber {

	public String COMPONENT_ZTL_FILE_NAME = "contribution.ztl";
	@SuppressWarnings("unused")
	private String INIT_CLASS_TO_EXTEND = "Component";
	public String EXTENDS_KEYWORD = " extends ";	
	
	private Component _model;
	private ISharedData _data;
	
	public ComponentHelper() {}
	
	public ComponentHelper(ISharedData data) {
		_data = data;
		_data.registerSubscriber(this);
	}
	
	public ComponentHelper(Component model) {
		_model = model;
	}
	
	public ComponentHelper(ISharedData data, Component model) {
		_data = data;
		_model = model;
	}
	
	public Component getModel() {
		return _model;
	}
	
	/**
	 * Title for this component. It will also be used to derive hint for class name
	 */
	public String getTitle() {
		return _model.getTitle();
	}

	/**
	 * The class name of the component. It should follow the Java standards
	 */
	public String getClassName() {
		return _model.getId();
	}
	
	public String getId() {
		return _model.getId();
	}
	
	/**
	 * Tooltip for the current component which will be displayed in 
	 * component toolbox in design studio
	 */
	public String getToolTip() {
		return _model.getTooltip();
	}
	
	/**
	 * Mobile mode for rendering components
	 * Selected by default
	 */
	public boolean getMobileMode() {
		return _model.getModes().contains(UI5Mode.M);
	}
	
	/**
	 * Commons mode for rendering
	 * 
	 */
	public boolean getCommonsMode() {
		return _model.getModes().contains(UI5Mode.COMMONS);
	}
	
	/**
	 * handler type of component i.e., div or data source 
	 */
	public String getHandlerType() {
		return _model.getHandlerType().name();
	}

	/**
	 * mark compoment to have data source feature 
	 */
	public boolean isDataBound() {
		return _model.isDatabound();
	}

	/**
	 * property to hold and upload icon path
	 */
	public String getIconPath() {
		return _model.getIcon();
	}

	/**
	 * Sets whether a component file (.ztl) should be created or not.
	 * By default this is set to true and file will be created
	 */
	private boolean componentFileCreationEnabled = true;
			
	public boolean isComponentFileCreationEnabled() {
		return componentFileCreationEnabled;
	}
	
	private boolean addPropertySheet;
	
	public boolean isAddPropertySheet() {
		return addPropertySheet;
	}

	public String getPropertySheetPath() {
		return _model.getPropertySheetPath();
	}

	public String getGroup() {
		return _model.getGroup();
	}

	private String classToExtend;
	private String description;
	private String packageName;
	
	public String getPackageName() {
		return packageName;
	}
	
	/**
	 * @return the classToExtend
	 */
	public String getClassToExtend() {
		return classToExtend;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	Composite container;
	Composite topContainer;
	private Text txtPackage;
	private Text txtDescription;
	private Combo comboExtends;
	private Button checkCreateComponentFile;	
	
	/**
	 * A private function to enable or disable wizard components based on the 
	 * parameter passed to this function.
	 * 
	 * @param state		<code>true</code> or <code>false</code> to enable or
	 * 					disable the components
	 */
	private void enableControls(boolean state) {
		container.setVisible(state);
		componentFileCreationEnabled = state;
	}
	
	@Override
	public void onSharedDataChanged(String key, Object value) {
		if(key.equals("packageName")) {
			txtPackage.setText((String)value);		
			packageName = (String)value;
		}
	}

	/**
	 * Creates a composite of controls to be displayed on the wizard page
	 * 
	 * @param page		Reference of the page on which the controls should be added
	 * 
	 */
	public void createControl(IWizardDetailsPage page) {
		Composite area = (Composite) page.getControl();
		
		topContainer = new Composite(area, SWT.NONE);
		topContainer.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		GridLayout topLayout = new GridLayout(1, false);
		topContainer.setLayout(topLayout);
		
		//--- Checkbox to ask if component file is required or not
		checkCreateComponentFile = new Button(topContainer, SWT.CHECK);
		GridData checkBoxGridData = new GridData();
		checkBoxGridData.horizontalAlignment = GridData.FILL;
		//checkBoxGridData.horizontalSpan = 2;
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
		
		componentFileCreationEnabled = true;
		
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
		comboExtends.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		comboExtends.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				int index = comboExtends.getSelectionIndex();
				classToExtend = comboExtends.getItem(index);
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
				description = txtDescription.getText();
			}
		});
		
		if(_model == null) {
			ComponentControlFactory.getInstance().createControl("ComponentHelper", container, page);
			_model = ComponentControlFactory.getInstance().getModel("ComponentHelper");
		} else {
			ComponentControlFactory.getInstance().createControl("ComponentHelper", container, _model, page);
		}
	}
	
}
