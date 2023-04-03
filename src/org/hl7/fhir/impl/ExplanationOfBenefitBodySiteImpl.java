/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.ExplanationOfBenefitBodySite;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit Body Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitBodySiteImpl#getSite <em>Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitBodySiteImpl#getSubSite <em>Sub Site</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitBodySiteImpl extends BackboneElementImpl implements ExplanationOfBenefitBodySite {
	/**
	 * The cached value of the '{@link #getSite() <em>Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> site;

	/**
	 * The cached value of the '{@link #getSubSite() <em>Sub Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSite()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> subSite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitBodySiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExplanationOfBenefitBodySite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableReference> getSite() {
		if (site == null) {
			site = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FhirPackage.EXPLANATION_OF_BENEFIT_BODY_SITE__SITE);
		}
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSubSite() {
		if (subSite == null) {
			subSite = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.EXPLANATION_OF_BENEFIT_BODY_SITE__SUB_SITE);
		}
		return subSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXPLANATION_OF_BENEFIT_BODY_SITE__SITE:
				return ((InternalEList<?>)getSite()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_BODY_SITE__SUB_SITE:
				return ((InternalEList<?>)getSubSite()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_BODY_SITE__SITE:
				return getSite();
			case FhirPackage.EXPLANATION_OF_BENEFIT_BODY_SITE__SUB_SITE:
				return getSubSite();
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_BODY_SITE__SITE:
				getSite().clear();
				getSite().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_BODY_SITE__SUB_SITE:
				getSubSite().clear();
				getSubSite().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_BODY_SITE__SITE:
				getSite().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_BODY_SITE__SUB_SITE:
				getSubSite().clear();
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_BODY_SITE__SITE:
				return site != null && !site.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT_BODY_SITE__SUB_SITE:
				return subSite != null && !subSite.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitBodySiteImpl
