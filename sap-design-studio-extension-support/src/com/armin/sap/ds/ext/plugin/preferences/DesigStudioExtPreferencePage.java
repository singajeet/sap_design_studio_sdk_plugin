package com.armin.sap.ds.ext.plugin.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.armin.sap.ds.ext.plugin.Activator;

public class DesigStudioExtPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public DesigStudioExtPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("SAP Design Studio Preferences");
	}
	
	public void createFieldEditors() {
		Composite parent = getFieldEditorParent();
		Label helpText = new Label(parent, SWT.NONE);
		helpText.setText("Use the options provided on left navigation tree "
				+ "(under 'SAP DS Preferences') to change 'Design Studio' extension builder settings.");
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}