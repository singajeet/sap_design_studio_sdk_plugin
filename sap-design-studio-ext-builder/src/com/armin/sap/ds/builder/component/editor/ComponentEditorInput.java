package com.armin.sap.ds.builder.component.editor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.navigator.tree.ComponentNode;
import com.armin.sap.ds.builder.navigator.tree.ExtensionNode;
import com.armin.sap.ds.builder.navigator.tree.GroupNode;
import com.armin.sap.ds.builder.navigator.tree.IProjectItemNode;

public class ComponentEditorInput implements IEditorInput, IFileEditorInput {

	private IProject _project;
	private IProjectItemNode _node;
	
	public ComponentEditorInput() {
		
	}
	
	public ComponentEditorInput(IProjectItemNode node) {
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
		return "Component";
	}

	@Override
	public IPersistableElement getPersistable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getToolTipText() {
		// TODO Auto-generated method stub
		return "An extension defined under this project";
	}

	@Override
	public boolean exists() {
		return (_node != null);
	}

	@Override
	public IStorage getStorage() throws CoreException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IFile getFile() {
		GroupNode gpNode = (GroupNode)((ComponentNode)_node).getParent(null);
		ExtensionNode exNode = (ExtensionNode)gpNode.getParent(null);
		String resPath = exNode.getExtension().getId() + "/" + ((ComponentNode)_node).getId() + "/contribution.ztl";
		IFile file = _project.getFile(resPath);
		return file;
	}

}
