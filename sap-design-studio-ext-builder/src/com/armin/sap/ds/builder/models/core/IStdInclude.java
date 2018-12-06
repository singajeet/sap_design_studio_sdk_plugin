/**
 */
package com.armin.sap.ds.builder.models.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Std Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Includes a JavaScript framework shipped with Design Studio.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IStdInclude#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getStdInclude()
 * @model extendedMetaData="name='StdInclude' kind='empty'"
 * @generated
 */
public interface IStdInclude extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link com.armin.sap.ds.builder.models.core.KindType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see com.armin.sap.ds.builder.models.core.KindType
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(KindType)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getStdInclude_Kind()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='kind'"
	 * @generated
	 */
	KindType getKind();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IStdInclude#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see com.armin.sap.ds.builder.models.core.KindType
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	void setKind(KindType value);

	/**
	 * Unsets the value of the '{@link com.armin.sap.ds.builder.models.core.IStdInclude#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(KindType)
	 * @generated
	 */
	void unsetKind();

	/**
	 * Returns whether the value of the '{@link com.armin.sap.ds.builder.models.core.IStdInclude#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(KindType)
	 * @generated
	 */
	boolean isSetKind();

} // IStdInclude
