package com.armin.sap.ds.builder.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class DesignStudioTextEditor extends TextEditor {

	public static final String ID = "com.armin.sap.ds.builder.editors.text_editor";
	private ColorManager colorManager;

	public DesignStudioTextEditor() {
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

}
