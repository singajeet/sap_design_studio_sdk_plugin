/**
 */
package com.armin.sap.ds.builder.models.core.impl;

import com.armin.sap.ds.builder.models.core.BackendSystemType;
import com.armin.sap.ds.builder.models.core.HandlerTypes;
import com.armin.sap.ds.builder.models.core.IComponent;
import com.armin.sap.ds.builder.models.core.ICoreFactory;
import com.armin.sap.ds.builder.models.core.ICorePackage;
import com.armin.sap.ds.builder.models.core.IDescriptable;
import com.armin.sap.ds.builder.models.core.IDocumentRoot;
import com.armin.sap.ds.builder.models.core.IExtension;
import com.armin.sap.ds.builder.models.core.IGroup;
import com.armin.sap.ds.builder.models.core.IInitialization;
import com.armin.sap.ds.builder.models.core.IOption;
import com.armin.sap.ds.builder.models.core.IPossibleValueType;
import com.armin.sap.ds.builder.models.core.IProperty;
import com.armin.sap.ds.builder.models.core.IPropertyValue;
import com.armin.sap.ds.builder.models.core.IRequireJSType;
import com.armin.sap.ds.builder.models.core.IStdInclude;
import com.armin.sap.ds.builder.models.core.KindType;
import com.armin.sap.ds.builder.models.core.PropertyType;
import com.armin.sap.ds.builder.models.core.UI5Mode;

import com.armin.sap.ds.builder.models.core.util.CoreValidator;

import com.armin.sap.ds.builder.models.extended.IExtendedPackage;

import com.armin.sap.ds.builder.models.extended.impl.ExtendedPackage;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorePackage extends EPackageImpl implements ICorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initializationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass possibleValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requireJSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stdIncludeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum backendSystemTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum handlerTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum kindTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ui5ModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType backendSystemTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType handlerTypesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kindTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ui5ModeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ui5ModesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackage() {
		super(eNS_URI, ICoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ICorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ICorePackage init() {
		if (isInited) return (ICorePackage)EPackage.Registry.INSTANCE.getEPackage(ICorePackage.eNS_URI);

		// Obtain or create and register package
		CorePackage theCorePackage = (CorePackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorePackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CorePackage());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ExtendedPackage theExtendedPackage = (ExtendedPackage)(EPackage.Registry.INSTANCE.getEPackage(IExtendedPackage.eNS_URI) instanceof ExtendedPackage ? EPackage.Registry.INSTANCE.getEPackage(IExtendedPackage.eNS_URI) : IExtendedPackage.eINSTANCE);

		// Create package meta-data objects
		theCorePackage.createPackageContents();
		theExtendedPackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theExtendedPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCorePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CoreValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ICorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_RequireJs() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_StdInclude() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_JsInclude() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_CssInclude() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Property() {
		return (EReference)componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Initialization() {
		return (EReference)componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_SupportedBackend() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Databound() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Group() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_HandlerType() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Icon() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Modes() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_NewInstancePrefix() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_PropertySheetPath() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptable() {
		return descriptableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptable_Id() {
		return (EAttribute)descriptableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptable_Title() {
		return (EAttribute)descriptableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptable_Tooltip() {
		return (EAttribute)descriptableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptable_Visible() {
		return (EAttribute)descriptableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SdkExtension() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtension() {
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_License() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_Group() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_Component() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_Eula() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_Id() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_Title() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_Vendor() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_Version() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialization() {
		return initializationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialization_DefaultValue() {
		return (EReference)initializationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Name() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Value() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPossibleValueType() {
		return possibleValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPossibleValueType_Value() {
		return (EAttribute)possibleValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPossibleValueType_Title() {
		return (EAttribute)possibleValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Property() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_PossibleValue() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Option() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Bindable() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Group() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Modes() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Renderable() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Transient() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Type() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyValue() {
		return propertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyValue_Value() {
		return (EAttribute)propertyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyValue_Property() {
		return (EAttribute)propertyValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequireJSType() {
		return requireJSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequireJSType_Value() {
		return (EAttribute)requireJSTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequireJSType_Modes() {
		return (EAttribute)requireJSTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStdInclude() {
		return stdIncludeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStdInclude_Kind() {
		return (EAttribute)stdIncludeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBackendSystemType() {
		return backendSystemTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHandlerTypes() {
		return handlerTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKindType() {
		return kindTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertyType() {
		return propertyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUI5Mode() {
		return ui5ModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBackendSystemTypeObject() {
		return backendSystemTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHandlerTypesObject() {
		return handlerTypesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIdType() {
		return idTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIdType1() {
		return idType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKindTypeObject() {
		return kindTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPropertyTypeObject() {
		return propertyTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUI5ModeObject() {
		return ui5ModeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUI5Modes() {
		return ui5ModesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVersionType() {
		return versionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICoreFactory getCoreFactory() {
		return (ICoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__REQUIRE_JS);
		createEReference(componentEClass, COMPONENT__STD_INCLUDE);
		createEAttribute(componentEClass, COMPONENT__JS_INCLUDE);
		createEAttribute(componentEClass, COMPONENT__CSS_INCLUDE);
		createEReference(componentEClass, COMPONENT__PROPERTY);
		createEReference(componentEClass, COMPONENT__INITIALIZATION);
		createEAttribute(componentEClass, COMPONENT__SUPPORTED_BACKEND);
		createEAttribute(componentEClass, COMPONENT__DATABOUND);
		createEAttribute(componentEClass, COMPONENT__GROUP);
		createEAttribute(componentEClass, COMPONENT__HANDLER_TYPE);
		createEAttribute(componentEClass, COMPONENT__ICON);
		createEAttribute(componentEClass, COMPONENT__MODES);
		createEAttribute(componentEClass, COMPONENT__NEW_INSTANCE_PREFIX);
		createEAttribute(componentEClass, COMPONENT__PROPERTY_SHEET_PATH);

		descriptableEClass = createEClass(DESCRIPTABLE);
		createEAttribute(descriptableEClass, DESCRIPTABLE__ID);
		createEAttribute(descriptableEClass, DESCRIPTABLE__TITLE);
		createEAttribute(descriptableEClass, DESCRIPTABLE__TOOLTIP);
		createEAttribute(descriptableEClass, DESCRIPTABLE__VISIBLE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SDK_EXTENSION);

		extensionEClass = createEClass(EXTENSION);
		createEAttribute(extensionEClass, EXTENSION__LICENSE);
		createEReference(extensionEClass, EXTENSION__GROUP);
		createEReference(extensionEClass, EXTENSION__COMPONENT);
		createEAttribute(extensionEClass, EXTENSION__EULA);
		createEAttribute(extensionEClass, EXTENSION__ID);
		createEAttribute(extensionEClass, EXTENSION__TITLE);
		createEAttribute(extensionEClass, EXTENSION__VENDOR);
		createEAttribute(extensionEClass, EXTENSION__VERSION);

		groupEClass = createEClass(GROUP);

		initializationEClass = createEClass(INITIALIZATION);
		createEReference(initializationEClass, INITIALIZATION__DEFAULT_VALUE);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__NAME);
		createEAttribute(optionEClass, OPTION__VALUE);

		possibleValueTypeEClass = createEClass(POSSIBLE_VALUE_TYPE);
		createEAttribute(possibleValueTypeEClass, POSSIBLE_VALUE_TYPE__VALUE);
		createEAttribute(possibleValueTypeEClass, POSSIBLE_VALUE_TYPE__TITLE);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__PROPERTY);
		createEReference(propertyEClass, PROPERTY__POSSIBLE_VALUE);
		createEReference(propertyEClass, PROPERTY__OPTION);
		createEAttribute(propertyEClass, PROPERTY__BINDABLE);
		createEAttribute(propertyEClass, PROPERTY__GROUP);
		createEAttribute(propertyEClass, PROPERTY__MODES);
		createEAttribute(propertyEClass, PROPERTY__RENDERABLE);
		createEAttribute(propertyEClass, PROPERTY__TRANSIENT);
		createEAttribute(propertyEClass, PROPERTY__TYPE);

		propertyValueEClass = createEClass(PROPERTY_VALUE);
		createEAttribute(propertyValueEClass, PROPERTY_VALUE__VALUE);
		createEAttribute(propertyValueEClass, PROPERTY_VALUE__PROPERTY);

		requireJSTypeEClass = createEClass(REQUIRE_JS_TYPE);
		createEAttribute(requireJSTypeEClass, REQUIRE_JS_TYPE__VALUE);
		createEAttribute(requireJSTypeEClass, REQUIRE_JS_TYPE__MODES);

		stdIncludeEClass = createEClass(STD_INCLUDE);
		createEAttribute(stdIncludeEClass, STD_INCLUDE__KIND);

		// Create enums
		backendSystemTypeEEnum = createEEnum(BACKEND_SYSTEM_TYPE);
		handlerTypesEEnum = createEEnum(HANDLER_TYPES);
		kindTypeEEnum = createEEnum(KIND_TYPE);
		propertyTypeEEnum = createEEnum(PROPERTY_TYPE);
		ui5ModeEEnum = createEEnum(UI5_MODE);

		// Create data types
		backendSystemTypeObjectEDataType = createEDataType(BACKEND_SYSTEM_TYPE_OBJECT);
		handlerTypesObjectEDataType = createEDataType(HANDLER_TYPES_OBJECT);
		idTypeEDataType = createEDataType(ID_TYPE);
		idType1EDataType = createEDataType(ID_TYPE1);
		kindTypeObjectEDataType = createEDataType(KIND_TYPE_OBJECT);
		propertyTypeObjectEDataType = createEDataType(PROPERTY_TYPE_OBJECT);
		ui5ModeObjectEDataType = createEDataType(UI5_MODE_OBJECT);
		ui5ModesEDataType = createEDataType(UI5_MODES);
		versionTypeEDataType = createEDataType(VERSION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentEClass.getESuperTypes().add(this.getDescriptable());
		descriptableEClass.getESuperTypes().add(ecorePackage.getEObject());
		groupEClass.getESuperTypes().add(this.getDescriptable());
		propertyEClass.getESuperTypes().add(this.getDescriptable());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentEClass, IComponent.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_RequireJs(), this.getRequireJSType(), null, "requireJs", null, 0, -1, IComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_StdInclude(), this.getStdInclude(), null, "stdInclude", null, 0, -1, IComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_JsInclude(), theXMLTypePackage.getString(), "jsInclude", null, 0, -1, IComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_CssInclude(), theXMLTypePackage.getString(), "cssInclude", null, 0, -1, IComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Property(), this.getProperty(), null, "property", null, 0, -1, IComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Initialization(), this.getInitialization(), null, "initialization", null, 0, 1, IComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_SupportedBackend(), this.getBackendSystemType(), "supportedBackend", null, 0, -1, IComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Databound(), theXMLTypePackage.getBoolean(), "databound", "false", 0, 1, IComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Group(), theXMLTypePackage.getString(), "group", null, 0, 1, IComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_HandlerType(), this.getHandlerTypes(), "handlerType", "div", 0, 1, IComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Icon(), theXMLTypePackage.getString(), "icon", null, 0, 1, IComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Modes(), this.getUI5Modes(), "modes", "commons", 0, 1, IComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_NewInstancePrefix(), theXMLTypePackage.getString(), "newInstancePrefix", null, 0, 1, IComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_PropertySheetPath(), theXMLTypePackage.getString(), "propertySheetPath", null, 0, 1, IComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptableEClass, IDescriptable.class, "Descriptable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescriptable_Id(), this.getIdType1(), "id", null, 1, 1, IDescriptable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptable_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, IDescriptable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptable_Tooltip(), theXMLTypePackage.getString(), "tooltip", null, 0, 1, IDescriptable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptable_Visible(), theXMLTypePackage.getBoolean(), "visible", "true", 0, 1, IDescriptable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, IDocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SdkExtension(), this.getExtension(), null, "sdkExtension", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(extensionEClass, IExtension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtension_License(), theXMLTypePackage.getString(), "license", null, 0, 1, IExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_Group(), this.getGroup(), null, "group", null, 0, -1, IExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_Component(), this.getComponent(), null, "component", null, 0, -1, IExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_Eula(), theXMLTypePackage.getString(), "eula", null, 0, 1, IExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_Id(), this.getIdType(), "id", null, 1, 1, IExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, IExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_Vendor(), theXMLTypePackage.getString(), "vendor", null, 1, 1, IExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_Version(), this.getVersionType(), "version", null, 1, 1, IExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, IGroup.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initializationEClass, IInitialization.class, "Initialization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitialization_DefaultValue(), this.getPropertyValue(), null, "defaultValue", null, 0, -1, IInitialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, IOption.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, IOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, IOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(possibleValueTypeEClass, IPossibleValueType.class, "PossibleValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPossibleValueType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, IPossibleValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPossibleValueType_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, IPossibleValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, IProperty.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_Property(), this.getProperty(), null, "property", null, 0, -1, IProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_PossibleValue(), this.getPossibleValueType(), null, "possibleValue", null, 0, -1, IProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Option(), this.getOption(), null, "option", null, 0, -1, IProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Bindable(), theXMLTypePackage.getBoolean(), "bindable", "false", 0, 1, IProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Group(), theXMLTypePackage.getString(), "group", null, 0, 1, IProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Modes(), this.getUI5Modes(), "modes", "commons m", 0, 1, IProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Renderable(), theXMLTypePackage.getBoolean(), "renderable", "true", 0, 1, IProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Transient(), theXMLTypePackage.getBoolean(), "transient", "false", 0, 1, IProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Type(), this.getPropertyType(), "type", null, 1, 1, IProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyValueEClass, IPropertyValue.class, "PropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyValue_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, IPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyValue_Property(), theXMLTypePackage.getString(), "property", null, 1, 1, IPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requireJSTypeEClass, IRequireJSType.class, "RequireJSType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequireJSType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, IRequireJSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequireJSType_Modes(), this.getUI5Modes(), "modes", null, 1, 1, IRequireJSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stdIncludeEClass, IStdInclude.class, "StdInclude", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStdInclude_Kind(), this.getKindType(), "kind", null, 1, 1, IStdInclude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(backendSystemTypeEEnum, BackendSystemType.class, "BackendSystemType");
		addEEnumLiteral(backendSystemTypeEEnum, BackendSystemType.LOCAL);
		addEEnumLiteral(backendSystemTypeEEnum, BackendSystemType.BIPLATFORM);
		addEEnumLiteral(backendSystemTypeEEnum, BackendSystemType.NETWEAVER);
		addEEnumLiteral(backendSystemTypeEEnum, BackendSystemType.HANA);

		initEEnum(handlerTypesEEnum, HandlerTypes.class, "HandlerTypes");
		addEEnumLiteral(handlerTypesEEnum, HandlerTypes.DIV);
		addEEnumLiteral(handlerTypesEEnum, HandlerTypes.SAPUI5);
		addEEnumLiteral(handlerTypesEEnum, HandlerTypes.CVOM);
		addEEnumLiteral(handlerTypesEEnum, HandlerTypes.DATASOURCE);

		initEEnum(kindTypeEEnum, KindType.class, "KindType");
		addEEnumLiteral(kindTypeEEnum, KindType.D3);
		addEEnumLiteral(kindTypeEEnum, KindType.CVOM);

		initEEnum(propertyTypeEEnum, PropertyType.class, "PropertyType");
		addEEnumLiteral(propertyTypeEEnum, PropertyType.STRING);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.TEXT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.INT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.FLOAT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.BOOLEAN);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.SCRIPT_TEXT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.MULTI_LINE_TEXT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.COLOR);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.URL);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.RESULT_CELL);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.RESULT_CELL_SET);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.RESULT_CELL_LIST);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.RESULT_SET);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.OBJECT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.ARRAY);

		initEEnum(ui5ModeEEnum, UI5Mode.class, "UI5Mode");
		addEEnumLiteral(ui5ModeEEnum, UI5Mode.COMMONS);
		addEEnumLiteral(ui5ModeEEnum, UI5Mode.M);

		// Initialize data types
		initEDataType(backendSystemTypeObjectEDataType, BackendSystemType.class, "BackendSystemTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(handlerTypesObjectEDataType, HandlerTypes.class, "HandlerTypesObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(idTypeEDataType, String.class, "IdType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(idType1EDataType, String.class, "IdType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kindTypeObjectEDataType, KindType.class, "KindTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(propertyTypeObjectEDataType, PropertyType.class, "PropertyTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ui5ModeObjectEDataType, UI5Mode.class, "UI5ModeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ui5ModesEDataType, List.class, "UI5Modes", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionTypeEDataType, String.class, "VersionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (backendSystemTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "BackendSystemType"
		   });	
		addAnnotation
		  (backendSystemTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "BackendSystemType:Object",
			 "baseType", "BackendSystemType"
		   });	
		addAnnotation
		  (componentEClass, 
		   source, 
		   new String[] {
			 "name", "Component",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getComponent_RequireJs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "requireJs",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getComponent_StdInclude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stdInclude",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getComponent_JsInclude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "jsInclude",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getComponent_CssInclude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cssInclude",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getComponent_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getComponent_Initialization(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "initialization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getComponent_SupportedBackend(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "supportedBackend",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getComponent_Databound(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "databound"
		   });	
		addAnnotation
		  (getComponent_Group(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "group"
		   });	
		addAnnotation
		  (getComponent_HandlerType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "handlerType"
		   });	
		addAnnotation
		  (getComponent_Icon(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "icon"
		   });	
		addAnnotation
		  (getComponent_Modes(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "modes"
		   });	
		addAnnotation
		  (getComponent_NewInstancePrefix(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "newInstancePrefix"
		   });	
		addAnnotation
		  (getComponent_PropertySheetPath(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "propertySheetPath"
		   });	
		addAnnotation
		  (descriptableEClass, 
		   source, 
		   new String[] {
			 "name", "Descriptable",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getDescriptable_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });	
		addAnnotation
		  (getDescriptable_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });	
		addAnnotation
		  (getDescriptable_Tooltip(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "tooltip"
		   });	
		addAnnotation
		  (getDescriptable_Visible(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "visible"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_SdkExtension(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sdkExtension",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (extensionEClass, 
		   source, 
		   new String[] {
			 "name", "Extension",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getExtension_License(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "license",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExtension_Group(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "group",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExtension_Component(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "component",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExtension_Eula(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "eula"
		   });	
		addAnnotation
		  (getExtension_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });	
		addAnnotation
		  (getExtension_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });	
		addAnnotation
		  (getExtension_Vendor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "vendor"
		   });	
		addAnnotation
		  (getExtension_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });	
		addAnnotation
		  (groupEClass, 
		   source, 
		   new String[] {
			 "name", "Group",
			 "kind", "empty"
		   });	
		addAnnotation
		  (handlerTypesEEnum, 
		   source, 
		   new String[] {
			 "name", "HandlerTypes"
		   });	
		addAnnotation
		  (handlerTypesObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "HandlerTypes:Object",
			 "baseType", "HandlerTypes"
		   });	
		addAnnotation
		  (idTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "id_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "([a-z|\\d])+(\\.([a-z]|\\d)+)*"
		   });	
		addAnnotation
		  (idType1EDataType, 
		   source, 
		   new String[] {
			 "name", "id_._1_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "([a-z|A-Z|\\d|/])+"
		   });	
		addAnnotation
		  (initializationEClass, 
		   source, 
		   new String[] {
			 "name", "Initialization",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getInitialization_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "defaultValue",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (kindTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "kind_._type"
		   });	
		addAnnotation
		  (kindTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "kind_._type:Object",
			 "baseType", "kind_._type"
		   });	
		addAnnotation
		  (optionEClass, 
		   source, 
		   new String[] {
			 "name", "Option",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getOption_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getOption_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (possibleValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PossibleValueType",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getPossibleValueType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getPossibleValueType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });	
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
			 "name", "Property",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getProperty_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_PossibleValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "possibleValue",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Option(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "option",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProperty_Bindable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "bindable"
		   });	
		addAnnotation
		  (getProperty_Group(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "group"
		   });	
		addAnnotation
		  (getProperty_Modes(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "modes"
		   });	
		addAnnotation
		  (getProperty_Renderable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "renderable"
		   });	
		addAnnotation
		  (getProperty_Transient(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transient"
		   });	
		addAnnotation
		  (getProperty_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });	
		addAnnotation
		  (propertyTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "PropertyType"
		   });	
		addAnnotation
		  (propertyTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "PropertyType:Object",
			 "baseType", "PropertyType"
		   });	
		addAnnotation
		  (propertyValueEClass, 
		   source, 
		   new String[] {
			 "name", "PropertyValue",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getPropertyValue_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getPropertyValue_Property(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "property"
		   });	
		addAnnotation
		  (requireJSTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RequireJSType",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getRequireJSType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getRequireJSType_Modes(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "modes"
		   });	
		addAnnotation
		  (stdIncludeEClass, 
		   source, 
		   new String[] {
			 "name", "StdInclude",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getStdInclude_Kind(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kind"
		   });	
		addAnnotation
		  (ui5ModeEEnum, 
		   source, 
		   new String[] {
			 "name", "UI5Mode"
		   });	
		addAnnotation
		  (ui5ModeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "UI5Mode:Object",
			 "baseType", "UI5Mode"
		   });	
		addAnnotation
		  (ui5ModesEDataType, 
		   source, 
		   new String[] {
			 "name", "UI5Modes",
			 "itemType", "UI5Mode"
		   });	
		addAnnotation
		  (versionTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "version_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "\\d+\\.\\d+"
		   });
	}

} //CorePackage
