/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response Body Site</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ClaimResponseBodySite#getSite <em>Site</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseBodySite#getSubSite <em>Sub Site</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimResponseBodySite()
 * @model extendedMetaData="name='ClaimResponse.BodySite' kind='elementOnly'"
 * @generated
 */
public interface ClaimResponseBodySite extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Site</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Physical service site on the patient (limb, tooth, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseBodySite_Site()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='site' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getSite();

	/**
	 * Returns the value of the '<em><b>Sub Site</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A region or surface of the bodySite, e.g. limb region or tooth surface(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Site</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimResponseBodySite_SubSite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subSite' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSubSite();

} // ClaimResponseBodySite
