package com.armin.sap.ds.builder.dnd;

public class ExtensionNodeTransfer extends ProjectItemNodeTransfer {

	private static final String EXTENSION_NODE_TYPE_NAME = "extension_node_type";
	private static final int EXTENSION_NODE_TYPE_ID = registerType(EXTENSION_NODE_TYPE_NAME);
	private static ExtensionNodeTransfer _instance = new ExtensionNodeTransfer();	
	
	
	public static ExtensionNodeTransfer getInstance() {
		return _instance;
	}

	@Override
	protected String[] getTypeNames() {		
		return new String[]{EXTENSION_NODE_TYPE_NAME};
	}

	@Override
	protected int[] getTypeIds() {		
		return new int[] {EXTENSION_NODE_TYPE_ID};
	}

}
