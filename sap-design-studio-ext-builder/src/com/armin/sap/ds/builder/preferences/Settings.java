package com.armin.sap.ds.builder.preferences;

import org.eclipse.jface.preference.IPreferenceStore;

import com.armin.sap.ds.builder.Activator;

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

		public static final String GROUPS_LIST_ID = "groups";
		
		public static final String DEFAULT_GROUPS = "Default;TECHNICAL_COMPONENT";
		
		public static final String COMPONENT_PARENT_CLASSES_ID = "componentParentClasses";
		
		public static final String DEFAULT_COMPONENT_PARENT_CLASSES = "Component;SdkDataBuffer";
		
		public static final String COMPONENT_ZTL_FILE_NAME_ID = "componentZTLFileName";
		
		public static final String DEFAULT_COMPONENT_ZTL_FILE_NAME = "contribution.ztl";
		
		public static final String EXTENSION_XML_FILE_NAME_ID = "extensionXMLFileName";
		
		public static final String DEFAULT_EXTENSION_XML_FILE_NAME = "contribution.xml";
		
		public static final String JS_TEMPLATE_ID = "jsTemplate";
		
		public static final String DEFAULT_JS_TEMPLATE = "/***** JS File ******/";
		
		public static final String CSS_TEMPLATE_ID = "cssTemplate";
		
		public static final String DEFAULT_CSS_TEMPLATE = "// CSS Style classes //";
		
		public static final String HTML_TEMPLATE = "cssTemplate";
		
		public static final String DEFAULT_HTML_TEMPLATE = "<html><head></head><body></body></html>";
		
		public static final String ZTL_TEMPLATE_ID = "ztlTemplate";
		
		public static final String DEFAULT_ZTL_TEMPLATE = "class ${package}.${class} extends ${parentclass} {* \n /** Add Code Below **/ \n *}";
		
		public static final String MF_TEMPLATE_ID = "mfTemplate";
		
		public static final String DEFAULT_MF_TEMPLATE = "Manifest-Version: 1.0\n" + 
															"Bundle-ManifestVersion: 2\n" + 
															"Bundle-Name: ${ext_title}\n" + 
															"Bundle-SymbolicName: ${ext_id};singleton:=true\n" + 
															"Bundle-Version: ${version}\n" + 
															"Require-Bundle: com.sap.ip.bi.zen.rt.components.sdk\n" + 
															"Bundle-Vendor: ${vendor}";
		
		public static final String ICON_SIZE_ID = "iconSize";
		
		public static final int ICON_SIZE_16x16 = 16;
		public static final int ICON_SIZE_18x18 = 18;
		public static final int ICON_SIZE_24x24 = 24;
		public static final int ICON_SIZE_28x28 = 28;
		public static final int ICON_SIZE_32x32 = 32;
		
		public static final int DEFAULT_ICON_SIZE = ICON_SIZE_24x24;
		
		public static final String DESIGN_STUDIO_PATH_ID = "designStudioPath";
		
		public static final String DEFAULT_DESIGN_STUDIO_PATH = "";
		
		//Settings for Graphiti Diagrams - component client
		public static final String COMPONENT_CLIENT_DIA_WIDTH_ID = "component_client_width";		
		public static final String COMPONENT_CLIENT_DIA_HEIGHT_ID = "component_client_height";
		public static final String COMPONENT_CLIENT_DIA_CORNER_WIDTH_ID = "component_client_corner_width";
		public static final String COMPONENT_CLIENT_DIA_CORNER_HEIGHT_ID = "component_client_corner_height";
		public static final String COMPONENT_CLIENT_DIA_ROW_HEIGHT_ID = "component_client_diagram_row_height";
		public static final String COMPONENT_CLIENT_DIA_CONTAINER_LINE_WIDTH_ID = "component_client_container_line_width";
		
		public static final int COMPONENT_CLIENT_DIA_HEIGHT = 100;
		public static final int COMPONENT_CLIENT_DIA_WIDTH = 100;
		public static final int COMPONENT_CLIENT_DIA_CORNER_WIDTH = 10;
		public static final int COMPONENT_CLIENT_DIA_CORNER_HEIGHT = 10;
		public static final int COMPONENT_CLIENT_DIA_ROW_HEIGHT = 20;
		public static final int COMPONENT_CLIENT_DIA_CONTAINER_LINE_WIDTH = 2;	
				
		
		//Settings for Graphiti diagrams - constant section
		public static final String CONSTANT_SECTION_NUM_OF_ROWS_ID = "constant_section_num_of_rows";
		public static final int CONSTANT_SECTION_NUM_OF_ROWS = 5;
	}

}
