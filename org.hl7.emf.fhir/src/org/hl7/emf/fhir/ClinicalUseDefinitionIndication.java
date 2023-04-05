/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clinical Use Definition Indication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A single issue - either an indication, contraindication, interaction or an undesirable effect for a medicinal product, medication, device or procedure.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.ClinicalUseDefinitionIndication#getDiseaseSymptomProcedure <em>Disease Symptom Procedure</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClinicalUseDefinitionIndication#getDiseaseStatus <em>Disease Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClinicalUseDefinitionIndication#getComorbidity <em>Comorbidity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClinicalUseDefinitionIndication#getIntendedEffect <em>Intended Effect</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClinicalUseDefinitionIndication#getDurationRange <em>Duration Range</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClinicalUseDefinitionIndication#getDurationString <em>Duration String</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClinicalUseDefinitionIndication#getUndesirableEffect <em>Undesirable Effect</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClinicalUseDefinitionIndication#getApplicability <em>Applicability</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClinicalUseDefinitionIndication#getOtherTherapy <em>Other Therapy</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getClinicalUseDefinitionIndication()
 * @model extendedMetaData="name='ClinicalUseDefinition.Indication' kind='elementOnly'"
 * @generated
 */
public interface ClinicalUseDefinitionIndication extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Disease Symptom Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The situation that is being documented as an indicaton for this item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disease Symptom Procedure</em>' containment reference.
	 * @see #setDiseaseSymptomProcedure(CodeableReference)
	 * @see org.hl7.emf.fhir.FhirPackage#getClinicalUseDefinitionIndication_DiseaseSymptomProcedure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diseaseSymptomProcedure' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getDiseaseSymptomProcedure();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClinicalUseDefinitionIndication#getDiseaseSymptomProcedure <em>Disease Symptom Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disease Symptom Procedure</em>' containment reference.
	 * @see #getDiseaseSymptomProcedure()
	 * @generated
	 */
	void setDiseaseSymptomProcedure(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Disease Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the disease or symptom for the indication, for example "chronic" or "metastatic".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disease Status</em>' containment reference.
	 * @see #setDiseaseStatus(CodeableReference)
	 * @see org.hl7.emf.fhir.FhirPackage#getClinicalUseDefinitionIndication_DiseaseStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diseaseStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getDiseaseStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClinicalUseDefinitionIndication#getDiseaseStatus <em>Disease Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disease Status</em>' containment reference.
	 * @see #getDiseaseStatus()
	 * @generated
	 */
	void setDiseaseStatus(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Comorbidity</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A comorbidity (concurrent condition) or coinfection as part of the indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comorbidity</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getClinicalUseDefinitionIndication_Comorbidity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comorbidity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getComorbidity();

	/**
	 * Returns the value of the '<em><b>Intended Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The intended effect, aim or strategy to be achieved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intended Effect</em>' containment reference.
	 * @see #setIntendedEffect(CodeableReference)
	 * @see org.hl7.emf.fhir.FhirPackage#getClinicalUseDefinitionIndication_IntendedEffect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intendedEffect' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getIntendedEffect();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClinicalUseDefinitionIndication#getIntendedEffect <em>Intended Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intended Effect</em>' containment reference.
	 * @see #getIntendedEffect()
	 * @generated
	 */
	void setIntendedEffect(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Duration Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Range</em>' containment reference.
	 * @see #setDurationRange(Range)
	 * @see org.hl7.emf.fhir.FhirPackage#getClinicalUseDefinitionIndication_DurationRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='durationRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getDurationRange();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClinicalUseDefinitionIndication#getDurationRange <em>Duration Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Range</em>' containment reference.
	 * @see #getDurationRange()
	 * @generated
	 */
	void setDurationRange(Range value);

	/**
	 * Returns the value of the '<em><b>Duration String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration String</em>' containment reference.
	 * @see #setDurationString(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getClinicalUseDefinitionIndication_DurationString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='durationString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getDurationString();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClinicalUseDefinitionIndication#getDurationString <em>Duration String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration String</em>' containment reference.
	 * @see #getDurationString()
	 * @generated
	 */
	void setDurationString(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Undesirable Effect</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An unwanted side effect or negative outcome that may happen if you use the drug (or other subject of this resource) for this indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Undesirable Effect</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getClinicalUseDefinitionIndication_UndesirableEffect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='undesirableEffect' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getUndesirableEffect();

	/**
	 * Returns the value of the '<em><b>Applicability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An expression that returns true or false, indicating whether the indication is applicable or not, after having applied its other elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicability</em>' containment reference.
	 * @see #setApplicability(Expression)
	 * @see org.hl7.emf.fhir.FhirPackage#getClinicalUseDefinitionIndication_Applicability()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applicability' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getApplicability();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClinicalUseDefinitionIndication#getApplicability <em>Applicability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicability</em>' containment reference.
	 * @see #getApplicability()
	 * @generated
	 */
	void setApplicability(Expression value);

	/**
	 * Returns the value of the '<em><b>Other Therapy</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.ClinicalUseDefinitionOtherTherapy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the use of the medicinal product in relation to other therapies described as part of the indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Therapy</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getClinicalUseDefinitionIndication_OtherTherapy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='otherTherapy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClinicalUseDefinitionOtherTherapy> getOtherTherapy();

} // ClinicalUseDefinitionIndication
