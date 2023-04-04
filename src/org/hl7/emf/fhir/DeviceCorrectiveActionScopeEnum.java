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
 * A representation of the literals of the enumeration '<em><b>Device Corrective Action Scope Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.emf.fhir.FhirPackage#getDeviceCorrectiveActionScopeEnum()
 * @model extendedMetaData="name='DeviceCorrectiveActionScopeEnum'"
 * @generated
 */
public enum DeviceCorrectiveActionScopeEnum implements Enumerator {
	/**
	 * The '<em><b>Model</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Model
	 * <!-- end-model-doc -->
	 * @see #MODEL_VALUE
	 * @generated
	 * @ordered
	 */
	MODEL(0, "model", "model"),

	/**
	 * The '<em><b>Lot Numbers</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lot Numbers
	 * <!-- end-model-doc -->
	 * @see #LOT_NUMBERS_VALUE
	 * @generated
	 * @ordered
	 */
	LOT_NUMBERS(1, "lotNumbers", "lot-numbers"),

	/**
	 * The '<em><b>Serial Numbers</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Serial Numbers
	 * <!-- end-model-doc -->
	 * @see #SERIAL_NUMBERS_VALUE
	 * @generated
	 * @ordered
	 */
	SERIAL_NUMBERS(2, "serialNumbers", "serial-numbers");

	/**
	 * The '<em><b>Model</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Model
	 * <!-- end-model-doc -->
	 * @see #MODEL
	 * @model name="model"
	 * @generated
	 * @ordered
	 */
	public static final int MODEL_VALUE = 0;

	/**
	 * The '<em><b>Lot Numbers</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lot Numbers
	 * <!-- end-model-doc -->
	 * @see #LOT_NUMBERS
	 * @model name="lotNumbers" literal="lot-numbers"
	 * @generated
	 * @ordered
	 */
	public static final int LOT_NUMBERS_VALUE = 1;

	/**
	 * The '<em><b>Serial Numbers</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Serial Numbers
	 * <!-- end-model-doc -->
	 * @see #SERIAL_NUMBERS
	 * @model name="serialNumbers" literal="serial-numbers"
	 * @generated
	 * @ordered
	 */
	public static final int SERIAL_NUMBERS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Device Corrective Action Scope Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeviceCorrectiveActionScopeEnum[] VALUES_ARRAY =
		new DeviceCorrectiveActionScopeEnum[] {
			MODEL,
			LOT_NUMBERS,
			SERIAL_NUMBERS,
		};

	/**
	 * A public read-only list of all the '<em><b>Device Corrective Action Scope Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeviceCorrectiveActionScopeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Device Corrective Action Scope Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceCorrectiveActionScopeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceCorrectiveActionScopeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Corrective Action Scope Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceCorrectiveActionScopeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceCorrectiveActionScopeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Corrective Action Scope Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceCorrectiveActionScopeEnum get(int value) {
		switch (value) {
			case MODEL_VALUE: return MODEL;
			case LOT_NUMBERS_VALUE: return LOT_NUMBERS;
			case SERIAL_NUMBERS_VALUE: return SERIAL_NUMBERS;
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
	private DeviceCorrectiveActionScopeEnum(int value, String name, String literal) {
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
	
} //DeviceCorrectiveActionScopeEnum
