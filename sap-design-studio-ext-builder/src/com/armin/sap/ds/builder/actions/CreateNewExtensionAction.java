package com.armin.sap.ds.builder.actions;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorPart;

public class CreateNewExtensionAction extends BaseAction {

	IEditorPart _editor;
	
	public CreateNewExtensionAction() {
		super("Save", "org.eclipse.ui.newWizard", "newWizardId", "com.armin.sap.ds.builder.wizards.new_extension_wizard");		
	}
	
	public CreateNewExtensionAction(String text) {
		super(text, "org.eclipse.ui.newWizard", "newWizardId", "com.armin.sap.ds.builder.wizards.new_extension_wizard");		
	}

	public CreateNewExtensionAction(String text, ImageDescriptor image) {
		super(text, image, "org.eclipse.ui.newWizard", "newWizardId", "com.armin.sap.ds.builder.wizards.new_extension_wizard");
	}
	
	public CreateNewExtensionAction(String text, int style) {
		super(text, style, "org.eclipse.ui.newWizard", "newWizardId", "com.armin.sap.ds.builder.wizards.new_extension_wizard");
	}	
		
}
