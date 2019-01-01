/**
 */
package com.armin.sap.ds.builder.models.core;

import com.armin.sap.ds.builder.models.core.util.CoreValidator;

import com.armin.sap.ds.builder.models.extended.ExtendedPackage;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

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
 * <!-- begin-model-doc -->
 * 
 *       This schema describes an SAP BusinessObjects Design Studio software development kit (SDK)
 *       extension. A developer uses this schema to express an SDK extension with extension components
 *       in an XML file.
 *     
 * <!-- end-model-doc -->
 * @see com.armin.sap.ds.builder.models.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public class CorePackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.sap.com/bi/zen/sdk";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "com.armin.sap.ds.builder.models.core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CorePackage eINSTANCE = com.armin.sap.ds.builder.models.core.CorePackage.init();

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.Descriptable <em>Descriptable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.Descriptable
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getDescriptable()
	 * @generated
	 */
	public static final int DESCRIPTABLE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTABLE__ID = EcorePackage.EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTABLE__TITLE = EcorePackage.EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTABLE__TOOLTIP = EcorePackage.EOBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTABLE__VISIBLE = EcorePackage.EOBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Descriptable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTABLE_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTABLE___ECLASS = EcorePackage.EOBJECT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTABLE___EIS_PROXY = EcorePackage.EOBJECT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTABLE___ERESOURCE = EcorePackage.EOBJECT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTABLE___ECONTAINER = EcorePackage.EOBJECT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTABLE___ECONTAINING_FEATURE = EcorePackage.EOBJECT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTABLE___ECONTAINMENT_FEATURE = EcorePackage.EOBJECT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTABLE___ECONTENTS = EcorePackage.EOBJECT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTABLE___EALL_CONTENTS = EcorePackage.EOBJECT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTABLE___ECROSS_REFERENCES = EcorePackage.EOBJECT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTABLE___EGET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTABLE___ESET__ESTRUCTURALFEATURE_OBJECT = EcorePackage.EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTABLE___EIS_SET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTABLE___EUNSET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTABLE___EINVOKE__EOPERATION_ELIST = EcorePackage.EOBJECT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Descriptable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTABLE_OPERATION_COUNT = EcorePackage.EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.Component <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.Component
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getComponent()
	 * @generated
	 */
	public static final int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT__ID = DESCRIPTABLE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT__TITLE = DESCRIPTABLE__TITLE;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT__TOOLTIP = DESCRIPTABLE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT__VISIBLE = DESCRIPTABLE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Require Js</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT__REQUIRE_JS = DESCRIPTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Std Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT__STD_INCLUDE = DESCRIPTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Js Include</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT__JS_INCLUDE = DESCRIPTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Css Include</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT__CSS_INCLUDE = DESCRIPTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT__PROPERTY = DESCRIPTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT__INITIALIZATION = DESCRIPTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Supported Backend</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT__SUPPORTED_BACKEND = DESCRIPTABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Databound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT__DATABOUND = DESCRIPTABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT__GROUP = DESCRIPTABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Handler Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT__HANDLER_TYPE = DESCRIPTABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT__ICON = DESCRIPTABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT__MODES = DESCRIPTABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>New Instance Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT__NEW_INSTANCE_PREFIX = DESCRIPTABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Property Sheet Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT__PROPERTY_SHEET_PATH = DESCRIPTABLE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_FEATURE_COUNT = DESCRIPTABLE_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT___ECLASS = DESCRIPTABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT___EIS_PROXY = DESCRIPTABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT___ERESOURCE = DESCRIPTABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT___ECONTAINER = DESCRIPTABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT___ECONTAINING_FEATURE = DESCRIPTABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT___ECONTAINMENT_FEATURE = DESCRIPTABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT___ECONTENTS = DESCRIPTABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT___EALL_CONTENTS = DESCRIPTABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT___ECROSS_REFERENCES = DESCRIPTABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT___EGET__ESTRUCTURALFEATURE = DESCRIPTABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = DESCRIPTABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT___ESET__ESTRUCTURALFEATURE_OBJECT = DESCRIPTABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT___EIS_SET__ESTRUCTURALFEATURE = DESCRIPTABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT___EUNSET__ESTRUCTURALFEATURE = DESCRIPTABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT___EINVOKE__EOPERATION_ELIST = DESCRIPTABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_OPERATION_COUNT = DESCRIPTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.DocumentRoot <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.DocumentRoot
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getDocumentRoot()
	 * @generated
	 */
	public static final int DOCUMENT_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Sdk Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_ROOT__SDK_EXTENSION = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.Extension <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.Extension
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getExtension()
	 * @generated
	 */
	public static final int EXTENSION = 3;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION__LICENSE = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION__COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Eula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION__EULA = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION__ID = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION__TITLE = 5;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION__VENDOR = 6;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION__VERSION = 7;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.Group <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.Group
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getGroup()
	 * @generated
	 */
	public static final int GROUP = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUP__ID = DESCRIPTABLE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUP__TITLE = DESCRIPTABLE__TITLE;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUP__TOOLTIP = DESCRIPTABLE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUP__VISIBLE = DESCRIPTABLE__VISIBLE;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUP_FEATURE_COUNT = DESCRIPTABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUP___ECLASS = DESCRIPTABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUP___EIS_PROXY = DESCRIPTABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUP___ERESOURCE = DESCRIPTABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUP___ECONTAINER = DESCRIPTABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUP___ECONTAINING_FEATURE = DESCRIPTABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUP___ECONTAINMENT_FEATURE = DESCRIPTABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUP___ECONTENTS = DESCRIPTABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUP___EALL_CONTENTS = DESCRIPTABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUP___ECROSS_REFERENCES = DESCRIPTABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUP___EGET__ESTRUCTURALFEATURE = DESCRIPTABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUP___EGET__ESTRUCTURALFEATURE_BOOLEAN = DESCRIPTABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUP___ESET__ESTRUCTURALFEATURE_OBJECT = DESCRIPTABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUP___EIS_SET__ESTRUCTURALFEATURE = DESCRIPTABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUP___EUNSET__ESTRUCTURALFEATURE = DESCRIPTABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUP___EINVOKE__EOPERATION_ELIST = DESCRIPTABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUP_OPERATION_COUNT = DESCRIPTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.Initialization <em>Initialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.Initialization
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getInitialization()
	 * @generated
	 */
	public static final int INITIALIZATION = 5;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIALIZATION__DEFAULT_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Initialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIALIZATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Initialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INITIALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.Option <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.Option
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getOption()
	 * @generated
	 */
	public static final int OPTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPTION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.PossibleValueType <em>Possible Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.PossibleValueType
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getPossibleValueType()
	 * @generated
	 */
	public static final int POSSIBLE_VALUE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSSIBLE_VALUE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSSIBLE_VALUE_TYPE__TITLE = 1;

	/**
	 * The number of structural features of the '<em>Possible Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSSIBLE_VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Possible Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSSIBLE_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.Property <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.Property
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getProperty()
	 * @generated
	 */
	public static final int PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY__ID = DESCRIPTABLE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY__TITLE = DESCRIPTABLE__TITLE;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY__TOOLTIP = DESCRIPTABLE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY__VISIBLE = DESCRIPTABLE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY__PROPERTY = DESCRIPTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Possible Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY__POSSIBLE_VALUE = DESCRIPTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY__OPTION = DESCRIPTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bindable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY__BINDABLE = DESCRIPTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY__GROUP = DESCRIPTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY__MODES = DESCRIPTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Renderable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY__RENDERABLE = DESCRIPTABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY__TRANSIENT = DESCRIPTABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY__TYPE = DESCRIPTABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_FEATURE_COUNT = DESCRIPTABLE_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY___ECLASS = DESCRIPTABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY___EIS_PROXY = DESCRIPTABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY___ERESOURCE = DESCRIPTABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY___ECONTAINER = DESCRIPTABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY___ECONTAINING_FEATURE = DESCRIPTABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY___ECONTAINMENT_FEATURE = DESCRIPTABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY___ECONTENTS = DESCRIPTABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY___EALL_CONTENTS = DESCRIPTABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY___ECROSS_REFERENCES = DESCRIPTABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY___EGET__ESTRUCTURALFEATURE = DESCRIPTABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY___EGET__ESTRUCTURALFEATURE_BOOLEAN = DESCRIPTABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY___ESET__ESTRUCTURALFEATURE_OBJECT = DESCRIPTABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY___EIS_SET__ESTRUCTURALFEATURE = DESCRIPTABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY___EUNSET__ESTRUCTURALFEATURE = DESCRIPTABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY___EINVOKE__EOPERATION_ELIST = DESCRIPTABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_OPERATION_COUNT = DESCRIPTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.PropertyValue <em>Property Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.PropertyValue
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getPropertyValue()
	 * @generated
	 */
	public static final int PROPERTY_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_VALUE__PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.RequireJSType <em>Require JS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.RequireJSType
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getRequireJSType()
	 * @generated
	 */
	public static final int REQUIRE_JS_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRE_JS_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRE_JS_TYPE__MODES = 1;

	/**
	 * The number of structural features of the '<em>Require JS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRE_JS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Require JS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRE_JS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.StdInclude <em>Std Include</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.StdInclude
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getStdInclude()
	 * @generated
	 */
	public static final int STD_INCLUDE = 11;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STD_INCLUDE__KIND = 0;

	/**
	 * The number of structural features of the '<em>Std Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STD_INCLUDE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Std Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STD_INCLUDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.BackendSystemType <em>Backend System Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.BackendSystemType
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getBackendSystemType()
	 * @generated
	 */
	public static final int BACKEND_SYSTEM_TYPE = 12;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.HandlerTypes <em>Handler Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.HandlerTypes
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getHandlerTypes()
	 * @generated
	 */
	public static final int HANDLER_TYPES = 13;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.KindType <em>Kind Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.KindType
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getKindType()
	 * @generated
	 */
	public static final int KIND_TYPE = 14;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.PropertyType <em>Property Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.PropertyType
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getPropertyType()
	 * @generated
	 */
	public static final int PROPERTY_TYPE = 15;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.UI5Mode <em>UI5 Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.UI5Mode
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getUI5Mode()
	 * @generated
	 */
	public static final int UI5_MODE = 16;

	/**
	 * The meta object id for the '<em>Backend System Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.BackendSystemType
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getBackendSystemTypeObject()
	 * @generated
	 */
	public static final int BACKEND_SYSTEM_TYPE_OBJECT = 17;

	/**
	 * The meta object id for the '<em>Handler Types Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.HandlerTypes
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getHandlerTypesObject()
	 * @generated
	 */
	public static final int HANDLER_TYPES_OBJECT = 18;

	/**
	 * The meta object id for the '<em>Id Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getIdType()
	 * @generated
	 */
	public static final int ID_TYPE = 19;

	/**
	 * The meta object id for the '<em>Id Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getIdType1()
	 * @generated
	 */
	public static final int ID_TYPE1 = 20;

	/**
	 * The meta object id for the '<em>Kind Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.KindType
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getKindTypeObject()
	 * @generated
	 */
	public static final int KIND_TYPE_OBJECT = 21;

	/**
	 * The meta object id for the '<em>Property Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.PropertyType
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getPropertyTypeObject()
	 * @generated
	 */
	public static final int PROPERTY_TYPE_OBJECT = 22;

	/**
	 * The meta object id for the '<em>UI5 Mode Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.UI5Mode
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getUI5ModeObject()
	 * @generated
	 */
	public static final int UI5_MODE_OBJECT = 23;

	/**
	 * The meta object id for the '<em>UI5 Modes</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getUI5Modes()
	 * @generated
	 */
	public static final int UI5_MODES = 24;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getVersionType()
	 * @generated
	 */
	public static final int VERSION_TYPE = 25;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initializationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass possibleValueTypeEClass = null;

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
	private EClass propertyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requireJSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stdIncludeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum backendSystemTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum handlerTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum kindTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ui5ModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType backendSystemTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType handlerTypesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kindTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ui5ModeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ui5ModesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionTypeEDataType = null;

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
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackage() {
		super(eNS_URI, CoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		CorePackage theCorePackage = (CorePackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorePackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CorePackage());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ExtendedPackage theExtendedPackage = (ExtendedPackage)(EPackage.Registry.INSTANCE.getEPackage(ExtendedPackage.eNS_URI) instanceof ExtendedPackage ? EPackage.Registry.INSTANCE.getEPackage(ExtendedPackage.eNS_URI) : ExtendedPackage.eINSTANCE);

		// Create package meta-data objects
		theCorePackage.createPackageContents();
		theExtendedPackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theExtendedPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCorePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CoreValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}


	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.core.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Component
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link com.armin.sap.ds.builder.models.core.Component#getRequireJs <em>Require Js</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Require Js</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Component#getRequireJs()
	 * @see #getComponent()
	 * @generated
	 */
	public EReference getComponent_RequireJs() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link com.armin.sap.ds.builder.models.core.Component#getStdInclude <em>Std Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Std Include</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Component#getStdInclude()
	 * @see #getComponent()
	 * @generated
	 */
	public EReference getComponent_StdInclude() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute list '{@link com.armin.sap.ds.builder.models.core.Component#getJsInclude <em>Js Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Js Include</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Component#getJsInclude()
	 * @see #getComponent()
	 * @generated
	 */
	public EAttribute getComponent_JsInclude() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute list '{@link com.armin.sap.ds.builder.models.core.Component#getCssInclude <em>Css Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Css Include</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Component#getCssInclude()
	 * @see #getComponent()
	 * @generated
	 */
	public EAttribute getComponent_CssInclude() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link com.armin.sap.ds.builder.models.core.Component#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Component#getProperty()
	 * @see #getComponent()
	 * @generated
	 */
	public EReference getComponent_Property() {
		return (EReference)componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link com.armin.sap.ds.builder.models.core.Component#getInitialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initialization</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Component#getInitialization()
	 * @see #getComponent()
	 * @generated
	 */
	public EReference getComponent_Initialization() {
		return (EReference)componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute list '{@link com.armin.sap.ds.builder.models.core.Component#getSupportedBackend <em>Supported Backend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Backend</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Component#getSupportedBackend()
	 * @see #getComponent()
	 * @generated
	 */
	public EAttribute getComponent_SupportedBackend() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Component#isDatabound <em>Databound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Databound</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Component#isDatabound()
	 * @see #getComponent()
	 * @generated
	 */
	public EAttribute getComponent_Databound() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Component#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Component#getGroup()
	 * @see #getComponent()
	 * @generated
	 */
	public EAttribute getComponent_Group() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Component#getHandlerType <em>Handler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handler Type</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Component#getHandlerType()
	 * @see #getComponent()
	 * @generated
	 */
	public EAttribute getComponent_HandlerType() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Component#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Component#getIcon()
	 * @see #getComponent()
	 * @generated
	 */
	public EAttribute getComponent_Icon() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Component#getModes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modes</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Component#getModes()
	 * @see #getComponent()
	 * @generated
	 */
	public EAttribute getComponent_Modes() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Component#getNewInstancePrefix <em>New Instance Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Instance Prefix</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Component#getNewInstancePrefix()
	 * @see #getComponent()
	 * @generated
	 */
	public EAttribute getComponent_NewInstancePrefix() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Component#getPropertySheetPath <em>Property Sheet Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Sheet Path</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Component#getPropertySheetPath()
	 * @see #getComponent()
	 * @generated
	 */
	public EAttribute getComponent_PropertySheetPath() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.core.Descriptable <em>Descriptable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptable</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Descriptable
	 * @generated
	 */
	public EClass getDescriptable() {
		return descriptableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Descriptable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Descriptable#getId()
	 * @see #getDescriptable()
	 * @generated
	 */
	public EAttribute getDescriptable_Id() {
		return (EAttribute)descriptableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Descriptable#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Descriptable#getTitle()
	 * @see #getDescriptable()
	 * @generated
	 */
	public EAttribute getDescriptable_Title() {
		return (EAttribute)descriptableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Descriptable#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Descriptable#getTooltip()
	 * @see #getDescriptable()
	 * @generated
	 */
	public EAttribute getDescriptable_Tooltip() {
		return (EAttribute)descriptableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Descriptable#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Descriptable#isVisible()
	 * @see #getDescriptable()
	 * @generated
	 */
	public EAttribute getDescriptable_Visible() {
		return (EAttribute)descriptableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.core.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.armin.sap.ds.builder.models.core.DocumentRoot
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * Returns the meta object for the attribute list '{@link com.armin.sap.ds.builder.models.core.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.armin.sap.ds.builder.models.core.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the map '{@link com.armin.sap.ds.builder.models.core.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.armin.sap.ds.builder.models.core.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the map '{@link com.armin.sap.ds.builder.models.core.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.armin.sap.ds.builder.models.core.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link com.armin.sap.ds.builder.models.core.DocumentRoot#getSdkExtension <em>Sdk Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sdk Extension</em>'.
	 * @see com.armin.sap.ds.builder.models.core.DocumentRoot#getSdkExtension()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	public EReference getDocumentRoot_SdkExtension() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.core.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Extension
	 * @generated
	 */
	public EClass getExtension() {
		return extensionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Extension#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Extension#getLicense()
	 * @see #getExtension()
	 * @generated
	 */
	public EAttribute getExtension_License() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link com.armin.sap.ds.builder.models.core.Extension#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Extension#getGroup()
	 * @see #getExtension()
	 * @generated
	 */
	public EReference getExtension_Group() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link com.armin.sap.ds.builder.models.core.Extension#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Extension#getComponent()
	 * @see #getExtension()
	 * @generated
	 */
	public EReference getExtension_Component() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Extension#getEula <em>Eula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eula</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Extension#getEula()
	 * @see #getExtension()
	 * @generated
	 */
	public EAttribute getExtension_Eula() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Extension#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Extension#getId()
	 * @see #getExtension()
	 * @generated
	 */
	public EAttribute getExtension_Id() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Extension#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Extension#getTitle()
	 * @see #getExtension()
	 * @generated
	 */
	public EAttribute getExtension_Title() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Extension#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Extension#getVendor()
	 * @see #getExtension()
	 * @generated
	 */
	public EAttribute getExtension_Vendor() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Extension#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Extension#getVersion()
	 * @see #getExtension()
	 * @generated
	 */
	public EAttribute getExtension_Version() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.core.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Group
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.core.Initialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initialization</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Initialization
	 * @generated
	 */
	public EClass getInitialization() {
		return initializationEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link com.armin.sap.ds.builder.models.core.Initialization#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Default Value</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Initialization#getDefaultValue()
	 * @see #getInitialization()
	 * @generated
	 */
	public EReference getInitialization_DefaultValue() {
		return (EReference)initializationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.core.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Option
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Option#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Option#getName()
	 * @see #getOption()
	 * @generated
	 */
	public EAttribute getOption_Name() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Option#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Option#getValue()
	 * @see #getOption()
	 * @generated
	 */
	public EAttribute getOption_Value() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.core.PossibleValueType <em>Possible Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Possible Value Type</em>'.
	 * @see com.armin.sap.ds.builder.models.core.PossibleValueType
	 * @generated
	 */
	public EClass getPossibleValueType() {
		return possibleValueTypeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.PossibleValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.armin.sap.ds.builder.models.core.PossibleValueType#getValue()
	 * @see #getPossibleValueType()
	 * @generated
	 */
	public EAttribute getPossibleValueType_Value() {
		return (EAttribute)possibleValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.PossibleValueType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.armin.sap.ds.builder.models.core.PossibleValueType#getTitle()
	 * @see #getPossibleValueType()
	 * @generated
	 */
	public EAttribute getPossibleValueType_Title() {
		return (EAttribute)possibleValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.core.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Property
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link com.armin.sap.ds.builder.models.core.Property#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Property#getProperty()
	 * @see #getProperty()
	 * @generated
	 */
	public EReference getProperty_Property() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link com.armin.sap.ds.builder.models.core.Property#getPossibleValue <em>Possible Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Possible Value</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Property#getPossibleValue()
	 * @see #getProperty()
	 * @generated
	 */
	public EReference getProperty_PossibleValue() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link com.armin.sap.ds.builder.models.core.Property#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Property#getOption()
	 * @see #getProperty()
	 * @generated
	 */
	public EReference getProperty_Option() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Property#isBindable <em>Bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bindable</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Property#isBindable()
	 * @see #getProperty()
	 * @generated
	 */
	public EAttribute getProperty_Bindable() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Property#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Property#getGroup()
	 * @see #getProperty()
	 * @generated
	 */
	public EAttribute getProperty_Group() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Property#getModes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modes</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Property#getModes()
	 * @see #getProperty()
	 * @generated
	 */
	public EAttribute getProperty_Modes() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Property#isRenderable <em>Renderable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Renderable</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Property#isRenderable()
	 * @see #getProperty()
	 * @generated
	 */
	public EAttribute getProperty_Renderable() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Property#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Property#isTransient()
	 * @see #getProperty()
	 * @generated
	 */
	public EAttribute getProperty_Transient() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.armin.sap.ds.builder.models.core.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	public EAttribute getProperty_Type() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.core.PropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Value</em>'.
	 * @see com.armin.sap.ds.builder.models.core.PropertyValue
	 * @generated
	 */
	public EClass getPropertyValue() {
		return propertyValueEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.PropertyValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.armin.sap.ds.builder.models.core.PropertyValue#getValue()
	 * @see #getPropertyValue()
	 * @generated
	 */
	public EAttribute getPropertyValue_Value() {
		return (EAttribute)propertyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.PropertyValue#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see com.armin.sap.ds.builder.models.core.PropertyValue#getProperty()
	 * @see #getPropertyValue()
	 * @generated
	 */
	public EAttribute getPropertyValue_Property() {
		return (EAttribute)propertyValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.core.RequireJSType <em>Require JS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Require JS Type</em>'.
	 * @see com.armin.sap.ds.builder.models.core.RequireJSType
	 * @generated
	 */
	public EClass getRequireJSType() {
		return requireJSTypeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.RequireJSType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.armin.sap.ds.builder.models.core.RequireJSType#getValue()
	 * @see #getRequireJSType()
	 * @generated
	 */
	public EAttribute getRequireJSType_Value() {
		return (EAttribute)requireJSTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.RequireJSType#getModes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modes</em>'.
	 * @see com.armin.sap.ds.builder.models.core.RequireJSType#getModes()
	 * @see #getRequireJSType()
	 * @generated
	 */
	public EAttribute getRequireJSType_Modes() {
		return (EAttribute)requireJSTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.core.StdInclude <em>Std Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Std Include</em>'.
	 * @see com.armin.sap.ds.builder.models.core.StdInclude
	 * @generated
	 */
	public EClass getStdInclude() {
		return stdIncludeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.StdInclude#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see com.armin.sap.ds.builder.models.core.StdInclude#getKind()
	 * @see #getStdInclude()
	 * @generated
	 */
	public EAttribute getStdInclude_Kind() {
		return (EAttribute)stdIncludeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for enum '{@link com.armin.sap.ds.builder.models.core.BackendSystemType <em>Backend System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Backend System Type</em>'.
	 * @see com.armin.sap.ds.builder.models.core.BackendSystemType
	 * @generated
	 */
	public EEnum getBackendSystemType() {
		return backendSystemTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link com.armin.sap.ds.builder.models.core.HandlerTypes <em>Handler Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Handler Types</em>'.
	 * @see com.armin.sap.ds.builder.models.core.HandlerTypes
	 * @generated
	 */
	public EEnum getHandlerTypes() {
		return handlerTypesEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link com.armin.sap.ds.builder.models.core.KindType <em>Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kind Type</em>'.
	 * @see com.armin.sap.ds.builder.models.core.KindType
	 * @generated
	 */
	public EEnum getKindType() {
		return kindTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link com.armin.sap.ds.builder.models.core.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Type</em>'.
	 * @see com.armin.sap.ds.builder.models.core.PropertyType
	 * @generated
	 */
	public EEnum getPropertyType() {
		return propertyTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link com.armin.sap.ds.builder.models.core.UI5Mode <em>UI5 Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>UI5 Mode</em>'.
	 * @see com.armin.sap.ds.builder.models.core.UI5Mode
	 * @generated
	 */
	public EEnum getUI5Mode() {
		return ui5ModeEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link com.armin.sap.ds.builder.models.core.BackendSystemType <em>Backend System Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Backend System Type Object</em>'.
	 * @see com.armin.sap.ds.builder.models.core.BackendSystemType
	 * @model instanceClass="com.armin.sap.ds.builder.models.core.BackendSystemType"
	 *        extendedMetaData="name='BackendSystemType:Object' baseType='BackendSystemType'"
	 * @generated
	 */
	public EDataType getBackendSystemTypeObject() {
		return backendSystemTypeObjectEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link com.armin.sap.ds.builder.models.core.HandlerTypes <em>Handler Types Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Handler Types Object</em>'.
	 * @see com.armin.sap.ds.builder.models.core.HandlerTypes
	 * @model instanceClass="com.armin.sap.ds.builder.models.core.HandlerTypes"
	 *        extendedMetaData="name='HandlerTypes:Object' baseType='HandlerTypes'"
	 * @generated
	 */
	public EDataType getHandlerTypesObject() {
		return handlerTypesObjectEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Id Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='id_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='([a-z|\\d])+(\\.([a-z]|\\d)+)*'"
	 * @generated
	 */
	public EDataType getIdType() {
		return idTypeEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Id Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Id Type1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='id_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='([a-z|A-Z|\\d|/])+'"
	 * @generated
	 */
	public EDataType getIdType1() {
		return idType1EDataType;
	}

	/**
	 * Returns the meta object for data type '{@link com.armin.sap.ds.builder.models.core.KindType <em>Kind Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kind Type Object</em>'.
	 * @see com.armin.sap.ds.builder.models.core.KindType
	 * @model instanceClass="com.armin.sap.ds.builder.models.core.KindType"
	 *        extendedMetaData="name='kind_._type:Object' baseType='kind_._type'"
	 * @generated
	 */
	public EDataType getKindTypeObject() {
		return kindTypeObjectEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link com.armin.sap.ds.builder.models.core.PropertyType <em>Property Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Type Object</em>'.
	 * @see com.armin.sap.ds.builder.models.core.PropertyType
	 * @model instanceClass="com.armin.sap.ds.builder.models.core.PropertyType"
	 *        extendedMetaData="name='PropertyType:Object' baseType='PropertyType'"
	 * @generated
	 */
	public EDataType getPropertyTypeObject() {
		return propertyTypeObjectEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link com.armin.sap.ds.builder.models.core.UI5Mode <em>UI5 Mode Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>UI5 Mode Object</em>'.
	 * @see com.armin.sap.ds.builder.models.core.UI5Mode
	 * @model instanceClass="com.armin.sap.ds.builder.models.core.UI5Mode"
	 *        extendedMetaData="name='UI5Mode:Object' baseType='UI5Mode'"
	 * @generated
	 */
	public EDataType getUI5ModeObject() {
		return ui5ModeObjectEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>UI5 Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>UI5 Modes</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='UI5Modes' itemType='UI5Mode'"
	 * @generated
	 */
	public EDataType getUI5Modes() {
		return ui5ModesEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='version_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='\\d+\\.\\d+'"
	 * @generated
	 */
	public EDataType getVersionType() {
		return versionTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
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
		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__REQUIRE_JS);
		createEReference(componentEClass, COMPONENT__STD_INCLUDE);
		createEAttribute(componentEClass, COMPONENT__JS_INCLUDE);
		createEAttribute(componentEClass, COMPONENT__CSS_INCLUDE);
		createEReference(componentEClass, COMPONENT__PROPERTY);
		createEReference(componentEClass, COMPONENT__INITIALIZATION);
		createEAttribute(componentEClass, COMPONENT__SUPPORTED_BACKEND);
		createEAttribute(componentEClass, COMPONENT__DATABOUND);
		createEAttribute(componentEClass, COMPONENT__GROUP);
		createEAttribute(componentEClass, COMPONENT__HANDLER_TYPE);
		createEAttribute(componentEClass, COMPONENT__ICON);
		createEAttribute(componentEClass, COMPONENT__MODES);
		createEAttribute(componentEClass, COMPONENT__NEW_INSTANCE_PREFIX);
		createEAttribute(componentEClass, COMPONENT__PROPERTY_SHEET_PATH);

		descriptableEClass = createEClass(DESCRIPTABLE);
		createEAttribute(descriptableEClass, DESCRIPTABLE__ID);
		createEAttribute(descriptableEClass, DESCRIPTABLE__TITLE);
		createEAttribute(descriptableEClass, DESCRIPTABLE__TOOLTIP);
		createEAttribute(descriptableEClass, DESCRIPTABLE__VISIBLE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SDK_EXTENSION);

		extensionEClass = createEClass(EXTENSION);
		createEAttribute(extensionEClass, EXTENSION__LICENSE);
		createEReference(extensionEClass, EXTENSION__GROUP);
		createEReference(extensionEClass, EXTENSION__COMPONENT);
		createEAttribute(extensionEClass, EXTENSION__EULA);
		createEAttribute(extensionEClass, EXTENSION__ID);
		createEAttribute(extensionEClass, EXTENSION__TITLE);
		createEAttribute(extensionEClass, EXTENSION__VENDOR);
		createEAttribute(extensionEClass, EXTENSION__VERSION);

		groupEClass = createEClass(GROUP);

		initializationEClass = createEClass(INITIALIZATION);
		createEReference(initializationEClass, INITIALIZATION__DEFAULT_VALUE);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__NAME);
		createEAttribute(optionEClass, OPTION__VALUE);

		possibleValueTypeEClass = createEClass(POSSIBLE_VALUE_TYPE);
		createEAttribute(possibleValueTypeEClass, POSSIBLE_VALUE_TYPE__VALUE);
		createEAttribute(possibleValueTypeEClass, POSSIBLE_VALUE_TYPE__TITLE);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__PROPERTY);
		createEReference(propertyEClass, PROPERTY__POSSIBLE_VALUE);
		createEReference(propertyEClass, PROPERTY__OPTION);
		createEAttribute(propertyEClass, PROPERTY__BINDABLE);
		createEAttribute(propertyEClass, PROPERTY__GROUP);
		createEAttribute(propertyEClass, PROPERTY__MODES);
		createEAttribute(propertyEClass, PROPERTY__RENDERABLE);
		createEAttribute(propertyEClass, PROPERTY__TRANSIENT);
		createEAttribute(propertyEClass, PROPERTY__TYPE);

		propertyValueEClass = createEClass(PROPERTY_VALUE);
		createEAttribute(propertyValueEClass, PROPERTY_VALUE__VALUE);
		createEAttribute(propertyValueEClass, PROPERTY_VALUE__PROPERTY);

		requireJSTypeEClass = createEClass(REQUIRE_JS_TYPE);
		createEAttribute(requireJSTypeEClass, REQUIRE_JS_TYPE__VALUE);
		createEAttribute(requireJSTypeEClass, REQUIRE_JS_TYPE__MODES);

		stdIncludeEClass = createEClass(STD_INCLUDE);
		createEAttribute(stdIncludeEClass, STD_INCLUDE__KIND);

		// Create enums
		backendSystemTypeEEnum = createEEnum(BACKEND_SYSTEM_TYPE);
		handlerTypesEEnum = createEEnum(HANDLER_TYPES);
		kindTypeEEnum = createEEnum(KIND_TYPE);
		propertyTypeEEnum = createEEnum(PROPERTY_TYPE);
		ui5ModeEEnum = createEEnum(UI5_MODE);

		// Create data types
		backendSystemTypeObjectEDataType = createEDataType(BACKEND_SYSTEM_TYPE_OBJECT);
		handlerTypesObjectEDataType = createEDataType(HANDLER_TYPES_OBJECT);
		idTypeEDataType = createEDataType(ID_TYPE);
		idType1EDataType = createEDataType(ID_TYPE1);
		kindTypeObjectEDataType = createEDataType(KIND_TYPE_OBJECT);
		propertyTypeObjectEDataType = createEDataType(PROPERTY_TYPE_OBJECT);
		ui5ModeObjectEDataType = createEDataType(UI5_MODE_OBJECT);
		ui5ModesEDataType = createEDataType(UI5_MODES);
		versionTypeEDataType = createEDataType(VERSION_TYPE);
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
		componentEClass.getESuperTypes().add(this.getDescriptable());
		descriptableEClass.getESuperTypes().add(ecorePackage.getEObject());
		groupEClass.getESuperTypes().add(this.getDescriptable());
		propertyEClass.getESuperTypes().add(this.getDescriptable());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_RequireJs(), this.getRequireJSType(), null, "requireJs", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_StdInclude(), this.getStdInclude(), null, "stdInclude", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_JsInclude(), theXMLTypePackage.getString(), "jsInclude", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_CssInclude(), theXMLTypePackage.getString(), "cssInclude", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Property(), this.getProperty(), null, "property", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Initialization(), this.getInitialization(), null, "initialization", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_SupportedBackend(), this.getBackendSystemType(), "supportedBackend", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Databound(), theXMLTypePackage.getBoolean(), "databound", "false", 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Group(), theXMLTypePackage.getString(), "group", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_HandlerType(), this.getHandlerTypes(), "handlerType", "div", 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Icon(), theXMLTypePackage.getString(), "icon", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Modes(), this.getUI5Modes(), "modes", "commons", 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_NewInstancePrefix(), theXMLTypePackage.getString(), "newInstancePrefix", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_PropertySheetPath(), theXMLTypePackage.getString(), "propertySheetPath", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptableEClass, Descriptable.class, "Descriptable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescriptable_Id(), this.getIdType1(), "id", null, 1, 1, Descriptable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptable_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, Descriptable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptable_Tooltip(), theXMLTypePackage.getString(), "tooltip", null, 0, 1, Descriptable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptable_Visible(), theXMLTypePackage.getBoolean(), "visible", "true", 0, 1, Descriptable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SdkExtension(), this.getExtension(), null, "sdkExtension", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtension_License(), theXMLTypePackage.getString(), "license", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_Group(), this.getGroup(), null, "group", null, 0, -1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_Component(), this.getComponent(), null, "component", null, 0, -1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_Eula(), theXMLTypePackage.getString(), "eula", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_Id(), this.getIdType(), "id", null, 1, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_Vendor(), theXMLTypePackage.getString(), "vendor", null, 1, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_Version(), this.getVersionType(), "version", null, 1, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initializationEClass, Initialization.class, "Initialization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitialization_DefaultValue(), this.getPropertyValue(), null, "defaultValue", null, 0, -1, Initialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(possibleValueTypeEClass, PossibleValueType.class, "PossibleValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPossibleValueType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, PossibleValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPossibleValueType_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, PossibleValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_Property(), this.getProperty(), null, "property", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_PossibleValue(), this.getPossibleValueType(), null, "possibleValue", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Option(), this.getOption(), null, "option", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Bindable(), theXMLTypePackage.getBoolean(), "bindable", "false", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Group(), theXMLTypePackage.getString(), "group", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Modes(), this.getUI5Modes(), "modes", "commons m", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Renderable(), theXMLTypePackage.getBoolean(), "renderable", "true", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Transient(), theXMLTypePackage.getBoolean(), "transient", "false", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Type(), this.getPropertyType(), "type", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyValueEClass, PropertyValue.class, "PropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyValue_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, PropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyValue_Property(), theXMLTypePackage.getString(), "property", null, 1, 1, PropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requireJSTypeEClass, RequireJSType.class, "RequireJSType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequireJSType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, RequireJSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequireJSType_Modes(), this.getUI5Modes(), "modes", null, 1, 1, RequireJSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stdIncludeEClass, StdInclude.class, "StdInclude", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStdInclude_Kind(), this.getKindType(), "kind", null, 1, 1, StdInclude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(backendSystemTypeEEnum, BackendSystemType.class, "BackendSystemType");
		addEEnumLiteral(backendSystemTypeEEnum, BackendSystemType.LOCAL);
		addEEnumLiteral(backendSystemTypeEEnum, BackendSystemType.BIPLATFORM);
		addEEnumLiteral(backendSystemTypeEEnum, BackendSystemType.NETWEAVER);
		addEEnumLiteral(backendSystemTypeEEnum, BackendSystemType.HANA);

		initEEnum(handlerTypesEEnum, HandlerTypes.class, "HandlerTypes");
		addEEnumLiteral(handlerTypesEEnum, HandlerTypes.DIV);
		addEEnumLiteral(handlerTypesEEnum, HandlerTypes.SAPUI5);
		addEEnumLiteral(handlerTypesEEnum, HandlerTypes.CVOM);
		addEEnumLiteral(handlerTypesEEnum, HandlerTypes.DATASOURCE);

		initEEnum(kindTypeEEnum, KindType.class, "KindType");
		addEEnumLiteral(kindTypeEEnum, KindType.D3);
		addEEnumLiteral(kindTypeEEnum, KindType.CVOM);

		initEEnum(propertyTypeEEnum, PropertyType.class, "PropertyType");
		addEEnumLiteral(propertyTypeEEnum, PropertyType.STRING);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.TEXT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.INT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.FLOAT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.BOOLEAN);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.SCRIPT_TEXT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.MULTI_LINE_TEXT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.COLOR);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.URL);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.RESULT_CELL);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.RESULT_CELL_SET);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.RESULT_CELL_LIST);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.RESULT_SET);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.OBJECT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.ARRAY);

		initEEnum(ui5ModeEEnum, UI5Mode.class, "UI5Mode");
		addEEnumLiteral(ui5ModeEEnum, UI5Mode.COMMONS);
		addEEnumLiteral(ui5ModeEEnum, UI5Mode.M);

		// Initialize data types
		initEDataType(backendSystemTypeObjectEDataType, BackendSystemType.class, "BackendSystemTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(handlerTypesObjectEDataType, HandlerTypes.class, "HandlerTypesObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(idTypeEDataType, String.class, "IdType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(idType1EDataType, String.class, "IdType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kindTypeObjectEDataType, KindType.class, "KindTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(propertyTypeObjectEDataType, PropertyType.class, "PropertyTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ui5ModeObjectEDataType, UI5Mode.class, "UI5ModeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ui5ModesEDataType, List.class, "UI5Modes", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionTypeEDataType, String.class, "VersionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (backendSystemTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "BackendSystemType"
		   });	
		addAnnotation
		  (backendSystemTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "BackendSystemType:Object",
			 "baseType", "BackendSystemType"
		   });	
		addAnnotation
		  (componentEClass, 
		   source, 
		   new String[] {
			 "name", "Component",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getComponent_RequireJs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "requireJs",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getComponent_StdInclude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stdInclude",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getComponent_JsInclude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "jsInclude",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getComponent_CssInclude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cssInclude",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getComponent_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getComponent_Initialization(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "initialization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getComponent_SupportedBackend(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "supportedBackend",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getComponent_Databound(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "databound"
		   });	
		addAnnotation
		  (getComponent_Group(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "group"
		   });	
		addAnnotation
		  (getComponent_HandlerType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "handlerType"
		   });	
		addAnnotation
		  (getComponent_Icon(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "icon"
		   });	
		addAnnotation
		  (getComponent_Modes(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "modes"
		   });	
		addAnnotation
		  (getComponent_NewInstancePrefix(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "newInstancePrefix"
		   });	
		addAnnotation
		  (getComponent_PropertySheetPath(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "propertySheetPath"
		   });	
		addAnnotation
		  (descriptableEClass, 
		   source, 
		   new String[] {
			 "name", "Descriptable",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getDescriptable_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });	
		addAnnotation
		  (getDescriptable_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });	
		addAnnotation
		  (getDescriptable_Tooltip(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "tooltip"
		   });	
		addAnnotation
		  (getDescriptable_Visible(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "visible"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_SdkExtension(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sdkExtension",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (extensionEClass, 
		   source, 
		   new String[] {
			 "name", "Extension",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getExtension_License(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "license",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExtension_Group(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "group",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExtension_Component(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "component",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExtension_Eula(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "eula"
		   });	
		addAnnotation
		  (getExtension_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });	
		addAnnotation
		  (getExtension_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });	
		addAnnotation
		  (getExtension_Vendor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "vendor"
		   });	
		addAnnotation
		  (getExtension_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });	
		addAnnotation
		  (groupEClass, 
		   source, 
		   new String[] {
			 "name", "Group",
			 "kind", "empty"
		   });	
		addAnnotation
		  (handlerTypesEEnum, 
		   source, 
		   new String[] {
			 "name", "HandlerTypes"
		   });	
		addAnnotation
		  (handlerTypesObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "HandlerTypes:Object",
			 "baseType", "HandlerTypes"
		   });	
		addAnnotation
		  (idTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "id_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "([a-z|\\d])+(\\.([a-z]|\\d)+)*"
		   });	
		addAnnotation
		  (idType1EDataType, 
		   source, 
		   new String[] {
			 "name", "id_._1_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "([a-z|A-Z|\\d|/])+"
		   });	
		addAnnotation
		  (initializationEClass, 
		   source, 
		   new String[] {
			 "name", "Initialization",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getInitialization_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "defaultValue",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (kindTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "kind_._type"
		   });	
		addAnnotation
		  (kindTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "kind_._type:Object",
			 "baseType", "kind_._type"
		   });	
		addAnnotation
		  (optionEClass, 
		   source, 
		   new String[] {
			 "name", "Option",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getOption_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getOption_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (possibleValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PossibleValueType",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getPossibleValueType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getPossibleValueType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });	
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
			 "name", "Property",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getProperty_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_PossibleValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "possibleValue",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Option(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "option",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Bindable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "bindable"
		   });	
		addAnnotation
		  (getProperty_Group(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "group"
		   });	
		addAnnotation
		  (getProperty_Modes(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "modes"
		   });	
		addAnnotation
		  (getProperty_Renderable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "renderable"
		   });	
		addAnnotation
		  (getProperty_Transient(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transient"
		   });	
		addAnnotation
		  (getProperty_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });	
		addAnnotation
		  (propertyTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "PropertyType"
		   });	
		addAnnotation
		  (propertyTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "PropertyType:Object",
			 "baseType", "PropertyType"
		   });	
		addAnnotation
		  (propertyValueEClass, 
		   source, 
		   new String[] {
			 "name", "PropertyValue",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getPropertyValue_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getPropertyValue_Property(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "property"
		   });	
		addAnnotation
		  (requireJSTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RequireJSType",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getRequireJSType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getRequireJSType_Modes(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "modes"
		   });	
		addAnnotation
		  (stdIncludeEClass, 
		   source, 
		   new String[] {
			 "name", "StdInclude",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getStdInclude_Kind(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kind"
		   });	
		addAnnotation
		  (ui5ModeEEnum, 
		   source, 
		   new String[] {
			 "name", "UI5Mode"
		   });	
		addAnnotation
		  (ui5ModeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "UI5Mode:Object",
			 "baseType", "UI5Mode"
		   });	
		addAnnotation
		  (ui5ModesEDataType, 
		   source, 
		   new String[] {
			 "name", "UI5Modes",
			 "itemType", "UI5Mode"
		   });	
		addAnnotation
		  (versionTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "version_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "\\d+\\.\\d+"
		   });
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
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.Component <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.Component
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getComponent()
		 * @generated
		 */
		public static final EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Require Js</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPONENT__REQUIRE_JS = eINSTANCE.getComponent_RequireJs();

		/**
		 * The meta object literal for the '<em><b>Std Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPONENT__STD_INCLUDE = eINSTANCE.getComponent_StdInclude();

		/**
		 * The meta object literal for the '<em><b>Js Include</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COMPONENT__JS_INCLUDE = eINSTANCE.getComponent_JsInclude();

		/**
		 * The meta object literal for the '<em><b>Css Include</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COMPONENT__CSS_INCLUDE = eINSTANCE.getComponent_CssInclude();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPONENT__PROPERTY = eINSTANCE.getComponent_Property();

		/**
		 * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPONENT__INITIALIZATION = eINSTANCE.getComponent_Initialization();

		/**
		 * The meta object literal for the '<em><b>Supported Backend</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COMPONENT__SUPPORTED_BACKEND = eINSTANCE.getComponent_SupportedBackend();

		/**
		 * The meta object literal for the '<em><b>Databound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COMPONENT__DATABOUND = eINSTANCE.getComponent_Databound();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COMPONENT__GROUP = eINSTANCE.getComponent_Group();

		/**
		 * The meta object literal for the '<em><b>Handler Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COMPONENT__HANDLER_TYPE = eINSTANCE.getComponent_HandlerType();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COMPONENT__ICON = eINSTANCE.getComponent_Icon();

		/**
		 * The meta object literal for the '<em><b>Modes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COMPONENT__MODES = eINSTANCE.getComponent_Modes();

		/**
		 * The meta object literal for the '<em><b>New Instance Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COMPONENT__NEW_INSTANCE_PREFIX = eINSTANCE.getComponent_NewInstancePrefix();

		/**
		 * The meta object literal for the '<em><b>Property Sheet Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COMPONENT__PROPERTY_SHEET_PATH = eINSTANCE.getComponent_PropertySheetPath();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.Descriptable <em>Descriptable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.Descriptable
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getDescriptable()
		 * @generated
		 */
		public static final EClass DESCRIPTABLE = eINSTANCE.getDescriptable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DESCRIPTABLE__ID = eINSTANCE.getDescriptable_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DESCRIPTABLE__TITLE = eINSTANCE.getDescriptable_Title();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DESCRIPTABLE__TOOLTIP = eINSTANCE.getDescriptable_Tooltip();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DESCRIPTABLE__VISIBLE = eINSTANCE.getDescriptable_Visible();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.DocumentRoot <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.DocumentRoot
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getDocumentRoot()
		 * @generated
		 */
		public static final EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Sdk Extension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOCUMENT_ROOT__SDK_EXTENSION = eINSTANCE.getDocumentRoot_SdkExtension();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.Extension <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.Extension
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getExtension()
		 * @generated
		 */
		public static final EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EXTENSION__LICENSE = eINSTANCE.getExtension_License();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EXTENSION__GROUP = eINSTANCE.getExtension_Group();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EXTENSION__COMPONENT = eINSTANCE.getExtension_Component();

		/**
		 * The meta object literal for the '<em><b>Eula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EXTENSION__EULA = eINSTANCE.getExtension_Eula();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EXTENSION__ID = eINSTANCE.getExtension_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EXTENSION__TITLE = eINSTANCE.getExtension_Title();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EXTENSION__VENDOR = eINSTANCE.getExtension_Vendor();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EXTENSION__VERSION = eINSTANCE.getExtension_Version();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.Group <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.Group
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getGroup()
		 * @generated
		 */
		public static final EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.Initialization <em>Initialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.Initialization
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getInitialization()
		 * @generated
		 */
		public static final EClass INITIALIZATION = eINSTANCE.getInitialization();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference INITIALIZATION__DEFAULT_VALUE = eINSTANCE.getInitialization_DefaultValue();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.Option <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.Option
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getOption()
		 * @generated
		 */
		public static final EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OPTION__NAME = eINSTANCE.getOption_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OPTION__VALUE = eINSTANCE.getOption_Value();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.PossibleValueType <em>Possible Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.PossibleValueType
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getPossibleValueType()
		 * @generated
		 */
		public static final EClass POSSIBLE_VALUE_TYPE = eINSTANCE.getPossibleValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POSSIBLE_VALUE_TYPE__VALUE = eINSTANCE.getPossibleValueType_Value();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POSSIBLE_VALUE_TYPE__TITLE = eINSTANCE.getPossibleValueType_Title();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.Property <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.Property
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getProperty()
		 * @generated
		 */
		public static final EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROPERTY__PROPERTY = eINSTANCE.getProperty_Property();

		/**
		 * The meta object literal for the '<em><b>Possible Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROPERTY__POSSIBLE_VALUE = eINSTANCE.getProperty_PossibleValue();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROPERTY__OPTION = eINSTANCE.getProperty_Option();

		/**
		 * The meta object literal for the '<em><b>Bindable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROPERTY__BINDABLE = eINSTANCE.getProperty_Bindable();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROPERTY__GROUP = eINSTANCE.getProperty_Group();

		/**
		 * The meta object literal for the '<em><b>Modes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROPERTY__MODES = eINSTANCE.getProperty_Modes();

		/**
		 * The meta object literal for the '<em><b>Renderable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROPERTY__RENDERABLE = eINSTANCE.getProperty_Renderable();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROPERTY__TRANSIENT = eINSTANCE.getProperty_Transient();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.PropertyValue <em>Property Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.PropertyValue
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getPropertyValue()
		 * @generated
		 */
		public static final EClass PROPERTY_VALUE = eINSTANCE.getPropertyValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROPERTY_VALUE__VALUE = eINSTANCE.getPropertyValue_Value();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROPERTY_VALUE__PROPERTY = eINSTANCE.getPropertyValue_Property();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.RequireJSType <em>Require JS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.RequireJSType
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getRequireJSType()
		 * @generated
		 */
		public static final EClass REQUIRE_JS_TYPE = eINSTANCE.getRequireJSType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REQUIRE_JS_TYPE__VALUE = eINSTANCE.getRequireJSType_Value();

		/**
		 * The meta object literal for the '<em><b>Modes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REQUIRE_JS_TYPE__MODES = eINSTANCE.getRequireJSType_Modes();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.StdInclude <em>Std Include</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.StdInclude
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getStdInclude()
		 * @generated
		 */
		public static final EClass STD_INCLUDE = eINSTANCE.getStdInclude();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STD_INCLUDE__KIND = eINSTANCE.getStdInclude_Kind();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.BackendSystemType <em>Backend System Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.BackendSystemType
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getBackendSystemType()
		 * @generated
		 */
		public static final EEnum BACKEND_SYSTEM_TYPE = eINSTANCE.getBackendSystemType();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.HandlerTypes <em>Handler Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.HandlerTypes
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getHandlerTypes()
		 * @generated
		 */
		public static final EEnum HANDLER_TYPES = eINSTANCE.getHandlerTypes();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.KindType <em>Kind Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.KindType
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getKindType()
		 * @generated
		 */
		public static final EEnum KIND_TYPE = eINSTANCE.getKindType();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.PropertyType <em>Property Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.PropertyType
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getPropertyType()
		 * @generated
		 */
		public static final EEnum PROPERTY_TYPE = eINSTANCE.getPropertyType();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.UI5Mode <em>UI5 Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.UI5Mode
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getUI5Mode()
		 * @generated
		 */
		public static final EEnum UI5_MODE = eINSTANCE.getUI5Mode();

		/**
		 * The meta object literal for the '<em>Backend System Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.BackendSystemType
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getBackendSystemTypeObject()
		 * @generated
		 */
		public static final EDataType BACKEND_SYSTEM_TYPE_OBJECT = eINSTANCE.getBackendSystemTypeObject();

		/**
		 * The meta object literal for the '<em>Handler Types Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.HandlerTypes
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getHandlerTypesObject()
		 * @generated
		 */
		public static final EDataType HANDLER_TYPES_OBJECT = eINSTANCE.getHandlerTypesObject();

		/**
		 * The meta object literal for the '<em>Id Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getIdType()
		 * @generated
		 */
		public static final EDataType ID_TYPE = eINSTANCE.getIdType();

		/**
		 * The meta object literal for the '<em>Id Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getIdType1()
		 * @generated
		 */
		public static final EDataType ID_TYPE1 = eINSTANCE.getIdType1();

		/**
		 * The meta object literal for the '<em>Kind Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.KindType
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getKindTypeObject()
		 * @generated
		 */
		public static final EDataType KIND_TYPE_OBJECT = eINSTANCE.getKindTypeObject();

		/**
		 * The meta object literal for the '<em>Property Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.PropertyType
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getPropertyTypeObject()
		 * @generated
		 */
		public static final EDataType PROPERTY_TYPE_OBJECT = eINSTANCE.getPropertyTypeObject();

		/**
		 * The meta object literal for the '<em>UI5 Mode Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.UI5Mode
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getUI5ModeObject()
		 * @generated
		 */
		public static final EDataType UI5_MODE_OBJECT = eINSTANCE.getUI5ModeObject();

		/**
		 * The meta object literal for the '<em>UI5 Modes</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getUI5Modes()
		 * @generated
		 */
		public static final EDataType UI5_MODES = eINSTANCE.getUI5Modes();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.armin.sap.ds.builder.models.core.CorePackage#getVersionType()
		 * @generated
		 */
		public static final EDataType VERSION_TYPE = eINSTANCE.getVersionType();

	}

} //CorePackage
