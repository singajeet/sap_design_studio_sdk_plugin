package com.armin.sap.ds.builder.extension.source.editors;

import org.eclipse.wst.sse.ui.StructuredTextEditor;

public class ExtensionSourceEditor extends StructuredTextEditor {

	private ColorManager colorManager;

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

}
