package com.armin.sap.ds.builder.service.factory;

import org.eclipse.ui.services.AbstractServiceFactory;
import org.eclipse.ui.services.IServiceLocator;

import com.armin.sap.ds.builder.service.ClipboardTransferService;
import com.armin.sap.ds.builder.service.ClipboardTransferServiceSlave;
import com.armin.sap.ds.builder.service.IClipboardTransferService;

public class ClipboardTransferServiceFactory extends AbstractServiceFactory {

	IClipboardTransferService _service;
	
	public ClipboardTransferServiceFactory() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Object create(Class serviceInterface, IServiceLocator parentLocator, IServiceLocator locator) {
		if(!IClipboardTransferService.class.equals(serviceInterface))
			return null;
		_service = parentLocator.getService(IClipboardTransferService.class);
		
		if(_service == null) {
			_service = new ClipboardTransferService(locator);
			return _service;
		}		
		return new ClipboardTransferServiceSlave(locator, (IClipboardTransferService) _service);
	}

}
