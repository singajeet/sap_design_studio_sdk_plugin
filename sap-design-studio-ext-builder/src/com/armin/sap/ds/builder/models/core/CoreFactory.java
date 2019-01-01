/**
 */
package com.armin.sap.ds.builder.models.core;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.armin.sap.ds.builder.models.core.CorePackage
 * @generated
 */
public class CoreFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CoreFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreFactory init() {
		try {
			CoreFactory theCoreFactory = (CoreFactory)EPackage.Registry.INSTANCE.getEFactory(CorePackage.eNS_URI);
			if (theCoreFactory != null) {
				return theCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CorePackage.COMPONENT: return createComponent();
			case CorePackage.DESCRIPTABLE: return createDescriptable();
			case CorePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case CorePackage.EXTENSION: return createExtension();
			case CorePackage.GROUP: return createGroup();
			case CorePackage.INITIALIZATION: return createInitialization();
			case CorePackage.OPTION: return createOption();
			case CorePackage.POSSIBLE_VALUE_TYPE: return createPossibleValueType();
			case CorePackage.PROPERTY: return createProperty();
			case CorePackage.PROPERTY_VALUE: return createPropertyValue();
			case CorePackage.REQUIRE_JS_TYPE: return createRequireJSType();
			case CorePackage.STD_INCLUDE: return createStdInclude();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CorePackage.BACKEND_SYSTEM_TYPE:
				return createBackendSystemTypeFromString(eDataType, initialValue);
			case CorePackage.HANDLER_TYPES:
				return createHandlerTypesFromString(eDataType, initialValue);
			case CorePackage.KIND_TYPE:
				return createKindTypeFromString(eDataType, initialValue);
			case CorePackage.PROPERTY_TYPE:
				return createPropertyTypeFromString(eDataType, initialValue);
			case CorePackage.UI5_MODE:
				return createUI5ModeFromString(eDataType, initialValue);
			case CorePackage.BACKEND_SYSTEM_TYPE_OBJECT:
				return createBackendSystemTypeObjectFromString(eDataType, initialValue);
			case CorePackage.HANDLER_TYPES_OBJECT:
				return createHandlerTypesObjectFromString(eDataType, initialValue);
			case CorePackage.ID_TYPE:
				return createIdTypeFromString(eDataType, initialValue);
			case CorePackage.ID_TYPE1:
				return createIdType1FromString(eDataType, initialValue);
			case CorePackage.KIND_TYPE_OBJECT:
				return createKindTypeObjectFromString(eDataType, initialValue);
			case CorePackage.PROPERTY_TYPE_OBJECT:
				return createPropertyTypeObjectFromString(eDataType, initialValue);
			case CorePackage.UI5_MODE_OBJECT:
				return createUI5ModeObjectFromString(eDataType, initialValue);
			case CorePackage.UI5_MODES:
				return createUI5ModesFromString(eDataType, initialValue);
			case CorePackage.VERSION_TYPE:
				return createVersionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CorePackage.BACKEND_SYSTEM_TYPE:
				return convertBackendSystemTypeToString(eDataType, instanceValue);
			case CorePackage.HANDLER_TYPES:
				return convertHandlerTypesToString(eDataType, instanceValue);
			case CorePackage.KIND_TYPE:
				return convertKindTypeToString(eDataType, instanceValue);
			case CorePackage.PROPERTY_TYPE:
				return convertPropertyTypeToString(eDataType, instanceValue);
			case CorePackage.UI5_MODE:
				return convertUI5ModeToString(eDataType, instanceValue);
			case CorePackage.BACKEND_SYSTEM_TYPE_OBJECT:
				return convertBackendSystemTypeObjectToString(eDataType, instanceValue);
			case CorePackage.HANDLER_TYPES_OBJECT:
				return convertHandlerTypesObjectToString(eDataType, instanceValue);
			case CorePackage.ID_TYPE:
				return convertIdTypeToString(eDataType, instanceValue);
			case CorePackage.ID_TYPE1:
				return convertIdType1ToString(eDataType, instanceValue);
			case CorePackage.KIND_TYPE_OBJECT:
				return convertKindTypeObjectToString(eDataType, instanceValue);
			case CorePackage.PROPERTY_TYPE_OBJECT:
				return convertPropertyTypeObjectToString(eDataType, instanceValue);
			case CorePackage.UI5_MODE_OBJECT:
				return convertUI5ModeObjectToString(eDataType, instanceValue);
			case CorePackage.UI5_MODES:
				return convertUI5ModesToString(eDataType, instanceValue);
			case CorePackage.VERSION_TYPE:
				return convertVersionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		Component component = new Component();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Descriptable createDescriptable() {
		Descriptable descriptable = new Descriptable();
		return descriptable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRoot documentRoot = new DocumentRoot();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		Extension extension = new Extension();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		Group group = new Group();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initialization createInitialization() {
		Initialization initialization = new Initialization();
		return initialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		Option option = new Option();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossibleValueType createPossibleValueType() {
		PossibleValueType possibleValueType = new PossibleValueType();
		return possibleValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		Property property = new Property();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyValue createPropertyValue() {
		PropertyValue propertyValue = new PropertyValue();
		return propertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequireJSType createRequireJSType() {
		RequireJSType requireJSType = new RequireJSType();
		return requireJSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StdInclude createStdInclude() {
		StdInclude stdInclude = new StdInclude();
		return stdInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackendSystemType createBackendSystemTypeFromString(EDataType eDataType, String initialValue) {
		BackendSystemType result = BackendSystemType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBackendSystemTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandlerTypes createHandlerTypesFromString(EDataType eDataType, String initialValue) {
		HandlerTypes result = HandlerTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHandlerTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindType createKindTypeFromString(EDataType eDataType, String initialValue) {
		KindType result = KindType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyTypeFromString(EDataType eDataType, String initialValue) {
		PropertyType result = PropertyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI5Mode createUI5ModeFromString(EDataType eDataType, String initialValue) {
		UI5Mode result = UI5Mode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUI5ModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackendSystemType createBackendSystemTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBackendSystemTypeFromString(CorePackage.Literals.BACKEND_SYSTEM_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBackendSystemTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBackendSystemTypeToString(CorePackage.Literals.BACKEND_SYSTEM_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandlerTypes createHandlerTypesObjectFromString(EDataType eDataType, String initialValue) {
		return createHandlerTypesFromString(CorePackage.Literals.HANDLER_TYPES, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHandlerTypesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHandlerTypesToString(CorePackage.Literals.HANDLER_TYPES, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIdTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIdType1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindType createKindTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createKindTypeFromString(CorePackage.Literals.KIND_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertKindTypeToString(CorePackage.Literals.KIND_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPropertyTypeFromString(CorePackage.Literals.PROPERTY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPropertyTypeToString(CorePackage.Literals.PROPERTY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI5Mode createUI5ModeObjectFromString(EDataType eDataType, String initialValue) {
		return createUI5ModeFromString(CorePackage.Literals.UI5_MODE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUI5ModeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUI5ModeToString(CorePackage.Literals.UI5_MODE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<UI5Mode> createUI5ModesFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<UI5Mode> result = new ArrayList<UI5Mode>();
		for (String item : split(initialValue)) {
			result.add(createUI5ModeFromString(CorePackage.Literals.UI5_MODE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUI5ModesToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertUI5ModeToString(CorePackage.Literals.UI5_MODE, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVersionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorePackage getCorePackage() {
		return (CorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorePackage getPackage() {
		return CorePackage.eINSTANCE;
	}

} //CoreFactory
