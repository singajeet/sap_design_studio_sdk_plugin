/**
 */
package com.armin.sap.ds.builder.models.extended;

import com.armin.sap.ds.builder.models.core.ICorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.armin.sap.ds.builder.models.extended.IExtendedFactory
 * @model kind="package"
 * @generated
 */
public interface IExtendedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "extended";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.armin.com/lumira_designer/models";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.armin.sap.ds.builder.models.extended";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IExtendedPackage eINSTANCE = com.armin.sap.ds.builder.models.extended.impl.ExtendedPackage.init();

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.extended.impl.ClientComponent <em>Client Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.extended.impl.ClientComponent
	 * @see com.armin.sap.ds.builder.models.extended.impl.ExtendedPackage#getClientComponent()
	 * @generated
	 */
	int CLIENT_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__ID = ICorePackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__TITLE = ICorePackage.COMPONENT__TITLE;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__TOOLTIP = ICorePackage.COMPONENT__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__VISIBLE = ICorePackage.COMPONENT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Require Js</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__REQUIRE_JS = ICorePackage.COMPONENT__REQUIRE_JS;

	/**
	 * The feature id for the '<em><b>Std Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__STD_INCLUDE = ICorePackage.COMPONENT__STD_INCLUDE;

	/**
	 * The feature id for the '<em><b>Js Include</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__JS_INCLUDE = ICorePackage.COMPONENT__JS_INCLUDE;

	/**
	 * The feature id for the '<em><b>Css Include</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__CSS_INCLUDE = ICorePackage.COMPONENT__CSS_INCLUDE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__PROPERTY = ICorePackage.COMPONENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__INITIALIZATION = ICorePackage.COMPONENT__INITIALIZATION;

	/**
	 * The feature id for the '<em><b>Supported Backend</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__SUPPORTED_BACKEND = ICorePackage.COMPONENT__SUPPORTED_BACKEND;

	/**
	 * The feature id for the '<em><b>Databound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__DATABOUND = ICorePackage.COMPONENT__DATABOUND;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__GROUP = ICorePackage.COMPONENT__GROUP;

	/**
	 * The feature id for the '<em><b>Handler Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__HANDLER_TYPE = ICorePackage.COMPONENT__HANDLER_TYPE;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__ICON = ICorePackage.COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__MODES = ICorePackage.COMPONENT__MODES;

	/**
	 * The feature id for the '<em><b>New Instance Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__NEW_INSTANCE_PREFIX = ICorePackage.COMPONENT__NEW_INSTANCE_PREFIX;

	/**
	 * The feature id for the '<em><b>Property Sheet Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__PROPERTY_SHEET_PATH = ICorePackage.COMPONENT__PROPERTY_SHEET_PATH;

	/**
	 * The feature id for the '<em><b>Sdk Base Class Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__SDK_BASE_CLASS_TYPE = ICorePackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__DATA = ICorePackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__METADATA = ICorePackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Init Method Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__INIT_METHOD_BODY = ICorePackage.COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>After Update Method Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__AFTER_UPDATE_METHOD_BODY = ICorePackage.COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Before Update Method Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__BEFORE_UPDATE_METHOD_BODY = ICorePackage.COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Properties Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__PROPERTIES_BODY = ICorePackage.COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Class Methods Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__CLASS_METHODS_BODY = ICorePackage.COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Local Methods Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__LOCAL_METHODS_BODY = ICorePackage.COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Constructor Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__CONSTRUCTOR_PARAMETERS = ICorePackage.COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Local Variables</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__LOCAL_VARIABLES = ICorePackage.COMPONENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Constants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT__CONSTANTS = ICorePackage.COMPONENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Client Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT_FEATURE_COUNT = ICorePackage.COMPONENT_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT___ECLASS = ICorePackage.COMPONENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT___EIS_PROXY = ICorePackage.COMPONENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT___ERESOURCE = ICorePackage.COMPONENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT___ECONTAINER = ICorePackage.COMPONENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT___ECONTAINING_FEATURE = ICorePackage.COMPONENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT___ECONTAINMENT_FEATURE = ICorePackage.COMPONENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT___ECONTENTS = ICorePackage.COMPONENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT___EALL_CONTENTS = ICorePackage.COMPONENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT___ECROSS_REFERENCES = ICorePackage.COMPONENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT___EGET__ESTRUCTURALFEATURE = ICorePackage.COMPONENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = ICorePackage.COMPONENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT___ESET__ESTRUCTURALFEATURE_OBJECT = ICorePackage.COMPONENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT___EIS_SET__ESTRUCTURALFEATURE = ICorePackage.COMPONENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT___EUNSET__ESTRUCTURALFEATURE = ICorePackage.COMPONENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT___EINVOKE__EOPERATION_ELIST = ICorePackage.COMPONENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT___RENDER = ICorePackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Client Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_COMPONENT_OPERATION_COUNT = ICorePackage.COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.extended.SDKBaseClassType <em>SDK Base Class Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.extended.SDKBaseClassType
	 * @see com.armin.sap.ds.builder.models.extended.impl.ExtendedPackage#getSDKBaseClassType()
	 * @generated
	 */
	int SDK_BASE_CLASS_TYPE = 1;


	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.extended.IClientComponent <em>Client Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client Component</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.IClientComponent
	 * @generated
	 */
	EClass getClientComponent();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getSdkBaseClassType <em>Sdk Base Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sdk Base Class Type</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.IClientComponent#getSdkBaseClassType()
	 * @see #getClientComponent()
	 * @generated
	 */
	EAttribute getClientComponent_SdkBaseClassType();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.IClientComponent#getData()
	 * @see #getClientComponent()
	 * @generated
	 */
	EAttribute getClientComponent_Data();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.IClientComponent#getMetadata()
	 * @see #getClientComponent()
	 * @generated
	 */
	EAttribute getClientComponent_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getInitMethodBody <em>Init Method Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Method Body</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.IClientComponent#getInitMethodBody()
	 * @see #getClientComponent()
	 * @generated
	 */
	EAttribute getClientComponent_InitMethodBody();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getAfterUpdateMethodBody <em>After Update Method Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>After Update Method Body</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.IClientComponent#getAfterUpdateMethodBody()
	 * @see #getClientComponent()
	 * @generated
	 */
	EAttribute getClientComponent_AfterUpdateMethodBody();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getBeforeUpdateMethodBody <em>Before Update Method Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Update Method Body</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.IClientComponent#getBeforeUpdateMethodBody()
	 * @see #getClientComponent()
	 * @generated
	 */
	EAttribute getClientComponent_BeforeUpdateMethodBody();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getPropertiesBody <em>Properties Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Properties Body</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.IClientComponent#getPropertiesBody()
	 * @see #getClientComponent()
	 * @generated
	 */
	EAttribute getClientComponent_PropertiesBody();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getClassMethodsBody <em>Class Methods Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Methods Body</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.IClientComponent#getClassMethodsBody()
	 * @see #getClientComponent()
	 * @generated
	 */
	EAttribute getClientComponent_ClassMethodsBody();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getLocalMethodsBody <em>Local Methods Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Methods Body</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.IClientComponent#getLocalMethodsBody()
	 * @see #getClientComponent()
	 * @generated
	 */
	EAttribute getClientComponent_LocalMethodsBody();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getConstructorParameters <em>Constructor Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constructor Parameters</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.IClientComponent#getConstructorParameters()
	 * @see #getClientComponent()
	 * @generated
	 */
	EAttribute getClientComponent_ConstructorParameters();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getLocalVariables <em>Local Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Variables</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.IClientComponent#getLocalVariables()
	 * @see #getClientComponent()
	 * @generated
	 */
	EAttribute getClientComponent_LocalVariables();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getConstants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constants</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.IClientComponent#getConstants()
	 * @see #getClientComponent()
	 * @generated
	 */
	EAttribute getClientComponent_Constants();

	/**
	 * Returns the meta object for the '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#render() <em>Render</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Render</em>' operation.
	 * @see com.armin.sap.ds.builder.models.extended.IClientComponent#render()
	 * @generated
	 */
	EOperation getClientComponent__Render();

	/**
	 * Returns the meta object for enum '{@link com.armin.sap.ds.builder.models.extended.SDKBaseClassType <em>SDK Base Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SDK Base Class Type</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.SDKBaseClassType
	 * @generated
	 */
	EEnum getSDKBaseClassType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IExtendedFactory getExtendedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.extended.impl.ClientComponent <em>Client Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.extended.impl.ClientComponent
		 * @see com.armin.sap.ds.builder.models.extended.impl.ExtendedPackage#getClientComponent()
		 * @generated
		 */
		EClass CLIENT_COMPONENT = eINSTANCE.getClientComponent();

		/**
		 * The meta object literal for the '<em><b>Sdk Base Class Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT_COMPONENT__SDK_BASE_CLASS_TYPE = eINSTANCE.getClientComponent_SdkBaseClassType();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT_COMPONENT__DATA = eINSTANCE.getClientComponent_Data();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT_COMPONENT__METADATA = eINSTANCE.getClientComponent_Metadata();

		/**
		 * The meta object literal for the '<em><b>Init Method Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT_COMPONENT__INIT_METHOD_BODY = eINSTANCE.getClientComponent_InitMethodBody();

		/**
		 * The meta object literal for the '<em><b>After Update Method Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT_COMPONENT__AFTER_UPDATE_METHOD_BODY = eINSTANCE.getClientComponent_AfterUpdateMethodBody();

		/**
		 * The meta object literal for the '<em><b>Before Update Method Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT_COMPONENT__BEFORE_UPDATE_METHOD_BODY = eINSTANCE.getClientComponent_BeforeUpdateMethodBody();

		/**
		 * The meta object literal for the '<em><b>Properties Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT_COMPONENT__PROPERTIES_BODY = eINSTANCE.getClientComponent_PropertiesBody();

		/**
		 * The meta object literal for the '<em><b>Class Methods Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT_COMPONENT__CLASS_METHODS_BODY = eINSTANCE.getClientComponent_ClassMethodsBody();

		/**
		 * The meta object literal for the '<em><b>Local Methods Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT_COMPONENT__LOCAL_METHODS_BODY = eINSTANCE.getClientComponent_LocalMethodsBody();

		/**
		 * The meta object literal for the '<em><b>Constructor Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT_COMPONENT__CONSTRUCTOR_PARAMETERS = eINSTANCE.getClientComponent_ConstructorParameters();

		/**
		 * The meta object literal for the '<em><b>Local Variables</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT_COMPONENT__LOCAL_VARIABLES = eINSTANCE.getClientComponent_LocalVariables();

		/**
		 * The meta object literal for the '<em><b>Constants</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT_COMPONENT__CONSTANTS = eINSTANCE.getClientComponent_Constants();

		/**
		 * The meta object literal for the '<em><b>Render</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLIENT_COMPONENT___RENDER = eINSTANCE.getClientComponent__Render();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.extended.SDKBaseClassType <em>SDK Base Class Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.extended.SDKBaseClassType
		 * @see com.armin.sap.ds.builder.models.extended.impl.ExtendedPackage#getSDKBaseClassType()
		 * @generated
		 */
		EEnum SDK_BASE_CLASS_TYPE = eINSTANCE.getSDKBaseClassType();

	}

} //IExtendedPackage
