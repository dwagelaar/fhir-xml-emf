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
 * A representation of the literals of the enumeration '<em><b>Biologically Derived Product Dispense Codes Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.emf.fhir.FhirPackage#getBiologicallyDerivedProductDispenseCodesEnum()
 * @model extendedMetaData="name='BiologicallyDerivedProductDispenseCodesEnum'"
 * @generated
 */
public enum BiologicallyDerivedProductDispenseCodesEnum implements Enumerator {
	/**
	 * The '<em><b>Preparation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Preparation
	 * <!-- end-model-doc -->
	 * @see #PREPARATION_VALUE
	 * @generated
	 * @ordered
	 */
	PREPARATION(0, "preparation", "preparation"),

	/**
	 * The '<em><b>In Progress</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In Progress
	 * <!-- end-model-doc -->
	 * @see #IN_PROGRESS_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PROGRESS(1, "inProgress", "in-progress"),

	/**
	 * The '<em><b>Allocated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allocated
	 * <!-- end-model-doc -->
	 * @see #ALLOCATED_VALUE
	 * @generated
	 * @ordered
	 */
	ALLOCATED(2, "allocated", "allocated"),

	/**
	 * The '<em><b>Issued</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issued
	 * <!-- end-model-doc -->
	 * @see #ISSUED_VALUE
	 * @generated
	 * @ordered
	 */
	ISSUED(3, "issued", "issued"),

	/**
	 * The '<em><b>Unfulfilled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unfulfilled
	 * <!-- end-model-doc -->
	 * @see #UNFULFILLED_VALUE
	 * @generated
	 * @ordered
	 */
	UNFULFILLED(4, "unfulfilled", "unfulfilled"),

	/**
	 * The '<em><b>Returned</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returned
	 * <!-- end-model-doc -->
	 * @see #RETURNED_VALUE
	 * @generated
	 * @ordered
	 */
	RETURNED(5, "returned", "returned"),

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
	ENTERED_IN_ERROR(6, "enteredInError", "entered-in-error"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unknown
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(7, "unknown", "unknown");

	/**
	 * The '<em><b>Preparation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Preparation
	 * <!-- end-model-doc -->
	 * @see #PREPARATION
	 * @model name="preparation"
	 * @generated
	 * @ordered
	 */
	public static final int PREPARATION_VALUE = 0;

	/**
	 * The '<em><b>In Progress</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In Progress
	 * <!-- end-model-doc -->
	 * @see #IN_PROGRESS
	 * @model name="inProgress" literal="in-progress"
	 * @generated
	 * @ordered
	 */
	public static final int IN_PROGRESS_VALUE = 1;

	/**
	 * The '<em><b>Allocated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allocated
	 * <!-- end-model-doc -->
	 * @see #ALLOCATED
	 * @model name="allocated"
	 * @generated
	 * @ordered
	 */
	public static final int ALLOCATED_VALUE = 2;

	/**
	 * The '<em><b>Issued</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issued
	 * <!-- end-model-doc -->
	 * @see #ISSUED
	 * @model name="issued"
	 * @generated
	 * @ordered
	 */
	public static final int ISSUED_VALUE = 3;

	/**
	 * The '<em><b>Unfulfilled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unfulfilled
	 * <!-- end-model-doc -->
	 * @see #UNFULFILLED
	 * @model name="unfulfilled"
	 * @generated
	 * @ordered
	 */
	public static final int UNFULFILLED_VALUE = 4;

	/**
	 * The '<em><b>Returned</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returned
	 * <!-- end-model-doc -->
	 * @see #RETURNED
	 * @model name="returned"
	 * @generated
	 * @ordered
	 */
	public static final int RETURNED_VALUE = 5;

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
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unknown
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 7;

	/**
	 * An array of all the '<em><b>Biologically Derived Product Dispense Codes Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BiologicallyDerivedProductDispenseCodesEnum[] VALUES_ARRAY =
		new BiologicallyDerivedProductDispenseCodesEnum[] {
			PREPARATION,
			IN_PROGRESS,
			ALLOCATED,
			ISSUED,
			UNFULFILLED,
			RETURNED,
			ENTERED_IN_ERROR,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Biologically Derived Product Dispense Codes Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BiologicallyDerivedProductDispenseCodesEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Biologically Derived Product Dispense Codes Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BiologicallyDerivedProductDispenseCodesEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BiologicallyDerivedProductDispenseCodesEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Biologically Derived Product Dispense Codes Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BiologicallyDerivedProductDispenseCodesEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BiologicallyDerivedProductDispenseCodesEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Biologically Derived Product Dispense Codes Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BiologicallyDerivedProductDispenseCodesEnum get(int value) {
		switch (value) {
			case PREPARATION_VALUE: return PREPARATION;
			case IN_PROGRESS_VALUE: return IN_PROGRESS;
			case ALLOCATED_VALUE: return ALLOCATED;
			case ISSUED_VALUE: return ISSUED;
			case UNFULFILLED_VALUE: return UNFULFILLED;
			case RETURNED_VALUE: return RETURNED;
			case ENTERED_IN_ERROR_VALUE: return ENTERED_IN_ERROR;
			case UNKNOWN_VALUE: return UNKNOWN;
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
	private BiologicallyDerivedProductDispenseCodesEnum(int value, String name, String literal) {
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
	
} //BiologicallyDerivedProductDispenseCodesEnum
