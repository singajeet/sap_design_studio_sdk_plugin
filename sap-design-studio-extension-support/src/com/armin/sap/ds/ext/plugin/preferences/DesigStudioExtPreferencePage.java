package com.armin.sap.ds.ext.plugin.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.armin.sap.ds.ext.plugin.Activator;

public class DesigStudioExtPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	IPreferenceStore store;
	
	public DesigStudioExtPreferencePage() {
		super(GRID);
		store = Activator.getDefault().getPreferenceStore();
		setPreferenceStore(store);
		setDescription("SAP Design Studio Preferences");
	}
	
	public void createFieldEditors() {
		Composite topPanel = getFieldEditorParent();
		
		Group fileNames = new Group(topPanel, SWT.SHADOW_ETCHED_IN);
		fileNames.setText("Default File Names");
		fileNames.setLayout(new GridLayout(1, false));
		fileNames.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		StringFieldEditor componentFileName = new StringFieldEditor(
											Settings.FOR.COMPONENT_ZTL_FILE_NAME, 
											"Component's Default File Name:",
											fileNames);
		addField(componentFileName);
		StringFieldEditor extensionFileName = new StringFieldEditor(
												Settings.FOR.EXTENSION_XML_FILE_NAME,
												"Extension's Default File Name:",
												fileNames);
		addField(extensionFileName);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}