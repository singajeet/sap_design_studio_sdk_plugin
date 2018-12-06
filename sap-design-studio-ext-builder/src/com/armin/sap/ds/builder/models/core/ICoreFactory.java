/**
 */
package com.armin.sap.ds.builder.models.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.armin.sap.ds.builder.models.core.ICorePackage
 * @generated
 */
public interface ICoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ICoreFactory eINSTANCE = com.armin.sap.ds.builder.models.core.impl.CoreFactory.init();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	IComponent createComponent();

	/**
	 * Returns a new object of class '<em>Descriptable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Descriptable</em>'.
	 * @generated
	 */
	IDescriptable createDescriptable();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	IDocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension</em>'.
	 * @generated
	 */
	IExtension createExtension();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	IGroup createGroup();

	/**
	 * Returns a new object of class '<em>Initialization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initialization</em>'.
	 * @generated
	 */
	IInitialization createInitialization();

	/**
	 * Returns a new object of class '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option</em>'.
	 * @generated
	 */
	IOption createOption();

	/**
	 * Returns a new object of class '<em>Possible Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Possible Value Type</em>'.
	 * @generated
	 */
	IPossibleValueType createPossibleValueType();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	IProperty createProperty();

	/**
	 * Returns a new object of class '<em>Property Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Value</em>'.
	 * @generated
	 */
	IPropertyValue createPropertyValue();

	/**
	 * Returns a new object of class '<em>Require JS Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Require JS Type</em>'.
	 * @generated
	 */
	IRequireJSType createRequireJSType();

	/**
	 * Returns a new object of class '<em>Std Include</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Std Include</em>'.
	 * @generated
	 */
	IStdInclude createStdInclude();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ICorePackage getCorePackage();

} //ICoreFactory
