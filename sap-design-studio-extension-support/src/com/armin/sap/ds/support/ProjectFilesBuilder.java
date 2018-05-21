package com.armin.sap.ds.support;

import java.io.ByteArrayInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;

import com.armin.sap.ds.xml.Component;
import com.armin.sap.ds.xml.Extension;
import com.armin.sap.ds.xml.Group;
import com.armin.sap.ds.xml.ObjectFactory;

public class ProjectFilesBuilder {
	
	private ExtensionHelper _extensionHelper;
	private ComponentHelper _componentHelper;
	private IProject _currentProject;
	private IFile _componentFile;
	private IFile _extensionFile;	
	private static ProjectFilesBuilder _singletonInstance;
	
	
	private ProjectFilesBuilder() {
		// TODO Auto-generated constructor stub
	}
	
	public static ProjectFilesBuilder getInstance() {
		if(_singletonInstance == null) {
			_singletonInstance = new ProjectFilesBuilder();			
		}
		return _singletonInstance;
	}
	
	public void setupProjectFiles(ExtensionHelper extensionHelper, ComponentHelper componentHelper, IProject project) {
		
		_currentProject = project;
		_extensionHelper = extensionHelper;
		_componentHelper = componentHelper;
		
		IFile componentFile = project.getFile(_componentHelper.COMPONENT_ZTL_FILE_NAME);
		IFile extensionFile = project.getFile(_extensionHelper.EXTENSION_XML_FILE_NAME);
		
		_componentFile = componentFile;
		_extensionFile = extensionFile;
		
		if(!extensionFile.exists()) {		
			Extension extModel = _extensionHelper.getModel();
			Component componentModel = _componentHelper.getModel();
			
			//Create JAXB element factory
			ObjectFactory _factory = new ObjectFactory();
			//Create SDKExtension element and add all nodes to it
			JAXBElement<Extension> _rootElement = _factory.createSdkExtension(extModel);
			extModel.getComponent().add(componentModel);
			
			//Check if there is an group attribute in component and create new group if it don't exists
			String groupName = componentModel.getGroup();
			if(groupName != null) {
				if(!groupName.equals("Default") && !groupName.equals("TECHNICAL_COMPONENT")) {
					Group group = null;
					
					for(Group g : extModel.getGroup()) {
						if(g.getId().equals(groupName)) {
							group = g;
							break;
						}							
					}
					//Check if group exists in the group list maintained by this plugin
					//if available then add it under the current extension node
					
					//if group is not available in list too, add same to extension and custom list
					if(group == null) {
						group = _factory.createGroup();
						group.setId(groupName);
						group.setTitle(groupName);
						group.setTooltip("Group assigned to component");
						group.setVisible(true);
						extModel.getGroup().add(group);
						//add new group to custom list too
						
					}
				}
			}
			
			try {
				//Marshal XML to file with pretty format
				JAXBContext context = JAXBContext.newInstance(Extension.class);
				Marshaller marshaller = context.createMarshaller();
				_extensionFile.create(new ByteArrayInputStream("<!-- contribution.xml -->".getBytes()), true, null);
				marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				marshaller.marshal(_rootElement, _extensionFile.getRawLocation().toFile().getAbsoluteFile());
				
			} catch (Exception e) {
				MessageDialog.open(MessageDialog.ERROR, null, "Error while generating file", e.toString(), SWT.SHEET);
				e.printStackTrace();
			}
		}
	
		if(!componentFile.exists()) {
		}
	}
	

}
