package com.armin.sap.ds.builder.preferences;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.armin.sap.ds.builder.Activator;

/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. By 
 * subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows
 * us to create a page that is small and knows how to 
 * save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They
 * are stored in the preference store that belongs to
 * the main plug-in class. That way, preferences can
 * be accessed directly via the preference store.
 */

public class DesignStudioPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	IPreferenceStore store;
	public DesignStudioPreferencePage() {
		super(GRID);
		store = Activator.getDefault().getPreferenceStore();
		setPreferenceStore(store);
		setDescription("SAP Design Studio Preferences");
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
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
		
		RadioGroupFieldEditor iconSize = new RadioGroupFieldEditor(Settings.FOR.ICON_SIZE,
												"Icon Size (in Pixels):", 1,
												new String[][] {
													{"16 x 16", String.valueOf(Settings.FOR.ICON_SIZE_16x16)},
													{"18 x 18", String.valueOf(Settings.FOR.ICON_SIZE_18x18)},
													{"24 x 24", String.valueOf(Settings.FOR.ICON_SIZE_24x24)},
													{"28 x 28", String.valueOf(Settings.FOR.ICON_SIZE_28x28)},
													{"32 x 32", String.valueOf(Settings.FOR.ICON_SIZE_32x32)}
												}, topPanel, true);
		addField(iconSize);
		
		Group dsPathGroup = new Group(topPanel, SWT.SHADOW_ETCHED_IN);
		dsPathGroup.setText("SAP Design Studio / Lumira Designer Location");
		dsPathGroup.setLayout(new GridLayout(1, false));
		dsPathGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		DirectoryFieldEditor designStudioPath = new DirectoryFieldEditor(Settings.FOR.DESIGN_STUDIO_PATH,
														"Location: ", dsPathGroup);
		addField(designStudioPath);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}