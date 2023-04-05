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

import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.SubstancePolymerDegreeOfPolymerisation;
import org.hl7.emf.fhir.SubstancePolymerRepeatUnit;
import org.hl7.emf.fhir.SubstancePolymerStructuralRepresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Polymer Repeat Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.SubstancePolymerRepeatUnitImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubstancePolymerRepeatUnitImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubstancePolymerRepeatUnitImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubstancePolymerRepeatUnitImpl#getDegreeOfPolymerisation <em>Degree Of Polymerisation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.SubstancePolymerRepeatUnitImpl#getStructuralRepresentation <em>Structural Representation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstancePolymerRepeatUnitImpl extends BackboneElementImpl implements SubstancePolymerRepeatUnit {
	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String unit;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept orientation;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Integer amount;

	/**
	 * The cached value of the '{@link #getDegreeOfPolymerisation() <em>Degree Of Polymerisation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreeOfPolymerisation()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstancePolymerDegreeOfPolymerisation> degreeOfPolymerisation;

	/**
	 * The cached value of the '{@link #getStructuralRepresentation() <em>Structural Representation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstancePolymerStructuralRepresentation> structuralRepresentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstancePolymerRepeatUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstancePolymerRepeatUnit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(org.hl7.emf.fhir.String newUnit, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__UNIT, oldUnit, newUnit);
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
	public void setUnit(org.hl7.emf.fhir.String newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientation(CodeableConcept newOrientation, NotificationChain msgs) {
		CodeableConcept oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__ORIENTATION, oldOrientation, newOrientation);
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
	public void setOrientation(CodeableConcept newOrientation) {
		if (newOrientation != orientation) {
			NotificationChain msgs = null;
			if (orientation != null)
				msgs = ((InternalEObject)orientation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__ORIENTATION, null, msgs);
			if (newOrientation != null)
				msgs = ((InternalEObject)newOrientation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__ORIENTATION, null, msgs);
			msgs = basicSetOrientation(newOrientation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__ORIENTATION, newOrientation, newOrientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Integer getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmount(org.hl7.emf.fhir.Integer newAmount, NotificationChain msgs) {
		org.hl7.emf.fhir.Integer oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__AMOUNT, oldAmount, newAmount);
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
	public void setAmount(org.hl7.emf.fhir.Integer newAmount) {
		if (newAmount != amount) {
			NotificationChain msgs = null;
			if (amount != null)
				msgs = ((InternalEObject)amount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__AMOUNT, null, msgs);
			if (newAmount != null)
				msgs = ((InternalEObject)newAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__AMOUNT, null, msgs);
			msgs = basicSetAmount(newAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__AMOUNT, newAmount, newAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstancePolymerDegreeOfPolymerisation> getDegreeOfPolymerisation() {
		if (degreeOfPolymerisation == null) {
			degreeOfPolymerisation = new EObjectContainmentEList<SubstancePolymerDegreeOfPolymerisation>(SubstancePolymerDegreeOfPolymerisation.class, this, FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__DEGREE_OF_POLYMERISATION);
		}
		return degreeOfPolymerisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstancePolymerStructuralRepresentation> getStructuralRepresentation() {
		if (structuralRepresentation == null) {
			structuralRepresentation = new EObjectContainmentEList<SubstancePolymerStructuralRepresentation>(SubstancePolymerStructuralRepresentation.class, this, FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__STRUCTURAL_REPRESENTATION);
		}
		return structuralRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__UNIT:
				return basicSetUnit(null, msgs);
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__ORIENTATION:
				return basicSetOrientation(null, msgs);
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__AMOUNT:
				return basicSetAmount(null, msgs);
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__DEGREE_OF_POLYMERISATION:
				return ((InternalEList<?>)getDegreeOfPolymerisation()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__STRUCTURAL_REPRESENTATION:
				return ((InternalEList<?>)getStructuralRepresentation()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__UNIT:
				return getUnit();
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__ORIENTATION:
				return getOrientation();
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__AMOUNT:
				return getAmount();
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__DEGREE_OF_POLYMERISATION:
				return getDegreeOfPolymerisation();
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__STRUCTURAL_REPRESENTATION:
				return getStructuralRepresentation();
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
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__UNIT:
				setUnit((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__ORIENTATION:
				setOrientation((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__AMOUNT:
				setAmount((org.hl7.emf.fhir.Integer)newValue);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__DEGREE_OF_POLYMERISATION:
				getDegreeOfPolymerisation().clear();
				getDegreeOfPolymerisation().addAll((Collection<? extends SubstancePolymerDegreeOfPolymerisation>)newValue);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__STRUCTURAL_REPRESENTATION:
				getStructuralRepresentation().clear();
				getStructuralRepresentation().addAll((Collection<? extends SubstancePolymerStructuralRepresentation>)newValue);
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
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__UNIT:
				setUnit((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__ORIENTATION:
				setOrientation((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__AMOUNT:
				setAmount((org.hl7.emf.fhir.Integer)null);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__DEGREE_OF_POLYMERISATION:
				getDegreeOfPolymerisation().clear();
				return;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__STRUCTURAL_REPRESENTATION:
				getStructuralRepresentation().clear();
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
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__UNIT:
				return unit != null;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__ORIENTATION:
				return orientation != null;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__AMOUNT:
				return amount != null;
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__DEGREE_OF_POLYMERISATION:
				return degreeOfPolymerisation != null && !degreeOfPolymerisation.isEmpty();
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT__STRUCTURAL_REPRESENTATION:
				return structuralRepresentation != null && !structuralRepresentation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstancePolymerRepeatUnitImpl
