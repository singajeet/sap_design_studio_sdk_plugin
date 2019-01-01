/**
 */
package com.armin.sap.ds.builder.models.core;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Initial values of properties (built-in and custom) of this extension component when a new 
 *         instance of this extension component is created.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Initialization#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see com.armin.sap.ds.builder.models.core.CorePackage#getInitialization()
 * @model kind="class"
 *        extendedMetaData="name='Initialization' kind='elementOnly'"
 * @generated
 */
public class Initialization extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValue> defaultValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Initialization() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.INITIALIZATION;
	}

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.core.PropertyValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference list.
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getInitialization_DefaultValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
	public EList<PropertyValue> getDefaultValue() {
		if (defaultValue == null) {
			defaultValue = new EObjectContainmentEList<PropertyValue>(PropertyValue.class, this, CorePackage.INITIALIZATION__DEFAULT_VALUE);
		}
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.INITIALIZATION__DEFAULT_VALUE:
				return ((InternalEList<?>)getDefaultValue()).basicRemove(otherEnd, msgs);
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
			case CorePackage.INITIALIZATION__DEFAULT_VALUE:
				return getDefaultValue();
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
			case CorePackage.INITIALIZATION__DEFAULT_VALUE:
				getDefaultValue().clear();
				getDefaultValue().addAll((Collection<? extends PropertyValue>)newValue);
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
			case CorePackage.INITIALIZATION__DEFAULT_VALUE:
				getDefaultValue().clear();
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
			case CorePackage.INITIALIZATION__DEFAULT_VALUE:
				return defaultValue != null && !defaultValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Initialization
