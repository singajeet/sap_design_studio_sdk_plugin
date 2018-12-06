/**
 */
package com.armin.sap.ds.builder.models.core.impl;

import com.armin.sap.ds.builder.models.core.*;

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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreFactory extends EFactoryImpl implements ICoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ICoreFactory init() {
		try {
			ICoreFactory theCoreFactory = (ICoreFactory)EPackage.Registry.INSTANCE.getEFactory(ICorePackage.eNS_URI);
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
			case ICorePackage.COMPONENT: return createComponent();
			case ICorePackage.DESCRIPTABLE: return createDescriptable();
			case ICorePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ICorePackage.EXTENSION: return createExtension();
			case ICorePackage.GROUP: return createGroup();
			case ICorePackage.INITIALIZATION: return createInitialization();
			case ICorePackage.OPTION: return createOption();
			case ICorePackage.POSSIBLE_VALUE_TYPE: return createPossibleValueType();
			case ICorePackage.PROPERTY: return createProperty();
			case ICorePackage.PROPERTY_VALUE: return createPropertyValue();
			case ICorePackage.REQUIRE_JS_TYPE: return createRequireJSType();
			case ICorePackage.STD_INCLUDE: return createStdInclude();
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
			case ICorePackage.BACKEND_SYSTEM_TYPE:
				return createBackendSystemTypeFromString(eDataType, initialValue);
			case ICorePackage.HANDLER_TYPES:
				return createHandlerTypesFromString(eDataType, initialValue);
			case ICorePackage.KIND_TYPE:
				return createKindTypeFromString(eDataType, initialValue);
			case ICorePackage.PROPERTY_TYPE:
				return createPropertyTypeFromString(eDataType, initialValue);
			case ICorePackage.UI5_MODE:
				return createUI5ModeFromString(eDataType, initialValue);
			case ICorePackage.BACKEND_SYSTEM_TYPE_OBJECT:
				return createBackendSystemTypeObjectFromString(eDataType, initialValue);
			case ICorePackage.HANDLER_TYPES_OBJECT:
				return createHandlerTypesObjectFromString(eDataType, initialValue);
			case ICorePackage.ID_TYPE:
				return createIdTypeFromString(eDataType, initialValue);
			case ICorePackage.ID_TYPE1:
				return createIdType1FromString(eDataType, initialValue);
			case ICorePackage.KIND_TYPE_OBJECT:
				return createKindTypeObjectFromString(eDataType, initialValue);
			case ICorePackage.PROPERTY_TYPE_OBJECT:
				return createPropertyTypeObjectFromString(eDataType, initialValue);
			case ICorePackage.UI5_MODE_OBJECT:
				return createUI5ModeObjectFromString(eDataType, initialValue);
			case ICorePackage.UI5_MODES:
				return createUI5ModesFromString(eDataType, initialValue);
			case ICorePackage.VERSION_TYPE:
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
			case ICorePackage.BACKEND_SYSTEM_TYPE:
				return convertBackendSystemTypeToString(eDataType, instanceValue);
			case ICorePackage.HANDLER_TYPES:
				return convertHandlerTypesToString(eDataType, instanceValue);
			case ICorePackage.KIND_TYPE:
				return convertKindTypeToString(eDataType, instanceValue);
			case ICorePackage.PROPERTY_TYPE:
				return convertPropertyTypeToString(eDataType, instanceValue);
			case ICorePackage.UI5_MODE:
				return convertUI5ModeToString(eDataType, instanceValue);
			case ICorePackage.BACKEND_SYSTEM_TYPE_OBJECT:
				return convertBackendSystemTypeObjectToString(eDataType, instanceValue);
			case ICorePackage.HANDLER_TYPES_OBJECT:
				return convertHandlerTypesObjectToString(eDataType, instanceValue);
			case ICorePackage.ID_TYPE:
				return convertIdTypeToString(eDataType, instanceValue);
			case ICorePackage.ID_TYPE1:
				return convertIdType1ToString(eDataType, instanceValue);
			case ICorePackage.KIND_TYPE_OBJECT:
				return convertKindTypeObjectToString(eDataType, instanceValue);
			case ICorePackage.PROPERTY_TYPE_OBJECT:
				return convertPropertyTypeObjectToString(eDataType, instanceValue);
			case ICorePackage.UI5_MODE_OBJECT:
				return convertUI5ModeObjectToString(eDataType, instanceValue);
			case ICorePackage.UI5_MODES:
				return convertUI5ModesToString(eDataType, instanceValue);
			case ICorePackage.VERSION_TYPE:
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
	public IComponent createComponent() {
		Component component = new Component();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDescriptable createDescriptable() {
		Descriptable descriptable = new Descriptable();
		return descriptable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDocumentRoot createDocumentRoot() {
		DocumentRoot documentRoot = new DocumentRoot();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IExtension createExtension() {
		Extension extension = new Extension();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IGroup createGroup() {
		Group group = new Group();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IInitialization createInitialization() {
		Initialization initialization = new Initialization();
		return initialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOption createOption() {
		Option option = new Option();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPossibleValueType createPossibleValueType() {
		PossibleValueType possibleValueType = new PossibleValueType();
		return possibleValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProperty createProperty() {
		Property property = new Property();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPropertyValue createPropertyValue() {
		PropertyValue propertyValue = new PropertyValue();
		return propertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRequireJSType createRequireJSType() {
		RequireJSType requireJSType = new RequireJSType();
		return requireJSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStdInclude createStdInclude() {
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
		return createBackendSystemTypeFromString(ICorePackage.Literals.BACKEND_SYSTEM_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBackendSystemTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBackendSystemTypeToString(ICorePackage.Literals.BACKEND_SYSTEM_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandlerTypes createHandlerTypesObjectFromString(EDataType eDataType, String initialValue) {
		return createHandlerTypesFromString(ICorePackage.Literals.HANDLER_TYPES, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHandlerTypesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHandlerTypesToString(ICorePackage.Literals.HANDLER_TYPES, instanceValue);
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
		return createKindTypeFromString(ICorePackage.Literals.KIND_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertKindTypeToString(ICorePackage.Literals.KIND_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPropertyTypeFromString(ICorePackage.Literals.PROPERTY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPropertyTypeToString(ICorePackage.Literals.PROPERTY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI5Mode createUI5ModeObjectFromString(EDataType eDataType, String initialValue) {
		return createUI5ModeFromString(ICorePackage.Literals.UI5_MODE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUI5ModeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUI5ModeToString(ICorePackage.Literals.UI5_MODE, instanceValue);
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
			result.add(createUI5ModeFromString(ICorePackage.Literals.UI5_MODE, item));
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
			result.append(convertUI5ModeToString(ICorePackage.Literals.UI5_MODE, item));
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
	public ICorePackage getCorePackage() {
		return (ICorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ICorePackage getPackage() {
		return ICorePackage.eINSTANCE;
	}

} //CoreFactory
