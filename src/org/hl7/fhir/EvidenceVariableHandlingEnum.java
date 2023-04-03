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
 * A representation of the literals of the enumeration '<em><b>Evidence Variable Handling Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getEvidenceVariableHandlingEnum()
 * @model extendedMetaData="name='EvidenceVariableHandlingEnum'"
 * @generated
 */
public enum EvidenceVariableHandlingEnum implements Enumerator {
	/**
	 * The '<em><b>Continuous</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * continuous variable
	 * <!-- end-model-doc -->
	 * @see #CONTINUOUS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTINUOUS(0, "continuous", "continuous"),

	/**
	 * The '<em><b>Dichotomous</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * dichotomous variable
	 * <!-- end-model-doc -->
	 * @see #DICHOTOMOUS_VALUE
	 * @generated
	 * @ordered
	 */
	DICHOTOMOUS(1, "dichotomous", "dichotomous"),

	/**
	 * The '<em><b>Ordinal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ordinal variable
	 * <!-- end-model-doc -->
	 * @see #ORDINAL_VALUE
	 * @generated
	 * @ordered
	 */
	ORDINAL(2, "ordinal", "ordinal"),

	/**
	 * The '<em><b>Polychotomous</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * polychotomous variable
	 * <!-- end-model-doc -->
	 * @see #POLYCHOTOMOUS_VALUE
	 * @generated
	 * @ordered
	 */
	POLYCHOTOMOUS(3, "polychotomous", "polychotomous");

	/**
	 * The '<em><b>Continuous</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * continuous variable
	 * <!-- end-model-doc -->
	 * @see #CONTINUOUS
	 * @model name="continuous"
	 * @generated
	 * @ordered
	 */
	public static final int CONTINUOUS_VALUE = 0;

	/**
	 * The '<em><b>Dichotomous</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * dichotomous variable
	 * <!-- end-model-doc -->
	 * @see #DICHOTOMOUS
	 * @model name="dichotomous"
	 * @generated
	 * @ordered
	 */
	public static final int DICHOTOMOUS_VALUE = 1;

	/**
	 * The '<em><b>Ordinal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ordinal variable
	 * <!-- end-model-doc -->
	 * @see #ORDINAL
	 * @model name="ordinal"
	 * @generated
	 * @ordered
	 */
	public static final int ORDINAL_VALUE = 2;

	/**
	 * The '<em><b>Polychotomous</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * polychotomous variable
	 * <!-- end-model-doc -->
	 * @see #POLYCHOTOMOUS
	 * @model name="polychotomous"
	 * @generated
	 * @ordered
	 */
	public static final int POLYCHOTOMOUS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Evidence Variable Handling Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EvidenceVariableHandlingEnum[] VALUES_ARRAY =
		new EvidenceVariableHandlingEnum[] {
			CONTINUOUS,
			DICHOTOMOUS,
			ORDINAL,
			POLYCHOTOMOUS,
		};

	/**
	 * A public read-only list of all the '<em><b>Evidence Variable Handling Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EvidenceVariableHandlingEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Evidence Variable Handling Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvidenceVariableHandlingEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvidenceVariableHandlingEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Evidence Variable Handling Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvidenceVariableHandlingEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvidenceVariableHandlingEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Evidence Variable Handling Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvidenceVariableHandlingEnum get(int value) {
		switch (value) {
			case CONTINUOUS_VALUE: return CONTINUOUS;
			case DICHOTOMOUS_VALUE: return DICHOTOMOUS;
			case ORDINAL_VALUE: return ORDINAL;
			case POLYCHOTOMOUS_VALUE: return POLYCHOTOMOUS;
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
	private EvidenceVariableHandlingEnum(int value, String name, String literal) {
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
	
} //EvidenceVariableHandlingEnum
