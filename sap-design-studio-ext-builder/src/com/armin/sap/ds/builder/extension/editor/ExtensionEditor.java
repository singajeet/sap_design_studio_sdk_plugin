package com.armin.sap.ds.builder.extension.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.part.MultiPageEditorSite;
import org.eclipse.wst.xml.core.internal.provisional.contenttype.ContentTypeIdForXML;

import com.armin.sap.ds.builder.editors.DirtyListenerImpl;
import com.armin.sap.ds.builder.editors.DirtyUtils;
import com.armin.sap.ds.builder.editors.IDirtyListener;
import com.armin.sap.ds.builder.extension.source.editors.ExtensionSourceEditor;

@SuppressWarnings("restriction")
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
			addPage(extensionEditor, this.getEditorInput());
			addPage(extensionSourceEditor, this.getEditorInput());
			
			setPageText(0, "Extension");
			setPageText(1, "Source");
			
			IDirtyListener listener = new DirtyListenerImpl(this);
			DirtyUtils.registryDirty(listener, extensionEditor, extensionSourceEditor);
			
		} catch (PartInitException e) {
			e.printStackTrace();
			MessageDialog.openError(this.getSite().getShell(), 
					"Error", "Error while creating pages for ExtensionEditor: " + e.getMessage());
		}
	}
	

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.MultiPageEditorPart#createSite(org.eclipse.ui.IEditorPart)
	 */
	@Override
	protected IEditorSite createSite(IEditorPart editor) {
		IEditorSite site = null;
		if(editor == extensionSourceEditor) {
			site = new MultiPageEditorSite(this, editor) {

				/* (non-Javadoc)
				 * @see org.eclipse.ui.part.MultiPageEditorSite#getId()
				 */
				@Override
				public String getId() {					
					return ContentTypeIdForXML.ContentTypeID_XML + ".source";
				}
				
			};
		} else {
			site = super.createSite(editor);
		}
		return site;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.MultiPageEditorPart#init(org.eclipse.ui.IEditorSite, org.eclipse.ui.IEditorInput)
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		setInput(input);
		//extensionEditor.init(site, input);
		//extensionSourceEditor.init(site, input);
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
