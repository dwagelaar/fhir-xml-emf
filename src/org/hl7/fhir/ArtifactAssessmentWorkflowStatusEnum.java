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
 * A representation of the literals of the enumeration '<em><b>Artifact Assessment Workflow Status Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getArtifactAssessmentWorkflowStatusEnum()
 * @model extendedMetaData="name='ArtifactAssessmentWorkflowStatusEnum'"
 * @generated
 */
public enum ArtifactAssessmentWorkflowStatusEnum implements Enumerator {
	/**
	 * The '<em><b>Submitted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Submitted
	 * <!-- end-model-doc -->
	 * @see #SUBMITTED_VALUE
	 * @generated
	 * @ordered
	 */
	SUBMITTED(0, "submitted", "submitted"),

	/**
	 * The '<em><b>Triaged</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Triaged
	 * <!-- end-model-doc -->
	 * @see #TRIAGED_VALUE
	 * @generated
	 * @ordered
	 */
	TRIAGED(1, "triaged", "triaged"),

	/**
	 * The '<em><b>Waiting For Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Waiting for Input
	 * <!-- end-model-doc -->
	 * @see #WAITING_FOR_INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	WAITING_FOR_INPUT(2, "waitingForInput", "waiting-for-input"),

	/**
	 * The '<em><b>Resolved No Change</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resolved - No Change
	 * <!-- end-model-doc -->
	 * @see #RESOLVED_NO_CHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	RESOLVED_NO_CHANGE(3, "resolvedNoChange", "resolved-no-change"),

	/**
	 * The '<em><b>Resolved Change Required</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resolved - Change Required
	 * <!-- end-model-doc -->
	 * @see #RESOLVED_CHANGE_REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	RESOLVED_CHANGE_REQUIRED(4, "resolvedChangeRequired", "resolved-change-required"),

	/**
	 * The '<em><b>Deferred</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deferred
	 * <!-- end-model-doc -->
	 * @see #DEFERRED_VALUE
	 * @generated
	 * @ordered
	 */
	DEFERRED(5, "deferred", "deferred"),

	/**
	 * The '<em><b>Duplicate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Duplicate
	 * <!-- end-model-doc -->
	 * @see #DUPLICATE_VALUE
	 * @generated
	 * @ordered
	 */
	DUPLICATE(6, "duplicate", "duplicate"),

	/**
	 * The '<em><b>Applied</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applied
	 * <!-- end-model-doc -->
	 * @see #APPLIED_VALUE
	 * @generated
	 * @ordered
	 */
	APPLIED(7, "applied", "applied"),

	/**
	 * The '<em><b>Published</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Published
	 * <!-- end-model-doc -->
	 * @see #PUBLISHED_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLISHED(8, "published", "published"),

	/**
	 * The '<em><b>Entered In Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entered in Error
	 * <!-- end-model-doc -->
	 * @see #ENTERED_IN_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ENTERED_IN_ERROR(9, "enteredInError", "entered-in-error");

	/**
	 * The '<em><b>Submitted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Submitted
	 * <!-- end-model-doc -->
	 * @see #SUBMITTED
	 * @model name="submitted"
	 * @generated
	 * @ordered
	 */
	public static final int SUBMITTED_VALUE = 0;

	/**
	 * The '<em><b>Triaged</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Triaged
	 * <!-- end-model-doc -->
	 * @see #TRIAGED
	 * @model name="triaged"
	 * @generated
	 * @ordered
	 */
	public static final int TRIAGED_VALUE = 1;

	/**
	 * The '<em><b>Waiting For Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Waiting for Input
	 * <!-- end-model-doc -->
	 * @see #WAITING_FOR_INPUT
	 * @model name="waitingForInput" literal="waiting-for-input"
	 * @generated
	 * @ordered
	 */
	public static final int WAITING_FOR_INPUT_VALUE = 2;

	/**
	 * The '<em><b>Resolved No Change</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resolved - No Change
	 * <!-- end-model-doc -->
	 * @see #RESOLVED_NO_CHANGE
	 * @model name="resolvedNoChange" literal="resolved-no-change"
	 * @generated
	 * @ordered
	 */
	public static final int RESOLVED_NO_CHANGE_VALUE = 3;

	/**
	 * The '<em><b>Resolved Change Required</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resolved - Change Required
	 * <!-- end-model-doc -->
	 * @see #RESOLVED_CHANGE_REQUIRED
	 * @model name="resolvedChangeRequired" literal="resolved-change-required"
	 * @generated
	 * @ordered
	 */
	public static final int RESOLVED_CHANGE_REQUIRED_VALUE = 4;

	/**
	 * The '<em><b>Deferred</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deferred
	 * <!-- end-model-doc -->
	 * @see #DEFERRED
	 * @model name="deferred"
	 * @generated
	 * @ordered
	 */
	public static final int DEFERRED_VALUE = 5;

	/**
	 * The '<em><b>Duplicate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Duplicate
	 * <!-- end-model-doc -->
	 * @see #DUPLICATE
	 * @model name="duplicate"
	 * @generated
	 * @ordered
	 */
	public static final int DUPLICATE_VALUE = 6;

	/**
	 * The '<em><b>Applied</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applied
	 * <!-- end-model-doc -->
	 * @see #APPLIED
	 * @model name="applied"
	 * @generated
	 * @ordered
	 */
	public static final int APPLIED_VALUE = 7;

	/**
	 * The '<em><b>Published</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Published
	 * <!-- end-model-doc -->
	 * @see #PUBLISHED
	 * @model name="published"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLISHED_VALUE = 8;

	/**
	 * The '<em><b>Entered In Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entered in Error
	 * <!-- end-model-doc -->
	 * @see #ENTERED_IN_ERROR
	 * @model name="enteredInError" literal="entered-in-error"
	 * @generated
	 * @ordered
	 */
	public static final int ENTERED_IN_ERROR_VALUE = 9;

	/**
	 * An array of all the '<em><b>Artifact Assessment Workflow Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ArtifactAssessmentWorkflowStatusEnum[] VALUES_ARRAY =
		new ArtifactAssessmentWorkflowStatusEnum[] {
			SUBMITTED,
			TRIAGED,
			WAITING_FOR_INPUT,
			RESOLVED_NO_CHANGE,
			RESOLVED_CHANGE_REQUIRED,
			DEFERRED,
			DUPLICATE,
			APPLIED,
			PUBLISHED,
			ENTERED_IN_ERROR,
		};

	/**
	 * A public read-only list of all the '<em><b>Artifact Assessment Workflow Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ArtifactAssessmentWorkflowStatusEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Artifact Assessment Workflow Status Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArtifactAssessmentWorkflowStatusEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArtifactAssessmentWorkflowStatusEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Artifact Assessment Workflow Status Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArtifactAssessmentWorkflowStatusEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArtifactAssessmentWorkflowStatusEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Artifact Assessment Workflow Status Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArtifactAssessmentWorkflowStatusEnum get(int value) {
		switch (value) {
			case SUBMITTED_VALUE: return SUBMITTED;
			case TRIAGED_VALUE: return TRIAGED;
			case WAITING_FOR_INPUT_VALUE: return WAITING_FOR_INPUT;
			case RESOLVED_NO_CHANGE_VALUE: return RESOLVED_NO_CHANGE;
			case RESOLVED_CHANGE_REQUIRED_VALUE: return RESOLVED_CHANGE_REQUIRED;
			case DEFERRED_VALUE: return DEFERRED;
			case DUPLICATE_VALUE: return DUPLICATE;
			case APPLIED_VALUE: return APPLIED;
			case PUBLISHED_VALUE: return PUBLISHED;
			case ENTERED_IN_ERROR_VALUE: return ENTERED_IN_ERROR;
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
	private ArtifactAssessmentWorkflowStatusEnum(int value, String name, String literal) {
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
	
} //ArtifactAssessmentWorkflowStatusEnum
