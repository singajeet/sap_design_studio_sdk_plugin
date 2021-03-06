package com.armin.sap.ds.ext.plugin.editors;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.armin.sap.ds.ext.plugin.Activator;

public class ExtensionEditorInput implements IEditorInput {

	private Object _project;
	
	public ExtensionEditorInput() {
		
	}
	
	public ExtensionEditorInput(Object project) {
		_project = project;
	}
	
	@Override
	public <T> T getAdapter(Class<T> adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists() {
		if(_project != null)
			return true;
		else
			return false;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return AbstractUIPlugin.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "images/sap_18.png");		
	}

	@Override
	public String getName() {
		return "Extension Collection";
	}

	@Override
	public IPersistableElement getPersistable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getToolTipText() {
		// TODO Auto-generated method stub
		return "Collection of extensions defined under this project";
	}

}
