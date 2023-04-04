/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Selection Instance</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.ImagingSelectionInstance#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImagingSelectionInstance#getNumber <em>Number</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImagingSelectionInstance#getSopClass <em>Sop Class</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImagingSelectionInstance#getSubset <em>Subset</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImagingSelectionInstance#getImageRegion2D <em>Image Region2 D</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImagingSelectionInstance#getImageRegion3D <em>Image Region3 D</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelectionInstance()
 * @model extendedMetaData="name='ImagingSelection.Instance' kind='elementOnly'"
 * @generated
 */
public interface ImagingSelectionInstance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SOP Instance UID for the selected DICOM instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uid</em>' containment reference.
	 * @see #setUid(Id)
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelectionInstance_Uid()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uid' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getUid();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImagingSelectionInstance#getUid <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' containment reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(Id value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Instance Number for the selected DICOM instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' containment reference.
	 * @see #setNumber(UnsignedInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelectionInstance_Number()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='number' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getNumber();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImagingSelectionInstance#getNumber <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' containment reference.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Sop Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SOP Class UID for the selected DICOM instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sop Class</em>' containment reference.
	 * @see #setSopClass(Coding)
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelectionInstance_SopClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sopClass' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getSopClass();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImagingSelectionInstance#getSopClass <em>Sop Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sop Class</em>' containment reference.
	 * @see #getSopClass()
	 * @generated
	 */
	void setSopClass(Coding value);

	/**
	 * Returns the value of the '<em><b>Subset</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Selected subset of the SOP Instance. The content and format of the subset item is determined by the SOP Class of the selected instance.
	 *        May be one of:
	 *        - A list of frame numbers selected from a multiframe SOP Instance.
	 *        - A list of Content Item Observation UID values selected from a DICOM SR or other structured document SOP Instance.
	 *        - A list of segment numbers selected from a segmentation SOP Instance.
	 *        - A list of Region of Interest (ROI) numbers selected from a radiotherapy structure set SOP Instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subset</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelectionInstance_Subset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subset' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.emf.fhir.String> getSubset();

	/**
	 * Returns the value of the '<em><b>Image Region2 D</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ImagingSelectionImageRegion2D}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each imaging selection instance or frame list might includes an image region, specified by a region type and a set of 2D coordinates.
	 *        If the parent imagingSelection.instance contains a subset element of type frame, the image region applies to all frames in the subset list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Region2 D</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelectionInstance_ImageRegion2D()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imageRegion2D' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImagingSelectionImageRegion2D> getImageRegion2D();

	/**
	 * Returns the value of the '<em><b>Image Region3 D</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ImagingSelectionImageRegion3D}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each imaging selection might includes a 3D image region, specified by a region type and a set of 3D coordinates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Region3 D</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelectionInstance_ImageRegion3D()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imageRegion3D' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImagingSelectionImageRegion3D> getImageRegion3D();

} // ImagingSelectionInstance
