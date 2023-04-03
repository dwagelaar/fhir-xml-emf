/**
 */
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Structure Map Group Type Mode Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getStructureMapGroupTypeModeEnum()
 * @model extendedMetaData="name='StructureMapGroupTypeModeEnum'"
 * @generated
 */
public enum StructureMapGroupTypeModeEnum implements Enumerator {
	/**
	 * The '<em><b>Types</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default for Type Combination
	 * <!-- end-model-doc -->
	 * @see #TYPES_VALUE
	 * @generated
	 * @ordered
	 */
	TYPES(0, "types", "types"),

	/**
	 * The '<em><b>Type And Types</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default for type + combination
	 * <!-- end-model-doc -->
	 * @see #TYPE_AND_TYPES_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE_AND_TYPES(1, "typeAndTypes", "type-and-types");

	/**
	 * The '<em><b>Types</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default for Type Combination
	 * <!-- end-model-doc -->
	 * @see #TYPES
	 * @model name="types"
	 * @generated
	 * @ordered
	 */
	public static final int TYPES_VALUE = 0;

	/**
	 * The '<em><b>Type And Types</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default for type + combination
	 * <!-- end-model-doc -->
	 * @see #TYPE_AND_TYPES
	 * @model name="typeAndTypes" literal="type-and-types"
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_AND_TYPES_VALUE = 1;

	/**
	 * An array of all the '<em><b>Structure Map Group Type Mode Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StructureMapGroupTypeModeEnum[] VALUES_ARRAY =
		new StructureMapGroupTypeModeEnum[] {
			TYPES,
			TYPE_AND_TYPES,
		};

	/**
	 * A public read-only list of all the '<em><b>Structure Map Group Type Mode Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StructureMapGroupTypeModeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Structure Map Group Type Mode Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructureMapGroupTypeModeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StructureMapGroupTypeModeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Structure Map Group Type Mode Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructureMapGroupTypeModeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StructureMapGroupTypeModeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Structure Map Group Type Mode Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructureMapGroupTypeModeEnum get(int value) {
		switch (value) {
			case TYPES_VALUE: return TYPES;
			case TYPE_AND_TYPES_VALUE: return TYPE_AND_TYPES;
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
	private StructureMapGroupTypeModeEnum(int value, String name, String literal) {
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
	
} //StructureMapGroupTypeModeEnum
