/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.TestPlanScript;
import org.hl7.fhir.TestPlanTestRun;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Plan Test Run</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TestPlanTestRunImpl#getNarrative <em>Narrative</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestPlanTestRunImpl#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestPlanTestRunImpl extends BackboneElementImpl implements TestPlanTestRun {
	/**
	 * The cached value of the '{@link #getNarrative() <em>Narrative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNarrative()
	 * @generated
	 * @ordered
	 */
	protected Markdown narrative;

	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected TestPlanScript script;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestPlanTestRunImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTestPlanTestRun();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getNarrative() {
		return narrative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNarrative(Markdown newNarrative, NotificationChain msgs) {
		Markdown oldNarrative = narrative;
		narrative = newNarrative;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_PLAN_TEST_RUN__NARRATIVE, oldNarrative, newNarrative);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNarrative(Markdown newNarrative) {
		if (newNarrative != narrative) {
			NotificationChain msgs = null;
			if (narrative != null)
				msgs = ((InternalEObject)narrative).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_PLAN_TEST_RUN__NARRATIVE, null, msgs);
			if (newNarrative != null)
				msgs = ((InternalEObject)newNarrative).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_PLAN_TEST_RUN__NARRATIVE, null, msgs);
			msgs = basicSetNarrative(newNarrative, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_PLAN_TEST_RUN__NARRATIVE, newNarrative, newNarrative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestPlanScript getScript() {
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScript(TestPlanScript newScript, NotificationChain msgs) {
		TestPlanScript oldScript = script;
		script = newScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_PLAN_TEST_RUN__SCRIPT, oldScript, newScript);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(TestPlanScript newScript) {
		if (newScript != script) {
			NotificationChain msgs = null;
			if (script != null)
				msgs = ((InternalEObject)script).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_PLAN_TEST_RUN__SCRIPT, null, msgs);
			if (newScript != null)
				msgs = ((InternalEObject)newScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_PLAN_TEST_RUN__SCRIPT, null, msgs);
			msgs = basicSetScript(newScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_PLAN_TEST_RUN__SCRIPT, newScript, newScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TEST_PLAN_TEST_RUN__NARRATIVE:
				return basicSetNarrative(null, msgs);
			case FhirPackage.TEST_PLAN_TEST_RUN__SCRIPT:
				return basicSetScript(null, msgs);
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
			case FhirPackage.TEST_PLAN_TEST_RUN__NARRATIVE:
				return getNarrative();
			case FhirPackage.TEST_PLAN_TEST_RUN__SCRIPT:
				return getScript();
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
			case FhirPackage.TEST_PLAN_TEST_RUN__NARRATIVE:
				setNarrative((Markdown)newValue);
				return;
			case FhirPackage.TEST_PLAN_TEST_RUN__SCRIPT:
				setScript((TestPlanScript)newValue);
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
			case FhirPackage.TEST_PLAN_TEST_RUN__NARRATIVE:
				setNarrative((Markdown)null);
				return;
			case FhirPackage.TEST_PLAN_TEST_RUN__SCRIPT:
				setScript((TestPlanScript)null);
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
			case FhirPackage.TEST_PLAN_TEST_RUN__NARRATIVE:
				return narrative != null;
			case FhirPackage.TEST_PLAN_TEST_RUN__SCRIPT:
				return script != null;
		}
		return super.eIsSet(featureID);
	}

} //TestPlanTestRunImpl
