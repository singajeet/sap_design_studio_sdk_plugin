package com.armin.sap.ds.builder.properties;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import com.armin.sap.ds.builder.navigator.tree.ExtensionCollectionNode;

public class ExtensionCollectionNodeProperties extends GenericFolderNodeProperties {

	protected final ExtensionCollectionNode _node;
	protected static final String PROPERTY_EXTENSION_COUNT = "extension_count";
	
	protected final Object ExtensionCollectionNodePropertiesTable[][] = {
			{PROPERTY_EXTENSION_COUNT, new TextPropertyDescriptor(PROPERTY_EXTENSION_COUNT, "Extension Count")}
	};
	
	protected String extension_count = "";
	private IPropertyDescriptor[] descriptors;
	
	public ExtensionCollectionNodeProperties(ExtensionCollectionNode node) {
		super(node);
		this._node = node;
		this.initProperties();
		this.initPropertyDescriptors();
	}
	
	private void initProperties() {		
		this.extension_count = String.valueOf(this._node.getChildren(null).length);
	}

	private void initPropertyDescriptors() {
		
		if(this.descriptors == null) {
			this.descriptors = new IPropertyDescriptor[ExtensionCollectionNodePropertiesTable.length];
		}
		
		for (int i = 0; i < ExtensionCollectionNodePropertiesTable.length; i++) {
            PropertyDescriptor descriptor;
            descriptor = (PropertyDescriptor) ExtensionCollectionNodePropertiesTable[i][1];
            this.descriptors[i] = descriptor;	            
            descriptor.setCategory("Extensions");//$NON-NLS-1$
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
		if(id.equals(PROPERTY_EXTENSION_COUNT)) {			
			return this.extension_count;
		}
				return super.getPropertyValue(id);
	}


}
