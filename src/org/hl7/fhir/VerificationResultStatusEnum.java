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
 * A representation of the literals of the enumeration '<em><b>Verification Result Status Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getVerificationResultStatusEnum()
 * @model extendedMetaData="name='VerificationResultStatusEnum'"
 * @generated
 */
public enum VerificationResultStatusEnum implements Enumerator {
	/**
	 * The '<em><b>Attested</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attested
	 * <!-- end-model-doc -->
	 * @see #ATTESTED_VALUE
	 * @generated
	 * @ordered
	 */
	ATTESTED(0, "attested", "attested"),

	/**
	 * The '<em><b>Validated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Validated
	 * <!-- end-model-doc -->
	 * @see #VALIDATED_VALUE
	 * @generated
	 * @ordered
	 */
	VALIDATED(1, "validated", "validated"),

	/**
	 * The '<em><b>In Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In process
	 * <!-- end-model-doc -->
	 * @see #IN_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PROCESS(2, "inProcess", "in-process"),

	/**
	 * The '<em><b>Req Revalid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requires revalidation
	 * <!-- end-model-doc -->
	 * @see #REQ_REVALID_VALUE
	 * @generated
	 * @ordered
	 */
	REQ_REVALID(3, "reqRevalid", "req-revalid"),

	/**
	 * The '<em><b>Val Fail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Validation failed
	 * <!-- end-model-doc -->
	 * @see #VAL_FAIL_VALUE
	 * @generated
	 * @ordered
	 */
	VAL_FAIL(4, "valFail", "val-fail"),

	/**
	 * The '<em><b>Reval Fail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Re-Validation failed
	 * <!-- end-model-doc -->
	 * @see #REVAL_FAIL_VALUE
	 * @generated
	 * @ordered
	 */
	REVAL_FAIL(5, "revalFail", "reval-fail"),

	/**
	 * The '<em><b>Entered In Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entered in Error
	 * <!-- end-model-doc -->
	 * @see #ENTERED_IN_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ENTERED_IN_ERROR(6, "enteredInError", "entered-in-error");

	/**
	 * The '<em><b>Attested</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attested
	 * <!-- end-model-doc -->
	 * @see #ATTESTED
	 * @model name="attested"
	 * @generated
	 * @ordered
	 */
	public static final int ATTESTED_VALUE = 0;

	/**
	 * The '<em><b>Validated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Validated
	 * <!-- end-model-doc -->
	 * @see #VALIDATED
	 * @model name="validated"
	 * @generated
	 * @ordered
	 */
	public static final int VALIDATED_VALUE = 1;

	/**
	 * The '<em><b>In Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In process
	 * <!-- end-model-doc -->
	 * @see #IN_PROCESS
	 * @model name="inProcess" literal="in-process"
	 * @generated
	 * @ordered
	 */
	public static final int IN_PROCESS_VALUE = 2;

	/**
	 * The '<em><b>Req Revalid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requires revalidation
	 * <!-- end-model-doc -->
	 * @see #REQ_REVALID
	 * @model name="reqRevalid" literal="req-revalid"
	 * @generated
	 * @ordered
	 */
	public static final int REQ_REVALID_VALUE = 3;

	/**
	 * The '<em><b>Val Fail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Validation failed
	 * <!-- end-model-doc -->
	 * @see #VAL_FAIL
	 * @model name="valFail" literal="val-fail"
	 * @generated
	 * @ordered
	 */
	public static final int VAL_FAIL_VALUE = 4;

	/**
	 * The '<em><b>Reval Fail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Re-Validation failed
	 * <!-- end-model-doc -->
	 * @see #REVAL_FAIL
	 * @model name="revalFail" literal="reval-fail"
	 * @generated
	 * @ordered
	 */
	public static final int REVAL_FAIL_VALUE = 5;

	/**
	 * The '<em><b>Entered In Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entered in Error
	 * <!-- end-model-doc -->
	 * @see #ENTERED_IN_ERROR
	 * @model name="enteredInError" literal="entered-in-error"
	 * @generated
	 * @ordered
	 */
	public static final int ENTERED_IN_ERROR_VALUE = 6;

	/**
	 * An array of all the '<em><b>Verification Result Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VerificationResultStatusEnum[] VALUES_ARRAY =
		new VerificationResultStatusEnum[] {
			ATTESTED,
			VALIDATED,
			IN_PROCESS,
			REQ_REVALID,
			VAL_FAIL,
			REVAL_FAIL,
			ENTERED_IN_ERROR,
		};

	/**
	 * A public read-only list of all the '<em><b>Verification Result Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VerificationResultStatusEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Verification Result Status Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VerificationResultStatusEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VerificationResultStatusEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Verification Result Status Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VerificationResultStatusEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VerificationResultStatusEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Verification Result Status Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VerificationResultStatusEnum get(int value) {
		switch (value) {
			case ATTESTED_VALUE: return ATTESTED;
			case VALIDATED_VALUE: return VALIDATED;
			case IN_PROCESS_VALUE: return IN_PROCESS;
			case REQ_REVALID_VALUE: return REQ_REVALID;
			case VAL_FAIL_VALUE: return VAL_FAIL;
			case REVAL_FAIL_VALUE: return REVAL_FAIL;
			case ENTERED_IN_ERROR_VALUE: return ENTERED_IN_ERROR;
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
	private VerificationResultStatusEnum(int value, String name, String literal) {
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
	
} //VerificationResultStatusEnum
