package com.armin.sap.ds.builder.diagrams.patterns;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.pattern.AbstractPattern;
import org.eclipse.graphiti.pattern.IPattern;
import org.eclipse.graphiti.pattern.config.IPatternConfiguration;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.ICreateService;
import org.eclipse.graphiti.services.IGaLayoutService;
import org.eclipse.graphiti.ui.editor.IDiagramContainerUI;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.core.common.Prompts;
import com.armin.sap.ds.builder.diagram.images.ImageProvider;
import com.armin.sap.ds.builder.diagrams.utils.ShapeUtils;
import com.armin.sap.ds.builder.diagrams.utils.StyleUtils;
import com.armin.sap.ds.builder.editors.component.diagram.ComponentDiagramEditorInput;
import com.armin.sap.ds.builder.models.domain.ComponentExtended;
import com.armin.sap.ds.builder.models.extended.ComponentClient;
import com.armin.sap.ds.builder.models.extended.ConstantsSection;
import com.armin.sap.ds.builder.models.extended.ExtendedFactory;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ComponentExtendedNode;


public class ComponentClientObjectPattern extends AbstractPattern implements IPattern {

	public static final String NAME = "Component [Client]";
	public static final int DEFAULT_HEIGHT = 300;
	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_ROOT_CORNER_WIDTH = 10;
	public static final int DEFAULT_ROOT_CORNER_HEIGHT = 10;
	public static final int DEFAULT_ROW_HEIGHT = 20;
	public static final int DEFAULT_ROOT_CONTAINER_LINE_SIZE = 2;	
	public static final int DEFAULT_CONSTANTS_CONTAINER_ROWS = 5;
	public static final String DEFAULT_CONSTANTS_SECTION_NAME = "CONSTANTS_SECTION";	
	
	private ILog logger;
	private ComponentExtendedNode _component;
	
	public ComponentClientObjectPattern() {
		super(null);
		logger = Activator.getDefault().getLog();
		logger.log(new Status(IStatus.OK, this.getClass().getName(), "ComponentClientObjectPattern instance created with default configuration"));
	}

	public String getCreateName() {
	      return NAME;
	}
	
	public ComponentClientObjectPattern(IPatternConfiguration patternConfiguration) {
		super(patternConfiguration);	
		logger = Activator.getDefault().getLog();
		logger.log(new Status(IStatus.OK, this.getClass().getName(), "ComponentClientObjectPattern instance created with " + patternConfiguration.toString() + " configuration"));
	}

	@Override
	public boolean isMainBusinessObjectApplicable(Object mainBusinessObject) {		
		return mainBusinessObject instanceof ComponentClient;
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
		//New object can be added only if it's instance of ComponentClient and
		//target is of type diagram and shoud not contain any another instance of ComponentClient
		//This will make sure only one instance of ComponentClient is allowed in the diagram
		
		if (context.getNewObject() instanceof ComponentClient) {
			if (context.getTargetContainer() instanceof Diagram) {
				if(!context.getTargetContainer().getChildren().isEmpty()) {					
					for(Shape bo : context.getTargetContainer().getChildren()) {
						if(bo.getLink().getBusinessObjects().get(0) instanceof ComponentClient)
						{
							logger.log(new Status(IStatus.WARNING, this.getClass().getName(), "CAN_ADD - Diagram already contains instance of ComponentClient, so no more instance of ComponentClient can be added"));
							return false;
						}
					}
				}
				//Diagram do not contain any shapes, so instance of ComponentClient can be added
				return true;
			}
		}
		//New Object in current context is not of type ComponentClient and will be ignored
		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {

		ComponentClient componentClient = (ComponentClient) context.getNewObject();
		Diagram targetDiagram = (Diagram) context.getTargetContainer();
		
		
		ComponentExtended component = (ComponentExtended)componentClient.getComp();
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Adding root shape for component: " + component.getId() + " [" + component.getTitle() + "]"));
		
		// CONTAINER SHAPE WITH ROUNDED RECTANGLE
		ICreateService createService = Graphiti.getCreateService();
		IGaLayoutService layoutService = Graphiti.getGaLayoutService();

		ContainerShape mainClientContainerShape = createService.createContainerShape(targetDiagram, true);
		// define a default size for the shape
		final int width = context.getWidth() <= 0 ? DEFAULT_WIDTH : context.getWidth();
		final int height = context.getHeight() <= 0 ? DEFAULT_HEIGHT : context.getHeight();
		
		RoundedRectangle mainClientRoundedRectangle; // need to access it later
		{
			// create and set graphics algorithm
			mainClientRoundedRectangle = createService.createRoundedRectangle(mainClientContainerShape, DEFAULT_ROOT_CORNER_WIDTH, DEFAULT_ROOT_CORNER_HEIGHT);
			mainClientRoundedRectangle.setStyle(StyleUtils.getStyleForEClass(targetDiagram));
			mainClientRoundedRectangle.setLineStyle(LineStyle.DASH);
			mainClientRoundedRectangle.setLineWidth(DEFAULT_ROOT_CONTAINER_LINE_SIZE);
			layoutService.setLocationAndSize(mainClientRoundedRectangle, context.getX(), context.getY(), width, height);

			if (componentClient.eResource() == null) {
				getDiagram().eResource().getContents().add(componentClient);
			}
			
			link(mainClientContainerShape, componentClient);
		}		
		// Add header text
		{
			Text text = createService.createText(mainClientRoundedRectangle, component.getName());
			text.setStyle(StyleUtils.getStyleForEClassText(targetDiagram));
			layoutService.setLocationAndSize(text, 0, 0, width, DEFAULT_ROW_HEIGHT);			
		}
		//Add header separator line
		{
			Polyline polyline = createService.createPolyline(mainClientRoundedRectangle, new int[] { 2, DEFAULT_ROW_HEIGHT, width-2, DEFAULT_ROW_HEIGHT });
			polyline.setStyle(StyleUtils.getStyleForCommonValues(targetDiagram));
			polyline.setLineStyle(LineStyle.DASH);
			polyline.setLineWidth(DEFAULT_ROOT_CONTAINER_LINE_SIZE);
		}
		//Add CONSTANTS section
		{
			ContainerShape constantsContainerShape = ShapeUtils
														.eINSTANCE
														.getConstantsSection(
																mainClientContainerShape,
																0, DEFAULT_ROW_HEIGHT,
																DEFAULT_CONSTANTS_CONTAINER_ROWS);
			
			if(constantsContainerShape != null) {
				logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Adding constants section for component: " + component.getId() + " [" + component.getTitle() + "]"));
				ConstantsSection constSection = ExtendedFactory.eINSTANCE.createConstantsSection();
				constSection.setName(DEFAULT_CONSTANTS_SECTION_NAME);
				constSection.setBelongsToComponent(component.getId());
				
				if (constSection.eResource() == null) {
					getDiagram().eResource().getContents().add(constSection);
				}
				
				link(constantsContainerShape, constSection);
			}
		}		
		return mainClientContainerShape;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.graphiti.pattern.AbstractPattern#getCreateImageId()
	 */
	@Override
	public String getCreateImageId() {		
		return ImageProvider.COMPONENT_IMAGE;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.graphiti.pattern.AbstractPattern#getCreateLargeImageId()
	 */
	@Override
	public String getCreateLargeImageId() {		
		return ImageProvider.COMPONENT_LARGE_IMAGE;
	}

	@Override
	public boolean canCreate(ICreateContext context) {		
		if (context.getTargetContainer() instanceof Diagram) {
			if(!context.getTargetContainer().getChildren().isEmpty()) {
				for(Shape bo : context.getTargetContainer().getChildren()) {
					if(bo.getLink().getBusinessObjects().get(0) instanceof ComponentClient) {
						logger.log(new Status(IStatus.WARNING, this.getClass().getName(), "CAN_CREATE - Diagram already constains instance of ComponentClient, so no more instance of ComponentClient can be created"));
						return false;
					}
				}
			}
			//Diagram do not contain any shapes, so instance of ComponentClient can be created
			return true;
		}	
		//Target in current context is not of type Diagram (Root Shape) and will be ignored
		return false;
	}

	@Override
	public Object[] create(ICreateContext context) {
		IDiagramContainerUI uiContainer = (IDiagramContainerUI) this.getDiagramBehavior().getDiagramContainer();
		ComponentDiagramEditorInput input = null;
		
		if(uiContainer.getDiagramEditorInput() instanceof ComponentDiagramEditorInput) {
			input = (ComponentDiagramEditorInput)uiContainer.getDiagramEditorInput();
		}
		
		if(input != null) {
			_component = input.getNode();
			if(_component != null) {
			
				ComponentClient ccomp = null;
				// create new Component EClass
				if(_component.getComponent() instanceof ComponentExtended) {
					ComponentExtended componentExt = _component.getComponent();
					ccomp = ExtendedFactory.eINSTANCE.createComponentClient();						
					ccomp.setComp(componentExt);
					logger.log(new Status(IStatus.INFO, this.getClass().getName(), "ComponentClient shape created for existing component: " + componentExt.getId() + " [" + componentExt.getTitle() + "]"));
				}
				else {
					ccomp = ExtendedFactory.eINSTANCE.createComponentClient();
					
					String compName = Prompts.askStringValue("Enter Component Name", "Enter valid component name or id", null);					
					ComponentExtended c = new ComponentExtended();
					c.setId(compName);
					c.setName(compName);
					c.setTitle(compName);
					ccomp.setComp(c);
					logger.log(new Status(IStatus.INFO, this.getClass().getName(), "ComponentClient shape created for new component: " + c.getId() + " [" + c.getTitle() + "]"));
				}
				
		        
		        // do the add
		        addGraphicalRepresentation(context, ccomp);
		 
		        // return newly created business object(s)
		        return new Object[] { ccomp };
			}
		}
		
		String compName = Prompts.askStringValue("Enter Component Name", "Enter valid component name or id", null);
		ComponentClient ccomp = ExtendedFactory.eINSTANCE.createComponentClient();
		ComponentExtended c = new ComponentExtended();
		c.setId(compName);
		c.setName(compName);
		c.setTitle(compName);
		ccomp.setComp(c);
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "ComponentClient shape created for new component: " + c.getId() + " [" + c.getTitle() + "]"));
		
		addGraphicalRepresentation(context, ccomp);
		 
		return new Object[] {ccomp};
	}
}
