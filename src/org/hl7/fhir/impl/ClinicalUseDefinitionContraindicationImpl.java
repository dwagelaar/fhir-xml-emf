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

import org.hl7.fhir.ClinicalUseDefinitionContraindication;
import org.hl7.fhir.ClinicalUseDefinitionOtherTherapy;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.Expression;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clinical Use Definition Contraindication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionContraindicationImpl#getDiseaseSymptomProcedure <em>Disease Symptom Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionContraindicationImpl#getDiseaseStatus <em>Disease Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionContraindicationImpl#getComorbidity <em>Comorbidity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionContraindicationImpl#getIndication <em>Indication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionContraindicationImpl#getApplicability <em>Applicability</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalUseDefinitionContraindicationImpl#getOtherTherapy <em>Other Therapy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClinicalUseDefinitionContraindicationImpl extends BackboneElementImpl implements ClinicalUseDefinitionContraindication {
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
	 * The cached value of the '{@link #getIndication() <em>Indication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> indication;

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
	protected ClinicalUseDefinitionContraindicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClinicalUseDefinitionContraindication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__DISEASE_SYMPTOM_PROCEDURE, oldDiseaseSymptomProcedure, newDiseaseSymptomProcedure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiseaseSymptomProcedure(CodeableReference newDiseaseSymptomProcedure) {
		if (newDiseaseSymptomProcedure != diseaseSymptomProcedure) {
			NotificationChain msgs = null;
			if (diseaseSymptomProcedure != null)
				msgs = ((InternalEObject)diseaseSymptomProcedure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__DISEASE_SYMPTOM_PROCEDURE, null, msgs);
			if (newDiseaseSymptomProcedure != null)
				msgs = ((InternalEObject)newDiseaseSymptomProcedure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__DISEASE_SYMPTOM_PROCEDURE, null, msgs);
			msgs = basicSetDiseaseSymptomProcedure(newDiseaseSymptomProcedure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__DISEASE_SYMPTOM_PROCEDURE, newDiseaseSymptomProcedure, newDiseaseSymptomProcedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__DISEASE_STATUS, oldDiseaseStatus, newDiseaseStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiseaseStatus(CodeableReference newDiseaseStatus) {
		if (newDiseaseStatus != diseaseStatus) {
			NotificationChain msgs = null;
			if (diseaseStatus != null)
				msgs = ((InternalEObject)diseaseStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__DISEASE_STATUS, null, msgs);
			if (newDiseaseStatus != null)
				msgs = ((InternalEObject)newDiseaseStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__DISEASE_STATUS, null, msgs);
			msgs = basicSetDiseaseStatus(newDiseaseStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__DISEASE_STATUS, newDiseaseStatus, newDiseaseStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableReference> getComorbidity() {
		if (comorbidity == null) {
			comorbidity = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__COMORBIDITY);
		}
		return comorbidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getIndication() {
		if (indication == null) {
			indication = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__INDICATION);
		}
		return indication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__APPLICABILITY, oldApplicability, newApplicability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicability(Expression newApplicability) {
		if (newApplicability != applicability) {
			NotificationChain msgs = null;
			if (applicability != null)
				msgs = ((InternalEObject)applicability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__APPLICABILITY, null, msgs);
			if (newApplicability != null)
				msgs = ((InternalEObject)newApplicability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__APPLICABILITY, null, msgs);
			msgs = basicSetApplicability(newApplicability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__APPLICABILITY, newApplicability, newApplicability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClinicalUseDefinitionOtherTherapy> getOtherTherapy() {
		if (otherTherapy == null) {
			otherTherapy = new EObjectContainmentEList<ClinicalUseDefinitionOtherTherapy>(ClinicalUseDefinitionOtherTherapy.class, this, FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__OTHER_THERAPY);
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
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__DISEASE_SYMPTOM_PROCEDURE:
				return basicSetDiseaseSymptomProcedure(null, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__DISEASE_STATUS:
				return basicSetDiseaseStatus(null, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__COMORBIDITY:
				return ((InternalEList<?>)getComorbidity()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__INDICATION:
				return ((InternalEList<?>)getIndication()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__APPLICABILITY:
				return basicSetApplicability(null, msgs);
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__OTHER_THERAPY:
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
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__DISEASE_SYMPTOM_PROCEDURE:
				return getDiseaseSymptomProcedure();
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__DISEASE_STATUS:
				return getDiseaseStatus();
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__COMORBIDITY:
				return getComorbidity();
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__INDICATION:
				return getIndication();
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__APPLICABILITY:
				return getApplicability();
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__OTHER_THERAPY:
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
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__DISEASE_SYMPTOM_PROCEDURE:
				setDiseaseSymptomProcedure((CodeableReference)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__DISEASE_STATUS:
				setDiseaseStatus((CodeableReference)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__COMORBIDITY:
				getComorbidity().clear();
				getComorbidity().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__INDICATION:
				getIndication().clear();
				getIndication().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__APPLICABILITY:
				setApplicability((Expression)newValue);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__OTHER_THERAPY:
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
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__DISEASE_SYMPTOM_PROCEDURE:
				setDiseaseSymptomProcedure((CodeableReference)null);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__DISEASE_STATUS:
				setDiseaseStatus((CodeableReference)null);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__COMORBIDITY:
				getComorbidity().clear();
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__INDICATION:
				getIndication().clear();
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__APPLICABILITY:
				setApplicability((Expression)null);
				return;
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__OTHER_THERAPY:
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
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__DISEASE_SYMPTOM_PROCEDURE:
				return diseaseSymptomProcedure != null;
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__DISEASE_STATUS:
				return diseaseStatus != null;
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__COMORBIDITY:
				return comorbidity != null && !comorbidity.isEmpty();
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__INDICATION:
				return indication != null && !indication.isEmpty();
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__APPLICABILITY:
				return applicability != null;
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION__OTHER_THERAPY:
				return otherTherapy != null && !otherTherapy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClinicalUseDefinitionContraindicationImpl
