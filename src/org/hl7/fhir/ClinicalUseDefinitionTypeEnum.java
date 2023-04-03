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
 * A representation of the literals of the enumeration '<em><b>Clinical Use Definition Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getClinicalUseDefinitionTypeEnum()
 * @model extendedMetaData="name='ClinicalUseDefinitionTypeEnum'"
 * @generated
 */
public enum ClinicalUseDefinitionTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Indication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indication
	 * <!-- end-model-doc -->
	 * @see #INDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	INDICATION(0, "indication", "indication"),

	/**
	 * The '<em><b>Contraindication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contraindication
	 * <!-- end-model-doc -->
	 * @see #CONTRAINDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRAINDICATION(1, "contraindication", "contraindication"),

	/**
	 * The '<em><b>Interaction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Interaction
	 * <!-- end-model-doc -->
	 * @see #INTERACTION_VALUE
	 * @generated
	 * @ordered
	 */
	INTERACTION(2, "interaction", "interaction"),

	/**
	 * The '<em><b>Undesirable Effect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Undesirable Effect
	 * <!-- end-model-doc -->
	 * @see #UNDESIRABLE_EFFECT_VALUE
	 * @generated
	 * @ordered
	 */
	UNDESIRABLE_EFFECT(3, "undesirableEffect", "undesirable-effect"),

	/**
	 * The '<em><b>Warning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Warning
	 * <!-- end-model-doc -->
	 * @see #WARNING_VALUE
	 * @generated
	 * @ordered
	 */
	WARNING(4, "warning", "warning");

	/**
	 * The '<em><b>Indication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indication
	 * <!-- end-model-doc -->
	 * @see #INDICATION
	 * @model name="indication"
	 * @generated
	 * @ordered
	 */
	public static final int INDICATION_VALUE = 0;

	/**
	 * The '<em><b>Contraindication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contraindication
	 * <!-- end-model-doc -->
	 * @see #CONTRAINDICATION
	 * @model name="contraindication"
	 * @generated
	 * @ordered
	 */
	public static final int CONTRAINDICATION_VALUE = 1;

	/**
	 * The '<em><b>Interaction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Interaction
	 * <!-- end-model-doc -->
	 * @see #INTERACTION
	 * @model name="interaction"
	 * @generated
	 * @ordered
	 */
	public static final int INTERACTION_VALUE = 2;

	/**
	 * The '<em><b>Undesirable Effect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Undesirable Effect
	 * <!-- end-model-doc -->
	 * @see #UNDESIRABLE_EFFECT
	 * @model name="undesirableEffect" literal="undesirable-effect"
	 * @generated
	 * @ordered
	 */
	public static final int UNDESIRABLE_EFFECT_VALUE = 3;

	/**
	 * The '<em><b>Warning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Warning
	 * <!-- end-model-doc -->
	 * @see #WARNING
	 * @model name="warning"
	 * @generated
	 * @ordered
	 */
	public static final int WARNING_VALUE = 4;

	/**
	 * An array of all the '<em><b>Clinical Use Definition Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClinicalUseDefinitionTypeEnum[] VALUES_ARRAY =
		new ClinicalUseDefinitionTypeEnum[] {
			INDICATION,
			CONTRAINDICATION,
			INTERACTION,
			UNDESIRABLE_EFFECT,
			WARNING,
		};

	/**
	 * A public read-only list of all the '<em><b>Clinical Use Definition Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClinicalUseDefinitionTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Clinical Use Definition Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClinicalUseDefinitionTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClinicalUseDefinitionTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Clinical Use Definition Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClinicalUseDefinitionTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClinicalUseDefinitionTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Clinical Use Definition Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClinicalUseDefinitionTypeEnum get(int value) {
		switch (value) {
			case INDICATION_VALUE: return INDICATION;
			case CONTRAINDICATION_VALUE: return CONTRAINDICATION;
			case INTERACTION_VALUE: return INTERACTION;
			case UNDESIRABLE_EFFECT_VALUE: return UNDESIRABLE_EFFECT;
			case WARNING_VALUE: return WARNING;
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
	private ClinicalUseDefinitionTypeEnum(int value, String name, String literal) {
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
	
} //ClinicalUseDefinitionTypeEnum
