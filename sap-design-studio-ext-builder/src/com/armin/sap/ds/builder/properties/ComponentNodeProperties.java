package com.armin.sap.ds.builder.properties;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import com.armin.sap.ds.builder.navigator.tree.ComponentNode;

public class ComponentNodeProperties extends GenericFileNodeProperties {

	protected final ComponentNode _compNode;
	protected static final String PROPERTY_DATA_BOUND = "data_bound";
	protected static final String PROPERTY_GROUP = "group";
	protected static final String PROPERTY_HANDLER_TYPE = "handler_type";
	protected static final String PROPERTY_MODES = "modes";
	protected static final String PROPERTY_NEW_INSTANCE_PREFIX = "new_instance_prefix";
	
	protected final Object ComponentNodePropertiesTable[][] = {
			{PROPERTY_DATA_BOUND, new TextPropertyDescriptor(PROPERTY_DATA_BOUND, "Is Data Bound")},
			{PROPERTY_GROUP, new TextPropertyDescriptor(PROPERTY_GROUP, "Group")},
			{PROPERTY_HANDLER_TYPE, new TextPropertyDescriptor(PROPERTY_HANDLER_TYPE, "Handler Type")},
			{PROPERTY_MODES, new TextPropertyDescriptor(PROPERTY_MODES, "Modes")},
			{PROPERTY_NEW_INSTANCE_PREFIX, new TextPropertyDescriptor(PROPERTY_NEW_INSTANCE_PREFIX, "New Instance Prefix")}
	};
	
	protected String data_bound = "";
	protected String group = "";
	protected String handler_type = "";
	protected String modes = "";
	protected String new_instance_prefix = "";
	private IPropertyDescriptor[] descriptors;
	
	public ComponentNodeProperties(ComponentNode node) {
		super(node);
		_compNode = node;
		this.initProperties();
		this.initPropertyDescriptors();
	}
	
	private void initProperties() {		
		this.path = _compNode.getFilePath();
		this.data_bound = _compNode.getComponent().isDatabound() ? "true" : "false";
		this.group = _compNode.getComponent().getGroup();
		this.handler_type = _compNode.getComponent().getHandlerType().name();
		_compNode.getComponent().getModes().forEach(mode -> {modes += mode + ", ";});
		this.new_instance_prefix = _compNode.getComponent().getNewInstancePrefix();
	}

	private void initPropertyDescriptors() {
		
		if(this.descriptors == null) {
			this.descriptors = new IPropertyDescriptor[ComponentNodePropertiesTable.length];
		}
		
		for (int i = 0; i < ComponentNodePropertiesTable.length; i++) {
            PropertyDescriptor descriptor;
            descriptor = (PropertyDescriptor) ComponentNodePropertiesTable[i][1];
            this.descriptors[i] = descriptor;	            
            descriptor.setCategory("Component");//$NON-NLS-1$
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
		if(id.equals(PROPERTY_DATA_BOUND)) {			
			return this.data_bound;
		}
		if(id.equals(PROPERTY_GROUP)) {			
			return this.group;
		}
		if(id.equals(PROPERTY_HANDLER_TYPE)) {			
			return this.handler_type;
		}
		if(id.equals(PROPERTY_MODES)) {			
			return this.modes;
		}
		if(id.equals(PROPERTY_NEW_INSTANCE_PREFIX)) {			
			return this.new_instance_prefix;
		}
		
		return super.getPropertyValue(id);
	}

}
