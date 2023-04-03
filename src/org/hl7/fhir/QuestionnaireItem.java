/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getEnableWhen <em>Enable When</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getEnableBehavior <em>Enable Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getDisabledDisplay <em>Disabled Display</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getRequired <em>Required</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getRepeats <em>Repeats</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getAnswerConstraint <em>Answer Constraint</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getAnswerValueSet <em>Answer Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getAnswerOption <em>Answer Option</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getInitial <em>Initial</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireItem#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem()
 * @model extendedMetaData="name='Questionnaire.Item' kind='elementOnly'"
 * @generated
 */
public interface QuestionnaireItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier that is unique within the Questionnaire allowing linkage to the equivalent item in a QuestionnaireResponse resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Id</em>' containment reference.
	 * @see #setLinkId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_LinkId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='linkId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLinkId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getLinkId <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Id</em>' containment reference.
	 * @see #getLinkId()
	 * @generated
	 */
	void setLinkId(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element is a URI that refers to an [ElementDefinition](elementdefinition.html) or to an [ObservationDefinition](observationdefinition.html) that provides information about this item, including information that might otherwise be included in the instance of the Questionnaire resource. A detailed description of the construction of the URI is shown in [Comments](questionnaire.html#definition), below.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(Uri)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Uri value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A terminology code that corresponds to this group or question (e.g. a code from LOINC, which defines many questions and answers).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getCode();

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short label for a particular group, question or set of display text within the questionnaire used for reference by the individual completing the questionnaire.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefix</em>' containment reference.
	 * @see #setPrefix(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_Prefix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prefix' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPrefix();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getPrefix <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' containment reference.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of a section, the text of a question or text content for a display item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getText();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of questionnaire item this is - whether text for display, a grouping of other items or a particular type of data to be captured (string, integer, Coding, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(QuestionnaireItemType)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	QuestionnaireItemType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(QuestionnaireItemType value);

	/**
	 * Returns the value of the '<em><b>Enable When</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.QuestionnaireEnableWhen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A constraint indicating that this item should only be enabled (displayed/allow answers to be captured) when the specified condition is true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable When</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_EnableWhen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enableWhen' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QuestionnaireEnableWhen> getEnableWhen();

	/**
	 * Returns the value of the '<em><b>Enable Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controls how multiple enableWhen values are interpreted -  whether all or any must be true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable Behavior</em>' containment reference.
	 * @see #setEnableBehavior(EnableWhenBehavior)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_EnableBehavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enableBehavior' namespace='##targetNamespace'"
	 * @generated
	 */
	EnableWhenBehavior getEnableBehavior();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getEnableBehavior <em>Enable Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Behavior</em>' containment reference.
	 * @see #getEnableBehavior()
	 * @generated
	 */
	void setEnableBehavior(EnableWhenBehavior value);

	/**
	 * Returns the value of the '<em><b>Disabled Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if and how items that are disabled (because enableWhen evaluates to 'false') should be displayed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disabled Display</em>' containment reference.
	 * @see #setDisabledDisplay(QuestionnaireItemDisabledDisplay)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_DisabledDisplay()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disabledDisplay' namespace='##targetNamespace'"
	 * @generated
	 */
	QuestionnaireItemDisabledDisplay getDisabledDisplay();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getDisabledDisplay <em>Disabled Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled Display</em>' containment reference.
	 * @see #getDisabledDisplay()
	 * @generated
	 */
	void setDisabledDisplay(QuestionnaireItemDisabledDisplay value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An indication, if true, that the item must be present in a "completed" QuestionnaireResponse.  If false, the item may be skipped when answering the questionnaire.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required</em>' containment reference.
	 * @see #setRequired(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_Required()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='required' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getRequired();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getRequired <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' containment reference.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Repeats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An indication, if true, that a QuestionnaireResponse for this item may include multiple answers associated with a single instance of this item (for question-type items) or multiple repetitions of the item (for group-type items).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repeats</em>' containment reference.
	 * @see #setRepeats(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_Repeats()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repeats' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getRepeats();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getRepeats <em>Repeats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeats</em>' containment reference.
	 * @see #getRepeats()
	 * @generated
	 */
	void setRepeats(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An indication, when true, that the value cannot be changed by a human respondent to the Questionnaire.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Only</em>' containment reference.
	 * @see #setReadOnly(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_ReadOnly()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='readOnly' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getReadOnly();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getReadOnly <em>Read Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' containment reference.
	 * @see #getReadOnly()
	 * @generated
	 */
	void setReadOnly(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of characters that are permitted in the answer to be considered a "valid" QuestionnaireResponse.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Length</em>' containment reference.
	 * @see #setMaxLength(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_MaxLength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxLength' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getMaxLength();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getMaxLength <em>Max Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' containment reference.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Answer Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For items that have a defined set of allowed answers (via answerOption or answerValueSet), indicates whether values *other* than those specified can be selected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Answer Constraint</em>' containment reference.
	 * @see #setAnswerConstraint(QuestionnaireAnswerConstraint)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_AnswerConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='answerConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	QuestionnaireAnswerConstraint getAnswerConstraint();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getAnswerConstraint <em>Answer Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Constraint</em>' containment reference.
	 * @see #getAnswerConstraint()
	 * @generated
	 */
	void setAnswerConstraint(QuestionnaireAnswerConstraint value);

	/**
	 * Returns the value of the '<em><b>Answer Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a value set containing a list of values representing permitted answers for a question.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Answer Value Set</em>' containment reference.
	 * @see #setAnswerValueSet(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_AnswerValueSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='answerValueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getAnswerValueSet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireItem#getAnswerValueSet <em>Answer Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Value Set</em>' containment reference.
	 * @see #getAnswerValueSet()
	 * @generated
	 */
	void setAnswerValueSet(Canonical value);

	/**
	 * Returns the value of the '<em><b>Answer Option</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.QuestionnaireAnswerOption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One of the permitted answers for the question.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Answer Option</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_AnswerOption()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='answerOption' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QuestionnaireAnswerOption> getAnswerOption();

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.QuestionnaireInitial}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more values that should be pre-populated in the answer when initially rendering the questionnaire for user input.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_Initial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initial' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QuestionnaireInitial> getInitial();

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.QuestionnaireItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text, questions and other groups to be nested beneath a question or group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getQuestionnaireItem_Item()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QuestionnaireItem> getItem();

} // QuestionnaireItem
