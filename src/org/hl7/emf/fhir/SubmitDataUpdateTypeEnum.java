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
 * A representation of the literals of the enumeration '<em><b>Submit Data Update Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.emf.fhir.FhirPackage#getSubmitDataUpdateTypeEnum()
 * @model extendedMetaData="name='SubmitDataUpdateTypeEnum'"
 * @generated
 */
public enum SubmitDataUpdateTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Incremental</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Incremental
	 * <!-- end-model-doc -->
	 * @see #INCREMENTAL_VALUE
	 * @generated
	 * @ordered
	 */
	INCREMENTAL(0, "incremental", "incremental"),

	/**
	 * The '<em><b>Snapshot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Snapshot
	 * <!-- end-model-doc -->
	 * @see #SNAPSHOT_VALUE
	 * @generated
	 * @ordered
	 */
	SNAPSHOT(1, "snapshot", "snapshot");

	/**
	 * The '<em><b>Incremental</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Incremental
	 * <!-- end-model-doc -->
	 * @see #INCREMENTAL
	 * @model name="incremental"
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENTAL_VALUE = 0;

	/**
	 * The '<em><b>Snapshot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Snapshot
	 * <!-- end-model-doc -->
	 * @see #SNAPSHOT
	 * @model name="snapshot"
	 * @generated
	 * @ordered
	 */
	public static final int SNAPSHOT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Submit Data Update Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SubmitDataUpdateTypeEnum[] VALUES_ARRAY =
		new SubmitDataUpdateTypeEnum[] {
			INCREMENTAL,
			SNAPSHOT,
		};

	/**
	 * A public read-only list of all the '<em><b>Submit Data Update Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SubmitDataUpdateTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Submit Data Update Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SubmitDataUpdateTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SubmitDataUpdateTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Submit Data Update Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SubmitDataUpdateTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SubmitDataUpdateTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Submit Data Update Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SubmitDataUpdateTypeEnum get(int value) {
		switch (value) {
			case INCREMENTAL_VALUE: return INCREMENTAL;
			case SNAPSHOT_VALUE: return SNAPSHOT;
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
	private SubmitDataUpdateTypeEnum(int value, String name, String literal) {
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
	
} //SubmitDataUpdateTypeEnum
