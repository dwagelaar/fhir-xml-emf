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
 * A representation of the literals of the enumeration '<em><b>Device Name Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.emf.fhir.FhirPackage#getDeviceNameTypeEnum()
 * @model extendedMetaData="name='DeviceNameTypeEnum'"
 * @generated
 */
public enum DeviceNameTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Registered Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Registered name
	 * <!-- end-model-doc -->
	 * @see #REGISTERED_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	REGISTERED_NAME(0, "registeredName", "registered-name"),

	/**
	 * The '<em><b>User Friendly Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User Friendly name
	 * <!-- end-model-doc -->
	 * @see #USER_FRIENDLY_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	USER_FRIENDLY_NAME(1, "userFriendlyName", "user-friendly-name"),

	/**
	 * The '<em><b>Patient Reported Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient Reported name
	 * <!-- end-model-doc -->
	 * @see #PATIENT_REPORTED_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENT_REPORTED_NAME(2, "patientReportedName", "patient-reported-name");

	/**
	 * The '<em><b>Registered Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Registered name
	 * <!-- end-model-doc -->
	 * @see #REGISTERED_NAME
	 * @model name="registeredName" literal="registered-name"
	 * @generated
	 * @ordered
	 */
	public static final int REGISTERED_NAME_VALUE = 0;

	/**
	 * The '<em><b>User Friendly Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User Friendly name
	 * <!-- end-model-doc -->
	 * @see #USER_FRIENDLY_NAME
	 * @model name="userFriendlyName" literal="user-friendly-name"
	 * @generated
	 * @ordered
	 */
	public static final int USER_FRIENDLY_NAME_VALUE = 1;

	/**
	 * The '<em><b>Patient Reported Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient Reported name
	 * <!-- end-model-doc -->
	 * @see #PATIENT_REPORTED_NAME
	 * @model name="patientReportedName" literal="patient-reported-name"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENT_REPORTED_NAME_VALUE = 2;

	/**
	 * An array of all the '<em><b>Device Name Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeviceNameTypeEnum[] VALUES_ARRAY =
		new DeviceNameTypeEnum[] {
			REGISTERED_NAME,
			USER_FRIENDLY_NAME,
			PATIENT_REPORTED_NAME,
		};

	/**
	 * A public read-only list of all the '<em><b>Device Name Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeviceNameTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Device Name Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceNameTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceNameTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Name Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceNameTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceNameTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Name Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceNameTypeEnum get(int value) {
		switch (value) {
			case REGISTERED_NAME_VALUE: return REGISTERED_NAME;
			case USER_FRIENDLY_NAME_VALUE: return USER_FRIENDLY_NAME;
			case PATIENT_REPORTED_NAME_VALUE: return PATIENT_REPORTED_NAME;
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
	private DeviceNameTypeEnum(int value, String name, String literal) {
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
	
} //DeviceNameTypeEnum
