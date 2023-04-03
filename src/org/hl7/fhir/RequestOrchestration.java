/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Orchestration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of related requests that can be used to capture intended activities that have inter-dependencies such as "give this medication after that one".
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.RequestOrchestration#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestOrchestration#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestOrchestration#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestOrchestration#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestOrchestration#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestOrchestration#getGroupIdentifier <em>Group Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestOrchestration#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestOrchestration#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestOrchestration#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestOrchestration#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestOrchestration#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestOrchestration#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestOrchestration#getAuthoredOn <em>Authored On</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestOrchestration#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestOrchestration#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestOrchestration#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestOrchestration#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestOrchestration#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getRequestOrchestration()
 * @model extendedMetaData="name='RequestOrchestration' kind='elementOnly'"
 * @generated
 */
public interface RequestOrchestration extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows a service to provide a unique, business identifier for the request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestration_Identifier()
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
	 * A canonical URL referencing a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiates Canonical</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestration_InstantiatesCanonical()
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
	 * A URL referencing an externally defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiates Uri</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestration_InstantiatesUri()
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
	 * A plan, proposal or order that is fulfilled in whole or in part by this request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestration_BasedOn()
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
	 * Completed or terminated request(s) whose function is taken by this new request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replaces</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestration_Replaces()
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
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestration_GroupIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groupIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getGroupIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequestOrchestration#getGroupIdentifier <em>Group Identifier</em>}' containment reference.
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
	 * The current state of the request. For request orchestrations, the status reflects the status of all the requests in the orchestration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(RequestStatus)
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestration_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequestOrchestration#getStatus <em>Status</em>}' containment reference.
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
	 * Indicates the level of authority/intentionality associated with the request and where the request fits into the workflow chain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intent</em>' containment reference.
	 * @see #setIntent(RequestIntent)
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestration_Intent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='intent' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestIntent getIntent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequestOrchestration#getIntent <em>Intent</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestration_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestPriority getPriority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequestOrchestration#getPriority <em>Priority</em>}' containment reference.
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
	 * A code that identifies what the overall request orchestration is.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestration_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequestOrchestration#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subject for which the request orchestration was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestration_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequestOrchestration#getSubject <em>Subject</em>}' containment reference.
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
	 * Describes the context of the request orchestration, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestration_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequestOrchestration#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Authored On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates when the request orchestration was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authored On</em>' containment reference.
	 * @see #setAuthoredOn(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestration_AuthoredOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authoredOn' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getAuthoredOn();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequestOrchestration#getAuthoredOn <em>Authored On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authored On</em>' containment reference.
	 * @see #getAuthoredOn()
	 * @generated
	 */
	void setAuthoredOn(DateTime value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a reference to the author of the request orchestration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestration_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAuthor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequestOrchestration#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Reference value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the reason for the request orchestration in coded or textual form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestration_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getReason();

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Goals that are intended to be achieved by following the requests in this RequestOrchestration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Goal</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestration_Goal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='goal' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getGoal();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a mechanism to communicate additional information about the response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestration_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.RequestOrchestrationAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actions, if any, produced by the evaluation of the artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getRequestOrchestration_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RequestOrchestrationAction> getAction();

} // RequestOrchestration
