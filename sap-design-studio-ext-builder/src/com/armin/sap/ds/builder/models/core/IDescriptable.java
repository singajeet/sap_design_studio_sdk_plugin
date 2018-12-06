/**
 */
package com.armin.sap.ds.builder.models.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descriptable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IDescriptable#getId <em>Id</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IDescriptable#getTitle <em>Title</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IDescriptable#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IDescriptable#isVisible <em>Visible</em>}</li>
 * </ul>
 *
 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getDescriptable()
 * @model extendedMetaData="name='Descriptable' kind='empty'"
 * @generated
 */
public interface IDescriptable extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getDescriptable_Id()
	 * @model id="true" dataType="com.armin.sap.ds.builder.models.core.IdType1" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IDescriptable#getId <em>Id</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getDescriptable_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IDescriptable#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tooltip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tooltip</em>' attribute.
	 * @see #setTooltip(String)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getDescriptable_Tooltip()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='tooltip'"
	 * @generated
	 */
	String getTooltip();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IDescriptable#getTooltip <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tooltip</em>' attribute.
	 * @see #getTooltip()
	 * @generated
	 */
	void setTooltip(String value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #isSetVisible()
	 * @see #unsetVisible()
	 * @see #setVisible(boolean)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getDescriptable_Visible()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='visible'"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IDescriptable#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isSetVisible()
	 * @see #unsetVisible()
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Unsets the value of the '{@link com.armin.sap.ds.builder.models.core.IDescriptable#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisible()
	 * @see #isVisible()
	 * @see #setVisible(boolean)
	 * @generated
	 */
	void unsetVisible();

	/**
	 * Returns whether the value of the '{@link com.armin.sap.ds.builder.models.core.IDescriptable#isVisible <em>Visible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visible</em>' attribute is set.
	 * @see #unsetVisible()
	 * @see #isVisible()
	 * @see #setVisible(boolean)
	 * @generated
	 */
	boolean isSetVisible();

} // IDescriptable
