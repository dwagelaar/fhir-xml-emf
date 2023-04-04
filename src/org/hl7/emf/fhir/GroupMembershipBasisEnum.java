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
 * A representation of the literals of the enumeration '<em><b>Group Membership Basis Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.emf.fhir.FhirPackage#getGroupMembershipBasisEnum()
 * @model extendedMetaData="name='GroupMembershipBasisEnum'"
 * @generated
 */
public enum GroupMembershipBasisEnum implements Enumerator {
	/**
	 * The '<em><b>Definitional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definitional
	 * <!-- end-model-doc -->
	 * @see #DEFINITIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	DEFINITIONAL(0, "definitional", "definitional"),

	/**
	 * The '<em><b>Enumerated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumerated
	 * <!-- end-model-doc -->
	 * @see #ENUMERATED_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMERATED(1, "enumerated", "enumerated");

	/**
	 * The '<em><b>Definitional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definitional
	 * <!-- end-model-doc -->
	 * @see #DEFINITIONAL
	 * @model name="definitional"
	 * @generated
	 * @ordered
	 */
	public static final int DEFINITIONAL_VALUE = 0;

	/**
	 * The '<em><b>Enumerated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumerated
	 * <!-- end-model-doc -->
	 * @see #ENUMERATED
	 * @model name="enumerated"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMERATED_VALUE = 1;

	/**
	 * An array of all the '<em><b>Group Membership Basis Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GroupMembershipBasisEnum[] VALUES_ARRAY =
		new GroupMembershipBasisEnum[] {
			DEFINITIONAL,
			ENUMERATED,
		};

	/**
	 * A public read-only list of all the '<em><b>Group Membership Basis Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GroupMembershipBasisEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Group Membership Basis Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GroupMembershipBasisEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GroupMembershipBasisEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Group Membership Basis Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GroupMembershipBasisEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GroupMembershipBasisEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Group Membership Basis Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GroupMembershipBasisEnum get(int value) {
		switch (value) {
			case DEFINITIONAL_VALUE: return DEFINITIONAL;
			case ENUMERATED_VALUE: return ENUMERATED;
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
	private GroupMembershipBasisEnum(int value, String name, String literal) {
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
	
} //GroupMembershipBasisEnum
