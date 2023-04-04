/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ingredient of a manufactured item or pharmaceutical product.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.Ingredient#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Ingredient#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Ingredient#getFor <em>For</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Ingredient#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Ingredient#getFunction <em>Function</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Ingredient#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Ingredient#getAllergenicIndicator <em>Allergenic Indicator</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Ingredient#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Ingredient#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Ingredient#getSubstance <em>Substance</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getIngredient()
 * @model extendedMetaData="name='Ingredient' kind='elementOnly'"
 * @generated
 */
public interface Ingredient extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier(s) of this Ingredient that are assigned by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.emf.fhir.FhirPackage#getIngredient_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Ingredient#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of this ingredient. Enables tracking the life-cycle of the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(PublicationStatus)
	 * @see org.hl7.emf.fhir.FhirPackage#getIngredient_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Ingredient#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(PublicationStatus value);

	/**
	 * Returns the value of the '<em><b>For</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The product which this ingredient is a constituent part of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>For</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getIngredient_For()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='for' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getFor();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A classification of the ingredient identifying its purpose within the product, e.g. active, inactive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getIngredient_Role()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Ingredient#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A classification of the ingredient identifying its precise purpose(s) in the drug product. This extends the Ingredient.role to add more detail. Example: antioxidant, alkalizing agent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getIngredient_Function()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='function' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getFunction();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A classification of the ingredient according to where in the physical item it tends to be used, such the outer shell of a tablet, inner body or ink.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getIngredient_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getGroup();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Ingredient#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Allergenic Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the ingredient is a known or suspected allergen. Note that this is a property of the substance, so if a reference to a SubstanceDefinition is used to decribe that (rather than just a code), the allergen information should go there, not here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allergenic Indicator</em>' containment reference.
	 * @see #setAllergenicIndicator(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getIngredient_AllergenicIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allergenicIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getAllergenicIndicator();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Ingredient#getAllergenicIndicator <em>Allergenic Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allergenic Indicator</em>' containment reference.
	 * @see #getAllergenicIndicator()
	 * @generated
	 */
	void setAllergenicIndicator(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A place for providing any notes that are relevant to the component, e.g. removed during process, adjusted for loss on drying.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getIngredient_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getComment();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Ingredient#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(Markdown value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.IngredientManufacturer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization(s) that manufacture this ingredient. Can be used to indicate:         1) Organizations we are aware of that manufacture this ingredient         2) Specific Manufacturer(s) currently being used         3) Set of organisations allowed to manufacture this ingredient for this product         Users must be clear on the application of context relevant to their use case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getIngredient_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IngredientManufacturer> getManufacturer();

	/**
	 * Returns the value of the '<em><b>Substance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The substance that comprises this ingredient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance</em>' containment reference.
	 * @see #setSubstance(IngredientSubstance)
	 * @see org.hl7.emf.fhir.FhirPackage#getIngredient_Substance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='substance' namespace='##targetNamespace'"
	 * @generated
	 */
	IngredientSubstance getSubstance();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Ingredient#getSubstance <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance</em>' containment reference.
	 * @see #getSubstance()
	 * @generated
	 */
	void setSubstance(IngredientSubstance value);

} // Ingredient
