/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Healthcare Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The details of a healthcare service available at a location.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.HealthcareService#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getActive <em>Active</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getProvidedBy <em>Provided By</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getOfferedIn <em>Offered In</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getSpecialty <em>Specialty</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getExtraDetails <em>Extra Details</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getPhoto <em>Photo</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getCoverageArea <em>Coverage Area</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getServiceProvisionCode <em>Service Provision Code</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getEligibility <em>Eligibility</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getProgram <em>Program</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getCommunication <em>Communication</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getReferralMethod <em>Referral Method</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getAppointmentRequired <em>Appointment Required</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getAvailability <em>Availability</em>}</li>
 *   <li>{@link org.hl7.fhir.HealthcareService#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getHealthcareService()
 * @model extendedMetaData="name='HealthcareService' kind='elementOnly'"
 * @generated
 */
public interface HealthcareService extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * External identifiers for this item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This flag is used to mark the record to not be used. This is not used when a center is closed for maintenance, or for holidays, the notAvailable period is to be used for this.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active</em>' containment reference.
	 * @see #setActive(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_Active()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='active' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getActive();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HealthcareService#getActive <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' containment reference.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Provided By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization that provides this healthcare service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided By</em>' containment reference.
	 * @see #setProvidedBy(Reference)
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_ProvidedBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='providedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProvidedBy();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HealthcareService#getProvidedBy <em>Provided By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided By</em>' containment reference.
	 * @see #getProvidedBy()
	 * @generated
	 */
	void setProvidedBy(Reference value);

	/**
	 * Returns the value of the '<em><b>Offered In</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the HealthcareService is representing a specific, schedulable service, the availableIn property can refer to a generic service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offered In</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_OfferedIn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offeredIn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getOfferedIn();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the broad category of service being performed or delivered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific type of service that may be delivered or performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getType();

	/**
	 * Returns the value of the '<em><b>Specialty</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Collection of specialties handled by the Healthcare service. This is more of a medical term.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specialty</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_Specialty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specialty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSpecialty();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location(s) where this healthcare service may be provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getLocation();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Further description of the service as it would be presented to a consumer while searching.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HealthcareService#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any additional description of the service and/or any specific issues not covered by the other attributes, which can be displayed as further detail under the serviceName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getComment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HealthcareService#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(Markdown value);

	/**
	 * Returns the value of the '<em><b>Extra Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extra details about the service that can't be placed in the other fields.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extra Details</em>' containment reference.
	 * @see #setExtraDetails(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_ExtraDetails()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extraDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getExtraDetails();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HealthcareService#getExtraDetails <em>Extra Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Details</em>' containment reference.
	 * @see #getExtraDetails()
	 * @generated
	 */
	void setExtraDetails(Markdown value);

	/**
	 * Returns the value of the '<em><b>Photo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If there is a photo/symbol associated with this HealthcareService, it may be included here to facilitate quick identification of the service in a list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Photo</em>' containment reference.
	 * @see #setPhoto(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_Photo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='photo' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getPhoto();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HealthcareService#getPhoto <em>Photo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Photo</em>' containment reference.
	 * @see #getPhoto()
	 * @generated
	 */
	void setPhoto(Attachment value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExtendedContactDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contact details of communication devices available relevant to the specific HealthcareService. This can include addresses, phone numbers, fax numbers, mobile numbers, email addresses and web sites.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExtendedContactDetail> getContact();

	/**
	 * Returns the value of the '<em><b>Coverage Area</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location(s) that this service is available to (not where the service is provided).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage Area</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_CoverageArea()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverageArea' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getCoverageArea();

	/**
	 * Returns the value of the '<em><b>Service Provision Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code(s) that detail the conditions under which the healthcare service is available/offered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Provision Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_ServiceProvisionCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='serviceProvisionCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getServiceProvisionCode();

	/**
	 * Returns the value of the '<em><b>Eligibility</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.HealthcareServiceEligibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Does this service have specific eligibility requirements that need to be met in order to use the service?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eligibility</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_Eligibility()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eligibility' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HealthcareServiceEligibility> getEligibility();

	/**
	 * Returns the value of the '<em><b>Program</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Programs that this service is applicable to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_Program()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='program' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getProgram();

	/**
	 * Returns the value of the '<em><b>Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Collection of characteristics (attributes).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristic</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_Characteristic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='characteristic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCharacteristic();

	/**
	 * Returns the value of the '<em><b>Communication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Some services are specifically made available in multiple languages, this property permits a directory to declare the languages this is offered in. Typically this is only provided where a service operates in communities with mixed languages used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_Communication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='communication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCommunication();

	/**
	 * Returns the value of the '<em><b>Referral Method</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referral Method</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_ReferralMethod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referralMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getReferralMethod();

	/**
	 * Returns the value of the '<em><b>Appointment Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Appointment Required</em>' containment reference.
	 * @see #setAppointmentRequired(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_AppointmentRequired()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='appointmentRequired' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAppointmentRequired();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HealthcareService#getAppointmentRequired <em>Appointment Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment Required</em>' containment reference.
	 * @see #getAppointmentRequired()
	 * @generated
	 */
	void setAppointmentRequired(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Availability</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Availability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of times that the healthcare service is available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Availability</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_Availability()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='availability' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Availability> getAvailability();

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technical endpoints providing access to services operated for the specific healthcare services defined at this resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getHealthcareService_Endpoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getEndpoint();

} // HealthcareService
