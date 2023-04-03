/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CitationVersion;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Citation Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CitationVersionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationVersionImpl#getBaseCitation <em>Base Citation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CitationVersionImpl extends BackboneElementImpl implements CitationVersion {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String value;

	/**
	 * The cached value of the '{@link #getBaseCitation() <em>Base Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseCitation()
	 * @generated
	 * @ordered
	 */
	protected Reference baseCitation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitationVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCitationVersion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(org.hl7.fhir.String newValue, NotificationChain msgs) {
		org.hl7.fhir.String oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_VERSION__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(org.hl7.fhir.String newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_VERSION__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_VERSION__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_VERSION__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getBaseCitation() {
		return baseCitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseCitation(Reference newBaseCitation, NotificationChain msgs) {
		Reference oldBaseCitation = baseCitation;
		baseCitation = newBaseCitation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_VERSION__BASE_CITATION, oldBaseCitation, newBaseCitation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseCitation(Reference newBaseCitation) {
		if (newBaseCitation != baseCitation) {
			NotificationChain msgs = null;
			if (baseCitation != null)
				msgs = ((InternalEObject)baseCitation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_VERSION__BASE_CITATION, null, msgs);
			if (newBaseCitation != null)
				msgs = ((InternalEObject)newBaseCitation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_VERSION__BASE_CITATION, null, msgs);
			msgs = basicSetBaseCitation(newBaseCitation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_VERSION__BASE_CITATION, newBaseCitation, newBaseCitation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CITATION_VERSION__VALUE:
				return basicSetValue(null, msgs);
			case FhirPackage.CITATION_VERSION__BASE_CITATION:
				return basicSetBaseCitation(null, msgs);
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
			case FhirPackage.CITATION_VERSION__VALUE:
				return getValue();
			case FhirPackage.CITATION_VERSION__BASE_CITATION:
				return getBaseCitation();
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
			case FhirPackage.CITATION_VERSION__VALUE:
				setValue((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CITATION_VERSION__BASE_CITATION:
				setBaseCitation((Reference)newValue);
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
			case FhirPackage.CITATION_VERSION__VALUE:
				setValue((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CITATION_VERSION__BASE_CITATION:
				setBaseCitation((Reference)null);
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
			case FhirPackage.CITATION_VERSION__VALUE:
				return value != null;
			case FhirPackage.CITATION_VERSION__BASE_CITATION:
				return baseCitation != null;
		}
		return super.eIsSet(featureID);
	}

} //CitationVersionImpl
