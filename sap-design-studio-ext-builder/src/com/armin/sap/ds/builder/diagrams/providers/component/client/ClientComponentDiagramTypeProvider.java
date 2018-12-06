package com.armin.sap.ds.builder.diagrams.providers.component.client;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;

public class ClientComponentDiagramTypeProvider extends AbstractDiagramTypeProvider {

	public ClientComponentDiagramTypeProvider() {		
		super();
		setFeatureProvider(new ClientComponentFeatureProvider(this));
	}

}
