/**
 */
package com.armin.sap.ds.builder.models.extended;

import com.armin.sap.ds.builder.models.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

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
 * @see com.armin.sap.ds.builder.models.extended.ExtendedFactory
 * @model kind="package"
 * @generated
 */
public class ExtendedPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "extended";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "www.armin.com/lumira_designer/models";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "com.armin.sap.ds.builder.models.extended";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ExtendedPackage eINSTANCE = com.armin.sap.ds.builder.models.extended.ExtendedPackage.init();

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.extended.ComponentClient <em>Component Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.extended.ComponentClient
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getComponentClient()
	 * @generated
	 */
	public static final int COMPONENT_CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_CLIENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_CLIENT__INIT = 1;

	/**
	 * The feature id for the '<em><b>After Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_CLIENT__AFTER_UPDATE = 2;

	/**
	 * The feature id for the '<em><b>Before Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_CLIENT__BEFORE_UPDATE = 3;

	/**
	 * The feature id for the '<em><b>Sdk Base Class Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_CLIENT__SDK_BASE_CLASS_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_CLIENT__DATA = 5;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_CLIENT__METADATA = 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_CLIENT__PROPERTIES = 7;

	/**
	 * The feature id for the '<em><b>Class Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_CLIENT__CLASS_METHODS = 8;

	/**
	 * The feature id for the '<em><b>Local Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_CLIENT__LOCAL_METHODS = 9;

	/**
	 * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_CLIENT__CONSTRUCTORS = 10;

	/**
	 * The feature id for the '<em><b>Local Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_CLIENT__LOCAL_VARIABLES = 11;

	/**
	 * The feature id for the '<em><b>Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_CLIENT__CONSTANTS = 12;

	/**
	 * The feature id for the '<em><b>Comp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_CLIENT__COMP = 13;

	/**
	 * The number of structural features of the '<em>Component Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_CLIENT_FEATURE_COUNT = 14;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_CLIENT___RENDER = 0;

	/**
	 * The number of operations of the '<em>Component Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_CLIENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.extended.Constant <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.extended.Constant
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getConstant()
	 * @generated
	 */
	public static final int CONSTANT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANT__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANT__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANT__QUALIFIER = 4;

	/**
	 * The feature id for the '<em><b>Is Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANT__IS_ARRAY = 5;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.extended.Property <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.extended.Property
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getProperty()
	 * @generated
	 */
	public static final int PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY__IS_READ_ONLY = 4;

	/**
	 * The feature id for the '<em><b>Getter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY__GETTER = 5;

	/**
	 * The feature id for the '<em><b>Setter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY__SETTER = 6;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.extended.Variable <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.extended.Variable
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getVariable()
	 * @generated
	 */
	public static final int VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VARIABLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VARIABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VARIABLE__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VARIABLE__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VARIABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.extended.Method <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.extended.Method
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getMethod()
	 * @generated
	 */
	public static final int METHOD = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METHOD__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METHOD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METHOD__BODY = 2;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METHOD__RETURN_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METHOD__PARAMETERS = 4;

	/**
	 * The feature id for the '<em><b>Accessibilty Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METHOD__ACCESSIBILTY_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METHOD_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.extended.Parameter <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.extended.Parameter
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getParameter()
	 * @generated
	 */
	public static final int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.extended.Constructor <em>Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.extended.Constructor
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getConstructor()
	 * @generated
	 */
	public static final int CONSTRUCTOR = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRUCTOR__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRUCTOR__NAME = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRUCTOR__BODY = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRUCTOR__PARAMETERS = 3;

	/**
	 * The feature id for the '<em><b>Accessibilty Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRUCTOR__ACCESSIBILTY_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRUCTOR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRUCTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.extended.Section <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.extended.Section
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getSection()
	 * @generated
	 */
	public static final int SECTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Belongs To Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTION__BELONGS_TO_COMPONENT = 1;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.extended.ConstantsSection <em>Constants Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.extended.ConstantsSection
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getConstantsSection()
	 * @generated
	 */
	public static final int CONSTANTS_SECTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANTS_SECTION__NAME = SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Belongs To Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANTS_SECTION__BELONGS_TO_COMPONENT = SECTION__BELONGS_TO_COMPONENT;

	/**
	 * The number of structural features of the '<em>Constants Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANTS_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constants Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANTS_SECTION_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.extended.LocalVariablesSection <em>Local Variables Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.extended.LocalVariablesSection
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getLocalVariablesSection()
	 * @generated
	 */
	public static final int LOCAL_VARIABLES_SECTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_VARIABLES_SECTION__NAME = SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Belongs To Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_VARIABLES_SECTION__BELONGS_TO_COMPONENT = SECTION__BELONGS_TO_COMPONENT;

	/**
	 * The number of structural features of the '<em>Local Variables Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_VARIABLES_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Local Variables Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_VARIABLES_SECTION_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.extended.ConstructorsSection <em>Constructors Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.extended.ConstructorsSection
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getConstructorsSection()
	 * @generated
	 */
	public static final int CONSTRUCTORS_SECTION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRUCTORS_SECTION__NAME = SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Belongs To Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRUCTORS_SECTION__BELONGS_TO_COMPONENT = SECTION__BELONGS_TO_COMPONENT;

	/**
	 * The number of structural features of the '<em>Constructors Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRUCTORS_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constructors Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRUCTORS_SECTION_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.extended.SDKBaseClassType <em>SDK Base Class Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.extended.SDKBaseClassType
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getSDKBaseClassType()
	 * @generated
	 */
	public static final int SDK_BASE_CLASS_TYPE = 11;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.extended.AccessType <em>Access Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.extended.AccessType
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getAccessType()
	 * @generated
	 */
	public static final int ACCESS_TYPE = 12;

	/**
	 * The meta object id for the '<em>Java Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getJavaObject()
	 * @generated
	 */
	public static final int JAVA_OBJECT = 13;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localVariablesSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sdkBaseClassTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaObjectEDataType = null;

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
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExtendedPackage() {
		super(eNS_URI, ExtendedFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExtendedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExtendedPackage init() {
		if (isInited) return (ExtendedPackage)EPackage.Registry.INSTANCE.getEPackage(ExtendedPackage.eNS_URI);

		// Obtain or create and register package
		ExtendedPackage theExtendedPackage = (ExtendedPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExtendedPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExtendedPackage());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CorePackage theCorePackage = (CorePackage)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackage ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);

		// Create package meta-data objects
		theExtendedPackage.createPackageContents();
		theCorePackage.createPackageContents();

		// Initialize created meta-data
		theExtendedPackage.initializePackageContents();
		theCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExtendedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExtendedPackage.eNS_URI, theExtendedPackage);
		return theExtendedPackage;
	}


	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.extended.ComponentClient <em>Component Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Client</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.ComponentClient
	 * @generated
	 */
	public EClass getComponentClient() {
		return componentClientEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.ComponentClient#getId()
	 * @see #getComponentClient()
	 * @generated
	 */
	public EAttribute getComponentClient_Id() {
		return (EAttribute)componentClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.ComponentClient#getInit()
	 * @see #getComponentClient()
	 * @generated
	 */
	public EReference getComponentClient_Init() {
		return (EReference)componentClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getAfterUpdate <em>After Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>After Update</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.ComponentClient#getAfterUpdate()
	 * @see #getComponentClient()
	 * @generated
	 */
	public EReference getComponentClient_AfterUpdate() {
		return (EReference)componentClientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getBeforeUpdate <em>Before Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Before Update</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.ComponentClient#getBeforeUpdate()
	 * @see #getComponentClient()
	 * @generated
	 */
	public EReference getComponentClient_BeforeUpdate() {
		return (EReference)componentClientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getSdkBaseClassType <em>Sdk Base Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sdk Base Class Type</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.ComponentClient#getSdkBaseClassType()
	 * @see #getComponentClient()
	 * @generated
	 */
	public EAttribute getComponentClient_SdkBaseClassType() {
		return (EAttribute)componentClientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.ComponentClient#getData()
	 * @see #getComponentClient()
	 * @generated
	 */
	public EAttribute getComponentClient_Data() {
		return (EAttribute)componentClientEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.ComponentClient#getMetadata()
	 * @see #getComponentClient()
	 * @generated
	 */
	public EAttribute getComponentClient_Metadata() {
		return (EAttribute)componentClientEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.ComponentClient#getProperties()
	 * @see #getComponentClient()
	 * @generated
	 */
	public EReference getComponentClient_Properties() {
		return (EReference)componentClientEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getClassMethods <em>Class Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class Methods</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.ComponentClient#getClassMethods()
	 * @see #getComponentClient()
	 * @generated
	 */
	public EReference getComponentClient_ClassMethods() {
		return (EReference)componentClientEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getLocalMethods <em>Local Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Methods</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.ComponentClient#getLocalMethods()
	 * @see #getComponentClient()
	 * @generated
	 */
	public EReference getComponentClient_LocalMethods() {
		return (EReference)componentClientEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getConstructors <em>Constructors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constructors</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.ComponentClient#getConstructors()
	 * @see #getComponentClient()
	 * @generated
	 */
	public EReference getComponentClient_Constructors() {
		return (EReference)componentClientEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getLocalVariables <em>Local Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Variables</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.ComponentClient#getLocalVariables()
	 * @see #getComponentClient()
	 * @generated
	 */
	public EReference getComponentClient_LocalVariables() {
		return (EReference)componentClientEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getConstants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constants</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.ComponentClient#getConstants()
	 * @see #getComponentClient()
	 * @generated
	 */
	public EReference getComponentClient_Constants() {
		return (EReference)componentClientEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getComp <em>Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comp</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.ComponentClient#getComp()
	 * @see #getComponentClient()
	 * @generated
	 */
	public EAttribute getComponentClient_Comp() {
		return (EAttribute)componentClientEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the '{@link com.armin.sap.ds.builder.models.extended.ComponentClient#render() <em>Render</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Render</em>' operation.
	 * @see com.armin.sap.ds.builder.models.extended.ComponentClient#render()
	 * @generated
	 */
	public EOperation getComponentClient__Render() {
		return componentClientEClass.getEOperations().get(0);
	}

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.extended.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Constant
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Constant#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Constant#getId()
	 * @see #getConstant()
	 * @generated
	 */
	public EAttribute getConstant_Id() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Constant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Constant#getName()
	 * @see #getConstant()
	 * @generated
	 */
	public EAttribute getConstant_Name() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Constant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Constant#getValue()
	 * @see #getConstant()
	 * @generated
	 */
	public EAttribute getConstant_Value() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Constant#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Constant#getType()
	 * @see #getConstant()
	 * @generated
	 */
	public EAttribute getConstant_Type() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Constant#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Constant#getQualifier()
	 * @see #getConstant()
	 * @generated
	 */
	public EAttribute getConstant_Qualifier() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Constant#isIsArray <em>Is Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Array</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Constant#isIsArray()
	 * @see #getConstant()
	 * @generated
	 */
	public EAttribute getConstant_IsArray() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.extended.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Property
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Property#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Property#getId()
	 * @see #getProperty()
	 * @generated
	 */
	public EAttribute getProperty_Id() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	public EAttribute getProperty_Type() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Property#isIsReadOnly <em>Is Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Read Only</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Property#isIsReadOnly()
	 * @see #getProperty()
	 * @generated
	 */
	public EAttribute getProperty_IsReadOnly() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link com.armin.sap.ds.builder.models.extended.Property#getGetter <em>Getter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Getter</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Property#getGetter()
	 * @see #getProperty()
	 * @generated
	 */
	public EReference getProperty_Getter() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference '{@link com.armin.sap.ds.builder.models.extended.Property#getSetter <em>Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Setter</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Property#getSetter()
	 * @see #getProperty()
	 * @generated
	 */
	public EReference getProperty_Setter() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.extended.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Variable
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Variable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Variable#getId()
	 * @see #getVariable()
	 * @generated
	 */
	public EAttribute getVariable_Id() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	public EAttribute getVariable_Value() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	public EAttribute getVariable_Type() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.extended.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Method
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Method#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Method#getId()
	 * @see #getMethod()
	 * @generated
	 */
	public EAttribute getMethod_Id() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	public EAttribute getMethod_Name() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Method#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Method#getBody()
	 * @see #getMethod()
	 * @generated
	 */
	public EAttribute getMethod_Body() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Method#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Method#getReturnType()
	 * @see #getMethod()
	 * @generated
	 */
	public EAttribute getMethod_ReturnType() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Method#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Method#getParameters()
	 * @see #getMethod()
	 * @generated
	 */
	public EAttribute getMethod_Parameters() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Method#getAccessibiltyType <em>Accessibilty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accessibilty Type</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Method#getAccessibiltyType()
	 * @see #getMethod()
	 * @generated
	 */
	public EAttribute getMethod_AccessibiltyType() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.extended.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Parameter
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Parameter#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Parameter#getId()
	 * @see #getParameter()
	 * @generated
	 */
	public EAttribute getParameter_Id() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	public EAttribute getParameter_Type() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.extended.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Constructor
	 * @generated
	 */
	public EClass getConstructor() {
		return constructorEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Constructor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Constructor#getId()
	 * @see #getConstructor()
	 * @generated
	 */
	public EAttribute getConstructor_Id() {
		return (EAttribute)constructorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Constructor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Constructor#getName()
	 * @see #getConstructor()
	 * @generated
	 */
	public EAttribute getConstructor_Name() {
		return (EAttribute)constructorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Constructor#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Constructor#getBody()
	 * @see #getConstructor()
	 * @generated
	 */
	public EAttribute getConstructor_Body() {
		return (EAttribute)constructorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Constructor#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Constructor#getParameters()
	 * @see #getConstructor()
	 * @generated
	 */
	public EAttribute getConstructor_Parameters() {
		return (EAttribute)constructorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Constructor#getAccessibiltyType <em>Accessibilty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accessibilty Type</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Constructor#getAccessibiltyType()
	 * @see #getConstructor()
	 * @generated
	 */
	public EAttribute getConstructor_AccessibiltyType() {
		return (EAttribute)constructorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.extended.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Section
	 * @generated
	 */
	public EClass getSection() {
		return sectionEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Section#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Section#getName()
	 * @see #getSection()
	 * @generated
	 */
	public EAttribute getSection_Name() {
		return (EAttribute)sectionEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.extended.Section#getBelongsToComponent <em>Belongs To Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Belongs To Component</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.Section#getBelongsToComponent()
	 * @see #getSection()
	 * @generated
	 */
	public EAttribute getSection_BelongsToComponent() {
		return (EAttribute)sectionEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.extended.ConstantsSection <em>Constants Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constants Section</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.ConstantsSection
	 * @generated
	 */
	public EClass getConstantsSection() {
		return constantsSectionEClass;
	}

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.extended.LocalVariablesSection <em>Local Variables Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Variables Section</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.LocalVariablesSection
	 * @generated
	 */
	public EClass getLocalVariablesSection() {
		return localVariablesSectionEClass;
	}


	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.extended.ConstructorsSection <em>Constructors Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructors Section</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.ConstructorsSection
	 * @generated
	 */
	public EClass getConstructorsSection() {
		return constructorsSectionEClass;
	}


	/**
	 * Returns the meta object for enum '{@link com.armin.sap.ds.builder.models.extended.SDKBaseClassType <em>SDK Base Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SDK Base Class Type</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.SDKBaseClassType
	 * @generated
	 */
	public EEnum getSDKBaseClassType() {
		return sdkBaseClassTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link com.armin.sap.ds.builder.models.extended.AccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Type</em>'.
	 * @see com.armin.sap.ds.builder.models.extended.AccessType
	 * @generated
	 */
	public EEnum getAccessType() {
		return accessTypeEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Java Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	public EDataType getJavaObject() {
		return javaObjectEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public ExtendedFactory getExtendedFactory() {
		return (ExtendedFactory)getEFactoryInstance();
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
		componentClientEClass = createEClass(COMPONENT_CLIENT);
		createEAttribute(componentClientEClass, COMPONENT_CLIENT__ID);
		createEReference(componentClientEClass, COMPONENT_CLIENT__INIT);
		createEReference(componentClientEClass, COMPONENT_CLIENT__AFTER_UPDATE);
		createEReference(componentClientEClass, COMPONENT_CLIENT__BEFORE_UPDATE);
		createEAttribute(componentClientEClass, COMPONENT_CLIENT__SDK_BASE_CLASS_TYPE);
		createEAttribute(componentClientEClass, COMPONENT_CLIENT__DATA);
		createEAttribute(componentClientEClass, COMPONENT_CLIENT__METADATA);
		createEReference(componentClientEClass, COMPONENT_CLIENT__PROPERTIES);
		createEReference(componentClientEClass, COMPONENT_CLIENT__CLASS_METHODS);
		createEReference(componentClientEClass, COMPONENT_CLIENT__LOCAL_METHODS);
		createEReference(componentClientEClass, COMPONENT_CLIENT__CONSTRUCTORS);
		createEReference(componentClientEClass, COMPONENT_CLIENT__LOCAL_VARIABLES);
		createEReference(componentClientEClass, COMPONENT_CLIENT__CONSTANTS);
		createEAttribute(componentClientEClass, COMPONENT_CLIENT__COMP);
		createEOperation(componentClientEClass, COMPONENT_CLIENT___RENDER);

		constantEClass = createEClass(CONSTANT);
		createEAttribute(constantEClass, CONSTANT__ID);
		createEAttribute(constantEClass, CONSTANT__NAME);
		createEAttribute(constantEClass, CONSTANT__VALUE);
		createEAttribute(constantEClass, CONSTANT__TYPE);
		createEAttribute(constantEClass, CONSTANT__QUALIFIER);
		createEAttribute(constantEClass, CONSTANT__IS_ARRAY);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__ID);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__VALUE);
		createEAttribute(propertyEClass, PROPERTY__TYPE);
		createEAttribute(propertyEClass, PROPERTY__IS_READ_ONLY);
		createEReference(propertyEClass, PROPERTY__GETTER);
		createEReference(propertyEClass, PROPERTY__SETTER);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__ID);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__VALUE);
		createEAttribute(variableEClass, VARIABLE__TYPE);

		methodEClass = createEClass(METHOD);
		createEAttribute(methodEClass, METHOD__ID);
		createEAttribute(methodEClass, METHOD__NAME);
		createEAttribute(methodEClass, METHOD__BODY);
		createEAttribute(methodEClass, METHOD__RETURN_TYPE);
		createEAttribute(methodEClass, METHOD__PARAMETERS);
		createEAttribute(methodEClass, METHOD__ACCESSIBILTY_TYPE);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__ID);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__VALUE);
		createEAttribute(parameterEClass, PARAMETER__TYPE);

		constructorEClass = createEClass(CONSTRUCTOR);
		createEAttribute(constructorEClass, CONSTRUCTOR__ID);
		createEAttribute(constructorEClass, CONSTRUCTOR__NAME);
		createEAttribute(constructorEClass, CONSTRUCTOR__BODY);
		createEAttribute(constructorEClass, CONSTRUCTOR__PARAMETERS);
		createEAttribute(constructorEClass, CONSTRUCTOR__ACCESSIBILTY_TYPE);

		sectionEClass = createEClass(SECTION);
		createEAttribute(sectionEClass, SECTION__NAME);
		createEAttribute(sectionEClass, SECTION__BELONGS_TO_COMPONENT);

		constantsSectionEClass = createEClass(CONSTANTS_SECTION);

		localVariablesSectionEClass = createEClass(LOCAL_VARIABLES_SECTION);

		constructorsSectionEClass = createEClass(CONSTRUCTORS_SECTION);

		// Create enums
		sdkBaseClassTypeEEnum = createEEnum(SDK_BASE_CLASS_TYPE);
		accessTypeEEnum = createEEnum(ACCESS_TYPE);

		// Create data types
		javaObjectEDataType = createEDataType(JAVA_OBJECT);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		constantsSectionEClass.getESuperTypes().add(this.getSection());
		localVariablesSectionEClass.getESuperTypes().add(this.getSection());
		constructorsSectionEClass.getESuperTypes().add(this.getSection());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentClientEClass, ComponentClient.class, "ComponentClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentClient_Id(), ecorePackage.getEInt(), "id", null, 0, 1, ComponentClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentClient_Init(), this.getMethod(), null, "init", null, 0, 1, ComponentClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getComponentClient_Init().getEKeys().add(this.getMethod_Id());
		initEReference(getComponentClient_AfterUpdate(), this.getMethod(), null, "afterUpdate", null, 0, 1, ComponentClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getComponentClient_AfterUpdate().getEKeys().add(this.getMethod_Id());
		initEReference(getComponentClient_BeforeUpdate(), this.getMethod(), null, "beforeUpdate", null, 0, 1, ComponentClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getComponentClient_BeforeUpdate().getEKeys().add(this.getMethod_Id());
		initEAttribute(getComponentClient_SdkBaseClassType(), this.getSDKBaseClassType(), "sdkBaseClassType", "COMPONENT", 0, 1, ComponentClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentClient_Data(), theXMLTypePackage.getBase64Binary(), "data", null, 0, 1, ComponentClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentClient_Metadata(), theXMLTypePackage.getBase64Binary(), "metadata", null, 0, 1, ComponentClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentClient_Properties(), this.getProperty(), null, "properties", null, 0, -1, ComponentClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getComponentClient_Properties().getEKeys().add(this.getProperty_Id());
		initEReference(getComponentClient_ClassMethods(), this.getMethod(), null, "classMethods", null, 0, -1, ComponentClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getComponentClient_ClassMethods().getEKeys().add(this.getMethod_Id());
		initEReference(getComponentClient_LocalMethods(), this.getMethod(), null, "localMethods", null, 0, -1, ComponentClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getComponentClient_LocalMethods().getEKeys().add(this.getMethod_Id());
		initEReference(getComponentClient_Constructors(), this.getConstructor(), null, "constructors", null, 0, -1, ComponentClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getComponentClient_Constructors().getEKeys().add(this.getConstructor_Id());
		initEReference(getComponentClient_LocalVariables(), this.getVariable(), null, "localVariables", null, 0, -1, ComponentClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getComponentClient_LocalVariables().getEKeys().add(this.getVariable_Id());
		initEReference(getComponentClient_Constants(), this.getConstant(), null, "constants", null, 0, -1, ComponentClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getComponentClient_Constants().getEKeys().add(this.getConstant_Id());
		initEAttribute(getComponentClient_Comp(), this.getJavaObject(), "comp", null, 0, 1, ComponentClient.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getComponentClient__Render(), null, "render", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstant_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstant_Name(), ecorePackage.getEString(), "name", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstant_Type(), ecorePackage.getEString(), "type", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstant_Qualifier(), ecorePackage.getEString(), "qualifier", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstant_IsArray(), ecorePackage.getEBoolean(), "isArray", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Type(), ecorePackage.getEString(), "type", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsReadOnly(), ecorePackage.getEBoolean(), "isReadOnly", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Getter(), this.getMethod(), null, "getter", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProperty_Getter().getEKeys().add(this.getMethod_Id());
		initEReference(getProperty_Setter(), this.getMethod(), null, "setter", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProperty_Setter().getEKeys().add(this.getMethod_Id());

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Value(), ecorePackage.getEString(), "value", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Type(), ecorePackage.getEString(), "type", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethod_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Body(), ecorePackage.getEString(), "body", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType(this.getParameter());
		g1.getETypeArguments().add(g2);
		initEAttribute(getMethod_Parameters(), g1, "parameters", null, 0, 1, Method.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_AccessibiltyType(), this.getAccessType(), "accessibiltyType", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Type(), ecorePackage.getEString(), "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constructorEClass, Constructor.class, "Constructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstructor_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstructor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstructor_Body(), ecorePackage.getEString(), "body", null, 0, 1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getParameter());
		g1.getETypeArguments().add(g2);
		initEAttribute(getConstructor_Parameters(), g1, "parameters", null, 0, 1, Constructor.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstructor_AccessibiltyType(), this.getAccessType(), "accessibiltyType", null, 0, 1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSection_BelongsToComponent(), this.getJavaObject(), "belongsToComponent", null, 0, 1, Section.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantsSectionEClass, ConstantsSection.class, "ConstantsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(localVariablesSectionEClass, LocalVariablesSection.class, "LocalVariablesSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constructorsSectionEClass, ConstructorsSection.class, "ConstructorsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(sdkBaseClassTypeEEnum, SDKBaseClassType.class, "SDKBaseClassType");
		addEEnumLiteral(sdkBaseClassTypeEEnum, SDKBaseClassType.COMPONENT);
		addEEnumLiteral(sdkBaseClassTypeEEnum, SDKBaseClassType.DATA_SOURCE);
		addEEnumLiteral(sdkBaseClassTypeEEnum, SDKBaseClassType.DATA_BUFFER);
		addEEnumLiteral(sdkBaseClassTypeEEnum, SDKBaseClassType.UI5);

		initEEnum(accessTypeEEnum, AccessType.class, "AccessType");
		addEEnumLiteral(accessTypeEEnum, AccessType.PRIVATE);
		addEEnumLiteral(accessTypeEEnum, AccessType.PUBLIC);
		addEEnumLiteral(accessTypeEEnum, AccessType.PROTECTED);

		// Initialize data types
		initEDataType(javaObjectEDataType, Object.class, "JavaObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

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
	public interface Literals {
		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.extended.ComponentClient <em>Component Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.extended.ComponentClient
		 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getComponentClient()
		 * @generated
		 */
		public static final EClass COMPONENT_CLIENT = eINSTANCE.getComponentClient();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COMPONENT_CLIENT__ID = eINSTANCE.getComponentClient_Id();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPONENT_CLIENT__INIT = eINSTANCE.getComponentClient_Init();

		/**
		 * The meta object literal for the '<em><b>After Update</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPONENT_CLIENT__AFTER_UPDATE = eINSTANCE.getComponentClient_AfterUpdate();

		/**
		 * The meta object literal for the '<em><b>Before Update</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPONENT_CLIENT__BEFORE_UPDATE = eINSTANCE.getComponentClient_BeforeUpdate();

		/**
		 * The meta object literal for the '<em><b>Sdk Base Class Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COMPONENT_CLIENT__SDK_BASE_CLASS_TYPE = eINSTANCE.getComponentClient_SdkBaseClassType();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COMPONENT_CLIENT__DATA = eINSTANCE.getComponentClient_Data();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COMPONENT_CLIENT__METADATA = eINSTANCE.getComponentClient_Metadata();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPONENT_CLIENT__PROPERTIES = eINSTANCE.getComponentClient_Properties();

		/**
		 * The meta object literal for the '<em><b>Class Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPONENT_CLIENT__CLASS_METHODS = eINSTANCE.getComponentClient_ClassMethods();

		/**
		 * The meta object literal for the '<em><b>Local Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPONENT_CLIENT__LOCAL_METHODS = eINSTANCE.getComponentClient_LocalMethods();

		/**
		 * The meta object literal for the '<em><b>Constructors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPONENT_CLIENT__CONSTRUCTORS = eINSTANCE.getComponentClient_Constructors();

		/**
		 * The meta object literal for the '<em><b>Local Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPONENT_CLIENT__LOCAL_VARIABLES = eINSTANCE.getComponentClient_LocalVariables();

		/**
		 * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPONENT_CLIENT__CONSTANTS = eINSTANCE.getComponentClient_Constants();

		/**
		 * The meta object literal for the '<em><b>Comp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COMPONENT_CLIENT__COMP = eINSTANCE.getComponentClient_Comp();

		/**
		 * The meta object literal for the '<em><b>Render</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation COMPONENT_CLIENT___RENDER = eINSTANCE.getComponentClient__Render();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.extended.Constant <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.extended.Constant
		 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getConstant()
		 * @generated
		 */
		public static final EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONSTANT__ID = eINSTANCE.getConstant_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONSTANT__NAME = eINSTANCE.getConstant_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONSTANT__TYPE = eINSTANCE.getConstant_Type();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONSTANT__QUALIFIER = eINSTANCE.getConstant_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Is Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONSTANT__IS_ARRAY = eINSTANCE.getConstant_IsArray();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.extended.Property <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.extended.Property
		 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getProperty()
		 * @generated
		 */
		public static final EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROPERTY__ID = eINSTANCE.getProperty_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Is Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROPERTY__IS_READ_ONLY = eINSTANCE.getProperty_IsReadOnly();

		/**
		 * The meta object literal for the '<em><b>Getter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROPERTY__GETTER = eINSTANCE.getProperty_Getter();

		/**
		 * The meta object literal for the '<em><b>Setter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROPERTY__SETTER = eINSTANCE.getProperty_Setter();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.extended.Variable <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.extended.Variable
		 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getVariable()
		 * @generated
		 */
		public static final EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute VARIABLE__ID = eINSTANCE.getVariable_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.extended.Method <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.extended.Method
		 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getMethod()
		 * @generated
		 */
		public static final EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute METHOD__ID = eINSTANCE.getMethod_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute METHOD__BODY = eINSTANCE.getMethod_Body();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute METHOD__RETURN_TYPE = eINSTANCE.getMethod_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute METHOD__PARAMETERS = eINSTANCE.getMethod_Parameters();

		/**
		 * The meta object literal for the '<em><b>Accessibilty Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute METHOD__ACCESSIBILTY_TYPE = eINSTANCE.getMethod_AccessibiltyType();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.extended.Parameter <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.extended.Parameter
		 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getParameter()
		 * @generated
		 */
		public static final EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PARAMETER__ID = eINSTANCE.getParameter_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.extended.Constructor <em>Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.extended.Constructor
		 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getConstructor()
		 * @generated
		 */
		public static final EClass CONSTRUCTOR = eINSTANCE.getConstructor();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONSTRUCTOR__ID = eINSTANCE.getConstructor_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONSTRUCTOR__NAME = eINSTANCE.getConstructor_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONSTRUCTOR__BODY = eINSTANCE.getConstructor_Body();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONSTRUCTOR__PARAMETERS = eINSTANCE.getConstructor_Parameters();

		/**
		 * The meta object literal for the '<em><b>Accessibilty Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONSTRUCTOR__ACCESSIBILTY_TYPE = eINSTANCE.getConstructor_AccessibiltyType();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.extended.Section <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.extended.Section
		 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getSection()
		 * @generated
		 */
		public static final EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SECTION__NAME = eINSTANCE.getSection_Name();

		/**
		 * The meta object literal for the '<em><b>Belongs To Component</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SECTION__BELONGS_TO_COMPONENT = eINSTANCE.getSection_BelongsToComponent();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.extended.ConstantsSection <em>Constants Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.extended.ConstantsSection
		 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getConstantsSection()
		 * @generated
		 */
		public static final EClass CONSTANTS_SECTION = eINSTANCE.getConstantsSection();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.extended.LocalVariablesSection <em>Local Variables Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.extended.LocalVariablesSection
		 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getLocalVariablesSection()
		 * @generated
		 */
		public static final EClass LOCAL_VARIABLES_SECTION = eINSTANCE.getLocalVariablesSection();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.extended.ConstructorsSection <em>Constructors Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.extended.ConstructorsSection
		 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getConstructorsSection()
		 * @generated
		 */
		public static final EClass CONSTRUCTORS_SECTION = eINSTANCE.getConstructorsSection();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.extended.SDKBaseClassType <em>SDK Base Class Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.extended.SDKBaseClassType
		 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getSDKBaseClassType()
		 * @generated
		 */
		public static final EEnum SDK_BASE_CLASS_TYPE = eINSTANCE.getSDKBaseClassType();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.extended.AccessType <em>Access Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.extended.AccessType
		 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getAccessType()
		 * @generated
		 */
		public static final EEnum ACCESS_TYPE = eINSTANCE.getAccessType();

		/**
		 * The meta object literal for the '<em>Java Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getJavaObject()
		 * @generated
		 */
		public static final EDataType JAVA_OBJECT = eINSTANCE.getJavaObject();

	}

} //ExtendedPackage
