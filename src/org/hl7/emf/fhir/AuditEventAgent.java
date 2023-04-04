/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit Event Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of an event relevant for purposes such as operations, privacy, security, maintenance, and performance analysis.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.AuditEventAgent#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AuditEventAgent#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AuditEventAgent#getWho <em>Who</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AuditEventAgent#getRequestor <em>Requestor</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AuditEventAgent#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AuditEventAgent#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AuditEventAgent#getNetworkReference <em>Network Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AuditEventAgent#getNetworkUri <em>Network Uri</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AuditEventAgent#getNetworkString <em>Network String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AuditEventAgent#getAuthorization <em>Authorization</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getAuditEventAgent()
 * @model extendedMetaData="name='AuditEvent.Agent' kind='elementOnly'"
 * @generated
 */
public interface AuditEventAgent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Functional Role of the user when performing the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEventAgent_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AuditEventAgent#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The structural roles of the agent indicating the agent's competency. The security role enabling the agent with respect to the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEventAgent_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getRole();

	/**
	 * Returns the value of the '<em><b>Who</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to who this agent is that was involved in the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Who</em>' containment reference.
	 * @see #setWho(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEventAgent_Who()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='who' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getWho();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AuditEventAgent#getWho <em>Who</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who</em>' containment reference.
	 * @see #getWho()
	 * @generated
	 */
	void setWho(Reference value);

	/**
	 * Returns the value of the '<em><b>Requestor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicator that the user is or is not the requestor, or initiator, for the event being audited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requestor</em>' containment reference.
	 * @see #setRequestor(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEventAgent_Requestor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestor' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getRequestor();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AuditEventAgent#getRequestor <em>Requestor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requestor</em>' containment reference.
	 * @see #getRequestor()
	 * @generated
	 */
	void setRequestor(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the agent location is known, the agent location when the event occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEventAgent_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AuditEventAgent#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the policy(ies) are known that authorized the agent participation in the event. Typically, a single activity may have multiple applicable policies, such as patient consent, guarantor funding, etc. The policy would also indicate the security token used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEventAgent_Policy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='policy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Uri> getPolicy();

	/**
	 * Returns the value of the '<em><b>Network Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Reference</em>' containment reference.
	 * @see #setNetworkReference(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEventAgent_NetworkReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='networkReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getNetworkReference();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AuditEventAgent#getNetworkReference <em>Network Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Reference</em>' containment reference.
	 * @see #getNetworkReference()
	 * @generated
	 */
	void setNetworkReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Network Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Uri</em>' containment reference.
	 * @see #setNetworkUri(Uri)
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEventAgent_NetworkUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='networkUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getNetworkUri();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AuditEventAgent#getNetworkUri <em>Network Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Uri</em>' containment reference.
	 * @see #getNetworkUri()
	 * @generated
	 */
	void setNetworkUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Network String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network String</em>' containment reference.
	 * @see #setNetworkString(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEventAgent_NetworkString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='networkString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getNetworkString();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AuditEventAgent#getNetworkString <em>Network String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network String</em>' containment reference.
	 * @see #getNetworkString()
	 * @generated
	 */
	void setNetworkString(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Authorization</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The authorization (e.g., PurposeOfUse) that was used during the event being recorded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authorization</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAuditEventAgent_Authorization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authorization' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getAuthorization();

} // AuditEventAgent
