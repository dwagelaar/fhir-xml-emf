/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Permission resource holds access rules for a given data and context.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PermissionResource#getMeaning <em>Meaning</em>}</li>
 *   <li>{@link org.hl7.fhir.PermissionResource#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPermissionResource()
 * @model extendedMetaData="name='Permission.Resource' kind='elementOnly'"
 * @generated
 */
public interface PermissionResource extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Meaning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How the resource reference is interpreted when testing consent restrictions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meaning</em>' containment reference.
	 * @see #setMeaning(ConsentDataMeaning)
	 * @see org.hl7.fhir.FhirPackage#getPermissionResource_Meaning()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='meaning' namespace='##targetNamespace'"
	 * @generated
	 */
	ConsentDataMeaning getMeaning();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PermissionResource#getMeaning <em>Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meaning</em>' containment reference.
	 * @see #getMeaning()
	 * @generated
	 */
	void setMeaning(ConsentDataMeaning value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a specific resource that defines which resources are covered by this consent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPermissionResource_Reference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PermissionResource#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

} // PermissionResource
