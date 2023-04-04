/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A selection of DICOM SOP instances and/or frames within a single Study and Series. This might include additional specifics such as an image region, an Observation UID or a Segmentation Number, allowing linkage to an Observation Resource or transferring this information along with the ImagingStudy Resource.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.ImagingSelection#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImagingSelection#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImagingSelection#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImagingSelection#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImagingSelection#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImagingSelection#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImagingSelection#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImagingSelection#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImagingSelection#getStudyUid <em>Study Uid</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImagingSelection#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImagingSelection#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImagingSelection#getSeriesUid <em>Series Uid</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImagingSelection#getSeriesNumber <em>Series Number</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImagingSelection#getFrameOfReferenceUid <em>Frame Of Reference Uid</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImagingSelection#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImagingSelection#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImagingSelection#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelection()
 * @model extendedMetaData="name='ImagingSelection' kind='elementOnly'"
 * @generated
 */
public interface ImagingSelection extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier assigned to this imaging selection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelection_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current state of the ImagingSelection resource. This is not the status of any ImagingStudy, ServiceRequest, or Task resources associated with the ImagingSelection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ImagingSelectionStatus)
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelection_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ImagingSelectionStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImagingSelection#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ImagingSelectionStatus value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient, or group of patients, location, device, organization, procedure or practitioner this imaging selection is about and into whose or what record the imaging selection is placed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelection_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImagingSelection#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time this imaging selection was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issued</em>' containment reference.
	 * @see #setIssued(Instant)
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelection_Issued()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issued' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getIssued();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImagingSelection#getIssued <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued</em>' containment reference.
	 * @see #getIssued()
	 * @generated
	 */
	void setIssued(Instant value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ImagingSelectionPerformer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Selector of the instances – human or machine.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelection_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImagingSelectionPerformer> getPerformer();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of the diagnostic requests that resulted in this imaging selection being performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelection_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Classifies the imaging selection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelection_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reason for referencing the selected content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelection_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImagingSelection#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Study Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Study Instance UID for the DICOM Study from which the images were selected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Study Uid</em>' containment reference.
	 * @see #setStudyUid(Id)
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelection_StudyUid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='studyUid' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getStudyUid();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImagingSelection#getStudyUid <em>Study Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Uid</em>' containment reference.
	 * @see #getStudyUid()
	 * @generated
	 */
	void setStudyUid(Id value);

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The imaging study from which the imaging selection is made.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived From</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelection_DerivedFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='derivedFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getDerivedFrom();

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The network service providing retrieval access to the selected images, frames, etc. See implementation notes for information about using DICOM endpoints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelection_Endpoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getEndpoint();

	/**
	 * Returns the value of the '<em><b>Series Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Series Instance UID for the DICOM Series from which the images were selected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series Uid</em>' containment reference.
	 * @see #setSeriesUid(Id)
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelection_SeriesUid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='seriesUid' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getSeriesUid();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImagingSelection#getSeriesUid <em>Series Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Uid</em>' containment reference.
	 * @see #getSeriesUid()
	 * @generated
	 */
	void setSeriesUid(Id value);

	/**
	 * Returns the value of the '<em><b>Series Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Series Number for the DICOM Series from which the images were selected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series Number</em>' containment reference.
	 * @see #setSeriesNumber(UnsignedInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelection_SeriesNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='seriesNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getSeriesNumber();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImagingSelection#getSeriesNumber <em>Series Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Number</em>' containment reference.
	 * @see #getSeriesNumber()
	 * @generated
	 */
	void setSeriesNumber(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Frame Of Reference Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Frame of Reference UID identifying the coordinate system that conveys spatial and/or temporal information for the selected images or frames.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frame Of Reference Uid</em>' containment reference.
	 * @see #setFrameOfReferenceUid(Id)
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelection_FrameOfReferenceUid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='frameOfReferenceUid' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getFrameOfReferenceUid();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImagingSelection#getFrameOfReferenceUid <em>Frame Of Reference Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Of Reference Uid</em>' containment reference.
	 * @see #getFrameOfReferenceUid()
	 * @generated
	 */
	void setFrameOfReferenceUid(Id value);

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The anatomic structures examined. See DICOM Part 16 Annex L (http://dicom.nema.org/medical/dicom/current/output/chtml/part16/chapter_L.html) for DICOM to SNOMED-CT mappings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference.
	 * @see #setBodySite(CodeableReference)
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelection_BodySite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySite' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getBodySite();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImagingSelection#getBodySite <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site</em>' containment reference.
	 * @see #getBodySite()
	 * @generated
	 */
	void setBodySite(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual focus of an observation when it is not the patient of record representing something or someone associated with the patient such as a spouse, parent, fetus, or donor. For example, fetus observations in a mother's record.  The focus of an observation could also be an existing condition,  an intervention, the subject's diet,  another observation of the subject,  or a body structure such as tumor or implanted device.   An example use case would be using the Observation resource to capture whether the mother is trained to change her child's tracheostomy tube. In this example, the child is the patient of record and the mother is the focus.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelection_Focus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='focus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getFocus();

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ImagingSelectionInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each imaging selection includes one or more selected DICOM SOP instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getImagingSelection_Instance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImagingSelectionInstance> getInstance();

} // ImagingSelection
