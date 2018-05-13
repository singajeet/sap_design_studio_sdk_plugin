package com.armin.sap.ds.support;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

public class ProjectContentHelper {

	private static ExtensionHelper _extensionHelper;
	private static ComponentHelper _componentHelper;
	private static TemplateParser _parser;
	private static Map<String, String> _fieldMap;
	
	public static void setupProjectFiles(ExtensionHelper _extensionHelper, ComponentHelper _componentHelper, IProject project) {
		
		IFile componentFile = project.getFile(_componentHelper.COMPONENT_ZTL_FILE_NAME);
		IFile extensionFile = project.getFile(_extensionHelper.EXTENSION_XML_FILE_NAME);
		
		if(!extensionFile.exists()) {
			populateSDKExtensionNode(extensionFile);
			populateComponentNode(extensionFile, project);
		}
	
		if(!componentFile.exists()) {
			populateComponentZTLFile(componentFile);
		}
	}
	
	private static void populateComponentNode(IFile extensionFile, IProject project) {
		try {
			_fieldMap = new HashMap<String, String>();
			//add values for className, title and tooltip placeholders
			_fieldMap.put("className", _componentHelper.getClassName());
			_fieldMap.put("title", _componentHelper.getTitle());
			_fieldMap.put("tooltip", _componentHelper.getToolTip());
			
			//if no value provided for icon path, default icon will be used 
			//available at "res/images/component.png"
			//if value is provided for an icon, icon will be copied to the res/images folder
			//and the relative path will be used for that icon
			if(!_componentHelper.getIconPath().isEmpty()) {
				if(_componentHelper.getIconPath().equals("res/images/component.png")) {
					_fieldMap.put("icon", "res/images/component.png");
				} else {
					IPath p = new Path(_componentHelper.getIconPath());
					
					if(p.toFile().exists()) {
						String filename = p.toFile().getName();
						IFile iconFile = project.getFile("res/images/" + filename);
						InputStream imgStream = new FileInputStream(p.toFile().getAbsolutePath());
						iconFile.create(imgStream, IResource.NONE, null);
						_fieldMap.put("icon", "res/images/" + filename);
					} else {
						_fieldMap.put("icon", "res/images/component.png");
					}
				}
			} else {
				_fieldMap.put("icon", "res/images/component.png");
			}
			
			//add value for handler types 
			_fieldMap.put("handlerType", _componentHelper.getHandlerType());
			if(_componentHelper.getMobileMode() && _componentHelper.getCommonsMode())
			{
				_fieldMap.put("modes", "commons m");
			} else if (_componentHelper.getMobileMode()) {
				_fieldMap.put("modes",  "m");
			} else if (_componentHelper.getCommonsMode()) {
				_fieldMap.put("modes",  "commons");
			}		
			
			//databound
			if(_componentHelper.isDataBound()) {
				_fieldMap.put("databound", "databound=\"true\"");
			} else {
				_fieldMap.put("databound", "");
			}
			
			//if path for advance property sheet has been provided, a APS will be generated
			//at provided path otherwise default path for APS will be used
			//APS will be added to project only if checkbox is selected for same
			if(_componentHelper.isAddPropertySheet()) {
				if(_componentHelper.getPropertySheetPath().isEmpty()) {
					_fieldMap.put("propertySheetPath", "propertySheetPath=\"res/additional_properties_sheet/additional_properties_sheet.html\"");
				} else {
					_fieldMap.put("propertySheetPath", "propertySheetPath=\"" + _componentHelper.getPropertySheetPath() + "\"");
				}
			} else {
				_fieldMap.put("propertySheetPath", "");
			}
			
			//By default, "default" group will be selected for the project and nothing will be rendered
			//for this selection. A new group can be created and selected for the current project
			if(!_componentHelper.getGroup().equals("Default")) {
				_fieldMap.put("group", "group=\"" + _componentHelper.getGroup() + "\"");
			} else {
				_fieldMap.put("group", "");
			}
			
			//parse and update the contribution.xml file with component definition
			_parser = new TemplateParser(_fieldMap);
			_parser.loadTemplate("component-template");
			_parser.parse();
			_parser.mergeToFile(extensionFile, "components");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Creates and populate ZTL file for the current project
	 * @param componentFile: Instance of contribution.ztl file in the current project
	 */
	private static void populateComponentZTLFile(IFile componentFile) {
		try {
			_fieldMap = new HashMap<String, String>();
			_fieldMap.put("description", _componentHelper.getDescription());
			_fieldMap.put("author", "");
			_fieldMap.put("date", new Date().toString());
			_fieldMap.put("packageName", _componentHelper.getPackageName());
			_fieldMap.put("className", _componentHelper.getClassName());
			if(_componentHelper.getClassToExtend().equals("-- None --")) {
				_fieldMap.put("superClassName", "");
				_fieldMap.put("extends", "");
			} else {
				_fieldMap.put("superClassName", _componentHelper.getClassToExtend());
				_fieldMap.put("extends", _componentHelper.EXTENDS_KEYWORD);
			}
			
			_parser = new TemplateParser(_fieldMap);
			_parser.loadTemplate("ztl-template");
			_parser.parse();
			componentFile.create(_parser.getCompiledTextAsStream(), IResource.NONE, null);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Create and populate the contribution.xml file with extension details
	 * Other sections of this file will be handled by respective function
	 * @param extensionFile: Instance of contribution.xml file in the current project
	 */
	private static void populateSDKExtensionNode(IFile extensionFile) {
		try {
			_fieldMap = new HashMap<String, String>();
			_fieldMap.put("id", _extensionHelper.getId());
			_fieldMap.put("title", _extensionHelper.getTitle());
			_fieldMap.put("version", _extensionHelper.getVersion());
			_fieldMap.put("vendor", _extensionHelper.getVendor());
			_fieldMap.put("eula", _extensionHelper.getEula());
			_parser = new TemplateParser(_fieldMap);
			_parser.loadTemplate("extension-template");
			_parser.parse();
			extensionFile.create(_parser.getCompiledTextAsStream(), IResource.NONE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

}
