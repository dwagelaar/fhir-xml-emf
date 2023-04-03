/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Intake</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of food or fluid that is being consumed by a patient.   A NutritionIntake may indicate that the patient may be consuming the food or fluid now or has consumed the food or fluid in the past.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay or through an app that tracks food or fluids consumed.   The consumption information may come from sources such as the patient's memory, from a nutrition label,  or from a clinician documenting observed intake.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.NutritionIntake#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionIntake#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionIntake#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionIntake#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionIntake#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionIntake#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionIntake#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionIntake#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionIntake#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionIntake#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionIntake#getOccurrenceDateTime <em>Occurrence Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionIntake#getOccurrencePeriod <em>Occurrence Period</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionIntake#getRecorded <em>Recorded</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionIntake#getReportedBoolean <em>Reported Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionIntake#getReportedReference <em>Reported Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionIntake#getConsumedItem <em>Consumed Item</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionIntake#getIngredientLabel <em>Ingredient Label</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionIntake#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionIntake#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionIntake#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionIntake#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionIntake#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getNutritionIntake()
 * @model extendedMetaData="name='NutritionIntake' kind='elementOnly'"
 * @generated
 */
public interface NutritionIntake extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers associated with this Nutrition Intake that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionIntake_Identifier()
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
	 * Instantiates FHIR protocol or definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiates Canonical</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionIntake_InstantiatesCanonical()
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
	 * Instantiates external protocol or definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiates Uri</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionIntake_InstantiatesUri()
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
	 * A plan, proposal or order that is fulfilled in whole or in part by this event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionIntake_BasedOn()
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
	 * @see org.hl7.fhir.FhirPackage#getNutritionIntake_PartOf()
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
	 * A code representing the patient or other source's judgment about the state of the intake that this assertion is about.  Generally, this will be active or completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(EventStatus)
	 * @see org.hl7.fhir.FhirPackage#getNutritionIntake_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	EventStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionIntake#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EventStatus value);

	/**
	 * Returns the value of the '<em><b>Status Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Captures the reason for the current state of the NutritionIntake.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionIntake_StatusReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusReason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getStatusReason();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Overall type of nutrition intake.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getNutritionIntake_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionIntake#getCode <em>Code</em>}' containment reference.
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
	 * The person, animal or group who is/was consuming the food or fluid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getNutritionIntake_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionIntake#getSubject <em>Subject</em>}' containment reference.
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
	 * The encounter that establishes the context for this NutritionIntake.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getNutritionIntake_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionIntake#getEncounter <em>Encounter</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getNutritionIntake_OccurrenceDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrenceDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getOccurrenceDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionIntake#getOccurrenceDateTime <em>Occurrence Date Time</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getNutritionIntake_OccurrencePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrencePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getOccurrencePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionIntake#getOccurrencePeriod <em>Occurrence Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Period</em>' containment reference.
	 * @see #getOccurrencePeriod()
	 * @generated
	 */
	void setOccurrencePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Recorded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date when the Nutrition Intake was asserted by the information source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorded</em>' containment reference.
	 * @see #setRecorded(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getNutritionIntake_Recorded()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recorded' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getRecorded();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionIntake#getRecorded <em>Recorded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded</em>' containment reference.
	 * @see #getRecorded()
	 * @generated
	 */
	void setRecorded(DateTime value);

	/**
	 * Returns the value of the '<em><b>Reported Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reported Boolean</em>' containment reference.
	 * @see #setReportedBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getNutritionIntake_ReportedBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reportedBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getReportedBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionIntake#getReportedBoolean <em>Reported Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reported Boolean</em>' containment reference.
	 * @see #getReportedBoolean()
	 * @generated
	 */
	void setReportedBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Reported Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reported Reference</em>' containment reference.
	 * @see #setReportedReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getNutritionIntake_ReportedReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reportedReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReportedReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionIntake#getReportedReference <em>Reported Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reported Reference</em>' containment reference.
	 * @see #getReportedReference()
	 * @generated
	 */
	void setReportedReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Consumed Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.NutritionIntakeConsumedItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What food or fluid product or item was consumed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consumed Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionIntake_ConsumedItem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='consumedItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NutritionIntakeConsumedItem> getConsumedItem();

	/**
	 * Returns the value of the '<em><b>Ingredient Label</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.NutritionIntakeIngredientLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total nutrient amounts for the whole meal, product, serving, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ingredient Label</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionIntake_IngredientLabel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ingredientLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NutritionIntakeIngredientLabel> getIngredientLabel();

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.NutritionIntakePerformer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who performed the intake and how they were involved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionIntake_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NutritionIntakePerformer> getPerformer();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the intake occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getNutritionIntake_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionIntake#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows linking the NutritionIntake to the underlying NutritionOrder, or to other information, such as AllergyIntolerance, that supports or is used to derive the NutritionIntake.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived From</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionIntake_DerivedFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='derivedFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getDerivedFrom();

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reason, Condition or observation for why the food or fluid is /was consumed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionIntake_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getReason();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides extra information about the Nutrition Intake that is not conveyed by the other attributes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionIntake_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

} // NutritionIntake
