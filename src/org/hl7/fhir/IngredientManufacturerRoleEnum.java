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
 * A representation of the literals of the enumeration '<em><b>Ingredient Manufacturer Role Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getIngredientManufacturerRoleEnum()
 * @model extendedMetaData="name='IngredientManufacturerRoleEnum'"
 * @generated
 */
public enum IngredientManufacturerRoleEnum implements Enumerator {
	/**
	 * The '<em><b>Allowed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manufacturer is specifically allowed for this ingredient
	 * <!-- end-model-doc -->
	 * @see #ALLOWED_VALUE
	 * @generated
	 * @ordered
	 */
	ALLOWED(0, "allowed", "allowed"),

	/**
	 * The '<em><b>Possible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manufacturer is known to make this ingredient in general
	 * <!-- end-model-doc -->
	 * @see #POSSIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	POSSIBLE(1, "possible", "possible"),

	/**
	 * The '<em><b>Actual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manufacturer actually makes this particular ingredient
	 * <!-- end-model-doc -->
	 * @see #ACTUAL_VALUE
	 * @generated
	 * @ordered
	 */
	ACTUAL(2, "actual", "actual");

	/**
	 * The '<em><b>Allowed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manufacturer is specifically allowed for this ingredient
	 * <!-- end-model-doc -->
	 * @see #ALLOWED
	 * @model name="allowed"
	 * @generated
	 * @ordered
	 */
	public static final int ALLOWED_VALUE = 0;

	/**
	 * The '<em><b>Possible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manufacturer is known to make this ingredient in general
	 * <!-- end-model-doc -->
	 * @see #POSSIBLE
	 * @model name="possible"
	 * @generated
	 * @ordered
	 */
	public static final int POSSIBLE_VALUE = 1;

	/**
	 * The '<em><b>Actual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manufacturer actually makes this particular ingredient
	 * <!-- end-model-doc -->
	 * @see #ACTUAL
	 * @model name="actual"
	 * @generated
	 * @ordered
	 */
	public static final int ACTUAL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Ingredient Manufacturer Role Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IngredientManufacturerRoleEnum[] VALUES_ARRAY =
		new IngredientManufacturerRoleEnum[] {
			ALLOWED,
			POSSIBLE,
			ACTUAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Ingredient Manufacturer Role Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IngredientManufacturerRoleEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ingredient Manufacturer Role Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IngredientManufacturerRoleEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IngredientManufacturerRoleEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ingredient Manufacturer Role Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IngredientManufacturerRoleEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IngredientManufacturerRoleEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ingredient Manufacturer Role Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IngredientManufacturerRoleEnum get(int value) {
		switch (value) {
			case ALLOWED_VALUE: return ALLOWED;
			case POSSIBLE_VALUE: return POSSIBLE;
			case ACTUAL_VALUE: return ACTUAL;
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
	private IngredientManufacturerRoleEnum(int value, String name, String literal) {
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
	
} //IngredientManufacturerRoleEnum
