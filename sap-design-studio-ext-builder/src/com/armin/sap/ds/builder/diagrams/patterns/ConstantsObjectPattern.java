package com.armin.sap.ds.builder.diagrams.patterns;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.pattern.AbstractPattern;
import org.eclipse.graphiti.pattern.IPattern;
import org.eclipse.graphiti.pattern.config.IPatternConfiguration;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.ICreateService;
import org.eclipse.graphiti.services.IGaLayoutService;

import com.armin.sap.ds.builder.core.common.Prompts;
import com.armin.sap.ds.builder.diagram.images.ImageProvider;
import com.armin.sap.ds.builder.diagrams.utils.StyleUtils;
import com.armin.sap.ds.builder.models.extended.Constant;
import com.armin.sap.ds.builder.models.extended.ConstantsSection;
import com.armin.sap.ds.builder.models.extended.ExtendedFactory;

public class ConstantsObjectPattern extends AbstractPattern implements IPattern {

	public static final String NAME = "Constant";
	public static final int DEFAULT_CONSTANTS_CONTAINER_LINE_SIZE = 1;
	public static final int DEFAULT_HEIGHT = 20;
	public static final int DEFAULT_WIDTH = 280;
	public static final int DEFAULT_ROOT_CORNER_WIDTH = 5;
	public static final int DEFAULT_ROOT_CORNER_HEIGHT = 5;
	
	public ConstantsObjectPattern() {
		super(null);
	}

	public String getCreateName() {
	      return NAME;
	}
	
	public ConstantsObjectPattern(IPatternConfiguration patternConfiguration) {
		super(patternConfiguration);		
	}

	@Override
	public boolean isMainBusinessObjectApplicable(Object mainBusinessObject) {
		
		return mainBusinessObject instanceof Constant;
	}

	@Override
	protected boolean isPatternControlled(PictogramElement pictogramElement) {
		 Object domainObject = getBusinessObjectForPictogramElement(pictogramElement);
	      return isMainBusinessObjectApplicable(domainObject);
	}

	@Override
	protected boolean isPatternRoot(PictogramElement pictogramElement) {
		 Object domainObject = getBusinessObjectForPictogramElement(pictogramElement);
	      return isMainBusinessObjectApplicable(domainObject);
	}
	
	@Override
	public boolean canAdd(IAddContext context) {
		// check if user wants to add a Component Client part
		if (context.getNewObject() instanceof Constant) {
			// Component Client part can be added only to Diagram as a singleton
			PictogramLink link = ((PictogramElement)context.getTargetContainer()).getLink();
			if(link != null) {			
				for(Object bo : link.getBusinessObjects()) {				
					if (bo instanceof ConstantsSection) {				
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {

		Constant constant = (Constant) context.getNewObject();
		ContainerShape target = context.getTargetContainer();

		// CONTAINER SHAPE WITH ROUNDED RECTANGLE
		ICreateService createService = Graphiti.getCreateService();
		IGaLayoutService layoutService = Graphiti.getGaLayoutService();

		ContainerShape constantContainerShape = createService.createContainerShape(target, true);
		// define a default size for the shape
		final int width = context.getWidth() <= 0 ? DEFAULT_WIDTH : context.getWidth();
		final int height = context.getHeight() <= 0 ? DEFAULT_HEIGHT : context.getHeight();
		
		RoundedRectangle constantRoundedRectangle; // need to access it later
		{
			// create and set graphics algorithm
			constantRoundedRectangle = createService.createRoundedRectangle(constantContainerShape, DEFAULT_ROOT_CORNER_WIDTH, DEFAULT_ROOT_CORNER_HEIGHT);
			constantRoundedRectangle.setStyle(StyleUtils.getStyleForEClass((Diagram)target.eContainer().eContainer()));
			constantRoundedRectangle.setLineStyle(LineStyle.SOLID);
			constantRoundedRectangle.setLineWidth(DEFAULT_CONSTANTS_CONTAINER_LINE_SIZE);
			
			int nextYLocation = DEFAULT_HEIGHT;
			
			for(Shape child : target.getChildren()) {				
				if(child.getLink() != null) {
					for(Object bo : child.getLink().getBusinessObjects()) {						
						if(bo instanceof Constant) {
							nextYLocation += child.getGraphicsAlgorithm().getHeight();
						}
					}
				}
			}			
			layoutService.setLocationAndSize(constantRoundedRectangle, 2, nextYLocation, width, height);
			if (constant.eResource() == null) {
				getDiagram().eResource().getContents().add(constant);
			}			
			link(constantContainerShape, constant);
		}		
		// Add text
		{
			Text text = createService.createText(constantRoundedRectangle, constant.getName());
			text.setStyle(StyleUtils.getStyleForEClassText((Diagram)target.eContainer().eContainer()));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);			
			layoutService.setLocationAndSize(text, 0, 0, width, DEFAULT_HEIGHT);			
		}
		
		return constantContainerShape;
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		 PictogramLink link = ((PictogramElement)context.getTargetContainer()).getLink();
		 if(link != null) {			 
			 EList<EObject> objects = link.getBusinessObjects();
			 if(objects != null && !objects.isEmpty()) {
				 Object businessObject = objects.get(0);				 
				 if(businessObject != null)
					 return businessObject instanceof ConstantsSection;
			 }
		 }
		 return false;
	}

	@Override
	public Object[] create(ICreateContext context) {
        Constant constant = ExtendedFactory.eINSTANCE.createConstant();
        String consName = Prompts.askStringValue("Enter Constant Details", "Enter valid constant name", "constant_name");
        constant.setName(consName);
        addGraphicalRepresentation(context, constant);
        return new Object[] { constant };
	}

	/* (non-Javadoc)
	 * @see org.eclipse.graphiti.pattern.AbstractPattern#getCreateImageId()
	 */
	@Override
	public String getCreateImageId() {		
		return ImageProvider.CONSTANT_IMAGE;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.graphiti.pattern.AbstractPattern#getCreateLargeImageId()
	 */
	@Override
	public String getCreateLargeImageId() {		
		return ImageProvider.CONSTANT_LARGE_IMAGE;
	}

}
