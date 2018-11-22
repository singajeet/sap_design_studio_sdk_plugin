package com.armin.sap.ds.builder.ui.navigation;

import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;

public class ProjectNavigator extends CommonNavigator {

	
	
	public ProjectNavigator() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.navigator.CommonNavigator#getAdapter(java.lang.Class)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> adapter) {
		
		if(adapter == IPropertySheetPage.class) {
			return ((T) new PropertySheetPage());
		}
		
		return super.getAdapter(adapter);
	}

}
