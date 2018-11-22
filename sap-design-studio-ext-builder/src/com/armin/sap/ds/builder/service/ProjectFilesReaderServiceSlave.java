package com.armin.sap.ds.builder.service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.services.IServiceLocator;

import com.armin.sap.ds.builder.api.models.domain.Extension;

public class ProjectFilesReaderServiceSlave implements IProjectFilesReaderService {

	public ProjectFilesReaderServiceSlave(IServiceLocator locator, IProjectFilesReaderService parentService) {
		locator.hasService(IHandlerService.class);
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
