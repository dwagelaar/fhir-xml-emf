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
 * A representation of the literals of the enumeration '<em><b>Concept Map Relationship Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.emf.fhir.FhirPackage#getConceptMapRelationshipEnum()
 * @model extendedMetaData="name='ConceptMapRelationshipEnum'"
 * @generated
 */
public enum ConceptMapRelationshipEnum implements Enumerator {
	/**
	 * The '<em><b>Related To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Related To
	 * <!-- end-model-doc -->
	 * @see #RELATED_TO_VALUE
	 * @generated
	 * @ordered
	 */
	RELATED_TO(0, "relatedTo", "related-to"),

	/**
	 * The '<em><b>Equivalent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Equivalent
	 * <!-- end-model-doc -->
	 * @see #EQUIVALENT_VALUE
	 * @generated
	 * @ordered
	 */
	EQUIVALENT(1, "equivalent", "equivalent"),

	/**
	 * The '<em><b>Source Is Narrower Than Target</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source Is Narrower Than Target
	 * <!-- end-model-doc -->
	 * @see #SOURCE_IS_NARROWER_THAN_TARGET_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE_IS_NARROWER_THAN_TARGET(2, "sourceIsNarrowerThanTarget", "source-is-narrower-than-target"),

	/**
	 * The '<em><b>Source Is Broader Than Target</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source Is Broader Than Target
	 * <!-- end-model-doc -->
	 * @see #SOURCE_IS_BROADER_THAN_TARGET_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE_IS_BROADER_THAN_TARGET(3, "sourceIsBroaderThanTarget", "source-is-broader-than-target"),

	/**
	 * The '<em><b>Not Related To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Related To
	 * <!-- end-model-doc -->
	 * @see #NOT_RELATED_TO_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_RELATED_TO(4, "notRelatedTo", "not-related-to");

	/**
	 * The '<em><b>Related To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Related To
	 * <!-- end-model-doc -->
	 * @see #RELATED_TO
	 * @model name="relatedTo" literal="related-to"
	 * @generated
	 * @ordered
	 */
	public static final int RELATED_TO_VALUE = 0;

	/**
	 * The '<em><b>Equivalent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Equivalent
	 * <!-- end-model-doc -->
	 * @see #EQUIVALENT
	 * @model name="equivalent"
	 * @generated
	 * @ordered
	 */
	public static final int EQUIVALENT_VALUE = 1;

	/**
	 * The '<em><b>Source Is Narrower Than Target</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source Is Narrower Than Target
	 * <!-- end-model-doc -->
	 * @see #SOURCE_IS_NARROWER_THAN_TARGET
	 * @model name="sourceIsNarrowerThanTarget" literal="source-is-narrower-than-target"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_IS_NARROWER_THAN_TARGET_VALUE = 2;

	/**
	 * The '<em><b>Source Is Broader Than Target</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source Is Broader Than Target
	 * <!-- end-model-doc -->
	 * @see #SOURCE_IS_BROADER_THAN_TARGET
	 * @model name="sourceIsBroaderThanTarget" literal="source-is-broader-than-target"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_IS_BROADER_THAN_TARGET_VALUE = 3;

	/**
	 * The '<em><b>Not Related To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Related To
	 * <!-- end-model-doc -->
	 * @see #NOT_RELATED_TO
	 * @model name="notRelatedTo" literal="not-related-to"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_RELATED_TO_VALUE = 4;

	/**
	 * An array of all the '<em><b>Concept Map Relationship Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConceptMapRelationshipEnum[] VALUES_ARRAY =
		new ConceptMapRelationshipEnum[] {
			RELATED_TO,
			EQUIVALENT,
			SOURCE_IS_NARROWER_THAN_TARGET,
			SOURCE_IS_BROADER_THAN_TARGET,
			NOT_RELATED_TO,
		};

	/**
	 * A public read-only list of all the '<em><b>Concept Map Relationship Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConceptMapRelationshipEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Concept Map Relationship Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConceptMapRelationshipEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConceptMapRelationshipEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Concept Map Relationship Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConceptMapRelationshipEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConceptMapRelationshipEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Concept Map Relationship Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConceptMapRelationshipEnum get(int value) {
		switch (value) {
			case RELATED_TO_VALUE: return RELATED_TO;
			case EQUIVALENT_VALUE: return EQUIVALENT;
			case SOURCE_IS_NARROWER_THAN_TARGET_VALUE: return SOURCE_IS_NARROWER_THAN_TARGET;
			case SOURCE_IS_BROADER_THAN_TARGET_VALUE: return SOURCE_IS_BROADER_THAN_TARGET;
			case NOT_RELATED_TO_VALUE: return NOT_RELATED_TO;
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
	private ConceptMapRelationshipEnum(int value, String name, String literal) {
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
	
} //ConceptMapRelationshipEnum
