package com.armin.sap.ds.builder.service;

import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.services.IServiceLocator;

import com.armin.sap.ds.builder.api.models.BackendSystemType;
import com.armin.sap.ds.builder.api.models.Component;
import com.armin.sap.ds.builder.api.models.Descriptable;
import com.armin.sap.ds.builder.api.models.Extension;
import com.armin.sap.ds.builder.api.models.Group;
import com.armin.sap.ds.builder.api.models.HandlerTypes;
import com.armin.sap.ds.builder.api.models.IModel;
import com.armin.sap.ds.builder.api.models.Property;
import com.armin.sap.ds.builder.api.models.PropertyType;
import com.armin.sap.ds.builder.api.models.RequireJSType;
import com.armin.sap.ds.builder.api.models.StdInclude;
import com.armin.sap.ds.builder.api.models.UI5Mode;

public class ProjectFilesReaderService implements IProjectFilesReaderService {

	public ProjectFilesReaderService() {}
	
	public ProjectFilesReaderService(IServiceLocator locator) {
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
				validateAndFix((IModel)rawObject);
				return (Extension)rawObject;
			}
		} catch (Exception e) {			
			e.printStackTrace();
		}
		return null;
	}
	
	private void validateAndFix(IModel model) throws Exception{
		if(model != null) {
			if(model instanceof Extension) {
				Extension ext = (Extension)model;
				fixExtension(ext);
				
				List<Component> components = ext.getComponent();
				for(int i=0; i < components.size(); i++) {
					if(components.get(i) != null) {
						validateAndFix(components.get(i));
					} else {
						Component component = new Component();
						component.setId("<empty>");
						component.setName("<Empty>");
						component.setTitle("<Empty>");
						
						components.set(i, component);
					}
				}
				
				List<Group> groups = ext.getGroup();
				for(int i=0; i < groups.size(); i++) {
					if(groups.get(i) != null) {
						validateAndFix(groups.get(i));
					} else {
						Group group = new Group();						
						group.setId("default");
						group.setName("Default");
						group.setTitle("Default");
						
						groups.set(i, group);
					}
				}
			} else if(model instanceof Group) {
				fixDescriptable((Descriptable)model);
				
			} else if(model instanceof Component) {
				fixDescriptable((Descriptable)model);
				
				Component comp = (Component)model;
				
				List<String> css = comp.getCssInclude();
				for(int i=0; i < css.size(); i++) {
					if(css.get(i) == null) {
						css.set(i, "<Empty>");
					}
				}
				
				String group = comp.getGroup();
				if(group == null) {
					comp.setGroup("Default");
				}
				
				HandlerTypes handler = comp.getHandlerType();
				if(handler == null) {
					comp.setHandlerType(HandlerTypes.DIV);
				}
				
				List<String> js =comp.getJsInclude();
				for(int i=0; i < js.size(); i++) {
					if(js.get(i) == null) {
						js.set(i, "<Empty>");
					}
				}
				
				List<UI5Mode> modes = comp.getModes();
				for(int i=0; i < modes.size(); i++) {
					if(modes.get(i) == null) {
						modes.set(i, UI5Mode.COMMONS);
					}
				}
				
				List<Property> properties = comp.getProperty();
				for(int i=0; i < properties.size(); i++) {
					if(properties.get(i) == null) {
						Property property = new Property();
						property.setId("<empty>");
						property.setName("<Empty>");
						property.setTitle("<Empty>");
						property.setGroup("Default");
						property.setType(PropertyType.STRING);
						property.setVisible(false);
						
						properties.set(i, property);
					} else {
						validateAndFix(properties.get(i));
					}
				}
				
				List<RequireJSType> jsType = comp.getRequireJs();
				for(int i=0; i < jsType.size(); i++) {
					if(jsType.get(i) == null) {
						RequireJSType rjs = new RequireJSType();
						rjs.setId("<empty>");
						rjs.setName("<Empty>");
						rjs.setValue("<Empty>");
						jsType.set(i, rjs);
					} else {
						validateAndFix(jsType.get(i));
					}
				}
				
				List<StdInclude> stds = comp.getStdInclude();
				for(int i=0; i < stds.size(); i++) {
					if(stds.get(i) == null) {
						StdInclude std = new StdInclude();
						std.setId("<empty>");
						std.setName("<Empty>");
						std.setTitle("<Empty>");
						std.setKind("<Empty>");
						
						stds.set(i, std);
					} else {
						validateAndFix(stds.get(i));
					}
				}
				
				List<BackendSystemType> backends = comp.getSupportedBackend();
				for(int i=0; i < backends.size(); i++) {
					if(backends.get(i) == null) {
						backends.set(i, BackendSystemType.LOCAL);
					}
				}
			} else if(model instanceof Property) {
				fixDescriptable((Descriptable)model);
			} else if(model instanceof RequireJSType) {
				//fixDescriptable((Descriptable)model);
			} else if(model instanceof StdInclude) {
				fixDescriptable((Descriptable)model);
			}
		}
	}
	
	private void fixDescriptable(Descriptable model) {
		if(model.getName() == null || model.getName().isEmpty()) {
			model.setName(model.getId().toUpperCase());
		}
		if(model.getTitle() == null || model.getTitle().isEmpty()) {
			model.setTitle(model.getId().toUpperCase());
		}		
	}
	
	private void fixExtension(Extension ext) {
		//Process Extension attributes
		if(ext.getName() == null || ext.getName().isEmpty()) {
			ext.setName(ext.getId());
		}
		if(ext.getTitle() == null || ext.getTitle().isEmpty()) {
			ext.setTitle(ext.getId());
		}
		if(ext.getVersion() == null || ext.getVersion().isEmpty()) {
			ext.setVersion("1.0");
		}
	}
}
