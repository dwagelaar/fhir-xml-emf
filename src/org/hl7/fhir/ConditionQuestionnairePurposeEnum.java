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
 * A representation of the literals of the enumeration '<em><b>Condition Questionnaire Purpose Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getConditionQuestionnairePurposeEnum()
 * @model extendedMetaData="name='ConditionQuestionnairePurposeEnum'"
 * @generated
 */
public enum ConditionQuestionnairePurposeEnum implements Enumerator {
	/**
	 * The '<em><b>Preadmit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pre-admit
	 * <!-- end-model-doc -->
	 * @see #PREADMIT_VALUE
	 * @generated
	 * @ordered
	 */
	PREADMIT(0, "preadmit", "preadmit"),

	/**
	 * The '<em><b>Diff Diagnosis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diff Diagnosis
	 * <!-- end-model-doc -->
	 * @see #DIFF_DIAGNOSIS_VALUE
	 * @generated
	 * @ordered
	 */
	DIFF_DIAGNOSIS(1, "diffDiagnosis", "diff-diagnosis"),

	/**
	 * The '<em><b>Outcome</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outcome
	 * <!-- end-model-doc -->
	 * @see #OUTCOME_VALUE
	 * @generated
	 * @ordered
	 */
	OUTCOME(2, "outcome", "outcome");

	/**
	 * The '<em><b>Preadmit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pre-admit
	 * <!-- end-model-doc -->
	 * @see #PREADMIT
	 * @model name="preadmit"
	 * @generated
	 * @ordered
	 */
	public static final int PREADMIT_VALUE = 0;

	/**
	 * The '<em><b>Diff Diagnosis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diff Diagnosis
	 * <!-- end-model-doc -->
	 * @see #DIFF_DIAGNOSIS
	 * @model name="diffDiagnosis" literal="diff-diagnosis"
	 * @generated
	 * @ordered
	 */
	public static final int DIFF_DIAGNOSIS_VALUE = 1;

	/**
	 * The '<em><b>Outcome</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outcome
	 * <!-- end-model-doc -->
	 * @see #OUTCOME
	 * @model name="outcome"
	 * @generated
	 * @ordered
	 */
	public static final int OUTCOME_VALUE = 2;

	/**
	 * An array of all the '<em><b>Condition Questionnaire Purpose Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConditionQuestionnairePurposeEnum[] VALUES_ARRAY =
		new ConditionQuestionnairePurposeEnum[] {
			PREADMIT,
			DIFF_DIAGNOSIS,
			OUTCOME,
		};

	/**
	 * A public read-only list of all the '<em><b>Condition Questionnaire Purpose Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConditionQuestionnairePurposeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Condition Questionnaire Purpose Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionQuestionnairePurposeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionQuestionnairePurposeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition Questionnaire Purpose Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionQuestionnairePurposeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionQuestionnairePurposeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition Questionnaire Purpose Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionQuestionnairePurposeEnum get(int value) {
		switch (value) {
			case PREADMIT_VALUE: return PREADMIT;
			case DIFF_DIAGNOSIS_VALUE: return DIFF_DIAGNOSIS;
			case OUTCOME_VALUE: return OUTCOME;
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
	private ConditionQuestionnairePurposeEnum(int value, String name, String literal) {
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
	
} //ConditionQuestionnairePurposeEnum
