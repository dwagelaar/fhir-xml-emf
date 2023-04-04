/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence Statistic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Evidence Resource provides a machine-interpretable expression of an evidence concept including the evidence variables (e.g., population, exposures/interventions, comparators, outcomes, measured variables, confounding variables), the statistics, and the certainty of this evidence.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.EvidenceStatistic#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceStatistic#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceStatistic#getStatisticType <em>Statistic Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceStatistic#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceStatistic#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceStatistic#getNumberOfEvents <em>Number Of Events</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceStatistic#getNumberAffected <em>Number Affected</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceStatistic#getSampleSize <em>Sample Size</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceStatistic#getAttributeEstimate <em>Attribute Estimate</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.EvidenceStatistic#getModelCharacteristic <em>Model Characteristic</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceStatistic()
 * @model extendedMetaData="name='Evidence.Statistic' kind='elementOnly'"
 * @generated
 */
public interface EvidenceStatistic extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the content value of the statistic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceStatistic_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceStatistic#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Footnotes and/or explanatory notes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceStatistic_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Statistic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of statistic, e.g., relative risk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statistic Type</em>' containment reference.
	 * @see #setStatisticType(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceStatistic_StatisticType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statisticType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatisticType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceStatistic#getStatisticType <em>Statistic Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statistic Type</em>' containment reference.
	 * @see #getStatisticType()
	 * @generated
	 */
	void setStatisticType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the measured variable is handled categorically, the category element is used to define which category the statistic is reporting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceStatistic_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceStatistic#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Statistic value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceStatistic_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceStatistic#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Number Of Events</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of events associated with the statistic, where the unit of analysis is different from numberAffected, sampleSize.knownDataCount and sampleSize.numberOfParticipants.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Events</em>' containment reference.
	 * @see #setNumberOfEvents(UnsignedInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceStatistic_NumberOfEvents()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberOfEvents' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getNumberOfEvents();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceStatistic#getNumberOfEvents <em>Number Of Events</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Events</em>' containment reference.
	 * @see #getNumberOfEvents()
	 * @generated
	 */
	void setNumberOfEvents(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Number Affected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of participants affected where the unit of analysis is the same as sampleSize.knownDataCount and sampleSize.numberOfParticipants.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Affected</em>' containment reference.
	 * @see #setNumberAffected(UnsignedInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceStatistic_NumberAffected()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberAffected' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getNumberAffected();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceStatistic#getNumberAffected <em>Number Affected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Affected</em>' containment reference.
	 * @see #getNumberAffected()
	 * @generated
	 */
	void setNumberAffected(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Sample Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of samples in the statistic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sample Size</em>' containment reference.
	 * @see #setSampleSize(EvidenceSampleSize)
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceStatistic_SampleSize()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sampleSize' namespace='##targetNamespace'"
	 * @generated
	 */
	EvidenceSampleSize getSampleSize();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.EvidenceStatistic#getSampleSize <em>Sample Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Size</em>' containment reference.
	 * @see #getSampleSize()
	 * @generated
	 */
	void setSampleSize(EvidenceSampleSize value);

	/**
	 * Returns the value of the '<em><b>Attribute Estimate</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.EvidenceAttributeEstimate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A statistical attribute of the statistic such as a measure of heterogeneity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Estimate</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceStatistic_AttributeEstimate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attributeEstimate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EvidenceAttributeEstimate> getAttributeEstimate();

	/**
	 * Returns the value of the '<em><b>Model Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.EvidenceModelCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A component of the method to generate the statistic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Characteristic</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getEvidenceStatistic_ModelCharacteristic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modelCharacteristic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EvidenceModelCharacteristic> getModelCharacteristic();

} // EvidenceStatistic
