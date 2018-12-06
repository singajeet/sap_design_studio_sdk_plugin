package com.armin.sap.ds.builder.ui.dialogs;

import java.util.HashMap;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import com.armin.sap.ds.builder.core.common.IDEConstants;
import com.armin.sap.ds.builder.models.domain.Component;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ComponentNode;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ExtensionNode;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.GroupNode;

public class ClientComponentCreateFeatureDialog extends TitleAreaDialog {
	private Text newComponentId;
	private Text componentTitle;
	private ListViewer listViewer;
	private Button checkCreateNewComponent;
	private List componentsList;
	private java.util.List<Component> _components;
	private boolean _isNewComponent = false;
	private HashMap<String, String> _inputMap;
	
	/**
	 * Create the dialog.	
	 */
	public ClientComponentCreateFeatureDialog(Shell parentShell, ComponentNode node, HashMap<String, String> inputMap) {
		super(parentShell);
		setHelpAvailable(false);
		setShellStyle(SWT.CLOSE | SWT.TITLE | SWT.PRIMARY_MODAL);
		_inputMap = inputMap;
		this._components = ((ExtensionNode)((GroupNode)node.getParent(null)).getParent(null)).getExtension().getComponent();
		
	}

	public ClientComponentCreateFeatureDialog(Shell parentShell, java.util.List<Component> components, HashMap<String, String> inputMap) {
		super(parentShell);
		setHelpAvailable(false);
		setShellStyle(SWT.CLOSE | SWT.TITLE | SWT.PRIMARY_MODAL);
		_inputMap = inputMap;
		this._components = components;
		
	}
	
	public ClientComponentCreateFeatureDialog(Shell parentShell, ExtensionNode node, HashMap<String, String> inputMap) {
		super(parentShell);
		setHelpAvailable(false);
		setShellStyle(SWT.CLOSE | SWT.TITLE | SWT.PRIMARY_MODAL);
		_inputMap = inputMap;
		this._components = node.getExtension().getComponent();
		
	}
	
	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		//super.createDialogArea(parent);
		
		setTitleImage(SWTResourceManager.getImage("/home/armin/eclipse-workspace/sap-design-studio-ext-builder/images/component_64x64.png"));
		setTitle("Component");
		setMessage("Select existing or create new component");
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(1, false));
		
		Group grpComponentId = new Group(container, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpComponentId.setText("Component Id");
		grpComponentId.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		grpComponentId.setLayout(new GridLayout(1, false));
		
		Label lblNewLabel = new Label(grpComponentId, SWT.SHADOW_IN);
		lblNewLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblNewLabel.setText("Select an existing component");
		
		listViewer = new ListViewer(grpComponentId, SWT.BORDER | SWT.V_SCROLL);
		componentsList = listViewer.getList();
		componentsList.setItems(new String[] {"Comp1", "Comp2", "Comp3"});
		componentsList.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		componentsList.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				String id = getSelectedComponentId();
				for(Component comp : _components) {
					if(comp.getId().equalsIgnoreCase(id)) {
						newComponentId.setText(id);
						componentTitle.setText(comp.getTitle());
					}
				}
				changeOKButtonState();
				updateInputMap();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		Group group = new Group(container, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		group.setLayout(new GridLayout(2, false));
		group.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		checkCreateNewComponent = new Button(group, SWT.CHECK);
		checkCreateNewComponent.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		checkCreateNewComponent.setText("&Create new component");
		checkCreateNewComponent.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if(e != null && e.getSource() != null) {
					_isNewComponent = ((Button)e.getSource()).getSelection();
					newComponentId.setEditable(_isNewComponent);
					componentTitle.setEditable(_isNewComponent);
					componentsList.setEnabled(!_isNewComponent);
					componentTitle.setText("");
					newComponentId.setText("");
					updateInputMap();
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		Label lblNewLabel_1 = new Label(group, SWT.NONE);
		lblNewLabel_1.setText("Component Id");
		
		newComponentId = new Text(group, SWT.BORDER);
		newComponentId.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		newComponentId.setEditable(false);
		
		newComponentId.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(e.widget instanceof Text) {
					updateInputMap();
				}
				
			}
			
		});
		
		Label lblNewLabel_2 = new Label(group, SWT.NONE);
		lblNewLabel_2.setText("Component Title");
		
		componentTitle = new Text(group, SWT.BORDER);
		componentTitle.setEditable(false);
		componentTitle.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		//this.getButton(IDialogConstants.OK_ID).setEnabled(false);
		
		this.fillComponentList();
		
		return container;
	}
	
	private void changeOKButtonState() {
		if(componentsList.getSelectionCount() <= 0 && newComponentId.getText().isEmpty()) {
			getButton(IDialogConstants.OK_ID).setEnabled(false);
		} else {
			getButton(IDialogConstants.OK_ID).setEnabled(true);
		}
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
	}

	public String getNewComponentId() {
		if(this.checkCreateNewComponent.getSelection())
			return this.newComponentId.getText();
		
		return null;
	}
	
	public String getComponentTitle() {
		return this.componentTitle.getText();
	}
	
	public boolean isNewComponent() {
		return _isNewComponent;
	}
	
	public String getSelectedComponentId() {		
		int index = this.componentsList.getSelectionIndex();
		return this.componentsList.getItem(index);
	}
	
	public void setComponentNodes(java.util.List<Component> components) {
		this._components = components;
		fillComponentList();
	}
	
	public void populateAllComponentsFromExtensionNode(ExtensionNode node) {
		 this._components = node.getExtension().getComponent();
		 fillComponentList();
	}
	
	private void fillComponentList() {
		this.componentsList.removeAll();
		for(Component component : this._components) {
			this.componentsList.add(component.getId() + " [" + component.getName() + "]");
		}
	}
	
	
	
	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 370);
	}
}
