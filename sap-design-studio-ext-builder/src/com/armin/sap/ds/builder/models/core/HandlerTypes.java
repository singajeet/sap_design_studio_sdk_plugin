/**
 */
package com.armin.sap.ds.builder.models.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Handler Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *         Specifies the technology that implements this custom component. It defines the JavaScript 
 *         format of your handler file.
 *       
 * <!-- end-model-doc -->
 * @see com.armin.sap.ds.builder.models.core.CorePackage#getHandlerTypes()
 * @model extendedMetaData="name='HandlerTypes'"
 * @generated
 */
public enum HandlerTypes implements Enumerator {
	/**
	 * The '<em><b>Div</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIV_VALUE
	 * @generated
	 * @ordered
	 */
	DIV(0, "div", "div"),

	/**
	 * The '<em><b>Sapui5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAPUI5_VALUE
	 * @generated
	 * @ordered
	 */
	SAPUI5(1, "sapui5", "sapui5"),

	/**
	 * The '<em><b>Cvom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CVOM_VALUE
	 * @generated
	 * @ordered
	 */
	CVOM(2, "cvom", "cvom"),

	/**
	 * The '<em><b>Datasource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATASOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	DATASOURCE(3, "datasource", "datasource");

	/**
	 * The '<em><b>Div</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Div</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIV
	 * @model name="div"
	 * @generated
	 * @ordered
	 */
	public static final int DIV_VALUE = 0;

	/**
	 * The '<em><b>Sapui5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sapui5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAPUI5
	 * @model name="sapui5"
	 * @generated
	 * @ordered
	 */
	public static final int SAPUI5_VALUE = 1;

	/**
	 * The '<em><b>Cvom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cvom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CVOM
	 * @model name="cvom"
	 * @generated
	 * @ordered
	 */
	public static final int CVOM_VALUE = 2;

	/**
	 * The '<em><b>Datasource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Datasource</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATASOURCE
	 * @model name="datasource"
	 * @generated
	 * @ordered
	 */
	public static final int DATASOURCE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Handler Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HandlerTypes[] VALUES_ARRAY =
		new HandlerTypes[] {
			DIV,
			SAPUI5,
			CVOM,
			DATASOURCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Handler Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HandlerTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Handler Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HandlerTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HandlerTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Handler Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HandlerTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HandlerTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Handler Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HandlerTypes get(int value) {
		switch (value) {
			case DIV_VALUE: return DIV;
			case SAPUI5_VALUE: return SAPUI5;
			case CVOM_VALUE: return CVOM;
			case DATASOURCE_VALUE: return DATASOURCE;
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
	private HandlerTypes(int value, String name, String literal) {
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
	
} //HandlerTypes
