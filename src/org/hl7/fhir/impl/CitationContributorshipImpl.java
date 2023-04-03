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

import org.hl7.fhir.CitationContributorship;
import org.hl7.fhir.CitationEntry;
import org.hl7.fhir.CitationSummary1;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Citation Contributorship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CitationContributorshipImpl#getComplete <em>Complete</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationContributorshipImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CitationContributorshipImpl#getSummary <em>Summary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CitationContributorshipImpl extends BackboneElementImpl implements CitationContributorship {
	/**
	 * The cached value of the '{@link #getComplete() <em>Complete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplete()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean complete;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<CitationEntry> entry;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected EList<CitationSummary1> summary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitationContributorshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCitationContributorship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getComplete() {
		return complete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplete(org.hl7.fhir.Boolean newComplete, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldComplete = complete;
		complete = newComplete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_CONTRIBUTORSHIP__COMPLETE, oldComplete, newComplete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplete(org.hl7.fhir.Boolean newComplete) {
		if (newComplete != complete) {
			NotificationChain msgs = null;
			if (complete != null)
				msgs = ((InternalEObject)complete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_CONTRIBUTORSHIP__COMPLETE, null, msgs);
			if (newComplete != null)
				msgs = ((InternalEObject)newComplete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CITATION_CONTRIBUTORSHIP__COMPLETE, null, msgs);
			msgs = basicSetComplete(newComplete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CITATION_CONTRIBUTORSHIP__COMPLETE, newComplete, newComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CitationEntry> getEntry() {
		if (entry == null) {
			entry = new EObjectContainmentEList<CitationEntry>(CitationEntry.class, this, FhirPackage.CITATION_CONTRIBUTORSHIP__ENTRY);
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CitationSummary1> getSummary() {
		if (summary == null) {
			summary = new EObjectContainmentEList<CitationSummary1>(CitationSummary1.class, this, FhirPackage.CITATION_CONTRIBUTORSHIP__SUMMARY);
		}
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CITATION_CONTRIBUTORSHIP__COMPLETE:
				return basicSetComplete(null, msgs);
			case FhirPackage.CITATION_CONTRIBUTORSHIP__ENTRY:
				return ((InternalEList<?>)getEntry()).basicRemove(otherEnd, msgs);
			case FhirPackage.CITATION_CONTRIBUTORSHIP__SUMMARY:
				return ((InternalEList<?>)getSummary()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CITATION_CONTRIBUTORSHIP__COMPLETE:
				return getComplete();
			case FhirPackage.CITATION_CONTRIBUTORSHIP__ENTRY:
				return getEntry();
			case FhirPackage.CITATION_CONTRIBUTORSHIP__SUMMARY:
				return getSummary();
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
			case FhirPackage.CITATION_CONTRIBUTORSHIP__COMPLETE:
				setComplete((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.CITATION_CONTRIBUTORSHIP__ENTRY:
				getEntry().clear();
				getEntry().addAll((Collection<? extends CitationEntry>)newValue);
				return;
			case FhirPackage.CITATION_CONTRIBUTORSHIP__SUMMARY:
				getSummary().clear();
				getSummary().addAll((Collection<? extends CitationSummary1>)newValue);
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
			case FhirPackage.CITATION_CONTRIBUTORSHIP__COMPLETE:
				setComplete((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.CITATION_CONTRIBUTORSHIP__ENTRY:
				getEntry().clear();
				return;
			case FhirPackage.CITATION_CONTRIBUTORSHIP__SUMMARY:
				getSummary().clear();
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
			case FhirPackage.CITATION_CONTRIBUTORSHIP__COMPLETE:
				return complete != null;
			case FhirPackage.CITATION_CONTRIBUTORSHIP__ENTRY:
				return entry != null && !entry.isEmpty();
			case FhirPackage.CITATION_CONTRIBUTORSHIP__SUMMARY:
				return summary != null && !summary.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CitationContributorshipImpl
