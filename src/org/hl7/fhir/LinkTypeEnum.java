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
 * A representation of the literals of the enumeration '<em><b>Link Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getLinkTypeEnum()
 * @model extendedMetaData="name='LinkTypeEnum'"
 * @generated
 */
public enum LinkTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Replaced By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Replaced-by
	 * Vervangen door
	 * <!-- end-model-doc -->
	 * @see #REPLACED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACED_BY(0, "replacedBy", "replaced-by"),

	/**
	 * The '<em><b>Replaces</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Replaces
	 * Vervangt
	 * <!-- end-model-doc -->
	 * @see #REPLACES_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACES(1, "replaces", "replaces"),

	/**
	 * The '<em><b>Refer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refer
	 * Verwijzing
	 * <!-- end-model-doc -->
	 * @see #REFER_VALUE
	 * @generated
	 * @ordered
	 */
	REFER(2, "refer", "refer"),

	/**
	 * The '<em><b>Seealso</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See also
	 * Zie ook
	 * <!-- end-model-doc -->
	 * @see #SEEALSO_VALUE
	 * @generated
	 * @ordered
	 */
	SEEALSO(3, "seealso", "seealso");

	/**
	 * The '<em><b>Replaced By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Replaced-by
	 * Vervangen door
	 * <!-- end-model-doc -->
	 * @see #REPLACED_BY
	 * @model name="replacedBy" literal="replaced-by"
	 * @generated
	 * @ordered
	 */
	public static final int REPLACED_BY_VALUE = 0;

	/**
	 * The '<em><b>Replaces</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Replaces
	 * Vervangt
	 * <!-- end-model-doc -->
	 * @see #REPLACES
	 * @model name="replaces"
	 * @generated
	 * @ordered
	 */
	public static final int REPLACES_VALUE = 1;

	/**
	 * The '<em><b>Refer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refer
	 * Verwijzing
	 * <!-- end-model-doc -->
	 * @see #REFER
	 * @model name="refer"
	 * @generated
	 * @ordered
	 */
	public static final int REFER_VALUE = 2;

	/**
	 * The '<em><b>Seealso</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See also
	 * Zie ook
	 * <!-- end-model-doc -->
	 * @see #SEEALSO
	 * @model name="seealso"
	 * @generated
	 * @ordered
	 */
	public static final int SEEALSO_VALUE = 3;

	/**
	 * An array of all the '<em><b>Link Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LinkTypeEnum[] VALUES_ARRAY =
		new LinkTypeEnum[] {
			REPLACED_BY,
			REPLACES,
			REFER,
			SEEALSO,
		};

	/**
	 * A public read-only list of all the '<em><b>Link Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LinkTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Link Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LinkTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LinkTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Link Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LinkTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LinkTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Link Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LinkTypeEnum get(int value) {
		switch (value) {
			case REPLACED_BY_VALUE: return REPLACED_BY;
			case REPLACES_VALUE: return REPLACES;
			case REFER_VALUE: return REFER;
			case SEEALSO_VALUE: return SEEALSO;
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
	private LinkTypeEnum(int value, String name, String literal) {
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
	
} //LinkTypeEnum