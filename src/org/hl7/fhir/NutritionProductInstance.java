/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Product Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A food or supplement that is consumed by patients.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.NutritionProductInstance#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionProductInstance#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionProductInstance#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionProductInstance#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionProductInstance#getExpiry <em>Expiry</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionProductInstance#getUseBy <em>Use By</em>}</li>
 *   <li>{@link org.hl7.fhir.NutritionProductInstance#getBiologicalSourceEvent <em>Biological Source Event</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getNutritionProductInstance()
 * @model extendedMetaData="name='NutritionProduct.Instance' kind='elementOnly'"
 * @generated
 */
public interface NutritionProductInstance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of items or instances that the resource considers, for instance when referring to 2 identical units together.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getNutritionProductInstance_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionProductInstance#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier for the physical instance, typically a serial number or manufacturer number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getNutritionProductInstance_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name for the specific product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getNutritionProductInstance_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionProductInstance#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Lot Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identification of the batch or lot of the product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lot Number</em>' containment reference.
	 * @see #setLotNumber(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getNutritionProductInstance_LotNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lotNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLotNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionProductInstance#getLotNumber <em>Lot Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot Number</em>' containment reference.
	 * @see #getLotNumber()
	 * @generated
	 */
	void setLotNumber(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Expiry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time after which the product is no longer expected to be in proper condition, or its use is not advised or not allowed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiry</em>' containment reference.
	 * @see #setExpiry(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getNutritionProductInstance_Expiry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expiry' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getExpiry();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionProductInstance#getExpiry <em>Expiry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry</em>' containment reference.
	 * @see #getExpiry()
	 * @generated
	 */
	void setExpiry(DateTime value);

	/**
	 * Returns the value of the '<em><b>Use By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time after which the product is no longer expected to be in proper condition, or its use is not advised or not allowed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use By</em>' containment reference.
	 * @see #setUseBy(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getNutritionProductInstance_UseBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='useBy' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getUseBy();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionProductInstance#getUseBy <em>Use By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use By</em>' containment reference.
	 * @see #getUseBy()
	 * @generated
	 */
	void setUseBy(DateTime value);

	/**
	 * Returns the value of the '<em><b>Biological Source Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier that supports traceability to the event during which material in this product from one or more biological entities was obtained or pooled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Biological Source Event</em>' containment reference.
	 * @see #setBiologicalSourceEvent(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getNutritionProductInstance_BiologicalSourceEvent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='biologicalSourceEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getBiologicalSourceEvent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.NutritionProductInstance#getBiologicalSourceEvent <em>Biological Source Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Biological Source Event</em>' containment reference.
	 * @see #getBiologicalSourceEvent()
	 * @generated
	 */
	void setBiologicalSourceEvent(Identifier value);

} // NutritionProductInstance
