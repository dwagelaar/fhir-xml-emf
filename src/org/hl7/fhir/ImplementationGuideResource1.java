/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Guide Resource1</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ImplementationGuideResource1#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideResource1#getIsExample <em>Is Example</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideResource1#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.ImplementationGuideResource1#getRelativePath <em>Relative Path</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImplementationGuideResource1()
 * @model extendedMetaData="name='ImplementationGuide.Resource1' kind='elementOnly'"
 * @generated
 */
public interface ImplementationGuideResource1 extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where this resource is found.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideResource1_Reference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuideResource1#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Is Example</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates the resource is an example instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Example</em>' containment reference.
	 * @see #setIsExample(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideResource1_IsExample()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isExample' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIsExample();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuideResource1#getIsExample <em>Is Example</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Example</em>' containment reference.
	 * @see #getIsExample()
	 * @generated
	 */
	void setIsExample(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Canonical}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, indicates profile(s) the instance is valid against.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideResource1_Profile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Canonical> getProfile();

	/**
	 * Returns the value of the '<em><b>Relative Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relative path for primary page for this resource within the IG.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Path</em>' containment reference.
	 * @see #setRelativePath(Url)
	 * @see org.hl7.fhir.FhirPackage#getImplementationGuideResource1_RelativePath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relativePath' namespace='##targetNamespace'"
	 * @generated
	 */
	Url getRelativePath();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImplementationGuideResource1#getRelativePath <em>Relative Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Path</em>' containment reference.
	 * @see #getRelativePath()
	 * @generated
	 */
	void setRelativePath(Url value);

} // ImplementationGuideResource1
