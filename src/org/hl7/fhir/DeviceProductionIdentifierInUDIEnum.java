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
 * A representation of the literals of the enumeration '<em><b>Device Production Identifier In UDI Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getDeviceProductionIdentifierInUDIEnum()
 * @model extendedMetaData="name='DeviceProductionIdentifierInUDIEnum'"
 * @generated
 */
public enum DeviceProductionIdentifierInUDIEnum implements Enumerator {
	/**
	 * The '<em><b>Lot Number</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lot Number
	 * <!-- end-model-doc -->
	 * @see #LOT_NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	LOT_NUMBER(0, "lotNumber", "lot-number"),

	/**
	 * The '<em><b>Manufactured Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manufactured date
	 * <!-- end-model-doc -->
	 * @see #MANUFACTURED_DATE_VALUE
	 * @generated
	 * @ordered
	 */
	MANUFACTURED_DATE(1, "manufacturedDate", "manufactured-date"),

	/**
	 * The '<em><b>Serial Number</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Serial Number
	 * <!-- end-model-doc -->
	 * @see #SERIAL_NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	SERIAL_NUMBER(2, "serialNumber", "serial-number"),

	/**
	 * The '<em><b>Expiration Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expiration date
	 * <!-- end-model-doc -->
	 * @see #EXPIRATION_DATE_VALUE
	 * @generated
	 * @ordered
	 */
	EXPIRATION_DATE(3, "expirationDate", "expiration-date"),

	/**
	 * The '<em><b>Biological Source</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Biological source
	 * <!-- end-model-doc -->
	 * @see #BIOLOGICAL_SOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	BIOLOGICAL_SOURCE(4, "biologicalSource", "biological-source"),

	/**
	 * The '<em><b>Software Version</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Software Version
	 * <!-- end-model-doc -->
	 * @see #SOFTWARE_VERSION_VALUE
	 * @generated
	 * @ordered
	 */
	SOFTWARE_VERSION(5, "softwareVersion", "software-version");

	/**
	 * The '<em><b>Lot Number</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lot Number
	 * <!-- end-model-doc -->
	 * @see #LOT_NUMBER
	 * @model name="lotNumber" literal="lot-number"
	 * @generated
	 * @ordered
	 */
	public static final int LOT_NUMBER_VALUE = 0;

	/**
	 * The '<em><b>Manufactured Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manufactured date
	 * <!-- end-model-doc -->
	 * @see #MANUFACTURED_DATE
	 * @model name="manufacturedDate" literal="manufactured-date"
	 * @generated
	 * @ordered
	 */
	public static final int MANUFACTURED_DATE_VALUE = 1;

	/**
	 * The '<em><b>Serial Number</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Serial Number
	 * <!-- end-model-doc -->
	 * @see #SERIAL_NUMBER
	 * @model name="serialNumber" literal="serial-number"
	 * @generated
	 * @ordered
	 */
	public static final int SERIAL_NUMBER_VALUE = 2;

	/**
	 * The '<em><b>Expiration Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expiration date
	 * <!-- end-model-doc -->
	 * @see #EXPIRATION_DATE
	 * @model name="expirationDate" literal="expiration-date"
	 * @generated
	 * @ordered
	 */
	public static final int EXPIRATION_DATE_VALUE = 3;

	/**
	 * The '<em><b>Biological Source</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Biological source
	 * <!-- end-model-doc -->
	 * @see #BIOLOGICAL_SOURCE
	 * @model name="biologicalSource" literal="biological-source"
	 * @generated
	 * @ordered
	 */
	public static final int BIOLOGICAL_SOURCE_VALUE = 4;

	/**
	 * The '<em><b>Software Version</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Software Version
	 * <!-- end-model-doc -->
	 * @see #SOFTWARE_VERSION
	 * @model name="softwareVersion" literal="software-version"
	 * @generated
	 * @ordered
	 */
	public static final int SOFTWARE_VERSION_VALUE = 5;

	/**
	 * An array of all the '<em><b>Device Production Identifier In UDI Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeviceProductionIdentifierInUDIEnum[] VALUES_ARRAY =
		new DeviceProductionIdentifierInUDIEnum[] {
			LOT_NUMBER,
			MANUFACTURED_DATE,
			SERIAL_NUMBER,
			EXPIRATION_DATE,
			BIOLOGICAL_SOURCE,
			SOFTWARE_VERSION,
		};

	/**
	 * A public read-only list of all the '<em><b>Device Production Identifier In UDI Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeviceProductionIdentifierInUDIEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Device Production Identifier In UDI Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceProductionIdentifierInUDIEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceProductionIdentifierInUDIEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Production Identifier In UDI Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceProductionIdentifierInUDIEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceProductionIdentifierInUDIEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Production Identifier In UDI Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceProductionIdentifierInUDIEnum get(int value) {
		switch (value) {
			case LOT_NUMBER_VALUE: return LOT_NUMBER;
			case MANUFACTURED_DATE_VALUE: return MANUFACTURED_DATE;
			case SERIAL_NUMBER_VALUE: return SERIAL_NUMBER;
			case EXPIRATION_DATE_VALUE: return EXPIRATION_DATE;
			case BIOLOGICAL_SOURCE_VALUE: return BIOLOGICAL_SOURCE;
			case SOFTWARE_VERSION_VALUE: return SOFTWARE_VERSION;
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
	private DeviceProductionIdentifierInUDIEnum(int value, String name, String literal) {
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
	
} //DeviceProductionIdentifierInUDIEnum
