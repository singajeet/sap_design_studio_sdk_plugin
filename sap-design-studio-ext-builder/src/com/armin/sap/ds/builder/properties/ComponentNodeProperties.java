package com.armin.sap.ds.builder.properties;

import com.armin.sap.ds.builder.navigator.tree.ComponentNode;
import com.armin.sap.ds.builder.navigator.tree.ExtensionNode;
import com.armin.sap.ds.builder.navigator.tree.GroupNode;

public class ComponentNodeProperties extends GenericFileNodeProperties {

	protected final ComponentNode _compNode;
	
	public ComponentNodeProperties(ComponentNode node) {
		super(node);
		_compNode = node;
		this.initProperties();
	}
	
	private void initProperties() {
		GroupNode grpNode = (GroupNode)_compNode.getParent(null);
		ExtensionNode extNode = (ExtensionNode)grpNode.getParent(null);
		this.path = extNode.getExtension().getId() + "/contribution.ztl";
	}

}
