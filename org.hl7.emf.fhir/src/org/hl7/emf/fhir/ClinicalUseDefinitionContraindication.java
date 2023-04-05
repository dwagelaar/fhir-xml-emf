/**
 */
package org.hl7.emf.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clinical Use Definition Contraindication</b></em>'.
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
 *   <li>{@link org.hl7.emf.fhir.ClinicalUseDefinitionContraindication#getDiseaseSymptomProcedure <em>Disease Symptom Procedure</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClinicalUseDefinitionContraindication#getDiseaseStatus <em>Disease Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClinicalUseDefinitionContraindication#getComorbidity <em>Comorbidity</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClinicalUseDefinitionContraindication#getIndication <em>Indication</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClinicalUseDefinitionContraindication#getApplicability <em>Applicability</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.ClinicalUseDefinitionContraindication#getOtherTherapy <em>Other Therapy</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getClinicalUseDefinitionContraindication()
 * @model extendedMetaData="name='ClinicalUseDefinition.Contraindication' kind='elementOnly'"
 * @generated
 */
public interface ClinicalUseDefinitionContraindication extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Disease Symptom Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The situation that is being documented as contraindicating against this item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disease Symptom Procedure</em>' containment reference.
	 * @see #setDiseaseSymptomProcedure(CodeableReference)
	 * @see org.hl7.emf.fhir.FhirPackage#getClinicalUseDefinitionContraindication_DiseaseSymptomProcedure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diseaseSymptomProcedure' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getDiseaseSymptomProcedure();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClinicalUseDefinitionContraindication#getDiseaseSymptomProcedure <em>Disease Symptom Procedure</em>}' containment reference.
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
	 * The status of the disease or symptom for the contraindication, for example "chronic" or "metastatic".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disease Status</em>' containment reference.
	 * @see #setDiseaseStatus(CodeableReference)
	 * @see org.hl7.emf.fhir.FhirPackage#getClinicalUseDefinitionContraindication_DiseaseStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diseaseStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getDiseaseStatus();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClinicalUseDefinitionContraindication#getDiseaseStatus <em>Disease Status</em>}' containment reference.
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
	 * A comorbidity (concurrent condition) or coinfection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comorbidity</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getClinicalUseDefinitionContraindication_Comorbidity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comorbidity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getComorbidity();

	/**
	 * Returns the value of the '<em><b>Indication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.emf.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The indication which this is a contraidication for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indication</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getClinicalUseDefinitionContraindication_Indication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='indication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getIndication();

	/**
	 * Returns the value of the '<em><b>Applicability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An expression that returns true or false, indicating whether the indication is applicable or not, after having applied its other elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicability</em>' containment reference.
	 * @see #setApplicability(Expression)
	 * @see org.hl7.emf.fhir.FhirPackage#getClinicalUseDefinitionContraindication_Applicability()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applicability' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getApplicability();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.ClinicalUseDefinitionContraindication#getApplicability <em>Applicability</em>}' containment reference.
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
	 * Information about the use of the medicinal product in relation to other therapies described as part of the contraindication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Therapy</em>' containment reference list.
	 * @see org.hl7.emf.fhir.FhirPackage#getClinicalUseDefinitionContraindication_OtherTherapy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='otherTherapy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClinicalUseDefinitionOtherTherapy> getOtherTherapy();

} // ClinicalUseDefinitionContraindication
