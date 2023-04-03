/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Canonical;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.TestScriptRequirement;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TestScriptRequirementImpl#getLinkUri <em>Link Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptRequirementImpl#getLinkCanonical <em>Link Canonical</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestScriptRequirementImpl extends BackboneElementImpl implements TestScriptRequirement {
	/**
	 * The cached value of the '{@link #getLinkUri() <em>Link Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkUri()
	 * @generated
	 * @ordered
	 */
	protected Uri linkUri;

	/**
	 * The cached value of the '{@link #getLinkCanonical() <em>Link Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkCanonical()
	 * @generated
	 * @ordered
	 */
	protected Canonical linkCanonical;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTestScriptRequirement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getLinkUri() {
		return linkUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkUri(Uri newLinkUri, NotificationChain msgs) {
		Uri oldLinkUri = linkUri;
		linkUri = newLinkUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_REQUIREMENT__LINK_URI, oldLinkUri, newLinkUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkUri(Uri newLinkUri) {
		if (newLinkUri != linkUri) {
			NotificationChain msgs = null;
			if (linkUri != null)
				msgs = ((InternalEObject)linkUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_REQUIREMENT__LINK_URI, null, msgs);
			if (newLinkUri != null)
				msgs = ((InternalEObject)newLinkUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_REQUIREMENT__LINK_URI, null, msgs);
			msgs = basicSetLinkUri(newLinkUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_REQUIREMENT__LINK_URI, newLinkUri, newLinkUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canonical getLinkCanonical() {
		return linkCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkCanonical(Canonical newLinkCanonical, NotificationChain msgs) {
		Canonical oldLinkCanonical = linkCanonical;
		linkCanonical = newLinkCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_REQUIREMENT__LINK_CANONICAL, oldLinkCanonical, newLinkCanonical);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkCanonical(Canonical newLinkCanonical) {
		if (newLinkCanonical != linkCanonical) {
			NotificationChain msgs = null;
			if (linkCanonical != null)
				msgs = ((InternalEObject)linkCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_REQUIREMENT__LINK_CANONICAL, null, msgs);
			if (newLinkCanonical != null)
				msgs = ((InternalEObject)newLinkCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_REQUIREMENT__LINK_CANONICAL, null, msgs);
			msgs = basicSetLinkCanonical(newLinkCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_REQUIREMENT__LINK_CANONICAL, newLinkCanonical, newLinkCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TEST_SCRIPT_REQUIREMENT__LINK_URI:
				return basicSetLinkUri(null, msgs);
			case FhirPackage.TEST_SCRIPT_REQUIREMENT__LINK_CANONICAL:
				return basicSetLinkCanonical(null, msgs);
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
			case FhirPackage.TEST_SCRIPT_REQUIREMENT__LINK_URI:
				return getLinkUri();
			case FhirPackage.TEST_SCRIPT_REQUIREMENT__LINK_CANONICAL:
				return getLinkCanonical();
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
			case FhirPackage.TEST_SCRIPT_REQUIREMENT__LINK_URI:
				setLinkUri((Uri)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_REQUIREMENT__LINK_CANONICAL:
				setLinkCanonical((Canonical)newValue);
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
			case FhirPackage.TEST_SCRIPT_REQUIREMENT__LINK_URI:
				setLinkUri((Uri)null);
				return;
			case FhirPackage.TEST_SCRIPT_REQUIREMENT__LINK_CANONICAL:
				setLinkCanonical((Canonical)null);
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
			case FhirPackage.TEST_SCRIPT_REQUIREMENT__LINK_URI:
				return linkUri != null;
			case FhirPackage.TEST_SCRIPT_REQUIREMENT__LINK_CANONICAL:
				return linkCanonical != null;
		}
		return super.eIsSet(featureID);
	}

} //TestScriptRequirementImpl
