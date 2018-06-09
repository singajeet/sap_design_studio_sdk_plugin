package com.armin.sap.ds.ext.popup.actionproviders;



import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchCommandConstants;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.CloseResourceAction;
import org.eclipse.ui.actions.CopyResourceAction;
import org.eclipse.ui.actions.DeleteResourceAction;
import org.eclipse.ui.actions.OpenFileAction;
import org.eclipse.ui.actions.OpenResourceAction;
import org.eclipse.ui.actions.RetargetAction;
import org.eclipse.ui.internal.CloseEditorHandler;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonMenuConstants;

import com.armin.sap.ds.ext.navigator.Activator;

public class DesignStudioEditActionProvider extends CommonActionProvider {

	private static final String EDIT_MENU_NAME = "common.edit.menu";//$NON-NLS-1$
	private CopyResourceAction copyAction;
	private RetargetAction pasteAction;
	private DeleteResourceAction deleteAction;
//	private OpenFileAction openFileAction;
//	private OpenResourceAction openProjectAction;
//	private CloseResourceAction closeProjectAction;
	
	private Shell shell;
	private boolean contribute = false;
	
	public DesignStudioEditActionProvider() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void init(ICommonActionExtensionSite aSite) {
		super.init(aSite);
		shell =  aSite.getViewSite().getShell();
		contribute = true;
		makeActions();
	}
	
	@Override
	public void fillActionBars(IActionBars actionBars) {
		actionBars.setGlobalActionHandler(ActionFactory.COPY.getId(), copyAction);
		//actionBars.setGlobalActionHandler(ActionFactory.COPY.getId(), pasteAction);
		actionBars.setGlobalActionHandler(ActionFactory.COPY.getId(), deleteAction);
		updateActionBars();
	}

	@Override
	public void fillContextMenu(IMenuManager menu) {
		IMenuManager submenu = new MenuManager("Edit", EDIT_MENU_NAME);
		
		if(!contribute)
			return;
		
		IStructuredSelection selection = (IStructuredSelection) getContext().getSelection();
		boolean hasClosedProjects = false;
		@SuppressWarnings("rawtypes")
		Iterator resources = selection.iterator();
		while(resources.hasNext() && (!hasClosedProjects)) {
			Object next = resources.next();
			IProject project = null;
			
			if(next instanceof IProject) {
				project = (IProject) next;
			} else if (next instanceof IAdaptable) {
				project = (IProject)((IAdaptable) next).getAdapter(IProject.class);
			}
			
			if(project == null) {
				continue;
			}
			
			if(!project.isOpen()) {
				hasClosedProjects = true;
			}
		}
		
		if(!hasClosedProjects) {
			copyAction.selectionChanged(selection);
			deleteAction.selectionChanged(selection);
			submenu.add(new Separator(ICommonMenuConstants.GROUP_ADDITIONS));
			submenu.add(new Separator());
			submenu.add(copyAction);
			//submenu.add(pasteAction);
			submenu.add(deleteAction);
			menu.insertAfter(ICommonMenuConstants.GROUP_EDIT, submenu);
		}
	}
	
	protected void makeActions() {
		IShellProvider sp = new IShellProvider() {
			
			public Shell getShell() {
				return shell;
			}
		};
		
		//copy menu
		copyAction = new CopyResourceAction(sp);
		copyAction.setDisabledImageDescriptor(getImageDescriptor("images/copy.png"));
		copyAction.setImageDescriptor(getImageDescriptor("images/copy.png"));
		copyAction.setActionDefinitionId(IWorkbenchCommandConstants.FILE_REFRESH);
		
		//paste menu
//		pasteAction = new RetargetAction(copyAction.getR);
//		copyAction.setDisabledImageDescriptor(getImageDescriptor("images/copy.png"));
//		copyAction.setImageDescriptor(getImageDescriptor("images/copy.png"));
//		copyAction.setActionDefinitionId(IWorkbenchCommandConstants.FILE_REFRESH);
		
		deleteAction = new DeleteResourceAction(sp);
		deleteAction.setDisabledImageDescriptor(getImageDescriptor("images/delete.gif"));
		deleteAction.setImageDescriptor(getImageDescriptor("images/delete.gif"));
		deleteAction.setActionDefinitionId(IWorkbenchCommandConstants.FILE_REFRESH);
	}
	
	protected ImageDescriptor getImageDescriptor(String relativePath) {
		return Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, relativePath);
	}
	
	@Override
	public void updateActionBars() {
		IStructuredSelection selection = (IStructuredSelection) getContext().getSelection();
		copyAction.selectionChanged(selection);
	}

}
