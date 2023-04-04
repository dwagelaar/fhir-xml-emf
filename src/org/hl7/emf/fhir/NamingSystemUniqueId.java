/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Naming System Unique Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a "System" used within the Identifier and Coding data types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.NamingSystemUniqueId#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.NamingSystemUniqueId#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.NamingSystemUniqueId#getPreferred <em>Preferred</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.NamingSystemUniqueId#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.NamingSystemUniqueId#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.NamingSystemUniqueId#getAuthoritative <em>Authoritative</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getNamingSystemUniqueId()
 * @model extendedMetaData="name='NamingSystem.UniqueId' kind='elementOnly'"
 * @generated
 */
public interface NamingSystemUniqueId extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the unique identifier scheme used for this particular identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(NamingSystemIdentifierType)
	 * @see org.hl7.emf.fhir.FhirPackage#getNamingSystemUniqueId_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	NamingSystemIdentifierType getType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.NamingSystemUniqueId#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(NamingSystemIdentifierType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The string that should be sent over the wire to identify the code system or identifier system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getNamingSystemUniqueId_Value()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getValue();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.NamingSystemUniqueId#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Preferred</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether this identifier is the "preferred" identifier of this type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preferred</em>' containment reference.
	 * @see #setPreferred(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getNamingSystemUniqueId_Preferred()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preferred' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getPreferred();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.NamingSystemUniqueId#getPreferred <em>Preferred</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred</em>' containment reference.
	 * @see #getPreferred()
	 * @generated
	 */
	void setPreferred(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Notes about the past or intended usage of this identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getNamingSystemUniqueId_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getComment();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.NamingSystemUniqueId#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the period of time over which this identifier is considered appropriate to refer to the naming system.  Outside of this window, the identifier might be non-deterministic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.emf.fhir.FhirPackage#getNamingSystemUniqueId_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.NamingSystemUniqueId#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Authoritative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether this identifier ie endorsed by the official owner of the associated naming system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authoritative</em>' containment reference.
	 * @see #setAuthoritative(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getNamingSystemUniqueId_Authoritative()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authoritative' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getAuthoritative();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.NamingSystemUniqueId#getAuthoritative <em>Authoritative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authoritative</em>' containment reference.
	 * @see #getAuthoritative()
	 * @generated
	 */
	void setAuthoritative(org.hl7.emf.fhir.Boolean value);

} // NamingSystemUniqueId
