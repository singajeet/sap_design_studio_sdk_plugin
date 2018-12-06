package com.armin.sap.ds.builder.ui.wizards.project;

import java.net.URI;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
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
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.core.common.FileService;
import com.armin.sap.ds.builder.core.common.shared.ISharedData;
import com.armin.sap.ds.builder.core.common.shared.SharedData;
import com.armin.sap.ds.builder.models.domain.Component;
import com.armin.sap.ds.builder.models.domain.Extension;
import com.armin.sap.ds.builder.service.IProjectService;
import com.armin.sap.ds.builder.service.ProjectService;


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
		
		Extension extensionModel = (Extension)((DesignStudioNewProjectExtensionPage)_pageTwo).getModel();
		Component componentModel = (Component)((DesignStudioNewProjectComponentPage)_pageThree).getModel();
		
		
		WorkspaceJob job = new WorkspaceJob("Create project " + name) {
			public IStatus runInWorkspace(IProgressMonitor monitor) {
				try {
					//doFinish(name, location, extensionModel, componentModel, monitor);
					
					if(componentModel.getPropertySheetPath() != null && !componentModel.getPropertySheetPath().isEmpty()) {
						componentModel.setPropertySheetPath(extensionModel.getId() + "/" + componentModel.getPropertySheetPath());
					}
					
					monitor.beginTask("Creating project " + name + "...", 2);
					IProject project = _projectService.createProject(name, location, extensionModel, componentModel);
					addDiagram(componentModel, extensionModel, project);
					monitor.worked(1);
					monitor.setTaskName("Opening project " + name + "...");
					
					project.open(monitor);
					project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
					
					BasicNewProjectResourceWizard.updatePerspective(_configurationElement);
					monitor.worked(1);
					
					return Status.OK_STATUS;
				} catch (Exception e) {
					e.printStackTrace();
					MessageDialog.openError(Activator.getDefault().getWorkbench().getDisplay().getActiveShell(), "Error", e.getMessage());
				} finally {
					if(monitor != null)
						monitor.done();					
				}
				return Status.CANCEL_STATUS;
			}
			
			private void addDiagram(Component component, Extension ext, IProject project) {
				
				String diagramTypeId = "com.armin.sap.ds.builder.diagram.type.component";
				String diagramName = component.getId();
				IFolder diagramFolder = null;
				String extId = ext.getId();
				String folderPath = extId + "/" + component.getId() + "/res/diagrams";
				
				Diagram diagram = Graphiti.getPeCreateService().createDiagram(diagramTypeId, diagramName, true);
				if (diagramFolder == null) {
					diagramFolder = project.getFolder(folderPath); //$NON-NLS-1$
				}
				
				String editorExtension = "diagram"; //$NON-NLS-1$
				IFile diagramFile = diagramFolder.getFile(diagramName + "." + editorExtension); //$NON-NLS-1$
				org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(diagramFile.getFullPath().toString(), true);				
				FileService.createEmfFileForDiagram(uri, diagram);
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
