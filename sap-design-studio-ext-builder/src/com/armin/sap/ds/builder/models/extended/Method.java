/**
 */
package com.armin.sap.ds.builder.models.extended;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.Method#getId <em>Id</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.Method#getName <em>Name</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.Method#getBody <em>Body</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.Method#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.Method#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.Method#getAccessibiltyType <em>Accessibilty Type</em>}</li>
 * </ul>
 *
 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getMethod()
 * @model kind="class"
 * @generated
 */
public class Method extends MinimalEObjectImpl.Container implements EObject {
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
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected String returnType = RETURN_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The default value of the '{@link #getAccessibiltyType() <em>Accessibilty Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessibiltyType()
	 * @generated
	 * @ordered
	 */
	protected static final AccessType ACCESSIBILTY_TYPE_EDEFAULT = AccessType.PRIVATE;

	/**
	 * The cached value of the '{@link #getAccessibiltyType() <em>Accessibilty Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessibiltyType()
	 * @generated
	 * @ordered
	 */
	protected AccessType accessibiltyType = ACCESSIBILTY_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Method() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedPackage.Literals.METHOD;
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
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getMethod_Id()
	 * @model id="true"
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.Method#getId <em>Id</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.METHOD__ID, oldId, id));
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
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getMethod_Name()
	 * @model
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.Method#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.METHOD__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getMethod_Body()
	 * @model
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.Method#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.METHOD__BODY, oldBody, body));
	}

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see #setReturnType(String)
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getMethod_ReturnType()
	 * @model
	 * @generated
	 */
	public String getReturnType() {
		return returnType;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.Method#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see #getReturnType()
	 * @generated
	 */
	public void setReturnType(String newReturnType) {
		String oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.METHOD__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute.
	 * @see #setParameters(EList)
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getMethod_Parameters()
	 * @model many="false" transient="true"
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		return parameters;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.Method#getParameters <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' attribute.
	 * @see #getParameters()
	 * @generated
	 */
	public void setParameters(EList<Parameter> newParameters) {
		EList<Parameter> oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.METHOD__PARAMETERS, oldParameters, parameters));
	}

	/**
	 * Returns the value of the '<em><b>Accessibilty Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.armin.sap.ds.builder.models.extended.AccessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessibilty Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessibilty Type</em>' attribute.
	 * @see com.armin.sap.ds.builder.models.extended.AccessType
	 * @see #setAccessibiltyType(AccessType)
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getMethod_AccessibiltyType()
	 * @model
	 * @generated
	 */
	public AccessType getAccessibiltyType() {
		return accessibiltyType;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.Method#getAccessibiltyType <em>Accessibilty Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessibilty Type</em>' attribute.
	 * @see com.armin.sap.ds.builder.models.extended.AccessType
	 * @see #getAccessibiltyType()
	 * @generated
	 */
	public void setAccessibiltyType(AccessType newAccessibiltyType) {
		AccessType oldAccessibiltyType = accessibiltyType;
		accessibiltyType = newAccessibiltyType == null ? ACCESSIBILTY_TYPE_EDEFAULT : newAccessibiltyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.METHOD__ACCESSIBILTY_TYPE, oldAccessibiltyType, accessibiltyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtendedPackage.METHOD__ID:
				return getId();
			case ExtendedPackage.METHOD__NAME:
				return getName();
			case ExtendedPackage.METHOD__BODY:
				return getBody();
			case ExtendedPackage.METHOD__RETURN_TYPE:
				return getReturnType();
			case ExtendedPackage.METHOD__PARAMETERS:
				return getParameters();
			case ExtendedPackage.METHOD__ACCESSIBILTY_TYPE:
				return getAccessibiltyType();
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
			case ExtendedPackage.METHOD__ID:
				setId((Integer)newValue);
				return;
			case ExtendedPackage.METHOD__NAME:
				setName((String)newValue);
				return;
			case ExtendedPackage.METHOD__BODY:
				setBody((String)newValue);
				return;
			case ExtendedPackage.METHOD__RETURN_TYPE:
				setReturnType((String)newValue);
				return;
			case ExtendedPackage.METHOD__PARAMETERS:
				setParameters((EList<Parameter>)newValue);
				return;
			case ExtendedPackage.METHOD__ACCESSIBILTY_TYPE:
				setAccessibiltyType((AccessType)newValue);
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
			case ExtendedPackage.METHOD__ID:
				setId(ID_EDEFAULT);
				return;
			case ExtendedPackage.METHOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExtendedPackage.METHOD__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case ExtendedPackage.METHOD__RETURN_TYPE:
				setReturnType(RETURN_TYPE_EDEFAULT);
				return;
			case ExtendedPackage.METHOD__PARAMETERS:
				setParameters((EList<Parameter>)null);
				return;
			case ExtendedPackage.METHOD__ACCESSIBILTY_TYPE:
				setAccessibiltyType(ACCESSIBILTY_TYPE_EDEFAULT);
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
			case ExtendedPackage.METHOD__ID:
				return id != ID_EDEFAULT;
			case ExtendedPackage.METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExtendedPackage.METHOD__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case ExtendedPackage.METHOD__RETURN_TYPE:
				return RETURN_TYPE_EDEFAULT == null ? returnType != null : !RETURN_TYPE_EDEFAULT.equals(returnType);
			case ExtendedPackage.METHOD__PARAMETERS:
				return parameters != null;
			case ExtendedPackage.METHOD__ACCESSIBILTY_TYPE:
				return accessibiltyType != ACCESSIBILTY_TYPE_EDEFAULT;
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
		result.append(", body: ");
		result.append(body);
		result.append(", returnType: ");
		result.append(returnType);
		result.append(", parameters: ");
		result.append(parameters);
		result.append(", accessibiltyType: ");
		result.append(accessibiltyType);
		result.append(')');
		return result.toString();
	}

} // Method
