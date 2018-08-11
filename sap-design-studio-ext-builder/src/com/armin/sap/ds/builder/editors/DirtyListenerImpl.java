package com.armin.sap.ds.builder.editors;

class DirtyListenerImpl implements DirtyListener{
	
	/**
	 * 
	 */
	private AbstractBaseEditor abstractBaseEditor;
	private ExtensionEditor extEditor;
	
	/**
	 * @param abstractBaseEditor
	 */
	DirtyListenerImpl(AbstractBaseEditor abstractBaseEditor) {
		this.abstractBaseEditor = abstractBaseEditor;
	}

	public DirtyListenerImpl(ExtensionEditor extensionEditor) {
		extEditor = extensionEditor;
	}

	@Override
	public void fireDirty() {
		if(abstractBaseEditor != null)
			this.abstractBaseEditor.setDirty(true);
		else
			extEditor.setDirty(true);
	}
}