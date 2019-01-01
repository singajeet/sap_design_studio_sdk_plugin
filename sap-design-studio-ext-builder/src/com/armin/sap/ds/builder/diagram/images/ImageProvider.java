package com.armin.sap.ds.builder.diagram.images;

import org.eclipse.graphiti.ui.platform.AbstractImageProvider;
import org.eclipse.graphiti.ui.platform.IImageProvider;

public class ImageProvider extends AbstractImageProvider implements IImageProvider {

	protected static final String COMPONENTS_PREFIX = "com.armin.sap.ds.builder.diagram.images.components.";
	public static final String COMPONENT_IMAGE = COMPONENTS_PREFIX + "id";
	public static final String COMPONENT_LARGE_IMAGE = COMPONENTS_PREFIX + "large.id";
	
	protected static final String CONSTANTS_PREFIX = "com.armin.sap.ds.builder.diagram.images.constants.";
	public static final String CONSTANT_IMAGE = CONSTANTS_PREFIX + "id";
	public static final String CONSTANT_LARGE_IMAGE = CONSTANTS_PREFIX + "large.id";
	
	public ImageProvider() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void addAvailableImages() {
		addImageFilePath(COMPONENT_IMAGE, "images/component_diagram_16x16.png");
		addImageFilePath(COMPONENT_LARGE_IMAGE, "images/component_diagram_24x24.png");

		addImageFilePath(CONSTANT_IMAGE, "images/constant_16x16.png");
		addImageFilePath(CONSTANT_LARGE_IMAGE, "images/constant_24x24.png");
	}

}
