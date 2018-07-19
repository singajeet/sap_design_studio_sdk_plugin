package com.armin.sap.ds.builder.service;

import org.eclipse.core.resources.IResource;

import com.armin.sap.ds.builder.api.models.Extension;

public interface IProjectFilesReaderService {
	public Extension getExtensionModel(IResource resource);
}