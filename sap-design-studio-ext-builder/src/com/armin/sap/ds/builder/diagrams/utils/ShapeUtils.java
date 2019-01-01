package com.armin.sap.ds.builder.diagrams.utils;

import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.ICreateService;
import org.eclipse.graphiti.services.ILayoutService;

public class ShapeUtils {

	// CONTAINER SHAPE WITH ROUNDED RECTANGLE
	private ICreateService createService;
	private ILayoutService layoutService;
	
	public static final ShapeUtils eINSTANCE = new ShapeUtils();
			
	public ShapeUtils() {
		createService = Graphiti.getCreateService();
		layoutService = Graphiti.getLayoutService();	
	}

	public ContainerShape getConstantsSection(ContainerShape parentContainer,
			int x, int y,
			int defaultNumOfRows
			) {
		
		int width = parentContainer.getGraphicsAlgorithm().getWidth();
		int height = 20 + (defaultNumOfRows * 20);
		ContainerShape constantsContainerShape = createService.createContainerShape(parentContainer, true);
		Rectangle constantsSection = createService.createRectangle(constantsContainerShape);
		constantsSection.setStyle(StyleUtils.getStyleForEClass((Diagram)parentContainer.getContainer()));
		constantsSection.setLineStyle(LineStyle.DASH);
		layoutService.setLocationAndSize(constantsSection, x + 2, y, width-4, height);

		Text text = createService.createText(constantsSection, "CONSTANTS");
		text.setStyle(StyleUtils.getStyleForEClassText((Diagram)parentContainer.getContainer()));
		text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
		layoutService.setLocationAndSize(text, 0, 0, width-4, 20);

		//Add constants header separator line
		{
			Polyline polyline = createService.createPolyline(constantsSection, new int[] {0, 20, width-4, 20});
			polyline.setStyle(StyleUtils.getStyleForCommonValues((Diagram)parentContainer.getContainer()));
			polyline.setLineStyle(LineStyle.DASH);
			polyline.setLineWidth(1);
		}
		
		return constantsContainerShape;
	}
}
