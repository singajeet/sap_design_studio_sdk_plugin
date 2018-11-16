package com.armin.sap.ds.builder.wizard.component;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.api.common.FileService;
import com.armin.sap.ds.builder.api.models.Component;
import com.armin.sap.ds.builder.navigator.tree.ComponentNode;
import com.armin.sap.ds.builder.navigator.tree.ExtensionNode;
import com.armin.sap.ds.builder.navigator.tree.GroupNode;
import com.armin.sap.ds.builder.navigator.tree.IProjectItemNode;
import com.armin.sap.ds.builder.navigator.tree.TreeNodeAccessMode;
import com.armin.sap.ds.builder.service.IProjectService;
import com.armin.sap.ds.builder.service.ProjectService;


public class ComponentWizard extends Wizard implements INewWizard {

	
	private IStructuredSelection _selection;
	private WizardPage _pageOne;	
	private GroupNode _parentTreeNode;
	private IProjectService _projectService;
	private ILog logger;
	
	public ComponentWizard() {
		setWindowTitle("New Component");
		setNeedsProgressMonitor(true);
		_projectService = (IProjectService) PlatformUI.getWorkbench().getService(IProjectService.class);
		if(_projectService == null) {
			_projectService = new ProjectService();
		}
		logger = Activator.getDefault().getLog();
		logger.log(new Status(IStatus.OK, this.getClass().getName(), "Object created"));
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {	
	    _selection = selection;	    
	    
	    logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Init() started"));
	    
	    if(_selection != null && _selection.isEmpty() == false 
				&& _selection instanceof IStructuredSelection ) {
			if(_selection.size() > 1)
				return;
			if(_selection.size() <= 0)
				return;
			Object selectedObj = _selection.getFirstElement();
			if(selectedObj instanceof GroupNode) {				
				_parentTreeNode = (GroupNode)selectedObj;							
				logger.log(new Status(IStatus.INFO, this.getClass().getName(), 
						"Selected object is of type: GroupNode with ID=" + _parentTreeNode.getName()));
			}
		}
	    logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Init() completed"));
	}	
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		super.addPages();
		
		_pageOne = new ComponentCreationPage(_selection);
		addPage(_pageOne);
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Page Added to Wizard: " + _pageOne.getTitle()));
	}

	@Override
	public boolean performFinish() {
		logger.log(new Status(IStatus.OK, this.getClass().getName(), "performFinish() started"));
		
		Component component = (Component)((ComponentCreationPage)_pageOne).getModel();
		IProject project = _parentTreeNode.getProject();
		
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Component model instance: " + component.getId()));
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Project instance: " + project.getName()));
		
		WorkspaceJob job = new WorkspaceJob("Create component under selected extension") {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) {
				try {
					logger.log(new Status(IStatus.INFO, this.getClass().getName(), "WorkspaceJob started: " + this.getName()));
					
					//Component comp = (Component)((ComponentCreationPage)_pageOne).getModel();
					
					monitor.beginTask("Creating component - " + component.getId(), 2);
					
					if(component.getGroup() == null || component.getGroup().isEmpty()) {
						component.setGroup(_parentTreeNode.getModel().getId().toUpperCase());
					}
					
					if(component.getPropertySheetPath() != null && !component.getPropertySheetPath().isEmpty()) {
						String extId = ((ExtensionNode)_parentTreeNode.getParent(null)).getExtension().getId();
						component.setPropertySheetPath(extId + "/" + component.getPropertySheetPath());
					}
					
					monitor.beginTask("Changing access mode of GroupNode to EDIT - " + component.getId(), 2);					
					_parentTreeNode.setAccessMode(TreeNodeAccessMode.EDIT);
					
					//IModel t_component = _projectService.addNewComponent(component, ((ExtensionNode)_parentTreeNode.getParent(this)).getExtension(), project);
					monitor.worked(1);
					
					monitor.setTaskName("Adding component to Group Node: " + ((GroupNode)_parentTreeNode).getModel().getId());
					logger.log(new Status(IStatus.INFO, this.getClass().getName(), 
							"Adding New Component [Id: " + component.getId() + "] to Group [Id: " + ((GroupNode)_parentTreeNode).getModel().getId() + "]"));
					IProjectItemNode compNode = _parentTreeNode.addComponent(component);
					this.addDiagram(component, (ComponentNode)compNode);
					
					_parentTreeNode.setAccessMode(TreeNodeAccessMode.READ_ONLY);
					
					if(_parentTreeNode.exists("No components found!") && _parentTreeNode.getChildren(this).length > 1) {
						_parentTreeNode.removeItem("No components found!");
					}
					monitor.worked(1);					
					project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
					logger.log(new Status(IStatus.OK, this.getClass().getName(), "WorkspaceJob Completed Successfully!"));
					
					return Status.OK_STATUS;
				}catch(Exception e) {
					e.printStackTrace();
					logger.log(new Status(IStatus.ERROR, this.getClass().getName(), "Workspace Job failed with Error: " + e.getMessage()));
					MessageDialog.openError(getShell(), "Error", e.getMessage());
				}finally {
					monitor.done();
				}
				logger.log(new Status(IStatus.CANCEL, this.getClass().getName(), "WorkspaceJob was not completed!"));
				return Status.CANCEL_STATUS;
			}

			private void addDiagram(Component component, ComponentNode compNode) {
				String diagramTypeId = "com.armin.sap.ds.builder.diagram.type.component";
				String diagramName = component.getId();
				IFolder diagramFolder = null;
				String extId = ((ExtensionNode)_parentTreeNode.getParent(null)).getExtension().getId();
				String folderPath = extId + "/" + component.getId() + "/res/diagrams";
				
				Diagram diagram = Graphiti.getPeCreateService().createDiagram(diagramTypeId, diagramName, true);
				if (diagramFolder == null) {
					diagramFolder = project.getFolder(folderPath); //$NON-NLS-1$
				}
				
				//String editorID = DiagramEditor.DIAGRAM_EDITOR_ID;
				String editorExtension = "diagram"; //$NON-NLS-1$
				//String diagramTypeProviderId = GraphitiUi.getExtensionManager().getDiagramTypeProviderId(diagramTypeId);
				//String namingConventionID = diagramTypeProviderId + ".editor"; //$NON-NLS-1$
				//IEditorDescriptor specificEditor = PlatformUI.getWorkbench().getEditorRegistry().findEditor(namingConventionID);
				
				IFile diagramFile = diagramFolder.getFile(diagramName + "." + editorExtension); //$NON-NLS-1$
				URI uri = URI.createPlatformResourceURI(diagramFile.getFullPath().toString(), true);
				compNode.setDiagramURI(uri);
				FileService.createEmfFileForDiagram(uri, diagram);
			}			
		};
		
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), 
				"Project " + project.getName() + " has been set as rule for WorkspaceJob"));
		job.schedule();
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Workspace job has been scheduled"));
		
		return true;		
	}
	
}
