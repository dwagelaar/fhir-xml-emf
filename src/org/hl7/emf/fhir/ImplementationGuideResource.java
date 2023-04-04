/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Guide Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.ImplementationGuideResource#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImplementationGuideResource#getFhirVersion <em>Fhir Version</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImplementationGuideResource#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImplementationGuideResource#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImplementationGuideResource#getIsExample <em>Is Example</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImplementationGuideResource#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImplementationGuideResource#getGroupingId <em>Grouping Id</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getImplementationGuideResource()
 * @model extendedMetaData="name='ImplementationGuide.Resource' kind='elementOnly'"
 * @generated
 */
public interface ImplementationGuideResource extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where this resource is found.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getImplementationGuideResource_Reference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImplementationGuideResource#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Fhir Version</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.FHIRVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the FHIR Version(s) this artifact is intended to apply to. If no versions are specified, the resource is assumed to apply to all the versions stated in ImplementationGuide.fhirVersion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fhir Version</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getImplementationGuideResource_FhirVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fhirVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FHIRVersion> getFhirVersion();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getImplementationGuideResource_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImplementationGuideResource#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the reason that a resource has been included in the implementation guide.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getImplementationGuideResource_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImplementationGuideResource#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Is Example</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates the resource is an example instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Example</em>' containment reference.
	 * @see #setIsExample(org.hl7.emf.fhir.Boolean)
	 * @see org.hl7.emf.fhir.FhirPackage#getImplementationGuideResource_IsExample()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isExample' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Boolean getIsExample();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImplementationGuideResource#getIsExample <em>Is Example</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Example</em>' containment reference.
	 * @see #getIsExample()
	 * @generated
	 */
	void setIsExample(org.hl7.emf.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Canonical}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, indicates profile(s) the instance is valid against.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getImplementationGuideResource_Profile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Canonical> getProfile();

	/**
	 * Returns the value of the '<em><b>Grouping Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the id of the grouping this resource appears in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grouping Id</em>' containment reference.
	 * @see #setGroupingId(Id)
	 * @see org.hl7.emf.fhir.FhirPackage#getImplementationGuideResource_GroupingId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groupingId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getGroupingId();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImplementationGuideResource#getGroupingId <em>Grouping Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping Id</em>' containment reference.
	 * @see #getGroupingId()
	 * @generated
	 */
	void setGroupingId(Id value);

} // ImplementationGuideResource
