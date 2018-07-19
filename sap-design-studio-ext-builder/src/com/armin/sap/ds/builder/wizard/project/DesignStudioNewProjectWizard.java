package com.armin.sap.ds.builder.wizard.project;

import java.net.URI;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import com.armin.sap.ds.builder.api.models.IModel;
import com.armin.sap.ds.builder.service.IProjectService;
import com.armin.sap.ds.builder.service.ProjectService;
import com.armin.sap.ds.builder.shared.ISharedData;
import com.armin.sap.ds.builder.shared.SharedData;


public class DesignStudioNewProjectWizard extends Wizard implements INewWizard, IExecutableExtension {

	private WizardNewProjectCreationPage _pageOne;
	private IWizardPage _pageTwo;
	private IWizardPage _pageThree;
	private ISharedData _data;
	
	private String PAGE1_NAME = "SAP Design Studio Extension Wizard";
	private String PAGE1_TITLE = "Project Name and Location";
	private String PAGE1_DESCRIPTION = "Generates boiler plate code for SAP Design Studio SDK Extensions Project";
	
	private String PAGE2_NAME = "SAP Design Studio Extension Wizard";
	private String PAGE2_TITLE = "Extension Details";
	private String PAGE2_DESCRIPTION = "Create a SAP Design Studio SDK Extension";	
	
	private String PAGE3_NAME = "SAP Design Studio Extension Wizard";
	private String PAGE3_TITLE = "Component Details";
	private String PAGE3_DESCRIPTION = "Create a SAP Design Studio SDK Component";
	private IConfigurationElement _configurationElement;
	
	private IProjectService _projectService;
	
	@SuppressWarnings("unused")
	private IWorkbench _workbench;
	@SuppressWarnings("unused")
	private IStructuredSelection _selection;
	
	public DesignStudioNewProjectWizard() {
		super();
		setWindowTitle(PAGE1_TITLE);		
		setNeedsProgressMonitor(true);
		_projectService = (IProjectService) PlatformUI.getWorkbench().getService(IProjectService.class);
		if(_projectService == null) {
			_projectService = new ProjectService();
		}
		_data = new SharedData();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		_workbench = workbench;
		_selection = selection;
	}

	@Override
	public boolean performFinish() {
		final String name = _pageOne.getProjectName();
		final URI location = _pageOne.getLocationURI();
//		if(!_pageOne.useDefaults()) {
//			location = _pageOne.getLocationURI();
//		}
		
		IModel extensionModel = ((DesignStudioNewProjectExtensionPage)_pageTwo).getModel();
		IModel componentModel = ((DesignStudioNewProjectComponentPage)_pageThree).getModel();
		
		
		WorkspaceJob job = new WorkspaceJob("Create project " + name) {
			public IStatus runInWorkspace(IProgressMonitor monitor) {
				try {
					//doFinish(name, location, extensionModel, componentModel, monitor);
					
					monitor.beginTask("Creating project " + name + "...", 2);
					IProject project = _projectService.createProject(name, location, extensionModel, componentModel);
					monitor.worked(1);
					monitor.setTaskName("Opening project " + name + "...");
					
					project.open(monitor);
					project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
					
					BasicNewProjectResourceWizard.updatePerspective(_configurationElement);
					monitor.worked(1);
					
					return Status.OK_STATUS;
				} catch (Exception e) {
					e.printStackTrace();
					MessageDialog.openError(getShell(), "Error", e.getMessage());
				} finally {
					if(monitor != null)
						monitor.done();					
				}
				return Status.CANCEL_STATUS;
			}
		};
	
		job.setRule(ResourcesPlugin.getWorkspace().getRoot());
		job.schedule();
	
		return true;
	}
	
	@Override
	public void addPages() {		
		super.addPages();
		
		_pageOne = new WizardNewProjectCreationPage(PAGE1_NAME);
		_pageOne.setTitle(PAGE1_TITLE);
		_pageOne.setDescription(PAGE1_DESCRIPTION);
		addPage(_pageOne);
		
		_pageTwo = new DesignStudioNewProjectExtensionPage(PAGE2_NAME, _data);
		_pageTwo.setTitle(PAGE2_TITLE);
		_pageTwo.setDescription(PAGE2_DESCRIPTION);
		addPage(_pageTwo);
		
		_pageThree = new DesignStudioNewProjectComponentPage(PAGE3_NAME, _data);
		_pageThree.setTitle(PAGE3_TITLE);
		_pageThree.setDescription(PAGE3_DESCRIPTION);
		addPage(_pageThree);
		
	}

	@Override
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
			throws CoreException {
		_configurationElement = config;
		
	}

}
