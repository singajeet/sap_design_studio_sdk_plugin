package com.armin.sap.ds.builder.preferences;

import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.wb.swt.FieldLayoutPreferencePage;
import org.eclipse.swt.widgets.Label;

public class DesignStudioDiagramsPreferencePage extends FieldLayoutPreferencePage implements IWorkbenchPreferencePage {

	/**
	 * Create the preference page.
	 */
	public DesignStudioDiagramsPreferencePage() {
		setTitle("Diagrams");
	}

	/**
	 * Create contents of the preference page.
	 * @param parent
	 */
	@Override
	public Control createPageContents(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		container.setLayout(new GridLayout(1, false));
		
		TabFolder tabFolder = new TabFolder(container, SWT.BORDER);
		tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		TabItem tbComponentClientItem = new TabItem(tabFolder, SWT.NONE);
		tbComponentClientItem.setText("Component Client");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		tbComponentClientItem.setControl(composite);
		composite.setLayout(new GridLayout(1, false));
		
		Group clientSizeGroup = new Group(composite, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		clientSizeGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		clientSizeGroup.setLayout(new GridLayout(1, false));
		clientSizeGroup.setText("Size");
		
		Composite compositeClientSize = new Composite(clientSizeGroup, SWT.NONE);
		
		compositeClientSize.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		{
			IntegerFieldEditor clientWidthFieldEditor = new IntegerFieldEditor(Settings.FOR.COMPONENT_CLIENT_DIA_WIDTH_ID, "Client Width", compositeClientSize);
			
			clientWidthFieldEditor.setStringValue("300");
			addField(clientWidthFieldEditor);
		}
		{
			IntegerFieldEditor clientHeightFieldEditor = new IntegerFieldEditor(Settings.FOR.COMPONENT_CLIENT_DIA_HEIGHT_ID, "Client Height", compositeClientSize);
			clientHeightFieldEditor.setStringValue("300");
			addField(clientHeightFieldEditor);
		}
		
		
		
		TabItem tbConstantsSectionItem = new TabItem(tabFolder, SWT.NONE);
		tbConstantsSectionItem.setText("Constants Section");
		return container;
	}

	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
		// Initialize the preference page
	}

}
