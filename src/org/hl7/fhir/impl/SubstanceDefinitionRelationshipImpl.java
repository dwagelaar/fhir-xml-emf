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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SubstanceDefinitionRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Definition Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionRelationshipImpl#getSubstanceDefinitionReference <em>Substance Definition Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionRelationshipImpl#getSubstanceDefinitionCodeableConcept <em>Substance Definition Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionRelationshipImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionRelationshipImpl#getIsDefining <em>Is Defining</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionRelationshipImpl#getAmountQuantity <em>Amount Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionRelationshipImpl#getAmountRatio <em>Amount Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionRelationshipImpl#getAmountString <em>Amount String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionRelationshipImpl#getRatioHighLimitAmount <em>Ratio High Limit Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionRelationshipImpl#getComparator <em>Comparator</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceDefinitionRelationshipImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceDefinitionRelationshipImpl extends BackboneElementImpl implements SubstanceDefinitionRelationship {
	/**
	 * The cached value of the '{@link #getSubstanceDefinitionReference() <em>Substance Definition Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceDefinitionReference()
	 * @generated
	 * @ordered
	 */
	protected Reference substanceDefinitionReference;

	/**
	 * The cached value of the '{@link #getSubstanceDefinitionCodeableConcept() <em>Substance Definition Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceDefinitionCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept substanceDefinitionCodeableConcept;

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
	 * The cached value of the '{@link #getIsDefining() <em>Is Defining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefining()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean isDefining;

	/**
	 * The cached value of the '{@link #getAmountQuantity() <em>Amount Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity amountQuantity;

	/**
	 * The cached value of the '{@link #getAmountRatio() <em>Amount Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio amountRatio;

	/**
	 * The cached value of the '{@link #getAmountString() <em>Amount String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String amountString;

	/**
	 * The cached value of the '{@link #getRatioHighLimitAmount() <em>Ratio High Limit Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatioHighLimitAmount()
	 * @generated
	 * @ordered
	 */
	protected Ratio ratioHighLimitAmount;

	/**
	 * The cached value of the '{@link #getComparator() <em>Comparator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparator()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept comparator;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceDefinitionRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceDefinitionRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubstanceDefinitionReference() {
		return substanceDefinitionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstanceDefinitionReference(Reference newSubstanceDefinitionReference, NotificationChain msgs) {
		Reference oldSubstanceDefinitionReference = substanceDefinitionReference;
		substanceDefinitionReference = newSubstanceDefinitionReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCE_DEFINITION_REFERENCE, oldSubstanceDefinitionReference, newSubstanceDefinitionReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstanceDefinitionReference(Reference newSubstanceDefinitionReference) {
		if (newSubstanceDefinitionReference != substanceDefinitionReference) {
			NotificationChain msgs = null;
			if (substanceDefinitionReference != null)
				msgs = ((InternalEObject)substanceDefinitionReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCE_DEFINITION_REFERENCE, null, msgs);
			if (newSubstanceDefinitionReference != null)
				msgs = ((InternalEObject)newSubstanceDefinitionReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCE_DEFINITION_REFERENCE, null, msgs);
			msgs = basicSetSubstanceDefinitionReference(newSubstanceDefinitionReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCE_DEFINITION_REFERENCE, newSubstanceDefinitionReference, newSubstanceDefinitionReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSubstanceDefinitionCodeableConcept() {
		return substanceDefinitionCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstanceDefinitionCodeableConcept(CodeableConcept newSubstanceDefinitionCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldSubstanceDefinitionCodeableConcept = substanceDefinitionCodeableConcept;
		substanceDefinitionCodeableConcept = newSubstanceDefinitionCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCE_DEFINITION_CODEABLE_CONCEPT, oldSubstanceDefinitionCodeableConcept, newSubstanceDefinitionCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstanceDefinitionCodeableConcept(CodeableConcept newSubstanceDefinitionCodeableConcept) {
		if (newSubstanceDefinitionCodeableConcept != substanceDefinitionCodeableConcept) {
			NotificationChain msgs = null;
			if (substanceDefinitionCodeableConcept != null)
				msgs = ((InternalEObject)substanceDefinitionCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCE_DEFINITION_CODEABLE_CONCEPT, null, msgs);
			if (newSubstanceDefinitionCodeableConcept != null)
				msgs = ((InternalEObject)newSubstanceDefinitionCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCE_DEFINITION_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetSubstanceDefinitionCodeableConcept(newSubstanceDefinitionCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCE_DEFINITION_CODEABLE_CONCEPT, newSubstanceDefinitionCodeableConcept, newSubstanceDefinitionCodeableConcept));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getIsDefining() {
		return isDefining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsDefining(org.hl7.fhir.Boolean newIsDefining, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldIsDefining = isDefining;
		isDefining = newIsDefining;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__IS_DEFINING, oldIsDefining, newIsDefining);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDefining(org.hl7.fhir.Boolean newIsDefining) {
		if (newIsDefining != isDefining) {
			NotificationChain msgs = null;
			if (isDefining != null)
				msgs = ((InternalEObject)isDefining).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__IS_DEFINING, null, msgs);
			if (newIsDefining != null)
				msgs = ((InternalEObject)newIsDefining).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__IS_DEFINING, null, msgs);
			msgs = basicSetIsDefining(newIsDefining, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__IS_DEFINING, newIsDefining, newIsDefining));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getAmountQuantity() {
		return amountQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountQuantity(Quantity newAmountQuantity, NotificationChain msgs) {
		Quantity oldAmountQuantity = amountQuantity;
		amountQuantity = newAmountQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_QUANTITY, oldAmountQuantity, newAmountQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountQuantity(Quantity newAmountQuantity) {
		if (newAmountQuantity != amountQuantity) {
			NotificationChain msgs = null;
			if (amountQuantity != null)
				msgs = ((InternalEObject)amountQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_QUANTITY, null, msgs);
			if (newAmountQuantity != null)
				msgs = ((InternalEObject)newAmountQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_QUANTITY, null, msgs);
			msgs = basicSetAmountQuantity(newAmountQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_QUANTITY, newAmountQuantity, newAmountQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getAmountRatio() {
		return amountRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountRatio(Ratio newAmountRatio, NotificationChain msgs) {
		Ratio oldAmountRatio = amountRatio;
		amountRatio = newAmountRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_RATIO, oldAmountRatio, newAmountRatio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountRatio(Ratio newAmountRatio) {
		if (newAmountRatio != amountRatio) {
			NotificationChain msgs = null;
			if (amountRatio != null)
				msgs = ((InternalEObject)amountRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_RATIO, null, msgs);
			if (newAmountRatio != null)
				msgs = ((InternalEObject)newAmountRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_RATIO, null, msgs);
			msgs = basicSetAmountRatio(newAmountRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_RATIO, newAmountRatio, newAmountRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getAmountString() {
		return amountString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountString(org.hl7.fhir.String newAmountString, NotificationChain msgs) {
		org.hl7.fhir.String oldAmountString = amountString;
		amountString = newAmountString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_STRING, oldAmountString, newAmountString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountString(org.hl7.fhir.String newAmountString) {
		if (newAmountString != amountString) {
			NotificationChain msgs = null;
			if (amountString != null)
				msgs = ((InternalEObject)amountString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_STRING, null, msgs);
			if (newAmountString != null)
				msgs = ((InternalEObject)newAmountString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_STRING, null, msgs);
			msgs = basicSetAmountString(newAmountString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_STRING, newAmountString, newAmountString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getRatioHighLimitAmount() {
		return ratioHighLimitAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRatioHighLimitAmount(Ratio newRatioHighLimitAmount, NotificationChain msgs) {
		Ratio oldRatioHighLimitAmount = ratioHighLimitAmount;
		ratioHighLimitAmount = newRatioHighLimitAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__RATIO_HIGH_LIMIT_AMOUNT, oldRatioHighLimitAmount, newRatioHighLimitAmount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatioHighLimitAmount(Ratio newRatioHighLimitAmount) {
		if (newRatioHighLimitAmount != ratioHighLimitAmount) {
			NotificationChain msgs = null;
			if (ratioHighLimitAmount != null)
				msgs = ((InternalEObject)ratioHighLimitAmount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__RATIO_HIGH_LIMIT_AMOUNT, null, msgs);
			if (newRatioHighLimitAmount != null)
				msgs = ((InternalEObject)newRatioHighLimitAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__RATIO_HIGH_LIMIT_AMOUNT, null, msgs);
			msgs = basicSetRatioHighLimitAmount(newRatioHighLimitAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__RATIO_HIGH_LIMIT_AMOUNT, newRatioHighLimitAmount, newRatioHighLimitAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getComparator() {
		return comparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComparator(CodeableConcept newComparator, NotificationChain msgs) {
		CodeableConcept oldComparator = comparator;
		comparator = newComparator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__COMPARATOR, oldComparator, newComparator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparator(CodeableConcept newComparator) {
		if (newComparator != comparator) {
			NotificationChain msgs = null;
			if (comparator != null)
				msgs = ((InternalEObject)comparator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__COMPARATOR, null, msgs);
			if (newComparator != null)
				msgs = ((InternalEObject)newComparator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__COMPARATOR, null, msgs);
			msgs = basicSetComparator(newComparator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__COMPARATOR, newComparator, newComparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCE_DEFINITION_REFERENCE:
				return basicSetSubstanceDefinitionReference(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCE_DEFINITION_CODEABLE_CONCEPT:
				return basicSetSubstanceDefinitionCodeableConcept(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__IS_DEFINING:
				return basicSetIsDefining(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_QUANTITY:
				return basicSetAmountQuantity(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_RATIO:
				return basicSetAmountRatio(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_STRING:
				return basicSetAmountString(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__RATIO_HIGH_LIMIT_AMOUNT:
				return basicSetRatioHighLimitAmount(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__COMPARATOR:
				return basicSetComparator(null, msgs);
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCE_DEFINITION_REFERENCE:
				return getSubstanceDefinitionReference();
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCE_DEFINITION_CODEABLE_CONCEPT:
				return getSubstanceDefinitionCodeableConcept();
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__TYPE:
				return getType();
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__IS_DEFINING:
				return getIsDefining();
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_QUANTITY:
				return getAmountQuantity();
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_RATIO:
				return getAmountRatio();
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_STRING:
				return getAmountString();
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__RATIO_HIGH_LIMIT_AMOUNT:
				return getRatioHighLimitAmount();
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__COMPARATOR:
				return getComparator();
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SOURCE:
				return getSource();
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
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCE_DEFINITION_REFERENCE:
				setSubstanceDefinitionReference((Reference)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCE_DEFINITION_CODEABLE_CONCEPT:
				setSubstanceDefinitionCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__IS_DEFINING:
				setIsDefining((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_QUANTITY:
				setAmountQuantity((Quantity)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_RATIO:
				setAmountRatio((Ratio)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_STRING:
				setAmountString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__RATIO_HIGH_LIMIT_AMOUNT:
				setRatioHighLimitAmount((Ratio)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__COMPARATOR:
				setComparator((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCE_DEFINITION_REFERENCE:
				setSubstanceDefinitionReference((Reference)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCE_DEFINITION_CODEABLE_CONCEPT:
				setSubstanceDefinitionCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__IS_DEFINING:
				setIsDefining((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_QUANTITY:
				setAmountQuantity((Quantity)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_RATIO:
				setAmountRatio((Ratio)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_STRING:
				setAmountString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__RATIO_HIGH_LIMIT_AMOUNT:
				setRatioHighLimitAmount((Ratio)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__COMPARATOR:
				setComparator((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SOURCE:
				getSource().clear();
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
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCE_DEFINITION_REFERENCE:
				return substanceDefinitionReference != null;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCE_DEFINITION_CODEABLE_CONCEPT:
				return substanceDefinitionCodeableConcept != null;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__TYPE:
				return type != null;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__IS_DEFINING:
				return isDefining != null;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_QUANTITY:
				return amountQuantity != null;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_RATIO:
				return amountRatio != null;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_STRING:
				return amountString != null;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__RATIO_HIGH_LIMIT_AMOUNT:
				return ratioHighLimitAmount != null;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__COMPARATOR:
				return comparator != null;
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SOURCE:
				return source != null && !source.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceDefinitionRelationshipImpl
