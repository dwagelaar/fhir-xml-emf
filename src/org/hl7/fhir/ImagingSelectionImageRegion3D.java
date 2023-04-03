/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Selection Image Region3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A selection of DICOM SOP instances and/or frames within a single Study and Series. This might include additional specifics such as an image region, an Observation UID or a Segmentation Number, allowing linkage to an Observation Resource or transferring this information along with the ImagingStudy Resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImagingSelectionImageRegion3D#getRegionType <em>Region Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingSelectionImageRegion3D#getCoordinate <em>Coordinate</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImagingSelectionImageRegion3D()
 * @model extendedMetaData="name='ImagingSelection.ImageRegion3D' kind='elementOnly'"
 * @generated
 */
public interface ImagingSelectionImageRegion3D extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Region Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the type of image region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region Type</em>' containment reference.
	 * @see #setRegionType(ImagingSelectionDGraphicType)
	 * @see org.hl7.fhir.FhirPackage#getImagingSelectionImageRegion3D_RegionType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='regionType' namespace='##targetNamespace'"
	 * @generated
	 */
	ImagingSelectionDGraphicType getRegionType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingSelectionImageRegion3D#getRegionType <em>Region Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region Type</em>' containment reference.
	 * @see #getRegionType()
	 * @generated
	 */
	void setRegionType(ImagingSelectionDGraphicType value);

	/**
	 * Returns the value of the '<em><b>Coordinate</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Decimal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coordinates describing the image region. Encoded as an ordered set of (x,y,z) triplets (in mm and may be negative) that define a region of interest in the patient-relative Reference Coordinate System defined by ImagingSelection.frameOfReferenceUid element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordinate</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingSelectionImageRegion3D_Coordinate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coordinate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Decimal> getCoordinate();

} // ImagingSelectionImageRegion3D
