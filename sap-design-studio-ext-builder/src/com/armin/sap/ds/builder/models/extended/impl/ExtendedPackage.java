/**
 */
package com.armin.sap.ds.builder.models.extended.impl;

import com.armin.sap.ds.builder.models.core.ICorePackage;

import com.armin.sap.ds.builder.models.core.impl.CorePackage;

import com.armin.sap.ds.builder.models.extended.IClientComponent;
import com.armin.sap.ds.builder.models.extended.IExtendedFactory;
import com.armin.sap.ds.builder.models.extended.IExtendedPackage;
import com.armin.sap.ds.builder.models.extended.SDKBaseClassType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtendedPackage extends EPackageImpl implements IExtendedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sdkBaseClassTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.armin.sap.ds.builder.models.extended.IExtendedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExtendedPackage() {
		super(eNS_URI, IExtendedFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link IExtendedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IExtendedPackage init() {
		if (isInited) return (IExtendedPackage)EPackage.Registry.INSTANCE.getEPackage(IExtendedPackage.eNS_URI);

		// Obtain or create and register package
		ExtendedPackage theExtendedPackage = (ExtendedPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExtendedPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExtendedPackage());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CorePackage theCorePackage = (CorePackage)(EPackage.Registry.INSTANCE.getEPackage(ICorePackage.eNS_URI) instanceof CorePackage ? EPackage.Registry.INSTANCE.getEPackage(ICorePackage.eNS_URI) : ICorePackage.eINSTANCE);

		// Create package meta-data objects
		theExtendedPackage.createPackageContents();
		theCorePackage.createPackageContents();

		// Initialize created meta-data
		theExtendedPackage.initializePackageContents();
		theCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExtendedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IExtendedPackage.eNS_URI, theExtendedPackage);
		return theExtendedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClientComponent() {
		return clientComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientComponent_SdkBaseClassType() {
		return (EAttribute)clientComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientComponent_Data() {
		return (EAttribute)clientComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientComponent_Metadata() {
		return (EAttribute)clientComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientComponent_InitMethodBody() {
		return (EAttribute)clientComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientComponent_AfterUpdateMethodBody() {
		return (EAttribute)clientComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientComponent_BeforeUpdateMethodBody() {
		return (EAttribute)clientComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientComponent_PropertiesBody() {
		return (EAttribute)clientComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientComponent_ClassMethodsBody() {
		return (EAttribute)clientComponentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientComponent_LocalMethodsBody() {
		return (EAttribute)clientComponentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientComponent_ConstructorParameters() {
		return (EAttribute)clientComponentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientComponent_LocalVariables() {
		return (EAttribute)clientComponentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientComponent_Constants() {
		return (EAttribute)clientComponentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClientComponent__Render() {
		return clientComponentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSDKBaseClassType() {
		return sdkBaseClassTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IExtendedFactory getExtendedFactory() {
		return (IExtendedFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		clientComponentEClass = createEClass(CLIENT_COMPONENT);
		createEAttribute(clientComponentEClass, CLIENT_COMPONENT__SDK_BASE_CLASS_TYPE);
		createEAttribute(clientComponentEClass, CLIENT_COMPONENT__DATA);
		createEAttribute(clientComponentEClass, CLIENT_COMPONENT__METADATA);
		createEAttribute(clientComponentEClass, CLIENT_COMPONENT__INIT_METHOD_BODY);
		createEAttribute(clientComponentEClass, CLIENT_COMPONENT__AFTER_UPDATE_METHOD_BODY);
		createEAttribute(clientComponentEClass, CLIENT_COMPONENT__BEFORE_UPDATE_METHOD_BODY);
		createEAttribute(clientComponentEClass, CLIENT_COMPONENT__PROPERTIES_BODY);
		createEAttribute(clientComponentEClass, CLIENT_COMPONENT__CLASS_METHODS_BODY);
		createEAttribute(clientComponentEClass, CLIENT_COMPONENT__LOCAL_METHODS_BODY);
		createEAttribute(clientComponentEClass, CLIENT_COMPONENT__CONSTRUCTOR_PARAMETERS);
		createEAttribute(clientComponentEClass, CLIENT_COMPONENT__LOCAL_VARIABLES);
		createEAttribute(clientComponentEClass, CLIENT_COMPONENT__CONSTANTS);
		createEOperation(clientComponentEClass, CLIENT_COMPONENT___RENDER);

		// Create enums
		sdkBaseClassTypeEEnum = createEEnum(SDK_BASE_CLASS_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ICorePackage theCorePackage = (ICorePackage)EPackage.Registry.INSTANCE.getEPackage(ICorePackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		clientComponentEClass.getESuperTypes().add(theCorePackage.getComponent());

		// Initialize classes, features, and operations; add parameters
		initEClass(clientComponentEClass, IClientComponent.class, "ClientComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClientComponent_SdkBaseClassType(), this.getSDKBaseClassType(), "sdkBaseClassType", "COMPONENT", 0, 1, IClientComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClientComponent_Data(), theXMLTypePackage.getBase64Binary(), "data", null, 0, 1, IClientComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClientComponent_Metadata(), theXMLTypePackage.getBase64Binary(), "metadata", null, 0, 1, IClientComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClientComponent_InitMethodBody(), ecorePackage.getEString(), "initMethodBody", null, 0, 1, IClientComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClientComponent_AfterUpdateMethodBody(), ecorePackage.getEString(), "afterUpdateMethodBody", null, 0, 1, IClientComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClientComponent_BeforeUpdateMethodBody(), ecorePackage.getEString(), "beforeUpdateMethodBody", null, 0, 1, IClientComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEMap());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(ecorePackage.getEString());
		g2.getETypeArguments().add(g3);
		g3 = createEGenericType(ecorePackage.getEString());
		g2.getETypeArguments().add(g3);
		initEAttribute(getClientComponent_PropertiesBody(), g1, "propertiesBody", null, 0, 1, IClientComponent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEAttribute(getClientComponent_ClassMethodsBody(), g1, "classMethodsBody", null, 0, 1, IClientComponent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEAttribute(getClientComponent_LocalMethodsBody(), g1, "localMethodsBody", null, 0, 1, IClientComponent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEAttribute(getClientComponent_ConstructorParameters(), g1, "constructorParameters", null, 0, 1, IClientComponent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEAttribute(getClientComponent_LocalVariables(), g1, "localVariables", null, 0, 1, IClientComponent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEAttribute(getClientComponent_Constants(), g1, "constants", null, 0, 1, IClientComponent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getClientComponent__Render(), null, "render", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(sdkBaseClassTypeEEnum, SDKBaseClassType.class, "SDKBaseClassType");
		addEEnumLiteral(sdkBaseClassTypeEEnum, SDKBaseClassType.COMPONENT);
		addEEnumLiteral(sdkBaseClassTypeEEnum, SDKBaseClassType.DATA_SOURCE);
		addEEnumLiteral(sdkBaseClassTypeEEnum, SDKBaseClassType.DATA_BUFFER);
		addEEnumLiteral(sdkBaseClassTypeEEnum, SDKBaseClassType.UI5);

		// Create resource
		createResource(eNS_URI);
	}

} //ExtendedPackage
