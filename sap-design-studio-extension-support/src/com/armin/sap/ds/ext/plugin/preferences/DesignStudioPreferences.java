package com.armin.sap.ds.ext.plugin.preferences;

import org.eclipse.core.runtime.IPluginDescriptor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class DesignStudioPreferences extends AbstractUIPlugin {

	private static DesignStudioPreferences _singleInstance;
	public static final String GROUPS_LIST = "groups";
	
	public static final String DEFAULT_GROUPS = "Default;TECHNICAL_COMPONENT";
	
	public DesignStudioPreferences(IPluginDescriptor descriptor) {
		super(descriptor);
		_singleInstance = this;
	}
	
	public static DesignStudioPreferences getDefault() {
		return _singleInstance;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#initializeDefaultPreferences(org.eclipse.jface.preference.IPreferenceStore)
	 */
	@Override
	protected void initializeDefaultPreferences(IPreferenceStore store) {
		store.setDefault(GROUPS_LIST, DEFAULT_GROUPS);
	}

}
