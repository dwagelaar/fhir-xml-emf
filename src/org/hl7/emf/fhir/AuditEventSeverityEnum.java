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
 * A representation of the literals of the enumeration '<em><b>Audit Event Severity Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.emf.fhir.FhirPackage#getAuditEventSeverityEnum()
 * @model extendedMetaData="name='AuditEventSeverityEnum'"
 * @generated
 */
public enum AuditEventSeverityEnum implements Enumerator {
	/**
	 * The '<em><b>Emergency</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Emergency
	 * <!-- end-model-doc -->
	 * @see #EMERGENCY_VALUE
	 * @generated
	 * @ordered
	 */
	EMERGENCY(0, "emergency", "emergency"),

	/**
	 * The '<em><b>Alert</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Alert
	 * <!-- end-model-doc -->
	 * @see #ALERT_VALUE
	 * @generated
	 * @ordered
	 */
	ALERT(1, "alert", "alert"),

	/**
	 * The '<em><b>Critical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Critical
	 * <!-- end-model-doc -->
	 * @see #CRITICAL_VALUE
	 * @generated
	 * @ordered
	 */
	CRITICAL(2, "critical", "critical"),

	/**
	 * The '<em><b>Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error
	 * <!-- end-model-doc -->
	 * @see #ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR(3, "error", "error"),

	/**
	 * The '<em><b>Warning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Warning
	 * <!-- end-model-doc -->
	 * @see #WARNING_VALUE
	 * @generated
	 * @ordered
	 */
	WARNING(4, "warning", "warning"),

	/**
	 * The '<em><b>Notice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Notice
	 * <!-- end-model-doc -->
	 * @see #NOTICE_VALUE
	 * @generated
	 * @ordered
	 */
	NOTICE(5, "notice", "notice"),

	/**
	 * The '<em><b>Informational</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Informational
	 * <!-- end-model-doc -->
	 * @see #INFORMATIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	INFORMATIONAL(6, "informational", "informational"),

	/**
	 * The '<em><b>Debug</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Debug
	 * <!-- end-model-doc -->
	 * @see #DEBUG_VALUE
	 * @generated
	 * @ordered
	 */
	DEBUG(7, "debug", "debug");

	/**
	 * The '<em><b>Emergency</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Emergency
	 * <!-- end-model-doc -->
	 * @see #EMERGENCY
	 * @model name="emergency"
	 * @generated
	 * @ordered
	 */
	public static final int EMERGENCY_VALUE = 0;

	/**
	 * The '<em><b>Alert</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Alert
	 * <!-- end-model-doc -->
	 * @see #ALERT
	 * @model name="alert"
	 * @generated
	 * @ordered
	 */
	public static final int ALERT_VALUE = 1;

	/**
	 * The '<em><b>Critical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Critical
	 * <!-- end-model-doc -->
	 * @see #CRITICAL
	 * @model name="critical"
	 * @generated
	 * @ordered
	 */
	public static final int CRITICAL_VALUE = 2;

	/**
	 * The '<em><b>Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error
	 * <!-- end-model-doc -->
	 * @see #ERROR
	 * @model name="error"
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_VALUE = 3;

	/**
	 * The '<em><b>Warning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Warning
	 * <!-- end-model-doc -->
	 * @see #WARNING
	 * @model name="warning"
	 * @generated
	 * @ordered
	 */
	public static final int WARNING_VALUE = 4;

	/**
	 * The '<em><b>Notice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Notice
	 * <!-- end-model-doc -->
	 * @see #NOTICE
	 * @model name="notice"
	 * @generated
	 * @ordered
	 */
	public static final int NOTICE_VALUE = 5;

	/**
	 * The '<em><b>Informational</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Informational
	 * <!-- end-model-doc -->
	 * @see #INFORMATIONAL
	 * @model name="informational"
	 * @generated
	 * @ordered
	 */
	public static final int INFORMATIONAL_VALUE = 6;

	/**
	 * The '<em><b>Debug</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Debug
	 * <!-- end-model-doc -->
	 * @see #DEBUG
	 * @model name="debug"
	 * @generated
	 * @ordered
	 */
	public static final int DEBUG_VALUE = 7;

	/**
	 * An array of all the '<em><b>Audit Event Severity Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AuditEventSeverityEnum[] VALUES_ARRAY =
		new AuditEventSeverityEnum[] {
			EMERGENCY,
			ALERT,
			CRITICAL,
			ERROR,
			WARNING,
			NOTICE,
			INFORMATIONAL,
			DEBUG,
		};

	/**
	 * A public read-only list of all the '<em><b>Audit Event Severity Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AuditEventSeverityEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Audit Event Severity Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuditEventSeverityEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AuditEventSeverityEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Audit Event Severity Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuditEventSeverityEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AuditEventSeverityEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Audit Event Severity Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuditEventSeverityEnum get(int value) {
		switch (value) {
			case EMERGENCY_VALUE: return EMERGENCY;
			case ALERT_VALUE: return ALERT;
			case CRITICAL_VALUE: return CRITICAL;
			case ERROR_VALUE: return ERROR;
			case WARNING_VALUE: return WARNING;
			case NOTICE_VALUE: return NOTICE;
			case INFORMATIONAL_VALUE: return INFORMATIONAL;
			case DEBUG_VALUE: return DEBUG;
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
	private AuditEventSeverityEnum(int value, String name, String literal) {
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
	
} //AuditEventSeverityEnum
