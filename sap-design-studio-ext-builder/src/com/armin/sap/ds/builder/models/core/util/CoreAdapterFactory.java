/**
 */
package com.armin.sap.ds.builder.models.core.util;

import com.armin.sap.ds.builder.models.core.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.armin.sap.ds.builder.models.core.ICorePackage
 * @generated
 */
public class CoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ICorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ICorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreSwitch<Adapter> modelSwitch =
		new CoreSwitch<Adapter>() {
			@Override
			public Adapter caseComponent(IComponent object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseDescriptable(IDescriptable object) {
				return createDescriptableAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(IDocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseExtension(IExtension object) {
				return createExtensionAdapter();
			}
			@Override
			public Adapter caseGroup(IGroup object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseInitialization(IInitialization object) {
				return createInitializationAdapter();
			}
			@Override
			public Adapter caseOption(IOption object) {
				return createOptionAdapter();
			}
			@Override
			public Adapter casePossibleValueType(IPossibleValueType object) {
				return createPossibleValueTypeAdapter();
			}
			@Override
			public Adapter caseProperty(IProperty object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter casePropertyValue(IPropertyValue object) {
				return createPropertyValueAdapter();
			}
			@Override
			public Adapter caseRequireJSType(IRequireJSType object) {
				return createRequireJSTypeAdapter();
			}
			@Override
			public Adapter caseStdInclude(IStdInclude object) {
				return createStdIncludeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.armin.sap.ds.builder.models.core.IComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.armin.sap.ds.builder.models.core.IComponent
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.armin.sap.ds.builder.models.core.IDescriptable <em>Descriptable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.armin.sap.ds.builder.models.core.IDescriptable
	 * @generated
	 */
	public Adapter createDescriptableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.armin.sap.ds.builder.models.core.IDocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.armin.sap.ds.builder.models.core.IDocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.armin.sap.ds.builder.models.core.IExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.armin.sap.ds.builder.models.core.IExtension
	 * @generated
	 */
	public Adapter createExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.armin.sap.ds.builder.models.core.IGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.armin.sap.ds.builder.models.core.IGroup
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.armin.sap.ds.builder.models.core.IInitialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.armin.sap.ds.builder.models.core.IInitialization
	 * @generated
	 */
	public Adapter createInitializationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.armin.sap.ds.builder.models.core.IOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.armin.sap.ds.builder.models.core.IOption
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.armin.sap.ds.builder.models.core.IPossibleValueType <em>Possible Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.armin.sap.ds.builder.models.core.IPossibleValueType
	 * @generated
	 */
	public Adapter createPossibleValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.armin.sap.ds.builder.models.core.IProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.armin.sap.ds.builder.models.core.IProperty
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.armin.sap.ds.builder.models.core.IPropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.armin.sap.ds.builder.models.core.IPropertyValue
	 * @generated
	 */
	public Adapter createPropertyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.armin.sap.ds.builder.models.core.IRequireJSType <em>Require JS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.armin.sap.ds.builder.models.core.IRequireJSType
	 * @generated
	 */
	public Adapter createRequireJSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.armin.sap.ds.builder.models.core.IStdInclude <em>Std Include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.armin.sap.ds.builder.models.core.IStdInclude
	 * @generated
	 */
	public Adapter createStdIncludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CoreAdapterFactory
