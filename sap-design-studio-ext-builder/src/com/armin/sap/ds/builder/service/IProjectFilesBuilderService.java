package com.armin.sap.ds.builder.service;

import javax.xml.bind.JAXBElement;

import org.eclipse.core.resources.IProject;

import com.armin.sap.ds.builder.api.models.Extension;
import com.armin.sap.ds.builder.api.models.IModel;

public interface IProjectFilesBuilderService {

	JAXBElement<Extension> saveExtension(IModel extensionModel, IProject project);

	JAXBElement<Extension> saveComponent(IModel componentModel, IModel extensionModel, IProject project, JAXBElement<Extension> rootElement);

	JAXBElement<Extension> setupAllFiles(IModel extensionModel, IModel componentModel, IProject project);

	JAXBElement<Extension> updateExtension(IModel componentModel, IModel extensionModel, IProject project, JAXBElement<Extension> rootElement);
	
	JAXBElement<Extension> buildAndSaveGroup(String groupName, IModel extensionNode, IProject project, JAXBElement<Extension> rootElement);
}