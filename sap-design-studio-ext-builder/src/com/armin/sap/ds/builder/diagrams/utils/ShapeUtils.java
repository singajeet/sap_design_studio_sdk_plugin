package com.armin.sap.ds.builder.diagrams.utils;

import org.eclipse.emf.common.util.EList;
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

import com.armin.sap.ds.builder.models.extended.ComponentClient;
import com.armin.sap.ds.builder.models.extended.Constant;
import com.armin.sap.ds.builder.models.extended.Variable;
import com.armin.sap.ds.builder.preferences.Settings;

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
			int x, int y, ComponentClient componentClient
			) {
		
		int width = parentContainer.getGraphicsAlgorithm().getWidth();
		int height = 20 + (Integer.valueOf(Settings.store().get(Settings.FOR.CONSTANT_SECTION_NUM_OF_ROWS_ID)) * 20);
		ContainerShape constantsContainerShape = createService.createContainerShape(parentContainer, true);
		Rectangle constantsSection = createService.createRectangle(constantsContainerShape);
		constantsSection.setStyle(StyleUtils.getStyleForEClass((Diagram)parentContainer.getContainer()));
		constantsSection.setLineStyle(LineStyle.DASH);
		layoutService.setLocationAndSize(constantsSection, x + 2, y, width-4, height);

		String constSectionTitle = Settings.store().get(Settings.FOR.CONSTANT_SECTION_NAME_ID);
		Text text = createService.createText(constantsSection, constSectionTitle);
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
		
		EList<Constant> constants = componentClient.getConstants();
		
		int yLocation = 20;
		for(Constant constant : constants) {
			Text constantText = createService.createText(constantsSection, constant.toString());
			constantText.setStyle(StyleUtils.getStyleForEClassText((Diagram)parentContainer.getContainer()));
			constantText.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
			layoutService.setLocationAndSize(constantText, 0, yLocation, width-4, 20);
			yLocation = yLocation + 20;
		}
		
		return constantsContainerShape;
	}
	
	public ContainerShape getVariablesSection(ContainerShape parentContainer,
			int x, int y, ComponentClient componentClient
			) {
		
		int width = parentContainer.getGraphicsAlgorithm().getWidth();
		int height = 20 + (Integer.valueOf(Settings.store().get(Settings.FOR.VARIABLE_SECTION_NUM_OF_ROWS_ID)) * 20);
		ContainerShape variablesContainerShape = createService.createContainerShape(parentContainer, true);
		Rectangle variablesSection = createService.createRectangle(variablesContainerShape);
		variablesSection.setStyle(StyleUtils.getStyleForEClass((Diagram)parentContainer.getContainer()));
		variablesSection.setLineStyle(LineStyle.DASH);
		layoutService.setLocationAndSize(variablesSection, x + 2, y, width-4, height);

		String varSectionTitle = Settings.store().get(Settings.FOR.VARIABLE_SECTION_NAME_ID);
		Text text = createService.createText(variablesSection, varSectionTitle);
		text.setStyle(StyleUtils.getStyleForEClassText((Diagram)parentContainer.getContainer()));
		text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
		layoutService.setLocationAndSize(text, 0, 0, width-4, 20);

		//Add constants header separator line
		{
			Polyline polyline = createService.createPolyline(variablesSection, new int[] {0, 20, width-4, 20});
			polyline.setStyle(StyleUtils.getStyleForCommonValues((Diagram)parentContainer.getContainer()));
			polyline.setLineStyle(LineStyle.DASH);
			polyline.setLineWidth(1);
		}
		
		EList<Variable> variables = componentClient.getLocalVariables();
		
		int yLocation = 20;
		for(Variable variable : variables) {
			Text constantText = createService.createText(variablesSection, variable.toString());
			constantText.setStyle(StyleUtils.getStyleForEClassText((Diagram)parentContainer.getContainer()));
			constantText.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
			layoutService.setLocationAndSize(constantText, 0, yLocation, width-4, 20);
			yLocation = yLocation + 20;
		}
		
		return variablesContainerShape;
	}

}
