package com.armin.sap.ds.builder.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.ScaleFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.armin.sap.ds.builder.Activator;

public class DesignStudioDiagramsPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	private IPreferenceStore store;
	/**
	 * Create the preference page.
	 */
	public DesignStudioDiagramsPreferencePage() {
		super(GRID);
		setTitle("Diagrams");		
		store = Activator.getDefault().getPreferenceStore();
		setPreferenceStore(store);
		setDescription("SAP Design Studio Diagrams Settings");
	}

	/**
	 * Create contents of the preference page.
	 * @param parent
	 */
	@Override
	protected void createFieldEditors() {
		Composite parent = this.getFieldEditorParent();
		Composite container = new Composite(parent, SWT.NULL);
		container.setLayout(new GridLayout(1, false));
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
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
			IntegerFieldEditor clientWidthFieldEditor = new IntegerFieldEditor(Settings.FOR.COMPONENT_CLIENT_DIA_WIDTH_ID, "Client Width:", compositeClientSize);
			
			clientWidthFieldEditor.setStringValue(String.valueOf(Settings.FOR.COMPONENT_CLIENT_DIA_WIDTH));
			addField(clientWidthFieldEditor);
		}
		{
			IntegerFieldEditor clientHeightFieldEditor = new IntegerFieldEditor(Settings.FOR.COMPONENT_CLIENT_DIA_HEIGHT_ID, "Client Height:", compositeClientSize);
			clientHeightFieldEditor.setStringValue(String.valueOf(Settings.FOR.COMPONENT_CLIENT_DIA_HEIGHT));
			addField(clientHeightFieldEditor);
		}
		
		Group clientCornerSizeGroup = new Group(composite, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		clientCornerSizeGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		clientCornerSizeGroup.setText("Corners Size");
		clientCornerSizeGroup.setLayout(new GridLayout(1, false));
		
		Composite compositeClientCornerSize = new Composite(clientCornerSizeGroup, SWT.NONE);
		compositeClientCornerSize.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		{
			ScaleFieldEditor clientCornerWidthFieldEditor = new ScaleFieldEditor(Settings.FOR.COMPONENT_CLIENT_DIA_CORNER_WIDTH_ID, "Corner Width:", compositeClientCornerSize);
			clientCornerWidthFieldEditor.setMinimum(0);			
			clientCornerWidthFieldEditor.setMaximum(20);
			clientCornerWidthFieldEditor.getScaleControl().setSelection(Settings.FOR.COMPONENT_CLIENT_DIA_CORNER_WIDTH);
			
			addField(clientCornerWidthFieldEditor);
		}
		{
			ScaleFieldEditor clientCornerHeightFieldEditor = new ScaleFieldEditor(Settings.FOR.COMPONENT_CLIENT_DIA_CORNER_HEIGHT_ID, "Corner Height:", compositeClientCornerSize);
			clientCornerHeightFieldEditor.setMinimum(0);			
			clientCornerHeightFieldEditor.setMaximum(20);
			clientCornerHeightFieldEditor.getScaleControl().setSelection(Settings.FOR.COMPONENT_CLIENT_DIA_CORNER_HEIGHT);
			addField(clientCornerHeightFieldEditor);
		}
		
		Group othersGroup = new Group(composite, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		othersGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		othersGroup.setText("Others");
		GridLayout gl_othersGroup = new GridLayout(1, false);
		gl_othersGroup.marginHeight = 10;
		othersGroup.setLayout(gl_othersGroup);
		
		
		Composite compositeOthers = new Composite(othersGroup, SWT.NONE);
		compositeOthers.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		{
			ScaleFieldEditor clientLineWidthFieldEditor = new ScaleFieldEditor(Settings.FOR.COMPONENT_CLIENT_DIA_CONTAINER_LINE_WIDTH_ID, "Root Container Line Width:", compositeOthers);			
			clientLineWidthFieldEditor.setMinimum(0);			
			clientLineWidthFieldEditor.setMaximum(10);
			clientLineWidthFieldEditor.getScaleControl().setSelection(Settings.FOR.COMPONENT_CLIENT_DIA_CONTAINER_LINE_WIDTH);
			addField(clientLineWidthFieldEditor);
		}
		{
			ScaleFieldEditor clientRowHeightFieldEditor = new ScaleFieldEditor(Settings.FOR.COMPONENT_CLIENT_DIA_ROW_HEIGHT_ID, "Row Height:", compositeOthers);
			clientRowHeightFieldEditor.setMaximum(100);
			clientRowHeightFieldEditor.getScaleControl().setSelection(Settings.FOR.COMPONENT_CLIENT_DIA_ROW_HEIGHT);
			clientRowHeightFieldEditor.setMinimum(0);			
			addField(clientRowHeightFieldEditor);
		}
		
		TabItem tbConstantsSectionItem = new TabItem(tabFolder, SWT.NONE);
		tbConstantsSectionItem.setText("Constants Section");
		
		Composite compositeConstantsSectionRoot = new Composite(tabFolder, SWT.NONE);
		tbConstantsSectionItem.setControl(compositeConstantsSectionRoot);
		compositeConstantsSectionRoot.setLayout(new GridLayout(1, false));
		
		Group groupSection = new Group(compositeConstantsSectionRoot, SWT.NONE);
		groupSection.setText("Section");
		groupSection.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		groupSection.setLayout(new GridLayout(1, false));
		
		Composite compositeConstantsSection = new Composite(groupSection, SWT.NONE);
		compositeConstantsSection.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		{
			StringFieldEditor constantSectionNameFieldEditor = new StringFieldEditor(Settings.FOR.CONSTANT_SECTION_NAME_ID, "Name:", compositeConstantsSection);
			constantSectionNameFieldEditor.setStringValue(Settings.FOR.CONSTANT_SECTION_NAME);
			addField(constantSectionNameFieldEditor);
		}
		{
			IntegerFieldEditor constantNumOfRowsFieldEditor = new IntegerFieldEditor(Settings.FOR.CONSTANT_SECTION_NUM_OF_ROWS_ID, "Number Of Rows:", compositeConstantsSection);
			constantNumOfRowsFieldEditor.setStringValue(String.valueOf(Settings.FOR.CONSTANT_SECTION_NUM_OF_ROWS));
			addField(constantNumOfRowsFieldEditor);
		}
		
	}

	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
		// Initialize the preference page
	}
}
