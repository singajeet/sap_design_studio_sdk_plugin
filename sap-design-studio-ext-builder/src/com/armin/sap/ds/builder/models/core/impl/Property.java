/**
 */
package com.armin.sap.ds.builder.models.core.impl;

import com.armin.sap.ds.builder.models.core.ICoreFactory;
import com.armin.sap.ds.builder.models.core.ICorePackage;
import com.armin.sap.ds.builder.models.core.IOption;
import com.armin.sap.ds.builder.models.core.IPossibleValueType;
import com.armin.sap.ds.builder.models.core.IProperty;
import com.armin.sap.ds.builder.models.core.PropertyType;
import com.armin.sap.ds.builder.models.core.UI5Mode;

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
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.Property#getProperty <em>Property</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.Property#getPossibleValue <em>Possible Value</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.Property#getOption <em>Option</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.Property#isBindable <em>Bindable</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.Property#getGroup <em>Group</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.Property#getModes <em>Modes</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.Property#isRenderable <em>Renderable</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.Property#isTransient <em>Transient</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.impl.Property#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Property extends Descriptable implements IProperty {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<IProperty> property;

	/**
	 * The cached value of the '{@link #getPossibleValue() <em>Possible Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleValue()
	 * @generated
	 * @ordered
	 */
	protected EList<IPossibleValueType> possibleValue;

	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected EList<IOption> option;

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
	protected static final List<UI5Mode> MODES_EDEFAULT = (List<UI5Mode>)ICoreFactory.eINSTANCE.createFromString(ICorePackage.eINSTANCE.getUI5Modes(), "commons m");

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
		return ICorePackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<IProperty>(IProperty.class, this, ICorePackage.PROPERTY__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IPossibleValueType> getPossibleValue() {
		if (possibleValue == null) {
			possibleValue = new EObjectContainmentEList<IPossibleValueType>(IPossibleValueType.class, this, ICorePackage.PROPERTY__POSSIBLE_VALUE);
		}
		return possibleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IOption> getOption() {
		if (option == null) {
			option = new EObjectContainmentEList<IOption>(IOption.class, this, ICorePackage.PROPERTY__OPTION);
		}
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBindable() {
		return bindable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindable(boolean newBindable) {
		boolean oldBindable = bindable;
		bindable = newBindable;
		boolean oldBindableESet = bindableESet;
		bindableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICorePackage.PROPERTY__BINDABLE, oldBindable, bindable, !oldBindableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBindable() {
		boolean oldBindable = bindable;
		boolean oldBindableESet = bindableESet;
		bindable = BINDABLE_EDEFAULT;
		bindableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ICorePackage.PROPERTY__BINDABLE, oldBindable, BINDABLE_EDEFAULT, oldBindableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBindable() {
		return bindableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICorePackage.PROPERTY__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<UI5Mode> getModes() {
		return modes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModes(List<UI5Mode> newModes) {
		List<UI5Mode> oldModes = modes;
		modes = newModes;
		boolean oldModesESet = modesESet;
		modesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICorePackage.PROPERTY__MODES, oldModes, modes, !oldModesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModes() {
		List<UI5Mode> oldModes = modes;
		boolean oldModesESet = modesESet;
		modes = MODES_EDEFAULT;
		modesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ICorePackage.PROPERTY__MODES, oldModes, MODES_EDEFAULT, oldModesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModes() {
		return modesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRenderable() {
		return renderable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRenderable(boolean newRenderable) {
		boolean oldRenderable = renderable;
		renderable = newRenderable;
		boolean oldRenderableESet = renderableESet;
		renderableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICorePackage.PROPERTY__RENDERABLE, oldRenderable, renderable, !oldRenderableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRenderable() {
		boolean oldRenderable = renderable;
		boolean oldRenderableESet = renderableESet;
		renderable = RENDERABLE_EDEFAULT;
		renderableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ICorePackage.PROPERTY__RENDERABLE, oldRenderable, RENDERABLE_EDEFAULT, oldRenderableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRenderable() {
		return renderableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransient() {
		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransient(boolean newTransient) {
		boolean oldTransient = transient_;
		transient_ = newTransient;
		boolean oldTransientESet = transientESet;
		transientESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICorePackage.PROPERTY__TRANSIENT, oldTransient, transient_, !oldTransientESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransient() {
		boolean oldTransient = transient_;
		boolean oldTransientESet = transientESet;
		transient_ = TRANSIENT_EDEFAULT;
		transientESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ICorePackage.PROPERTY__TRANSIENT, oldTransient, TRANSIENT_EDEFAULT, oldTransientESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransient() {
		return transientESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PropertyType newType) {
		PropertyType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ICorePackage.PROPERTY__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		PropertyType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ICorePackage.PROPERTY__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
			case ICorePackage.PROPERTY__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case ICorePackage.PROPERTY__POSSIBLE_VALUE:
				return ((InternalEList<?>)getPossibleValue()).basicRemove(otherEnd, msgs);
			case ICorePackage.PROPERTY__OPTION:
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
			case ICorePackage.PROPERTY__PROPERTY:
				return getProperty();
			case ICorePackage.PROPERTY__POSSIBLE_VALUE:
				return getPossibleValue();
			case ICorePackage.PROPERTY__OPTION:
				return getOption();
			case ICorePackage.PROPERTY__BINDABLE:
				return isBindable();
			case ICorePackage.PROPERTY__GROUP:
				return getGroup();
			case ICorePackage.PROPERTY__MODES:
				return getModes();
			case ICorePackage.PROPERTY__RENDERABLE:
				return isRenderable();
			case ICorePackage.PROPERTY__TRANSIENT:
				return isTransient();
			case ICorePackage.PROPERTY__TYPE:
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
			case ICorePackage.PROPERTY__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends IProperty>)newValue);
				return;
			case ICorePackage.PROPERTY__POSSIBLE_VALUE:
				getPossibleValue().clear();
				getPossibleValue().addAll((Collection<? extends IPossibleValueType>)newValue);
				return;
			case ICorePackage.PROPERTY__OPTION:
				getOption().clear();
				getOption().addAll((Collection<? extends IOption>)newValue);
				return;
			case ICorePackage.PROPERTY__BINDABLE:
				setBindable((Boolean)newValue);
				return;
			case ICorePackage.PROPERTY__GROUP:
				setGroup((String)newValue);
				return;
			case ICorePackage.PROPERTY__MODES:
				setModes((List<UI5Mode>)newValue);
				return;
			case ICorePackage.PROPERTY__RENDERABLE:
				setRenderable((Boolean)newValue);
				return;
			case ICorePackage.PROPERTY__TRANSIENT:
				setTransient((Boolean)newValue);
				return;
			case ICorePackage.PROPERTY__TYPE:
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
			case ICorePackage.PROPERTY__PROPERTY:
				getProperty().clear();
				return;
			case ICorePackage.PROPERTY__POSSIBLE_VALUE:
				getPossibleValue().clear();
				return;
			case ICorePackage.PROPERTY__OPTION:
				getOption().clear();
				return;
			case ICorePackage.PROPERTY__BINDABLE:
				unsetBindable();
				return;
			case ICorePackage.PROPERTY__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case ICorePackage.PROPERTY__MODES:
				unsetModes();
				return;
			case ICorePackage.PROPERTY__RENDERABLE:
				unsetRenderable();
				return;
			case ICorePackage.PROPERTY__TRANSIENT:
				unsetTransient();
				return;
			case ICorePackage.PROPERTY__TYPE:
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
			case ICorePackage.PROPERTY__PROPERTY:
				return property != null && !property.isEmpty();
			case ICorePackage.PROPERTY__POSSIBLE_VALUE:
				return possibleValue != null && !possibleValue.isEmpty();
			case ICorePackage.PROPERTY__OPTION:
				return option != null && !option.isEmpty();
			case ICorePackage.PROPERTY__BINDABLE:
				return isSetBindable();
			case ICorePackage.PROPERTY__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
			case ICorePackage.PROPERTY__MODES:
				return isSetModes();
			case ICorePackage.PROPERTY__RENDERABLE:
				return isSetRenderable();
			case ICorePackage.PROPERTY__TRANSIENT:
				return isSetTransient();
			case ICorePackage.PROPERTY__TYPE:
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

} //Property
