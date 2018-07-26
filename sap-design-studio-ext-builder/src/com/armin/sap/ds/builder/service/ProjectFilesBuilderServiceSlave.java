package com.armin.sap.ds.builder.service;

import javax.xml.bind.JAXBElement;

import org.eclipse.core.resources.IProject;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.services.IServiceLocator;

import com.armin.sap.ds.builder.api.models.Extension;
import com.armin.sap.ds.builder.api.models.Group;
import com.armin.sap.ds.builder.api.models.IModel;
import com.armin.sap.ds.builder.api.models.RequireJSType;


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
	public JAXBElement<Extension> saveExtension(IModel extensionModel, IProject project, JAXBElement<Extension> rootElement) {
		return _parentService.saveExtension(extensionModel, project, rootElement);
	}
	
	/* (non-Javadoc)
	 * @see com.armin.sap.ds.builder.service.IProjectFilesBuilderService#saveComponent(com.armin.sap.ds.builder.api.models.IModel, com.armin.sap.ds.builder.api.models.IModel, org.eclipse.core.resources.IProject)
	 */
	@Override
	public IModel saveComponent(IModel componentModel, IModel extensionModel, IProject project, JAXBElement<Extension> root) {
		return _parentService.saveComponent(componentModel, extensionModel, project, root);
	}
	
	/* (non-Javadoc)
	 * @see com.armin.sap.ds.builder.service.IProjectFilesBuilderService#setupAllFiles(com.armin.sap.ds.builder.api.models.IModel, com.armin.sap.ds.builder.api.models.IModel, org.eclipse.core.resources.IProject, java.util.Map)
	 */
	@Override
	public JAXBElement<Extension> setupAllFiles(IModel extensionModel, IModel componentModel, IProject project, JAXBElement<Extension> rootElement) {
		return _parentService.setupAllFiles(extensionModel, componentModel, project, rootElement);
	}
	
	
	/* (non-Javadoc)
	 * @see com.armin.sap.ds.builder.service.IProjectFilesBuilderService#updateExtension(com.armin.sap.ds.builder.api.models.IModel, com.armin.sap.ds.builder.api.models.IModel, org.eclipse.core.resources.IProject, java.util.Map)
	 */
	@Override
	public JAXBElement<Extension> updateExtension(IModel componentModel, IModel extensionModel, IProject project, JAXBElement<Extension> root) {
		return _parentService.updateExtension(componentModel, extensionModel, project, root);
	}

	@Override
	public Group buildAndSaveGroup(String groupName, IModel extensionNode, IProject project, JAXBElement<Extension> root) {
		// TODO Auto-generated method stub
		return _parentService.buildAndSaveGroup(groupName, extensionNode, project, root);
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
	
}
