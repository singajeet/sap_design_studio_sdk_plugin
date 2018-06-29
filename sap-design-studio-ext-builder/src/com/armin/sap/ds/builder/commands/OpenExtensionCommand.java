package com.armin.sap.ds.builder.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IReusableEditor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileInPlaceEditorInput;

import com.armin.sap.ds.builder.editors.DesignStudioExtensionEditorInput;
import com.armin.sap.ds.builder.editors.ExtensionEditor;
import com.armin.sap.ds.builder.editors.IReusableDSEditor;
import com.armin.sap.ds.builder.navigator.tree.ExtensionCollectionNode;
import com.armin.sap.ds.builder.navigator.tree.IProjectItemNode;

public class OpenExtensionCommand extends AbstractHandler {

	public static final String ID = "com.armin.sap.ds.builder.commands.extension.open";
	
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
		} 
		
		IEditorInput input = null;
		try {
			switch(selectObj.getClass().getName()){
				case "com.armin.sap.ds.builder.navigator.tree.ExtensionCollectionNode":
					input =  new DesignStudioExtensionEditorInput(((ExtensionCollectionNode)selectObj)
													.getProject());
					break;
				default:
					IProject project = ((IProjectItemNode)selectObj).getProject();
					input = new FileInPlaceEditorInput(project.getFile(((IProjectItemNode)selectObj).getModel().getId()));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		boolean found  = false;
		
		IEditorReference[] erefs = page.getEditorReferences();
		for(IEditorReference ref : erefs) {
			IEditorPart editor = ref.getEditor(false);
			if(editor != null && editor instanceof IProject) {
				//ExtensionEditor extEditor = (ExtensionEditor)ref.getEditor(true);
				editor = ref.getEditor(true);
				found = true;
				boolean saved = true;
				
				if(editor.isDirty()) {
					saved = page.saveEditor(editor, true);
				}
				if(saved) {
					if(editor instanceof IReusableEditor) {
						page.reuseEditor((IReusableEditor)editor, input);
						((IReusableDSEditor)editor).showData();
					} else {
						found = false;
					}
				} else {
					boolean save = MessageDialog.open(MessageDialog.QUESTION, null, "Save File?", "Current changes are not saved yet. Save it?", SWT.SHEET);
					if(save)
						editor.doSaveAs();
					else
						found = false;
				}
			}
		}
		if(!found) {
			try {
				switch(selectObj.getClass().getName()){
					case "com.armin.sap.ds.builder.navigator.tree.ExtensionCollectionNode":
						page.openEditor(input, ExtensionEditor.ID);
						break;
					default:
						
						MessageDialog.open(MessageDialog.ERROR, null, "Editor Not Found!", "Unable to find editor for editing " + input.getName(), SWT.SHEET);
						break;
				}
			}catch(PartInitException e) {
				throw new RuntimeException(e);
			}
		}
		
		return null;
	}

}
