package com.armin.sap.ds.builder.actions;

import org.eclipse.jface.resource.ImageDescriptor;

public class DeleteExtensionAction extends BaseAction {

	public DeleteExtensionAction() {
		super("Delete", "org.eclipse.ui.edit.delete");
	}

	public DeleteExtensionAction(String text) {
		super(text, "org.eclipse.ui.edit.delete");		
	}

	public DeleteExtensionAction(String text, ImageDescriptor image) {
		super(text, image, "org.eclipse.ui.edit.delete");		
	}

	public DeleteExtensionAction(String text, int style) {
		super(text, style, "org.eclipse.ui.edit.delete");		
	}

}
