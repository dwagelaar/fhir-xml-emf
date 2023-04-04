/**
 */
package org.hl7.emf.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.emf.fhir.Annotation;
import org.hl7.emf.fhir.Duration;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.MedicationKnowledgeEnvironmentalSetting;
import org.hl7.emf.fhir.MedicationKnowledgeStorageGuideline;
import org.hl7.emf.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Knowledge Storage Guideline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationKnowledgeStorageGuidelineImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationKnowledgeStorageGuidelineImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationKnowledgeStorageGuidelineImpl#getStabilityDuration <em>Stability Duration</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.MedicationKnowledgeStorageGuidelineImpl#getEnvironmentalSetting <em>Environmental Setting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationKnowledgeStorageGuidelineImpl extends BackboneElementImpl implements MedicationKnowledgeStorageGuideline {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Uri reference;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * The cached value of the '{@link #getStabilityDuration() <em>Stability Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStabilityDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration stabilityDuration;

	/**
	 * The cached value of the '{@link #getEnvironmentalSetting() <em>Environmental Setting</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentalSetting()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeEnvironmentalSetting> environmentalSetting;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationKnowledgeStorageGuidelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationKnowledgeStorageGuideline();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(Uri newReference, NotificationChain msgs) {
		Uri oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__REFERENCE, oldReference, newReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReference(Uri newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getStabilityDuration() {
		return stabilityDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStabilityDuration(Duration newStabilityDuration, NotificationChain msgs) {
		Duration oldStabilityDuration = stabilityDuration;
		stabilityDuration = newStabilityDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__STABILITY_DURATION, oldStabilityDuration, newStabilityDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStabilityDuration(Duration newStabilityDuration) {
		if (newStabilityDuration != stabilityDuration) {
			NotificationChain msgs = null;
			if (stabilityDuration != null)
				msgs = ((InternalEObject)stabilityDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__STABILITY_DURATION, null, msgs);
			if (newStabilityDuration != null)
				msgs = ((InternalEObject)newStabilityDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__STABILITY_DURATION, null, msgs);
			msgs = basicSetStabilityDuration(newStabilityDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__STABILITY_DURATION, newStabilityDuration, newStabilityDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeEnvironmentalSetting> getEnvironmentalSetting() {
		if (environmentalSetting == null) {
			environmentalSetting = new EObjectContainmentEList<MedicationKnowledgeEnvironmentalSetting>(MedicationKnowledgeEnvironmentalSetting.class, this, FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__ENVIRONMENTAL_SETTING);
		}
		return environmentalSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__REFERENCE:
				return basicSetReference(null, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__STABILITY_DURATION:
				return basicSetStabilityDuration(null, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__ENVIRONMENTAL_SETTING:
				return ((InternalEList<?>)getEnvironmentalSetting()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__REFERENCE:
				return getReference();
			case FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__NOTE:
				return getNote();
			case FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__STABILITY_DURATION:
				return getStabilityDuration();
			case FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__ENVIRONMENTAL_SETTING:
				return getEnvironmentalSetting();
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
			case FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__REFERENCE:
				setReference((Uri)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__STABILITY_DURATION:
				setStabilityDuration((Duration)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__ENVIRONMENTAL_SETTING:
				getEnvironmentalSetting().clear();
				getEnvironmentalSetting().addAll((Collection<? extends MedicationKnowledgeEnvironmentalSetting>)newValue);
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
			case FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__REFERENCE:
				setReference((Uri)null);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__NOTE:
				getNote().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__STABILITY_DURATION:
				setStabilityDuration((Duration)null);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__ENVIRONMENTAL_SETTING:
				getEnvironmentalSetting().clear();
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
			case FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__REFERENCE:
				return reference != null;
			case FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__STABILITY_DURATION:
				return stabilityDuration != null;
			case FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE__ENVIRONMENTAL_SETTING:
				return environmentalSetting != null && !environmentalSetting.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationKnowledgeStorageGuidelineImpl
