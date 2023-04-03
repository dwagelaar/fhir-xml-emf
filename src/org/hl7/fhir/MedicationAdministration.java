/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getMedication <em>Medication</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getSupportingInformation <em>Supporting Information</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getOccurenceDateTime <em>Occurence Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getOccurencePeriod <em>Occurence Period</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getOccurenceTiming <em>Occurence Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getRecorded <em>Recorded</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getIsSubPotent <em>Is Sub Potent</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getSubPotentReason <em>Sub Potent Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getDosage <em>Dosage</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationAdministration#getEventHistory <em>Event History</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration()
 * @model extendedMetaData="name='MedicationAdministration' kind='elementOnly'"
 * @generated
 */
public interface MedicationAdministration extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers associated with this Medication Administration that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A plan that is fulfilled in whole or in part by this MedicationAdministration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A larger event of which this particular event is a component or step.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_PartOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partOf' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getPartOf();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Will generally be set to show that the administration has been completed.  For some long running administrations such as infusions, it is possible for an administration to be started but not completed or it may be paused while some other process is under way.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(MedicationAdministrationStatusCodes)
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationAdministrationStatusCodes getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationAdministration#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(MedicationAdministrationStatusCodes value);

	/**
	 * Returns the value of the '<em><b>Status Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code indicating why the administration was not performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_StatusReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusReason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getStatusReason();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of medication administration (for example, drug classification like ATC, where meds would be administered, legal category of the medication).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Medication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication</em>' containment reference.
	 * @see #setMedication(CodeableReference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_Medication()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='medication' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getMedication();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationAdministration#getMedication <em>Medication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication</em>' containment reference.
	 * @see #getMedication()
	 * @generated
	 */
	void setMedication(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person or animal or group receiving the medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationAdministration#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The visit, admission, or other contact between patient and health care provider during which the medication administration was performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationAdministration#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Supporting Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information (for example, patient height and weight) that supports the administration of the medication.  This attribute can be used to provide documentation of specific characteristics of the patient present at the time of administration.  For example, if the dose says "give "x" if the heartrate exceeds "y"", then the heart rate can be included using this attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Information</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_SupportingInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportingInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSupportingInformation();

	/**
	 * Returns the value of the '<em><b>Occurence Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurence Date Time</em>' containment reference.
	 * @see #setOccurenceDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_OccurenceDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurenceDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getOccurenceDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationAdministration#getOccurenceDateTime <em>Occurence Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurence Date Time</em>' containment reference.
	 * @see #getOccurenceDateTime()
	 * @generated
	 */
	void setOccurenceDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Occurence Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurence Period</em>' containment reference.
	 * @see #setOccurencePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_OccurencePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurencePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getOccurencePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationAdministration#getOccurencePeriod <em>Occurence Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurence Period</em>' containment reference.
	 * @see #getOccurencePeriod()
	 * @generated
	 */
	void setOccurencePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Occurence Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurence Timing</em>' containment reference.
	 * @see #setOccurenceTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_OccurenceTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurenceTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getOccurenceTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationAdministration#getOccurenceTiming <em>Occurence Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurence Timing</em>' containment reference.
	 * @see #getOccurenceTiming()
	 * @generated
	 */
	void setOccurenceTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Recorded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date the occurrence of the  MedicationAdministration was first captured in the record - potentially significantly after the occurrence of the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorded</em>' containment reference.
	 * @see #setRecorded(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_Recorded()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recorded' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getRecorded();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationAdministration#getRecorded <em>Recorded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded</em>' containment reference.
	 * @see #getRecorded()
	 * @generated
	 */
	void setRecorded(DateTime value);

	/**
	 * Returns the value of the '<em><b>Is Sub Potent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An indication that the full dose was not administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Sub Potent</em>' containment reference.
	 * @see #setIsSubPotent(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_IsSubPotent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isSubPotent' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIsSubPotent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationAdministration#getIsSubPotent <em>Is Sub Potent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sub Potent</em>' containment reference.
	 * @see #getIsSubPotent()
	 * @generated
	 */
	void setIsSubPotent(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Sub Potent Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reason or reasons why the full dose was not administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Potent Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_SubPotentReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subPotentReason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSubPotentReason();

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationAdministrationPerformer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The performer of the medication treatment.  For devices this is the device that performed the administration of the medication.  An IV Pump would be an example of a device that is performing the administration. Both the IV Pump and the practitioner that set the rate or bolus on the pump can be listed as performers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationAdministrationPerformer> getPerformer();

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code, Condition or observation that supports why the medication was administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getReason();

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The original request, instruction or authority to perform the administration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_Request()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='request' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationAdministration#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Reference value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device that is to be used for the administration of the medication (for example, PCA Pump).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_Device()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='device' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getDevice();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extra information about the medication administration that is not conveyed by the other attributes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Dosage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the medication dosage information details e.g. dose, rate, site, route, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dosage</em>' containment reference.
	 * @see #setDosage(MedicationAdministrationDosage)
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_Dosage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dosage' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationAdministrationDosage getDosage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationAdministration#getDosage <em>Dosage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dosage</em>' containment reference.
	 * @see #getDosage()
	 * @generated
	 */
	void setDosage(MedicationAdministrationDosage value);

	/**
	 * Returns the value of the '<em><b>Event History</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A summary of the events of interest that have occurred, such as when the administration was verified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event History</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationAdministration_EventHistory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getEventHistory();

} // MedicationAdministration
