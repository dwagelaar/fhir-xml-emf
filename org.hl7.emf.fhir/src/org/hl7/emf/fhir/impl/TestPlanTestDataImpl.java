/**
 */
package org.hl7.emf.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.emf.fhir.Coding;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Reference;
import org.hl7.emf.fhir.TestPlanTestData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Plan Test Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.TestPlanTestDataImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TestPlanTestDataImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TestPlanTestDataImpl#getSourceString <em>Source String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.TestPlanTestDataImpl#getSourceReference <em>Source Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestPlanTestDataImpl extends BackboneElementImpl implements TestPlanTestData {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected Reference content;

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
	protected TestPlanTestDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTestPlanTestData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Coding newType, NotificationChain msgs) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_PLAN_TEST_DATA__TYPE, oldType, newType);
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
	public void setType(Coding newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_PLAN_TEST_DATA__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_PLAN_TEST_DATA__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_PLAN_TEST_DATA__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(Reference newContent, NotificationChain msgs) {
		Reference oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_PLAN_TEST_DATA__CONTENT, oldContent, newContent);
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
	public void setContent(Reference newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_PLAN_TEST_DATA__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_PLAN_TEST_DATA__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_PLAN_TEST_DATA__CONTENT, newContent, newContent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_PLAN_TEST_DATA__SOURCE_STRING, oldSourceString, newSourceString);
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
				msgs = ((InternalEObject)sourceString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_PLAN_TEST_DATA__SOURCE_STRING, null, msgs);
			if (newSourceString != null)
				msgs = ((InternalEObject)newSourceString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_PLAN_TEST_DATA__SOURCE_STRING, null, msgs);
			msgs = basicSetSourceString(newSourceString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_PLAN_TEST_DATA__SOURCE_STRING, newSourceString, newSourceString));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_PLAN_TEST_DATA__SOURCE_REFERENCE, oldSourceReference, newSourceReference);
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
				msgs = ((InternalEObject)sourceReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_PLAN_TEST_DATA__SOURCE_REFERENCE, null, msgs);
			if (newSourceReference != null)
				msgs = ((InternalEObject)newSourceReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_PLAN_TEST_DATA__SOURCE_REFERENCE, null, msgs);
			msgs = basicSetSourceReference(newSourceReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_PLAN_TEST_DATA__SOURCE_REFERENCE, newSourceReference, newSourceReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TEST_PLAN_TEST_DATA__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.TEST_PLAN_TEST_DATA__CONTENT:
				return basicSetContent(null, msgs);
			case FhirPackage.TEST_PLAN_TEST_DATA__SOURCE_STRING:
				return basicSetSourceString(null, msgs);
			case FhirPackage.TEST_PLAN_TEST_DATA__SOURCE_REFERENCE:
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
			case FhirPackage.TEST_PLAN_TEST_DATA__TYPE:
				return getType();
			case FhirPackage.TEST_PLAN_TEST_DATA__CONTENT:
				return getContent();
			case FhirPackage.TEST_PLAN_TEST_DATA__SOURCE_STRING:
				return getSourceString();
			case FhirPackage.TEST_PLAN_TEST_DATA__SOURCE_REFERENCE:
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
			case FhirPackage.TEST_PLAN_TEST_DATA__TYPE:
				setType((Coding)newValue);
				return;
			case FhirPackage.TEST_PLAN_TEST_DATA__CONTENT:
				setContent((Reference)newValue);
				return;
			case FhirPackage.TEST_PLAN_TEST_DATA__SOURCE_STRING:
				setSourceString((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.TEST_PLAN_TEST_DATA__SOURCE_REFERENCE:
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
			case FhirPackage.TEST_PLAN_TEST_DATA__TYPE:
				setType((Coding)null);
				return;
			case FhirPackage.TEST_PLAN_TEST_DATA__CONTENT:
				setContent((Reference)null);
				return;
			case FhirPackage.TEST_PLAN_TEST_DATA__SOURCE_STRING:
				setSourceString((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.TEST_PLAN_TEST_DATA__SOURCE_REFERENCE:
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
			case FhirPackage.TEST_PLAN_TEST_DATA__TYPE:
				return type != null;
			case FhirPackage.TEST_PLAN_TEST_DATA__CONTENT:
				return content != null;
			case FhirPackage.TEST_PLAN_TEST_DATA__SOURCE_STRING:
				return sourceString != null;
			case FhirPackage.TEST_PLAN_TEST_DATA__SOURCE_REFERENCE:
				return sourceReference != null;
		}
		return super.eIsSet(featureID);
	}

} //TestPlanTestDataImpl
