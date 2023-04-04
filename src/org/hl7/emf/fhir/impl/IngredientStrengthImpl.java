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

import org.hl7.emf.fhir.CodeableConcept;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.IngredientReferenceStrength;
import org.hl7.emf.fhir.IngredientStrength;
import org.hl7.emf.fhir.Quantity;
import org.hl7.emf.fhir.Ratio;
import org.hl7.emf.fhir.RatioRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ingredient Strength</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.IngredientStrengthImpl#getPresentationRatio <em>Presentation Ratio</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.IngredientStrengthImpl#getPresentationRatioRange <em>Presentation Ratio Range</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.IngredientStrengthImpl#getPresentationCodeableConcept <em>Presentation Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.IngredientStrengthImpl#getPresentationQuantity <em>Presentation Quantity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.IngredientStrengthImpl#getTextPresentation <em>Text Presentation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.IngredientStrengthImpl#getConcentrationRatio <em>Concentration Ratio</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.IngredientStrengthImpl#getConcentrationRatioRange <em>Concentration Ratio Range</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.IngredientStrengthImpl#getConcentrationCodeableConcept <em>Concentration Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.IngredientStrengthImpl#getConcentrationQuantity <em>Concentration Quantity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.IngredientStrengthImpl#getTextConcentration <em>Text Concentration</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.IngredientStrengthImpl#getBasis <em>Basis</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.IngredientStrengthImpl#getMeasurementPoint <em>Measurement Point</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.IngredientStrengthImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.IngredientStrengthImpl#getReferenceStrength <em>Reference Strength</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IngredientStrengthImpl extends BackboneElementImpl implements IngredientStrength {
	/**
	 * The cached value of the '{@link #getPresentationRatio() <em>Presentation Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio presentationRatio;

	/**
	 * The cached value of the '{@link #getPresentationRatioRange() <em>Presentation Ratio Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationRatioRange()
	 * @generated
	 * @ordered
	 */
	protected RatioRange presentationRatioRange;

	/**
	 * The cached value of the '{@link #getPresentationCodeableConcept() <em>Presentation Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept presentationCodeableConcept;

	/**
	 * The cached value of the '{@link #getPresentationQuantity() <em>Presentation Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity presentationQuantity;

	/**
	 * The cached value of the '{@link #getTextPresentation() <em>Text Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPresentation()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String textPresentation;

	/**
	 * The cached value of the '{@link #getConcentrationRatio() <em>Concentration Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcentrationRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio concentrationRatio;

	/**
	 * The cached value of the '{@link #getConcentrationRatioRange() <em>Concentration Ratio Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcentrationRatioRange()
	 * @generated
	 * @ordered
	 */
	protected RatioRange concentrationRatioRange;

	/**
	 * The cached value of the '{@link #getConcentrationCodeableConcept() <em>Concentration Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcentrationCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept concentrationCodeableConcept;

	/**
	 * The cached value of the '{@link #getConcentrationQuantity() <em>Concentration Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcentrationQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity concentrationQuantity;

	/**
	 * The cached value of the '{@link #getTextConcentration() <em>Text Concentration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextConcentration()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String textConcentration;

	/**
	 * The cached value of the '{@link #getBasis() <em>Basis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasis()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept basis;

	/**
	 * The cached value of the '{@link #getMeasurementPoint() <em>Measurement Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementPoint()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.emf.fhir.String measurementPoint;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> country;

	/**
	 * The cached value of the '{@link #getReferenceStrength() <em>Reference Strength</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceStrength()
	 * @generated
	 * @ordered
	 */
	protected EList<IngredientReferenceStrength> referenceStrength;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IngredientStrengthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getIngredientStrength();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getPresentationRatio() {
		return presentationRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentationRatio(Ratio newPresentationRatio, NotificationChain msgs) {
		Ratio oldPresentationRatio = presentationRatio;
		presentationRatio = newPresentationRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_RATIO, oldPresentationRatio, newPresentationRatio);
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
	public void setPresentationRatio(Ratio newPresentationRatio) {
		if (newPresentationRatio != presentationRatio) {
			NotificationChain msgs = null;
			if (presentationRatio != null)
				msgs = ((InternalEObject)presentationRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_RATIO, null, msgs);
			if (newPresentationRatio != null)
				msgs = ((InternalEObject)newPresentationRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_RATIO, null, msgs);
			msgs = basicSetPresentationRatio(newPresentationRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_RATIO, newPresentationRatio, newPresentationRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RatioRange getPresentationRatioRange() {
		return presentationRatioRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentationRatioRange(RatioRange newPresentationRatioRange, NotificationChain msgs) {
		RatioRange oldPresentationRatioRange = presentationRatioRange;
		presentationRatioRange = newPresentationRatioRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_RATIO_RANGE, oldPresentationRatioRange, newPresentationRatioRange);
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
	public void setPresentationRatioRange(RatioRange newPresentationRatioRange) {
		if (newPresentationRatioRange != presentationRatioRange) {
			NotificationChain msgs = null;
			if (presentationRatioRange != null)
				msgs = ((InternalEObject)presentationRatioRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_RATIO_RANGE, null, msgs);
			if (newPresentationRatioRange != null)
				msgs = ((InternalEObject)newPresentationRatioRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_RATIO_RANGE, null, msgs);
			msgs = basicSetPresentationRatioRange(newPresentationRatioRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_RATIO_RANGE, newPresentationRatioRange, newPresentationRatioRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPresentationCodeableConcept() {
		return presentationCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentationCodeableConcept(CodeableConcept newPresentationCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldPresentationCodeableConcept = presentationCodeableConcept;
		presentationCodeableConcept = newPresentationCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_CODEABLE_CONCEPT, oldPresentationCodeableConcept, newPresentationCodeableConcept);
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
	public void setPresentationCodeableConcept(CodeableConcept newPresentationCodeableConcept) {
		if (newPresentationCodeableConcept != presentationCodeableConcept) {
			NotificationChain msgs = null;
			if (presentationCodeableConcept != null)
				msgs = ((InternalEObject)presentationCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_CODEABLE_CONCEPT, null, msgs);
			if (newPresentationCodeableConcept != null)
				msgs = ((InternalEObject)newPresentationCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetPresentationCodeableConcept(newPresentationCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_CODEABLE_CONCEPT, newPresentationCodeableConcept, newPresentationCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getPresentationQuantity() {
		return presentationQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentationQuantity(Quantity newPresentationQuantity, NotificationChain msgs) {
		Quantity oldPresentationQuantity = presentationQuantity;
		presentationQuantity = newPresentationQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_QUANTITY, oldPresentationQuantity, newPresentationQuantity);
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
	public void setPresentationQuantity(Quantity newPresentationQuantity) {
		if (newPresentationQuantity != presentationQuantity) {
			NotificationChain msgs = null;
			if (presentationQuantity != null)
				msgs = ((InternalEObject)presentationQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_QUANTITY, null, msgs);
			if (newPresentationQuantity != null)
				msgs = ((InternalEObject)newPresentationQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_QUANTITY, null, msgs);
			msgs = basicSetPresentationQuantity(newPresentationQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_QUANTITY, newPresentationQuantity, newPresentationQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getTextPresentation() {
		return textPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextPresentation(org.hl7.emf.fhir.String newTextPresentation, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldTextPresentation = textPresentation;
		textPresentation = newTextPresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_STRENGTH__TEXT_PRESENTATION, oldTextPresentation, newTextPresentation);
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
	public void setTextPresentation(org.hl7.emf.fhir.String newTextPresentation) {
		if (newTextPresentation != textPresentation) {
			NotificationChain msgs = null;
			if (textPresentation != null)
				msgs = ((InternalEObject)textPresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_STRENGTH__TEXT_PRESENTATION, null, msgs);
			if (newTextPresentation != null)
				msgs = ((InternalEObject)newTextPresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_STRENGTH__TEXT_PRESENTATION, null, msgs);
			msgs = basicSetTextPresentation(newTextPresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_STRENGTH__TEXT_PRESENTATION, newTextPresentation, newTextPresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getConcentrationRatio() {
		return concentrationRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcentrationRatio(Ratio newConcentrationRatio, NotificationChain msgs) {
		Ratio oldConcentrationRatio = concentrationRatio;
		concentrationRatio = newConcentrationRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_RATIO, oldConcentrationRatio, newConcentrationRatio);
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
	public void setConcentrationRatio(Ratio newConcentrationRatio) {
		if (newConcentrationRatio != concentrationRatio) {
			NotificationChain msgs = null;
			if (concentrationRatio != null)
				msgs = ((InternalEObject)concentrationRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_RATIO, null, msgs);
			if (newConcentrationRatio != null)
				msgs = ((InternalEObject)newConcentrationRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_RATIO, null, msgs);
			msgs = basicSetConcentrationRatio(newConcentrationRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_RATIO, newConcentrationRatio, newConcentrationRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RatioRange getConcentrationRatioRange() {
		return concentrationRatioRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcentrationRatioRange(RatioRange newConcentrationRatioRange, NotificationChain msgs) {
		RatioRange oldConcentrationRatioRange = concentrationRatioRange;
		concentrationRatioRange = newConcentrationRatioRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_RATIO_RANGE, oldConcentrationRatioRange, newConcentrationRatioRange);
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
	public void setConcentrationRatioRange(RatioRange newConcentrationRatioRange) {
		if (newConcentrationRatioRange != concentrationRatioRange) {
			NotificationChain msgs = null;
			if (concentrationRatioRange != null)
				msgs = ((InternalEObject)concentrationRatioRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_RATIO_RANGE, null, msgs);
			if (newConcentrationRatioRange != null)
				msgs = ((InternalEObject)newConcentrationRatioRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_RATIO_RANGE, null, msgs);
			msgs = basicSetConcentrationRatioRange(newConcentrationRatioRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_RATIO_RANGE, newConcentrationRatioRange, newConcentrationRatioRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getConcentrationCodeableConcept() {
		return concentrationCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcentrationCodeableConcept(CodeableConcept newConcentrationCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldConcentrationCodeableConcept = concentrationCodeableConcept;
		concentrationCodeableConcept = newConcentrationCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_CODEABLE_CONCEPT, oldConcentrationCodeableConcept, newConcentrationCodeableConcept);
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
	public void setConcentrationCodeableConcept(CodeableConcept newConcentrationCodeableConcept) {
		if (newConcentrationCodeableConcept != concentrationCodeableConcept) {
			NotificationChain msgs = null;
			if (concentrationCodeableConcept != null)
				msgs = ((InternalEObject)concentrationCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_CODEABLE_CONCEPT, null, msgs);
			if (newConcentrationCodeableConcept != null)
				msgs = ((InternalEObject)newConcentrationCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetConcentrationCodeableConcept(newConcentrationCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_CODEABLE_CONCEPT, newConcentrationCodeableConcept, newConcentrationCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getConcentrationQuantity() {
		return concentrationQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcentrationQuantity(Quantity newConcentrationQuantity, NotificationChain msgs) {
		Quantity oldConcentrationQuantity = concentrationQuantity;
		concentrationQuantity = newConcentrationQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_QUANTITY, oldConcentrationQuantity, newConcentrationQuantity);
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
	public void setConcentrationQuantity(Quantity newConcentrationQuantity) {
		if (newConcentrationQuantity != concentrationQuantity) {
			NotificationChain msgs = null;
			if (concentrationQuantity != null)
				msgs = ((InternalEObject)concentrationQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_QUANTITY, null, msgs);
			if (newConcentrationQuantity != null)
				msgs = ((InternalEObject)newConcentrationQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_QUANTITY, null, msgs);
			msgs = basicSetConcentrationQuantity(newConcentrationQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_QUANTITY, newConcentrationQuantity, newConcentrationQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getTextConcentration() {
		return textConcentration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextConcentration(org.hl7.emf.fhir.String newTextConcentration, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldTextConcentration = textConcentration;
		textConcentration = newTextConcentration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_STRENGTH__TEXT_CONCENTRATION, oldTextConcentration, newTextConcentration);
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
	public void setTextConcentration(org.hl7.emf.fhir.String newTextConcentration) {
		if (newTextConcentration != textConcentration) {
			NotificationChain msgs = null;
			if (textConcentration != null)
				msgs = ((InternalEObject)textConcentration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_STRENGTH__TEXT_CONCENTRATION, null, msgs);
			if (newTextConcentration != null)
				msgs = ((InternalEObject)newTextConcentration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_STRENGTH__TEXT_CONCENTRATION, null, msgs);
			msgs = basicSetTextConcentration(newTextConcentration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_STRENGTH__TEXT_CONCENTRATION, newTextConcentration, newTextConcentration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getBasis() {
		return basis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasis(CodeableConcept newBasis, NotificationChain msgs) {
		CodeableConcept oldBasis = basis;
		basis = newBasis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_STRENGTH__BASIS, oldBasis, newBasis);
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
	public void setBasis(CodeableConcept newBasis) {
		if (newBasis != basis) {
			NotificationChain msgs = null;
			if (basis != null)
				msgs = ((InternalEObject)basis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_STRENGTH__BASIS, null, msgs);
			if (newBasis != null)
				msgs = ((InternalEObject)newBasis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_STRENGTH__BASIS, null, msgs);
			msgs = basicSetBasis(newBasis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_STRENGTH__BASIS, newBasis, newBasis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.emf.fhir.String getMeasurementPoint() {
		return measurementPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementPoint(org.hl7.emf.fhir.String newMeasurementPoint, NotificationChain msgs) {
		org.hl7.emf.fhir.String oldMeasurementPoint = measurementPoint;
		measurementPoint = newMeasurementPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_STRENGTH__MEASUREMENT_POINT, oldMeasurementPoint, newMeasurementPoint);
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
	public void setMeasurementPoint(org.hl7.emf.fhir.String newMeasurementPoint) {
		if (newMeasurementPoint != measurementPoint) {
			NotificationChain msgs = null;
			if (measurementPoint != null)
				msgs = ((InternalEObject)measurementPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_STRENGTH__MEASUREMENT_POINT, null, msgs);
			if (newMeasurementPoint != null)
				msgs = ((InternalEObject)newMeasurementPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.INGREDIENT_STRENGTH__MEASUREMENT_POINT, null, msgs);
			msgs = basicSetMeasurementPoint(newMeasurementPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.INGREDIENT_STRENGTH__MEASUREMENT_POINT, newMeasurementPoint, newMeasurementPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCountry() {
		if (country == null) {
			country = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.INGREDIENT_STRENGTH__COUNTRY);
		}
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IngredientReferenceStrength> getReferenceStrength() {
		if (referenceStrength == null) {
			referenceStrength = new EObjectContainmentEList<IngredientReferenceStrength>(IngredientReferenceStrength.class, this, FhirPackage.INGREDIENT_STRENGTH__REFERENCE_STRENGTH);
		}
		return referenceStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_RATIO:
				return basicSetPresentationRatio(null, msgs);
			case FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_RATIO_RANGE:
				return basicSetPresentationRatioRange(null, msgs);
			case FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_CODEABLE_CONCEPT:
				return basicSetPresentationCodeableConcept(null, msgs);
			case FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_QUANTITY:
				return basicSetPresentationQuantity(null, msgs);
			case FhirPackage.INGREDIENT_STRENGTH__TEXT_PRESENTATION:
				return basicSetTextPresentation(null, msgs);
			case FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_RATIO:
				return basicSetConcentrationRatio(null, msgs);
			case FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_RATIO_RANGE:
				return basicSetConcentrationRatioRange(null, msgs);
			case FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_CODEABLE_CONCEPT:
				return basicSetConcentrationCodeableConcept(null, msgs);
			case FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_QUANTITY:
				return basicSetConcentrationQuantity(null, msgs);
			case FhirPackage.INGREDIENT_STRENGTH__TEXT_CONCENTRATION:
				return basicSetTextConcentration(null, msgs);
			case FhirPackage.INGREDIENT_STRENGTH__BASIS:
				return basicSetBasis(null, msgs);
			case FhirPackage.INGREDIENT_STRENGTH__MEASUREMENT_POINT:
				return basicSetMeasurementPoint(null, msgs);
			case FhirPackage.INGREDIENT_STRENGTH__COUNTRY:
				return ((InternalEList<?>)getCountry()).basicRemove(otherEnd, msgs);
			case FhirPackage.INGREDIENT_STRENGTH__REFERENCE_STRENGTH:
				return ((InternalEList<?>)getReferenceStrength()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_RATIO:
				return getPresentationRatio();
			case FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_RATIO_RANGE:
				return getPresentationRatioRange();
			case FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_CODEABLE_CONCEPT:
				return getPresentationCodeableConcept();
			case FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_QUANTITY:
				return getPresentationQuantity();
			case FhirPackage.INGREDIENT_STRENGTH__TEXT_PRESENTATION:
				return getTextPresentation();
			case FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_RATIO:
				return getConcentrationRatio();
			case FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_RATIO_RANGE:
				return getConcentrationRatioRange();
			case FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_CODEABLE_CONCEPT:
				return getConcentrationCodeableConcept();
			case FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_QUANTITY:
				return getConcentrationQuantity();
			case FhirPackage.INGREDIENT_STRENGTH__TEXT_CONCENTRATION:
				return getTextConcentration();
			case FhirPackage.INGREDIENT_STRENGTH__BASIS:
				return getBasis();
			case FhirPackage.INGREDIENT_STRENGTH__MEASUREMENT_POINT:
				return getMeasurementPoint();
			case FhirPackage.INGREDIENT_STRENGTH__COUNTRY:
				return getCountry();
			case FhirPackage.INGREDIENT_STRENGTH__REFERENCE_STRENGTH:
				return getReferenceStrength();
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
			case FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_RATIO:
				setPresentationRatio((Ratio)newValue);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_RATIO_RANGE:
				setPresentationRatioRange((RatioRange)newValue);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_CODEABLE_CONCEPT:
				setPresentationCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_QUANTITY:
				setPresentationQuantity((Quantity)newValue);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__TEXT_PRESENTATION:
				setTextPresentation((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_RATIO:
				setConcentrationRatio((Ratio)newValue);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_RATIO_RANGE:
				setConcentrationRatioRange((RatioRange)newValue);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_CODEABLE_CONCEPT:
				setConcentrationCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_QUANTITY:
				setConcentrationQuantity((Quantity)newValue);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__TEXT_CONCENTRATION:
				setTextConcentration((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__BASIS:
				setBasis((CodeableConcept)newValue);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__MEASUREMENT_POINT:
				setMeasurementPoint((org.hl7.emf.fhir.String)newValue);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__COUNTRY:
				getCountry().clear();
				getCountry().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__REFERENCE_STRENGTH:
				getReferenceStrength().clear();
				getReferenceStrength().addAll((Collection<? extends IngredientReferenceStrength>)newValue);
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
			case FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_RATIO:
				setPresentationRatio((Ratio)null);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_RATIO_RANGE:
				setPresentationRatioRange((RatioRange)null);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_CODEABLE_CONCEPT:
				setPresentationCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_QUANTITY:
				setPresentationQuantity((Quantity)null);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__TEXT_PRESENTATION:
				setTextPresentation((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_RATIO:
				setConcentrationRatio((Ratio)null);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_RATIO_RANGE:
				setConcentrationRatioRange((RatioRange)null);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_CODEABLE_CONCEPT:
				setConcentrationCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_QUANTITY:
				setConcentrationQuantity((Quantity)null);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__TEXT_CONCENTRATION:
				setTextConcentration((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__BASIS:
				setBasis((CodeableConcept)null);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__MEASUREMENT_POINT:
				setMeasurementPoint((org.hl7.emf.fhir.String)null);
				return;
			case FhirPackage.INGREDIENT_STRENGTH__COUNTRY:
				getCountry().clear();
				return;
			case FhirPackage.INGREDIENT_STRENGTH__REFERENCE_STRENGTH:
				getReferenceStrength().clear();
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
			case FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_RATIO:
				return presentationRatio != null;
			case FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_RATIO_RANGE:
				return presentationRatioRange != null;
			case FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_CODEABLE_CONCEPT:
				return presentationCodeableConcept != null;
			case FhirPackage.INGREDIENT_STRENGTH__PRESENTATION_QUANTITY:
				return presentationQuantity != null;
			case FhirPackage.INGREDIENT_STRENGTH__TEXT_PRESENTATION:
				return textPresentation != null;
			case FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_RATIO:
				return concentrationRatio != null;
			case FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_RATIO_RANGE:
				return concentrationRatioRange != null;
			case FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_CODEABLE_CONCEPT:
				return concentrationCodeableConcept != null;
			case FhirPackage.INGREDIENT_STRENGTH__CONCENTRATION_QUANTITY:
				return concentrationQuantity != null;
			case FhirPackage.INGREDIENT_STRENGTH__TEXT_CONCENTRATION:
				return textConcentration != null;
			case FhirPackage.INGREDIENT_STRENGTH__BASIS:
				return basis != null;
			case FhirPackage.INGREDIENT_STRENGTH__MEASUREMENT_POINT:
				return measurementPoint != null;
			case FhirPackage.INGREDIENT_STRENGTH__COUNTRY:
				return country != null && !country.isEmpty();
			case FhirPackage.INGREDIENT_STRENGTH__REFERENCE_STRENGTH:
				return referenceStrength != null && !referenceStrength.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IngredientStrengthImpl
