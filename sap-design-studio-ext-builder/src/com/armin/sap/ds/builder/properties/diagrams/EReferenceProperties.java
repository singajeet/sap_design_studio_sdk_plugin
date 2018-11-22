package com.armin.sap.ds.builder.properties.diagrams;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

public class EReferenceProperties implements IPropertySource{

	protected final EReference _item;
	private IPropertyDescriptor[] descriptors;
	protected static final String PROPERTY_NAME = "name";
	protected static final String PROPERTY_TYPE = "type";
	protected static final String PROPERTY_REF_TYPE = "ref_type";
	
	protected final Object PropertiesTable[][] = {			
			{PROPERTY_NAME, new TextPropertyDescriptor(PROPERTY_NAME, "Name")},
			{PROPERTY_TYPE, new TextPropertyDescriptor(PROPERTY_TYPE, "Type")},
			{PROPERTY_REF_TYPE, new TextPropertyDescriptor(PROPERTY_REF_TYPE, "Reference Type")}
	};
	
	protected String name = "";
	protected String type = "";
	protected String ref_type = "";
	
	public EReferenceProperties(EReference item) {
		super();
		_item = item;
		this.initProperties();
		this.initPropertyDescriptors();
	}

	protected void firePropertyChanged(String propName, Object value) {
		if(_item == null)
			return;
		
		if(propName.equals(PROPERTY_NAME)) {
			this._item.setName((String)value);
			return;
		}		
	}
	
	private void initProperties() {
		
		if(_item != null) {
			name = _item.getName();
			type = _item.getEType().getInstanceTypeName();
			ref_type = _item.getEReferenceType().getInstanceTypeName();
		}
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
		if(id.equals(PROPERTY_NAME)) {			
			return this.name;
		}
		
		if(id.equals(PROPERTY_TYPE)) {			
			return this.type;
		}
		
		if(id.equals(PROPERTY_REF_TYPE)) {			
			return this.ref_type;
		}
		
		return null;
	}

	@Override
	public boolean isPropertySet(Object id) {		
		return false;
	}
	
	@Override
	public void resetPropertyValue(Object id) {		

	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		this.firePropertyChanged((String)id, value);
		
		if(id.equals(PROPERTY_NAME)) {			
			this._item.setName((String)value);
			return;
		}	
		
	}

}
