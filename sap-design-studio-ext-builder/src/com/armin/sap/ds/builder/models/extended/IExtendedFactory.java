/**
 */
package com.armin.sap.ds.builder.models.extended;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.armin.sap.ds.builder.models.extended.IExtendedPackage
 * @generated
 */
public interface IExtendedFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IExtendedFactory eINSTANCE = com.armin.sap.ds.builder.models.extended.impl.ExtendedFactory.init();

	/**
	 * Returns a new object of class '<em>Client Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client Component</em>'.
	 * @generated
	 */
	IClientComponent createClientComponent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IExtendedPackage getExtendedPackage();

} //IExtendedFactory
