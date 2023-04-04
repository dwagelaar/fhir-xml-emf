/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Response Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.QuestionnaireResponseItem#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.QuestionnaireResponseItem#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.QuestionnaireResponseItem#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.QuestionnaireResponseItem#getAnswer <em>Answer</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.QuestionnaireResponseItem#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getQuestionnaireResponseItem()
 * @model extendedMetaData="name='QuestionnaireResponse.Item' kind='elementOnly'"
 * @generated
 */
public interface QuestionnaireResponseItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The item from the Questionnaire that corresponds to this item in the QuestionnaireResponse resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Id</em>' containment reference.
	 * @see #setLinkId(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getQuestionnaireResponseItem_LinkId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='linkId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getLinkId();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.QuestionnaireResponseItem#getLinkId <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Id</em>' containment reference.
	 * @see #getLinkId()
	 * @generated
	 */
	void setLinkId(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to an [ElementDefinition](elementdefinition.html) that provides the details for the item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(Uri)
	 * @see org.hl7.emf.fhir.FhirPackage#getQuestionnaireResponseItem_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.QuestionnaireResponseItem#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Uri value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text that is displayed above the contents of the group or as the text of the question being answered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getQuestionnaireResponseItem_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getText();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.QuestionnaireResponseItem#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Answer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.QuestionnaireResponseAnswer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The respondent's answer(s) to the question.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Answer</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getQuestionnaireResponseItem_Answer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='answer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QuestionnaireResponseAnswer> getAnswer();

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.QuestionnaireResponseItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sub-questions, sub-groups or display items nested beneath a group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getQuestionnaireResponseItem_Item()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QuestionnaireResponseItem> getItem();

} // QuestionnaireResponseItem
