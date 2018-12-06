/**
 */
package com.armin.sap.ds.builder.models.core;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies an extension component.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IComponent#getRequireJs <em>Require Js</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IComponent#getStdInclude <em>Std Include</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IComponent#getJsInclude <em>Js Include</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IComponent#getCssInclude <em>Css Include</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IComponent#getProperty <em>Property</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IComponent#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IComponent#getSupportedBackend <em>Supported Backend</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IComponent#isDatabound <em>Databound</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IComponent#getGroup <em>Group</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IComponent#getHandlerType <em>Handler Type</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IComponent#getIcon <em>Icon</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IComponent#getModes <em>Modes</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IComponent#getNewInstancePrefix <em>New Instance Prefix</em>}</li>
 *   <li>{@link com.armin.sap.ds.builder.models.core.IComponent#getPropertySheetPath <em>Property Sheet Path</em>}</li>
 * </ul>
 *
 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getComponent()
 * @model extendedMetaData="name='Component' kind='elementOnly'"
 * @generated
 */
public interface IComponent extends IDescriptable {
	/**
	 * Returns the value of the '<em><b>Require Js</b></em>' containment reference list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.core.IRequireJSType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Js</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Js</em>' containment reference list.
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getComponent_RequireJs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requireJs' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IRequireJSType> getRequireJs();

	/**
	 * Returns the value of the '<em><b>Std Include</b></em>' containment reference list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.core.IStdInclude}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Includes a JavaScript framework.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Std Include</em>' containment reference list.
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getComponent_StdInclude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stdInclude' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IStdInclude> getStdInclude();

	/**
	 * Returns the value of the '<em><b>Js Include</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 References a JavaScript file to include with this extension component. It is either
	 *                 a relative path to the root folder of the SDK extension or a fully qualified URL.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Js Include</em>' attribute list.
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getComponent_JsInclude()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='jsInclude' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getJsInclude();

	/**
	 * Returns the value of the '<em><b>Css Include</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 References a CSS file to include with this extension component. It is either a
	 *                 relative path to the root folder of the SDK extension or a fully qualified URL.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Css Include</em>' attribute list.
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getComponent_CssInclude()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='cssInclude' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getCssInclude();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.core.IProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Property of the extension component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getComponent_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Initialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initialization values of properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initialization</em>' containment reference.
	 * @see #setInitialization(IInitialization)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getComponent_Initialization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initialization' namespace='##targetNamespace'"
	 * @generated
	 */
	IInitialization getInitialization();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IComponent#getInitialization <em>Initialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialization</em>' containment reference.
	 * @see #getInitialization()
	 * @generated
	 */
	void setInitialization(IInitialization value);

	/**
	 * Returns the value of the '<em><b>Supported Backend</b></em>' attribute list.
	 * The list contents are of type {@link com.armin.sap.ds.builder.models.core.BackendSystemType}.
	 * The literals are from the enumeration {@link com.armin.sap.ds.builder.models.core.BackendSystemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Platform which supports this custom component. Specify one of the following values:
	 *                 LOCAL, BIPLATFORM, HANA, or NETWEAVER. If this element is unspecified, then all
	 *                 platforms support this extension component.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Backend</em>' attribute list.
	 * @see com.armin.sap.ds.builder.models.core.BackendSystemType
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getComponent_SupportedBackend()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='supportedBackend' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BackendSystemType> getSupportedBackend();

	/**
	 * Returns the value of the '<em><b>Databound</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Indicates if this extension component is data-bound (uses data sources).
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Databound</em>' attribute.
	 * @see #isSetDatabound()
	 * @see #unsetDatabound()
	 * @see #setDatabound(boolean)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getComponent_Databound()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='databound'"
	 * @generated
	 */
	boolean isDatabound();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IComponent#isDatabound <em>Databound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Databound</em>' attribute.
	 * @see #isSetDatabound()
	 * @see #unsetDatabound()
	 * @see #isDatabound()
	 * @generated
	 */
	void setDatabound(boolean value);

	/**
	 * Unsets the value of the '{@link com.armin.sap.ds.builder.models.core.IComponent#isDatabound <em>Databound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDatabound()
	 * @see #isDatabound()
	 * @see #setDatabound(boolean)
	 * @generated
	 */
	void unsetDatabound();

	/**
	 * Returns whether the value of the '{@link com.armin.sap.ds.builder.models.core.IComponent#isDatabound <em>Databound</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Databound</em>' attribute is set.
	 * @see #unsetDatabound()
	 * @see #isDatabound()
	 * @see #setDatabound(boolean)
	 * @generated
	 */
	boolean isSetDatabound();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Group in the Design Studio's Components view where this extension component is
	 *               displayed. Specify a custom group you have defined in this SDK extension, otherwise
	 *               this extension component is placed in the default Custom Component group.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getComponent_Group()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='group'"
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IComponent#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Returns the value of the '<em><b>Handler Type</b></em>' attribute.
	 * The default value is <code>"div"</code>.
	 * The literals are from the enumeration {@link com.armin.sap.ds.builder.models.core.HandlerTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Specifies the technology that implements this extension component. Specify one of the
	 *               following values: div, sapui5, datasource (default: div).
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handler Type</em>' attribute.
	 * @see com.armin.sap.ds.builder.models.core.HandlerTypes
	 * @see #isSetHandlerType()
	 * @see #unsetHandlerType()
	 * @see #setHandlerType(HandlerTypes)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getComponent_HandlerType()
	 * @model default="div" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='handlerType'"
	 * @generated
	 */
	HandlerTypes getHandlerType();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IComponent#getHandlerType <em>Handler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler Type</em>' attribute.
	 * @see com.armin.sap.ds.builder.models.core.HandlerTypes
	 * @see #isSetHandlerType()
	 * @see #unsetHandlerType()
	 * @see #getHandlerType()
	 * @generated
	 */
	void setHandlerType(HandlerTypes value);

	/**
	 * Unsets the value of the '{@link com.armin.sap.ds.builder.models.core.IComponent#getHandlerType <em>Handler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHandlerType()
	 * @see #getHandlerType()
	 * @see #setHandlerType(HandlerTypes)
	 * @generated
	 */
	void unsetHandlerType();

	/**
	 * Returns whether the value of the '{@link com.armin.sap.ds.builder.models.core.IComponent#getHandlerType <em>Handler Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Handler Type</em>' attribute is set.
	 * @see #unsetHandlerType()
	 * @see #getHandlerType()
	 * @see #setHandlerType(HandlerTypes)
	 * @generated
	 */
	boolean isSetHandlerType();

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               References an icon displayed with this extension component in Design Studio's
	 *               Components and Outline views. The path is relative to the root folder of the SDK
	 *               extension.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getComponent_Icon()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='icon'"
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IComponent#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

	/**
	 * Returns the value of the '<em><b>Modes</b></em>' attribute.
	 * The default value is <code>"commons"</code>.
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
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getComponent_Modes()
	 * @model default="commons" unsettable="true" dataType="com.armin.sap.ds.builder.models.core.UI5Modes" many="false"
	 *        extendedMetaData="kind='attribute' name='modes'"
	 * @generated
	 */
	List<UI5Mode> getModes();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IComponent#getModes <em>Modes</em>}' attribute.
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
	 * Unsets the value of the '{@link com.armin.sap.ds.builder.models.core.IComponent#getModes <em>Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModes()
	 * @see #getModes()
	 * @see #setModes(List)
	 * @generated
	 */
	void unsetModes();

	/**
	 * Returns whether the value of the '{@link com.armin.sap.ds.builder.models.core.IComponent#getModes <em>Modes</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>New Instance Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               Prefix of the name of a newly created instance of this extension component. If this
	 *               attribute is unspecified, then a default name of the form "extension component type
	 *               (upper-case) + integer counter" is used, for example COLOREDBOX_1.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>New Instance Prefix</em>' attribute.
	 * @see #setNewInstancePrefix(String)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getComponent_NewInstancePrefix()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='newInstancePrefix'"
	 * @generated
	 */
	String getNewInstancePrefix();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IComponent#getNewInstancePrefix <em>New Instance Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Instance Prefix</em>' attribute.
	 * @see #getNewInstancePrefix()
	 * @generated
	 */
	void setNewInstancePrefix(String value);

	/**
	 * Returns the value of the '<em><b>Property Sheet Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               References the HTML file of the Additional Properties Sheet. This file must be located
	 *               in the "res" folder of the extension component.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property Sheet Path</em>' attribute.
	 * @see #setPropertySheetPath(String)
	 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getComponent_PropertySheetPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='propertySheetPath'"
	 * @generated
	 */
	String getPropertySheetPath();

	/**
	 * Sets the value of the '{@link com.armin.sap.ds.builder.models.core.IComponent#getPropertySheetPath <em>Property Sheet Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Sheet Path</em>' attribute.
	 * @see #getPropertySheetPath()
	 * @generated
	 */
	void setPropertySheetPath(String value);

} // IComponent
