/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biologically Derived Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource reflects an instance of a biologically derived product. A material substance originating from a biological entity intended to be transplanted or infused
 * into another (possibly the same) biological entity.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.BiologicallyDerivedProduct#getProductCategory <em>Product Category</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.BiologicallyDerivedProduct#getProductCode <em>Product Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.BiologicallyDerivedProduct#getParent <em>Parent</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.BiologicallyDerivedProduct#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.BiologicallyDerivedProduct#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.BiologicallyDerivedProduct#getBiologicalSourceEvent <em>Biological Source Event</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.BiologicallyDerivedProduct#getProcessingFacility <em>Processing Facility</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.BiologicallyDerivedProduct#getDivision <em>Division</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.BiologicallyDerivedProduct#getProductStatus <em>Product Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.BiologicallyDerivedProduct#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.BiologicallyDerivedProduct#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.BiologicallyDerivedProduct#getStorageTempRequirements <em>Storage Temp Requirements</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.BiologicallyDerivedProduct#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getBiologicallyDerivedProduct()
 * @model extendedMetaData="name='BiologicallyDerivedProduct' kind='elementOnly'"
 * @generated
 */
public interface BiologicallyDerivedProduct extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Product Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Broad category of this product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Category</em>' containment reference.
	 * @see #setProductCategory(Coding)
	 * @see org.hl7.emf.fhir.FhirPackage#getBiologicallyDerivedProduct_ProductCategory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productCategory' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getProductCategory();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.BiologicallyDerivedProduct#getProductCategory <em>Product Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category</em>' containment reference.
	 * @see #getProductCategory()
	 * @generated
	 */
	void setProductCategory(Coding value);

	/**
	 * Returns the value of the '<em><b>Product Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A codified value that systematically supports characterization and classification of medical products of human origin inclusive of processing conditions such as additives, volumes and handling conditions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Code</em>' containment reference.
	 * @see #setProductCode(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getBiologicallyDerivedProduct_ProductCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productCode' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getProductCode();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.BiologicallyDerivedProduct#getProductCode <em>Product Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Code</em>' containment reference.
	 * @see #getProductCode()
	 * @generated
	 */
	void setProductCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parent product (if any) for this biologically-derived product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getBiologicallyDerivedProduct_Parent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getParent();

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Request to obtain and/or infuse this biologically derived product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getBiologicallyDerivedProduct_Request()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='request' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getRequest();

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique instance identifiers assigned to a biologically derived product. Note: This is a business identifier, not a resource identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getBiologicallyDerivedProduct_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Biological Source Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier that supports traceability to the event during which material in this product from one or more biological entities was obtained or pooled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Biological Source Event</em>' containment reference.
	 * @see #setBiologicalSourceEvent(Identifier)
	 * @see org.hl7.emf.fhir.FhirPackage#getBiologicallyDerivedProduct_BiologicalSourceEvent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='biologicalSourceEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getBiologicalSourceEvent();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.BiologicallyDerivedProduct#getBiologicalSourceEvent <em>Biological Source Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Biological Source Event</em>' containment reference.
	 * @see #getBiologicalSourceEvent()
	 * @generated
	 */
	void setBiologicalSourceEvent(Identifier value);

	/**
	 * Returns the value of the '<em><b>Processing Facility</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Processing facilities responsible for the labeling and distribution of this biologically derived product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Processing Facility</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getBiologicallyDerivedProduct_ProcessingFacility()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='processingFacility' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getProcessingFacility();

	/**
	 * Returns the value of the '<em><b>Division</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for an aliquot of a product.  Used to distinguish individual aliquots of a product carrying the same biologicalSource and productCode identifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Division</em>' containment reference.
	 * @see #setDivision(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getBiologicallyDerivedProduct_Division()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='division' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getDivision();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.BiologicallyDerivedProduct#getDivision <em>Division</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Division</em>' containment reference.
	 * @see #getDivision()
	 * @generated
	 */
	void setDivision(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Product Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the product is currently available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Status</em>' containment reference.
	 * @see #setProductStatus(Coding)
	 * @see org.hl7.emf.fhir.FhirPackage#getBiologicallyDerivedProduct_ProductStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getProductStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.BiologicallyDerivedProduct#getProductStatus <em>Product Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Status</em>' containment reference.
	 * @see #getProductStatus()
	 * @generated
	 */
	void setProductStatus(Coding value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date, and where relevant time, of expiration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiration Date</em>' containment reference.
	 * @see #setExpirationDate(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getBiologicallyDerivedProduct_ExpirationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expirationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getExpirationDate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.BiologicallyDerivedProduct#getExpirationDate <em>Expiration Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' containment reference.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How this product was collected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference.
	 * @see #setCollection(BiologicallyDerivedProductCollection)
	 * @see org.hl7.emf.fhir.FhirPackage#getBiologicallyDerivedProduct_Collection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='collection' namespace='##targetNamespace'"
	 * @generated
	 */
	BiologicallyDerivedProductCollection getCollection();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.BiologicallyDerivedProduct#getCollection <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' containment reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(BiologicallyDerivedProductCollection value);

	/**
	 * Returns the value of the '<em><b>Storage Temp Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The temperature requirements for storage of the biologically-derived product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Temp Requirements</em>' containment reference.
	 * @see #setStorageTempRequirements(Range)
	 * @see org.hl7.emf.fhir.FhirPackage#getBiologicallyDerivedProduct_StorageTempRequirements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='storageTempRequirements' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getStorageTempRequirements();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.BiologicallyDerivedProduct#getStorageTempRequirements <em>Storage Temp Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Temp Requirements</em>' containment reference.
	 * @see #getStorageTempRequirements()
	 * @generated
	 */
	void setStorageTempRequirements(Range value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.BiologicallyDerivedProductProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A property that is specific to this BiologicallyDerviedProduct instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getBiologicallyDerivedProduct_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BiologicallyDerivedProductProperty> getProperty();

} // BiologicallyDerivedProduct
