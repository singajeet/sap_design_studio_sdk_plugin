/**
 */
package com.armin.sap.ds.builder.models.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

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
 * @see com.armin.sap.ds.builder.models.core.ICoreFactory
 * @model kind="package"
 * @generated
 */
public interface ICorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sap.com/bi/zen/sdk";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.armin.sap.ds.builder.models.core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ICorePackage eINSTANCE = com.armin.sap.ds.builder.models.core.impl.CorePackage.init();

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.impl.Descriptable <em>Descriptable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.impl.Descriptable
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getDescriptable()
	 * @generated
	 */
	int DESCRIPTABLE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTABLE__ID = EcorePackage.EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTABLE__TITLE = EcorePackage.EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTABLE__TOOLTIP = EcorePackage.EOBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTABLE__VISIBLE = EcorePackage.EOBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Descriptable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTABLE_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTABLE___ECLASS = EcorePackage.EOBJECT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTABLE___EIS_PROXY = EcorePackage.EOBJECT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTABLE___ERESOURCE = EcorePackage.EOBJECT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTABLE___ECONTAINER = EcorePackage.EOBJECT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTABLE___ECONTAINING_FEATURE = EcorePackage.EOBJECT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTABLE___ECONTAINMENT_FEATURE = EcorePackage.EOBJECT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTABLE___ECONTENTS = EcorePackage.EOBJECT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTABLE___EALL_CONTENTS = EcorePackage.EOBJECT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTABLE___ECROSS_REFERENCES = EcorePackage.EOBJECT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTABLE___EGET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTABLE___ESET__ESTRUCTURALFEATURE_OBJECT = EcorePackage.EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTABLE___EIS_SET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTABLE___EUNSET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTABLE___EINVOKE__EOPERATION_ELIST = EcorePackage.EOBJECT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Descriptable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTABLE_OPERATION_COUNT = EcorePackage.EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.impl.Component <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.impl.Component
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = DESCRIPTABLE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TITLE = DESCRIPTABLE__TITLE;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TOOLTIP = DESCRIPTABLE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__VISIBLE = DESCRIPTABLE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Require Js</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REQUIRE_JS = DESCRIPTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Std Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__STD_INCLUDE = DESCRIPTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Js Include</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__JS_INCLUDE = DESCRIPTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Css Include</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CSS_INCLUDE = DESCRIPTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROPERTY = DESCRIPTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INITIALIZATION = DESCRIPTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Supported Backend</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SUPPORTED_BACKEND = DESCRIPTABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Databound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DATABOUND = DESCRIPTABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__GROUP = DESCRIPTABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Handler Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__HANDLER_TYPE = DESCRIPTABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ICON = DESCRIPTABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MODES = DESCRIPTABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>New Instance Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NEW_INSTANCE_PREFIX = DESCRIPTABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Property Sheet Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROPERTY_SHEET_PATH = DESCRIPTABLE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = DESCRIPTABLE_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___ECLASS = DESCRIPTABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___EIS_PROXY = DESCRIPTABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___ERESOURCE = DESCRIPTABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___ECONTAINER = DESCRIPTABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___ECONTAINING_FEATURE = DESCRIPTABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___ECONTAINMENT_FEATURE = DESCRIPTABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___ECONTENTS = DESCRIPTABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___EALL_CONTENTS = DESCRIPTABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___ECROSS_REFERENCES = DESCRIPTABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___EGET__ESTRUCTURALFEATURE = DESCRIPTABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = DESCRIPTABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___ESET__ESTRUCTURALFEATURE_OBJECT = DESCRIPTABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___EIS_SET__ESTRUCTURALFEATURE = DESCRIPTABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___EUNSET__ESTRUCTURALFEATURE = DESCRIPTABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___EINVOKE__EOPERATION_ELIST = DESCRIPTABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = DESCRIPTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.impl.DocumentRoot <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.impl.DocumentRoot
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Sdk Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SDK_EXTENSION = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.impl.Extension <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.impl.Extension
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getExtension()
	 * @generated
	 */
	int EXTENSION = 3;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__LICENSE = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Eula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__EULA = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ID = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__TITLE = 5;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VENDOR = 6;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VERSION = 7;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.impl.Group <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.impl.Group
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getGroup()
	 * @generated
	 */
	int GROUP = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID = DESCRIPTABLE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TITLE = DESCRIPTABLE__TITLE;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TOOLTIP = DESCRIPTABLE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__VISIBLE = DESCRIPTABLE__VISIBLE;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = DESCRIPTABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___ECLASS = DESCRIPTABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___EIS_PROXY = DESCRIPTABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___ERESOURCE = DESCRIPTABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___ECONTAINER = DESCRIPTABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___ECONTAINING_FEATURE = DESCRIPTABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___ECONTAINMENT_FEATURE = DESCRIPTABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___ECONTENTS = DESCRIPTABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___EALL_CONTENTS = DESCRIPTABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___ECROSS_REFERENCES = DESCRIPTABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___EGET__ESTRUCTURALFEATURE = DESCRIPTABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___EGET__ESTRUCTURALFEATURE_BOOLEAN = DESCRIPTABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___ESET__ESTRUCTURALFEATURE_OBJECT = DESCRIPTABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___EIS_SET__ESTRUCTURALFEATURE = DESCRIPTABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___EUNSET__ESTRUCTURALFEATURE = DESCRIPTABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___EINVOKE__EOPERATION_ELIST = DESCRIPTABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = DESCRIPTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.impl.Initialization <em>Initialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.impl.Initialization
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getInitialization()
	 * @generated
	 */
	int INITIALIZATION = 5;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION__DEFAULT_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Initialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Initialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.impl.Option <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.impl.Option
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getOption()
	 * @generated
	 */
	int OPTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.impl.PossibleValueType <em>Possible Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.impl.PossibleValueType
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getPossibleValueType()
	 * @generated
	 */
	int POSSIBLE_VALUE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_VALUE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_VALUE_TYPE__TITLE = 1;

	/**
	 * The number of structural features of the '<em>Possible Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Possible Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.impl.Property <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.impl.Property
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getProperty()
	 * @generated
	 */
	int PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ID = DESCRIPTABLE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TITLE = DESCRIPTABLE__TITLE;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TOOLTIP = DESCRIPTABLE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VISIBLE = DESCRIPTABLE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PROPERTY = DESCRIPTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Possible Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__POSSIBLE_VALUE = DESCRIPTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OPTION = DESCRIPTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bindable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__BINDABLE = DESCRIPTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__GROUP = DESCRIPTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__MODES = DESCRIPTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Renderable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__RENDERABLE = DESCRIPTABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TRANSIENT = DESCRIPTABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = DESCRIPTABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = DESCRIPTABLE_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___ECLASS = DESCRIPTABLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___EIS_PROXY = DESCRIPTABLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___ERESOURCE = DESCRIPTABLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___ECONTAINER = DESCRIPTABLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___ECONTAINING_FEATURE = DESCRIPTABLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___ECONTAINMENT_FEATURE = DESCRIPTABLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___ECONTENTS = DESCRIPTABLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___EALL_CONTENTS = DESCRIPTABLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___ECROSS_REFERENCES = DESCRIPTABLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___EGET__ESTRUCTURALFEATURE = DESCRIPTABLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___EGET__ESTRUCTURALFEATURE_BOOLEAN = DESCRIPTABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___ESET__ESTRUCTURALFEATURE_OBJECT = DESCRIPTABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___EIS_SET__ESTRUCTURALFEATURE = DESCRIPTABLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___EUNSET__ESTRUCTURALFEATURE = DESCRIPTABLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___EINVOKE__EOPERATION_ELIST = DESCRIPTABLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = DESCRIPTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.impl.PropertyValue <em>Property Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.impl.PropertyValue
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getPropertyValue()
	 * @generated
	 */
	int PROPERTY_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE__PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.impl.RequireJSType <em>Require JS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.impl.RequireJSType
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getRequireJSType()
	 * @generated
	 */
	int REQUIRE_JS_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_JS_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_JS_TYPE__MODES = 1;

	/**
	 * The number of structural features of the '<em>Require JS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_JS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Require JS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_JS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.impl.StdInclude <em>Std Include</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.impl.StdInclude
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getStdInclude()
	 * @generated
	 */
	int STD_INCLUDE = 11;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_INCLUDE__KIND = 0;

	/**
	 * The number of structural features of the '<em>Std Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_INCLUDE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Std Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_INCLUDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.BackendSystemType <em>Backend System Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.BackendSystemType
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getBackendSystemType()
	 * @generated
	 */
	int BACKEND_SYSTEM_TYPE = 12;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.HandlerTypes <em>Handler Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.HandlerTypes
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getHandlerTypes()
	 * @generated
	 */
	int HANDLER_TYPES = 13;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.KindType <em>Kind Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.KindType
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getKindType()
	 * @generated
	 */
	int KIND_TYPE = 14;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.PropertyType <em>Property Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.PropertyType
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 15;

	/**
	 * The meta object id for the '{@link com.armin.sap.ds.builder.models.core.UI5Mode <em>UI5 Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.UI5Mode
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getUI5Mode()
	 * @generated
	 */
	int UI5_MODE = 16;

	/**
	 * The meta object id for the '<em>Backend System Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.BackendSystemType
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getBackendSystemTypeObject()
	 * @generated
	 */
	int BACKEND_SYSTEM_TYPE_OBJECT = 17;

	/**
	 * The meta object id for the '<em>Handler Types Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.HandlerTypes
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getHandlerTypesObject()
	 * @generated
	 */
	int HANDLER_TYPES_OBJECT = 18;

	/**
	 * The meta object id for the '<em>Id Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getIdType()
	 * @generated
	 */
	int ID_TYPE = 19;

	/**
	 * The meta object id for the '<em>Id Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getIdType1()
	 * @generated
	 */
	int ID_TYPE1 = 20;

	/**
	 * The meta object id for the '<em>Kind Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.KindType
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getKindTypeObject()
	 * @generated
	 */
	int KIND_TYPE_OBJECT = 21;

	/**
	 * The meta object id for the '<em>Property Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.PropertyType
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getPropertyTypeObject()
	 * @generated
	 */
	int PROPERTY_TYPE_OBJECT = 22;

	/**
	 * The meta object id for the '<em>UI5 Mode Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.armin.sap.ds.builder.models.core.UI5Mode
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getUI5ModeObject()
	 * @generated
	 */
	int UI5_MODE_OBJECT = 23;

	/**
	 * The meta object id for the '<em>UI5 Modes</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getUI5Modes()
	 * @generated
	 */
	int UI5_MODES = 24;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 25;


	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.core.IComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IComponent
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link com.armin.sap.ds.builder.models.core.IComponent#getRequireJs <em>Require Js</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Require Js</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IComponent#getRequireJs()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_RequireJs();

	/**
	 * Returns the meta object for the containment reference list '{@link com.armin.sap.ds.builder.models.core.IComponent#getStdInclude <em>Std Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Std Include</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IComponent#getStdInclude()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_StdInclude();

	/**
	 * Returns the meta object for the attribute list '{@link com.armin.sap.ds.builder.models.core.IComponent#getJsInclude <em>Js Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Js Include</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IComponent#getJsInclude()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_JsInclude();

	/**
	 * Returns the meta object for the attribute list '{@link com.armin.sap.ds.builder.models.core.IComponent#getCssInclude <em>Css Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Css Include</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IComponent#getCssInclude()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_CssInclude();

	/**
	 * Returns the meta object for the containment reference list '{@link com.armin.sap.ds.builder.models.core.IComponent#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IComponent#getProperty()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Property();

	/**
	 * Returns the meta object for the containment reference '{@link com.armin.sap.ds.builder.models.core.IComponent#getInitialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initialization</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IComponent#getInitialization()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Initialization();

	/**
	 * Returns the meta object for the attribute list '{@link com.armin.sap.ds.builder.models.core.IComponent#getSupportedBackend <em>Supported Backend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Backend</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IComponent#getSupportedBackend()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_SupportedBackend();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IComponent#isDatabound <em>Databound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Databound</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IComponent#isDatabound()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Databound();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IComponent#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IComponent#getGroup()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Group();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IComponent#getHandlerType <em>Handler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handler Type</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IComponent#getHandlerType()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_HandlerType();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IComponent#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IComponent#getIcon()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Icon();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IComponent#getModes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modes</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IComponent#getModes()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Modes();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IComponent#getNewInstancePrefix <em>New Instance Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Instance Prefix</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IComponent#getNewInstancePrefix()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_NewInstancePrefix();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IComponent#getPropertySheetPath <em>Property Sheet Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Sheet Path</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IComponent#getPropertySheetPath()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_PropertySheetPath();

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.core.IDescriptable <em>Descriptable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptable</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IDescriptable
	 * @generated
	 */
	EClass getDescriptable();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IDescriptable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IDescriptable#getId()
	 * @see #getDescriptable()
	 * @generated
	 */
	EAttribute getDescriptable_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IDescriptable#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IDescriptable#getTitle()
	 * @see #getDescriptable()
	 * @generated
	 */
	EAttribute getDescriptable_Title();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IDescriptable#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IDescriptable#getTooltip()
	 * @see #getDescriptable()
	 * @generated
	 */
	EAttribute getDescriptable_Tooltip();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IDescriptable#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IDescriptable#isVisible()
	 * @see #getDescriptable()
	 * @generated
	 */
	EAttribute getDescriptable_Visible();

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.core.IDocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IDocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.armin.sap.ds.builder.models.core.IDocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IDocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.armin.sap.ds.builder.models.core.IDocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IDocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.armin.sap.ds.builder.models.core.IDocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IDocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.armin.sap.ds.builder.models.core.IDocumentRoot#getSdkExtension <em>Sdk Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sdk Extension</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IDocumentRoot#getSdkExtension()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SdkExtension();

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.core.IExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IExtension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IExtension#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IExtension#getLicense()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_License();

	/**
	 * Returns the meta object for the containment reference list '{@link com.armin.sap.ds.builder.models.core.IExtension#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IExtension#getGroup()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.armin.sap.ds.builder.models.core.IExtension#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IExtension#getComponent()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Component();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IExtension#getEula <em>Eula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eula</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IExtension#getEula()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Eula();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IExtension#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IExtension#getId()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IExtension#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IExtension#getTitle()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Title();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IExtension#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IExtension#getVendor()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IExtension#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IExtension#getVersion()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Version();

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.core.IGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IGroup
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.core.IInitialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initialization</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IInitialization
	 * @generated
	 */
	EClass getInitialization();

	/**
	 * Returns the meta object for the containment reference list '{@link com.armin.sap.ds.builder.models.core.IInitialization#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Default Value</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IInitialization#getDefaultValue()
	 * @see #getInitialization()
	 * @generated
	 */
	EReference getInitialization_DefaultValue();

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.core.IOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IOption
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IOption#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IOption#getName()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IOption#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IOption#getValue()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Value();

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.core.IPossibleValueType <em>Possible Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Possible Value Type</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IPossibleValueType
	 * @generated
	 */
	EClass getPossibleValueType();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IPossibleValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IPossibleValueType#getValue()
	 * @see #getPossibleValueType()
	 * @generated
	 */
	EAttribute getPossibleValueType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IPossibleValueType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IPossibleValueType#getTitle()
	 * @see #getPossibleValueType()
	 * @generated
	 */
	EAttribute getPossibleValueType_Title();

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.core.IProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IProperty
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link com.armin.sap.ds.builder.models.core.IProperty#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IProperty#getProperty()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link com.armin.sap.ds.builder.models.core.IProperty#getPossibleValue <em>Possible Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Possible Value</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IProperty#getPossibleValue()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_PossibleValue();

	/**
	 * Returns the meta object for the containment reference list '{@link com.armin.sap.ds.builder.models.core.IProperty#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IProperty#getOption()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Option();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IProperty#isBindable <em>Bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bindable</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IProperty#isBindable()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Bindable();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IProperty#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IProperty#getGroup()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Group();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IProperty#getModes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modes</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IProperty#getModes()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Modes();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IProperty#isRenderable <em>Renderable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Renderable</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IProperty#isRenderable()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Renderable();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IProperty#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IProperty#isTransient()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Transient();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IProperty#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.core.IPropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Value</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IPropertyValue
	 * @generated
	 */
	EClass getPropertyValue();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IPropertyValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IPropertyValue#getValue()
	 * @see #getPropertyValue()
	 * @generated
	 */
	EAttribute getPropertyValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IPropertyValue#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IPropertyValue#getProperty()
	 * @see #getPropertyValue()
	 * @generated
	 */
	EAttribute getPropertyValue_Property();

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.core.IRequireJSType <em>Require JS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Require JS Type</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IRequireJSType
	 * @generated
	 */
	EClass getRequireJSType();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IRequireJSType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IRequireJSType#getValue()
	 * @see #getRequireJSType()
	 * @generated
	 */
	EAttribute getRequireJSType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IRequireJSType#getModes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modes</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IRequireJSType#getModes()
	 * @see #getRequireJSType()
	 * @generated
	 */
	EAttribute getRequireJSType_Modes();

	/**
	 * Returns the meta object for class '{@link com.armin.sap.ds.builder.models.core.IStdInclude <em>Std Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Std Include</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IStdInclude
	 * @generated
	 */
	EClass getStdInclude();

	/**
	 * Returns the meta object for the attribute '{@link com.armin.sap.ds.builder.models.core.IStdInclude#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see com.armin.sap.ds.builder.models.core.IStdInclude#getKind()
	 * @see #getStdInclude()
	 * @generated
	 */
	EAttribute getStdInclude_Kind();

	/**
	 * Returns the meta object for enum '{@link com.armin.sap.ds.builder.models.core.BackendSystemType <em>Backend System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Backend System Type</em>'.
	 * @see com.armin.sap.ds.builder.models.core.BackendSystemType
	 * @generated
	 */
	EEnum getBackendSystemType();

	/**
	 * Returns the meta object for enum '{@link com.armin.sap.ds.builder.models.core.HandlerTypes <em>Handler Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Handler Types</em>'.
	 * @see com.armin.sap.ds.builder.models.core.HandlerTypes
	 * @generated
	 */
	EEnum getHandlerTypes();

	/**
	 * Returns the meta object for enum '{@link com.armin.sap.ds.builder.models.core.KindType <em>Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kind Type</em>'.
	 * @see com.armin.sap.ds.builder.models.core.KindType
	 * @generated
	 */
	EEnum getKindType();

	/**
	 * Returns the meta object for enum '{@link com.armin.sap.ds.builder.models.core.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Type</em>'.
	 * @see com.armin.sap.ds.builder.models.core.PropertyType
	 * @generated
	 */
	EEnum getPropertyType();

	/**
	 * Returns the meta object for enum '{@link com.armin.sap.ds.builder.models.core.UI5Mode <em>UI5 Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>UI5 Mode</em>'.
	 * @see com.armin.sap.ds.builder.models.core.UI5Mode
	 * @generated
	 */
	EEnum getUI5Mode();

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
	EDataType getBackendSystemTypeObject();

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
	EDataType getHandlerTypesObject();

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
	EDataType getIdType();

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
	EDataType getIdType1();

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
	EDataType getKindTypeObject();

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
	EDataType getPropertyTypeObject();

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
	EDataType getUI5ModeObject();

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
	EDataType getUI5Modes();

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
	EDataType getVersionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ICoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.impl.Component <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.impl.Component
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Require Js</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__REQUIRE_JS = eINSTANCE.getComponent_RequireJs();

		/**
		 * The meta object literal for the '<em><b>Std Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__STD_INCLUDE = eINSTANCE.getComponent_StdInclude();

		/**
		 * The meta object literal for the '<em><b>Js Include</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__JS_INCLUDE = eINSTANCE.getComponent_JsInclude();

		/**
		 * The meta object literal for the '<em><b>Css Include</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__CSS_INCLUDE = eINSTANCE.getComponent_CssInclude();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PROPERTY = eINSTANCE.getComponent_Property();

		/**
		 * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__INITIALIZATION = eINSTANCE.getComponent_Initialization();

		/**
		 * The meta object literal for the '<em><b>Supported Backend</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__SUPPORTED_BACKEND = eINSTANCE.getComponent_SupportedBackend();

		/**
		 * The meta object literal for the '<em><b>Databound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__DATABOUND = eINSTANCE.getComponent_Databound();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__GROUP = eINSTANCE.getComponent_Group();

		/**
		 * The meta object literal for the '<em><b>Handler Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__HANDLER_TYPE = eINSTANCE.getComponent_HandlerType();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__ICON = eINSTANCE.getComponent_Icon();

		/**
		 * The meta object literal for the '<em><b>Modes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__MODES = eINSTANCE.getComponent_Modes();

		/**
		 * The meta object literal for the '<em><b>New Instance Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NEW_INSTANCE_PREFIX = eINSTANCE.getComponent_NewInstancePrefix();

		/**
		 * The meta object literal for the '<em><b>Property Sheet Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__PROPERTY_SHEET_PATH = eINSTANCE.getComponent_PropertySheetPath();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.impl.Descriptable <em>Descriptable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.impl.Descriptable
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getDescriptable()
		 * @generated
		 */
		EClass DESCRIPTABLE = eINSTANCE.getDescriptable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTABLE__ID = eINSTANCE.getDescriptable_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTABLE__TITLE = eINSTANCE.getDescriptable_Title();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTABLE__TOOLTIP = eINSTANCE.getDescriptable_Tooltip();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTABLE__VISIBLE = eINSTANCE.getDescriptable_Visible();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.impl.DocumentRoot <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.impl.DocumentRoot
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Sdk Extension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SDK_EXTENSION = eINSTANCE.getDocumentRoot_SdkExtension();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.impl.Extension <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.impl.Extension
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__LICENSE = eINSTANCE.getExtension_License();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__GROUP = eINSTANCE.getExtension_Group();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__COMPONENT = eINSTANCE.getExtension_Component();

		/**
		 * The meta object literal for the '<em><b>Eula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__EULA = eINSTANCE.getExtension_Eula();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__ID = eINSTANCE.getExtension_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__TITLE = eINSTANCE.getExtension_Title();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__VENDOR = eINSTANCE.getExtension_Vendor();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__VERSION = eINSTANCE.getExtension_Version();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.impl.Group <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.impl.Group
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.impl.Initialization <em>Initialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.impl.Initialization
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getInitialization()
		 * @generated
		 */
		EClass INITIALIZATION = eINSTANCE.getInitialization();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIALIZATION__DEFAULT_VALUE = eINSTANCE.getInitialization_DefaultValue();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.impl.Option <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.impl.Option
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__NAME = eINSTANCE.getOption_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__VALUE = eINSTANCE.getOption_Value();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.impl.PossibleValueType <em>Possible Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.impl.PossibleValueType
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getPossibleValueType()
		 * @generated
		 */
		EClass POSSIBLE_VALUE_TYPE = eINSTANCE.getPossibleValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSSIBLE_VALUE_TYPE__VALUE = eINSTANCE.getPossibleValueType_Value();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSSIBLE_VALUE_TYPE__TITLE = eINSTANCE.getPossibleValueType_Title();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.impl.Property <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.impl.Property
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__PROPERTY = eINSTANCE.getProperty_Property();

		/**
		 * The meta object literal for the '<em><b>Possible Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__POSSIBLE_VALUE = eINSTANCE.getProperty_PossibleValue();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__OPTION = eINSTANCE.getProperty_Option();

		/**
		 * The meta object literal for the '<em><b>Bindable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__BINDABLE = eINSTANCE.getProperty_Bindable();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__GROUP = eINSTANCE.getProperty_Group();

		/**
		 * The meta object literal for the '<em><b>Modes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__MODES = eINSTANCE.getProperty_Modes();

		/**
		 * The meta object literal for the '<em><b>Renderable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__RENDERABLE = eINSTANCE.getProperty_Renderable();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TRANSIENT = eINSTANCE.getProperty_Transient();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.impl.PropertyValue <em>Property Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.impl.PropertyValue
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getPropertyValue()
		 * @generated
		 */
		EClass PROPERTY_VALUE = eINSTANCE.getPropertyValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_VALUE__VALUE = eINSTANCE.getPropertyValue_Value();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_VALUE__PROPERTY = eINSTANCE.getPropertyValue_Property();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.impl.RequireJSType <em>Require JS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.impl.RequireJSType
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getRequireJSType()
		 * @generated
		 */
		EClass REQUIRE_JS_TYPE = eINSTANCE.getRequireJSType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRE_JS_TYPE__VALUE = eINSTANCE.getRequireJSType_Value();

		/**
		 * The meta object literal for the '<em><b>Modes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRE_JS_TYPE__MODES = eINSTANCE.getRequireJSType_Modes();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.impl.StdInclude <em>Std Include</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.impl.StdInclude
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getStdInclude()
		 * @generated
		 */
		EClass STD_INCLUDE = eINSTANCE.getStdInclude();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STD_INCLUDE__KIND = eINSTANCE.getStdInclude_Kind();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.BackendSystemType <em>Backend System Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.BackendSystemType
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getBackendSystemType()
		 * @generated
		 */
		EEnum BACKEND_SYSTEM_TYPE = eINSTANCE.getBackendSystemType();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.HandlerTypes <em>Handler Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.HandlerTypes
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getHandlerTypes()
		 * @generated
		 */
		EEnum HANDLER_TYPES = eINSTANCE.getHandlerTypes();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.KindType <em>Kind Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.KindType
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getKindType()
		 * @generated
		 */
		EEnum KIND_TYPE = eINSTANCE.getKindType();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.PropertyType <em>Property Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.PropertyType
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getPropertyType()
		 * @generated
		 */
		EEnum PROPERTY_TYPE = eINSTANCE.getPropertyType();

		/**
		 * The meta object literal for the '{@link com.armin.sap.ds.builder.models.core.UI5Mode <em>UI5 Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.UI5Mode
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getUI5Mode()
		 * @generated
		 */
		EEnum UI5_MODE = eINSTANCE.getUI5Mode();

		/**
		 * The meta object literal for the '<em>Backend System Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.BackendSystemType
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getBackendSystemTypeObject()
		 * @generated
		 */
		EDataType BACKEND_SYSTEM_TYPE_OBJECT = eINSTANCE.getBackendSystemTypeObject();

		/**
		 * The meta object literal for the '<em>Handler Types Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.HandlerTypes
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getHandlerTypesObject()
		 * @generated
		 */
		EDataType HANDLER_TYPES_OBJECT = eINSTANCE.getHandlerTypesObject();

		/**
		 * The meta object literal for the '<em>Id Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getIdType()
		 * @generated
		 */
		EDataType ID_TYPE = eINSTANCE.getIdType();

		/**
		 * The meta object literal for the '<em>Id Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getIdType1()
		 * @generated
		 */
		EDataType ID_TYPE1 = eINSTANCE.getIdType1();

		/**
		 * The meta object literal for the '<em>Kind Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.KindType
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getKindTypeObject()
		 * @generated
		 */
		EDataType KIND_TYPE_OBJECT = eINSTANCE.getKindTypeObject();

		/**
		 * The meta object literal for the '<em>Property Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.PropertyType
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getPropertyTypeObject()
		 * @generated
		 */
		EDataType PROPERTY_TYPE_OBJECT = eINSTANCE.getPropertyTypeObject();

		/**
		 * The meta object literal for the '<em>UI5 Mode Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.armin.sap.ds.builder.models.core.UI5Mode
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getUI5ModeObject()
		 * @generated
		 */
		EDataType UI5_MODE_OBJECT = eINSTANCE.getUI5ModeObject();

		/**
		 * The meta object literal for the '<em>UI5 Modes</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getUI5Modes()
		 * @generated
		 */
		EDataType UI5_MODES = eINSTANCE.getUI5Modes();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.armin.sap.ds.builder.models.core.impl.CorePackage#getVersionType()
		 * @generated
		 */
		EDataType VERSION_TYPE = eINSTANCE.getVersionType();

	}

} //ICorePackage
