package com.armin.sap.ds.builder.commands.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.graphiti.ui.editor.DiagramEditorInput;
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
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.editors.IReusableDSEditorPart;
import com.armin.sap.ds.builder.navigator.tree.ComponentNode;

public class OpenComponentDiagramHandler extends AbstractHandler {

	public static final String COMMAND_ID = "com.armin.sap.ds.builder.editors.component_editor";
	public static final String DIAGRAM_TYPE_ID = "com.armin.sap.ds.builder.diagram.type.component";
	public static final String DIAGRAM_TYPE_PROVIDER_ID = "com.armin.sap.ds.builder.diagram.type.provider.component";
	public static final String EDITOR_ID = DiagramEditor.DIAGRAM_EDITOR_ID;
	
	private ComponentNode _node;
	
	public OpenComponentDiagramHandler() {
		
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		IEditorInput input = null;
		Object selectObj = null;
		
		if(this._node != null) {
			input =  new DiagramEditorInput(_node.getDiagramURI(), DIAGRAM_TYPE_PROVIDER_ID);
			selectObj = this._node;
			
		} else {		
			ISelection selection = HandlerUtil.getCurrentSelection(event);
			
			if(selection != null && !selection.isEmpty() && selection instanceof IStructuredSelection) {
				selectObj = ((IStructuredSelection) selection).getFirstElement();
			} 			
			
			try {
				if(selectObj instanceof ComponentNode) {
					input =  new DiagramEditorInput(_node.getDiagramURI(), DIAGRAM_TYPE_PROVIDER_ID);
				}
			}catch(Exception e) {
				MessageDialog.open(MessageDialog.ERROR, null, "Invalid Selection", "Current selected 'Tree Node' is not valid for 'Component Editor'. Please select 'Component' node and try again!", SWT.SHEET);
				e.printStackTrace();
			}
		}
		boolean found  = false;
		
		IEditorReference[] erefs = page.getEditorReferences();
		for(IEditorReference ref : erefs) {
			IEditorPart editor = ref.getEditor(false);
			if(editor != null && editor instanceof IProject) {
				//ExtensionCollectionEditor extEditor = (ExtensionCollectionEditor)ref.getEditor(true);
				editor = ref.getEditor(true);
				found = true;
				boolean saved = true;
				
				if(editor.isDirty()) {
					saved = page.saveEditor(editor, true);
				}
				if(saved) {
					if(editor instanceof IReusableEditor) {
						page.reuseEditor((IReusableEditor)editor, input);
						((IReusableDSEditorPart)editor).showData();
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
				if(selectObj instanceof ComponentNode) {
						//page.openEditor(input, ComponentEditor.ID);
						//IDE.openEditor(page, input, ExtensionCollectionEditor.ID);
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(input, EDITOR_ID);
				}else {
						MessageDialog.open(MessageDialog.ERROR, null, "Editor Not Found!", "Unable to find editor for editing " + input.getName(), SWT.SHEET);
						
				}
			}catch(PartInitException e) {
				MessageDialog.open(MessageDialog.ERROR, null, "Component Editor Error", "Can not open 'Component Editor' due to following error: " + e.getMessage(), SWT.SHEET);
				throw new RuntimeException(e);
			}
		}

		return null;

	}

}
