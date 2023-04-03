/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit Event Entity</b></em>'.
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
 *   <li>{@link org.hl7.fhir.AuditEventEntity#getWhat <em>What</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventEntity#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventEntity#getSecurityLabel <em>Security Label</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventEntity#getQuery <em>Query</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventEntity#getDetail <em>Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventEntity#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAuditEventEntity()
 * @model extendedMetaData="name='AuditEvent.Entity' kind='elementOnly'"
 * @generated
 */
public interface AuditEventEntity extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>What</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a specific instance of the entity. The reference should be version specific. This is allowed to be a Parameters resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>What</em>' containment reference.
	 * @see #setWhat(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventEntity_What()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='what' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getWhat();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventEntity#getWhat <em>What</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>What</em>' containment reference.
	 * @see #getWhat()
	 * @generated
	 */
	void setWhat(Reference value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code representing the role the entity played in the event being audited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventEntity_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventEntity#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Security Label</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Security labels for the identified entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Label</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAuditEventEntity_SecurityLabel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='securityLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSecurityLabel();

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query parameters for a query-type entities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getAuditEventEntity_Query()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='query' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getQuery();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventEntity#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AuditEventDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tagged value pairs for conveying additional information about the entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAuditEventEntity_Detail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detail' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AuditEventDetail> getDetail();

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AuditEventAgent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entity is attributed to an agent to express the agent's responsibility for that entity in the activity. This is most used to indicate when persistence media (the entity) are used by an agent. For example when importing data from a device, the device would be described in an entity, and the user importing data from that media would be indicated as the entity.agent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAuditEventEntity_Agent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='agent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AuditEventAgent> getAgent();

} // AuditEventEntity
