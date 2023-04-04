/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adverse Event Causality</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.AdverseEventCausality#getAssessmentMethod <em>Assessment Method</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEventCausality#getEntityRelatedness <em>Entity Relatedness</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdverseEventCausality#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEventCausality()
 * @model extendedMetaData="name='AdverseEvent.Causality' kind='elementOnly'"
 * @generated
 */
public interface AdverseEventCausality extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Assessment Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The method of evaluating the relatedness of the suspected entity to the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assessment Method</em>' containment reference.
	 * @see #setAssessmentMethod(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEventCausality_AssessmentMethod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assessmentMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAssessmentMethod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdverseEventCausality#getAssessmentMethod <em>Assessment Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessment Method</em>' containment reference.
	 * @see #getAssessmentMethod()
	 * @generated
	 */
	void setAssessmentMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Entity Relatedness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The result of the assessment regarding the relatedness of the suspected entity to the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entity Relatedness</em>' containment reference.
	 * @see #setEntityRelatedness(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEventCausality_EntityRelatedness()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entityRelatedness' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getEntityRelatedness();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdverseEventCausality#getEntityRelatedness <em>Entity Relatedness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Relatedness</em>' containment reference.
	 * @see #getEntityRelatedness()
	 * @generated
	 */
	void setEntityRelatedness(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The author of the information on the possible cause of the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdverseEventCausality_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAuthor();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdverseEventCausality#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Reference value);

} // AdverseEventCausality
