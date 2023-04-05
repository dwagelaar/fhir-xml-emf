/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specimen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A sample to be used for analysis.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.Specimen#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Specimen#getAccessionIdentifier <em>Accession Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Specimen#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Specimen#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Specimen#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Specimen#getReceivedTime <em>Received Time</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Specimen#getParent <em>Parent</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Specimen#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Specimen#getCombined <em>Combined</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Specimen#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Specimen#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Specimen#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Specimen#getProcessing <em>Processing</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Specimen#getContainer <em>Container</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Specimen#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Specimen#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getSpecimen()
 * @model extendedMetaData="name='Specimen' kind='elementOnly'"
 * @generated
 */
public interface Specimen extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id for specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSpecimen_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Accession Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier assigned by the lab when accessioning specimen(s). This is not necessarily the same as the specimen identifier, depending on local lab procedures.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accession Identifier</em>' containment reference.
	 * @see #setAccessionIdentifier(Identifier)
	 * @see org.hl7.emf.fhir.FhirPackage#getSpecimen_AccessionIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='accessionIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getAccessionIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Specimen#getAccessionIdentifier <em>Accession Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accession Identifier</em>' containment reference.
	 * @see #getAccessionIdentifier()
	 * @generated
	 */
	void setAccessionIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The availability of the specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(SpecimenStatus)
	 * @see org.hl7.emf.fhir.FhirPackage#getSpecimen_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecimenStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Specimen#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(SpecimenStatus value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of material that forms the specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getSpecimen_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Specimen#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the specimen came from. This may be from patient(s), from a location (e.g., the source of an environmental sample), or a sampling of a substance, a biologically-derived product, or a device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getSpecimen_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Specimen#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Received Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time when specimen is received by the testing laboratory for processing or testing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Received Time</em>' containment reference.
	 * @see #setReceivedTime(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getSpecimen_ReceivedTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='receivedTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getReceivedTime();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Specimen#getReceivedTime <em>Received Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received Time</em>' containment reference.
	 * @see #getReceivedTime()
	 * @generated
	 */
	void setReceivedTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of another specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSpecimen_Parent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getParent();

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details concerning a service request that required a specimen to be collected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSpecimen_Request()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='request' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getRequest();

	/**
	 * Returns the value of the '<em><b>Combined</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element signifies if the specimen is part of a group or pooled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Combined</em>' containment reference.
	 * @see #setCombined(SpecimenCombined)
	 * @see org.hl7.emf.fhir.FhirPackage#getSpecimen_Combined()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='combined' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecimenCombined getCombined();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Specimen#getCombined <em>Combined</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combined</em>' containment reference.
	 * @see #getCombined()
	 * @generated
	 */
	void setCombined(SpecimenCombined value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role or reason for the specimen in the testing workflow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSpecimen_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getRole();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.SpecimenFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A physical feature or landmark on a specimen, highlighted for context by the collector of the specimen (e.g. surgeon), that identifies the type of feature as well as its meaning (e.g. the red ink indicating the resection margin of the right lobe of the excised prostate tissue or wire loop at radiologically suspected tumor location).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSpecimen_Feature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='feature' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpecimenFeature> getFeature();

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details concerning the specimen collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference.
	 * @see #setCollection(SpecimenCollection)
	 * @see org.hl7.emf.fhir.FhirPackage#getSpecimen_Collection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='collection' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecimenCollection getCollection();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Specimen#getCollection <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' containment reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(SpecimenCollection value);

	/**
	 * Returns the value of the '<em><b>Processing</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.SpecimenProcessing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details concerning processing and processing steps for the specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Processing</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSpecimen_Processing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='processing' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpecimenProcessing> getProcessing();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.SpecimenContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSpecimen_Container()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='container' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpecimenContainer> getContainer();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A mode or state of being that describes the nature of the specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSpecimen_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCondition();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To communicate any details or issues about the specimen or during the specimen collection. (for example: broken vial, sent with patient, frozen).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getSpecimen_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

} // Specimen
