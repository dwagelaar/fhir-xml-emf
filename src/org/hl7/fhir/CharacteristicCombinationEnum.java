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
 * A representation of the literals of the enumeration '<em><b>Characteristic Combination Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getCharacteristicCombinationEnum()
 * @model extendedMetaData="name='CharacteristicCombinationEnum'"
 * @generated
 */
public enum CharacteristicCombinationEnum implements Enumerator {
	/**
	 * The '<em><b>All Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All of
	 * <!-- end-model-doc -->
	 * @see #ALL_OF_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_OF(0, "allOf", "all-of"),

	/**
	 * The '<em><b>Any Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any of
	 * <!-- end-model-doc -->
	 * @see #ANY_OF_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_OF(1, "anyOf", "any-of"),

	/**
	 * The '<em><b>At Least</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * At least
	 * <!-- end-model-doc -->
	 * @see #AT_LEAST_VALUE
	 * @generated
	 * @ordered
	 */
	AT_LEAST(2, "atLeast", "at-least"),

	/**
	 * The '<em><b>At Most</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * At most
	 * <!-- end-model-doc -->
	 * @see #AT_MOST_VALUE
	 * @generated
	 * @ordered
	 */
	AT_MOST(3, "atMost", "at-most"),

	/**
	 * The '<em><b>Statistical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Statistical
	 * <!-- end-model-doc -->
	 * @see #STATISTICAL_VALUE
	 * @generated
	 * @ordered
	 */
	STATISTICAL(4, "statistical", "statistical"),

	/**
	 * The '<em><b>Net Effect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Net effect
	 * <!-- end-model-doc -->
	 * @see #NET_EFFECT_VALUE
	 * @generated
	 * @ordered
	 */
	NET_EFFECT(5, "netEffect", "net-effect"),

	/**
	 * The '<em><b>Dataset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dataset
	 * <!-- end-model-doc -->
	 * @see #DATASET_VALUE
	 * @generated
	 * @ordered
	 */
	DATASET(6, "dataset", "dataset");

	/**
	 * The '<em><b>All Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All of
	 * <!-- end-model-doc -->
	 * @see #ALL_OF
	 * @model name="allOf" literal="all-of"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_OF_VALUE = 0;

	/**
	 * The '<em><b>Any Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any of
	 * <!-- end-model-doc -->
	 * @see #ANY_OF
	 * @model name="anyOf" literal="any-of"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_OF_VALUE = 1;

	/**
	 * The '<em><b>At Least</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * At least
	 * <!-- end-model-doc -->
	 * @see #AT_LEAST
	 * @model name="atLeast" literal="at-least"
	 * @generated
	 * @ordered
	 */
	public static final int AT_LEAST_VALUE = 2;

	/**
	 * The '<em><b>At Most</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * At most
	 * <!-- end-model-doc -->
	 * @see #AT_MOST
	 * @model name="atMost" literal="at-most"
	 * @generated
	 * @ordered
	 */
	public static final int AT_MOST_VALUE = 3;

	/**
	 * The '<em><b>Statistical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Statistical
	 * <!-- end-model-doc -->
	 * @see #STATISTICAL
	 * @model name="statistical"
	 * @generated
	 * @ordered
	 */
	public static final int STATISTICAL_VALUE = 4;

	/**
	 * The '<em><b>Net Effect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Net effect
	 * <!-- end-model-doc -->
	 * @see #NET_EFFECT
	 * @model name="netEffect" literal="net-effect"
	 * @generated
	 * @ordered
	 */
	public static final int NET_EFFECT_VALUE = 5;

	/**
	 * The '<em><b>Dataset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dataset
	 * <!-- end-model-doc -->
	 * @see #DATASET
	 * @model name="dataset"
	 * @generated
	 * @ordered
	 */
	public static final int DATASET_VALUE = 6;

	/**
	 * An array of all the '<em><b>Characteristic Combination Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CharacteristicCombinationEnum[] VALUES_ARRAY =
		new CharacteristicCombinationEnum[] {
			ALL_OF,
			ANY_OF,
			AT_LEAST,
			AT_MOST,
			STATISTICAL,
			NET_EFFECT,
			DATASET,
		};

	/**
	 * A public read-only list of all the '<em><b>Characteristic Combination Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CharacteristicCombinationEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Characteristic Combination Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CharacteristicCombinationEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CharacteristicCombinationEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Characteristic Combination Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CharacteristicCombinationEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CharacteristicCombinationEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Characteristic Combination Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CharacteristicCombinationEnum get(int value) {
		switch (value) {
			case ALL_OF_VALUE: return ALL_OF;
			case ANY_OF_VALUE: return ANY_OF;
			case AT_LEAST_VALUE: return AT_LEAST;
			case AT_MOST_VALUE: return AT_MOST;
			case STATISTICAL_VALUE: return STATISTICAL;
			case NET_EFFECT_VALUE: return NET_EFFECT;
			case DATASET_VALUE: return DATASET;
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
	private CharacteristicCombinationEnum(int value, String name, String literal) {
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
	
} //CharacteristicCombinationEnum
