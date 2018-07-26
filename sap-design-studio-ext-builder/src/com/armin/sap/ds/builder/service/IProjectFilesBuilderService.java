package com.armin.sap.ds.builder.service;

import javax.xml.bind.JAXBElement;

import org.eclipse.core.resources.IProject;

import com.armin.sap.ds.builder.api.models.Extension;
import com.armin.sap.ds.builder.api.models.Group;
import com.armin.sap.ds.builder.api.models.IModel;
import com.armin.sap.ds.builder.api.models.RequireJSType;

public interface IProjectFilesBuilderService {

	JAXBElement<Extension> saveExtension(IModel extensionModel, IProject project, JAXBElement<Extension> rootElement);

	IModel saveComponent(IModel componentModel, IModel extensionModel, IProject project, JAXBElement<Extension> rootElement);

	JAXBElement<Extension> setupAllFiles(IModel extensionModel, IModel componentModel, IProject project, JAXBElement<Extension> rootElement);

	JAXBElement<Extension> updateExtension(IModel componentModel, IModel extensionModel, IProject project, JAXBElement<Extension> rootElement);
	
	Group buildAndSaveGroup(String groupName, IModel extensionNode, IProject project, JAXBElement<Extension> rootElement);
	
	String setupRequireJSNode(IProject project, IModel componentNode, IModel extensionNode, RequireJSType jsNode);
	
	boolean createComponentSupportingFile(IProject project, String path, String content);
	
	String setupCSSIncludeNode(IModel componentNode, IProject project, IModel extension);
	
	String setupIconFile(IProject project, IModel componentModel, IModel extensionModel);
}