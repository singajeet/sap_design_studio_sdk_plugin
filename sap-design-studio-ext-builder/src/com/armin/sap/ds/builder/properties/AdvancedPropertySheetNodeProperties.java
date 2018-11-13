package com.armin.sap.ds.builder.properties;

import com.armin.sap.ds.builder.navigator.tree.AdvancedPropertySheetNode;

public class AdvancedPropertySheetNodeProperties extends GenericFolderNodeProperties {

	final protected AdvancedPropertySheetNode _fileNode;
	
	public AdvancedPropertySheetNodeProperties(AdvancedPropertySheetNode node) {
		super(node);
		this._fileNode = node;
		this.initProperties();
	}
	
	private void initProperties() {
		this.path = _fileNode.getFolderPath();
	}

}
