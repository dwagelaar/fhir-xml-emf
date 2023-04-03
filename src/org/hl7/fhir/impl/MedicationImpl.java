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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Medication;
import org.hl7.fhir.MedicationBatch;
import org.hl7.fhir.MedicationIngredient;
import org.hl7.fhir.MedicationStatusCodes;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationImpl#getMarketingAuthorizationHolder <em>Marketing Authorization Holder</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationImpl#getDoseForm <em>Dose Form</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationImpl#getTotalVolume <em>Total Volume</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationImpl#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationImpl#getBatch <em>Batch</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationImpl#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationImpl extends DomainResourceImpl implements Medication {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected MedicationStatusCodes status;

	/**
	 * The cached value of the '{@link #getMarketingAuthorizationHolder() <em>Marketing Authorization Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketingAuthorizationHolder()
	 * @generated
	 * @ordered
	 */
	protected Reference marketingAuthorizationHolder;

	/**
	 * The cached value of the '{@link #getDoseForm() <em>Dose Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseForm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept doseForm;

	/**
	 * The cached value of the '{@link #getTotalVolume() <em>Total Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalVolume()
	 * @generated
	 * @ordered
	 */
	protected Quantity totalVolume;

	/**
	 * The cached value of the '{@link #getIngredient() <em>Ingredient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredient()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationIngredient> ingredient;

	/**
	 * The cached value of the '{@link #getBatch() <em>Batch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatch()
	 * @generated
	 * @ordered
	 */
	protected MedicationBatch batch;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected Reference definition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MEDICATION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatusCodes getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(MedicationStatusCodes newStatus, NotificationChain msgs) {
		MedicationStatusCodes oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(MedicationStatusCodes newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getMarketingAuthorizationHolder() {
		return marketingAuthorizationHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarketingAuthorizationHolder(Reference newMarketingAuthorizationHolder, NotificationChain msgs) {
		Reference oldMarketingAuthorizationHolder = marketingAuthorizationHolder;
		marketingAuthorizationHolder = newMarketingAuthorizationHolder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__MARKETING_AUTHORIZATION_HOLDER, oldMarketingAuthorizationHolder, newMarketingAuthorizationHolder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarketingAuthorizationHolder(Reference newMarketingAuthorizationHolder) {
		if (newMarketingAuthorizationHolder != marketingAuthorizationHolder) {
			NotificationChain msgs = null;
			if (marketingAuthorizationHolder != null)
				msgs = ((InternalEObject)marketingAuthorizationHolder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__MARKETING_AUTHORIZATION_HOLDER, null, msgs);
			if (newMarketingAuthorizationHolder != null)
				msgs = ((InternalEObject)newMarketingAuthorizationHolder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__MARKETING_AUTHORIZATION_HOLDER, null, msgs);
			msgs = basicSetMarketingAuthorizationHolder(newMarketingAuthorizationHolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__MARKETING_AUTHORIZATION_HOLDER, newMarketingAuthorizationHolder, newMarketingAuthorizationHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDoseForm() {
		return doseForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseForm(CodeableConcept newDoseForm, NotificationChain msgs) {
		CodeableConcept oldDoseForm = doseForm;
		doseForm = newDoseForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__DOSE_FORM, oldDoseForm, newDoseForm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseForm(CodeableConcept newDoseForm) {
		if (newDoseForm != doseForm) {
			NotificationChain msgs = null;
			if (doseForm != null)
				msgs = ((InternalEObject)doseForm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__DOSE_FORM, null, msgs);
			if (newDoseForm != null)
				msgs = ((InternalEObject)newDoseForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__DOSE_FORM, null, msgs);
			msgs = basicSetDoseForm(newDoseForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__DOSE_FORM, newDoseForm, newDoseForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getTotalVolume() {
		return totalVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalVolume(Quantity newTotalVolume, NotificationChain msgs) {
		Quantity oldTotalVolume = totalVolume;
		totalVolume = newTotalVolume;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__TOTAL_VOLUME, oldTotalVolume, newTotalVolume);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalVolume(Quantity newTotalVolume) {
		if (newTotalVolume != totalVolume) {
			NotificationChain msgs = null;
			if (totalVolume != null)
				msgs = ((InternalEObject)totalVolume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__TOTAL_VOLUME, null, msgs);
			if (newTotalVolume != null)
				msgs = ((InternalEObject)newTotalVolume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__TOTAL_VOLUME, null, msgs);
			msgs = basicSetTotalVolume(newTotalVolume, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__TOTAL_VOLUME, newTotalVolume, newTotalVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationIngredient> getIngredient() {
		if (ingredient == null) {
			ingredient = new EObjectContainmentEList<MedicationIngredient>(MedicationIngredient.class, this, FhirPackage.MEDICATION__INGREDIENT);
		}
		return ingredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationBatch getBatch() {
		return batch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBatch(MedicationBatch newBatch, NotificationChain msgs) {
		MedicationBatch oldBatch = batch;
		batch = newBatch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__BATCH, oldBatch, newBatch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatch(MedicationBatch newBatch) {
		if (newBatch != batch) {
			NotificationChain msgs = null;
			if (batch != null)
				msgs = ((InternalEObject)batch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__BATCH, null, msgs);
			if (newBatch != null)
				msgs = ((InternalEObject)newBatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__BATCH, null, msgs);
			msgs = basicSetBatch(newBatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__BATCH, newBatch, newBatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(Reference newDefinition, NotificationChain msgs) {
		Reference oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(Reference newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.MEDICATION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.MEDICATION__MARKETING_AUTHORIZATION_HOLDER:
				return basicSetMarketingAuthorizationHolder(null, msgs);
			case FhirPackage.MEDICATION__DOSE_FORM:
				return basicSetDoseForm(null, msgs);
			case FhirPackage.MEDICATION__TOTAL_VOLUME:
				return basicSetTotalVolume(null, msgs);
			case FhirPackage.MEDICATION__INGREDIENT:
				return ((InternalEList<?>)getIngredient()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION__BATCH:
				return basicSetBatch(null, msgs);
			case FhirPackage.MEDICATION__DEFINITION:
				return basicSetDefinition(null, msgs);
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
			case FhirPackage.MEDICATION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEDICATION__CODE:
				return getCode();
			case FhirPackage.MEDICATION__STATUS:
				return getStatus();
			case FhirPackage.MEDICATION__MARKETING_AUTHORIZATION_HOLDER:
				return getMarketingAuthorizationHolder();
			case FhirPackage.MEDICATION__DOSE_FORM:
				return getDoseForm();
			case FhirPackage.MEDICATION__TOTAL_VOLUME:
				return getTotalVolume();
			case FhirPackage.MEDICATION__INGREDIENT:
				return getIngredient();
			case FhirPackage.MEDICATION__BATCH:
				return getBatch();
			case FhirPackage.MEDICATION__DEFINITION:
				return getDefinition();
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
			case FhirPackage.MEDICATION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MEDICATION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION__STATUS:
				setStatus((MedicationStatusCodes)newValue);
				return;
			case FhirPackage.MEDICATION__MARKETING_AUTHORIZATION_HOLDER:
				setMarketingAuthorizationHolder((Reference)newValue);
				return;
			case FhirPackage.MEDICATION__DOSE_FORM:
				setDoseForm((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION__TOTAL_VOLUME:
				setTotalVolume((Quantity)newValue);
				return;
			case FhirPackage.MEDICATION__INGREDIENT:
				getIngredient().clear();
				getIngredient().addAll((Collection<? extends MedicationIngredient>)newValue);
				return;
			case FhirPackage.MEDICATION__BATCH:
				setBatch((MedicationBatch)newValue);
				return;
			case FhirPackage.MEDICATION__DEFINITION:
				setDefinition((Reference)newValue);
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
			case FhirPackage.MEDICATION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MEDICATION__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION__STATUS:
				setStatus((MedicationStatusCodes)null);
				return;
			case FhirPackage.MEDICATION__MARKETING_AUTHORIZATION_HOLDER:
				setMarketingAuthorizationHolder((Reference)null);
				return;
			case FhirPackage.MEDICATION__DOSE_FORM:
				setDoseForm((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION__TOTAL_VOLUME:
				setTotalVolume((Quantity)null);
				return;
			case FhirPackage.MEDICATION__INGREDIENT:
				getIngredient().clear();
				return;
			case FhirPackage.MEDICATION__BATCH:
				setBatch((MedicationBatch)null);
				return;
			case FhirPackage.MEDICATION__DEFINITION:
				setDefinition((Reference)null);
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
			case FhirPackage.MEDICATION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MEDICATION__CODE:
				return code != null;
			case FhirPackage.MEDICATION__STATUS:
				return status != null;
			case FhirPackage.MEDICATION__MARKETING_AUTHORIZATION_HOLDER:
				return marketingAuthorizationHolder != null;
			case FhirPackage.MEDICATION__DOSE_FORM:
				return doseForm != null;
			case FhirPackage.MEDICATION__TOTAL_VOLUME:
				return totalVolume != null;
			case FhirPackage.MEDICATION__INGREDIENT:
				return ingredient != null && !ingredient.isEmpty();
			case FhirPackage.MEDICATION__BATCH:
				return batch != null;
			case FhirPackage.MEDICATION__DEFINITION:
				return definition != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationImpl
