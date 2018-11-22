package com.armin.sap.ds.builder.properties.tree.nodes;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.core.resources.IFolder;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import com.armin.sap.ds.builder.ui.navigation.tree.nodes.GenericFolderNode;

public class GenericFolderNodeProperties extends ProjectItemNodeProperties {

	final protected GenericFolderNode _folderNode;
	protected static final String PROPERTY_PATH = "path";
	protected static final String PROPERTY_ABS_PATH = "abs_path";
	protected static final String PROPERTY_IS_VIRTUAL = "is_virtual";
	protected static final String PROPERTY_MODIFIED_ON = "modified_on";
	private IPropertyDescriptor[] descriptors;
	
	protected final Object GenericFolderNodePropertiesTable[][] = {
			{PROPERTY_PATH, new TextPropertyDescriptor(PROPERTY_PATH, "Path")},
			{PROPERTY_ABS_PATH, new TextPropertyDescriptor(PROPERTY_ABS_PATH, "Absolute Path")},
			{PROPERTY_IS_VIRTUAL, new TextPropertyDescriptor(PROPERTY_IS_VIRTUAL, "Is Virtual")},
			{PROPERTY_MODIFIED_ON, new TextPropertyDescriptor(PROPERTY_MODIFIED_ON, "Modified On")}
	};
	
	protected String path = "";
	protected String abs_path = "";
	protected String is_virtual = "";
	protected String modified_on = "";
	
	
	public GenericFolderNodeProperties(GenericFolderNode node) {
		super(node);
		this._folderNode = node;
		this.initProperties();	
		this.initPropertyDescriptors();
	}

	private void initProperties() {
		try {
			this.path = this._folderNode.getFolderPath();
			IFolder genericFolder = this._folderNode.getProject().getFolder(this.path);
			this.abs_path = genericFolder.getLocation().makeAbsolute().toOSString();
			this.is_virtual = genericFolder.isVirtual() ? "true" : "false";
			Path fsPath = Paths.get(this.abs_path);
			this.modified_on = Files.getLastModifiedTime(fsPath, LinkOption.NOFOLLOW_LINKS).toString();			
		}catch(Exception e) {
			MessageDialog.openError(null, "Error", "Error while reading file attributes..." + e.getMessage());
			e.printStackTrace();
		}
	}
	
	private void initPropertyDescriptors() {
		
		if(this.descriptors == null) {
			this.descriptors = new IPropertyDescriptor[GenericFolderNodePropertiesTable.length];
		}
		
		for (int i = 0; i < GenericFolderNodePropertiesTable.length; i++) {
            PropertyDescriptor descriptor;
            descriptor = (PropertyDescriptor) GenericFolderNodePropertiesTable[i][1];
            this.descriptors[i] = descriptor;	            
            descriptor.setCategory("Folder");//$NON-NLS-1$
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
		if(id.equals(PROPERTY_IS_VIRTUAL)) {			
			return this.is_virtual;
		}
		if(id.equals(PROPERTY_MODIFIED_ON)) {			
			return this.modified_on;
		}
		
		return super.getPropertyValue(id);
	}

}
