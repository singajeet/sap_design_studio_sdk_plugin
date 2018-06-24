package com.armin.sap.ds.builder.project.models;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XMLExtensionModel extends AbstractModel {

	JAXBContext _jaxbContext;
	Unmarshaller _unmarshaller;
	Marshaller _marshaller;
	ObjectFactory _objectFactory;
	JAXBElement<Extension> _rootElement;
	private String _id;
	
	
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
	
	public Group createNewGroup(String id, String title) {
		Group group = _objectFactory.createGroup();
		group.setId(id);
		group.setTitle(title);
		getExtension().group.add(group);
		return group;
	}
	
	public Component createNewComponent() {
		Component component = _objectFactory.createComponent();
		getExtension().component.add(component);
		return component;
	}


	@Override
	public String getId() {
		return _id;
	}


	@Override
	public void setId(String id) {
		_id = id;
	}
}
