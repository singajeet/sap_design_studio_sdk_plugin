package com.armin.sap.ds.builder.service;

import java.net.URI;

import org.eclipse.core.resources.IProject;

import com.armin.sap.ds.builder.models.domain.IModel;

public interface IProjectService {
//	public void setModels(IModel extensionModel, IModel componentModel);
//	public IModel getExtensionModel();
//	public IModel getComponentModel();
	public IProject getProject();
	//public IProject createProject(String projectName, URI location) throws Exception;
	public IProject createProject(String projectName, URI location, IModel extensionModel, IModel componentModel) throws Exception;	
	public IModel addNewExtension(IModel extensionModel) throws Exception;
	public IModel addNewExtension(IModel extensionModel, IProject project) throws Exception;
	public IModel addNewComponent(IModel componentModel, IModel extensionModel) throws Exception;
	public IModel addNewComponent(IModel componentModel, IModel extensionModel, IProject project) throws Exception;
	public IModel addNewGroup(String groupName, IModel extensionNode, IProject project);	
	public IModel updateExtension(IModel extensionModel, IProject project);
	public boolean saveExtensionFile(String content);
	public boolean saveExtensionFile(String content, IProject project);
}
