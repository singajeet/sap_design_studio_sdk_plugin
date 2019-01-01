package com.armin.sap.ds.builder.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import com.armin.sap.ds.builder.Activator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(Settings.FOR.GROUPS_LIST_ID, Settings.FOR.DEFAULT_GROUPS);
		store.setDefault(Settings.FOR.COMPONENT_PARENT_CLASSES_ID, Settings.FOR.DEFAULT_COMPONENT_PARENT_CLASSES);
		store.setDefault(Settings.FOR.COMPONENT_ZTL_FILE_NAME_ID, Settings.FOR.DEFAULT_COMPONENT_ZTL_FILE_NAME);
		store.setDefault(Settings.FOR.EXTENSION_XML_FILE_NAME_ID, Settings.FOR.DEFAULT_EXTENSION_XML_FILE_NAME);
		store.setDefault(Settings.FOR.JS_TEMPLATE_ID, Settings.FOR.DEFAULT_JS_TEMPLATE);
		store.setDefault(Settings.FOR.CSS_TEMPLATE_ID, Settings.FOR.DEFAULT_CSS_TEMPLATE);
		store.setDefault(Settings.FOR.ZTL_TEMPLATE_ID, Settings.FOR.DEFAULT_ZTL_TEMPLATE);
		store.setDefault(Settings.FOR.MF_TEMPLATE_ID, Settings.FOR.DEFAULT_MF_TEMPLATE);
		store.setDefault(Settings.FOR.ICON_SIZE_ID, Settings.FOR.DEFAULT_ICON_SIZE);
		store.setDefault(Settings.FOR.DESIGN_STUDIO_PATH_ID, Settings.FOR.DEFAULT_DESIGN_STUDIO_PATH);
		
		store.setDefault(Settings.FOR.COMPONENT_CLIENT_DIA_HEIGHT_ID, Settings.FOR.COMPONENT_CLIENT_DIA_HEIGHT);
		store.setDefault(Settings.FOR.COMPONENT_CLIENT_DIA_WIDTH_ID, Settings.FOR.COMPONENT_CLIENT_DIA_WIDTH);
		store.setDefault(Settings.FOR.COMPONENT_CLIENT_DIA_CORNER_HEIGHT_ID, Settings.FOR.COMPONENT_CLIENT_DIA_CORNER_HEIGHT);
		store.setDefault(Settings.FOR.COMPONENT_CLIENT_DIA_CORNER_WIDTH_ID, Settings.FOR.COMPONENT_CLIENT_DIA_CORNER_WIDTH);
		store.setDefault(Settings.FOR.COMPONENT_CLIENT_DIA_CONTAINER_LINE_WIDTH_ID, Settings.FOR.COMPONENT_CLIENT_DIA_CONTAINER_LINE_WIDTH);
		store.setDefault(Settings.FOR.COMPONENT_CLIENT_DIA_ROW_HEIGHT_ID, Settings.FOR.COMPONENT_CLIENT_DIA_ROW_HEIGHT);
		
		store.setDefault(Settings.FOR.CONSTANT_SECTION_NUM_OF_ROWS_ID, Settings.FOR.CONSTANT_SECTION_NUM_OF_ROWS);
	}

}
