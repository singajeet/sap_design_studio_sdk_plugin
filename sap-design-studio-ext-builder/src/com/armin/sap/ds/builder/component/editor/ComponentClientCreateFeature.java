package com.armin.sap.ds.builder.component.editor;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import com.armin.sap.ds.builder.api.common.Prompts;

public class ComponentClientCreateFeature extends AbstractCreateFeature {
	
	private static final String TITLE = "Create Client Instance";
	 
    private static final String USER_QUESTION = "Enter name for client instance";

	public ComponentClientCreateFeature(IFeatureProvider fp) {
		super(fp, TITLE, "Creates component client instance");		
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		 // ask user for EClass name
        String newClassName = Prompts.askStringValue(TITLE, USER_QUESTION, "");
        if (newClassName == null || newClassName.trim().length() == 0) {
            return EMPTY;
        }
 
        // create EClass
        EClass newClass = EcoreFactory.eINSTANCE.createEClass();
        // Add model element to resource.
        // We add the model element to the resource of the diagram for
        // simplicity's sake. Normally, a customer would use its own
        // model persistence layer for storing the business model separately.
        getDiagram().eResource().getContents().add(newClass);
        newClass.setName(newClassName);
 
        // do the add
        addGraphicalRepresentation(context, newClass);
 
        // return newly created business object(s)
        return new Object[] { newClass };
	}

}
