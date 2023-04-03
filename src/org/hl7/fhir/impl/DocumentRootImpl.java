/**
 */
package org.hl7.fhir.impl;

import java.lang.String;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Account;
import org.hl7.fhir.ActivityDefinition;
import org.hl7.fhir.ActorDefinition;
import org.hl7.fhir.AdministrableProductDefinition;
import org.hl7.fhir.AdverseEvent;
import org.hl7.fhir.AllergyIntolerance;
import org.hl7.fhir.Appointment;
import org.hl7.fhir.AppointmentResponse;
import org.hl7.fhir.ArtifactAssessment;
import org.hl7.fhir.AuditEvent;
import org.hl7.fhir.Basic;
import org.hl7.fhir.Binary;
import org.hl7.fhir.BiologicallyDerivedProduct;
import org.hl7.fhir.BiologicallyDerivedProductDispense;
import org.hl7.fhir.BodyStructure;
import org.hl7.fhir.Bundle;
import org.hl7.fhir.CapabilityStatement;
import org.hl7.fhir.CarePlan;
import org.hl7.fhir.CareTeam;
import org.hl7.fhir.ChargeItem;
import org.hl7.fhir.ChargeItemDefinition;
import org.hl7.fhir.Citation;
import org.hl7.fhir.Claim;
import org.hl7.fhir.ClaimResponse;
import org.hl7.fhir.ClinicalImpression;
import org.hl7.fhir.ClinicalUseDefinition;
import org.hl7.fhir.CodeSystem;
import org.hl7.fhir.Communication;
import org.hl7.fhir.CommunicationRequest;
import org.hl7.fhir.CompartmentDefinition;
import org.hl7.fhir.Composition;
import org.hl7.fhir.ConceptMap;
import org.hl7.fhir.Condition;
import org.hl7.fhir.ConditionDefinition;
import org.hl7.fhir.Consent;
import org.hl7.fhir.Contract;
import org.hl7.fhir.Coverage;
import org.hl7.fhir.CoverageEligibilityRequest;
import org.hl7.fhir.CoverageEligibilityResponse;
import org.hl7.fhir.DetectedIssue;
import org.hl7.fhir.Device;
import org.hl7.fhir.DeviceAssociation;
import org.hl7.fhir.DeviceDefinition;
import org.hl7.fhir.DeviceDispense;
import org.hl7.fhir.DeviceMetric;
import org.hl7.fhir.DeviceRequest;
import org.hl7.fhir.DeviceUsage;
import org.hl7.fhir.DiagnosticReport;
import org.hl7.fhir.DocumentReference;
import org.hl7.fhir.DocumentRoot;
import org.hl7.fhir.Encounter;
import org.hl7.fhir.EncounterHistory;
import org.hl7.fhir.Endpoint;
import org.hl7.fhir.EnrollmentRequest;
import org.hl7.fhir.EnrollmentResponse;
import org.hl7.fhir.EpisodeOfCare;
import org.hl7.fhir.EventDefinition;
import org.hl7.fhir.Evidence;
import org.hl7.fhir.EvidenceReport;
import org.hl7.fhir.EvidenceVariable;
import org.hl7.fhir.ExampleScenario;
import org.hl7.fhir.ExplanationOfBenefit;
import org.hl7.fhir.FamilyMemberHistory;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Flag;
import org.hl7.fhir.FormularyItem;
import org.hl7.fhir.GenomicStudy;
import org.hl7.fhir.Goal;
import org.hl7.fhir.GraphDefinition;
import org.hl7.fhir.Group;
import org.hl7.fhir.GuidanceResponse;
import org.hl7.fhir.HealthcareService;
import org.hl7.fhir.ImagingSelection;
import org.hl7.fhir.ImagingStudy;
import org.hl7.fhir.Immunization;
import org.hl7.fhir.ImmunizationEvaluation;
import org.hl7.fhir.ImmunizationRecommendation;
import org.hl7.fhir.ImplementationGuide;
import org.hl7.fhir.Ingredient;
import org.hl7.fhir.InsurancePlan;
import org.hl7.fhir.InventoryItem;
import org.hl7.fhir.InventoryReport;
import org.hl7.fhir.Invoice;
import org.hl7.fhir.Library;
import org.hl7.fhir.Linkage;
import org.hl7.fhir.List;
import org.hl7.fhir.Location;
import org.hl7.fhir.ManufacturedItemDefinition;
import org.hl7.fhir.Measure;
import org.hl7.fhir.MeasureReport;
import org.hl7.fhir.Medication;
import org.hl7.fhir.MedicationAdministration;
import org.hl7.fhir.MedicationDispense;
import org.hl7.fhir.MedicationKnowledge;
import org.hl7.fhir.MedicationRequest;
import org.hl7.fhir.MedicationStatement;
import org.hl7.fhir.MedicinalProductDefinition;
import org.hl7.fhir.MessageDefinition;
import org.hl7.fhir.MessageHeader;
import org.hl7.fhir.MolecularSequence;
import org.hl7.fhir.NamingSystem;
import org.hl7.fhir.NutritionIntake;
import org.hl7.fhir.NutritionOrder;
import org.hl7.fhir.NutritionProduct;
import org.hl7.fhir.Observation;
import org.hl7.fhir.ObservationDefinition;
import org.hl7.fhir.OperationDefinition;
import org.hl7.fhir.OperationOutcome;
import org.hl7.fhir.Organization;
import org.hl7.fhir.OrganizationAffiliation;
import org.hl7.fhir.PackagedProductDefinition;
import org.hl7.fhir.Parameters;
import org.hl7.fhir.Patient;
import org.hl7.fhir.PaymentNotice;
import org.hl7.fhir.PaymentReconciliation;
import org.hl7.fhir.Permission;
import org.hl7.fhir.Person;
import org.hl7.fhir.PlanDefinition;
import org.hl7.fhir.Practitioner;
import org.hl7.fhir.PractitionerRole;
import org.hl7.fhir.Procedure;
import org.hl7.fhir.Provenance;
import org.hl7.fhir.Questionnaire;
import org.hl7.fhir.QuestionnaireResponse;
import org.hl7.fhir.RegulatedAuthorization;
import org.hl7.fhir.RelatedPerson;
import org.hl7.fhir.RequestOrchestration;
import org.hl7.fhir.Requirements;
import org.hl7.fhir.ResearchStudy;
import org.hl7.fhir.ResearchSubject;
import org.hl7.fhir.RiskAssessment;
import org.hl7.fhir.Schedule;
import org.hl7.fhir.SearchParameter;
import org.hl7.fhir.ServiceRequest;
import org.hl7.fhir.Slot;
import org.hl7.fhir.Specimen;
import org.hl7.fhir.SpecimenDefinition;
import org.hl7.fhir.StructureDefinition;
import org.hl7.fhir.StructureMap;
import org.hl7.fhir.Subscription;
import org.hl7.fhir.SubscriptionStatus;
import org.hl7.fhir.SubscriptionTopic;
import org.hl7.fhir.Substance;
import org.hl7.fhir.SubstanceDefinition;
import org.hl7.fhir.SubstanceNucleicAcid;
import org.hl7.fhir.SubstancePolymer;
import org.hl7.fhir.SubstanceProtein;
import org.hl7.fhir.SubstanceReferenceInformation;
import org.hl7.fhir.SubstanceSourceMaterial;
import org.hl7.fhir.SupplyDelivery;
import org.hl7.fhir.SupplyRequest;
import org.hl7.fhir.Task;
import org.hl7.fhir.TerminologyCapabilities;
import org.hl7.fhir.TestPlan;
import org.hl7.fhir.TestReport;
import org.hl7.fhir.TestScript;
import org.hl7.fhir.Transport;
import org.hl7.fhir.ValueSet;
import org.hl7.fhir.VerificationResult;
import org.hl7.fhir.VisionPrescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getActivityDefinition <em>Activity Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getActorDefinition <em>Actor Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getAdministrableProductDefinition <em>Administrable Product Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getAdverseEvent <em>Adverse Event</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getAllergyIntolerance <em>Allergy Intolerance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getAppointmentResponse <em>Appointment Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getArtifactAssessment <em>Artifact Assessment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getAuditEvent <em>Audit Event</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getBinary <em>Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getBiologicallyDerivedProduct <em>Biologically Derived Product</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getBiologicallyDerivedProductDispense <em>Biologically Derived Product Dispense</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getBodyStructure <em>Body Structure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getBundle <em>Bundle</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getCapabilityStatement <em>Capability Statement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getCarePlan <em>Care Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getCareTeam <em>Care Team</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getChargeItem <em>Charge Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getChargeItemDefinition <em>Charge Item Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getCitation <em>Citation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getClaim <em>Claim</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getClaimResponse <em>Claim Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getClinicalImpression <em>Clinical Impression</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getClinicalUseDefinition <em>Clinical Use Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getCommunication <em>Communication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getCommunicationRequest <em>Communication Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getCompartmentDefinition <em>Compartment Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getComposition <em>Composition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getConceptMap <em>Concept Map</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getConditionDefinition <em>Condition Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getConsent <em>Consent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getCoverageEligibilityRequest <em>Coverage Eligibility Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getCoverageEligibilityResponse <em>Coverage Eligibility Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getDetectedIssue <em>Detected Issue</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getDeviceAssociation <em>Device Association</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getDeviceDefinition <em>Device Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getDeviceDispense <em>Device Dispense</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getDeviceMetric <em>Device Metric</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getDeviceRequest <em>Device Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getDeviceUsage <em>Device Usage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getDiagnosticReport <em>Diagnostic Report</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getDocumentReference <em>Document Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getEncounterHistory <em>Encounter History</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getEnrollmentRequest <em>Enrollment Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getEnrollmentResponse <em>Enrollment Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getEpisodeOfCare <em>Episode Of Care</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getEventDefinition <em>Event Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getEvidenceReport <em>Evidence Report</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getEvidenceVariable <em>Evidence Variable</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getExampleScenario <em>Example Scenario</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getExplanationOfBenefit <em>Explanation Of Benefit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getFamilyMemberHistory <em>Family Member History</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getFlag <em>Flag</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getFormularyItem <em>Formulary Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getGenomicStudy <em>Genomic Study</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getGraphDefinition <em>Graph Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getGuidanceResponse <em>Guidance Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getHealthcareService <em>Healthcare Service</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getImagingSelection <em>Imaging Selection</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getImagingStudy <em>Imaging Study</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getImmunization <em>Immunization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getImmunizationEvaluation <em>Immunization Evaluation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getImmunizationRecommendation <em>Immunization Recommendation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getImplementationGuide <em>Implementation Guide</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getInsurancePlan <em>Insurance Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getInventoryItem <em>Inventory Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getInventoryReport <em>Inventory Report</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getInvoice <em>Invoice</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getLinkage <em>Linkage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getList <em>List</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getManufacturedItemDefinition <em>Manufactured Item Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getMeasureReport <em>Measure Report</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getMedication <em>Medication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getMedicationAdministration <em>Medication Administration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getMedicationDispense <em>Medication Dispense</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getMedicationKnowledge <em>Medication Knowledge</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getMedicationRequest <em>Medication Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getMedicationStatement <em>Medication Statement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getMedicinalProductDefinition <em>Medicinal Product Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getMessageDefinition <em>Message Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getMessageHeader <em>Message Header</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getMolecularSequence <em>Molecular Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getNamingSystem <em>Naming System</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getNutritionIntake <em>Nutrition Intake</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getNutritionOrder <em>Nutrition Order</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getNutritionProduct <em>Nutrition Product</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getObservation <em>Observation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getObservationDefinition <em>Observation Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getOperationDefinition <em>Operation Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getOperationOutcome <em>Operation Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getOrganizationAffiliation <em>Organization Affiliation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getPackagedProductDefinition <em>Packaged Product Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getPaymentNotice <em>Payment Notice</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getPaymentReconciliation <em>Payment Reconciliation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getPermission <em>Permission</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getPlanDefinition <em>Plan Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getPractitioner <em>Practitioner</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getPractitionerRole <em>Practitioner Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getProvenance <em>Provenance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getQuestionnaireResponse <em>Questionnaire Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getRegulatedAuthorization <em>Regulated Authorization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getRelatedPerson <em>Related Person</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getRequestOrchestration <em>Request Orchestration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getResearchStudy <em>Research Study</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getResearchSubject <em>Research Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getRiskAssessment <em>Risk Assessment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getSearchParameter <em>Search Parameter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getServiceRequest <em>Service Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getSlot <em>Slot</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getSpecimenDefinition <em>Specimen Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getStructureDefinition <em>Structure Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getStructureMap <em>Structure Map</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getSubscription <em>Subscription</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getSubscriptionStatus <em>Subscription Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getSubscriptionTopic <em>Subscription Topic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getSubstance <em>Substance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getSubstanceDefinition <em>Substance Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getSubstanceNucleicAcid <em>Substance Nucleic Acid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getSubstancePolymer <em>Substance Polymer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getSubstanceProtein <em>Substance Protein</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getSubstanceReferenceInformation <em>Substance Reference Information</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getSubstanceSourceMaterial <em>Substance Source Material</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getSupplyDelivery <em>Supply Delivery</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getSupplyRequest <em>Supply Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getTask <em>Task</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getTerminologyCapabilities <em>Terminology Capabilities</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getTestPlan <em>Test Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getTestReport <em>Test Report</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getTestScript <em>Test Script</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getTransport <em>Transport</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getVerificationResult <em>Verification Result</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getVisionPrescription <em>Vision Prescription</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, FhirPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, FhirPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, FhirPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account getAccount() {
		return (Account)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Account(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccount(Account newAccount, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Account(), newAccount, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccount(Account newAccount) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Account(), newAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDefinition getActivityDefinition() {
		return (ActivityDefinition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ActivityDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityDefinition(ActivityDefinition newActivityDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ActivityDefinition(), newActivityDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityDefinition(ActivityDefinition newActivityDefinition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ActivityDefinition(), newActivityDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorDefinition getActorDefinition() {
		return (ActorDefinition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ActorDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActorDefinition(ActorDefinition newActorDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ActorDefinition(), newActorDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActorDefinition(ActorDefinition newActorDefinition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ActorDefinition(), newActorDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrableProductDefinition getAdministrableProductDefinition() {
		return (AdministrableProductDefinition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_AdministrableProductDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdministrableProductDefinition(AdministrableProductDefinition newAdministrableProductDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_AdministrableProductDefinition(), newAdministrableProductDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdministrableProductDefinition(AdministrableProductDefinition newAdministrableProductDefinition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_AdministrableProductDefinition(), newAdministrableProductDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEvent getAdverseEvent() {
		return (AdverseEvent)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_AdverseEvent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdverseEvent(AdverseEvent newAdverseEvent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_AdverseEvent(), newAdverseEvent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdverseEvent(AdverseEvent newAdverseEvent) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_AdverseEvent(), newAdverseEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntolerance getAllergyIntolerance() {
		return (AllergyIntolerance)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_AllergyIntolerance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllergyIntolerance(AllergyIntolerance newAllergyIntolerance, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_AllergyIntolerance(), newAllergyIntolerance, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllergyIntolerance(AllergyIntolerance newAllergyIntolerance) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_AllergyIntolerance(), newAllergyIntolerance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appointment getAppointment() {
		return (Appointment)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Appointment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppointment(Appointment newAppointment, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Appointment(), newAppointment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppointment(Appointment newAppointment) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Appointment(), newAppointment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentResponse getAppointmentResponse() {
		return (AppointmentResponse)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_AppointmentResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppointmentResponse(AppointmentResponse newAppointmentResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_AppointmentResponse(), newAppointmentResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppointmentResponse(AppointmentResponse newAppointmentResponse) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_AppointmentResponse(), newAppointmentResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactAssessment getArtifactAssessment() {
		return (ArtifactAssessment)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ArtifactAssessment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifactAssessment(ArtifactAssessment newArtifactAssessment, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ArtifactAssessment(), newArtifactAssessment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactAssessment(ArtifactAssessment newArtifactAssessment) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ArtifactAssessment(), newArtifactAssessment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEvent getAuditEvent() {
		return (AuditEvent)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_AuditEvent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuditEvent(AuditEvent newAuditEvent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_AuditEvent(), newAuditEvent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuditEvent(AuditEvent newAuditEvent) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_AuditEvent(), newAuditEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basic getBasic() {
		return (Basic)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Basic(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasic(Basic newBasic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Basic(), newBasic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasic(Basic newBasic) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Basic(), newBasic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binary getBinary() {
		return (Binary)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Binary(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinary(Binary newBinary, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Binary(), newBinary, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinary(Binary newBinary) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Binary(), newBinary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiologicallyDerivedProduct getBiologicallyDerivedProduct() {
		return (BiologicallyDerivedProduct)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_BiologicallyDerivedProduct(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBiologicallyDerivedProduct(BiologicallyDerivedProduct newBiologicallyDerivedProduct, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_BiologicallyDerivedProduct(), newBiologicallyDerivedProduct, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBiologicallyDerivedProduct(BiologicallyDerivedProduct newBiologicallyDerivedProduct) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_BiologicallyDerivedProduct(), newBiologicallyDerivedProduct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiologicallyDerivedProductDispense getBiologicallyDerivedProductDispense() {
		return (BiologicallyDerivedProductDispense)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_BiologicallyDerivedProductDispense(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBiologicallyDerivedProductDispense(BiologicallyDerivedProductDispense newBiologicallyDerivedProductDispense, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_BiologicallyDerivedProductDispense(), newBiologicallyDerivedProductDispense, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBiologicallyDerivedProductDispense(BiologicallyDerivedProductDispense newBiologicallyDerivedProductDispense) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_BiologicallyDerivedProductDispense(), newBiologicallyDerivedProductDispense);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyStructure getBodyStructure() {
		return (BodyStructure)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_BodyStructure(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodyStructure(BodyStructure newBodyStructure, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_BodyStructure(), newBodyStructure, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyStructure(BodyStructure newBodyStructure) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_BodyStructure(), newBodyStructure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle getBundle() {
		return (Bundle)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Bundle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBundle(Bundle newBundle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Bundle(), newBundle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBundle(Bundle newBundle) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Bundle(), newBundle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatement getCapabilityStatement() {
		return (CapabilityStatement)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_CapabilityStatement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapabilityStatement(CapabilityStatement newCapabilityStatement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_CapabilityStatement(), newCapabilityStatement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapabilityStatement(CapabilityStatement newCapabilityStatement) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_CapabilityStatement(), newCapabilityStatement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlan getCarePlan() {
		return (CarePlan)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_CarePlan(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCarePlan(CarePlan newCarePlan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_CarePlan(), newCarePlan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarePlan(CarePlan newCarePlan) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_CarePlan(), newCarePlan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeam getCareTeam() {
		return (CareTeam)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_CareTeam(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCareTeam(CareTeam newCareTeam, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_CareTeam(), newCareTeam, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCareTeam(CareTeam newCareTeam) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_CareTeam(), newCareTeam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeItem getChargeItem() {
		return (ChargeItem)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ChargeItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChargeItem(ChargeItem newChargeItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ChargeItem(), newChargeItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeItem(ChargeItem newChargeItem) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ChargeItem(), newChargeItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeItemDefinition getChargeItemDefinition() {
		return (ChargeItemDefinition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ChargeItemDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChargeItemDefinition(ChargeItemDefinition newChargeItemDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ChargeItemDefinition(), newChargeItemDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeItemDefinition(ChargeItemDefinition newChargeItemDefinition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ChargeItemDefinition(), newChargeItemDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Citation getCitation() {
		return (Citation)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Citation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCitation(Citation newCitation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Citation(), newCitation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCitation(Citation newCitation) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Citation(), newCitation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim getClaim() {
		return (Claim)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Claim(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaim(Claim newClaim, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Claim(), newClaim, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaim(Claim newClaim) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Claim(), newClaim);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponse getClaimResponse() {
		return (ClaimResponse)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ClaimResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaimResponse(ClaimResponse newClaimResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ClaimResponse(), newClaimResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimResponse(ClaimResponse newClaimResponse) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ClaimResponse(), newClaimResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpression getClinicalImpression() {
		return (ClinicalImpression)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ClinicalImpression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClinicalImpression(ClinicalImpression newClinicalImpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ClinicalImpression(), newClinicalImpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClinicalImpression(ClinicalImpression newClinicalImpression) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ClinicalImpression(), newClinicalImpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalUseDefinition getClinicalUseDefinition() {
		return (ClinicalUseDefinition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ClinicalUseDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClinicalUseDefinition(ClinicalUseDefinition newClinicalUseDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ClinicalUseDefinition(), newClinicalUseDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClinicalUseDefinition(ClinicalUseDefinition newClinicalUseDefinition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ClinicalUseDefinition(), newClinicalUseDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystem getCodeSystem() {
		return (CodeSystem)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_CodeSystem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeSystem(CodeSystem newCodeSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_CodeSystem(), newCodeSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSystem(CodeSystem newCodeSystem) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_CodeSystem(), newCodeSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communication getCommunication() {
		return (Communication)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Communication(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunication(Communication newCommunication, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Communication(), newCommunication, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunication(Communication newCommunication) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Communication(), newCommunication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequest getCommunicationRequest() {
		return (CommunicationRequest)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_CommunicationRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunicationRequest(CommunicationRequest newCommunicationRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_CommunicationRequest(), newCommunicationRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationRequest(CommunicationRequest newCommunicationRequest) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_CommunicationRequest(), newCommunicationRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentDefinition getCompartmentDefinition() {
		return (CompartmentDefinition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_CompartmentDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompartmentDefinition(CompartmentDefinition newCompartmentDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_CompartmentDefinition(), newCompartmentDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompartmentDefinition(CompartmentDefinition newCompartmentDefinition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_CompartmentDefinition(), newCompartmentDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition getComposition() {
		return (Composition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Composition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComposition(Composition newComposition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Composition(), newComposition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposition(Composition newComposition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Composition(), newComposition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMap getConceptMap() {
		return (ConceptMap)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ConceptMap(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConceptMap(ConceptMap newConceptMap, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ConceptMap(), newConceptMap, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConceptMap(ConceptMap newConceptMap) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ConceptMap(), newConceptMap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return (Condition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Condition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Condition(), newCondition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Condition(), newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionDefinition getConditionDefinition() {
		return (ConditionDefinition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ConditionDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionDefinition(ConditionDefinition newConditionDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ConditionDefinition(), newConditionDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionDefinition(ConditionDefinition newConditionDefinition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ConditionDefinition(), newConditionDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consent getConsent() {
		return (Consent)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Consent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsent(Consent newConsent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Consent(), newConsent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsent(Consent newConsent) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Consent(), newConsent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contract getContract() {
		return (Contract)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Contract(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContract(Contract newContract, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Contract(), newContract, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContract(Contract newContract) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Contract(), newContract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coverage getCoverage() {
		return (Coverage)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Coverage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverage(Coverage newCoverage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Coverage(), newCoverage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoverage(Coverage newCoverage) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Coverage(), newCoverage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageEligibilityRequest getCoverageEligibilityRequest() {
		return (CoverageEligibilityRequest)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_CoverageEligibilityRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverageEligibilityRequest(CoverageEligibilityRequest newCoverageEligibilityRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_CoverageEligibilityRequest(), newCoverageEligibilityRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoverageEligibilityRequest(CoverageEligibilityRequest newCoverageEligibilityRequest) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_CoverageEligibilityRequest(), newCoverageEligibilityRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageEligibilityResponse getCoverageEligibilityResponse() {
		return (CoverageEligibilityResponse)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_CoverageEligibilityResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverageEligibilityResponse(CoverageEligibilityResponse newCoverageEligibilityResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_CoverageEligibilityResponse(), newCoverageEligibilityResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoverageEligibilityResponse(CoverageEligibilityResponse newCoverageEligibilityResponse) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_CoverageEligibilityResponse(), newCoverageEligibilityResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssue getDetectedIssue() {
		return (DetectedIssue)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_DetectedIssue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetectedIssue(DetectedIssue newDetectedIssue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_DetectedIssue(), newDetectedIssue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetectedIssue(DetectedIssue newDetectedIssue) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_DetectedIssue(), newDetectedIssue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getDevice() {
		return (Device)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Device(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevice(Device newDevice, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Device(), newDevice, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(Device newDevice) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Device(), newDevice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceAssociation getDeviceAssociation() {
		return (DeviceAssociation)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_DeviceAssociation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceAssociation(DeviceAssociation newDeviceAssociation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_DeviceAssociation(), newDeviceAssociation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceAssociation(DeviceAssociation newDeviceAssociation) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_DeviceAssociation(), newDeviceAssociation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDefinition getDeviceDefinition() {
		return (DeviceDefinition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_DeviceDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceDefinition(DeviceDefinition newDeviceDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_DeviceDefinition(), newDeviceDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceDefinition(DeviceDefinition newDeviceDefinition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_DeviceDefinition(), newDeviceDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDispense getDeviceDispense() {
		return (DeviceDispense)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_DeviceDispense(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceDispense(DeviceDispense newDeviceDispense, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_DeviceDispense(), newDeviceDispense, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceDispense(DeviceDispense newDeviceDispense) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_DeviceDispense(), newDeviceDispense);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetric getDeviceMetric() {
		return (DeviceMetric)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_DeviceMetric(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceMetric(DeviceMetric newDeviceMetric, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_DeviceMetric(), newDeviceMetric, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceMetric(DeviceMetric newDeviceMetric) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_DeviceMetric(), newDeviceMetric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceRequest getDeviceRequest() {
		return (DeviceRequest)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_DeviceRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceRequest(DeviceRequest newDeviceRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_DeviceRequest(), newDeviceRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceRequest(DeviceRequest newDeviceRequest) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_DeviceRequest(), newDeviceRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUsage getDeviceUsage() {
		return (DeviceUsage)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_DeviceUsage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceUsage(DeviceUsage newDeviceUsage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_DeviceUsage(), newDeviceUsage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceUsage(DeviceUsage newDeviceUsage) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_DeviceUsage(), newDeviceUsage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReport getDiagnosticReport() {
		return (DiagnosticReport)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_DiagnosticReport(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagnosticReport(DiagnosticReport newDiagnosticReport, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_DiagnosticReport(), newDiagnosticReport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnosticReport(DiagnosticReport newDiagnosticReport) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_DiagnosticReport(), newDiagnosticReport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReference getDocumentReference() {
		return (DocumentReference)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_DocumentReference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentReference(DocumentReference newDocumentReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_DocumentReference(), newDocumentReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentReference(DocumentReference newDocumentReference) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_DocumentReference(), newDocumentReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter getEncounter() {
		return (Encounter)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Encounter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Encounter newEncounter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Encounter(), newEncounter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Encounter newEncounter) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Encounter(), newEncounter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterHistory getEncounterHistory() {
		return (EncounterHistory)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_EncounterHistory(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounterHistory(EncounterHistory newEncounterHistory, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_EncounterHistory(), newEncounterHistory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounterHistory(EncounterHistory newEncounterHistory) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_EncounterHistory(), newEncounterHistory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint getEndpoint() {
		return (Endpoint)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Endpoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpoint(Endpoint newEndpoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Endpoint(), newEndpoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint(Endpoint newEndpoint) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Endpoint(), newEndpoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentRequest getEnrollmentRequest() {
		return (EnrollmentRequest)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_EnrollmentRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnrollmentRequest(EnrollmentRequest newEnrollmentRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_EnrollmentRequest(), newEnrollmentRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnrollmentRequest(EnrollmentRequest newEnrollmentRequest) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_EnrollmentRequest(), newEnrollmentRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentResponse getEnrollmentResponse() {
		return (EnrollmentResponse)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_EnrollmentResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnrollmentResponse(EnrollmentResponse newEnrollmentResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_EnrollmentResponse(), newEnrollmentResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnrollmentResponse(EnrollmentResponse newEnrollmentResponse) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_EnrollmentResponse(), newEnrollmentResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCare getEpisodeOfCare() {
		return (EpisodeOfCare)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_EpisodeOfCare(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEpisodeOfCare(EpisodeOfCare newEpisodeOfCare, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_EpisodeOfCare(), newEpisodeOfCare, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpisodeOfCare(EpisodeOfCare newEpisodeOfCare) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_EpisodeOfCare(), newEpisodeOfCare);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDefinition getEventDefinition() {
		return (EventDefinition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_EventDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventDefinition(EventDefinition newEventDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_EventDefinition(), newEventDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventDefinition(EventDefinition newEventDefinition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_EventDefinition(), newEventDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evidence getEvidence() {
		return (Evidence)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Evidence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvidence(Evidence newEvidence, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Evidence(), newEvidence, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvidence(Evidence newEvidence) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Evidence(), newEvidence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceReport getEvidenceReport() {
		return (EvidenceReport)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_EvidenceReport(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvidenceReport(EvidenceReport newEvidenceReport, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_EvidenceReport(), newEvidenceReport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvidenceReport(EvidenceReport newEvidenceReport) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_EvidenceReport(), newEvidenceReport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceVariable getEvidenceVariable() {
		return (EvidenceVariable)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_EvidenceVariable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvidenceVariable(EvidenceVariable newEvidenceVariable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_EvidenceVariable(), newEvidenceVariable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvidenceVariable(EvidenceVariable newEvidenceVariable) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_EvidenceVariable(), newEvidenceVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleScenario getExampleScenario() {
		return (ExampleScenario)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ExampleScenario(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleScenario(ExampleScenario newExampleScenario, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ExampleScenario(), newExampleScenario, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleScenario(ExampleScenario newExampleScenario) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ExampleScenario(), newExampleScenario);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefit getExplanationOfBenefit() {
		return (ExplanationOfBenefit)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ExplanationOfBenefit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExplanationOfBenefit(ExplanationOfBenefit newExplanationOfBenefit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ExplanationOfBenefit(), newExplanationOfBenefit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplanationOfBenefit(ExplanationOfBenefit newExplanationOfBenefit) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ExplanationOfBenefit(), newExplanationOfBenefit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMemberHistory getFamilyMemberHistory() {
		return (FamilyMemberHistory)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_FamilyMemberHistory(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFamilyMemberHistory(FamilyMemberHistory newFamilyMemberHistory, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_FamilyMemberHistory(), newFamilyMemberHistory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamilyMemberHistory(FamilyMemberHistory newFamilyMemberHistory) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_FamilyMemberHistory(), newFamilyMemberHistory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flag getFlag() {
		return (Flag)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Flag(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlag(Flag newFlag, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Flag(), newFlag, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlag(Flag newFlag) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Flag(), newFlag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormularyItem getFormularyItem() {
		return (FormularyItem)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_FormularyItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormularyItem(FormularyItem newFormularyItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_FormularyItem(), newFormularyItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormularyItem(FormularyItem newFormularyItem) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_FormularyItem(), newFormularyItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenomicStudy getGenomicStudy() {
		return (GenomicStudy)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_GenomicStudy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenomicStudy(GenomicStudy newGenomicStudy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_GenomicStudy(), newGenomicStudy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenomicStudy(GenomicStudy newGenomicStudy) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_GenomicStudy(), newGenomicStudy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal getGoal() {
		return (Goal)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Goal(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoal(Goal newGoal, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Goal(), newGoal, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoal(Goal newGoal) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Goal(), newGoal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphDefinition getGraphDefinition() {
		return (GraphDefinition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_GraphDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphDefinition(GraphDefinition newGraphDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_GraphDefinition(), newGraphDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphDefinition(GraphDefinition newGraphDefinition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_GraphDefinition(), newGraphDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getGroup() {
		return (Group)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Group(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group newGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Group(), newGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(Group newGroup) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Group(), newGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponse getGuidanceResponse() {
		return (GuidanceResponse)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_GuidanceResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuidanceResponse(GuidanceResponse newGuidanceResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_GuidanceResponse(), newGuidanceResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuidanceResponse(GuidanceResponse newGuidanceResponse) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_GuidanceResponse(), newGuidanceResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareService getHealthcareService() {
		return (HealthcareService)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_HealthcareService(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHealthcareService(HealthcareService newHealthcareService, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_HealthcareService(), newHealthcareService, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHealthcareService(HealthcareService newHealthcareService) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_HealthcareService(), newHealthcareService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingSelection getImagingSelection() {
		return (ImagingSelection)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ImagingSelection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagingSelection(ImagingSelection newImagingSelection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ImagingSelection(), newImagingSelection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagingSelection(ImagingSelection newImagingSelection) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ImagingSelection(), newImagingSelection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudy getImagingStudy() {
		return (ImagingStudy)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ImagingStudy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagingStudy(ImagingStudy newImagingStudy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ImagingStudy(), newImagingStudy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagingStudy(ImagingStudy newImagingStudy) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ImagingStudy(), newImagingStudy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Immunization getImmunization() {
		return (Immunization)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Immunization(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImmunization(Immunization newImmunization, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Immunization(), newImmunization, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImmunization(Immunization newImmunization) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Immunization(), newImmunization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationEvaluation getImmunizationEvaluation() {
		return (ImmunizationEvaluation)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ImmunizationEvaluation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImmunizationEvaluation(ImmunizationEvaluation newImmunizationEvaluation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ImmunizationEvaluation(), newImmunizationEvaluation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImmunizationEvaluation(ImmunizationEvaluation newImmunizationEvaluation) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ImmunizationEvaluation(), newImmunizationEvaluation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendation getImmunizationRecommendation() {
		return (ImmunizationRecommendation)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ImmunizationRecommendation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImmunizationRecommendation(ImmunizationRecommendation newImmunizationRecommendation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ImmunizationRecommendation(), newImmunizationRecommendation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImmunizationRecommendation(ImmunizationRecommendation newImmunizationRecommendation) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ImmunizationRecommendation(), newImmunizationRecommendation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuide getImplementationGuide() {
		return (ImplementationGuide)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ImplementationGuide(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementationGuide(ImplementationGuide newImplementationGuide, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ImplementationGuide(), newImplementationGuide, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationGuide(ImplementationGuide newImplementationGuide) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ImplementationGuide(), newImplementationGuide);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ingredient getIngredient() {
		return (Ingredient)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Ingredient(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIngredient(Ingredient newIngredient, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Ingredient(), newIngredient, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIngredient(Ingredient newIngredient) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Ingredient(), newIngredient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsurancePlan getInsurancePlan() {
		return (InsurancePlan)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_InsurancePlan(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsurancePlan(InsurancePlan newInsurancePlan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_InsurancePlan(), newInsurancePlan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsurancePlan(InsurancePlan newInsurancePlan) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_InsurancePlan(), newInsurancePlan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryItem getInventoryItem() {
		return (InventoryItem)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_InventoryItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInventoryItem(InventoryItem newInventoryItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_InventoryItem(), newInventoryItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInventoryItem(InventoryItem newInventoryItem) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_InventoryItem(), newInventoryItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryReport getInventoryReport() {
		return (InventoryReport)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_InventoryReport(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInventoryReport(InventoryReport newInventoryReport, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_InventoryReport(), newInventoryReport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInventoryReport(InventoryReport newInventoryReport) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_InventoryReport(), newInventoryReport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoice getInvoice() {
		return (Invoice)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Invoice(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvoice(Invoice newInvoice, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Invoice(), newInvoice, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoice(Invoice newInvoice) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Invoice(), newInvoice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library getLibrary() {
		return (Library)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Library(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibrary(Library newLibrary, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Library(), newLibrary, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibrary(Library newLibrary) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Library(), newLibrary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Linkage getLinkage() {
		return (Linkage)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Linkage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkage(Linkage newLinkage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Linkage(), newLinkage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkage(Linkage newLinkage) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Linkage(), newLinkage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getList() {
		return (List)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_List(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(List newList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_List(), newList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList(List newList) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_List(), newList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		return (Location)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Location(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Location(), newLocation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Location(), newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturedItemDefinition getManufacturedItemDefinition() {
		return (ManufacturedItemDefinition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ManufacturedItemDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturedItemDefinition(ManufacturedItemDefinition newManufacturedItemDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ManufacturedItemDefinition(), newManufacturedItemDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturedItemDefinition(ManufacturedItemDefinition newManufacturedItemDefinition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ManufacturedItemDefinition(), newManufacturedItemDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure getMeasure() {
		return (Measure)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Measure(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasure(Measure newMeasure, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Measure(), newMeasure, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasure(Measure newMeasure) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Measure(), newMeasure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReport getMeasureReport() {
		return (MeasureReport)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_MeasureReport(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureReport(MeasureReport newMeasureReport, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_MeasureReport(), newMeasureReport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureReport(MeasureReport newMeasureReport) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_MeasureReport(), newMeasureReport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medication getMedication() {
		return (Medication)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Medication(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedication(Medication newMedication, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Medication(), newMedication, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedication(Medication newMedication) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Medication(), newMedication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministration getMedicationAdministration() {
		return (MedicationAdministration)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_MedicationAdministration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationAdministration(MedicationAdministration newMedicationAdministration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_MedicationAdministration(), newMedicationAdministration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationAdministration(MedicationAdministration newMedicationAdministration) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_MedicationAdministration(), newMedicationAdministration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispense getMedicationDispense() {
		return (MedicationDispense)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_MedicationDispense(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationDispense(MedicationDispense newMedicationDispense, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_MedicationDispense(), newMedicationDispense, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationDispense(MedicationDispense newMedicationDispense) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_MedicationDispense(), newMedicationDispense);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledge getMedicationKnowledge() {
		return (MedicationKnowledge)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_MedicationKnowledge(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationKnowledge(MedicationKnowledge newMedicationKnowledge, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_MedicationKnowledge(), newMedicationKnowledge, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationKnowledge(MedicationKnowledge newMedicationKnowledge) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_MedicationKnowledge(), newMedicationKnowledge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequest getMedicationRequest() {
		return (MedicationRequest)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_MedicationRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationRequest(MedicationRequest newMedicationRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_MedicationRequest(), newMedicationRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationRequest(MedicationRequest newMedicationRequest) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_MedicationRequest(), newMedicationRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatement getMedicationStatement() {
		return (MedicationStatement)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_MedicationStatement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationStatement(MedicationStatement newMedicationStatement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_MedicationStatement(), newMedicationStatement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationStatement(MedicationStatement newMedicationStatement) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_MedicationStatement(), newMedicationStatement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicinalProductDefinition getMedicinalProductDefinition() {
		return (MedicinalProductDefinition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_MedicinalProductDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicinalProductDefinition(MedicinalProductDefinition newMedicinalProductDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_MedicinalProductDefinition(), newMedicinalProductDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicinalProductDefinition(MedicinalProductDefinition newMedicinalProductDefinition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_MedicinalProductDefinition(), newMedicinalProductDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDefinition getMessageDefinition() {
		return (MessageDefinition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_MessageDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageDefinition(MessageDefinition newMessageDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_MessageDefinition(), newMessageDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageDefinition(MessageDefinition newMessageDefinition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_MessageDefinition(), newMessageDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeader getMessageHeader() {
		return (MessageHeader)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_MessageHeader(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageHeader(MessageHeader newMessageHeader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_MessageHeader(), newMessageHeader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageHeader(MessageHeader newMessageHeader) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_MessageHeader(), newMessageHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolecularSequence getMolecularSequence() {
		return (MolecularSequence)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_MolecularSequence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMolecularSequence(MolecularSequence newMolecularSequence, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_MolecularSequence(), newMolecularSequence, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMolecularSequence(MolecularSequence newMolecularSequence) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_MolecularSequence(), newMolecularSequence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystem getNamingSystem() {
		return (NamingSystem)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_NamingSystem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamingSystem(NamingSystem newNamingSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_NamingSystem(), newNamingSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamingSystem(NamingSystem newNamingSystem) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_NamingSystem(), newNamingSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionIntake getNutritionIntake() {
		return (NutritionIntake)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_NutritionIntake(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNutritionIntake(NutritionIntake newNutritionIntake, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_NutritionIntake(), newNutritionIntake, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNutritionIntake(NutritionIntake newNutritionIntake) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_NutritionIntake(), newNutritionIntake);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrder getNutritionOrder() {
		return (NutritionOrder)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_NutritionOrder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNutritionOrder(NutritionOrder newNutritionOrder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_NutritionOrder(), newNutritionOrder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNutritionOrder(NutritionOrder newNutritionOrder) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_NutritionOrder(), newNutritionOrder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionProduct getNutritionProduct() {
		return (NutritionProduct)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_NutritionProduct(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNutritionProduct(NutritionProduct newNutritionProduct, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_NutritionProduct(), newNutritionProduct, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNutritionProduct(NutritionProduct newNutritionProduct) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_NutritionProduct(), newNutritionProduct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation getObservation() {
		return (Observation)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Observation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObservation(Observation newObservation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Observation(), newObservation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservation(Observation newObservation) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Observation(), newObservation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationDefinition getObservationDefinition() {
		return (ObservationDefinition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ObservationDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObservationDefinition(ObservationDefinition newObservationDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ObservationDefinition(), newObservationDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservationDefinition(ObservationDefinition newObservationDefinition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ObservationDefinition(), newObservationDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinition getOperationDefinition() {
		return (OperationDefinition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_OperationDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationDefinition(OperationDefinition newOperationDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_OperationDefinition(), newOperationDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationDefinition(OperationDefinition newOperationDefinition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_OperationDefinition(), newOperationDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationOutcome getOperationOutcome() {
		return (OperationOutcome)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_OperationOutcome(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationOutcome(OperationOutcome newOperationOutcome, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_OperationOutcome(), newOperationOutcome, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationOutcome(OperationOutcome newOperationOutcome) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_OperationOutcome(), newOperationOutcome);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getOrganization() {
		return (Organization)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Organization(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(Organization newOrganization, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Organization(), newOrganization, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Organization newOrganization) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Organization(), newOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationAffiliation getOrganizationAffiliation() {
		return (OrganizationAffiliation)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_OrganizationAffiliation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationAffiliation(OrganizationAffiliation newOrganizationAffiliation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_OrganizationAffiliation(), newOrganizationAffiliation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationAffiliation(OrganizationAffiliation newOrganizationAffiliation) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_OrganizationAffiliation(), newOrganizationAffiliation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagedProductDefinition getPackagedProductDefinition() {
		return (PackagedProductDefinition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_PackagedProductDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackagedProductDefinition(PackagedProductDefinition newPackagedProductDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_PackagedProductDefinition(), newPackagedProductDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackagedProductDefinition(PackagedProductDefinition newPackagedProductDefinition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_PackagedProductDefinition(), newPackagedProductDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameters getParameters() {
		return (Parameters)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Parameters(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameters(Parameters newParameters, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Parameters(), newParameters, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(Parameters newParameters) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Parameters(), newParameters);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient getPatient() {
		return (Patient)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Patient(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Patient newPatient, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Patient(), newPatient, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Patient newPatient) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Patient(), newPatient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentNotice getPaymentNotice() {
		return (PaymentNotice)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_PaymentNotice(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentNotice(PaymentNotice newPaymentNotice, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_PaymentNotice(), newPaymentNotice, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentNotice(PaymentNotice newPaymentNotice) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_PaymentNotice(), newPaymentNotice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentReconciliation getPaymentReconciliation() {
		return (PaymentReconciliation)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_PaymentReconciliation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentReconciliation(PaymentReconciliation newPaymentReconciliation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_PaymentReconciliation(), newPaymentReconciliation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentReconciliation(PaymentReconciliation newPaymentReconciliation) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_PaymentReconciliation(), newPaymentReconciliation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permission getPermission() {
		return (Permission)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Permission(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPermission(Permission newPermission, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Permission(), newPermission, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermission(Permission newPermission) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Permission(), newPermission);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getPerson() {
		return (Person)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Person(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(Person newPerson, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Person(), newPerson, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(Person newPerson) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Person(), newPerson);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinition getPlanDefinition() {
		return (PlanDefinition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_PlanDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanDefinition(PlanDefinition newPlanDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_PlanDefinition(), newPlanDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanDefinition(PlanDefinition newPlanDefinition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_PlanDefinition(), newPlanDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getPractitioner() {
		return (Practitioner)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Practitioner(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPractitioner(Practitioner newPractitioner, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Practitioner(), newPractitioner, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPractitioner(Practitioner newPractitioner) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Practitioner(), newPractitioner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerRole getPractitionerRole() {
		return (PractitionerRole)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_PractitionerRole(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPractitionerRole(PractitionerRole newPractitionerRole, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_PractitionerRole(), newPractitionerRole, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPractitionerRole(PractitionerRole newPractitionerRole) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_PractitionerRole(), newPractitionerRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure getProcedure() {
		return (Procedure)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Procedure(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedure(Procedure newProcedure, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Procedure(), newProcedure, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedure(Procedure newProcedure) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Procedure(), newProcedure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provenance getProvenance() {
		return (Provenance)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Provenance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvenance(Provenance newProvenance, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Provenance(), newProvenance, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvenance(Provenance newProvenance) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Provenance(), newProvenance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire getQuestionnaire() {
		return (Questionnaire)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Questionnaire(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestionnaire(Questionnaire newQuestionnaire, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Questionnaire(), newQuestionnaire, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionnaire(Questionnaire newQuestionnaire) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Questionnaire(), newQuestionnaire);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponse getQuestionnaireResponse() {
		return (QuestionnaireResponse)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_QuestionnaireResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestionnaireResponse(QuestionnaireResponse newQuestionnaireResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_QuestionnaireResponse(), newQuestionnaireResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionnaireResponse(QuestionnaireResponse newQuestionnaireResponse) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_QuestionnaireResponse(), newQuestionnaireResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatedAuthorization getRegulatedAuthorization() {
		return (RegulatedAuthorization)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_RegulatedAuthorization(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegulatedAuthorization(RegulatedAuthorization newRegulatedAuthorization, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_RegulatedAuthorization(), newRegulatedAuthorization, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegulatedAuthorization(RegulatedAuthorization newRegulatedAuthorization) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_RegulatedAuthorization(), newRegulatedAuthorization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedPerson getRelatedPerson() {
		return (RelatedPerson)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_RelatedPerson(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedPerson(RelatedPerson newRelatedPerson, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_RelatedPerson(), newRelatedPerson, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedPerson(RelatedPerson newRelatedPerson) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_RelatedPerson(), newRelatedPerson);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestOrchestration getRequestOrchestration() {
		return (RequestOrchestration)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_RequestOrchestration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestOrchestration(RequestOrchestration newRequestOrchestration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_RequestOrchestration(), newRequestOrchestration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestOrchestration(RequestOrchestration newRequestOrchestration) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_RequestOrchestration(), newRequestOrchestration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirements getRequirements() {
		return (Requirements)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Requirements(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirements(Requirements newRequirements, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Requirements(), newRequirements, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirements(Requirements newRequirements) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Requirements(), newRequirements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudy getResearchStudy() {
		return (ResearchStudy)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ResearchStudy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResearchStudy(ResearchStudy newResearchStudy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ResearchStudy(), newResearchStudy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResearchStudy(ResearchStudy newResearchStudy) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ResearchStudy(), newResearchStudy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchSubject getResearchSubject() {
		return (ResearchSubject)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ResearchSubject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResearchSubject(ResearchSubject newResearchSubject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ResearchSubject(), newResearchSubject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResearchSubject(ResearchSubject newResearchSubject) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ResearchSubject(), newResearchSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessment getRiskAssessment() {
		return (RiskAssessment)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_RiskAssessment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRiskAssessment(RiskAssessment newRiskAssessment, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_RiskAssessment(), newRiskAssessment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiskAssessment(RiskAssessment newRiskAssessment) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_RiskAssessment(), newRiskAssessment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule getSchedule() {
		return (Schedule)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Schedule(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedule(Schedule newSchedule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Schedule(), newSchedule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedule(Schedule newSchedule) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Schedule(), newSchedule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParameter getSearchParameter() {
		return (SearchParameter)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_SearchParameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSearchParameter(SearchParameter newSearchParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_SearchParameter(), newSearchParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchParameter(SearchParameter newSearchParameter) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_SearchParameter(), newSearchParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRequest getServiceRequest() {
		return (ServiceRequest)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ServiceRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceRequest(ServiceRequest newServiceRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ServiceRequest(), newServiceRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceRequest(ServiceRequest newServiceRequest) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ServiceRequest(), newServiceRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot getSlot() {
		return (Slot)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Slot(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlot(Slot newSlot, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Slot(), newSlot, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlot(Slot newSlot) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Slot(), newSlot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specimen getSpecimen() {
		return (Specimen)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Specimen(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecimen(Specimen newSpecimen, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Specimen(), newSpecimen, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecimen(Specimen newSpecimen) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Specimen(), newSpecimen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenDefinition getSpecimenDefinition() {
		return (SpecimenDefinition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_SpecimenDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecimenDefinition(SpecimenDefinition newSpecimenDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_SpecimenDefinition(), newSpecimenDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecimenDefinition(SpecimenDefinition newSpecimenDefinition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_SpecimenDefinition(), newSpecimenDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition getStructureDefinition() {
		return (StructureDefinition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_StructureDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructureDefinition(StructureDefinition newStructureDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_StructureDefinition(), newStructureDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureDefinition(StructureDefinition newStructureDefinition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_StructureDefinition(), newStructureDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMap getStructureMap() {
		return (StructureMap)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_StructureMap(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructureMap(StructureMap newStructureMap, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_StructureMap(), newStructureMap, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureMap(StructureMap newStructureMap) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_StructureMap(), newStructureMap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscription getSubscription() {
		return (Subscription)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Subscription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscription(Subscription newSubscription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Subscription(), newSubscription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscription(Subscription newSubscription) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Subscription(), newSubscription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionStatus getSubscriptionStatus() {
		return (SubscriptionStatus)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_SubscriptionStatus(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscriptionStatus(SubscriptionStatus newSubscriptionStatus, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_SubscriptionStatus(), newSubscriptionStatus, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriptionStatus(SubscriptionStatus newSubscriptionStatus) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_SubscriptionStatus(), newSubscriptionStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionTopic getSubscriptionTopic() {
		return (SubscriptionTopic)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_SubscriptionTopic(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscriptionTopic(SubscriptionTopic newSubscriptionTopic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_SubscriptionTopic(), newSubscriptionTopic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriptionTopic(SubscriptionTopic newSubscriptionTopic) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_SubscriptionTopic(), newSubscriptionTopic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substance getSubstance() {
		return (Substance)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Substance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstance(Substance newSubstance, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Substance(), newSubstance, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstance(Substance newSubstance) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Substance(), newSubstance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceDefinition getSubstanceDefinition() {
		return (SubstanceDefinition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_SubstanceDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstanceDefinition(SubstanceDefinition newSubstanceDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_SubstanceDefinition(), newSubstanceDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstanceDefinition(SubstanceDefinition newSubstanceDefinition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_SubstanceDefinition(), newSubstanceDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceNucleicAcid getSubstanceNucleicAcid() {
		return (SubstanceNucleicAcid)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_SubstanceNucleicAcid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstanceNucleicAcid(SubstanceNucleicAcid newSubstanceNucleicAcid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_SubstanceNucleicAcid(), newSubstanceNucleicAcid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstanceNucleicAcid(SubstanceNucleicAcid newSubstanceNucleicAcid) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_SubstanceNucleicAcid(), newSubstanceNucleicAcid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstancePolymer getSubstancePolymer() {
		return (SubstancePolymer)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_SubstancePolymer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstancePolymer(SubstancePolymer newSubstancePolymer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_SubstancePolymer(), newSubstancePolymer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstancePolymer(SubstancePolymer newSubstancePolymer) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_SubstancePolymer(), newSubstancePolymer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceProtein getSubstanceProtein() {
		return (SubstanceProtein)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_SubstanceProtein(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstanceProtein(SubstanceProtein newSubstanceProtein, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_SubstanceProtein(), newSubstanceProtein, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstanceProtein(SubstanceProtein newSubstanceProtein) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_SubstanceProtein(), newSubstanceProtein);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceReferenceInformation getSubstanceReferenceInformation() {
		return (SubstanceReferenceInformation)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_SubstanceReferenceInformation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstanceReferenceInformation(SubstanceReferenceInformation newSubstanceReferenceInformation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_SubstanceReferenceInformation(), newSubstanceReferenceInformation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstanceReferenceInformation(SubstanceReferenceInformation newSubstanceReferenceInformation) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_SubstanceReferenceInformation(), newSubstanceReferenceInformation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceSourceMaterial getSubstanceSourceMaterial() {
		return (SubstanceSourceMaterial)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_SubstanceSourceMaterial(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstanceSourceMaterial(SubstanceSourceMaterial newSubstanceSourceMaterial, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_SubstanceSourceMaterial(), newSubstanceSourceMaterial, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstanceSourceMaterial(SubstanceSourceMaterial newSubstanceSourceMaterial) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_SubstanceSourceMaterial(), newSubstanceSourceMaterial);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDelivery getSupplyDelivery() {
		return (SupplyDelivery)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_SupplyDelivery(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplyDelivery(SupplyDelivery newSupplyDelivery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_SupplyDelivery(), newSupplyDelivery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplyDelivery(SupplyDelivery newSupplyDelivery) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_SupplyDelivery(), newSupplyDelivery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequest getSupplyRequest() {
		return (SupplyRequest)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_SupplyRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplyRequest(SupplyRequest newSupplyRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_SupplyRequest(), newSupplyRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplyRequest(SupplyRequest newSupplyRequest) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_SupplyRequest(), newSupplyRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTask() {
		return (Task)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Task(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(Task newTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Task(), newTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(Task newTask) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Task(), newTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyCapabilities getTerminologyCapabilities() {
		return (TerminologyCapabilities)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_TerminologyCapabilities(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminologyCapabilities(TerminologyCapabilities newTerminologyCapabilities, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_TerminologyCapabilities(), newTerminologyCapabilities, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminologyCapabilities(TerminologyCapabilities newTerminologyCapabilities) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_TerminologyCapabilities(), newTerminologyCapabilities);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestPlan getTestPlan() {
		return (TestPlan)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_TestPlan(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestPlan(TestPlan newTestPlan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_TestPlan(), newTestPlan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestPlan(TestPlan newTestPlan) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_TestPlan(), newTestPlan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReport getTestReport() {
		return (TestReport)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_TestReport(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestReport(TestReport newTestReport, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_TestReport(), newTestReport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestReport(TestReport newTestReport) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_TestReport(), newTestReport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScript getTestScript() {
		return (TestScript)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_TestScript(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestScript(TestScript newTestScript, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_TestScript(), newTestScript, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestScript(TestScript newTestScript) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_TestScript(), newTestScript);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transport getTransport() {
		return (Transport)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Transport(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransport(Transport newTransport, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Transport(), newTransport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransport(Transport newTransport) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Transport(), newTransport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSet getValueSet() {
		return (ValueSet)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ValueSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSet(ValueSet newValueSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ValueSet(), newValueSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSet(ValueSet newValueSet) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ValueSet(), newValueSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationResult getVerificationResult() {
		return (VerificationResult)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_VerificationResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerificationResult(VerificationResult newVerificationResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_VerificationResult(), newVerificationResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerificationResult(VerificationResult newVerificationResult) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_VerificationResult(), newVerificationResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionPrescription getVisionPrescription() {
		return (VisionPrescription)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_VisionPrescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisionPrescription(VisionPrescription newVisionPrescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_VisionPrescription(), newVisionPrescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisionPrescription(VisionPrescription newVisionPrescription) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_VisionPrescription(), newVisionPrescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_ROOT__ACCOUNT:
				return basicSetAccount(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__ACTIVITY_DEFINITION:
				return basicSetActivityDefinition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__ACTOR_DEFINITION:
				return basicSetActorDefinition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__ADMINISTRABLE_PRODUCT_DEFINITION:
				return basicSetAdministrableProductDefinition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__ADVERSE_EVENT:
				return basicSetAdverseEvent(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__ALLERGY_INTOLERANCE:
				return basicSetAllergyIntolerance(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__APPOINTMENT:
				return basicSetAppointment(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__APPOINTMENT_RESPONSE:
				return basicSetAppointmentResponse(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__ARTIFACT_ASSESSMENT:
				return basicSetArtifactAssessment(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__AUDIT_EVENT:
				return basicSetAuditEvent(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__BASIC:
				return basicSetBasic(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__BINARY:
				return basicSetBinary(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__BIOLOGICALLY_DERIVED_PRODUCT:
				return basicSetBiologicallyDerivedProduct(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE:
				return basicSetBiologicallyDerivedProductDispense(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__BODY_STRUCTURE:
				return basicSetBodyStructure(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__BUNDLE:
				return basicSetBundle(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CAPABILITY_STATEMENT:
				return basicSetCapabilityStatement(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CARE_PLAN:
				return basicSetCarePlan(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CARE_TEAM:
				return basicSetCareTeam(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CHARGE_ITEM:
				return basicSetChargeItem(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CHARGE_ITEM_DEFINITION:
				return basicSetChargeItemDefinition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CITATION:
				return basicSetCitation(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CLAIM:
				return basicSetClaim(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CLAIM_RESPONSE:
				return basicSetClaimResponse(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CLINICAL_IMPRESSION:
				return basicSetClinicalImpression(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CLINICAL_USE_DEFINITION:
				return basicSetClinicalUseDefinition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CODE_SYSTEM:
				return basicSetCodeSystem(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__COMMUNICATION:
				return basicSetCommunication(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__COMMUNICATION_REQUEST:
				return basicSetCommunicationRequest(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__COMPARTMENT_DEFINITION:
				return basicSetCompartmentDefinition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__COMPOSITION:
				return basicSetComposition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CONCEPT_MAP:
				return basicSetConceptMap(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CONDITION:
				return basicSetCondition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CONDITION_DEFINITION:
				return basicSetConditionDefinition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CONSENT:
				return basicSetConsent(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CONTRACT:
				return basicSetContract(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__COVERAGE:
				return basicSetCoverage(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__COVERAGE_ELIGIBILITY_REQUEST:
				return basicSetCoverageEligibilityRequest(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__COVERAGE_ELIGIBILITY_RESPONSE:
				return basicSetCoverageEligibilityResponse(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__DETECTED_ISSUE:
				return basicSetDetectedIssue(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__DEVICE:
				return basicSetDevice(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__DEVICE_ASSOCIATION:
				return basicSetDeviceAssociation(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__DEVICE_DEFINITION:
				return basicSetDeviceDefinition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__DEVICE_DISPENSE:
				return basicSetDeviceDispense(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__DEVICE_METRIC:
				return basicSetDeviceMetric(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__DEVICE_REQUEST:
				return basicSetDeviceRequest(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__DEVICE_USAGE:
				return basicSetDeviceUsage(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__DIAGNOSTIC_REPORT:
				return basicSetDiagnosticReport(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__DOCUMENT_REFERENCE:
				return basicSetDocumentReference(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__ENCOUNTER_HISTORY:
				return basicSetEncounterHistory(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__ENDPOINT:
				return basicSetEndpoint(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__ENROLLMENT_REQUEST:
				return basicSetEnrollmentRequest(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__ENROLLMENT_RESPONSE:
				return basicSetEnrollmentResponse(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__EPISODE_OF_CARE:
				return basicSetEpisodeOfCare(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__EVENT_DEFINITION:
				return basicSetEventDefinition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__EVIDENCE:
				return basicSetEvidence(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__EVIDENCE_REPORT:
				return basicSetEvidenceReport(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__EVIDENCE_VARIABLE:
				return basicSetEvidenceVariable(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__EXAMPLE_SCENARIO:
				return basicSetExampleScenario(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__EXPLANATION_OF_BENEFIT:
				return basicSetExplanationOfBenefit(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__FAMILY_MEMBER_HISTORY:
				return basicSetFamilyMemberHistory(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__FLAG:
				return basicSetFlag(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__FORMULARY_ITEM:
				return basicSetFormularyItem(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__GENOMIC_STUDY:
				return basicSetGenomicStudy(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__GOAL:
				return basicSetGoal(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__GRAPH_DEFINITION:
				return basicSetGraphDefinition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__GROUP:
				return basicSetGroup(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__GUIDANCE_RESPONSE:
				return basicSetGuidanceResponse(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__HEALTHCARE_SERVICE:
				return basicSetHealthcareService(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__IMAGING_SELECTION:
				return basicSetImagingSelection(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__IMAGING_STUDY:
				return basicSetImagingStudy(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION:
				return basicSetImmunization(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION_EVALUATION:
				return basicSetImmunizationEvaluation(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION_RECOMMENDATION:
				return basicSetImmunizationRecommendation(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__IMPLEMENTATION_GUIDE:
				return basicSetImplementationGuide(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__INGREDIENT:
				return basicSetIngredient(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__INSURANCE_PLAN:
				return basicSetInsurancePlan(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__INVENTORY_ITEM:
				return basicSetInventoryItem(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__INVENTORY_REPORT:
				return basicSetInventoryReport(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__INVOICE:
				return basicSetInvoice(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__LIBRARY:
				return basicSetLibrary(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__LINKAGE:
				return basicSetLinkage(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__LIST:
				return basicSetList(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__MANUFACTURED_ITEM_DEFINITION:
				return basicSetManufacturedItemDefinition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__MEASURE:
				return basicSetMeasure(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__MEASURE_REPORT:
				return basicSetMeasureReport(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__MEDICATION:
				return basicSetMedication(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_ADMINISTRATION:
				return basicSetMedicationAdministration(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_DISPENSE:
				return basicSetMedicationDispense(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_KNOWLEDGE:
				return basicSetMedicationKnowledge(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_REQUEST:
				return basicSetMedicationRequest(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_STATEMENT:
				return basicSetMedicationStatement(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__MEDICINAL_PRODUCT_DEFINITION:
				return basicSetMedicinalProductDefinition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__MESSAGE_DEFINITION:
				return basicSetMessageDefinition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__MESSAGE_HEADER:
				return basicSetMessageHeader(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__MOLECULAR_SEQUENCE:
				return basicSetMolecularSequence(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__NAMING_SYSTEM:
				return basicSetNamingSystem(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__NUTRITION_INTAKE:
				return basicSetNutritionIntake(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__NUTRITION_ORDER:
				return basicSetNutritionOrder(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__NUTRITION_PRODUCT:
				return basicSetNutritionProduct(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__OBSERVATION:
				return basicSetObservation(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__OBSERVATION_DEFINITION:
				return basicSetObservationDefinition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__OPERATION_DEFINITION:
				return basicSetOperationDefinition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__OPERATION_OUTCOME:
				return basicSetOperationOutcome(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__ORGANIZATION_AFFILIATION:
				return basicSetOrganizationAffiliation(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__PACKAGED_PRODUCT_DEFINITION:
				return basicSetPackagedProductDefinition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__PARAMETERS:
				return basicSetParameters(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__PAYMENT_NOTICE:
				return basicSetPaymentNotice(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__PAYMENT_RECONCILIATION:
				return basicSetPaymentReconciliation(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__PERMISSION:
				return basicSetPermission(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__PERSON:
				return basicSetPerson(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__PLAN_DEFINITION:
				return basicSetPlanDefinition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__PRACTITIONER:
				return basicSetPractitioner(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__PRACTITIONER_ROLE:
				return basicSetPractitionerRole(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__PROCEDURE:
				return basicSetProcedure(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__PROVENANCE:
				return basicSetProvenance(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__QUESTIONNAIRE:
				return basicSetQuestionnaire(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__QUESTIONNAIRE_RESPONSE:
				return basicSetQuestionnaireResponse(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__REGULATED_AUTHORIZATION:
				return basicSetRegulatedAuthorization(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__RELATED_PERSON:
				return basicSetRelatedPerson(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__REQUEST_ORCHESTRATION:
				return basicSetRequestOrchestration(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__REQUIREMENTS:
				return basicSetRequirements(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__RESEARCH_STUDY:
				return basicSetResearchStudy(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__RESEARCH_SUBJECT:
				return basicSetResearchSubject(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__RISK_ASSESSMENT:
				return basicSetRiskAssessment(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SCHEDULE:
				return basicSetSchedule(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SEARCH_PARAMETER:
				return basicSetSearchParameter(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SERVICE_REQUEST:
				return basicSetServiceRequest(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SLOT:
				return basicSetSlot(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SPECIMEN:
				return basicSetSpecimen(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SPECIMEN_DEFINITION:
				return basicSetSpecimenDefinition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__STRUCTURE_DEFINITION:
				return basicSetStructureDefinition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__STRUCTURE_MAP:
				return basicSetStructureMap(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SUBSCRIPTION:
				return basicSetSubscription(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SUBSCRIPTION_STATUS:
				return basicSetSubscriptionStatus(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SUBSCRIPTION_TOPIC:
				return basicSetSubscriptionTopic(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE:
				return basicSetSubstance(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_DEFINITION:
				return basicSetSubstanceDefinition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_NUCLEIC_ACID:
				return basicSetSubstanceNucleicAcid(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_POLYMER:
				return basicSetSubstancePolymer(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_PROTEIN:
				return basicSetSubstanceProtein(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_REFERENCE_INFORMATION:
				return basicSetSubstanceReferenceInformation(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_SOURCE_MATERIAL:
				return basicSetSubstanceSourceMaterial(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SUPPLY_DELIVERY:
				return basicSetSupplyDelivery(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SUPPLY_REQUEST:
				return basicSetSupplyRequest(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__TASK:
				return basicSetTask(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__TERMINOLOGY_CAPABILITIES:
				return basicSetTerminologyCapabilities(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__TEST_PLAN:
				return basicSetTestPlan(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__TEST_REPORT:
				return basicSetTestReport(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__TEST_SCRIPT:
				return basicSetTestScript(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__TRANSPORT:
				return basicSetTransport(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__VALUE_SET:
				return basicSetValueSet(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__VERIFICATION_RESULT:
				return basicSetVerificationResult(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__VISION_PRESCRIPTION:
				return basicSetVisionPrescription(null, msgs);
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
			case FhirPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case FhirPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case FhirPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case FhirPackage.DOCUMENT_ROOT__ACCOUNT:
				return getAccount();
			case FhirPackage.DOCUMENT_ROOT__ACTIVITY_DEFINITION:
				return getActivityDefinition();
			case FhirPackage.DOCUMENT_ROOT__ACTOR_DEFINITION:
				return getActorDefinition();
			case FhirPackage.DOCUMENT_ROOT__ADMINISTRABLE_PRODUCT_DEFINITION:
				return getAdministrableProductDefinition();
			case FhirPackage.DOCUMENT_ROOT__ADVERSE_EVENT:
				return getAdverseEvent();
			case FhirPackage.DOCUMENT_ROOT__ALLERGY_INTOLERANCE:
				return getAllergyIntolerance();
			case FhirPackage.DOCUMENT_ROOT__APPOINTMENT:
				return getAppointment();
			case FhirPackage.DOCUMENT_ROOT__APPOINTMENT_RESPONSE:
				return getAppointmentResponse();
			case FhirPackage.DOCUMENT_ROOT__ARTIFACT_ASSESSMENT:
				return getArtifactAssessment();
			case FhirPackage.DOCUMENT_ROOT__AUDIT_EVENT:
				return getAuditEvent();
			case FhirPackage.DOCUMENT_ROOT__BASIC:
				return getBasic();
			case FhirPackage.DOCUMENT_ROOT__BINARY:
				return getBinary();
			case FhirPackage.DOCUMENT_ROOT__BIOLOGICALLY_DERIVED_PRODUCT:
				return getBiologicallyDerivedProduct();
			case FhirPackage.DOCUMENT_ROOT__BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE:
				return getBiologicallyDerivedProductDispense();
			case FhirPackage.DOCUMENT_ROOT__BODY_STRUCTURE:
				return getBodyStructure();
			case FhirPackage.DOCUMENT_ROOT__BUNDLE:
				return getBundle();
			case FhirPackage.DOCUMENT_ROOT__CAPABILITY_STATEMENT:
				return getCapabilityStatement();
			case FhirPackage.DOCUMENT_ROOT__CARE_PLAN:
				return getCarePlan();
			case FhirPackage.DOCUMENT_ROOT__CARE_TEAM:
				return getCareTeam();
			case FhirPackage.DOCUMENT_ROOT__CHARGE_ITEM:
				return getChargeItem();
			case FhirPackage.DOCUMENT_ROOT__CHARGE_ITEM_DEFINITION:
				return getChargeItemDefinition();
			case FhirPackage.DOCUMENT_ROOT__CITATION:
				return getCitation();
			case FhirPackage.DOCUMENT_ROOT__CLAIM:
				return getClaim();
			case FhirPackage.DOCUMENT_ROOT__CLAIM_RESPONSE:
				return getClaimResponse();
			case FhirPackage.DOCUMENT_ROOT__CLINICAL_IMPRESSION:
				return getClinicalImpression();
			case FhirPackage.DOCUMENT_ROOT__CLINICAL_USE_DEFINITION:
				return getClinicalUseDefinition();
			case FhirPackage.DOCUMENT_ROOT__CODE_SYSTEM:
				return getCodeSystem();
			case FhirPackage.DOCUMENT_ROOT__COMMUNICATION:
				return getCommunication();
			case FhirPackage.DOCUMENT_ROOT__COMMUNICATION_REQUEST:
				return getCommunicationRequest();
			case FhirPackage.DOCUMENT_ROOT__COMPARTMENT_DEFINITION:
				return getCompartmentDefinition();
			case FhirPackage.DOCUMENT_ROOT__COMPOSITION:
				return getComposition();
			case FhirPackage.DOCUMENT_ROOT__CONCEPT_MAP:
				return getConceptMap();
			case FhirPackage.DOCUMENT_ROOT__CONDITION:
				return getCondition();
			case FhirPackage.DOCUMENT_ROOT__CONDITION_DEFINITION:
				return getConditionDefinition();
			case FhirPackage.DOCUMENT_ROOT__CONSENT:
				return getConsent();
			case FhirPackage.DOCUMENT_ROOT__CONTRACT:
				return getContract();
			case FhirPackage.DOCUMENT_ROOT__COVERAGE:
				return getCoverage();
			case FhirPackage.DOCUMENT_ROOT__COVERAGE_ELIGIBILITY_REQUEST:
				return getCoverageEligibilityRequest();
			case FhirPackage.DOCUMENT_ROOT__COVERAGE_ELIGIBILITY_RESPONSE:
				return getCoverageEligibilityResponse();
			case FhirPackage.DOCUMENT_ROOT__DETECTED_ISSUE:
				return getDetectedIssue();
			case FhirPackage.DOCUMENT_ROOT__DEVICE:
				return getDevice();
			case FhirPackage.DOCUMENT_ROOT__DEVICE_ASSOCIATION:
				return getDeviceAssociation();
			case FhirPackage.DOCUMENT_ROOT__DEVICE_DEFINITION:
				return getDeviceDefinition();
			case FhirPackage.DOCUMENT_ROOT__DEVICE_DISPENSE:
				return getDeviceDispense();
			case FhirPackage.DOCUMENT_ROOT__DEVICE_METRIC:
				return getDeviceMetric();
			case FhirPackage.DOCUMENT_ROOT__DEVICE_REQUEST:
				return getDeviceRequest();
			case FhirPackage.DOCUMENT_ROOT__DEVICE_USAGE:
				return getDeviceUsage();
			case FhirPackage.DOCUMENT_ROOT__DIAGNOSTIC_REPORT:
				return getDiagnosticReport();
			case FhirPackage.DOCUMENT_ROOT__DOCUMENT_REFERENCE:
				return getDocumentReference();
			case FhirPackage.DOCUMENT_ROOT__ENCOUNTER:
				return getEncounter();
			case FhirPackage.DOCUMENT_ROOT__ENCOUNTER_HISTORY:
				return getEncounterHistory();
			case FhirPackage.DOCUMENT_ROOT__ENDPOINT:
				return getEndpoint();
			case FhirPackage.DOCUMENT_ROOT__ENROLLMENT_REQUEST:
				return getEnrollmentRequest();
			case FhirPackage.DOCUMENT_ROOT__ENROLLMENT_RESPONSE:
				return getEnrollmentResponse();
			case FhirPackage.DOCUMENT_ROOT__EPISODE_OF_CARE:
				return getEpisodeOfCare();
			case FhirPackage.DOCUMENT_ROOT__EVENT_DEFINITION:
				return getEventDefinition();
			case FhirPackage.DOCUMENT_ROOT__EVIDENCE:
				return getEvidence();
			case FhirPackage.DOCUMENT_ROOT__EVIDENCE_REPORT:
				return getEvidenceReport();
			case FhirPackage.DOCUMENT_ROOT__EVIDENCE_VARIABLE:
				return getEvidenceVariable();
			case FhirPackage.DOCUMENT_ROOT__EXAMPLE_SCENARIO:
				return getExampleScenario();
			case FhirPackage.DOCUMENT_ROOT__EXPLANATION_OF_BENEFIT:
				return getExplanationOfBenefit();
			case FhirPackage.DOCUMENT_ROOT__FAMILY_MEMBER_HISTORY:
				return getFamilyMemberHistory();
			case FhirPackage.DOCUMENT_ROOT__FLAG:
				return getFlag();
			case FhirPackage.DOCUMENT_ROOT__FORMULARY_ITEM:
				return getFormularyItem();
			case FhirPackage.DOCUMENT_ROOT__GENOMIC_STUDY:
				return getGenomicStudy();
			case FhirPackage.DOCUMENT_ROOT__GOAL:
				return getGoal();
			case FhirPackage.DOCUMENT_ROOT__GRAPH_DEFINITION:
				return getGraphDefinition();
			case FhirPackage.DOCUMENT_ROOT__GROUP:
				return getGroup();
			case FhirPackage.DOCUMENT_ROOT__GUIDANCE_RESPONSE:
				return getGuidanceResponse();
			case FhirPackage.DOCUMENT_ROOT__HEALTHCARE_SERVICE:
				return getHealthcareService();
			case FhirPackage.DOCUMENT_ROOT__IMAGING_SELECTION:
				return getImagingSelection();
			case FhirPackage.DOCUMENT_ROOT__IMAGING_STUDY:
				return getImagingStudy();
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION:
				return getImmunization();
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION_EVALUATION:
				return getImmunizationEvaluation();
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION_RECOMMENDATION:
				return getImmunizationRecommendation();
			case FhirPackage.DOCUMENT_ROOT__IMPLEMENTATION_GUIDE:
				return getImplementationGuide();
			case FhirPackage.DOCUMENT_ROOT__INGREDIENT:
				return getIngredient();
			case FhirPackage.DOCUMENT_ROOT__INSURANCE_PLAN:
				return getInsurancePlan();
			case FhirPackage.DOCUMENT_ROOT__INVENTORY_ITEM:
				return getInventoryItem();
			case FhirPackage.DOCUMENT_ROOT__INVENTORY_REPORT:
				return getInventoryReport();
			case FhirPackage.DOCUMENT_ROOT__INVOICE:
				return getInvoice();
			case FhirPackage.DOCUMENT_ROOT__LIBRARY:
				return getLibrary();
			case FhirPackage.DOCUMENT_ROOT__LINKAGE:
				return getLinkage();
			case FhirPackage.DOCUMENT_ROOT__LIST:
				return getList();
			case FhirPackage.DOCUMENT_ROOT__LOCATION:
				return getLocation();
			case FhirPackage.DOCUMENT_ROOT__MANUFACTURED_ITEM_DEFINITION:
				return getManufacturedItemDefinition();
			case FhirPackage.DOCUMENT_ROOT__MEASURE:
				return getMeasure();
			case FhirPackage.DOCUMENT_ROOT__MEASURE_REPORT:
				return getMeasureReport();
			case FhirPackage.DOCUMENT_ROOT__MEDICATION:
				return getMedication();
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_ADMINISTRATION:
				return getMedicationAdministration();
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_DISPENSE:
				return getMedicationDispense();
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_KNOWLEDGE:
				return getMedicationKnowledge();
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_REQUEST:
				return getMedicationRequest();
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_STATEMENT:
				return getMedicationStatement();
			case FhirPackage.DOCUMENT_ROOT__MEDICINAL_PRODUCT_DEFINITION:
				return getMedicinalProductDefinition();
			case FhirPackage.DOCUMENT_ROOT__MESSAGE_DEFINITION:
				return getMessageDefinition();
			case FhirPackage.DOCUMENT_ROOT__MESSAGE_HEADER:
				return getMessageHeader();
			case FhirPackage.DOCUMENT_ROOT__MOLECULAR_SEQUENCE:
				return getMolecularSequence();
			case FhirPackage.DOCUMENT_ROOT__NAMING_SYSTEM:
				return getNamingSystem();
			case FhirPackage.DOCUMENT_ROOT__NUTRITION_INTAKE:
				return getNutritionIntake();
			case FhirPackage.DOCUMENT_ROOT__NUTRITION_ORDER:
				return getNutritionOrder();
			case FhirPackage.DOCUMENT_ROOT__NUTRITION_PRODUCT:
				return getNutritionProduct();
			case FhirPackage.DOCUMENT_ROOT__OBSERVATION:
				return getObservation();
			case FhirPackage.DOCUMENT_ROOT__OBSERVATION_DEFINITION:
				return getObservationDefinition();
			case FhirPackage.DOCUMENT_ROOT__OPERATION_DEFINITION:
				return getOperationDefinition();
			case FhirPackage.DOCUMENT_ROOT__OPERATION_OUTCOME:
				return getOperationOutcome();
			case FhirPackage.DOCUMENT_ROOT__ORGANIZATION:
				return getOrganization();
			case FhirPackage.DOCUMENT_ROOT__ORGANIZATION_AFFILIATION:
				return getOrganizationAffiliation();
			case FhirPackage.DOCUMENT_ROOT__PACKAGED_PRODUCT_DEFINITION:
				return getPackagedProductDefinition();
			case FhirPackage.DOCUMENT_ROOT__PARAMETERS:
				return getParameters();
			case FhirPackage.DOCUMENT_ROOT__PATIENT:
				return getPatient();
			case FhirPackage.DOCUMENT_ROOT__PAYMENT_NOTICE:
				return getPaymentNotice();
			case FhirPackage.DOCUMENT_ROOT__PAYMENT_RECONCILIATION:
				return getPaymentReconciliation();
			case FhirPackage.DOCUMENT_ROOT__PERMISSION:
				return getPermission();
			case FhirPackage.DOCUMENT_ROOT__PERSON:
				return getPerson();
			case FhirPackage.DOCUMENT_ROOT__PLAN_DEFINITION:
				return getPlanDefinition();
			case FhirPackage.DOCUMENT_ROOT__PRACTITIONER:
				return getPractitioner();
			case FhirPackage.DOCUMENT_ROOT__PRACTITIONER_ROLE:
				return getPractitionerRole();
			case FhirPackage.DOCUMENT_ROOT__PROCEDURE:
				return getProcedure();
			case FhirPackage.DOCUMENT_ROOT__PROVENANCE:
				return getProvenance();
			case FhirPackage.DOCUMENT_ROOT__QUESTIONNAIRE:
				return getQuestionnaire();
			case FhirPackage.DOCUMENT_ROOT__QUESTIONNAIRE_RESPONSE:
				return getQuestionnaireResponse();
			case FhirPackage.DOCUMENT_ROOT__REGULATED_AUTHORIZATION:
				return getRegulatedAuthorization();
			case FhirPackage.DOCUMENT_ROOT__RELATED_PERSON:
				return getRelatedPerson();
			case FhirPackage.DOCUMENT_ROOT__REQUEST_ORCHESTRATION:
				return getRequestOrchestration();
			case FhirPackage.DOCUMENT_ROOT__REQUIREMENTS:
				return getRequirements();
			case FhirPackage.DOCUMENT_ROOT__RESEARCH_STUDY:
				return getResearchStudy();
			case FhirPackage.DOCUMENT_ROOT__RESEARCH_SUBJECT:
				return getResearchSubject();
			case FhirPackage.DOCUMENT_ROOT__RISK_ASSESSMENT:
				return getRiskAssessment();
			case FhirPackage.DOCUMENT_ROOT__SCHEDULE:
				return getSchedule();
			case FhirPackage.DOCUMENT_ROOT__SEARCH_PARAMETER:
				return getSearchParameter();
			case FhirPackage.DOCUMENT_ROOT__SERVICE_REQUEST:
				return getServiceRequest();
			case FhirPackage.DOCUMENT_ROOT__SLOT:
				return getSlot();
			case FhirPackage.DOCUMENT_ROOT__SPECIMEN:
				return getSpecimen();
			case FhirPackage.DOCUMENT_ROOT__SPECIMEN_DEFINITION:
				return getSpecimenDefinition();
			case FhirPackage.DOCUMENT_ROOT__STRUCTURE_DEFINITION:
				return getStructureDefinition();
			case FhirPackage.DOCUMENT_ROOT__STRUCTURE_MAP:
				return getStructureMap();
			case FhirPackage.DOCUMENT_ROOT__SUBSCRIPTION:
				return getSubscription();
			case FhirPackage.DOCUMENT_ROOT__SUBSCRIPTION_STATUS:
				return getSubscriptionStatus();
			case FhirPackage.DOCUMENT_ROOT__SUBSCRIPTION_TOPIC:
				return getSubscriptionTopic();
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE:
				return getSubstance();
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_DEFINITION:
				return getSubstanceDefinition();
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_NUCLEIC_ACID:
				return getSubstanceNucleicAcid();
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_POLYMER:
				return getSubstancePolymer();
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_PROTEIN:
				return getSubstanceProtein();
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_REFERENCE_INFORMATION:
				return getSubstanceReferenceInformation();
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_SOURCE_MATERIAL:
				return getSubstanceSourceMaterial();
			case FhirPackage.DOCUMENT_ROOT__SUPPLY_DELIVERY:
				return getSupplyDelivery();
			case FhirPackage.DOCUMENT_ROOT__SUPPLY_REQUEST:
				return getSupplyRequest();
			case FhirPackage.DOCUMENT_ROOT__TASK:
				return getTask();
			case FhirPackage.DOCUMENT_ROOT__TERMINOLOGY_CAPABILITIES:
				return getTerminologyCapabilities();
			case FhirPackage.DOCUMENT_ROOT__TEST_PLAN:
				return getTestPlan();
			case FhirPackage.DOCUMENT_ROOT__TEST_REPORT:
				return getTestReport();
			case FhirPackage.DOCUMENT_ROOT__TEST_SCRIPT:
				return getTestScript();
			case FhirPackage.DOCUMENT_ROOT__TRANSPORT:
				return getTransport();
			case FhirPackage.DOCUMENT_ROOT__VALUE_SET:
				return getValueSet();
			case FhirPackage.DOCUMENT_ROOT__VERIFICATION_RESULT:
				return getVerificationResult();
			case FhirPackage.DOCUMENT_ROOT__VISION_PRESCRIPTION:
				return getVisionPrescription();
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
			case FhirPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__ACCOUNT:
				setAccount((Account)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__ACTIVITY_DEFINITION:
				setActivityDefinition((ActivityDefinition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__ACTOR_DEFINITION:
				setActorDefinition((ActorDefinition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__ADMINISTRABLE_PRODUCT_DEFINITION:
				setAdministrableProductDefinition((AdministrableProductDefinition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__ADVERSE_EVENT:
				setAdverseEvent((AdverseEvent)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__ALLERGY_INTOLERANCE:
				setAllergyIntolerance((AllergyIntolerance)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__APPOINTMENT:
				setAppointment((Appointment)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__APPOINTMENT_RESPONSE:
				setAppointmentResponse((AppointmentResponse)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__ARTIFACT_ASSESSMENT:
				setArtifactAssessment((ArtifactAssessment)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__AUDIT_EVENT:
				setAuditEvent((AuditEvent)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__BASIC:
				setBasic((Basic)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__BINARY:
				setBinary((Binary)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__BIOLOGICALLY_DERIVED_PRODUCT:
				setBiologicallyDerivedProduct((BiologicallyDerivedProduct)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE:
				setBiologicallyDerivedProductDispense((BiologicallyDerivedProductDispense)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__BODY_STRUCTURE:
				setBodyStructure((BodyStructure)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__BUNDLE:
				setBundle((Bundle)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CAPABILITY_STATEMENT:
				setCapabilityStatement((CapabilityStatement)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CARE_PLAN:
				setCarePlan((CarePlan)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CARE_TEAM:
				setCareTeam((CareTeam)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CHARGE_ITEM:
				setChargeItem((ChargeItem)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CHARGE_ITEM_DEFINITION:
				setChargeItemDefinition((ChargeItemDefinition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CITATION:
				setCitation((Citation)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CLAIM:
				setClaim((Claim)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CLAIM_RESPONSE:
				setClaimResponse((ClaimResponse)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CLINICAL_IMPRESSION:
				setClinicalImpression((ClinicalImpression)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CLINICAL_USE_DEFINITION:
				setClinicalUseDefinition((ClinicalUseDefinition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CODE_SYSTEM:
				setCodeSystem((CodeSystem)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__COMMUNICATION:
				setCommunication((Communication)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__COMMUNICATION_REQUEST:
				setCommunicationRequest((CommunicationRequest)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__COMPARTMENT_DEFINITION:
				setCompartmentDefinition((CompartmentDefinition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__COMPOSITION:
				setComposition((Composition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CONCEPT_MAP:
				setConceptMap((ConceptMap)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CONDITION:
				setCondition((Condition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CONDITION_DEFINITION:
				setConditionDefinition((ConditionDefinition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CONSENT:
				setConsent((Consent)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CONTRACT:
				setContract((Contract)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__COVERAGE:
				setCoverage((Coverage)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__COVERAGE_ELIGIBILITY_REQUEST:
				setCoverageEligibilityRequest((CoverageEligibilityRequest)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__COVERAGE_ELIGIBILITY_RESPONSE:
				setCoverageEligibilityResponse((CoverageEligibilityResponse)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__DETECTED_ISSUE:
				setDetectedIssue((DetectedIssue)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__DEVICE:
				setDevice((Device)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_ASSOCIATION:
				setDeviceAssociation((DeviceAssociation)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_DEFINITION:
				setDeviceDefinition((DeviceDefinition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_DISPENSE:
				setDeviceDispense((DeviceDispense)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_METRIC:
				setDeviceMetric((DeviceMetric)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_REQUEST:
				setDeviceRequest((DeviceRequest)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_USAGE:
				setDeviceUsage((DeviceUsage)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__DIAGNOSTIC_REPORT:
				setDiagnosticReport((DiagnosticReport)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__DOCUMENT_REFERENCE:
				setDocumentReference((DocumentReference)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__ENCOUNTER:
				setEncounter((Encounter)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__ENCOUNTER_HISTORY:
				setEncounterHistory((EncounterHistory)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__ENDPOINT:
				setEndpoint((Endpoint)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__ENROLLMENT_REQUEST:
				setEnrollmentRequest((EnrollmentRequest)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__ENROLLMENT_RESPONSE:
				setEnrollmentResponse((EnrollmentResponse)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__EPISODE_OF_CARE:
				setEpisodeOfCare((EpisodeOfCare)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__EVENT_DEFINITION:
				setEventDefinition((EventDefinition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__EVIDENCE:
				setEvidence((Evidence)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__EVIDENCE_REPORT:
				setEvidenceReport((EvidenceReport)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__EVIDENCE_VARIABLE:
				setEvidenceVariable((EvidenceVariable)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__EXAMPLE_SCENARIO:
				setExampleScenario((ExampleScenario)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__EXPLANATION_OF_BENEFIT:
				setExplanationOfBenefit((ExplanationOfBenefit)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__FAMILY_MEMBER_HISTORY:
				setFamilyMemberHistory((FamilyMemberHistory)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__FLAG:
				setFlag((Flag)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__FORMULARY_ITEM:
				setFormularyItem((FormularyItem)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__GENOMIC_STUDY:
				setGenomicStudy((GenomicStudy)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__GOAL:
				setGoal((Goal)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__GRAPH_DEFINITION:
				setGraphDefinition((GraphDefinition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__GROUP:
				setGroup((Group)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__GUIDANCE_RESPONSE:
				setGuidanceResponse((GuidanceResponse)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__HEALTHCARE_SERVICE:
				setHealthcareService((HealthcareService)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__IMAGING_SELECTION:
				setImagingSelection((ImagingSelection)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__IMAGING_STUDY:
				setImagingStudy((ImagingStudy)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION:
				setImmunization((Immunization)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION_EVALUATION:
				setImmunizationEvaluation((ImmunizationEvaluation)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION_RECOMMENDATION:
				setImmunizationRecommendation((ImmunizationRecommendation)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__IMPLEMENTATION_GUIDE:
				setImplementationGuide((ImplementationGuide)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__INGREDIENT:
				setIngredient((Ingredient)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__INSURANCE_PLAN:
				setInsurancePlan((InsurancePlan)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__INVENTORY_ITEM:
				setInventoryItem((InventoryItem)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__INVENTORY_REPORT:
				setInventoryReport((InventoryReport)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__INVOICE:
				setInvoice((Invoice)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__LIBRARY:
				setLibrary((Library)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__LINKAGE:
				setLinkage((Linkage)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__LIST:
				setList((List)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__LOCATION:
				setLocation((Location)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__MANUFACTURED_ITEM_DEFINITION:
				setManufacturedItemDefinition((ManufacturedItemDefinition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEASURE:
				setMeasure((Measure)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEASURE_REPORT:
				setMeasureReport((MeasureReport)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION:
				setMedication((Medication)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_ADMINISTRATION:
				setMedicationAdministration((MedicationAdministration)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_DISPENSE:
				setMedicationDispense((MedicationDispense)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_KNOWLEDGE:
				setMedicationKnowledge((MedicationKnowledge)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_REQUEST:
				setMedicationRequest((MedicationRequest)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_STATEMENT:
				setMedicationStatement((MedicationStatement)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDICINAL_PRODUCT_DEFINITION:
				setMedicinalProductDefinition((MedicinalProductDefinition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__MESSAGE_DEFINITION:
				setMessageDefinition((MessageDefinition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__MESSAGE_HEADER:
				setMessageHeader((MessageHeader)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__MOLECULAR_SEQUENCE:
				setMolecularSequence((MolecularSequence)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__NAMING_SYSTEM:
				setNamingSystem((NamingSystem)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__NUTRITION_INTAKE:
				setNutritionIntake((NutritionIntake)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__NUTRITION_ORDER:
				setNutritionOrder((NutritionOrder)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__NUTRITION_PRODUCT:
				setNutritionProduct((NutritionProduct)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__OBSERVATION:
				setObservation((Observation)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__OBSERVATION_DEFINITION:
				setObservationDefinition((ObservationDefinition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__OPERATION_DEFINITION:
				setOperationDefinition((OperationDefinition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__OPERATION_OUTCOME:
				setOperationOutcome((OperationOutcome)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__ORGANIZATION_AFFILIATION:
				setOrganizationAffiliation((OrganizationAffiliation)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__PACKAGED_PRODUCT_DEFINITION:
				setPackagedProductDefinition((PackagedProductDefinition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__PARAMETERS:
				setParameters((Parameters)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__PATIENT:
				setPatient((Patient)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__PAYMENT_NOTICE:
				setPaymentNotice((PaymentNotice)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__PAYMENT_RECONCILIATION:
				setPaymentReconciliation((PaymentReconciliation)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__PERMISSION:
				setPermission((Permission)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__PERSON:
				setPerson((Person)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__PLAN_DEFINITION:
				setPlanDefinition((PlanDefinition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__PRACTITIONER:
				setPractitioner((Practitioner)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__PRACTITIONER_ROLE:
				setPractitionerRole((PractitionerRole)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__PROCEDURE:
				setProcedure((Procedure)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__PROVENANCE:
				setProvenance((Provenance)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__QUESTIONNAIRE:
				setQuestionnaire((Questionnaire)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__QUESTIONNAIRE_RESPONSE:
				setQuestionnaireResponse((QuestionnaireResponse)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__REGULATED_AUTHORIZATION:
				setRegulatedAuthorization((RegulatedAuthorization)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__RELATED_PERSON:
				setRelatedPerson((RelatedPerson)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__REQUEST_ORCHESTRATION:
				setRequestOrchestration((RequestOrchestration)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__REQUIREMENTS:
				setRequirements((Requirements)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__RESEARCH_STUDY:
				setResearchStudy((ResearchStudy)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__RESEARCH_SUBJECT:
				setResearchSubject((ResearchSubject)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__RISK_ASSESSMENT:
				setRiskAssessment((RiskAssessment)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SCHEDULE:
				setSchedule((Schedule)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SEARCH_PARAMETER:
				setSearchParameter((SearchParameter)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SERVICE_REQUEST:
				setServiceRequest((ServiceRequest)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SLOT:
				setSlot((Slot)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SPECIMEN:
				setSpecimen((Specimen)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SPECIMEN_DEFINITION:
				setSpecimenDefinition((SpecimenDefinition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__STRUCTURE_DEFINITION:
				setStructureDefinition((StructureDefinition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__STRUCTURE_MAP:
				setStructureMap((StructureMap)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUBSCRIPTION:
				setSubscription((Subscription)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUBSCRIPTION_STATUS:
				setSubscriptionStatus((SubscriptionStatus)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUBSCRIPTION_TOPIC:
				setSubscriptionTopic((SubscriptionTopic)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE:
				setSubstance((Substance)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_DEFINITION:
				setSubstanceDefinition((SubstanceDefinition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_NUCLEIC_ACID:
				setSubstanceNucleicAcid((SubstanceNucleicAcid)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_POLYMER:
				setSubstancePolymer((SubstancePolymer)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_PROTEIN:
				setSubstanceProtein((SubstanceProtein)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_REFERENCE_INFORMATION:
				setSubstanceReferenceInformation((SubstanceReferenceInformation)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_SOURCE_MATERIAL:
				setSubstanceSourceMaterial((SubstanceSourceMaterial)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUPPLY_DELIVERY:
				setSupplyDelivery((SupplyDelivery)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUPPLY_REQUEST:
				setSupplyRequest((SupplyRequest)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__TASK:
				setTask((Task)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__TERMINOLOGY_CAPABILITIES:
				setTerminologyCapabilities((TerminologyCapabilities)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__TEST_PLAN:
				setTestPlan((TestPlan)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__TEST_REPORT:
				setTestReport((TestReport)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__TEST_SCRIPT:
				setTestScript((TestScript)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__TRANSPORT:
				setTransport((Transport)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__VALUE_SET:
				setValueSet((ValueSet)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__VERIFICATION_RESULT:
				setVerificationResult((VerificationResult)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__VISION_PRESCRIPTION:
				setVisionPrescription((VisionPrescription)newValue);
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
			case FhirPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case FhirPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case FhirPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case FhirPackage.DOCUMENT_ROOT__ACCOUNT:
				setAccount((Account)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__ACTIVITY_DEFINITION:
				setActivityDefinition((ActivityDefinition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__ACTOR_DEFINITION:
				setActorDefinition((ActorDefinition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__ADMINISTRABLE_PRODUCT_DEFINITION:
				setAdministrableProductDefinition((AdministrableProductDefinition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__ADVERSE_EVENT:
				setAdverseEvent((AdverseEvent)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__ALLERGY_INTOLERANCE:
				setAllergyIntolerance((AllergyIntolerance)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__APPOINTMENT:
				setAppointment((Appointment)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__APPOINTMENT_RESPONSE:
				setAppointmentResponse((AppointmentResponse)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__ARTIFACT_ASSESSMENT:
				setArtifactAssessment((ArtifactAssessment)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__AUDIT_EVENT:
				setAuditEvent((AuditEvent)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__BASIC:
				setBasic((Basic)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__BINARY:
				setBinary((Binary)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__BIOLOGICALLY_DERIVED_PRODUCT:
				setBiologicallyDerivedProduct((BiologicallyDerivedProduct)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE:
				setBiologicallyDerivedProductDispense((BiologicallyDerivedProductDispense)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__BODY_STRUCTURE:
				setBodyStructure((BodyStructure)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__BUNDLE:
				setBundle((Bundle)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CAPABILITY_STATEMENT:
				setCapabilityStatement((CapabilityStatement)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CARE_PLAN:
				setCarePlan((CarePlan)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CARE_TEAM:
				setCareTeam((CareTeam)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CHARGE_ITEM:
				setChargeItem((ChargeItem)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CHARGE_ITEM_DEFINITION:
				setChargeItemDefinition((ChargeItemDefinition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CITATION:
				setCitation((Citation)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CLAIM:
				setClaim((Claim)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CLAIM_RESPONSE:
				setClaimResponse((ClaimResponse)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CLINICAL_IMPRESSION:
				setClinicalImpression((ClinicalImpression)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CLINICAL_USE_DEFINITION:
				setClinicalUseDefinition((ClinicalUseDefinition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CODE_SYSTEM:
				setCodeSystem((CodeSystem)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__COMMUNICATION:
				setCommunication((Communication)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__COMMUNICATION_REQUEST:
				setCommunicationRequest((CommunicationRequest)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__COMPARTMENT_DEFINITION:
				setCompartmentDefinition((CompartmentDefinition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__COMPOSITION:
				setComposition((Composition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CONCEPT_MAP:
				setConceptMap((ConceptMap)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CONDITION:
				setCondition((Condition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CONDITION_DEFINITION:
				setConditionDefinition((ConditionDefinition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CONSENT:
				setConsent((Consent)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CONTRACT:
				setContract((Contract)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__COVERAGE:
				setCoverage((Coverage)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__COVERAGE_ELIGIBILITY_REQUEST:
				setCoverageEligibilityRequest((CoverageEligibilityRequest)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__COVERAGE_ELIGIBILITY_RESPONSE:
				setCoverageEligibilityResponse((CoverageEligibilityResponse)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__DETECTED_ISSUE:
				setDetectedIssue((DetectedIssue)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__DEVICE:
				setDevice((Device)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_ASSOCIATION:
				setDeviceAssociation((DeviceAssociation)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_DEFINITION:
				setDeviceDefinition((DeviceDefinition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_DISPENSE:
				setDeviceDispense((DeviceDispense)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_METRIC:
				setDeviceMetric((DeviceMetric)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_REQUEST:
				setDeviceRequest((DeviceRequest)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_USAGE:
				setDeviceUsage((DeviceUsage)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__DIAGNOSTIC_REPORT:
				setDiagnosticReport((DiagnosticReport)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__DOCUMENT_REFERENCE:
				setDocumentReference((DocumentReference)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__ENCOUNTER:
				setEncounter((Encounter)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__ENCOUNTER_HISTORY:
				setEncounterHistory((EncounterHistory)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__ENDPOINT:
				setEndpoint((Endpoint)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__ENROLLMENT_REQUEST:
				setEnrollmentRequest((EnrollmentRequest)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__ENROLLMENT_RESPONSE:
				setEnrollmentResponse((EnrollmentResponse)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__EPISODE_OF_CARE:
				setEpisodeOfCare((EpisodeOfCare)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__EVENT_DEFINITION:
				setEventDefinition((EventDefinition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__EVIDENCE:
				setEvidence((Evidence)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__EVIDENCE_REPORT:
				setEvidenceReport((EvidenceReport)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__EVIDENCE_VARIABLE:
				setEvidenceVariable((EvidenceVariable)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__EXAMPLE_SCENARIO:
				setExampleScenario((ExampleScenario)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__EXPLANATION_OF_BENEFIT:
				setExplanationOfBenefit((ExplanationOfBenefit)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__FAMILY_MEMBER_HISTORY:
				setFamilyMemberHistory((FamilyMemberHistory)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__FLAG:
				setFlag((Flag)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__FORMULARY_ITEM:
				setFormularyItem((FormularyItem)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__GENOMIC_STUDY:
				setGenomicStudy((GenomicStudy)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__GOAL:
				setGoal((Goal)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__GRAPH_DEFINITION:
				setGraphDefinition((GraphDefinition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__GROUP:
				setGroup((Group)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__GUIDANCE_RESPONSE:
				setGuidanceResponse((GuidanceResponse)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__HEALTHCARE_SERVICE:
				setHealthcareService((HealthcareService)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__IMAGING_SELECTION:
				setImagingSelection((ImagingSelection)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__IMAGING_STUDY:
				setImagingStudy((ImagingStudy)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION:
				setImmunization((Immunization)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION_EVALUATION:
				setImmunizationEvaluation((ImmunizationEvaluation)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION_RECOMMENDATION:
				setImmunizationRecommendation((ImmunizationRecommendation)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__IMPLEMENTATION_GUIDE:
				setImplementationGuide((ImplementationGuide)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__INGREDIENT:
				setIngredient((Ingredient)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__INSURANCE_PLAN:
				setInsurancePlan((InsurancePlan)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__INVENTORY_ITEM:
				setInventoryItem((InventoryItem)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__INVENTORY_REPORT:
				setInventoryReport((InventoryReport)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__INVOICE:
				setInvoice((Invoice)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__LIBRARY:
				setLibrary((Library)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__LINKAGE:
				setLinkage((Linkage)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__LIST:
				setList((List)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__LOCATION:
				setLocation((Location)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__MANUFACTURED_ITEM_DEFINITION:
				setManufacturedItemDefinition((ManufacturedItemDefinition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEASURE:
				setMeasure((Measure)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEASURE_REPORT:
				setMeasureReport((MeasureReport)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION:
				setMedication((Medication)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_ADMINISTRATION:
				setMedicationAdministration((MedicationAdministration)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_DISPENSE:
				setMedicationDispense((MedicationDispense)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_KNOWLEDGE:
				setMedicationKnowledge((MedicationKnowledge)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_REQUEST:
				setMedicationRequest((MedicationRequest)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_STATEMENT:
				setMedicationStatement((MedicationStatement)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDICINAL_PRODUCT_DEFINITION:
				setMedicinalProductDefinition((MedicinalProductDefinition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__MESSAGE_DEFINITION:
				setMessageDefinition((MessageDefinition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__MESSAGE_HEADER:
				setMessageHeader((MessageHeader)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__MOLECULAR_SEQUENCE:
				setMolecularSequence((MolecularSequence)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__NAMING_SYSTEM:
				setNamingSystem((NamingSystem)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__NUTRITION_INTAKE:
				setNutritionIntake((NutritionIntake)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__NUTRITION_ORDER:
				setNutritionOrder((NutritionOrder)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__NUTRITION_PRODUCT:
				setNutritionProduct((NutritionProduct)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__OBSERVATION:
				setObservation((Observation)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__OBSERVATION_DEFINITION:
				setObservationDefinition((ObservationDefinition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__OPERATION_DEFINITION:
				setOperationDefinition((OperationDefinition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__OPERATION_OUTCOME:
				setOperationOutcome((OperationOutcome)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__ORGANIZATION_AFFILIATION:
				setOrganizationAffiliation((OrganizationAffiliation)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__PACKAGED_PRODUCT_DEFINITION:
				setPackagedProductDefinition((PackagedProductDefinition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__PARAMETERS:
				setParameters((Parameters)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__PATIENT:
				setPatient((Patient)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__PAYMENT_NOTICE:
				setPaymentNotice((PaymentNotice)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__PAYMENT_RECONCILIATION:
				setPaymentReconciliation((PaymentReconciliation)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__PERMISSION:
				setPermission((Permission)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__PERSON:
				setPerson((Person)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__PLAN_DEFINITION:
				setPlanDefinition((PlanDefinition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__PRACTITIONER:
				setPractitioner((Practitioner)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__PRACTITIONER_ROLE:
				setPractitionerRole((PractitionerRole)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__PROCEDURE:
				setProcedure((Procedure)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__PROVENANCE:
				setProvenance((Provenance)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__QUESTIONNAIRE:
				setQuestionnaire((Questionnaire)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__QUESTIONNAIRE_RESPONSE:
				setQuestionnaireResponse((QuestionnaireResponse)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__REGULATED_AUTHORIZATION:
				setRegulatedAuthorization((RegulatedAuthorization)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__RELATED_PERSON:
				setRelatedPerson((RelatedPerson)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__REQUEST_ORCHESTRATION:
				setRequestOrchestration((RequestOrchestration)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__REQUIREMENTS:
				setRequirements((Requirements)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__RESEARCH_STUDY:
				setResearchStudy((ResearchStudy)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__RESEARCH_SUBJECT:
				setResearchSubject((ResearchSubject)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__RISK_ASSESSMENT:
				setRiskAssessment((RiskAssessment)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SCHEDULE:
				setSchedule((Schedule)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SEARCH_PARAMETER:
				setSearchParameter((SearchParameter)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SERVICE_REQUEST:
				setServiceRequest((ServiceRequest)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SLOT:
				setSlot((Slot)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SPECIMEN:
				setSpecimen((Specimen)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SPECIMEN_DEFINITION:
				setSpecimenDefinition((SpecimenDefinition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__STRUCTURE_DEFINITION:
				setStructureDefinition((StructureDefinition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__STRUCTURE_MAP:
				setStructureMap((StructureMap)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUBSCRIPTION:
				setSubscription((Subscription)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUBSCRIPTION_STATUS:
				setSubscriptionStatus((SubscriptionStatus)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUBSCRIPTION_TOPIC:
				setSubscriptionTopic((SubscriptionTopic)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE:
				setSubstance((Substance)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_DEFINITION:
				setSubstanceDefinition((SubstanceDefinition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_NUCLEIC_ACID:
				setSubstanceNucleicAcid((SubstanceNucleicAcid)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_POLYMER:
				setSubstancePolymer((SubstancePolymer)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_PROTEIN:
				setSubstanceProtein((SubstanceProtein)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_REFERENCE_INFORMATION:
				setSubstanceReferenceInformation((SubstanceReferenceInformation)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_SOURCE_MATERIAL:
				setSubstanceSourceMaterial((SubstanceSourceMaterial)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUPPLY_DELIVERY:
				setSupplyDelivery((SupplyDelivery)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUPPLY_REQUEST:
				setSupplyRequest((SupplyRequest)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__TASK:
				setTask((Task)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__TERMINOLOGY_CAPABILITIES:
				setTerminologyCapabilities((TerminologyCapabilities)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__TEST_PLAN:
				setTestPlan((TestPlan)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__TEST_REPORT:
				setTestReport((TestReport)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__TEST_SCRIPT:
				setTestScript((TestScript)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__TRANSPORT:
				setTransport((Transport)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__VALUE_SET:
				setValueSet((ValueSet)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__VERIFICATION_RESULT:
				setVerificationResult((VerificationResult)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__VISION_PRESCRIPTION:
				setVisionPrescription((VisionPrescription)null);
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
			case FhirPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case FhirPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case FhirPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case FhirPackage.DOCUMENT_ROOT__ACCOUNT:
				return getAccount() != null;
			case FhirPackage.DOCUMENT_ROOT__ACTIVITY_DEFINITION:
				return getActivityDefinition() != null;
			case FhirPackage.DOCUMENT_ROOT__ACTOR_DEFINITION:
				return getActorDefinition() != null;
			case FhirPackage.DOCUMENT_ROOT__ADMINISTRABLE_PRODUCT_DEFINITION:
				return getAdministrableProductDefinition() != null;
			case FhirPackage.DOCUMENT_ROOT__ADVERSE_EVENT:
				return getAdverseEvent() != null;
			case FhirPackage.DOCUMENT_ROOT__ALLERGY_INTOLERANCE:
				return getAllergyIntolerance() != null;
			case FhirPackage.DOCUMENT_ROOT__APPOINTMENT:
				return getAppointment() != null;
			case FhirPackage.DOCUMENT_ROOT__APPOINTMENT_RESPONSE:
				return getAppointmentResponse() != null;
			case FhirPackage.DOCUMENT_ROOT__ARTIFACT_ASSESSMENT:
				return getArtifactAssessment() != null;
			case FhirPackage.DOCUMENT_ROOT__AUDIT_EVENT:
				return getAuditEvent() != null;
			case FhirPackage.DOCUMENT_ROOT__BASIC:
				return getBasic() != null;
			case FhirPackage.DOCUMENT_ROOT__BINARY:
				return getBinary() != null;
			case FhirPackage.DOCUMENT_ROOT__BIOLOGICALLY_DERIVED_PRODUCT:
				return getBiologicallyDerivedProduct() != null;
			case FhirPackage.DOCUMENT_ROOT__BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE:
				return getBiologicallyDerivedProductDispense() != null;
			case FhirPackage.DOCUMENT_ROOT__BODY_STRUCTURE:
				return getBodyStructure() != null;
			case FhirPackage.DOCUMENT_ROOT__BUNDLE:
				return getBundle() != null;
			case FhirPackage.DOCUMENT_ROOT__CAPABILITY_STATEMENT:
				return getCapabilityStatement() != null;
			case FhirPackage.DOCUMENT_ROOT__CARE_PLAN:
				return getCarePlan() != null;
			case FhirPackage.DOCUMENT_ROOT__CARE_TEAM:
				return getCareTeam() != null;
			case FhirPackage.DOCUMENT_ROOT__CHARGE_ITEM:
				return getChargeItem() != null;
			case FhirPackage.DOCUMENT_ROOT__CHARGE_ITEM_DEFINITION:
				return getChargeItemDefinition() != null;
			case FhirPackage.DOCUMENT_ROOT__CITATION:
				return getCitation() != null;
			case FhirPackage.DOCUMENT_ROOT__CLAIM:
				return getClaim() != null;
			case FhirPackage.DOCUMENT_ROOT__CLAIM_RESPONSE:
				return getClaimResponse() != null;
			case FhirPackage.DOCUMENT_ROOT__CLINICAL_IMPRESSION:
				return getClinicalImpression() != null;
			case FhirPackage.DOCUMENT_ROOT__CLINICAL_USE_DEFINITION:
				return getClinicalUseDefinition() != null;
			case FhirPackage.DOCUMENT_ROOT__CODE_SYSTEM:
				return getCodeSystem() != null;
			case FhirPackage.DOCUMENT_ROOT__COMMUNICATION:
				return getCommunication() != null;
			case FhirPackage.DOCUMENT_ROOT__COMMUNICATION_REQUEST:
				return getCommunicationRequest() != null;
			case FhirPackage.DOCUMENT_ROOT__COMPARTMENT_DEFINITION:
				return getCompartmentDefinition() != null;
			case FhirPackage.DOCUMENT_ROOT__COMPOSITION:
				return getComposition() != null;
			case FhirPackage.DOCUMENT_ROOT__CONCEPT_MAP:
				return getConceptMap() != null;
			case FhirPackage.DOCUMENT_ROOT__CONDITION:
				return getCondition() != null;
			case FhirPackage.DOCUMENT_ROOT__CONDITION_DEFINITION:
				return getConditionDefinition() != null;
			case FhirPackage.DOCUMENT_ROOT__CONSENT:
				return getConsent() != null;
			case FhirPackage.DOCUMENT_ROOT__CONTRACT:
				return getContract() != null;
			case FhirPackage.DOCUMENT_ROOT__COVERAGE:
				return getCoverage() != null;
			case FhirPackage.DOCUMENT_ROOT__COVERAGE_ELIGIBILITY_REQUEST:
				return getCoverageEligibilityRequest() != null;
			case FhirPackage.DOCUMENT_ROOT__COVERAGE_ELIGIBILITY_RESPONSE:
				return getCoverageEligibilityResponse() != null;
			case FhirPackage.DOCUMENT_ROOT__DETECTED_ISSUE:
				return getDetectedIssue() != null;
			case FhirPackage.DOCUMENT_ROOT__DEVICE:
				return getDevice() != null;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_ASSOCIATION:
				return getDeviceAssociation() != null;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_DEFINITION:
				return getDeviceDefinition() != null;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_DISPENSE:
				return getDeviceDispense() != null;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_METRIC:
				return getDeviceMetric() != null;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_REQUEST:
				return getDeviceRequest() != null;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_USAGE:
				return getDeviceUsage() != null;
			case FhirPackage.DOCUMENT_ROOT__DIAGNOSTIC_REPORT:
				return getDiagnosticReport() != null;
			case FhirPackage.DOCUMENT_ROOT__DOCUMENT_REFERENCE:
				return getDocumentReference() != null;
			case FhirPackage.DOCUMENT_ROOT__ENCOUNTER:
				return getEncounter() != null;
			case FhirPackage.DOCUMENT_ROOT__ENCOUNTER_HISTORY:
				return getEncounterHistory() != null;
			case FhirPackage.DOCUMENT_ROOT__ENDPOINT:
				return getEndpoint() != null;
			case FhirPackage.DOCUMENT_ROOT__ENROLLMENT_REQUEST:
				return getEnrollmentRequest() != null;
			case FhirPackage.DOCUMENT_ROOT__ENROLLMENT_RESPONSE:
				return getEnrollmentResponse() != null;
			case FhirPackage.DOCUMENT_ROOT__EPISODE_OF_CARE:
				return getEpisodeOfCare() != null;
			case FhirPackage.DOCUMENT_ROOT__EVENT_DEFINITION:
				return getEventDefinition() != null;
			case FhirPackage.DOCUMENT_ROOT__EVIDENCE:
				return getEvidence() != null;
			case FhirPackage.DOCUMENT_ROOT__EVIDENCE_REPORT:
				return getEvidenceReport() != null;
			case FhirPackage.DOCUMENT_ROOT__EVIDENCE_VARIABLE:
				return getEvidenceVariable() != null;
			case FhirPackage.DOCUMENT_ROOT__EXAMPLE_SCENARIO:
				return getExampleScenario() != null;
			case FhirPackage.DOCUMENT_ROOT__EXPLANATION_OF_BENEFIT:
				return getExplanationOfBenefit() != null;
			case FhirPackage.DOCUMENT_ROOT__FAMILY_MEMBER_HISTORY:
				return getFamilyMemberHistory() != null;
			case FhirPackage.DOCUMENT_ROOT__FLAG:
				return getFlag() != null;
			case FhirPackage.DOCUMENT_ROOT__FORMULARY_ITEM:
				return getFormularyItem() != null;
			case FhirPackage.DOCUMENT_ROOT__GENOMIC_STUDY:
				return getGenomicStudy() != null;
			case FhirPackage.DOCUMENT_ROOT__GOAL:
				return getGoal() != null;
			case FhirPackage.DOCUMENT_ROOT__GRAPH_DEFINITION:
				return getGraphDefinition() != null;
			case FhirPackage.DOCUMENT_ROOT__GROUP:
				return getGroup() != null;
			case FhirPackage.DOCUMENT_ROOT__GUIDANCE_RESPONSE:
				return getGuidanceResponse() != null;
			case FhirPackage.DOCUMENT_ROOT__HEALTHCARE_SERVICE:
				return getHealthcareService() != null;
			case FhirPackage.DOCUMENT_ROOT__IMAGING_SELECTION:
				return getImagingSelection() != null;
			case FhirPackage.DOCUMENT_ROOT__IMAGING_STUDY:
				return getImagingStudy() != null;
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION:
				return getImmunization() != null;
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION_EVALUATION:
				return getImmunizationEvaluation() != null;
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION_RECOMMENDATION:
				return getImmunizationRecommendation() != null;
			case FhirPackage.DOCUMENT_ROOT__IMPLEMENTATION_GUIDE:
				return getImplementationGuide() != null;
			case FhirPackage.DOCUMENT_ROOT__INGREDIENT:
				return getIngredient() != null;
			case FhirPackage.DOCUMENT_ROOT__INSURANCE_PLAN:
				return getInsurancePlan() != null;
			case FhirPackage.DOCUMENT_ROOT__INVENTORY_ITEM:
				return getInventoryItem() != null;
			case FhirPackage.DOCUMENT_ROOT__INVENTORY_REPORT:
				return getInventoryReport() != null;
			case FhirPackage.DOCUMENT_ROOT__INVOICE:
				return getInvoice() != null;
			case FhirPackage.DOCUMENT_ROOT__LIBRARY:
				return getLibrary() != null;
			case FhirPackage.DOCUMENT_ROOT__LINKAGE:
				return getLinkage() != null;
			case FhirPackage.DOCUMENT_ROOT__LIST:
				return getList() != null;
			case FhirPackage.DOCUMENT_ROOT__LOCATION:
				return getLocation() != null;
			case FhirPackage.DOCUMENT_ROOT__MANUFACTURED_ITEM_DEFINITION:
				return getManufacturedItemDefinition() != null;
			case FhirPackage.DOCUMENT_ROOT__MEASURE:
				return getMeasure() != null;
			case FhirPackage.DOCUMENT_ROOT__MEASURE_REPORT:
				return getMeasureReport() != null;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION:
				return getMedication() != null;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_ADMINISTRATION:
				return getMedicationAdministration() != null;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_DISPENSE:
				return getMedicationDispense() != null;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_KNOWLEDGE:
				return getMedicationKnowledge() != null;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_REQUEST:
				return getMedicationRequest() != null;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_STATEMENT:
				return getMedicationStatement() != null;
			case FhirPackage.DOCUMENT_ROOT__MEDICINAL_PRODUCT_DEFINITION:
				return getMedicinalProductDefinition() != null;
			case FhirPackage.DOCUMENT_ROOT__MESSAGE_DEFINITION:
				return getMessageDefinition() != null;
			case FhirPackage.DOCUMENT_ROOT__MESSAGE_HEADER:
				return getMessageHeader() != null;
			case FhirPackage.DOCUMENT_ROOT__MOLECULAR_SEQUENCE:
				return getMolecularSequence() != null;
			case FhirPackage.DOCUMENT_ROOT__NAMING_SYSTEM:
				return getNamingSystem() != null;
			case FhirPackage.DOCUMENT_ROOT__NUTRITION_INTAKE:
				return getNutritionIntake() != null;
			case FhirPackage.DOCUMENT_ROOT__NUTRITION_ORDER:
				return getNutritionOrder() != null;
			case FhirPackage.DOCUMENT_ROOT__NUTRITION_PRODUCT:
				return getNutritionProduct() != null;
			case FhirPackage.DOCUMENT_ROOT__OBSERVATION:
				return getObservation() != null;
			case FhirPackage.DOCUMENT_ROOT__OBSERVATION_DEFINITION:
				return getObservationDefinition() != null;
			case FhirPackage.DOCUMENT_ROOT__OPERATION_DEFINITION:
				return getOperationDefinition() != null;
			case FhirPackage.DOCUMENT_ROOT__OPERATION_OUTCOME:
				return getOperationOutcome() != null;
			case FhirPackage.DOCUMENT_ROOT__ORGANIZATION:
				return getOrganization() != null;
			case FhirPackage.DOCUMENT_ROOT__ORGANIZATION_AFFILIATION:
				return getOrganizationAffiliation() != null;
			case FhirPackage.DOCUMENT_ROOT__PACKAGED_PRODUCT_DEFINITION:
				return getPackagedProductDefinition() != null;
			case FhirPackage.DOCUMENT_ROOT__PARAMETERS:
				return getParameters() != null;
			case FhirPackage.DOCUMENT_ROOT__PATIENT:
				return getPatient() != null;
			case FhirPackage.DOCUMENT_ROOT__PAYMENT_NOTICE:
				return getPaymentNotice() != null;
			case FhirPackage.DOCUMENT_ROOT__PAYMENT_RECONCILIATION:
				return getPaymentReconciliation() != null;
			case FhirPackage.DOCUMENT_ROOT__PERMISSION:
				return getPermission() != null;
			case FhirPackage.DOCUMENT_ROOT__PERSON:
				return getPerson() != null;
			case FhirPackage.DOCUMENT_ROOT__PLAN_DEFINITION:
				return getPlanDefinition() != null;
			case FhirPackage.DOCUMENT_ROOT__PRACTITIONER:
				return getPractitioner() != null;
			case FhirPackage.DOCUMENT_ROOT__PRACTITIONER_ROLE:
				return getPractitionerRole() != null;
			case FhirPackage.DOCUMENT_ROOT__PROCEDURE:
				return getProcedure() != null;
			case FhirPackage.DOCUMENT_ROOT__PROVENANCE:
				return getProvenance() != null;
			case FhirPackage.DOCUMENT_ROOT__QUESTIONNAIRE:
				return getQuestionnaire() != null;
			case FhirPackage.DOCUMENT_ROOT__QUESTIONNAIRE_RESPONSE:
				return getQuestionnaireResponse() != null;
			case FhirPackage.DOCUMENT_ROOT__REGULATED_AUTHORIZATION:
				return getRegulatedAuthorization() != null;
			case FhirPackage.DOCUMENT_ROOT__RELATED_PERSON:
				return getRelatedPerson() != null;
			case FhirPackage.DOCUMENT_ROOT__REQUEST_ORCHESTRATION:
				return getRequestOrchestration() != null;
			case FhirPackage.DOCUMENT_ROOT__REQUIREMENTS:
				return getRequirements() != null;
			case FhirPackage.DOCUMENT_ROOT__RESEARCH_STUDY:
				return getResearchStudy() != null;
			case FhirPackage.DOCUMENT_ROOT__RESEARCH_SUBJECT:
				return getResearchSubject() != null;
			case FhirPackage.DOCUMENT_ROOT__RISK_ASSESSMENT:
				return getRiskAssessment() != null;
			case FhirPackage.DOCUMENT_ROOT__SCHEDULE:
				return getSchedule() != null;
			case FhirPackage.DOCUMENT_ROOT__SEARCH_PARAMETER:
				return getSearchParameter() != null;
			case FhirPackage.DOCUMENT_ROOT__SERVICE_REQUEST:
				return getServiceRequest() != null;
			case FhirPackage.DOCUMENT_ROOT__SLOT:
				return getSlot() != null;
			case FhirPackage.DOCUMENT_ROOT__SPECIMEN:
				return getSpecimen() != null;
			case FhirPackage.DOCUMENT_ROOT__SPECIMEN_DEFINITION:
				return getSpecimenDefinition() != null;
			case FhirPackage.DOCUMENT_ROOT__STRUCTURE_DEFINITION:
				return getStructureDefinition() != null;
			case FhirPackage.DOCUMENT_ROOT__STRUCTURE_MAP:
				return getStructureMap() != null;
			case FhirPackage.DOCUMENT_ROOT__SUBSCRIPTION:
				return getSubscription() != null;
			case FhirPackage.DOCUMENT_ROOT__SUBSCRIPTION_STATUS:
				return getSubscriptionStatus() != null;
			case FhirPackage.DOCUMENT_ROOT__SUBSCRIPTION_TOPIC:
				return getSubscriptionTopic() != null;
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE:
				return getSubstance() != null;
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_DEFINITION:
				return getSubstanceDefinition() != null;
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_NUCLEIC_ACID:
				return getSubstanceNucleicAcid() != null;
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_POLYMER:
				return getSubstancePolymer() != null;
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_PROTEIN:
				return getSubstanceProtein() != null;
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_REFERENCE_INFORMATION:
				return getSubstanceReferenceInformation() != null;
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE_SOURCE_MATERIAL:
				return getSubstanceSourceMaterial() != null;
			case FhirPackage.DOCUMENT_ROOT__SUPPLY_DELIVERY:
				return getSupplyDelivery() != null;
			case FhirPackage.DOCUMENT_ROOT__SUPPLY_REQUEST:
				return getSupplyRequest() != null;
			case FhirPackage.DOCUMENT_ROOT__TASK:
				return getTask() != null;
			case FhirPackage.DOCUMENT_ROOT__TERMINOLOGY_CAPABILITIES:
				return getTerminologyCapabilities() != null;
			case FhirPackage.DOCUMENT_ROOT__TEST_PLAN:
				return getTestPlan() != null;
			case FhirPackage.DOCUMENT_ROOT__TEST_REPORT:
				return getTestReport() != null;
			case FhirPackage.DOCUMENT_ROOT__TEST_SCRIPT:
				return getTestScript() != null;
			case FhirPackage.DOCUMENT_ROOT__TRANSPORT:
				return getTransport() != null;
			case FhirPackage.DOCUMENT_ROOT__VALUE_SET:
				return getValueSet() != null;
			case FhirPackage.DOCUMENT_ROOT__VERIFICATION_RESULT:
				return getVerificationResult() != null;
			case FhirPackage.DOCUMENT_ROOT__VISION_PRESCRIPTION:
				return getVisionPrescription() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
