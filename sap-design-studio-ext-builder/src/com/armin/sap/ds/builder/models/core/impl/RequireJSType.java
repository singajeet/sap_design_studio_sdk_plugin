/**
 */
package com.armin.sap.ds.builder.models.core.impl;

import com.armin.sap.ds.builder.models.core.ICorePackage;
import com.armin.sap.ds.builder.models.core.IRequireJSType;
import com.armin.sap.ds.builder.models.core.UI5Mode;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Require JS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.RequireJSType#getValue <em>Value</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.RequireJSType#getModes <em>Modes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequireJSType extends MinimalEObjectImpl.Container implements IRequireJSType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModes() <em>Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModes()
	 * @generated
	 * @ordered
	 */
	protected static final List<UI5Mode> MODES_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequireJSType() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ICorePackage.Literals.REQUIRE_JS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICorePackage.REQUIRE_JS_TYPE__VALUE, oldValue, value));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICorePackage.REQUIRE_JS_TYPE__MODES, oldModes, modes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ICorePackage.REQUIRE_JS_TYPE__VALUE:
				return getValue();
			case ICorePackage.REQUIRE_JS_TYPE__MODES:
				return getModes();
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
			case ICorePackage.REQUIRE_JS_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case ICorePackage.REQUIRE_JS_TYPE__MODES:
				setModes((List<UI5Mode>)newValue);
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
			case ICorePackage.REQUIRE_JS_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ICorePackage.REQUIRE_JS_TYPE__MODES:
				setModes(MODES_EDEFAULT);
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
			case ICorePackage.REQUIRE_JS_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ICorePackage.REQUIRE_JS_TYPE__MODES:
				return MODES_EDEFAULT == null ? modes != null : !MODES_EDEFAULT.equals(modes);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", modes: ");
		result.append(modes);
		result.append(')');
		return result.toString();
	}

} //RequireJSType
