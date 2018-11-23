package com.armin.sap.ds.builder.editors.component.diagram;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheetPage;

import com.armin.sap.ds.builder.properties.diagrams.EReferenceProperties;

public class ComponentDiagramEditor extends DiagramEditor{

	public static final String DIAGRAM_EDITOR_ID = "com.armin.sap.ds.builder.editors.component_diagram_editor";
	
	public ComponentDiagramEditor() {
		super();		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.graphiti.ui.editor.DiagramEditor#getAdapter(java.lang.Class)
	 */	
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class adapter) {
		 if (adapter == IWorkbenchAdapter.class)
			 return this;
	     if (adapter == IPropertySource.class) {
	    	 PictogramElement[] elements = getSelectedPictogramElements();
	    	 Object object = this.getDiagramTypeProvider().getFeatureProvider().getBusinessObjectForPictogramElement(elements[0]);
	    	 if(object instanceof EReference)
	    		 return (new EReferenceProperties((EReference)object));    		 
	     }
	     if(adapter == IPropertySheetPage.class) {
	    	 IPropertySourceProvider provider = new IPropertySourceProvider() {

					@Override
					public IPropertySource getPropertySource(Object object1) {
						PictogramElement[] elements = getSelectedPictogramElements();
				    	 Object object = getDiagramTypeProvider().getFeatureProvider().getBusinessObjectForPictogramElement(elements[0]);
				    	 if(object instanceof EReference)
				    		 return (new EReferenceProperties((EReference)object));
				    	 
						return null;
					}
		    		 
		    	 };
	    	 PropertySheetPage page = new PropertySheetPage();
	    	 page.setPropertySourceProvider(provider);
	    	 return page;
	     }
		return super.getAdapter(adapter);
	}		
}
