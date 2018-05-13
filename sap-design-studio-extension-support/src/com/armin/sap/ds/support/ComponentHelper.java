package com.armin.sap.ds.support;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import com.armin.sap.ds.data.shared.ISharedData;
import com.armin.sap.ds.data.shared.ISharedDataSubscriber;
import com.armin.sap.ds.wizard.pages.IWizardDetailsPage;

public class ComponentHelper implements IHelper, ISharedDataSubscriber {

	public String COMPONENT_ZTL_FILE_NAME = "contribution.ztl";
	
	private String INIT_CLASS_TO_EXTEND = "Component";
	public String EXTENDS_KEYWORD = " extends ";
	
	public ComponentHelper() {
		
	}
	
	public ComponentHelper(ISharedData data) {
	
	}
	
	/**
	 * Title for this component. It will also be used to derive hint for class name
	 */
	private String title;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		txtTitle.setText(title);
	}

	/**
	 * The package name of the component. It should follow the Java standards
	 */
	private String packageName;
	
	public String getPackageName() {
		return packageName;
	}
	
	public void setPackageName(String packageName) {
		this.packageName = packageName;
		txtPackage.setText(packageName);
	}
	
	/**
	 * The class name of the component. It should follow the Java standards
	 */
	private String className;
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
		txtClass.setText(className);
	}
	
	/**
	 * The description of the component
	 */
	private String description;
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
		txtDescription.setText(description);
	}
	
	/**
	 * The class name from which this component should inherit	
	 */
	private String classToExtend = INIT_CLASS_TO_EXTEND;
	
	public String getClassToExtend() {
		return classToExtend;
	}
	
	public void setClassToExtend(String classToExtend) {
		this.classToExtend = classToExtend;
		int index = comboExtends.indexOf(classToExtend);
		if(index >= 0 && index < comboExtends.getItemCount()) {
			comboExtends.select(index);
		}
	}
	
	/**
	 * Tooltip for the current component which will be displayed in 
	 * component toolbox in design studio
	 */
	private String toolTip;
	
	public String getToolTip() {
		return toolTip;
	}
	
	public void setToolTip(String toolTip) {
		this.toolTip = toolTip;
		txtToolTip.setText(toolTip);
	}
	
	/**
	 * Mobile mode for rendering components
	 * Selected by default
	 */
	private boolean mobileMode = true;
	
	public boolean getMobileMode() {
		return mobileMode;
	}
	
	public void setMobileMode(boolean mode) {
		this.mobileMode = mode;
		checkModeMobile.setSelection(true);		
	}
	
	/**
	 * Commons mode for rendering
	 * 
	 */
	private boolean commonsMode = false;
	
	public boolean getCommonsMode() {
		return commonsMode;
	}
	
	public void setCommonsMode(boolean mode) {
		this.commonsMode = mode;
		checkModeCommon.setSelection(true);		
	}
	
	/**
	 * handler type of component i.e., div or data source 
	 */
	private String handlerType = "div";
	
	public String getHandlerType() {
		return handlerType;
	}

	public void setHandlerType(String handlerType) {
		this.handlerType = handlerType;
		int index = comboHandlerType.indexOf(handlerType);
		if(index >= 0 && index < comboHandlerType.getItemCount()) {
			comboHandlerType.select(index);
		}
	}

	/**
	 * mark compoment to have data source feature 
	 */
	private boolean dataBound;
	
	public boolean isDataBound() {
		return dataBound;
	}

	public void setDataBound(boolean dataBound) {
		this.dataBound = dataBound;
		checkDataBound.setSelection(dataBound);
	}

	/**
	 * property to hold and upload icon path
	 */
	private String iconPath = "res/images/component.png";
	
	public String getIconPath() {
		return iconPath;
	}

	public void setIconPath(String iconPath) {
		this.iconPath = iconPath;
		txtIconPath.setText(iconPath);
	}

	/**
	 * Sets whether a component file (.ztl) should be created or not.
	 * By default this is set to true and file will be created
	 */
	private boolean componentFileCreationEnabled = true;
			
	public boolean isComponentFileCreationEnabled() {
		return componentFileCreationEnabled;
	}
	
	public void setComponentFileCreationEnabled(boolean state) {
		this.componentFileCreationEnabled = state;
		checkCreateComponentFile.setSelection(state);
	}
	
	private boolean addPropertySheet;
	
	
	public boolean isAddPropertySheet() {
		return addPropertySheet;
	}

	public void setAddPropertySheet(boolean addPropertySheet) {
		this.addPropertySheet = addPropertySheet;
	}

	private String propertySheetPath = "res/additional_properties_sheet/additional_properties_sheet.html";
	
	public String getPropertySheetPath() {
		return propertySheetPath;
	}

	public void setPropertySheetPath(String propertySheetPath) {
		this.propertySheetPath = propertySheetPath;
	}

	private String group = "Default";
	
	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	private boolean isClassNameModifiedManually = false;
	
	Composite container;
	Composite topContainer;
	private Text txtTitle;
	private Text txtPackage;
	private Text txtClass;
	private Text txtDescription;
	private Combo comboExtends;
	private Text txtToolTip;
	private Group groupModes;
	private Button checkModeCommon;
	private Button checkModeMobile;
	private Combo comboHandlerType;
	private Button checkDataBound;
	private Group groupIcon;
	private Text txtIconPath;
	private Button btnBrowseIcon;
	private FileDialog fd;
	private Button checkCreateComponentFile;
	private Label lblError;
	private Button checkAddPropertySheet;
	private Text txtPropertySheetPath;
	private Group apsGroup;
	private Combo comboGroup;
	private Button btnAddNewGroup;
	private Group groupGroup;
	
	
	/**
	 * A private function to enable or disable wizard components based on the 
	 * parameter passed to this function.
	 * 
	 * @param state		<code>true</code> or <code>false</code> to enable or
	 * 					disable the components
	 */
	private void enableControls(boolean state) {
		container.setVisible(state);
		setComponentFileCreationEnabled(state);
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
				
				page.setPageComplete(validatePage());
			}
			
			public void widgetDefaultSelected(SelectionEvent event) {
				
			}
		});
		
		setComponentFileCreationEnabled(true);
		
		container = new Composite(topContainer, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout layout = new GridLayout(2, false);
		container.setLayout(layout);
		
		//--- Separator
		Label lineSeparator2 = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData lineSeparatorGridData2 = new GridData(GridData.FILL_HORIZONTAL);
		lineSeparatorGridData2.horizontalSpan = 2;
		lineSeparator2.setLayoutData(lineSeparatorGridData2);
		
		//--- Package Name Row
		Label lblPackage = new Label(container, SWT.NONE);
		lblPackage.setText("Component Package Name:");
		txtPackage = new Text(container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtPackage.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtPackage.setEnabled(false); 
		
		//--- Title Row
		Label lblTitle = new Label(container, SWT.NONE);
		lblTitle.setText("Component Title:");
		txtTitle = new Text(container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtTitle.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtTitle.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				title = txtTitle.getText();
				if(!isClassNameModifiedManually) {
					String clsName = title.replace(" ", "");
					clsName = clsName.replace("-", "");
					clsName = clsName.replace("_", "");
					clsName = clsName.replace(".", "");
					txtClass.setText(clsName);
					setClassName(clsName);
				}
				validateField(txtTitle, "txtTitle");
				page.setPageComplete(validatePage());
			}
		});
		//--- Class Name Row
		Label lblClass = new Label(container, SWT.NONE);
		lblClass.setText("Component Class Name[Id]:");
		txtClass = new Text(container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtClass.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtClass.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				if(txtClass.isFocusControl()) {
					isClassNameModifiedManually = true;
				}
				className = txtClass.getText();
				validateField(txtClass, "txtClass");
				page.setPageComplete(validatePage());
			}
		});
		//--- Super Class Row
		Label lblExtends = new Label(container, SWT.NONE);
		lblExtends.setText("Component Inherit From:");
		comboExtends = new Combo(container, SWT.READ_ONLY | SWT.BORDER);
		comboExtends.add("-- None --");
		comboExtends.add("Component");
		comboExtends.add("SdkDataBuffer");
		comboExtends.select(1); //Select component by default
		comboExtends.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		comboExtends.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				int index = comboExtends.getSelectionIndex();
				classToExtend = comboExtends.getItem(index);
				page.setPageComplete(validatePage());
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
		//--- Tooltip Row
		Label lblTooltip = new Label(container, SWT.NONE);
		lblTooltip.setText("Component Tooltip:");
		txtToolTip = new Text(container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtToolTip.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtToolTip.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {				
				toolTip = txtToolTip.getText();
			}
		});
		//-- Modes row
		Label lblMode = new Label(container, SWT.NONE);
		lblMode.setText("Component Mode:");
		groupModes = new Group(container, SWT.SHADOW_ETCHED_IN);
		groupModes.setLayout(new GridLayout(2, true));
		groupModes.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		checkModeMobile = new Button(groupModes, SWT.CHECK);
		checkModeMobile.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		checkModeMobile.setText("Mobile(m)");
		checkModeMobile.setSelection(true);
		checkModeMobile.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				mobileMode = checkModeMobile.getSelection();
				//if both mobile and commons mode are false, select commons mode
				if(mobileMode == false && commonsMode == false)
					checkModeCommon.setSelection(true);
				page.setPageComplete(validatePage());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {	
			}
		});
		checkModeCommon = new Button(groupModes, SWT.CHECK);
		checkModeCommon.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		checkModeCommon.setText("Commons");
		checkModeCommon.setSelection(false);
		checkModeCommon.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				commonsMode = checkModeCommon.getSelection();
				//if both mobile and commons mode are false, select mobile mode
				if(mobileMode == false && commonsMode == false)
					checkModeMobile.setSelection(true);
				page.setPageComplete(validatePage());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {	
			}
		});
		//--- HandlerType Row
		Label lblHandlerType = new Label(container, SWT.NONE);
		lblHandlerType.setText("Handler Type:");
		comboHandlerType = new Combo(container, SWT.READ_ONLY | SWT.BORDER);
		comboHandlerType.add("Div");
		comboHandlerType.add("sapui5");
		comboHandlerType.add("DataSource");
		comboHandlerType.select(0);
		comboHandlerType.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		comboHandlerType.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int index = comboHandlerType.getSelectionIndex();
				if(index >= 0 && index < comboHandlerType.getItemCount()) {
					handlerType = comboHandlerType.getItem(index);
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			
			}
			
		});
		//--- DataBound Row
		Label lblDataBound = new Label(container, SWT.NONE);
		lblDataBound.setText("Is DataBound:");
		checkDataBound = new Button(container, SWT.CHECK);
		checkDataBound.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dataBound = checkDataBound.getSelection();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				
			}
			
		});
		//--- Icon Row
		Label lblIcon = new Label(container, SWT.NONE);
		lblIcon.setText("Component Icon:");
		groupIcon = new Group(container, SWT.SHADOW_ETCHED_IN);
		groupIcon.setLayout(new GridLayout(3, false));
		groupIcon.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		Label lblIconImage = new Label(groupIcon, SWT.NONE);
		txtIconPath = new Text(groupIcon, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtIconPath.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtIconPath.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {			
				iconPath = txtIconPath.getText();
			}
		});
		btnBrowseIcon = new Button(groupIcon, SWT.BORDER);
		btnBrowseIcon.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		btnBrowseIcon.setText("Browse...");
		btnBrowseIcon.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				fd = new FileDialog(container.getShell(), SWT.OPEN);
				fd.setText("Open");
				String[] filterExt = {"*.png", "*.icon", "*.jpg"};
				fd.setFilterExtensions(filterExt);
				String filePath = fd.open();
				if(filePath != null) {
					setIconPath(filePath);					
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				
			}
			
		});
		//--- Add PropertySheet Row
		Label lblPropertySheet = new Label(container, SWT.NONE);
		lblPropertySheet.setText("Add Property Sheet:");
		apsGroup = new Group(container, SWT.SHADOW_ETCHED_IN);
		apsGroup.setLayout(new GridLayout(2, false));
		apsGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		checkAddPropertySheet = new Button(apsGroup, SWT.CHECK);
		checkAddPropertySheet.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addPropertySheet = checkAddPropertySheet.getSelection();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				
			}
			
		});
		txtPropertySheetPath = new Text(apsGroup, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtPropertySheetPath.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtPropertySheetPath.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {			
				propertySheetPath = txtPropertySheetPath.getText();
			}
		});
		//--- Group Row
		Label lblGroup = new Label(container, SWT.NONE);
		lblGroup.setText("Group:");
		groupGroup = new Group(container, SWT.SHADOW_ETCHED_IN);
		groupGroup.setLayout(new GridLayout(2, false));
		groupGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		comboGroup = new Combo(groupGroup, SWT.READ_ONLY | SWT.BORDER);
		comboGroup.add("Default");
		comboGroup.add("sapui5");
		comboGroup.add("TECHNICAL_COMPONENT");
		comboGroup.select(0);
		comboGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		comboGroup.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int index = comboGroup.getSelectionIndex();
				if(index >= 0 && index < comboGroup.getItemCount()) {
					group = comboGroup.getItem(index);
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			
			}
			
		});
		btnAddNewGroup = new Button(groupGroup, SWT.BORDER);
		btnAddNewGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		btnAddNewGroup.setText("Add New...");
		btnAddNewGroup.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				InputDialog newGroupDialog = new InputDialog(Display.getDefault().getActiveShell(), "New Group",
						"New Group Name:","", null);
				newGroupDialog.setBlockOnOpen(true);
				if(newGroupDialog.open()  == Dialog.OK) {
					comboGroup.add(newGroupDialog.getValue());
					int index = comboGroup.indexOf(newGroupDialog.getValue());
					comboGroup.select(index);
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				
			}
			
		});
		//--- Separator
		Label lineSeparator1 = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData lineSeparatorGridData1 = new GridData(GridData.FILL_HORIZONTAL);
		lineSeparatorGridData1.horizontalSpan = 2;
		lineSeparator1.setLayoutData(lineSeparatorGridData1);
		//--- Error Label
		lblError = new Label(container, SWT.NONE);
		GridData lblErrorGridData = new GridData(GridData.FILL_HORIZONTAL);
		lblErrorGridData.horizontalSpan = 2;
		lblError.setLayoutData(lblErrorGridData);
		lblError.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_RED));
	}	
	
	private void validateField(Control control, String name) {
		
		lblError.setText("");
		if(name.equals("txtTitle")) {
			String text = ((Text)control).getText();
			if(text.matches("[^a-zA-Z0-9\\s+]")) {
				lblError.setText("Title can contain only Alphanumeric and Space characters");
				return;
			}
		} 
		else if(name.equals("txtClass")) {
			String text = ((Text)control).getText();
			if(text.matches("[^a-zA-Z0-9]")) {
				lblError.setText("Class can contain only Alphanumeric characters");
			}
			if(!text.matches("([A-Z]+[a-z0-9]+\\w+)+")) {
				lblError.setText("First letter of Class should be uppercase and non-numeric");
			}
			return;
		}
	}
	
	public boolean validatePage() {
		if(!isNullOrEmpty(checkCreateComponentFile)) {		
		
			return (isNullOrEmpty(txtTitle) &&
					isNullOrEmpty(txtPackage) &&
					isNullOrEmpty(txtClass) &&
					isNullOrEmpty(comboExtends) &&
					(isNullOrEmpty(checkModeCommon) ||
					isNullOrEmpty(checkModeMobile)) &&
					isNullOrEmpty(comboHandlerType) &&
					isNullOrEmpty(checkDataBound));
		} else 
			return true;
	}
	
	private boolean isNullOrEmpty(Control control) {
		if(control == null)
			return false;
		
		if(control instanceof Text) {
			return ((Text)control).getText().isEmpty();
		}
		
		if(control instanceof Combo) {
			int index = ((Combo)control).getSelectionIndex();
			if(index < 0)
				return false;
			String item = ((Combo)control).getItem(index);
			if(item == null)
				return false;
			if(item.isEmpty())
				return false;
		}
		
		if(control instanceof Button) {			
			Button btn = (Button)control;
			
			if(btn.getStyle() == SWT.CHECK || btn.getStyle() == SWT.RADIO) {
				return btn.getSelection();
			}			
		}
		
		return true;
	}
	
}
