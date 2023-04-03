/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MolecularSequenceEdit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Molecular Sequence Edit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceEditImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceEditImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceEditImpl#getReplacementSequence <em>Replacement Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceEditImpl#getReplacedSequence <em>Replaced Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MolecularSequenceEditImpl extends BackboneElementImpl implements MolecularSequenceEdit {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer end;

	/**
	 * The cached value of the '{@link #getReplacementSequence() <em>Replacement Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacementSequence()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String replacementSequence;

	/**
	 * The cached value of the '{@link #getReplacedSequence() <em>Replaced Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacedSequence()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String replacedSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MolecularSequenceEditImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMolecularSequenceEdit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(org.hl7.fhir.Integer newStart, NotificationChain msgs) {
		org.hl7.fhir.Integer oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_EDIT__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(org.hl7.fhir.Integer newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_EDIT__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_EDIT__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_EDIT__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(org.hl7.fhir.Integer newEnd, NotificationChain msgs) {
		org.hl7.fhir.Integer oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_EDIT__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(org.hl7.fhir.Integer newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_EDIT__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_EDIT__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_EDIT__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getReplacementSequence() {
		return replacementSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplacementSequence(org.hl7.fhir.String newReplacementSequence, NotificationChain msgs) {
		org.hl7.fhir.String oldReplacementSequence = replacementSequence;
		replacementSequence = newReplacementSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_EDIT__REPLACEMENT_SEQUENCE, oldReplacementSequence, newReplacementSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplacementSequence(org.hl7.fhir.String newReplacementSequence) {
		if (newReplacementSequence != replacementSequence) {
			NotificationChain msgs = null;
			if (replacementSequence != null)
				msgs = ((InternalEObject)replacementSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_EDIT__REPLACEMENT_SEQUENCE, null, msgs);
			if (newReplacementSequence != null)
				msgs = ((InternalEObject)newReplacementSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_EDIT__REPLACEMENT_SEQUENCE, null, msgs);
			msgs = basicSetReplacementSequence(newReplacementSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_EDIT__REPLACEMENT_SEQUENCE, newReplacementSequence, newReplacementSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getReplacedSequence() {
		return replacedSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplacedSequence(org.hl7.fhir.String newReplacedSequence, NotificationChain msgs) {
		org.hl7.fhir.String oldReplacedSequence = replacedSequence;
		replacedSequence = newReplacedSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_EDIT__REPLACED_SEQUENCE, oldReplacedSequence, newReplacedSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplacedSequence(org.hl7.fhir.String newReplacedSequence) {
		if (newReplacedSequence != replacedSequence) {
			NotificationChain msgs = null;
			if (replacedSequence != null)
				msgs = ((InternalEObject)replacedSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_EDIT__REPLACED_SEQUENCE, null, msgs);
			if (newReplacedSequence != null)
				msgs = ((InternalEObject)newReplacedSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_EDIT__REPLACED_SEQUENCE, null, msgs);
			msgs = basicSetReplacedSequence(newReplacedSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_EDIT__REPLACED_SEQUENCE, newReplacedSequence, newReplacedSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MOLECULAR_SEQUENCE_EDIT__START:
				return basicSetStart(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_EDIT__END:
				return basicSetEnd(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_EDIT__REPLACEMENT_SEQUENCE:
				return basicSetReplacementSequence(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_EDIT__REPLACED_SEQUENCE:
				return basicSetReplacedSequence(null, msgs);
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
			case FhirPackage.MOLECULAR_SEQUENCE_EDIT__START:
				return getStart();
			case FhirPackage.MOLECULAR_SEQUENCE_EDIT__END:
				return getEnd();
			case FhirPackage.MOLECULAR_SEQUENCE_EDIT__REPLACEMENT_SEQUENCE:
				return getReplacementSequence();
			case FhirPackage.MOLECULAR_SEQUENCE_EDIT__REPLACED_SEQUENCE:
				return getReplacedSequence();
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
			case FhirPackage.MOLECULAR_SEQUENCE_EDIT__START:
				setStart((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_EDIT__END:
				setEnd((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_EDIT__REPLACEMENT_SEQUENCE:
				setReplacementSequence((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_EDIT__REPLACED_SEQUENCE:
				setReplacedSequence((org.hl7.fhir.String)newValue);
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
			case FhirPackage.MOLECULAR_SEQUENCE_EDIT__START:
				setStart((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_EDIT__END:
				setEnd((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_EDIT__REPLACEMENT_SEQUENCE:
				setReplacementSequence((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_EDIT__REPLACED_SEQUENCE:
				setReplacedSequence((org.hl7.fhir.String)null);
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
			case FhirPackage.MOLECULAR_SEQUENCE_EDIT__START:
				return start != null;
			case FhirPackage.MOLECULAR_SEQUENCE_EDIT__END:
				return end != null;
			case FhirPackage.MOLECULAR_SEQUENCE_EDIT__REPLACEMENT_SEQUENCE:
				return replacementSequence != null;
			case FhirPackage.MOLECULAR_SEQUENCE_EDIT__REPLACED_SEQUENCE:
				return replacedSequence != null;
		}
		return super.eIsSet(featureID);
	}

} //MolecularSequenceEditImpl
