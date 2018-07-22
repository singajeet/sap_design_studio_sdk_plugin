package com.armin.sap.ds.builder.service;

import java.net.URI;
import java.util.Map;

import javax.xml.bind.JAXBElement;

import org.eclipse.core.resources.IProject;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.services.IServiceLocator;

import com.armin.sap.ds.builder.api.models.Extension;
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
	
	public Map<String, JAXBElement<Extension>> getExtensionsMap(){
		return _parentService.getExtensionsMap();
	}
	
	public IProject createProject(String projectName, URI location) throws Exception{		
		return _parentService.createProject(projectName, location);
	}
	
	public IProject createProject(String projectName, URI location, IModel extensionModel, IModel componentModel) throws Exception{		
		return _parentService.createProject(projectName, location, extensionModel, componentModel);
	}
	
	public void addNewExtension(IModel extensionModel) throws Exception{
		_parentService.addNewExtension(extensionModel);
	}
	
	public void addNewExtension(IModel extensionModel, IProject project) throws Exception{
		_parentService.addNewExtension(extensionModel, project);
	}
	
	public void addNewComponent(IModel componentModel, IModel extensionModel) throws Exception{
		_parentService.addNewComponent(componentModel, extensionModel);
	}
	
	public void addNewComponent(IModel componentModel, IModel extensionModel, IProject project) throws Exception{
		_parentService.addNewComponent(componentModel, extensionModel, project);
	}
	
	public void addNewComponent(IModel componentModel, String extId) throws Exception{
		addNewComponent(componentModel, this.getExtension(extId));
	}
	
	public void addNewComponent(IModel componentModel, String extensionId, IProject project) throws Exception{
		addNewComponent(componentModel, this.getExtension(extensionId), project);
	}

	public Extension getExtension(String id){
		return _parentService.getExtension(id);		
	}

	@Override
	public void addNewGroup(String groupName, IModel extensionNode, IProject project) {
		_parentService.addNewGroup(groupName, extensionNode, project);		
	}

}
