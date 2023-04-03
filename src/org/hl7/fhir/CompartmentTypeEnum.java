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
 * A representation of the literals of the enumeration '<em><b>Compartment Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getCompartmentTypeEnum()
 * @model extendedMetaData="name='CompartmentTypeEnum'"
 * @generated
 */
public enum CompartmentTypeEnum implements Enumerator {
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
	PATIENT(0, "Patient", "Patient"),

	/**
	 * The '<em><b>Encounter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Encounter
	 * <!-- end-model-doc -->
	 * @see #ENCOUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	ENCOUNTER(1, "Encounter", "Encounter"),

	/**
	 * The '<em><b>Related Person</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RelatedPerson
	 * <!-- end-model-doc -->
	 * @see #RELATED_PERSON_VALUE
	 * @generated
	 * @ordered
	 */
	RELATED_PERSON(2, "RelatedPerson", "RelatedPerson"),

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
	PRACTITIONER(3, "Practitioner", "Practitioner"),

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
	DEVICE(4, "Device", "Device"),

	/**
	 * The '<em><b>Episode Of Care</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EpisodeOfCare
	 * <!-- end-model-doc -->
	 * @see #EPISODE_OF_CARE_VALUE
	 * @generated
	 * @ordered
	 */
	EPISODE_OF_CARE(5, "EpisodeOfCare", "EpisodeOfCare");

	/**
	 * The '<em><b>Patient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient
	 * <!-- end-model-doc -->
	 * @see #PATIENT
	 * @model name="Patient"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENT_VALUE = 0;

	/**
	 * The '<em><b>Encounter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Encounter
	 * <!-- end-model-doc -->
	 * @see #ENCOUNTER
	 * @model name="Encounter"
	 * @generated
	 * @ordered
	 */
	public static final int ENCOUNTER_VALUE = 1;

	/**
	 * The '<em><b>Related Person</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RelatedPerson
	 * <!-- end-model-doc -->
	 * @see #RELATED_PERSON
	 * @model name="RelatedPerson"
	 * @generated
	 * @ordered
	 */
	public static final int RELATED_PERSON_VALUE = 2;

	/**
	 * The '<em><b>Practitioner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Practitioner
	 * <!-- end-model-doc -->
	 * @see #PRACTITIONER
	 * @model name="Practitioner"
	 * @generated
	 * @ordered
	 */
	public static final int PRACTITIONER_VALUE = 3;

	/**
	 * The '<em><b>Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Device
	 * <!-- end-model-doc -->
	 * @see #DEVICE
	 * @model name="Device"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_VALUE = 4;

	/**
	 * The '<em><b>Episode Of Care</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EpisodeOfCare
	 * <!-- end-model-doc -->
	 * @see #EPISODE_OF_CARE
	 * @model name="EpisodeOfCare"
	 * @generated
	 * @ordered
	 */
	public static final int EPISODE_OF_CARE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Compartment Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CompartmentTypeEnum[] VALUES_ARRAY =
		new CompartmentTypeEnum[] {
			PATIENT,
			ENCOUNTER,
			RELATED_PERSON,
			PRACTITIONER,
			DEVICE,
			EPISODE_OF_CARE,
		};

	/**
	 * A public read-only list of all the '<em><b>Compartment Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CompartmentTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Compartment Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompartmentTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompartmentTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Compartment Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompartmentTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompartmentTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Compartment Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompartmentTypeEnum get(int value) {
		switch (value) {
			case PATIENT_VALUE: return PATIENT;
			case ENCOUNTER_VALUE: return ENCOUNTER;
			case RELATED_PERSON_VALUE: return RELATED_PERSON;
			case PRACTITIONER_VALUE: return PRACTITIONER;
			case DEVICE_VALUE: return DEVICE;
			case EPISODE_OF_CARE_VALUE: return EPISODE_OF_CARE;
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
	private CompartmentTypeEnum(int value, String name, String literal) {
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
	
} //CompartmentTypeEnum
