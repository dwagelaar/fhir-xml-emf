/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Structure Distance From Landmark</b></em>'.
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
 *   <li>{@link org.hl7.fhir.BodyStructureDistanceFromLandmark#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.BodyStructureDistanceFromLandmark#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getBodyStructureDistanceFromLandmark()
 * @model extendedMetaData="name='BodyStructure.DistanceFromLandmark' kind='elementOnly'"
 * @generated
 */
public interface BodyStructureDistanceFromLandmark extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An instrument, tool, analyzer, etc. used in the measurement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getBodyStructureDistanceFromLandmark_Device()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='device' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getDevice();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Quantity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The measured distance (e.g., in cm) from a body landmark.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getBodyStructureDistanceFromLandmark_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Quantity> getValue();

} // BodyStructureDistanceFromLandmark
