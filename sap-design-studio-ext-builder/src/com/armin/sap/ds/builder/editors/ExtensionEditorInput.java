package com.armin.sap.ds.builder.editors;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.navigator.tree.IProjectItemNode;

public class ExtensionEditorInput implements IEditorInput {

	private IProject _project;
	private IProjectItemNode _node;
	
	public ExtensionEditorInput() {
		
	}
	
	public ExtensionEditorInput(IProjectItemNode node) {
		_node = node;
		_project = _node.getProject();
	}
	
	public IProject getProject() {
		return _project;
	}
	
	public IProjectItemNode getTreeNode() {
		return _node;
	}
	
	@Override
	public <T> T getAdapter(Class<T> adapter) {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public boolean exists() {
		return (_node != null);
	}

}
