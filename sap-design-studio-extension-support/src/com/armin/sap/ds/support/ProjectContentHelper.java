package com.armin.sap.ds.support;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
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

	private ExtensionHelper _extensionHelper;
	private ComponentHelper _componentHelper;
	private IProject _currentProject;
	private IFile _componentFile;
	private IFile _extensionFile;
	private static ProjectContentHelper _singletonInstance;
	
	private ProjectContentHelper() {}
	
	public static ProjectContentHelper getInstance() {
		if(_singletonInstance == null)
			_singletonInstance = new ProjectContentHelper();
		return _singletonInstance;
	}
	
	public void setupProjectFiles(ExtensionHelper _extensionHelper, ComponentHelper _componentHelper, IProject project) {
		
		_currentProject = project;
		
		IFile componentFile = project.getFile(_componentHelper.COMPONENT_ZTL_FILE_NAME);
		IFile extensionFile = project.getFile(_extensionHelper.EXTENSION_XML_FILE_NAME);
		
		_componentFile = componentFile;
		_extensionFile = extensionFile;
		
		if(!extensionFile.exists()) {
			populateSDKExtensionNode();
			populateComponentNode();
		}
	
		if(!componentFile.exists()) {
			populateComponentZTLFile();
		}
	}
	
	public void addNewComponent(ComponentHelper component) {
		
		if(component == null)
			return;
		
		_componentHelper = component;
		
		InputStream inputStream = null;
		try {
			if(_currentProject.exists(new Path(_extensionHelper.EXTENSION_XML_FILE_NAME))) {
				
				IFile file = _currentProject.getFile(_extensionHelper.EXTENSION_XML_FILE_NAME);
				inputStream = file.getContents();		
		
				BufferedReader buf = new BufferedReader(new InputStreamReader(inputStream));
				StringBuilder sb = new StringBuilder();
	        
				String line = buf.readLine();
				while(line != null) {
					sb.append(line).append("\n");
					line = buf.readLine();
				}
				
				int lastComponentTagIndex = sb.lastIndexOf(ProjectConstants.COMPONENT_CLOSE_TAG);
	        
				sb.insert(lastComponentTagIndex, ProjectConstants.COMPONENT_PLACEHOLDER);
				
				file.delete(true, null);
				
				file.create(new ByteArrayInputStream(sb.toString().getBytes()), IResource.NONE, null);
				
				populateComponentNode();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	
	private void populateComponentNode() {
		try {
			Map<String, String> fieldMap = new HashMap<String, String>();
			//add values for className, title and tooltip placeholders
			fieldMap.put(ProjectConstants.CLASS_NAME, _componentHelper.getClassName());
			fieldMap.put(ProjectConstants.TITLE, _componentHelper.getTitle());
			fieldMap.put(ProjectConstants.TOOLTIP, _componentHelper.getToolTip());
			
			//if no value provided for icon path, default icon will be used 
			//available at "res/images/component.png"
			//if value is provided for an icon, icon will be copied to the res/images folder
			//and the relative path will be used for that icon
			if(!_componentHelper.getIconPath().isEmpty()) {
				if(_componentHelper.getIconPath().equals(ProjectConstants.RES_IMAGES_COMPONENT_PNG)) {
					fieldMap.put(ProjectConstants.ICON, ProjectConstants.RES_IMAGES_COMPONENT_PNG);
				} else {
					IPath p = new Path(_componentHelper.getIconPath());
					
					if(p.toFile().exists()) {
						String filename = p.toFile().getName();
						IFile iconFile = _currentProject.getFile(ProjectConstants.RES_IMAGES + filename);
						InputStream imgStream = new FileInputStream(p.toFile().getAbsolutePath());
						iconFile.create(imgStream, IResource.NONE, null);
						fieldMap.put(ProjectConstants.ICON, ProjectConstants.RES_IMAGES + filename);
					} else {
						fieldMap.put(ProjectConstants.ICON, ProjectConstants.RES_IMAGES_COMPONENT_PNG);
					}
				}
			} else {
				fieldMap.put(ProjectConstants.ICON, ProjectConstants.RES_IMAGES_COMPONENT_PNG);
			}
			
			//add value for handler types 
			fieldMap.put(ProjectConstants.HANDLER_TYPE, _componentHelper.getHandlerType());
			if(_componentHelper.getMobileMode() && _componentHelper.getCommonsMode())
			{
				fieldMap.put(ProjectConstants.MODES, ProjectConstants.COMMONS_M);
			} else if (_componentHelper.getMobileMode()) {
				fieldMap.put(ProjectConstants.MODES,  ProjectConstants.M);
			} else if (_componentHelper.getCommonsMode()) {
				fieldMap.put(ProjectConstants.MODES,  ProjectConstants.COMMONS);
			}		
			
			//databound
			if(_componentHelper.isDataBound()) {
				fieldMap.put(ProjectConstants.DATABOUND, ProjectConstants.TRUE);
			} else {
				fieldMap.put(ProjectConstants.DATABOUND, "");
			}
			
			//if path for advance property sheet has been provided, a APS will be generated
			//at provided path otherwise default path for APS will be used
			//APS will be added to project only if checkbox is selected for same
			if(_componentHelper.isAddPropertySheet()) {
				if(_componentHelper.getPropertySheetPath().isEmpty()) {
					fieldMap.put(ProjectConstants.PROPERTY_SHEET_PATH, ProjectConstants.PROPERTY_SHEET_PATH_DEFAULT);
				} else {
					fieldMap.put(ProjectConstants.PROPERTY_SHEET_PATH, ProjectConstants.PROPERTY_SHEET_PATH_ASSIGNMENT + ProjectConstants.DOUBLE_QUOTES + _componentHelper.getPropertySheetPath() + ProjectConstants.DOUBLE_QUOTES);
				}
			} else {
				fieldMap.put(ProjectConstants.PROPERTY_SHEET_PATH, "");
			}
			
			//By default, "default" group will be selected for the project and nothing will be rendered
			//for this selection. A new group can be created and selected for the current project
			if(!_componentHelper.getGroup().equals(ProjectConstants.DEFAULT)) {
				fieldMap.put(ProjectConstants.GROUP, ProjectConstants.DOUBLE_QUOTES + _componentHelper.getGroup() + ProjectConstants.DOUBLE_QUOTES);
			} else {
				fieldMap.put(ProjectConstants.GROUP, "");
			}
			
			String requireJsNodeContent = getRequireJSNodeContent();
			fieldMap.put(ProjectConstants.REQUIRE_JS, requireJsNodeContent);
			
			String cssIncludeContent = getCSSIncludeNodeContent();
			fieldMap.put(ProjectConstants.CSS_INCLUDE, cssIncludeContent);			
			
			//parse and update the contribution.xml file with component definition
			TemplateParser parser = new TemplateParser(fieldMap);
			parser.loadTemplate(ProjectConstants.COMPONENT_TEMPLATE);
			parser.parse();
			parser.mergeToFile(_extensionFile, ProjectConstants.COMPONENTS);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private String getRequireJSNodeContent() {
		Map<String, String> fieldMap = new HashMap<String, String>();
		
		if(_componentHelper.getMobileMode() && _componentHelper.getCommonsMode())
		{
			fieldMap.put(ProjectConstants.MODES, ProjectConstants.COMMONS_M);
		} else if (_componentHelper.getMobileMode()) {
			fieldMap.put(ProjectConstants.MODES,  ProjectConstants.M);
		} else if (_componentHelper.getCommonsMode()) {
			fieldMap.put(ProjectConstants.MODES,  ProjectConstants.COMMONS);
		}
		
		fieldMap.put(ProjectConstants.COMPONENT_PATH_TEMPLATE, 
				ProjectConstants.COMPONENT_PATH + _componentHelper.getClassName());
		
		TemplateParser parser = new TemplateParser(fieldMap);
		parser.loadTemplate("require-js-template");
		parser.parse();
		return parser.getCompiledText();
	}
	
	private String getCSSIncludeNodeContent() {
		Map<String, String> fieldMap = new HashMap<String, String>();
				
		fieldMap.put(ProjectConstants.COMPONENT_CSS_PATH_TEMPLATE, 
				ProjectConstants.COMPONENT_CSS_PATH + _componentHelper.getClassName());
		
		TemplateParser parser = new TemplateParser(fieldMap);
		parser.loadTemplate("css-include-template");
		parser.parse();
		return parser.getCompiledText();
	}
	
	/**
	 * Creates and populate ZTL file for the current project
	 * @param componentFile: Instance of contribution.ztl file in the current project
	 */
	private void populateComponentZTLFile() {
		try {
			Map<String, String> fieldMap = new HashMap<String, String>();
			fieldMap.put(ProjectConstants.DESCRIPTION, _componentHelper.getDescription());
			fieldMap.put(ProjectConstants.AUTHOR, "");
			fieldMap.put(ProjectConstants.DATE, new Date().toString());
			fieldMap.put(ProjectConstants.PACKAGE_NAME, _componentHelper.getPackageName());
			fieldMap.put(ProjectConstants.CLASS_NAME, _componentHelper.getClassName());
			if(_componentHelper.getClassToExtend().equals(ProjectConstants.NONE)) {
				fieldMap.put(ProjectConstants.SUPER_CLASS_NAME, "");
				fieldMap.put(ProjectConstants.EXTENDS, "");
			} else {
				fieldMap.put(ProjectConstants.SUPER_CLASS_NAME, _componentHelper.getClassToExtend());
				fieldMap.put(ProjectConstants.EXTENDS, _componentHelper.EXTENDS_KEYWORD);
			}
			
			TemplateParser parser = new TemplateParser(fieldMap);
			parser.loadTemplate(ProjectConstants.ZTL_TEMPLATE);
			parser.parse();
			_componentFile.create(parser.getCompiledTextAsStream(), IResource.NONE, null);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Create and populate the contribution.xml file with extension details
	 * Other sections of this file will be handled by respective function
	 * @param extensionFile: Instance of contribution.xml file in the current project
	 */
	private void populateSDKExtensionNode() {
		try {
			Map<String, String> fieldMap = new HashMap<String, String>();
			fieldMap.put(ProjectConstants.ID, _extensionHelper.getId());
			fieldMap.put(ProjectConstants.TITLE, _extensionHelper.getTitle());
			fieldMap.put(ProjectConstants.VERSION, _extensionHelper.getVersion());
			fieldMap.put(ProjectConstants.VENDOR, _extensionHelper.getVendor());
			fieldMap.put(ProjectConstants.EULA, _extensionHelper.getEula());
			TemplateParser parser = new TemplateParser(fieldMap);
			parser.loadTemplate(ProjectConstants.EXTENSION_TEMPLATE);
			parser.parse();
			_extensionFile.create(parser.getCompiledTextAsStream(), IResource.NONE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

}
