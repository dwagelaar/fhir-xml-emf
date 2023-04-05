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
 * A representation of the literals of the enumeration '<em><b>Artifact Assessment Information Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.emf.fhir.FhirPackage#getArtifactAssessmentInformationTypeEnum()
 * @model extendedMetaData="name='ArtifactAssessmentInformationTypeEnum'"
 * @generated
 */
public enum ArtifactAssessmentInformationTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Comment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comment
	 * <!-- end-model-doc -->
	 * @see #COMMENT_VALUE
	 * @generated
	 * @ordered
	 */
	COMMENT(0, "comment", "comment"),

	/**
	 * The '<em><b>Classifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Classifier
	 * <!-- end-model-doc -->
	 * @see #CLASSIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	CLASSIFIER(1, "classifier", "classifier"),

	/**
	 * The '<em><b>Rating</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rating
	 * <!-- end-model-doc -->
	 * @see #RATING_VALUE
	 * @generated
	 * @ordered
	 */
	RATING(2, "rating", "rating"),

	/**
	 * The '<em><b>Container</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container
	 * <!-- end-model-doc -->
	 * @see #CONTAINER_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINER(3, "container", "container"),

	/**
	 * The '<em><b>Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Response
	 * <!-- end-model-doc -->
	 * @see #RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	RESPONSE(4, "response", "response"),

	/**
	 * The '<em><b>Change Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change Request
	 * <!-- end-model-doc -->
	 * @see #CHANGE_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGE_REQUEST(5, "changeRequest", "change-request");

	/**
	 * The '<em><b>Comment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comment
	 * <!-- end-model-doc -->
	 * @see #COMMENT
	 * @model name="comment"
	 * @generated
	 * @ordered
	 */
	public static final int COMMENT_VALUE = 0;

	/**
	 * The '<em><b>Classifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Classifier
	 * <!-- end-model-doc -->
	 * @see #CLASSIFIER
	 * @model name="classifier"
	 * @generated
	 * @ordered
	 */
	public static final int CLASSIFIER_VALUE = 1;

	/**
	 * The '<em><b>Rating</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rating
	 * <!-- end-model-doc -->
	 * @see #RATING
	 * @model name="rating"
	 * @generated
	 * @ordered
	 */
	public static final int RATING_VALUE = 2;

	/**
	 * The '<em><b>Container</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container
	 * <!-- end-model-doc -->
	 * @see #CONTAINER
	 * @model name="container"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINER_VALUE = 3;

	/**
	 * The '<em><b>Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Response
	 * <!-- end-model-doc -->
	 * @see #RESPONSE
	 * @model name="response"
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSE_VALUE = 4;

	/**
	 * The '<em><b>Change Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change Request
	 * <!-- end-model-doc -->
	 * @see #CHANGE_REQUEST
	 * @model name="changeRequest" literal="change-request"
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_REQUEST_VALUE = 5;

	/**
	 * An array of all the '<em><b>Artifact Assessment Information Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ArtifactAssessmentInformationTypeEnum[] VALUES_ARRAY =
		new ArtifactAssessmentInformationTypeEnum[] {
			COMMENT,
			CLASSIFIER,
			RATING,
			CONTAINER,
			RESPONSE,
			CHANGE_REQUEST,
		};

	/**
	 * A public read-only list of all the '<em><b>Artifact Assessment Information Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ArtifactAssessmentInformationTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Artifact Assessment Information Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArtifactAssessmentInformationTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArtifactAssessmentInformationTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Artifact Assessment Information Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArtifactAssessmentInformationTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArtifactAssessmentInformationTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Artifact Assessment Information Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArtifactAssessmentInformationTypeEnum get(int value) {
		switch (value) {
			case COMMENT_VALUE: return COMMENT;
			case CLASSIFIER_VALUE: return CLASSIFIER;
			case RATING_VALUE: return RATING;
			case CONTAINER_VALUE: return CONTAINER;
			case RESPONSE_VALUE: return RESPONSE;
			case CHANGE_REQUEST_VALUE: return CHANGE_REQUEST;
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
	private ArtifactAssessmentInformationTypeEnum(int value, String name, String literal) {
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
	
} //ArtifactAssessmentInformationTypeEnum
