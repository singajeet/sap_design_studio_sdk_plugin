package com.armin.sap.ds.builder.diagrams.dialogs;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.core.common.IDEConstants;
import com.armin.sap.ds.builder.models.domain.Component;
import com.armin.sap.ds.builder.models.domain.ComponentExtended;
import com.armin.sap.ds.builder.models.domain.HandlerTypes;
import com.armin.sap.ds.builder.models.domain.UI5Mode;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ComponentExtendedNode;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ExtensionNode;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.GroupNode;

public class NewComponentClientDialog extends TitleAreaDialog {
	private Text txtComponentId;
	private Text txtComponentTitle;
	private ListViewer listViewer;
	private List componentsList;
	private ComponentExtendedNode _componentNode;
	private ComponentExtended _component;
	private java.util.List<ComponentExtended> _components;
	private boolean _isNewComponent = false;
	private HashMap<String, String> _inputMap;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Text txtComponentDescription;
	private Label lblComponentId;
	private Label lblComponentName;
	private Label lblDescription;
	
	public String componentTypeStr = Settings.store().get(Settings.FOR.COMPONENT_PARENT_CLASSES_ID);
	public String[] componentType = componentTypeStr.split(";");
	
	
	private Label lblDataBound;
	private Button btnCheckDatabound;
	private Label lblGroup;
	private Text txtGroup;
	private Label lblHandlerType;
	private Combo comboHandlerType;
	private Combo comboComponentType;
	private Label lblModes;
	private Composite composite;
	private Button btnModeM;
	private Button btnModeCommon;
	private Label lblNewInstancePrefix;
	private Text txtNewinstanceprefix;
	private ExpandItem xpndtmUseExistingComponent;
	
	/**
	 * Create the dialog.	
	 */
	public NewComponentClientDialog(Shell parentShell, ComponentExtendedNode node, HashMap<String, String> inputMap) {
		super(parentShell);
		setHelpAvailable(false);
		setShellStyle(SWT.CLOSE | SWT.TITLE | SWT.PRIMARY_MODAL);
		_inputMap = inputMap;
		if(node != null) {
			_componentNode = node;
			_component = node.getComponent();			
			if(this._component != null) {
				_components = new ArrayList<ComponentExtended>();
				//this._components = ((ExtensionNode)((GroupNode)node.getParent(null)).getParent(null)).getExtension().getComponent();
				GroupNode parentGrpNode = (GroupNode)node.getParent(null);
				ExtensionNode parentExtNode = (ExtensionNode)parentGrpNode.getParent(null);
				
				//Get all groups under an extension
				Object[] allgroups = parentExtNode.getChildren(null);
				for(Object grpObject : allgroups) {
					GroupNode grpNode = (GroupNode)grpObject;
					Object[] allcomps = grpNode.getChildren(null);
					for(Object compObject : allcomps) {
						ComponentExtendedNode compNode = (ComponentExtendedNode)compObject;
						
						this._components.add((ComponentExtended)compNode.getModel());
					}					
				}
			}
		}
		this.setBlockOnOpen(true);
	}
//
//	public NewComponentClientDialog(Shell parentShell, java.util.List<Component> components, HashMap<String, String> inputMap) {
//		super(parentShell);
//		setHelpAvailable(false);
//		setShellStyle(SWT.CLOSE | SWT.TITLE | SWT.PRIMARY_MODAL);
//		_inputMap = inputMap;
//		this._components = components;
//		
//	}
	
//	public NewComponentClientDialog(Shell parentShell, ExtensionNode node, HashMap<String, String> inputMap) {
//		super(parentShell);
//		setHelpAvailable(false);
//		setShellStyle(SWT.CLOSE | SWT.TITLE | SWT.PRIMARY_MODAL);
//		_inputMap = inputMap;
//		this._components = node.getExtension().getComponent();		
//		
//	}
	
	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		//super.createDialogArea(parent);
		
		
		
		setTitleImage(Activator.getImage("images/component_64x64.png"));
		setTitle("Component");
		
		setMessage("Select existing or create new component");
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(1, false));
		
		Form form = formToolkit.createForm(container);
		form.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		formToolkit.paintBordersFor(form);
		form.setText("New Component");
		form.getBody().setLayout(new GridLayout(2, false));
		
		lblComponentId = new Label(form.getBody(), SWT.NONE);
		lblComponentId.setText("Component Id *:");
		formToolkit.adapt(lblComponentId, true, true);
		
		txtComponentId = new Text(form.getBody(), SWT.BORDER);
		txtComponentId.addVerifyListener(new VerifyListener() {
			public void verifyText(VerifyEvent e) {
				if((e.character >= 'a' && e.character <='z') || (e.character >= 'A' && e.character <= 'Z') || (e.character >= 0 && e.character <= 9) || e.character == '.' || e.character == ' ') {
					e.doit = true;
				} else {
					MessageDialog.openError(null, "Invalid Input", "Character " + e.character + " is invalid!");
					e.doit = false;
				}
			}
		});
		txtComponentId.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		lblComponentName = new Label(form.getBody(), SWT.NONE);
		lblComponentName.setText("Component Name *:");
		formToolkit.adapt(lblComponentName, true, true);
		
		txtComponentTitle = new Text(form.getBody(), SWT.BORDER);
		txtComponentTitle.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		lblDescription = new Label(form.getBody(), SWT.NONE);
		lblDescription.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		formToolkit.adapt(lblDescription, true, true);
		lblDescription.setText("Description:");
		
		txtComponentDescription = new Text(form.getBody(), SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.MULTI);
		GridData gd_txtComponentDescription = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_txtComponentDescription.heightHint = 40;
		txtComponentDescription.setLayoutData(gd_txtComponentDescription);
		formToolkit.adapt(txtComponentDescription, true, true);
		
		Label lblComponentType = new Label(form.getBody(), SWT.NONE);
		formToolkit.adapt(lblComponentType, true, true);
		lblComponentType.setText("Component Type:");
		
		comboComponentType = new Combo(form.getBody(), SWT.NONE);
		comboComponentType.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.adapt(comboComponentType);
		formToolkit.paintBordersFor(comboComponentType);
		comboComponentType.setItems(componentType);
		comboComponentType.select(0);
		
		lblDataBound = new Label(form.getBody(), SWT.NONE);
		formToolkit.adapt(lblDataBound, true, true);
		lblDataBound.setText("Data Bound:");
		
		btnCheckDatabound = new Button(form.getBody(), SWT.CHECK);
		btnCheckDatabound.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(btnCheckDatabound.getSelection())
					btnCheckDatabound.setText("Yes");
				else
					btnCheckDatabound.setText("No");
			}
		});
		formToolkit.adapt(btnCheckDatabound, true, true);
		btnCheckDatabound.setText("No");
		
		lblGroup = new Label(form.getBody(), SWT.NONE);
		lblGroup.setText("Group:");
		formToolkit.adapt(lblGroup, true, true);
		
		txtGroup = new Text(form.getBody(), SWT.BORDER);
		txtGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtGroup.setText("Default");
		formToolkit.adapt(txtGroup, true, true);
		
		lblHandlerType = new Label(form.getBody(), SWT.NONE);
		formToolkit.adapt(lblHandlerType, true, true);
		lblHandlerType.setText("Handler Type:");
		
		comboHandlerType = new Combo(form.getBody(), SWT.NONE);
		comboHandlerType.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.adapt(comboHandlerType);
		formToolkit.paintBordersFor(comboHandlerType);
		comboHandlerType.select(0);
		for(HandlerTypes handler : HandlerTypes.values())
		{
			comboHandlerType.add(handler.name());
		}
		
		lblModes = new Label(form.getBody(), SWT.NONE);
		formToolkit.adapt(lblModes, true, true);
		lblModes.setText("Modes:");
		
		composite = new Composite(form.getBody(), SWT.NONE);
		formToolkit.adapt(composite);
		formToolkit.paintBordersFor(composite);
		composite.setLayout(new GridLayout(2, false));
		
		btnModeM = new Button(composite, SWT.CHECK);
		btnModeM.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!btnModeM.getSelection()) {
					if(!btnModeCommon.getSelection()) {
						e.doit = false;
					}
				}
			}
		});
		formToolkit.adapt(btnModeM, true, true);
		btnModeM.setText("M");
		
		btnModeCommon = new Button(composite, SWT.CHECK);
		btnModeCommon.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!btnModeCommon.getSelection()) {
					if(!btnModeM.getSelection()) {
						e.doit = false;
					}
				}
			}
		});
		btnModeCommon.setSelection(true);
		formToolkit.adapt(btnModeCommon, true, true);
		btnModeCommon.setText("Common");
		
		lblNewInstancePrefix = new Label(form.getBody(), SWT.NONE);
		lblNewInstancePrefix.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		formToolkit.adapt(lblNewInstancePrefix, true, true);
		lblNewInstancePrefix.setText("New Instance Prefix:");
		
		txtNewinstanceprefix = new Text(form.getBody(), SWT.BORDER);
		txtNewinstanceprefix.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.adapt(txtNewinstanceprefix, true, true);
		
		
		
		ExpandBar expandBar = new ExpandBar(container, SWT.BORDER | SWT.V_SCROLL);
		expandBar.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		formToolkit.adapt(expandBar);
		formToolkit.paintBordersFor(expandBar);
		
		xpndtmUseExistingComponent = new ExpandItem(expandBar, SWT.NONE);
		xpndtmUseExistingComponent.setExpanded(true);
		xpndtmUseExistingComponent.setText("Use Existing Component");
		
		listViewer = new ListViewer(expandBar, SWT.BORDER | SWT.V_SCROLL);
		componentsList = listViewer.getList();		
		xpndtmUseExistingComponent.setControl(componentsList);
		componentsList.setItems(new String[] {"Comp1", "Comp2", "Comp3"});
		componentsList.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				String id = getSelectedComponentId();
				for(ComponentExtended comp : _components) {
					if(comp.getId().equalsIgnoreCase(id)) {
						_component = comp;
						updateFieldsFromComponent();
					}
				}
				updateFieldsFromComponent();
				changeOKButtonState();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		xpndtmUseExistingComponent.setHeight(xpndtmUseExistingComponent.getControl().computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
		
		txtComponentId.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(e.widget instanceof Text) {
					//updateInputMap();
				}
				
			}
			
		});

		//this.getButton(IDialogConstants.OK_ID).setEnabled(false);
		
		this.fillComponentList();
		this.updateFieldsFromComponent();
		
		return container;
	}
	
	private void updateFieldsFromComponent() {
		if(this._componentNode != null) {
			_component = this._componentNode.getComponent();
		}
			ComponentExtended component = (ComponentExtended)_component; //this._componentNode.getComponent();
			
			this.txtComponentId.setText(component.getId());
			this.txtComponentTitle.setText(component.getTitle() != null ? component.getTitle() : component.getName());
			if(component.getDescription() != null && !component.getDescription().isEmpty())
				this.txtComponentDescription.setText(component.getDescription());
			
			String compType = component.getClassToExtend();
			if(compType != null && !compType.isEmpty())
				comboComponentType.select(comboComponentType.indexOf(compType));
			
			btnCheckDatabound.setSelection(component.isDatabound());
			if(component.getGroup() != null && !component.getGroup().isEmpty())
				this.txtGroup.setText(component.getGroup());
			
			String handlerType = null;
			if(component.getHandlerType() != null)
				handlerType = component.getHandlerType().toString();
			
			if(handlerType != null )
				comboHandlerType.select(comboHandlerType.indexOf(handlerType));
			
			java.util.List<UI5Mode> modes = null;
			if(component.getModes() != null)
				modes = component.getModes();
			
			if(modes != null) {
				for(UI5Mode mode : modes) {
					if(mode == UI5Mode.M)
						btnModeM.setSelection(true);
					if(mode == UI5Mode.COMMONS)
						btnModeCommon.setSelection(true);
				}
			}
			
			if(component.getNewInstancePrefix() != null && !component.getNewInstancePrefix().isEmpty())
				this.txtNewinstanceprefix.setText(component.getNewInstancePrefix());
		
	}
	
	private void changeOKButtonState() {
		if(componentsList.getSelectionCount() <= 0 && txtComponentId.getText().isEmpty()) {
			getButton(IDialogConstants.OK_ID).setEnabled(false);
		} else {
			getButton(IDialogConstants.OK_ID).setEnabled(true);
		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 */
	@Override
	protected void okPressed() {
		
		updateInputMap();
		super.okPressed();
	}

	private void updateInputMap() {
		this._inputMap.clear();
		if(this.isNewComponent()) {
			this._inputMap.put(IDEConstants.COMPONENT_ID, getNewComponentId());
		} else {
			this._inputMap.put(IDEConstants.COMPONENT_ID, getSelectedComponentId());
		}
		
		this._inputMap.put(IDEConstants.COMPONENT_TITLE, getComponentTitle());
		this._inputMap.put(IDEConstants.IS_NEW_COMPONENT, String.valueOf(_isNewComponent));		
		this._inputMap.put(IDEConstants.DESCRIPTION, txtComponentDescription.getText());
		if(comboComponentType.getSelectionIndex() >= 0)
			this._inputMap.put(IDEConstants.COMPONENT_TYPE, comboComponentType.getItem(comboComponentType.getSelectionIndex()));
		this._inputMap.put(IDEConstants.DATABOUND, String.valueOf(btnCheckDatabound.getSelection()));
		this._inputMap.put(IDEConstants.GROUPS, txtGroup.getText());
		if(comboHandlerType.getSelectionIndex() >= 0)
			this._inputMap.put(IDEConstants.HANDLER_TYPE, comboHandlerType.getItem(comboHandlerType.getSelectionIndex()));
		this._inputMap.put(IDEConstants.M, String.valueOf(btnModeM.getSelection()));
		this._inputMap.put(IDEConstants.COMMONS, String.valueOf(btnModeCommon.getSelection()));
		this._inputMap.put(IDEConstants.NEW_INSTANCE_PREFIX, txtNewinstanceprefix.getText());
		
		
	}

	public String getNewComponentId() {		
		return this.txtComponentId.getText();
	}
	
	public String getComponentTitle() {
		return this.txtComponentTitle.getText();
	}
	
	public boolean isNewComponent() {
		return _isNewComponent;
	}
	
	public String getSelectedComponentId() {		
		int index = this.componentsList.getSelectionIndex();
		if(index < 0)
			return "";
		return this.componentsList.getItem(index);
	}
	
	public void setComponentNodes(java.util.List<ComponentExtended> components) {
		this._components = components;
		fillComponentList();
	}
	
	public void populateAllComponentsFromExtensionNode(ExtensionNode node) {
		 this._components = node.getExtension().getComponent();
		 fillComponentList();
	}
	
	private void fillComponentList() {
		if(this._components != null) {
			this.componentsList.removeAll();
			for(Component component : this._components) {
				this.componentsList.add(component.getId() + " [" + component.getName() + "]");
			}
		} else {
			xpndtmUseExistingComponent.setExpanded(false);
			componentsList.setEnabled(false);
		}
	}
	
	
	
	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		Button ok_btn = createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		ok_btn.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				//updateInputMap();				
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(720, 563);
	}
}
