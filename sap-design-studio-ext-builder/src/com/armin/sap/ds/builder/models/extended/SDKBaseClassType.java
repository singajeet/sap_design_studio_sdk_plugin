/**
 */
package com.armin.sap.ds.builder.models.extended;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SDK Base Class Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.armin.sap.ds.builder.models.extended.ExtendedPackage#getSDKBaseClassType()
 * @model
 * @generated
 */
public enum SDKBaseClassType implements Enumerator {
	/**
	 * The '<em><b>COMPONENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPONENT(0, "COMPONENT", "COMPONENT"),

	/**
	 * The '<em><b>DATA SOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_SOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_SOURCE(1, "DATA_SOURCE", "DATA_SOURCE"),

	/**
	 * The '<em><b>DATA BUFFER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_BUFFER_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_BUFFER(2, "DATA_BUFFER", "DATA_BUFFER"),

	/**
	 * The '<em><b>UI5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UI5_VALUE
	 * @generated
	 * @ordered
	 */
	UI5(3, "UI5", "UI5");

	/**
	 * The '<em><b>COMPONENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPONENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPONENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_VALUE = 0;

	/**
	 * The '<em><b>DATA SOURCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATA SOURCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_SOURCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATA_SOURCE_VALUE = 1;

	/**
	 * The '<em><b>DATA BUFFER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATA BUFFER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_BUFFER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATA_BUFFER_VALUE = 2;

	/**
	 * The '<em><b>UI5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UI5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UI5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UI5_VALUE = 3;

	/**
	 * An array of all the '<em><b>SDK Base Class Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SDKBaseClassType[] VALUES_ARRAY =
		new SDKBaseClassType[] {
			COMPONENT,
			DATA_SOURCE,
			DATA_BUFFER,
			UI5,
		};

	/**
	 * A public read-only list of all the '<em><b>SDK Base Class Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SDKBaseClassType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SDK Base Class Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SDKBaseClassType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SDKBaseClassType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SDK Base Class Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SDKBaseClassType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SDKBaseClassType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SDK Base Class Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SDKBaseClassType get(int value) {
		switch (value) {
			case COMPONENT_VALUE: return COMPONENT;
			case DATA_SOURCE_VALUE: return DATA_SOURCE;
			case DATA_BUFFER_VALUE: return DATA_BUFFER;
			case UI5_VALUE: return UI5;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SDKBaseClassType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SDKBaseClassType
