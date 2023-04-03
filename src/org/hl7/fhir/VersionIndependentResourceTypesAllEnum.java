/**
 */
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Version Independent Resource Types All Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getVersionIndependentResourceTypesAllEnum()
 * @model extendedMetaData="name='VersionIndependentResourceTypesAllEnum'"
 * @generated
 */
public enum VersionIndependentResourceTypesAllEnum implements Enumerator {
	/**
	 * The '<em><b>Account</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Account
	 * <!-- end-model-doc -->
	 * @see #ACCOUNT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCOUNT(0, "Account", "Account"),

	/**
	 * The '<em><b>Activity Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityDefinition
	 * <!-- end-model-doc -->
	 * @see #ACTIVITY_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVITY_DEFINITION(1, "ActivityDefinition", "ActivityDefinition"),

	/**
	 * The '<em><b>Actor Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActorDefinition
	 * <!-- end-model-doc -->
	 * @see #ACTOR_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	ACTOR_DEFINITION(2, "ActorDefinition", "ActorDefinition"),

	/**
	 * The '<em><b>Administrable Product Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AdministrableProductDefinition
	 * <!-- end-model-doc -->
	 * @see #ADMINISTRABLE_PRODUCT_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	ADMINISTRABLE_PRODUCT_DEFINITION(3, "AdministrableProductDefinition", "AdministrableProductDefinition"),

	/**
	 * The '<em><b>Adverse Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AdverseEvent
	 * <!-- end-model-doc -->
	 * @see #ADVERSE_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	ADVERSE_EVENT(4, "AdverseEvent", "AdverseEvent"),

	/**
	 * The '<em><b>Allergy Intolerance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AllergyIntolerance
	 * <!-- end-model-doc -->
	 * @see #ALLERGY_INTOLERANCE_VALUE
	 * @generated
	 * @ordered
	 */
	ALLERGY_INTOLERANCE(5, "AllergyIntolerance", "AllergyIntolerance"),

	/**
	 * The '<em><b>Appointment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appointment
	 * <!-- end-model-doc -->
	 * @see #APPOINTMENT_VALUE
	 * @generated
	 * @ordered
	 */
	APPOINTMENT(6, "Appointment", "Appointment"),

	/**
	 * The '<em><b>Appointment Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AppointmentResponse
	 * <!-- end-model-doc -->
	 * @see #APPOINTMENT_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	APPOINTMENT_RESPONSE(7, "AppointmentResponse", "AppointmentResponse"),

	/**
	 * The '<em><b>Artifact Assessment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ArtifactAssessment
	 * <!-- end-model-doc -->
	 * @see #ARTIFACT_ASSESSMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ARTIFACT_ASSESSMENT(8, "ArtifactAssessment", "ArtifactAssessment"),

	/**
	 * The '<em><b>Audit Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AuditEvent
	 * <!-- end-model-doc -->
	 * @see #AUDIT_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIT_EVENT(9, "AuditEvent", "AuditEvent"),

	/**
	 * The '<em><b>Basic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Basic
	 * <!-- end-model-doc -->
	 * @see #BASIC_VALUE
	 * @generated
	 * @ordered
	 */
	BASIC(10, "Basic", "Basic"),

	/**
	 * The '<em><b>Binary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Binary
	 * <!-- end-model-doc -->
	 * @see #BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	BINARY(11, "Binary", "Binary"),

	/**
	 * The '<em><b>Biologically Derived Product</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BiologicallyDerivedProduct
	 * <!-- end-model-doc -->
	 * @see #BIOLOGICALLY_DERIVED_PRODUCT_VALUE
	 * @generated
	 * @ordered
	 */
	BIOLOGICALLY_DERIVED_PRODUCT(12, "BiologicallyDerivedProduct", "BiologicallyDerivedProduct"),

	/**
	 * The '<em><b>Biologically Derived Product Dispense</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BiologicallyDerivedProductDispense
	 * <!-- end-model-doc -->
	 * @see #BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE_VALUE
	 * @generated
	 * @ordered
	 */
	BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE(13, "BiologicallyDerivedProductDispense", "BiologicallyDerivedProductDispense"),

	/**
	 * The '<em><b>Body Structure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BodyStructure
	 * <!-- end-model-doc -->
	 * @see #BODY_STRUCTURE_VALUE
	 * @generated
	 * @ordered
	 */
	BODY_STRUCTURE(14, "BodyStructure", "BodyStructure"),

	/**
	 * The '<em><b>Bundle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bundle
	 * <!-- end-model-doc -->
	 * @see #BUNDLE_VALUE
	 * @generated
	 * @ordered
	 */
	BUNDLE(15, "Bundle", "Bundle"),

	/**
	 * The '<em><b>Canonical Resource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CanonicalResource
	 * <!-- end-model-doc -->
	 * @see #CANONICAL_RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	CANONICAL_RESOURCE(16, "CanonicalResource", "CanonicalResource"),

	/**
	 * The '<em><b>Capability Statement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CapabilityStatement
	 * <!-- end-model-doc -->
	 * @see #CAPABILITY_STATEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CAPABILITY_STATEMENT(17, "CapabilityStatement", "CapabilityStatement"),

	/**
	 * The '<em><b>Care Plan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CarePlan
	 * <!-- end-model-doc -->
	 * @see #CARE_PLAN_VALUE
	 * @generated
	 * @ordered
	 */
	CARE_PLAN(18, "CarePlan", "CarePlan"),

	/**
	 * The '<em><b>Care Team</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CareTeam
	 * <!-- end-model-doc -->
	 * @see #CARE_TEAM_VALUE
	 * @generated
	 * @ordered
	 */
	CARE_TEAM(19, "CareTeam", "CareTeam"),

	/**
	 * The '<em><b>Charge Item</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ChargeItem
	 * <!-- end-model-doc -->
	 * @see #CHARGE_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	CHARGE_ITEM(20, "ChargeItem", "ChargeItem"),

	/**
	 * The '<em><b>Charge Item Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ChargeItemDefinition
	 * <!-- end-model-doc -->
	 * @see #CHARGE_ITEM_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	CHARGE_ITEM_DEFINITION(21, "ChargeItemDefinition", "ChargeItemDefinition"),

	/**
	 * The '<em><b>Citation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Citation
	 * <!-- end-model-doc -->
	 * @see #CITATION_VALUE
	 * @generated
	 * @ordered
	 */
	CITATION(22, "Citation", "Citation"),

	/**
	 * The '<em><b>Claim</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Claim
	 * <!-- end-model-doc -->
	 * @see #CLAIM_VALUE
	 * @generated
	 * @ordered
	 */
	CLAIM(23, "Claim", "Claim"),

	/**
	 * The '<em><b>Claim Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ClaimResponse
	 * <!-- end-model-doc -->
	 * @see #CLAIM_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	CLAIM_RESPONSE(24, "ClaimResponse", "ClaimResponse"),

	/**
	 * The '<em><b>Clinical Impression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ClinicalImpression
	 * <!-- end-model-doc -->
	 * @see #CLINICAL_IMPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	CLINICAL_IMPRESSION(25, "ClinicalImpression", "ClinicalImpression"),

	/**
	 * The '<em><b>Clinical Use Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ClinicalUseDefinition
	 * <!-- end-model-doc -->
	 * @see #CLINICAL_USE_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	CLINICAL_USE_DEFINITION(26, "ClinicalUseDefinition", "ClinicalUseDefinition"),

	/**
	 * The '<em><b>Code System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CodeSystem
	 * <!-- end-model-doc -->
	 * @see #CODE_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	CODE_SYSTEM(27, "CodeSystem", "CodeSystem"),

	/**
	 * The '<em><b>Communication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Communication
	 * <!-- end-model-doc -->
	 * @see #COMMUNICATION_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION(28, "Communication", "Communication"),

	/**
	 * The '<em><b>Communication Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CommunicationRequest
	 * <!-- end-model-doc -->
	 * @see #COMMUNICATION_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION_REQUEST(29, "CommunicationRequest", "CommunicationRequest"),

	/**
	 * The '<em><b>Compartment Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CompartmentDefinition
	 * <!-- end-model-doc -->
	 * @see #COMPARTMENT_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPARTMENT_DEFINITION(30, "CompartmentDefinition", "CompartmentDefinition"),

	/**
	 * The '<em><b>Composition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Composition
	 * <!-- end-model-doc -->
	 * @see #COMPOSITION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOSITION(31, "Composition", "Composition"),

	/**
	 * The '<em><b>Concept Map</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ConceptMap
	 * <!-- end-model-doc -->
	 * @see #CONCEPT_MAP_VALUE
	 * @generated
	 * @ordered
	 */
	CONCEPT_MAP(32, "ConceptMap", "ConceptMap"),

	/**
	 * The '<em><b>Condition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Condition
	 * <!-- end-model-doc -->
	 * @see #CONDITION_VALUE
	 * @generated
	 * @ordered
	 */
	CONDITION(33, "Condition", "Condition"),

	/**
	 * The '<em><b>Condition Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ConditionDefinition
	 * <!-- end-model-doc -->
	 * @see #CONDITION_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	CONDITION_DEFINITION(34, "ConditionDefinition", "ConditionDefinition"),

	/**
	 * The '<em><b>Consent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Consent
	 * <!-- end-model-doc -->
	 * @see #CONSENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSENT(35, "Consent", "Consent"),

	/**
	 * The '<em><b>Contract</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contract
	 * <!-- end-model-doc -->
	 * @see #CONTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRACT(36, "Contract", "Contract"),

	/**
	 * The '<em><b>Coverage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage
	 * <!-- end-model-doc -->
	 * @see #COVERAGE_VALUE
	 * @generated
	 * @ordered
	 */
	COVERAGE(37, "Coverage", "Coverage"),

	/**
	 * The '<em><b>Coverage Eligibility Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CoverageEligibilityRequest
	 * <!-- end-model-doc -->
	 * @see #COVERAGE_ELIGIBILITY_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	COVERAGE_ELIGIBILITY_REQUEST(38, "CoverageEligibilityRequest", "CoverageEligibilityRequest"),

	/**
	 * The '<em><b>Coverage Eligibility Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CoverageEligibilityResponse
	 * <!-- end-model-doc -->
	 * @see #COVERAGE_ELIGIBILITY_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	COVERAGE_ELIGIBILITY_RESPONSE(39, "CoverageEligibilityResponse", "CoverageEligibilityResponse"),

	/**
	 * The '<em><b>Detected Issue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DetectedIssue
	 * <!-- end-model-doc -->
	 * @see #DETECTED_ISSUE_VALUE
	 * @generated
	 * @ordered
	 */
	DETECTED_ISSUE(40, "DetectedIssue", "DetectedIssue"),

	/**
	 * The '<em><b>Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Device
	 * <!-- end-model-doc -->
	 * @see #DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE(41, "Device", "Device"),

	/**
	 * The '<em><b>Device Association</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceAssociation
	 * <!-- end-model-doc -->
	 * @see #DEVICE_ASSOCIATION_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_ASSOCIATION(42, "DeviceAssociation", "DeviceAssociation"),

	/**
	 * The '<em><b>Device Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceDefinition
	 * <!-- end-model-doc -->
	 * @see #DEVICE_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_DEFINITION(43, "DeviceDefinition", "DeviceDefinition"),

	/**
	 * The '<em><b>Device Dispense</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceDispense
	 * <!-- end-model-doc -->
	 * @see #DEVICE_DISPENSE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_DISPENSE(44, "DeviceDispense", "DeviceDispense"),

	/**
	 * The '<em><b>Device Metric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceMetric
	 * <!-- end-model-doc -->
	 * @see #DEVICE_METRIC_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_METRIC(45, "DeviceMetric", "DeviceMetric"),

	/**
	 * The '<em><b>Device Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceRequest
	 * <!-- end-model-doc -->
	 * @see #DEVICE_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_REQUEST(46, "DeviceRequest", "DeviceRequest"),

	/**
	 * The '<em><b>Device Usage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceUsage
	 * <!-- end-model-doc -->
	 * @see #DEVICE_USAGE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_USAGE(47, "DeviceUsage", "DeviceUsage"),

	/**
	 * The '<em><b>Diagnostic Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DiagnosticReport
	 * <!-- end-model-doc -->
	 * @see #DIAGNOSTIC_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	DIAGNOSTIC_REPORT(48, "DiagnosticReport", "DiagnosticReport"),

	/**
	 * The '<em><b>Document Reference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DocumentReference
	 * <!-- end-model-doc -->
	 * @see #DOCUMENT_REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENT_REFERENCE(49, "DocumentReference", "DocumentReference"),

	/**
	 * The '<em><b>Domain Resource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DomainResource
	 * <!-- end-model-doc -->
	 * @see #DOMAIN_RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	DOMAIN_RESOURCE(50, "DomainResource", "DomainResource"),

	/**
	 * The '<em><b>Encounter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Encounter
	 * <!-- end-model-doc -->
	 * @see #ENCOUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	ENCOUNTER(51, "Encounter", "Encounter"),

	/**
	 * The '<em><b>Encounter History</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EncounterHistory
	 * <!-- end-model-doc -->
	 * @see #ENCOUNTER_HISTORY_VALUE
	 * @generated
	 * @ordered
	 */
	ENCOUNTER_HISTORY(52, "EncounterHistory", "EncounterHistory"),

	/**
	 * The '<em><b>Endpoint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Endpoint
	 * <!-- end-model-doc -->
	 * @see #ENDPOINT_VALUE
	 * @generated
	 * @ordered
	 */
	ENDPOINT(53, "Endpoint", "Endpoint"),

	/**
	 * The '<em><b>Enrollment Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EnrollmentRequest
	 * <!-- end-model-doc -->
	 * @see #ENROLLMENT_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	ENROLLMENT_REQUEST(54, "EnrollmentRequest", "EnrollmentRequest"),

	/**
	 * The '<em><b>Enrollment Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EnrollmentResponse
	 * <!-- end-model-doc -->
	 * @see #ENROLLMENT_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	ENROLLMENT_RESPONSE(55, "EnrollmentResponse", "EnrollmentResponse"),

	/**
	 * The '<em><b>Episode Of Care</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EpisodeOfCare
	 * <!-- end-model-doc -->
	 * @see #EPISODE_OF_CARE_VALUE
	 * @generated
	 * @ordered
	 */
	EPISODE_OF_CARE(56, "EpisodeOfCare", "EpisodeOfCare"),

	/**
	 * The '<em><b>Event Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EventDefinition
	 * <!-- end-model-doc -->
	 * @see #EVENT_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT_DEFINITION(57, "EventDefinition", "EventDefinition"),

	/**
	 * The '<em><b>Evidence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evidence
	 * <!-- end-model-doc -->
	 * @see #EVIDENCE_VALUE
	 * @generated
	 * @ordered
	 */
	EVIDENCE(58, "Evidence", "Evidence"),

	/**
	 * The '<em><b>Evidence Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EvidenceReport
	 * <!-- end-model-doc -->
	 * @see #EVIDENCE_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	EVIDENCE_REPORT(59, "EvidenceReport", "EvidenceReport"),

	/**
	 * The '<em><b>Evidence Variable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EvidenceVariable
	 * <!-- end-model-doc -->
	 * @see #EVIDENCE_VARIABLE_VALUE
	 * @generated
	 * @ordered
	 */
	EVIDENCE_VARIABLE(60, "EvidenceVariable", "EvidenceVariable"),

	/**
	 * The '<em><b>Example Scenario</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExampleScenario
	 * <!-- end-model-doc -->
	 * @see #EXAMPLE_SCENARIO_VALUE
	 * @generated
	 * @ordered
	 */
	EXAMPLE_SCENARIO(61, "ExampleScenario", "ExampleScenario"),

	/**
	 * The '<em><b>Explanation Of Benefit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExplanationOfBenefit
	 * <!-- end-model-doc -->
	 * @see #EXPLANATION_OF_BENEFIT_VALUE
	 * @generated
	 * @ordered
	 */
	EXPLANATION_OF_BENEFIT(62, "ExplanationOfBenefit", "ExplanationOfBenefit"),

	/**
	 * The '<em><b>Family Member History</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FamilyMemberHistory
	 * <!-- end-model-doc -->
	 * @see #FAMILY_MEMBER_HISTORY_VALUE
	 * @generated
	 * @ordered
	 */
	FAMILY_MEMBER_HISTORY(63, "FamilyMemberHistory", "FamilyMemberHistory"),

	/**
	 * The '<em><b>Flag</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flag
	 * <!-- end-model-doc -->
	 * @see #FLAG_VALUE
	 * @generated
	 * @ordered
	 */
	FLAG(64, "Flag", "Flag"),

	/**
	 * The '<em><b>Formulary Item</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FormularyItem
	 * <!-- end-model-doc -->
	 * @see #FORMULARY_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	FORMULARY_ITEM(65, "FormularyItem", "FormularyItem"),

	/**
	 * The '<em><b>Genomic Study</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GenomicStudy
	 * <!-- end-model-doc -->
	 * @see #GENOMIC_STUDY_VALUE
	 * @generated
	 * @ordered
	 */
	GENOMIC_STUDY(66, "GenomicStudy", "GenomicStudy"),

	/**
	 * The '<em><b>Goal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Goal
	 * <!-- end-model-doc -->
	 * @see #GOAL_VALUE
	 * @generated
	 * @ordered
	 */
	GOAL(67, "Goal", "Goal"),

	/**
	 * The '<em><b>Graph Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GraphDefinition
	 * <!-- end-model-doc -->
	 * @see #GRAPH_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	GRAPH_DEFINITION(68, "GraphDefinition", "GraphDefinition"),

	/**
	 * The '<em><b>Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Group
	 * <!-- end-model-doc -->
	 * @see #GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	GROUP(69, "Group", "Group"),

	/**
	 * The '<em><b>Guidance Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GuidanceResponse
	 * <!-- end-model-doc -->
	 * @see #GUIDANCE_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	GUIDANCE_RESPONSE(70, "GuidanceResponse", "GuidanceResponse"),

	/**
	 * The '<em><b>Healthcare Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HealthcareService
	 * <!-- end-model-doc -->
	 * @see #HEALTHCARE_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	HEALTHCARE_SERVICE(71, "HealthcareService", "HealthcareService"),

	/**
	 * The '<em><b>Imaging Selection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImagingSelection
	 * <!-- end-model-doc -->
	 * @see #IMAGING_SELECTION_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGING_SELECTION(72, "ImagingSelection", "ImagingSelection"),

	/**
	 * The '<em><b>Imaging Study</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImagingStudy
	 * <!-- end-model-doc -->
	 * @see #IMAGING_STUDY_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGING_STUDY(73, "ImagingStudy", "ImagingStudy"),

	/**
	 * The '<em><b>Immunization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Immunization
	 * <!-- end-model-doc -->
	 * @see #IMMUNIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	IMMUNIZATION(74, "Immunization", "Immunization"),

	/**
	 * The '<em><b>Immunization Evaluation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImmunizationEvaluation
	 * <!-- end-model-doc -->
	 * @see #IMMUNIZATION_EVALUATION_VALUE
	 * @generated
	 * @ordered
	 */
	IMMUNIZATION_EVALUATION(75, "ImmunizationEvaluation", "ImmunizationEvaluation"),

	/**
	 * The '<em><b>Immunization Recommendation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImmunizationRecommendation
	 * <!-- end-model-doc -->
	 * @see #IMMUNIZATION_RECOMMENDATION_VALUE
	 * @generated
	 * @ordered
	 */
	IMMUNIZATION_RECOMMENDATION(76, "ImmunizationRecommendation", "ImmunizationRecommendation"),

	/**
	 * The '<em><b>Implementation Guide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImplementationGuide
	 * <!-- end-model-doc -->
	 * @see #IMPLEMENTATION_GUIDE_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLEMENTATION_GUIDE(77, "ImplementationGuide", "ImplementationGuide"),

	/**
	 * The '<em><b>Ingredient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ingredient
	 * <!-- end-model-doc -->
	 * @see #INGREDIENT_VALUE
	 * @generated
	 * @ordered
	 */
	INGREDIENT(78, "Ingredient", "Ingredient"),

	/**
	 * The '<em><b>Insurance Plan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InsurancePlan
	 * <!-- end-model-doc -->
	 * @see #INSURANCE_PLAN_VALUE
	 * @generated
	 * @ordered
	 */
	INSURANCE_PLAN(79, "InsurancePlan", "InsurancePlan"),

	/**
	 * The '<em><b>Inventory Item</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InventoryItem
	 * <!-- end-model-doc -->
	 * @see #INVENTORY_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	INVENTORY_ITEM(80, "InventoryItem", "InventoryItem"),

	/**
	 * The '<em><b>Inventory Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InventoryReport
	 * <!-- end-model-doc -->
	 * @see #INVENTORY_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	INVENTORY_REPORT(81, "InventoryReport", "InventoryReport"),

	/**
	 * The '<em><b>Invoice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Invoice
	 * <!-- end-model-doc -->
	 * @see #INVOICE_VALUE
	 * @generated
	 * @ordered
	 */
	INVOICE(82, "Invoice", "Invoice"),

	/**
	 * The '<em><b>Library</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Library
	 * <!-- end-model-doc -->
	 * @see #LIBRARY_VALUE
	 * @generated
	 * @ordered
	 */
	LIBRARY(83, "Library", "Library"),

	/**
	 * The '<em><b>Linkage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linkage
	 * <!-- end-model-doc -->
	 * @see #LINKAGE_VALUE
	 * @generated
	 * @ordered
	 */
	LINKAGE(84, "Linkage", "Linkage"),

	/**
	 * The '<em><b>List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List
	 * <!-- end-model-doc -->
	 * @see #LIST_VALUE
	 * @generated
	 * @ordered
	 */
	LIST(85, "List", "List"),

	/**
	 * The '<em><b>Location</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Location
	 * <!-- end-model-doc -->
	 * @see #LOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	LOCATION(86, "Location", "Location"),

	/**
	 * The '<em><b>Manufactured Item Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ManufacturedItemDefinition
	 * <!-- end-model-doc -->
	 * @see #MANUFACTURED_ITEM_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	MANUFACTURED_ITEM_DEFINITION(87, "ManufacturedItemDefinition", "ManufacturedItemDefinition"),

	/**
	 * The '<em><b>Measure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measure
	 * <!-- end-model-doc -->
	 * @see #MEASURE_VALUE
	 * @generated
	 * @ordered
	 */
	MEASURE(88, "Measure", "Measure"),

	/**
	 * The '<em><b>Measure Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MeasureReport
	 * <!-- end-model-doc -->
	 * @see #MEASURE_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	MEASURE_REPORT(89, "MeasureReport", "MeasureReport"),

	/**
	 * The '<em><b>Medication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Medication
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION(90, "Medication", "Medication"),

	/**
	 * The '<em><b>Medication Administration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationAdministration
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_ADMINISTRATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_ADMINISTRATION(91, "MedicationAdministration", "MedicationAdministration"),

	/**
	 * The '<em><b>Medication Dispense</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationDispense
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_DISPENSE_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_DISPENSE(92, "MedicationDispense", "MedicationDispense"),

	/**
	 * The '<em><b>Medication Knowledge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationKnowledge
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_KNOWLEDGE_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_KNOWLEDGE(93, "MedicationKnowledge", "MedicationKnowledge"),

	/**
	 * The '<em><b>Medication Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationRequest
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_REQUEST(94, "MedicationRequest", "MedicationRequest"),

	/**
	 * The '<em><b>Medication Statement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationStatement
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_STATEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_STATEMENT(95, "MedicationStatement", "MedicationStatement"),

	/**
	 * The '<em><b>Medicinal Product Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductDefinition
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_DEFINITION(96, "MedicinalProductDefinition", "MedicinalProductDefinition"),

	/**
	 * The '<em><b>Message Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MessageDefinition
	 * <!-- end-model-doc -->
	 * @see #MESSAGE_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGE_DEFINITION(97, "MessageDefinition", "MessageDefinition"),

	/**
	 * The '<em><b>Message Header</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MessageHeader
	 * <!-- end-model-doc -->
	 * @see #MESSAGE_HEADER_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGE_HEADER(98, "MessageHeader", "MessageHeader"),

	/**
	 * The '<em><b>Metadata Resource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MetadataResource
	 * <!-- end-model-doc -->
	 * @see #METADATA_RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	METADATA_RESOURCE(99, "MetadataResource", "MetadataResource"),

	/**
	 * The '<em><b>Molecular Sequence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MolecularSequence
	 * <!-- end-model-doc -->
	 * @see #MOLECULAR_SEQUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	MOLECULAR_SEQUENCE(100, "MolecularSequence", "MolecularSequence"),

	/**
	 * The '<em><b>Naming System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NamingSystem
	 * <!-- end-model-doc -->
	 * @see #NAMING_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	NAMING_SYSTEM(101, "NamingSystem", "NamingSystem"),

	/**
	 * The '<em><b>Nutrition Intake</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NutritionIntake
	 * <!-- end-model-doc -->
	 * @see #NUTRITION_INTAKE_VALUE
	 * @generated
	 * @ordered
	 */
	NUTRITION_INTAKE(102, "NutritionIntake", "NutritionIntake"),

	/**
	 * The '<em><b>Nutrition Order</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NutritionOrder
	 * <!-- end-model-doc -->
	 * @see #NUTRITION_ORDER_VALUE
	 * @generated
	 * @ordered
	 */
	NUTRITION_ORDER(103, "NutritionOrder", "NutritionOrder"),

	/**
	 * The '<em><b>Nutrition Product</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NutritionProduct
	 * <!-- end-model-doc -->
	 * @see #NUTRITION_PRODUCT_VALUE
	 * @generated
	 * @ordered
	 */
	NUTRITION_PRODUCT(104, "NutritionProduct", "NutritionProduct"),

	/**
	 * The '<em><b>Observation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Observation
	 * <!-- end-model-doc -->
	 * @see #OBSERVATION_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVATION(105, "Observation", "Observation"),

	/**
	 * The '<em><b>Observation Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ObservationDefinition
	 * <!-- end-model-doc -->
	 * @see #OBSERVATION_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVATION_DEFINITION(106, "ObservationDefinition", "ObservationDefinition"),

	/**
	 * The '<em><b>Operation Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OperationDefinition
	 * <!-- end-model-doc -->
	 * @see #OPERATION_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_DEFINITION(107, "OperationDefinition", "OperationDefinition"),

	/**
	 * The '<em><b>Operation Outcome</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OperationOutcome
	 * <!-- end-model-doc -->
	 * @see #OPERATION_OUTCOME_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_OUTCOME(108, "OperationOutcome", "OperationOutcome"),

	/**
	 * The '<em><b>Organization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organization
	 * <!-- end-model-doc -->
	 * @see #ORGANIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	ORGANIZATION(109, "Organization", "Organization"),

	/**
	 * The '<em><b>Organization Affiliation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OrganizationAffiliation
	 * <!-- end-model-doc -->
	 * @see #ORGANIZATION_AFFILIATION_VALUE
	 * @generated
	 * @ordered
	 */
	ORGANIZATION_AFFILIATION(110, "OrganizationAffiliation", "OrganizationAffiliation"),

	/**
	 * The '<em><b>Packaged Product Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PackagedProductDefinition
	 * <!-- end-model-doc -->
	 * @see #PACKAGED_PRODUCT_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	PACKAGED_PRODUCT_DEFINITION(111, "PackagedProductDefinition", "PackagedProductDefinition"),

	/**
	 * The '<em><b>Parameters</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameters
	 * <!-- end-model-doc -->
	 * @see #PARAMETERS_VALUE
	 * @generated
	 * @ordered
	 */
	PARAMETERS(112, "Parameters", "Parameters"),

	/**
	 * The '<em><b>Patient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient
	 * <!-- end-model-doc -->
	 * @see #PATIENT_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENT(113, "Patient", "Patient"),

	/**
	 * The '<em><b>Payment Notice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PaymentNotice
	 * <!-- end-model-doc -->
	 * @see #PAYMENT_NOTICE_VALUE
	 * @generated
	 * @ordered
	 */
	PAYMENT_NOTICE(114, "PaymentNotice", "PaymentNotice"),

	/**
	 * The '<em><b>Payment Reconciliation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PaymentReconciliation
	 * <!-- end-model-doc -->
	 * @see #PAYMENT_RECONCILIATION_VALUE
	 * @generated
	 * @ordered
	 */
	PAYMENT_RECONCILIATION(115, "PaymentReconciliation", "PaymentReconciliation"),

	/**
	 * The '<em><b>Permission</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Permission
	 * <!-- end-model-doc -->
	 * @see #PERMISSION_VALUE
	 * @generated
	 * @ordered
	 */
	PERMISSION(116, "Permission", "Permission"),

	/**
	 * The '<em><b>Person</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Person
	 * <!-- end-model-doc -->
	 * @see #PERSON_VALUE
	 * @generated
	 * @ordered
	 */
	PERSON(117, "Person", "Person"),

	/**
	 * The '<em><b>Plan Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PlanDefinition
	 * <!-- end-model-doc -->
	 * @see #PLAN_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	PLAN_DEFINITION(118, "PlanDefinition", "PlanDefinition"),

	/**
	 * The '<em><b>Practitioner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Practitioner
	 * <!-- end-model-doc -->
	 * @see #PRACTITIONER_VALUE
	 * @generated
	 * @ordered
	 */
	PRACTITIONER(119, "Practitioner", "Practitioner"),

	/**
	 * The '<em><b>Practitioner Role</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PractitionerRole
	 * <!-- end-model-doc -->
	 * @see #PRACTITIONER_ROLE_VALUE
	 * @generated
	 * @ordered
	 */
	PRACTITIONER_ROLE(120, "PractitionerRole", "PractitionerRole"),

	/**
	 * The '<em><b>Procedure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Procedure
	 * <!-- end-model-doc -->
	 * @see #PROCEDURE_VALUE
	 * @generated
	 * @ordered
	 */
	PROCEDURE(121, "Procedure", "Procedure"),

	/**
	 * The '<em><b>Provenance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provenance
	 * <!-- end-model-doc -->
	 * @see #PROVENANCE_VALUE
	 * @generated
	 * @ordered
	 */
	PROVENANCE(122, "Provenance", "Provenance"),

	/**
	 * The '<em><b>Questionnaire</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Questionnaire
	 * <!-- end-model-doc -->
	 * @see #QUESTIONNAIRE_VALUE
	 * @generated
	 * @ordered
	 */
	QUESTIONNAIRE(123, "Questionnaire", "Questionnaire"),

	/**
	 * The '<em><b>Questionnaire Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * QuestionnaireResponse
	 * <!-- end-model-doc -->
	 * @see #QUESTIONNAIRE_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	QUESTIONNAIRE_RESPONSE(124, "QuestionnaireResponse", "QuestionnaireResponse"),

	/**
	 * The '<em><b>Regulated Authorization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RegulatedAuthorization
	 * <!-- end-model-doc -->
	 * @see #REGULATED_AUTHORIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	REGULATED_AUTHORIZATION(125, "RegulatedAuthorization", "RegulatedAuthorization"),

	/**
	 * The '<em><b>Related Person</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RelatedPerson
	 * <!-- end-model-doc -->
	 * @see #RELATED_PERSON_VALUE
	 * @generated
	 * @ordered
	 */
	RELATED_PERSON(126, "RelatedPerson", "RelatedPerson"),

	/**
	 * The '<em><b>Request Orchestration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RequestOrchestration
	 * <!-- end-model-doc -->
	 * @see #REQUEST_ORCHESTRATION_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_ORCHESTRATION(127, "RequestOrchestration", "RequestOrchestration"),

	/**
	 * The '<em><b>Requirements</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requirements
	 * <!-- end-model-doc -->
	 * @see #REQUIREMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIREMENTS(128, "Requirements", "Requirements"),

	/**
	 * The '<em><b>Research Study</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ResearchStudy
	 * <!-- end-model-doc -->
	 * @see #RESEARCH_STUDY_VALUE
	 * @generated
	 * @ordered
	 */
	RESEARCH_STUDY(129, "ResearchStudy", "ResearchStudy"),

	/**
	 * The '<em><b>Research Subject</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ResearchSubject
	 * <!-- end-model-doc -->
	 * @see #RESEARCH_SUBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	RESEARCH_SUBJECT(130, "ResearchSubject", "ResearchSubject"),

	/**
	 * The '<em><b>Resource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource
	 * <!-- end-model-doc -->
	 * @see #RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE(131, "Resource", "Resource"),

	/**
	 * The '<em><b>Risk Assessment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RiskAssessment
	 * <!-- end-model-doc -->
	 * @see #RISK_ASSESSMENT_VALUE
	 * @generated
	 * @ordered
	 */
	RISK_ASSESSMENT(132, "RiskAssessment", "RiskAssessment"),

	/**
	 * The '<em><b>Schedule</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schedule
	 * <!-- end-model-doc -->
	 * @see #SCHEDULE_VALUE
	 * @generated
	 * @ordered
	 */
	SCHEDULE(133, "Schedule", "Schedule"),

	/**
	 * The '<em><b>Search Parameter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SearchParameter
	 * <!-- end-model-doc -->
	 * @see #SEARCH_PARAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	SEARCH_PARAMETER(134, "SearchParameter", "SearchParameter"),

	/**
	 * The '<em><b>Service Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ServiceRequest
	 * <!-- end-model-doc -->
	 * @see #SERVICE_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_REQUEST(135, "ServiceRequest", "ServiceRequest"),

	/**
	 * The '<em><b>Slot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Slot
	 * <!-- end-model-doc -->
	 * @see #SLOT_VALUE
	 * @generated
	 * @ordered
	 */
	SLOT(136, "Slot", "Slot"),

	/**
	 * The '<em><b>Specimen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specimen
	 * <!-- end-model-doc -->
	 * @see #SPECIMEN_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIMEN(137, "Specimen", "Specimen"),

	/**
	 * The '<em><b>Specimen Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SpecimenDefinition
	 * <!-- end-model-doc -->
	 * @see #SPECIMEN_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIMEN_DEFINITION(138, "SpecimenDefinition", "SpecimenDefinition"),

	/**
	 * The '<em><b>Structure Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StructureDefinition
	 * <!-- end-model-doc -->
	 * @see #STRUCTURE_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	STRUCTURE_DEFINITION(139, "StructureDefinition", "StructureDefinition"),

	/**
	 * The '<em><b>Structure Map</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StructureMap
	 * <!-- end-model-doc -->
	 * @see #STRUCTURE_MAP_VALUE
	 * @generated
	 * @ordered
	 */
	STRUCTURE_MAP(140, "StructureMap", "StructureMap"),

	/**
	 * The '<em><b>Subscription</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subscription
	 * <!-- end-model-doc -->
	 * @see #SUBSCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSCRIPTION(141, "Subscription", "Subscription"),

	/**
	 * The '<em><b>Subscription Status</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubscriptionStatus
	 * <!-- end-model-doc -->
	 * @see #SUBSCRIPTION_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSCRIPTION_STATUS(142, "SubscriptionStatus", "SubscriptionStatus"),

	/**
	 * The '<em><b>Subscription Topic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubscriptionTopic
	 * <!-- end-model-doc -->
	 * @see #SUBSCRIPTION_TOPIC_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSCRIPTION_TOPIC(143, "SubscriptionTopic", "SubscriptionTopic"),

	/**
	 * The '<em><b>Substance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Substance
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE(144, "Substance", "Substance"),

	/**
	 * The '<em><b>Substance Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubstanceDefinition
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE_DEFINITION(145, "SubstanceDefinition", "SubstanceDefinition"),

	/**
	 * The '<em><b>Substance Nucleic Acid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubstanceNucleicAcid
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE_NUCLEIC_ACID_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE_NUCLEIC_ACID(146, "SubstanceNucleicAcid", "SubstanceNucleicAcid"),

	/**
	 * The '<em><b>Substance Polymer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubstancePolymer
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE_POLYMER_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE_POLYMER(147, "SubstancePolymer", "SubstancePolymer"),

	/**
	 * The '<em><b>Substance Protein</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubstanceProtein
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE_PROTEIN_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE_PROTEIN(148, "SubstanceProtein", "SubstanceProtein"),

	/**
	 * The '<em><b>Substance Reference Information</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubstanceReferenceInformation
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE_REFERENCE_INFORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE_REFERENCE_INFORMATION(149, "SubstanceReferenceInformation", "SubstanceReferenceInformation"),

	/**
	 * The '<em><b>Substance Source Material</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubstanceSourceMaterial
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE_SOURCE_MATERIAL_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE_SOURCE_MATERIAL(150, "SubstanceSourceMaterial", "SubstanceSourceMaterial"),

	/**
	 * The '<em><b>Supply Delivery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupplyDelivery
	 * <!-- end-model-doc -->
	 * @see #SUPPLY_DELIVERY_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPLY_DELIVERY(151, "SupplyDelivery", "SupplyDelivery"),

	/**
	 * The '<em><b>Supply Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupplyRequest
	 * <!-- end-model-doc -->
	 * @see #SUPPLY_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPLY_REQUEST(152, "SupplyRequest", "SupplyRequest"),

	/**
	 * The '<em><b>Task</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Task
	 * <!-- end-model-doc -->
	 * @see #TASK_VALUE
	 * @generated
	 * @ordered
	 */
	TASK(153, "Task", "Task"),

	/**
	 * The '<em><b>Terminology Capabilities</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TerminologyCapabilities
	 * <!-- end-model-doc -->
	 * @see #TERMINOLOGY_CAPABILITIES_VALUE
	 * @generated
	 * @ordered
	 */
	TERMINOLOGY_CAPABILITIES(154, "TerminologyCapabilities", "TerminologyCapabilities"),

	/**
	 * The '<em><b>Test Plan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TestPlan
	 * <!-- end-model-doc -->
	 * @see #TEST_PLAN_VALUE
	 * @generated
	 * @ordered
	 */
	TEST_PLAN(155, "TestPlan", "TestPlan"),

	/**
	 * The '<em><b>Test Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TestReport
	 * <!-- end-model-doc -->
	 * @see #TEST_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	TEST_REPORT(156, "TestReport", "TestReport"),

	/**
	 * The '<em><b>Test Script</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TestScript
	 * <!-- end-model-doc -->
	 * @see #TEST_SCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	TEST_SCRIPT(157, "TestScript", "TestScript"),

	/**
	 * The '<em><b>Transport</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transport
	 * <!-- end-model-doc -->
	 * @see #TRANSPORT_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSPORT(158, "Transport", "Transport"),

	/**
	 * The '<em><b>Value Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ValueSet
	 * <!-- end-model-doc -->
	 * @see #VALUE_SET_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE_SET(159, "ValueSet", "ValueSet"),

	/**
	 * The '<em><b>Verification Result</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VerificationResult
	 * <!-- end-model-doc -->
	 * @see #VERIFICATION_RESULT_VALUE
	 * @generated
	 * @ordered
	 */
	VERIFICATION_RESULT(160, "VerificationResult", "VerificationResult"),

	/**
	 * The '<em><b>Vision Prescription</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VisionPrescription
	 * <!-- end-model-doc -->
	 * @see #VISION_PRESCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	VISION_PRESCRIPTION(161, "VisionPrescription", "VisionPrescription"),

	/**
	 * The '<em><b>Body Site</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BodySite
	 * <!-- end-model-doc -->
	 * @see #BODY_SITE_VALUE
	 * @generated
	 * @ordered
	 */
	BODY_SITE(162, "BodySite", "BodySite"),

	/**
	 * The '<em><b>Catalog Entry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CatalogEntry
	 * <!-- end-model-doc -->
	 * @see #CATALOG_ENTRY_VALUE
	 * @generated
	 * @ordered
	 */
	CATALOG_ENTRY(163, "CatalogEntry", "CatalogEntry"),

	/**
	 * The '<em><b>Conformance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Conformance
	 * <!-- end-model-doc -->
	 * @see #CONFORMANCE_VALUE
	 * @generated
	 * @ordered
	 */
	CONFORMANCE(164, "Conformance", "Conformance"),

	/**
	 * The '<em><b>Data Element</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DataElement
	 * <!-- end-model-doc -->
	 * @see #DATA_ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_ELEMENT(165, "DataElement", "DataElement"),

	/**
	 * The '<em><b>Device Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceComponent
	 * <!-- end-model-doc -->
	 * @see #DEVICE_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_COMPONENT(166, "DeviceComponent", "DeviceComponent"),

	/**
	 * The '<em><b>Device Use Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceUseRequest
	 * <!-- end-model-doc -->
	 * @see #DEVICE_USE_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_USE_REQUEST(167, "DeviceUseRequest", "DeviceUseRequest"),

	/**
	 * The '<em><b>Device Use Statement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceUseStatement
	 * <!-- end-model-doc -->
	 * @see #DEVICE_USE_STATEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_USE_STATEMENT(168, "DeviceUseStatement", "DeviceUseStatement"),

	/**
	 * The '<em><b>Diagnostic Order</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DiagnosticOrder
	 * <!-- end-model-doc -->
	 * @see #DIAGNOSTIC_ORDER_VALUE
	 * @generated
	 * @ordered
	 */
	DIAGNOSTIC_ORDER(169, "DiagnosticOrder", "DiagnosticOrder"),

	/**
	 * The '<em><b>Document Manifest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DocumentManifest
	 * <!-- end-model-doc -->
	 * @see #DOCUMENT_MANIFEST_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENT_MANIFEST(170, "DocumentManifest", "DocumentManifest"),

	/**
	 * The '<em><b>Effect Evidence Synthesis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EffectEvidenceSynthesis
	 * <!-- end-model-doc -->
	 * @see #EFFECT_EVIDENCE_SYNTHESIS_VALUE
	 * @generated
	 * @ordered
	 */
	EFFECT_EVIDENCE_SYNTHESIS(171, "EffectEvidenceSynthesis", "EffectEvidenceSynthesis"),

	/**
	 * The '<em><b>Eligibility Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EligibilityRequest
	 * <!-- end-model-doc -->
	 * @see #ELIGIBILITY_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	ELIGIBILITY_REQUEST(172, "EligibilityRequest", "EligibilityRequest"),

	/**
	 * The '<em><b>Eligibility Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EligibilityResponse
	 * <!-- end-model-doc -->
	 * @see #ELIGIBILITY_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	ELIGIBILITY_RESPONSE(173, "EligibilityResponse", "EligibilityResponse"),

	/**
	 * The '<em><b>Expansion Profile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExpansionProfile
	 * <!-- end-model-doc -->
	 * @see #EXPANSION_PROFILE_VALUE
	 * @generated
	 * @ordered
	 */
	EXPANSION_PROFILE(174, "ExpansionProfile", "ExpansionProfile"),

	/**
	 * The '<em><b>Imaging Manifest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImagingManifest
	 * <!-- end-model-doc -->
	 * @see #IMAGING_MANIFEST_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGING_MANIFEST(175, "ImagingManifest", "ImagingManifest"),

	/**
	 * The '<em><b>Imaging Object Selection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImagingObjectSelection
	 * <!-- end-model-doc -->
	 * @see #IMAGING_OBJECT_SELECTION_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGING_OBJECT_SELECTION(176, "ImagingObjectSelection", "ImagingObjectSelection"),

	/**
	 * The '<em><b>Media</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Media
	 * <!-- end-model-doc -->
	 * @see #MEDIA_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIA(177, "Media", "Media"),

	/**
	 * The '<em><b>Medication Order</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationOrder
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_ORDER_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_ORDER(178, "MedicationOrder", "MedicationOrder"),

	/**
	 * The '<em><b>Medication Usage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationUsage
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_USAGE_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_USAGE(179, "MedicationUsage", "MedicationUsage"),

	/**
	 * The '<em><b>Medicinal Product</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProduct
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT(180, "MedicinalProduct", "MedicinalProduct"),

	/**
	 * The '<em><b>Medicinal Product Authorization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductAuthorization
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_AUTHORIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_AUTHORIZATION(181, "MedicinalProductAuthorization", "MedicinalProductAuthorization"),

	/**
	 * The '<em><b>Medicinal Product Contraindication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductContraindication
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_CONTRAINDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_CONTRAINDICATION(182, "MedicinalProductContraindication", "MedicinalProductContraindication"),

	/**
	 * The '<em><b>Medicinal Product Indication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductIndication
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_INDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_INDICATION(183, "MedicinalProductIndication", "MedicinalProductIndication"),

	/**
	 * The '<em><b>Medicinal Product Ingredient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductIngredient
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_INGREDIENT_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_INGREDIENT(184, "MedicinalProductIngredient", "MedicinalProductIngredient"),

	/**
	 * The '<em><b>Medicinal Product Interaction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductInteraction
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_INTERACTION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_INTERACTION(185, "MedicinalProductInteraction", "MedicinalProductInteraction"),

	/**
	 * The '<em><b>Medicinal Product Manufactured</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductManufactured
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_MANUFACTURED_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_MANUFACTURED(186, "MedicinalProductManufactured", "MedicinalProductManufactured"),

	/**
	 * The '<em><b>Medicinal Product Packaged</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductPackaged
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_PACKAGED_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_PACKAGED(187, "MedicinalProductPackaged", "MedicinalProductPackaged"),

	/**
	 * The '<em><b>Medicinal Product Pharmaceutical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductPharmaceutical
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_PHARMACEUTICAL_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_PHARMACEUTICAL(188, "MedicinalProductPharmaceutical", "MedicinalProductPharmaceutical"),

	/**
	 * The '<em><b>Medicinal Product Undesirable Effect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductUndesirableEffect
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT(189, "MedicinalProductUndesirableEffect", "MedicinalProductUndesirableEffect"),

	/**
	 * The '<em><b>Order</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Order
	 * <!-- end-model-doc -->
	 * @see #ORDER_VALUE
	 * @generated
	 * @ordered
	 */
	ORDER(190, "Order", "Order"),

	/**
	 * The '<em><b>Order Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OrderResponse
	 * <!-- end-model-doc -->
	 * @see #ORDER_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	ORDER_RESPONSE(191, "OrderResponse", "OrderResponse"),

	/**
	 * The '<em><b>Procedure Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ProcedureRequest
	 * <!-- end-model-doc -->
	 * @see #PROCEDURE_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	PROCEDURE_REQUEST(192, "ProcedureRequest", "ProcedureRequest"),

	/**
	 * The '<em><b>Process Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ProcessRequest
	 * <!-- end-model-doc -->
	 * @see #PROCESS_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESS_REQUEST(193, "ProcessRequest", "ProcessRequest"),

	/**
	 * The '<em><b>Process Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ProcessResponse
	 * <!-- end-model-doc -->
	 * @see #PROCESS_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESS_RESPONSE(194, "ProcessResponse", "ProcessResponse"),

	/**
	 * The '<em><b>Referral Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ReferralRequest
	 * <!-- end-model-doc -->
	 * @see #REFERRAL_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	REFERRAL_REQUEST(195, "ReferralRequest", "ReferralRequest"),

	/**
	 * The '<em><b>Request Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RequestGroup
	 * <!-- end-model-doc -->
	 * @see #REQUEST_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_GROUP(196, "RequestGroup", "RequestGroup"),

	/**
	 * The '<em><b>Research Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ResearchDefinition
	 * <!-- end-model-doc -->
	 * @see #RESEARCH_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	RESEARCH_DEFINITION(197, "ResearchDefinition", "ResearchDefinition"),

	/**
	 * The '<em><b>Research Element Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ResearchElementDefinition
	 * <!-- end-model-doc -->
	 * @see #RESEARCH_ELEMENT_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	RESEARCH_ELEMENT_DEFINITION(198, "ResearchElementDefinition", "ResearchElementDefinition"),

	/**
	 * The '<em><b>Risk Evidence Synthesis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RiskEvidenceSynthesis
	 * <!-- end-model-doc -->
	 * @see #RISK_EVIDENCE_SYNTHESIS_VALUE
	 * @generated
	 * @ordered
	 */
	RISK_EVIDENCE_SYNTHESIS(199, "RiskEvidenceSynthesis", "RiskEvidenceSynthesis"),

	/**
	 * The '<em><b>Sequence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sequence
	 * <!-- end-model-doc -->
	 * @see #SEQUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	SEQUENCE(200, "Sequence", "Sequence"),

	/**
	 * The '<em><b>Service Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ServiceDefinition
	 * <!-- end-model-doc -->
	 * @see #SERVICE_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_DEFINITION(201, "ServiceDefinition", "ServiceDefinition"),

	/**
	 * The '<em><b>Substance Specification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubstanceSpecification
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE_SPECIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE_SPECIFICATION(202, "SubstanceSpecification", "SubstanceSpecification");

	/**
	 * The '<em><b>Account</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Account
	 * <!-- end-model-doc -->
	 * @see #ACCOUNT
	 * @model name="Account"
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNT_VALUE = 0;

	/**
	 * The '<em><b>Activity Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityDefinition
	 * <!-- end-model-doc -->
	 * @see #ACTIVITY_DEFINITION
	 * @model name="ActivityDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_DEFINITION_VALUE = 1;

	/**
	 * The '<em><b>Actor Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActorDefinition
	 * <!-- end-model-doc -->
	 * @see #ACTOR_DEFINITION
	 * @model name="ActorDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int ACTOR_DEFINITION_VALUE = 2;

	/**
	 * The '<em><b>Administrable Product Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AdministrableProductDefinition
	 * <!-- end-model-doc -->
	 * @see #ADMINISTRABLE_PRODUCT_DEFINITION
	 * @model name="AdministrableProductDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int ADMINISTRABLE_PRODUCT_DEFINITION_VALUE = 3;

	/**
	 * The '<em><b>Adverse Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AdverseEvent
	 * <!-- end-model-doc -->
	 * @see #ADVERSE_EVENT
	 * @model name="AdverseEvent"
	 * @generated
	 * @ordered
	 */
	public static final int ADVERSE_EVENT_VALUE = 4;

	/**
	 * The '<em><b>Allergy Intolerance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AllergyIntolerance
	 * <!-- end-model-doc -->
	 * @see #ALLERGY_INTOLERANCE
	 * @model name="AllergyIntolerance"
	 * @generated
	 * @ordered
	 */
	public static final int ALLERGY_INTOLERANCE_VALUE = 5;

	/**
	 * The '<em><b>Appointment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appointment
	 * <!-- end-model-doc -->
	 * @see #APPOINTMENT
	 * @model name="Appointment"
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT_VALUE = 6;

	/**
	 * The '<em><b>Appointment Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AppointmentResponse
	 * <!-- end-model-doc -->
	 * @see #APPOINTMENT_RESPONSE
	 * @model name="AppointmentResponse"
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT_RESPONSE_VALUE = 7;

	/**
	 * The '<em><b>Artifact Assessment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ArtifactAssessment
	 * <!-- end-model-doc -->
	 * @see #ARTIFACT_ASSESSMENT
	 * @model name="ArtifactAssessment"
	 * @generated
	 * @ordered
	 */
	public static final int ARTIFACT_ASSESSMENT_VALUE = 8;

	/**
	 * The '<em><b>Audit Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AuditEvent
	 * <!-- end-model-doc -->
	 * @see #AUDIT_EVENT
	 * @model name="AuditEvent"
	 * @generated
	 * @ordered
	 */
	public static final int AUDIT_EVENT_VALUE = 9;

	/**
	 * The '<em><b>Basic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Basic
	 * <!-- end-model-doc -->
	 * @see #BASIC
	 * @model name="Basic"
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_VALUE = 10;

	/**
	 * The '<em><b>Binary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Binary
	 * <!-- end-model-doc -->
	 * @see #BINARY
	 * @model name="Binary"
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_VALUE = 11;

	/**
	 * The '<em><b>Biologically Derived Product</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BiologicallyDerivedProduct
	 * <!-- end-model-doc -->
	 * @see #BIOLOGICALLY_DERIVED_PRODUCT
	 * @model name="BiologicallyDerivedProduct"
	 * @generated
	 * @ordered
	 */
	public static final int BIOLOGICALLY_DERIVED_PRODUCT_VALUE = 12;

	/**
	 * The '<em><b>Biologically Derived Product Dispense</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BiologicallyDerivedProductDispense
	 * <!-- end-model-doc -->
	 * @see #BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE
	 * @model name="BiologicallyDerivedProductDispense"
	 * @generated
	 * @ordered
	 */
	public static final int BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE_VALUE = 13;

	/**
	 * The '<em><b>Body Structure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BodyStructure
	 * <!-- end-model-doc -->
	 * @see #BODY_STRUCTURE
	 * @model name="BodyStructure"
	 * @generated
	 * @ordered
	 */
	public static final int BODY_STRUCTURE_VALUE = 14;

	/**
	 * The '<em><b>Bundle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bundle
	 * <!-- end-model-doc -->
	 * @see #BUNDLE
	 * @model name="Bundle"
	 * @generated
	 * @ordered
	 */
	public static final int BUNDLE_VALUE = 15;

	/**
	 * The '<em><b>Canonical Resource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CanonicalResource
	 * <!-- end-model-doc -->
	 * @see #CANONICAL_RESOURCE
	 * @model name="CanonicalResource"
	 * @generated
	 * @ordered
	 */
	public static final int CANONICAL_RESOURCE_VALUE = 16;

	/**
	 * The '<em><b>Capability Statement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CapabilityStatement
	 * <!-- end-model-doc -->
	 * @see #CAPABILITY_STATEMENT
	 * @model name="CapabilityStatement"
	 * @generated
	 * @ordered
	 */
	public static final int CAPABILITY_STATEMENT_VALUE = 17;

	/**
	 * The '<em><b>Care Plan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CarePlan
	 * <!-- end-model-doc -->
	 * @see #CARE_PLAN
	 * @model name="CarePlan"
	 * @generated
	 * @ordered
	 */
	public static final int CARE_PLAN_VALUE = 18;

	/**
	 * The '<em><b>Care Team</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CareTeam
	 * <!-- end-model-doc -->
	 * @see #CARE_TEAM
	 * @model name="CareTeam"
	 * @generated
	 * @ordered
	 */
	public static final int CARE_TEAM_VALUE = 19;

	/**
	 * The '<em><b>Charge Item</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ChargeItem
	 * <!-- end-model-doc -->
	 * @see #CHARGE_ITEM
	 * @model name="ChargeItem"
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE_ITEM_VALUE = 20;

	/**
	 * The '<em><b>Charge Item Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ChargeItemDefinition
	 * <!-- end-model-doc -->
	 * @see #CHARGE_ITEM_DEFINITION
	 * @model name="ChargeItemDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE_ITEM_DEFINITION_VALUE = 21;

	/**
	 * The '<em><b>Citation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Citation
	 * <!-- end-model-doc -->
	 * @see #CITATION
	 * @model name="Citation"
	 * @generated
	 * @ordered
	 */
	public static final int CITATION_VALUE = 22;

	/**
	 * The '<em><b>Claim</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Claim
	 * <!-- end-model-doc -->
	 * @see #CLAIM
	 * @model name="Claim"
	 * @generated
	 * @ordered
	 */
	public static final int CLAIM_VALUE = 23;

	/**
	 * The '<em><b>Claim Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ClaimResponse
	 * <!-- end-model-doc -->
	 * @see #CLAIM_RESPONSE
	 * @model name="ClaimResponse"
	 * @generated
	 * @ordered
	 */
	public static final int CLAIM_RESPONSE_VALUE = 24;

	/**
	 * The '<em><b>Clinical Impression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ClinicalImpression
	 * <!-- end-model-doc -->
	 * @see #CLINICAL_IMPRESSION
	 * @model name="ClinicalImpression"
	 * @generated
	 * @ordered
	 */
	public static final int CLINICAL_IMPRESSION_VALUE = 25;

	/**
	 * The '<em><b>Clinical Use Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ClinicalUseDefinition
	 * <!-- end-model-doc -->
	 * @see #CLINICAL_USE_DEFINITION
	 * @model name="ClinicalUseDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int CLINICAL_USE_DEFINITION_VALUE = 26;

	/**
	 * The '<em><b>Code System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CodeSystem
	 * <!-- end-model-doc -->
	 * @see #CODE_SYSTEM
	 * @model name="CodeSystem"
	 * @generated
	 * @ordered
	 */
	public static final int CODE_SYSTEM_VALUE = 27;

	/**
	 * The '<em><b>Communication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Communication
	 * <!-- end-model-doc -->
	 * @see #COMMUNICATION
	 * @model name="Communication"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_VALUE = 28;

	/**
	 * The '<em><b>Communication Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CommunicationRequest
	 * <!-- end-model-doc -->
	 * @see #COMMUNICATION_REQUEST
	 * @model name="CommunicationRequest"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_REQUEST_VALUE = 29;

	/**
	 * The '<em><b>Compartment Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CompartmentDefinition
	 * <!-- end-model-doc -->
	 * @see #COMPARTMENT_DEFINITION
	 * @model name="CompartmentDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int COMPARTMENT_DEFINITION_VALUE = 30;

	/**
	 * The '<em><b>Composition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Composition
	 * <!-- end-model-doc -->
	 * @see #COMPOSITION
	 * @model name="Composition"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITION_VALUE = 31;

	/**
	 * The '<em><b>Concept Map</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ConceptMap
	 * <!-- end-model-doc -->
	 * @see #CONCEPT_MAP
	 * @model name="ConceptMap"
	 * @generated
	 * @ordered
	 */
	public static final int CONCEPT_MAP_VALUE = 32;

	/**
	 * The '<em><b>Condition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Condition
	 * <!-- end-model-doc -->
	 * @see #CONDITION
	 * @model name="Condition"
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_VALUE = 33;

	/**
	 * The '<em><b>Condition Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ConditionDefinition
	 * <!-- end-model-doc -->
	 * @see #CONDITION_DEFINITION
	 * @model name="ConditionDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_DEFINITION_VALUE = 34;

	/**
	 * The '<em><b>Consent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Consent
	 * <!-- end-model-doc -->
	 * @see #CONSENT
	 * @model name="Consent"
	 * @generated
	 * @ordered
	 */
	public static final int CONSENT_VALUE = 35;

	/**
	 * The '<em><b>Contract</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contract
	 * <!-- end-model-doc -->
	 * @see #CONTRACT
	 * @model name="Contract"
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACT_VALUE = 36;

	/**
	 * The '<em><b>Coverage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage
	 * <!-- end-model-doc -->
	 * @see #COVERAGE
	 * @model name="Coverage"
	 * @generated
	 * @ordered
	 */
	public static final int COVERAGE_VALUE = 37;

	/**
	 * The '<em><b>Coverage Eligibility Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CoverageEligibilityRequest
	 * <!-- end-model-doc -->
	 * @see #COVERAGE_ELIGIBILITY_REQUEST
	 * @model name="CoverageEligibilityRequest"
	 * @generated
	 * @ordered
	 */
	public static final int COVERAGE_ELIGIBILITY_REQUEST_VALUE = 38;

	/**
	 * The '<em><b>Coverage Eligibility Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CoverageEligibilityResponse
	 * <!-- end-model-doc -->
	 * @see #COVERAGE_ELIGIBILITY_RESPONSE
	 * @model name="CoverageEligibilityResponse"
	 * @generated
	 * @ordered
	 */
	public static final int COVERAGE_ELIGIBILITY_RESPONSE_VALUE = 39;

	/**
	 * The '<em><b>Detected Issue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DetectedIssue
	 * <!-- end-model-doc -->
	 * @see #DETECTED_ISSUE
	 * @model name="DetectedIssue"
	 * @generated
	 * @ordered
	 */
	public static final int DETECTED_ISSUE_VALUE = 40;

	/**
	 * The '<em><b>Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Device
	 * <!-- end-model-doc -->
	 * @see #DEVICE
	 * @model name="Device"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_VALUE = 41;

	/**
	 * The '<em><b>Device Association</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceAssociation
	 * <!-- end-model-doc -->
	 * @see #DEVICE_ASSOCIATION
	 * @model name="DeviceAssociation"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_ASSOCIATION_VALUE = 42;

	/**
	 * The '<em><b>Device Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceDefinition
	 * <!-- end-model-doc -->
	 * @see #DEVICE_DEFINITION
	 * @model name="DeviceDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_DEFINITION_VALUE = 43;

	/**
	 * The '<em><b>Device Dispense</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceDispense
	 * <!-- end-model-doc -->
	 * @see #DEVICE_DISPENSE
	 * @model name="DeviceDispense"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_DISPENSE_VALUE = 44;

	/**
	 * The '<em><b>Device Metric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceMetric
	 * <!-- end-model-doc -->
	 * @see #DEVICE_METRIC
	 * @model name="DeviceMetric"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_METRIC_VALUE = 45;

	/**
	 * The '<em><b>Device Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceRequest
	 * <!-- end-model-doc -->
	 * @see #DEVICE_REQUEST
	 * @model name="DeviceRequest"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_REQUEST_VALUE = 46;

	/**
	 * The '<em><b>Device Usage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceUsage
	 * <!-- end-model-doc -->
	 * @see #DEVICE_USAGE
	 * @model name="DeviceUsage"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_USAGE_VALUE = 47;

	/**
	 * The '<em><b>Diagnostic Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DiagnosticReport
	 * <!-- end-model-doc -->
	 * @see #DIAGNOSTIC_REPORT
	 * @model name="DiagnosticReport"
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSTIC_REPORT_VALUE = 48;

	/**
	 * The '<em><b>Document Reference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DocumentReference
	 * <!-- end-model-doc -->
	 * @see #DOCUMENT_REFERENCE
	 * @model name="DocumentReference"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_REFERENCE_VALUE = 49;

	/**
	 * The '<em><b>Domain Resource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DomainResource
	 * <!-- end-model-doc -->
	 * @see #DOMAIN_RESOURCE
	 * @model name="DomainResource"
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN_RESOURCE_VALUE = 50;

	/**
	 * The '<em><b>Encounter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Encounter
	 * <!-- end-model-doc -->
	 * @see #ENCOUNTER
	 * @model name="Encounter"
	 * @generated
	 * @ordered
	 */
	public static final int ENCOUNTER_VALUE = 51;

	/**
	 * The '<em><b>Encounter History</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EncounterHistory
	 * <!-- end-model-doc -->
	 * @see #ENCOUNTER_HISTORY
	 * @model name="EncounterHistory"
	 * @generated
	 * @ordered
	 */
	public static final int ENCOUNTER_HISTORY_VALUE = 52;

	/**
	 * The '<em><b>Endpoint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Endpoint
	 * <!-- end-model-doc -->
	 * @see #ENDPOINT
	 * @model name="Endpoint"
	 * @generated
	 * @ordered
	 */
	public static final int ENDPOINT_VALUE = 53;

	/**
	 * The '<em><b>Enrollment Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EnrollmentRequest
	 * <!-- end-model-doc -->
	 * @see #ENROLLMENT_REQUEST
	 * @model name="EnrollmentRequest"
	 * @generated
	 * @ordered
	 */
	public static final int ENROLLMENT_REQUEST_VALUE = 54;

	/**
	 * The '<em><b>Enrollment Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EnrollmentResponse
	 * <!-- end-model-doc -->
	 * @see #ENROLLMENT_RESPONSE
	 * @model name="EnrollmentResponse"
	 * @generated
	 * @ordered
	 */
	public static final int ENROLLMENT_RESPONSE_VALUE = 55;

	/**
	 * The '<em><b>Episode Of Care</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EpisodeOfCare
	 * <!-- end-model-doc -->
	 * @see #EPISODE_OF_CARE
	 * @model name="EpisodeOfCare"
	 * @generated
	 * @ordered
	 */
	public static final int EPISODE_OF_CARE_VALUE = 56;

	/**
	 * The '<em><b>Event Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EventDefinition
	 * <!-- end-model-doc -->
	 * @see #EVENT_DEFINITION
	 * @model name="EventDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_DEFINITION_VALUE = 57;

	/**
	 * The '<em><b>Evidence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evidence
	 * <!-- end-model-doc -->
	 * @see #EVIDENCE
	 * @model name="Evidence"
	 * @generated
	 * @ordered
	 */
	public static final int EVIDENCE_VALUE = 58;

	/**
	 * The '<em><b>Evidence Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EvidenceReport
	 * <!-- end-model-doc -->
	 * @see #EVIDENCE_REPORT
	 * @model name="EvidenceReport"
	 * @generated
	 * @ordered
	 */
	public static final int EVIDENCE_REPORT_VALUE = 59;

	/**
	 * The '<em><b>Evidence Variable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EvidenceVariable
	 * <!-- end-model-doc -->
	 * @see #EVIDENCE_VARIABLE
	 * @model name="EvidenceVariable"
	 * @generated
	 * @ordered
	 */
	public static final int EVIDENCE_VARIABLE_VALUE = 60;

	/**
	 * The '<em><b>Example Scenario</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExampleScenario
	 * <!-- end-model-doc -->
	 * @see #EXAMPLE_SCENARIO
	 * @model name="ExampleScenario"
	 * @generated
	 * @ordered
	 */
	public static final int EXAMPLE_SCENARIO_VALUE = 61;

	/**
	 * The '<em><b>Explanation Of Benefit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExplanationOfBenefit
	 * <!-- end-model-doc -->
	 * @see #EXPLANATION_OF_BENEFIT
	 * @model name="ExplanationOfBenefit"
	 * @generated
	 * @ordered
	 */
	public static final int EXPLANATION_OF_BENEFIT_VALUE = 62;

	/**
	 * The '<em><b>Family Member History</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FamilyMemberHistory
	 * <!-- end-model-doc -->
	 * @see #FAMILY_MEMBER_HISTORY
	 * @model name="FamilyMemberHistory"
	 * @generated
	 * @ordered
	 */
	public static final int FAMILY_MEMBER_HISTORY_VALUE = 63;

	/**
	 * The '<em><b>Flag</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flag
	 * <!-- end-model-doc -->
	 * @see #FLAG
	 * @model name="Flag"
	 * @generated
	 * @ordered
	 */
	public static final int FLAG_VALUE = 64;

	/**
	 * The '<em><b>Formulary Item</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FormularyItem
	 * <!-- end-model-doc -->
	 * @see #FORMULARY_ITEM
	 * @model name="FormularyItem"
	 * @generated
	 * @ordered
	 */
	public static final int FORMULARY_ITEM_VALUE = 65;

	/**
	 * The '<em><b>Genomic Study</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GenomicStudy
	 * <!-- end-model-doc -->
	 * @see #GENOMIC_STUDY
	 * @model name="GenomicStudy"
	 * @generated
	 * @ordered
	 */
	public static final int GENOMIC_STUDY_VALUE = 66;

	/**
	 * The '<em><b>Goal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Goal
	 * <!-- end-model-doc -->
	 * @see #GOAL
	 * @model name="Goal"
	 * @generated
	 * @ordered
	 */
	public static final int GOAL_VALUE = 67;

	/**
	 * The '<em><b>Graph Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GraphDefinition
	 * <!-- end-model-doc -->
	 * @see #GRAPH_DEFINITION
	 * @model name="GraphDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int GRAPH_DEFINITION_VALUE = 68;

	/**
	 * The '<em><b>Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Group
	 * <!-- end-model-doc -->
	 * @see #GROUP
	 * @model name="Group"
	 * @generated
	 * @ordered
	 */
	public static final int GROUP_VALUE = 69;

	/**
	 * The '<em><b>Guidance Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GuidanceResponse
	 * <!-- end-model-doc -->
	 * @see #GUIDANCE_RESPONSE
	 * @model name="GuidanceResponse"
	 * @generated
	 * @ordered
	 */
	public static final int GUIDANCE_RESPONSE_VALUE = 70;

	/**
	 * The '<em><b>Healthcare Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HealthcareService
	 * <!-- end-model-doc -->
	 * @see #HEALTHCARE_SERVICE
	 * @model name="HealthcareService"
	 * @generated
	 * @ordered
	 */
	public static final int HEALTHCARE_SERVICE_VALUE = 71;

	/**
	 * The '<em><b>Imaging Selection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImagingSelection
	 * <!-- end-model-doc -->
	 * @see #IMAGING_SELECTION
	 * @model name="ImagingSelection"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGING_SELECTION_VALUE = 72;

	/**
	 * The '<em><b>Imaging Study</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImagingStudy
	 * <!-- end-model-doc -->
	 * @see #IMAGING_STUDY
	 * @model name="ImagingStudy"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGING_STUDY_VALUE = 73;

	/**
	 * The '<em><b>Immunization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Immunization
	 * <!-- end-model-doc -->
	 * @see #IMMUNIZATION
	 * @model name="Immunization"
	 * @generated
	 * @ordered
	 */
	public static final int IMMUNIZATION_VALUE = 74;

	/**
	 * The '<em><b>Immunization Evaluation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImmunizationEvaluation
	 * <!-- end-model-doc -->
	 * @see #IMMUNIZATION_EVALUATION
	 * @model name="ImmunizationEvaluation"
	 * @generated
	 * @ordered
	 */
	public static final int IMMUNIZATION_EVALUATION_VALUE = 75;

	/**
	 * The '<em><b>Immunization Recommendation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImmunizationRecommendation
	 * <!-- end-model-doc -->
	 * @see #IMMUNIZATION_RECOMMENDATION
	 * @model name="ImmunizationRecommendation"
	 * @generated
	 * @ordered
	 */
	public static final int IMMUNIZATION_RECOMMENDATION_VALUE = 76;

	/**
	 * The '<em><b>Implementation Guide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImplementationGuide
	 * <!-- end-model-doc -->
	 * @see #IMPLEMENTATION_GUIDE
	 * @model name="ImplementationGuide"
	 * @generated
	 * @ordered
	 */
	public static final int IMPLEMENTATION_GUIDE_VALUE = 77;

	/**
	 * The '<em><b>Ingredient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ingredient
	 * <!-- end-model-doc -->
	 * @see #INGREDIENT
	 * @model name="Ingredient"
	 * @generated
	 * @ordered
	 */
	public static final int INGREDIENT_VALUE = 78;

	/**
	 * The '<em><b>Insurance Plan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InsurancePlan
	 * <!-- end-model-doc -->
	 * @see #INSURANCE_PLAN
	 * @model name="InsurancePlan"
	 * @generated
	 * @ordered
	 */
	public static final int INSURANCE_PLAN_VALUE = 79;

	/**
	 * The '<em><b>Inventory Item</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InventoryItem
	 * <!-- end-model-doc -->
	 * @see #INVENTORY_ITEM
	 * @model name="InventoryItem"
	 * @generated
	 * @ordered
	 */
	public static final int INVENTORY_ITEM_VALUE = 80;

	/**
	 * The '<em><b>Inventory Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InventoryReport
	 * <!-- end-model-doc -->
	 * @see #INVENTORY_REPORT
	 * @model name="InventoryReport"
	 * @generated
	 * @ordered
	 */
	public static final int INVENTORY_REPORT_VALUE = 81;

	/**
	 * The '<em><b>Invoice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Invoice
	 * <!-- end-model-doc -->
	 * @see #INVOICE
	 * @model name="Invoice"
	 * @generated
	 * @ordered
	 */
	public static final int INVOICE_VALUE = 82;

	/**
	 * The '<em><b>Library</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Library
	 * <!-- end-model-doc -->
	 * @see #LIBRARY
	 * @model name="Library"
	 * @generated
	 * @ordered
	 */
	public static final int LIBRARY_VALUE = 83;

	/**
	 * The '<em><b>Linkage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linkage
	 * <!-- end-model-doc -->
	 * @see #LINKAGE
	 * @model name="Linkage"
	 * @generated
	 * @ordered
	 */
	public static final int LINKAGE_VALUE = 84;

	/**
	 * The '<em><b>List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List
	 * <!-- end-model-doc -->
	 * @see #LIST
	 * @model name="List"
	 * @generated
	 * @ordered
	 */
	public static final int LIST_VALUE = 85;

	/**
	 * The '<em><b>Location</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Location
	 * <!-- end-model-doc -->
	 * @see #LOCATION
	 * @model name="Location"
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION_VALUE = 86;

	/**
	 * The '<em><b>Manufactured Item Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ManufacturedItemDefinition
	 * <!-- end-model-doc -->
	 * @see #MANUFACTURED_ITEM_DEFINITION
	 * @model name="ManufacturedItemDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int MANUFACTURED_ITEM_DEFINITION_VALUE = 87;

	/**
	 * The '<em><b>Measure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measure
	 * <!-- end-model-doc -->
	 * @see #MEASURE
	 * @model name="Measure"
	 * @generated
	 * @ordered
	 */
	public static final int MEASURE_VALUE = 88;

	/**
	 * The '<em><b>Measure Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MeasureReport
	 * <!-- end-model-doc -->
	 * @see #MEASURE_REPORT
	 * @model name="MeasureReport"
	 * @generated
	 * @ordered
	 */
	public static final int MEASURE_REPORT_VALUE = 89;

	/**
	 * The '<em><b>Medication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Medication
	 * <!-- end-model-doc -->
	 * @see #MEDICATION
	 * @model name="Medication"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_VALUE = 90;

	/**
	 * The '<em><b>Medication Administration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationAdministration
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_ADMINISTRATION
	 * @model name="MedicationAdministration"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_ADMINISTRATION_VALUE = 91;

	/**
	 * The '<em><b>Medication Dispense</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationDispense
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_DISPENSE
	 * @model name="MedicationDispense"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_DISPENSE_VALUE = 92;

	/**
	 * The '<em><b>Medication Knowledge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationKnowledge
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_KNOWLEDGE
	 * @model name="MedicationKnowledge"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_KNOWLEDGE_VALUE = 93;

	/**
	 * The '<em><b>Medication Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationRequest
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_REQUEST
	 * @model name="MedicationRequest"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_REQUEST_VALUE = 94;

	/**
	 * The '<em><b>Medication Statement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationStatement
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_STATEMENT
	 * @model name="MedicationStatement"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_STATEMENT_VALUE = 95;

	/**
	 * The '<em><b>Medicinal Product Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductDefinition
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_DEFINITION
	 * @model name="MedicinalProductDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_DEFINITION_VALUE = 96;

	/**
	 * The '<em><b>Message Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MessageDefinition
	 * <!-- end-model-doc -->
	 * @see #MESSAGE_DEFINITION
	 * @model name="MessageDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_DEFINITION_VALUE = 97;

	/**
	 * The '<em><b>Message Header</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MessageHeader
	 * <!-- end-model-doc -->
	 * @see #MESSAGE_HEADER
	 * @model name="MessageHeader"
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_HEADER_VALUE = 98;

	/**
	 * The '<em><b>Metadata Resource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MetadataResource
	 * <!-- end-model-doc -->
	 * @see #METADATA_RESOURCE
	 * @model name="MetadataResource"
	 * @generated
	 * @ordered
	 */
	public static final int METADATA_RESOURCE_VALUE = 99;

	/**
	 * The '<em><b>Molecular Sequence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MolecularSequence
	 * <!-- end-model-doc -->
	 * @see #MOLECULAR_SEQUENCE
	 * @model name="MolecularSequence"
	 * @generated
	 * @ordered
	 */
	public static final int MOLECULAR_SEQUENCE_VALUE = 100;

	/**
	 * The '<em><b>Naming System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NamingSystem
	 * <!-- end-model-doc -->
	 * @see #NAMING_SYSTEM
	 * @model name="NamingSystem"
	 * @generated
	 * @ordered
	 */
	public static final int NAMING_SYSTEM_VALUE = 101;

	/**
	 * The '<em><b>Nutrition Intake</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NutritionIntake
	 * <!-- end-model-doc -->
	 * @see #NUTRITION_INTAKE
	 * @model name="NutritionIntake"
	 * @generated
	 * @ordered
	 */
	public static final int NUTRITION_INTAKE_VALUE = 102;

	/**
	 * The '<em><b>Nutrition Order</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NutritionOrder
	 * <!-- end-model-doc -->
	 * @see #NUTRITION_ORDER
	 * @model name="NutritionOrder"
	 * @generated
	 * @ordered
	 */
	public static final int NUTRITION_ORDER_VALUE = 103;

	/**
	 * The '<em><b>Nutrition Product</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NutritionProduct
	 * <!-- end-model-doc -->
	 * @see #NUTRITION_PRODUCT
	 * @model name="NutritionProduct"
	 * @generated
	 * @ordered
	 */
	public static final int NUTRITION_PRODUCT_VALUE = 104;

	/**
	 * The '<em><b>Observation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Observation
	 * <!-- end-model-doc -->
	 * @see #OBSERVATION
	 * @model name="Observation"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVATION_VALUE = 105;

	/**
	 * The '<em><b>Observation Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ObservationDefinition
	 * <!-- end-model-doc -->
	 * @see #OBSERVATION_DEFINITION
	 * @model name="ObservationDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVATION_DEFINITION_VALUE = 106;

	/**
	 * The '<em><b>Operation Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OperationDefinition
	 * <!-- end-model-doc -->
	 * @see #OPERATION_DEFINITION
	 * @model name="OperationDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_DEFINITION_VALUE = 107;

	/**
	 * The '<em><b>Operation Outcome</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OperationOutcome
	 * <!-- end-model-doc -->
	 * @see #OPERATION_OUTCOME
	 * @model name="OperationOutcome"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_OUTCOME_VALUE = 108;

	/**
	 * The '<em><b>Organization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organization
	 * <!-- end-model-doc -->
	 * @see #ORGANIZATION
	 * @model name="Organization"
	 * @generated
	 * @ordered
	 */
	public static final int ORGANIZATION_VALUE = 109;

	/**
	 * The '<em><b>Organization Affiliation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OrganizationAffiliation
	 * <!-- end-model-doc -->
	 * @see #ORGANIZATION_AFFILIATION
	 * @model name="OrganizationAffiliation"
	 * @generated
	 * @ordered
	 */
	public static final int ORGANIZATION_AFFILIATION_VALUE = 110;

	/**
	 * The '<em><b>Packaged Product Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PackagedProductDefinition
	 * <!-- end-model-doc -->
	 * @see #PACKAGED_PRODUCT_DEFINITION
	 * @model name="PackagedProductDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGED_PRODUCT_DEFINITION_VALUE = 111;

	/**
	 * The '<em><b>Parameters</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameters
	 * <!-- end-model-doc -->
	 * @see #PARAMETERS
	 * @model name="Parameters"
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETERS_VALUE = 112;

	/**
	 * The '<em><b>Patient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient
	 * <!-- end-model-doc -->
	 * @see #PATIENT
	 * @model name="Patient"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENT_VALUE = 113;

	/**
	 * The '<em><b>Payment Notice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PaymentNotice
	 * <!-- end-model-doc -->
	 * @see #PAYMENT_NOTICE
	 * @model name="PaymentNotice"
	 * @generated
	 * @ordered
	 */
	public static final int PAYMENT_NOTICE_VALUE = 114;

	/**
	 * The '<em><b>Payment Reconciliation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PaymentReconciliation
	 * <!-- end-model-doc -->
	 * @see #PAYMENT_RECONCILIATION
	 * @model name="PaymentReconciliation"
	 * @generated
	 * @ordered
	 */
	public static final int PAYMENT_RECONCILIATION_VALUE = 115;

	/**
	 * The '<em><b>Permission</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Permission
	 * <!-- end-model-doc -->
	 * @see #PERMISSION
	 * @model name="Permission"
	 * @generated
	 * @ordered
	 */
	public static final int PERMISSION_VALUE = 116;

	/**
	 * The '<em><b>Person</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Person
	 * <!-- end-model-doc -->
	 * @see #PERSON
	 * @model name="Person"
	 * @generated
	 * @ordered
	 */
	public static final int PERSON_VALUE = 117;

	/**
	 * The '<em><b>Plan Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PlanDefinition
	 * <!-- end-model-doc -->
	 * @see #PLAN_DEFINITION
	 * @model name="PlanDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int PLAN_DEFINITION_VALUE = 118;

	/**
	 * The '<em><b>Practitioner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Practitioner
	 * <!-- end-model-doc -->
	 * @see #PRACTITIONER
	 * @model name="Practitioner"
	 * @generated
	 * @ordered
	 */
	public static final int PRACTITIONER_VALUE = 119;

	/**
	 * The '<em><b>Practitioner Role</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PractitionerRole
	 * <!-- end-model-doc -->
	 * @see #PRACTITIONER_ROLE
	 * @model name="PractitionerRole"
	 * @generated
	 * @ordered
	 */
	public static final int PRACTITIONER_ROLE_VALUE = 120;

	/**
	 * The '<em><b>Procedure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Procedure
	 * <!-- end-model-doc -->
	 * @see #PROCEDURE
	 * @model name="Procedure"
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_VALUE = 121;

	/**
	 * The '<em><b>Provenance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provenance
	 * <!-- end-model-doc -->
	 * @see #PROVENANCE
	 * @model name="Provenance"
	 * @generated
	 * @ordered
	 */
	public static final int PROVENANCE_VALUE = 122;

	/**
	 * The '<em><b>Questionnaire</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Questionnaire
	 * <!-- end-model-doc -->
	 * @see #QUESTIONNAIRE
	 * @model name="Questionnaire"
	 * @generated
	 * @ordered
	 */
	public static final int QUESTIONNAIRE_VALUE = 123;

	/**
	 * The '<em><b>Questionnaire Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * QuestionnaireResponse
	 * <!-- end-model-doc -->
	 * @see #QUESTIONNAIRE_RESPONSE
	 * @model name="QuestionnaireResponse"
	 * @generated
	 * @ordered
	 */
	public static final int QUESTIONNAIRE_RESPONSE_VALUE = 124;

	/**
	 * The '<em><b>Regulated Authorization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RegulatedAuthorization
	 * <!-- end-model-doc -->
	 * @see #REGULATED_AUTHORIZATION
	 * @model name="RegulatedAuthorization"
	 * @generated
	 * @ordered
	 */
	public static final int REGULATED_AUTHORIZATION_VALUE = 125;

	/**
	 * The '<em><b>Related Person</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RelatedPerson
	 * <!-- end-model-doc -->
	 * @see #RELATED_PERSON
	 * @model name="RelatedPerson"
	 * @generated
	 * @ordered
	 */
	public static final int RELATED_PERSON_VALUE = 126;

	/**
	 * The '<em><b>Request Orchestration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RequestOrchestration
	 * <!-- end-model-doc -->
	 * @see #REQUEST_ORCHESTRATION
	 * @model name="RequestOrchestration"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_ORCHESTRATION_VALUE = 127;

	/**
	 * The '<em><b>Requirements</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requirements
	 * <!-- end-model-doc -->
	 * @see #REQUIREMENTS
	 * @model name="Requirements"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIREMENTS_VALUE = 128;

	/**
	 * The '<em><b>Research Study</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ResearchStudy
	 * <!-- end-model-doc -->
	 * @see #RESEARCH_STUDY
	 * @model name="ResearchStudy"
	 * @generated
	 * @ordered
	 */
	public static final int RESEARCH_STUDY_VALUE = 129;

	/**
	 * The '<em><b>Research Subject</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ResearchSubject
	 * <!-- end-model-doc -->
	 * @see #RESEARCH_SUBJECT
	 * @model name="ResearchSubject"
	 * @generated
	 * @ordered
	 */
	public static final int RESEARCH_SUBJECT_VALUE = 130;

	/**
	 * The '<em><b>Resource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource
	 * <!-- end-model-doc -->
	 * @see #RESOURCE
	 * @model name="Resource"
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_VALUE = 131;

	/**
	 * The '<em><b>Risk Assessment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RiskAssessment
	 * <!-- end-model-doc -->
	 * @see #RISK_ASSESSMENT
	 * @model name="RiskAssessment"
	 * @generated
	 * @ordered
	 */
	public static final int RISK_ASSESSMENT_VALUE = 132;

	/**
	 * The '<em><b>Schedule</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schedule
	 * <!-- end-model-doc -->
	 * @see #SCHEDULE
	 * @model name="Schedule"
	 * @generated
	 * @ordered
	 */
	public static final int SCHEDULE_VALUE = 133;

	/**
	 * The '<em><b>Search Parameter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SearchParameter
	 * <!-- end-model-doc -->
	 * @see #SEARCH_PARAMETER
	 * @model name="SearchParameter"
	 * @generated
	 * @ordered
	 */
	public static final int SEARCH_PARAMETER_VALUE = 134;

	/**
	 * The '<em><b>Service Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ServiceRequest
	 * <!-- end-model-doc -->
	 * @see #SERVICE_REQUEST
	 * @model name="ServiceRequest"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_REQUEST_VALUE = 135;

	/**
	 * The '<em><b>Slot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Slot
	 * <!-- end-model-doc -->
	 * @see #SLOT
	 * @model name="Slot"
	 * @generated
	 * @ordered
	 */
	public static final int SLOT_VALUE = 136;

	/**
	 * The '<em><b>Specimen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specimen
	 * <!-- end-model-doc -->
	 * @see #SPECIMEN
	 * @model name="Specimen"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIMEN_VALUE = 137;

	/**
	 * The '<em><b>Specimen Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SpecimenDefinition
	 * <!-- end-model-doc -->
	 * @see #SPECIMEN_DEFINITION
	 * @model name="SpecimenDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIMEN_DEFINITION_VALUE = 138;

	/**
	 * The '<em><b>Structure Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StructureDefinition
	 * <!-- end-model-doc -->
	 * @see #STRUCTURE_DEFINITION
	 * @model name="StructureDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_DEFINITION_VALUE = 139;

	/**
	 * The '<em><b>Structure Map</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StructureMap
	 * <!-- end-model-doc -->
	 * @see #STRUCTURE_MAP
	 * @model name="StructureMap"
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_MAP_VALUE = 140;

	/**
	 * The '<em><b>Subscription</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subscription
	 * <!-- end-model-doc -->
	 * @see #SUBSCRIPTION
	 * @model name="Subscription"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSCRIPTION_VALUE = 141;

	/**
	 * The '<em><b>Subscription Status</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubscriptionStatus
	 * <!-- end-model-doc -->
	 * @see #SUBSCRIPTION_STATUS
	 * @model name="SubscriptionStatus"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSCRIPTION_STATUS_VALUE = 142;

	/**
	 * The '<em><b>Subscription Topic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubscriptionTopic
	 * <!-- end-model-doc -->
	 * @see #SUBSCRIPTION_TOPIC
	 * @model name="SubscriptionTopic"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSCRIPTION_TOPIC_VALUE = 143;

	/**
	 * The '<em><b>Substance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Substance
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE
	 * @model name="Substance"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_VALUE = 144;

	/**
	 * The '<em><b>Substance Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubstanceDefinition
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE_DEFINITION
	 * @model name="SubstanceDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_DEFINITION_VALUE = 145;

	/**
	 * The '<em><b>Substance Nucleic Acid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubstanceNucleicAcid
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE_NUCLEIC_ACID
	 * @model name="SubstanceNucleicAcid"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_NUCLEIC_ACID_VALUE = 146;

	/**
	 * The '<em><b>Substance Polymer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubstancePolymer
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE_POLYMER
	 * @model name="SubstancePolymer"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_POLYMER_VALUE = 147;

	/**
	 * The '<em><b>Substance Protein</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubstanceProtein
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE_PROTEIN
	 * @model name="SubstanceProtein"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_PROTEIN_VALUE = 148;

	/**
	 * The '<em><b>Substance Reference Information</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubstanceReferenceInformation
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE_REFERENCE_INFORMATION
	 * @model name="SubstanceReferenceInformation"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_REFERENCE_INFORMATION_VALUE = 149;

	/**
	 * The '<em><b>Substance Source Material</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubstanceSourceMaterial
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE_SOURCE_MATERIAL
	 * @model name="SubstanceSourceMaterial"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_SOURCE_MATERIAL_VALUE = 150;

	/**
	 * The '<em><b>Supply Delivery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupplyDelivery
	 * <!-- end-model-doc -->
	 * @see #SUPPLY_DELIVERY
	 * @model name="SupplyDelivery"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPLY_DELIVERY_VALUE = 151;

	/**
	 * The '<em><b>Supply Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupplyRequest
	 * <!-- end-model-doc -->
	 * @see #SUPPLY_REQUEST
	 * @model name="SupplyRequest"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPLY_REQUEST_VALUE = 152;

	/**
	 * The '<em><b>Task</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Task
	 * <!-- end-model-doc -->
	 * @see #TASK
	 * @model name="Task"
	 * @generated
	 * @ordered
	 */
	public static final int TASK_VALUE = 153;

	/**
	 * The '<em><b>Terminology Capabilities</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TerminologyCapabilities
	 * <!-- end-model-doc -->
	 * @see #TERMINOLOGY_CAPABILITIES
	 * @model name="TerminologyCapabilities"
	 * @generated
	 * @ordered
	 */
	public static final int TERMINOLOGY_CAPABILITIES_VALUE = 154;

	/**
	 * The '<em><b>Test Plan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TestPlan
	 * <!-- end-model-doc -->
	 * @see #TEST_PLAN
	 * @model name="TestPlan"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_PLAN_VALUE = 155;

	/**
	 * The '<em><b>Test Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TestReport
	 * <!-- end-model-doc -->
	 * @see #TEST_REPORT
	 * @model name="TestReport"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_REPORT_VALUE = 156;

	/**
	 * The '<em><b>Test Script</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TestScript
	 * <!-- end-model-doc -->
	 * @see #TEST_SCRIPT
	 * @model name="TestScript"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_SCRIPT_VALUE = 157;

	/**
	 * The '<em><b>Transport</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transport
	 * <!-- end-model-doc -->
	 * @see #TRANSPORT
	 * @model name="Transport"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSPORT_VALUE = 158;

	/**
	 * The '<em><b>Value Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ValueSet
	 * <!-- end-model-doc -->
	 * @see #VALUE_SET
	 * @model name="ValueSet"
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_SET_VALUE = 159;

	/**
	 * The '<em><b>Verification Result</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VerificationResult
	 * <!-- end-model-doc -->
	 * @see #VERIFICATION_RESULT
	 * @model name="VerificationResult"
	 * @generated
	 * @ordered
	 */
	public static final int VERIFICATION_RESULT_VALUE = 160;

	/**
	 * The '<em><b>Vision Prescription</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VisionPrescription
	 * <!-- end-model-doc -->
	 * @see #VISION_PRESCRIPTION
	 * @model name="VisionPrescription"
	 * @generated
	 * @ordered
	 */
	public static final int VISION_PRESCRIPTION_VALUE = 161;

	/**
	 * The '<em><b>Body Site</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BodySite
	 * <!-- end-model-doc -->
	 * @see #BODY_SITE
	 * @model name="BodySite"
	 * @generated
	 * @ordered
	 */
	public static final int BODY_SITE_VALUE = 162;

	/**
	 * The '<em><b>Catalog Entry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CatalogEntry
	 * <!-- end-model-doc -->
	 * @see #CATALOG_ENTRY
	 * @model name="CatalogEntry"
	 * @generated
	 * @ordered
	 */
	public static final int CATALOG_ENTRY_VALUE = 163;

	/**
	 * The '<em><b>Conformance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Conformance
	 * <!-- end-model-doc -->
	 * @see #CONFORMANCE
	 * @model name="Conformance"
	 * @generated
	 * @ordered
	 */
	public static final int CONFORMANCE_VALUE = 164;

	/**
	 * The '<em><b>Data Element</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DataElement
	 * <!-- end-model-doc -->
	 * @see #DATA_ELEMENT
	 * @model name="DataElement"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_ELEMENT_VALUE = 165;

	/**
	 * The '<em><b>Device Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceComponent
	 * <!-- end-model-doc -->
	 * @see #DEVICE_COMPONENT
	 * @model name="DeviceComponent"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_COMPONENT_VALUE = 166;

	/**
	 * The '<em><b>Device Use Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceUseRequest
	 * <!-- end-model-doc -->
	 * @see #DEVICE_USE_REQUEST
	 * @model name="DeviceUseRequest"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_USE_REQUEST_VALUE = 167;

	/**
	 * The '<em><b>Device Use Statement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceUseStatement
	 * <!-- end-model-doc -->
	 * @see #DEVICE_USE_STATEMENT
	 * @model name="DeviceUseStatement"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_USE_STATEMENT_VALUE = 168;

	/**
	 * The '<em><b>Diagnostic Order</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DiagnosticOrder
	 * <!-- end-model-doc -->
	 * @see #DIAGNOSTIC_ORDER
	 * @model name="DiagnosticOrder"
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSTIC_ORDER_VALUE = 169;

	/**
	 * The '<em><b>Document Manifest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DocumentManifest
	 * <!-- end-model-doc -->
	 * @see #DOCUMENT_MANIFEST
	 * @model name="DocumentManifest"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_MANIFEST_VALUE = 170;

	/**
	 * The '<em><b>Effect Evidence Synthesis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EffectEvidenceSynthesis
	 * <!-- end-model-doc -->
	 * @see #EFFECT_EVIDENCE_SYNTHESIS
	 * @model name="EffectEvidenceSynthesis"
	 * @generated
	 * @ordered
	 */
	public static final int EFFECT_EVIDENCE_SYNTHESIS_VALUE = 171;

	/**
	 * The '<em><b>Eligibility Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EligibilityRequest
	 * <!-- end-model-doc -->
	 * @see #ELIGIBILITY_REQUEST
	 * @model name="EligibilityRequest"
	 * @generated
	 * @ordered
	 */
	public static final int ELIGIBILITY_REQUEST_VALUE = 172;

	/**
	 * The '<em><b>Eligibility Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EligibilityResponse
	 * <!-- end-model-doc -->
	 * @see #ELIGIBILITY_RESPONSE
	 * @model name="EligibilityResponse"
	 * @generated
	 * @ordered
	 */
	public static final int ELIGIBILITY_RESPONSE_VALUE = 173;

	/**
	 * The '<em><b>Expansion Profile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExpansionProfile
	 * <!-- end-model-doc -->
	 * @see #EXPANSION_PROFILE
	 * @model name="ExpansionProfile"
	 * @generated
	 * @ordered
	 */
	public static final int EXPANSION_PROFILE_VALUE = 174;

	/**
	 * The '<em><b>Imaging Manifest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImagingManifest
	 * <!-- end-model-doc -->
	 * @see #IMAGING_MANIFEST
	 * @model name="ImagingManifest"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGING_MANIFEST_VALUE = 175;

	/**
	 * The '<em><b>Imaging Object Selection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImagingObjectSelection
	 * <!-- end-model-doc -->
	 * @see #IMAGING_OBJECT_SELECTION
	 * @model name="ImagingObjectSelection"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGING_OBJECT_SELECTION_VALUE = 176;

	/**
	 * The '<em><b>Media</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Media
	 * <!-- end-model-doc -->
	 * @see #MEDIA
	 * @model name="Media"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIA_VALUE = 177;

	/**
	 * The '<em><b>Medication Order</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationOrder
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_ORDER
	 * @model name="MedicationOrder"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_ORDER_VALUE = 178;

	/**
	 * The '<em><b>Medication Usage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationUsage
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_USAGE
	 * @model name="MedicationUsage"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_USAGE_VALUE = 179;

	/**
	 * The '<em><b>Medicinal Product</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProduct
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT
	 * @model name="MedicinalProduct"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_VALUE = 180;

	/**
	 * The '<em><b>Medicinal Product Authorization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductAuthorization
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_AUTHORIZATION
	 * @model name="MedicinalProductAuthorization"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_AUTHORIZATION_VALUE = 181;

	/**
	 * The '<em><b>Medicinal Product Contraindication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductContraindication
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_CONTRAINDICATION
	 * @model name="MedicinalProductContraindication"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_CONTRAINDICATION_VALUE = 182;

	/**
	 * The '<em><b>Medicinal Product Indication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductIndication
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_INDICATION
	 * @model name="MedicinalProductIndication"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_INDICATION_VALUE = 183;

	/**
	 * The '<em><b>Medicinal Product Ingredient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductIngredient
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_INGREDIENT
	 * @model name="MedicinalProductIngredient"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_INGREDIENT_VALUE = 184;

	/**
	 * The '<em><b>Medicinal Product Interaction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductInteraction
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_INTERACTION
	 * @model name="MedicinalProductInteraction"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_INTERACTION_VALUE = 185;

	/**
	 * The '<em><b>Medicinal Product Manufactured</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductManufactured
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_MANUFACTURED
	 * @model name="MedicinalProductManufactured"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_MANUFACTURED_VALUE = 186;

	/**
	 * The '<em><b>Medicinal Product Packaged</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductPackaged
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_PACKAGED
	 * @model name="MedicinalProductPackaged"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_PACKAGED_VALUE = 187;

	/**
	 * The '<em><b>Medicinal Product Pharmaceutical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductPharmaceutical
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_PHARMACEUTICAL
	 * @model name="MedicinalProductPharmaceutical"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_PHARMACEUTICAL_VALUE = 188;

	/**
	 * The '<em><b>Medicinal Product Undesirable Effect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductUndesirableEffect
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT
	 * @model name="MedicinalProductUndesirableEffect"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT_VALUE = 189;

	/**
	 * The '<em><b>Order</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Order
	 * <!-- end-model-doc -->
	 * @see #ORDER
	 * @model name="Order"
	 * @generated
	 * @ordered
	 */
	public static final int ORDER_VALUE = 190;

	/**
	 * The '<em><b>Order Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OrderResponse
	 * <!-- end-model-doc -->
	 * @see #ORDER_RESPONSE
	 * @model name="OrderResponse"
	 * @generated
	 * @ordered
	 */
	public static final int ORDER_RESPONSE_VALUE = 191;

	/**
	 * The '<em><b>Procedure Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ProcedureRequest
	 * <!-- end-model-doc -->
	 * @see #PROCEDURE_REQUEST
	 * @model name="ProcedureRequest"
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_REQUEST_VALUE = 192;

	/**
	 * The '<em><b>Process Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ProcessRequest
	 * <!-- end-model-doc -->
	 * @see #PROCESS_REQUEST
	 * @model name="ProcessRequest"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESS_REQUEST_VALUE = 193;

	/**
	 * The '<em><b>Process Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ProcessResponse
	 * <!-- end-model-doc -->
	 * @see #PROCESS_RESPONSE
	 * @model name="ProcessResponse"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESS_RESPONSE_VALUE = 194;

	/**
	 * The '<em><b>Referral Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ReferralRequest
	 * <!-- end-model-doc -->
	 * @see #REFERRAL_REQUEST
	 * @model name="ReferralRequest"
	 * @generated
	 * @ordered
	 */
	public static final int REFERRAL_REQUEST_VALUE = 195;

	/**
	 * The '<em><b>Request Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RequestGroup
	 * <!-- end-model-doc -->
	 * @see #REQUEST_GROUP
	 * @model name="RequestGroup"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_GROUP_VALUE = 196;

	/**
	 * The '<em><b>Research Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ResearchDefinition
	 * <!-- end-model-doc -->
	 * @see #RESEARCH_DEFINITION
	 * @model name="ResearchDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int RESEARCH_DEFINITION_VALUE = 197;

	/**
	 * The '<em><b>Research Element Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ResearchElementDefinition
	 * <!-- end-model-doc -->
	 * @see #RESEARCH_ELEMENT_DEFINITION
	 * @model name="ResearchElementDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int RESEARCH_ELEMENT_DEFINITION_VALUE = 198;

	/**
	 * The '<em><b>Risk Evidence Synthesis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RiskEvidenceSynthesis
	 * <!-- end-model-doc -->
	 * @see #RISK_EVIDENCE_SYNTHESIS
	 * @model name="RiskEvidenceSynthesis"
	 * @generated
	 * @ordered
	 */
	public static final int RISK_EVIDENCE_SYNTHESIS_VALUE = 199;

	/**
	 * The '<em><b>Sequence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sequence
	 * <!-- end-model-doc -->
	 * @see #SEQUENCE
	 * @model name="Sequence"
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENCE_VALUE = 200;

	/**
	 * The '<em><b>Service Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ServiceDefinition
	 * <!-- end-model-doc -->
	 * @see #SERVICE_DEFINITION
	 * @model name="ServiceDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DEFINITION_VALUE = 201;

	/**
	 * The '<em><b>Substance Specification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubstanceSpecification
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE_SPECIFICATION
	 * @model name="SubstanceSpecification"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_SPECIFICATION_VALUE = 202;

	/**
	 * An array of all the '<em><b>Version Independent Resource Types All Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VersionIndependentResourceTypesAllEnum[] VALUES_ARRAY =
		new VersionIndependentResourceTypesAllEnum[] {
			ACCOUNT,
			ACTIVITY_DEFINITION,
			ACTOR_DEFINITION,
			ADMINISTRABLE_PRODUCT_DEFINITION,
			ADVERSE_EVENT,
			ALLERGY_INTOLERANCE,
			APPOINTMENT,
			APPOINTMENT_RESPONSE,
			ARTIFACT_ASSESSMENT,
			AUDIT_EVENT,
			BASIC,
			BINARY,
			BIOLOGICALLY_DERIVED_PRODUCT,
			BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE,
			BODY_STRUCTURE,
			BUNDLE,
			CANONICAL_RESOURCE,
			CAPABILITY_STATEMENT,
			CARE_PLAN,
			CARE_TEAM,
			CHARGE_ITEM,
			CHARGE_ITEM_DEFINITION,
			CITATION,
			CLAIM,
			CLAIM_RESPONSE,
			CLINICAL_IMPRESSION,
			CLINICAL_USE_DEFINITION,
			CODE_SYSTEM,
			COMMUNICATION,
			COMMUNICATION_REQUEST,
			COMPARTMENT_DEFINITION,
			COMPOSITION,
			CONCEPT_MAP,
			CONDITION,
			CONDITION_DEFINITION,
			CONSENT,
			CONTRACT,
			COVERAGE,
			COVERAGE_ELIGIBILITY_REQUEST,
			COVERAGE_ELIGIBILITY_RESPONSE,
			DETECTED_ISSUE,
			DEVICE,
			DEVICE_ASSOCIATION,
			DEVICE_DEFINITION,
			DEVICE_DISPENSE,
			DEVICE_METRIC,
			DEVICE_REQUEST,
			DEVICE_USAGE,
			DIAGNOSTIC_REPORT,
			DOCUMENT_REFERENCE,
			DOMAIN_RESOURCE,
			ENCOUNTER,
			ENCOUNTER_HISTORY,
			ENDPOINT,
			ENROLLMENT_REQUEST,
			ENROLLMENT_RESPONSE,
			EPISODE_OF_CARE,
			EVENT_DEFINITION,
			EVIDENCE,
			EVIDENCE_REPORT,
			EVIDENCE_VARIABLE,
			EXAMPLE_SCENARIO,
			EXPLANATION_OF_BENEFIT,
			FAMILY_MEMBER_HISTORY,
			FLAG,
			FORMULARY_ITEM,
			GENOMIC_STUDY,
			GOAL,
			GRAPH_DEFINITION,
			GROUP,
			GUIDANCE_RESPONSE,
			HEALTHCARE_SERVICE,
			IMAGING_SELECTION,
			IMAGING_STUDY,
			IMMUNIZATION,
			IMMUNIZATION_EVALUATION,
			IMMUNIZATION_RECOMMENDATION,
			IMPLEMENTATION_GUIDE,
			INGREDIENT,
			INSURANCE_PLAN,
			INVENTORY_ITEM,
			INVENTORY_REPORT,
			INVOICE,
			LIBRARY,
			LINKAGE,
			LIST,
			LOCATION,
			MANUFACTURED_ITEM_DEFINITION,
			MEASURE,
			MEASURE_REPORT,
			MEDICATION,
			MEDICATION_ADMINISTRATION,
			MEDICATION_DISPENSE,
			MEDICATION_KNOWLEDGE,
			MEDICATION_REQUEST,
			MEDICATION_STATEMENT,
			MEDICINAL_PRODUCT_DEFINITION,
			MESSAGE_DEFINITION,
			MESSAGE_HEADER,
			METADATA_RESOURCE,
			MOLECULAR_SEQUENCE,
			NAMING_SYSTEM,
			NUTRITION_INTAKE,
			NUTRITION_ORDER,
			NUTRITION_PRODUCT,
			OBSERVATION,
			OBSERVATION_DEFINITION,
			OPERATION_DEFINITION,
			OPERATION_OUTCOME,
			ORGANIZATION,
			ORGANIZATION_AFFILIATION,
			PACKAGED_PRODUCT_DEFINITION,
			PARAMETERS,
			PATIENT,
			PAYMENT_NOTICE,
			PAYMENT_RECONCILIATION,
			PERMISSION,
			PERSON,
			PLAN_DEFINITION,
			PRACTITIONER,
			PRACTITIONER_ROLE,
			PROCEDURE,
			PROVENANCE,
			QUESTIONNAIRE,
			QUESTIONNAIRE_RESPONSE,
			REGULATED_AUTHORIZATION,
			RELATED_PERSON,
			REQUEST_ORCHESTRATION,
			REQUIREMENTS,
			RESEARCH_STUDY,
			RESEARCH_SUBJECT,
			RESOURCE,
			RISK_ASSESSMENT,
			SCHEDULE,
			SEARCH_PARAMETER,
			SERVICE_REQUEST,
			SLOT,
			SPECIMEN,
			SPECIMEN_DEFINITION,
			STRUCTURE_DEFINITION,
			STRUCTURE_MAP,
			SUBSCRIPTION,
			SUBSCRIPTION_STATUS,
			SUBSCRIPTION_TOPIC,
			SUBSTANCE,
			SUBSTANCE_DEFINITION,
			SUBSTANCE_NUCLEIC_ACID,
			SUBSTANCE_POLYMER,
			SUBSTANCE_PROTEIN,
			SUBSTANCE_REFERENCE_INFORMATION,
			SUBSTANCE_SOURCE_MATERIAL,
			SUPPLY_DELIVERY,
			SUPPLY_REQUEST,
			TASK,
			TERMINOLOGY_CAPABILITIES,
			TEST_PLAN,
			TEST_REPORT,
			TEST_SCRIPT,
			TRANSPORT,
			VALUE_SET,
			VERIFICATION_RESULT,
			VISION_PRESCRIPTION,
			BODY_SITE,
			CATALOG_ENTRY,
			CONFORMANCE,
			DATA_ELEMENT,
			DEVICE_COMPONENT,
			DEVICE_USE_REQUEST,
			DEVICE_USE_STATEMENT,
			DIAGNOSTIC_ORDER,
			DOCUMENT_MANIFEST,
			EFFECT_EVIDENCE_SYNTHESIS,
			ELIGIBILITY_REQUEST,
			ELIGIBILITY_RESPONSE,
			EXPANSION_PROFILE,
			IMAGING_MANIFEST,
			IMAGING_OBJECT_SELECTION,
			MEDIA,
			MEDICATION_ORDER,
			MEDICATION_USAGE,
			MEDICINAL_PRODUCT,
			MEDICINAL_PRODUCT_AUTHORIZATION,
			MEDICINAL_PRODUCT_CONTRAINDICATION,
			MEDICINAL_PRODUCT_INDICATION,
			MEDICINAL_PRODUCT_INGREDIENT,
			MEDICINAL_PRODUCT_INTERACTION,
			MEDICINAL_PRODUCT_MANUFACTURED,
			MEDICINAL_PRODUCT_PACKAGED,
			MEDICINAL_PRODUCT_PHARMACEUTICAL,
			MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT,
			ORDER,
			ORDER_RESPONSE,
			PROCEDURE_REQUEST,
			PROCESS_REQUEST,
			PROCESS_RESPONSE,
			REFERRAL_REQUEST,
			REQUEST_GROUP,
			RESEARCH_DEFINITION,
			RESEARCH_ELEMENT_DEFINITION,
			RISK_EVIDENCE_SYNTHESIS,
			SEQUENCE,
			SERVICE_DEFINITION,
			SUBSTANCE_SPECIFICATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Version Independent Resource Types All Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VersionIndependentResourceTypesAllEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Version Independent Resource Types All Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VersionIndependentResourceTypesAllEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VersionIndependentResourceTypesAllEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Version Independent Resource Types All Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VersionIndependentResourceTypesAllEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VersionIndependentResourceTypesAllEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Version Independent Resource Types All Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VersionIndependentResourceTypesAllEnum get(int value) {
		switch (value) {
			case ACCOUNT_VALUE: return ACCOUNT;
			case ACTIVITY_DEFINITION_VALUE: return ACTIVITY_DEFINITION;
			case ACTOR_DEFINITION_VALUE: return ACTOR_DEFINITION;
			case ADMINISTRABLE_PRODUCT_DEFINITION_VALUE: return ADMINISTRABLE_PRODUCT_DEFINITION;
			case ADVERSE_EVENT_VALUE: return ADVERSE_EVENT;
			case ALLERGY_INTOLERANCE_VALUE: return ALLERGY_INTOLERANCE;
			case APPOINTMENT_VALUE: return APPOINTMENT;
			case APPOINTMENT_RESPONSE_VALUE: return APPOINTMENT_RESPONSE;
			case ARTIFACT_ASSESSMENT_VALUE: return ARTIFACT_ASSESSMENT;
			case AUDIT_EVENT_VALUE: return AUDIT_EVENT;
			case BASIC_VALUE: return BASIC;
			case BINARY_VALUE: return BINARY;
			case BIOLOGICALLY_DERIVED_PRODUCT_VALUE: return BIOLOGICALLY_DERIVED_PRODUCT;
			case BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE_VALUE: return BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE;
			case BODY_STRUCTURE_VALUE: return BODY_STRUCTURE;
			case BUNDLE_VALUE: return BUNDLE;
			case CANONICAL_RESOURCE_VALUE: return CANONICAL_RESOURCE;
			case CAPABILITY_STATEMENT_VALUE: return CAPABILITY_STATEMENT;
			case CARE_PLAN_VALUE: return CARE_PLAN;
			case CARE_TEAM_VALUE: return CARE_TEAM;
			case CHARGE_ITEM_VALUE: return CHARGE_ITEM;
			case CHARGE_ITEM_DEFINITION_VALUE: return CHARGE_ITEM_DEFINITION;
			case CITATION_VALUE: return CITATION;
			case CLAIM_VALUE: return CLAIM;
			case CLAIM_RESPONSE_VALUE: return CLAIM_RESPONSE;
			case CLINICAL_IMPRESSION_VALUE: return CLINICAL_IMPRESSION;
			case CLINICAL_USE_DEFINITION_VALUE: return CLINICAL_USE_DEFINITION;
			case CODE_SYSTEM_VALUE: return CODE_SYSTEM;
			case COMMUNICATION_VALUE: return COMMUNICATION;
			case COMMUNICATION_REQUEST_VALUE: return COMMUNICATION_REQUEST;
			case COMPARTMENT_DEFINITION_VALUE: return COMPARTMENT_DEFINITION;
			case COMPOSITION_VALUE: return COMPOSITION;
			case CONCEPT_MAP_VALUE: return CONCEPT_MAP;
			case CONDITION_VALUE: return CONDITION;
			case CONDITION_DEFINITION_VALUE: return CONDITION_DEFINITION;
			case CONSENT_VALUE: return CONSENT;
			case CONTRACT_VALUE: return CONTRACT;
			case COVERAGE_VALUE: return COVERAGE;
			case COVERAGE_ELIGIBILITY_REQUEST_VALUE: return COVERAGE_ELIGIBILITY_REQUEST;
			case COVERAGE_ELIGIBILITY_RESPONSE_VALUE: return COVERAGE_ELIGIBILITY_RESPONSE;
			case DETECTED_ISSUE_VALUE: return DETECTED_ISSUE;
			case DEVICE_VALUE: return DEVICE;
			case DEVICE_ASSOCIATION_VALUE: return DEVICE_ASSOCIATION;
			case DEVICE_DEFINITION_VALUE: return DEVICE_DEFINITION;
			case DEVICE_DISPENSE_VALUE: return DEVICE_DISPENSE;
			case DEVICE_METRIC_VALUE: return DEVICE_METRIC;
			case DEVICE_REQUEST_VALUE: return DEVICE_REQUEST;
			case DEVICE_USAGE_VALUE: return DEVICE_USAGE;
			case DIAGNOSTIC_REPORT_VALUE: return DIAGNOSTIC_REPORT;
			case DOCUMENT_REFERENCE_VALUE: return DOCUMENT_REFERENCE;
			case DOMAIN_RESOURCE_VALUE: return DOMAIN_RESOURCE;
			case ENCOUNTER_VALUE: return ENCOUNTER;
			case ENCOUNTER_HISTORY_VALUE: return ENCOUNTER_HISTORY;
			case ENDPOINT_VALUE: return ENDPOINT;
			case ENROLLMENT_REQUEST_VALUE: return ENROLLMENT_REQUEST;
			case ENROLLMENT_RESPONSE_VALUE: return ENROLLMENT_RESPONSE;
			case EPISODE_OF_CARE_VALUE: return EPISODE_OF_CARE;
			case EVENT_DEFINITION_VALUE: return EVENT_DEFINITION;
			case EVIDENCE_VALUE: return EVIDENCE;
			case EVIDENCE_REPORT_VALUE: return EVIDENCE_REPORT;
			case EVIDENCE_VARIABLE_VALUE: return EVIDENCE_VARIABLE;
			case EXAMPLE_SCENARIO_VALUE: return EXAMPLE_SCENARIO;
			case EXPLANATION_OF_BENEFIT_VALUE: return EXPLANATION_OF_BENEFIT;
			case FAMILY_MEMBER_HISTORY_VALUE: return FAMILY_MEMBER_HISTORY;
			case FLAG_VALUE: return FLAG;
			case FORMULARY_ITEM_VALUE: return FORMULARY_ITEM;
			case GENOMIC_STUDY_VALUE: return GENOMIC_STUDY;
			case GOAL_VALUE: return GOAL;
			case GRAPH_DEFINITION_VALUE: return GRAPH_DEFINITION;
			case GROUP_VALUE: return GROUP;
			case GUIDANCE_RESPONSE_VALUE: return GUIDANCE_RESPONSE;
			case HEALTHCARE_SERVICE_VALUE: return HEALTHCARE_SERVICE;
			case IMAGING_SELECTION_VALUE: return IMAGING_SELECTION;
			case IMAGING_STUDY_VALUE: return IMAGING_STUDY;
			case IMMUNIZATION_VALUE: return IMMUNIZATION;
			case IMMUNIZATION_EVALUATION_VALUE: return IMMUNIZATION_EVALUATION;
			case IMMUNIZATION_RECOMMENDATION_VALUE: return IMMUNIZATION_RECOMMENDATION;
			case IMPLEMENTATION_GUIDE_VALUE: return IMPLEMENTATION_GUIDE;
			case INGREDIENT_VALUE: return INGREDIENT;
			case INSURANCE_PLAN_VALUE: return INSURANCE_PLAN;
			case INVENTORY_ITEM_VALUE: return INVENTORY_ITEM;
			case INVENTORY_REPORT_VALUE: return INVENTORY_REPORT;
			case INVOICE_VALUE: return INVOICE;
			case LIBRARY_VALUE: return LIBRARY;
			case LINKAGE_VALUE: return LINKAGE;
			case LIST_VALUE: return LIST;
			case LOCATION_VALUE: return LOCATION;
			case MANUFACTURED_ITEM_DEFINITION_VALUE: return MANUFACTURED_ITEM_DEFINITION;
			case MEASURE_VALUE: return MEASURE;
			case MEASURE_REPORT_VALUE: return MEASURE_REPORT;
			case MEDICATION_VALUE: return MEDICATION;
			case MEDICATION_ADMINISTRATION_VALUE: return MEDICATION_ADMINISTRATION;
			case MEDICATION_DISPENSE_VALUE: return MEDICATION_DISPENSE;
			case MEDICATION_KNOWLEDGE_VALUE: return MEDICATION_KNOWLEDGE;
			case MEDICATION_REQUEST_VALUE: return MEDICATION_REQUEST;
			case MEDICATION_STATEMENT_VALUE: return MEDICATION_STATEMENT;
			case MEDICINAL_PRODUCT_DEFINITION_VALUE: return MEDICINAL_PRODUCT_DEFINITION;
			case MESSAGE_DEFINITION_VALUE: return MESSAGE_DEFINITION;
			case MESSAGE_HEADER_VALUE: return MESSAGE_HEADER;
			case METADATA_RESOURCE_VALUE: return METADATA_RESOURCE;
			case MOLECULAR_SEQUENCE_VALUE: return MOLECULAR_SEQUENCE;
			case NAMING_SYSTEM_VALUE: return NAMING_SYSTEM;
			case NUTRITION_INTAKE_VALUE: return NUTRITION_INTAKE;
			case NUTRITION_ORDER_VALUE: return NUTRITION_ORDER;
			case NUTRITION_PRODUCT_VALUE: return NUTRITION_PRODUCT;
			case OBSERVATION_VALUE: return OBSERVATION;
			case OBSERVATION_DEFINITION_VALUE: return OBSERVATION_DEFINITION;
			case OPERATION_DEFINITION_VALUE: return OPERATION_DEFINITION;
			case OPERATION_OUTCOME_VALUE: return OPERATION_OUTCOME;
			case ORGANIZATION_VALUE: return ORGANIZATION;
			case ORGANIZATION_AFFILIATION_VALUE: return ORGANIZATION_AFFILIATION;
			case PACKAGED_PRODUCT_DEFINITION_VALUE: return PACKAGED_PRODUCT_DEFINITION;
			case PARAMETERS_VALUE: return PARAMETERS;
			case PATIENT_VALUE: return PATIENT;
			case PAYMENT_NOTICE_VALUE: return PAYMENT_NOTICE;
			case PAYMENT_RECONCILIATION_VALUE: return PAYMENT_RECONCILIATION;
			case PERMISSION_VALUE: return PERMISSION;
			case PERSON_VALUE: return PERSON;
			case PLAN_DEFINITION_VALUE: return PLAN_DEFINITION;
			case PRACTITIONER_VALUE: return PRACTITIONER;
			case PRACTITIONER_ROLE_VALUE: return PRACTITIONER_ROLE;
			case PROCEDURE_VALUE: return PROCEDURE;
			case PROVENANCE_VALUE: return PROVENANCE;
			case QUESTIONNAIRE_VALUE: return QUESTIONNAIRE;
			case QUESTIONNAIRE_RESPONSE_VALUE: return QUESTIONNAIRE_RESPONSE;
			case REGULATED_AUTHORIZATION_VALUE: return REGULATED_AUTHORIZATION;
			case RELATED_PERSON_VALUE: return RELATED_PERSON;
			case REQUEST_ORCHESTRATION_VALUE: return REQUEST_ORCHESTRATION;
			case REQUIREMENTS_VALUE: return REQUIREMENTS;
			case RESEARCH_STUDY_VALUE: return RESEARCH_STUDY;
			case RESEARCH_SUBJECT_VALUE: return RESEARCH_SUBJECT;
			case RESOURCE_VALUE: return RESOURCE;
			case RISK_ASSESSMENT_VALUE: return RISK_ASSESSMENT;
			case SCHEDULE_VALUE: return SCHEDULE;
			case SEARCH_PARAMETER_VALUE: return SEARCH_PARAMETER;
			case SERVICE_REQUEST_VALUE: return SERVICE_REQUEST;
			case SLOT_VALUE: return SLOT;
			case SPECIMEN_VALUE: return SPECIMEN;
			case SPECIMEN_DEFINITION_VALUE: return SPECIMEN_DEFINITION;
			case STRUCTURE_DEFINITION_VALUE: return STRUCTURE_DEFINITION;
			case STRUCTURE_MAP_VALUE: return STRUCTURE_MAP;
			case SUBSCRIPTION_VALUE: return SUBSCRIPTION;
			case SUBSCRIPTION_STATUS_VALUE: return SUBSCRIPTION_STATUS;
			case SUBSCRIPTION_TOPIC_VALUE: return SUBSCRIPTION_TOPIC;
			case SUBSTANCE_VALUE: return SUBSTANCE;
			case SUBSTANCE_DEFINITION_VALUE: return SUBSTANCE_DEFINITION;
			case SUBSTANCE_NUCLEIC_ACID_VALUE: return SUBSTANCE_NUCLEIC_ACID;
			case SUBSTANCE_POLYMER_VALUE: return SUBSTANCE_POLYMER;
			case SUBSTANCE_PROTEIN_VALUE: return SUBSTANCE_PROTEIN;
			case SUBSTANCE_REFERENCE_INFORMATION_VALUE: return SUBSTANCE_REFERENCE_INFORMATION;
			case SUBSTANCE_SOURCE_MATERIAL_VALUE: return SUBSTANCE_SOURCE_MATERIAL;
			case SUPPLY_DELIVERY_VALUE: return SUPPLY_DELIVERY;
			case SUPPLY_REQUEST_VALUE: return SUPPLY_REQUEST;
			case TASK_VALUE: return TASK;
			case TERMINOLOGY_CAPABILITIES_VALUE: return TERMINOLOGY_CAPABILITIES;
			case TEST_PLAN_VALUE: return TEST_PLAN;
			case TEST_REPORT_VALUE: return TEST_REPORT;
			case TEST_SCRIPT_VALUE: return TEST_SCRIPT;
			case TRANSPORT_VALUE: return TRANSPORT;
			case VALUE_SET_VALUE: return VALUE_SET;
			case VERIFICATION_RESULT_VALUE: return VERIFICATION_RESULT;
			case VISION_PRESCRIPTION_VALUE: return VISION_PRESCRIPTION;
			case BODY_SITE_VALUE: return BODY_SITE;
			case CATALOG_ENTRY_VALUE: return CATALOG_ENTRY;
			case CONFORMANCE_VALUE: return CONFORMANCE;
			case DATA_ELEMENT_VALUE: return DATA_ELEMENT;
			case DEVICE_COMPONENT_VALUE: return DEVICE_COMPONENT;
			case DEVICE_USE_REQUEST_VALUE: return DEVICE_USE_REQUEST;
			case DEVICE_USE_STATEMENT_VALUE: return DEVICE_USE_STATEMENT;
			case DIAGNOSTIC_ORDER_VALUE: return DIAGNOSTIC_ORDER;
			case DOCUMENT_MANIFEST_VALUE: return DOCUMENT_MANIFEST;
			case EFFECT_EVIDENCE_SYNTHESIS_VALUE: return EFFECT_EVIDENCE_SYNTHESIS;
			case ELIGIBILITY_REQUEST_VALUE: return ELIGIBILITY_REQUEST;
			case ELIGIBILITY_RESPONSE_VALUE: return ELIGIBILITY_RESPONSE;
			case EXPANSION_PROFILE_VALUE: return EXPANSION_PROFILE;
			case IMAGING_MANIFEST_VALUE: return IMAGING_MANIFEST;
			case IMAGING_OBJECT_SELECTION_VALUE: return IMAGING_OBJECT_SELECTION;
			case MEDIA_VALUE: return MEDIA;
			case MEDICATION_ORDER_VALUE: return MEDICATION_ORDER;
			case MEDICATION_USAGE_VALUE: return MEDICATION_USAGE;
			case MEDICINAL_PRODUCT_VALUE: return MEDICINAL_PRODUCT;
			case MEDICINAL_PRODUCT_AUTHORIZATION_VALUE: return MEDICINAL_PRODUCT_AUTHORIZATION;
			case MEDICINAL_PRODUCT_CONTRAINDICATION_VALUE: return MEDICINAL_PRODUCT_CONTRAINDICATION;
			case MEDICINAL_PRODUCT_INDICATION_VALUE: return MEDICINAL_PRODUCT_INDICATION;
			case MEDICINAL_PRODUCT_INGREDIENT_VALUE: return MEDICINAL_PRODUCT_INGREDIENT;
			case MEDICINAL_PRODUCT_INTERACTION_VALUE: return MEDICINAL_PRODUCT_INTERACTION;
			case MEDICINAL_PRODUCT_MANUFACTURED_VALUE: return MEDICINAL_PRODUCT_MANUFACTURED;
			case MEDICINAL_PRODUCT_PACKAGED_VALUE: return MEDICINAL_PRODUCT_PACKAGED;
			case MEDICINAL_PRODUCT_PHARMACEUTICAL_VALUE: return MEDICINAL_PRODUCT_PHARMACEUTICAL;
			case MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT_VALUE: return MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT;
			case ORDER_VALUE: return ORDER;
			case ORDER_RESPONSE_VALUE: return ORDER_RESPONSE;
			case PROCEDURE_REQUEST_VALUE: return PROCEDURE_REQUEST;
			case PROCESS_REQUEST_VALUE: return PROCESS_REQUEST;
			case PROCESS_RESPONSE_VALUE: return PROCESS_RESPONSE;
			case REFERRAL_REQUEST_VALUE: return REFERRAL_REQUEST;
			case REQUEST_GROUP_VALUE: return REQUEST_GROUP;
			case RESEARCH_DEFINITION_VALUE: return RESEARCH_DEFINITION;
			case RESEARCH_ELEMENT_DEFINITION_VALUE: return RESEARCH_ELEMENT_DEFINITION;
			case RISK_EVIDENCE_SYNTHESIS_VALUE: return RISK_EVIDENCE_SYNTHESIS;
			case SEQUENCE_VALUE: return SEQUENCE;
			case SERVICE_DEFINITION_VALUE: return SERVICE_DEFINITION;
			case SUBSTANCE_SPECIFICATION_VALUE: return SUBSTANCE_SPECIFICATION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private VersionIndependentResourceTypesAllEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //VersionIndependentResourceTypesAllEnum
