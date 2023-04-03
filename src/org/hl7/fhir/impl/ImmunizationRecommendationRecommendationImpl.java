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
import org.hl7.fhir.ImmunizationRecommendationDateCriterion;
import org.hl7.fhir.ImmunizationRecommendationRecommendation;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Recommendation Recommendation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getVaccineCode <em>Vaccine Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getTargetDisease <em>Target Disease</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getContraindicatedVaccineCode <em>Contraindicated Vaccine Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getForecastStatus <em>Forecast Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getForecastReason <em>Forecast Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getDateCriterion <em>Date Criterion</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getDoseNumber <em>Dose Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getSeriesDoses <em>Series Doses</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getSupportingImmunization <em>Supporting Immunization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationRecommendationRecommendationImpl#getSupportingPatientInformation <em>Supporting Patient Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmunizationRecommendationRecommendationImpl extends BackboneElementImpl implements ImmunizationRecommendationRecommendation {
	/**
	 * The cached value of the '{@link #getVaccineCode() <em>Vaccine Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaccineCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> vaccineCode;

	/**
	 * The cached value of the '{@link #getTargetDisease() <em>Target Disease</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDisease()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> targetDisease;

	/**
	 * The cached value of the '{@link #getContraindicatedVaccineCode() <em>Contraindicated Vaccine Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraindicatedVaccineCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> contraindicatedVaccineCode;

	/**
	 * The cached value of the '{@link #getForecastStatus() <em>Forecast Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecastStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept forecastStatus;

	/**
	 * The cached value of the '{@link #getForecastReason() <em>Forecast Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecastReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> forecastReason;

	/**
	 * The cached value of the '{@link #getDateCriterion() <em>Date Criterion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCriterion()
	 * @generated
	 * @ordered
	 */
	protected EList<ImmunizationRecommendationDateCriterion> dateCriterion;

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
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String series;

	/**
	 * The cached value of the '{@link #getDoseNumber() <em>Dose Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String doseNumber;

	/**
	 * The cached value of the '{@link #getSeriesDoses() <em>Series Doses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesDoses()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String seriesDoses;

	/**
	 * The cached value of the '{@link #getSupportingImmunization() <em>Supporting Immunization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingImmunization()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingImmunization;

	/**
	 * The cached value of the '{@link #getSupportingPatientInformation() <em>Supporting Patient Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingPatientInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingPatientInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationRecommendationRecommendationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImmunizationRecommendationRecommendation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getVaccineCode() {
		if (vaccineCode == null) {
			vaccineCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE);
		}
		return vaccineCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getTargetDisease() {
		if (targetDisease == null) {
			targetDisease = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__TARGET_DISEASE);
		}
		return targetDisease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getContraindicatedVaccineCode() {
		if (contraindicatedVaccineCode == null) {
			contraindicatedVaccineCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__CONTRAINDICATED_VACCINE_CODE);
		}
		return contraindicatedVaccineCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getForecastStatus() {
		return forecastStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecastStatus(CodeableConcept newForecastStatus, NotificationChain msgs) {
		CodeableConcept oldForecastStatus = forecastStatus;
		forecastStatus = newForecastStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS, oldForecastStatus, newForecastStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForecastStatus(CodeableConcept newForecastStatus) {
		if (newForecastStatus != forecastStatus) {
			NotificationChain msgs = null;
			if (forecastStatus != null)
				msgs = ((InternalEObject)forecastStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS, null, msgs);
			if (newForecastStatus != null)
				msgs = ((InternalEObject)newForecastStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS, null, msgs);
			msgs = basicSetForecastStatus(newForecastStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS, newForecastStatus, newForecastStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getForecastReason() {
		if (forecastReason == null) {
			forecastReason = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_REASON);
		}
		return forecastReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImmunizationRecommendationDateCriterion> getDateCriterion() {
		if (dateCriterion == null) {
			dateCriterion = new EObjectContainmentEList<ImmunizationRecommendationDateCriterion>(ImmunizationRecommendationDateCriterion.class, this, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION);
		}
		return dateCriterion;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getSeries() {
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeries(org.hl7.fhir.String newSeries, NotificationChain msgs) {
		org.hl7.fhir.String oldSeries = series;
		series = newSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES, oldSeries, newSeries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeries(org.hl7.fhir.String newSeries) {
		if (newSeries != series) {
			NotificationChain msgs = null;
			if (series != null)
				msgs = ((InternalEObject)series).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES, null, msgs);
			if (newSeries != null)
				msgs = ((InternalEObject)newSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES, null, msgs);
			msgs = basicSetSeries(newSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES, newSeries, newSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDoseNumber() {
		return doseNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseNumber(org.hl7.fhir.String newDoseNumber, NotificationChain msgs) {
		org.hl7.fhir.String oldDoseNumber = doseNumber;
		doseNumber = newDoseNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER, oldDoseNumber, newDoseNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseNumber(org.hl7.fhir.String newDoseNumber) {
		if (newDoseNumber != doseNumber) {
			NotificationChain msgs = null;
			if (doseNumber != null)
				msgs = ((InternalEObject)doseNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER, null, msgs);
			if (newDoseNumber != null)
				msgs = ((InternalEObject)newDoseNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER, null, msgs);
			msgs = basicSetDoseNumber(newDoseNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER, newDoseNumber, newDoseNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getSeriesDoses() {
		return seriesDoses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeriesDoses(org.hl7.fhir.String newSeriesDoses, NotificationChain msgs) {
		org.hl7.fhir.String oldSeriesDoses = seriesDoses;
		seriesDoses = newSeriesDoses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES, oldSeriesDoses, newSeriesDoses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeriesDoses(org.hl7.fhir.String newSeriesDoses) {
		if (newSeriesDoses != seriesDoses) {
			NotificationChain msgs = null;
			if (seriesDoses != null)
				msgs = ((InternalEObject)seriesDoses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES, null, msgs);
			if (newSeriesDoses != null)
				msgs = ((InternalEObject)newSeriesDoses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES, null, msgs);
			msgs = basicSetSeriesDoses(newSeriesDoses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES, newSeriesDoses, newSeriesDoses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSupportingImmunization() {
		if (supportingImmunization == null) {
			supportingImmunization = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION);
		}
		return supportingImmunization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSupportingPatientInformation() {
		if (supportingPatientInformation == null) {
			supportingPatientInformation = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION);
		}
		return supportingPatientInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE:
				return ((InternalEList<?>)getVaccineCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__TARGET_DISEASE:
				return ((InternalEList<?>)getTargetDisease()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__CONTRAINDICATED_VACCINE_CODE:
				return ((InternalEList<?>)getContraindicatedVaccineCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS:
				return basicSetForecastStatus(null, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_REASON:
				return ((InternalEList<?>)getForecastReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				return ((InternalEList<?>)getDateCriterion()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES:
				return basicSetSeries(null, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER:
				return basicSetDoseNumber(null, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES:
				return basicSetSeriesDoses(null, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION:
				return ((InternalEList<?>)getSupportingImmunization()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION:
				return ((InternalEList<?>)getSupportingPatientInformation()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE:
				return getVaccineCode();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__TARGET_DISEASE:
				return getTargetDisease();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__CONTRAINDICATED_VACCINE_CODE:
				return getContraindicatedVaccineCode();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS:
				return getForecastStatus();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_REASON:
				return getForecastReason();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				return getDateCriterion();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION:
				return getDescription();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES:
				return getSeries();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER:
				return getDoseNumber();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES:
				return getSeriesDoses();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION:
				return getSupportingImmunization();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION:
				return getSupportingPatientInformation();
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
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE:
				getVaccineCode().clear();
				getVaccineCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__TARGET_DISEASE:
				getTargetDisease().clear();
				getTargetDisease().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__CONTRAINDICATED_VACCINE_CODE:
				getContraindicatedVaccineCode().clear();
				getContraindicatedVaccineCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS:
				setForecastStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_REASON:
				getForecastReason().clear();
				getForecastReason().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				getDateCriterion().clear();
				getDateCriterion().addAll((Collection<? extends ImmunizationRecommendationDateCriterion>)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES:
				setSeries((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER:
				setDoseNumber((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES:
				setSeriesDoses((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION:
				getSupportingImmunization().clear();
				getSupportingImmunization().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION:
				getSupportingPatientInformation().clear();
				getSupportingPatientInformation().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE:
				getVaccineCode().clear();
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__TARGET_DISEASE:
				getTargetDisease().clear();
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__CONTRAINDICATED_VACCINE_CODE:
				getContraindicatedVaccineCode().clear();
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS:
				setForecastStatus((CodeableConcept)null);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_REASON:
				getForecastReason().clear();
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				getDateCriterion().clear();
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES:
				setSeries((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER:
				setDoseNumber((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES:
				setSeriesDoses((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION:
				getSupportingImmunization().clear();
				return;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION:
				getSupportingPatientInformation().clear();
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
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE:
				return vaccineCode != null && !vaccineCode.isEmpty();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__TARGET_DISEASE:
				return targetDisease != null && !targetDisease.isEmpty();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__CONTRAINDICATED_VACCINE_CODE:
				return contraindicatedVaccineCode != null && !contraindicatedVaccineCode.isEmpty();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS:
				return forecastStatus != null;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_REASON:
				return forecastReason != null && !forecastReason.isEmpty();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				return dateCriterion != null && !dateCriterion.isEmpty();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION:
				return description != null;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES:
				return series != null;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER:
				return doseNumber != null;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSES:
				return seriesDoses != null;
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION:
				return supportingImmunization != null && !supportingImmunization.isEmpty();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION:
				return supportingPatientInformation != null && !supportingPatientInformation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationRecommendationRecommendationImpl
