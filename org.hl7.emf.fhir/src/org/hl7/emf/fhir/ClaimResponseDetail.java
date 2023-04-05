/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides the adjudication details from the processing of a Claim resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.ClaimResponseDetail#getDetailSequence <em>Detail Sequence</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimResponseDetail#getTraceNumber <em>Trace Number</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimResponseDetail#getNoteNumber <em>Note Number</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimResponseDetail#getReviewOutcome <em>Review Outcome</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimResponseDetail#getAdjudication <em>Adjudication</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClaimResponseDetail#getSubDetail <em>Sub Detail</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getClaimResponseDetail()
 * @model extendedMetaData="name='ClaimResponse.Detail' kind='elementOnly'"
 * @generated
 */
public interface ClaimResponseDetail extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Detail Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number to uniquely reference the claim detail entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail Sequence</em>' containment reference.
	 * @see #setDetailSequence(PositiveInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimResponseDetail_DetailSequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='detailSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getDetailSequence();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClaimResponseDetail#getDetailSequence <em>Detail Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Sequence</em>' containment reference.
	 * @see #getDetailSequence()
	 * @generated
	 */
	void setDetailSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Trace Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trace number for tracking purposes. May be defined at the jurisdiction level or between trading partners.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace Number</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimResponseDetail_TraceNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='traceNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getTraceNumber();

	/**
	 * Returns the value of the '<em><b>Note Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The numbers associated with notes below which apply to the adjudication of this item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note Number</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimResponseDetail_NoteNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noteNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositiveInt> getNoteNumber();

	/**
	 * Returns the value of the '<em><b>Review Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The high-level results of the adjudication if adjudication has been performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Review Outcome</em>' containment reference.
	 * @see #setReviewOutcome(ClaimResponseReviewOutcome)
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimResponseDetail_ReviewOutcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reviewOutcome' namespace='##targetNamespace'"
	 * @generated
	 */
	ClaimResponseReviewOutcome getReviewOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClaimResponseDetail#getReviewOutcome <em>Review Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review Outcome</em>' containment reference.
	 * @see #getReviewOutcome()
	 * @generated
	 */
	void setReviewOutcome(ClaimResponseReviewOutcome value);

	/**
	 * Returns the value of the '<em><b>Adjudication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ClaimResponseAdjudication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The adjudication results.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adjudication</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimResponseDetail_Adjudication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='adjudication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseAdjudication> getAdjudication();

	/**
	 * Returns the value of the '<em><b>Sub Detail</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ClaimResponseSubDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A sub-detail adjudication of a simple product or service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Detail</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getClaimResponseDetail_SubDetail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subDetail' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseSubDetail> getSubDetail();

} // ClaimResponseDetail
