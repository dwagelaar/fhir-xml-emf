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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.PermissionJustification;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permission Justification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PermissionJustificationImpl#getBasis <em>Basis</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PermissionJustificationImpl#getEvidence <em>Evidence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PermissionJustificationImpl extends BackboneElementImpl implements PermissionJustification {
	/**
	 * The cached value of the '{@link #getBasis() <em>Basis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasis()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> basis;

	/**
	 * The cached value of the '{@link #getEvidence() <em>Evidence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidence()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> evidence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionJustificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getPermissionJustification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getBasis() {
		if (basis == null) {
			basis = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PERMISSION_JUSTIFICATION__BASIS);
		}
		return basis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getEvidence() {
		if (evidence == null) {
			evidence = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PERMISSION_JUSTIFICATION__EVIDENCE);
		}
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PERMISSION_JUSTIFICATION__BASIS:
				return ((InternalEList<?>)getBasis()).basicRemove(otherEnd, msgs);
			case FhirPackage.PERMISSION_JUSTIFICATION__EVIDENCE:
				return ((InternalEList<?>)getEvidence()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.PERMISSION_JUSTIFICATION__BASIS:
				return getBasis();
			case FhirPackage.PERMISSION_JUSTIFICATION__EVIDENCE:
				return getEvidence();
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
			case FhirPackage.PERMISSION_JUSTIFICATION__BASIS:
				getBasis().clear();
				getBasis().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PERMISSION_JUSTIFICATION__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.PERMISSION_JUSTIFICATION__BASIS:
				getBasis().clear();
				return;
			case FhirPackage.PERMISSION_JUSTIFICATION__EVIDENCE:
				getEvidence().clear();
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
			case FhirPackage.PERMISSION_JUSTIFICATION__BASIS:
				return basis != null && !basis.isEmpty();
			case FhirPackage.PERMISSION_JUSTIFICATION__EVIDENCE:
				return evidence != null && !evidence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PermissionJustificationImpl
