package com.armin.sap.ds.builder.diagrams.providers.component.client;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.pattern.DefaultFeatureProviderWithPatterns;

import com.armin.sap.ds.builder.diagrams.patterns.ComponentClientObjectPattern;
import com.armin.sap.ds.builder.diagrams.patterns.ConstantsObjectPattern;

public class ClientComponentFeatureProvider extends DefaultFeatureProviderWithPatterns {

	public ClientComponentFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
		addPattern(new ComponentClientObjectPattern());
		addPattern(new ConstantsObjectPattern());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.graphiti.features.impl.AbstractFeatureProvider#getAddFeature(org.eclipse.graphiti.features.context.IAddContext)
	 */
//	@Override
//	public IAddFeature getAddFeature(IAddContext context) {
//		
//		if(context.getNewObject() instanceof EClass) {
//			return new ClientComponentAddFeature(this);
//		}
//		
//		return super.getAddFeature(context);
//	}

	/* (non-Javadoc)
	 * @see org.eclipse.graphiti.features.impl.AbstractFeatureProvider#getCreateFeatures()
	 */
//	@Override
//	public ICreateFeature[] getCreateFeatures() {
//		
//		return new ICreateFeature[] {new ClientComponentCreateFeature(this)};
//	}
	
	

}
