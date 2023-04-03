/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.SubstancePolymerDegreeOfPolymerisation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Polymer Degree Of Polymerisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerDegreeOfPolymerisationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerDegreeOfPolymerisationImpl#getAverage <em>Average</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerDegreeOfPolymerisationImpl#getLow <em>Low</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstancePolymerDegreeOfPolymerisationImpl#getHigh <em>High</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstancePolymerDegreeOfPolymerisationImpl extends BackboneElementImpl implements SubstancePolymerDegreeOfPolymerisation {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getAverage() <em>Average</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverage()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer average;

	/**
	 * The cached value of the '{@link #getLow() <em>Low</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLow()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer low;

	/**
	 * The cached value of the '{@link #getHigh() <em>High</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigh()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer high;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstancePolymerDegreeOfPolymerisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstancePolymerDegreeOfPolymerisation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getAverage() {
		return average;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAverage(org.hl7.fhir.Integer newAverage, NotificationChain msgs) {
		org.hl7.fhir.Integer oldAverage = average;
		average = newAverage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__AVERAGE, oldAverage, newAverage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAverage(org.hl7.fhir.Integer newAverage) {
		if (newAverage != average) {
			NotificationChain msgs = null;
			if (average != null)
				msgs = ((InternalEObject)average).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__AVERAGE, null, msgs);
			if (newAverage != null)
				msgs = ((InternalEObject)newAverage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__AVERAGE, null, msgs);
			msgs = basicSetAverage(newAverage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__AVERAGE, newAverage, newAverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getLow() {
		return low;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLow(org.hl7.fhir.Integer newLow, NotificationChain msgs) {
		org.hl7.fhir.Integer oldLow = low;
		low = newLow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__LOW, oldLow, newLow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLow(org.hl7.fhir.Integer newLow) {
		if (newLow != low) {
			NotificationChain msgs = null;
			if (low != null)
				msgs = ((InternalEObject)low).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__LOW, null, msgs);
			if (newLow != null)
				msgs = ((InternalEObject)newLow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__LOW, null, msgs);
			msgs = basicSetLow(newLow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__LOW, newLow, newLow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getHigh() {
		return high;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHigh(org.hl7.fhir.Integer newHigh, NotificationChain msgs) {
		org.hl7.fhir.Integer oldHigh = high;
		high = newHigh;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__HIGH, oldHigh, newHigh);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHigh(org.hl7.fhir.Integer newHigh) {
		if (newHigh != high) {
			NotificationChain msgs = null;
			if (high != null)
				msgs = ((InternalEObject)high).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__HIGH, null, msgs);
			if (newHigh != null)
				msgs = ((InternalEObject)newHigh).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__HIGH, null, msgs);
			msgs = basicSetHigh(newHigh, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__HIGH, newHigh, newHigh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__AVERAGE:
				return basicSetAverage(null, msgs);
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__LOW:
				return basicSetLow(null, msgs);
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__HIGH:
				return basicSetHigh(null, msgs);
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
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__TYPE:
				return getType();
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__AVERAGE:
				return getAverage();
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__LOW:
				return getLow();
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__HIGH:
				return getHigh();
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
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__AVERAGE:
				setAverage((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__LOW:
				setLow((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__HIGH:
				setHigh((org.hl7.fhir.Integer)newValue);
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
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__AVERAGE:
				setAverage((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__LOW:
				setLow((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__HIGH:
				setHigh((org.hl7.fhir.Integer)null);
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
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__TYPE:
				return type != null;
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__AVERAGE:
				return average != null;
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__LOW:
				return low != null;
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION__HIGH:
				return high != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstancePolymerDegreeOfPolymerisationImpl
