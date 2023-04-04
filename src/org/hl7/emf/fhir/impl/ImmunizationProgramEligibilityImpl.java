/**
 */
package org.hl7.emf.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.ImmunizationProgramEligibility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Program Eligibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ImmunizationProgramEligibilityImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ImmunizationProgramEligibilityImpl#getProgramStatus <em>Program Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmunizationProgramEligibilityImpl extends BackboneElementImpl implements ImmunizationProgramEligibility {
	/**
	 * The cached value of the '{@link #getProgram() <em>Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept program;

	/**
	 * The cached value of the '{@link #getProgramStatus() <em>Program Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept programStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationProgramEligibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImmunizationProgramEligibility();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getProgram() {
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram(CodeableConcept newProgram, NotificationChain msgs) {
		CodeableConcept oldProgram = program;
		program = newProgram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_PROGRAM_ELIGIBILITY__PROGRAM, oldProgram, newProgram);
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
	public void setProgram(CodeableConcept newProgram) {
		if (newProgram != program) {
			NotificationChain msgs = null;
			if (program != null)
				msgs = ((InternalEObject)program).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_PROGRAM_ELIGIBILITY__PROGRAM, null, msgs);
			if (newProgram != null)
				msgs = ((InternalEObject)newProgram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_PROGRAM_ELIGIBILITY__PROGRAM, null, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_PROGRAM_ELIGIBILITY__PROGRAM, newProgram, newProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getProgramStatus() {
		return programStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramStatus(CodeableConcept newProgramStatus, NotificationChain msgs) {
		CodeableConcept oldProgramStatus = programStatus;
		programStatus = newProgramStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_PROGRAM_ELIGIBILITY__PROGRAM_STATUS, oldProgramStatus, newProgramStatus);
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
	public void setProgramStatus(CodeableConcept newProgramStatus) {
		if (newProgramStatus != programStatus) {
			NotificationChain msgs = null;
			if (programStatus != null)
				msgs = ((InternalEObject)programStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_PROGRAM_ELIGIBILITY__PROGRAM_STATUS, null, msgs);
			if (newProgramStatus != null)
				msgs = ((InternalEObject)newProgramStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_PROGRAM_ELIGIBILITY__PROGRAM_STATUS, null, msgs);
			msgs = basicSetProgramStatus(newProgramStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_PROGRAM_ELIGIBILITY__PROGRAM_STATUS, newProgramStatus, newProgramStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMMUNIZATION_PROGRAM_ELIGIBILITY__PROGRAM:
				return basicSetProgram(null, msgs);
			case FhirPackage.IMMUNIZATION_PROGRAM_ELIGIBILITY__PROGRAM_STATUS:
				return basicSetProgramStatus(null, msgs);
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
			case FhirPackage.IMMUNIZATION_PROGRAM_ELIGIBILITY__PROGRAM:
				return getProgram();
			case FhirPackage.IMMUNIZATION_PROGRAM_ELIGIBILITY__PROGRAM_STATUS:
				return getProgramStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.IMMUNIZATION_PROGRAM_ELIGIBILITY__PROGRAM:
				setProgram((CodeableConcept)newValue);
				return;
			case FhirPackage.IMMUNIZATION_PROGRAM_ELIGIBILITY__PROGRAM_STATUS:
				setProgramStatus((CodeableConcept)newValue);
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
			case FhirPackage.IMMUNIZATION_PROGRAM_ELIGIBILITY__PROGRAM:
				setProgram((CodeableConcept)null);
				return;
			case FhirPackage.IMMUNIZATION_PROGRAM_ELIGIBILITY__PROGRAM_STATUS:
				setProgramStatus((CodeableConcept)null);
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
			case FhirPackage.IMMUNIZATION_PROGRAM_ELIGIBILITY__PROGRAM:
				return program != null;
			case FhirPackage.IMMUNIZATION_PROGRAM_ELIGIBILITY__PROGRAM_STATUS:
				return programStatus != null;
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationProgramEligibilityImpl
