/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory Item Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A functional description of an inventory item used in inventory and supply-related workflows.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.InventoryItemInstance#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryItemInstance#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryItemInstance#getExpiry <em>Expiry</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryItemInstance#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.InventoryItemInstance#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getInventoryItemInstance()
 * @model extendedMetaData="name='InventoryItem.Instance' kind='elementOnly'"
 * @generated
 */
public interface InventoryItemInstance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier for the physical instance, typically a serial number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryItemInstance_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Lot Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lot or batch number of the item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lot Number</em>' containment reference.
	 * @see #setLotNumber(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryItemInstance_LotNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lotNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getLotNumber();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.InventoryItemInstance#getLotNumber <em>Lot Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot Number</em>' containment reference.
	 * @see #getLotNumber()
	 * @generated
	 */
	void setLotNumber(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Expiry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The expiry date or date and time for the product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiry</em>' containment reference.
	 * @see #setExpiry(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryItemInstance_Expiry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expiry' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getExpiry();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.InventoryItemInstance#getExpiry <em>Expiry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry</em>' containment reference.
	 * @see #getExpiry()
	 * @generated
	 */
	void setExpiry(DateTime value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subject that the item is associated with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryItemInstance_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.InventoryItemInstance#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location that the item is associated with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getInventoryItemInstance_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.InventoryItemInstance#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

} // InventoryItemInstance
