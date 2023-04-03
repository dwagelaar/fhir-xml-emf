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
 * A representation of the literals of the enumeration '<em><b>Questionnaire Answer Constraint Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getQuestionnaireAnswerConstraintEnum()
 * @model extendedMetaData="name='QuestionnaireAnswerConstraintEnum'"
 * @generated
 */
public enum QuestionnaireAnswerConstraintEnum implements Enumerator {
	/**
	 * The '<em><b>Options Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Options only
	 * <!-- end-model-doc -->
	 * @see #OPTIONS_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	OPTIONS_ONLY(0, "optionsOnly", "optionsOnly"),

	/**
	 * The '<em><b>Options Or Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Options or 'type'
	 * <!-- end-model-doc -->
	 * @see #OPTIONS_OR_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	OPTIONS_OR_TYPE(1, "optionsOrType", "optionsOrType"),

	/**
	 * The '<em><b>Options Or String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Options or string
	 * <!-- end-model-doc -->
	 * @see #OPTIONS_OR_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	OPTIONS_OR_STRING(2, "optionsOrString", "optionsOrString");

	/**
	 * The '<em><b>Options Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Options only
	 * <!-- end-model-doc -->
	 * @see #OPTIONS_ONLY
	 * @model name="optionsOnly"
	 * @generated
	 * @ordered
	 */
	public static final int OPTIONS_ONLY_VALUE = 0;

	/**
	 * The '<em><b>Options Or Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Options or 'type'
	 * <!-- end-model-doc -->
	 * @see #OPTIONS_OR_TYPE
	 * @model name="optionsOrType"
	 * @generated
	 * @ordered
	 */
	public static final int OPTIONS_OR_TYPE_VALUE = 1;

	/**
	 * The '<em><b>Options Or String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Options or string
	 * <!-- end-model-doc -->
	 * @see #OPTIONS_OR_STRING
	 * @model name="optionsOrString"
	 * @generated
	 * @ordered
	 */
	public static final int OPTIONS_OR_STRING_VALUE = 2;

	/**
	 * An array of all the '<em><b>Questionnaire Answer Constraint Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QuestionnaireAnswerConstraintEnum[] VALUES_ARRAY =
		new QuestionnaireAnswerConstraintEnum[] {
			OPTIONS_ONLY,
			OPTIONS_OR_TYPE,
			OPTIONS_OR_STRING,
		};

	/**
	 * A public read-only list of all the '<em><b>Questionnaire Answer Constraint Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QuestionnaireAnswerConstraintEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Questionnaire Answer Constraint Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QuestionnaireAnswerConstraintEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QuestionnaireAnswerConstraintEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Questionnaire Answer Constraint Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QuestionnaireAnswerConstraintEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QuestionnaireAnswerConstraintEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Questionnaire Answer Constraint Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QuestionnaireAnswerConstraintEnum get(int value) {
		switch (value) {
			case OPTIONS_ONLY_VALUE: return OPTIONS_ONLY;
			case OPTIONS_OR_TYPE_VALUE: return OPTIONS_OR_TYPE;
			case OPTIONS_OR_STRING_VALUE: return OPTIONS_OR_STRING;
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
	private QuestionnaireAnswerConstraintEnum(int value, String name, String literal) {
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
	
} //QuestionnaireAnswerConstraintEnum
