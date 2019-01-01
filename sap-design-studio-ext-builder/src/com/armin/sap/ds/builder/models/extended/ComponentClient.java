/**
 */
package com.armin.sap.ds.builder.models.extended;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getId <em>Id</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getInit <em>Init</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getAfterUpdate <em>After Update</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getBeforeUpdate <em>Before Update</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getSdkBaseClassType <em>Sdk Base Class Type</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getData <em>Data</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getClassMethods <em>Class Methods</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getLocalMethods <em>Local Methods</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getConstructors <em>Constructors</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getConstants <em>Constants</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getComp <em>Comp</em>}</li>
 * </ul>
 *
 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getComponentClient()
 * @model kind="class"
 * @generated
 */
public class ComponentClient extends MinimalEObjectImpl.Container implements EObject {
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
	 * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected Method init;

	/**
	 * The cached value of the '{@link #getAfterUpdate() <em>After Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterUpdate()
	 * @generated
	 * @ordered
	 */
	protected Method afterUpdate;

	/**
	 * The cached value of the '{@link #getBeforeUpdate() <em>Before Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeUpdate()
	 * @generated
	 * @ordered
	 */
	protected Method beforeUpdate;

	/**
	 * The default value of the '{@link #getSdkBaseClassType() <em>Sdk Base Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSdkBaseClassType()
	 * @generated
	 * @ordered
	 */
	protected static final SDKBaseClassType SDK_BASE_CLASS_TYPE_EDEFAULT = SDKBaseClassType.COMPONENT;

	/**
	 * The cached value of the '{@link #getSdkBaseClassType() <em>Sdk Base Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSdkBaseClassType()
	 * @generated
	 * @ordered
	 */
	protected SDKBaseClassType sdkBaseClassType = SDK_BASE_CLASS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected byte[] data = DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetadata() <em>Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] METADATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected byte[] metadata = METADATA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getClassMethods() <em>Class Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> classMethods;

	/**
	 * The cached value of the '{@link #getLocalMethods() <em>Local Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> localMethods;

	/**
	 * The cached value of the '{@link #getConstructors() <em>Constructors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructors()
	 * @generated
	 * @ordered
	 */
	protected EList<Constructor> constructors;

	/**
	 * The cached value of the '{@link #getLocalVariables() <em>Local Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> localVariables;

	/**
	 * The cached value of the '{@link #getConstants() <em>Constants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstants()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> constants;

	/**
	 * The default value of the '{@link #getComp() <em>Comp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComp()
	 * @generated
	 * @ordered
	 */
	protected static final Object COMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComp() <em>Comp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComp()
	 * @generated
	 * @ordered
	 */
	protected Object comp = COMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentClient() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedPackage.Literals.COMPONENT_CLIENT;
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
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getComponentClient_Id()
	 * @model id="true"
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getId <em>Id</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.COMPONENT_CLIENT__ID, oldId, id));
	}

	/**
	 * Returns the value of the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' containment reference.
	 * @see #setInit(Method)
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getComponentClient_Init()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	public Method getInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInit(Method newInit, NotificationChain msgs) {
		Method oldInit = init;
		init = newInit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtendedPackage.COMPONENT_CLIENT__INIT, oldInit, newInit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getInit <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' containment reference.
	 * @see #getInit()
	 * @generated
	 */
	public void setInit(Method newInit) {
		if (newInit != init) {
			NotificationChain msgs = null;
			if (init != null)
				msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtendedPackage.COMPONENT_CLIENT__INIT, null, msgs);
			if (newInit != null)
				msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtendedPackage.COMPONENT_CLIENT__INIT, null, msgs);
			msgs = basicSetInit(newInit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.COMPONENT_CLIENT__INIT, newInit, newInit));
	}

	/**
	 * Returns the value of the '<em><b>After Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After Update</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Update</em>' containment reference.
	 * @see #setAfterUpdate(Method)
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getComponentClient_AfterUpdate()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	public Method getAfterUpdate() {
		return afterUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAfterUpdate(Method newAfterUpdate, NotificationChain msgs) {
		Method oldAfterUpdate = afterUpdate;
		afterUpdate = newAfterUpdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtendedPackage.COMPONENT_CLIENT__AFTER_UPDATE, oldAfterUpdate, newAfterUpdate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getAfterUpdate <em>After Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Update</em>' containment reference.
	 * @see #getAfterUpdate()
	 * @generated
	 */
	public void setAfterUpdate(Method newAfterUpdate) {
		if (newAfterUpdate != afterUpdate) {
			NotificationChain msgs = null;
			if (afterUpdate != null)
				msgs = ((InternalEObject)afterUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtendedPackage.COMPONENT_CLIENT__AFTER_UPDATE, null, msgs);
			if (newAfterUpdate != null)
				msgs = ((InternalEObject)newAfterUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtendedPackage.COMPONENT_CLIENT__AFTER_UPDATE, null, msgs);
			msgs = basicSetAfterUpdate(newAfterUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.COMPONENT_CLIENT__AFTER_UPDATE, newAfterUpdate, newAfterUpdate));
	}

	/**
	 * Returns the value of the '<em><b>Before Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Update</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Update</em>' containment reference.
	 * @see #setBeforeUpdate(Method)
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getComponentClient_BeforeUpdate()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	public Method getBeforeUpdate() {
		return beforeUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeforeUpdate(Method newBeforeUpdate, NotificationChain msgs) {
		Method oldBeforeUpdate = beforeUpdate;
		beforeUpdate = newBeforeUpdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtendedPackage.COMPONENT_CLIENT__BEFORE_UPDATE, oldBeforeUpdate, newBeforeUpdate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getBeforeUpdate <em>Before Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Update</em>' containment reference.
	 * @see #getBeforeUpdate()
	 * @generated
	 */
	public void setBeforeUpdate(Method newBeforeUpdate) {
		if (newBeforeUpdate != beforeUpdate) {
			NotificationChain msgs = null;
			if (beforeUpdate != null)
				msgs = ((InternalEObject)beforeUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtendedPackage.COMPONENT_CLIENT__BEFORE_UPDATE, null, msgs);
			if (newBeforeUpdate != null)
				msgs = ((InternalEObject)newBeforeUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtendedPackage.COMPONENT_CLIENT__BEFORE_UPDATE, null, msgs);
			msgs = basicSetBeforeUpdate(newBeforeUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.COMPONENT_CLIENT__BEFORE_UPDATE, newBeforeUpdate, newBeforeUpdate));
	}

	/**
	 * Returns the value of the '<em><b>Sdk Base Class Type</b></em>' attribute.
	 * The default value is <code>"COMPONENT"</code>.
	 * The literals are from the enumeration {@link com.armin.sap.ds.builder.models.extended.SDKBaseClassType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sdk Base Class Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sdk Base Class Type</em>' attribute.
	 * @see com.armin.sap.ds.builder.models.extended.SDKBaseClassType
	 * @see #setSdkBaseClassType(SDKBaseClassType)
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getComponentClient_SdkBaseClassType()
	 * @model default="COMPONENT"
	 * @generated
	 */
	public SDKBaseClassType getSdkBaseClassType() {
		return sdkBaseClassType;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getSdkBaseClassType <em>Sdk Base Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sdk Base Class Type</em>' attribute.
	 * @see com.armin.sap.ds.builder.models.extended.SDKBaseClassType
	 * @see #getSdkBaseClassType()
	 * @generated
	 */
	public void setSdkBaseClassType(SDKBaseClassType newSdkBaseClassType) {
		SDKBaseClassType oldSdkBaseClassType = sdkBaseClassType;
		sdkBaseClassType = newSdkBaseClassType == null ? SDK_BASE_CLASS_TYPE_EDEFAULT : newSdkBaseClassType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.COMPONENT_CLIENT__SDK_BASE_CLASS_TYPE, oldSdkBaseClassType, sdkBaseClassType));
	}

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(byte[])
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getComponentClient_Data()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 * @generated
	 */
	public byte[] getData() {
		return data;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	public void setData(byte[] newData) {
		byte[] oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.COMPONENT_CLIENT__DATA, oldData, data));
	}

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' attribute.
	 * @see #setMetadata(byte[])
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getComponentClient_Metadata()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 * @generated
	 */
	public byte[] getMetadata() {
		return metadata;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getMetadata <em>Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' attribute.
	 * @see #getMetadata()
	 * @generated
	 */
	public void setMetadata(byte[] newMetadata) {
		byte[] oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.COMPONENT_CLIENT__METADATA, oldMetadata, metadata));
	}

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.extended.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getComponentClient_Properties()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, ExtendedPackage.COMPONENT_CLIENT__PROPERTIES);
		}
		return properties;
	}

	/**
	 * Returns the value of the '<em><b>Class Methods</b></em>' containment reference list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.extended.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Methods</em>' containment reference list.
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getComponentClient_ClassMethods()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	public EList<Method> getClassMethods() {
		if (classMethods == null) {
			classMethods = new EObjectContainmentEList<Method>(Method.class, this, ExtendedPackage.COMPONENT_CLIENT__CLASS_METHODS);
		}
		return classMethods;
	}

	/**
	 * Returns the value of the '<em><b>Local Methods</b></em>' containment reference list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.extended.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Methods</em>' containment reference list.
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getComponentClient_LocalMethods()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	public EList<Method> getLocalMethods() {
		if (localMethods == null) {
			localMethods = new EObjectContainmentEList<Method>(Method.class, this, ExtendedPackage.COMPONENT_CLIENT__LOCAL_METHODS);
		}
		return localMethods;
	}

	/**
	 * Returns the value of the '<em><b>Constructors</b></em>' containment reference list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.extended.Constructor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constructors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructors</em>' containment reference list.
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getComponentClient_Constructors()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	public EList<Constructor> getConstructors() {
		if (constructors == null) {
			constructors = new EObjectContainmentEList<Constructor>(Constructor.class, this, ExtendedPackage.COMPONENT_CLIENT__CONSTRUCTORS);
		}
		return constructors;
	}

	/**
	 * Returns the value of the '<em><b>Local Variables</b></em>' containment reference list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.extended.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Variables</em>' containment reference list.
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getComponentClient_LocalVariables()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	public EList<Variable> getLocalVariables() {
		if (localVariables == null) {
			localVariables = new EObjectContainmentEList<Variable>(Variable.class, this, ExtendedPackage.COMPONENT_CLIENT__LOCAL_VARIABLES);
		}
		return localVariables;
	}

	/**
	 * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.extended.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constants</em>' containment reference list.
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getComponentClient_Constants()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	public EList<Constant> getConstants() {
		if (constants == null) {
			constants = new EObjectContainmentEList<Constant>(Constant.class, this, ExtendedPackage.COMPONENT_CLIENT__CONSTANTS);
		}
		return constants;
	}

	/**
	 * Returns the value of the '<em><b>Comp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp</em>' attribute.
	 * @see #setComp(Object)
	 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getComponentClient_Comp()
	 * @model dataType="com.armin.sap.ds.builder.models.extended.JavaObject"
	 * @generated
	 */
	public Object getComp() {
		return comp;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.ComponentClient#getComp <em>Comp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp</em>' attribute.
	 * @see #getComp()
	 * @generated
	 */
	public void setComp(Object newComp) {
		Object oldComp = comp;
		comp = newComp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.COMPONENT_CLIENT__COMP, oldComp, comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	public void render() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtendedPackage.COMPONENT_CLIENT__INIT:
				return basicSetInit(null, msgs);
			case ExtendedPackage.COMPONENT_CLIENT__AFTER_UPDATE:
				return basicSetAfterUpdate(null, msgs);
			case ExtendedPackage.COMPONENT_CLIENT__BEFORE_UPDATE:
				return basicSetBeforeUpdate(null, msgs);
			case ExtendedPackage.COMPONENT_CLIENT__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case ExtendedPackage.COMPONENT_CLIENT__CLASS_METHODS:
				return ((InternalEList<?>)getClassMethods()).basicRemove(otherEnd, msgs);
			case ExtendedPackage.COMPONENT_CLIENT__LOCAL_METHODS:
				return ((InternalEList<?>)getLocalMethods()).basicRemove(otherEnd, msgs);
			case ExtendedPackage.COMPONENT_CLIENT__CONSTRUCTORS:
				return ((InternalEList<?>)getConstructors()).basicRemove(otherEnd, msgs);
			case ExtendedPackage.COMPONENT_CLIENT__LOCAL_VARIABLES:
				return ((InternalEList<?>)getLocalVariables()).basicRemove(otherEnd, msgs);
			case ExtendedPackage.COMPONENT_CLIENT__CONSTANTS:
				return ((InternalEList<?>)getConstants()).basicRemove(otherEnd, msgs);
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
			case ExtendedPackage.COMPONENT_CLIENT__ID:
				return getId();
			case ExtendedPackage.COMPONENT_CLIENT__INIT:
				return getInit();
			case ExtendedPackage.COMPONENT_CLIENT__AFTER_UPDATE:
				return getAfterUpdate();
			case ExtendedPackage.COMPONENT_CLIENT__BEFORE_UPDATE:
				return getBeforeUpdate();
			case ExtendedPackage.COMPONENT_CLIENT__SDK_BASE_CLASS_TYPE:
				return getSdkBaseClassType();
			case ExtendedPackage.COMPONENT_CLIENT__DATA:
				return getData();
			case ExtendedPackage.COMPONENT_CLIENT__METADATA:
				return getMetadata();
			case ExtendedPackage.COMPONENT_CLIENT__PROPERTIES:
				return getProperties();
			case ExtendedPackage.COMPONENT_CLIENT__CLASS_METHODS:
				return getClassMethods();
			case ExtendedPackage.COMPONENT_CLIENT__LOCAL_METHODS:
				return getLocalMethods();
			case ExtendedPackage.COMPONENT_CLIENT__CONSTRUCTORS:
				return getConstructors();
			case ExtendedPackage.COMPONENT_CLIENT__LOCAL_VARIABLES:
				return getLocalVariables();
			case ExtendedPackage.COMPONENT_CLIENT__CONSTANTS:
				return getConstants();
			case ExtendedPackage.COMPONENT_CLIENT__COMP:
				return getComp();
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
			case ExtendedPackage.COMPONENT_CLIENT__ID:
				setId((Integer)newValue);
				return;
			case ExtendedPackage.COMPONENT_CLIENT__INIT:
				setInit((Method)newValue);
				return;
			case ExtendedPackage.COMPONENT_CLIENT__AFTER_UPDATE:
				setAfterUpdate((Method)newValue);
				return;
			case ExtendedPackage.COMPONENT_CLIENT__BEFORE_UPDATE:
				setBeforeUpdate((Method)newValue);
				return;
			case ExtendedPackage.COMPONENT_CLIENT__SDK_BASE_CLASS_TYPE:
				setSdkBaseClassType((SDKBaseClassType)newValue);
				return;
			case ExtendedPackage.COMPONENT_CLIENT__DATA:
				setData((byte[])newValue);
				return;
			case ExtendedPackage.COMPONENT_CLIENT__METADATA:
				setMetadata((byte[])newValue);
				return;
			case ExtendedPackage.COMPONENT_CLIENT__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case ExtendedPackage.COMPONENT_CLIENT__CLASS_METHODS:
				getClassMethods().clear();
				getClassMethods().addAll((Collection<? extends Method>)newValue);
				return;
			case ExtendedPackage.COMPONENT_CLIENT__LOCAL_METHODS:
				getLocalMethods().clear();
				getLocalMethods().addAll((Collection<? extends Method>)newValue);
				return;
			case ExtendedPackage.COMPONENT_CLIENT__CONSTRUCTORS:
				getConstructors().clear();
				getConstructors().addAll((Collection<? extends Constructor>)newValue);
				return;
			case ExtendedPackage.COMPONENT_CLIENT__LOCAL_VARIABLES:
				getLocalVariables().clear();
				getLocalVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case ExtendedPackage.COMPONENT_CLIENT__CONSTANTS:
				getConstants().clear();
				getConstants().addAll((Collection<? extends Constant>)newValue);
				return;
			case ExtendedPackage.COMPONENT_CLIENT__COMP:
				setComp(newValue);
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
			case ExtendedPackage.COMPONENT_CLIENT__ID:
				setId(ID_EDEFAULT);
				return;
			case ExtendedPackage.COMPONENT_CLIENT__INIT:
				setInit((Method)null);
				return;
			case ExtendedPackage.COMPONENT_CLIENT__AFTER_UPDATE:
				setAfterUpdate((Method)null);
				return;
			case ExtendedPackage.COMPONENT_CLIENT__BEFORE_UPDATE:
				setBeforeUpdate((Method)null);
				return;
			case ExtendedPackage.COMPONENT_CLIENT__SDK_BASE_CLASS_TYPE:
				setSdkBaseClassType(SDK_BASE_CLASS_TYPE_EDEFAULT);
				return;
			case ExtendedPackage.COMPONENT_CLIENT__DATA:
				setData(DATA_EDEFAULT);
				return;
			case ExtendedPackage.COMPONENT_CLIENT__METADATA:
				setMetadata(METADATA_EDEFAULT);
				return;
			case ExtendedPackage.COMPONENT_CLIENT__PROPERTIES:
				getProperties().clear();
				return;
			case ExtendedPackage.COMPONENT_CLIENT__CLASS_METHODS:
				getClassMethods().clear();
				return;
			case ExtendedPackage.COMPONENT_CLIENT__LOCAL_METHODS:
				getLocalMethods().clear();
				return;
			case ExtendedPackage.COMPONENT_CLIENT__CONSTRUCTORS:
				getConstructors().clear();
				return;
			case ExtendedPackage.COMPONENT_CLIENT__LOCAL_VARIABLES:
				getLocalVariables().clear();
				return;
			case ExtendedPackage.COMPONENT_CLIENT__CONSTANTS:
				getConstants().clear();
				return;
			case ExtendedPackage.COMPONENT_CLIENT__COMP:
				setComp(COMP_EDEFAULT);
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
			case ExtendedPackage.COMPONENT_CLIENT__ID:
				return id != ID_EDEFAULT;
			case ExtendedPackage.COMPONENT_CLIENT__INIT:
				return init != null;
			case ExtendedPackage.COMPONENT_CLIENT__AFTER_UPDATE:
				return afterUpdate != null;
			case ExtendedPackage.COMPONENT_CLIENT__BEFORE_UPDATE:
				return beforeUpdate != null;
			case ExtendedPackage.COMPONENT_CLIENT__SDK_BASE_CLASS_TYPE:
				return sdkBaseClassType != SDK_BASE_CLASS_TYPE_EDEFAULT;
			case ExtendedPackage.COMPONENT_CLIENT__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
			case ExtendedPackage.COMPONENT_CLIENT__METADATA:
				return METADATA_EDEFAULT == null ? metadata != null : !METADATA_EDEFAULT.equals(metadata);
			case ExtendedPackage.COMPONENT_CLIENT__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ExtendedPackage.COMPONENT_CLIENT__CLASS_METHODS:
				return classMethods != null && !classMethods.isEmpty();
			case ExtendedPackage.COMPONENT_CLIENT__LOCAL_METHODS:
				return localMethods != null && !localMethods.isEmpty();
			case ExtendedPackage.COMPONENT_CLIENT__CONSTRUCTORS:
				return constructors != null && !constructors.isEmpty();
			case ExtendedPackage.COMPONENT_CLIENT__LOCAL_VARIABLES:
				return localVariables != null && !localVariables.isEmpty();
			case ExtendedPackage.COMPONENT_CLIENT__CONSTANTS:
				return constants != null && !constants.isEmpty();
			case ExtendedPackage.COMPONENT_CLIENT__COMP:
				return COMP_EDEFAULT == null ? comp != null : !COMP_EDEFAULT.equals(comp);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExtendedPackage.COMPONENT_CLIENT___RENDER:
				render();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", sdkBaseClassType: ");
		result.append(sdkBaseClassType);
		result.append(", data: ");
		result.append(data);
		result.append(", metadata: ");
		result.append(metadata);
		result.append(", comp: ");
		result.append(comp);
		result.append(')');
		return result.toString();
	}

} // ComponentClient
