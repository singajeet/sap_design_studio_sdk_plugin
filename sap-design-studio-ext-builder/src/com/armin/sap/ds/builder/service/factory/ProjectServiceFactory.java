package com.armin.sap.ds.builder.service.factory;

import org.eclipse.ui.services.AbstractServiceFactory;
import org.eclipse.ui.services.IServiceLocator;

import com.armin.sap.ds.builder.service.IProjectService;
import com.armin.sap.ds.builder.service.ProjectService;
import com.armin.sap.ds.builder.service.ProjectServiceSlave;

public class ProjectServiceFactory extends AbstractServiceFactory {

	private IProjectService _projectService;
	
	public ProjectServiceFactory() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Object create(Class serviceInterface, IServiceLocator parentLocator, IServiceLocator locator) {
		if(!IProjectService.class.equals(serviceInterface))
			return null;
		_projectService = parentLocator.getService(IProjectService.class);
		
		if(_projectService == null) {
			_projectService = new ProjectService(locator);
			return _projectService;
		}		
		return new ProjectServiceSlave(locator, (IProjectService) _projectService);
	}

}
