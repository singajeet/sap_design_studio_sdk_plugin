package com.armin.sap.ds.builder.diagrams.providers.component.client;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;

public class ComponentClientDiagramTypeProvider extends AbstractDiagramTypeProvider {

	public ComponentClientDiagramTypeProvider() {
		setFeatureProvider(new ComponentClientFeatureProvider(this));
	}

}
