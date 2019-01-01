/**
 */
package com.armin.sap.ds.builder.models.extended;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.Property#getId <em>Id</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.Property#getName <em>Name</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.Property#getValue <em>Value</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.Property#getType <em>Type</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.Property#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.Property#getGetter <em>Getter</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.Property#getSetter <em>Setter</em>}</li>
 * </ul>
 *
 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getProperty()
 * @model kind="class"
 * @generated
 */
public class Property extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGetter() <em>Getter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetter()
	 * @generated
	 * @ordered
	 */
	protected Method getter;

	/**
	 * The cached value of the '{@link #getSetter() <em>Setter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetter()
	 * @generated
	 * @ordered
	 */
	protected Method setter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Property() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedPackage.Literals.PROPERTY;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getProperty_Id()
	 * @model id="true"
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.Property#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.PROPERTY__ID, oldId, id));
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
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getProperty_Name()
	 * @model
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.Property#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.PROPERTY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getProperty_Value()
	 * @model
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.Property#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.PROPERTY__VALUE, oldValue, value));
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getProperty_Type()
	 * @model
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.Property#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.PROPERTY__TYPE, oldType, type));
	}

	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(boolean)
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getProperty_IsReadOnly()
	 * @model
	 * @generated
	 */
	public boolean isIsReadOnly() {
		return isReadOnly;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.Property#isIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #isIsReadOnly()
	 * @generated
	 */
	public void setIsReadOnly(boolean newIsReadOnly) {
		boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.PROPERTY__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
	}

	/**
	 * Returns the value of the '<em><b>Getter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Getter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Getter</em>' containment reference.
	 * @see #setGetter(Method)
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getProperty_Getter()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	public Method getGetter() {
		return getter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetter(Method newGetter, NotificationChain msgs) {
		Method oldGetter = getter;
		getter = newGetter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtendedPackage.PROPERTY__GETTER, oldGetter, newGetter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.Property#getGetter <em>Getter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getter</em>' containment reference.
	 * @see #getGetter()
	 * @generated
	 */
	public void setGetter(Method newGetter) {
		if (newGetter != getter) {
			NotificationChain msgs = null;
			if (getter != null)
				msgs = ((InternalEObject)getter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtendedPackage.PROPERTY__GETTER, null, msgs);
			if (newGetter != null)
				msgs = ((InternalEObject)newGetter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtendedPackage.PROPERTY__GETTER, null, msgs);
			msgs = basicSetGetter(newGetter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.PROPERTY__GETTER, newGetter, newGetter));
	}

	/**
	 * Returns the value of the '<em><b>Setter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setter</em>' containment reference.
	 * @see #setSetter(Method)
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getProperty_Setter()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	public Method getSetter() {
		return setter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetter(Method newSetter, NotificationChain msgs) {
		Method oldSetter = setter;
		setter = newSetter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtendedPackage.PROPERTY__SETTER, oldSetter, newSetter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.Property#getSetter <em>Setter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setter</em>' containment reference.
	 * @see #getSetter()
	 * @generated
	 */
	public void setSetter(Method newSetter) {
		if (newSetter != setter) {
			NotificationChain msgs = null;
			if (setter != null)
				msgs = ((InternalEObject)setter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtendedPackage.PROPERTY__SETTER, null, msgs);
			if (newSetter != null)
				msgs = ((InternalEObject)newSetter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtendedPackage.PROPERTY__SETTER, null, msgs);
			msgs = basicSetSetter(newSetter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.PROPERTY__SETTER, newSetter, newSetter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtendedPackage.PROPERTY__GETTER:
				return basicSetGetter(null, msgs);
			case ExtendedPackage.PROPERTY__SETTER:
				return basicSetSetter(null, msgs);
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
			case ExtendedPackage.PROPERTY__ID:
				return getId();
			case ExtendedPackage.PROPERTY__NAME:
				return getName();
			case ExtendedPackage.PROPERTY__VALUE:
				return getValue();
			case ExtendedPackage.PROPERTY__TYPE:
				return getType();
			case ExtendedPackage.PROPERTY__IS_READ_ONLY:
				return isIsReadOnly();
			case ExtendedPackage.PROPERTY__GETTER:
				return getGetter();
			case ExtendedPackage.PROPERTY__SETTER:
				return getSetter();
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
			case ExtendedPackage.PROPERTY__ID:
				setId((Integer)newValue);
				return;
			case ExtendedPackage.PROPERTY__NAME:
				setName((String)newValue);
				return;
			case ExtendedPackage.PROPERTY__VALUE:
				setValue((String)newValue);
				return;
			case ExtendedPackage.PROPERTY__TYPE:
				setType((String)newValue);
				return;
			case ExtendedPackage.PROPERTY__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
				return;
			case ExtendedPackage.PROPERTY__GETTER:
				setGetter((Method)newValue);
				return;
			case ExtendedPackage.PROPERTY__SETTER:
				setSetter((Method)newValue);
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
			case ExtendedPackage.PROPERTY__ID:
				setId(ID_EDEFAULT);
				return;
			case ExtendedPackage.PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExtendedPackage.PROPERTY__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ExtendedPackage.PROPERTY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ExtendedPackage.PROPERTY__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case ExtendedPackage.PROPERTY__GETTER:
				setGetter((Method)null);
				return;
			case ExtendedPackage.PROPERTY__SETTER:
				setSetter((Method)null);
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
			case ExtendedPackage.PROPERTY__ID:
				return id != ID_EDEFAULT;
			case ExtendedPackage.PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExtendedPackage.PROPERTY__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ExtendedPackage.PROPERTY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ExtendedPackage.PROPERTY__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
			case ExtendedPackage.PROPERTY__GETTER:
				return getter != null;
			case ExtendedPackage.PROPERTY__SETTER:
				return setter != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", value: ");
		result.append(value);
		result.append(", type: ");
		result.append(type);
		result.append(", isReadOnly: ");
		result.append(isReadOnly);
		result.append(')');
		return result.toString();
	}

} // Property
