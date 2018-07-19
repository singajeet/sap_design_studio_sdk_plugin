package com.armin.sap.ds.builder.editors;

import org.eclipse.jdt.ui.ISharedImages;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.EditorActionBarContributor;
import org.eclipse.ui.texteditor.ITextEditor;

/**
 * Manages the installation/deinstallation of global actions for editors.
 * Responsible for the redirection of global actions to the active editor. 
 */
public class ExtensionEditorContributor extends EditorActionBarContributor {
	private IEditorPart activeEditorPart;
	private Action closeEditor;
	/**
	 * Creates a multi-page contributor.
	 */
	public ExtensionEditorContributor() {
		super();
		createActions();		
	}
	/**
	 * Returns the action registed with the given text editor.
	 * @return IAction or null if editor is null.
	 */
	protected IAction getAction(ITextEditor editor, String actionID) {
		return (editor == null ? null : editor.getAction(actionID));
	}
	/* (non-JavaDoc)
	 * Method declared in EditorActionBarContributor.
	 */

	public void setActiveEditor(IEditorPart part) {
		activeEditorPart = part;
		IActionBars actionBars = getActionBars();
		
		if (actionBars != null) {

			FormPage editor = (part instanceof FormPage) ? (FormPage) part : null;

//			actionBars.setGlobalActionHandler(
//				ActionFactory.DELETE.getId(),
//				getAction(editor, ITextEditorActionConstants.DELETE));
//			actionBars.setGlobalActionHandler(
//				ActionFactory.UNDO.getId(),
//				getAction(editor, ITextEditorActionConstants.UNDO));
//			actionBars.setGlobalActionHandler(
//				ActionFactory.REDO.getId(),
//				getAction(editor, ITextEditorActionConstants.REDO));
//			actionBars.setGlobalActionHandler(
//				ActionFactory.CUT.getId(),
//				getAction(editor, ITextEditorActionConstants.CUT));
//			actionBars.setGlobalActionHandler(
//				ActionFactory.COPY.getId(),
//				getAction(editor, ITextEditorActionConstants.COPY));
//			actionBars.setGlobalActionHandler(
//				ActionFactory.PASTE.getId(),
//				getAction(editor, ITextEditorActionConstants.PASTE));
//			actionBars.setGlobalActionHandler(
//				ActionFactory.SELECT_ALL.getId(),
//				getAction(editor, ITextEditorActionConstants.SELECT_ALL));
//			actionBars.setGlobalActionHandler(
//				ActionFactory.FIND.getId(),
//				getAction(editor, ITextEditorActionConstants.FIND));
//			actionBars.setGlobalActionHandler(
//				IDEActionFactory.BOOKMARK.getId(),
//				getAction(editor, IDEActionFactory.BOOKMARK.getId()));
			actionBars.updateActionBars();			
		}
	}
	private void createActions() {
		closeEditor = new Action() {
			public void run() {
				if(activeEditorPart.isSaveOnCloseNeeded()) {
					boolean saveEditor = MessageDialog.openQuestion(activeEditorPart.getEditorSite().getShell(), 
							"Changes not saved!", "Do you want to close editor without saving it?");
					if(saveEditor) {
						activeEditorPart.doSave(null);
					}					
				} else {
					activeEditorPart.getEditorSite().getPage().close();					
				}
				
			}
		};
		closeEditor.setText("Close");
		closeEditor.setToolTipText("Close extension collection editor page");
		PlatformUI.getWorkbench().getSharedImages();
		closeEditor.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(org.eclipse.ui.ISharedImages.IMG_OBJ_PROJECT_CLOSED));
	}
	public void contributeToMenu(IMenuManager manager) {
		IMenuManager menu = new MenuManager("Editor &Menu");
		manager.prependToGroup(IWorkbenchActionConstants.MB_ADDITIONS, menu);
		menu.add(closeEditor);	
		
	}
	public void contributeToToolBar(IToolBarManager manager) {
		manager.add(new Separator());
		manager.add(closeEditor);
	}
}
