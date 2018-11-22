package com.armin.sap.ds.builder.diagrams.providers;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

import com.armin.sap.ds.builder.diagrams.features.ComponentClientAddFeature;
import com.armin.sap.ds.builder.diagrams.features.ComponentClientCreateFeature;

public class ComponentClientFeatureProvider extends DefaultFeatureProvider {

	public ComponentClientFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.graphiti.features.impl.AbstractFeatureProvider#getAddFeature(org.eclipse.graphiti.features.context.IAddContext)
	 */
	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		
		if(context.getNewObject() instanceof EClass) {
			return new ComponentClientAddFeature(this);
		}
		
		return super.getAddFeature(context);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.graphiti.features.impl.AbstractFeatureProvider#getCreateFeatures()
	 */
	@Override
	public ICreateFeature[] getCreateFeatures() {
		
		return new ICreateFeature[] {new ComponentClientCreateFeature(this)};
	}
	
	

}
