package com.armin.sap.ds.builder.properties;

import java.util.Date;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import com.armin.sap.ds.builder.navigator.tree.GenericFileNode;

public class GenericFileNodeProperties extends ProjectItemNodeProperties {

	final protected GenericFileNode _fileNode;
	protected static final String PROPERTY_PATH = "path";
	protected static final String PROPERTY_ABS_PATH = "abs_path";
	protected static final String PROPERTY_IS_READONLY = "is_readonly";
	protected static final String PROPERTY_IS_VIRTUAL = "is_virtual";
	protected static final String PROPERTY_SIZE = "size";
	protected static final String PROPERTY_MODIFIED_ON = "modified_on";
	
	protected final Object GenericFileNodePropertiesTable[][] = {
			{PROPERTY_PATH, new TextPropertyDescriptor(PROPERTY_PATH, "Path")},
			{PROPERTY_ABS_PATH, new TextPropertyDescriptor(PROPERTY_ABS_PATH, "Absolute Path")},
			{PROPERTY_IS_READONLY, new TextPropertyDescriptor(PROPERTY_IS_READONLY, "Is Readonly")},
			{PROPERTY_IS_VIRTUAL, new TextPropertyDescriptor(PROPERTY_IS_VIRTUAL, "Is Virtual")},
			{PROPERTY_SIZE, new TextPropertyDescriptor(PROPERTY_SIZE, "Size")},
			{PROPERTY_MODIFIED_ON, new TextPropertyDescriptor(PROPERTY_MODIFIED_ON, "Modified On")}
	};
	
	protected String path = "";
	protected String abs_path = "";
	protected String is_readonly = "";
	protected String is_virtual = "";
	protected String size = "";
	protected String modified_on = "";
	
	public GenericFileNodeProperties(GenericFileNode node) {
		super(node);
		this._fileNode = node;
		this.initProperties();		
	}
	
	private void initProperties() {
		this.path = this._fileNode.getFilePath();
		IFile genericFile = this._fileNode.getProject().getFile(this.path);
		this.abs_path = genericFile.getLocation().makeAbsolute().toOSString();
		this.is_readonly = genericFile.isReadOnly() ? "true" : "false";
		this.is_virtual = genericFile.isVirtual() ? "true" : "false";
		this.size = String.valueOf(genericFile.getLocation().toFile().length());
		this.modified_on = new Date( genericFile.getModificationStamp()).toString();
	}
	
	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {		
		IPropertyDescriptor[] genericFileNodePropertyDescriptors = new IPropertyDescriptor[GenericFileNodePropertiesTable.length]; 
		
		 for (int i = 0; i < GenericFileNodePropertiesTable.length; i++) {
	            PropertyDescriptor descriptor;

	            descriptor = (PropertyDescriptor) GenericFileNodePropertiesTable[i][1];
	            genericFileNodePropertyDescriptors[i] = descriptor;	            
	            descriptor.setCategory("Project");//$NON-NLS-1$
	        }

		 IPropertyDescriptor[] mergedArray = super.mergeWithParent(genericFileNodePropertyDescriptors);
	     return mergedArray;
	}


	@Override
	public Object getPropertyValue(Object id) {
		if(id.equals(PROPERTY_PATH)) {			
			return this.path;
		}
		if(id.equals(PROPERTY_ABS_PATH)) {			
			return this.abs_path;
		}
		if(id.equals(PROPERTY_IS_READONLY)) {			
			return this.is_readonly;
		}
		if(id.equals(PROPERTY_IS_VIRTUAL)) {			
			return this.is_virtual;
		}
		if(id.equals(PROPERTY_SIZE)) {			
			return this.size;
		}
		if(id.equals(PROPERTY_MODIFIED_ON)) {			
			return this.modified_on;
		}
		
		return super.getPropertyValue(id);
	}
}
