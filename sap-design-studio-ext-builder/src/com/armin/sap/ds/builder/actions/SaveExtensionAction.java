package com.armin.sap.ds.builder.actions;

import org.eclipse.jface.resource.ImageDescriptor;

public class SaveExtensionAction extends BaseAction {

	
	public SaveExtensionAction() {
		super("Save", "org.eclipse.ui.file.save");		
	}
	
	public SaveExtensionAction(String text) {
		super(text, "org.eclipse.ui.file.save");		
	}

	public SaveExtensionAction(String text, ImageDescriptor image) {
		super(text, image, "org.eclipse.ui.file.save");
	}
	
	public SaveExtensionAction(String text, int style) {
		super(text, style, "org.eclipse.ui.file.save");
	}	
	
}
