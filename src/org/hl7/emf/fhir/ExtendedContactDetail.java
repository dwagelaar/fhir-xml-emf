/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Contact Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies contact information for a specific purpose over a period of time, might be handled/monitored by a specific named person or organization.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.ExtendedContactDetail#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ExtendedContactDetail#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ExtendedContactDetail#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ExtendedContactDetail#getAddress <em>Address</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ExtendedContactDetail#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ExtendedContactDetail#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getExtendedContactDetail()
 * @model extendedMetaData="name='ExtendedContactDetail' kind='elementOnly'"
 * @generated
 */
public interface ExtendedContactDetail extends DataType {
	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The purpose/type of contact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference.
	 * @see #setPurpose(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getExtendedContactDetail_Purpose()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='purpose' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPurpose();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ExtendedContactDetail#getPurpose <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' containment reference.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.HumanName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of an individual to contact, some types of contact detail are usually blank.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getExtendedContactDetail_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HumanName> getName();

	/**
	 * Returns the value of the '<em><b>Telecom</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contact details application for the purpose defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telecom</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getExtendedContactDetail_Telecom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='telecom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactPoint> getTelecom();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Address for the contact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Address)
	 * @see org.hl7.emf.fhir.FhirPackage#getExtendedContactDetail_Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ExtendedContactDetail#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This contact detail is handled/monitored by a specific organization. If the name is provided in the contact, then it is referring to the named individual within this organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getExtendedContactDetail_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ExtendedContactDetail#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Period that this contact was valid for usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.emf.fhir.FhirPackage#getExtendedContactDetail_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ExtendedContactDetail#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

} // ExtendedContactDetail
