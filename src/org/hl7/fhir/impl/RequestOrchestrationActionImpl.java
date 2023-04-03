/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.ActionCardinalityBehavior;
import org.hl7.fhir.ActionGroupingBehavior;
import org.hl7.fhir.ActionPrecheckBehavior;
import org.hl7.fhir.ActionRequiredBehavior;
import org.hl7.fhir.ActionSelectionBehavior;
import org.hl7.fhir.Age;
import org.hl7.fhir.Canonical;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Duration;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Period;
import org.hl7.fhir.Range;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RelatedArtifact;
import org.hl7.fhir.RequestOrchestrationAction;
import org.hl7.fhir.RequestOrchestrationCondition;
import org.hl7.fhir.RequestOrchestrationDynamicValue;
import org.hl7.fhir.RequestOrchestrationInput;
import org.hl7.fhir.RequestOrchestrationOutput;
import org.hl7.fhir.RequestOrchestrationParticipant;
import org.hl7.fhir.RequestOrchestrationRelatedAction;
import org.hl7.fhir.RequestPriority;
import org.hl7.fhir.Timing;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Orchestration Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getTextEquivalent <em>Text Equivalent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getRelatedAction <em>Related Action</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getTimingDateTime <em>Timing Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getTimingAge <em>Timing Age</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getTimingPeriod <em>Timing Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getTimingDuration <em>Timing Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getTimingRange <em>Timing Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getTimingTiming <em>Timing Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getGroupingBehavior <em>Grouping Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getSelectionBehavior <em>Selection Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getRequiredBehavior <em>Required Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getPrecheckBehavior <em>Precheck Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getCardinalityBehavior <em>Cardinality Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getDefinitionCanonical <em>Definition Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getDefinitionUri <em>Definition Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getDynamicValue <em>Dynamic Value</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestOrchestrationActionImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestOrchestrationActionImpl extends BackboneElementImpl implements RequestOrchestrationAction {
	/**
	 * The cached value of the '{@link #getLinkId() <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String linkId;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String prefix;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String title;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

	/**
	 * The cached value of the '{@link #getTextEquivalent() <em>Text Equivalent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextEquivalent()
	 * @generated
	 * @ordered
	 */
	protected Markdown textEquivalent;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected RequestPriority priority;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> code;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedArtifact> documentation;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> goal;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestOrchestrationCondition> condition;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestOrchestrationInput> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestOrchestrationOutput> output;

	/**
	 * The cached value of the '{@link #getRelatedAction() <em>Related Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedAction()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestOrchestrationRelatedAction> relatedAction;

	/**
	 * The cached value of the '{@link #getTimingDateTime() <em>Timing Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime timingDateTime;

	/**
	 * The cached value of the '{@link #getTimingAge() <em>Timing Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingAge()
	 * @generated
	 * @ordered
	 */
	protected Age timingAge;

	/**
	 * The cached value of the '{@link #getTimingPeriod() <em>Timing Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period timingPeriod;

	/**
	 * The cached value of the '{@link #getTimingDuration() <em>Timing Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration timingDuration;

	/**
	 * The cached value of the '{@link #getTimingRange() <em>Timing Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingRange()
	 * @generated
	 * @ordered
	 */
	protected Range timingRange;

	/**
	 * The cached value of the '{@link #getTimingTiming() <em>Timing Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing timingTiming;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference location;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestOrchestrationParticipant> participant;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getGroupingBehavior() <em>Grouping Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingBehavior()
	 * @generated
	 * @ordered
	 */
	protected ActionGroupingBehavior groupingBehavior;

	/**
	 * The cached value of the '{@link #getSelectionBehavior() <em>Selection Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionBehavior()
	 * @generated
	 * @ordered
	 */
	protected ActionSelectionBehavior selectionBehavior;

	/**
	 * The cached value of the '{@link #getRequiredBehavior() <em>Required Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBehavior()
	 * @generated
	 * @ordered
	 */
	protected ActionRequiredBehavior requiredBehavior;

	/**
	 * The cached value of the '{@link #getPrecheckBehavior() <em>Precheck Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecheckBehavior()
	 * @generated
	 * @ordered
	 */
	protected ActionPrecheckBehavior precheckBehavior;

	/**
	 * The cached value of the '{@link #getCardinalityBehavior() <em>Cardinality Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityBehavior()
	 * @generated
	 * @ordered
	 */
	protected ActionCardinalityBehavior cardinalityBehavior;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Reference resource;

	/**
	 * The cached value of the '{@link #getDefinitionCanonical() <em>Definition Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionCanonical()
	 * @generated
	 * @ordered
	 */
	protected Canonical definitionCanonical;

	/**
	 * The cached value of the '{@link #getDefinitionUri() <em>Definition Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionUri()
	 * @generated
	 * @ordered
	 */
	protected Uri definitionUri;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected Canonical transform;

	/**
	 * The cached value of the '{@link #getDynamicValue() <em>Dynamic Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicValue()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestOrchestrationDynamicValue> dynamicValue;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestOrchestrationAction> action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestOrchestrationActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getRequestOrchestrationAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getLinkId() {
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkId(org.hl7.fhir.String newLinkId, NotificationChain msgs) {
		org.hl7.fhir.String oldLinkId = linkId;
		linkId = newLinkId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__LINK_ID, oldLinkId, newLinkId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkId(org.hl7.fhir.String newLinkId) {
		if (newLinkId != linkId) {
			NotificationChain msgs = null;
			if (linkId != null)
				msgs = ((InternalEObject)linkId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__LINK_ID, null, msgs);
			if (newLinkId != null)
				msgs = ((InternalEObject)newLinkId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__LINK_ID, null, msgs);
			msgs = basicSetLinkId(newLinkId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__LINK_ID, newLinkId, newLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrefix(org.hl7.fhir.String newPrefix, NotificationChain msgs) {
		org.hl7.fhir.String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__PREFIX, oldPrefix, newPrefix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(org.hl7.fhir.String newPrefix) {
		if (newPrefix != prefix) {
			NotificationChain msgs = null;
			if (prefix != null)
				msgs = ((InternalEObject)prefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__PREFIX, null, msgs);
			if (newPrefix != null)
				msgs = ((InternalEObject)newPrefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__PREFIX, null, msgs);
			msgs = basicSetPrefix(newPrefix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__PREFIX, newPrefix, newPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.hl7.fhir.String newTitle, NotificationChain msgs) {
		org.hl7.fhir.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(org.hl7.fhir.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Markdown newDescription, NotificationChain msgs) {
		Markdown oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getTextEquivalent() {
		return textEquivalent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextEquivalent(Markdown newTextEquivalent, NotificationChain msgs) {
		Markdown oldTextEquivalent = textEquivalent;
		textEquivalent = newTextEquivalent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__TEXT_EQUIVALENT, oldTextEquivalent, newTextEquivalent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextEquivalent(Markdown newTextEquivalent) {
		if (newTextEquivalent != textEquivalent) {
			NotificationChain msgs = null;
			if (textEquivalent != null)
				msgs = ((InternalEObject)textEquivalent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__TEXT_EQUIVALENT, null, msgs);
			if (newTextEquivalent != null)
				msgs = ((InternalEObject)newTextEquivalent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__TEXT_EQUIVALENT, null, msgs);
			msgs = basicSetTextEquivalent(newTextEquivalent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__TEXT_EQUIVALENT, newTextEquivalent, newTextEquivalent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestPriority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(RequestPriority newPriority, NotificationChain msgs) {
		RequestPriority oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(RequestPriority newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCode() {
		if (code == null) {
			code = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.REQUEST_ORCHESTRATION_ACTION__CODE);
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelatedArtifact> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<RelatedArtifact>(RelatedArtifact.class, this, FhirPackage.REQUEST_ORCHESTRATION_ACTION__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getGoal() {
		if (goal == null) {
			goal = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.REQUEST_ORCHESTRATION_ACTION__GOAL);
		}
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequestOrchestrationCondition> getCondition() {
		if (condition == null) {
			condition = new EObjectContainmentEList<RequestOrchestrationCondition>(RequestOrchestrationCondition.class, this, FhirPackage.REQUEST_ORCHESTRATION_ACTION__CONDITION);
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequestOrchestrationInput> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<RequestOrchestrationInput>(RequestOrchestrationInput.class, this, FhirPackage.REQUEST_ORCHESTRATION_ACTION__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequestOrchestrationOutput> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<RequestOrchestrationOutput>(RequestOrchestrationOutput.class, this, FhirPackage.REQUEST_ORCHESTRATION_ACTION__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequestOrchestrationRelatedAction> getRelatedAction() {
		if (relatedAction == null) {
			relatedAction = new EObjectContainmentEList<RequestOrchestrationRelatedAction>(RequestOrchestrationRelatedAction.class, this, FhirPackage.REQUEST_ORCHESTRATION_ACTION__RELATED_ACTION);
		}
		return relatedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getTimingDateTime() {
		return timingDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingDateTime(DateTime newTimingDateTime, NotificationChain msgs) {
		DateTime oldTimingDateTime = timingDateTime;
		timingDateTime = newTimingDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_DATE_TIME, oldTimingDateTime, newTimingDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingDateTime(DateTime newTimingDateTime) {
		if (newTimingDateTime != timingDateTime) {
			NotificationChain msgs = null;
			if (timingDateTime != null)
				msgs = ((InternalEObject)timingDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_DATE_TIME, null, msgs);
			if (newTimingDateTime != null)
				msgs = ((InternalEObject)newTimingDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_DATE_TIME, null, msgs);
			msgs = basicSetTimingDateTime(newTimingDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_DATE_TIME, newTimingDateTime, newTimingDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Age getTimingAge() {
		return timingAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingAge(Age newTimingAge, NotificationChain msgs) {
		Age oldTimingAge = timingAge;
		timingAge = newTimingAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_AGE, oldTimingAge, newTimingAge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingAge(Age newTimingAge) {
		if (newTimingAge != timingAge) {
			NotificationChain msgs = null;
			if (timingAge != null)
				msgs = ((InternalEObject)timingAge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_AGE, null, msgs);
			if (newTimingAge != null)
				msgs = ((InternalEObject)newTimingAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_AGE, null, msgs);
			msgs = basicSetTimingAge(newTimingAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_AGE, newTimingAge, newTimingAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getTimingPeriod() {
		return timingPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingPeriod(Period newTimingPeriod, NotificationChain msgs) {
		Period oldTimingPeriod = timingPeriod;
		timingPeriod = newTimingPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_PERIOD, oldTimingPeriod, newTimingPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingPeriod(Period newTimingPeriod) {
		if (newTimingPeriod != timingPeriod) {
			NotificationChain msgs = null;
			if (timingPeriod != null)
				msgs = ((InternalEObject)timingPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_PERIOD, null, msgs);
			if (newTimingPeriod != null)
				msgs = ((InternalEObject)newTimingPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_PERIOD, null, msgs);
			msgs = basicSetTimingPeriod(newTimingPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_PERIOD, newTimingPeriod, newTimingPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getTimingDuration() {
		return timingDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingDuration(Duration newTimingDuration, NotificationChain msgs) {
		Duration oldTimingDuration = timingDuration;
		timingDuration = newTimingDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_DURATION, oldTimingDuration, newTimingDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingDuration(Duration newTimingDuration) {
		if (newTimingDuration != timingDuration) {
			NotificationChain msgs = null;
			if (timingDuration != null)
				msgs = ((InternalEObject)timingDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_DURATION, null, msgs);
			if (newTimingDuration != null)
				msgs = ((InternalEObject)newTimingDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_DURATION, null, msgs);
			msgs = basicSetTimingDuration(newTimingDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_DURATION, newTimingDuration, newTimingDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getTimingRange() {
		return timingRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingRange(Range newTimingRange, NotificationChain msgs) {
		Range oldTimingRange = timingRange;
		timingRange = newTimingRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_RANGE, oldTimingRange, newTimingRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingRange(Range newTimingRange) {
		if (newTimingRange != timingRange) {
			NotificationChain msgs = null;
			if (timingRange != null)
				msgs = ((InternalEObject)timingRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_RANGE, null, msgs);
			if (newTimingRange != null)
				msgs = ((InternalEObject)newTimingRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_RANGE, null, msgs);
			msgs = basicSetTimingRange(newTimingRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_RANGE, newTimingRange, newTimingRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getTimingTiming() {
		return timingTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingTiming(Timing newTimingTiming, NotificationChain msgs) {
		Timing oldTimingTiming = timingTiming;
		timingTiming = newTimingTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_TIMING, oldTimingTiming, newTimingTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingTiming(Timing newTimingTiming) {
		if (newTimingTiming != timingTiming) {
			NotificationChain msgs = null;
			if (timingTiming != null)
				msgs = ((InternalEObject)timingTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_TIMING, null, msgs);
			if (newTimingTiming != null)
				msgs = ((InternalEObject)newTimingTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_TIMING, null, msgs);
			msgs = basicSetTimingTiming(newTimingTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_TIMING, newTimingTiming, newTimingTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableReference getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(CodeableReference newLocation, NotificationChain msgs) {
		CodeableReference oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(CodeableReference newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequestOrchestrationParticipant> getParticipant() {
		if (participant == null) {
			participant = new EObjectContainmentEList<RequestOrchestrationParticipant>(RequestOrchestrationParticipant.class, this, FhirPackage.REQUEST_ORCHESTRATION_ACTION__PARTICIPANT);
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGroupingBehavior getGroupingBehavior() {
		return groupingBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupingBehavior(ActionGroupingBehavior newGroupingBehavior, NotificationChain msgs) {
		ActionGroupingBehavior oldGroupingBehavior = groupingBehavior;
		groupingBehavior = newGroupingBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__GROUPING_BEHAVIOR, oldGroupingBehavior, newGroupingBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupingBehavior(ActionGroupingBehavior newGroupingBehavior) {
		if (newGroupingBehavior != groupingBehavior) {
			NotificationChain msgs = null;
			if (groupingBehavior != null)
				msgs = ((InternalEObject)groupingBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__GROUPING_BEHAVIOR, null, msgs);
			if (newGroupingBehavior != null)
				msgs = ((InternalEObject)newGroupingBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__GROUPING_BEHAVIOR, null, msgs);
			msgs = basicSetGroupingBehavior(newGroupingBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__GROUPING_BEHAVIOR, newGroupingBehavior, newGroupingBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSelectionBehavior getSelectionBehavior() {
		return selectionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectionBehavior(ActionSelectionBehavior newSelectionBehavior, NotificationChain msgs) {
		ActionSelectionBehavior oldSelectionBehavior = selectionBehavior;
		selectionBehavior = newSelectionBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__SELECTION_BEHAVIOR, oldSelectionBehavior, newSelectionBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionBehavior(ActionSelectionBehavior newSelectionBehavior) {
		if (newSelectionBehavior != selectionBehavior) {
			NotificationChain msgs = null;
			if (selectionBehavior != null)
				msgs = ((InternalEObject)selectionBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__SELECTION_BEHAVIOR, null, msgs);
			if (newSelectionBehavior != null)
				msgs = ((InternalEObject)newSelectionBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__SELECTION_BEHAVIOR, null, msgs);
			msgs = basicSetSelectionBehavior(newSelectionBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__SELECTION_BEHAVIOR, newSelectionBehavior, newSelectionBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRequiredBehavior getRequiredBehavior() {
		return requiredBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredBehavior(ActionRequiredBehavior newRequiredBehavior, NotificationChain msgs) {
		ActionRequiredBehavior oldRequiredBehavior = requiredBehavior;
		requiredBehavior = newRequiredBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__REQUIRED_BEHAVIOR, oldRequiredBehavior, newRequiredBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredBehavior(ActionRequiredBehavior newRequiredBehavior) {
		if (newRequiredBehavior != requiredBehavior) {
			NotificationChain msgs = null;
			if (requiredBehavior != null)
				msgs = ((InternalEObject)requiredBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__REQUIRED_BEHAVIOR, null, msgs);
			if (newRequiredBehavior != null)
				msgs = ((InternalEObject)newRequiredBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__REQUIRED_BEHAVIOR, null, msgs);
			msgs = basicSetRequiredBehavior(newRequiredBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__REQUIRED_BEHAVIOR, newRequiredBehavior, newRequiredBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionPrecheckBehavior getPrecheckBehavior() {
		return precheckBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecheckBehavior(ActionPrecheckBehavior newPrecheckBehavior, NotificationChain msgs) {
		ActionPrecheckBehavior oldPrecheckBehavior = precheckBehavior;
		precheckBehavior = newPrecheckBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__PRECHECK_BEHAVIOR, oldPrecheckBehavior, newPrecheckBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecheckBehavior(ActionPrecheckBehavior newPrecheckBehavior) {
		if (newPrecheckBehavior != precheckBehavior) {
			NotificationChain msgs = null;
			if (precheckBehavior != null)
				msgs = ((InternalEObject)precheckBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__PRECHECK_BEHAVIOR, null, msgs);
			if (newPrecheckBehavior != null)
				msgs = ((InternalEObject)newPrecheckBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__PRECHECK_BEHAVIOR, null, msgs);
			msgs = basicSetPrecheckBehavior(newPrecheckBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__PRECHECK_BEHAVIOR, newPrecheckBehavior, newPrecheckBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionCardinalityBehavior getCardinalityBehavior() {
		return cardinalityBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinalityBehavior(ActionCardinalityBehavior newCardinalityBehavior, NotificationChain msgs) {
		ActionCardinalityBehavior oldCardinalityBehavior = cardinalityBehavior;
		cardinalityBehavior = newCardinalityBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__CARDINALITY_BEHAVIOR, oldCardinalityBehavior, newCardinalityBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalityBehavior(ActionCardinalityBehavior newCardinalityBehavior) {
		if (newCardinalityBehavior != cardinalityBehavior) {
			NotificationChain msgs = null;
			if (cardinalityBehavior != null)
				msgs = ((InternalEObject)cardinalityBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__CARDINALITY_BEHAVIOR, null, msgs);
			if (newCardinalityBehavior != null)
				msgs = ((InternalEObject)newCardinalityBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__CARDINALITY_BEHAVIOR, null, msgs);
			msgs = basicSetCardinalityBehavior(newCardinalityBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__CARDINALITY_BEHAVIOR, newCardinalityBehavior, newCardinalityBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Reference newResource, NotificationChain msgs) {
		Reference oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__RESOURCE, oldResource, newResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Reference newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canonical getDefinitionCanonical() {
		return definitionCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionCanonical(Canonical newDefinitionCanonical, NotificationChain msgs) {
		Canonical oldDefinitionCanonical = definitionCanonical;
		definitionCanonical = newDefinitionCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__DEFINITION_CANONICAL, oldDefinitionCanonical, newDefinitionCanonical);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionCanonical(Canonical newDefinitionCanonical) {
		if (newDefinitionCanonical != definitionCanonical) {
			NotificationChain msgs = null;
			if (definitionCanonical != null)
				msgs = ((InternalEObject)definitionCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__DEFINITION_CANONICAL, null, msgs);
			if (newDefinitionCanonical != null)
				msgs = ((InternalEObject)newDefinitionCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__DEFINITION_CANONICAL, null, msgs);
			msgs = basicSetDefinitionCanonical(newDefinitionCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__DEFINITION_CANONICAL, newDefinitionCanonical, newDefinitionCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getDefinitionUri() {
		return definitionUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionUri(Uri newDefinitionUri, NotificationChain msgs) {
		Uri oldDefinitionUri = definitionUri;
		definitionUri = newDefinitionUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__DEFINITION_URI, oldDefinitionUri, newDefinitionUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionUri(Uri newDefinitionUri) {
		if (newDefinitionUri != definitionUri) {
			NotificationChain msgs = null;
			if (definitionUri != null)
				msgs = ((InternalEObject)definitionUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__DEFINITION_URI, null, msgs);
			if (newDefinitionUri != null)
				msgs = ((InternalEObject)newDefinitionUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__DEFINITION_URI, null, msgs);
			msgs = basicSetDefinitionUri(newDefinitionUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__DEFINITION_URI, newDefinitionUri, newDefinitionUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canonical getTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransform(Canonical newTransform, NotificationChain msgs) {
		Canonical oldTransform = transform;
		transform = newTransform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__TRANSFORM, oldTransform, newTransform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(Canonical newTransform) {
		if (newTransform != transform) {
			NotificationChain msgs = null;
			if (transform != null)
				msgs = ((InternalEObject)transform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__TRANSFORM, null, msgs);
			if (newTransform != null)
				msgs = ((InternalEObject)newTransform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_ORCHESTRATION_ACTION__TRANSFORM, null, msgs);
			msgs = basicSetTransform(newTransform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_ORCHESTRATION_ACTION__TRANSFORM, newTransform, newTransform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequestOrchestrationDynamicValue> getDynamicValue() {
		if (dynamicValue == null) {
			dynamicValue = new EObjectContainmentEList<RequestOrchestrationDynamicValue>(RequestOrchestrationDynamicValue.class, this, FhirPackage.REQUEST_ORCHESTRATION_ACTION__DYNAMIC_VALUE);
		}
		return dynamicValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequestOrchestrationAction> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<RequestOrchestrationAction>(RequestOrchestrationAction.class, this, FhirPackage.REQUEST_ORCHESTRATION_ACTION__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__LINK_ID:
				return basicSetLinkId(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__PREFIX:
				return basicSetPrefix(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TEXT_EQUIVALENT:
				return basicSetTextEquivalent(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__PRIORITY:
				return basicSetPriority(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__GOAL:
				return ((InternalEList<?>)getGoal()).basicRemove(otherEnd, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__CONDITION:
				return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__RELATED_ACTION:
				return ((InternalEList<?>)getRelatedAction()).basicRemove(otherEnd, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_DATE_TIME:
				return basicSetTimingDateTime(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_AGE:
				return basicSetTimingAge(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_PERIOD:
				return basicSetTimingPeriod(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_DURATION:
				return basicSetTimingDuration(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_RANGE:
				return basicSetTimingRange(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_TIMING:
				return basicSetTimingTiming(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__GROUPING_BEHAVIOR:
				return basicSetGroupingBehavior(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__SELECTION_BEHAVIOR:
				return basicSetSelectionBehavior(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__REQUIRED_BEHAVIOR:
				return basicSetRequiredBehavior(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__PRECHECK_BEHAVIOR:
				return basicSetPrecheckBehavior(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__CARDINALITY_BEHAVIOR:
				return basicSetCardinalityBehavior(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__RESOURCE:
				return basicSetResource(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DEFINITION_CANONICAL:
				return basicSetDefinitionCanonical(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DEFINITION_URI:
				return basicSetDefinitionUri(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TRANSFORM:
				return basicSetTransform(null, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DYNAMIC_VALUE:
				return ((InternalEList<?>)getDynamicValue()).basicRemove(otherEnd, msgs);
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__LINK_ID:
				return getLinkId();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__PREFIX:
				return getPrefix();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TITLE:
				return getTitle();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DESCRIPTION:
				return getDescription();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TEXT_EQUIVALENT:
				return getTextEquivalent();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__PRIORITY:
				return getPriority();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__CODE:
				return getCode();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DOCUMENTATION:
				return getDocumentation();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__GOAL:
				return getGoal();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__CONDITION:
				return getCondition();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__INPUT:
				return getInput();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__OUTPUT:
				return getOutput();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__RELATED_ACTION:
				return getRelatedAction();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_DATE_TIME:
				return getTimingDateTime();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_AGE:
				return getTimingAge();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_PERIOD:
				return getTimingPeriod();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_DURATION:
				return getTimingDuration();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_RANGE:
				return getTimingRange();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_TIMING:
				return getTimingTiming();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__LOCATION:
				return getLocation();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__PARTICIPANT:
				return getParticipant();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TYPE:
				return getType();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__GROUPING_BEHAVIOR:
				return getGroupingBehavior();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__SELECTION_BEHAVIOR:
				return getSelectionBehavior();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__REQUIRED_BEHAVIOR:
				return getRequiredBehavior();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__PRECHECK_BEHAVIOR:
				return getPrecheckBehavior();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__CARDINALITY_BEHAVIOR:
				return getCardinalityBehavior();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__RESOURCE:
				return getResource();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DEFINITION_CANONICAL:
				return getDefinitionCanonical();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DEFINITION_URI:
				return getDefinitionUri();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TRANSFORM:
				return getTransform();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DYNAMIC_VALUE:
				return getDynamicValue();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__ACTION:
				return getAction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__LINK_ID:
				setLinkId((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__PREFIX:
				setPrefix((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TEXT_EQUIVALENT:
				setTextEquivalent((Markdown)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__PRIORITY:
				setPriority((RequestPriority)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends RelatedArtifact>)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__GOAL:
				getGoal().clear();
				getGoal().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends RequestOrchestrationCondition>)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends RequestOrchestrationInput>)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends RequestOrchestrationOutput>)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__RELATED_ACTION:
				getRelatedAction().clear();
				getRelatedAction().addAll((Collection<? extends RequestOrchestrationRelatedAction>)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_DATE_TIME:
				setTimingDateTime((DateTime)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_AGE:
				setTimingAge((Age)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_PERIOD:
				setTimingPeriod((Period)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_DURATION:
				setTimingDuration((Duration)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_RANGE:
				setTimingRange((Range)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_TIMING:
				setTimingTiming((Timing)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__LOCATION:
				setLocation((CodeableReference)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends RequestOrchestrationParticipant>)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__GROUPING_BEHAVIOR:
				setGroupingBehavior((ActionGroupingBehavior)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__SELECTION_BEHAVIOR:
				setSelectionBehavior((ActionSelectionBehavior)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__REQUIRED_BEHAVIOR:
				setRequiredBehavior((ActionRequiredBehavior)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__PRECHECK_BEHAVIOR:
				setPrecheckBehavior((ActionPrecheckBehavior)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__CARDINALITY_BEHAVIOR:
				setCardinalityBehavior((ActionCardinalityBehavior)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__RESOURCE:
				setResource((Reference)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DEFINITION_CANONICAL:
				setDefinitionCanonical((Canonical)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DEFINITION_URI:
				setDefinitionUri((Uri)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TRANSFORM:
				setTransform((Canonical)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DYNAMIC_VALUE:
				getDynamicValue().clear();
				getDynamicValue().addAll((Collection<? extends RequestOrchestrationDynamicValue>)newValue);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends RequestOrchestrationAction>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__LINK_ID:
				setLinkId((org.hl7.fhir.String)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__PREFIX:
				setPrefix((org.hl7.fhir.String)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TEXT_EQUIVALENT:
				setTextEquivalent((Markdown)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__PRIORITY:
				setPriority((RequestPriority)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__CODE:
				getCode().clear();
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__GOAL:
				getGoal().clear();
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__CONDITION:
				getCondition().clear();
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__INPUT:
				getInput().clear();
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__OUTPUT:
				getOutput().clear();
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__RELATED_ACTION:
				getRelatedAction().clear();
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_DATE_TIME:
				setTimingDateTime((DateTime)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_AGE:
				setTimingAge((Age)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_PERIOD:
				setTimingPeriod((Period)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_DURATION:
				setTimingDuration((Duration)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_RANGE:
				setTimingRange((Range)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_TIMING:
				setTimingTiming((Timing)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__LOCATION:
				setLocation((CodeableReference)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__PARTICIPANT:
				getParticipant().clear();
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__GROUPING_BEHAVIOR:
				setGroupingBehavior((ActionGroupingBehavior)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__SELECTION_BEHAVIOR:
				setSelectionBehavior((ActionSelectionBehavior)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__REQUIRED_BEHAVIOR:
				setRequiredBehavior((ActionRequiredBehavior)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__PRECHECK_BEHAVIOR:
				setPrecheckBehavior((ActionPrecheckBehavior)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__CARDINALITY_BEHAVIOR:
				setCardinalityBehavior((ActionCardinalityBehavior)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__RESOURCE:
				setResource((Reference)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DEFINITION_CANONICAL:
				setDefinitionCanonical((Canonical)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DEFINITION_URI:
				setDefinitionUri((Uri)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TRANSFORM:
				setTransform((Canonical)null);
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DYNAMIC_VALUE:
				getDynamicValue().clear();
				return;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__ACTION:
				getAction().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__LINK_ID:
				return linkId != null;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__PREFIX:
				return prefix != null;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TITLE:
				return title != null;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DESCRIPTION:
				return description != null;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TEXT_EQUIVALENT:
				return textEquivalent != null;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__PRIORITY:
				return priority != null;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__CODE:
				return code != null && !code.isEmpty();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__GOAL:
				return goal != null && !goal.isEmpty();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__CONDITION:
				return condition != null && !condition.isEmpty();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__INPUT:
				return input != null && !input.isEmpty();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__OUTPUT:
				return output != null && !output.isEmpty();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__RELATED_ACTION:
				return relatedAction != null && !relatedAction.isEmpty();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_DATE_TIME:
				return timingDateTime != null;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_AGE:
				return timingAge != null;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_PERIOD:
				return timingPeriod != null;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_DURATION:
				return timingDuration != null;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_RANGE:
				return timingRange != null;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TIMING_TIMING:
				return timingTiming != null;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__LOCATION:
				return location != null;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TYPE:
				return type != null;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__GROUPING_BEHAVIOR:
				return groupingBehavior != null;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__SELECTION_BEHAVIOR:
				return selectionBehavior != null;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__REQUIRED_BEHAVIOR:
				return requiredBehavior != null;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__PRECHECK_BEHAVIOR:
				return precheckBehavior != null;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__CARDINALITY_BEHAVIOR:
				return cardinalityBehavior != null;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__RESOURCE:
				return resource != null;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DEFINITION_CANONICAL:
				return definitionCanonical != null;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DEFINITION_URI:
				return definitionUri != null;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__TRANSFORM:
				return transform != null;
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__DYNAMIC_VALUE:
				return dynamicValue != null && !dynamicValue.isEmpty();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION__ACTION:
				return action != null && !action.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequestOrchestrationActionImpl
