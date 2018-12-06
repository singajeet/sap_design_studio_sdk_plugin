/**
 */
package com.armin.sap.ds.builder.models.extended.impl;

import com.armin.sap.ds.builder.models.core.impl.Component;

import com.armin.sap.ds.builder.models.extended.IClientComponent;
import com.armin.sap.ds.builder.models.extended.IExtendedPackage;
import com.armin.sap.ds.builder.models.extended.SDKBaseClassType;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.impl.ClientComponent#getSdkBaseClassType <em>Sdk Base Class Type</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.impl.ClientComponent#getData <em>Data</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.impl.ClientComponent#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.impl.ClientComponent#getInitMethodBody <em>Init Method Body</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.impl.ClientComponent#getAfterUpdateMethodBody <em>After Update Method Body</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.impl.ClientComponent#getBeforeUpdateMethodBody <em>Before Update Method Body</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.impl.ClientComponent#getPropertiesBody <em>Properties Body</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.impl.ClientComponent#getClassMethodsBody <em>Class Methods Body</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.impl.ClientComponent#getLocalMethodsBody <em>Local Methods Body</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.impl.ClientComponent#getConstructorParameters <em>Constructor Parameters</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.impl.ClientComponent#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.impl.ClientComponent#getConstants <em>Constants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientComponent extends Component implements IClientComponent {
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
	 * The default value of the '{@link #getInitMethodBody() <em>Init Method Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitMethodBody()
	 * @generated
	 * @ordered
	 */
	protected static final String INIT_METHOD_BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitMethodBody() <em>Init Method Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitMethodBody()
	 * @generated
	 * @ordered
	 */
	protected String initMethodBody = INIT_METHOD_BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAfterUpdateMethodBody() <em>After Update Method Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterUpdateMethodBody()
	 * @generated
	 * @ordered
	 */
	protected static final String AFTER_UPDATE_METHOD_BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAfterUpdateMethodBody() <em>After Update Method Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterUpdateMethodBody()
	 * @generated
	 * @ordered
	 */
	protected String afterUpdateMethodBody = AFTER_UPDATE_METHOD_BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeforeUpdateMethodBody() <em>Before Update Method Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeUpdateMethodBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BEFORE_UPDATE_METHOD_BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeforeUpdateMethodBody() <em>Before Update Method Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeUpdateMethodBody()
	 * @generated
	 * @ordered
	 */
	protected String beforeUpdateMethodBody = BEFORE_UPDATE_METHOD_BODY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPropertiesBody() <em>Properties Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertiesBody()
	 * @generated
	 * @ordered
	 */
	protected Map<String, Map<String, String>> propertiesBody;

	/**
	 * The cached value of the '{@link #getClassMethodsBody() <em>Class Methods Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassMethodsBody()
	 * @generated
	 * @ordered
	 */
	protected Map<String, String> classMethodsBody;

	/**
	 * The cached value of the '{@link #getLocalMethodsBody() <em>Local Methods Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalMethodsBody()
	 * @generated
	 * @ordered
	 */
	protected Map<String, String> localMethodsBody;

	/**
	 * The cached value of the '{@link #getConstructorParameters() <em>Constructor Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructorParameters()
	 * @generated
	 * @ordered
	 */
	protected Map<String, String> constructorParameters;

	/**
	 * The cached value of the '{@link #getLocalVariables() <em>Local Variables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalVariables()
	 * @generated
	 * @ordered
	 */
	protected Map<String, String> localVariables;

	/**
	 * The cached value of the '{@link #getConstants() <em>Constants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstants()
	 * @generated
	 * @ordered
	 */
	protected Map<String, String> constants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientComponent() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IExtendedPackage.Literals.CLIENT_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDKBaseClassType getSdkBaseClassType() {
		return sdkBaseClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSdkBaseClassType(SDKBaseClassType newSdkBaseClassType) {
		SDKBaseClassType oldSdkBaseClassType = sdkBaseClassType;
		sdkBaseClassType = newSdkBaseClassType == null ? SDK_BASE_CLASS_TYPE_EDEFAULT : newSdkBaseClassType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IExtendedPackage.CLIENT_COMPONENT__SDK_BASE_CLASS_TYPE, oldSdkBaseClassType, sdkBaseClassType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(byte[] newData) {
		byte[] oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IExtendedPackage.CLIENT_COMPONENT__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata(byte[] newMetadata) {
		byte[] oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IExtendedPackage.CLIENT_COMPONENT__METADATA, oldMetadata, metadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitMethodBody() {
		return initMethodBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitMethodBody(String newInitMethodBody) {
		String oldInitMethodBody = initMethodBody;
		initMethodBody = newInitMethodBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IExtendedPackage.CLIENT_COMPONENT__INIT_METHOD_BODY, oldInitMethodBody, initMethodBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAfterUpdateMethodBody() {
		return afterUpdateMethodBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterUpdateMethodBody(String newAfterUpdateMethodBody) {
		String oldAfterUpdateMethodBody = afterUpdateMethodBody;
		afterUpdateMethodBody = newAfterUpdateMethodBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IExtendedPackage.CLIENT_COMPONENT__AFTER_UPDATE_METHOD_BODY, oldAfterUpdateMethodBody, afterUpdateMethodBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeUpdateMethodBody() {
		return beforeUpdateMethodBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeUpdateMethodBody(String newBeforeUpdateMethodBody) {
		String oldBeforeUpdateMethodBody = beforeUpdateMethodBody;
		beforeUpdateMethodBody = newBeforeUpdateMethodBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IExtendedPackage.CLIENT_COMPONENT__BEFORE_UPDATE_METHOD_BODY, oldBeforeUpdateMethodBody, beforeUpdateMethodBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, Map<String, String>> getPropertiesBody() {
		return propertiesBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertiesBody(Map<String, Map<String, String>> newPropertiesBody) {
		Map<String, Map<String, String>> oldPropertiesBody = propertiesBody;
		propertiesBody = newPropertiesBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IExtendedPackage.CLIENT_COMPONENT__PROPERTIES_BODY, oldPropertiesBody, propertiesBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, String> getClassMethodsBody() {
		return classMethodsBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassMethodsBody(Map<String, String> newClassMethodsBody) {
		Map<String, String> oldClassMethodsBody = classMethodsBody;
		classMethodsBody = newClassMethodsBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IExtendedPackage.CLIENT_COMPONENT__CLASS_METHODS_BODY, oldClassMethodsBody, classMethodsBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, String> getLocalMethodsBody() {
		return localMethodsBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalMethodsBody(Map<String, String> newLocalMethodsBody) {
		Map<String, String> oldLocalMethodsBody = localMethodsBody;
		localMethodsBody = newLocalMethodsBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IExtendedPackage.CLIENT_COMPONENT__LOCAL_METHODS_BODY, oldLocalMethodsBody, localMethodsBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, String> getConstructorParameters() {
		return constructorParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructorParameters(Map<String, String> newConstructorParameters) {
		Map<String, String> oldConstructorParameters = constructorParameters;
		constructorParameters = newConstructorParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IExtendedPackage.CLIENT_COMPONENT__CONSTRUCTOR_PARAMETERS, oldConstructorParameters, constructorParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, String> getLocalVariables() {
		return localVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalVariables(Map<String, String> newLocalVariables) {
		Map<String, String> oldLocalVariables = localVariables;
		localVariables = newLocalVariables;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IExtendedPackage.CLIENT_COMPONENT__LOCAL_VARIABLES, oldLocalVariables, localVariables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, String> getConstants() {
		return constants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstants(Map<String, String> newConstants) {
		Map<String, String> oldConstants = constants;
		constants = newConstants;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IExtendedPackage.CLIENT_COMPONENT__CONSTANTS, oldConstants, constants));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IExtendedPackage.CLIENT_COMPONENT__SDK_BASE_CLASS_TYPE:
				return getSdkBaseClassType();
			case IExtendedPackage.CLIENT_COMPONENT__DATA:
				return getData();
			case IExtendedPackage.CLIENT_COMPONENT__METADATA:
				return getMetadata();
			case IExtendedPackage.CLIENT_COMPONENT__INIT_METHOD_BODY:
				return getInitMethodBody();
			case IExtendedPackage.CLIENT_COMPONENT__AFTER_UPDATE_METHOD_BODY:
				return getAfterUpdateMethodBody();
			case IExtendedPackage.CLIENT_COMPONENT__BEFORE_UPDATE_METHOD_BODY:
				return getBeforeUpdateMethodBody();
			case IExtendedPackage.CLIENT_COMPONENT__PROPERTIES_BODY:
				return getPropertiesBody();
			case IExtendedPackage.CLIENT_COMPONENT__CLASS_METHODS_BODY:
				return getClassMethodsBody();
			case IExtendedPackage.CLIENT_COMPONENT__LOCAL_METHODS_BODY:
				return getLocalMethodsBody();
			case IExtendedPackage.CLIENT_COMPONENT__CONSTRUCTOR_PARAMETERS:
				return getConstructorParameters();
			case IExtendedPackage.CLIENT_COMPONENT__LOCAL_VARIABLES:
				return getLocalVariables();
			case IExtendedPackage.CLIENT_COMPONENT__CONSTANTS:
				return getConstants();
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
			case IExtendedPackage.CLIENT_COMPONENT__SDK_BASE_CLASS_TYPE:
				setSdkBaseClassType((SDKBaseClassType)newValue);
				return;
			case IExtendedPackage.CLIENT_COMPONENT__DATA:
				setData((byte[])newValue);
				return;
			case IExtendedPackage.CLIENT_COMPONENT__METADATA:
				setMetadata((byte[])newValue);
				return;
			case IExtendedPackage.CLIENT_COMPONENT__INIT_METHOD_BODY:
				setInitMethodBody((String)newValue);
				return;
			case IExtendedPackage.CLIENT_COMPONENT__AFTER_UPDATE_METHOD_BODY:
				setAfterUpdateMethodBody((String)newValue);
				return;
			case IExtendedPackage.CLIENT_COMPONENT__BEFORE_UPDATE_METHOD_BODY:
				setBeforeUpdateMethodBody((String)newValue);
				return;
			case IExtendedPackage.CLIENT_COMPONENT__PROPERTIES_BODY:
				setPropertiesBody((Map<String, Map<String, String>>)newValue);
				return;
			case IExtendedPackage.CLIENT_COMPONENT__CLASS_METHODS_BODY:
				setClassMethodsBody((Map<String, String>)newValue);
				return;
			case IExtendedPackage.CLIENT_COMPONENT__LOCAL_METHODS_BODY:
				setLocalMethodsBody((Map<String, String>)newValue);
				return;
			case IExtendedPackage.CLIENT_COMPONENT__CONSTRUCTOR_PARAMETERS:
				setConstructorParameters((Map<String, String>)newValue);
				return;
			case IExtendedPackage.CLIENT_COMPONENT__LOCAL_VARIABLES:
				setLocalVariables((Map<String, String>)newValue);
				return;
			case IExtendedPackage.CLIENT_COMPONENT__CONSTANTS:
				setConstants((Map<String, String>)newValue);
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
			case IExtendedPackage.CLIENT_COMPONENT__SDK_BASE_CLASS_TYPE:
				setSdkBaseClassType(SDK_BASE_CLASS_TYPE_EDEFAULT);
				return;
			case IExtendedPackage.CLIENT_COMPONENT__DATA:
				setData(DATA_EDEFAULT);
				return;
			case IExtendedPackage.CLIENT_COMPONENT__METADATA:
				setMetadata(METADATA_EDEFAULT);
				return;
			case IExtendedPackage.CLIENT_COMPONENT__INIT_METHOD_BODY:
				setInitMethodBody(INIT_METHOD_BODY_EDEFAULT);
				return;
			case IExtendedPackage.CLIENT_COMPONENT__AFTER_UPDATE_METHOD_BODY:
				setAfterUpdateMethodBody(AFTER_UPDATE_METHOD_BODY_EDEFAULT);
				return;
			case IExtendedPackage.CLIENT_COMPONENT__BEFORE_UPDATE_METHOD_BODY:
				setBeforeUpdateMethodBody(BEFORE_UPDATE_METHOD_BODY_EDEFAULT);
				return;
			case IExtendedPackage.CLIENT_COMPONENT__PROPERTIES_BODY:
				setPropertiesBody((Map<String, Map<String, String>>)null);
				return;
			case IExtendedPackage.CLIENT_COMPONENT__CLASS_METHODS_BODY:
				setClassMethodsBody((Map<String, String>)null);
				return;
			case IExtendedPackage.CLIENT_COMPONENT__LOCAL_METHODS_BODY:
				setLocalMethodsBody((Map<String, String>)null);
				return;
			case IExtendedPackage.CLIENT_COMPONENT__CONSTRUCTOR_PARAMETERS:
				setConstructorParameters((Map<String, String>)null);
				return;
			case IExtendedPackage.CLIENT_COMPONENT__LOCAL_VARIABLES:
				setLocalVariables((Map<String, String>)null);
				return;
			case IExtendedPackage.CLIENT_COMPONENT__CONSTANTS:
				setConstants((Map<String, String>)null);
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
			case IExtendedPackage.CLIENT_COMPONENT__SDK_BASE_CLASS_TYPE:
				return sdkBaseClassType != SDK_BASE_CLASS_TYPE_EDEFAULT;
			case IExtendedPackage.CLIENT_COMPONENT__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
			case IExtendedPackage.CLIENT_COMPONENT__METADATA:
				return METADATA_EDEFAULT == null ? metadata != null : !METADATA_EDEFAULT.equals(metadata);
			case IExtendedPackage.CLIENT_COMPONENT__INIT_METHOD_BODY:
				return INIT_METHOD_BODY_EDEFAULT == null ? initMethodBody != null : !INIT_METHOD_BODY_EDEFAULT.equals(initMethodBody);
			case IExtendedPackage.CLIENT_COMPONENT__AFTER_UPDATE_METHOD_BODY:
				return AFTER_UPDATE_METHOD_BODY_EDEFAULT == null ? afterUpdateMethodBody != null : !AFTER_UPDATE_METHOD_BODY_EDEFAULT.equals(afterUpdateMethodBody);
			case IExtendedPackage.CLIENT_COMPONENT__BEFORE_UPDATE_METHOD_BODY:
				return BEFORE_UPDATE_METHOD_BODY_EDEFAULT == null ? beforeUpdateMethodBody != null : !BEFORE_UPDATE_METHOD_BODY_EDEFAULT.equals(beforeUpdateMethodBody);
			case IExtendedPackage.CLIENT_COMPONENT__PROPERTIES_BODY:
				return propertiesBody != null;
			case IExtendedPackage.CLIENT_COMPONENT__CLASS_METHODS_BODY:
				return classMethodsBody != null;
			case IExtendedPackage.CLIENT_COMPONENT__LOCAL_METHODS_BODY:
				return localMethodsBody != null;
			case IExtendedPackage.CLIENT_COMPONENT__CONSTRUCTOR_PARAMETERS:
				return constructorParameters != null;
			case IExtendedPackage.CLIENT_COMPONENT__LOCAL_VARIABLES:
				return localVariables != null;
			case IExtendedPackage.CLIENT_COMPONENT__CONSTANTS:
				return constants != null;
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
			case IExtendedPackage.CLIENT_COMPONENT___RENDER:
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
		result.append(" (sdkBaseClassType: ");
		result.append(sdkBaseClassType);
		result.append(", data: ");
		result.append(data);
		result.append(", metadata: ");
		result.append(metadata);
		result.append(", initMethodBody: ");
		result.append(initMethodBody);
		result.append(", afterUpdateMethodBody: ");
		result.append(afterUpdateMethodBody);
		result.append(", beforeUpdateMethodBody: ");
		result.append(beforeUpdateMethodBody);
		result.append(", propertiesBody: ");
		result.append(propertiesBody);
		result.append(", classMethodsBody: ");
		result.append(classMethodsBody);
		result.append(", localMethodsBody: ");
		result.append(localMethodsBody);
		result.append(", constructorParameters: ");
		result.append(constructorParameters);
		result.append(", localVariables: ");
		result.append(localVariables);
		result.append(", constants: ");
		result.append(constants);
		result.append(')');
		return result.toString();
	}

} //ClientComponent
