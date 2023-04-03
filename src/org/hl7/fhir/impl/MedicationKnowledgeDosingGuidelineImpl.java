/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MedicationKnowledgeDosage;
import org.hl7.fhir.MedicationKnowledgeDosingGuideline;
import org.hl7.fhir.MedicationKnowledgePatientCharacteristic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Knowledge Dosing Guideline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeDosingGuidelineImpl#getTreatmentIntent <em>Treatment Intent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeDosingGuidelineImpl#getDosage <em>Dosage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeDosingGuidelineImpl#getAdministrationTreatment <em>Administration Treatment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeDosingGuidelineImpl#getPatientCharacteristic <em>Patient Characteristic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationKnowledgeDosingGuidelineImpl extends BackboneElementImpl implements MedicationKnowledgeDosingGuideline {
	/**
	 * The cached value of the '{@link #getTreatmentIntent() <em>Treatment Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatmentIntent()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept treatmentIntent;

	/**
	 * The cached value of the '{@link #getDosage() <em>Dosage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosage()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeDosage> dosage;

	/**
	 * The cached value of the '{@link #getAdministrationTreatment() <em>Administration Treatment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrationTreatment()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept administrationTreatment;

	/**
	 * The cached value of the '{@link #getPatientCharacteristic() <em>Patient Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgePatientCharacteristic> patientCharacteristic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationKnowledgeDosingGuidelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationKnowledgeDosingGuideline();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getTreatmentIntent() {
		return treatmentIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTreatmentIntent(CodeableConcept newTreatmentIntent, NotificationChain msgs) {
		CodeableConcept oldTreatmentIntent = treatmentIntent;
		treatmentIntent = newTreatmentIntent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__TREATMENT_INTENT, oldTreatmentIntent, newTreatmentIntent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreatmentIntent(CodeableConcept newTreatmentIntent) {
		if (newTreatmentIntent != treatmentIntent) {
			NotificationChain msgs = null;
			if (treatmentIntent != null)
				msgs = ((InternalEObject)treatmentIntent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__TREATMENT_INTENT, null, msgs);
			if (newTreatmentIntent != null)
				msgs = ((InternalEObject)newTreatmentIntent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__TREATMENT_INTENT, null, msgs);
			msgs = basicSetTreatmentIntent(newTreatmentIntent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__TREATMENT_INTENT, newTreatmentIntent, newTreatmentIntent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationKnowledgeDosage> getDosage() {
		if (dosage == null) {
			dosage = new EObjectContainmentEList<MedicationKnowledgeDosage>(MedicationKnowledgeDosage.class, this, FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__DOSAGE);
		}
		return dosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getAdministrationTreatment() {
		return administrationTreatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdministrationTreatment(CodeableConcept newAdministrationTreatment, NotificationChain msgs) {
		CodeableConcept oldAdministrationTreatment = administrationTreatment;
		administrationTreatment = newAdministrationTreatment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__ADMINISTRATION_TREATMENT, oldAdministrationTreatment, newAdministrationTreatment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdministrationTreatment(CodeableConcept newAdministrationTreatment) {
		if (newAdministrationTreatment != administrationTreatment) {
			NotificationChain msgs = null;
			if (administrationTreatment != null)
				msgs = ((InternalEObject)administrationTreatment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__ADMINISTRATION_TREATMENT, null, msgs);
			if (newAdministrationTreatment != null)
				msgs = ((InternalEObject)newAdministrationTreatment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__ADMINISTRATION_TREATMENT, null, msgs);
			msgs = basicSetAdministrationTreatment(newAdministrationTreatment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__ADMINISTRATION_TREATMENT, newAdministrationTreatment, newAdministrationTreatment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationKnowledgePatientCharacteristic> getPatientCharacteristic() {
		if (patientCharacteristic == null) {
			patientCharacteristic = new EObjectContainmentEList<MedicationKnowledgePatientCharacteristic>(MedicationKnowledgePatientCharacteristic.class, this, FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__PATIENT_CHARACTERISTIC);
		}
		return patientCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__TREATMENT_INTENT:
				return basicSetTreatmentIntent(null, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__DOSAGE:
				return ((InternalEList<?>)getDosage()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__ADMINISTRATION_TREATMENT:
				return basicSetAdministrationTreatment(null, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__PATIENT_CHARACTERISTIC:
				return ((InternalEList<?>)getPatientCharacteristic()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__TREATMENT_INTENT:
				return getTreatmentIntent();
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__DOSAGE:
				return getDosage();
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__ADMINISTRATION_TREATMENT:
				return getAdministrationTreatment();
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__PATIENT_CHARACTERISTIC:
				return getPatientCharacteristic();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__TREATMENT_INTENT:
				setTreatmentIntent((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__DOSAGE:
				getDosage().clear();
				getDosage().addAll((Collection<? extends MedicationKnowledgeDosage>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__ADMINISTRATION_TREATMENT:
				setAdministrationTreatment((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__PATIENT_CHARACTERISTIC:
				getPatientCharacteristic().clear();
				getPatientCharacteristic().addAll((Collection<? extends MedicationKnowledgePatientCharacteristic>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__TREATMENT_INTENT:
				setTreatmentIntent((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__DOSAGE:
				getDosage().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__ADMINISTRATION_TREATMENT:
				setAdministrationTreatment((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__PATIENT_CHARACTERISTIC:
				getPatientCharacteristic().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__TREATMENT_INTENT:
				return treatmentIntent != null;
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__DOSAGE:
				return dosage != null && !dosage.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__ADMINISTRATION_TREATMENT:
				return administrationTreatment != null;
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE__PATIENT_CHARACTERISTIC:
				return patientCharacteristic != null && !patientCharacteristic.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationKnowledgeDosingGuidelineImpl
