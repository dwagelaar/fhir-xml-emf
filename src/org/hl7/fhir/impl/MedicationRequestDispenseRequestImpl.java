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

import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Duration;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MedicationRequestDispenseRequest;
import org.hl7.fhir.MedicationRequestInitialFill;
import org.hl7.fhir.Period;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;
import org.hl7.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Request Dispense Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestDispenseRequestImpl#getInitialFill <em>Initial Fill</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestDispenseRequestImpl#getDispenseInterval <em>Dispense Interval</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestDispenseRequestImpl#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestDispenseRequestImpl#getNumberOfRepeatsAllowed <em>Number Of Repeats Allowed</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestDispenseRequestImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestDispenseRequestImpl#getExpectedSupplyDuration <em>Expected Supply Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestDispenseRequestImpl#getDispenser <em>Dispenser</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestDispenseRequestImpl#getDispenserInstruction <em>Dispenser Instruction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestDispenseRequestImpl#getDoseAdministrationAid <em>Dose Administration Aid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationRequestDispenseRequestImpl extends BackboneElementImpl implements MedicationRequestDispenseRequest {
	/**
	 * The cached value of the '{@link #getInitialFill() <em>Initial Fill</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialFill()
	 * @generated
	 * @ordered
	 */
	protected MedicationRequestInitialFill initialFill;

	/**
	 * The cached value of the '{@link #getDispenseInterval() <em>Dispense Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispenseInterval()
	 * @generated
	 * @ordered
	 */
	protected Duration dispenseInterval;

	/**
	 * The cached value of the '{@link #getValidityPeriod() <em>Validity Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period validityPeriod;

	/**
	 * The cached value of the '{@link #getNumberOfRepeatsAllowed() <em>Number Of Repeats Allowed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRepeatsAllowed()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt numberOfRepeatsAllowed;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getExpectedSupplyDuration() <em>Expected Supply Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedSupplyDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration expectedSupplyDuration;

	/**
	 * The cached value of the '{@link #getDispenser() <em>Dispenser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispenser()
	 * @generated
	 * @ordered
	 */
	protected Reference dispenser;

	/**
	 * The cached value of the '{@link #getDispenserInstruction() <em>Dispenser Instruction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispenserInstruction()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> dispenserInstruction;

	/**
	 * The cached value of the '{@link #getDoseAdministrationAid() <em>Dose Administration Aid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseAdministrationAid()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept doseAdministrationAid;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationRequestDispenseRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationRequestDispenseRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestInitialFill getInitialFill() {
		return initialFill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialFill(MedicationRequestInitialFill newInitialFill, NotificationChain msgs) {
		MedicationRequestInitialFill oldInitialFill = initialFill;
		initialFill = newInitialFill;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__INITIAL_FILL, oldInitialFill, newInitialFill);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialFill(MedicationRequestInitialFill newInitialFill) {
		if (newInitialFill != initialFill) {
			NotificationChain msgs = null;
			if (initialFill != null)
				msgs = ((InternalEObject)initialFill).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__INITIAL_FILL, null, msgs);
			if (newInitialFill != null)
				msgs = ((InternalEObject)newInitialFill).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__INITIAL_FILL, null, msgs);
			msgs = basicSetInitialFill(newInitialFill, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__INITIAL_FILL, newInitialFill, newInitialFill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDispenseInterval() {
		return dispenseInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDispenseInterval(Duration newDispenseInterval, NotificationChain msgs) {
		Duration oldDispenseInterval = dispenseInterval;
		dispenseInterval = newDispenseInterval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DISPENSE_INTERVAL, oldDispenseInterval, newDispenseInterval);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispenseInterval(Duration newDispenseInterval) {
		if (newDispenseInterval != dispenseInterval) {
			NotificationChain msgs = null;
			if (dispenseInterval != null)
				msgs = ((InternalEObject)dispenseInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DISPENSE_INTERVAL, null, msgs);
			if (newDispenseInterval != null)
				msgs = ((InternalEObject)newDispenseInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DISPENSE_INTERVAL, null, msgs);
			msgs = basicSetDispenseInterval(newDispenseInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DISPENSE_INTERVAL, newDispenseInterval, newDispenseInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getValidityPeriod() {
		return validityPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidityPeriod(Period newValidityPeriod, NotificationChain msgs) {
		Period oldValidityPeriod = validityPeriod;
		validityPeriod = newValidityPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__VALIDITY_PERIOD, oldValidityPeriod, newValidityPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidityPeriod(Period newValidityPeriod) {
		if (newValidityPeriod != validityPeriod) {
			NotificationChain msgs = null;
			if (validityPeriod != null)
				msgs = ((InternalEObject)validityPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__VALIDITY_PERIOD, null, msgs);
			if (newValidityPeriod != null)
				msgs = ((InternalEObject)newValidityPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__VALIDITY_PERIOD, null, msgs);
			msgs = basicSetValidityPeriod(newValidityPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__VALIDITY_PERIOD, newValidityPeriod, newValidityPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getNumberOfRepeatsAllowed() {
		return numberOfRepeatsAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfRepeatsAllowed(UnsignedInt newNumberOfRepeatsAllowed, NotificationChain msgs) {
		UnsignedInt oldNumberOfRepeatsAllowed = numberOfRepeatsAllowed;
		numberOfRepeatsAllowed = newNumberOfRepeatsAllowed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__NUMBER_OF_REPEATS_ALLOWED, oldNumberOfRepeatsAllowed, newNumberOfRepeatsAllowed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRepeatsAllowed(UnsignedInt newNumberOfRepeatsAllowed) {
		if (newNumberOfRepeatsAllowed != numberOfRepeatsAllowed) {
			NotificationChain msgs = null;
			if (numberOfRepeatsAllowed != null)
				msgs = ((InternalEObject)numberOfRepeatsAllowed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__NUMBER_OF_REPEATS_ALLOWED, null, msgs);
			if (newNumberOfRepeatsAllowed != null)
				msgs = ((InternalEObject)newNumberOfRepeatsAllowed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__NUMBER_OF_REPEATS_ALLOWED, null, msgs);
			msgs = basicSetNumberOfRepeatsAllowed(newNumberOfRepeatsAllowed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__NUMBER_OF_REPEATS_ALLOWED, newNumberOfRepeatsAllowed, newNumberOfRepeatsAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getExpectedSupplyDuration() {
		return expectedSupplyDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpectedSupplyDuration(Duration newExpectedSupplyDuration, NotificationChain msgs) {
		Duration oldExpectedSupplyDuration = expectedSupplyDuration;
		expectedSupplyDuration = newExpectedSupplyDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__EXPECTED_SUPPLY_DURATION, oldExpectedSupplyDuration, newExpectedSupplyDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedSupplyDuration(Duration newExpectedSupplyDuration) {
		if (newExpectedSupplyDuration != expectedSupplyDuration) {
			NotificationChain msgs = null;
			if (expectedSupplyDuration != null)
				msgs = ((InternalEObject)expectedSupplyDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__EXPECTED_SUPPLY_DURATION, null, msgs);
			if (newExpectedSupplyDuration != null)
				msgs = ((InternalEObject)newExpectedSupplyDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__EXPECTED_SUPPLY_DURATION, null, msgs);
			msgs = basicSetExpectedSupplyDuration(newExpectedSupplyDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__EXPECTED_SUPPLY_DURATION, newExpectedSupplyDuration, newExpectedSupplyDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getDispenser() {
		return dispenser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDispenser(Reference newDispenser, NotificationChain msgs) {
		Reference oldDispenser = dispenser;
		dispenser = newDispenser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DISPENSER, oldDispenser, newDispenser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispenser(Reference newDispenser) {
		if (newDispenser != dispenser) {
			NotificationChain msgs = null;
			if (dispenser != null)
				msgs = ((InternalEObject)dispenser).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DISPENSER, null, msgs);
			if (newDispenser != null)
				msgs = ((InternalEObject)newDispenser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DISPENSER, null, msgs);
			msgs = basicSetDispenser(newDispenser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DISPENSER, newDispenser, newDispenser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getDispenserInstruction() {
		if (dispenserInstruction == null) {
			dispenserInstruction = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DISPENSER_INSTRUCTION);
		}
		return dispenserInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDoseAdministrationAid() {
		return doseAdministrationAid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseAdministrationAid(CodeableConcept newDoseAdministrationAid, NotificationChain msgs) {
		CodeableConcept oldDoseAdministrationAid = doseAdministrationAid;
		doseAdministrationAid = newDoseAdministrationAid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DOSE_ADMINISTRATION_AID, oldDoseAdministrationAid, newDoseAdministrationAid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseAdministrationAid(CodeableConcept newDoseAdministrationAid) {
		if (newDoseAdministrationAid != doseAdministrationAid) {
			NotificationChain msgs = null;
			if (doseAdministrationAid != null)
				msgs = ((InternalEObject)doseAdministrationAid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DOSE_ADMINISTRATION_AID, null, msgs);
			if (newDoseAdministrationAid != null)
				msgs = ((InternalEObject)newDoseAdministrationAid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DOSE_ADMINISTRATION_AID, null, msgs);
			msgs = basicSetDoseAdministrationAid(newDoseAdministrationAid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DOSE_ADMINISTRATION_AID, newDoseAdministrationAid, newDoseAdministrationAid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__INITIAL_FILL:
				return basicSetInitialFill(null, msgs);
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DISPENSE_INTERVAL:
				return basicSetDispenseInterval(null, msgs);
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__VALIDITY_PERIOD:
				return basicSetValidityPeriod(null, msgs);
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__NUMBER_OF_REPEATS_ALLOWED:
				return basicSetNumberOfRepeatsAllowed(null, msgs);
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__EXPECTED_SUPPLY_DURATION:
				return basicSetExpectedSupplyDuration(null, msgs);
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DISPENSER:
				return basicSetDispenser(null, msgs);
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DISPENSER_INSTRUCTION:
				return ((InternalEList<?>)getDispenserInstruction()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DOSE_ADMINISTRATION_AID:
				return basicSetDoseAdministrationAid(null, msgs);
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
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__INITIAL_FILL:
				return getInitialFill();
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DISPENSE_INTERVAL:
				return getDispenseInterval();
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__VALIDITY_PERIOD:
				return getValidityPeriod();
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__NUMBER_OF_REPEATS_ALLOWED:
				return getNumberOfRepeatsAllowed();
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__QUANTITY:
				return getQuantity();
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__EXPECTED_SUPPLY_DURATION:
				return getExpectedSupplyDuration();
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DISPENSER:
				return getDispenser();
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DISPENSER_INSTRUCTION:
				return getDispenserInstruction();
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DOSE_ADMINISTRATION_AID:
				return getDoseAdministrationAid();
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
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__INITIAL_FILL:
				setInitialFill((MedicationRequestInitialFill)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DISPENSE_INTERVAL:
				setDispenseInterval((Duration)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__VALIDITY_PERIOD:
				setValidityPeriod((Period)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__NUMBER_OF_REPEATS_ALLOWED:
				setNumberOfRepeatsAllowed((UnsignedInt)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__EXPECTED_SUPPLY_DURATION:
				setExpectedSupplyDuration((Duration)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DISPENSER:
				setDispenser((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DISPENSER_INSTRUCTION:
				getDispenserInstruction().clear();
				getDispenserInstruction().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DOSE_ADMINISTRATION_AID:
				setDoseAdministrationAid((CodeableConcept)newValue);
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
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__INITIAL_FILL:
				setInitialFill((MedicationRequestInitialFill)null);
				return;
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DISPENSE_INTERVAL:
				setDispenseInterval((Duration)null);
				return;
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__VALIDITY_PERIOD:
				setValidityPeriod((Period)null);
				return;
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__NUMBER_OF_REPEATS_ALLOWED:
				setNumberOfRepeatsAllowed((UnsignedInt)null);
				return;
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__EXPECTED_SUPPLY_DURATION:
				setExpectedSupplyDuration((Duration)null);
				return;
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DISPENSER:
				setDispenser((Reference)null);
				return;
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DISPENSER_INSTRUCTION:
				getDispenserInstruction().clear();
				return;
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DOSE_ADMINISTRATION_AID:
				setDoseAdministrationAid((CodeableConcept)null);
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
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__INITIAL_FILL:
				return initialFill != null;
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DISPENSE_INTERVAL:
				return dispenseInterval != null;
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__VALIDITY_PERIOD:
				return validityPeriod != null;
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__NUMBER_OF_REPEATS_ALLOWED:
				return numberOfRepeatsAllowed != null;
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__QUANTITY:
				return quantity != null;
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__EXPECTED_SUPPLY_DURATION:
				return expectedSupplyDuration != null;
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DISPENSER:
				return dispenser != null;
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DISPENSER_INSTRUCTION:
				return dispenserInstruction != null && !dispenserInstruction.isEmpty();
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__DOSE_ADMINISTRATION_AID:
				return doseAdministrationAid != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationRequestDispenseRequestImpl
