/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adverse Event Suspect Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An event (i.e. any change to current patient status) that may be related to unintended effects on a patient or research participant. The unintended effects may require additional monitoring, treatment, hospitalization, or may result in death. The AdverseEvent resource also extends to potential or avoided events that could have had such effects. There are two major domains where the AdverseEvent resource is expected to be used. One is in clinical care reported adverse events and the other is in reporting adverse events in clinical  research trial management. Adverse events can be reported by healthcare providers, patients, caregivers or by medical products manufacturers. Given the differences between these two concepts, we recommend consulting the domain specific implementation guides when implementing the AdverseEvent Resource. The implementation guides include specific extensions, value sets and constraints.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.AdverseEventSuspectEntity#getInstanceCodeableConcept <em>Instance Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEventSuspectEntity#getInstanceReference <em>Instance Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEventSuspectEntity#getCausality <em>Causality</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEventSuspectEntity()
 * @model extendedMetaData="name='AdverseEvent.SuspectEntity' kind='elementOnly'"
 * @generated
 */
public interface AdverseEventSuspectEntity extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Instance Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Codeable Concept</em>' containment reference.
	 * @see #setInstanceCodeableConcept(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEventSuspectEntity_InstanceCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instanceCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getInstanceCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdverseEventSuspectEntity#getInstanceCodeableConcept <em>Instance Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Codeable Concept</em>' containment reference.
	 * @see #getInstanceCodeableConcept()
	 * @generated
	 */
	void setInstanceCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Instance Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Reference</em>' containment reference.
	 * @see #setInstanceReference(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEventSuspectEntity_InstanceReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instanceReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getInstanceReference();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdverseEventSuspectEntity#getInstanceReference <em>Instance Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Reference</em>' containment reference.
	 * @see #getInstanceReference()
	 * @generated
	 */
	void setInstanceReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Causality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information on the possible cause of the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Causality</em>' containment reference.
	 * @see #setCausality(AdverseEventCausality)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEventSuspectEntity_Causality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='causality' namespace='##targetNamespace'"
	 * @generated
	 */
	AdverseEventCausality getCausality();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdverseEventSuspectEntity#getCausality <em>Causality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Causality</em>' containment reference.
	 * @see #getCausality()
	 * @generated
	 */
	void setCausality(AdverseEventCausality value);

} // AdverseEventSuspectEntity
