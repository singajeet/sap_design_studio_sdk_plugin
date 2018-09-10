package com.armin.sap.ds.builder.extension.source.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;

import com.armin.sap.ds.builder.editors.DirtyListenerImpl;
import com.armin.sap.ds.builder.editors.DirtyUtils;
import com.armin.sap.ds.builder.editors.IDirtyListener;

public class ExtensionSourceEditor extends TextEditor {

	public static final String ID = "com.armin.sap.ds.builder.editors.extension_source_editor";
	private ColorManager colorManager;
	private boolean dirty;

	public ExtensionSourceEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new XMLConfiguration(colorManager));
		setDocumentProvider(new XMLDocumentProvider());
	}
	@Override
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.editors.text.TextEditor#isSaveAsAllowed()
	 */
	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return super.isSaveAsAllowed();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.texteditor.AbstractDecoratedTextEditor#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {		
		super.createPartControl(parent);
		this.createControls(parent);
		this.setDirty(false);
		this.firePropertyChange(0);
		
		Control[] controls = this.registryDirtyControls();
		IDirtyListener listener = new DirtyListenerImpl(this);
		DirtyUtils.registryDirty(listener, controls);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.texteditor.AbstractDecoratedTextEditor#isEditable()
	 */
	@Override
	public boolean isEditable() {
		// TODO Auto-generated method stub
		return super.isEditable();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.texteditor.AbstractTextEditor#init(org.eclipse.ui.IEditorSite, org.eclipse.ui.IEditorInput)
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		setSite(site);
		setInput(input);
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.texteditor.AbstractTextEditor#close(boolean)
	 */
	@Override
	public void close(boolean save) {
		// TODO Auto-generated method stub
		super.close(save);
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.texteditor.AbstractTextEditor#doSaveAs()
	 */
	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub
		super.doSaveAs();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.texteditor.AbstractTextEditor#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		// TODO Auto-generated method stub
		super.doSave(progressMonitor);
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.texteditor.AbstractTextEditor#isDirty()
	 */
	@Override
	public boolean isDirty() {	
		return this.dirty;
	}

	public void setDirty(boolean dirty) {
		if(this.dirty != dirty) {
			this.dirty = dirty;
			
			this.firePropertyChange(IEditorPart.PROP_DIRTY);
		}
	}
	
	private void createControls(Composite parent) {}
	
	private Control[] registryDirtyControls() {
		
		return null;
	}
}
