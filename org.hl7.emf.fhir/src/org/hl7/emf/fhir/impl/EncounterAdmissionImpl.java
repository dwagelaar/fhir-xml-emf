/**
 */
package org.hl7.emf.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.EncounterAdmission;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Identifier;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounter Admission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.EncounterAdmissionImpl#getPreAdmissionIdentifier <em>Pre Admission Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EncounterAdmissionImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EncounterAdmissionImpl#getAdmitSource <em>Admit Source</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EncounterAdmissionImpl#getReAdmission <em>Re Admission</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EncounterAdmissionImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EncounterAdmissionImpl#getDischargeDisposition <em>Discharge Disposition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncounterAdmissionImpl extends BackboneElementImpl implements EncounterAdmission {
	/**
	 * The cached value of the '{@link #getPreAdmissionIdentifier() <em>Pre Admission Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAdmissionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier preAdmissionIdentifier;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Reference origin;

	/**
	 * The cached value of the '{@link #getAdmitSource() <em>Admit Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmitSource()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept admitSource;

	/**
	 * The cached value of the '{@link #getReAdmission() <em>Re Admission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReAdmission()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reAdmission;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Reference destination;

	/**
	 * The cached value of the '{@link #getDischargeDisposition() <em>Discharge Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeDisposition()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept dischargeDisposition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterAdmissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEncounterAdmission();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getPreAdmissionIdentifier() {
		return preAdmissionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreAdmissionIdentifier(Identifier newPreAdmissionIdentifier, NotificationChain msgs) {
		Identifier oldPreAdmissionIdentifier = preAdmissionIdentifier;
		preAdmissionIdentifier = newPreAdmissionIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_ADMISSION__PRE_ADMISSION_IDENTIFIER, oldPreAdmissionIdentifier, newPreAdmissionIdentifier);
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
	public void setPreAdmissionIdentifier(Identifier newPreAdmissionIdentifier) {
		if (newPreAdmissionIdentifier != preAdmissionIdentifier) {
			NotificationChain msgs = null;
			if (preAdmissionIdentifier != null)
				msgs = ((InternalEObject)preAdmissionIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_ADMISSION__PRE_ADMISSION_IDENTIFIER, null, msgs);
			if (newPreAdmissionIdentifier != null)
				msgs = ((InternalEObject)newPreAdmissionIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_ADMISSION__PRE_ADMISSION_IDENTIFIER, null, msgs);
			msgs = basicSetPreAdmissionIdentifier(newPreAdmissionIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_ADMISSION__PRE_ADMISSION_IDENTIFIER, newPreAdmissionIdentifier, newPreAdmissionIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrigin(Reference newOrigin, NotificationChain msgs) {
		Reference oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_ADMISSION__ORIGIN, oldOrigin, newOrigin);
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
	public void setOrigin(Reference newOrigin) {
		if (newOrigin != origin) {
			NotificationChain msgs = null;
			if (origin != null)
				msgs = ((InternalEObject)origin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_ADMISSION__ORIGIN, null, msgs);
			if (newOrigin != null)
				msgs = ((InternalEObject)newOrigin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_ADMISSION__ORIGIN, null, msgs);
			msgs = basicSetOrigin(newOrigin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_ADMISSION__ORIGIN, newOrigin, newOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getAdmitSource() {
		return admitSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdmitSource(CodeableConcept newAdmitSource, NotificationChain msgs) {
		CodeableConcept oldAdmitSource = admitSource;
		admitSource = newAdmitSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_ADMISSION__ADMIT_SOURCE, oldAdmitSource, newAdmitSource);
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
	public void setAdmitSource(CodeableConcept newAdmitSource) {
		if (newAdmitSource != admitSource) {
			NotificationChain msgs = null;
			if (admitSource != null)
				msgs = ((InternalEObject)admitSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_ADMISSION__ADMIT_SOURCE, null, msgs);
			if (newAdmitSource != null)
				msgs = ((InternalEObject)newAdmitSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_ADMISSION__ADMIT_SOURCE, null, msgs);
			msgs = basicSetAdmitSource(newAdmitSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_ADMISSION__ADMIT_SOURCE, newAdmitSource, newAdmitSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getReAdmission() {
		return reAdmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReAdmission(CodeableConcept newReAdmission, NotificationChain msgs) {
		CodeableConcept oldReAdmission = reAdmission;
		reAdmission = newReAdmission;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_ADMISSION__RE_ADMISSION, oldReAdmission, newReAdmission);
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
	public void setReAdmission(CodeableConcept newReAdmission) {
		if (newReAdmission != reAdmission) {
			NotificationChain msgs = null;
			if (reAdmission != null)
				msgs = ((InternalEObject)reAdmission).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_ADMISSION__RE_ADMISSION, null, msgs);
			if (newReAdmission != null)
				msgs = ((InternalEObject)newReAdmission).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_ADMISSION__RE_ADMISSION, null, msgs);
			msgs = basicSetReAdmission(newReAdmission, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_ADMISSION__RE_ADMISSION, newReAdmission, newReAdmission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(Reference newDestination, NotificationChain msgs) {
		Reference oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_ADMISSION__DESTINATION, oldDestination, newDestination);
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
	public void setDestination(Reference newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_ADMISSION__DESTINATION, null, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_ADMISSION__DESTINATION, null, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_ADMISSION__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDischargeDisposition() {
		return dischargeDisposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDischargeDisposition(CodeableConcept newDischargeDisposition, NotificationChain msgs) {
		CodeableConcept oldDischargeDisposition = dischargeDisposition;
		dischargeDisposition = newDischargeDisposition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_ADMISSION__DISCHARGE_DISPOSITION, oldDischargeDisposition, newDischargeDisposition);
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
	public void setDischargeDisposition(CodeableConcept newDischargeDisposition) {
		if (newDischargeDisposition != dischargeDisposition) {
			NotificationChain msgs = null;
			if (dischargeDisposition != null)
				msgs = ((InternalEObject)dischargeDisposition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_ADMISSION__DISCHARGE_DISPOSITION, null, msgs);
			if (newDischargeDisposition != null)
				msgs = ((InternalEObject)newDischargeDisposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_ADMISSION__DISCHARGE_DISPOSITION, null, msgs);
			msgs = basicSetDischargeDisposition(newDischargeDisposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_ADMISSION__DISCHARGE_DISPOSITION, newDischargeDisposition, newDischargeDisposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ENCOUNTER_ADMISSION__PRE_ADMISSION_IDENTIFIER:
				return basicSetPreAdmissionIdentifier(null, msgs);
			case FhirPackage.ENCOUNTER_ADMISSION__ORIGIN:
				return basicSetOrigin(null, msgs);
			case FhirPackage.ENCOUNTER_ADMISSION__ADMIT_SOURCE:
				return basicSetAdmitSource(null, msgs);
			case FhirPackage.ENCOUNTER_ADMISSION__RE_ADMISSION:
				return basicSetReAdmission(null, msgs);
			case FhirPackage.ENCOUNTER_ADMISSION__DESTINATION:
				return basicSetDestination(null, msgs);
			case FhirPackage.ENCOUNTER_ADMISSION__DISCHARGE_DISPOSITION:
				return basicSetDischargeDisposition(null, msgs);
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
			case FhirPackage.ENCOUNTER_ADMISSION__PRE_ADMISSION_IDENTIFIER:
				return getPreAdmissionIdentifier();
			case FhirPackage.ENCOUNTER_ADMISSION__ORIGIN:
				return getOrigin();
			case FhirPackage.ENCOUNTER_ADMISSION__ADMIT_SOURCE:
				return getAdmitSource();
			case FhirPackage.ENCOUNTER_ADMISSION__RE_ADMISSION:
				return getReAdmission();
			case FhirPackage.ENCOUNTER_ADMISSION__DESTINATION:
				return getDestination();
			case FhirPackage.ENCOUNTER_ADMISSION__DISCHARGE_DISPOSITION:
				return getDischargeDisposition();
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
			case FhirPackage.ENCOUNTER_ADMISSION__PRE_ADMISSION_IDENTIFIER:
				setPreAdmissionIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ENCOUNTER_ADMISSION__ORIGIN:
				setOrigin((Reference)newValue);
				return;
			case FhirPackage.ENCOUNTER_ADMISSION__ADMIT_SOURCE:
				setAdmitSource((CodeableConcept)newValue);
				return;
			case FhirPackage.ENCOUNTER_ADMISSION__RE_ADMISSION:
				setReAdmission((CodeableConcept)newValue);
				return;
			case FhirPackage.ENCOUNTER_ADMISSION__DESTINATION:
				setDestination((Reference)newValue);
				return;
			case FhirPackage.ENCOUNTER_ADMISSION__DISCHARGE_DISPOSITION:
				setDischargeDisposition((CodeableConcept)newValue);
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
			case FhirPackage.ENCOUNTER_ADMISSION__PRE_ADMISSION_IDENTIFIER:
				setPreAdmissionIdentifier((Identifier)null);
				return;
			case FhirPackage.ENCOUNTER_ADMISSION__ORIGIN:
				setOrigin((Reference)null);
				return;
			case FhirPackage.ENCOUNTER_ADMISSION__ADMIT_SOURCE:
				setAdmitSource((CodeableConcept)null);
				return;
			case FhirPackage.ENCOUNTER_ADMISSION__RE_ADMISSION:
				setReAdmission((CodeableConcept)null);
				return;
			case FhirPackage.ENCOUNTER_ADMISSION__DESTINATION:
				setDestination((Reference)null);
				return;
			case FhirPackage.ENCOUNTER_ADMISSION__DISCHARGE_DISPOSITION:
				setDischargeDisposition((CodeableConcept)null);
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
			case FhirPackage.ENCOUNTER_ADMISSION__PRE_ADMISSION_IDENTIFIER:
				return preAdmissionIdentifier != null;
			case FhirPackage.ENCOUNTER_ADMISSION__ORIGIN:
				return origin != null;
			case FhirPackage.ENCOUNTER_ADMISSION__ADMIT_SOURCE:
				return admitSource != null;
			case FhirPackage.ENCOUNTER_ADMISSION__RE_ADMISSION:
				return reAdmission != null;
			case FhirPackage.ENCOUNTER_ADMISSION__DESTINATION:
				return destination != null;
			case FhirPackage.ENCOUNTER_ADMISSION__DISCHARGE_DISPOSITION:
				return dischargeDisposition != null;
		}
		return super.eIsSet(featureID);
	}

} //EncounterAdmissionImpl
