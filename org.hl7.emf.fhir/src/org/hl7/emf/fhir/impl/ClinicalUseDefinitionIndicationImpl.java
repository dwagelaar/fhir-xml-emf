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

import org.hl7.emf.fhir.ClinicalUseDefinitionIndication;
import org.hl7.emf.fhir.ClinicalUseDefinitionOtherTherapy;
import org.hl7.emf.fhir.CodeableReference;
import org.hl7.emf.fhir.Expression;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Range;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clinical Use Definition Indication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ClinicalUseDefinitionIndicationImpl#getDiseaseSymptomProcedure <em>Disease Symptom Procedure</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ClinicalUseDefinitionIndicationImpl#getDiseaseStatus <em>Disease Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ClinicalUseDefinitionIndicationImpl#getComorbidity <em>Comorbidity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ClinicalUseDefinitionIndicationImpl#getIntendedEffect <em>Intended Effect</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ClinicalUseDefinitionIndicationImpl#getDurationRange <em>Duration Range</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ClinicalUseDefinitionIndicationImpl#getDurationString <em>Duration String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ClinicalUseDefinitionIndicationImpl#getUndesirableEffect <em>Undesirable Effect</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ClinicalUseDefinitionIndicationImpl#getApplicability <em>Applicability</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ClinicalUseDefinitionIndicationImpl#getOtherTherapy <em>Other Therapy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClinicalUseDefinitionIndicationImpl extends BackboneElementImpl implements ClinicalUseDefinitionIndication {
	/**
	 * The cached value of the '{@link #getDiseaseSymptomProcedure() <em>Disease Symptom Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseSymptomProcedure()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference diseaseSymptomProcedure;

	/**
	 * The cached value of the '{@link #getDiseaseStatus() <em>Disease Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference diseaseStatus;

	/**
	 * The cached value of the '{@link #getComorbidity() <em>Comorbidity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComorbidity()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> comorbidity;

	/**
	 * The cached value of the '{@link #getIntendedEffect() <em>Intended Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedEffect()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference intendedEffect;

	/**
	 * The cached value of the '{@link #getDurationRange() <em>Duration Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationRange()
	 * @generated
	 * @ordered
	 */
	protected Range durationRange;

	/**
	 * The cached value of the '{@link #getDurationString() <em>Duration String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String durationString;

	/**
	 * The cached value of the '{@link #getUndesirableEffect() <em>Undesirable Effect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUndesirableEffect()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> undesirableEffect;

	/**
	 * The cached value of the '{@link #getApplicability() <em>Applicability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicability()
	 * @generated
	 * @ordered
	 */
	protected Expression applicability;

	/**
	 * The cached value of the '{@link #getOtherTherapy() <em>Other Therapy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTherapy()
	 * @generated
	 * @ordered
	 */
	protected EList<ClinicalUseDefinitionOtherTherapy> otherTherapy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClinicalUseDefinitionIndicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClinicalUseDefinitionIndication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getDiseaseSymptomProcedure() {
		return diseaseSymptomProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiseaseSymptomProcedure(CodeableReference newDiseaseSymptomProcedure, NotificationChain msgs) {
		CodeableReference oldDiseaseSymptomProcedure = diseaseSymptomProcedure;
		diseaseSymptomProcedure = newDiseaseSymptomProcedure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DISEASE_SYMPTOM_PROCEDURE, oldDiseaseSymptomProcedure, newDiseaseSymptomProcedure);
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
	public void setDiseaseSymptomProcedure(CodeableReference newDiseaseSymptomProcedure) {
		if (newDiseaseSymptomProcedure != diseaseSymptomProcedure) {
			NotificationChain msgs = null;
			if (diseaseSymptomProcedure != null)
				msgs = ((InternalEObject)diseaseSymptomProcedure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DISEASE_SYMPTOM_PROCEDURE, null, msgs);
			if (newDiseaseSymptomProcedure != null)
				msgs = ((InternalEObject)newDiseaseSymptomProcedure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DISEASE_SYMPTOM_PROCEDURE, null, msgs);
			msgs = basicSetDiseaseSymptomProcedure(newDiseaseSymptomProcedure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DISEASE_SYMPTOM_PROCEDURE, newDiseaseSymptomProcedure, newDiseaseSymptomProcedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getDiseaseStatus() {
		return diseaseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiseaseStatus(CodeableReference newDiseaseStatus, NotificationChain msgs) {
		CodeableReference oldDiseaseStatus = diseaseStatus;
		diseaseStatus = newDiseaseStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DISEASE_STATUS, oldDiseaseStatus, newDiseaseStatus);
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
	public void setDiseaseStatus(CodeableReference newDiseaseStatus) {
		if (newDiseaseStatus != diseaseStatus) {
			NotificationChain msgs = null;
			if (diseaseStatus != null)
				msgs = ((InternalEObject)diseaseStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DISEASE_STATUS, null, msgs);
			if (newDiseaseStatus != null)
				msgs = ((InternalEObject)newDiseaseStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DISEASE_STATUS, null, msgs);
			msgs = basicSetDiseaseStatus(newDiseaseStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DISEASE_STATUS, newDiseaseStatus, newDiseaseStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getComorbidity() {
		if (comorbidity == null) {
			comorbidity = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__COMORBIDITY);
		}
		return comorbidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getIntendedEffect() {
		return intendedEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntendedEffect(CodeableReference newIntendedEffect, NotificationChain msgs) {
		CodeableReference oldIntendedEffect = intendedEffect;
		intendedEffect = newIntendedEffect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__INTENDED_EFFECT, oldIntendedEffect, newIntendedEffect);
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
	public void setIntendedEffect(CodeableReference newIntendedEffect) {
		if (newIntendedEffect != intendedEffect) {
			NotificationChain msgs = null;
			if (intendedEffect != null)
				msgs = ((InternalEObject)intendedEffect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__INTENDED_EFFECT, null, msgs);
			if (newIntendedEffect != null)
				msgs = ((InternalEObject)newIntendedEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__INTENDED_EFFECT, null, msgs);
			msgs = basicSetIntendedEffect(newIntendedEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__INTENDED_EFFECT, newIntendedEffect, newIntendedEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getDurationRange() {
		return durationRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDurationRange(Range newDurationRange, NotificationChain msgs) {
		Range oldDurationRange = durationRange;
		durationRange = newDurationRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DURATION_RANGE, oldDurationRange, newDurationRange);
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
	public void setDurationRange(Range newDurationRange) {
		if (newDurationRange != durationRange) {
			NotificationChain msgs = null;
			if (durationRange != null)
				msgs = ((InternalEObject)durationRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DURATION_RANGE, null, msgs);
			if (newDurationRange != null)
				msgs = ((InternalEObject)newDurationRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DURATION_RANGE, null, msgs);
			msgs = basicSetDurationRange(newDurationRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DURATION_RANGE, newDurationRange, newDurationRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getDurationString() {
		return durationString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDurationString(org.hl7.emf.fhir.String newDurationString, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldDurationString = durationString;
		durationString = newDurationString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DURATION_STRING, oldDurationString, newDurationString);
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
	public void setDurationString(org.hl7.emf.fhir.String newDurationString) {
		if (newDurationString != durationString) {
			NotificationChain msgs = null;
			if (durationString != null)
				msgs = ((InternalEObject)durationString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DURATION_STRING, null, msgs);
			if (newDurationString != null)
				msgs = ((InternalEObject)newDurationString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DURATION_STRING, null, msgs);
			msgs = basicSetDurationString(newDurationString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DURATION_STRING, newDurationString, newDurationString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getUndesirableEffect() {
		if (undesirableEffect == null) {
			undesirableEffect = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__UNDESIRABLE_EFFECT);
		}
		return undesirableEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getApplicability() {
		return applicability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicability(Expression newApplicability, NotificationChain msgs) {
		Expression oldApplicability = applicability;
		applicability = newApplicability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__APPLICABILITY, oldApplicability, newApplicability);
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
	public void setApplicability(Expression newApplicability) {
		if (newApplicability != applicability) {
			NotificationChain msgs = null;
			if (applicability != null)
				msgs = ((InternalEObject)applicability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__APPLICABILITY, null, msgs);
			if (newApplicability != null)
				msgs = ((InternalEObject)newApplicability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__APPLICABILITY, null, msgs);
			msgs = basicSetApplicability(newApplicability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__APPLICABILITY, newApplicability, newApplicability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClinicalUseDefinitionOtherTherapy> getOtherTherapy() {
		if (otherTherapy == null) {
			otherTherapy = new EObjectContainmentEList<ClinicalUseDefinitionOtherTherapy>(ClinicalUseDefinitionOtherTherapy.class, this, FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__OTHER_THERAPY);
		}
		return otherTherapy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DISEASE_SYMPTOM_PROCEDURE:
				return basicSetDiseaseSymptomProcedure(null, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DISEASE_STATUS:
				return basicSetDiseaseStatus(null, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__COMORBIDITY:
				return ((InternalEList<?>)getComorbidity()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__INTENDED_EFFECT:
				return basicSetIntendedEffect(null, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DURATION_RANGE:
				return basicSetDurationRange(null, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DURATION_STRING:
				return basicSetDurationString(null, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__UNDESIRABLE_EFFECT:
				return ((InternalEList<?>)getUndesirableEffect()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__APPLICABILITY:
				return basicSetApplicability(null, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__OTHER_THERAPY:
				return ((InternalEList<?>)getOtherTherapy()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DISEASE_SYMPTOM_PROCEDURE:
				return getDiseaseSymptomProcedure();
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DISEASE_STATUS:
				return getDiseaseStatus();
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__COMORBIDITY:
				return getComorbidity();
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__INTENDED_EFFECT:
				return getIntendedEffect();
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DURATION_RANGE:
				return getDurationRange();
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DURATION_STRING:
				return getDurationString();
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__UNDESIRABLE_EFFECT:
				return getUndesirableEffect();
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__APPLICABILITY:
				return getApplicability();
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__OTHER_THERAPY:
				return getOtherTherapy();
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
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DISEASE_SYMPTOM_PROCEDURE:
				setDiseaseSymptomProcedure((CodeableReference)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DISEASE_STATUS:
				setDiseaseStatus((CodeableReference)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__COMORBIDITY:
				getComorbidity().clear();
				getComorbidity().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__INTENDED_EFFECT:
				setIntendedEffect((CodeableReference)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DURATION_RANGE:
				setDurationRange((Range)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DURATION_STRING:
				setDurationString((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__UNDESIRABLE_EFFECT:
				getUndesirableEffect().clear();
				getUndesirableEffect().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__APPLICABILITY:
				setApplicability((Expression)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__OTHER_THERAPY:
				getOtherTherapy().clear();
				getOtherTherapy().addAll((Collection<? extends ClinicalUseDefinitionOtherTherapy>)newValue);
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
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DISEASE_SYMPTOM_PROCEDURE:
				setDiseaseSymptomProcedure((CodeableReference)null);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DISEASE_STATUS:
				setDiseaseStatus((CodeableReference)null);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__COMORBIDITY:
				getComorbidity().clear();
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__INTENDED_EFFECT:
				setIntendedEffect((CodeableReference)null);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DURATION_RANGE:
				setDurationRange((Range)null);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DURATION_STRING:
				setDurationString((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__UNDESIRABLE_EFFECT:
				getUndesirableEffect().clear();
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__APPLICABILITY:
				setApplicability((Expression)null);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__OTHER_THERAPY:
				getOtherTherapy().clear();
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
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DISEASE_SYMPTOM_PROCEDURE:
				return diseaseSymptomProcedure != null;
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DISEASE_STATUS:
				return diseaseStatus != null;
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__COMORBIDITY:
				return comorbidity != null && !comorbidity.isEmpty();
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__INTENDED_EFFECT:
				return intendedEffect != null;
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DURATION_RANGE:
				return durationRange != null;
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__DURATION_STRING:
				return durationString != null;
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__UNDESIRABLE_EFFECT:
				return undesirableEffect != null && !undesirableEffect.isEmpty();
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__APPLICABILITY:
				return applicability != null;
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION__OTHER_THERAPY:
				return otherTherapy != null && !otherTherapy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClinicalUseDefinitionIndicationImpl
