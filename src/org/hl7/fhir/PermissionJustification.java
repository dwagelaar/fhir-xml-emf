/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission Justification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Permission resource holds access rules for a given data and context.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PermissionJustification#getBasis <em>Basis</em>}</li>
 *   <li>{@link org.hl7.fhir.PermissionJustification#getEvidence <em>Evidence</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPermissionJustification()
 * @model extendedMetaData="name='Permission.Justification' kind='elementOnly'"
 * @generated
 */
public interface PermissionJustification extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Basis</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This would be a codeableconcept, or a coding, which can be constrained to , for example, the 6 grounds for processing in GDPR.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basis</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPermissionJustification_Basis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getBasis();

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Justifing rational.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evidence</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPermissionJustification_Evidence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='evidence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getEvidence();

} // PermissionJustification
