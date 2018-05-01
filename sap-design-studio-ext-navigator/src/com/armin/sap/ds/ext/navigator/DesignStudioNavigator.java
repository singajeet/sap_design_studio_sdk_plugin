package com.armin.sap.ds.ext.navigator;

import org.eclipse.ui.navigator.CommonNavigator;

public class DesignStudioNavigator extends CommonNavigator {

	@Override
    protected Object getInitialInput() {
        return new DesignStudioProjectWorkbenchRoot();
    }

}
