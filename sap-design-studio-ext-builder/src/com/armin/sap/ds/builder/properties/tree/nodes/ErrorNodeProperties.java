package com.armin.sap.ds.builder.properties.tree.nodes;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ErrorNode;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.IProjectItemNode;

public class ErrorNodeProperties extends ProjectItemNodeProperties {

	protected final ErrorNode _node;
	protected static final String PROPERTY_ERROR_MESSAGE = "error_message";
	
	protected final Object ErrorNodePropertiesTable[][] = {
			{PROPERTY_ERROR_MESSAGE, new TextPropertyDescriptor(PROPERTY_ERROR_MESSAGE, "Error Message")}
		};
	
	protected String error_message = "";
	private IPropertyDescriptor[] descriptors;
	
	public ErrorNodeProperties(IProjectItemNode node) {
		super(node);
		_node = (ErrorNode)node;
		this.initProperties();
		this.initPropertyDescriptors();
	}

	private void initProperties() {		
		this.error_message = _node.getName();		
	}

	private void initPropertyDescriptors() {
		
		if(this.descriptors == null) {
			this.descriptors = new IPropertyDescriptor[ErrorNodePropertiesTable.length];
		}
		
		for (int i = 0; i < ErrorNodePropertiesTable.length; i++) {
            PropertyDescriptor descriptor;
            descriptor = (PropertyDescriptor) ErrorNodePropertiesTable[i][1];
            this.descriptors[i] = descriptor;	            
            descriptor.setCategory("Error");//$NON-NLS-1$
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
		if(id.equals(PROPERTY_ERROR_MESSAGE)) {			
			return this.error_message;
		}
		return super.getPropertyValue(id);
	}

}
