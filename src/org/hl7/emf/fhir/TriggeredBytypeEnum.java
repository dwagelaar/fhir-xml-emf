/**
 */
package org.hl7.emf.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Triggered Bytype Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.emf.fhir.FhirPackage#getTriggeredBytypeEnum()
 * @model extendedMetaData="name='TriggeredBytypeEnum'"
 * @generated
 */
public enum TriggeredBytypeEnum implements Enumerator {
	/**
	 * The '<em><b>Reflex</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reflex
	 * <!-- end-model-doc -->
	 * @see #REFLEX_VALUE
	 * @generated
	 * @ordered
	 */
	REFLEX(0, "reflex", "reflex"),

	/**
	 * The '<em><b>Repeat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Repeat (per policy)
	 * <!-- end-model-doc -->
	 * @see #REPEAT_VALUE
	 * @generated
	 * @ordered
	 */
	REPEAT(1, "repeat", "repeat"),

	/**
	 * The '<em><b>Re Run</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Re-run (per policy)
	 * <!-- end-model-doc -->
	 * @see #RE_RUN_VALUE
	 * @generated
	 * @ordered
	 */
	RE_RUN(2, "reRun", "re-run");

	/**
	 * The '<em><b>Reflex</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reflex
	 * <!-- end-model-doc -->
	 * @see #REFLEX
	 * @model name="reflex"
	 * @generated
	 * @ordered
	 */
	public static final int REFLEX_VALUE = 0;

	/**
	 * The '<em><b>Repeat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Repeat (per policy)
	 * <!-- end-model-doc -->
	 * @see #REPEAT
	 * @model name="repeat"
	 * @generated
	 * @ordered
	 */
	public static final int REPEAT_VALUE = 1;

	/**
	 * The '<em><b>Re Run</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Re-run (per policy)
	 * <!-- end-model-doc -->
	 * @see #RE_RUN
	 * @model name="reRun" literal="re-run"
	 * @generated
	 * @ordered
	 */
	public static final int RE_RUN_VALUE = 2;

	/**
	 * An array of all the '<em><b>Triggered Bytype Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TriggeredBytypeEnum[] VALUES_ARRAY =
		new TriggeredBytypeEnum[] {
			REFLEX,
			REPEAT,
			RE_RUN,
		};

	/**
	 * A public read-only list of all the '<em><b>Triggered Bytype Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TriggeredBytypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Triggered Bytype Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TriggeredBytypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TriggeredBytypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Triggered Bytype Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TriggeredBytypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TriggeredBytypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Triggered Bytype Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TriggeredBytypeEnum get(int value) {
		switch (value) {
			case REFLEX_VALUE: return REFLEX;
			case REPEAT_VALUE: return REPEAT;
			case RE_RUN_VALUE: return RE_RUN;
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
	private TriggeredBytypeEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //TriggeredBytypeEnum
