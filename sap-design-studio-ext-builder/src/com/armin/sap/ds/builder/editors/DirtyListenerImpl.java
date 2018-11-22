package com.armin.sap.ds.builder.editors;

import com.armin.sap.ds.builder.editors.extension.ExtensionEditor;

public class DirtyListenerImpl implements IDirtyListener{
	
	/**
	 * 
	 */
	private AbstractBaseEditorPart abstractBaseEditorPart;	
	private ExtensionEditor extensionEditor;
	
	/**
	 * @param abstractBaseEditorPart
	 */
	public DirtyListenerImpl(AbstractBaseEditorPart abstractBaseEditorPart) {
		this.abstractBaseEditorPart = abstractBaseEditorPart;
	}
	
	public DirtyListenerImpl(ExtensionEditor extensionEditor) {
		this.extensionEditor = extensionEditor;
	}

	@Override
	public void fireDirty() {
		if(abstractBaseEditorPart != null)
			this.abstractBaseEditorPart.setDirty(true);
		if(extensionEditor != null)
			this.extensionEditor.setDirty(true);
	}
}