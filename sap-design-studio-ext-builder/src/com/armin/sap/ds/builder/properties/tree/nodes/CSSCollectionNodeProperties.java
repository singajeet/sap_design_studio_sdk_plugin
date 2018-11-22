package com.armin.sap.ds.builder.properties.tree.nodes;

import com.armin.sap.ds.builder.ui.navigation.tree.nodes.CascadeStyleSheetCollectionNode;

public class CSSCollectionNodeProperties extends GenericFolderNodeProperties {

	CascadeStyleSheetCollectionNode _cssFolderNode;
	
	public CSSCollectionNodeProperties(CascadeStyleSheetCollectionNode node) {
		super(node);
		this._cssFolderNode = node;
	}

}
