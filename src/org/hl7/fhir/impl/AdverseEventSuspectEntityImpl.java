/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.AdverseEventCausality;
import org.hl7.fhir.AdverseEventSuspectEntity;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adverse Event Suspect Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventSuspectEntityImpl#getInstanceCodeableConcept <em>Instance Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventSuspectEntityImpl#getInstanceReference <em>Instance Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventSuspectEntityImpl#getCausality <em>Causality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdverseEventSuspectEntityImpl extends BackboneElementImpl implements AdverseEventSuspectEntity {
	/**
	 * The cached value of the '{@link #getInstanceCodeableConcept() <em>Instance Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept instanceCodeableConcept;

	/**
	 * The cached value of the '{@link #getInstanceReference() <em>Instance Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceReference()
	 * @generated
	 * @ordered
	 */
	protected Reference instanceReference;

	/**
	 * The cached value of the '{@link #getCausality() <em>Causality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausality()
	 * @generated
	 * @ordered
	 */
	protected AdverseEventCausality causality;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdverseEventSuspectEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAdverseEventSuspectEntity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getInstanceCodeableConcept() {
		return instanceCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstanceCodeableConcept(CodeableConcept newInstanceCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldInstanceCodeableConcept = instanceCodeableConcept;
		instanceCodeableConcept = newInstanceCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE_CODEABLE_CONCEPT, oldInstanceCodeableConcept, newInstanceCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceCodeableConcept(CodeableConcept newInstanceCodeableConcept) {
		if (newInstanceCodeableConcept != instanceCodeableConcept) {
			NotificationChain msgs = null;
			if (instanceCodeableConcept != null)
				msgs = ((InternalEObject)instanceCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE_CODEABLE_CONCEPT, null, msgs);
			if (newInstanceCodeableConcept != null)
				msgs = ((InternalEObject)newInstanceCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetInstanceCodeableConcept(newInstanceCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE_CODEABLE_CONCEPT, newInstanceCodeableConcept, newInstanceCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getInstanceReference() {
		return instanceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstanceReference(Reference newInstanceReference, NotificationChain msgs) {
		Reference oldInstanceReference = instanceReference;
		instanceReference = newInstanceReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE_REFERENCE, oldInstanceReference, newInstanceReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceReference(Reference newInstanceReference) {
		if (newInstanceReference != instanceReference) {
			NotificationChain msgs = null;
			if (instanceReference != null)
				msgs = ((InternalEObject)instanceReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE_REFERENCE, null, msgs);
			if (newInstanceReference != null)
				msgs = ((InternalEObject)newInstanceReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE_REFERENCE, null, msgs);
			msgs = basicSetInstanceReference(newInstanceReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE_REFERENCE, newInstanceReference, newInstanceReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventCausality getCausality() {
		return causality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCausality(AdverseEventCausality newCausality, NotificationChain msgs) {
		AdverseEventCausality oldCausality = causality;
		causality = newCausality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY, oldCausality, newCausality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCausality(AdverseEventCausality newCausality) {
		if (newCausality != causality) {
			NotificationChain msgs = null;
			if (causality != null)
				msgs = ((InternalEObject)causality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY, null, msgs);
			if (newCausality != null)
				msgs = ((InternalEObject)newCausality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY, null, msgs);
			msgs = basicSetCausality(newCausality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY, newCausality, newCausality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE_CODEABLE_CONCEPT:
				return basicSetInstanceCodeableConcept(null, msgs);
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE_REFERENCE:
				return basicSetInstanceReference(null, msgs);
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY:
				return basicSetCausality(null, msgs);
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
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE_CODEABLE_CONCEPT:
				return getInstanceCodeableConcept();
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE_REFERENCE:
				return getInstanceReference();
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY:
				return getCausality();
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
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE_CODEABLE_CONCEPT:
				setInstanceCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE_REFERENCE:
				setInstanceReference((Reference)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY:
				setCausality((AdverseEventCausality)newValue);
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
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE_CODEABLE_CONCEPT:
				setInstanceCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE_REFERENCE:
				setInstanceReference((Reference)null);
				return;
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY:
				setCausality((AdverseEventCausality)null);
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
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE_CODEABLE_CONCEPT:
				return instanceCodeableConcept != null;
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE_REFERENCE:
				return instanceReference != null;
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY:
				return causality != null;
		}
		return super.eIsSet(featureID);
	}

} //AdverseEventSuspectEntityImpl
