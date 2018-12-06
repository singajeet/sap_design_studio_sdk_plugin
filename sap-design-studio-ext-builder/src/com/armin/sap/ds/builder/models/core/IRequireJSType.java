/**
 */
package com.armin.sap.ds.builder.models.core;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Require JS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IRequireJSType#getValue <em>Value</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IRequireJSType#getModes <em>Modes</em>}</li>
 * </ul>
 *
 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getRequireJSType()
 * @model extendedMetaData="name='RequireJSType' kind='simple'"
 * @generated
 */
public interface IRequireJSType extends EObject {
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
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getRequireJSType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IRequireJSType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Modes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modes</em>' attribute.
	 * @see #setModes(List)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getRequireJSType_Modes()
	 * @model dataType="com.armin.sap.ds.builder.models.core.UI5Modes" required="true" many="false"
	 *        extendedMetaData="kind='attribute' name='modes'"
	 * @generated
	 */
	List<UI5Mode> getModes();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IRequireJSType#getModes <em>Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modes</em>' attribute.
	 * @see #getModes()
	 * @generated
	 */
	void setModes(List<UI5Mode> value);

} // IRequireJSType
