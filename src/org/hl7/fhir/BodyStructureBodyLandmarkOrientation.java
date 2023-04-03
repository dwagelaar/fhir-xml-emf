/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Structure Body Landmark Orientation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Record details about an anatomical structure.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.BodyStructureBodyLandmarkOrientation#getLandmarkDescription <em>Landmark Description</em>}</li>
 *   <li>{@link org.hl7.fhir.BodyStructureBodyLandmarkOrientation#getClockFacePosition <em>Clock Face Position</em>}</li>
 *   <li>{@link org.hl7.fhir.BodyStructureBodyLandmarkOrientation#getDistanceFromLandmark <em>Distance From Landmark</em>}</li>
 *   <li>{@link org.hl7.fhir.BodyStructureBodyLandmarkOrientation#getSurfaceOrientation <em>Surface Orientation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getBodyStructureBodyLandmarkOrientation()
 * @model extendedMetaData="name='BodyStructure.BodyLandmarkOrientation' kind='elementOnly'"
 * @generated
 */
public interface BodyStructureBodyLandmarkOrientation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Landmark Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of a landmark on the body used as a reference to locate something else.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Landmark Description</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getBodyStructureBodyLandmarkOrientation_LandmarkDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='landmarkDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getLandmarkDescription();

	/**
	 * Returns the value of the '<em><b>Clock Face Position</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An description of the direction away from a landmark something is located based on a radial clock dial.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock Face Position</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getBodyStructureBodyLandmarkOrientation_ClockFacePosition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='clockFacePosition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getClockFacePosition();

	/**
	 * Returns the value of the '<em><b>Distance From Landmark</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.BodyStructureDistanceFromLandmark}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The distance in centimeters a certain observation is made from a body landmark.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distance From Landmark</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getBodyStructureBodyLandmarkOrientation_DistanceFromLandmark()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='distanceFromLandmark' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BodyStructureDistanceFromLandmark> getDistanceFromLandmark();

	/**
	 * Returns the value of the '<em><b>Surface Orientation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The surface area a body location is in relation to a landmark.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surface Orientation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getBodyStructureBodyLandmarkOrientation_SurfaceOrientation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='surfaceOrientation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSurfaceOrientation();

} // BodyStructureBodyLandmarkOrientation
