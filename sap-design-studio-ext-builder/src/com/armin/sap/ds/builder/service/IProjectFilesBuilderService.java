package com.armin.sap.ds.builder.service;

import org.eclipse.core.resources.IProject;

import com.armin.sap.ds.builder.models.domain.Extension;
import com.armin.sap.ds.builder.models.domain.Group;
import com.armin.sap.ds.builder.models.domain.IModel;
import com.armin.sap.ds.builder.models.domain.RequireJSType;

public interface IProjectFilesBuilderService {

	Extension saveExtension(IModel extensionModel, IProject project);
	
	boolean saveExtensionFile(IProject project, String fileContent);

	IModel saveComponent(IModel componentModel, IModel extensionModel, IProject project);

	Extension setupAllFiles(IModel extensionModel, IModel componentModel, IProject project);

	Extension updateExtension(IModel extensionModel, IProject project);
	
	Group findGroup(String groupName, IModel extensionNode, IProject project);
	
	boolean saveGroup(String groupName, IModel extensionNode, IProject project);
	
	String setupRequireJSNode(IProject project, IModel componentNode, IModel extensionNode, RequireJSType jsNode);
	
	boolean createComponentSupportingFile(IProject project, String path, String content);
	
	String setupCSSIncludeNode(IModel componentNode, IProject project, IModel extension);
	
	String setupIconFile(IProject project, IModel componentModel, IModel extensionModel);
	
	String[] setupAdvancedPropertySheet(IProject project, IModel componentModel, IModel extensionModel);
}