package com.armin.sap.ds.builder.service;

import java.util.Map;

import javax.xml.bind.JAXBElement;

import org.eclipse.core.resources.IProject;

import com.armin.sap.ds.builder.api.models.Extension;
import com.armin.sap.ds.builder.api.models.IModel;
import com.armin.sap.ds.builder.api.models.ObjectFactory;

public interface IProjectFilesBuilderService {

	void saveExtension(IModel extensionModel, IProject project, Map<String, JAXBElement<Extension>> extensions);

	void saveComponent(IModel componentModel, IModel extensionModel, IProject project);

	void setupAllFiles(IModel extensionModel, IModel componentModel, IProject project,
			Map<String, JAXBElement<Extension>> extensions);

	void updateExtension(IModel componentModel, IModel extensionModel, IProject project,
			Map<String, JAXBElement<Extension>> extensions);
	public void setupComponentGroupNode(IModel componentNode, IModel extensionNode, ObjectFactory factory);
}