package com.armin.sap.ds.builder.properties.tree.nodes;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import com.armin.sap.ds.builder.ui.navigation.tree.nodes.GenericFileNode;

public class GenericFileNodeProperties extends ProjectItemNodeProperties {

	final protected GenericFileNode _fileNode;
	protected static final String PROPERTY_PATH = "path";
	protected static final String PROPERTY_ABS_PATH = "abs_path";
	protected static final String PROPERTY_IS_READONLY = "is_readonly";
	
	protected static final String PROPERTY_SIZE = "size";
	protected static final String PROPERTY_MODIFIED_ON = "modified_on";
	private IPropertyDescriptor[] descriptors;
	
	protected final Object GenericFileNodePropertiesTable[][] = {
			{PROPERTY_PATH, new TextPropertyDescriptor(PROPERTY_PATH, "Path")},
			{PROPERTY_ABS_PATH, new TextPropertyDescriptor(PROPERTY_ABS_PATH, "Absolute Path")},
			{PROPERTY_IS_READONLY, new TextPropertyDescriptor(PROPERTY_IS_READONLY, "Is Readonly")},			
			{PROPERTY_SIZE, new TextPropertyDescriptor(PROPERTY_SIZE, "Size")},
			{PROPERTY_MODIFIED_ON, new TextPropertyDescriptor(PROPERTY_MODIFIED_ON, "Modified On")}
	};
	
	protected String path = "";
	protected String abs_path = "";
	protected String is_readonly = "";	
	protected String size = "";
	protected String modified_on = "";
	
	public GenericFileNodeProperties(GenericFileNode node) {
		super(node);
		this._fileNode = node;
		this.initProperties();	
		this.initPropertyDescriptors();
	}
	
	private void initProperties() {
		try {
			this.path = this._fileNode.getFilePath();			
			File file = Path.fromOSString(this._fileNode.getAbsolutePath()).toFile();			
			
			if(file.exists()) {
				this.abs_path = file.getAbsolutePath();
				this.is_readonly = file.canWrite() ? "false" : "true";
				this.size = String.valueOf(file.length());
				this.modified_on = new Date(file.lastModified()).toString();
			}
		}catch(Exception e) {
			MessageDialog.openError(null, "Error", "Error while reading file attributes..." + e.getMessage());
			e.printStackTrace();
		}
	}
	
	private void initPropertyDescriptors() {
		
		if(this.descriptors == null) {
			this.descriptors = new IPropertyDescriptor[GenericFileNodePropertiesTable.length];
		}
		
		for (int i = 0; i < GenericFileNodePropertiesTable.length; i++) {
            PropertyDescriptor descriptor;
            descriptor = (PropertyDescriptor) GenericFileNodePropertiesTable[i][1];
            this.descriptors[i] = descriptor;	            
            descriptor.setCategory("File");//$NON-NLS-1$
        }		 
	}
	
	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {		
		ArrayList<IPropertyDescriptor> propertyDescriptors = new ArrayList<IPropertyDescriptor>(Arrays.asList(this.descriptors));
		propertyDescriptors.addAll(Arrays.asList(super.getPropertyDescriptors()));
		IPropertyDescriptor[] mergedArray = new IPropertyDescriptor[propertyDescriptors.size()];
		propertyDescriptors.toArray(mergedArray);		
		
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
		if(id.equals(PROPERTY_SIZE)) {			
			return this.size;
		}
		if(id.equals(PROPERTY_MODIFIED_ON)) {			
			return this.modified_on;
		}
		
		return super.getPropertyValue(id);
	}
}
