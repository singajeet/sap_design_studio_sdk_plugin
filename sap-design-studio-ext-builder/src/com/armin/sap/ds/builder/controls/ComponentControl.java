package com.armin.sap.ds.builder.controls;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.InputDialog;
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
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.armin.sap.ds.builder.api.models.Component;
import com.armin.sap.ds.builder.api.models.HandlerTypes;
import com.armin.sap.ds.builder.api.models.UI5Mode;
import com.armin.sap.ds.builder.preferences.Settings;

public class ComponentControl extends Composite {

	private List<IComponentChangedListener> _listeners;
	private Component _model;
	
	private Text txtTitle;
	private Text txtClass;
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
	private Label lblError;
	private Button checkAddPropertySheet;
	private Text txtPropertySheetPath;
	private Group apsGroup;
	private Combo comboGroup;
	private Button btnAddNewGroup;
	private Group groupGroup;
	protected boolean isClassNameModifiedManually = false;
	private Composite composite;
	private Composite container;
	
	public ComponentControl(Composite parent, int style) {
		super(parent, style);
		_listeners = new ArrayList<IComponentChangedListener>();
		_model = new Component();
		this.createControl();
	}
	
	public ComponentControl(Composite parent, int style, Component model) {		
		super(parent, style);
		_listeners = new ArrayList<IComponentChangedListener>();
		_model = model;
		this.createControl();
	}
	
	public void setModel(Component model) {
		_model = model;
	}
	
	public Component getModel() {
		if(_model == null)
			_model = new Component();
		
		return _model;
	}
	
	/**
	 * @return 
	 */
	public String getComponentTitle() {
		return txtTitle.getText();
	}

	/**
	 * @param 
	 */
	public void setComponentTitle(String title) {
		this.txtTitle.setText(title);
	}

	/**
	 * @return 
	 */
	public String getComponentClass() {
		return txtClass.getText();
	}

	/**
	 * @param 
	 */
	public void setComponentClass(String className) {
		this.txtClass.setText(className);
	}

	/**
	 * @return
	 */
	public String getComponentToolTip() {
		return txtToolTip.getText();
	}

	/**
	 * @param
	 */
	public void setComponentToolTip(String txtToolTip) {
		this.txtToolTip.setText(txtToolTip);
	}

	/**
	 * @return
	 */
	public String getComponentIconPath() {
		return txtIconPath.getText();
	}

	/**
	 * @param
	 */
	public void setComponentIconPath(String txtIconPath) {
		this.txtIconPath.setText(txtIconPath);
	}

	/**
	 * @return
	 */
	public String getComponentPropertySheetPath() {
		return txtPropertySheetPath.getText();
	}

	/**
	 * @param
	 */
	public void setComponentPropertySheetPath(String txtPropertySheetPath) {
		this.txtPropertySheetPath.setText(txtPropertySheetPath);
	}

	private void createControl() {
		container = new Composite(this.getParent(), SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		if(_model == null)
			_model = new Component();
		GridLayout gl_container = new GridLayout(1, false);
		container.setLayout(gl_container);
		
		composite = new Composite(container, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1));
		composite.setLayout(new GridLayout(2, false));
		
		//--- Separator
		Label lineSeparator2 = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL | SWT.CENTER);
		lineSeparator2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		
		//--- Title Row
		Label lblTitle = new Label(composite, SWT.NONE);
		lblTitle.setText("Component Title:");
		txtTitle = new Text(composite, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtTitle.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtTitle.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				_model.setTitle(txtTitle.getText() != null ? txtTitle.getText() : "");
				if(!isClassNameModifiedManually && txtTitle.getText() != null) {
					String clsName = _model.getTitle().replace(" ", "");
					clsName = clsName.replace("-", "");
					clsName = clsName.replace("_", "");
					clsName = clsName.replace(".", "");
					txtClass.setText(clsName);
					_model.setId(clsName);
				}	
				validateControl();				
			}
		});
		//--- Class Name Row
		Label lblClass = new Label(composite, SWT.NONE);
		lblClass.setText("Component Class Name[Id]:");
		txtClass = new Text(composite, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtClass.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtClass.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				//validateField(txtClass, "txtClass");
				if(txtClass.isFocusControl()) {
					isClassNameModifiedManually = true;
				}					
				_model.setId(txtClass.getText() != null ? txtClass.getText() : "");
				validateControl();
			}
		});
		//--- Tooltip Row
		Label lblTooltip = new Label(composite, SWT.NONE);
		lblTooltip.setText("Component Tooltip:");
		txtToolTip = new Text(composite, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtToolTip.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		txtToolTip.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {				
				_model.setTooltip(txtToolTip.getText() != null ? txtToolTip.getText() : "");
			}
		});
		//-- Modes row
		Label lblMode = new Label(composite, SWT.NONE);
		lblMode.setText("Component Mode:");
		groupModes = new Group(composite, SWT.SHADOW_ETCHED_IN);
		groupModes.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		groupModes.setLayout(new GridLayout(2, true));
		checkModeMobile = new Button(groupModes, SWT.CHECK);
		checkModeMobile.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		checkModeMobile.setText(UI5Mode.M.name());
		checkModeMobile.setSelection(true);
		checkModeMobile.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(checkModeMobile.getSelection()) {
					if(!has(UI5Mode.M))
						_model.getModes().add(UI5Mode.M);
					
				} else {
					if(has(UI5Mode.M)) {
						UI5Mode found = null;
						for(UI5Mode m : _model.getModes()) {
							if(m.name().equals(UI5Mode.M.name())) {
								found = m;
							}
						}
						if(found != null)
							_model.getModes().remove(found);
						//if both mobile and commons mode are false, select commons mode
						if(_model.getModes().isEmpty()) {
							checkModeCommon.setSelection(true);
							_model.getModes().add(UI5Mode.COMMONS);
						}
					}
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {	
			}
		});
		checkModeCommon = new Button(groupModes, SWT.CHECK);
		checkModeCommon.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		checkModeCommon.setText(UI5Mode.COMMONS.name());
		checkModeCommon.setSelection(false);
		checkModeCommon.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(checkModeCommon.getSelection()) {
					if(!has(UI5Mode.COMMONS))
						_model.getModes().add(UI5Mode.COMMONS);
					
				} else {
					if(has(UI5Mode.COMMONS)) {
						UI5Mode found = null;
						for(UI5Mode m : _model.getModes()) {
							if(m.name().equals(UI5Mode.COMMONS.name())) {
								found = m;
								break;
							}
						}
						if(found != null)
							_model.getModes().remove(found);
						//if both mobile and commons mode are false, select commons mode
						if(_model.getModes().isEmpty()) {
							checkModeMobile.setSelection(true);
							_model.getModes().add(UI5Mode.M);
						}
					}
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {	
			}
		});
		//--- HandlerType Row
		Label lblHandlerType = new Label(composite, SWT.NONE);
		lblHandlerType.setText("Handler Type:");
		comboHandlerType = new Combo(composite, SWT.READ_ONLY | SWT.BORDER);
		comboHandlerType.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		comboHandlerType.select(0);
		comboHandlerType.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int index = comboHandlerType.getSelectionIndex();
				if(index >= 0 && index < comboHandlerType.getItemCount()) {
					_model.setHandlerType(HandlerTypes.valueOf(comboHandlerType.getItem(index)));
				}					
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			
			}
			
		});
		//--- DataBound Row
		Label lblDataBound = new Label(composite, SWT.NONE);
		lblDataBound.setText("Is DataBound:");
		checkDataBound = new Button(composite, SWT.CHECK);
		checkDataBound.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				_model.setDatabound(checkDataBound.getSelection());					
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				
			}
			
		});
		//--- Icon Row
		Label lblIcon = new Label(composite, SWT.NONE);
		lblIcon.setText("Component Icon:");
		groupIcon = new Group(composite, SWT.SHADOW_ETCHED_IN);
		groupIcon.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		groupIcon.setLayout(new GridLayout(3, false));
		txtIconPath = new Text(groupIcon, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtIconPath.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtIconPath.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {			
				_model.setIcon(txtIconPath.getText() != null ? txtIconPath.getText() : "");					
			}
		});
		btnBrowseIcon = new Button(groupIcon, SWT.BORDER);
		btnBrowseIcon.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		btnBrowseIcon.setText("Browse...");
		new Label(groupIcon, SWT.NONE);
		btnBrowseIcon.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				fd = new FileDialog(container.getShell(), SWT.OPEN);
				fd.setText("Open");
				String[] filterExt = {"*.png", "*.icon", "*.jpg"};
				fd.setFilterExtensions(filterExt);
				String filePath = fd.open();
				if(filePath != null) {
					txtIconPath.setText((filePath));
					_model.setIcon(filePath);
				}					
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				
			}
			
		});
		//--- Add PropertySheet Row
		Label lblPropertySheet = new Label(composite, SWT.NONE);
		lblPropertySheet.setText("Add Property Sheet:");
		apsGroup = new Group(composite, SWT.SHADOW_ETCHED_IN);
		apsGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		apsGroup.setLayout(new GridLayout(2, false));
		checkAddPropertySheet = new Button(apsGroup, SWT.CHECK);
		checkAddPropertySheet.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(checkAddPropertySheet.getSelection())
					txtPropertySheetPath.setEnabled(true);
				else
					txtPropertySheetPath.setEnabled(false);					
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				
			}
			
		});
		txtPropertySheetPath = new Text(apsGroup, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtPropertySheetPath.setText("res/additional_properties_sheet/additional_properties_page");
		txtPropertySheetPath.setEnabled(false);
		txtPropertySheetPath.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtPropertySheetPath.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {			
				if(checkAddPropertySheet.getSelection())
					_model.setPropertySheetPath(txtPropertySheetPath.getText());					
			}
		});
		//--- Group Row
		Label lblGroup = new Label(composite, SWT.NONE);
		lblGroup.setText("Group:");
		groupGroup = new Group(composite, SWT.SHADOW_ETCHED_IN);
		groupGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		groupGroup.setLayout(new GridLayout(2, false));
		comboGroup = new Combo(groupGroup, SWT.READ_ONLY | SWT.BORDER);
		comboGroup.select(0);
		comboGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		comboGroup.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int index = comboGroup.getSelectionIndex();
				if(index >= 0 && index < comboGroup.getItemCount()) {
					_model.setGroup(comboGroup.getItem(index));
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
					if(_model.getGroup() == null || _model.getGroup().isEmpty())
						_model.setGroup(newGroupDialog.getValue());
				}					
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				
			}
			
		});
		//--- Separator
		Label lineSeparator1 = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
		lineSeparator1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		//--- Error Label
		lblError = new Label(composite, SWT.WRAP);
		lblError.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		lblError.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_RED));
		_model.getModes().add(UI5Mode.M);
		for(HandlerTypes handler : HandlerTypes.values())
		{
			comboHandlerType.add(handler.name());
		}
		String groupStr = Settings.store().get(Settings.FOR.GROUPS_LIST);
		String[] groups = groupStr.split(";");
		for(String group : groups) {
			comboGroup.add(group);
		}

	}
	
	public void setSelectedGroup(String groupId) {
		if(comboGroup != null) {
			for(int i=0; i < comboGroup.getItemCount(); i++) {
				if(comboGroup.getItem(i).toUpperCase().equals(groupId.toUpperCase())) {
					comboGroup.select(i);
					return;
				}
			}
		}
	}
	
	public void addComponentChangedListener(IComponentChangedListener listener) {
		if(listener != null)
			_listeners.add(listener);
	}
	
	private void notifyAllListeners(boolean isValid) {
		for(IComponentChangedListener listener : _listeners) {
			listener.OnComponentChanged(isValid);
		}
	}
	
	private boolean has(UI5Mode mode) {
		for(UI5Mode ele : _model.getModes()) {
			if(ele.name().equals(mode.name())) {
				return true;
			}
		}
		return false;
	}
	
	
	public boolean validateControl() {			
		if(txtTitle.getText() != null && txtClass.getText() != null) {
			boolean result = !txtTitle.getText().isEmpty() && !txtClass.getText().isEmpty();
			notifyAllListeners(result);
			return result;
		} else {
			notifyAllListeners(false);
			return false;
		}
	}
	public Composite getContainer() {
		return container;
	}
}
