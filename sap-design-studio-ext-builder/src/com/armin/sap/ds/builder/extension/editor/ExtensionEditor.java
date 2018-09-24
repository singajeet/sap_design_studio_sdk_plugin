package com.armin.sap.ds.builder.extension.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.part.MultiPageEditorSite;
import org.eclipse.wst.sse.ui.StructuredTextEditor;
import org.eclipse.wst.xml.core.internal.provisional.contenttype.ContentTypeIdForXML;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.editors.DirtyListenerImpl;
import com.armin.sap.ds.builder.editors.DirtyUtils;
import com.armin.sap.ds.builder.editors.IDirtyListener;

@SuppressWarnings("restriction")
public class ExtensionEditor extends MultiPageEditorPart {

	public static final String ID = "com.armin.sap.ds.builder.extension.editor.extension_editor"; //$NON-NLS-1$
	private IEditorPart extensionEditorPage;
	private IEditorPart extensionSourceEditorPage;
	private boolean dirty;
	
	public ExtensionEditor() {
	}

	@Override
	protected void createPages() {
		try {
			extensionEditorPage = new ExtensionEditorFormPage();	
			extensionEditorPage.addPropertyListener(new IPropertyListener() {

				@Override
				public void propertyChanged(Object source, int propId) {
					if(propId == PROP_DIRTY) {
						if(extensionEditorPage.isDirty()) {
							setDirty(true);
						} else {
							setDirty(false);
						}
					}					
				}
				
			});
			addPage(extensionEditorPage, this.getEditorInput());
			
			extensionSourceEditorPage = new StructuredTextEditor();
			extensionSourceEditorPage.addPropertyListener(new IPropertyListener() {

				@Override
				public void propertyChanged(Object source, int propId) {
					if(propId == PROP_DIRTY) {
						if(extensionEditorPage.isDirty()) {
							setDirty(true);
						} else {
							setDirty(false);
						}
					}					
				}
				
			});
			
			IFileEditorInput sourceInput = (IFileEditorInput)this.getEditorInput();
			addPage(extensionSourceEditorPage, new FileEditorInput(sourceInput.getFile()));			
			
			setPageText(0, "Extension");
			setPageText(1, "Source");
			
			IDirtyListener listener = new DirtyListenerImpl(this);
			DirtyUtils.registryDirty(listener, extensionEditorPage, extensionSourceEditorPage);
			
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
		if(editor == extensionSourceEditorPage) {
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
		//extensionEditorPage.init(site, input);
		//extensionSourceEditorPage.init(site, input);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.MultiPageEditorPart#isDirty()
	 */
	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return extensionEditorPage.isDirty() && extensionSourceEditorPage.isDirty();
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
		return extensionEditorPage.isSaveAsAllowed() && extensionSourceEditorPage.isSaveAsAllowed();
	}
	
	@Override
	public void doSave(IProgressMonitor monitor) {
		extensionEditorPage.doSave(monitor);
		extensionSourceEditorPage.doSave(monitor);
		Activator.getDefault().refreshViewers();
	}

	@Override
	public void doSaveAs() {
		extensionEditorPage.doSaveAs();
		extensionSourceEditorPage.doSaveAs();
		Activator.getDefault().refreshViewers();
	}

}
