package com.armin.sap.ds.support;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;

import com.armin.sap.ds.xml.Component;
import com.armin.sap.ds.xml.Extension;
import com.armin.sap.ds.xml.ObjectFactory;

public class ProjectContentHelper {

	private ExtensionHelper _extensionHelper;
	private ComponentHelper _componentHelper;
	private IProject _currentProject;
	private IFile _componentFile;
	private IFile _extensionFile;	
	private static ProjectContentHelper _singletonInstance;
	
	private ProjectContentHelper() {		
		
	}
	
	public static ProjectContentHelper getInstance() {
		if(_singletonInstance == null) {
			_singletonInstance = new ProjectContentHelper();			
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
			
			ObjectFactory _factory = new ObjectFactory();
			JAXBElement<Extension> _rootElement = _factory.createSdkExtension(extModel);
			extModel.getComponent().add(componentModel);
			
			try {
				JAXBContext context = JAXBContext.newInstance(Extension.class);
				Marshaller marshaller = context.createMarshaller();
				_extensionFile.create(new ByteArrayInputStream("<!-- contribution.xml -->".getBytes()), true, null);
				
				marshaller.marshal(_rootElement, _extensionFile.getRawLocation().toFile().getAbsoluteFile());
				
			} catch (Exception e) {
				MessageDialog.open(MessageDialog.ERROR, null, "Error while generating file", e.toString(), SWT.SHEET);
				e.printStackTrace();
			}
//			populateSDKExtensionNode();
//			populateComponentGroup();
//			populateComponentNode();
		}
	
		if(!componentFile.exists()) {
//			populateComponentZTLFile();
		}
	}
	
	/**
	 * Create and populate the contribution.xml file with extension details
	 * Other sections of this file will be handled by respective function
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
	
	/**
	 * Create a node of type group and save it to XML extension file
	 */
	private void populateComponentGroup() {
		String id = _componentHelper.getGroup();
		populateGroup(id, id);
	}
	
	/**
	 * Populates the Component Node in the XML extension file
	 */
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
			
			//default value properties for Height & Width
			String defaultValues = getDefaultValueContent(ProjectConstants.HEIGHT, "100");
			defaultValues += ProjectConstants.NEW_LINE;
			defaultValues += getDefaultValueContent(ProjectConstants.WIDTH, "100");
			fieldMap.put(ProjectConstants.DEFAULT_VALUES, defaultValues);
			
			
			//parse and update the contribution.xml file with component definition
			TemplateParser parser = new TemplateParser(fieldMap);
			parser.loadTemplate(ProjectConstants.COMPONENT_TEMPLATE);
			parser.parse();
			parser.mergeToFile(_extensionFile, ProjectConstants.COMPONENTS);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Creates and populate ZTL file for the current project
	 */
	private void populateComponentZTLFile() {
		try {
			Map<String, String> fieldMap = new HashMap<String, String>();
			fieldMap.put(ProjectConstants.DESCRIPTION, _componentHelper.getDescription());
			fieldMap.put(ProjectConstants.AUTHOR, "");
			fieldMap.put(ProjectConstants.DATE, new Date().toString());
			fieldMap.put(ProjectConstants.PACKAGE_NAME, _extensionHelper.getId());
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
	
	/*********************************************************************************************
	 * 					UTILITY FUNCTIONS FOR MANAGING PROJECT CONTENT
	 *********************************************************************************************/
	
	/**
	 * Add a new "placeholder" tag in the XML extension file "after closing tag" of last node of 
	 * 	similar node types
	 * @param fileName: Name of file where this tag needs to be added and saved
	 * @param afterTag: Closing tag of the last node of similar tag
	 * @param placeholderTag: The placeholder tag's name
	 * @return: true if tag created and saved else false
	 */
	private boolean addNewTag(String fileName, String afterTag, String placeholderTag) {
		InputStream inputStream = null;
		try {
			if(_currentProject.exists(new Path(fileName))) {
				
				IFile file = _currentProject.getFile(fileName);
				inputStream = file.getContents();		
		
				BufferedReader buf = new BufferedReader(new InputStreamReader(inputStream));
				StringBuilder sb = new StringBuilder();
	        
				String line = buf.readLine();
				while(line != null) {
					sb.append(line).append("\n");
					line = buf.readLine();
				}
				
				int lastComponentTagIndex = sb.lastIndexOf(afterTag);
	        
				sb.insert(lastComponentTagIndex, placeholderTag);
				
				file.delete(true, null);
				
				file.create(new ByteArrayInputStream(sb.toString().getBytes()), IResource.NONE, null);
				
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;
	}
	
	/**
	 * Sets the current component with the component instance passed args
	 * @param component
	 */
	public void setCurrentComponent(ComponentHelper component) {
		if(component != null)
			_componentHelper = component;
	}
	
	/**
	 * Adds a new component to the current extension file
	 * @param component
	 */
	public void addNewComponent(ComponentHelper component) {
		
		if(component == null)
			return;
		
		setCurrentComponent(component);
		
		boolean result = addNewTag(_extensionHelper.EXTENSION_XML_FILE_NAME, 
				ProjectConstants.COMPONENT_CLOSE_TAG, ProjectConstants.COMPONENT_PLACEHOLDER);
		if(result)
			populateComponentNode();
	}
	
	/**
	 * Adds a new Group to the current extension XML file 
	 * @param id
	 * @param title
	 */
	public void addNewGroup(String id, String title) {
		if(title == null || id == null)
			return;
		
		boolean result = addNewTag(_extensionHelper.EXTENSION_XML_FILE_NAME,
				ProjectConstants.GROUP_CLOSE_TAG, ProjectConstants.GROUPS);
		if(result)
			populateGroup(id, title);
	}
	
	/**
	 * Populates the value of group using the group template and save it to 
	 * current extension XML file
	 * @param id
	 * @param title
	 */
	private void populateGroup(String id, String title) {		
		if(id.equalsIgnoreCase(ProjectConstants.DEFAULT) 
				|| id.equalsIgnoreCase(ProjectConstants.TECHNICAL_COMPONENT)) {
			return;
		}
		Map<String, String> fieldMap = new HashMap<String, String>();
		fieldMap.put(ProjectConstants.ID, id);
		fieldMap.put(ProjectConstants.TITLE, title);
		
		TemplateParser parser = new TemplateParser(fieldMap);
		parser.loadTemplate(ProjectConstants.GROUP_TEMPLATE);
		parser.parse();
		parser.mergeToFile(_extensionFile, ProjectConstants.GROUPS);
	}
	
	/**
	 * Returns the "requireJs" node tag populated with values from current component
	 * @return: Compiled string representing a tag
	 */
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
		parser.loadTemplate(ProjectConstants.REQUIRE_JS_TEMPLATE);
		parser.parse();
		return parser.getCompiledText();
	}
	
	/**
	 * Returns the "cssInclude" node tag populated with values from current component
	 * @return: Compiled string representing a tag
	 */
	private String getCSSIncludeNodeContent() {
		Map<String, String> fieldMap = new HashMap<String, String>();
				
		fieldMap.put(ProjectConstants.COMPONENT_CSS_PATH_TEMPLATE, 
				ProjectConstants.COMPONENT_CSS_PATH + _componentHelper.getClassName());
		
		TemplateParser parser = new TemplateParser(fieldMap);
		parser.loadTemplate(ProjectConstants.CSS_INCLUDE_TEMPLATE);
		parser.parse();
		return parser.getCompiledText();
	}
	
	/**
	 * Returns the "defaultValue" tag with values passed as argument
	 * @param property: Name of the property
	 * @param value: value of property
	 * @return
	 */
	private String getDefaultValueContent(String property, String value) {
		Map<String, String> fieldMap = new HashMap<String, String>();
		fieldMap.put(ProjectConstants.PROPERTY, property);
		fieldMap.put(ProjectConstants.VALUE, value);
		
		TemplateParser parser = new TemplateParser(fieldMap);
		parser.loadTemplate(ProjectConstants.DEFAULT_VALUE_TEMPLATE);
		parser.parse();
		return parser.getCompiledText();
	}
	
	/**
	 * Add a new "defaultValue" tag to the current XML extension file
	 * @param property: Name of the property
	 * @param: value of the property
	 */
	public void addDefaultValue(String property, String value) {
		if(property == null || value == null)
			return;
		
		boolean result = addNewTag(_extensionHelper.EXTENSION_XML_FILE_NAME,
							ProjectConstants.DEFAULT_VALUE_CLOSE_TAG, 
							ProjectConstants.DEFAULT_VALUES);
	}
	
	

}
