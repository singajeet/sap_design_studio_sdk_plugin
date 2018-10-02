package com.armin.sap.ds.builder.service.factory;

import org.eclipse.ui.services.AbstractServiceFactory;
import org.eclipse.ui.services.IServiceLocator;

import com.armin.sap.ds.builder.service.ClipboardOpsService;
import com.armin.sap.ds.builder.service.ClipboardOpsServiceSlave;
import com.armin.sap.ds.builder.service.IClipboardOpsService;

public class ClipboardOpsServiceFactory extends AbstractServiceFactory {

	IClipboardOpsService _service;
	
	public ClipboardOpsServiceFactory() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Object create(Class serviceInterface, IServiceLocator parentLocator, IServiceLocator locator) {
		if(!IClipboardOpsService.class.equals(serviceInterface))
			return null;
		_service = parentLocator.getService(IClipboardOpsService.class);
		
		if(_service == null) {
			_service = new ClipboardOpsService(locator);
			return _service;
		}		
		return new ClipboardOpsServiceSlave(locator, (IClipboardOpsService) _service);
	}

}
