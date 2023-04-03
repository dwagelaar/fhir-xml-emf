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

import org.hl7.fhir.Annotation;
import org.hl7.fhir.CarePlanActivity;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Plan Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CarePlanActivityImpl#getPerformedActivity <em>Performed Activity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanActivityImpl#getProgress <em>Progress</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CarePlanActivityImpl#getPlannedActivityReference <em>Planned Activity Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarePlanActivityImpl extends BackboneElementImpl implements CarePlanActivity {
	/**
	 * The cached value of the '{@link #getPerformedActivity() <em>Performed Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> performedActivity;

	/**
	 * The cached value of the '{@link #getProgress() <em>Progress</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> progress;

	/**
	 * The cached value of the '{@link #getPlannedActivityReference() <em>Planned Activity Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedActivityReference()
	 * @generated
	 * @ordered
	 */
	protected Reference plannedActivityReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarePlanActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCarePlanActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableReference> getPerformedActivity() {
		if (performedActivity == null) {
			performedActivity = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.CARE_PLAN_ACTIVITY__PERFORMED_ACTIVITY);
		}
		return performedActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getProgress() {
		if (progress == null) {
			progress = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.CARE_PLAN_ACTIVITY__PROGRESS);
		}
		return progress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPlannedActivityReference() {
		return plannedActivityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlannedActivityReference(Reference newPlannedActivityReference, NotificationChain msgs) {
		Reference oldPlannedActivityReference = plannedActivityReference;
		plannedActivityReference = newPlannedActivityReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_ACTIVITY__PLANNED_ACTIVITY_REFERENCE, oldPlannedActivityReference, newPlannedActivityReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlannedActivityReference(Reference newPlannedActivityReference) {
		if (newPlannedActivityReference != plannedActivityReference) {
			NotificationChain msgs = null;
			if (plannedActivityReference != null)
				msgs = ((InternalEObject)plannedActivityReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_ACTIVITY__PLANNED_ACTIVITY_REFERENCE, null, msgs);
			if (newPlannedActivityReference != null)
				msgs = ((InternalEObject)newPlannedActivityReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CARE_PLAN_ACTIVITY__PLANNED_ACTIVITY_REFERENCE, null, msgs);
			msgs = basicSetPlannedActivityReference(newPlannedActivityReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CARE_PLAN_ACTIVITY__PLANNED_ACTIVITY_REFERENCE, newPlannedActivityReference, newPlannedActivityReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CARE_PLAN_ACTIVITY__PERFORMED_ACTIVITY:
				return ((InternalEList<?>)getPerformedActivity()).basicRemove(otherEnd, msgs);
			case FhirPackage.CARE_PLAN_ACTIVITY__PROGRESS:
				return ((InternalEList<?>)getProgress()).basicRemove(otherEnd, msgs);
			case FhirPackage.CARE_PLAN_ACTIVITY__PLANNED_ACTIVITY_REFERENCE:
				return basicSetPlannedActivityReference(null, msgs);
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
			case FhirPackage.CARE_PLAN_ACTIVITY__PERFORMED_ACTIVITY:
				return getPerformedActivity();
			case FhirPackage.CARE_PLAN_ACTIVITY__PROGRESS:
				return getProgress();
			case FhirPackage.CARE_PLAN_ACTIVITY__PLANNED_ACTIVITY_REFERENCE:
				return getPlannedActivityReference();
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
			case FhirPackage.CARE_PLAN_ACTIVITY__PERFORMED_ACTIVITY:
				getPerformedActivity().clear();
				getPerformedActivity().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.CARE_PLAN_ACTIVITY__PROGRESS:
				getProgress().clear();
				getProgress().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.CARE_PLAN_ACTIVITY__PLANNED_ACTIVITY_REFERENCE:
				setPlannedActivityReference((Reference)newValue);
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
			case FhirPackage.CARE_PLAN_ACTIVITY__PERFORMED_ACTIVITY:
				getPerformedActivity().clear();
				return;
			case FhirPackage.CARE_PLAN_ACTIVITY__PROGRESS:
				getProgress().clear();
				return;
			case FhirPackage.CARE_PLAN_ACTIVITY__PLANNED_ACTIVITY_REFERENCE:
				setPlannedActivityReference((Reference)null);
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
			case FhirPackage.CARE_PLAN_ACTIVITY__PERFORMED_ACTIVITY:
				return performedActivity != null && !performedActivity.isEmpty();
			case FhirPackage.CARE_PLAN_ACTIVITY__PROGRESS:
				return progress != null && !progress.isEmpty();
			case FhirPackage.CARE_PLAN_ACTIVITY__PLANNED_ACTIVITY_REFERENCE:
				return plannedActivityReference != null;
		}
		return super.eIsSet(featureID);
	}

} //CarePlanActivityImpl
