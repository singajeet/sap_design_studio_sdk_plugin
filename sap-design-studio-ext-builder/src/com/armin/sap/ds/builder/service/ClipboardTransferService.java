package com.armin.sap.ds.builder.service;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.services.IServiceLocator;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.dnd.ProjectItemNodeTransfer;

public class ClipboardTransferService implements IClipboardTransferService {

	
	private ILog logger;
	private ProjectItemNodeTransfer _transfer;		
	
	public ClipboardTransferService() {
		logger = Activator.getDefault().getLog();		
	}
	
	public ClipboardTransferService(IServiceLocator locator) {
		logger = Activator.getDefault().getLog();		
	}

	
	@Override
	public ProjectItemNodeTransfer getProjectItemNodeTransferInstance() {		
		if(_transfer == null) {
			logger.log(new Status(IStatus.OK, this.getClass().getName(), "ProjectItemNodeTransferService instance created"));
			_transfer = ProjectItemNodeTransfer.getInstance();
		}
		return _transfer;
	}
}
