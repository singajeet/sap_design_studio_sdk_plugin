/**
 */
package com.armin.sap.ds.builder.models.core;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Property of this extension component.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IProperty#getProperty <em>Property</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IProperty#getPossibleValue <em>Possible Value</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IProperty#getOption <em>Option</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IProperty#isBindable <em>Bindable</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IProperty#getGroup <em>Group</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IProperty#getModes <em>Modes</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IProperty#isRenderable <em>Renderable</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IProperty#isTransient <em>Transient</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IProperty#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getProperty()
 * @model extendedMetaData="name='Property' kind='elementOnly'"
 * @generated
 */
public interface IProperty extends IDescriptable {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.core.IProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getProperty_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Possible Value</b></em>' containment reference list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.core.IPossibleValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possible Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possible Value</em>' containment reference list.
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getProperty_PossibleValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='possibleValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IPossibleValueType> getPossibleValue();

	/**
	 * Returns the value of the '<em><b>Option</b></em>' containment reference list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.core.IOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' containment reference list.
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getProperty_Option()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='option' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IOption> getOption();

	/**
	 * Returns the value of the '<em><b>Bindable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindable</em>' attribute.
	 * @see #isSetBindable()
	 * @see #unsetBindable()
	 * @see #setBindable(boolean)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getProperty_Bindable()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='bindable'"
	 * @generated
	 */
	boolean isBindable();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IProperty#isBindable <em>Bindable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindable</em>' attribute.
	 * @see #isSetBindable()
	 * @see #unsetBindable()
	 * @see #isBindable()
	 * @generated
	 */
	void setBindable(boolean value);

	/**
	 * Unsets the value of the '{@link com.armin.sap.ds.builder.models.core.IProperty#isBindable <em>Bindable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBindable()
	 * @see #isBindable()
	 * @see #setBindable(boolean)
	 * @generated
	 */
	void unsetBindable();

	/**
	 * Returns whether the value of the '{@link com.armin.sap.ds.builder.models.core.IProperty#isBindable <em>Bindable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bindable</em>' attribute is set.
	 * @see #unsetBindable()
	 * @see #isBindable()
	 * @see #setBindable(boolean)
	 * @generated
	 */
	boolean isSetBindable();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Group in the Design Studio's Properties view where this property is displayed. Specify
	 *               a custom group you have defined in this SDK extension or one of the following values:
	 *               Display, DataBinding, or Events (default: Display).
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getProperty_Group()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='group'"
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IProperty#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Returns the value of the '<em><b>Modes</b></em>' attribute.
	 * The default value is <code>"commons m"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modes</em>' attribute.
	 * @see #isSetModes()
	 * @see #unsetModes()
	 * @see #setModes(List)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getProperty_Modes()
	 * @model default="commons m" unsettable="true" dataType="com.armin.sap.ds.builder.models.core.UI5Modes" many="false"
	 *        extendedMetaData="kind='attribute' name='modes'"
	 * @generated
	 */
	List<UI5Mode> getModes();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IProperty#getModes <em>Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modes</em>' attribute.
	 * @see #isSetModes()
	 * @see #unsetModes()
	 * @see #getModes()
	 * @generated
	 */
	void setModes(List<UI5Mode> value);

	/**
	 * Unsets the value of the '{@link com.armin.sap.ds.builder.models.core.IProperty#getModes <em>Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModes()
	 * @see #getModes()
	 * @see #setModes(List)
	 * @generated
	 */
	void unsetModes();

	/**
	 * Returns whether the value of the '{@link com.armin.sap.ds.builder.models.core.IProperty#getModes <em>Modes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modes</em>' attribute is set.
	 * @see #unsetModes()
	 * @see #getModes()
	 * @see #setModes(List)
	 * @generated
	 */
	boolean isSetModes();

	/**
	 * Returns the value of the '<em><b>Renderable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Renderable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Renderable</em>' attribute.
	 * @see #isSetRenderable()
	 * @see #unsetRenderable()
	 * @see #setRenderable(boolean)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getProperty_Renderable()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='renderable'"
	 * @generated
	 */
	boolean isRenderable();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IProperty#isRenderable <em>Renderable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Renderable</em>' attribute.
	 * @see #isSetRenderable()
	 * @see #unsetRenderable()
	 * @see #isRenderable()
	 * @generated
	 */
	void setRenderable(boolean value);

	/**
	 * Unsets the value of the '{@link com.armin.sap.ds.builder.models.core.IProperty#isRenderable <em>Renderable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRenderable()
	 * @see #isRenderable()
	 * @see #setRenderable(boolean)
	 * @generated
	 */
	void unsetRenderable();

	/**
	 * Returns whether the value of the '{@link com.armin.sap.ds.builder.models.core.IProperty#isRenderable <em>Renderable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Renderable</em>' attribute is set.
	 * @see #unsetRenderable()
	 * @see #isRenderable()
	 * @see #setRenderable(boolean)
	 * @generated
	 */
	boolean isSetRenderable();

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #isSetTransient()
	 * @see #unsetTransient()
	 * @see #setTransient(boolean)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getProperty_Transient()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='transient'"
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IProperty#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isSetTransient()
	 * @see #unsetTransient()
	 * @see #isTransient()
	 * @generated
	 */
	void setTransient(boolean value);

	/**
	 * Unsets the value of the '{@link com.armin.sap.ds.builder.models.core.IProperty#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransient()
	 * @see #isTransient()
	 * @see #setTransient(boolean)
	 * @generated
	 */
	void unsetTransient();

	/**
	 * Returns whether the value of the '{@link com.armin.sap.ds.builder.models.core.IProperty#isTransient <em>Transient</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transient</em>' attribute is set.
	 * @see #unsetTransient()
	 * @see #isTransient()
	 * @see #setTransient(boolean)
	 * @generated
	 */
	boolean isSetTransient();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.armin.sap.ds.builder.models.core.PropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.armin.sap.ds.builder.models.core.PropertyType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(PropertyType)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getProperty_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	PropertyType getType();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IProperty#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.armin.sap.ds.builder.models.core.PropertyType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(PropertyType value);

	/**
	 * Unsets the value of the '{@link com.armin.sap.ds.builder.models.core.IProperty#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(PropertyType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link com.armin.sap.ds.builder.models.core.IProperty#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(PropertyType)
	 * @generated
	 */
	boolean isSetType();

} // IProperty
