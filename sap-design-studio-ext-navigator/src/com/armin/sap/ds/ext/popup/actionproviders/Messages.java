package com.armin.sap.ds.ext.popup.actionproviders;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "com.armin.sap.ds.ext.popup.actionproviders.messages";
	public static String DesignStudioNewActionProvider_popupNewLabel;
	public static String DesignStudioRefreshActionProvider_invocationTargetExceptionMessage;
	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
	private Messages() {
		// TODO Auto-generated constructor stub
	}

}
