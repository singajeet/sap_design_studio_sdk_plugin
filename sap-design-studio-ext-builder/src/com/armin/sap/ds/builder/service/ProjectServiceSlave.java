package com.armin.sap.ds.builder.service;

import java.net.URI;

import org.eclipse.core.resources.IProject;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.services.IServiceLocator;

import com.armin.sap.ds.builder.api.models.IModel;


public class ProjectServiceSlave implements IProjectService {
	
	private IServiceLocator _locator;
	private IProjectService _parentService;
	//private static ProjectService _singleton;
	
	public ProjectServiceSlave(IServiceLocator locator, IProjectService parentService) {
		_locator = locator;
		_parentService = parentService;
		_locator.hasService(IHandlerService.class);
	}
	
//	public static ProjectService get() {
//		if(_singleton == null) {
//			_singleton = new ProjectService();
//		}
//		
//		return _singleton;
//	}
	
	public void setModels(IModel extensionModel, IModel componentModel) {
		_parentService.setModels(extensionModel, componentModel);
	}
	
	public IModel getExtensionModel() {
		return _parentService.getExtensionModel();
	}
	
	public IModel getComponentModel() {
		return _parentService.getComponentModel();
	}
	
	public IProject getProject() {
		return _parentService.getProject();		
	}
	
	public IProject createProject(String projectName, URI location) throws Exception{		
		return _parentService.createProject(projectName, location);
	}
	
	public IProject createProject(String projectName, URI location, IModel extensionModel, IModel componentModel) throws Exception{		
		return _parentService.createProject(projectName, location, extensionModel, componentModel);
	}
	
	public IModel addNewExtension(IModel extensionModel) throws Exception{
		return _parentService.addNewExtension(extensionModel);
	}
	
	public IModel addNewExtension(IModel extensionModel, IProject project) throws Exception{
		return _parentService.addNewExtension(extensionModel, project);
	}
	
	public IModel addNewComponent(IModel componentModel, IModel extensionModel) throws Exception{
		return _parentService.addNewComponent(componentModel, extensionModel);
	}
	
	public IModel addNewComponent(IModel componentModel, IModel extensionModel, IProject project) throws Exception{
		return _parentService.addNewComponent(componentModel, extensionModel, project);
	}
	
		@Override
	public IModel addNewGroup(String groupName, IModel extensionNode, IProject project) {
		return _parentService.addNewGroup(groupName, extensionNode, project);		
	}

}
