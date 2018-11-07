package com.armin.sap.ds.builder.properties;

import com.armin.sap.ds.builder.navigator.tree.CascadeStyleSheetCollectionNode;

public class CSSCollectionNodeProperties extends GenericFolderNodeProperties {

	CascadeStyleSheetCollectionNode _cssFolderNode;
	
	public CSSCollectionNodeProperties(CascadeStyleSheetCollectionNode node) {
		super(node);
		this._cssFolderNode = node;
	}

}
