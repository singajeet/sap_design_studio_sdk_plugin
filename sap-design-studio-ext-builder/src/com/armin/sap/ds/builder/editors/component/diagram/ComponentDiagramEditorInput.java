package com.armin.sap.ds.builder.editors.component.diagram;

import org.eclipse.emf.common.util.URI;
import org.eclipse.graphiti.ui.editor.DiagramEditorInput;

import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ComponentExtendedNode;

public class ComponentDiagramEditorInput extends DiagramEditorInput {

	private final ComponentExtendedNode _node;
	
	public ComponentDiagramEditorInput(URI diagramUri, String providerId, ComponentExtendedNode node) {
		super(diagramUri, providerId);
		_node = node;
	}

	/**
	 * @return the _node
	 */
	public ComponentExtendedNode getNode() {
		return _node;
	}
}
