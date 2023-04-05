/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Polymer Degree Of Polymerisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Properties of a substance specific to it being a polymer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.SubstancePolymerDegreeOfPolymerisation#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstancePolymerDegreeOfPolymerisation#getAverage <em>Average</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstancePolymerDegreeOfPolymerisation#getLow <em>Low</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.SubstancePolymerDegreeOfPolymerisation#getHigh <em>High</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getSubstancePolymerDegreeOfPolymerisation()
 * @model extendedMetaData="name='SubstancePolymer.DegreeOfPolymerisation' kind='elementOnly'"
 * @generated
 */
public interface SubstancePolymerDegreeOfPolymerisation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the degree of polymerisation shall be described, e.g. SRU/Polymer Ratio.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstancePolymerDegreeOfPolymerisation_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstancePolymerDegreeOfPolymerisation#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Average</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An average amount of polymerisation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Average</em>' containment reference.
	 * @see #setAverage(org.hl7.emf.fhir.Integer)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstancePolymerDegreeOfPolymerisation_Average()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='average' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Integer getAverage();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstancePolymerDegreeOfPolymerisation#getAverage <em>Average</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average</em>' containment reference.
	 * @see #getAverage()
	 * @generated
	 */
	void setAverage(org.hl7.emf.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A low expected limit of the amount.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Low</em>' containment reference.
	 * @see #setLow(org.hl7.emf.fhir.Integer)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstancePolymerDegreeOfPolymerisation_Low()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='low' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Integer getLow();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstancePolymerDegreeOfPolymerisation#getLow <em>Low</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low</em>' containment reference.
	 * @see #getLow()
	 * @generated
	 */
	void setLow(org.hl7.emf.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A high expected limit of the amount.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>High</em>' containment reference.
	 * @see #setHigh(org.hl7.emf.fhir.Integer)
	 * @see org.hl7.emf.fhir.FhirPackage#getSubstancePolymerDegreeOfPolymerisation_High()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='high' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.Integer getHigh();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.SubstancePolymerDegreeOfPolymerisation#getHigh <em>High</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High</em>' containment reference.
	 * @see #getHigh()
	 * @generated
	 */
	void setHigh(org.hl7.emf.fhir.Integer value);

} // SubstancePolymerDegreeOfPolymerisation
