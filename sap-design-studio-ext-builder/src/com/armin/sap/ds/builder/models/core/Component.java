/**
 */
package com.armin.sap.ds.builder.models.core;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies an extension component.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Component#getRequireJs <em>Require Js</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Component#getStdInclude <em>Std Include</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Component#getJsInclude <em>Js Include</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Component#getCssInclude <em>Css Include</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Component#getProperty <em>Property</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Component#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Component#getSupportedBackend <em>Supported Backend</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Component#isDatabound <em>Databound</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Component#getGroup <em>Group</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Component#getHandlerType <em>Handler Type</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Component#getIcon <em>Icon</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Component#getModes <em>Modes</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Component#getNewInstancePrefix <em>New Instance Prefix</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Component#getPropertySheetPath <em>Property Sheet Path</em>}</li>
 * </ul>
 *
 * @see com.armin.sap.ds.builder.models.core.CorePackage#getComponent()
 * @model kind="class"
 *        extendedMetaData="name='Component' kind='elementOnly'"
 * @generated
 */
public class Component extends Descriptable {
	/**
	 * The cached value of the '{@link #getRequireJs() <em>Require Js</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireJs()
	 * @generated
	 * @ordered
	 */
	protected EList<RequireJSType> requireJs;

	/**
	 * The cached value of the '{@link #getStdInclude() <em>Std Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<StdInclude> stdInclude;

	/**
	 * The cached value of the '{@link #getJsInclude() <em>Js Include</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<String> jsInclude;

	/**
	 * The cached value of the '{@link #getCssInclude() <em>Css Include</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCssInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<String> cssInclude;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> property;

	/**
	 * The cached value of the '{@link #getInitialization() <em>Initialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialization()
	 * @generated
	 * @ordered
	 */
	protected Initialization initialization;

	/**
	 * The cached value of the '{@link #getSupportedBackend() <em>Supported Backend</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedBackend()
	 * @generated
	 * @ordered
	 */
	protected EList<BackendSystemType> supportedBackend;

	/**
	 * The default value of the '{@link #isDatabound() <em>Databound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDatabound()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DATABOUND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDatabound() <em>Databound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDatabound()
	 * @generated
	 * @ordered
	 */
	protected boolean databound = DATABOUND_EDEFAULT;

	/**
	 * This is true if the Databound attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean databoundESet;

	/**
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandlerType() <em>Handler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerType()
	 * @generated
	 * @ordered
	 */
	protected static final HandlerTypes HANDLER_TYPE_EDEFAULT = HandlerTypes.DIV;

	/**
	 * The cached value of the '{@link #getHandlerType() <em>Handler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerType()
	 * @generated
	 * @ordered
	 */
	protected HandlerTypes handlerType = HANDLER_TYPE_EDEFAULT;

	/**
	 * This is true if the Handler Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean handlerTypeESet;

	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

	/**
	 * The default value of the '{@link #getModes() <em>Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModes()
	 * @generated
	 * @ordered
	 */
	@SuppressWarnings("unchecked")
	protected static final List<UI5Mode> MODES_EDEFAULT = (List<UI5Mode>)CoreFactory.eINSTANCE.createFromString(CorePackage.eINSTANCE.getUI5Modes(), "commons");

	/**
	 * The cached value of the '{@link #getModes() <em>Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModes()
	 * @generated
	 * @ordered
	 */
	protected List<UI5Mode> modes = MODES_EDEFAULT;

	/**
	 * This is true if the Modes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modesESet;

	/**
	 * The default value of the '{@link #getNewInstancePrefix() <em>New Instance Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewInstancePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_INSTANCE_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewInstancePrefix() <em>New Instance Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewInstancePrefix()
	 * @generated
	 * @ordered
	 */
	protected String newInstancePrefix = NEW_INSTANCE_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertySheetPath() <em>Property Sheet Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertySheetPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_SHEET_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertySheetPath() <em>Property Sheet Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertySheetPath()
	 * @generated
	 * @ordered
	 */
	protected String propertySheetPath = PROPERTY_SHEET_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Component() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.COMPONENT;
	}

	/**
	 * Returns the value of the '<em><b>Require Js</b></em>' containment reference list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.core.RequireJSType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Js</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Js</em>' containment reference list.
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getComponent_RequireJs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requireJs' namespace='##targetNamespace'"
	 * @generated
	 */
	public EList<RequireJSType> getRequireJs() {
		if (requireJs == null) {
			requireJs = new EObjectContainmentEList<RequireJSType>(RequireJSType.class, this, CorePackage.COMPONENT__REQUIRE_JS);
		}
		return requireJs;
	}

	/**
	 * Returns the value of the '<em><b>Std Include</b></em>' containment reference list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.core.StdInclude}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Includes a JavaScript framework.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Std Include</em>' containment reference list.
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getComponent_StdInclude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stdInclude' namespace='##targetNamespace'"
	 * @generated
	 */
	public EList<StdInclude> getStdInclude() {
		if (stdInclude == null) {
			stdInclude = new EObjectContainmentEList<StdInclude>(StdInclude.class, this, CorePackage.COMPONENT__STD_INCLUDE);
		}
		return stdInclude;
	}

	/**
	 * Returns the value of the '<em><b>Js Include</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 References a JavaScript file to include with this extension component. It is either
	 *                 a relative path to the root folder of the SDK extension or a fully qualified URL.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Js Include</em>' attribute list.
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getComponent_JsInclude()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='jsInclude' namespace='##targetNamespace'"
	 * @generated
	 */
	public EList<String> getJsInclude() {
		if (jsInclude == null) {
			jsInclude = new EDataTypeEList<String>(String.class, this, CorePackage.COMPONENT__JS_INCLUDE);
		}
		return jsInclude;
	}

	/**
	 * Returns the value of the '<em><b>Css Include</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 References a CSS file to include with this extension component. It is either a
	 *                 relative path to the root folder of the SDK extension or a fully qualified URL.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Css Include</em>' attribute list.
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getComponent_CssInclude()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='cssInclude' namespace='##targetNamespace'"
	 * @generated
	 */
	public EList<String> getCssInclude() {
		if (cssInclude == null) {
			cssInclude = new EDataTypeEList<String>(String.class, this, CorePackage.COMPONENT__CSS_INCLUDE);
		}
		return cssInclude;
	}

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.core.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Property of the extension component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getComponent_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<Property>(Property.class, this, CorePackage.COMPONENT__PROPERTY);
		}
		return property;
	}

	/**
	 * Returns the value of the '<em><b>Initialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initialization values of properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initialization</em>' containment reference.
	 * @see #setInitialization(Initialization)
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getComponent_Initialization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initialization' namespace='##targetNamespace'"
	 * @generated
	 */
	public Initialization getInitialization() {
		return initialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialization(Initialization newInitialization, NotificationChain msgs) {
		Initialization oldInitialization = initialization;
		initialization = newInitialization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.COMPONENT__INITIALIZATION, oldInitialization, newInitialization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.Component#getInitialization <em>Initialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialization</em>' containment reference.
	 * @see #getInitialization()
	 * @generated
	 */
	public void setInitialization(Initialization newInitialization) {
		if (newInitialization != initialization) {
			NotificationChain msgs = null;
			if (initialization != null)
				msgs = ((InternalEObject)initialization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.COMPONENT__INITIALIZATION, null, msgs);
			if (newInitialization != null)
				msgs = ((InternalEObject)newInitialization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.COMPONENT__INITIALIZATION, null, msgs);
			msgs = basicSetInitialization(newInitialization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.COMPONENT__INITIALIZATION, newInitialization, newInitialization));
	}

	/**
	 * Returns the value of the '<em><b>Supported Backend</b></em>' attribute list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.core.BackendSystemType}.
	 * The literals are from the enumeration {@link com.armin.sap.ds.builder.models.core.BackendSystemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Platform which supports this custom component. Specify one of the following values:
	 *                 LOCAL, BIPLATFORM, HANA, or NETWEAVER. If this element is unspecified, then all
	 *                 platforms support this extension component.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Backend</em>' attribute list.
	 * @see com.armin.sap.ds.builder.models.core.BackendSystemType
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getComponent_SupportedBackend()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='supportedBackend' namespace='##targetNamespace'"
	 * @generated
	 */
	public EList<BackendSystemType> getSupportedBackend() {
		if (supportedBackend == null) {
			supportedBackend = new EDataTypeEList<BackendSystemType>(BackendSystemType.class, this, CorePackage.COMPONENT__SUPPORTED_BACKEND);
		}
		return supportedBackend;
	}

	/**
	 * Returns the value of the '<em><b>Databound</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Indicates if this extension component is data-bound (uses data sources).
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Databound</em>' attribute.
	 * @see #isSetDatabound()
	 * @see #unsetDatabound()
	 * @see #setDatabound(boolean)
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getComponent_Databound()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='databound'"
	 * @generated
	 */
	public boolean isDatabound() {
		return databound;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.Component#isDatabound <em>Databound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Databound</em>' attribute.
	 * @see #isSetDatabound()
	 * @see #unsetDatabound()
	 * @see #isDatabound()
	 * @generated
	 */
	public void setDatabound(boolean newDatabound) {
		boolean oldDatabound = databound;
		databound = newDatabound;
		boolean oldDataboundESet = databoundESet;
		databoundESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.COMPONENT__DATABOUND, oldDatabound, databound, !oldDataboundESet));
	}

	/**
	 * Unsets the value of the '{@link com.armin.sap.ds.builder.models.core.Component#isDatabound <em>Databound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDatabound()
	 * @see #isDatabound()
	 * @see #setDatabound(boolean)
	 * @generated
	 */
	public void unsetDatabound() {
		boolean oldDatabound = databound;
		boolean oldDataboundESet = databoundESet;
		databound = DATABOUND_EDEFAULT;
		databoundESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.COMPONENT__DATABOUND, oldDatabound, DATABOUND_EDEFAULT, oldDataboundESet));
	}

	/**
	 * Returns whether the value of the '{@link com.armin.sap.ds.builder.models.core.Component#isDatabound <em>Databound</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Databound</em>' attribute is set.
	 * @see #unsetDatabound()
	 * @see #isDatabound()
	 * @see #setDatabound(boolean)
	 * @generated
	 */
	public boolean isSetDatabound() {
		return databoundESet;
	}

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Group in the Design Studio's Components view where this extension component is
	 *               displayed. Specify a custom group you have defined in this SDK extension, otherwise
	 *               this extension component is placed in the default Custom Component group.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getComponent_Group()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='group'"
	 * @generated
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.Component#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.COMPONENT__GROUP, oldGroup, group));
	}

	/**
	 * Returns the value of the '<em><b>Handler Type</b></em>' attribute.
	 * The default value is <code>"div"</code>.
	 * The literals are from the enumeration {@link com.armin.sap.ds.builder.models.core.HandlerTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Specifies the technology that implements this extension component. Specify one of the
	 *               following values: div, sapui5, datasource (default: div).
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handler Type</em>' attribute.
	 * @see com.armin.sap.ds.builder.models.core.HandlerTypes
	 * @see #isSetHandlerType()
	 * @see #unsetHandlerType()
	 * @see #setHandlerType(HandlerTypes)
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getComponent_HandlerType()
	 * @model default="div" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='handlerType'"
	 * @generated
	 */
	public HandlerTypes getHandlerType() {
		return handlerType;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.Component#getHandlerType <em>Handler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler Type</em>' attribute.
	 * @see com.armin.sap.ds.builder.models.core.HandlerTypes
	 * @see #isSetHandlerType()
	 * @see #unsetHandlerType()
	 * @see #getHandlerType()
	 * @generated
	 */
	public void setHandlerType(HandlerTypes newHandlerType) {
		HandlerTypes oldHandlerType = handlerType;
		handlerType = newHandlerType == null ? HANDLER_TYPE_EDEFAULT : newHandlerType;
		boolean oldHandlerTypeESet = handlerTypeESet;
		handlerTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.COMPONENT__HANDLER_TYPE, oldHandlerType, handlerType, !oldHandlerTypeESet));
	}

	/**
	 * Unsets the value of the '{@link com.armin.sap.ds.builder.models.core.Component#getHandlerType <em>Handler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHandlerType()
	 * @see #getHandlerType()
	 * @see #setHandlerType(HandlerTypes)
	 * @generated
	 */
	public void unsetHandlerType() {
		HandlerTypes oldHandlerType = handlerType;
		boolean oldHandlerTypeESet = handlerTypeESet;
		handlerType = HANDLER_TYPE_EDEFAULT;
		handlerTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.COMPONENT__HANDLER_TYPE, oldHandlerType, HANDLER_TYPE_EDEFAULT, oldHandlerTypeESet));
	}

	/**
	 * Returns whether the value of the '{@link com.armin.sap.ds.builder.models.core.Component#getHandlerType <em>Handler Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Handler Type</em>' attribute is set.
	 * @see #unsetHandlerType()
	 * @see #getHandlerType()
	 * @see #setHandlerType(HandlerTypes)
	 * @generated
	 */
	public boolean isSetHandlerType() {
		return handlerTypeESet;
	}

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               References an icon displayed with this extension component in Design Studio's
	 *               Components and Outline views. The path is relative to the root folder of the SDK
	 *               extension.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getComponent_Icon()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='icon'"
	 * @generated
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.Component#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	public void setIcon(String newIcon) {
		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.COMPONENT__ICON, oldIcon, icon));
	}

	/**
	 * Returns the value of the '<em><b>Modes</b></em>' attribute.
	 * The default value is <code>"commons"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modes</em>' attribute.
	 * @see #isSetModes()
	 * @see #unsetModes()
	 * @see #setModes(List)
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getComponent_Modes()
	 * @model default="commons" unsettable="true" dataType="com.armin.sap.ds.builder.models.core.UI5Modes" many="false"
	 *        extendedMetaData="kind='attribute' name='modes'"
	 * @generated
	 */
	public List<UI5Mode> getModes() {
		return modes;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.Component#getModes <em>Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modes</em>' attribute.
	 * @see #isSetModes()
	 * @see #unsetModes()
	 * @see #getModes()
	 * @generated
	 */
	public void setModes(List<UI5Mode> newModes) {
		List<UI5Mode> oldModes = modes;
		modes = newModes;
		boolean oldModesESet = modesESet;
		modesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.COMPONENT__MODES, oldModes, modes, !oldModesESet));
	}

	/**
	 * Unsets the value of the '{@link com.armin.sap.ds.builder.models.core.Component#getModes <em>Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModes()
	 * @see #getModes()
	 * @see #setModes(List)
	 * @generated
	 */
	public void unsetModes() {
		List<UI5Mode> oldModes = modes;
		boolean oldModesESet = modesESet;
		modes = MODES_EDEFAULT;
		modesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.COMPONENT__MODES, oldModes, MODES_EDEFAULT, oldModesESet));
	}

	/**
	 * Returns whether the value of the '{@link com.armin.sap.ds.builder.models.core.Component#getModes <em>Modes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modes</em>' attribute is set.
	 * @see #unsetModes()
	 * @see #getModes()
	 * @see #setModes(List)
	 * @generated
	 */
	public boolean isSetModes() {
		return modesESet;
	}

	/**
	 * Returns the value of the '<em><b>New Instance Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Prefix of the name of a newly created instance of this extension component. If this
	 *               attribute is unspecified, then a default name of the form "extension component type
	 *               (upper-case) + integer counter" is used, for example COLOREDBOX_1.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>New Instance Prefix</em>' attribute.
	 * @see #setNewInstancePrefix(String)
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getComponent_NewInstancePrefix()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='newInstancePrefix'"
	 * @generated
	 */
	public String getNewInstancePrefix() {
		return newInstancePrefix;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.Component#getNewInstancePrefix <em>New Instance Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Instance Prefix</em>' attribute.
	 * @see #getNewInstancePrefix()
	 * @generated
	 */
	public void setNewInstancePrefix(String newNewInstancePrefix) {
		String oldNewInstancePrefix = newInstancePrefix;
		newInstancePrefix = newNewInstancePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.COMPONENT__NEW_INSTANCE_PREFIX, oldNewInstancePrefix, newInstancePrefix));
	}

	/**
	 * Returns the value of the '<em><b>Property Sheet Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               References the HTML file of the Additional Properties Sheet. This file must be located
	 *               in the "res" folder of the extension component.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property Sheet Path</em>' attribute.
	 * @see #setPropertySheetPath(String)
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getComponent_PropertySheetPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='propertySheetPath'"
	 * @generated
	 */
	public String getPropertySheetPath() {
		return propertySheetPath;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.Component#getPropertySheetPath <em>Property Sheet Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Sheet Path</em>' attribute.
	 * @see #getPropertySheetPath()
	 * @generated
	 */
	public void setPropertySheetPath(String newPropertySheetPath) {
		String oldPropertySheetPath = propertySheetPath;
		propertySheetPath = newPropertySheetPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.COMPONENT__PROPERTY_SHEET_PATH, oldPropertySheetPath, propertySheetPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.COMPONENT__REQUIRE_JS:
				return ((InternalEList<?>)getRequireJs()).basicRemove(otherEnd, msgs);
			case CorePackage.COMPONENT__STD_INCLUDE:
				return ((InternalEList<?>)getStdInclude()).basicRemove(otherEnd, msgs);
			case CorePackage.COMPONENT__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case CorePackage.COMPONENT__INITIALIZATION:
				return basicSetInitialization(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.COMPONENT__REQUIRE_JS:
				return getRequireJs();
			case CorePackage.COMPONENT__STD_INCLUDE:
				return getStdInclude();
			case CorePackage.COMPONENT__JS_INCLUDE:
				return getJsInclude();
			case CorePackage.COMPONENT__CSS_INCLUDE:
				return getCssInclude();
			case CorePackage.COMPONENT__PROPERTY:
				return getProperty();
			case CorePackage.COMPONENT__INITIALIZATION:
				return getInitialization();
			case CorePackage.COMPONENT__SUPPORTED_BACKEND:
				return getSupportedBackend();
			case CorePackage.COMPONENT__DATABOUND:
				return isDatabound();
			case CorePackage.COMPONENT__GROUP:
				return getGroup();
			case CorePackage.COMPONENT__HANDLER_TYPE:
				return getHandlerType();
			case CorePackage.COMPONENT__ICON:
				return getIcon();
			case CorePackage.COMPONENT__MODES:
				return getModes();
			case CorePackage.COMPONENT__NEW_INSTANCE_PREFIX:
				return getNewInstancePrefix();
			case CorePackage.COMPONENT__PROPERTY_SHEET_PATH:
				return getPropertySheetPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.COMPONENT__REQUIRE_JS:
				getRequireJs().clear();
				getRequireJs().addAll((Collection<? extends RequireJSType>)newValue);
				return;
			case CorePackage.COMPONENT__STD_INCLUDE:
				getStdInclude().clear();
				getStdInclude().addAll((Collection<? extends StdInclude>)newValue);
				return;
			case CorePackage.COMPONENT__JS_INCLUDE:
				getJsInclude().clear();
				getJsInclude().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.COMPONENT__CSS_INCLUDE:
				getCssInclude().clear();
				getCssInclude().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.COMPONENT__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case CorePackage.COMPONENT__INITIALIZATION:
				setInitialization((Initialization)newValue);
				return;
			case CorePackage.COMPONENT__SUPPORTED_BACKEND:
				getSupportedBackend().clear();
				getSupportedBackend().addAll((Collection<? extends BackendSystemType>)newValue);
				return;
			case CorePackage.COMPONENT__DATABOUND:
				setDatabound((Boolean)newValue);
				return;
			case CorePackage.COMPONENT__GROUP:
				setGroup((String)newValue);
				return;
			case CorePackage.COMPONENT__HANDLER_TYPE:
				setHandlerType((HandlerTypes)newValue);
				return;
			case CorePackage.COMPONENT__ICON:
				setIcon((String)newValue);
				return;
			case CorePackage.COMPONENT__MODES:
				setModes((List<UI5Mode>)newValue);
				return;
			case CorePackage.COMPONENT__NEW_INSTANCE_PREFIX:
				setNewInstancePrefix((String)newValue);
				return;
			case CorePackage.COMPONENT__PROPERTY_SHEET_PATH:
				setPropertySheetPath((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.COMPONENT__REQUIRE_JS:
				getRequireJs().clear();
				return;
			case CorePackage.COMPONENT__STD_INCLUDE:
				getStdInclude().clear();
				return;
			case CorePackage.COMPONENT__JS_INCLUDE:
				getJsInclude().clear();
				return;
			case CorePackage.COMPONENT__CSS_INCLUDE:
				getCssInclude().clear();
				return;
			case CorePackage.COMPONENT__PROPERTY:
				getProperty().clear();
				return;
			case CorePackage.COMPONENT__INITIALIZATION:
				setInitialization((Initialization)null);
				return;
			case CorePackage.COMPONENT__SUPPORTED_BACKEND:
				getSupportedBackend().clear();
				return;
			case CorePackage.COMPONENT__DATABOUND:
				unsetDatabound();
				return;
			case CorePackage.COMPONENT__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case CorePackage.COMPONENT__HANDLER_TYPE:
				unsetHandlerType();
				return;
			case CorePackage.COMPONENT__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case CorePackage.COMPONENT__MODES:
				unsetModes();
				return;
			case CorePackage.COMPONENT__NEW_INSTANCE_PREFIX:
				setNewInstancePrefix(NEW_INSTANCE_PREFIX_EDEFAULT);
				return;
			case CorePackage.COMPONENT__PROPERTY_SHEET_PATH:
				setPropertySheetPath(PROPERTY_SHEET_PATH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.COMPONENT__REQUIRE_JS:
				return requireJs != null && !requireJs.isEmpty();
			case CorePackage.COMPONENT__STD_INCLUDE:
				return stdInclude != null && !stdInclude.isEmpty();
			case CorePackage.COMPONENT__JS_INCLUDE:
				return jsInclude != null && !jsInclude.isEmpty();
			case CorePackage.COMPONENT__CSS_INCLUDE:
				return cssInclude != null && !cssInclude.isEmpty();
			case CorePackage.COMPONENT__PROPERTY:
				return property != null && !property.isEmpty();
			case CorePackage.COMPONENT__INITIALIZATION:
				return initialization != null;
			case CorePackage.COMPONENT__SUPPORTED_BACKEND:
				return supportedBackend != null && !supportedBackend.isEmpty();
			case CorePackage.COMPONENT__DATABOUND:
				return isSetDatabound();
			case CorePackage.COMPONENT__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
			case CorePackage.COMPONENT__HANDLER_TYPE:
				return isSetHandlerType();
			case CorePackage.COMPONENT__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case CorePackage.COMPONENT__MODES:
				return isSetModes();
			case CorePackage.COMPONENT__NEW_INSTANCE_PREFIX:
				return NEW_INSTANCE_PREFIX_EDEFAULT == null ? newInstancePrefix != null : !NEW_INSTANCE_PREFIX_EDEFAULT.equals(newInstancePrefix);
			case CorePackage.COMPONENT__PROPERTY_SHEET_PATH:
				return PROPERTY_SHEET_PATH_EDEFAULT == null ? propertySheetPath != null : !PROPERTY_SHEET_PATH_EDEFAULT.equals(propertySheetPath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (jsInclude: ");
		result.append(jsInclude);
		result.append(", cssInclude: ");
		result.append(cssInclude);
		result.append(", supportedBackend: ");
		result.append(supportedBackend);
		result.append(", databound: ");
		if (databoundESet) result.append(databound); else result.append("<unset>");
		result.append(", group: ");
		result.append(group);
		result.append(", handlerType: ");
		if (handlerTypeESet) result.append(handlerType); else result.append("<unset>");
		result.append(", icon: ");
		result.append(icon);
		result.append(", modes: ");
		if (modesESet) result.append(modes); else result.append("<unset>");
		result.append(", newInstancePrefix: ");
		result.append(newInstancePrefix);
		result.append(", propertySheetPath: ");
		result.append(propertySheetPath);
		result.append(')');
		return result.toString();
	}

} // Component
