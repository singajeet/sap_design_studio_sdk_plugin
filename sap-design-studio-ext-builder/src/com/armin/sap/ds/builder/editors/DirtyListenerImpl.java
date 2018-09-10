package com.armin.sap.ds.builder.editors;

import com.armin.sap.ds.builder.extension.editor.ExtensionEditor;
import com.armin.sap.ds.builder.extension.source.editor.ExtensionSourceEditor;

public class DirtyListenerImpl implements IDirtyListener{
	
	/**
	 * 
	 */
	private AbstractBaseEditorPart abstractBaseEditorPart;
	private ExtensionSourceEditor extensionSourceEditor;
	private ExtensionEditor extensionEditor;
	
	/**
	 * @param abstractBaseEditorPart
	 */
	public DirtyListenerImpl(AbstractBaseEditorPart abstractBaseEditorPart) {
		this.abstractBaseEditorPart = abstractBaseEditorPart;
	}
	
	public DirtyListenerImpl(ExtensionSourceEditor extensionSourceEditor) {
		this.extensionSourceEditor = extensionSourceEditor;
	}

	public DirtyListenerImpl(ExtensionEditor extensionEditor) {
		this.extensionEditor = extensionEditor;
	}

	@Override
	public void fireDirty() {
		if(abstractBaseEditorPart != null)
			this.abstractBaseEditorPart.setDirty(true);
		
		if(extensionSourceEditor != null)
			this.extensionSourceEditor.setDirty(true);
		
		if(extensionEditor != null)
			this.extensionEditor.setDirty(true);
	}
}