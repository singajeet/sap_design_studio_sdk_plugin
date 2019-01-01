/**
 */
package com.armin.sap.ds.builder.models.core;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link com.armin.sap.ds.builder.models.core.Property#getProperty <em>Property</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Property#getPossibleValue <em>Possible Value</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Property#getOption <em>Option</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Property#isBindable <em>Bindable</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Property#getGroup <em>Group</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Property#getModes <em>Modes</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Property#isRenderable <em>Renderable</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Property#isTransient <em>Transient</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Property#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.armin.sap.ds.builder.models.core.CorePackage#getProperty()
 * @model kind="class"
 *        extendedMetaData="name='Property' kind='elementOnly'"
 * @generated
 */
public class Property extends Descriptable {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> property;

	/**
	 * The cached value of the '{@link #getPossibleValue() <em>Possible Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleValue()
	 * @generated
	 * @ordered
	 */
	protected EList<PossibleValueType> possibleValue;

	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> option;

	/**
	 * The default value of the '{@link #isBindable() <em>Bindable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBindable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BINDABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBindable() <em>Bindable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBindable()
	 * @generated
	 * @ordered
	 */
	protected boolean bindable = BINDABLE_EDEFAULT;

	/**
	 * This is true if the Bindable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bindableESet;

	/**
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getModes() <em>Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModes()
	 * @generated
	 * @ordered
	 */
	@SuppressWarnings("unchecked")
	protected static final List<UI5Mode> MODES_EDEFAULT = (List<UI5Mode>)CoreFactory.eINSTANCE.createFromString(CorePackage.eINSTANCE.getUI5Modes(), "commons m");

	/**
	 * The cached value of the '{@link #getModes() <em>Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModes()
	 * @generated
	 * @ordered
	 */
	protected List<UI5Mode> modes = MODES_EDEFAULT;

	/**
	 * This is true if the Modes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modesESet;

	/**
	 * The default value of the '{@link #isRenderable() <em>Renderable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRenderable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RENDERABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isRenderable() <em>Renderable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRenderable()
	 * @generated
	 * @ordered
	 */
	protected boolean renderable = RENDERABLE_EDEFAULT;

	/**
	 * This is true if the Renderable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean renderableESet;

	/**
	 * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected boolean transient_ = TRANSIENT_EDEFAULT;

	/**
	 * This is true if the Transient attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transientESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyType TYPE_EDEFAULT = PropertyType.STRING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PropertyType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Property() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.PROPERTY;
	}

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.core.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getProperty_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<Property>(Property.class, this, CorePackage.PROPERTY__PROPERTY);
		}
		return property;
	}

	/**
	 * Returns the value of the '<em><b>Possible Value</b></em>' containment reference list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.core.PossibleValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possible Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possible Value</em>' containment reference list.
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getProperty_PossibleValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='possibleValue' namespace='##targetNamespace'"
	 * @generated
	 */
	public EList<PossibleValueType> getPossibleValue() {
		if (possibleValue == null) {
			possibleValue = new EObjectContainmentEList<PossibleValueType>(PossibleValueType.class, this, CorePackage.PROPERTY__POSSIBLE_VALUE);
		}
		return possibleValue;
	}

	/**
	 * Returns the value of the '<em><b>Option</b></em>' containment reference list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.core.Option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' containment reference list.
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getProperty_Option()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='option' namespace='##targetNamespace'"
	 * @generated
	 */
	public EList<Option> getOption() {
		if (option == null) {
			option = new EObjectContainmentEList<Option>(Option.class, this, CorePackage.PROPERTY__OPTION);
		}
		return option;
	}

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
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getProperty_Bindable()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='bindable'"
	 * @generated
	 */
	public boolean isBindable() {
		return bindable;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.Property#isBindable <em>Bindable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindable</em>' attribute.
	 * @see #isSetBindable()
	 * @see #unsetBindable()
	 * @see #isBindable()
	 * @generated
	 */
	public void setBindable(boolean newBindable) {
		boolean oldBindable = bindable;
		bindable = newBindable;
		boolean oldBindableESet = bindableESet;
		bindableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PROPERTY__BINDABLE, oldBindable, bindable, !oldBindableESet));
	}

	/**
	 * Unsets the value of the '{@link com.armin.sap.ds.builder.models.core.Property#isBindable <em>Bindable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBindable()
	 * @see #isBindable()
	 * @see #setBindable(boolean)
	 * @generated
	 */
	public void unsetBindable() {
		boolean oldBindable = bindable;
		boolean oldBindableESet = bindableESet;
		bindable = BINDABLE_EDEFAULT;
		bindableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.PROPERTY__BINDABLE, oldBindable, BINDABLE_EDEFAULT, oldBindableESet));
	}

	/**
	 * Returns whether the value of the '{@link com.armin.sap.ds.builder.models.core.Property#isBindable <em>Bindable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bindable</em>' attribute is set.
	 * @see #unsetBindable()
	 * @see #isBindable()
	 * @see #setBindable(boolean)
	 * @generated
	 */
	public boolean isSetBindable() {
		return bindableESet;
	}

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
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getProperty_Group()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='group'"
	 * @generated
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.Property#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PROPERTY__GROUP, oldGroup, group));
	}

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
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getProperty_Modes()
	 * @model default="commons m" unsettable="true" dataType="com.armin.sap.ds.builder.models.core.UI5Modes" many="false"
	 *        extendedMetaData="kind='attribute' name='modes'"
	 * @generated
	 */
	public List<UI5Mode> getModes() {
		return modes;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.Property#getModes <em>Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modes</em>' attribute.
	 * @see #isSetModes()
	 * @see #unsetModes()
	 * @see #getModes()
	 * @generated
	 */
	public void setModes(List<UI5Mode> newModes) {
		List<UI5Mode> oldModes = modes;
		modes = newModes;
		boolean oldModesESet = modesESet;
		modesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PROPERTY__MODES, oldModes, modes, !oldModesESet));
	}

	/**
	 * Unsets the value of the '{@link com.armin.sap.ds.builder.models.core.Property#getModes <em>Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModes()
	 * @see #getModes()
	 * @see #setModes(List)
	 * @generated
	 */
	public void unsetModes() {
		List<UI5Mode> oldModes = modes;
		boolean oldModesESet = modesESet;
		modes = MODES_EDEFAULT;
		modesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.PROPERTY__MODES, oldModes, MODES_EDEFAULT, oldModesESet));
	}

	/**
	 * Returns whether the value of the '{@link com.armin.sap.ds.builder.models.core.Property#getModes <em>Modes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modes</em>' attribute is set.
	 * @see #unsetModes()
	 * @see #getModes()
	 * @see #setModes(List)
	 * @generated
	 */
	public boolean isSetModes() {
		return modesESet;
	}

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
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getProperty_Renderable()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='renderable'"
	 * @generated
	 */
	public boolean isRenderable() {
		return renderable;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.Property#isRenderable <em>Renderable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Renderable</em>' attribute.
	 * @see #isSetRenderable()
	 * @see #unsetRenderable()
	 * @see #isRenderable()
	 * @generated
	 */
	public void setRenderable(boolean newRenderable) {
		boolean oldRenderable = renderable;
		renderable = newRenderable;
		boolean oldRenderableESet = renderableESet;
		renderableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PROPERTY__RENDERABLE, oldRenderable, renderable, !oldRenderableESet));
	}

	/**
	 * Unsets the value of the '{@link com.armin.sap.ds.builder.models.core.Property#isRenderable <em>Renderable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRenderable()
	 * @see #isRenderable()
	 * @see #setRenderable(boolean)
	 * @generated
	 */
	public void unsetRenderable() {
		boolean oldRenderable = renderable;
		boolean oldRenderableESet = renderableESet;
		renderable = RENDERABLE_EDEFAULT;
		renderableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.PROPERTY__RENDERABLE, oldRenderable, RENDERABLE_EDEFAULT, oldRenderableESet));
	}

	/**
	 * Returns whether the value of the '{@link com.armin.sap.ds.builder.models.core.Property#isRenderable <em>Renderable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Renderable</em>' attribute is set.
	 * @see #unsetRenderable()
	 * @see #isRenderable()
	 * @see #setRenderable(boolean)
	 * @generated
	 */
	public boolean isSetRenderable() {
		return renderableESet;
	}

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
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getProperty_Transient()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='transient'"
	 * @generated
	 */
	public boolean isTransient() {
		return transient_;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.Property#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isSetTransient()
	 * @see #unsetTransient()
	 * @see #isTransient()
	 * @generated
	 */
	public void setTransient(boolean newTransient) {
		boolean oldTransient = transient_;
		transient_ = newTransient;
		boolean oldTransientESet = transientESet;
		transientESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PROPERTY__TRANSIENT, oldTransient, transient_, !oldTransientESet));
	}

	/**
	 * Unsets the value of the '{@link com.armin.sap.ds.builder.models.core.Property#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransient()
	 * @see #isTransient()
	 * @see #setTransient(boolean)
	 * @generated
	 */
	public void unsetTransient() {
		boolean oldTransient = transient_;
		boolean oldTransientESet = transientESet;
		transient_ = TRANSIENT_EDEFAULT;
		transientESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.PROPERTY__TRANSIENT, oldTransient, TRANSIENT_EDEFAULT, oldTransientESet));
	}

	/**
	 * Returns whether the value of the '{@link com.armin.sap.ds.builder.models.core.Property#isTransient <em>Transient</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transient</em>' attribute is set.
	 * @see #unsetTransient()
	 * @see #isTransient()
	 * @see #setTransient(boolean)
	 * @generated
	 */
	public boolean isSetTransient() {
		return transientESet;
	}

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
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getProperty_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	public PropertyType getType() {
		return type;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.Property#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.armin.sap.ds.builder.models.core.PropertyType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	public void setType(PropertyType newType) {
		PropertyType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PROPERTY__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * Unsets the value of the '{@link com.armin.sap.ds.builder.models.core.Property#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(PropertyType)
	 * @generated
	 */
	public void unsetType() {
		PropertyType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.PROPERTY__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * Returns whether the value of the '{@link com.armin.sap.ds.builder.models.core.Property#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(PropertyType)
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.PROPERTY__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case CorePackage.PROPERTY__POSSIBLE_VALUE:
				return ((InternalEList<?>)getPossibleValue()).basicRemove(otherEnd, msgs);
			case CorePackage.PROPERTY__OPTION:
				return ((InternalEList<?>)getOption()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.PROPERTY__PROPERTY:
				return getProperty();
			case CorePackage.PROPERTY__POSSIBLE_VALUE:
				return getPossibleValue();
			case CorePackage.PROPERTY__OPTION:
				return getOption();
			case CorePackage.PROPERTY__BINDABLE:
				return isBindable();
			case CorePackage.PROPERTY__GROUP:
				return getGroup();
			case CorePackage.PROPERTY__MODES:
				return getModes();
			case CorePackage.PROPERTY__RENDERABLE:
				return isRenderable();
			case CorePackage.PROPERTY__TRANSIENT:
				return isTransient();
			case CorePackage.PROPERTY__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.PROPERTY__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case CorePackage.PROPERTY__POSSIBLE_VALUE:
				getPossibleValue().clear();
				getPossibleValue().addAll((Collection<? extends PossibleValueType>)newValue);
				return;
			case CorePackage.PROPERTY__OPTION:
				getOption().clear();
				getOption().addAll((Collection<? extends Option>)newValue);
				return;
			case CorePackage.PROPERTY__BINDABLE:
				setBindable((Boolean)newValue);
				return;
			case CorePackage.PROPERTY__GROUP:
				setGroup((String)newValue);
				return;
			case CorePackage.PROPERTY__MODES:
				setModes((List<UI5Mode>)newValue);
				return;
			case CorePackage.PROPERTY__RENDERABLE:
				setRenderable((Boolean)newValue);
				return;
			case CorePackage.PROPERTY__TRANSIENT:
				setTransient((Boolean)newValue);
				return;
			case CorePackage.PROPERTY__TYPE:
				setType((PropertyType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.PROPERTY__PROPERTY:
				getProperty().clear();
				return;
			case CorePackage.PROPERTY__POSSIBLE_VALUE:
				getPossibleValue().clear();
				return;
			case CorePackage.PROPERTY__OPTION:
				getOption().clear();
				return;
			case CorePackage.PROPERTY__BINDABLE:
				unsetBindable();
				return;
			case CorePackage.PROPERTY__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case CorePackage.PROPERTY__MODES:
				unsetModes();
				return;
			case CorePackage.PROPERTY__RENDERABLE:
				unsetRenderable();
				return;
			case CorePackage.PROPERTY__TRANSIENT:
				unsetTransient();
				return;
			case CorePackage.PROPERTY__TYPE:
				unsetType();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.PROPERTY__PROPERTY:
				return property != null && !property.isEmpty();
			case CorePackage.PROPERTY__POSSIBLE_VALUE:
				return possibleValue != null && !possibleValue.isEmpty();
			case CorePackage.PROPERTY__OPTION:
				return option != null && !option.isEmpty();
			case CorePackage.PROPERTY__BINDABLE:
				return isSetBindable();
			case CorePackage.PROPERTY__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
			case CorePackage.PROPERTY__MODES:
				return isSetModes();
			case CorePackage.PROPERTY__RENDERABLE:
				return isSetRenderable();
			case CorePackage.PROPERTY__TRANSIENT:
				return isSetTransient();
			case CorePackage.PROPERTY__TYPE:
				return isSetType();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bindable: ");
		if (bindableESet) result.append(bindable); else result.append("<unset>");
		result.append(", group: ");
		result.append(group);
		result.append(", modes: ");
		if (modesESet) result.append(modes); else result.append("<unset>");
		result.append(", renderable: ");
		if (renderableESet) result.append(renderable); else result.append("<unset>");
		result.append(", transient: ");
		if (transientESet) result.append(transient_); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Property
