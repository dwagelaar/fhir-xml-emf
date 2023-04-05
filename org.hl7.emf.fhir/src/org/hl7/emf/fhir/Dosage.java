/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dosage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indicates how the medication is/was taken or should be taken by the patient.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.Dosage#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Dosage#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Dosage#getAdditionalInstruction <em>Additional Instruction</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Dosage#getPatientInstruction <em>Patient Instruction</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Dosage#getTiming <em>Timing</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Dosage#getAsNeeded <em>As Needed</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Dosage#getAsNeededFor <em>As Needed For</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Dosage#getSite <em>Site</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Dosage#getRoute <em>Route</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Dosage#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Dosage#getDoseAndRate <em>Dose And Rate</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Dosage#getMaxDosePerPeriod <em>Max Dose Per Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Dosage#getMaxDosePerAdministration <em>Max Dose Per Administration</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Dosage#getMaxDosePerLifetime <em>Max Dose Per Lifetime</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getDosage()
 * @model extendedMetaData="name='Dosage' kind='elementOnly'"
 * @generated
 */
public interface Dosage extends BackboneType {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the order in which the dosage instructions should be applied or interpreted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(org.hl7.emf.fhir.Integer)
	 * @see org.hl7.emf.fhir.FhirPackage#getDosage_Sequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Integer getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Dosage#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(org.hl7.emf.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free text dosage instructions e.g. SIG.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getDosage_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getText();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Dosage#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Additional Instruction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supplemental instructions to the patient on how to take the medication  (e.g. "with meals" or"take half to one hour before food") or warnings for the patient about the medication (e.g. "may cause drowsiness" or "avoid exposure of skin to direct sunlight or sunlamps").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Instruction</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDosage_AdditionalInstruction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalInstruction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getAdditionalInstruction();

	/**
	 * Returns the value of the '<em><b>Patient Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Instructions in terms that are understood by the patient or consumer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient Instruction</em>' containment reference.
	 * @see #setPatientInstruction(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getDosage_PatientInstruction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patientInstruction' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getPatientInstruction();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Dosage#getPatientInstruction <em>Patient Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Instruction</em>' containment reference.
	 * @see #getPatientInstruction()
	 * @generated
	 */
	void setPatientInstruction(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When medication should be administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing</em>' containment reference.
	 * @see #setTiming(Timing)
	 * @see org.hl7.emf.fhir.FhirPackage#getDosage_Timing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timing' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getTiming();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Dosage#getTiming <em>Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing</em>' containment reference.
	 * @see #getTiming()
	 * @generated
	 */
	void setTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>As Needed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>As Needed</em>' containment reference.
	 * @see #setAsNeeded(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getDosage_AsNeeded()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asNeeded' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getAsNeeded();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Dosage#getAsNeeded <em>As Needed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Needed</em>' containment reference.
	 * @see #getAsNeeded()
	 * @generated
	 */
	void setAsNeeded(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>As Needed For</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the Medication is only taken based on a precondition for taking the Medication (CodeableConcept).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>As Needed For</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDosage_AsNeededFor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asNeededFor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getAsNeededFor();

	/**
	 * Returns the value of the '<em><b>Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Body site to administer to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site</em>' containment reference.
	 * @see #setSite(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getDosage_Site()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='site' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSite();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Dosage#getSite <em>Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site</em>' containment reference.
	 * @see #getSite()
	 * @generated
	 */
	void setSite(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How drug should enter body.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route</em>' containment reference.
	 * @see #setRoute(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getDosage_Route()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='route' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRoute();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Dosage#getRoute <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' containment reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technique for administering medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getDosage_Method()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Dosage#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Dose And Rate</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.DosageDoseAndRate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Depending on the resource,this is the amount of medication administered, to  be administered or typical amount to be administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose And Rate</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDosage_DoseAndRate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doseAndRate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DosageDoseAndRate> getDoseAndRate();

	/**
	 * Returns the value of the '<em><b>Max Dose Per Period</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Ratio}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Upper limit on medication per unit of time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Dose Per Period</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getDosage_MaxDosePerPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxDosePerPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Ratio> getMaxDosePerPeriod();

	/**
	 * Returns the value of the '<em><b>Max Dose Per Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Upper limit on medication per administration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Dose Per Administration</em>' containment reference.
	 * @see #setMaxDosePerAdministration(Quantity)
	 * @see org.hl7.emf.fhir.FhirPackage#getDosage_MaxDosePerAdministration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxDosePerAdministration' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getMaxDosePerAdministration();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Dosage#getMaxDosePerAdministration <em>Max Dose Per Administration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Dose Per Administration</em>' containment reference.
	 * @see #getMaxDosePerAdministration()
	 * @generated
	 */
	void setMaxDosePerAdministration(Quantity value);

	/**
	 * Returns the value of the '<em><b>Max Dose Per Lifetime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Upper limit on medication per lifetime of the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Dose Per Lifetime</em>' containment reference.
	 * @see #setMaxDosePerLifetime(Quantity)
	 * @see org.hl7.emf.fhir.FhirPackage#getDosage_MaxDosePerLifetime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxDosePerLifetime' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getMaxDosePerLifetime();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Dosage#getMaxDosePerLifetime <em>Max Dose Per Lifetime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Dose Per Lifetime</em>' containment reference.
	 * @see #getMaxDosePerLifetime()
	 * @generated
	 */
	void setMaxDosePerLifetime(Quantity value);

} // Dosage
