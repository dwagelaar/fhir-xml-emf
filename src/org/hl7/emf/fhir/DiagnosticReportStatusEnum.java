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
 * A representation of the literals of the enumeration '<em><b>Diagnostic Report Status Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.emf.fhir.FhirPackage#getDiagnosticReportStatusEnum()
 * @model extendedMetaData="name='DiagnosticReportStatusEnum'"
 * @generated
 */
public enum DiagnosticReportStatusEnum implements Enumerator {
	/**
	 * The '<em><b>Registered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Registered
	 * <!-- end-model-doc -->
	 * @see #REGISTERED_VALUE
	 * @generated
	 * @ordered
	 */
	REGISTERED(0, "registered", "registered"),

	/**
	 * The '<em><b>Partial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Partial
	 * <!-- end-model-doc -->
	 * @see #PARTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIAL(1, "partial", "partial"),

	/**
	 * The '<em><b>Preliminary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Preliminary
	 * <!-- end-model-doc -->
	 * @see #PRELIMINARY_VALUE
	 * @generated
	 * @ordered
	 */
	PRELIMINARY(2, "preliminary", "preliminary"),

	/**
	 * The '<em><b>Modified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modified
	 * <!-- end-model-doc -->
	 * @see #MODIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	MODIFIED(3, "modified", "modified"),

	/**
	 * The '<em><b>Final</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Final
	 * <!-- end-model-doc -->
	 * @see #FINAL_VALUE
	 * @generated
	 * @ordered
	 */
	FINAL(4, "final", "final"),

	/**
	 * The '<em><b>Amended</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amended
	 * <!-- end-model-doc -->
	 * @see #AMENDED_VALUE
	 * @generated
	 * @ordered
	 */
	AMENDED(5, "amended", "amended"),

	/**
	 * The '<em><b>Corrected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Corrected
	 * <!-- end-model-doc -->
	 * @see #CORRECTED_VALUE
	 * @generated
	 * @ordered
	 */
	CORRECTED(6, "corrected", "corrected"),

	/**
	 * The '<em><b>Appended</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appended
	 * <!-- end-model-doc -->
	 * @see #APPENDED_VALUE
	 * @generated
	 * @ordered
	 */
	APPENDED(7, "appended", "appended"),

	/**
	 * The '<em><b>Cancelled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cancelled
	 * <!-- end-model-doc -->
	 * @see #CANCELLED_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELLED(8, "cancelled", "cancelled"),

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
	ENTERED_IN_ERROR(9, "enteredInError", "entered-in-error"),

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
	UNKNOWN(10, "unknown", "unknown");

	/**
	 * The '<em><b>Registered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Registered
	 * <!-- end-model-doc -->
	 * @see #REGISTERED
	 * @model name="registered"
	 * @generated
	 * @ordered
	 */
	public static final int REGISTERED_VALUE = 0;

	/**
	 * The '<em><b>Partial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Partial
	 * <!-- end-model-doc -->
	 * @see #PARTIAL
	 * @model name="partial"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIAL_VALUE = 1;

	/**
	 * The '<em><b>Preliminary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Preliminary
	 * <!-- end-model-doc -->
	 * @see #PRELIMINARY
	 * @model name="preliminary"
	 * @generated
	 * @ordered
	 */
	public static final int PRELIMINARY_VALUE = 2;

	/**
	 * The '<em><b>Modified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modified
	 * <!-- end-model-doc -->
	 * @see #MODIFIED
	 * @model name="modified"
	 * @generated
	 * @ordered
	 */
	public static final int MODIFIED_VALUE = 3;

	/**
	 * The '<em><b>Final</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Final
	 * <!-- end-model-doc -->
	 * @see #FINAL
	 * @model name="final"
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_VALUE = 4;

	/**
	 * The '<em><b>Amended</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amended
	 * <!-- end-model-doc -->
	 * @see #AMENDED
	 * @model name="amended"
	 * @generated
	 * @ordered
	 */
	public static final int AMENDED_VALUE = 5;

	/**
	 * The '<em><b>Corrected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Corrected
	 * <!-- end-model-doc -->
	 * @see #CORRECTED
	 * @model name="corrected"
	 * @generated
	 * @ordered
	 */
	public static final int CORRECTED_VALUE = 6;

	/**
	 * The '<em><b>Appended</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appended
	 * <!-- end-model-doc -->
	 * @see #APPENDED
	 * @model name="appended"
	 * @generated
	 * @ordered
	 */
	public static final int APPENDED_VALUE = 7;

	/**
	 * The '<em><b>Cancelled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cancelled
	 * <!-- end-model-doc -->
	 * @see #CANCELLED
	 * @model name="cancelled"
	 * @generated
	 * @ordered
	 */
	public static final int CANCELLED_VALUE = 8;

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
	public static final int ENTERED_IN_ERROR_VALUE = 9;

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
	public static final int UNKNOWN_VALUE = 10;

	/**
	 * An array of all the '<em><b>Diagnostic Report Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DiagnosticReportStatusEnum[] VALUES_ARRAY =
		new DiagnosticReportStatusEnum[] {
			REGISTERED,
			PARTIAL,
			PRELIMINARY,
			MODIFIED,
			FINAL,
			AMENDED,
			CORRECTED,
			APPENDED,
			CANCELLED,
			ENTERED_IN_ERROR,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Diagnostic Report Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DiagnosticReportStatusEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Diagnostic Report Status Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DiagnosticReportStatusEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DiagnosticReportStatusEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Diagnostic Report Status Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DiagnosticReportStatusEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DiagnosticReportStatusEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Diagnostic Report Status Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DiagnosticReportStatusEnum get(int value) {
		switch (value) {
			case REGISTERED_VALUE: return REGISTERED;
			case PARTIAL_VALUE: return PARTIAL;
			case PRELIMINARY_VALUE: return PRELIMINARY;
			case MODIFIED_VALUE: return MODIFIED;
			case FINAL_VALUE: return FINAL;
			case AMENDED_VALUE: return AMENDED;
			case CORRECTED_VALUE: return CORRECTED;
			case APPENDED_VALUE: return APPENDED;
			case CANCELLED_VALUE: return CANCELLED;
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
	private DiagnosticReportStatusEnum(int value, String name, String literal) {
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
	
} //DiagnosticReportStatusEnum
