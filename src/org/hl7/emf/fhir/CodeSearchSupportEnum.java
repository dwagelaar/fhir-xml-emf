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
 * A representation of the literals of the enumeration '<em><b>Code Search Support Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.emf.fhir.FhirPackage#getCodeSearchSupportEnum()
 * @model extendedMetaData="name='CodeSearchSupportEnum'"
 * @generated
 */
public enum CodeSearchSupportEnum implements Enumerator {
	/**
	 * The '<em><b>In Compose</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In Compose
	 * <!-- end-model-doc -->
	 * @see #IN_COMPOSE_VALUE
	 * @generated
	 * @ordered
	 */
	IN_COMPOSE(0, "inCompose", "in-compose"),

	/**
	 * The '<em><b>In Expansion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In Expansion
	 * <!-- end-model-doc -->
	 * @see #IN_EXPANSION_VALUE
	 * @generated
	 * @ordered
	 */
	IN_EXPANSION(1, "inExpansion", "in-expansion"),

	/**
	 * The '<em><b>In Compose Or Expansion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In Compose Or Expansion
	 * <!-- end-model-doc -->
	 * @see #IN_COMPOSE_OR_EXPANSION_VALUE
	 * @generated
	 * @ordered
	 */
	IN_COMPOSE_OR_EXPANSION(2, "inComposeOrExpansion", "in-compose-or-expansion");

	/**
	 * The '<em><b>In Compose</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In Compose
	 * <!-- end-model-doc -->
	 * @see #IN_COMPOSE
	 * @model name="inCompose" literal="in-compose"
	 * @generated
	 * @ordered
	 */
	public static final int IN_COMPOSE_VALUE = 0;

	/**
	 * The '<em><b>In Expansion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In Expansion
	 * <!-- end-model-doc -->
	 * @see #IN_EXPANSION
	 * @model name="inExpansion" literal="in-expansion"
	 * @generated
	 * @ordered
	 */
	public static final int IN_EXPANSION_VALUE = 1;

	/**
	 * The '<em><b>In Compose Or Expansion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In Compose Or Expansion
	 * <!-- end-model-doc -->
	 * @see #IN_COMPOSE_OR_EXPANSION
	 * @model name="inComposeOrExpansion" literal="in-compose-or-expansion"
	 * @generated
	 * @ordered
	 */
	public static final int IN_COMPOSE_OR_EXPANSION_VALUE = 2;

	/**
	 * An array of all the '<em><b>Code Search Support Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CodeSearchSupportEnum[] VALUES_ARRAY =
		new CodeSearchSupportEnum[] {
			IN_COMPOSE,
			IN_EXPANSION,
			IN_COMPOSE_OR_EXPANSION,
		};

	/**
	 * A public read-only list of all the '<em><b>Code Search Support Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CodeSearchSupportEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Code Search Support Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CodeSearchSupportEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CodeSearchSupportEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Code Search Support Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CodeSearchSupportEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CodeSearchSupportEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Code Search Support Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CodeSearchSupportEnum get(int value) {
		switch (value) {
			case IN_COMPOSE_VALUE: return IN_COMPOSE;
			case IN_EXPANSION_VALUE: return IN_EXPANSION;
			case IN_COMPOSE_OR_EXPANSION_VALUE: return IN_COMPOSE_OR_EXPANSION;
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
	private CodeSearchSupportEnum(int value, String name, String literal) {
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
	
} //CodeSearchSupportEnum
