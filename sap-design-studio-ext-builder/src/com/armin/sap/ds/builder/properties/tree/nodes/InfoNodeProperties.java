package com.armin.sap.ds.builder.properties.tree.nodes;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import com.armin.sap.ds.builder.ui.navigation.tree.nodes.InfoNode;

public class InfoNodeProperties extends ProjectItemNodeProperties {

	protected final InfoNode _node;
	protected static final String PROPERTY_MESSAGE = "message";
	
	protected final Object InfoNodePropertiesTable[][] = {
			{PROPERTY_MESSAGE, new TextPropertyDescriptor(PROPERTY_MESSAGE, "Message Details")}
		};
	
	protected String _message = "";
	private IPropertyDescriptor[] descriptors;
	
	public InfoNodeProperties(InfoNode node) {
		super(node);
		_node = node;
		this.initProperties();
		this.initPropertyDescriptors();
	}
	
	private void initProperties() {		
		this._message = _node.getName();		
	}

	private void initPropertyDescriptors() {
		
		if(this.descriptors == null) {
			this.descriptors = new IPropertyDescriptor[InfoNodePropertiesTable.length];
		}
		
		for (int i = 0; i < InfoNodePropertiesTable.length; i++) {
            PropertyDescriptor descriptor;
            descriptor = (PropertyDescriptor) InfoNodePropertiesTable[i][1];
            this.descriptors[i] = descriptor;	            
            descriptor.setCategory("Message");//$NON-NLS-1$
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
		if(id.equals(PROPERTY_MESSAGE)) {			
			return this._message;
		}
		return super.getPropertyValue(id);
	}


}
