package com.armin.sap.ds.builder.commands.handlers.file;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.graphiti.ui.editor.DiagramEditorInput;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import com.armin.sap.ds.builder.editors.component.ComponentDiagramEditor;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ComponentNode;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ExtensionNode;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.GroupNode;

public class OpenComponentDiagramHandler extends AbstractHandler {

	public static final String COMMAND_ID = "com.armin.sap.ds.builder.commands.component.diagram.open";
	public static final String DIAGRAM_TYPE_ID = "com.armin.sap.ds.builder.diagram.type.component";
	public static final String DIAGRAM_TYPE_PROVIDER_ID = "com.armin.sap.ds.builder.diagram.type.provider.component";
	public static final String EDITOR_ID = ComponentDiagramEditor.DIAGRAM_EDITOR_ID;
	
	private ComponentNode _node;
	
	public OpenComponentDiagramHandler() {
		
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {		
		IEditorInput input = null;
		Object selectObj = null;	
		
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if(selection != null && !selection.isEmpty() && selection instanceof IStructuredSelection) {
			selectObj = ((IStructuredSelection) selection).getFirstElement();
		} 			
		
		try {
			if(selectObj instanceof ComponentNode) {
				_node = (ComponentNode)selectObj;
			}
		}catch(Exception e) {
			MessageDialog.open(MessageDialog.ERROR, null, "Invalid Selection", "Current selected 'Tree Node' is not valid for 'Component Editor'. Please select 'Component' node and try again!", SWT.SHEET);
			e.printStackTrace();
		}

		
		try {
			if(selectObj instanceof ComponentNode) {
				GroupNode grp = (GroupNode)_node.getParent(null);
				ExtensionNode ext = (ExtensionNode)grp.getParent(null);
				String path = ext.getExtension().getId() + "/" + _node.getId() + "/res/diagrams/" + _node.getId() + ".diagram";
				String absPath = _node.getProject().getFile(path).getRawLocation().toOSString();
				URI fileURI = URI.createFileURI(absPath);
				
				input = new DiagramEditorInput(fileURI, DIAGRAM_TYPE_PROVIDER_ID);
				((DiagramEditorInput)input).setProviderId(DIAGRAM_TYPE_PROVIDER_ID);
				
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(input, EDITOR_ID);
			}else {
				MessageDialog.open(MessageDialog.ERROR, null, "Invalid Selection", "Current selected 'Tree Node' is not valid for 'Component Editor'. Please select 'Component' node and try again!", SWT.SHEET);
					
			}
		}catch(PartInitException e) {
			MessageDialog.open(MessageDialog.ERROR, null, "Component Editor Error", "Can not open 'Component Editor' due to following error: " + e.getMessage(), SWT.SHEET);
			throw new RuntimeException(e);
		}
		

		return null;

	}

}
