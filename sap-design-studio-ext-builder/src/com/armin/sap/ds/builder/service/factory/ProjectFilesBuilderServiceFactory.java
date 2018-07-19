package com.armin.sap.ds.builder.service.factory;

import org.eclipse.ui.services.AbstractServiceFactory;
import org.eclipse.ui.services.IServiceLocator;

import com.armin.sap.ds.builder.service.IProjectFilesBuilderService;
import com.armin.sap.ds.builder.service.ProjectFilesBuilderService;
import com.armin.sap.ds.builder.service.ProjectFilesBuilderServiceSlave;

public class ProjectFilesBuilderServiceFactory extends AbstractServiceFactory {

	private IProjectFilesBuilderService _service;
	public ProjectFilesBuilderServiceFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object create(Class serviceInterface, IServiceLocator parentLocator, IServiceLocator locator) {
		if(IProjectFilesBuilderService.class.equals(serviceInterface))
			return null;
		
		_service = parentLocator.getService(IProjectFilesBuilderService.class);
		
		if(_service == null) {
			_service = new ProjectFilesBuilderService(locator);
			return _service;
		}
		return new ProjectFilesBuilderServiceSlave(locator, (IProjectFilesBuilderService) _service);
	}

}
