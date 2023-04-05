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

import org.hl7.emf.fhir.AccountDiagnosis;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.CodeableReference;
import org.hl7.emf.fhir.DateTime;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account Diagnosis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.AccountDiagnosisImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AccountDiagnosisImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AccountDiagnosisImpl#getDateOfDiagnosis <em>Date Of Diagnosis</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AccountDiagnosisImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AccountDiagnosisImpl#getOnAdmission <em>On Admission</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AccountDiagnosisImpl#getPackageCode <em>Package Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountDiagnosisImpl extends BackboneElementImpl implements AccountDiagnosis {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference condition;

	/**
	 * The cached value of the '{@link #getDateOfDiagnosis() <em>Date Of Diagnosis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateOfDiagnosis;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> type;

	/**
	 * The cached value of the '{@link #getOnAdmission() <em>On Admission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnAdmission()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean onAdmission;

	/**
	 * The cached value of the '{@link #getPackageCode() <em>Package Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> packageCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountDiagnosisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAccountDiagnosis();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(PositiveInt newSequence, NotificationChain msgs) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT_DIAGNOSIS__SEQUENCE, oldSequence, newSequence);
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
	public void setSequence(PositiveInt newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT_DIAGNOSIS__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT_DIAGNOSIS__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT_DIAGNOSIS__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(CodeableReference newCondition, NotificationChain msgs) {
		CodeableReference oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT_DIAGNOSIS__CONDITION, oldCondition, newCondition);
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
	public void setCondition(CodeableReference newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT_DIAGNOSIS__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT_DIAGNOSIS__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT_DIAGNOSIS__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getDateOfDiagnosis() {
		return dateOfDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateOfDiagnosis(DateTime newDateOfDiagnosis, NotificationChain msgs) {
		DateTime oldDateOfDiagnosis = dateOfDiagnosis;
		dateOfDiagnosis = newDateOfDiagnosis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT_DIAGNOSIS__DATE_OF_DIAGNOSIS, oldDateOfDiagnosis, newDateOfDiagnosis);
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
	public void setDateOfDiagnosis(DateTime newDateOfDiagnosis) {
		if (newDateOfDiagnosis != dateOfDiagnosis) {
			NotificationChain msgs = null;
			if (dateOfDiagnosis != null)
				msgs = ((InternalEObject)dateOfDiagnosis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT_DIAGNOSIS__DATE_OF_DIAGNOSIS, null, msgs);
			if (newDateOfDiagnosis != null)
				msgs = ((InternalEObject)newDateOfDiagnosis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT_DIAGNOSIS__DATE_OF_DIAGNOSIS, null, msgs);
			msgs = basicSetDateOfDiagnosis(newDateOfDiagnosis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT_DIAGNOSIS__DATE_OF_DIAGNOSIS, newDateOfDiagnosis, newDateOfDiagnosis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ACCOUNT_DIAGNOSIS__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getOnAdmission() {
		return onAdmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnAdmission(org.hl7.emf.fhir.Boolean newOnAdmission, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldOnAdmission = onAdmission;
		onAdmission = newOnAdmission;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT_DIAGNOSIS__ON_ADMISSION, oldOnAdmission, newOnAdmission);
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
	public void setOnAdmission(org.hl7.emf.fhir.Boolean newOnAdmission) {
		if (newOnAdmission != onAdmission) {
			NotificationChain msgs = null;
			if (onAdmission != null)
				msgs = ((InternalEObject)onAdmission).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT_DIAGNOSIS__ON_ADMISSION, null, msgs);
			if (newOnAdmission != null)
				msgs = ((InternalEObject)newOnAdmission).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT_DIAGNOSIS__ON_ADMISSION, null, msgs);
			msgs = basicSetOnAdmission(newOnAdmission, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT_DIAGNOSIS__ON_ADMISSION, newOnAdmission, newOnAdmission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getPackageCode() {
		if (packageCode == null) {
			packageCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ACCOUNT_DIAGNOSIS__PACKAGE_CODE);
		}
		return packageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ACCOUNT_DIAGNOSIS__SEQUENCE:
				return basicSetSequence(null, msgs);
			case FhirPackage.ACCOUNT_DIAGNOSIS__CONDITION:
				return basicSetCondition(null, msgs);
			case FhirPackage.ACCOUNT_DIAGNOSIS__DATE_OF_DIAGNOSIS:
				return basicSetDateOfDiagnosis(null, msgs);
			case FhirPackage.ACCOUNT_DIAGNOSIS__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.ACCOUNT_DIAGNOSIS__ON_ADMISSION:
				return basicSetOnAdmission(null, msgs);
			case FhirPackage.ACCOUNT_DIAGNOSIS__PACKAGE_CODE:
				return ((InternalEList<?>)getPackageCode()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.ACCOUNT_DIAGNOSIS__SEQUENCE:
				return getSequence();
			case FhirPackage.ACCOUNT_DIAGNOSIS__CONDITION:
				return getCondition();
			case FhirPackage.ACCOUNT_DIAGNOSIS__DATE_OF_DIAGNOSIS:
				return getDateOfDiagnosis();
			case FhirPackage.ACCOUNT_DIAGNOSIS__TYPE:
				return getType();
			case FhirPackage.ACCOUNT_DIAGNOSIS__ON_ADMISSION:
				return getOnAdmission();
			case FhirPackage.ACCOUNT_DIAGNOSIS__PACKAGE_CODE:
				return getPackageCode();
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
			case FhirPackage.ACCOUNT_DIAGNOSIS__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case FhirPackage.ACCOUNT_DIAGNOSIS__CONDITION:
				setCondition((CodeableReference)newValue);
				return;
			case FhirPackage.ACCOUNT_DIAGNOSIS__DATE_OF_DIAGNOSIS:
				setDateOfDiagnosis((DateTime)newValue);
				return;
			case FhirPackage.ACCOUNT_DIAGNOSIS__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ACCOUNT_DIAGNOSIS__ON_ADMISSION:
				setOnAdmission((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.ACCOUNT_DIAGNOSIS__PACKAGE_CODE:
				getPackageCode().clear();
				getPackageCode().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case FhirPackage.ACCOUNT_DIAGNOSIS__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case FhirPackage.ACCOUNT_DIAGNOSIS__CONDITION:
				setCondition((CodeableReference)null);
				return;
			case FhirPackage.ACCOUNT_DIAGNOSIS__DATE_OF_DIAGNOSIS:
				setDateOfDiagnosis((DateTime)null);
				return;
			case FhirPackage.ACCOUNT_DIAGNOSIS__TYPE:
				getType().clear();
				return;
			case FhirPackage.ACCOUNT_DIAGNOSIS__ON_ADMISSION:
				setOnAdmission((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.ACCOUNT_DIAGNOSIS__PACKAGE_CODE:
				getPackageCode().clear();
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
			case FhirPackage.ACCOUNT_DIAGNOSIS__SEQUENCE:
				return sequence != null;
			case FhirPackage.ACCOUNT_DIAGNOSIS__CONDITION:
				return condition != null;
			case FhirPackage.ACCOUNT_DIAGNOSIS__DATE_OF_DIAGNOSIS:
				return dateOfDiagnosis != null;
			case FhirPackage.ACCOUNT_DIAGNOSIS__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.ACCOUNT_DIAGNOSIS__ON_ADMISSION:
				return onAdmission != null;
			case FhirPackage.ACCOUNT_DIAGNOSIS__PACKAGE_CODE:
				return packageCode != null && !packageCode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AccountDiagnosisImpl
