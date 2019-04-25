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

public class DesigStudioExtInheritancePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	private IPreferenceStore store;
	private ParentClassListEditor parentClassListEditor;
	private Text txtNewParentClass;
	
	public DesigStudioExtInheritancePage() {
		super(GRID);
		setTitle("Inheritance");
		store = Activator.getDefault().getPreferenceStore();
		setPreferenceStore(store);
		setDescription("SAP Design Studio Component's Parent Class");
	}
	
	@Override
	public void init(IWorkbench workbench) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void createFieldEditors() {
		
		Composite topPanel = getFieldEditorParent();
		Group groupPanel = new Group(topPanel, SWT.SHADOW_ETCHED_IN);
		groupPanel.setLayout(new GridLayout(1, false));
		groupPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtNewParentClass = new Text(groupPanel, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtNewParentClass.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		parentClassListEditor = new ParentClassListEditor(Settings.FOR.COMPONENT_PARENT_CLASSES_ID, "Parent Class List: ", groupPanel);
		addField(parentClassListEditor);
		
	}
	
	public class ParentClassListEditor extends ListEditor{

		public ParentClassListEditor() {}
		
		public ParentClassListEditor(String name, String label, Composite parent) {
			super(name, label, parent);			
		}
		
		/* (non-Javadoc)
		 * @see org.eclipse.jface.preference.ListEditor#selectionChanged()
		 */
		@Override
		protected void selectionChanged() {			
			super.selectionChanged();
			if(txtNewParentClass.getText() != null && !txtNewParentClass.getText().isEmpty()) {
				txtNewParentClass.setText("");
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
			return txtNewParentClass.getText();
		}

		@Override
		protected String[] parseString(String stringList) {			
			return stringList.split(";");
		}
		
	}


}
