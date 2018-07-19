package com.armin.sap.ds.builder.service;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.text.StringSubstitutor;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.services.IServiceLocator;

import com.armin.sap.ds.builder.api.models.Component;
import com.armin.sap.ds.builder.api.models.ComponentExtended;
import com.armin.sap.ds.builder.api.models.Extension;
import com.armin.sap.ds.builder.api.models.Group;
import com.armin.sap.ds.builder.api.models.IModel;
import com.armin.sap.ds.builder.api.models.ObjectFactory;
import com.armin.sap.ds.builder.api.models.RequireJSType;
import com.armin.sap.ds.builder.api.models.UI5Mode;
import com.armin.sap.ds.builder.preferences.Settings;


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
	public void saveExtension(IModel extensionModel, IProject project, Map<String, JAXBElement<Extension>> extensions) {
		_parentService.saveExtension(extensionModel, project, extensions);
	}
	
	/* (non-Javadoc)
	 * @see com.armin.sap.ds.builder.service.IProjectFilesBuilderService#saveComponent(com.armin.sap.ds.builder.api.models.IModel, com.armin.sap.ds.builder.api.models.IModel, org.eclipse.core.resources.IProject)
	 */
	@Override
	public void saveComponent(IModel componentModel, IModel extensionModel, IProject project) {
		_parentService.saveComponent(componentModel, extensionModel, project);
	}
	
	/* (non-Javadoc)
	 * @see com.armin.sap.ds.builder.service.IProjectFilesBuilderService#setupAllFiles(com.armin.sap.ds.builder.api.models.IModel, com.armin.sap.ds.builder.api.models.IModel, org.eclipse.core.resources.IProject, java.util.Map)
	 */
	@Override
	public void setupAllFiles(IModel extensionModel, IModel componentModel, IProject project, Map<String, JAXBElement<Extension>> extensions) {
		_parentService.setupAllFiles(extensionModel, componentModel, project, extensions);
	}
	
	
	/* (non-Javadoc)
	 * @see com.armin.sap.ds.builder.service.IProjectFilesBuilderService#updateExtension(com.armin.sap.ds.builder.api.models.IModel, com.armin.sap.ds.builder.api.models.IModel, org.eclipse.core.resources.IProject, java.util.Map)
	 */
	@Override
	public void updateExtension(IModel componentModel, IModel extensionModel, IProject project, Map<String, JAXBElement<Extension>> extensions) {
		_parentService.updateExtension(componentModel, extensionModel, project, extensions);
	}

	@Override
	public void setupComponentGroupNode(IModel componentNode, IModel extensionNode, ObjectFactory factory) {
		// TODO Auto-generated method stub
		_parentService.setupComponentGroupNode(componentNode, extensionNode, factory);
	}
	
}
