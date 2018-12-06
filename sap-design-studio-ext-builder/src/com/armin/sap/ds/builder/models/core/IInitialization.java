/**
 */
package com.armin.sap.ds.builder.models.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link com.armin.sap.ds.builder.models.core.IInitialization#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getInitialization()
 * @model extendedMetaData="name='Initialization' kind='elementOnly'"
 * @generated
 */
public interface IInitialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.core.IPropertyValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference list.
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getInitialization_DefaultValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IPropertyValue> getDefaultValue();

} // IInitialization
