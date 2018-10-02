package com.armin.sap.ds.builder.service;

import org.eclipse.swt.dnd.ByteArrayTransfer;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.services.IServiceLocator;

public class ClipboardTransferServiceSlave implements IClipboardTransferService {

	
	private IServiceLocator _locator;
	private IClipboardTransferService _parentService;	
	
	public ClipboardTransferServiceSlave(IServiceLocator locator, IClipboardTransferService _service) {
		_locator = locator;
		_parentService = _service;
		_locator.hasService(IHandlerService.class);
	}

	@Override
	public ByteArrayTransfer getProjectItemNodeTransferInstance() {		
		return _parentService.getProjectItemNodeTransferInstance();
	}

}
