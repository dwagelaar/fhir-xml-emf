/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Guide Page</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.ImplementationGuidePage#getSourceUrl <em>Source Url</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImplementationGuidePage#getSourceString <em>Source String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImplementationGuidePage#getSourceMarkdown <em>Source Markdown</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImplementationGuidePage#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImplementationGuidePage#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImplementationGuidePage#getGeneration <em>Generation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ImplementationGuidePage#getPage <em>Page</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getImplementationGuidePage()
 * @model extendedMetaData="name='ImplementationGuide.Page' kind='elementOnly'"
 * @generated
 */
public interface ImplementationGuidePage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Source Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Url</em>' containment reference.
	 * @see #setSourceUrl(Url)
	 * @see org.hl7.emf.fhir.FhirPackage#getImplementationGuidePage_SourceUrl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	Url getSourceUrl();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImplementationGuidePage#getSourceUrl <em>Source Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Url</em>' containment reference.
	 * @see #getSourceUrl()
	 * @generated
	 */
	void setSourceUrl(Url value);

	/**
	 * Returns the value of the '<em><b>Source String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source String</em>' containment reference.
	 * @see #setSourceString(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getImplementationGuidePage_SourceString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getSourceString();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImplementationGuidePage#getSourceString <em>Source String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source String</em>' containment reference.
	 * @see #getSourceString()
	 * @generated
	 */
	void setSourceString(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Source Markdown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Markdown</em>' containment reference.
	 * @see #setSourceMarkdown(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getImplementationGuidePage_SourceMarkdown()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceMarkdown' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getSourceMarkdown();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImplementationGuidePage#getSourceMarkdown <em>Source Markdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Markdown</em>' containment reference.
	 * @see #getSourceMarkdown()
	 * @generated
	 */
	void setSourceMarkdown(Markdown value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The url by which the page should be known when published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Url)
	 * @see org.hl7.emf.fhir.FhirPackage#getImplementationGuidePage_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	Url getName();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImplementationGuidePage#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Url value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short title used to represent this page in navigational structures such as table of contents, bread crumbs, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getImplementationGuidePage_Title()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImplementationGuidePage#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Generation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that indicates how the page is generated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generation</em>' containment reference.
	 * @see #setGeneration(GuidePageGeneration)
	 * @see org.hl7.emf.fhir.FhirPackage#getImplementationGuidePage_Generation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='generation' namespace='##targetNamespace'"
	 * @generated
	 */
	GuidePageGeneration getGeneration();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ImplementationGuidePage#getGeneration <em>Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation</em>' containment reference.
	 * @see #getGeneration()
	 * @generated
	 */
	void setGeneration(GuidePageGeneration value);

	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ImplementationGuidePage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nested Pages/Sections under this page.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Page</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getImplementationGuidePage_Page()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='page' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImplementationGuidePage> getPage();

} // ImplementationGuidePage
