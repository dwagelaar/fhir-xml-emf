/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Practitioner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A person who is directly or indirectly involved in the provisioning of healthcare or related services.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Practitioner#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Practitioner#getActive <em>Active</em>}</li>
 *   <li>{@link org.hl7.fhir.Practitioner#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.Practitioner#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.hl7.fhir.Practitioner#getGender <em>Gender</em>}</li>
 *   <li>{@link org.hl7.fhir.Practitioner#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Practitioner#getDeceasedBoolean <em>Deceased Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.Practitioner#getDeceasedDateTime <em>Deceased Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.Practitioner#getAddress <em>Address</em>}</li>
 *   <li>{@link org.hl7.fhir.Practitioner#getPhoto <em>Photo</em>}</li>
 *   <li>{@link org.hl7.fhir.Practitioner#getQualification <em>Qualification</em>}</li>
 *   <li>{@link org.hl7.fhir.Practitioner#getCommunication <em>Communication</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPractitioner()
 * @model extendedMetaData="name='Practitioner' kind='elementOnly'"
 * @generated
 */
public interface Practitioner extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier that applies to this person in this role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitioner_Identifier()
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
	 * Whether this practitioner's record is in active use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active</em>' containment reference.
	 * @see #setActive(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getPractitioner_Active()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='active' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getActive();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Practitioner#getActive <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' containment reference.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.HumanName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name(s) associated with the practitioner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitioner_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HumanName> getName();

	/**
	 * Returns the value of the '<em><b>Telecom</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A contact detail for the practitioner, e.g. a telephone number or an email address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telecom</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitioner_Telecom()
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
	 * Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gender</em>' containment reference.
	 * @see #setGender(AdministrativeGender)
	 * @see org.hl7.fhir.FhirPackage#getPractitioner_Gender()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gender' namespace='##targetNamespace'"
	 * @generated
	 */
	AdministrativeGender getGender();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Practitioner#getGender <em>Gender</em>}' containment reference.
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
	 * The date of birth for the practitioner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Birth Date</em>' containment reference.
	 * @see #setBirthDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getPractitioner_BirthDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='birthDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getBirthDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Practitioner#getBirthDate <em>Birth Date</em>}' containment reference.
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
	 * @see #setDeceasedBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getPractitioner_DeceasedBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deceasedBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getDeceasedBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Practitioner#getDeceasedBoolean <em>Deceased Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deceased Boolean</em>' containment reference.
	 * @see #getDeceasedBoolean()
	 * @generated
	 */
	void setDeceasedBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Deceased Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deceased Date Time</em>' containment reference.
	 * @see #setDeceasedDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getPractitioner_DeceasedDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deceasedDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDeceasedDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Practitioner#getDeceasedDateTime <em>Deceased Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deceased Date Time</em>' containment reference.
	 * @see #getDeceasedDateTime()
	 * @generated
	 */
	void setDeceasedDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Address}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Address(es) of the practitioner that are not role specific (typically home address). 
	 * Work addresses are not typically entered in this property as they are usually role dependent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitioner_Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Address> getAddress();

	/**
	 * Returns the value of the '<em><b>Photo</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Attachment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Image of the person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Photo</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitioner_Photo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='photo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Attachment> getPhoto();

	/**
	 * Returns the value of the '<em><b>Qualification</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PractitionerQualification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The official qualifications, certifications, accreditations, training, licenses (and other types of educations/skills/capabilities) that authorize or otherwise pertain to the provision of care by the practitioner.
	 * 
	 * For example, a medical license issued by a medical board of licensure authorizing the practitioner to practice medicine within a certain locality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualification</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitioner_Qualification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='qualification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PractitionerQualification> getQualification();

	/**
	 * Returns the value of the '<em><b>Communication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PractitionerCommunication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A language which may be used to communicate with the practitioner, often for correspondence/administrative purposes.
	 * 
	 * The `PractitionerRole.communication` property should be used for publishing the languages that a practitioner is able to communicate with patients (on a per Organization/Role basis).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitioner_Communication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='communication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PractitionerCommunication> getCommunication();

} // Practitioner
