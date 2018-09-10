package com.armin.sap.ds.builder.extension.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.MultiPageEditorPart;

import com.armin.sap.ds.builder.editors.DirtyListenerImpl;
import com.armin.sap.ds.builder.editors.DirtyUtils;
import com.armin.sap.ds.builder.editors.IDirtyListener;
import com.armin.sap.ds.builder.extension.source.editor.ExtensionSourceEditor;

public class ExtensionEditor extends MultiPageEditorPart {

	public static final String ID = "com.armin.sap.ds.builder.extension.editor.extension_editor"; //$NON-NLS-1$
	private IEditorPart extensionEditor;
	private IEditorPart extensionSourceEditor;
	private boolean dirty;
	
	public ExtensionEditor() {
	}

	@Override
	protected void createPages() {
		try {
			extensionEditor = new ExtensionEditorFormPage();
			extensionSourceEditor = new ExtensionSourceEditor();
			addPage(extensionEditor, (org.eclipse.ui.IEditorInput) null);
			addPage(extensionSourceEditor, (org.eclipse.ui.IEditorInput) null);
			
			IDirtyListener listener = new DirtyListenerImpl(this);
			DirtyUtils.registryDirty(listener, extensionEditor, extensionSourceEditor);
			
		} catch (PartInitException e) {
			MessageDialog.openError(this.getSite().getShell(), 
					"Error", "Error while creating pages for ExtensionEditor: " + e.getMessage());
		}
	}
	
	

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.MultiPageEditorPart#init(org.eclipse.ui.IEditorSite, org.eclipse.ui.IEditorInput)
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		setInput(input);
		extensionEditor.init(site, input);
		extensionSourceEditor.init(site, input);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.MultiPageEditorPart#isDirty()
	 */
	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return extensionEditor.isDirty() && extensionSourceEditor.isDirty();
	}	
	
	public void setDirty(boolean dirty) {
		if(this.dirty != dirty) {
			this.dirty = dirty;
			
			this.firePropertyChange(IEditorPart.PROP_DIRTY);
		}
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return extensionEditor.isSaveAsAllowed() && extensionSourceEditor.isSaveAsAllowed();
	}
	
	@Override
	public void doSave(IProgressMonitor monitor) {
		extensionEditor.doSave(monitor);
		extensionSourceEditor.doSave(monitor);
	}

	@Override
	public void doSaveAs() {
		extensionEditor.doSaveAs();
		extensionSourceEditor.doSaveAs();
	}

}
