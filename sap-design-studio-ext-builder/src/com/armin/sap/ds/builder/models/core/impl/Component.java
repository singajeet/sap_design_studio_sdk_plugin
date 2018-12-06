/**
 */
package com.armin.sap.ds.builder.models.core.impl;

import com.armin.sap.ds.builder.models.core.BackendSystemType;
import com.armin.sap.ds.builder.models.core.HandlerTypes;
import com.armin.sap.ds.builder.models.core.IComponent;
import com.armin.sap.ds.builder.models.core.ICoreFactory;
import com.armin.sap.ds.builder.models.core.ICorePackage;
import com.armin.sap.ds.builder.models.core.IInitialization;
import com.armin.sap.ds.builder.models.core.IProperty;
import com.armin.sap.ds.builder.models.core.IRequireJSType;
import com.armin.sap.ds.builder.models.core.IStdInclude;
import com.armin.sap.ds.builder.models.core.UI5Mode;

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
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.Component#getRequireJs <em>Require Js</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.Component#getStdInclude <em>Std Include</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.Component#getJsInclude <em>Js Include</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.Component#getCssInclude <em>Css Include</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.Component#getProperty <em>Property</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.Component#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.Component#getSupportedBackend <em>Supported Backend</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.Component#isDatabound <em>Databound</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.Component#getGroup <em>Group</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.Component#getHandlerType <em>Handler Type</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.Component#getIcon <em>Icon</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.Component#getModes <em>Modes</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.Component#getNewInstancePrefix <em>New Instance Prefix</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.Component#getPropertySheetPath <em>Property Sheet Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Component extends Descriptable implements IComponent {
	/**
	 * The cached value of the '{@link #getRequireJs() <em>Require Js</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireJs()
	 * @generated
	 * @ordered
	 */
	protected EList<IRequireJSType> requireJs;

	/**
	 * The cached value of the '{@link #getStdInclude() <em>Std Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStdInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<IStdInclude> stdInclude;

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
	protected EList<IProperty> property;

	/**
	 * The cached value of the '{@link #getInitialization() <em>Initialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialization()
	 * @generated
	 * @ordered
	 */
	protected IInitialization initialization;

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
	protected static final List<UI5Mode> MODES_EDEFAULT = (List<UI5Mode>)ICoreFactory.eINSTANCE.createFromString(ICorePackage.eINSTANCE.getUI5Modes(), "commons");

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
		return ICorePackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IRequireJSType> getRequireJs() {
		if (requireJs == null) {
			requireJs = new EObjectContainmentEList<IRequireJSType>(IRequireJSType.class, this, ICorePackage.COMPONENT__REQUIRE_JS);
		}
		return requireJs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IStdInclude> getStdInclude() {
		if (stdInclude == null) {
			stdInclude = new EObjectContainmentEList<IStdInclude>(IStdInclude.class, this, ICorePackage.COMPONENT__STD_INCLUDE);
		}
		return stdInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getJsInclude() {
		if (jsInclude == null) {
			jsInclude = new EDataTypeEList<String>(String.class, this, ICorePackage.COMPONENT__JS_INCLUDE);
		}
		return jsInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCssInclude() {
		if (cssInclude == null) {
			cssInclude = new EDataTypeEList<String>(String.class, this, ICorePackage.COMPONENT__CSS_INCLUDE);
		}
		return cssInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<IProperty>(IProperty.class, this, ICorePackage.COMPONENT__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IInitialization getInitialization() {
		return initialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialization(IInitialization newInitialization, NotificationChain msgs) {
		IInitialization oldInitialization = initialization;
		initialization = newInitialization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ICorePackage.COMPONENT__INITIALIZATION, oldInitialization, newInitialization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialization(IInitialization newInitialization) {
		if (newInitialization != initialization) {
			NotificationChain msgs = null;
			if (initialization != null)
				msgs = ((InternalEObject)initialization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ICorePackage.COMPONENT__INITIALIZATION, null, msgs);
			if (newInitialization != null)
				msgs = ((InternalEObject)newInitialization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ICorePackage.COMPONENT__INITIALIZATION, null, msgs);
			msgs = basicSetInitialization(newInitialization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICorePackage.COMPONENT__INITIALIZATION, newInitialization, newInitialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BackendSystemType> getSupportedBackend() {
		if (supportedBackend == null) {
			supportedBackend = new EDataTypeEList<BackendSystemType>(BackendSystemType.class, this, ICorePackage.COMPONENT__SUPPORTED_BACKEND);
		}
		return supportedBackend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDatabound() {
		return databound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabound(boolean newDatabound) {
		boolean oldDatabound = databound;
		databound = newDatabound;
		boolean oldDataboundESet = databoundESet;
		databoundESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICorePackage.COMPONENT__DATABOUND, oldDatabound, databound, !oldDataboundESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDatabound() {
		boolean oldDatabound = databound;
		boolean oldDataboundESet = databoundESet;
		databound = DATABOUND_EDEFAULT;
		databoundESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ICorePackage.COMPONENT__DATABOUND, oldDatabound, DATABOUND_EDEFAULT, oldDataboundESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDatabound() {
		return databoundESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICorePackage.COMPONENT__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandlerTypes getHandlerType() {
		return handlerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlerType(HandlerTypes newHandlerType) {
		HandlerTypes oldHandlerType = handlerType;
		handlerType = newHandlerType == null ? HANDLER_TYPE_EDEFAULT : newHandlerType;
		boolean oldHandlerTypeESet = handlerTypeESet;
		handlerTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICorePackage.COMPONENT__HANDLER_TYPE, oldHandlerType, handlerType, !oldHandlerTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHandlerType() {
		HandlerTypes oldHandlerType = handlerType;
		boolean oldHandlerTypeESet = handlerTypeESet;
		handlerType = HANDLER_TYPE_EDEFAULT;
		handlerTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ICorePackage.COMPONENT__HANDLER_TYPE, oldHandlerType, HANDLER_TYPE_EDEFAULT, oldHandlerTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHandlerType() {
		return handlerTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(String newIcon) {
		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICorePackage.COMPONENT__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<UI5Mode> getModes() {
		return modes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModes(List<UI5Mode> newModes) {
		List<UI5Mode> oldModes = modes;
		modes = newModes;
		boolean oldModesESet = modesESet;
		modesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICorePackage.COMPONENT__MODES, oldModes, modes, !oldModesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModes() {
		List<UI5Mode> oldModes = modes;
		boolean oldModesESet = modesESet;
		modes = MODES_EDEFAULT;
		modesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ICorePackage.COMPONENT__MODES, oldModes, MODES_EDEFAULT, oldModesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModes() {
		return modesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewInstancePrefix() {
		return newInstancePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewInstancePrefix(String newNewInstancePrefix) {
		String oldNewInstancePrefix = newInstancePrefix;
		newInstancePrefix = newNewInstancePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICorePackage.COMPONENT__NEW_INSTANCE_PREFIX, oldNewInstancePrefix, newInstancePrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertySheetPath() {
		return propertySheetPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertySheetPath(String newPropertySheetPath) {
		String oldPropertySheetPath = propertySheetPath;
		propertySheetPath = newPropertySheetPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICorePackage.COMPONENT__PROPERTY_SHEET_PATH, oldPropertySheetPath, propertySheetPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ICorePackage.COMPONENT__REQUIRE_JS:
				return ((InternalEList<?>)getRequireJs()).basicRemove(otherEnd, msgs);
			case ICorePackage.COMPONENT__STD_INCLUDE:
				return ((InternalEList<?>)getStdInclude()).basicRemove(otherEnd, msgs);
			case ICorePackage.COMPONENT__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case ICorePackage.COMPONENT__INITIALIZATION:
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
			case ICorePackage.COMPONENT__REQUIRE_JS:
				return getRequireJs();
			case ICorePackage.COMPONENT__STD_INCLUDE:
				return getStdInclude();
			case ICorePackage.COMPONENT__JS_INCLUDE:
				return getJsInclude();
			case ICorePackage.COMPONENT__CSS_INCLUDE:
				return getCssInclude();
			case ICorePackage.COMPONENT__PROPERTY:
				return getProperty();
			case ICorePackage.COMPONENT__INITIALIZATION:
				return getInitialization();
			case ICorePackage.COMPONENT__SUPPORTED_BACKEND:
				return getSupportedBackend();
			case ICorePackage.COMPONENT__DATABOUND:
				return isDatabound();
			case ICorePackage.COMPONENT__GROUP:
				return getGroup();
			case ICorePackage.COMPONENT__HANDLER_TYPE:
				return getHandlerType();
			case ICorePackage.COMPONENT__ICON:
				return getIcon();
			case ICorePackage.COMPONENT__MODES:
				return getModes();
			case ICorePackage.COMPONENT__NEW_INSTANCE_PREFIX:
				return getNewInstancePrefix();
			case ICorePackage.COMPONENT__PROPERTY_SHEET_PATH:
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
			case ICorePackage.COMPONENT__REQUIRE_JS:
				getRequireJs().clear();
				getRequireJs().addAll((Collection<? extends IRequireJSType>)newValue);
				return;
			case ICorePackage.COMPONENT__STD_INCLUDE:
				getStdInclude().clear();
				getStdInclude().addAll((Collection<? extends IStdInclude>)newValue);
				return;
			case ICorePackage.COMPONENT__JS_INCLUDE:
				getJsInclude().clear();
				getJsInclude().addAll((Collection<? extends String>)newValue);
				return;
			case ICorePackage.COMPONENT__CSS_INCLUDE:
				getCssInclude().clear();
				getCssInclude().addAll((Collection<? extends String>)newValue);
				return;
			case ICorePackage.COMPONENT__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends IProperty>)newValue);
				return;
			case ICorePackage.COMPONENT__INITIALIZATION:
				setInitialization((IInitialization)newValue);
				return;
			case ICorePackage.COMPONENT__SUPPORTED_BACKEND:
				getSupportedBackend().clear();
				getSupportedBackend().addAll((Collection<? extends BackendSystemType>)newValue);
				return;
			case ICorePackage.COMPONENT__DATABOUND:
				setDatabound((Boolean)newValue);
				return;
			case ICorePackage.COMPONENT__GROUP:
				setGroup((String)newValue);
				return;
			case ICorePackage.COMPONENT__HANDLER_TYPE:
				setHandlerType((HandlerTypes)newValue);
				return;
			case ICorePackage.COMPONENT__ICON:
				setIcon((String)newValue);
				return;
			case ICorePackage.COMPONENT__MODES:
				setModes((List<UI5Mode>)newValue);
				return;
			case ICorePackage.COMPONENT__NEW_INSTANCE_PREFIX:
				setNewInstancePrefix((String)newValue);
				return;
			case ICorePackage.COMPONENT__PROPERTY_SHEET_PATH:
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
			case ICorePackage.COMPONENT__REQUIRE_JS:
				getRequireJs().clear();
				return;
			case ICorePackage.COMPONENT__STD_INCLUDE:
				getStdInclude().clear();
				return;
			case ICorePackage.COMPONENT__JS_INCLUDE:
				getJsInclude().clear();
				return;
			case ICorePackage.COMPONENT__CSS_INCLUDE:
				getCssInclude().clear();
				return;
			case ICorePackage.COMPONENT__PROPERTY:
				getProperty().clear();
				return;
			case ICorePackage.COMPONENT__INITIALIZATION:
				setInitialization((IInitialization)null);
				return;
			case ICorePackage.COMPONENT__SUPPORTED_BACKEND:
				getSupportedBackend().clear();
				return;
			case ICorePackage.COMPONENT__DATABOUND:
				unsetDatabound();
				return;
			case ICorePackage.COMPONENT__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case ICorePackage.COMPONENT__HANDLER_TYPE:
				unsetHandlerType();
				return;
			case ICorePackage.COMPONENT__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case ICorePackage.COMPONENT__MODES:
				unsetModes();
				return;
			case ICorePackage.COMPONENT__NEW_INSTANCE_PREFIX:
				setNewInstancePrefix(NEW_INSTANCE_PREFIX_EDEFAULT);
				return;
			case ICorePackage.COMPONENT__PROPERTY_SHEET_PATH:
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
			case ICorePackage.COMPONENT__REQUIRE_JS:
				return requireJs != null && !requireJs.isEmpty();
			case ICorePackage.COMPONENT__STD_INCLUDE:
				return stdInclude != null && !stdInclude.isEmpty();
			case ICorePackage.COMPONENT__JS_INCLUDE:
				return jsInclude != null && !jsInclude.isEmpty();
			case ICorePackage.COMPONENT__CSS_INCLUDE:
				return cssInclude != null && !cssInclude.isEmpty();
			case ICorePackage.COMPONENT__PROPERTY:
				return property != null && !property.isEmpty();
			case ICorePackage.COMPONENT__INITIALIZATION:
				return initialization != null;
			case ICorePackage.COMPONENT__SUPPORTED_BACKEND:
				return supportedBackend != null && !supportedBackend.isEmpty();
			case ICorePackage.COMPONENT__DATABOUND:
				return isSetDatabound();
			case ICorePackage.COMPONENT__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
			case ICorePackage.COMPONENT__HANDLER_TYPE:
				return isSetHandlerType();
			case ICorePackage.COMPONENT__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case ICorePackage.COMPONENT__MODES:
				return isSetModes();
			case ICorePackage.COMPONENT__NEW_INSTANCE_PREFIX:
				return NEW_INSTANCE_PREFIX_EDEFAULT == null ? newInstancePrefix != null : !NEW_INSTANCE_PREFIX_EDEFAULT.equals(newInstancePrefix);
			case ICorePackage.COMPONENT__PROPERTY_SHEET_PATH:
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

} //Component
