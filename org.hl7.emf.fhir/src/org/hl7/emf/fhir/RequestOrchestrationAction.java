/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Orchestration Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of related requests that can be used to capture intended activities that have inter-dependencies such as "give this medication after that one".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getTextEquivalent <em>Text Equivalent</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getInput <em>Input</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getOutput <em>Output</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getRelatedAction <em>Related Action</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getTimingDateTime <em>Timing Date Time</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getTimingAge <em>Timing Age</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getTimingPeriod <em>Timing Period</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getTimingDuration <em>Timing Duration</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getTimingRange <em>Timing Range</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getTimingTiming <em>Timing Timing</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getGroupingBehavior <em>Grouping Behavior</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getSelectionBehavior <em>Selection Behavior</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getRequiredBehavior <em>Required Behavior</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getPrecheckBehavior <em>Precheck Behavior</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getCardinalityBehavior <em>Cardinality Behavior</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getDefinitionCanonical <em>Definition Canonical</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getDefinitionUri <em>Definition Uri</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getDynamicValue <em>Dynamic Value</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.RequestOrchestrationAction#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction()
 * @model extendedMetaData="name='RequestOrchestration.Action' kind='elementOnly'"
 * @generated
 */
public interface RequestOrchestrationAction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The linkId of the action from the PlanDefinition that corresponds to this action in the RequestOrchestration resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Id</em>' containment reference.
	 * @see #setLinkId(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_LinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getLinkId();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.RequestOrchestrationAction#getLinkId <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Id</em>' containment reference.
	 * @see #getLinkId()
	 * @generated
	 */
	void setLinkId(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A user-visible prefix for the action. For example a section or item numbering such as 1. or A.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefix</em>' containment reference.
	 * @see #setPrefix(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_Prefix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prefix' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getPrefix();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.RequestOrchestrationAction#getPrefix <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' containment reference.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The title of the action displayed to a user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.RequestOrchestrationAction#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short description of the action used to provide a summary to display to the user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.RequestOrchestrationAction#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Text Equivalent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A text equivalent of the action to be performed. This provides a human-interpretable description of the action when the definition is consumed by a system that might not be capable of interpreting it dynamically.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Equivalent</em>' containment reference.
	 * @see #setTextEquivalent(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_TextEquivalent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='textEquivalent' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getTextEquivalent();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.RequestOrchestrationAction#getTextEquivalent <em>Text Equivalent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Equivalent</em>' containment reference.
	 * @see #getTextEquivalent()
	 * @generated
	 */
	void setTextEquivalent(Markdown value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how quickly the action should be addressed with respect to other actions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(RequestPriority)
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestPriority getPriority();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.RequestOrchestrationAction#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(RequestPriority value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that provides meaning for the action or action group. For example, a section may have a LOINC code for a section of a documentation template.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCode();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.RelatedArtifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Didactic or other informational resources associated with the action that can be provided to the CDS recipient. Information resources can include inline text commentary and links to web resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelatedArtifact> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Goals that are intended to be achieved by following the requests in this action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Goal</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_Goal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='goal' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getGoal();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.RequestOrchestrationCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An expression that describes applicability criteria, or start/stop conditions for the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RequestOrchestrationCondition> getCondition();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.RequestOrchestrationInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines input data requirements for the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_Input()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RequestOrchestrationInput> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.RequestOrchestrationOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the outputs of the action, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_Output()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='output' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RequestOrchestrationOutput> getOutput();

	/**
	 * Returns the value of the '<em><b>Related Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.RequestOrchestrationRelatedAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A relationship to another action such as "before" or "30-60 minutes after start of".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Action</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_RelatedAction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedAction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RequestOrchestrationRelatedAction> getRelatedAction();

	/**
	 * Returns the value of the '<em><b>Timing Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Date Time</em>' containment reference.
	 * @see #setTimingDateTime(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_TimingDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getTimingDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.RequestOrchestrationAction#getTimingDateTime <em>Timing Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Date Time</em>' containment reference.
	 * @see #getTimingDateTime()
	 * @generated
	 */
	void setTimingDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Timing Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Age</em>' containment reference.
	 * @see #setTimingAge(Age)
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_TimingAge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingAge' namespace='##targetNamespace'"
	 * @generated
	 */
	Age getTimingAge();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.RequestOrchestrationAction#getTimingAge <em>Timing Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Age</em>' containment reference.
	 * @see #getTimingAge()
	 * @generated
	 */
	void setTimingAge(Age value);

	/**
	 * Returns the value of the '<em><b>Timing Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Period</em>' containment reference.
	 * @see #setTimingPeriod(Period)
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_TimingPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getTimingPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.RequestOrchestrationAction#getTimingPeriod <em>Timing Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Period</em>' containment reference.
	 * @see #getTimingPeriod()
	 * @generated
	 */
	void setTimingPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Timing Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Duration</em>' containment reference.
	 * @see #setTimingDuration(Duration)
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_TimingDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getTimingDuration();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.RequestOrchestrationAction#getTimingDuration <em>Timing Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Duration</em>' containment reference.
	 * @see #getTimingDuration()
	 * @generated
	 */
	void setTimingDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Timing Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Range</em>' containment reference.
	 * @see #setTimingRange(Range)
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_TimingRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getTimingRange();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.RequestOrchestrationAction#getTimingRange <em>Timing Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Range</em>' containment reference.
	 * @see #getTimingRange()
	 * @generated
	 */
	void setTimingRange(Range value);

	/**
	 * Returns the value of the '<em><b>Timing Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Timing</em>' containment reference.
	 * @see #setTimingTiming(Timing)
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_TimingTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getTimingTiming();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.RequestOrchestrationAction#getTimingTiming <em>Timing Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Timing</em>' containment reference.
	 * @see #getTimingTiming()
	 * @generated
	 */
	void setTimingTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the facility where the action will occur; e.g. home, hospital, specific clinic, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(CodeableReference)
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.RequestOrchestrationAction#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.RequestOrchestrationParticipant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The participant that should perform or be responsible for this action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_Participant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participant' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RequestOrchestrationParticipant> getParticipant();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of action to perform (create, update, remove).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.RequestOrchestrationAction#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Grouping Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the grouping behavior for the action and its children.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grouping Behavior</em>' containment reference.
	 * @see #setGroupingBehavior(ActionGroupingBehavior)
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_GroupingBehavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groupingBehavior' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionGroupingBehavior getGroupingBehavior();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.RequestOrchestrationAction#getGroupingBehavior <em>Grouping Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping Behavior</em>' containment reference.
	 * @see #getGroupingBehavior()
	 * @generated
	 */
	void setGroupingBehavior(ActionGroupingBehavior value);

	/**
	 * Returns the value of the '<em><b>Selection Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the selection behavior for the action and its children.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selection Behavior</em>' containment reference.
	 * @see #setSelectionBehavior(ActionSelectionBehavior)
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_SelectionBehavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='selectionBehavior' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionSelectionBehavior getSelectionBehavior();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.RequestOrchestrationAction#getSelectionBehavior <em>Selection Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Behavior</em>' containment reference.
	 * @see #getSelectionBehavior()
	 * @generated
	 */
	void setSelectionBehavior(ActionSelectionBehavior value);

	/**
	 * Returns the value of the '<em><b>Required Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines expectations around whether an action is required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Behavior</em>' containment reference.
	 * @see #setRequiredBehavior(ActionRequiredBehavior)
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_RequiredBehavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requiredBehavior' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionRequiredBehavior getRequiredBehavior();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.RequestOrchestrationAction#getRequiredBehavior <em>Required Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Behavior</em>' containment reference.
	 * @see #getRequiredBehavior()
	 * @generated
	 */
	void setRequiredBehavior(ActionRequiredBehavior value);

	/**
	 * Returns the value of the '<em><b>Precheck Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines whether the action should usually be preselected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precheck Behavior</em>' containment reference.
	 * @see #setPrecheckBehavior(ActionPrecheckBehavior)
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_PrecheckBehavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='precheckBehavior' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionPrecheckBehavior getPrecheckBehavior();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.RequestOrchestrationAction#getPrecheckBehavior <em>Precheck Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precheck Behavior</em>' containment reference.
	 * @see #getPrecheckBehavior()
	 * @generated
	 */
	void setPrecheckBehavior(ActionPrecheckBehavior value);

	/**
	 * Returns the value of the '<em><b>Cardinality Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines whether the action can be selected multiple times.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cardinality Behavior</em>' containment reference.
	 * @see #setCardinalityBehavior(ActionCardinalityBehavior)
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_CardinalityBehavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cardinalityBehavior' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionCardinalityBehavior getCardinalityBehavior();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.RequestOrchestrationAction#getCardinalityBehavior <em>Cardinality Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Behavior</em>' containment reference.
	 * @see #getCardinalityBehavior()
	 * @generated
	 */
	void setCardinalityBehavior(ActionCardinalityBehavior value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource that is the target of the action (e.g. CommunicationRequest).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(Reference)
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_Resource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getResource();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.RequestOrchestrationAction#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Reference value);

	/**
	 * Returns the value of the '<em><b>Definition Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Canonical</em>' containment reference.
	 * @see #setDefinitionCanonical(Canonical)
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_DefinitionCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getDefinitionCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.RequestOrchestrationAction#getDefinitionCanonical <em>Definition Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Canonical</em>' containment reference.
	 * @see #getDefinitionCanonical()
	 * @generated
	 */
	void setDefinitionCanonical(Canonical value);

	/**
	 * Returns the value of the '<em><b>Definition Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Uri</em>' containment reference.
	 * @see #setDefinitionUri(Uri)
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_DefinitionUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getDefinitionUri();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.RequestOrchestrationAction#getDefinitionUri <em>Definition Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Uri</em>' containment reference.
	 * @see #getDefinitionUri()
	 * @generated
	 */
	void setDefinitionUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a StructureMap resource that defines a transform that can be executed to produce the intent resource using the ActivityDefinition instance as the input.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transform</em>' containment reference.
	 * @see #setTransform(Canonical)
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_Transform()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transform' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getTransform();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.RequestOrchestrationAction#getTransform <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' containment reference.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(Canonical value);

	/**
	 * Returns the value of the '<em><b>Dynamic Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.RequestOrchestrationDynamicValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Customizations that should be applied to the statically defined resource. For example, if the dosage of a medication must be computed based on the patient's weight, a customization would be used to specify an expression that calculated the weight, and the path on the resource that would contain the result.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic Value</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_DynamicValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dynamicValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RequestOrchestrationDynamicValue> getDynamicValue();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.RequestOrchestrationAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sub actions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getRequestOrchestrationAction_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RequestOrchestrationAction> getAction();

} // RequestOrchestrationAction
