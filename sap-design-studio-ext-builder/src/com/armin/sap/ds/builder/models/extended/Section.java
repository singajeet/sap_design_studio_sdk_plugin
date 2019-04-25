/**
 */
package com.armin.sap.ds.builder.models.extended;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.Section#getName <em>Name</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.Section#getBelongsToComponent <em>Belongs To Component</em>}</li>
 * </ul>
 *
 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getSection()
 * @model kind="class" abstract="true"
 * @generated
 */
public abstract class Section extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBelongsToComponent() <em>Belongs To Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongsToComponent()
	 * @generated
	 * @ordered
	 */
	protected static final Object BELONGS_TO_COMPONENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBelongsToComponent() <em>Belongs To Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongsToComponent()
	 * @generated
	 * @ordered
	 */
	protected Object belongsToComponent = BELONGS_TO_COMPONENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Section() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedPackage.Literals.SECTION;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getSection_Name()
	 * @model
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.Section#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.SECTION__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Belongs To Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To Component</em>' attribute.
	 * @see #setBelongsToComponent(Object)
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getSection_BelongsToComponent()
	 * @model dataType="com.armin.sap.ds.builder.models.extended.JavaObject" transient="true"
	 * @generated
	 */
	public Object getBelongsToComponent() {
		return belongsToComponent;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.Section#getBelongsToComponent <em>Belongs To Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To Component</em>' attribute.
	 * @see #getBelongsToComponent()
	 * @generated
	 */
	public void setBelongsToComponent(Object newBelongsToComponent) {
		Object oldBelongsToComponent = belongsToComponent;
		belongsToComponent = newBelongsToComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.SECTION__BELONGS_TO_COMPONENT, oldBelongsToComponent, belongsToComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtendedPackage.SECTION__NAME:
				return getName();
			case ExtendedPackage.SECTION__BELONGS_TO_COMPONENT:
				return getBelongsToComponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExtendedPackage.SECTION__NAME:
				setName((String)newValue);
				return;
			case ExtendedPackage.SECTION__BELONGS_TO_COMPONENT:
				setBelongsToComponent(newValue);
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
			case ExtendedPackage.SECTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExtendedPackage.SECTION__BELONGS_TO_COMPONENT:
				setBelongsToComponent(BELONGS_TO_COMPONENT_EDEFAULT);
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
			case ExtendedPackage.SECTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExtendedPackage.SECTION__BELONGS_TO_COMPONENT:
				return BELONGS_TO_COMPONENT_EDEFAULT == null ? belongsToComponent != null : !BELONGS_TO_COMPONENT_EDEFAULT.equals(belongsToComponent);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", belongsToComponent: ");
		result.append(belongsToComponent);
		result.append(')');
		return result.toString();
	}

} // Section
