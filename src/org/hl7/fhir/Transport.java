/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Record of transport of item.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Transport#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getGroupIdentifier <em>Group Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getFor <em>For</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getCompletionTime <em>Completion Time</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getAuthoredOn <em>Authored On</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getPerformerType <em>Performer Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getInsurance <em>Insurance</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getRelevantHistory <em>Relevant History</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getInput <em>Input</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getOutput <em>Output</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getRequestedLocation <em>Requested Location</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getCurrentLocation <em>Current Location</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.Transport#getHistory <em>History</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTransport()
 * @model extendedMetaData="name='Transport' kind='elementOnly'"
 * @generated
 */
public interface Transport extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier for the transport event that is used to identify it across multiple disparate systems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTransport_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Instantiates Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL pointing to a *FHIR*-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Transport.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiates Canonical</em>' containment reference.
	 * @see #setInstantiatesCanonical(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getTransport_InstantiatesCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instantiatesCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getInstantiatesCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Transport#getInstantiatesCanonical <em>Instantiates Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiates Canonical</em>' containment reference.
	 * @see #getInstantiatesCanonical()
	 * @generated
	 */
	void setInstantiatesCanonical(Canonical value);

	/**
	 * Returns the value of the '<em><b>Instantiates Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL pointing to an *externally* maintained  protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Transport.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiates Uri</em>' containment reference.
	 * @see #setInstantiatesUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getTransport_InstantiatesUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instantiatesUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getInstantiatesUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Transport#getInstantiatesUri <em>Instantiates Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiates Uri</em>' containment reference.
	 * @see #getInstantiatesUri()
	 * @generated
	 */
	void setInstantiatesUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BasedOn refers to a higher-level authorization that triggered the creation of the transport.  It references a "request" resource such as a ServiceRequest or Transport, which is distinct from the "request" resource the Transport is seeking to fulfill.  This latter resource is referenced by FocusOn.  For example, based on a ServiceRequest (= BasedOn), a transport is created to fulfill a procedureRequest ( = FocusOn ) to transport a specimen to the lab.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTransport_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Group Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A shared identifier common to multiple independent Request instances that were activated/authorized more or less simultaneously by a single author.  The presence of the same identifier on each request ties those requests together and may have business ramifications in terms of reporting of results, billing, etc.  E.g. a requisition number shared by a set of lab tests ordered together, or a prescription number shared by all meds ordered at one time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Identifier</em>' containment reference.
	 * @see #setGroupIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getTransport_GroupIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groupIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getGroupIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Transport#getGroupIdentifier <em>Group Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Identifier</em>' containment reference.
	 * @see #getGroupIdentifier()
	 * @generated
	 */
	void setGroupIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A larger event of which this particular event is a component or step.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTransport_PartOf()
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
	 * A code specifying the state of the transport event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(TransportStatus)
	 * @see org.hl7.fhir.FhirPackage#getTransport_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	TransportStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Transport#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(TransportStatus value);

	/**
	 * Returns the value of the '<em><b>Status Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An explanation as to why this transport is held, failed, was refused, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Reason</em>' containment reference.
	 * @see #setStatusReason(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getTransport_StatusReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusReason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatusReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Transport#getStatusReason <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Reason</em>' containment reference.
	 * @see #getStatusReason()
	 * @generated
	 */
	void setStatusReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Intent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the "level" of actionability associated with the Transport, i.e. i+R[9]Cs this a proposed transport, a planned transport, an actionable transport, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intent</em>' containment reference.
	 * @see #setIntent(TransportIntent)
	 * @see org.hl7.fhir.FhirPackage#getTransport_Intent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='intent' namespace='##targetNamespace'"
	 * @generated
	 */
	TransportIntent getIntent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Transport#getIntent <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intent</em>' containment reference.
	 * @see #getIntent()
	 * @generated
	 */
	void setIntent(TransportIntent value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how quickly the Transport should be addressed with respect to other requests.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(RequestPriority)
	 * @see org.hl7.fhir.FhirPackage#getTransport_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestPriority getPriority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Transport#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(RequestPriority value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name or code (or both) briefly describing what the transport involves.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getTransport_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Transport#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-text description of what is to be performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getTransport_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Transport#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The request being actioned or the resource being manipulated by this transport.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference.
	 * @see #setFocus(Reference)
	 * @see org.hl7.fhir.FhirPackage#getTransport_Focus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='focus' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getFocus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Transport#getFocus <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focus</em>' containment reference.
	 * @see #getFocus()
	 * @generated
	 */
	void setFocus(Reference value);

	/**
	 * Returns the value of the '<em><b>For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entity who benefits from the performance of the service specified in the transport (e.g., the patient).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>For</em>' containment reference.
	 * @see #setFor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getTransport_For()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='for' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getFor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Transport#getFor <em>For</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For</em>' containment reference.
	 * @see #getFor()
	 * @generated
	 */
	void setFor(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The healthcare event  (e.g. a patient and healthcare provider interaction) during which this transport was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getTransport_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Transport#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Completion Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the completion time of the event (the occurrence).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Completion Time</em>' containment reference.
	 * @see #setCompletionTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getTransport_CompletionTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='completionTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCompletionTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Transport#getCompletionTime <em>Completion Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Time</em>' containment reference.
	 * @see #getCompletionTime()
	 * @generated
	 */
	void setCompletionTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Authored On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time this transport was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authored On</em>' containment reference.
	 * @see #setAuthoredOn(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getTransport_AuthoredOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authoredOn' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getAuthoredOn();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Transport#getAuthoredOn <em>Authored On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authored On</em>' containment reference.
	 * @see #getAuthoredOn()
	 * @generated
	 */
	void setAuthoredOn(DateTime value);

	/**
	 * Returns the value of the '<em><b>Last Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time of last modification to this transport.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Modified</em>' containment reference.
	 * @see #setLastModified(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getTransport_LastModified()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lastModified' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getLastModified();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Transport#getLastModified <em>Last Modified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified</em>' containment reference.
	 * @see #getLastModified()
	 * @generated
	 */
	void setLastModified(DateTime value);

	/**
	 * Returns the value of the '<em><b>Requester</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The creator of the transport.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requester</em>' containment reference.
	 * @see #setRequester(Reference)
	 * @see org.hl7.fhir.FhirPackage#getTransport_Requester()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requester' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequester();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Transport#getRequester <em>Requester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requester</em>' containment reference.
	 * @see #getRequester()
	 * @generated
	 */
	void setRequester(Reference value);

	/**
	 * Returns the value of the '<em><b>Performer Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of participant that should perform the transport.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTransport_PerformerType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performerType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getPerformerType();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Individual organization or Device currently responsible for transport execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' containment reference.
	 * @see #setOwner(Reference)
	 * @see org.hl7.fhir.FhirPackage#getTransport_Owner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='owner' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOwner();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Transport#getOwner <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' containment reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Reference value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Principal physical location where this transport is performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getTransport_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Transport#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Insurance</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be relevant to the Transport.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTransport_Insurance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='insurance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getInsurance();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free-text information captured about the transport as it progresses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTransport_Note()
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
	 * Links to Provenance records for past versions of this Transport that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the transport.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relevant History</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTransport_RelevantHistory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relevantHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getRelevantHistory();

	/**
	 * Returns the value of the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the Transport.focus is a request resource and the transport is seeking fulfillment (i.e. is asking for the request to be actioned), this element identifies any limitations on what parts of the referenced request should be actioned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Restriction</em>' containment reference.
	 * @see #setRestriction(TransportRestriction)
	 * @see org.hl7.fhir.FhirPackage#getTransport_Restriction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='restriction' namespace='##targetNamespace'"
	 * @generated
	 */
	TransportRestriction getRestriction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Transport#getRestriction <em>Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction</em>' containment reference.
	 * @see #getRestriction()
	 * @generated
	 */
	void setRestriction(TransportRestriction value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TransportInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information that may be needed in the execution of the transport.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTransport_Input()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TransportInput> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TransportOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outputs produced by the Transport.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTransport_Output()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='output' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TransportOutput> getOutput();

	/**
	 * Returns the value of the '<em><b>Requested Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The desired or final location for the transport.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested Location</em>' containment reference.
	 * @see #setRequestedLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getTransport_RequestedLocation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='requestedLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequestedLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Transport#getRequestedLocation <em>Requested Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Location</em>' containment reference.
	 * @see #getRequestedLocation()
	 * @generated
	 */
	void setRequestedLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Current Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current location for the entity to be transported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Location</em>' containment reference.
	 * @see #setCurrentLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getTransport_CurrentLocation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='currentLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCurrentLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Transport#getCurrentLocation <em>Current Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Location</em>' containment reference.
	 * @see #getCurrentLocation()
	 * @generated
	 */
	void setCurrentLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A resource reference indicating why this transport needs to be performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference.
	 * @see #setReason(CodeableReference)
	 * @see org.hl7.fhir.FhirPackage#getTransport_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Transport#getReason <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' containment reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The transport event prior to this one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>History</em>' containment reference.
	 * @see #setHistory(Reference)
	 * @see org.hl7.fhir.FhirPackage#getTransport_History()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='history' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getHistory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Transport#getHistory <em>History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History</em>' containment reference.
	 * @see #getHistory()
	 * @generated
	 */
	void setHistory(Reference value);

} // Transport
