package com.armin.sap.ds.ext.plugin.preferences;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class DesigStudioExtOptionsPage extends PreferencePage implements IWorkbenchPreferencePage {

	private Combo comboGroupList;
	private Button btnAddGroups;
	private Button btnRemoveGroups;
	private Text txtNewGroup;
	
	public DesigStudioExtOptionsPage() {
		// TODO Auto-generated constructor stub
	}

	public DesigStudioExtOptionsPage(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public DesigStudioExtOptionsPage(String title, ImageDescriptor image) {
		super(title, image);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(DesignStudioPreferences.getDefault().getPreferenceStore());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		DesignStudioPreferences.getDefault().getDefault()
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.PreferencePage#performOk()
	 */
	@Override
	public boolean performOk() {
		// TODO Auto-generated method stub
		return super.performOk();
	}

	@Override
	protected Control createContents(Composite parent) {
		
		Group groupGroup = new Group(parent, SWT.NONE);
		groupGroup.setLayout(new GridLayout(1, true));
		groupGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		return groupGroup;
	}

}
