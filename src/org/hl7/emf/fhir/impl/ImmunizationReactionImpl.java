/**
 */
package org.hl7.emf.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.emf.fhir.CodeableReference;
import org.hl7.emf.fhir.DateTime;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.ImmunizationReaction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Reaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ImmunizationReactionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ImmunizationReactionImpl#getManifestation <em>Manifestation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ImmunizationReactionImpl#getReported <em>Reported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmunizationReactionImpl extends BackboneElementImpl implements ImmunizationReaction {
	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getManifestation() <em>Manifestation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestation()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference manifestation;

	/**
	 * The cached value of the '{@link #getReported() <em>Reported</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReported()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean reported;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationReactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImmunizationReaction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_REACTION__DATE, oldDate, newDate);
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
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_REACTION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_REACTION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_REACTION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getManifestation() {
		return manifestation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManifestation(CodeableReference newManifestation, NotificationChain msgs) {
		CodeableReference oldManifestation = manifestation;
		manifestation = newManifestation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_REACTION__MANIFESTATION, oldManifestation, newManifestation);
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
	public void setManifestation(CodeableReference newManifestation) {
		if (newManifestation != manifestation) {
			NotificationChain msgs = null;
			if (manifestation != null)
				msgs = ((InternalEObject)manifestation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_REACTION__MANIFESTATION, null, msgs);
			if (newManifestation != null)
				msgs = ((InternalEObject)newManifestation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_REACTION__MANIFESTATION, null, msgs);
			msgs = basicSetManifestation(newManifestation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_REACTION__MANIFESTATION, newManifestation, newManifestation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getReported() {
		return reported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReported(org.hl7.emf.fhir.Boolean newReported, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldReported = reported;
		reported = newReported;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_REACTION__REPORTED, oldReported, newReported);
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
	public void setReported(org.hl7.emf.fhir.Boolean newReported) {
		if (newReported != reported) {
			NotificationChain msgs = null;
			if (reported != null)
				msgs = ((InternalEObject)reported).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_REACTION__REPORTED, null, msgs);
			if (newReported != null)
				msgs = ((InternalEObject)newReported).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_REACTION__REPORTED, null, msgs);
			msgs = basicSetReported(newReported, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_REACTION__REPORTED, newReported, newReported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMMUNIZATION_REACTION__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.IMMUNIZATION_REACTION__MANIFESTATION:
				return basicSetManifestation(null, msgs);
			case FhirPackage.IMMUNIZATION_REACTION__REPORTED:
				return basicSetReported(null, msgs);
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
			case FhirPackage.IMMUNIZATION_REACTION__DATE:
				return getDate();
			case FhirPackage.IMMUNIZATION_REACTION__MANIFESTATION:
				return getManifestation();
			case FhirPackage.IMMUNIZATION_REACTION__REPORTED:
				return getReported();
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
			case FhirPackage.IMMUNIZATION_REACTION__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.IMMUNIZATION_REACTION__MANIFESTATION:
				setManifestation((CodeableReference)newValue);
				return;
			case FhirPackage.IMMUNIZATION_REACTION__REPORTED:
				setReported((org.hl7.emf.fhir.Boolean)newValue);
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
			case FhirPackage.IMMUNIZATION_REACTION__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.IMMUNIZATION_REACTION__MANIFESTATION:
				setManifestation((CodeableReference)null);
				return;
			case FhirPackage.IMMUNIZATION_REACTION__REPORTED:
				setReported((org.hl7.emf.fhir.Boolean)null);
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
			case FhirPackage.IMMUNIZATION_REACTION__DATE:
				return date != null;
			case FhirPackage.IMMUNIZATION_REACTION__MANIFESTATION:
				return manifestation != null;
			case FhirPackage.IMMUNIZATION_REACTION__REPORTED:
				return reported != null;
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationReactionImpl
