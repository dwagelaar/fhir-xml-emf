/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biologically Derived Product Dispense</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource reflects an instance of a biologically derived product dispense. The supply or dispense of a biologically derived product from the supply organization or department (e.g. hospital transfusion laboratory) to the clinical team responsible for clinical application.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getOriginRelationshipType <em>Origin Relationship Type</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getProduct <em>Product</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getMatchStatus <em>Match Status</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getPreparedDate <em>Prepared Date</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getWhenHandedOver <em>When Handed Over</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getUsageInstruction <em>Usage Instruction</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductDispense()
 * @model extendedMetaData="name='BiologicallyDerivedProductDispense' kind='elementOnly'"
 * @generated
 */
public interface BiologicallyDerivedProductDispense extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique instance identifiers assigned to a biologically derived product dispense. Note: This is a business identifier, not a resource identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductDispense_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The order or request that the dispense is fulfilling. This is a reference to a ServiceRequest resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductDispense_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A larger event of which this particular event is a component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductDispense_PartOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partOf' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getPartOf();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code specifying the state of the dispense event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(BiologicallyDerivedProductDispenseCodes)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductDispense_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	BiologicallyDerivedProductDispenseCodes getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(BiologicallyDerivedProductDispenseCodes value);

	/**
	 * Returns the value of the '<em><b>Origin Relationship Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the relationship between the donor of the biologically derived product and the intended recipient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin Relationship Type</em>' containment reference.
	 * @see #setOriginRelationshipType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductDispense_OriginRelationshipType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='originRelationshipType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOriginRelationshipType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getOriginRelationshipType <em>Origin Relationship Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Relationship Type</em>' containment reference.
	 * @see #getOriginRelationshipType()
	 * @generated
	 */
	void setOriginRelationshipType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A link to a resource identifying the biologically derived product that is being dispensed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product</em>' containment reference.
	 * @see #setProduct(Reference)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductDispense_Product()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='product' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProduct();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getProduct <em>Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' containment reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Reference value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A link to a resource representing the patient that the product is dispensed for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductDispense_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Match Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the type of matching associated with the dispense.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Match Status</em>' containment reference.
	 * @see #setMatchStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductDispense_MatchStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='matchStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMatchStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getMatchStatus <em>Match Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Status</em>' containment reference.
	 * @see #getMatchStatus()
	 * @generated
	 */
	void setMatchStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.BiologicallyDerivedProductDispensePerformer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates who or what performed an action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductDispense_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BiologicallyDerivedProductDispensePerformer> getPerformer();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The physical location where the dispense was performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductDispense_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of product in the dispense. Quantity will depend on the product being dispensed. Examples are: volume; cell count; concentration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductDispense_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Prepared Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the product was selected/ matched.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prepared Date</em>' containment reference.
	 * @see #setPreparedDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductDispense_PreparedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preparedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getPreparedDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getPreparedDate <em>Prepared Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prepared Date</em>' containment reference.
	 * @see #getPreparedDate()
	 * @generated
	 */
	void setPreparedDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>When Handed Over</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the product was dispatched for clinical use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When Handed Over</em>' containment reference.
	 * @see #setWhenHandedOver(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductDispense_WhenHandedOver()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whenHandedOver' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getWhenHandedOver();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getWhenHandedOver <em>When Handed Over</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Handed Over</em>' containment reference.
	 * @see #getWhenHandedOver()
	 * @generated
	 */
	void setWhenHandedOver(DateTime value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Link to a resource identifying the physical location that the product was dispatched to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(Reference)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductDispense_Destination()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='destination' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDestination();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Reference value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional notes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductDispense_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Usage Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific instructions for use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage Instruction</em>' containment reference.
	 * @see #setUsageInstruction(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getBiologicallyDerivedProductDispense_UsageInstruction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usageInstruction' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getUsageInstruction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.BiologicallyDerivedProductDispense#getUsageInstruction <em>Usage Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Instruction</em>' containment reference.
	 * @see #getUsageInstruction()
	 * @generated
	 */
	void setUsageInstruction(org.hl7.fhir.String value);

} // BiologicallyDerivedProductDispense
