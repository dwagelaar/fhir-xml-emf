/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Demographics and administrative information about a person independent of a specific health-related context.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.Person#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Person#getActive <em>Active</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Person#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Person#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Person#getGender <em>Gender</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Person#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Person#getDeceasedBoolean <em>Deceased Boolean</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Person#getDeceasedDateTime <em>Deceased Date Time</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Person#getAddress <em>Address</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Person#getMaritalStatus <em>Marital Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Person#getPhoto <em>Photo</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Person#getCommunication <em>Communication</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Person#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Person#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getPerson()
 * @model extendedMetaData="name='Person' kind='elementOnly'"
 * @generated
 */
public interface Person extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier for a person within a particular scope.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getPerson_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this person's record is in active use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active</em>' containment reference.
	 * @see #setActive(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getPerson_Active()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='active' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getActive();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Person#getActive <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' containment reference.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.HumanName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name associated with the person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getPerson_Name()
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
	 * A contact detail for the person, e.g. a telephone number or an email address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telecom</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getPerson_Telecom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='telecom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactPoint> getTelecom();

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Administrative Gender.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gender</em>' containment reference.
	 * @see #setGender(AdministrativeGender)
	 * @see org.hl7.emf.fhir.FhirPackage#getPerson_Gender()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gender' namespace='##targetNamespace'"
	 * @generated
	 */
	AdministrativeGender getGender();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Person#getGender <em>Gender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' containment reference.
	 * @see #getGender()
	 * @generated
	 */
	void setGender(AdministrativeGender value);

	/**
	 * Returns the value of the '<em><b>Birth Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The birth date for the person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Birth Date</em>' containment reference.
	 * @see #setBirthDate(Date)
	 * @see org.hl7.emf.fhir.FhirPackage#getPerson_BirthDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='birthDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getBirthDate();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Person#getBirthDate <em>Birth Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Date</em>' containment reference.
	 * @see #getBirthDate()
	 * @generated
	 */
	void setBirthDate(Date value);

	/**
	 * Returns the value of the '<em><b>Deceased Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deceased Boolean</em>' containment reference.
	 * @see #setDeceasedBoolean(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getPerson_DeceasedBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deceasedBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getDeceasedBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Person#getDeceasedBoolean <em>Deceased Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deceased Boolean</em>' containment reference.
	 * @see #getDeceasedBoolean()
	 * @generated
	 */
	void setDeceasedBoolean(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Deceased Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deceased Date Time</em>' containment reference.
	 * @see #setDeceasedDateTime(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getPerson_DeceasedDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deceasedDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDeceasedDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Person#getDeceasedDateTime <em>Deceased Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deceased Date Time</em>' containment reference.
	 * @see #getDeceasedDateTime()
	 * @generated
	 */
	void setDeceasedDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Address}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more addresses for the person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getPerson_Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Address> getAddress();

	/**
	 * Returns the value of the '<em><b>Marital Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This field contains a person's most recent marital (civil) status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Marital Status</em>' containment reference.
	 * @see #setMaritalStatus(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getPerson_MaritalStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maritalStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMaritalStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Person#getMaritalStatus <em>Marital Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marital Status</em>' containment reference.
	 * @see #getMaritalStatus()
	 * @generated
	 */
	void setMaritalStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Photo</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Attachment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An image that can be displayed as a thumbnail of the person to enhance the identification of the individual.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Photo</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getPerson_Photo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='photo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Attachment> getPhoto();

	/**
	 * Returns the value of the '<em><b>Communication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.PersonCommunication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A language which may be used to communicate with the person about his or her health.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getPerson_Communication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='communication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonCommunication> getCommunication();

	/**
	 * Returns the value of the '<em><b>Managing Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization that is the custodian of the person record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managing Organization</em>' containment reference.
	 * @see #setManagingOrganization(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getPerson_ManagingOrganization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='managingOrganization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getManagingOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Person#getManagingOrganization <em>Managing Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managing Organization</em>' containment reference.
	 * @see #getManagingOrganization()
	 * @generated
	 */
	void setManagingOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.PersonLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Link to a resource that concerns the same actual person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getPerson_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonLink> getLink();

} // Person
