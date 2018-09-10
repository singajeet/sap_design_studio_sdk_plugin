package com.armin.sap.ds.builder.providers;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonViewerWorkbenchSite;

import com.armin.sap.ds.builder.command.CommandFactory;
import com.armin.sap.ds.builder.commands.handlers.OpenExtensionCollectionHandler;
import com.armin.sap.ds.builder.commands.handlers.OpenExtensionSourceHandler;
import com.armin.sap.ds.builder.navigator.tree.ExtensionCollectionNode;
import com.armin.sap.ds.builder.navigator.tree.ExtensionNode;

public class ActionProvider extends CommonActionProvider {


	
	private Command _cmd;
	
	public ActionProvider() {	
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.navigator.CommonActionProvider#init(org.eclipse.ui.navigator.ICommonActionExtensionSite)
	 */
	@Override
	public void init(ICommonActionExtensionSite aSite) {
		super.init(aSite);		
		
		
		IDoubleClickListener doubleClickListener = new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {				
				
				IStructuredSelection selection = (IStructuredSelection)event.getSelection();
				
				if(selection.getFirstElement() instanceof ExtensionCollectionNode) {
					if(aSite.getViewSite() instanceof ICommonViewerWorkbenchSite) {
						_cmd = CommandFactory.getFactory().getCommand(OpenExtensionCollectionHandler.COMMAND_ID);			
					}
					
					ExecutionEvent cmdEvent = CommandFactory.getFactory().getDefaultExecutionEvent();
					try {
						_cmd.executeWithChecks(cmdEvent);
					} catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
					
						e.printStackTrace();
					}
				} else if(selection.getFirstElement() instanceof ExtensionNode) {
					if(aSite.getViewSite() instanceof ICommonViewerWorkbenchSite) {
						_cmd = CommandFactory.getFactory().getCommand(OpenExtensionSourceHandler.COMMAND_ID);			
					}
					
					ExecutionEvent cmdEvent = CommandFactory.getFactory().getDefaultExecutionEvent();
					try {
						_cmd.executeWithChecks(cmdEvent);
					} catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
					
						e.printStackTrace();
					}
				}
			}
			
		};
		aSite.getStructuredViewer().addDoubleClickListener(doubleClickListener);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.actions.ActionGroup#fillContextMenu(org.eclipse.jface.action.IMenuManager)
	 */
	@Override
	public void fillContextMenu(IMenuManager menu) {		
		super.fillContextMenu(menu);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.actions.ActionGroup#fillActionBars(org.eclipse.ui.IActionBars)
	 */
	@Override
	public void fillActionBars(IActionBars actionBars) {		
		super.fillActionBars(actionBars);		
	}

	
	
}
