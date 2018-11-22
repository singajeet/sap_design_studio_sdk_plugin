package com.armin.sap.ds.builder.service;

import org.eclipse.core.resources.IProject;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.services.IServiceLocator;

import com.armin.sap.ds.builder.api.models.domain.Extension;
import com.armin.sap.ds.builder.api.models.domain.Group;
import com.armin.sap.ds.builder.api.models.domain.IModel;
import com.armin.sap.ds.builder.api.models.domain.RequireJSType;


public class ProjectFilesBuilderServiceSlave implements IProjectFilesBuilderService {
	
	private IServiceLocator _locator;
	private IProjectFilesBuilderService _parentService;
	
	public ProjectFilesBuilderServiceSlave(IServiceLocator locator, IProjectFilesBuilderService parentService) {
		_locator = locator;
		_parentService = parentService;
		_locator.hasService(IHandlerService.class);
		
	}
	
	/* (non-Javadoc)
	 * @see com.armin.sap.ds.builder.service.IProjectFilesBuilderService#saveExtension(com.armin.sap.ds.builder.api.models.IModel, org.eclipse.core.resources.IProject, java.util.Map)
	 */
	@Override
	public Extension saveExtension(IModel extensionModel, IProject project) {
		return _parentService.saveExtension(extensionModel, project);
	}
	
	/* (non-Javadoc)
	 * @see com.armin.sap.ds.builder.service.IProjectFilesBuilderService#saveComponent(com.armin.sap.ds.builder.api.models.IModel, com.armin.sap.ds.builder.api.models.IModel, org.eclipse.core.resources.IProject)
	 */
	@Override
	public IModel saveComponent(IModel componentModel, IModel extensionModel, IProject project) {
		return _parentService.saveComponent(componentModel, extensionModel, project);
	}
	
	/* (non-Javadoc)
	 * @see com.armin.sap.ds.builder.service.IProjectFilesBuilderService#setupAllFiles(com.armin.sap.ds.builder.api.models.IModel, com.armin.sap.ds.builder.api.models.IModel, org.eclipse.core.resources.IProject, java.util.Map)
	 */
	@Override
	public Extension setupAllFiles(IModel extensionModel, IModel componentModel, IProject project) {
		return _parentService.setupAllFiles(extensionModel, componentModel, project);
	}
	
	
	/* (non-Javadoc)
	 * @see com.armin.sap.ds.builder.service.IProjectFilesBuilderService#updateExtension(com.armin.sap.ds.builder.api.models.IModel, com.armin.sap.ds.builder.api.models.IModel, org.eclipse.core.resources.IProject, java.util.Map)
	 */
	@Override
	public Extension updateExtension(IModel extensionModel, IProject project) {
		return _parentService.updateExtension(extensionModel, project);
	}

	@Override
	public Group findGroup(String groupName, IModel extensionNode, IProject project) {
		// TODO Auto-generated method stub
		return _parentService.findGroup(groupName, extensionNode, project);
	}

	@Override
	public String setupRequireJSNode(IProject project, IModel componentNode, IModel extensionNode,
			RequireJSType jsNode) {
		return _parentService.setupRequireJSNode(project, componentNode, extensionNode, jsNode);
	}

	@Override
	public boolean createComponentSupportingFile(IProject project, String path, String content) {
		return _parentService.createComponentSupportingFile(project, path, content);
	}

	@Override
	public String setupCSSIncludeNode(IModel componentNode, IProject project, IModel extension) {
		return _parentService.setupCSSIncludeNode(componentNode, project, extension);
	}

	@Override
	public String setupIconFile(IProject project, IModel componentModel, IModel extensionModel) {
		return _parentService.setupIconFile(project, componentModel, extensionModel);
	}

		@Override
	public boolean saveExtensionFile(IProject project, String fileContent) {		
		return _parentService.saveExtensionFile(project, fileContent);
	}

	@Override
	public boolean saveGroup(String groupName, IModel extensionNode, IProject project) {
		return _parentService.saveGroup(groupName, extensionNode, project);
	}
	
	@Override
	public String[] setupAdvancedPropertySheet(IProject project, IModel componentModel, IModel extensionModel) {
		return _parentService.setupAdvancedPropertySheet(project, componentModel, extensionModel);
	}
}
