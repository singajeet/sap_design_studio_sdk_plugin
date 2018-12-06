/**
 */
package com.armin.sap.ds.builder.models.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Property Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.armin.sap.ds.builder.models.core.ICorePackage#getPropertyType()
 * @model extendedMetaData="name='PropertyType'"
 * @generated
 */
public enum PropertyType implements Enumerator {
	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(0, "String", "String"),

	/**
	 * The '<em><b>Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT(1, "Text", "Text"),

	/**
	 * The '<em><b>Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_VALUE
	 * @generated
	 * @ordered
	 */
	INT(2, "int", "int"),

	/**
	 * The '<em><b>Float</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT(3, "float", "float"),

	/**
	 * The '<em><b>Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(4, "boolean", "boolean"),

	/**
	 * The '<em><b>Script Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCRIPT_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	SCRIPT_TEXT(5, "ScriptText", "ScriptText"),

	/**
	 * The '<em><b>Multi Line Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_LINE_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_LINE_TEXT(6, "MultiLineText", "MultiLineText"),

	/**
	 * The '<em><b>Color</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR(7, "Color", "Color"),

	/**
	 * The '<em><b>Url</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URL_VALUE
	 * @generated
	 * @ordered
	 */
	URL(8, "Url", "Url"),

	/**
	 * The '<em><b>Result Cell</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESULT_CELL_VALUE
	 * @generated
	 * @ordered
	 */
	RESULT_CELL(9, "ResultCell", "ResultCell"),

	/**
	 * The '<em><b>Result Cell Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESULT_CELL_SET_VALUE
	 * @generated
	 * @ordered
	 */
	RESULT_CELL_SET(10, "ResultCellSet", "ResultCellSet"),

	/**
	 * The '<em><b>Result Cell List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESULT_CELL_LIST_VALUE
	 * @generated
	 * @ordered
	 */
	RESULT_CELL_LIST(11, "ResultCellList", "ResultCellList"),

	/**
	 * The '<em><b>Result Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESULT_SET_VALUE
	 * @generated
	 * @ordered
	 */
	RESULT_SET(12, "ResultSet", "ResultSet"),

	/**
	 * The '<em><b>Object</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	OBJECT(13, "Object", "Object"),

	/**
	 * The '<em><b>Array</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARRAY_VALUE
	 * @generated
	 * @ordered
	 */
	ARRAY(14, "Array", "Array");

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model name="String"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 0;

	/**
	 * The '<em><b>Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Text</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXT
	 * @model name="Text"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_VALUE = 1;

	/**
	 * The '<em><b>Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Int</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @model name="int"
	 * @generated
	 * @ordered
	 */
	public static final int INT_VALUE = 2;

	/**
	 * The '<em><b>Float</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Float</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @model name="float"
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT_VALUE = 3;

	/**
	 * The '<em><b>Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @model name="boolean"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 4;

	/**
	 * The '<em><b>Script Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Script Text</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCRIPT_TEXT
	 * @model name="ScriptText"
	 * @generated
	 * @ordered
	 */
	public static final int SCRIPT_TEXT_VALUE = 5;

	/**
	 * The '<em><b>Multi Line Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multi Line Text</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTI_LINE_TEXT
	 * @model name="MultiLineText"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_LINE_TEXT_VALUE = 6;

	/**
	 * The '<em><b>Color</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Color</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR
	 * @model name="Color"
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_VALUE = 7;

	/**
	 * The '<em><b>Url</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Url</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #URL
	 * @model name="Url"
	 * @generated
	 * @ordered
	 */
	public static final int URL_VALUE = 8;

	/**
	 * The '<em><b>Result Cell</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Result Cell</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESULT_CELL
	 * @model name="ResultCell"
	 * @generated
	 * @ordered
	 */
	public static final int RESULT_CELL_VALUE = 9;

	/**
	 * The '<em><b>Result Cell Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Result Cell Set</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESULT_CELL_SET
	 * @model name="ResultCellSet"
	 * @generated
	 * @ordered
	 */
	public static final int RESULT_CELL_SET_VALUE = 10;

	/**
	 * The '<em><b>Result Cell List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Result Cell List</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESULT_CELL_LIST
	 * @model name="ResultCellList"
	 * @generated
	 * @ordered
	 */
	public static final int RESULT_CELL_LIST_VALUE = 11;

	/**
	 * The '<em><b>Result Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Result Set</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESULT_SET
	 * @model name="ResultSet"
	 * @generated
	 * @ordered
	 */
	public static final int RESULT_SET_VALUE = 12;

	/**
	 * The '<em><b>Object</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Object</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBJECT
	 * @model name="Object"
	 * @generated
	 * @ordered
	 */
	public static final int OBJECT_VALUE = 13;

	/**
	 * The '<em><b>Array</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Array</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARRAY
	 * @model name="Array"
	 * @generated
	 * @ordered
	 */
	public static final int ARRAY_VALUE = 14;

	/**
	 * An array of all the '<em><b>Property Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PropertyType[] VALUES_ARRAY =
		new PropertyType[] {
			STRING,
			TEXT,
			INT,
			FLOAT,
			BOOLEAN,
			SCRIPT_TEXT,
			MULTI_LINE_TEXT,
			COLOR,
			URL,
			RESULT_CELL,
			RESULT_CELL_SET,
			RESULT_CELL_LIST,
			RESULT_SET,
			OBJECT,
			ARRAY,
		};

	/**
	 * A public read-only list of all the '<em><b>Property Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PropertyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Property Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropertyType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Property Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropertyType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Property Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyType get(int value) {
		switch (value) {
			case STRING_VALUE: return STRING;
			case TEXT_VALUE: return TEXT;
			case INT_VALUE: return INT;
			case FLOAT_VALUE: return FLOAT;
			case BOOLEAN_VALUE: return BOOLEAN;
			case SCRIPT_TEXT_VALUE: return SCRIPT_TEXT;
			case MULTI_LINE_TEXT_VALUE: return MULTI_LINE_TEXT;
			case COLOR_VALUE: return COLOR;
			case URL_VALUE: return URL;
			case RESULT_CELL_VALUE: return RESULT_CELL;
			case RESULT_CELL_SET_VALUE: return RESULT_CELL_SET;
			case RESULT_CELL_LIST_VALUE: return RESULT_CELL_LIST;
			case RESULT_SET_VALUE: return RESULT_SET;
			case OBJECT_VALUE: return OBJECT;
			case ARRAY_VALUE: return ARRAY;
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
	private PropertyType(int value, String name, String literal) {
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
	
} //PropertyType
