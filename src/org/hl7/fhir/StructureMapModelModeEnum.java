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
 * A representation of the literals of the enumeration '<em><b>Structure Map Model Mode Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getStructureMapModelModeEnum()
 * @model extendedMetaData="name='StructureMapModelModeEnum'"
 * @generated
 */
public enum StructureMapModelModeEnum implements Enumerator {
	/**
	 * The '<em><b>Source</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source Structure Definition
	 * <!-- end-model-doc -->
	 * @see #SOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE(0, "source", "source"),

	/**
	 * The '<em><b>Queried</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Queried Structure Definition
	 * <!-- end-model-doc -->
	 * @see #QUERIED_VALUE
	 * @generated
	 * @ordered
	 */
	QUERIED(1, "queried", "queried"),

	/**
	 * The '<em><b>Target</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target Structure Definition
	 * <!-- end-model-doc -->
	 * @see #TARGET_VALUE
	 * @generated
	 * @ordered
	 */
	TARGET(2, "target", "target"),

	/**
	 * The '<em><b>Produced</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Produced Structure Definition
	 * <!-- end-model-doc -->
	 * @see #PRODUCED_VALUE
	 * @generated
	 * @ordered
	 */
	PRODUCED(3, "produced", "produced");

	/**
	 * The '<em><b>Source</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source Structure Definition
	 * <!-- end-model-doc -->
	 * @see #SOURCE
	 * @model name="source"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_VALUE = 0;

	/**
	 * The '<em><b>Queried</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Queried Structure Definition
	 * <!-- end-model-doc -->
	 * @see #QUERIED
	 * @model name="queried"
	 * @generated
	 * @ordered
	 */
	public static final int QUERIED_VALUE = 1;

	/**
	 * The '<em><b>Target</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target Structure Definition
	 * <!-- end-model-doc -->
	 * @see #TARGET
	 * @model name="target"
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_VALUE = 2;

	/**
	 * The '<em><b>Produced</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Produced Structure Definition
	 * <!-- end-model-doc -->
	 * @see #PRODUCED
	 * @model name="produced"
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Structure Map Model Mode Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StructureMapModelModeEnum[] VALUES_ARRAY =
		new StructureMapModelModeEnum[] {
			SOURCE,
			QUERIED,
			TARGET,
			PRODUCED,
		};

	/**
	 * A public read-only list of all the '<em><b>Structure Map Model Mode Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StructureMapModelModeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Structure Map Model Mode Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructureMapModelModeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StructureMapModelModeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Structure Map Model Mode Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructureMapModelModeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StructureMapModelModeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Structure Map Model Mode Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructureMapModelModeEnum get(int value) {
		switch (value) {
			case SOURCE_VALUE: return SOURCE;
			case QUERIED_VALUE: return QUERIED;
			case TARGET_VALUE: return TARGET;
			case PRODUCED_VALUE: return PRODUCED;
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
	private StructureMapModelModeEnum(int value, String name, String literal) {
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
	
} //StructureMapModelModeEnum
