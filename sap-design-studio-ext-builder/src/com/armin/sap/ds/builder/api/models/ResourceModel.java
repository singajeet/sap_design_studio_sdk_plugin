package com.armin.sap.ds.builder.api.models;

import java.util.UUID;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.core.resources.IResource;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceModel")
public class ResourceModel extends Descriptable {

	public ResourceModel() {
		this.id = UUID.randomUUID().toString();
		this.name = this.id;
	}
	
	public ResourceModel(IResource resource) {
		this.id = resource.getName();
		this.name = this.id;
	}

}
