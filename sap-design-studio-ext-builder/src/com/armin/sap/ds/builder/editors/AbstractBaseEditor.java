package com.armin.sap.ds.builder.editors;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;

public abstract class AbstractBaseEditor extends FormPage {

	private boolean dirty;
	
	public AbstractBaseEditor(String id, String title) {
		super(id, title);
		// TODO Auto-generated constructor stub
	}

	public AbstractBaseEditor(FormEditor editor, String id, String title) {
		super(editor, id, title);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void init(IEditorSite site, IEditorInput input) 
	{
		setSite(site);
		setInput(input);
	}
	
	@Override
	public boolean isDirty() {
		return this.dirty;
	}
	
	protected void setDirty(boolean dirty) {
		if(this.dirty != dirty) {
			this.dirty = dirty;
			
			this.firePropertyChange(IEditorPart.PROP_DIRTY);
		}
	}
	
	@Override
	public void doSaveAs() {}
	
	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}
	
	@Override
	public void setFocus() {}
	
	@Override
	public final void createPartControl(Composite parent) {
		this.createPartControl2(parent);
		this.showData();
		this.setDirty(false);
		this.firePropertyChange(0);
		
		Control[] controls = this.registryDirtyControls();
		DirtyListener listener = new DirtyListenerImpl(this);
		DirtyUtils.registryDirty(listener, controls);
	}
	
	public abstract void showData();
	
	protected abstract void createPartControl2(Composite composite);
	
	protected abstract Control[] registryDirtyControls();

}





