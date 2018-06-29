package com.armin.sap.ds.builder.project.models;

import java.util.UUID;

import org.eclipse.core.resources.IResource;

public class ResourceModel extends AbstractModel {

	public ResourceModel() {
		this._id = UUID.randomUUID().toString();
		this._name = this._id;
	}
	
	public ResourceModel(IResource resource) {
		this._id = resource.getName();
		this._name = this._id;
	}

}
