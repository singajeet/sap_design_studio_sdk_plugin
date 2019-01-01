package com.armin.sap.ds.builder.diagrams.dialogs;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.dialogs.PropertyPage;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Button;

public class ComponentClientPropertyPage extends PropertyPage {
	private Text textComponentId;
	private Text textComponentName;

	/**
	 * Create the property page.
	 */
	public ComponentClientPropertyPage() {
		setDescription("Set properties of an component that deals with HTML and JavaScript");
		setMessage("Client side object properties");
		setTitle("Component Client");
	}

	/**
	 * Create contents of the property page.
	 * @param parent
	 */
	@Override
	public Control createContents(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		container.setLayout(new GridLayout(2, false));
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("Component Id:");
		
		textComponentId = new Text(container, SWT.BORDER);
		textComponentId.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_1 = new Label(container, SWT.NONE);
		lblNewLabel_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_1.setText("Component Name:");
		
		textComponentName = new Text(container, SWT.BORDER);
		textComponentName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Group grpAssociatedComponents = new Group(container, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpAssociatedComponents.setText("Associated Components");
		grpAssociatedComponents.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		grpAssociatedComponents.setLayout(new GridLayout(2, false));
		
		List listParentComponents = new List(grpAssociatedComponents, SWT.BORDER);
		listParentComponents.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Composite composite = new Composite(grpAssociatedComponents, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, true, 1, 1));
		composite.setLayout(new GridLayout(1, false));
		
		Button btnAddComponent = new Button(composite, SWT.NONE);
		btnAddComponent.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		btnAddComponent.setSelection(true);
		btnAddComponent.setSize(75, 23);
		btnAddComponent.setText("Add...");
		
		Button btnRemoveComponent = new Button(composite, SWT.NONE);
		btnRemoveComponent.setEnabled(false);
		btnRemoveComponent.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		btnRemoveComponent.setText("Remove");
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);

		return container;
	}

}
