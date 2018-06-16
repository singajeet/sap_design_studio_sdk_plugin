package com.armin.sap.ds.ext.navigator.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

import com.armin.sap.ds.ext.navigator.elements.ExtensionCollectionNode;
import com.armin.sap.ds.ext.plugin.editors.ExtensionEditor;
import com.armin.sap.ds.ext.plugin.editors.ExtensionEditorInput;

public class OpenExtensionCommand extends AbstractHandler {

	public static final String ID = "com.armin.sap.ds.commands.extension.open";
	
	public OpenExtensionCommand() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		IWorkbenchPage page = window.getActivePage();
		
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		
		Object selectObj = null;
		
		if(selection != null && !selection.isEmpty() && selection instanceof IStructuredSelection) {
			selectObj = ((IStructuredSelection) selection).getFirstElement();
		} else {
			selectObj = new ExtensionCollectionNode();
		}
		
		ExtensionCollectionNode inputObject = (ExtensionCollectionNode)selectObj;		
		ExtensionEditorInput input = new ExtensionEditorInput(inputObject);
		
		boolean found  = false;
		
		IEditorReference[] erefs = page.getEditorReferences();
		for(IEditorReference ref : erefs) {
			IEditorPart editor = ref.getEditor(false);
			if(editor != null && editor instanceof IProject) {
				ExtensionEditor extEditor = (ExtensionEditor)ref.getEditor(true);
				found = true;
				boolean saved = true;
				
				if(extEditor.isDirty()) {
					saved = page.saveEditor(extEditor, true);
				}
				if(saved) {
					page.reuseEditor(extEditor, input);
					extEditor.showData();
				}
			}
		}
		if(!found) {
			try {
				page.openEditor(input, ExtensionEditor.ID);
			}catch(PartInitException e) {
				throw new RuntimeException(e);
			}
		}
		
		return null;
	}

}
