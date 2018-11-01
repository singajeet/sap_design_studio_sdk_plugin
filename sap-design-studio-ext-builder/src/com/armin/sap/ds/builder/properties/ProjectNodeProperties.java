package com.armin.sap.ds.builder.properties;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import com.armin.sap.ds.builder.navigator.tree.ProjectNode;

public class ProjectNodeProperties extends ProjectItemNodeProperties {

	final protected ProjectNode _projNode; 
	protected static final String PROPERTY_PATH = "path";
	protected static final String PROPERTY_NATURE = "nature";
	
	protected final Object ProjectNodePropertiesTable[][] = {
			{PROPERTY_PATH, new TextPropertyDescriptor(PROPERTY_PATH, "Path")},
			{PROPERTY_NATURE, new TextPropertyDescriptor(PROPERTY_NATURE, "Nature")}
			
	};
	
	String path = "";
	String nature = "";
	
	public ProjectNodeProperties(ProjectNode node) {
		super(node);
		this._projNode = node;
		this.initProperties();
	}
	
	private void initProperties() {
		try {
			this.path = node.getProject().getLocation().toPortableString();
			this.nature = String.join(",", node.getProject().getDescription().getNatureIds());
		}catch(Exception e) {
			MessageDialog.open(MessageDialog.ERROR, null, "Initialize Properties", 
					"Error while initializing Properties - " + e.getMessage() , SWT.NONE);
			e.printStackTrace();
		}
	}
	
	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {		
		IPropertyDescriptor[] projectNodePropertyDescriptors = new IPropertyDescriptor[ProjectNodePropertiesTable.length]; 
		
		 for (int i = 0; i < ProjectNodePropertiesTable.length; i++) {
	            PropertyDescriptor descriptor;

	            descriptor = (PropertyDescriptor) ProjectNodePropertiesTable[i][1];
	            projectNodePropertyDescriptors[i] = descriptor;	            
	            descriptor.setCategory("Project");//$NON-NLS-1$
	        }

		 IPropertyDescriptor[] mergedArray = super.mergeWithParent(projectNodePropertyDescriptors);
	     return mergedArray;
	}

	@Override
	public Object getPropertyValue(Object id) {
		if(id.equals(PROPERTY_PATH)) {			
			return this.path;
		}
		
		if(id.equals(PROPERTY_NATURE)) {			
			return this.nature;
		}
	
		return super.getPropertyValue(id);
	}


}
