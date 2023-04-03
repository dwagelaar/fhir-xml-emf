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
 * A representation of the literals of the enumeration '<em><b>Criteria Not Exists Behavior Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getCriteriaNotExistsBehaviorEnum()
 * @model extendedMetaData="name='CriteriaNotExistsBehaviorEnum'"
 * @generated
 */
public enum CriteriaNotExistsBehaviorEnum implements Enumerator {
	/**
	 * The '<em><b>Test Passes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Test passes
	 * <!-- end-model-doc -->
	 * @see #TEST_PASSES_VALUE
	 * @generated
	 * @ordered
	 */
	TEST_PASSES(0, "testPasses", "test-passes"),

	/**
	 * The '<em><b>Test Fails</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Test fails
	 * <!-- end-model-doc -->
	 * @see #TEST_FAILS_VALUE
	 * @generated
	 * @ordered
	 */
	TEST_FAILS(1, "testFails", "test-fails");

	/**
	 * The '<em><b>Test Passes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Test passes
	 * <!-- end-model-doc -->
	 * @see #TEST_PASSES
	 * @model name="testPasses" literal="test-passes"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_PASSES_VALUE = 0;

	/**
	 * The '<em><b>Test Fails</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Test fails
	 * <!-- end-model-doc -->
	 * @see #TEST_FAILS
	 * @model name="testFails" literal="test-fails"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_FAILS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Criteria Not Exists Behavior Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CriteriaNotExistsBehaviorEnum[] VALUES_ARRAY =
		new CriteriaNotExistsBehaviorEnum[] {
			TEST_PASSES,
			TEST_FAILS,
		};

	/**
	 * A public read-only list of all the '<em><b>Criteria Not Exists Behavior Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CriteriaNotExistsBehaviorEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Criteria Not Exists Behavior Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CriteriaNotExistsBehaviorEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CriteriaNotExistsBehaviorEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Criteria Not Exists Behavior Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CriteriaNotExistsBehaviorEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CriteriaNotExistsBehaviorEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Criteria Not Exists Behavior Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CriteriaNotExistsBehaviorEnum get(int value) {
		switch (value) {
			case TEST_PASSES_VALUE: return TEST_PASSES;
			case TEST_FAILS_VALUE: return TEST_FAILS;
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
	private CriteriaNotExistsBehaviorEnum(int value, String name, String literal) {
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
	
} //CriteriaNotExistsBehaviorEnum
