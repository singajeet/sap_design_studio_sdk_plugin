package com.armin.sap.ds.builder.properties;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import com.armin.sap.ds.builder.navigator.tree.ExtensionNode;

public class ExtensionNodeProperties extends GenericFileNodeProperties {

	protected final ExtensionNode _extNode;
	protected static final String PROPERTY_GROUPS = "groups";
	protected static final String PROPERTY_GROUPS_COUNT = "groups_count";
	
	protected final Object ExtensionNodePropertiesTable[][] = {
			{PROPERTY_GROUPS, new TextPropertyDescriptor(PROPERTY_GROUPS, "Groups")},
			{PROPERTY_GROUPS_COUNT, new TextPropertyDescriptor(PROPERTY_GROUPS_COUNT, "Groups Count")}
	};
	
	protected String groups = "";
	protected String groups_count = "";
	private IPropertyDescriptor[] descriptors;
	
	public ExtensionNodeProperties(ExtensionNode node) {
		super(node);	
		this._extNode = node;
		this.initProperties();
		this.initPropertyDescriptors();
	}

	private void initProperties() {				
		_extNode.getGroups().forEach(group -> {groups += group + ", ";});
		this.groups_count = String.valueOf(_extNode.getGroups().size());
		
	}

	private void initPropertyDescriptors() {
		
		if(this.descriptors == null) {
			this.descriptors = new IPropertyDescriptor[ExtensionNodePropertiesTable.length];
		}
		
		for (int i = 0; i < ExtensionNodePropertiesTable.length; i++) {
            PropertyDescriptor descriptor;
            descriptor = (PropertyDescriptor) ExtensionNodePropertiesTable[i][1];
            this.descriptors[i] = descriptor;	            
            descriptor.setCategory("Extension");//$NON-NLS-1$
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
		if(id.equals(PROPERTY_GROUPS)) {			
			return this.groups;
		}
		if(id.equals(PROPERTY_GROUPS_COUNT)) {			
			return this.groups_count;
		}
		return super.getPropertyValue(id);
	}

	
}
