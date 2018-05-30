package com.armin.sap.ds.ext.navigator.elements;

import org.eclipse.core.resources.IResource;

public class PluginFile extends GenericFile {

	public PluginFile() {
		// TODO Auto-generated constructor stub
	}

	public PluginFile(IResource resource, IProjectElement parent) {
		super(resource, parent);
	}
	
	@Override
	public ProjectElementType getType() {
		return ProjectElementType.PLUGIN_FILE;
	}
}
