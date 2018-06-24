package com.armin.sap.ds.builder.common;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;

import com.armin.sap.ds.builder.project.models.Extension;

public class ProjectFilesReader {

	private static ProjectFilesReader _singletonInstance;
	
	private ProjectFilesReader() {
		// TODO Auto-generated constructor stub
	}
	
	public static ProjectFilesReader getInstance() {
		if(_singletonInstance == null) {
			_singletonInstance = new ProjectFilesReader();
		}
		
		return _singletonInstance;
	}
	
	public Extension getExtensionModel(IResource resource) {
		try {
			System.out.println("ProjectFilesReader: " + resource.getName());
			System.out.println("ProjectFilesReader: " + resource.getLocation());
			JAXBContext context = JAXBContext.newInstance(Extension.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			if(resource.exists()) {
				IPath extensionFilePath = resource.getLocation();
				Object rawObject = unmarshaller.unmarshal(extensionFilePath.append("contribution.xml").toFile());
				return (Extension)rawObject;
			}
		} catch (JAXBException e) {			
			e.printStackTrace();
		}
		return null;
	}
}
