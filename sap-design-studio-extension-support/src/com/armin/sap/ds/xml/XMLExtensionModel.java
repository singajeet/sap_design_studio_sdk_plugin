package com.armin.sap.ds.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XMLExtensionModel {

	JAXBContext _jaxbContext;
	Unmarshaller _unmarshaller;
	Marshaller _marshaller;
	ObjectFactory _objectFactory;
	JAXBElement<Extension> _rootElement;
	
	
	public XMLExtensionModel() {
		_objectFactory = new ObjectFactory();
	}

	
	public JAXBElement createNewSDKExtension() {
		Extension ext = _objectFactory.createExtension();
		_rootElement = _objectFactory.createSdkExtension(ext);
		return _rootElement;
	}
	
	public Extension getExtension() {
		return _rootElement.getValue();
	}
	
	public Group createNewGroup() {
		Group group = _objectFactory.createGroup();
		getExtension().group.add(group);
		return group;
	}
	
	public Component createNewComponent() {
		Component component = _objectFactory.createComponent();
		getExtension().component.add(component);
		return component;
	}
}
