package com.armin.sap.ds.builder.service;

import java.net.URI;
import java.util.Map;

import javax.xml.bind.JAXBElement;

import org.eclipse.core.resources.IProject;

import com.armin.sap.ds.builder.api.models.Extension;
import com.armin.sap.ds.builder.api.models.IModel;

public interface IProjectService {
	public void setModels(IModel extensionModel, IModel componentModel);
	public IModel getExtensionModel();
	public IModel getComponentModel();
	public IProject getProject();
	public Map<String, JAXBElement<Extension>> getExtensionsMap();
	public IProject createProject(String projectName, URI location) throws Exception;
	public IProject createProject(String projectName, URI location, IModel extensionModel, IModel componentModel) throws Exception;
	public void addNewExtension(IModel extensionModel) throws Exception;
	public void addNewExtension(IModel extensionModel, IProject project) throws Exception;
	public void addNewComponent(IModel componentModel, IModel extensionModel) throws Exception;
	public void addNewComponent(IModel componentModel, IModel extensionModel, IProject project) throws Exception;
	public void addNewComponent(IModel componentModel, String extId) throws Exception;
	public void addNewComponent(IModel componentModel, String extensionId, IProject project) throws Exception;
	public void addNewGroup(String groupName, IModel extensionNode, IProject project);
	public Extension getExtension(String id);
}
