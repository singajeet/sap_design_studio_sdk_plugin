/**
 */
package com.armin.sap.ds.builder.models.core.util;

import com.armin.sap.ds.builder.models.ExtendedModelsPlugin;

import com.armin.sap.ds.builder.models.core.*;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.armin.sap.ds.builder.models.core.ICorePackage
 * @generated
 */
public class CoreValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CoreValidator INSTANCE = new CoreValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.armin.sap.ds.builder.models.core";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ICorePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ICorePackage.COMPONENT:
				return validateComponent((IComponent)value, diagnostics, context);
			case ICorePackage.DESCRIPTABLE:
				return validateDescriptable((IDescriptable)value, diagnostics, context);
			case ICorePackage.DOCUMENT_ROOT:
				return validateDocumentRoot((IDocumentRoot)value, diagnostics, context);
			case ICorePackage.EXTENSION:
				return validateExtension((IExtension)value, diagnostics, context);
			case ICorePackage.GROUP:
				return validateGroup((IGroup)value, diagnostics, context);
			case ICorePackage.INITIALIZATION:
				return validateInitialization((IInitialization)value, diagnostics, context);
			case ICorePackage.OPTION:
				return validateOption((IOption)value, diagnostics, context);
			case ICorePackage.POSSIBLE_VALUE_TYPE:
				return validatePossibleValueType((IPossibleValueType)value, diagnostics, context);
			case ICorePackage.PROPERTY:
				return validateProperty((IProperty)value, diagnostics, context);
			case ICorePackage.PROPERTY_VALUE:
				return validatePropertyValue((IPropertyValue)value, diagnostics, context);
			case ICorePackage.REQUIRE_JS_TYPE:
				return validateRequireJSType((IRequireJSType)value, diagnostics, context);
			case ICorePackage.STD_INCLUDE:
				return validateStdInclude((IStdInclude)value, diagnostics, context);
			case ICorePackage.BACKEND_SYSTEM_TYPE:
				return validateBackendSystemType((BackendSystemType)value, diagnostics, context);
			case ICorePackage.HANDLER_TYPES:
				return validateHandlerTypes((HandlerTypes)value, diagnostics, context);
			case ICorePackage.KIND_TYPE:
				return validateKindType((KindType)value, diagnostics, context);
			case ICorePackage.PROPERTY_TYPE:
				return validatePropertyType((PropertyType)value, diagnostics, context);
			case ICorePackage.UI5_MODE:
				return validateUI5Mode((UI5Mode)value, diagnostics, context);
			case ICorePackage.BACKEND_SYSTEM_TYPE_OBJECT:
				return validateBackendSystemTypeObject((BackendSystemType)value, diagnostics, context);
			case ICorePackage.HANDLER_TYPES_OBJECT:
				return validateHandlerTypesObject((HandlerTypes)value, diagnostics, context);
			case ICorePackage.ID_TYPE:
				return validateIdType((String)value, diagnostics, context);
			case ICorePackage.ID_TYPE1:
				return validateIdType1((String)value, diagnostics, context);
			case ICorePackage.KIND_TYPE_OBJECT:
				return validateKindTypeObject((KindType)value, diagnostics, context);
			case ICorePackage.PROPERTY_TYPE_OBJECT:
				return validatePropertyTypeObject((PropertyType)value, diagnostics, context);
			case ICorePackage.UI5_MODE_OBJECT:
				return validateUI5ModeObject((UI5Mode)value, diagnostics, context);
			case ICorePackage.UI5_MODES:
				return validateUI5Modes((List<?>)value, diagnostics, context);
			case ICorePackage.VERSION_TYPE:
				return validateVersionType((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(IComponent component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptable(IDescriptable descriptable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(descriptable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(IDocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension(IExtension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroup(IGroup group, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(group, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialization(IInitialization initialization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(initialization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOption(IOption option, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(option, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePossibleValueType(IPossibleValueType possibleValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(possibleValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(IProperty property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyValue(IPropertyValue propertyValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequireJSType(IRequireJSType requireJSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requireJSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStdInclude(IStdInclude stdInclude, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stdInclude, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackendSystemType(BackendSystemType backendSystemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHandlerTypes(HandlerTypes handlerTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKindType(KindType kindType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyType(PropertyType propertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUI5Mode(UI5Mode ui5Mode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackendSystemTypeObject(BackendSystemType backendSystemTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHandlerTypesObject(HandlerTypes handlerTypesObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdType(String idType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIdType_Pattern(idType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIdType_Pattern
	 */
	public static final  PatternMatcher [][] ID_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([a-z|\\d])+(\\.([a-z]|\\d)+)*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdType_Pattern(String idType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ICorePackage.Literals.ID_TYPE, idType, ID_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdType1(String idType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIdType1_Pattern(idType1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIdType1_Pattern
	 */
	public static final  PatternMatcher [][] ID_TYPE1__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([a-z|A-Z|\\d|/])+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Id Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdType1_Pattern(String idType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ICorePackage.Literals.ID_TYPE1, idType1, ID_TYPE1__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKindTypeObject(KindType kindTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyTypeObject(PropertyType propertyTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUI5ModeObject(UI5Mode ui5ModeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUI5Modes(List<?> ui5Modes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUI5Modes_ItemType(ui5Modes, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>UI5 Modes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUI5Modes_ItemType(List<?> ui5Modes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = ui5Modes.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (ICorePackage.Literals.UI5_MODE.isInstance(item)) {
				result &= validateUI5Mode((UI5Mode)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(ICorePackage.Literals.UI5_MODE, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionType(String versionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVersionType_Pattern(versionType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateVersionType_Pattern
	 */
	public static final  PatternMatcher [][] VERSION_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\d+\\.\\d+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Version Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionType_Pattern(String versionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ICorePackage.Literals.VERSION_TYPE, versionType, VERSION_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ExtendedModelsPlugin.INSTANCE;
	}

} //CoreValidator
