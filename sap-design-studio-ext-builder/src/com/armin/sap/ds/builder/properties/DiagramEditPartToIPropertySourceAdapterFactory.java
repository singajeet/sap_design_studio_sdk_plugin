package com.armin.sap.ds.builder.properties;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.platform.GraphitiConnectionEditPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheetPage;

import com.armin.sap.ds.builder.properties.diagrams.EReferenceProperties;

public class DiagramEditPartToIPropertySourceAdapterFactory implements IAdapterFactory {

	public DiagramEditPartToIPropertySourceAdapterFactory() {
		super();
	}

	public Object getAdapter(Object adaptableObject, @SuppressWarnings("rawtypes") Class adapterType) {
		if (IPropertySource.class.equals(adapterType)) {
			if (adaptableObject instanceof GraphitiConnectionEditPart) {
				GraphitiConnectionEditPart editPart = (GraphitiConnectionEditPart) adaptableObject;
				PictogramElement pictogramElement = editPart.getPictogramElement();
				Object object = editPart.getFeatureProvider().getBusinessObjectForPictogramElement(pictogramElement);
				if (object instanceof EReference) {
					return new EReferenceProperties((EReference) object);
				}
			}
		}
		if(adapterType == IPropertySheetPage.class) {
	    	 IPropertySourceProvider provider = new IPropertySourceProvider() {

					@Override
					public IPropertySource getPropertySource(Object object1) {
						
						if(adaptableObject instanceof GraphitiConnectionEditPart) {
							GraphitiConnectionEditPart ob = (GraphitiConnectionEditPart)adaptableObject;
							PictogramElement element = ob.getPictogramElement();
							//PictogramElement[] elements = getSelectedPictogramElements();
					    	 //Object object = getDiagramTypeProvider().getFeatureProvider().getBusinessObjectForPictogramElement(elements[0]);
							Object object = ob.getFeatureProvider().getBusinessObjectForPictogramElement(element);
					    	 if(object instanceof EReference)
					    		 return (new EReferenceProperties((EReference)object));
						}
						return null;
					}
		    		 
		    	 };
	    	 PropertySheetPage page = new PropertySheetPage();
	    	 page.setPropertySourceProvider(provider);
	    	 return page;
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	public Class[] getAdapterList() {
		return new Class[] { IPropertySource.class };
	}
}
