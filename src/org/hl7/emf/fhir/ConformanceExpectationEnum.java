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
 * A representation of the literals of the enumeration '<em><b>Conformance Expectation Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.emf.fhir.FhirPackage#getConformanceExpectationEnum()
 * @model extendedMetaData="name='ConformanceExpectationEnum'"
 * @generated
 */
public enum ConformanceExpectationEnum implements Enumerator {
	/**
	 * The '<em><b>SHALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SHALL
	 * <!-- end-model-doc -->
	 * @see #SHALL_VALUE
	 * @generated
	 * @ordered
	 */
	SHALL(0, "SHALL", "SHALL"),

	/**
	 * The '<em><b>SHOULD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SHOULD
	 * <!-- end-model-doc -->
	 * @see #SHOULD_VALUE
	 * @generated
	 * @ordered
	 */
	SHOULD(1, "SHOULD", "SHOULD"),

	/**
	 * The '<em><b>MAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MAY
	 * <!-- end-model-doc -->
	 * @see #MAY_VALUE
	 * @generated
	 * @ordered
	 */
	MAY(2, "MAY", "MAY"),

	/**
	 * The '<em><b>SHOULDNOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SHOULD-NOT
	 * <!-- end-model-doc -->
	 * @see #SHOULDNOT_VALUE
	 * @generated
	 * @ordered
	 */
	SHOULDNOT(3, "SHOULDNOT", "SHOULD-NOT");

	/**
	 * The '<em><b>SHALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SHALL
	 * <!-- end-model-doc -->
	 * @see #SHALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHALL_VALUE = 0;

	/**
	 * The '<em><b>SHOULD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SHOULD
	 * <!-- end-model-doc -->
	 * @see #SHOULD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHOULD_VALUE = 1;

	/**
	 * The '<em><b>MAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MAY
	 * <!-- end-model-doc -->
	 * @see #MAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAY_VALUE = 2;

	/**
	 * The '<em><b>SHOULDNOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SHOULD-NOT
	 * <!-- end-model-doc -->
	 * @see #SHOULDNOT
	 * @model literal="SHOULD-NOT"
	 * @generated
	 * @ordered
	 */
	public static final int SHOULDNOT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Conformance Expectation Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConformanceExpectationEnum[] VALUES_ARRAY =
		new ConformanceExpectationEnum[] {
			SHALL,
			SHOULD,
			MAY,
			SHOULDNOT,
		};

	/**
	 * A public read-only list of all the '<em><b>Conformance Expectation Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConformanceExpectationEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Conformance Expectation Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConformanceExpectationEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConformanceExpectationEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conformance Expectation Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConformanceExpectationEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConformanceExpectationEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conformance Expectation Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConformanceExpectationEnum get(int value) {
		switch (value) {
			case SHALL_VALUE: return SHALL;
			case SHOULD_VALUE: return SHOULD;
			case MAY_VALUE: return MAY;
			case SHOULDNOT_VALUE: return SHOULDNOT;
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
	private ConformanceExpectationEnum(int value, String name, String literal) {
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
	
} //ConformanceExpectationEnum
