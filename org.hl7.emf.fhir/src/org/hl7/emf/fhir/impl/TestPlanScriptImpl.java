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
import org.hl7.emf.fhir.Reference;
import org.hl7.emf.fhir.TestPlanScript;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Plan Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.TestPlanScriptImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TestPlanScriptImpl#getSourceString <em>Source String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TestPlanScriptImpl#getSourceReference <em>Source Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestPlanScriptImpl extends BackboneElementImpl implements TestPlanScript {
	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept language;

	/**
	 * The cached value of the '{@link #getSourceString() <em>Source String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String sourceString;

	/**
	 * The cached value of the '{@link #getSourceReference() <em>Source Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceReference()
	 * @generated
	 * @ordered
	 */
	protected Reference sourceReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestPlanScriptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTestPlanScript();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(CodeableConcept newLanguage, NotificationChain msgs) {
		CodeableConcept oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_PLAN_SCRIPT__LANGUAGE, oldLanguage, newLanguage);
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
	public void setLanguage(CodeableConcept newLanguage) {
		if (newLanguage != language) {
			NotificationChain msgs = null;
			if (language != null)
				msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_PLAN_SCRIPT__LANGUAGE, null, msgs);
			if (newLanguage != null)
				msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_PLAN_SCRIPT__LANGUAGE, null, msgs);
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_PLAN_SCRIPT__LANGUAGE, newLanguage, newLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getSourceString() {
		return sourceString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceString(org.hl7.emf.fhir.String newSourceString, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldSourceString = sourceString;
		sourceString = newSourceString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_PLAN_SCRIPT__SOURCE_STRING, oldSourceString, newSourceString);
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
	public void setSourceString(org.hl7.emf.fhir.String newSourceString) {
		if (newSourceString != sourceString) {
			NotificationChain msgs = null;
			if (sourceString != null)
				msgs = ((InternalEObject)sourceString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_PLAN_SCRIPT__SOURCE_STRING, null, msgs);
			if (newSourceString != null)
				msgs = ((InternalEObject)newSourceString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_PLAN_SCRIPT__SOURCE_STRING, null, msgs);
			msgs = basicSetSourceString(newSourceString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_PLAN_SCRIPT__SOURCE_STRING, newSourceString, newSourceString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSourceReference() {
		return sourceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceReference(Reference newSourceReference, NotificationChain msgs) {
		Reference oldSourceReference = sourceReference;
		sourceReference = newSourceReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_PLAN_SCRIPT__SOURCE_REFERENCE, oldSourceReference, newSourceReference);
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
	public void setSourceReference(Reference newSourceReference) {
		if (newSourceReference != sourceReference) {
			NotificationChain msgs = null;
			if (sourceReference != null)
				msgs = ((InternalEObject)sourceReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_PLAN_SCRIPT__SOURCE_REFERENCE, null, msgs);
			if (newSourceReference != null)
				msgs = ((InternalEObject)newSourceReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_PLAN_SCRIPT__SOURCE_REFERENCE, null, msgs);
			msgs = basicSetSourceReference(newSourceReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_PLAN_SCRIPT__SOURCE_REFERENCE, newSourceReference, newSourceReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TEST_PLAN_SCRIPT__LANGUAGE:
				return basicSetLanguage(null, msgs);
			case FhirPackage.TEST_PLAN_SCRIPT__SOURCE_STRING:
				return basicSetSourceString(null, msgs);
			case FhirPackage.TEST_PLAN_SCRIPT__SOURCE_REFERENCE:
				return basicSetSourceReference(null, msgs);
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
			case FhirPackage.TEST_PLAN_SCRIPT__LANGUAGE:
				return getLanguage();
			case FhirPackage.TEST_PLAN_SCRIPT__SOURCE_STRING:
				return getSourceString();
			case FhirPackage.TEST_PLAN_SCRIPT__SOURCE_REFERENCE:
				return getSourceReference();
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
			case FhirPackage.TEST_PLAN_SCRIPT__LANGUAGE:
				setLanguage((CodeableConcept)newValue);
				return;
			case FhirPackage.TEST_PLAN_SCRIPT__SOURCE_STRING:
				setSourceString((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.TEST_PLAN_SCRIPT__SOURCE_REFERENCE:
				setSourceReference((Reference)newValue);
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
			case FhirPackage.TEST_PLAN_SCRIPT__LANGUAGE:
				setLanguage((CodeableConcept)null);
				return;
			case FhirPackage.TEST_PLAN_SCRIPT__SOURCE_STRING:
				setSourceString((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.TEST_PLAN_SCRIPT__SOURCE_REFERENCE:
				setSourceReference((Reference)null);
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
			case FhirPackage.TEST_PLAN_SCRIPT__LANGUAGE:
				return language != null;
			case FhirPackage.TEST_PLAN_SCRIPT__SOURCE_STRING:
				return sourceString != null;
			case FhirPackage.TEST_PLAN_SCRIPT__SOURCE_REFERENCE:
				return sourceReference != null;
		}
		return super.eIsSet(featureID);
	}

} //TestPlanScriptImpl
