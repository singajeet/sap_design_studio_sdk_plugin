package com.armin.sap.ds.builder.service.factory;

import org.eclipse.ui.services.AbstractServiceFactory;
import org.eclipse.ui.services.IServiceLocator;

import com.armin.sap.ds.builder.service.IProjectFilesReaderService;
import com.armin.sap.ds.builder.service.ProjectFilesReaderService;
import com.armin.sap.ds.builder.service.ProjectFilesReaderServiceSlave;

public class ProjectFilesReaderServiceFactory extends AbstractServiceFactory {

	private IProjectFilesReaderService _service;
	public ProjectFilesReaderServiceFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object create(Class serviceInterface, IServiceLocator parentLocator, IServiceLocator locator) {
		if(!IProjectFilesReaderService.class.equals(serviceInterface))
			return null;
		
		_service = parentLocator.getService(IProjectFilesReaderService.class);
		
		if(_service == null) {
			_service = new ProjectFilesReaderService(locator);
			return _service;
		}
		return new ProjectFilesReaderServiceSlave(locator, (IProjectFilesReaderService)_service);
	}

}
