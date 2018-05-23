package com.armin.sap.ds.ext.plugin.preferences;

import org.eclipse.jface.preference.IPreferenceStore;

import com.armin.sap.ds.ext.plugin.Activator;

public class Settings {

	private static Settings _singleInstance;
	private IPreferenceStore _store;
	
	//public static PreferenceConstants FOR;
	
	private Settings() {
		_store = Activator.getDefault().getPreferenceStore();
	}

	public static Settings store() {
		if(_singleInstance == null)
			_singleInstance = new Settings();
		
		return _singleInstance;
	}
	
	public String get(String key) {
		return _store.getString(key);
	}
	
	public String getDefault(String key) {
		return _store.getDefaultString(key);
	}
	
	public void set(String key, String value) {
		_store.setValue(key, value);
	}
	
	public void setDefault(String key, String value) {
		_store.setDefault(key, value);
	}
	
	public class FOR {

		public static final String GROUPS_LIST = "groups";
		
		public static final String DEFAULT_GROUPS = "Default;TECHNICAL_COMPONENT";
		
		public static final String COMPONENT_PARENT_CLASSES = "componentParentClasses";
		
		public static final String DEFAULT_COMPONENT_PARENT_CLASSES = "Component;SdkDataBuffer";
		
		public static final String COMPONENT_ZTL_FILE_NAME = "componentZTLFileName";
		
		public static final String DEFAULT_COMPONENT_ZTL_FILE_NAME = "contribution.ztl";
		
		public static final String EXTENSION_XML_FILE_NAME = "extensionXMLFileName";
		
		public static final String DEFAULT_EXTENSION_XML_FILE_NAME = "contribution.xml";
	}

}
