package com.armin.sap.ds.builder.diagrams.patterns;

import java.util.HashMap;

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
import com.armin.sap.ds.builder.core.common.IDEConstants;
import com.armin.sap.ds.builder.core.common.Prompts;
import com.armin.sap.ds.builder.diagram.images.ImageProvider;
import com.armin.sap.ds.builder.diagrams.utils.ShapeUtils;
import com.armin.sap.ds.builder.diagrams.utils.StyleUtils;
import com.armin.sap.ds.builder.editors.component.diagram.ComponentDiagramEditorInput;
import com.armin.sap.ds.builder.models.domain.ComponentExtended;
import com.armin.sap.ds.builder.models.extended.ComponentClient;
import com.armin.sap.ds.builder.models.extended.ConstantsSection;
import com.armin.sap.ds.builder.models.extended.ExtendedFactory;
import com.armin.sap.ds.builder.models.extended.LocalVariablesSection;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ComponentExtendedNode;


public class ComponentClientObjectPattern extends AbstractPattern implements IPattern {

	public static final String NAME = "Component [Client]";
	public static final int DEFAULT_HEIGHT = Integer.valueOf(Settings.store().get(Settings.FOR.COMPONENT_CLIENT_DIA_HEIGHT_ID));
	public static final int DEFAULT_WIDTH = Integer.valueOf(Settings.store().get(Settings.FOR.COMPONENT_CLIENT_DIA_WIDTH_ID));
	public static final int DEFAULT_ROOT_CORNER_WIDTH = Integer.valueOf(Settings.store().get(Settings.FOR.COMPONENT_CLIENT_DIA_CORNER_WIDTH_ID));
	public static final int DEFAULT_ROOT_CORNER_HEIGHT = Integer.valueOf(Settings.store().get(Settings.FOR.COMPONENT_CLIENT_DIA_CORNER_HEIGHT_ID));
	public static final int DEFAULT_ROW_HEIGHT = Integer.valueOf(Settings.store().get(Settings.FOR.COMPONENT_CLIENT_DIA_ROW_HEIGHT_ID));
	public static final int DEFAULT_ROOT_CONTAINER_LINE_SIZE = Integer.valueOf(Settings.store().get(Settings.FOR.COMPONENT_CLIENT_DIA_CONTAINER_LINE_WIDTH_ID));	
	public static final String DEFAULT_CONSTANTS_SECTION_NAME = "CONSTANTS_SECTION";
	public static final String DEFAULT_VARIABLES_SECTION_NAME = "VARIABLES_SECTION";
	
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
			Text text = createService.createText(mainClientRoundedRectangle, component.getName().toUpperCase());
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
																componentClient);
			
			if(constantsContainerShape != null) {
				logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Adding constants section for component: " + component.getId() + " [" + component.getTitle() + "]"));
				ConstantsSection constSection = ExtendedFactory.eINSTANCE.createConstantsSection();
				constSection.setName(DEFAULT_CONSTANTS_SECTION_NAME);
				constSection.setBelongsToComponent(component);
				
				if (constSection.eResource() == null) {
					getDiagram().eResource().getContents().add(constSection);
				}
				
				link(constantsContainerShape, constSection);
			}
		}
		//Add VARIABLES section
		{
			ContainerShape variablesContainerShape = ShapeUtils
														.eINSTANCE
														.getVariablesSection(
																mainClientContainerShape,
																0, DEFAULT_ROW_HEIGHT*Integer.valueOf(Settings.store().get(Settings.FOR.CONSTANT_SECTION_NUM_OF_ROWS_ID)),
																componentClient);
			
			if(variablesContainerShape != null) {
				logger.log(new Status(IStatus.INFO, this.getClass().getName(), "Adding variables section for component: " + component.getId() + " [" + component.getTitle() + "]"));
				LocalVariablesSection varSection = ExtendedFactory.eINSTANCE.createLocalVariablesSection();
				varSection.setName(DEFAULT_VARIABLES_SECTION_NAME);
				varSection.setBelongsToComponent(component);
				
				if (varSection.eResource() == null) {
					getDiagram().eResource().getContents().add(varSection);
				}
				
				link(variablesContainerShape, varSection);
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
					
					HashMap<String, String> compName = Prompts.askComponentInfo(_component);
					ComponentExtended c = new ComponentExtended();
					c.setId(compName.get(IDEConstants.COMPONENT_ID));
					c.setName(compName.get(IDEConstants.COMPONENT_TITLE));
					c.setTitle(compName.get(IDEConstants.COMPONENT_TITLE));
					ccomp.setComp(c);
					
					logger.log(new Status(IStatus.INFO, this.getClass().getName(), "ComponentClient shape created for existing component: " + componentExt.getId() + " [" + componentExt.getTitle() + "]"));
				}
				else {
					ccomp = ExtendedFactory.eINSTANCE.createComponentClient();
					
					HashMap<String, String> compName = Prompts.askComponentInfo(_component);					
					ComponentExtended c = new ComponentExtended();
					c.setId(compName.get(IDEConstants.COMPONENT_ID));
					c.setName(compName.get(IDEConstants.COMPONENT_TITLE));
					c.setTitle(compName.get(IDEConstants.COMPONENT_TITLE));
					ccomp.setComp(c);
					logger.log(new Status(IStatus.INFO, this.getClass().getName(), "ComponentClient shape created for new component: " + c.getId() + " [" + c.getTitle() + "]"));
				}
				
		        
		        // do the add
		        addGraphicalRepresentation(context, ccomp);
		 
		        // return newly created business object(s)
		        return new Object[] { ccomp };
			}
		}
		
		ComponentClient ccomp = ExtendedFactory.eINSTANCE.createComponentClient();
		
		HashMap<String, String> compName = Prompts.askComponentInfo(_component);					
		ComponentExtended c = new ComponentExtended();
		c.setId(compName.get(IDEConstants.COMPONENT_ID));
		c.setName(compName.get(IDEConstants.COMPONENT_TITLE));
		c.setTitle(compName.get(IDEConstants.COMPONENT_TITLE));
		
		ccomp.setComp(c);
		logger.log(new Status(IStatus.INFO, this.getClass().getName(), "ComponentClient shape created for new component: " + c.getId() + " [" + c.getTitle() + "]"));
		
		addGraphicalRepresentation(context, ccomp);
		 
		return new Object[] {ccomp};
	}
}
