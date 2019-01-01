/**
 */
package com.armin.sap.ds.builder.models.extended;

import com.armin.sap.ds.builder.models.core.IComponent;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getSdkBaseClassType <em>Sdk Base Class Type</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getData <em>Data</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getInitMethodBody <em>Init Method Body</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getAfterUpdateMethodBody <em>After Update Method Body</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getBeforeUpdateMethodBody <em>Before Update Method Body</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getPropertiesBody <em>Properties Body</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getClassMethodsBody <em>Class Methods Body</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getLocalMethodsBody <em>Local Methods Body</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getConstructorParameters <em>Constructor Parameters</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getConstants <em>Constants</em>}</li>
 * </ul>
 *
 * @see com.armin.sap.ds.builder.models.extended.IExtendedPackage#getClientComponent()
 * @model
 * @generated
 */
public interface IClientComponent extends IComponent {
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
	 * @see com.armin.sap.ds.builder.models.extended.IExtendedPackage#getClientComponent_SdkBaseClassType()
	 * @model default="COMPONENT"
	 * @generated
	 */
	SDKBaseClassType getSdkBaseClassType();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getSdkBaseClassType <em>Sdk Base Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sdk Base Class Type</em>' attribute.
	 * @see com.armin.sap.ds.builder.models.extended.SDKBaseClassType
	 * @see #getSdkBaseClassType()
	 * @generated
	 */
	void setSdkBaseClassType(SDKBaseClassType value);

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
	 * @see com.armin.sap.ds.builder.models.extended.IExtendedPackage#getClientComponent_Data()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 * @generated
	 */
	byte[] getData();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(byte[] value);

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
	 * @see com.armin.sap.ds.builder.models.extended.IExtendedPackage#getClientComponent_Metadata()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 * @generated
	 */
	byte[] getMetadata();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getMetadata <em>Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' attribute.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(byte[] value);

	/**
	 * Returns the value of the '<em><b>Init Method Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Method Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Method Body</em>' attribute.
	 * @see #setInitMethodBody(String)
	 * @see com.armin.sap.ds.builder.models.extended.IExtendedPackage#getClientComponent_InitMethodBody()
	 * @model
	 * @generated
	 */
	String getInitMethodBody();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getInitMethodBody <em>Init Method Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Method Body</em>' attribute.
	 * @see #getInitMethodBody()
	 * @generated
	 */
	void setInitMethodBody(String value);

	/**
	 * Returns the value of the '<em><b>After Update Method Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After Update Method Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Update Method Body</em>' attribute.
	 * @see #setAfterUpdateMethodBody(String)
	 * @see com.armin.sap.ds.builder.models.extended.IExtendedPackage#getClientComponent_AfterUpdateMethodBody()
	 * @model
	 * @generated
	 */
	String getAfterUpdateMethodBody();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getAfterUpdateMethodBody <em>After Update Method Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Update Method Body</em>' attribute.
	 * @see #getAfterUpdateMethodBody()
	 * @generated
	 */
	void setAfterUpdateMethodBody(String value);

	/**
	 * Returns the value of the '<em><b>Before Update Method Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Update Method Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Update Method Body</em>' attribute.
	 * @see #setBeforeUpdateMethodBody(String)
	 * @see com.armin.sap.ds.builder.models.extended.IExtendedPackage#getClientComponent_BeforeUpdateMethodBody()
	 * @model
	 * @generated
	 */
	String getBeforeUpdateMethodBody();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getBeforeUpdateMethodBody <em>Before Update Method Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Update Method Body</em>' attribute.
	 * @see #getBeforeUpdateMethodBody()
	 * @generated
	 */
	void setBeforeUpdateMethodBody(String value);

	/**
	 * Returns the value of the '<em><b>Properties Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties Body</em>' attribute.
	 * @see #setPropertiesBody(Map)
	 * @see com.armin.sap.ds.builder.models.extended.IExtendedPackage#getClientComponent_PropertiesBody()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, Map<String, String>> getPropertiesBody();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getPropertiesBody <em>Properties Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties Body</em>' attribute.
	 * @see #getPropertiesBody()
	 * @generated
	 */
	void setPropertiesBody(Map<String, Map<String, String>> value);

	/**
	 * Returns the value of the '<em><b>Class Methods Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Methods Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Methods Body</em>' attribute.
	 * @see #setClassMethodsBody(Map)
	 * @see com.armin.sap.ds.builder.models.extended.IExtendedPackage#getClientComponent_ClassMethodsBody()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, String> getClassMethodsBody();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getClassMethodsBody <em>Class Methods Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Methods Body</em>' attribute.
	 * @see #getClassMethodsBody()
	 * @generated
	 */
	void setClassMethodsBody(Map<String, String> value);

	/**
	 * Returns the value of the '<em><b>Local Methods Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Methods Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Methods Body</em>' attribute.
	 * @see #setLocalMethodsBody(Map)
	 * @see com.armin.sap.ds.builder.models.extended.IExtendedPackage#getClientComponent_LocalMethodsBody()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, String> getLocalMethodsBody();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getLocalMethodsBody <em>Local Methods Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Methods Body</em>' attribute.
	 * @see #getLocalMethodsBody()
	 * @generated
	 */
	void setLocalMethodsBody(Map<String, String> value);

	/**
	 * Returns the value of the '<em><b>Constructor Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constructor Parameters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructor Parameters</em>' attribute.
	 * @see #setConstructorParameters(Map)
	 * @see com.armin.sap.ds.builder.models.extended.IExtendedPackage#getClientComponent_ConstructorParameters()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, String> getConstructorParameters();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getConstructorParameters <em>Constructor Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constructor Parameters</em>' attribute.
	 * @see #getConstructorParameters()
	 * @generated
	 */
	void setConstructorParameters(Map<String, String> value);

	/**
	 * Returns the value of the '<em><b>Local Variables</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Variables</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Variables</em>' attribute.
	 * @see #setLocalVariables(Map)
	 * @see com.armin.sap.ds.builder.models.extended.IExtendedPackage#getClientComponent_LocalVariables()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, String> getLocalVariables();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getLocalVariables <em>Local Variables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Variables</em>' attribute.
	 * @see #getLocalVariables()
	 * @generated
	 */
	void setLocalVariables(Map<String, String> value);

	/**
	 * Returns the value of the '<em><b>Constants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constants</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constants</em>' attribute.
	 * @see #setConstants(Map)
	 * @see com.armin.sap.ds.builder.models.extended.IExtendedPackage#getClientComponent_Constants()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, String> getConstants();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.extended.IClientComponent#getConstants <em>Constants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constants</em>' attribute.
	 * @see #getConstants()
	 * @generated
	 */
	void setConstants(Map<String, String> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void render();

} // IClientComponent
