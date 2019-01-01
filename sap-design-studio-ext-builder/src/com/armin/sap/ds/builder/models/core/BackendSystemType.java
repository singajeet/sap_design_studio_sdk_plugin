/**
 */
package com.armin.sap.ds.builder.models.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Backend System Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.armin.sap.ds.builder.models.core.CorePackage#getBackendSystemType()
 * @model extendedMetaData="name='BackendSystemType'"
 * @generated
 */
public enum BackendSystemType implements Enumerator {
	/**
	 * The '<em><b>LOCAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL(0, "LOCAL", "LOCAL"),

	/**
	 * The '<em><b>BIPLATFORM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIPLATFORM_VALUE
	 * @generated
	 * @ordered
	 */
	BIPLATFORM(1, "BIPLATFORM", "BIPLATFORM"),

	/**
	 * The '<em><b>NETWEAVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWEAVER_VALUE
	 * @generated
	 * @ordered
	 */
	NETWEAVER(2, "NETWEAVER", "NETWEAVER"),

	/**
	 * The '<em><b>HANA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HANA_VALUE
	 * @generated
	 * @ordered
	 */
	HANA(3, "HANA", "HANA");

	/**
	 * The '<em><b>LOCAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOCAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_VALUE = 0;

	/**
	 * The '<em><b>BIPLATFORM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BIPLATFORM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIPLATFORM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIPLATFORM_VALUE = 1;

	/**
	 * The '<em><b>NETWEAVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NETWEAVER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NETWEAVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NETWEAVER_VALUE = 2;

	/**
	 * The '<em><b>HANA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HANA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HANA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HANA_VALUE = 3;

	/**
	 * An array of all the '<em><b>Backend System Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BackendSystemType[] VALUES_ARRAY =
		new BackendSystemType[] {
			LOCAL,
			BIPLATFORM,
			NETWEAVER,
			HANA,
		};

	/**
	 * A public read-only list of all the '<em><b>Backend System Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BackendSystemType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Backend System Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BackendSystemType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BackendSystemType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Backend System Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BackendSystemType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BackendSystemType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Backend System Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BackendSystemType get(int value) {
		switch (value) {
			case LOCAL_VALUE: return LOCAL;
			case BIPLATFORM_VALUE: return BIPLATFORM;
			case NETWEAVER_VALUE: return NETWEAVER;
			case HANA_VALUE: return HANA;
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
	private BackendSystemType(int value, String name, String literal) {
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
	
} //BackendSystemType
