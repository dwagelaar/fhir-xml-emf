/**
 */
package org.hl7.emf.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.emf.fhir.Canonical;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.TestScriptScope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.TestScriptScopeImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TestScriptScopeImpl#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TestScriptScopeImpl#getPhase <em>Phase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestScriptScopeImpl extends BackboneElementImpl implements TestScriptScope {
	/**
	 * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifact()
	 * @generated
	 * @ordered
	 */
	protected Canonical artifact;

	/**
	 * The cached value of the '{@link #getConformance() <em>Conformance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformance()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept conformance;

	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept phase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTestScriptScope();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical getArtifact() {
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifact(Canonical newArtifact, NotificationChain msgs) {
		Canonical oldArtifact = artifact;
		artifact = newArtifact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_SCOPE__ARTIFACT, oldArtifact, newArtifact);
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
	public void setArtifact(Canonical newArtifact) {
		if (newArtifact != artifact) {
			NotificationChain msgs = null;
			if (artifact != null)
				msgs = ((InternalEObject)artifact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_SCOPE__ARTIFACT, null, msgs);
			if (newArtifact != null)
				msgs = ((InternalEObject)newArtifact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_SCOPE__ARTIFACT, null, msgs);
			msgs = basicSetArtifact(newArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_SCOPE__ARTIFACT, newArtifact, newArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getConformance() {
		return conformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConformance(CodeableConcept newConformance, NotificationChain msgs) {
		CodeableConcept oldConformance = conformance;
		conformance = newConformance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_SCOPE__CONFORMANCE, oldConformance, newConformance);
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
	public void setConformance(CodeableConcept newConformance) {
		if (newConformance != conformance) {
			NotificationChain msgs = null;
			if (conformance != null)
				msgs = ((InternalEObject)conformance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_SCOPE__CONFORMANCE, null, msgs);
			if (newConformance != null)
				msgs = ((InternalEObject)newConformance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_SCOPE__CONFORMANCE, null, msgs);
			msgs = basicSetConformance(newConformance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_SCOPE__CONFORMANCE, newConformance, newConformance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhase(CodeableConcept newPhase, NotificationChain msgs) {
		CodeableConcept oldPhase = phase;
		phase = newPhase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_SCOPE__PHASE, oldPhase, newPhase);
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
	public void setPhase(CodeableConcept newPhase) {
		if (newPhase != phase) {
			NotificationChain msgs = null;
			if (phase != null)
				msgs = ((InternalEObject)phase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_SCOPE__PHASE, null, msgs);
			if (newPhase != null)
				msgs = ((InternalEObject)newPhase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_SCOPE__PHASE, null, msgs);
			msgs = basicSetPhase(newPhase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_SCOPE__PHASE, newPhase, newPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TEST_SCRIPT_SCOPE__ARTIFACT:
				return basicSetArtifact(null, msgs);
			case FhirPackage.TEST_SCRIPT_SCOPE__CONFORMANCE:
				return basicSetConformance(null, msgs);
			case FhirPackage.TEST_SCRIPT_SCOPE__PHASE:
				return basicSetPhase(null, msgs);
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
			case FhirPackage.TEST_SCRIPT_SCOPE__ARTIFACT:
				return getArtifact();
			case FhirPackage.TEST_SCRIPT_SCOPE__CONFORMANCE:
				return getConformance();
			case FhirPackage.TEST_SCRIPT_SCOPE__PHASE:
				return getPhase();
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
			case FhirPackage.TEST_SCRIPT_SCOPE__ARTIFACT:
				setArtifact((Canonical)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_SCOPE__CONFORMANCE:
				setConformance((CodeableConcept)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_SCOPE__PHASE:
				setPhase((CodeableConcept)newValue);
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
			case FhirPackage.TEST_SCRIPT_SCOPE__ARTIFACT:
				setArtifact((Canonical)null);
				return;
			case FhirPackage.TEST_SCRIPT_SCOPE__CONFORMANCE:
				setConformance((CodeableConcept)null);
				return;
			case FhirPackage.TEST_SCRIPT_SCOPE__PHASE:
				setPhase((CodeableConcept)null);
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
			case FhirPackage.TEST_SCRIPT_SCOPE__ARTIFACT:
				return artifact != null;
			case FhirPackage.TEST_SCRIPT_SCOPE__CONFORMANCE:
				return conformance != null;
			case FhirPackage.TEST_SCRIPT_SCOPE__PHASE:
				return phase != null;
		}
		return super.eIsSet(featureID);
	}

} //TestScriptScopeImpl
