package com.armin.sap.ds.builder.properties;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import com.armin.sap.ds.builder.navigator.tree.IProjectItemNode;

public class ProjectItemNodeProperties implements IPropertySource {

	final protected IProjectItemNode node;
	protected static final String PROPERTY_ID = "id";
	protected static final String PROPERTY_NAME = "name";
	protected static final String PROPERTY_DESCRIPTION = "description";
	protected static final String PROPERTY_TOOLTIP = "tooltip";
	protected static final String PROPERTY_TYPE = "type";	
	private IPropertyDescriptor[] descriptors;
	
	protected final Object PropertiesTable[][] = {
			{PROPERTY_ID, new TextPropertyDescriptor(PROPERTY_ID, "Id")},
			{PROPERTY_NAME, new TextPropertyDescriptor(PROPERTY_NAME, "Name")},
			{PROPERTY_DESCRIPTION, new TextPropertyDescriptor(PROPERTY_DESCRIPTION, "Description")},
			{PROPERTY_TOOLTIP, new TextPropertyDescriptor(PROPERTY_TOOLTIP, "Tooltip")},
			{PROPERTY_TYPE, new TextPropertyDescriptor(PROPERTY_TYPE, "Type")}
	};
	
	protected String id = "";
	protected String name = "";
	protected String description = "";
	protected String tooltip = "";
	protected String type = "";	
	
	public ProjectItemNodeProperties(IProjectItemNode node) {
		super();
		this.node = node;
		this.initProperties();
		this.initPropertyDescriptors();
	}
	
	protected void firePropertyChanged(String propName, Object value) {
		if(node == null)
			return;
		
		if(propName.equals(PROPERTY_DESCRIPTION)) {
			this.node.setDescription((String)value);
			return;
		}
		
		if(propName.equals(PROPERTY_TOOLTIP)) {
			this.node.setTooltip((String)value);
			return;
		}
	}
	
	private void initProperties() {
		
		id = node.getModel().getId();
		name = node.getName();
		description = node.getDescription();
		tooltip = node.getTooltip();
		type = node.getType().toString();
	}
	
	@Override
	public Object getEditableValue() {		
		return this;
	}

	private void initPropertyDescriptors() {
		if(descriptors == null) {
			descriptors = new IPropertyDescriptor[PropertiesTable.length];
		
			for (int i = 0; i < PropertiesTable.length; i++) {
	            // Add each property supported.

	            PropertyDescriptor descriptor;

	            descriptor = (PropertyDescriptor) PropertiesTable[i][1];
	            descriptors[i] = descriptor;
	            descriptor.setCategory("Basic");//$NON-NLS-1$
	        }

		}
	}
	
	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
			if(descriptors == null) {
				this.initPropertyDescriptors();
			}			 
	        // Return it.
	        return descriptors;
	}

	@Override
	public Object getPropertyValue(Object id) {
		if(id.equals(PROPERTY_ID)) {			
			return this.id;
		}
		
		if(id.equals(PROPERTY_DESCRIPTION)) {			
			return this.description;
		}
		
		if(id.equals(PROPERTY_TOOLTIP)) {			
			return this.tooltip;
		}
		
		if(id.equals(PROPERTY_NAME)) {			
			return this.name;
		}
		
		if(id.equals(PROPERTY_TYPE)) {			
			return this.type;
		}
		
		return null;
	}

	@Override
	public boolean isPropertySet(Object id) {		
		return false;
	}

//	protected final IPropertyDescriptor[] mergeWithParent(IPropertyDescriptor[] nodePropertyDescriptors) {
//		if(this.descriptors == null) {
//			this.initPropertyDescriptors();
//		}
//		
//		if(descriptors.length > 0) {
//			//IPropertyDescriptor[] parentPropertyDescriptors = this.getPropertyDescriptors();
//			ArrayList<IPropertyDescriptor> propertyDescriptors = new ArrayList<IPropertyDescriptor>(Arrays.asList(descriptors));
//			propertyDescriptors.addAll(Arrays.asList(nodePropertyDescriptors));
//			IPropertyDescriptor[] mergedArray = new IPropertyDescriptor[propertyDescriptors.size()];
//			propertyDescriptors.toArray(mergedArray);
//			return mergedArray;
//		}
//        return nodePropertyDescriptors;
//	}
	
	@Override
	public void resetPropertyValue(Object id) {		

	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		this.firePropertyChanged((String)id, value);
		
		if(id.equals(PROPERTY_DESCRIPTION)) {			
			this.description = (String)value;
			return;
		}
		
		if(id.equals(PROPERTY_TOOLTIP)) {
			this.tooltip = (String)value;
			return;
		}
		
		
	}

}
