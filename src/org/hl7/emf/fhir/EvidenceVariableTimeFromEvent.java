/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence Variable Time From Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The EvidenceVariable resource describes an element that knowledge (Evidence) is about.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.EvidenceVariableTimeFromEvent#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceVariableTimeFromEvent#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceVariableTimeFromEvent#getEventCodeableConcept <em>Event Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceVariableTimeFromEvent#getEventReference <em>Event Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceVariableTimeFromEvent#getEventDateTime <em>Event Date Time</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceVariableTimeFromEvent#getEventId <em>Event Id</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceVariableTimeFromEvent#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceVariableTimeFromEvent#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceVariableTimeFromEvent()
 * @model extendedMetaData="name='EvidenceVariable.TimeFromEvent' kind='elementOnly'"
 * @generated
 */
public interface EvidenceVariableTimeFromEvent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human readable description.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceVariableTimeFromEvent_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceVariableTimeFromEvent#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human-readable string to clarify or explain concepts about the timeFromEvent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceVariableTimeFromEvent_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Event Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Codeable Concept</em>' containment reference.
	 * @see #setEventCodeableConcept(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceVariableTimeFromEvent_EventCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getEventCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceVariableTimeFromEvent#getEventCodeableConcept <em>Event Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Codeable Concept</em>' containment reference.
	 * @see #getEventCodeableConcept()
	 * @generated
	 */
	void setEventCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Event Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Reference</em>' containment reference.
	 * @see #setEventReference(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceVariableTimeFromEvent_EventReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEventReference();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceVariableTimeFromEvent#getEventReference <em>Event Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Reference</em>' containment reference.
	 * @see #getEventReference()
	 * @generated
	 */
	void setEventReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Event Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Date Time</em>' containment reference.
	 * @see #setEventDateTime(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceVariableTimeFromEvent_EventDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getEventDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceVariableTimeFromEvent#getEventDateTime <em>Event Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Date Time</em>' containment reference.
	 * @see #getEventDateTime()
	 * @generated
	 */
	void setEventDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Event Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Id</em>' containment reference.
	 * @see #setEventId(Id)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceVariableTimeFromEvent_EventId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getEventId();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceVariableTimeFromEvent#getEventId <em>Event Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Id</em>' containment reference.
	 * @see #getEventId()
	 * @generated
	 */
	void setEventId(Id value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to express the observation at a defined amount of time before or after the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceVariableTimeFromEvent_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceVariableTimeFromEvent#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to express the observation within a period before and/or after the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(Range)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceVariableTimeFromEvent_Range()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='range' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getRange();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceVariableTimeFromEvent#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Range value);

} // EvidenceVariableTimeFromEvent
