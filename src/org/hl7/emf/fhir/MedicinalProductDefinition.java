/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A medicinal product, being a substance or combination of substances that is intended to treat, prevent or diagnose a disease, or to restore, correct or modify physiological functions by exerting a pharmacological, immunological or metabolic action. This resource is intended to define and detail such products and their properties, for uses other than direct patient care (e.g. regulatory use, or drug catalogs).
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getCombinedPharmaceuticalDoseForm <em>Combined Pharmaceutical Dose Form</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getRoute <em>Route</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getIndication <em>Indication</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getLegalStatusOfSupply <em>Legal Status Of Supply</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getAdditionalMonitoringIndicator <em>Additional Monitoring Indicator</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getSpecialMeasures <em>Special Measures</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getPediatricUseIndicator <em>Pediatric Use Indicator</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getMarketingStatus <em>Marketing Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getPackagedMedicinalProduct <em>Packaged Medicinal Product</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getComprisedOf <em>Comprised Of</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getImpurity <em>Impurity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getAttachedDocument <em>Attached Document</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getMasterFile <em>Master File</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getClinicalTrial <em>Clinical Trial</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getCrossReference <em>Cross Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.MedicinalProductDefinition#getCharacteristic <em>Characteristic</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition()
 * @model extendedMetaData="name='MedicinalProductDefinition' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductDefinition extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifier for this product. Could be an MPID. When in development or being regulated, products are typically referenced by official identifiers, assigned by a manufacturer or regulator, and unique to a product (which, when compared to a product instance being prescribed, is actually a product type). See also MedicinalProductDefinition.code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Regulatory type, e.g. Investigational or Authorized.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MedicinalProductDefinition#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this medicine applies to human or veterinary uses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_Domain()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domain' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDomain();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MedicinalProductDefinition#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A business identifier relating to a specific version of the product, this is commonly used to support revisions to an existing product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MedicinalProductDefinition#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status within the lifecycle of this product record. A high-level status, this is not intended to duplicate details carried elsewhere such as legal status, or authorization status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MedicinalProductDefinition#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Status Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date at which the given status became applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Date</em>' containment reference.
	 * @see #setStatusDate(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_StatusDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getStatusDate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MedicinalProductDefinition#getStatusDate <em>Status Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Date</em>' containment reference.
	 * @see #getStatusDate()
	 * @generated
	 */
	void setStatusDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General description of this product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MedicinalProductDefinition#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Combined Pharmaceutical Dose Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The dose form for a single part product, or combined form of a multiple part product. This is one concept that describes all the components. It does not represent the form with components physically mixed, if that might be necessary, for which see (AdministrableProductDefinition.administrableDoseForm).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Combined Pharmaceutical Dose Form</em>' containment reference.
	 * @see #setCombinedPharmaceuticalDoseForm(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_CombinedPharmaceuticalDoseForm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='combinedPharmaceuticalDoseForm' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCombinedPharmaceuticalDoseForm();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MedicinalProductDefinition#getCombinedPharmaceuticalDoseForm <em>Combined Pharmaceutical Dose Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combined Pharmaceutical Dose Form</em>' containment reference.
	 * @see #getCombinedPharmaceuticalDoseForm()
	 * @generated
	 */
	void setCombinedPharmaceuticalDoseForm(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The path by which the product is taken into or makes contact with the body. In some regions this is referred to as the licenced or approved route. See also AdministrableProductDefinition resource. MedicinalProductDefinition.route is the same concept as AdministrableProductDefinition.routeOfAdministration.code, and they cannot be used together.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_Route()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='route' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getRoute();

	/**
	 * Returns the value of the '<em><b>Indication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of indication(s) for this product, used when structured indications are not required. In cases where structured indications are required, they are captured using the ClinicalUseDefinition resource. An indication is a medical situation for which using the product is appropriate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indication</em>' containment reference.
	 * @see #setIndication(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_Indication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='indication' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getIndication();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MedicinalProductDefinition#getIndication <em>Indication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indication</em>' containment reference.
	 * @see #getIndication()
	 * @generated
	 */
	void setIndication(Markdown value);

	/**
	 * Returns the value of the '<em><b>Legal Status Of Supply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The legal status of supply of the medicinal product as classified by the regulator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legal Status Of Supply</em>' containment reference.
	 * @see #setLegalStatusOfSupply(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_LegalStatusOfSupply()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='legalStatusOfSupply' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getLegalStatusOfSupply();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MedicinalProductDefinition#getLegalStatusOfSupply <em>Legal Status Of Supply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legal Status Of Supply</em>' containment reference.
	 * @see #getLegalStatusOfSupply()
	 * @generated
	 */
	void setLegalStatusOfSupply(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Additional Monitoring Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the Medicinal Product is subject to additional monitoring for regulatory reasons, such as heightened reporting requirements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Monitoring Indicator</em>' containment reference.
	 * @see #setAdditionalMonitoringIndicator(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_AdditionalMonitoringIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalMonitoringIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAdditionalMonitoringIndicator();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MedicinalProductDefinition#getAdditionalMonitoringIndicator <em>Additional Monitoring Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Monitoring Indicator</em>' containment reference.
	 * @see #getAdditionalMonitoringIndicator()
	 * @generated
	 */
	void setAdditionalMonitoringIndicator(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Special Measures</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the Medicinal Product is subject to special measures for regulatory reasons, such as a requirement to conduct post-authorization studies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Special Measures</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_SpecialMeasures()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specialMeasures' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSpecialMeasures();

	/**
	 * Returns the value of the '<em><b>Pediatric Use Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If authorised for use in children, or infants, neonates etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pediatric Use Indicator</em>' containment reference.
	 * @see #setPediatricUseIndicator(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_PediatricUseIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pediatricUseIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPediatricUseIndicator();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.MedicinalProductDefinition#getPediatricUseIndicator <em>Pediatric Use Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pediatric Use Indicator</em>' containment reference.
	 * @see #getPediatricUseIndicator()
	 * @generated
	 */
	void setPediatricUseIndicator(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows the product to be classified by various systems, commonly WHO ATC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_Classification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getClassification();

	/**
	 * Returns the value of the '<em><b>Marketing Status</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.MarketingStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Marketing status of the medicinal product, in contrast to marketing authorization. This refers to the product being actually 'on the market' as opposed to being allowed to be on the market (which is an authorization).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Marketing Status</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_MarketingStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='marketingStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MarketingStatus> getMarketingStatus();

	/**
	 * Returns the value of the '<em><b>Packaged Medicinal Product</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Package type for the product. See also the PackagedProductDefinition resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packaged Medicinal Product</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_PackagedMedicinalProduct()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='packagedMedicinalProduct' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getPackagedMedicinalProduct();

	/**
	 * Returns the value of the '<em><b>Comprised Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Types of medicinal manufactured items and/or devices that this product consists of, such as tablets, capsule, or syringes. Used as a direct link when the item's packaging is not being recorded (see also PackagedProductDefinition.package.containedItem.item).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comprised Of</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_ComprisedOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comprisedOf' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getComprisedOf();

	/**
	 * Returns the value of the '<em><b>Ingredient</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ingredients of this medicinal product - when not detailed in other resources. This is only needed if the ingredients are not specified by incoming references from the Ingredient resource, or indirectly via incoming AdministrableProductDefinition, PackagedProductDefinition or ManufacturedItemDefinition references. In cases where those levels of detail are not used, the ingredients may be specified directly here as codes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ingredient</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_Ingredient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ingredient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getIngredient();

	/**
	 * Returns the value of the '<em><b>Impurity</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any component of the drug product which is not the chemical entity defined as the drug substance, or an excipient in the drug product. This includes process-related impurities and contaminants, product-related impurities including degradation products.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Impurity</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_Impurity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='impurity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getImpurity();

	/**
	 * Returns the value of the '<em><b>Attached Document</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information or supporting documentation about the medicinal product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attached Document</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_AttachedDocument()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attachedDocument' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAttachedDocument();

	/**
	 * Returns the value of the '<em><b>Master File</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A master file for the medicinal product (e.g. Pharmacovigilance System Master File). Drug master files (DMFs) are documents submitted to regulatory agencies to provide confidential detailed information about facilities, processes or articles used in the manufacturing, processing, packaging and storing of drug products.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Master File</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_MasterFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='masterFile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getMasterFile();

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.MedicinalProductDefinitionContact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A product specific contact, person (in a role), or an organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductDefinitionContact> getContact();

	/**
	 * Returns the value of the '<em><b>Clinical Trial</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clinical trials or studies that this product is involved in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clinical Trial</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_ClinicalTrial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='clinicalTrial' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getClinicalTrial();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that this product is known by, usually within some formal terminology, perhaps assigned by a third party (i.e. not the manufacturer or regulator). Products (types of medications) tend to be known by identifiers during development and within regulatory process. However when they are prescribed they tend to be identified by codes. The same product may be have multiple codes, applied to it by multiple organizations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getCode();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.MedicinalProductDefinitionName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The product's name, including full name and possibly coded parts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductDefinitionName> getName();

	/**
	 * Returns the value of the '<em><b>Cross Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.MedicinalProductDefinitionCrossReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to another product, e.g. for linking authorised to investigational product, or a virtual product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cross Reference</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_CrossReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='crossReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductDefinitionCrossReference> getCrossReference();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.MedicinalProductDefinitionOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A manufacturing or administrative process or step associated with (or performed on) the medicinal product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_Operation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductDefinitionOperation> getOperation();

	/**
	 * Returns the value of the '<em><b>Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.MedicinalProductDefinitionCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows the key product features to be recorded, such as "sugar free", "modified release", "parallel import".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristic</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getMedicinalProductDefinition_Characteristic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='characteristic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductDefinitionCharacteristic> getCharacteristic();

} // MedicinalProductDefinition
