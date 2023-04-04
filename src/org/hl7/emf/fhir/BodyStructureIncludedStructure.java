/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Structure Included Structure</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.BodyStructureIncludedStructure#getStructure <em>Structure</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.BodyStructureIncludedStructure#getLaterality <em>Laterality</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.BodyStructureIncludedStructure#getBodyLandmarkOrientation <em>Body Landmark Orientation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.BodyStructureIncludedStructure#getSpatialReference <em>Spatial Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.BodyStructureIncludedStructure#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getBodyStructureIncludedStructure()
 * @model extendedMetaData="name='BodyStructure.IncludedStructure' kind='elementOnly'"
 * @generated
 */
public interface BodyStructureIncludedStructure extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code that represents the included structure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getBodyStructureIncludedStructure_Structure()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='structure' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStructure();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.BodyStructureIncludedStructure#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Laterality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code that represents the included structure laterality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Laterality</em>' containment reference.
	 * @see #setLaterality(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getBodyStructureIncludedStructure_Laterality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='laterality' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getLaterality();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.BodyStructureIncludedStructure#getLaterality <em>Laterality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Laterality</em>' containment reference.
	 * @see #getLaterality()
	 * @generated
	 */
	void setLaterality(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Body Landmark Orientation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.BodyStructureBodyLandmarkOrientation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Body locations in relation to a specific body landmark (tatoo, scar, other body structure).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Landmark Orientation</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getBodyStructureIncludedStructure_BodyLandmarkOrientation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodyLandmarkOrientation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BodyStructureBodyLandmarkOrientation> getBodyLandmarkOrientation();

	/**
	 * Returns the value of the '<em><b>Spatial Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XY or XYZ-coordinate orientation for structure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spatial Reference</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getBodyStructureIncludedStructure_SpatialReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='spatialReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSpatialReference();

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code that represents the included structure qualifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getBodyStructureIncludedStructure_Qualifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='qualifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getQualifier();

} // BodyStructureIncludedStructure
