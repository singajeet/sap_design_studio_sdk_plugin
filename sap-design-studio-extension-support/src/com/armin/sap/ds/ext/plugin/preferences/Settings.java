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
		
		public static final String JS_TEMPLATE = "jsTemplate";
		
		public static final String DEFAULT_JS_TEMPLATE = "/***** JS File ******/";
		
		public static final String CSS_TEMPLATE = "cssTemplate";
		
		public static final String DEFAULT_CSS_TEMPLATE = "// CSS Style classes //";
		
		public static final String ZTL_TEMPLATE = "ztlTemplate";
		
		public static final String DEFAULT_ZTL_TEMPLATE = "class ${package}.${class} extends ${parentclass} {* \n /** Add Code Below **/ \n *}";
		
		public static final String MF_TEMPLATE = "mfTemplate";
		
		public static final String DEFAULT_MF_TEMPLATE = "Manifest-Version: 1.0\n" + 
															"Bundle-ManifestVersion: 2\n" + 
															"Bundle-Name: ${ext_title}\n" + 
															"Bundle-SymbolicName: ${ext_id};singleton:=true\n" + 
															"Bundle-Version: ${version}\n" + 
															"Require-Bundle: com.sap.ip.bi.zen.rt.components.sdk\n" + 
															"Bundle-Vendor: ${vendor}";
	}

}
