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
 * A representation of the literals of the enumeration '<em><b>Report Relationship Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getReportRelationshipTypeEnum()
 * @model extendedMetaData="name='ReportRelationshipTypeEnum'"
 * @generated
 */
public enum ReportRelationshipTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Replaces</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Replaces
	 * <!-- end-model-doc -->
	 * @see #REPLACES_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACES(0, "replaces", "replaces"),

	/**
	 * The '<em><b>Amends</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amends
	 * <!-- end-model-doc -->
	 * @see #AMENDS_VALUE
	 * @generated
	 * @ordered
	 */
	AMENDS(1, "amends", "amends"),

	/**
	 * The '<em><b>Appends</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appends
	 * <!-- end-model-doc -->
	 * @see #APPENDS_VALUE
	 * @generated
	 * @ordered
	 */
	APPENDS(2, "appends", "appends"),

	/**
	 * The '<em><b>Transforms</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transforms
	 * <!-- end-model-doc -->
	 * @see #TRANSFORMS_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFORMS(3, "transforms", "transforms"),

	/**
	 * The '<em><b>Replaced With</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Replaced With
	 * <!-- end-model-doc -->
	 * @see #REPLACED_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACED_WITH(4, "replacedWith", "replacedWith"),

	/**
	 * The '<em><b>Amended With</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amended With
	 * <!-- end-model-doc -->
	 * @see #AMENDED_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	AMENDED_WITH(5, "amendedWith", "amendedWith"),

	/**
	 * The '<em><b>Appended With</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appended With
	 * <!-- end-model-doc -->
	 * @see #APPENDED_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	APPENDED_WITH(6, "appendedWith", "appendedWith"),

	/**
	 * The '<em><b>Transformed With</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transformed With
	 * <!-- end-model-doc -->
	 * @see #TRANSFORMED_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFORMED_WITH(7, "transformedWith", "transformedWith");

	/**
	 * The '<em><b>Replaces</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Replaces
	 * <!-- end-model-doc -->
	 * @see #REPLACES
	 * @model name="replaces"
	 * @generated
	 * @ordered
	 */
	public static final int REPLACES_VALUE = 0;

	/**
	 * The '<em><b>Amends</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amends
	 * <!-- end-model-doc -->
	 * @see #AMENDS
	 * @model name="amends"
	 * @generated
	 * @ordered
	 */
	public static final int AMENDS_VALUE = 1;

	/**
	 * The '<em><b>Appends</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appends
	 * <!-- end-model-doc -->
	 * @see #APPENDS
	 * @model name="appends"
	 * @generated
	 * @ordered
	 */
	public static final int APPENDS_VALUE = 2;

	/**
	 * The '<em><b>Transforms</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transforms
	 * <!-- end-model-doc -->
	 * @see #TRANSFORMS
	 * @model name="transforms"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMS_VALUE = 3;

	/**
	 * The '<em><b>Replaced With</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Replaced With
	 * <!-- end-model-doc -->
	 * @see #REPLACED_WITH
	 * @model name="replacedWith"
	 * @generated
	 * @ordered
	 */
	public static final int REPLACED_WITH_VALUE = 4;

	/**
	 * The '<em><b>Amended With</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amended With
	 * <!-- end-model-doc -->
	 * @see #AMENDED_WITH
	 * @model name="amendedWith"
	 * @generated
	 * @ordered
	 */
	public static final int AMENDED_WITH_VALUE = 5;

	/**
	 * The '<em><b>Appended With</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appended With
	 * <!-- end-model-doc -->
	 * @see #APPENDED_WITH
	 * @model name="appendedWith"
	 * @generated
	 * @ordered
	 */
	public static final int APPENDED_WITH_VALUE = 6;

	/**
	 * The '<em><b>Transformed With</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transformed With
	 * <!-- end-model-doc -->
	 * @see #TRANSFORMED_WITH
	 * @model name="transformedWith"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMED_WITH_VALUE = 7;

	/**
	 * An array of all the '<em><b>Report Relationship Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReportRelationshipTypeEnum[] VALUES_ARRAY =
		new ReportRelationshipTypeEnum[] {
			REPLACES,
			AMENDS,
			APPENDS,
			TRANSFORMS,
			REPLACED_WITH,
			AMENDED_WITH,
			APPENDED_WITH,
			TRANSFORMED_WITH,
		};

	/**
	 * A public read-only list of all the '<em><b>Report Relationship Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReportRelationshipTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Report Relationship Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReportRelationshipTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReportRelationshipTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Report Relationship Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReportRelationshipTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReportRelationshipTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Report Relationship Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReportRelationshipTypeEnum get(int value) {
		switch (value) {
			case REPLACES_VALUE: return REPLACES;
			case AMENDS_VALUE: return AMENDS;
			case APPENDS_VALUE: return APPENDS;
			case TRANSFORMS_VALUE: return TRANSFORMS;
			case REPLACED_WITH_VALUE: return REPLACED_WITH;
			case AMENDED_WITH_VALUE: return AMENDED_WITH;
			case APPENDED_WITH_VALUE: return APPENDED_WITH;
			case TRANSFORMED_WITH_VALUE: return TRANSFORMED_WITH;
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
	private ReportRelationshipTypeEnum(int value, String name, String literal) {
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
	
} //ReportRelationshipTypeEnum
