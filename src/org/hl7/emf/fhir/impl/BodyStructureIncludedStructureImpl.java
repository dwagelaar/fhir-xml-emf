/**
 */
package org.hl7.emf.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.emf.fhir.BodyStructureBodyLandmarkOrientation;
import org.hl7.emf.fhir.BodyStructureIncludedStructure;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Structure Included Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.BodyStructureIncludedStructureImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BodyStructureIncludedStructureImpl#getLaterality <em>Laterality</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BodyStructureIncludedStructureImpl#getBodyLandmarkOrientation <em>Body Landmark Orientation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BodyStructureIncludedStructureImpl#getSpatialReference <em>Spatial Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.BodyStructureIncludedStructureImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodyStructureIncludedStructureImpl extends BackboneElementImpl implements BodyStructureIncludedStructure {
	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept structure;

	/**
	 * The cached value of the '{@link #getLaterality() <em>Laterality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaterality()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept laterality;

	/**
	 * The cached value of the '{@link #getBodyLandmarkOrientation() <em>Body Landmark Orientation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyLandmarkOrientation()
	 * @generated
	 * @ordered
	 */
	protected EList<BodyStructureBodyLandmarkOrientation> bodyLandmarkOrientation;

	/**
	 * The cached value of the '{@link #getSpatialReference() <em>Spatial Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpatialReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> spatialReference;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> qualifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyStructureIncludedStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getBodyStructureIncludedStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructure(CodeableConcept newStructure, NotificationChain msgs) {
		CodeableConcept oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__STRUCTURE, oldStructure, newStructure);
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
	public void setStructure(CodeableConcept newStructure) {
		if (newStructure != structure) {
			NotificationChain msgs = null;
			if (structure != null)
				msgs = ((InternalEObject)structure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__STRUCTURE, null, msgs);
			if (newStructure != null)
				msgs = ((InternalEObject)newStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__STRUCTURE, null, msgs);
			msgs = basicSetStructure(newStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__STRUCTURE, newStructure, newStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getLaterality() {
		return laterality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLaterality(CodeableConcept newLaterality, NotificationChain msgs) {
		CodeableConcept oldLaterality = laterality;
		laterality = newLaterality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__LATERALITY, oldLaterality, newLaterality);
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
	public void setLaterality(CodeableConcept newLaterality) {
		if (newLaterality != laterality) {
			NotificationChain msgs = null;
			if (laterality != null)
				msgs = ((InternalEObject)laterality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__LATERALITY, null, msgs);
			if (newLaterality != null)
				msgs = ((InternalEObject)newLaterality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__LATERALITY, null, msgs);
			msgs = basicSetLaterality(newLaterality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__LATERALITY, newLaterality, newLaterality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BodyStructureBodyLandmarkOrientation> getBodyLandmarkOrientation() {
		if (bodyLandmarkOrientation == null) {
			bodyLandmarkOrientation = new EObjectContainmentEList<BodyStructureBodyLandmarkOrientation>(BodyStructureBodyLandmarkOrientation.class, this, FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__BODY_LANDMARK_ORIENTATION);
		}
		return bodyLandmarkOrientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSpatialReference() {
		if (spatialReference == null) {
			spatialReference = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__SPATIAL_REFERENCE);
		}
		return spatialReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getQualifier() {
		if (qualifier == null) {
			qualifier = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__QUALIFIER);
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__STRUCTURE:
				return basicSetStructure(null, msgs);
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__LATERALITY:
				return basicSetLaterality(null, msgs);
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__BODY_LANDMARK_ORIENTATION:
				return ((InternalEList<?>)getBodyLandmarkOrientation()).basicRemove(otherEnd, msgs);
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__SPATIAL_REFERENCE:
				return ((InternalEList<?>)getSpatialReference()).basicRemove(otherEnd, msgs);
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__QUALIFIER:
				return ((InternalEList<?>)getQualifier()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__STRUCTURE:
				return getStructure();
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__LATERALITY:
				return getLaterality();
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__BODY_LANDMARK_ORIENTATION:
				return getBodyLandmarkOrientation();
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__SPATIAL_REFERENCE:
				return getSpatialReference();
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__QUALIFIER:
				return getQualifier();
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
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__STRUCTURE:
				setStructure((CodeableConcept)newValue);
				return;
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__LATERALITY:
				setLaterality((CodeableConcept)newValue);
				return;
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__BODY_LANDMARK_ORIENTATION:
				getBodyLandmarkOrientation().clear();
				getBodyLandmarkOrientation().addAll((Collection<? extends BodyStructureBodyLandmarkOrientation>)newValue);
				return;
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__SPATIAL_REFERENCE:
				getSpatialReference().clear();
				getSpatialReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__STRUCTURE:
				setStructure((CodeableConcept)null);
				return;
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__LATERALITY:
				setLaterality((CodeableConcept)null);
				return;
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__BODY_LANDMARK_ORIENTATION:
				getBodyLandmarkOrientation().clear();
				return;
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__SPATIAL_REFERENCE:
				getSpatialReference().clear();
				return;
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__QUALIFIER:
				getQualifier().clear();
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
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__STRUCTURE:
				return structure != null;
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__LATERALITY:
				return laterality != null;
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__BODY_LANDMARK_ORIENTATION:
				return bodyLandmarkOrientation != null && !bodyLandmarkOrientation.isEmpty();
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__SPATIAL_REFERENCE:
				return spatialReference != null && !spatialReference.isEmpty();
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BodyStructureIncludedStructureImpl
