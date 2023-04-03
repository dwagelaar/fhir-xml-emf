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
 * A representation of the literals of the enumeration '<em><b>Artifact Assessment Disposition Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getArtifactAssessmentDispositionEnum()
 * @model extendedMetaData="name='ArtifactAssessmentDispositionEnum'"
 * @generated
 */
public enum ArtifactAssessmentDispositionEnum implements Enumerator {
	/**
	 * The '<em><b>Unresolved</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unresolved
	 * <!-- end-model-doc -->
	 * @see #UNRESOLVED_VALUE
	 * @generated
	 * @ordered
	 */
	UNRESOLVED(0, "unresolved", "unresolved"),

	/**
	 * The '<em><b>Not Persuasive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Persuasive
	 * <!-- end-model-doc -->
	 * @see #NOT_PERSUASIVE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_PERSUASIVE(1, "notPersuasive", "not-persuasive"),

	/**
	 * The '<em><b>Persuasive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Persuasive
	 * <!-- end-model-doc -->
	 * @see #PERSUASIVE_VALUE
	 * @generated
	 * @ordered
	 */
	PERSUASIVE(2, "persuasive", "persuasive"),

	/**
	 * The '<em><b>Persuasive With Modification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Persuasive with Modification
	 * <!-- end-model-doc -->
	 * @see #PERSUASIVE_WITH_MODIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	PERSUASIVE_WITH_MODIFICATION(3, "persuasiveWithModification", "persuasive-with-modification"),

	/**
	 * The '<em><b>Not Persuasive With Modification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Persuasive with Modification
	 * <!-- end-model-doc -->
	 * @see #NOT_PERSUASIVE_WITH_MODIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_PERSUASIVE_WITH_MODIFICATION(4, "notPersuasiveWithModification", "not-persuasive-with-modification");

	/**
	 * The '<em><b>Unresolved</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unresolved
	 * <!-- end-model-doc -->
	 * @see #UNRESOLVED
	 * @model name="unresolved"
	 * @generated
	 * @ordered
	 */
	public static final int UNRESOLVED_VALUE = 0;

	/**
	 * The '<em><b>Not Persuasive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Persuasive
	 * <!-- end-model-doc -->
	 * @see #NOT_PERSUASIVE
	 * @model name="notPersuasive" literal="not-persuasive"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_PERSUASIVE_VALUE = 1;

	/**
	 * The '<em><b>Persuasive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Persuasive
	 * <!-- end-model-doc -->
	 * @see #PERSUASIVE
	 * @model name="persuasive"
	 * @generated
	 * @ordered
	 */
	public static final int PERSUASIVE_VALUE = 2;

	/**
	 * The '<em><b>Persuasive With Modification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Persuasive with Modification
	 * <!-- end-model-doc -->
	 * @see #PERSUASIVE_WITH_MODIFICATION
	 * @model name="persuasiveWithModification" literal="persuasive-with-modification"
	 * @generated
	 * @ordered
	 */
	public static final int PERSUASIVE_WITH_MODIFICATION_VALUE = 3;

	/**
	 * The '<em><b>Not Persuasive With Modification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Persuasive with Modification
	 * <!-- end-model-doc -->
	 * @see #NOT_PERSUASIVE_WITH_MODIFICATION
	 * @model name="notPersuasiveWithModification" literal="not-persuasive-with-modification"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_PERSUASIVE_WITH_MODIFICATION_VALUE = 4;

	/**
	 * An array of all the '<em><b>Artifact Assessment Disposition Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ArtifactAssessmentDispositionEnum[] VALUES_ARRAY =
		new ArtifactAssessmentDispositionEnum[] {
			UNRESOLVED,
			NOT_PERSUASIVE,
			PERSUASIVE,
			PERSUASIVE_WITH_MODIFICATION,
			NOT_PERSUASIVE_WITH_MODIFICATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Artifact Assessment Disposition Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ArtifactAssessmentDispositionEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Artifact Assessment Disposition Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArtifactAssessmentDispositionEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArtifactAssessmentDispositionEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Artifact Assessment Disposition Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArtifactAssessmentDispositionEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArtifactAssessmentDispositionEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Artifact Assessment Disposition Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArtifactAssessmentDispositionEnum get(int value) {
		switch (value) {
			case UNRESOLVED_VALUE: return UNRESOLVED;
			case NOT_PERSUASIVE_VALUE: return NOT_PERSUASIVE;
			case PERSUASIVE_VALUE: return PERSUASIVE;
			case PERSUASIVE_WITH_MODIFICATION_VALUE: return PERSUASIVE_WITH_MODIFICATION;
			case NOT_PERSUASIVE_WITH_MODIFICATION_VALUE: return NOT_PERSUASIVE_WITH_MODIFICATION;
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
	private ArtifactAssessmentDispositionEnum(int value, String name, String literal) {
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
	
} //ArtifactAssessmentDispositionEnum
