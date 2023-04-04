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
 * A representation of the literals of the enumeration '<em><b>Discriminator Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.emf.fhir.FhirPackage#getDiscriminatorTypeEnum()
 * @model extendedMetaData="name='DiscriminatorTypeEnum'"
 * @generated
 */
public enum DiscriminatorTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value
	 * <!-- end-model-doc -->
	 * @see #VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE(0, "value", "value"),

	/**
	 * The '<em><b>Exists</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exists
	 * <!-- end-model-doc -->
	 * @see #EXISTS_VALUE
	 * @generated
	 * @ordered
	 */
	EXISTS(1, "exists", "exists"),

	/**
	 * The '<em><b>Pattern</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pattern
	 * <!-- end-model-doc -->
	 * @see #PATTERN_VALUE
	 * @generated
	 * @ordered
	 */
	PATTERN(2, "pattern", "pattern"),

	/**
	 * The '<em><b>Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type
	 * <!-- end-model-doc -->
	 * @see #TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE(3, "type", "type"),

	/**
	 * The '<em><b>Profile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Profile
	 * <!-- end-model-doc -->
	 * @see #PROFILE_VALUE
	 * @generated
	 * @ordered
	 */
	PROFILE(4, "profile", "profile"),

	/**
	 * The '<em><b>Position</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Position
	 * <!-- end-model-doc -->
	 * @see #POSITION_VALUE
	 * @generated
	 * @ordered
	 */
	POSITION(5, "position", "position");

	/**
	 * The '<em><b>Value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value
	 * <!-- end-model-doc -->
	 * @see #VALUE
	 * @model name="value"
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_VALUE = 0;

	/**
	 * The '<em><b>Exists</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exists
	 * <!-- end-model-doc -->
	 * @see #EXISTS
	 * @model name="exists"
	 * @generated
	 * @ordered
	 */
	public static final int EXISTS_VALUE = 1;

	/**
	 * The '<em><b>Pattern</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pattern
	 * <!-- end-model-doc -->
	 * @see #PATTERN
	 * @model name="pattern"
	 * @generated
	 * @ordered
	 */
	public static final int PATTERN_VALUE = 2;

	/**
	 * The '<em><b>Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type
	 * <!-- end-model-doc -->
	 * @see #TYPE
	 * @model name="type"
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_VALUE = 3;

	/**
	 * The '<em><b>Profile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Profile
	 * <!-- end-model-doc -->
	 * @see #PROFILE
	 * @model name="profile"
	 * @generated
	 * @ordered
	 */
	public static final int PROFILE_VALUE = 4;

	/**
	 * The '<em><b>Position</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Position
	 * <!-- end-model-doc -->
	 * @see #POSITION
	 * @model name="position"
	 * @generated
	 * @ordered
	 */
	public static final int POSITION_VALUE = 5;

	/**
	 * An array of all the '<em><b>Discriminator Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DiscriminatorTypeEnum[] VALUES_ARRAY =
		new DiscriminatorTypeEnum[] {
			VALUE,
			EXISTS,
			PATTERN,
			TYPE,
			PROFILE,
			POSITION,
		};

	/**
	 * A public read-only list of all the '<em><b>Discriminator Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DiscriminatorTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Discriminator Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DiscriminatorTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DiscriminatorTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Discriminator Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DiscriminatorTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DiscriminatorTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Discriminator Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DiscriminatorTypeEnum get(int value) {
		switch (value) {
			case VALUE_VALUE: return VALUE;
			case EXISTS_VALUE: return EXISTS;
			case PATTERN_VALUE: return PATTERN;
			case TYPE_VALUE: return TYPE;
			case PROFILE_VALUE: return PROFILE;
			case POSITION_VALUE: return POSITION;
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
	private DiscriminatorTypeEnum(int value, String name, String literal) {
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
	
} //DiscriminatorTypeEnum
