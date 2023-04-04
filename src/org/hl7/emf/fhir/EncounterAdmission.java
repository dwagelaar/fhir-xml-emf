/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounter Admission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.  Encounter is primarily used to record information about the actual activities that occurred, where Appointment is used to record planned activities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.EncounterAdmission#getPreAdmissionIdentifier <em>Pre Admission Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EncounterAdmission#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EncounterAdmission#getAdmitSource <em>Admit Source</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EncounterAdmission#getReAdmission <em>Re Admission</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EncounterAdmission#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EncounterAdmission#getDischargeDisposition <em>Discharge Disposition</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getEncounterAdmission()
 * @model extendedMetaData="name='Encounter.Admission' kind='elementOnly'"
 * @generated
 */
public interface EncounterAdmission extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Pre Admission Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pre-admission identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Admission Identifier</em>' containment reference.
	 * @see #setPreAdmissionIdentifier(Identifier)
	 * @see org.hl7.emf.fhir.FhirPackage#getEncounterAdmission_PreAdmissionIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preAdmissionIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getPreAdmissionIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EncounterAdmission#getPreAdmissionIdentifier <em>Pre Admission Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Admission Identifier</em>' containment reference.
	 * @see #getPreAdmissionIdentifier()
	 * @generated
	 */
	void setPreAdmissionIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location/organization from which the patient came before admission.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference.
	 * @see #setOrigin(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getEncounterAdmission_Origin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='origin' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrigin();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EncounterAdmission#getOrigin <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' containment reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Reference value);

	/**
	 * Returns the value of the '<em><b>Admit Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * From where patient was admitted (physician referral, transfer).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Admit Source</em>' containment reference.
	 * @see #setAdmitSource(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getEncounterAdmission_AdmitSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='admitSource' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAdmitSource();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EncounterAdmission#getAdmitSource <em>Admit Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admit Source</em>' containment reference.
	 * @see #getAdmitSource()
	 * @generated
	 */
	void setAdmitSource(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Re Admission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that this encounter is directly related to a prior admission, often because the conditions addressed in the prior admission were not fully addressed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Re Admission</em>' containment reference.
	 * @see #setReAdmission(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getEncounterAdmission_ReAdmission()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reAdmission' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getReAdmission();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EncounterAdmission#getReAdmission <em>Re Admission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Re Admission</em>' containment reference.
	 * @see #getReAdmission()
	 * @generated
	 */
	void setReAdmission(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Location/organization to which the patient is discharged.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getEncounterAdmission_Destination()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='destination' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDestination();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EncounterAdmission#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Reference value);

	/**
	 * Returns the value of the '<em><b>Discharge Disposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Category or kind of location after discharge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Discharge Disposition</em>' containment reference.
	 * @see #setDischargeDisposition(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getEncounterAdmission_DischargeDisposition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dischargeDisposition' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDischargeDisposition();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EncounterAdmission#getDischargeDisposition <em>Discharge Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discharge Disposition</em>' containment reference.
	 * @see #getDischargeDisposition()
	 * @generated
	 */
	void setDischargeDisposition(CodeableConcept value);

} // EncounterAdmission
