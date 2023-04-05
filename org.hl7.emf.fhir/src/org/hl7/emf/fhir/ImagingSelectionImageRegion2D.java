/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Selection Image Region2 D</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.ImagingSelectionImageRegion2D#getRegionType <em>Region Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImagingSelectionImageRegion2D#getCoordinate <em>Coordinate</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelectionImageRegion2D()
 * @model extendedMetaData="name='ImagingSelection.ImageRegion2D' kind='elementOnly'"
 * @generated
 */
public interface ImagingSelectionImageRegion2D extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Region Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the type of image region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region Type</em>' containment reference.
	 * @see #setRegionType(ImagingSelectionDGraphicType)
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelectionImageRegion2D_RegionType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='regionType' namespace='##targetNamespace'"
	 * @generated
	 */
	ImagingSelectionDGraphicType getRegionType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImagingSelectionImageRegion2D#getRegionType <em>Region Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region Type</em>' containment reference.
	 * @see #getRegionType()
	 * @generated
	 */
	void setRegionType(ImagingSelectionDGraphicType value);

	/**
	 * Returns the value of the '<em><b>Coordinate</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Decimal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coordinates describing the image region. Encoded as a set of (column, row) pairs that denote positions in the selected image / frames specified with sub-pixel resolution.
	 *        The origin at the TLHC of the TLHC pixel is 0.0\0.0, the BRHC of the TLHC pixel is 1.0\1.0, and the BRHC of the BRHC pixel is the number of columns\rows in the image / frames. The values must be within the range 0\0 to the number of columns\rows in the image / frames.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordinate</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelectionImageRegion2D_Coordinate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coordinate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Decimal> getCoordinate();

} // ImagingSelectionImageRegion2D
