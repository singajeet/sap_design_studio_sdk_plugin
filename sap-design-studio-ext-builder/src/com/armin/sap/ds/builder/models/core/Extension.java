/**
 */
package com.armin.sap.ds.builder.models.core;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the root type for a Design Studio SDK extension.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Extension#getLicense <em>License</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Extension#getGroup <em>Group</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Extension#getComponent <em>Component</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Extension#getEula <em>Eula</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Extension#getId <em>Id</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Extension#getTitle <em>Title</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Extension#getVendor <em>Vendor</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.Extension#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see com.armin.sap.ds.builder.models.core.CorePackage#getExtension()
 * @model kind="class"
 *        extendedMetaData="name='Extension' kind='elementOnly'"
 * @generated
 */
public class Extension extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The default value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected String license = LICENSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> group;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * The default value of the '{@link #getEula() <em>Eula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEula()
	 * @generated
	 * @ordered
	 */
	protected static final String EULA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEula() <em>Eula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEula()
	 * @generated
	 * @ordered
	 */
	protected String eula = EULA_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Extension() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.EXTENSION;
	}

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             License agreement text
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getExtension_License()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='license' namespace='##targetNamespace'"
	 * @generated
	 */
	public String getLicense() {
		return license;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.Extension#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	public void setLicense(String newLicense) {
		String oldLicense = license;
		license = newLicense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXTENSION__LICENSE, oldLicense, license));
	}

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.core.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getExtension_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	public EList<Group> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<Group>(Group.class, this, CorePackage.EXTENSION__GROUP);
		}
		return group;
	}

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.core.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getExtension_Component()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace'"
	 * @generated
	 */
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<Component>(Component.class, this, CorePackage.EXTENSION__COMPONENT);
		}
		return component;
	}

	/**
	 * Returns the value of the '<em><b>Eula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           End user license agreement text.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eula</em>' attribute.
	 * @see #setEula(String)
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getExtension_Eula()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='eula'"
	 * @generated
	 */
	public String getEula() {
		return eula;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.Extension#getEula <em>Eula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eula</em>' attribute.
	 * @see #getEula()
	 * @generated
	 */
	public void setEula(String newEula) {
		String oldEula = eula;
		eula = newEula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXTENSION__EULA, oldEula, eula));
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Specifies an extension id to avoid name conflicts of an SDK extension and its extension
	 *           components with other SDK extensions and their extension components. The specified string
	 *           is combined with all extension component names in this SDK extension to create a unique
	 *           extension component id. Use a Java-like package notation, for example "com.samplecompany",
	 *           using lower-case letters, digits, and a period (.) as a delimiter.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getExtension_Id()
	 * @model dataType="com.armin.sap.ds.builder.models.core.IdType" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.Extension#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXTENSION__ID, oldId, id));
	}

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Title of the SDK extension.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getExtension_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.Extension#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXTENSION__TITLE, oldTitle, title));
	}

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Vendor name.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getExtension_Vendor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='vendor'"
	 * @generated
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.Extension#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	public void setVendor(String newVendor) {
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXTENSION__VENDOR, oldVendor, vendor));
	}

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Version number in major.minor format, for example "1.0".
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see com.armin.sap.ds.builder.models.core.CorePackage#getExtension_Version()
	 * @model dataType="com.armin.sap.ds.builder.models.core.VersionType" required="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.Extension#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXTENSION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.EXTENSION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.EXTENSION__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
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
			case CorePackage.EXTENSION__LICENSE:
				return getLicense();
			case CorePackage.EXTENSION__GROUP:
				return getGroup();
			case CorePackage.EXTENSION__COMPONENT:
				return getComponent();
			case CorePackage.EXTENSION__EULA:
				return getEula();
			case CorePackage.EXTENSION__ID:
				return getId();
			case CorePackage.EXTENSION__TITLE:
				return getTitle();
			case CorePackage.EXTENSION__VENDOR:
				return getVendor();
			case CorePackage.EXTENSION__VERSION:
				return getVersion();
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
			case CorePackage.EXTENSION__LICENSE:
				setLicense((String)newValue);
				return;
			case CorePackage.EXTENSION__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends Group>)newValue);
				return;
			case CorePackage.EXTENSION__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case CorePackage.EXTENSION__EULA:
				setEula((String)newValue);
				return;
			case CorePackage.EXTENSION__ID:
				setId((String)newValue);
				return;
			case CorePackage.EXTENSION__TITLE:
				setTitle((String)newValue);
				return;
			case CorePackage.EXTENSION__VENDOR:
				setVendor((String)newValue);
				return;
			case CorePackage.EXTENSION__VERSION:
				setVersion((String)newValue);
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
			case CorePackage.EXTENSION__LICENSE:
				setLicense(LICENSE_EDEFAULT);
				return;
			case CorePackage.EXTENSION__GROUP:
				getGroup().clear();
				return;
			case CorePackage.EXTENSION__COMPONENT:
				getComponent().clear();
				return;
			case CorePackage.EXTENSION__EULA:
				setEula(EULA_EDEFAULT);
				return;
			case CorePackage.EXTENSION__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.EXTENSION__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case CorePackage.EXTENSION__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case CorePackage.EXTENSION__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case CorePackage.EXTENSION__LICENSE:
				return LICENSE_EDEFAULT == null ? license != null : !LICENSE_EDEFAULT.equals(license);
			case CorePackage.EXTENSION__GROUP:
				return group != null && !group.isEmpty();
			case CorePackage.EXTENSION__COMPONENT:
				return component != null && !component.isEmpty();
			case CorePackage.EXTENSION__EULA:
				return EULA_EDEFAULT == null ? eula != null : !EULA_EDEFAULT.equals(eula);
			case CorePackage.EXTENSION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorePackage.EXTENSION__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case CorePackage.EXTENSION__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case CorePackage.EXTENSION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (license: ");
		result.append(license);
		result.append(", eula: ");
		result.append(eula);
		result.append(", id: ");
		result.append(id);
		result.append(", title: ");
		result.append(title);
		result.append(", vendor: ");
		result.append(vendor);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} // Extension
