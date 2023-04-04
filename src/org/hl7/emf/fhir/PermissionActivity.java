/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission Activity</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.PermissionActivity#getActor <em>Actor</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.PermissionActivity#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.PermissionActivity#getPurpose <em>Purpose</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getPermissionActivity()
 * @model extendedMetaData="name='Permission.Activity' kind='elementOnly'"
 * @generated
 */
public interface PermissionActivity extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actor(s) authorized for the defined activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getPermissionActivity_Actor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getActor();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actions controlled by this Rule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getPermissionActivity_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getAction();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The purpose for which the permission is given.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getPermissionActivity_Purpose()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='purpose' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getPurpose();

} // PermissionActivity
