package com.armin.sap.ds.builder.properties.projectitemnode;

import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import com.armin.sap.ds.builder.navigator.tree.GenericFileNode;

public class GenericFileNodeProperties extends ProjectItemNodeProperties {

	final protected GenericFileNode _fileNode;
	protected static final String PROPERTY_PATH = "path";
	
	protected final Object PropertiesTable[][] = { super.PropertiesTable,
			{PROPERTY_PATH, new TextPropertyDescriptor(PROPERTY_PATH, "Location")}
	};
	
	protected String path = "";
	
	public GenericFileNodeProperties(GenericFileNode node) {
		super(node);
		this._fileNode = node;
		this.initProperties();
	}
	
	private void initProperties() {
		this.path = this._fileNode.getFilePath();
	}

	@Override
	public Object getPropertyValue(Object id) {
		if(id.equals(PROPERTY_PATH)) {			
			return this.path;
		}
		
		return super.getPropertyValue(id);
	}
}
