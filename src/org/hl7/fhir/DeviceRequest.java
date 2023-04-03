/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getGroupIdentifier <em>Group Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getDoNotPerform <em>Do Not Perform</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getOccurrenceDateTime <em>Occurrence Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getOccurrencePeriod <em>Occurrence Period</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getOccurrenceTiming <em>Occurrence Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getAuthoredOn <em>Authored On</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getAsNeeded <em>As Needed</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getAsNeededFor <em>As Needed For</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getInsurance <em>Insurance</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getSupportingInfo <em>Supporting Info</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceRequest#getRelevantHistory <em>Relevant History</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDeviceRequest()
 * @model extendedMetaData="name='DeviceRequest' kind='elementOnly'"
 * @generated
 */
public interface DeviceRequest extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers assigned to this order by the orderer or by the receiver.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Instantiates Canonical</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Canonical}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this DeviceRequest.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiates Canonical</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_InstantiatesCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instantiatesCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Canonical> getInstantiatesCanonical();

	/**
	 * Returns the value of the '<em><b>Instantiates Uri</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this DeviceRequest.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiates Uri</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_InstantiatesUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instantiatesUri' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Uri> getInstantiatesUri();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plan/proposal/order fulfilled by this request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Replaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The request takes the place of the referenced completed or terminated request(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replaces</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_Replaces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='replaces' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getReplaces();

	/**
	 * Returns the value of the '<em><b>Group Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A shared identifier common to multiple independent Request instances that were activated/authorized more or less simultaneously by a single author.  The presence of the same identifier on each request ties those requests together and may have business ramifications in terms of reporting of results, billing, etc.  E.g. a requisition number shared by a set of lab tests ordered together, or a prescription number shared by all meds ordered at one time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Identifier</em>' containment reference.
	 * @see #setGroupIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_GroupIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groupIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getGroupIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceRequest#getGroupIdentifier <em>Group Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Identifier</em>' containment reference.
	 * @see #getGroupIdentifier()
	 * @generated
	 */
	void setGroupIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(RequestStatus)
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceRequest#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(RequestStatus value);

	/**
	 * Returns the value of the '<em><b>Intent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the request is a proposal, plan, an original order or a reflex order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intent</em>' containment reference.
	 * @see #setIntent(RequestIntent)
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_Intent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='intent' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestIntent getIntent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceRequest#getIntent <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intent</em>' containment reference.
	 * @see #getIntent()
	 * @generated
	 */
	void setIntent(RequestIntent value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how quickly the request should be addressed with respect to other requests.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(RequestPriority)
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestPriority getPriority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceRequest#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(RequestPriority value);

	/**
	 * Returns the value of the '<em><b>Do Not Perform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that the provider is asking for the patient to either stop using or to not start using the specified device or category of devices. For example, the patient has undergone surgery and the provider is indicating that the patient should not wear contact lenses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Do Not Perform</em>' containment reference.
	 * @see #setDoNotPerform(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_DoNotPerform()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doNotPerform' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getDoNotPerform();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceRequest#getDoNotPerform <em>Do Not Perform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Not Perform</em>' containment reference.
	 * @see #getDoNotPerform()
	 * @generated
	 */
	void setDoNotPerform(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The details of the device to be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableReference)
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceRequest#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of devices to be provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceRequest#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceRequestParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific parameters for the ordered item.  For example, the prism value for lenses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_Parameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceRequestParameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient who will use the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceRequest#getSubject <em>Subject</em>}' containment reference.
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
	 * An encounter that provides additional context in which this request is made.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceRequest#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Occurrence Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence Date Time</em>' containment reference.
	 * @see #setOccurrenceDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_OccurrenceDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrenceDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getOccurrenceDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceRequest#getOccurrenceDateTime <em>Occurrence Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Date Time</em>' containment reference.
	 * @see #getOccurrenceDateTime()
	 * @generated
	 */
	void setOccurrenceDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Occurrence Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence Period</em>' containment reference.
	 * @see #setOccurrencePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_OccurrencePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrencePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getOccurrencePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceRequest#getOccurrencePeriod <em>Occurrence Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Period</em>' containment reference.
	 * @see #getOccurrencePeriod()
	 * @generated
	 */
	void setOccurrencePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Occurrence Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence Timing</em>' containment reference.
	 * @see #setOccurrenceTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_OccurrenceTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrenceTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getOccurrenceTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceRequest#getOccurrenceTiming <em>Occurrence Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Timing</em>' containment reference.
	 * @see #getOccurrenceTiming()
	 * @generated
	 */
	void setOccurrenceTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Authored On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the request transitioned to being actionable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authored On</em>' containment reference.
	 * @see #setAuthoredOn(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_AuthoredOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authoredOn' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getAuthoredOn();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceRequest#getAuthoredOn <em>Authored On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authored On</em>' containment reference.
	 * @see #getAuthoredOn()
	 * @generated
	 */
	void setAuthoredOn(DateTime value);

	/**
	 * Returns the value of the '<em><b>Requester</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual or entity who initiated the request and has responsibility for its activation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requester</em>' containment reference.
	 * @see #setRequester(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_Requester()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requester' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequester();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceRequest#getRequester <em>Requester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requester</em>' containment reference.
	 * @see #getRequester()
	 * @generated
	 */
	void setRequester(Reference value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The desired individual or entity to provide the device to the subject of the request (e.g., patient, location).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference.
	 * @see #setPerformer(CodeableReference)
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getPerformer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceRequest#getPerformer <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer</em>' containment reference.
	 * @see #getPerformer()
	 * @generated
	 */
	void setPerformer(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reason or justification for the use of this device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getReason();

	/**
	 * Returns the value of the '<em><b>As Needed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This status is to indicate whether the request is a PRN or may be given as needed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>As Needed</em>' containment reference.
	 * @see #setAsNeeded(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_AsNeeded()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asNeeded' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAsNeeded();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceRequest#getAsNeeded <em>As Needed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Needed</em>' containment reference.
	 * @see #getAsNeeded()
	 * @generated
	 */
	void setAsNeeded(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>As Needed For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reason for using the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>As Needed For</em>' containment reference.
	 * @see #setAsNeededFor(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_AsNeededFor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asNeededFor' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAsNeededFor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceRequest#getAsNeededFor <em>As Needed For</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Needed For</em>' containment reference.
	 * @see #getAsNeededFor()
	 * @generated
	 */
	void setAsNeededFor(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Insurance</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be required for delivering the requested service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_Insurance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='insurance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getInsurance();

	/**
	 * Returns the value of the '<em><b>Supporting Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional clinical information about the patient that may influence the request fulfilment.  For example, this may include where on the subject's body the device will be used (i.e. the target site).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Info</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_SupportingInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportingInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSupportingInfo();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details about this request that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Relevant History</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Key events in the history of the request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relevant History</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceRequest_RelevantHistory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relevantHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getRelevantHistory();

} // DeviceRequest
