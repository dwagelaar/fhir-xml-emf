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
import org.hl7.fhir.MedicationKnowledgeDefinitional;
import org.hl7.fhir.MedicationKnowledgeDrugCharacteristic;
import org.hl7.fhir.MedicationKnowledgeIngredient;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Knowledge Definitional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeDefinitionalImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeDefinitionalImpl#getDoseForm <em>Dose Form</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeDefinitionalImpl#getIntendedRoute <em>Intended Route</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeDefinitionalImpl#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeDefinitionalImpl#getDrugCharacteristic <em>Drug Characteristic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationKnowledgeDefinitionalImpl extends BackboneElementImpl implements MedicationKnowledgeDefinitional {
	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> definition;

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
	 * The cached value of the '{@link #getIntendedRoute() <em>Intended Route</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedRoute()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> intendedRoute;

	/**
	 * The cached value of the '{@link #getIngredient() <em>Ingredient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredient()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeIngredient> ingredient;

	/**
	 * The cached value of the '{@link #getDrugCharacteristic() <em>Drug Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrugCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeDrugCharacteristic> drugCharacteristic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationKnowledgeDefinitionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationKnowledgeDefinitional();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getDefinition() {
		if (definition == null) {
			definition = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__DEFINITION);
		}
		return definition;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__DOSE_FORM, oldDoseForm, newDoseForm);
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
				msgs = ((InternalEObject)doseForm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__DOSE_FORM, null, msgs);
			if (newDoseForm != null)
				msgs = ((InternalEObject)newDoseForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__DOSE_FORM, null, msgs);
			msgs = basicSetDoseForm(newDoseForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__DOSE_FORM, newDoseForm, newDoseForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getIntendedRoute() {
		if (intendedRoute == null) {
			intendedRoute = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__INTENDED_ROUTE);
		}
		return intendedRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationKnowledgeIngredient> getIngredient() {
		if (ingredient == null) {
			ingredient = new EObjectContainmentEList<MedicationKnowledgeIngredient>(MedicationKnowledgeIngredient.class, this, FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__INGREDIENT);
		}
		return ingredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationKnowledgeDrugCharacteristic> getDrugCharacteristic() {
		if (drugCharacteristic == null) {
			drugCharacteristic = new EObjectContainmentEList<MedicationKnowledgeDrugCharacteristic>(MedicationKnowledgeDrugCharacteristic.class, this, FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__DRUG_CHARACTERISTIC);
		}
		return drugCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__DEFINITION:
				return ((InternalEList<?>)getDefinition()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__DOSE_FORM:
				return basicSetDoseForm(null, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__INTENDED_ROUTE:
				return ((InternalEList<?>)getIntendedRoute()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__INGREDIENT:
				return ((InternalEList<?>)getIngredient()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__DRUG_CHARACTERISTIC:
				return ((InternalEList<?>)getDrugCharacteristic()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__DEFINITION:
				return getDefinition();
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__DOSE_FORM:
				return getDoseForm();
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__INTENDED_ROUTE:
				return getIntendedRoute();
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__INGREDIENT:
				return getIngredient();
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__DRUG_CHARACTERISTIC:
				return getDrugCharacteristic();
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
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__DEFINITION:
				getDefinition().clear();
				getDefinition().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__DOSE_FORM:
				setDoseForm((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__INTENDED_ROUTE:
				getIntendedRoute().clear();
				getIntendedRoute().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__INGREDIENT:
				getIngredient().clear();
				getIngredient().addAll((Collection<? extends MedicationKnowledgeIngredient>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__DRUG_CHARACTERISTIC:
				getDrugCharacteristic().clear();
				getDrugCharacteristic().addAll((Collection<? extends MedicationKnowledgeDrugCharacteristic>)newValue);
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
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__DEFINITION:
				getDefinition().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__DOSE_FORM:
				setDoseForm((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__INTENDED_ROUTE:
				getIntendedRoute().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__INGREDIENT:
				getIngredient().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__DRUG_CHARACTERISTIC:
				getDrugCharacteristic().clear();
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
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__DEFINITION:
				return definition != null && !definition.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__DOSE_FORM:
				return doseForm != null;
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__INTENDED_ROUTE:
				return intendedRoute != null && !intendedRoute.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__INGREDIENT:
				return ingredient != null && !ingredient.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL__DRUG_CHARACTERISTIC:
				return drugCharacteristic != null && !drugCharacteristic.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationKnowledgeDefinitionalImpl
