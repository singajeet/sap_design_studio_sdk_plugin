/**
 */
package com.armin.sap.ds.builder.models.core;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Specifies a custom group in Design Studio's views. A custom group in the Components view
 *         contains extension components. A custom group in the Properties view contains properties of
 *         an extension component.
 *       
 * <!-- end-model-doc -->
 *
 *
 * @see com.armin.sap.ds.builder.models.core.CorePackage#getGroup()
 * @model kind="class"
 *        extendedMetaData="name='Group' kind='empty'"
 * @generated
 */
public class Group extends Descriptable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Group() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.GROUP;
	}

} // Group
