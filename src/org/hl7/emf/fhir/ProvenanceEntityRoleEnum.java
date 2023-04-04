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
 * A representation of the literals of the enumeration '<em><b>Provenance Entity Role Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.emf.fhir.FhirPackage#getProvenanceEntityRoleEnum()
 * @model extendedMetaData="name='ProvenanceEntityRoleEnum'"
 * @generated
 */
public enum ProvenanceEntityRoleEnum implements Enumerator {
	/**
	 * The '<em><b>Revision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Revision
	 * <!-- end-model-doc -->
	 * @see #REVISION_VALUE
	 * @generated
	 * @ordered
	 */
	REVISION(0, "revision", "revision"),

	/**
	 * The '<em><b>Quotation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quotation
	 * <!-- end-model-doc -->
	 * @see #QUOTATION_VALUE
	 * @generated
	 * @ordered
	 */
	QUOTATION(1, "quotation", "quotation"),

	/**
	 * The '<em><b>Source</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source
	 * <!-- end-model-doc -->
	 * @see #SOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE(2, "source", "source"),

	/**
	 * The '<em><b>Instantiates</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Instantiates
	 * <!-- end-model-doc -->
	 * @see #INSTANTIATES_VALUE
	 * @generated
	 * @ordered
	 */
	INSTANTIATES(3, "instantiates", "instantiates"),

	/**
	 * The '<em><b>Removal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Removal
	 * <!-- end-model-doc -->
	 * @see #REMOVAL_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVAL(4, "removal", "removal");

	/**
	 * The '<em><b>Revision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Revision
	 * <!-- end-model-doc -->
	 * @see #REVISION
	 * @model name="revision"
	 * @generated
	 * @ordered
	 */
	public static final int REVISION_VALUE = 0;

	/**
	 * The '<em><b>Quotation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quotation
	 * <!-- end-model-doc -->
	 * @see #QUOTATION
	 * @model name="quotation"
	 * @generated
	 * @ordered
	 */
	public static final int QUOTATION_VALUE = 1;

	/**
	 * The '<em><b>Source</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source
	 * <!-- end-model-doc -->
	 * @see #SOURCE
	 * @model name="source"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_VALUE = 2;

	/**
	 * The '<em><b>Instantiates</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Instantiates
	 * <!-- end-model-doc -->
	 * @see #INSTANTIATES
	 * @model name="instantiates"
	 * @generated
	 * @ordered
	 */
	public static final int INSTANTIATES_VALUE = 3;

	/**
	 * The '<em><b>Removal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Removal
	 * <!-- end-model-doc -->
	 * @see #REMOVAL
	 * @model name="removal"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVAL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Provenance Entity Role Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProvenanceEntityRoleEnum[] VALUES_ARRAY =
		new ProvenanceEntityRoleEnum[] {
			REVISION,
			QUOTATION,
			SOURCE,
			INSTANTIATES,
			REMOVAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Provenance Entity Role Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProvenanceEntityRoleEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Provenance Entity Role Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProvenanceEntityRoleEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProvenanceEntityRoleEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Provenance Entity Role Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProvenanceEntityRoleEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProvenanceEntityRoleEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Provenance Entity Role Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProvenanceEntityRoleEnum get(int value) {
		switch (value) {
			case REVISION_VALUE: return REVISION;
			case QUOTATION_VALUE: return QUOTATION;
			case SOURCE_VALUE: return SOURCE;
			case INSTANTIATES_VALUE: return INSTANTIATES;
			case REMOVAL_VALUE: return REMOVAL;
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
	private ProvenanceEntityRoleEnum(int value, String name, String literal) {
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
	
} //ProvenanceEntityRoleEnum
