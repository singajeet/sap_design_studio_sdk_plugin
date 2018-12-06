/**
 */
package com.armin.sap.ds.builder.models.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the root type for a Design Studio SDK extension.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IExtension#getLicense <em>License</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IExtension#getGroup <em>Group</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IExtension#getComponent <em>Component</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IExtension#getEula <em>Eula</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IExtension#getId <em>Id</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IExtension#getTitle <em>Title</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IExtension#getVendor <em>Vendor</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IExtension#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getExtension()
 * @model extendedMetaData="name='Extension' kind='elementOnly'"
 * @generated
 */
public interface IExtension extends EObject {
	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             License agreement text
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getExtension_License()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='license' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IExtension#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.core.IGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getExtension_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IGroup> getGroup();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.core.IComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getExtension_Component()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IComponent> getComponent();

	/**
	 * Returns the value of the '<em><b>Eula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           End user license agreement text.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eula</em>' attribute.
	 * @see #setEula(String)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getExtension_Eula()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='eula'"
	 * @generated
	 */
	String getEula();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IExtension#getEula <em>Eula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eula</em>' attribute.
	 * @see #getEula()
	 * @generated
	 */
	void setEula(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Specifies an extension id to avoid name conflicts of an SDK extension and its extension
	 *           components with other SDK extensions and their extension components. The specified string
	 *           is combined with all extension component names in this SDK extension to create a unique
	 *           extension component id. Use a Java-like package notation, for example "com.samplecompany",
	 *           using lower-case letters, digits, and a period (.) as a delimiter.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getExtension_Id()
	 * @model dataType="com.armin.sap.ds.builder.models.core.IdType" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IExtension#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Title of the SDK extension.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getExtension_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IExtension#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Vendor name.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getExtension_Vendor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='vendor'"
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IExtension#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Version number in major.minor format, for example "1.0".
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getExtension_Version()
	 * @model dataType="com.armin.sap.ds.builder.models.core.VersionType" required="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IExtension#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // IExtension
