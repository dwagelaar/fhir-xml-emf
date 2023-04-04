/**
 */
package org.hl7.emf.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.emf.fhir.AdverseEventCausality;
import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adverse Event Causality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventCausalityImpl#getAssessmentMethod <em>Assessment Method</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventCausalityImpl#getEntityRelatedness <em>Entity Relatedness</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.AdverseEventCausalityImpl#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdverseEventCausalityImpl extends BackboneElementImpl implements AdverseEventCausality {
	/**
	 * The cached value of the '{@link #getAssessmentMethod() <em>Assessment Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept assessmentMethod;

	/**
	 * The cached value of the '{@link #getEntityRelatedness() <em>Entity Relatedness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityRelatedness()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept entityRelatedness;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Reference author;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdverseEventCausalityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAdverseEventCausality();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getAssessmentMethod() {
		return assessmentMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssessmentMethod(CodeableConcept newAssessmentMethod, NotificationChain msgs) {
		CodeableConcept oldAssessmentMethod = assessmentMethod;
		assessmentMethod = newAssessmentMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_CAUSALITY__ASSESSMENT_METHOD, oldAssessmentMethod, newAssessmentMethod);
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
	public void setAssessmentMethod(CodeableConcept newAssessmentMethod) {
		if (newAssessmentMethod != assessmentMethod) {
			NotificationChain msgs = null;
			if (assessmentMethod != null)
				msgs = ((InternalEObject)assessmentMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_CAUSALITY__ASSESSMENT_METHOD, null, msgs);
			if (newAssessmentMethod != null)
				msgs = ((InternalEObject)newAssessmentMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_CAUSALITY__ASSESSMENT_METHOD, null, msgs);
			msgs = basicSetAssessmentMethod(newAssessmentMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_CAUSALITY__ASSESSMENT_METHOD, newAssessmentMethod, newAssessmentMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getEntityRelatedness() {
		return entityRelatedness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntityRelatedness(CodeableConcept newEntityRelatedness, NotificationChain msgs) {
		CodeableConcept oldEntityRelatedness = entityRelatedness;
		entityRelatedness = newEntityRelatedness;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_CAUSALITY__ENTITY_RELATEDNESS, oldEntityRelatedness, newEntityRelatedness);
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
	public void setEntityRelatedness(CodeableConcept newEntityRelatedness) {
		if (newEntityRelatedness != entityRelatedness) {
			NotificationChain msgs = null;
			if (entityRelatedness != null)
				msgs = ((InternalEObject)entityRelatedness).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_CAUSALITY__ENTITY_RELATEDNESS, null, msgs);
			if (newEntityRelatedness != null)
				msgs = ((InternalEObject)newEntityRelatedness).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_CAUSALITY__ENTITY_RELATEDNESS, null, msgs);
			msgs = basicSetEntityRelatedness(newEntityRelatedness, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_CAUSALITY__ENTITY_RELATEDNESS, newEntityRelatedness, newEntityRelatedness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(Reference newAuthor, NotificationChain msgs) {
		Reference oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_CAUSALITY__AUTHOR, oldAuthor, newAuthor);
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
	public void setAuthor(Reference newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_CAUSALITY__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_CAUSALITY__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_CAUSALITY__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__ASSESSMENT_METHOD:
				return basicSetAssessmentMethod(null, msgs);
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__ENTITY_RELATEDNESS:
				return basicSetEntityRelatedness(null, msgs);
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__AUTHOR:
				return basicSetAuthor(null, msgs);
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
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__ASSESSMENT_METHOD:
				return getAssessmentMethod();
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__ENTITY_RELATEDNESS:
				return getEntityRelatedness();
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__AUTHOR:
				return getAuthor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__ASSESSMENT_METHOD:
				setAssessmentMethod((CodeableConcept)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__ENTITY_RELATEDNESS:
				setEntityRelatedness((CodeableConcept)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__AUTHOR:
				setAuthor((Reference)newValue);
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
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__ASSESSMENT_METHOD:
				setAssessmentMethod((CodeableConcept)null);
				return;
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__ENTITY_RELATEDNESS:
				setEntityRelatedness((CodeableConcept)null);
				return;
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__AUTHOR:
				setAuthor((Reference)null);
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
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__ASSESSMENT_METHOD:
				return assessmentMethod != null;
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__ENTITY_RELATEDNESS:
				return entityRelatedness != null;
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__AUTHOR:
				return author != null;
		}
		return super.eIsSet(featureID);
	}

} //AdverseEventCausalityImpl
