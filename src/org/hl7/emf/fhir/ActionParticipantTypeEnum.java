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
 * A representation of the literals of the enumeration '<em><b>Action Participant Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.emf.fhir.FhirPackage#getActionParticipantTypeEnum()
 * @model extendedMetaData="name='ActionParticipantTypeEnum'"
 * @generated
 */
public enum ActionParticipantTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Careteam</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CareTeam
	 * <!-- end-model-doc -->
	 * @see #CARETEAM_VALUE
	 * @generated
	 * @ordered
	 */
	CARETEAM(0, "careteam", "careteam"),

	/**
	 * The '<em><b>Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Device
	 * <!-- end-model-doc -->
	 * @see #DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE(1, "device", "device"),

	/**
	 * The '<em><b>Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Group
	 * <!-- end-model-doc -->
	 * @see #GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	GROUP(2, "group", "group"),

	/**
	 * The '<em><b>Healthcareservice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HealthcareService
	 * <!-- end-model-doc -->
	 * @see #HEALTHCARESERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	HEALTHCARESERVICE(3, "healthcareservice", "healthcareservice"),

	/**
	 * The '<em><b>Location</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Location
	 * <!-- end-model-doc -->
	 * @see #LOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	LOCATION(4, "location", "location"),

	/**
	 * The '<em><b>Organization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organization
	 * <!-- end-model-doc -->
	 * @see #ORGANIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	ORGANIZATION(5, "organization", "organization"),

	/**
	 * The '<em><b>Patient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient
	 * <!-- end-model-doc -->
	 * @see #PATIENT_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENT(6, "patient", "patient"),

	/**
	 * The '<em><b>Practitioner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Practitioner
	 * <!-- end-model-doc -->
	 * @see #PRACTITIONER_VALUE
	 * @generated
	 * @ordered
	 */
	PRACTITIONER(7, "practitioner", "practitioner"),

	/**
	 * The '<em><b>Practitionerrole</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PractitionerRole
	 * <!-- end-model-doc -->
	 * @see #PRACTITIONERROLE_VALUE
	 * @generated
	 * @ordered
	 */
	PRACTITIONERROLE(8, "practitionerrole", "practitionerrole"),

	/**
	 * The '<em><b>Relatedperson</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RelatedPerson
	 * <!-- end-model-doc -->
	 * @see #RELATEDPERSON_VALUE
	 * @generated
	 * @ordered
	 */
	RELATEDPERSON(9, "relatedperson", "relatedperson");

	/**
	 * The '<em><b>Careteam</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CareTeam
	 * <!-- end-model-doc -->
	 * @see #CARETEAM
	 * @model name="careteam"
	 * @generated
	 * @ordered
	 */
	public static final int CARETEAM_VALUE = 0;

	/**
	 * The '<em><b>Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Device
	 * <!-- end-model-doc -->
	 * @see #DEVICE
	 * @model name="device"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_VALUE = 1;

	/**
	 * The '<em><b>Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Group
	 * <!-- end-model-doc -->
	 * @see #GROUP
	 * @model name="group"
	 * @generated
	 * @ordered
	 */
	public static final int GROUP_VALUE = 2;

	/**
	 * The '<em><b>Healthcareservice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HealthcareService
	 * <!-- end-model-doc -->
	 * @see #HEALTHCARESERVICE
	 * @model name="healthcareservice"
	 * @generated
	 * @ordered
	 */
	public static final int HEALTHCARESERVICE_VALUE = 3;

	/**
	 * The '<em><b>Location</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Location
	 * <!-- end-model-doc -->
	 * @see #LOCATION
	 * @model name="location"
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION_VALUE = 4;

	/**
	 * The '<em><b>Organization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organization
	 * <!-- end-model-doc -->
	 * @see #ORGANIZATION
	 * @model name="organization"
	 * @generated
	 * @ordered
	 */
	public static final int ORGANIZATION_VALUE = 5;

	/**
	 * The '<em><b>Patient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient
	 * <!-- end-model-doc -->
	 * @see #PATIENT
	 * @model name="patient"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENT_VALUE = 6;

	/**
	 * The '<em><b>Practitioner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Practitioner
	 * <!-- end-model-doc -->
	 * @see #PRACTITIONER
	 * @model name="practitioner"
	 * @generated
	 * @ordered
	 */
	public static final int PRACTITIONER_VALUE = 7;

	/**
	 * The '<em><b>Practitionerrole</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PractitionerRole
	 * <!-- end-model-doc -->
	 * @see #PRACTITIONERROLE
	 * @model name="practitionerrole"
	 * @generated
	 * @ordered
	 */
	public static final int PRACTITIONERROLE_VALUE = 8;

	/**
	 * The '<em><b>Relatedperson</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RelatedPerson
	 * <!-- end-model-doc -->
	 * @see #RELATEDPERSON
	 * @model name="relatedperson"
	 * @generated
	 * @ordered
	 */
	public static final int RELATEDPERSON_VALUE = 9;

	/**
	 * An array of all the '<em><b>Action Participant Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActionParticipantTypeEnum[] VALUES_ARRAY =
		new ActionParticipantTypeEnum[] {
			CARETEAM,
			DEVICE,
			GROUP,
			HEALTHCARESERVICE,
			LOCATION,
			ORGANIZATION,
			PATIENT,
			PRACTITIONER,
			PRACTITIONERROLE,
			RELATEDPERSON,
		};

	/**
	 * A public read-only list of all the '<em><b>Action Participant Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActionParticipantTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Action Participant Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActionParticipantTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionParticipantTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Participant Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActionParticipantTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionParticipantTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Participant Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActionParticipantTypeEnum get(int value) {
		switch (value) {
			case CARETEAM_VALUE: return CARETEAM;
			case DEVICE_VALUE: return DEVICE;
			case GROUP_VALUE: return GROUP;
			case HEALTHCARESERVICE_VALUE: return HEALTHCARESERVICE;
			case LOCATION_VALUE: return LOCATION;
			case ORGANIZATION_VALUE: return ORGANIZATION;
			case PATIENT_VALUE: return PATIENT;
			case PRACTITIONER_VALUE: return PRACTITIONER;
			case PRACTITIONERROLE_VALUE: return PRACTITIONERROLE;
			case RELATEDPERSON_VALUE: return RELATEDPERSON;
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
	private ActionParticipantTypeEnum(int value, String name, String literal) {
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
	
} //ActionParticipantTypeEnum
