package com.armin.sap.ds.builder.api.models.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resource")
public class Resource extends Descriptable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4447407678379987070L;
	private IResource _resource;
	
	/**
	 * @return the relativePath
	 */
	public IPath getRelativePath() {
		return _resource.getProjectRelativePath();
	}

	/**
	 * @return the absPath
	 */
	public IPath getAbsPath() {
		return _resource.getRawLocation();
	}

		
	public Resource(IResource resource) {
		this._resource = resource;
		this.id = resource.getName();
		this.title = this.name = this.id;		
	}
	
	public IResource getResourceObject() {
		return this._resource;
	}
}
