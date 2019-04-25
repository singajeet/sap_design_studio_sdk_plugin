package com.armin.sap.ds.builder.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.ListEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.armin.sap.ds.builder.Activator;

public class DesigStudioExtGroupsPage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	private IPreferenceStore store;
	private GroupListEditor groupListEditor;
	private Text txtNewGroup;
	
	public DesigStudioExtGroupsPage() {
		super(GRID);
		setTitle("Groups");
		store = Activator.getDefault().getPreferenceStore();
		setPreferenceStore(store);
		setDescription("SAP Design Studio Groups Settings");
	}

	@Override
	public void init(IWorkbench workbench) {
		
	}

	@Override
	protected void createFieldEditors() {
		
		Composite topPanel = getFieldEditorParent();
		Group groupPanel = new Group(topPanel, SWT.SHADOW_ETCHED_IN);
		groupPanel.setLayout(new GridLayout(1, false));
		groupPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtNewGroup = new Text(groupPanel, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtNewGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		groupListEditor = new GroupListEditor(Settings.FOR.GROUPS_LIST_ID, "Groups: ", groupPanel);
		addField(groupListEditor);
		
	}
	
	public class GroupListEditor extends ListEditor{

		public GroupListEditor() {}
		
		public GroupListEditor(String name, String label, Composite parent) {
			super(name, label, parent);			
		}
		
		/* (non-Javadoc)
		 * @see org.eclipse.jface.preference.ListEditor#selectionChanged()
		 */
		@Override
		protected void selectionChanged() {			
			super.selectionChanged();
			if(txtNewGroup.getText() != null && !txtNewGroup.getText().isEmpty()) {
				txtNewGroup.setText("");
			}
		}

		@Override
		protected String createList(String[] items) {
			StringBuffer buf = new StringBuffer();
			if(items.length > 0) {
				buf.append(items[0]);
				for(int i=1;i<items.length;i++) {
					buf.append(";");
					buf.append(items[i]);
				}
			}
			return buf.toString();
		}

		@Override
		protected String getNewInputObject() {			
			return txtNewGroup.getText();
		}

		@Override
		protected String[] parseString(String stringList) {			
			return stringList.split(";");
		}
		
	}

}
