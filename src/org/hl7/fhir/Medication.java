/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource is primarily used for the identification and definition of a medication, including ingredients, for the purposes of prescribing, dispensing, and administering a medication as well as for making statements about medication use.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Medication#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Medication#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.Medication#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Medication#getMarketingAuthorizationHolder <em>Marketing Authorization Holder</em>}</li>
 *   <li>{@link org.hl7.fhir.Medication#getDoseForm <em>Dose Form</em>}</li>
 *   <li>{@link org.hl7.fhir.Medication#getTotalVolume <em>Total Volume</em>}</li>
 *   <li>{@link org.hl7.fhir.Medication#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.fhir.Medication#getBatch <em>Batch</em>}</li>
 *   <li>{@link org.hl7.fhir.Medication#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedication()
 * @model extendedMetaData="name='Medication' kind='elementOnly'"
 * @generated
 */
public interface Medication extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifier for this medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedication_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code (or set of codes) that specify this medication, or a textual description if no code is available. Usage note: This could be a standard medication code such as a code from RxNorm, SNOMED CT, IDMP etc. It could also be a national or local formulary code, optionally with translations to other code systems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedication_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Medication#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code to indicate if the medication is in active use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(MedicationStatusCodes)
	 * @see org.hl7.fhir.FhirPackage#getMedication_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationStatusCodes getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Medication#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(MedicationStatusCodes value);

	/**
	 * Returns the value of the '<em><b>Marketing Authorization Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The company or other legal entity that has authorization, from the appropriate drug regulatory authority,  to market a medicine in one or more jurisdictions.  Typically abbreviated MAH.Note:  The MAH may manufacture the product and may also contract the manufacturing of the product to one or more companies (organizations).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Marketing Authorization Holder</em>' containment reference.
	 * @see #setMarketingAuthorizationHolder(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedication_MarketingAuthorizationHolder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='marketingAuthorizationHolder' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getMarketingAuthorizationHolder();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Medication#getMarketingAuthorizationHolder <em>Marketing Authorization Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marketing Authorization Holder</em>' containment reference.
	 * @see #getMarketingAuthorizationHolder()
	 * @generated
	 */
	void setMarketingAuthorizationHolder(Reference value);

	/**
	 * Returns the value of the '<em><b>Dose Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the form of the item.  Powder; tablets; capsule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Form</em>' containment reference.
	 * @see #setDoseForm(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedication_DoseForm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doseForm' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDoseForm();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Medication#getDoseForm <em>Dose Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Form</em>' containment reference.
	 * @see #getDoseForm()
	 * @generated
	 */
	void setDoseForm(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Total Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the specified product code does not infer a package size, this is the specific amount of drug in the product.  For example, when specifying a product that has the same strength (For example, Insulin glargine 100 unit per mL solution for injection), this attribute provides additional clarification of the package amount (For example, 3 mL, 10mL, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Volume</em>' containment reference.
	 * @see #setTotalVolume(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getMedication_TotalVolume()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='totalVolume' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getTotalVolume();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Medication#getTotalVolume <em>Total Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Volume</em>' containment reference.
	 * @see #getTotalVolume()
	 * @generated
	 */
	void setTotalVolume(Quantity value);

	/**
	 * Returns the value of the '<em><b>Ingredient</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationIngredient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a particular constituent of interest in the product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ingredient</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedication_Ingredient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ingredient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationIngredient> getIngredient();

	/**
	 * Returns the value of the '<em><b>Batch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information that only applies to packages (not products).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Batch</em>' containment reference.
	 * @see #setBatch(MedicationBatch)
	 * @see org.hl7.fhir.FhirPackage#getMedication_Batch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='batch' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationBatch getBatch();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Medication#getBatch <em>Batch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Batch</em>' containment reference.
	 * @see #getBatch()
	 * @generated
	 */
	void setBatch(MedicationBatch value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a knowledge resource that provides more information about this medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedication_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Medication#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Reference value);

} // Medication
