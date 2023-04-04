/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Administrable Product Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A medicinal product in the final form which is suitable for administering to a patient (after any mixing of multiple components, dissolution etc. has been performed).
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.AdministrableProductDefinition#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdministrableProductDefinition#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdministrableProductDefinition#getFormOf <em>Form Of</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdministrableProductDefinition#getAdministrableDoseForm <em>Administrable Dose Form</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdministrableProductDefinition#getUnitOfPresentation <em>Unit Of Presentation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdministrableProductDefinition#getProducedFrom <em>Produced From</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdministrableProductDefinition#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdministrableProductDefinition#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdministrableProductDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdministrableProductDefinition#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.AdministrableProductDefinition#getRouteOfAdministration <em>Route Of Administration</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getAdministrableProductDefinition()
 * @model extendedMetaData="name='AdministrableProductDefinition' kind='elementOnly'"
 * @generated
 */
public interface AdministrableProductDefinition extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier for the administrable product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAdministrableProductDefinition_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of this administrable product. Enables tracking the life-cycle of the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(PublicationStatus)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdministrableProductDefinition_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdministrableProductDefinition#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(PublicationStatus value);

	/**
	 * Returns the value of the '<em><b>Form Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a product from which one or more of the constituent parts of that product can be prepared and used as described by this administrable product.  If this administrable product describes the administration of a crushed tablet, the 'formOf' would be the product representing a distribution containing tablets and possibly also a cream.  This is distinct from the 'producedFrom' which refers to the specific components of the product that are used in this preparation, rather than the product as a whole.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Form Of</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAdministrableProductDefinition_FormOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='formOf' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getFormOf();

	/**
	 * Returns the value of the '<em><b>Administrable Dose Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The dose form of the final product after necessary reconstitution or processing. Contrasts to the manufactured dose form (see ManufacturedItemDefinition). If the manufactured form was 'powder for solution for injection', the administrable dose form could be 'solution for injection' (once mixed with another item having manufactured form 'solvent for solution for injection').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Administrable Dose Form</em>' containment reference.
	 * @see #setAdministrableDoseForm(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdministrableProductDefinition_AdministrableDoseForm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='administrableDoseForm' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAdministrableDoseForm();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdministrableProductDefinition#getAdministrableDoseForm <em>Administrable Dose Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administrable Dose Form</em>' containment reference.
	 * @see #getAdministrableDoseForm()
	 * @generated
	 */
	void setAdministrableDoseForm(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Unit Of Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The presentation type in which this item is given to a patient. e.g. for a spray - 'puff' (as in 'contains 100 mcg per puff'), or for a liquid - 'vial' (as in 'contains 5 ml per vial').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Of Presentation</em>' containment reference.
	 * @see #setUnitOfPresentation(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdministrableProductDefinition_UnitOfPresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unitOfPresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getUnitOfPresentation();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdministrableProductDefinition#getUnitOfPresentation <em>Unit Of Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Of Presentation</em>' containment reference.
	 * @see #getUnitOfPresentation()
	 * @generated
	 */
	void setUnitOfPresentation(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Produced From</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the specific manufactured items that are part of the 'formOf' product that are used in the preparation of this specific administrable form.  In some cases, an administrable form might use all of the items from the overall product (or there might only be one item), while in other cases, an administrable form might use only a subset of the items available in the overall product.  For example, an administrable form might involve combining a liquid and a powder available as part of an overall product, but not involve applying the also supplied cream.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Produced From</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAdministrableProductDefinition_ProducedFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='producedFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getProducedFrom();

	/**
	 * Returns the value of the '<em><b>Ingredient</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ingredients of this administrable medicinal product. This is only needed if the ingredients are not specified either using ManufacturedItemDefiniton (via AdministrableProductDefinition.producedFrom) to state which component items are used to make this, or using by incoming references from the Ingredient resource, to state in detail which substances exist within this. This element allows a basic coded ingredient to be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ingredient</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAdministrableProductDefinition_Ingredient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ingredient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getIngredient();

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A device that is integral to the medicinal product, in effect being considered as an "ingredient" of the medicinal product. This is not intended for devices that are just co-packaged.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdministrableProductDefinition_Device()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='device' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDevice();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdministrableProductDefinition#getDevice <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' containment reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Reference value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A general description of the product, when in its final form, suitable for administration e.g. effervescent blue liquid, to be swallowed. Intended to be used when the other structured properties of this resource are insufficient or cannot be supported. It is not intended to duplicate information already carried elswehere.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getAdministrableProductDefinition_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.AdministrableProductDefinition#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.AdministrableProductDefinitionProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Characteristics e.g. a product's onset of action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAdministrableProductDefinition_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AdministrableProductDefinitionProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Route Of Administration</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.AdministrableProductDefinitionRouteOfAdministration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The path by which the product is taken into or makes contact with the body. In some regions this is referred to as the licenced or approved route. RouteOfAdministration cannot be used when the 'formOf' product already uses MedicinalProductDefinition.route (and vice versa).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Of Administration</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getAdministrableProductDefinition_RouteOfAdministration()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='routeOfAdministration' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AdministrableProductDefinitionRouteOfAdministration> getRouteOfAdministration();

} // AdministrableProductDefinition
