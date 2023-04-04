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
 * A representation of the literals of the enumeration '<em><b>Assertion Manual Completion Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.emf.fhir.FhirPackage#getAssertionManualCompletionTypeEnum()
 * @model extendedMetaData="name='AssertionManualCompletionTypeEnum'"
 * @generated
 */
public enum AssertionManualCompletionTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Fail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fail
	 * <!-- end-model-doc -->
	 * @see #FAIL_VALUE
	 * @generated
	 * @ordered
	 */
	FAIL(0, "fail", "fail"),

	/**
	 * The '<em><b>Pass</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pass
	 * <!-- end-model-doc -->
	 * @see #PASS_VALUE
	 * @generated
	 * @ordered
	 */
	PASS(1, "pass", "pass"),

	/**
	 * The '<em><b>Skip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Skip
	 * <!-- end-model-doc -->
	 * @see #SKIP_VALUE
	 * @generated
	 * @ordered
	 */
	SKIP(2, "skip", "skip"),

	/**
	 * The '<em><b>Stop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stop
	 * <!-- end-model-doc -->
	 * @see #STOP_VALUE
	 * @generated
	 * @ordered
	 */
	STOP(3, "stop", "stop");

	/**
	 * The '<em><b>Fail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fail
	 * <!-- end-model-doc -->
	 * @see #FAIL
	 * @model name="fail"
	 * @generated
	 * @ordered
	 */
	public static final int FAIL_VALUE = 0;

	/**
	 * The '<em><b>Pass</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pass
	 * <!-- end-model-doc -->
	 * @see #PASS
	 * @model name="pass"
	 * @generated
	 * @ordered
	 */
	public static final int PASS_VALUE = 1;

	/**
	 * The '<em><b>Skip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Skip
	 * <!-- end-model-doc -->
	 * @see #SKIP
	 * @model name="skip"
	 * @generated
	 * @ordered
	 */
	public static final int SKIP_VALUE = 2;

	/**
	 * The '<em><b>Stop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stop
	 * <!-- end-model-doc -->
	 * @see #STOP
	 * @model name="stop"
	 * @generated
	 * @ordered
	 */
	public static final int STOP_VALUE = 3;

	/**
	 * An array of all the '<em><b>Assertion Manual Completion Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AssertionManualCompletionTypeEnum[] VALUES_ARRAY =
		new AssertionManualCompletionTypeEnum[] {
			FAIL,
			PASS,
			SKIP,
			STOP,
		};

	/**
	 * A public read-only list of all the '<em><b>Assertion Manual Completion Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AssertionManualCompletionTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Assertion Manual Completion Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssertionManualCompletionTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssertionManualCompletionTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Assertion Manual Completion Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssertionManualCompletionTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssertionManualCompletionTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Assertion Manual Completion Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssertionManualCompletionTypeEnum get(int value) {
		switch (value) {
			case FAIL_VALUE: return FAIL;
			case PASS_VALUE: return PASS;
			case SKIP_VALUE: return SKIP;
			case STOP_VALUE: return STOP;
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
	private AssertionManualCompletionTypeEnum(int value, String name, String literal) {
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
	
} //AssertionManualCompletionTypeEnum
