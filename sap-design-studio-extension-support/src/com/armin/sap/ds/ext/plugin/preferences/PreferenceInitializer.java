package com.armin.sap.ds.ext.plugin.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import com.armin.sap.ds.ext.plugin.Activator;

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
		
		store.setDefault(Settings.FOR.GROUPS_LIST, Settings.FOR.DEFAULT_GROUPS);
		store.setDefault(Settings.FOR.COMPONENT_PARENT_CLASSES, Settings.FOR.DEFAULT_COMPONENT_PARENT_CLASSES);
		store.setDefault(Settings.FOR.COMPONENT_ZTL_FILE_NAME, Settings.FOR.DEFAULT_COMPONENT_ZTL_FILE_NAME);
		store.setDefault(Settings.FOR.EXTENSION_XML_FILE_NAME, Settings.FOR.DEFAULT_EXTENSION_XML_FILE_NAME);
		store.setDefault(Settings.FOR.JS_TEMPLATE, Settings.FOR.DEFAULT_JS_TEMPLATE);
		store.setDefault(Settings.FOR.CSS_TEMPLATE, Settings.FOR.DEFAULT_CSS_TEMPLATE);
		store.setDefault(Settings.FOR.ZTL_TEMPLATE, Settings.FOR.DEFAULT_ZTL_TEMPLATE);
	}

}
