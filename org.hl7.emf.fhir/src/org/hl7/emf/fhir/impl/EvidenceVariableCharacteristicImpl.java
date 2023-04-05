/**
 */
package org.hl7.emf.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.emf.fhir.Annotation;
import org.hl7.emf.fhir.Canonical;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.EvidenceVariableCharacteristic;
import org.hl7.emf.fhir.EvidenceVariableDefinitionByCombination;
import org.hl7.emf.fhir.EvidenceVariableDefinitionByTypeAndValue;
import org.hl7.emf.fhir.EvidenceVariableTimeFromEvent;
import org.hl7.emf.fhir.Expression;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Id;
import org.hl7.emf.fhir.Markdown;
import org.hl7.emf.fhir.Quantity;
import org.hl7.emf.fhir.Range;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence Variable Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableCharacteristicImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableCharacteristicImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableCharacteristicImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableCharacteristicImpl#getExclude <em>Exclude</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableCharacteristicImpl#getDefinitionReference <em>Definition Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableCharacteristicImpl#getDefinitionCanonical <em>Definition Canonical</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableCharacteristicImpl#getDefinitionCodeableConcept <em>Definition Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableCharacteristicImpl#getDefinitionExpression <em>Definition Expression</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableCharacteristicImpl#getDefinitionId <em>Definition Id</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableCharacteristicImpl#getDefinitionByTypeAndValue <em>Definition By Type And Value</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableCharacteristicImpl#getDefinitionByCombination <em>Definition By Combination</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableCharacteristicImpl#getInstancesQuantity <em>Instances Quantity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableCharacteristicImpl#getInstancesRange <em>Instances Range</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableCharacteristicImpl#getDurationQuantity <em>Duration Quantity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableCharacteristicImpl#getDurationRange <em>Duration Range</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.EvidenceVariableCharacteristicImpl#getTimeFromEvent <em>Time From Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceVariableCharacteristicImpl extends BackboneElementImpl implements EvidenceVariableCharacteristic {
	/**
	 * The cached value of the '{@link #getLinkId() <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkId()
	 * @generated
	 * @ordered
	 */
	protected Id linkId;

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
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * The cached value of the '{@link #getExclude() <em>Exclude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.Boolean exclude;

	/**
	 * The cached value of the '{@link #getDefinitionReference() <em>Definition Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionReference()
	 * @generated
	 * @ordered
	 */
	protected Reference definitionReference;

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
	 * The cached value of the '{@link #getDefinitionCodeableConcept() <em>Definition Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept definitionCodeableConcept;

	/**
	 * The cached value of the '{@link #getDefinitionExpression() <em>Definition Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression definitionExpression;

	/**
	 * The cached value of the '{@link #getDefinitionId() <em>Definition Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionId()
	 * @generated
	 * @ordered
	 */
	protected Id definitionId;

	/**
	 * The cached value of the '{@link #getDefinitionByTypeAndValue() <em>Definition By Type And Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionByTypeAndValue()
	 * @generated
	 * @ordered
	 */
	protected EvidenceVariableDefinitionByTypeAndValue definitionByTypeAndValue;

	/**
	 * The cached value of the '{@link #getDefinitionByCombination() <em>Definition By Combination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionByCombination()
	 * @generated
	 * @ordered
	 */
	protected EvidenceVariableDefinitionByCombination definitionByCombination;

	/**
	 * The cached value of the '{@link #getInstancesQuantity() <em>Instances Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstancesQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity instancesQuantity;

	/**
	 * The cached value of the '{@link #getInstancesRange() <em>Instances Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstancesRange()
	 * @generated
	 * @ordered
	 */
	protected Range instancesRange;

	/**
	 * The cached value of the '{@link #getDurationQuantity() <em>Duration Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity durationQuantity;

	/**
	 * The cached value of the '{@link #getDurationRange() <em>Duration Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationRange()
	 * @generated
	 * @ordered
	 */
	protected Range durationRange;

	/**
	 * The cached value of the '{@link #getTimeFromEvent() <em>Time From Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFromEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<EvidenceVariableTimeFromEvent> timeFromEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceVariableCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEvidenceVariableCharacteristic();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getLinkId() {
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkId(Id newLinkId, NotificationChain msgs) {
		Id oldLinkId = linkId;
		linkId = newLinkId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__LINK_ID, oldLinkId, newLinkId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkId(Id newLinkId) {
		if (newLinkId != linkId) {
			NotificationChain msgs = null;
			if (linkId != null)
				msgs = ((InternalEObject)linkId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__LINK_ID, null, msgs);
			if (newLinkId != null)
				msgs = ((InternalEObject)newLinkId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__LINK_ID, null, msgs);
			msgs = basicSetLinkId(newLinkId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__LINK_ID, newLinkId, newLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.Boolean getExclude() {
		return exclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExclude(org.hl7.emf.fhir.Boolean newExclude, NotificationChain msgs) {
		org.hl7.emf.fhir.Boolean oldExclude = exclude;
		exclude = newExclude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE, oldExclude, newExclude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExclude(org.hl7.emf.fhir.Boolean newExclude) {
		if (newExclude != exclude) {
			NotificationChain msgs = null;
			if (exclude != null)
				msgs = ((InternalEObject)exclude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE, null, msgs);
			if (newExclude != null)
				msgs = ((InternalEObject)newExclude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE, null, msgs);
			msgs = basicSetExclude(newExclude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE, newExclude, newExclude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getDefinitionReference() {
		return definitionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionReference(Reference newDefinitionReference, NotificationChain msgs) {
		Reference oldDefinitionReference = definitionReference;
		definitionReference = newDefinitionReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE, oldDefinitionReference, newDefinitionReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitionReference(Reference newDefinitionReference) {
		if (newDefinitionReference != definitionReference) {
			NotificationChain msgs = null;
			if (definitionReference != null)
				msgs = ((InternalEObject)definitionReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE, null, msgs);
			if (newDefinitionReference != null)
				msgs = ((InternalEObject)newDefinitionReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE, null, msgs);
			msgs = basicSetDefinitionReference(newDefinitionReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE, newDefinitionReference, newDefinitionReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL, oldDefinitionCanonical, newDefinitionCanonical);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitionCanonical(Canonical newDefinitionCanonical) {
		if (newDefinitionCanonical != definitionCanonical) {
			NotificationChain msgs = null;
			if (definitionCanonical != null)
				msgs = ((InternalEObject)definitionCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL, null, msgs);
			if (newDefinitionCanonical != null)
				msgs = ((InternalEObject)newDefinitionCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL, null, msgs);
			msgs = basicSetDefinitionCanonical(newDefinitionCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL, newDefinitionCanonical, newDefinitionCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDefinitionCodeableConcept() {
		return definitionCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionCodeableConcept(CodeableConcept newDefinitionCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldDefinitionCodeableConcept = definitionCodeableConcept;
		definitionCodeableConcept = newDefinitionCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT, oldDefinitionCodeableConcept, newDefinitionCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitionCodeableConcept(CodeableConcept newDefinitionCodeableConcept) {
		if (newDefinitionCodeableConcept != definitionCodeableConcept) {
			NotificationChain msgs = null;
			if (definitionCodeableConcept != null)
				msgs = ((InternalEObject)definitionCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT, null, msgs);
			if (newDefinitionCodeableConcept != null)
				msgs = ((InternalEObject)newDefinitionCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetDefinitionCodeableConcept(newDefinitionCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT, newDefinitionCodeableConcept, newDefinitionCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getDefinitionExpression() {
		return definitionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionExpression(Expression newDefinitionExpression, NotificationChain msgs) {
		Expression oldDefinitionExpression = definitionExpression;
		definitionExpression = newDefinitionExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION, oldDefinitionExpression, newDefinitionExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitionExpression(Expression newDefinitionExpression) {
		if (newDefinitionExpression != definitionExpression) {
			NotificationChain msgs = null;
			if (definitionExpression != null)
				msgs = ((InternalEObject)definitionExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION, null, msgs);
			if (newDefinitionExpression != null)
				msgs = ((InternalEObject)newDefinitionExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION, null, msgs);
			msgs = basicSetDefinitionExpression(newDefinitionExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION, newDefinitionExpression, newDefinitionExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getDefinitionId() {
		return definitionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionId(Id newDefinitionId, NotificationChain msgs) {
		Id oldDefinitionId = definitionId;
		definitionId = newDefinitionId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_ID, oldDefinitionId, newDefinitionId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitionId(Id newDefinitionId) {
		if (newDefinitionId != definitionId) {
			NotificationChain msgs = null;
			if (definitionId != null)
				msgs = ((InternalEObject)definitionId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_ID, null, msgs);
			if (newDefinitionId != null)
				msgs = ((InternalEObject)newDefinitionId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_ID, null, msgs);
			msgs = basicSetDefinitionId(newDefinitionId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_ID, newDefinitionId, newDefinitionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EvidenceVariableDefinitionByTypeAndValue getDefinitionByTypeAndValue() {
		return definitionByTypeAndValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionByTypeAndValue(EvidenceVariableDefinitionByTypeAndValue newDefinitionByTypeAndValue, NotificationChain msgs) {
		EvidenceVariableDefinitionByTypeAndValue oldDefinitionByTypeAndValue = definitionByTypeAndValue;
		definitionByTypeAndValue = newDefinitionByTypeAndValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_BY_TYPE_AND_VALUE, oldDefinitionByTypeAndValue, newDefinitionByTypeAndValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitionByTypeAndValue(EvidenceVariableDefinitionByTypeAndValue newDefinitionByTypeAndValue) {
		if (newDefinitionByTypeAndValue != definitionByTypeAndValue) {
			NotificationChain msgs = null;
			if (definitionByTypeAndValue != null)
				msgs = ((InternalEObject)definitionByTypeAndValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_BY_TYPE_AND_VALUE, null, msgs);
			if (newDefinitionByTypeAndValue != null)
				msgs = ((InternalEObject)newDefinitionByTypeAndValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_BY_TYPE_AND_VALUE, null, msgs);
			msgs = basicSetDefinitionByTypeAndValue(newDefinitionByTypeAndValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_BY_TYPE_AND_VALUE, newDefinitionByTypeAndValue, newDefinitionByTypeAndValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EvidenceVariableDefinitionByCombination getDefinitionByCombination() {
		return definitionByCombination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionByCombination(EvidenceVariableDefinitionByCombination newDefinitionByCombination, NotificationChain msgs) {
		EvidenceVariableDefinitionByCombination oldDefinitionByCombination = definitionByCombination;
		definitionByCombination = newDefinitionByCombination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_BY_COMBINATION, oldDefinitionByCombination, newDefinitionByCombination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitionByCombination(EvidenceVariableDefinitionByCombination newDefinitionByCombination) {
		if (newDefinitionByCombination != definitionByCombination) {
			NotificationChain msgs = null;
			if (definitionByCombination != null)
				msgs = ((InternalEObject)definitionByCombination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_BY_COMBINATION, null, msgs);
			if (newDefinitionByCombination != null)
				msgs = ((InternalEObject)newDefinitionByCombination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_BY_COMBINATION, null, msgs);
			msgs = basicSetDefinitionByCombination(newDefinitionByCombination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_BY_COMBINATION, newDefinitionByCombination, newDefinitionByCombination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getInstancesQuantity() {
		return instancesQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstancesQuantity(Quantity newInstancesQuantity, NotificationChain msgs) {
		Quantity oldInstancesQuantity = instancesQuantity;
		instancesQuantity = newInstancesQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__INSTANCES_QUANTITY, oldInstancesQuantity, newInstancesQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstancesQuantity(Quantity newInstancesQuantity) {
		if (newInstancesQuantity != instancesQuantity) {
			NotificationChain msgs = null;
			if (instancesQuantity != null)
				msgs = ((InternalEObject)instancesQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__INSTANCES_QUANTITY, null, msgs);
			if (newInstancesQuantity != null)
				msgs = ((InternalEObject)newInstancesQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__INSTANCES_QUANTITY, null, msgs);
			msgs = basicSetInstancesQuantity(newInstancesQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__INSTANCES_QUANTITY, newInstancesQuantity, newInstancesQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getInstancesRange() {
		return instancesRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstancesRange(Range newInstancesRange, NotificationChain msgs) {
		Range oldInstancesRange = instancesRange;
		instancesRange = newInstancesRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__INSTANCES_RANGE, oldInstancesRange, newInstancesRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstancesRange(Range newInstancesRange) {
		if (newInstancesRange != instancesRange) {
			NotificationChain msgs = null;
			if (instancesRange != null)
				msgs = ((InternalEObject)instancesRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__INSTANCES_RANGE, null, msgs);
			if (newInstancesRange != null)
				msgs = ((InternalEObject)newInstancesRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__INSTANCES_RANGE, null, msgs);
			msgs = basicSetInstancesRange(newInstancesRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__INSTANCES_RANGE, newInstancesRange, newInstancesRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getDurationQuantity() {
		return durationQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDurationQuantity(Quantity newDurationQuantity, NotificationChain msgs) {
		Quantity oldDurationQuantity = durationQuantity;
		durationQuantity = newDurationQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DURATION_QUANTITY, oldDurationQuantity, newDurationQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDurationQuantity(Quantity newDurationQuantity) {
		if (newDurationQuantity != durationQuantity) {
			NotificationChain msgs = null;
			if (durationQuantity != null)
				msgs = ((InternalEObject)durationQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DURATION_QUANTITY, null, msgs);
			if (newDurationQuantity != null)
				msgs = ((InternalEObject)newDurationQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DURATION_QUANTITY, null, msgs);
			msgs = basicSetDurationQuantity(newDurationQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DURATION_QUANTITY, newDurationQuantity, newDurationQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getDurationRange() {
		return durationRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDurationRange(Range newDurationRange, NotificationChain msgs) {
		Range oldDurationRange = durationRange;
		durationRange = newDurationRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DURATION_RANGE, oldDurationRange, newDurationRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDurationRange(Range newDurationRange) {
		if (newDurationRange != durationRange) {
			NotificationChain msgs = null;
			if (durationRange != null)
				msgs = ((InternalEObject)durationRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DURATION_RANGE, null, msgs);
			if (newDurationRange != null)
				msgs = ((InternalEObject)newDurationRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DURATION_RANGE, null, msgs);
			msgs = basicSetDurationRange(newDurationRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DURATION_RANGE, newDurationRange, newDurationRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EvidenceVariableTimeFromEvent> getTimeFromEvent() {
		if (timeFromEvent == null) {
			timeFromEvent = new EObjectContainmentEList<EvidenceVariableTimeFromEvent>(EvidenceVariableTimeFromEvent.class, this, FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_EVENT);
		}
		return timeFromEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__LINK_ID:
				return basicSetLinkId(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE:
				return basicSetExclude(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE:
				return basicSetDefinitionReference(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL:
				return basicSetDefinitionCanonical(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT:
				return basicSetDefinitionCodeableConcept(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION:
				return basicSetDefinitionExpression(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_ID:
				return basicSetDefinitionId(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_BY_TYPE_AND_VALUE:
				return basicSetDefinitionByTypeAndValue(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_BY_COMBINATION:
				return basicSetDefinitionByCombination(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__INSTANCES_QUANTITY:
				return basicSetInstancesQuantity(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__INSTANCES_RANGE:
				return basicSetInstancesRange(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DURATION_QUANTITY:
				return basicSetDurationQuantity(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DURATION_RANGE:
				return basicSetDurationRange(null, msgs);
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_EVENT:
				return ((InternalEList<?>)getTimeFromEvent()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__LINK_ID:
				return getLinkId();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION:
				return getDescription();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__NOTE:
				return getNote();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE:
				return getExclude();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE:
				return getDefinitionReference();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL:
				return getDefinitionCanonical();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT:
				return getDefinitionCodeableConcept();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION:
				return getDefinitionExpression();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_ID:
				return getDefinitionId();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_BY_TYPE_AND_VALUE:
				return getDefinitionByTypeAndValue();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_BY_COMBINATION:
				return getDefinitionByCombination();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__INSTANCES_QUANTITY:
				return getInstancesQuantity();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__INSTANCES_RANGE:
				return getInstancesRange();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DURATION_QUANTITY:
				return getDurationQuantity();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DURATION_RANGE:
				return getDurationRange();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_EVENT:
				return getTimeFromEvent();
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
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__LINK_ID:
				setLinkId((Id)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE:
				setExclude((org.hl7.emf.fhir.Boolean)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE:
				setDefinitionReference((Reference)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL:
				setDefinitionCanonical((Canonical)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT:
				setDefinitionCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION:
				setDefinitionExpression((Expression)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_ID:
				setDefinitionId((Id)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_BY_TYPE_AND_VALUE:
				setDefinitionByTypeAndValue((EvidenceVariableDefinitionByTypeAndValue)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_BY_COMBINATION:
				setDefinitionByCombination((EvidenceVariableDefinitionByCombination)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__INSTANCES_QUANTITY:
				setInstancesQuantity((Quantity)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__INSTANCES_RANGE:
				setInstancesRange((Range)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DURATION_QUANTITY:
				setDurationQuantity((Quantity)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DURATION_RANGE:
				setDurationRange((Range)newValue);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_EVENT:
				getTimeFromEvent().clear();
				getTimeFromEvent().addAll((Collection<? extends EvidenceVariableTimeFromEvent>)newValue);
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
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__LINK_ID:
				setLinkId((Id)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__NOTE:
				getNote().clear();
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE:
				setExclude((org.hl7.emf.fhir.Boolean)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE:
				setDefinitionReference((Reference)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL:
				setDefinitionCanonical((Canonical)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT:
				setDefinitionCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION:
				setDefinitionExpression((Expression)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_ID:
				setDefinitionId((Id)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_BY_TYPE_AND_VALUE:
				setDefinitionByTypeAndValue((EvidenceVariableDefinitionByTypeAndValue)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_BY_COMBINATION:
				setDefinitionByCombination((EvidenceVariableDefinitionByCombination)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__INSTANCES_QUANTITY:
				setInstancesQuantity((Quantity)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__INSTANCES_RANGE:
				setInstancesRange((Range)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DURATION_QUANTITY:
				setDurationQuantity((Quantity)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DURATION_RANGE:
				setDurationRange((Range)null);
				return;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_EVENT:
				getTimeFromEvent().clear();
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
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__LINK_ID:
				return linkId != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION:
				return description != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE:
				return exclude != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_REFERENCE:
				return definitionReference != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CANONICAL:
				return definitionCanonical != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_CODEABLE_CONCEPT:
				return definitionCodeableConcept != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_EXPRESSION:
				return definitionExpression != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_ID:
				return definitionId != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_BY_TYPE_AND_VALUE:
				return definitionByTypeAndValue != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITION_BY_COMBINATION:
				return definitionByCombination != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__INSTANCES_QUANTITY:
				return instancesQuantity != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__INSTANCES_RANGE:
				return instancesRange != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DURATION_QUANTITY:
				return durationQuantity != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DURATION_RANGE:
				return durationRange != null;
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_EVENT:
				return timeFromEvent != null && !timeFromEvent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvidenceVariableCharacteristicImpl
