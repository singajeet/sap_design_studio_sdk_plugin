package com.armin.sap.ds.builder.service;

import java.util.Map;

import javax.xml.bind.JAXBElement;

import com.armin.sap.ds.builder.api.models.Extension;

public interface IModelService {
	JAXBElement<Extension> getRootElement(String id);
	Map<String, JAXBElement<Extension>> getRootElementsMap();
	JAXBElement<Extension> createRootElement(String id);
	boolean updateRootElement(String id, JAXBElement<Extension> element);
	
	boolean addExtensionToRoot(String rootId, Extension extension);
	boolean removeExtensionFromRoot(String id);
	Extension getExtensionFromRoot(String id);
	
	
}
