/**
 */
package org.hl7.emf.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.emf.fhir.Account;
import org.hl7.emf.fhir.ActivityDefinition;
import org.hl7.emf.fhir.ActorDefinition;
import org.hl7.emf.fhir.AdministrableProductDefinition;
import org.hl7.emf.fhir.AdverseEvent;
import org.hl7.emf.fhir.AllergyIntolerance;
import org.hl7.emf.fhir.Appointment;
import org.hl7.emf.fhir.AppointmentResponse;
import org.hl7.emf.fhir.ArtifactAssessment;
import org.hl7.emf.fhir.AuditEvent;
import org.hl7.emf.fhir.Basic;
import org.hl7.emf.fhir.Binary;
import org.hl7.emf.fhir.BiologicallyDerivedProduct;
import org.hl7.emf.fhir.BiologicallyDerivedProductDispense;
import org.hl7.emf.fhir.BodyStructure;
import org.hl7.emf.fhir.Bundle;
import org.hl7.emf.fhir.CapabilityStatement;
import org.hl7.emf.fhir.CarePlan;
import org.hl7.emf.fhir.CareTeam;
import org.hl7.emf.fhir.ChargeItem;
import org.hl7.emf.fhir.ChargeItemDefinition;
import org.hl7.emf.fhir.Citation;
import org.hl7.emf.fhir.Claim;
import org.hl7.emf.fhir.ClaimResponse;
import org.hl7.emf.fhir.ClinicalImpression;
import org.hl7.emf.fhir.ClinicalUseDefinition;
import org.hl7.emf.fhir.CodeSystem;
import org.hl7.emf.fhir.Communication;
import org.hl7.emf.fhir.CommunicationRequest;
import org.hl7.emf.fhir.CompartmentDefinition;
import org.hl7.emf.fhir.Composition;
import org.hl7.emf.fhir.ConceptMap;
import org.hl7.emf.fhir.Condition;
import org.hl7.emf.fhir.ConditionDefinition;
import org.hl7.emf.fhir.Consent;
import org.hl7.emf.fhir.Contract;
import org.hl7.emf.fhir.Coverage;
import org.hl7.emf.fhir.CoverageEligibilityRequest;
import org.hl7.emf.fhir.CoverageEligibilityResponse;
import org.hl7.emf.fhir.DetectedIssue;
import org.hl7.emf.fhir.Device;
import org.hl7.emf.fhir.DeviceAssociation;
import org.hl7.emf.fhir.DeviceDefinition;
import org.hl7.emf.fhir.DeviceDispense;
import org.hl7.emf.fhir.DeviceMetric;
import org.hl7.emf.fhir.DeviceRequest;
import org.hl7.emf.fhir.DeviceUsage;
import org.hl7.emf.fhir.DiagnosticReport;
import org.hl7.emf.fhir.DocumentReference;
import org.hl7.emf.fhir.Encounter;
import org.hl7.emf.fhir.EncounterHistory;
import org.hl7.emf.fhir.Endpoint;
import org.hl7.emf.fhir.EnrollmentRequest;
import org.hl7.emf.fhir.EnrollmentResponse;
import org.hl7.emf.fhir.EpisodeOfCare;
import org.hl7.emf.fhir.EventDefinition;
import org.hl7.emf.fhir.Evidence;
import org.hl7.emf.fhir.EvidenceReport;
import org.hl7.emf.fhir.EvidenceVariable;
import org.hl7.emf.fhir.ExampleScenario;
import org.hl7.emf.fhir.ExplanationOfBenefit;
import org.hl7.emf.fhir.FamilyMemberHistory;
import org.hl7.emf.fhir.FhirPackage;
import org.hl7.emf.fhir.Flag;
import org.hl7.emf.fhir.FormularyItem;
import org.hl7.emf.fhir.GenomicStudy;
import org.hl7.emf.fhir.Goal;
import org.hl7.emf.fhir.GraphDefinition;
import org.hl7.emf.fhir.Group;
import org.hl7.emf.fhir.GuidanceResponse;
import org.hl7.emf.fhir.HealthcareService;
import org.hl7.emf.fhir.ImagingSelection;
import org.hl7.emf.fhir.ImagingStudy;
import org.hl7.emf.fhir.Immunization;
import org.hl7.emf.fhir.ImmunizationEvaluation;
import org.hl7.emf.fhir.ImmunizationRecommendation;
import org.hl7.emf.fhir.ImplementationGuide;
import org.hl7.emf.fhir.Ingredient;
import org.hl7.emf.fhir.InsurancePlan;
import org.hl7.emf.fhir.InventoryItem;
import org.hl7.emf.fhir.InventoryReport;
import org.hl7.emf.fhir.Invoice;
import org.hl7.emf.fhir.Library;
import org.hl7.emf.fhir.Linkage;
import org.hl7.emf.fhir.List;
import org.hl7.emf.fhir.Location;
import org.hl7.emf.fhir.ManufacturedItemDefinition;
import org.hl7.emf.fhir.Measure;
import org.hl7.emf.fhir.MeasureReport;
import org.hl7.emf.fhir.Medication;
import org.hl7.emf.fhir.MedicationAdministration;
import org.hl7.emf.fhir.MedicationDispense;
import org.hl7.emf.fhir.MedicationKnowledge;
import org.hl7.emf.fhir.MedicationRequest;
import org.hl7.emf.fhir.MedicationStatement;
import org.hl7.emf.fhir.MedicinalProductDefinition;
import org.hl7.emf.fhir.MessageDefinition;
import org.hl7.emf.fhir.MessageHeader;
import org.hl7.emf.fhir.MolecularSequence;
import org.hl7.emf.fhir.NamingSystem;
import org.hl7.emf.fhir.NutritionIntake;
import org.hl7.emf.fhir.NutritionOrder;
import org.hl7.emf.fhir.NutritionProduct;
import org.hl7.emf.fhir.Observation;
import org.hl7.emf.fhir.ObservationDefinition;
import org.hl7.emf.fhir.OperationDefinition;
import org.hl7.emf.fhir.OperationOutcome;
import org.hl7.emf.fhir.Organization;
import org.hl7.emf.fhir.OrganizationAffiliation;
import org.hl7.emf.fhir.PackagedProductDefinition;
import org.hl7.emf.fhir.Parameters;
import org.hl7.emf.fhir.Patient;
import org.hl7.emf.fhir.PaymentNotice;
import org.hl7.emf.fhir.PaymentReconciliation;
import org.hl7.emf.fhir.Permission;
import org.hl7.emf.fhir.Person;
import org.hl7.emf.fhir.PlanDefinition;
import org.hl7.emf.fhir.Practitioner;
import org.hl7.emf.fhir.PractitionerRole;
import org.hl7.emf.fhir.Procedure;
import org.hl7.emf.fhir.Provenance;
import org.hl7.emf.fhir.Questionnaire;
import org.hl7.emf.fhir.QuestionnaireResponse;
import org.hl7.emf.fhir.RegulatedAuthorization;
import org.hl7.emf.fhir.RelatedPerson;
import org.hl7.emf.fhir.RequestOrchestration;
import org.hl7.emf.fhir.Requirements;
import org.hl7.emf.fhir.ResearchStudy;
import org.hl7.emf.fhir.ResearchSubject;
import org.hl7.emf.fhir.ResourceContainer;
import org.hl7.emf.fhir.RiskAssessment;
import org.hl7.emf.fhir.Schedule;
import org.hl7.emf.fhir.SearchParameter;
import org.hl7.emf.fhir.ServiceRequest;
import org.hl7.emf.fhir.Slot;
import org.hl7.emf.fhir.Specimen;
import org.hl7.emf.fhir.SpecimenDefinition;
import org.hl7.emf.fhir.StructureDefinition;
import org.hl7.emf.fhir.StructureMap;
import org.hl7.emf.fhir.Subscription;
import org.hl7.emf.fhir.SubscriptionStatus;
import org.hl7.emf.fhir.SubscriptionTopic;
import org.hl7.emf.fhir.Substance;
import org.hl7.emf.fhir.SubstanceDefinition;
import org.hl7.emf.fhir.SubstanceNucleicAcid;
import org.hl7.emf.fhir.SubstancePolymer;
import org.hl7.emf.fhir.SubstanceProtein;
import org.hl7.emf.fhir.SubstanceReferenceInformation;
import org.hl7.emf.fhir.SubstanceSourceMaterial;
import org.hl7.emf.fhir.SupplyDelivery;
import org.hl7.emf.fhir.SupplyRequest;
import org.hl7.emf.fhir.Task;
import org.hl7.emf.fhir.TerminologyCapabilities;
import org.hl7.emf.fhir.TestPlan;
import org.hl7.emf.fhir.TestReport;
import org.hl7.emf.fhir.TestScript;
import org.hl7.emf.fhir.Transport;
import org.hl7.emf.fhir.ValueSet;
import org.hl7.emf.fhir.VerificationResult;
import org.hl7.emf.fhir.VisionPrescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getActivityDefinition <em>Activity Definition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getActorDefinition <em>Actor Definition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getAdministrableProductDefinition <em>Administrable Product Definition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getAdverseEvent <em>Adverse Event</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getAllergyIntolerance <em>Allergy Intolerance</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getAppointmentResponse <em>Appointment Response</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getArtifactAssessment <em>Artifact Assessment</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getAuditEvent <em>Audit Event</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getBinary <em>Binary</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getBiologicallyDerivedProduct <em>Biologically Derived Product</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getBiologicallyDerivedProductDispense <em>Biologically Derived Product Dispense</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getBodyStructure <em>Body Structure</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getBundle <em>Bundle</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getCapabilityStatement <em>Capability Statement</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getCarePlan <em>Care Plan</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getCareTeam <em>Care Team</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getChargeItem <em>Charge Item</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getChargeItemDefinition <em>Charge Item Definition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getCitation <em>Citation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getClaim <em>Claim</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getClaimResponse <em>Claim Response</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getClinicalImpression <em>Clinical Impression</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getClinicalUseDefinition <em>Clinical Use Definition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getCommunication <em>Communication</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getCommunicationRequest <em>Communication Request</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getCompartmentDefinition <em>Compartment Definition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getComposition <em>Composition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getConceptMap <em>Concept Map</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getConditionDefinition <em>Condition Definition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getConsent <em>Consent</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getCoverageEligibilityRequest <em>Coverage Eligibility Request</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getCoverageEligibilityResponse <em>Coverage Eligibility Response</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getDetectedIssue <em>Detected Issue</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getDeviceAssociation <em>Device Association</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getDeviceDefinition <em>Device Definition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getDeviceDispense <em>Device Dispense</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getDeviceMetric <em>Device Metric</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getDeviceRequest <em>Device Request</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getDeviceUsage <em>Device Usage</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getDiagnosticReport <em>Diagnostic Report</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getDocumentReference <em>Document Reference</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getEncounterHistory <em>Encounter History</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getEnrollmentRequest <em>Enrollment Request</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getEnrollmentResponse <em>Enrollment Response</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getEpisodeOfCare <em>Episode Of Care</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getEventDefinition <em>Event Definition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getEvidenceReport <em>Evidence Report</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getEvidenceVariable <em>Evidence Variable</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getExampleScenario <em>Example Scenario</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getExplanationOfBenefit <em>Explanation Of Benefit</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getFamilyMemberHistory <em>Family Member History</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getFlag <em>Flag</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getFormularyItem <em>Formulary Item</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getGenomicStudy <em>Genomic Study</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getGraphDefinition <em>Graph Definition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getGuidanceResponse <em>Guidance Response</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getHealthcareService <em>Healthcare Service</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getImagingSelection <em>Imaging Selection</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getImagingStudy <em>Imaging Study</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getImmunization <em>Immunization</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getImmunizationEvaluation <em>Immunization Evaluation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getImmunizationRecommendation <em>Immunization Recommendation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getImplementationGuide <em>Implementation Guide</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getInsurancePlan <em>Insurance Plan</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getInventoryItem <em>Inventory Item</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getInventoryReport <em>Inventory Report</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getInvoice <em>Invoice</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getLinkage <em>Linkage</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getList <em>List</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getManufacturedItemDefinition <em>Manufactured Item Definition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getMeasureReport <em>Measure Report</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getMedication <em>Medication</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getMedicationAdministration <em>Medication Administration</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getMedicationDispense <em>Medication Dispense</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getMedicationKnowledge <em>Medication Knowledge</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getMedicationRequest <em>Medication Request</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getMedicationStatement <em>Medication Statement</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getMedicinalProductDefinition <em>Medicinal Product Definition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getMessageDefinition <em>Message Definition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getMessageHeader <em>Message Header</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getMolecularSequence <em>Molecular Sequence</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getNamingSystem <em>Naming System</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getNutritionIntake <em>Nutrition Intake</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getNutritionOrder <em>Nutrition Order</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getNutritionProduct <em>Nutrition Product</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getObservation <em>Observation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getObservationDefinition <em>Observation Definition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getOperationDefinition <em>Operation Definition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getOperationOutcome <em>Operation Outcome</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getOrganizationAffiliation <em>Organization Affiliation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getPackagedProductDefinition <em>Packaged Product Definition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getPaymentNotice <em>Payment Notice</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getPaymentReconciliation <em>Payment Reconciliation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getPermission <em>Permission</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getPlanDefinition <em>Plan Definition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getPractitioner <em>Practitioner</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getPractitionerRole <em>Practitioner Role</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getProvenance <em>Provenance</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getQuestionnaireResponse <em>Questionnaire Response</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getRegulatedAuthorization <em>Regulated Authorization</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getRelatedPerson <em>Related Person</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getRequestOrchestration <em>Request Orchestration</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getResearchStudy <em>Research Study</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getResearchSubject <em>Research Subject</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getRiskAssessment <em>Risk Assessment</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getSearchParameter <em>Search Parameter</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getServiceRequest <em>Service Request</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getSlot <em>Slot</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getSpecimenDefinition <em>Specimen Definition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getStructureDefinition <em>Structure Definition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getStructureMap <em>Structure Map</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getSubscription <em>Subscription</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getSubscriptionStatus <em>Subscription Status</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getSubscriptionTopic <em>Subscription Topic</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getSubstance <em>Substance</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getSubstanceDefinition <em>Substance Definition</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getSubstanceNucleicAcid <em>Substance Nucleic Acid</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getSubstancePolymer <em>Substance Polymer</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getSubstanceProtein <em>Substance Protein</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getSubstanceReferenceInformation <em>Substance Reference Information</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getSubstanceSourceMaterial <em>Substance Source Material</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getSupplyDelivery <em>Supply Delivery</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getSupplyRequest <em>Supply Request</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getTask <em>Task</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getTerminologyCapabilities <em>Terminology Capabilities</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getTestPlan <em>Test Plan</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getTestReport <em>Test Report</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getTestScript <em>Test Script</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getTransport <em>Transport</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getVerificationResult <em>Verification Result</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getVisionPrescription <em>Vision Prescription</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.impl.ResourceContainerImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceContainerImpl extends MinimalEObjectImpl.Container implements ResourceContainer {
	/**
	 * The cached value of the '{@link #getAccount() <em>Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected Account account;

	/**
	 * The cached value of the '{@link #getActivityDefinition() <em>Activity Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityDefinition()
	 * @generated
	 * @ordered
	 */
	protected ActivityDefinition activityDefinition;

	/**
	 * The cached value of the '{@link #getActorDefinition() <em>Actor Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorDefinition()
	 * @generated
	 * @ordered
	 */
	protected ActorDefinition actorDefinition;

	/**
	 * The cached value of the '{@link #getAdministrableProductDefinition() <em>Administrable Product Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrableProductDefinition()
	 * @generated
	 * @ordered
	 */
	protected AdministrableProductDefinition administrableProductDefinition;

	/**
	 * The cached value of the '{@link #getAdverseEvent() <em>Adverse Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdverseEvent()
	 * @generated
	 * @ordered
	 */
	protected AdverseEvent adverseEvent;

	/**
	 * The cached value of the '{@link #getAllergyIntolerance() <em>Allergy Intolerance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergyIntolerance()
	 * @generated
	 * @ordered
	 */
	protected AllergyIntolerance allergyIntolerance;

	/**
	 * The cached value of the '{@link #getAppointment() <em>Appointment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointment()
	 * @generated
	 * @ordered
	 */
	protected Appointment appointment;

	/**
	 * The cached value of the '{@link #getAppointmentResponse() <em>Appointment Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointmentResponse()
	 * @generated
	 * @ordered
	 */
	protected AppointmentResponse appointmentResponse;

	/**
	 * The cached value of the '{@link #getArtifactAssessment() <em>Artifact Assessment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactAssessment()
	 * @generated
	 * @ordered
	 */
	protected ArtifactAssessment artifactAssessment;

	/**
	 * The cached value of the '{@link #getAuditEvent() <em>Audit Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditEvent()
	 * @generated
	 * @ordered
	 */
	protected AuditEvent auditEvent;

	/**
	 * The cached value of the '{@link #getBasic() <em>Basic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasic()
	 * @generated
	 * @ordered
	 */
	protected Basic basic;

	/**
	 * The cached value of the '{@link #getBinary() <em>Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinary()
	 * @generated
	 * @ordered
	 */
	protected Binary binary;

	/**
	 * The cached value of the '{@link #getBiologicallyDerivedProduct() <em>Biologically Derived Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiologicallyDerivedProduct()
	 * @generated
	 * @ordered
	 */
	protected BiologicallyDerivedProduct biologicallyDerivedProduct;

	/**
	 * The cached value of the '{@link #getBiologicallyDerivedProductDispense() <em>Biologically Derived Product Dispense</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiologicallyDerivedProductDispense()
	 * @generated
	 * @ordered
	 */
	protected BiologicallyDerivedProductDispense biologicallyDerivedProductDispense;

	/**
	 * The cached value of the '{@link #getBodyStructure() <em>Body Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyStructure()
	 * @generated
	 * @ordered
	 */
	protected BodyStructure bodyStructure;

	/**
	 * The cached value of the '{@link #getBundle() <em>Bundle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundle()
	 * @generated
	 * @ordered
	 */
	protected Bundle bundle;

	/**
	 * The cached value of the '{@link #getCapabilityStatement() <em>Capability Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityStatement()
	 * @generated
	 * @ordered
	 */
	protected CapabilityStatement capabilityStatement;

	/**
	 * The cached value of the '{@link #getCarePlan() <em>Care Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarePlan()
	 * @generated
	 * @ordered
	 */
	protected CarePlan carePlan;

	/**
	 * The cached value of the '{@link #getCareTeam() <em>Care Team</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeam()
	 * @generated
	 * @ordered
	 */
	protected CareTeam careTeam;

	/**
	 * The cached value of the '{@link #getChargeItem() <em>Charge Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeItem()
	 * @generated
	 * @ordered
	 */
	protected ChargeItem chargeItem;

	/**
	 * The cached value of the '{@link #getChargeItemDefinition() <em>Charge Item Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeItemDefinition()
	 * @generated
	 * @ordered
	 */
	protected ChargeItemDefinition chargeItemDefinition;

	/**
	 * The cached value of the '{@link #getCitation() <em>Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitation()
	 * @generated
	 * @ordered
	 */
	protected Citation citation;

	/**
	 * The cached value of the '{@link #getClaim() <em>Claim</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaim()
	 * @generated
	 * @ordered
	 */
	protected Claim claim;

	/**
	 * The cached value of the '{@link #getClaimResponse() <em>Claim Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimResponse()
	 * @generated
	 * @ordered
	 */
	protected ClaimResponse claimResponse;

	/**
	 * The cached value of the '{@link #getClinicalImpression() <em>Clinical Impression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalImpression()
	 * @generated
	 * @ordered
	 */
	protected ClinicalImpression clinicalImpression;

	/**
	 * The cached value of the '{@link #getClinicalUseDefinition() <em>Clinical Use Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalUseDefinition()
	 * @generated
	 * @ordered
	 */
	protected ClinicalUseDefinition clinicalUseDefinition;

	/**
	 * The cached value of the '{@link #getCodeSystem() <em>Code System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected CodeSystem codeSystem;

	/**
	 * The cached value of the '{@link #getCommunication() <em>Communication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication()
	 * @generated
	 * @ordered
	 */
	protected Communication communication;

	/**
	 * The cached value of the '{@link #getCommunicationRequest() <em>Communication Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationRequest()
	 * @generated
	 * @ordered
	 */
	protected CommunicationRequest communicationRequest;

	/**
	 * The cached value of the '{@link #getCompartmentDefinition() <em>Compartment Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartmentDefinition()
	 * @generated
	 * @ordered
	 */
	protected CompartmentDefinition compartmentDefinition;

	/**
	 * The cached value of the '{@link #getComposition() <em>Composition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposition()
	 * @generated
	 * @ordered
	 */
	protected Composition composition;

	/**
	 * The cached value of the '{@link #getConceptMap() <em>Concept Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptMap()
	 * @generated
	 * @ordered
	 */
	protected ConceptMap conceptMap;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The cached value of the '{@link #getConditionDefinition() <em>Condition Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionDefinition()
	 * @generated
	 * @ordered
	 */
	protected ConditionDefinition conditionDefinition;

	/**
	 * The cached value of the '{@link #getConsent() <em>Consent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsent()
	 * @generated
	 * @ordered
	 */
	protected Consent consent;

	/**
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected Contract contract;

	/**
	 * The cached value of the '{@link #getCoverage() <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected Coverage coverage;

	/**
	 * The cached value of the '{@link #getCoverageEligibilityRequest() <em>Coverage Eligibility Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageEligibilityRequest()
	 * @generated
	 * @ordered
	 */
	protected CoverageEligibilityRequest coverageEligibilityRequest;

	/**
	 * The cached value of the '{@link #getCoverageEligibilityResponse() <em>Coverage Eligibility Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageEligibilityResponse()
	 * @generated
	 * @ordered
	 */
	protected CoverageEligibilityResponse coverageEligibilityResponse;

	/**
	 * The cached value of the '{@link #getDetectedIssue() <em>Detected Issue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetectedIssue()
	 * @generated
	 * @ordered
	 */
	protected DetectedIssue detectedIssue;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected Device device;

	/**
	 * The cached value of the '{@link #getDeviceAssociation() <em>Device Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceAssociation()
	 * @generated
	 * @ordered
	 */
	protected DeviceAssociation deviceAssociation;

	/**
	 * The cached value of the '{@link #getDeviceDefinition() <em>Device Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceDefinition()
	 * @generated
	 * @ordered
	 */
	protected DeviceDefinition deviceDefinition;

	/**
	 * The cached value of the '{@link #getDeviceDispense() <em>Device Dispense</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceDispense()
	 * @generated
	 * @ordered
	 */
	protected DeviceDispense deviceDispense;

	/**
	 * The cached value of the '{@link #getDeviceMetric() <em>Device Metric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceMetric()
	 * @generated
	 * @ordered
	 */
	protected DeviceMetric deviceMetric;

	/**
	 * The cached value of the '{@link #getDeviceRequest() <em>Device Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceRequest()
	 * @generated
	 * @ordered
	 */
	protected DeviceRequest deviceRequest;

	/**
	 * The cached value of the '{@link #getDeviceUsage() <em>Device Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceUsage()
	 * @generated
	 * @ordered
	 */
	protected DeviceUsage deviceUsage;

	/**
	 * The cached value of the '{@link #getDiagnosticReport() <em>Diagnostic Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticReport()
	 * @generated
	 * @ordered
	 */
	protected DiagnosticReport diagnosticReport;

	/**
	 * The cached value of the '{@link #getDocumentReference() <em>Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected DocumentReference documentReference;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Encounter encounter;

	/**
	 * The cached value of the '{@link #getEncounterHistory() <em>Encounter History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounterHistory()
	 * @generated
	 * @ordered
	 */
	protected EncounterHistory encounterHistory;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected Endpoint endpoint;

	/**
	 * The cached value of the '{@link #getEnrollmentRequest() <em>Enrollment Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrollmentRequest()
	 * @generated
	 * @ordered
	 */
	protected EnrollmentRequest enrollmentRequest;

	/**
	 * The cached value of the '{@link #getEnrollmentResponse() <em>Enrollment Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrollmentResponse()
	 * @generated
	 * @ordered
	 */
	protected EnrollmentResponse enrollmentResponse;

	/**
	 * The cached value of the '{@link #getEpisodeOfCare() <em>Episode Of Care</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisodeOfCare()
	 * @generated
	 * @ordered
	 */
	protected EpisodeOfCare episodeOfCare;

	/**
	 * The cached value of the '{@link #getEventDefinition() <em>Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDefinition()
	 * @generated
	 * @ordered
	 */
	protected EventDefinition eventDefinition;

	/**
	 * The cached value of the '{@link #getEvidence() <em>Evidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidence()
	 * @generated
	 * @ordered
	 */
	protected Evidence evidence;

	/**
	 * The cached value of the '{@link #getEvidenceReport() <em>Evidence Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidenceReport()
	 * @generated
	 * @ordered
	 */
	protected EvidenceReport evidenceReport;

	/**
	 * The cached value of the '{@link #getEvidenceVariable() <em>Evidence Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidenceVariable()
	 * @generated
	 * @ordered
	 */
	protected EvidenceVariable evidenceVariable;

	/**
	 * The cached value of the '{@link #getExampleScenario() <em>Example Scenario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleScenario()
	 * @generated
	 * @ordered
	 */
	protected ExampleScenario exampleScenario;

	/**
	 * The cached value of the '{@link #getExplanationOfBenefit() <em>Explanation Of Benefit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplanationOfBenefit()
	 * @generated
	 * @ordered
	 */
	protected ExplanationOfBenefit explanationOfBenefit;

	/**
	 * The cached value of the '{@link #getFamilyMemberHistory() <em>Family Member History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyMemberHistory()
	 * @generated
	 * @ordered
	 */
	protected FamilyMemberHistory familyMemberHistory;

	/**
	 * The cached value of the '{@link #getFlag() <em>Flag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlag()
	 * @generated
	 * @ordered
	 */
	protected Flag flag;

	/**
	 * The cached value of the '{@link #getFormularyItem() <em>Formulary Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormularyItem()
	 * @generated
	 * @ordered
	 */
	protected FormularyItem formularyItem;

	/**
	 * The cached value of the '{@link #getGenomicStudy() <em>Genomic Study</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenomicStudy()
	 * @generated
	 * @ordered
	 */
	protected GenomicStudy genomicStudy;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected Goal goal;

	/**
	 * The cached value of the '{@link #getGraphDefinition() <em>Graph Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphDefinition()
	 * @generated
	 * @ordered
	 */
	protected GraphDefinition graphDefinition;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected Group group;

	/**
	 * The cached value of the '{@link #getGuidanceResponse() <em>Guidance Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuidanceResponse()
	 * @generated
	 * @ordered
	 */
	protected GuidanceResponse guidanceResponse;

	/**
	 * The cached value of the '{@link #getHealthcareService() <em>Healthcare Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthcareService()
	 * @generated
	 * @ordered
	 */
	protected HealthcareService healthcareService;

	/**
	 * The cached value of the '{@link #getImagingSelection() <em>Imaging Selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagingSelection()
	 * @generated
	 * @ordered
	 */
	protected ImagingSelection imagingSelection;

	/**
	 * The cached value of the '{@link #getImagingStudy() <em>Imaging Study</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagingStudy()
	 * @generated
	 * @ordered
	 */
	protected ImagingStudy imagingStudy;

	/**
	 * The cached value of the '{@link #getImmunization() <em>Immunization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunization()
	 * @generated
	 * @ordered
	 */
	protected Immunization immunization;

	/**
	 * The cached value of the '{@link #getImmunizationEvaluation() <em>Immunization Evaluation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationEvaluation()
	 * @generated
	 * @ordered
	 */
	protected ImmunizationEvaluation immunizationEvaluation;

	/**
	 * The cached value of the '{@link #getImmunizationRecommendation() <em>Immunization Recommendation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationRecommendation()
	 * @generated
	 * @ordered
	 */
	protected ImmunizationRecommendation immunizationRecommendation;

	/**
	 * The cached value of the '{@link #getImplementationGuide() <em>Implementation Guide</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationGuide()
	 * @generated
	 * @ordered
	 */
	protected ImplementationGuide implementationGuide;

	/**
	 * The cached value of the '{@link #getIngredient() <em>Ingredient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredient()
	 * @generated
	 * @ordered
	 */
	protected Ingredient ingredient;

	/**
	 * The cached value of the '{@link #getInsurancePlan() <em>Insurance Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurancePlan()
	 * @generated
	 * @ordered
	 */
	protected InsurancePlan insurancePlan;

	/**
	 * The cached value of the '{@link #getInventoryItem() <em>Inventory Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItem()
	 * @generated
	 * @ordered
	 */
	protected InventoryItem inventoryItem;

	/**
	 * The cached value of the '{@link #getInventoryReport() <em>Inventory Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryReport()
	 * @generated
	 * @ordered
	 */
	protected InventoryReport inventoryReport;

	/**
	 * The cached value of the '{@link #getInvoice() <em>Invoice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoice()
	 * @generated
	 * @ordered
	 */
	protected Invoice invoice;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected Library library;

	/**
	 * The cached value of the '{@link #getLinkage() <em>Linkage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkage()
	 * @generated
	 * @ordered
	 */
	protected Linkage linkage;

	/**
	 * The cached value of the '{@link #getList() <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList()
	 * @generated
	 * @ordered
	 */
	protected List list;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getManufacturedItemDefinition() <em>Manufactured Item Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturedItemDefinition()
	 * @generated
	 * @ordered
	 */
	protected ManufacturedItemDefinition manufacturedItemDefinition;

	/**
	 * The cached value of the '{@link #getMeasure() <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasure()
	 * @generated
	 * @ordered
	 */
	protected Measure measure;

	/**
	 * The cached value of the '{@link #getMeasureReport() <em>Measure Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureReport()
	 * @generated
	 * @ordered
	 */
	protected MeasureReport measureReport;

	/**
	 * The cached value of the '{@link #getMedication() <em>Medication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedication()
	 * @generated
	 * @ordered
	 */
	protected Medication medication;

	/**
	 * The cached value of the '{@link #getMedicationAdministration() <em>Medication Administration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationAdministration()
	 * @generated
	 * @ordered
	 */
	protected MedicationAdministration medicationAdministration;

	/**
	 * The cached value of the '{@link #getMedicationDispense() <em>Medication Dispense</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationDispense()
	 * @generated
	 * @ordered
	 */
	protected MedicationDispense medicationDispense;

	/**
	 * The cached value of the '{@link #getMedicationKnowledge() <em>Medication Knowledge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationKnowledge()
	 * @generated
	 * @ordered
	 */
	protected MedicationKnowledge medicationKnowledge;

	/**
	 * The cached value of the '{@link #getMedicationRequest() <em>Medication Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationRequest()
	 * @generated
	 * @ordered
	 */
	protected MedicationRequest medicationRequest;

	/**
	 * The cached value of the '{@link #getMedicationStatement() <em>Medication Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationStatement()
	 * @generated
	 * @ordered
	 */
	protected MedicationStatement medicationStatement;

	/**
	 * The cached value of the '{@link #getMedicinalProductDefinition() <em>Medicinal Product Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicinalProductDefinition()
	 * @generated
	 * @ordered
	 */
	protected MedicinalProductDefinition medicinalProductDefinition;

	/**
	 * The cached value of the '{@link #getMessageDefinition() <em>Message Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDefinition()
	 * @generated
	 * @ordered
	 */
	protected MessageDefinition messageDefinition;

	/**
	 * The cached value of the '{@link #getMessageHeader() <em>Message Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageHeader()
	 * @generated
	 * @ordered
	 */
	protected MessageHeader messageHeader;

	/**
	 * The cached value of the '{@link #getMolecularSequence() <em>Molecular Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMolecularSequence()
	 * @generated
	 * @ordered
	 */
	protected MolecularSequence molecularSequence;

	/**
	 * The cached value of the '{@link #getNamingSystem() <em>Naming System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamingSystem()
	 * @generated
	 * @ordered
	 */
	protected NamingSystem namingSystem;

	/**
	 * The cached value of the '{@link #getNutritionIntake() <em>Nutrition Intake</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionIntake()
	 * @generated
	 * @ordered
	 */
	protected NutritionIntake nutritionIntake;

	/**
	 * The cached value of the '{@link #getNutritionOrder() <em>Nutrition Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionOrder()
	 * @generated
	 * @ordered
	 */
	protected NutritionOrder nutritionOrder;

	/**
	 * The cached value of the '{@link #getNutritionProduct() <em>Nutrition Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionProduct()
	 * @generated
	 * @ordered
	 */
	protected NutritionProduct nutritionProduct;

	/**
	 * The cached value of the '{@link #getObservation() <em>Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation()
	 * @generated
	 * @ordered
	 */
	protected Observation observation;

	/**
	 * The cached value of the '{@link #getObservationDefinition() <em>Observation Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationDefinition()
	 * @generated
	 * @ordered
	 */
	protected ObservationDefinition observationDefinition;

	/**
	 * The cached value of the '{@link #getOperationDefinition() <em>Operation Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationDefinition()
	 * @generated
	 * @ordered
	 */
	protected OperationDefinition operationDefinition;

	/**
	 * The cached value of the '{@link #getOperationOutcome() <em>Operation Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationOutcome()
	 * @generated
	 * @ordered
	 */
	protected OperationOutcome operationOutcome;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization organization;

	/**
	 * The cached value of the '{@link #getOrganizationAffiliation() <em>Organization Affiliation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationAffiliation()
	 * @generated
	 * @ordered
	 */
	protected OrganizationAffiliation organizationAffiliation;

	/**
	 * The cached value of the '{@link #getPackagedProductDefinition() <em>Packaged Product Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagedProductDefinition()
	 * @generated
	 * @ordered
	 */
	protected PackagedProductDefinition packagedProductDefinition;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Patient patient;

	/**
	 * The cached value of the '{@link #getPaymentNotice() <em>Payment Notice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentNotice()
	 * @generated
	 * @ordered
	 */
	protected PaymentNotice paymentNotice;

	/**
	 * The cached value of the '{@link #getPaymentReconciliation() <em>Payment Reconciliation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentReconciliation()
	 * @generated
	 * @ordered
	 */
	protected PaymentReconciliation paymentReconciliation;

	/**
	 * The cached value of the '{@link #getPermission() <em>Permission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission()
	 * @generated
	 * @ordered
	 */
	protected Permission permission;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected Person person;

	/**
	 * The cached value of the '{@link #getPlanDefinition() <em>Plan Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanDefinition()
	 * @generated
	 * @ordered
	 */
	protected PlanDefinition planDefinition;

	/**
	 * The cached value of the '{@link #getPractitioner() <em>Practitioner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPractitioner()
	 * @generated
	 * @ordered
	 */
	protected Practitioner practitioner;

	/**
	 * The cached value of the '{@link #getPractitionerRole() <em>Practitioner Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPractitionerRole()
	 * @generated
	 * @ordered
	 */
	protected PractitionerRole practitionerRole;

	/**
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected Procedure procedure;

	/**
	 * The cached value of the '{@link #getProvenance() <em>Provenance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvenance()
	 * @generated
	 * @ordered
	 */
	protected Provenance provenance;

	/**
	 * The cached value of the '{@link #getQuestionnaire() <em>Questionnaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionnaire()
	 * @generated
	 * @ordered
	 */
	protected Questionnaire questionnaire;

	/**
	 * The cached value of the '{@link #getQuestionnaireResponse() <em>Questionnaire Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionnaireResponse()
	 * @generated
	 * @ordered
	 */
	protected QuestionnaireResponse questionnaireResponse;

	/**
	 * The cached value of the '{@link #getRegulatedAuthorization() <em>Regulated Authorization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatedAuthorization()
	 * @generated
	 * @ordered
	 */
	protected RegulatedAuthorization regulatedAuthorization;

	/**
	 * The cached value of the '{@link #getRelatedPerson() <em>Related Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedPerson()
	 * @generated
	 * @ordered
	 */
	protected RelatedPerson relatedPerson;

	/**
	 * The cached value of the '{@link #getRequestOrchestration() <em>Request Orchestration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestOrchestration()
	 * @generated
	 * @ordered
	 */
	protected RequestOrchestration requestOrchestration;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected Requirements requirements;

	/**
	 * The cached value of the '{@link #getResearchStudy() <em>Research Study</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResearchStudy()
	 * @generated
	 * @ordered
	 */
	protected ResearchStudy researchStudy;

	/**
	 * The cached value of the '{@link #getResearchSubject() <em>Research Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResearchSubject()
	 * @generated
	 * @ordered
	 */
	protected ResearchSubject researchSubject;

	/**
	 * The cached value of the '{@link #getRiskAssessment() <em>Risk Assessment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskAssessment()
	 * @generated
	 * @ordered
	 */
	protected RiskAssessment riskAssessment;

	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected Schedule schedule;

	/**
	 * The cached value of the '{@link #getSearchParameter() <em>Search Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchParameter()
	 * @generated
	 * @ordered
	 */
	protected SearchParameter searchParameter;

	/**
	 * The cached value of the '{@link #getServiceRequest() <em>Service Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceRequest()
	 * @generated
	 * @ordered
	 */
	protected ServiceRequest serviceRequest;

	/**
	 * The cached value of the '{@link #getSlot() <em>Slot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlot()
	 * @generated
	 * @ordered
	 */
	protected Slot slot;

	/**
	 * The cached value of the '{@link #getSpecimen() <em>Specimen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimen()
	 * @generated
	 * @ordered
	 */
	protected Specimen specimen;

	/**
	 * The cached value of the '{@link #getSpecimenDefinition() <em>Specimen Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenDefinition()
	 * @generated
	 * @ordered
	 */
	protected SpecimenDefinition specimenDefinition;

	/**
	 * The cached value of the '{@link #getStructureDefinition() <em>Structure Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureDefinition()
	 * @generated
	 * @ordered
	 */
	protected StructureDefinition structureDefinition;

	/**
	 * The cached value of the '{@link #getStructureMap() <em>Structure Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureMap()
	 * @generated
	 * @ordered
	 */
	protected StructureMap structureMap;

	/**
	 * The cached value of the '{@link #getSubscription() <em>Subscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscription()
	 * @generated
	 * @ordered
	 */
	protected Subscription subscription;

	/**
	 * The cached value of the '{@link #getSubscriptionStatus() <em>Subscription Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionStatus()
	 * @generated
	 * @ordered
	 */
	protected SubscriptionStatus subscriptionStatus;

	/**
	 * The cached value of the '{@link #getSubscriptionTopic() <em>Subscription Topic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionTopic()
	 * @generated
	 * @ordered
	 */
	protected SubscriptionTopic subscriptionTopic;

	/**
	 * The cached value of the '{@link #getSubstance() <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstance()
	 * @generated
	 * @ordered
	 */
	protected Substance substance;

	/**
	 * The cached value of the '{@link #getSubstanceDefinition() <em>Substance Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceDefinition()
	 * @generated
	 * @ordered
	 */
	protected SubstanceDefinition substanceDefinition;

	/**
	 * The cached value of the '{@link #getSubstanceNucleicAcid() <em>Substance Nucleic Acid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceNucleicAcid()
	 * @generated
	 * @ordered
	 */
	protected SubstanceNucleicAcid substanceNucleicAcid;

	/**
	 * The cached value of the '{@link #getSubstancePolymer() <em>Substance Polymer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstancePolymer()
	 * @generated
	 * @ordered
	 */
	protected SubstancePolymer substancePolymer;

	/**
	 * The cached value of the '{@link #getSubstanceProtein() <em>Substance Protein</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceProtein()
	 * @generated
	 * @ordered
	 */
	protected SubstanceProtein substanceProtein;

	/**
	 * The cached value of the '{@link #getSubstanceReferenceInformation() <em>Substance Reference Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceReferenceInformation()
	 * @generated
	 * @ordered
	 */
	protected SubstanceReferenceInformation substanceReferenceInformation;

	/**
	 * The cached value of the '{@link #getSubstanceSourceMaterial() <em>Substance Source Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceSourceMaterial()
	 * @generated
	 * @ordered
	 */
	protected SubstanceSourceMaterial substanceSourceMaterial;

	/**
	 * The cached value of the '{@link #getSupplyDelivery() <em>Supply Delivery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyDelivery()
	 * @generated
	 * @ordered
	 */
	protected SupplyDelivery supplyDelivery;

	/**
	 * The cached value of the '{@link #getSupplyRequest() <em>Supply Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyRequest()
	 * @generated
	 * @ordered
	 */
	protected SupplyRequest supplyRequest;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected Task task;

	/**
	 * The cached value of the '{@link #getTerminologyCapabilities() <em>Terminology Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminologyCapabilities()
	 * @generated
	 * @ordered
	 */
	protected TerminologyCapabilities terminologyCapabilities;

	/**
	 * The cached value of the '{@link #getTestPlan() <em>Test Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestPlan()
	 * @generated
	 * @ordered
	 */
	protected TestPlan testPlan;

	/**
	 * The cached value of the '{@link #getTestReport() <em>Test Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestReport()
	 * @generated
	 * @ordered
	 */
	protected TestReport testReport;

	/**
	 * The cached value of the '{@link #getTestScript() <em>Test Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestScript()
	 * @generated
	 * @ordered
	 */
	protected TestScript testScript;

	/**
	 * The cached value of the '{@link #getTransport() <em>Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransport()
	 * @generated
	 * @ordered
	 */
	protected Transport transport;

	/**
	 * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected ValueSet valueSet;

	/**
	 * The cached value of the '{@link #getVerificationResult() <em>Verification Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationResult()
	 * @generated
	 * @ordered
	 */
	protected VerificationResult verificationResult;

	/**
	 * The cached value of the '{@link #getVisionPrescription() <em>Vision Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisionPrescription()
	 * @generated
	 * @ordered
	 */
	protected VisionPrescription visionPrescription;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected Parameters parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getResourceContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Account getAccount() {
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccount(Account newAccount, NotificationChain msgs) {
		Account oldAccount = account;
		account = newAccount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ACCOUNT, oldAccount, newAccount);
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
	public void setAccount(Account newAccount) {
		if (newAccount != account) {
			NotificationChain msgs = null;
			if (account != null)
				msgs = ((InternalEObject)account).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ACCOUNT, null, msgs);
			if (newAccount != null)
				msgs = ((InternalEObject)newAccount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ACCOUNT, null, msgs);
			msgs = basicSetAccount(newAccount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ACCOUNT, newAccount, newAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityDefinition getActivityDefinition() {
		return activityDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityDefinition(ActivityDefinition newActivityDefinition, NotificationChain msgs) {
		ActivityDefinition oldActivityDefinition = activityDefinition;
		activityDefinition = newActivityDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ACTIVITY_DEFINITION, oldActivityDefinition, newActivityDefinition);
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
	public void setActivityDefinition(ActivityDefinition newActivityDefinition) {
		if (newActivityDefinition != activityDefinition) {
			NotificationChain msgs = null;
			if (activityDefinition != null)
				msgs = ((InternalEObject)activityDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ACTIVITY_DEFINITION, null, msgs);
			if (newActivityDefinition != null)
				msgs = ((InternalEObject)newActivityDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ACTIVITY_DEFINITION, null, msgs);
			msgs = basicSetActivityDefinition(newActivityDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ACTIVITY_DEFINITION, newActivityDefinition, newActivityDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActorDefinition getActorDefinition() {
		return actorDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActorDefinition(ActorDefinition newActorDefinition, NotificationChain msgs) {
		ActorDefinition oldActorDefinition = actorDefinition;
		actorDefinition = newActorDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ACTOR_DEFINITION, oldActorDefinition, newActorDefinition);
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
	public void setActorDefinition(ActorDefinition newActorDefinition) {
		if (newActorDefinition != actorDefinition) {
			NotificationChain msgs = null;
			if (actorDefinition != null)
				msgs = ((InternalEObject)actorDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ACTOR_DEFINITION, null, msgs);
			if (newActorDefinition != null)
				msgs = ((InternalEObject)newActorDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ACTOR_DEFINITION, null, msgs);
			msgs = basicSetActorDefinition(newActorDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ACTOR_DEFINITION, newActorDefinition, newActorDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdministrableProductDefinition getAdministrableProductDefinition() {
		return administrableProductDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdministrableProductDefinition(AdministrableProductDefinition newAdministrableProductDefinition, NotificationChain msgs) {
		AdministrableProductDefinition oldAdministrableProductDefinition = administrableProductDefinition;
		administrableProductDefinition = newAdministrableProductDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ADMINISTRABLE_PRODUCT_DEFINITION, oldAdministrableProductDefinition, newAdministrableProductDefinition);
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
	public void setAdministrableProductDefinition(AdministrableProductDefinition newAdministrableProductDefinition) {
		if (newAdministrableProductDefinition != administrableProductDefinition) {
			NotificationChain msgs = null;
			if (administrableProductDefinition != null)
				msgs = ((InternalEObject)administrableProductDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ADMINISTRABLE_PRODUCT_DEFINITION, null, msgs);
			if (newAdministrableProductDefinition != null)
				msgs = ((InternalEObject)newAdministrableProductDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ADMINISTRABLE_PRODUCT_DEFINITION, null, msgs);
			msgs = basicSetAdministrableProductDefinition(newAdministrableProductDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ADMINISTRABLE_PRODUCT_DEFINITION, newAdministrableProductDefinition, newAdministrableProductDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdverseEvent getAdverseEvent() {
		return adverseEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdverseEvent(AdverseEvent newAdverseEvent, NotificationChain msgs) {
		AdverseEvent oldAdverseEvent = adverseEvent;
		adverseEvent = newAdverseEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ADVERSE_EVENT, oldAdverseEvent, newAdverseEvent);
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
	public void setAdverseEvent(AdverseEvent newAdverseEvent) {
		if (newAdverseEvent != adverseEvent) {
			NotificationChain msgs = null;
			if (adverseEvent != null)
				msgs = ((InternalEObject)adverseEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ADVERSE_EVENT, null, msgs);
			if (newAdverseEvent != null)
				msgs = ((InternalEObject)newAdverseEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ADVERSE_EVENT, null, msgs);
			msgs = basicSetAdverseEvent(newAdverseEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ADVERSE_EVENT, newAdverseEvent, newAdverseEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyIntolerance getAllergyIntolerance() {
		return allergyIntolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllergyIntolerance(AllergyIntolerance newAllergyIntolerance, NotificationChain msgs) {
		AllergyIntolerance oldAllergyIntolerance = allergyIntolerance;
		allergyIntolerance = newAllergyIntolerance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ALLERGY_INTOLERANCE, oldAllergyIntolerance, newAllergyIntolerance);
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
	public void setAllergyIntolerance(AllergyIntolerance newAllergyIntolerance) {
		if (newAllergyIntolerance != allergyIntolerance) {
			NotificationChain msgs = null;
			if (allergyIntolerance != null)
				msgs = ((InternalEObject)allergyIntolerance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ALLERGY_INTOLERANCE, null, msgs);
			if (newAllergyIntolerance != null)
				msgs = ((InternalEObject)newAllergyIntolerance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ALLERGY_INTOLERANCE, null, msgs);
			msgs = basicSetAllergyIntolerance(newAllergyIntolerance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ALLERGY_INTOLERANCE, newAllergyIntolerance, newAllergyIntolerance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Appointment getAppointment() {
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppointment(Appointment newAppointment, NotificationChain msgs) {
		Appointment oldAppointment = appointment;
		appointment = newAppointment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__APPOINTMENT, oldAppointment, newAppointment);
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
	public void setAppointment(Appointment newAppointment) {
		if (newAppointment != appointment) {
			NotificationChain msgs = null;
			if (appointment != null)
				msgs = ((InternalEObject)appointment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__APPOINTMENT, null, msgs);
			if (newAppointment != null)
				msgs = ((InternalEObject)newAppointment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__APPOINTMENT, null, msgs);
			msgs = basicSetAppointment(newAppointment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__APPOINTMENT, newAppointment, newAppointment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppointmentResponse getAppointmentResponse() {
		return appointmentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppointmentResponse(AppointmentResponse newAppointmentResponse, NotificationChain msgs) {
		AppointmentResponse oldAppointmentResponse = appointmentResponse;
		appointmentResponse = newAppointmentResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__APPOINTMENT_RESPONSE, oldAppointmentResponse, newAppointmentResponse);
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
	public void setAppointmentResponse(AppointmentResponse newAppointmentResponse) {
		if (newAppointmentResponse != appointmentResponse) {
			NotificationChain msgs = null;
			if (appointmentResponse != null)
				msgs = ((InternalEObject)appointmentResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__APPOINTMENT_RESPONSE, null, msgs);
			if (newAppointmentResponse != null)
				msgs = ((InternalEObject)newAppointmentResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__APPOINTMENT_RESPONSE, null, msgs);
			msgs = basicSetAppointmentResponse(newAppointmentResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__APPOINTMENT_RESPONSE, newAppointmentResponse, newAppointmentResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtifactAssessment getArtifactAssessment() {
		return artifactAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifactAssessment(ArtifactAssessment newArtifactAssessment, NotificationChain msgs) {
		ArtifactAssessment oldArtifactAssessment = artifactAssessment;
		artifactAssessment = newArtifactAssessment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ARTIFACT_ASSESSMENT, oldArtifactAssessment, newArtifactAssessment);
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
	public void setArtifactAssessment(ArtifactAssessment newArtifactAssessment) {
		if (newArtifactAssessment != artifactAssessment) {
			NotificationChain msgs = null;
			if (artifactAssessment != null)
				msgs = ((InternalEObject)artifactAssessment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ARTIFACT_ASSESSMENT, null, msgs);
			if (newArtifactAssessment != null)
				msgs = ((InternalEObject)newArtifactAssessment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ARTIFACT_ASSESSMENT, null, msgs);
			msgs = basicSetArtifactAssessment(newArtifactAssessment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ARTIFACT_ASSESSMENT, newArtifactAssessment, newArtifactAssessment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuditEvent getAuditEvent() {
		return auditEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuditEvent(AuditEvent newAuditEvent, NotificationChain msgs) {
		AuditEvent oldAuditEvent = auditEvent;
		auditEvent = newAuditEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__AUDIT_EVENT, oldAuditEvent, newAuditEvent);
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
	public void setAuditEvent(AuditEvent newAuditEvent) {
		if (newAuditEvent != auditEvent) {
			NotificationChain msgs = null;
			if (auditEvent != null)
				msgs = ((InternalEObject)auditEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__AUDIT_EVENT, null, msgs);
			if (newAuditEvent != null)
				msgs = ((InternalEObject)newAuditEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__AUDIT_EVENT, null, msgs);
			msgs = basicSetAuditEvent(newAuditEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__AUDIT_EVENT, newAuditEvent, newAuditEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basic getBasic() {
		return basic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasic(Basic newBasic, NotificationChain msgs) {
		Basic oldBasic = basic;
		basic = newBasic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__BASIC, oldBasic, newBasic);
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
	public void setBasic(Basic newBasic) {
		if (newBasic != basic) {
			NotificationChain msgs = null;
			if (basic != null)
				msgs = ((InternalEObject)basic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__BASIC, null, msgs);
			if (newBasic != null)
				msgs = ((InternalEObject)newBasic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__BASIC, null, msgs);
			msgs = basicSetBasic(newBasic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__BASIC, newBasic, newBasic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Binary getBinary() {
		return binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinary(Binary newBinary, NotificationChain msgs) {
		Binary oldBinary = binary;
		binary = newBinary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__BINARY, oldBinary, newBinary);
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
	public void setBinary(Binary newBinary) {
		if (newBinary != binary) {
			NotificationChain msgs = null;
			if (binary != null)
				msgs = ((InternalEObject)binary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__BINARY, null, msgs);
			if (newBinary != null)
				msgs = ((InternalEObject)newBinary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__BINARY, null, msgs);
			msgs = basicSetBinary(newBinary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__BINARY, newBinary, newBinary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiologicallyDerivedProduct getBiologicallyDerivedProduct() {
		return biologicallyDerivedProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBiologicallyDerivedProduct(BiologicallyDerivedProduct newBiologicallyDerivedProduct, NotificationChain msgs) {
		BiologicallyDerivedProduct oldBiologicallyDerivedProduct = biologicallyDerivedProduct;
		biologicallyDerivedProduct = newBiologicallyDerivedProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__BIOLOGICALLY_DERIVED_PRODUCT, oldBiologicallyDerivedProduct, newBiologicallyDerivedProduct);
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
	public void setBiologicallyDerivedProduct(BiologicallyDerivedProduct newBiologicallyDerivedProduct) {
		if (newBiologicallyDerivedProduct != biologicallyDerivedProduct) {
			NotificationChain msgs = null;
			if (biologicallyDerivedProduct != null)
				msgs = ((InternalEObject)biologicallyDerivedProduct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__BIOLOGICALLY_DERIVED_PRODUCT, null, msgs);
			if (newBiologicallyDerivedProduct != null)
				msgs = ((InternalEObject)newBiologicallyDerivedProduct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__BIOLOGICALLY_DERIVED_PRODUCT, null, msgs);
			msgs = basicSetBiologicallyDerivedProduct(newBiologicallyDerivedProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__BIOLOGICALLY_DERIVED_PRODUCT, newBiologicallyDerivedProduct, newBiologicallyDerivedProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiologicallyDerivedProductDispense getBiologicallyDerivedProductDispense() {
		return biologicallyDerivedProductDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBiologicallyDerivedProductDispense(BiologicallyDerivedProductDispense newBiologicallyDerivedProductDispense, NotificationChain msgs) {
		BiologicallyDerivedProductDispense oldBiologicallyDerivedProductDispense = biologicallyDerivedProductDispense;
		biologicallyDerivedProductDispense = newBiologicallyDerivedProductDispense;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE, oldBiologicallyDerivedProductDispense, newBiologicallyDerivedProductDispense);
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
	public void setBiologicallyDerivedProductDispense(BiologicallyDerivedProductDispense newBiologicallyDerivedProductDispense) {
		if (newBiologicallyDerivedProductDispense != biologicallyDerivedProductDispense) {
			NotificationChain msgs = null;
			if (biologicallyDerivedProductDispense != null)
				msgs = ((InternalEObject)biologicallyDerivedProductDispense).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE, null, msgs);
			if (newBiologicallyDerivedProductDispense != null)
				msgs = ((InternalEObject)newBiologicallyDerivedProductDispense).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE, null, msgs);
			msgs = basicSetBiologicallyDerivedProductDispense(newBiologicallyDerivedProductDispense, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE, newBiologicallyDerivedProductDispense, newBiologicallyDerivedProductDispense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyStructure getBodyStructure() {
		return bodyStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodyStructure(BodyStructure newBodyStructure, NotificationChain msgs) {
		BodyStructure oldBodyStructure = bodyStructure;
		bodyStructure = newBodyStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__BODY_STRUCTURE, oldBodyStructure, newBodyStructure);
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
	public void setBodyStructure(BodyStructure newBodyStructure) {
		if (newBodyStructure != bodyStructure) {
			NotificationChain msgs = null;
			if (bodyStructure != null)
				msgs = ((InternalEObject)bodyStructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__BODY_STRUCTURE, null, msgs);
			if (newBodyStructure != null)
				msgs = ((InternalEObject)newBodyStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__BODY_STRUCTURE, null, msgs);
			msgs = basicSetBodyStructure(newBodyStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__BODY_STRUCTURE, newBodyStructure, newBodyStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bundle getBundle() {
		return bundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBundle(Bundle newBundle, NotificationChain msgs) {
		Bundle oldBundle = bundle;
		bundle = newBundle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__BUNDLE, oldBundle, newBundle);
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
	public void setBundle(Bundle newBundle) {
		if (newBundle != bundle) {
			NotificationChain msgs = null;
			if (bundle != null)
				msgs = ((InternalEObject)bundle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__BUNDLE, null, msgs);
			if (newBundle != null)
				msgs = ((InternalEObject)newBundle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__BUNDLE, null, msgs);
			msgs = basicSetBundle(newBundle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__BUNDLE, newBundle, newBundle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatement getCapabilityStatement() {
		return capabilityStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapabilityStatement(CapabilityStatement newCapabilityStatement, NotificationChain msgs) {
		CapabilityStatement oldCapabilityStatement = capabilityStatement;
		capabilityStatement = newCapabilityStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CAPABILITY_STATEMENT, oldCapabilityStatement, newCapabilityStatement);
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
	public void setCapabilityStatement(CapabilityStatement newCapabilityStatement) {
		if (newCapabilityStatement != capabilityStatement) {
			NotificationChain msgs = null;
			if (capabilityStatement != null)
				msgs = ((InternalEObject)capabilityStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CAPABILITY_STATEMENT, null, msgs);
			if (newCapabilityStatement != null)
				msgs = ((InternalEObject)newCapabilityStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CAPABILITY_STATEMENT, null, msgs);
			msgs = basicSetCapabilityStatement(newCapabilityStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CAPABILITY_STATEMENT, newCapabilityStatement, newCapabilityStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarePlan getCarePlan() {
		return carePlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCarePlan(CarePlan newCarePlan, NotificationChain msgs) {
		CarePlan oldCarePlan = carePlan;
		carePlan = newCarePlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CARE_PLAN, oldCarePlan, newCarePlan);
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
	public void setCarePlan(CarePlan newCarePlan) {
		if (newCarePlan != carePlan) {
			NotificationChain msgs = null;
			if (carePlan != null)
				msgs = ((InternalEObject)carePlan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CARE_PLAN, null, msgs);
			if (newCarePlan != null)
				msgs = ((InternalEObject)newCarePlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CARE_PLAN, null, msgs);
			msgs = basicSetCarePlan(newCarePlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CARE_PLAN, newCarePlan, newCarePlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CareTeam getCareTeam() {
		return careTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCareTeam(CareTeam newCareTeam, NotificationChain msgs) {
		CareTeam oldCareTeam = careTeam;
		careTeam = newCareTeam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CARE_TEAM, oldCareTeam, newCareTeam);
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
	public void setCareTeam(CareTeam newCareTeam) {
		if (newCareTeam != careTeam) {
			NotificationChain msgs = null;
			if (careTeam != null)
				msgs = ((InternalEObject)careTeam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CARE_TEAM, null, msgs);
			if (newCareTeam != null)
				msgs = ((InternalEObject)newCareTeam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CARE_TEAM, null, msgs);
			msgs = basicSetCareTeam(newCareTeam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CARE_TEAM, newCareTeam, newCareTeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargeItem getChargeItem() {
		return chargeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChargeItem(ChargeItem newChargeItem, NotificationChain msgs) {
		ChargeItem oldChargeItem = chargeItem;
		chargeItem = newChargeItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CHARGE_ITEM, oldChargeItem, newChargeItem);
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
	public void setChargeItem(ChargeItem newChargeItem) {
		if (newChargeItem != chargeItem) {
			NotificationChain msgs = null;
			if (chargeItem != null)
				msgs = ((InternalEObject)chargeItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CHARGE_ITEM, null, msgs);
			if (newChargeItem != null)
				msgs = ((InternalEObject)newChargeItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CHARGE_ITEM, null, msgs);
			msgs = basicSetChargeItem(newChargeItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CHARGE_ITEM, newChargeItem, newChargeItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargeItemDefinition getChargeItemDefinition() {
		return chargeItemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChargeItemDefinition(ChargeItemDefinition newChargeItemDefinition, NotificationChain msgs) {
		ChargeItemDefinition oldChargeItemDefinition = chargeItemDefinition;
		chargeItemDefinition = newChargeItemDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CHARGE_ITEM_DEFINITION, oldChargeItemDefinition, newChargeItemDefinition);
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
	public void setChargeItemDefinition(ChargeItemDefinition newChargeItemDefinition) {
		if (newChargeItemDefinition != chargeItemDefinition) {
			NotificationChain msgs = null;
			if (chargeItemDefinition != null)
				msgs = ((InternalEObject)chargeItemDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CHARGE_ITEM_DEFINITION, null, msgs);
			if (newChargeItemDefinition != null)
				msgs = ((InternalEObject)newChargeItemDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CHARGE_ITEM_DEFINITION, null, msgs);
			msgs = basicSetChargeItemDefinition(newChargeItemDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CHARGE_ITEM_DEFINITION, newChargeItemDefinition, newChargeItemDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Citation getCitation() {
		return citation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCitation(Citation newCitation, NotificationChain msgs) {
		Citation oldCitation = citation;
		citation = newCitation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CITATION, oldCitation, newCitation);
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
	public void setCitation(Citation newCitation) {
		if (newCitation != citation) {
			NotificationChain msgs = null;
			if (citation != null)
				msgs = ((InternalEObject)citation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CITATION, null, msgs);
			if (newCitation != null)
				msgs = ((InternalEObject)newCitation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CITATION, null, msgs);
			msgs = basicSetCitation(newCitation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CITATION, newCitation, newCitation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Claim getClaim() {
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaim(Claim newClaim, NotificationChain msgs) {
		Claim oldClaim = claim;
		claim = newClaim;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CLAIM, oldClaim, newClaim);
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
	public void setClaim(Claim newClaim) {
		if (newClaim != claim) {
			NotificationChain msgs = null;
			if (claim != null)
				msgs = ((InternalEObject)claim).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CLAIM, null, msgs);
			if (newClaim != null)
				msgs = ((InternalEObject)newClaim).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CLAIM, null, msgs);
			msgs = basicSetClaim(newClaim, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CLAIM, newClaim, newClaim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponse getClaimResponse() {
		return claimResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaimResponse(ClaimResponse newClaimResponse, NotificationChain msgs) {
		ClaimResponse oldClaimResponse = claimResponse;
		claimResponse = newClaimResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CLAIM_RESPONSE, oldClaimResponse, newClaimResponse);
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
	public void setClaimResponse(ClaimResponse newClaimResponse) {
		if (newClaimResponse != claimResponse) {
			NotificationChain msgs = null;
			if (claimResponse != null)
				msgs = ((InternalEObject)claimResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CLAIM_RESPONSE, null, msgs);
			if (newClaimResponse != null)
				msgs = ((InternalEObject)newClaimResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CLAIM_RESPONSE, null, msgs);
			msgs = basicSetClaimResponse(newClaimResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CLAIM_RESPONSE, newClaimResponse, newClaimResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClinicalImpression getClinicalImpression() {
		return clinicalImpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClinicalImpression(ClinicalImpression newClinicalImpression, NotificationChain msgs) {
		ClinicalImpression oldClinicalImpression = clinicalImpression;
		clinicalImpression = newClinicalImpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CLINICAL_IMPRESSION, oldClinicalImpression, newClinicalImpression);
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
	public void setClinicalImpression(ClinicalImpression newClinicalImpression) {
		if (newClinicalImpression != clinicalImpression) {
			NotificationChain msgs = null;
			if (clinicalImpression != null)
				msgs = ((InternalEObject)clinicalImpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CLINICAL_IMPRESSION, null, msgs);
			if (newClinicalImpression != null)
				msgs = ((InternalEObject)newClinicalImpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CLINICAL_IMPRESSION, null, msgs);
			msgs = basicSetClinicalImpression(newClinicalImpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CLINICAL_IMPRESSION, newClinicalImpression, newClinicalImpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClinicalUseDefinition getClinicalUseDefinition() {
		return clinicalUseDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClinicalUseDefinition(ClinicalUseDefinition newClinicalUseDefinition, NotificationChain msgs) {
		ClinicalUseDefinition oldClinicalUseDefinition = clinicalUseDefinition;
		clinicalUseDefinition = newClinicalUseDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CLINICAL_USE_DEFINITION, oldClinicalUseDefinition, newClinicalUseDefinition);
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
	public void setClinicalUseDefinition(ClinicalUseDefinition newClinicalUseDefinition) {
		if (newClinicalUseDefinition != clinicalUseDefinition) {
			NotificationChain msgs = null;
			if (clinicalUseDefinition != null)
				msgs = ((InternalEObject)clinicalUseDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CLINICAL_USE_DEFINITION, null, msgs);
			if (newClinicalUseDefinition != null)
				msgs = ((InternalEObject)newClinicalUseDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CLINICAL_USE_DEFINITION, null, msgs);
			msgs = basicSetClinicalUseDefinition(newClinicalUseDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CLINICAL_USE_DEFINITION, newClinicalUseDefinition, newClinicalUseDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSystem getCodeSystem() {
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeSystem(CodeSystem newCodeSystem, NotificationChain msgs) {
		CodeSystem oldCodeSystem = codeSystem;
		codeSystem = newCodeSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CODE_SYSTEM, oldCodeSystem, newCodeSystem);
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
	public void setCodeSystem(CodeSystem newCodeSystem) {
		if (newCodeSystem != codeSystem) {
			NotificationChain msgs = null;
			if (codeSystem != null)
				msgs = ((InternalEObject)codeSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CODE_SYSTEM, null, msgs);
			if (newCodeSystem != null)
				msgs = ((InternalEObject)newCodeSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CODE_SYSTEM, null, msgs);
			msgs = basicSetCodeSystem(newCodeSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CODE_SYSTEM, newCodeSystem, newCodeSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Communication getCommunication() {
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunication(Communication newCommunication, NotificationChain msgs) {
		Communication oldCommunication = communication;
		communication = newCommunication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__COMMUNICATION, oldCommunication, newCommunication);
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
	public void setCommunication(Communication newCommunication) {
		if (newCommunication != communication) {
			NotificationChain msgs = null;
			if (communication != null)
				msgs = ((InternalEObject)communication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__COMMUNICATION, null, msgs);
			if (newCommunication != null)
				msgs = ((InternalEObject)newCommunication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__COMMUNICATION, null, msgs);
			msgs = basicSetCommunication(newCommunication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__COMMUNICATION, newCommunication, newCommunication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationRequest getCommunicationRequest() {
		return communicationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunicationRequest(CommunicationRequest newCommunicationRequest, NotificationChain msgs) {
		CommunicationRequest oldCommunicationRequest = communicationRequest;
		communicationRequest = newCommunicationRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__COMMUNICATION_REQUEST, oldCommunicationRequest, newCommunicationRequest);
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
	public void setCommunicationRequest(CommunicationRequest newCommunicationRequest) {
		if (newCommunicationRequest != communicationRequest) {
			NotificationChain msgs = null;
			if (communicationRequest != null)
				msgs = ((InternalEObject)communicationRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__COMMUNICATION_REQUEST, null, msgs);
			if (newCommunicationRequest != null)
				msgs = ((InternalEObject)newCommunicationRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__COMMUNICATION_REQUEST, null, msgs);
			msgs = basicSetCommunicationRequest(newCommunicationRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__COMMUNICATION_REQUEST, newCommunicationRequest, newCommunicationRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompartmentDefinition getCompartmentDefinition() {
		return compartmentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompartmentDefinition(CompartmentDefinition newCompartmentDefinition, NotificationChain msgs) {
		CompartmentDefinition oldCompartmentDefinition = compartmentDefinition;
		compartmentDefinition = newCompartmentDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__COMPARTMENT_DEFINITION, oldCompartmentDefinition, newCompartmentDefinition);
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
	public void setCompartmentDefinition(CompartmentDefinition newCompartmentDefinition) {
		if (newCompartmentDefinition != compartmentDefinition) {
			NotificationChain msgs = null;
			if (compartmentDefinition != null)
				msgs = ((InternalEObject)compartmentDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__COMPARTMENT_DEFINITION, null, msgs);
			if (newCompartmentDefinition != null)
				msgs = ((InternalEObject)newCompartmentDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__COMPARTMENT_DEFINITION, null, msgs);
			msgs = basicSetCompartmentDefinition(newCompartmentDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__COMPARTMENT_DEFINITION, newCompartmentDefinition, newCompartmentDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composition getComposition() {
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComposition(Composition newComposition, NotificationChain msgs) {
		Composition oldComposition = composition;
		composition = newComposition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__COMPOSITION, oldComposition, newComposition);
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
	public void setComposition(Composition newComposition) {
		if (newComposition != composition) {
			NotificationChain msgs = null;
			if (composition != null)
				msgs = ((InternalEObject)composition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__COMPOSITION, null, msgs);
			if (newComposition != null)
				msgs = ((InternalEObject)newComposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__COMPOSITION, null, msgs);
			msgs = basicSetComposition(newComposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__COMPOSITION, newComposition, newComposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConceptMap getConceptMap() {
		return conceptMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConceptMap(ConceptMap newConceptMap, NotificationChain msgs) {
		ConceptMap oldConceptMap = conceptMap;
		conceptMap = newConceptMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CONCEPT_MAP, oldConceptMap, newConceptMap);
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
	public void setConceptMap(ConceptMap newConceptMap) {
		if (newConceptMap != conceptMap) {
			NotificationChain msgs = null;
			if (conceptMap != null)
				msgs = ((InternalEObject)conceptMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CONCEPT_MAP, null, msgs);
			if (newConceptMap != null)
				msgs = ((InternalEObject)newConceptMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CONCEPT_MAP, null, msgs);
			msgs = basicSetConceptMap(newConceptMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CONCEPT_MAP, newConceptMap, newConceptMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CONDITION, oldCondition, newCondition);
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
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionDefinition getConditionDefinition() {
		return conditionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionDefinition(ConditionDefinition newConditionDefinition, NotificationChain msgs) {
		ConditionDefinition oldConditionDefinition = conditionDefinition;
		conditionDefinition = newConditionDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CONDITION_DEFINITION, oldConditionDefinition, newConditionDefinition);
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
	public void setConditionDefinition(ConditionDefinition newConditionDefinition) {
		if (newConditionDefinition != conditionDefinition) {
			NotificationChain msgs = null;
			if (conditionDefinition != null)
				msgs = ((InternalEObject)conditionDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CONDITION_DEFINITION, null, msgs);
			if (newConditionDefinition != null)
				msgs = ((InternalEObject)newConditionDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CONDITION_DEFINITION, null, msgs);
			msgs = basicSetConditionDefinition(newConditionDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CONDITION_DEFINITION, newConditionDefinition, newConditionDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Consent getConsent() {
		return consent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsent(Consent newConsent, NotificationChain msgs) {
		Consent oldConsent = consent;
		consent = newConsent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CONSENT, oldConsent, newConsent);
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
	public void setConsent(Consent newConsent) {
		if (newConsent != consent) {
			NotificationChain msgs = null;
			if (consent != null)
				msgs = ((InternalEObject)consent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CONSENT, null, msgs);
			if (newConsent != null)
				msgs = ((InternalEObject)newConsent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CONSENT, null, msgs);
			msgs = basicSetConsent(newConsent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CONSENT, newConsent, newConsent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contract getContract() {
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContract(Contract newContract, NotificationChain msgs) {
		Contract oldContract = contract;
		contract = newContract;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CONTRACT, oldContract, newContract);
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
	public void setContract(Contract newContract) {
		if (newContract != contract) {
			NotificationChain msgs = null;
			if (contract != null)
				msgs = ((InternalEObject)contract).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CONTRACT, null, msgs);
			if (newContract != null)
				msgs = ((InternalEObject)newContract).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CONTRACT, null, msgs);
			msgs = basicSetContract(newContract, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CONTRACT, newContract, newContract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coverage getCoverage() {
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverage(Coverage newCoverage, NotificationChain msgs) {
		Coverage oldCoverage = coverage;
		coverage = newCoverage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__COVERAGE, oldCoverage, newCoverage);
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
	public void setCoverage(Coverage newCoverage) {
		if (newCoverage != coverage) {
			NotificationChain msgs = null;
			if (coverage != null)
				msgs = ((InternalEObject)coverage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__COVERAGE, null, msgs);
			if (newCoverage != null)
				msgs = ((InternalEObject)newCoverage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__COVERAGE, null, msgs);
			msgs = basicSetCoverage(newCoverage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__COVERAGE, newCoverage, newCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageEligibilityRequest getCoverageEligibilityRequest() {
		return coverageEligibilityRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverageEligibilityRequest(CoverageEligibilityRequest newCoverageEligibilityRequest, NotificationChain msgs) {
		CoverageEligibilityRequest oldCoverageEligibilityRequest = coverageEligibilityRequest;
		coverageEligibilityRequest = newCoverageEligibilityRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__COVERAGE_ELIGIBILITY_REQUEST, oldCoverageEligibilityRequest, newCoverageEligibilityRequest);
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
	public void setCoverageEligibilityRequest(CoverageEligibilityRequest newCoverageEligibilityRequest) {
		if (newCoverageEligibilityRequest != coverageEligibilityRequest) {
			NotificationChain msgs = null;
			if (coverageEligibilityRequest != null)
				msgs = ((InternalEObject)coverageEligibilityRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__COVERAGE_ELIGIBILITY_REQUEST, null, msgs);
			if (newCoverageEligibilityRequest != null)
				msgs = ((InternalEObject)newCoverageEligibilityRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__COVERAGE_ELIGIBILITY_REQUEST, null, msgs);
			msgs = basicSetCoverageEligibilityRequest(newCoverageEligibilityRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__COVERAGE_ELIGIBILITY_REQUEST, newCoverageEligibilityRequest, newCoverageEligibilityRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageEligibilityResponse getCoverageEligibilityResponse() {
		return coverageEligibilityResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverageEligibilityResponse(CoverageEligibilityResponse newCoverageEligibilityResponse, NotificationChain msgs) {
		CoverageEligibilityResponse oldCoverageEligibilityResponse = coverageEligibilityResponse;
		coverageEligibilityResponse = newCoverageEligibilityResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__COVERAGE_ELIGIBILITY_RESPONSE, oldCoverageEligibilityResponse, newCoverageEligibilityResponse);
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
	public void setCoverageEligibilityResponse(CoverageEligibilityResponse newCoverageEligibilityResponse) {
		if (newCoverageEligibilityResponse != coverageEligibilityResponse) {
			NotificationChain msgs = null;
			if (coverageEligibilityResponse != null)
				msgs = ((InternalEObject)coverageEligibilityResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__COVERAGE_ELIGIBILITY_RESPONSE, null, msgs);
			if (newCoverageEligibilityResponse != null)
				msgs = ((InternalEObject)newCoverageEligibilityResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__COVERAGE_ELIGIBILITY_RESPONSE, null, msgs);
			msgs = basicSetCoverageEligibilityResponse(newCoverageEligibilityResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__COVERAGE_ELIGIBILITY_RESPONSE, newCoverageEligibilityResponse, newCoverageEligibilityResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetectedIssue getDetectedIssue() {
		return detectedIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetectedIssue(DetectedIssue newDetectedIssue, NotificationChain msgs) {
		DetectedIssue oldDetectedIssue = detectedIssue;
		detectedIssue = newDetectedIssue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DETECTED_ISSUE, oldDetectedIssue, newDetectedIssue);
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
	public void setDetectedIssue(DetectedIssue newDetectedIssue) {
		if (newDetectedIssue != detectedIssue) {
			NotificationChain msgs = null;
			if (detectedIssue != null)
				msgs = ((InternalEObject)detectedIssue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DETECTED_ISSUE, null, msgs);
			if (newDetectedIssue != null)
				msgs = ((InternalEObject)newDetectedIssue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DETECTED_ISSUE, null, msgs);
			msgs = basicSetDetectedIssue(newDetectedIssue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DETECTED_ISSUE, newDetectedIssue, newDetectedIssue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Device getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevice(Device newDevice, NotificationChain msgs) {
		Device oldDevice = device;
		device = newDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DEVICE, oldDevice, newDevice);
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
	public void setDevice(Device newDevice) {
		if (newDevice != device) {
			NotificationChain msgs = null;
			if (device != null)
				msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DEVICE, null, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DEVICE, null, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DEVICE, newDevice, newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceAssociation getDeviceAssociation() {
		return deviceAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceAssociation(DeviceAssociation newDeviceAssociation, NotificationChain msgs) {
		DeviceAssociation oldDeviceAssociation = deviceAssociation;
		deviceAssociation = newDeviceAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DEVICE_ASSOCIATION, oldDeviceAssociation, newDeviceAssociation);
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
	public void setDeviceAssociation(DeviceAssociation newDeviceAssociation) {
		if (newDeviceAssociation != deviceAssociation) {
			NotificationChain msgs = null;
			if (deviceAssociation != null)
				msgs = ((InternalEObject)deviceAssociation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DEVICE_ASSOCIATION, null, msgs);
			if (newDeviceAssociation != null)
				msgs = ((InternalEObject)newDeviceAssociation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DEVICE_ASSOCIATION, null, msgs);
			msgs = basicSetDeviceAssociation(newDeviceAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DEVICE_ASSOCIATION, newDeviceAssociation, newDeviceAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceDefinition getDeviceDefinition() {
		return deviceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceDefinition(DeviceDefinition newDeviceDefinition, NotificationChain msgs) {
		DeviceDefinition oldDeviceDefinition = deviceDefinition;
		deviceDefinition = newDeviceDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DEVICE_DEFINITION, oldDeviceDefinition, newDeviceDefinition);
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
	public void setDeviceDefinition(DeviceDefinition newDeviceDefinition) {
		if (newDeviceDefinition != deviceDefinition) {
			NotificationChain msgs = null;
			if (deviceDefinition != null)
				msgs = ((InternalEObject)deviceDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DEVICE_DEFINITION, null, msgs);
			if (newDeviceDefinition != null)
				msgs = ((InternalEObject)newDeviceDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DEVICE_DEFINITION, null, msgs);
			msgs = basicSetDeviceDefinition(newDeviceDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DEVICE_DEFINITION, newDeviceDefinition, newDeviceDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceDispense getDeviceDispense() {
		return deviceDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceDispense(DeviceDispense newDeviceDispense, NotificationChain msgs) {
		DeviceDispense oldDeviceDispense = deviceDispense;
		deviceDispense = newDeviceDispense;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DEVICE_DISPENSE, oldDeviceDispense, newDeviceDispense);
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
	public void setDeviceDispense(DeviceDispense newDeviceDispense) {
		if (newDeviceDispense != deviceDispense) {
			NotificationChain msgs = null;
			if (deviceDispense != null)
				msgs = ((InternalEObject)deviceDispense).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DEVICE_DISPENSE, null, msgs);
			if (newDeviceDispense != null)
				msgs = ((InternalEObject)newDeviceDispense).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DEVICE_DISPENSE, null, msgs);
			msgs = basicSetDeviceDispense(newDeviceDispense, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DEVICE_DISPENSE, newDeviceDispense, newDeviceDispense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceMetric getDeviceMetric() {
		return deviceMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceMetric(DeviceMetric newDeviceMetric, NotificationChain msgs) {
		DeviceMetric oldDeviceMetric = deviceMetric;
		deviceMetric = newDeviceMetric;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DEVICE_METRIC, oldDeviceMetric, newDeviceMetric);
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
	public void setDeviceMetric(DeviceMetric newDeviceMetric) {
		if (newDeviceMetric != deviceMetric) {
			NotificationChain msgs = null;
			if (deviceMetric != null)
				msgs = ((InternalEObject)deviceMetric).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DEVICE_METRIC, null, msgs);
			if (newDeviceMetric != null)
				msgs = ((InternalEObject)newDeviceMetric).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DEVICE_METRIC, null, msgs);
			msgs = basicSetDeviceMetric(newDeviceMetric, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DEVICE_METRIC, newDeviceMetric, newDeviceMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceRequest getDeviceRequest() {
		return deviceRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceRequest(DeviceRequest newDeviceRequest, NotificationChain msgs) {
		DeviceRequest oldDeviceRequest = deviceRequest;
		deviceRequest = newDeviceRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DEVICE_REQUEST, oldDeviceRequest, newDeviceRequest);
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
	public void setDeviceRequest(DeviceRequest newDeviceRequest) {
		if (newDeviceRequest != deviceRequest) {
			NotificationChain msgs = null;
			if (deviceRequest != null)
				msgs = ((InternalEObject)deviceRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DEVICE_REQUEST, null, msgs);
			if (newDeviceRequest != null)
				msgs = ((InternalEObject)newDeviceRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DEVICE_REQUEST, null, msgs);
			msgs = basicSetDeviceRequest(newDeviceRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DEVICE_REQUEST, newDeviceRequest, newDeviceRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceUsage getDeviceUsage() {
		return deviceUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceUsage(DeviceUsage newDeviceUsage, NotificationChain msgs) {
		DeviceUsage oldDeviceUsage = deviceUsage;
		deviceUsage = newDeviceUsage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DEVICE_USAGE, oldDeviceUsage, newDeviceUsage);
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
	public void setDeviceUsage(DeviceUsage newDeviceUsage) {
		if (newDeviceUsage != deviceUsage) {
			NotificationChain msgs = null;
			if (deviceUsage != null)
				msgs = ((InternalEObject)deviceUsage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DEVICE_USAGE, null, msgs);
			if (newDeviceUsage != null)
				msgs = ((InternalEObject)newDeviceUsage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DEVICE_USAGE, null, msgs);
			msgs = basicSetDeviceUsage(newDeviceUsage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DEVICE_USAGE, newDeviceUsage, newDeviceUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagnosticReport getDiagnosticReport() {
		return diagnosticReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagnosticReport(DiagnosticReport newDiagnosticReport, NotificationChain msgs) {
		DiagnosticReport oldDiagnosticReport = diagnosticReport;
		diagnosticReport = newDiagnosticReport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_REPORT, oldDiagnosticReport, newDiagnosticReport);
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
	public void setDiagnosticReport(DiagnosticReport newDiagnosticReport) {
		if (newDiagnosticReport != diagnosticReport) {
			NotificationChain msgs = null;
			if (diagnosticReport != null)
				msgs = ((InternalEObject)diagnosticReport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_REPORT, null, msgs);
			if (newDiagnosticReport != null)
				msgs = ((InternalEObject)newDiagnosticReport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_REPORT, null, msgs);
			msgs = basicSetDiagnosticReport(newDiagnosticReport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_REPORT, newDiagnosticReport, newDiagnosticReport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentReference getDocumentReference() {
		return documentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentReference(DocumentReference newDocumentReference, NotificationChain msgs) {
		DocumentReference oldDocumentReference = documentReference;
		documentReference = newDocumentReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DOCUMENT_REFERENCE, oldDocumentReference, newDocumentReference);
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
	public void setDocumentReference(DocumentReference newDocumentReference) {
		if (newDocumentReference != documentReference) {
			NotificationChain msgs = null;
			if (documentReference != null)
				msgs = ((InternalEObject)documentReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DOCUMENT_REFERENCE, null, msgs);
			if (newDocumentReference != null)
				msgs = ((InternalEObject)newDocumentReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DOCUMENT_REFERENCE, null, msgs);
			msgs = basicSetDocumentReference(newDocumentReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DOCUMENT_REFERENCE, newDocumentReference, newDocumentReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Encounter getEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Encounter newEncounter, NotificationChain msgs) {
		Encounter oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ENCOUNTER, oldEncounter, newEncounter);
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
	public void setEncounter(Encounter newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterHistory getEncounterHistory() {
		return encounterHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounterHistory(EncounterHistory newEncounterHistory, NotificationChain msgs) {
		EncounterHistory oldEncounterHistory = encounterHistory;
		encounterHistory = newEncounterHistory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ENCOUNTER_HISTORY, oldEncounterHistory, newEncounterHistory);
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
	public void setEncounterHistory(EncounterHistory newEncounterHistory) {
		if (newEncounterHistory != encounterHistory) {
			NotificationChain msgs = null;
			if (encounterHistory != null)
				msgs = ((InternalEObject)encounterHistory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ENCOUNTER_HISTORY, null, msgs);
			if (newEncounterHistory != null)
				msgs = ((InternalEObject)newEncounterHistory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ENCOUNTER_HISTORY, null, msgs);
			msgs = basicSetEncounterHistory(newEncounterHistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ENCOUNTER_HISTORY, newEncounterHistory, newEncounterHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Endpoint getEndpoint() {
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpoint(Endpoint newEndpoint, NotificationChain msgs) {
		Endpoint oldEndpoint = endpoint;
		endpoint = newEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ENDPOINT, oldEndpoint, newEndpoint);
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
	public void setEndpoint(Endpoint newEndpoint) {
		if (newEndpoint != endpoint) {
			NotificationChain msgs = null;
			if (endpoint != null)
				msgs = ((InternalEObject)endpoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ENDPOINT, null, msgs);
			if (newEndpoint != null)
				msgs = ((InternalEObject)newEndpoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ENDPOINT, null, msgs);
			msgs = basicSetEndpoint(newEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ENDPOINT, newEndpoint, newEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnrollmentRequest getEnrollmentRequest() {
		return enrollmentRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnrollmentRequest(EnrollmentRequest newEnrollmentRequest, NotificationChain msgs) {
		EnrollmentRequest oldEnrollmentRequest = enrollmentRequest;
		enrollmentRequest = newEnrollmentRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_REQUEST, oldEnrollmentRequest, newEnrollmentRequest);
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
	public void setEnrollmentRequest(EnrollmentRequest newEnrollmentRequest) {
		if (newEnrollmentRequest != enrollmentRequest) {
			NotificationChain msgs = null;
			if (enrollmentRequest != null)
				msgs = ((InternalEObject)enrollmentRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_REQUEST, null, msgs);
			if (newEnrollmentRequest != null)
				msgs = ((InternalEObject)newEnrollmentRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_REQUEST, null, msgs);
			msgs = basicSetEnrollmentRequest(newEnrollmentRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_REQUEST, newEnrollmentRequest, newEnrollmentRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnrollmentResponse getEnrollmentResponse() {
		return enrollmentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnrollmentResponse(EnrollmentResponse newEnrollmentResponse, NotificationChain msgs) {
		EnrollmentResponse oldEnrollmentResponse = enrollmentResponse;
		enrollmentResponse = newEnrollmentResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_RESPONSE, oldEnrollmentResponse, newEnrollmentResponse);
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
	public void setEnrollmentResponse(EnrollmentResponse newEnrollmentResponse) {
		if (newEnrollmentResponse != enrollmentResponse) {
			NotificationChain msgs = null;
			if (enrollmentResponse != null)
				msgs = ((InternalEObject)enrollmentResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_RESPONSE, null, msgs);
			if (newEnrollmentResponse != null)
				msgs = ((InternalEObject)newEnrollmentResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_RESPONSE, null, msgs);
			msgs = basicSetEnrollmentResponse(newEnrollmentResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_RESPONSE, newEnrollmentResponse, newEnrollmentResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EpisodeOfCare getEpisodeOfCare() {
		return episodeOfCare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEpisodeOfCare(EpisodeOfCare newEpisodeOfCare, NotificationChain msgs) {
		EpisodeOfCare oldEpisodeOfCare = episodeOfCare;
		episodeOfCare = newEpisodeOfCare;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__EPISODE_OF_CARE, oldEpisodeOfCare, newEpisodeOfCare);
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
	public void setEpisodeOfCare(EpisodeOfCare newEpisodeOfCare) {
		if (newEpisodeOfCare != episodeOfCare) {
			NotificationChain msgs = null;
			if (episodeOfCare != null)
				msgs = ((InternalEObject)episodeOfCare).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__EPISODE_OF_CARE, null, msgs);
			if (newEpisodeOfCare != null)
				msgs = ((InternalEObject)newEpisodeOfCare).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__EPISODE_OF_CARE, null, msgs);
			msgs = basicSetEpisodeOfCare(newEpisodeOfCare, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__EPISODE_OF_CARE, newEpisodeOfCare, newEpisodeOfCare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventDefinition getEventDefinition() {
		return eventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventDefinition(EventDefinition newEventDefinition, NotificationChain msgs) {
		EventDefinition oldEventDefinition = eventDefinition;
		eventDefinition = newEventDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__EVENT_DEFINITION, oldEventDefinition, newEventDefinition);
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
	public void setEventDefinition(EventDefinition newEventDefinition) {
		if (newEventDefinition != eventDefinition) {
			NotificationChain msgs = null;
			if (eventDefinition != null)
				msgs = ((InternalEObject)eventDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__EVENT_DEFINITION, null, msgs);
			if (newEventDefinition != null)
				msgs = ((InternalEObject)newEventDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__EVENT_DEFINITION, null, msgs);
			msgs = basicSetEventDefinition(newEventDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__EVENT_DEFINITION, newEventDefinition, newEventDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Evidence getEvidence() {
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvidence(Evidence newEvidence, NotificationChain msgs) {
		Evidence oldEvidence = evidence;
		evidence = newEvidence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__EVIDENCE, oldEvidence, newEvidence);
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
	public void setEvidence(Evidence newEvidence) {
		if (newEvidence != evidence) {
			NotificationChain msgs = null;
			if (evidence != null)
				msgs = ((InternalEObject)evidence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__EVIDENCE, null, msgs);
			if (newEvidence != null)
				msgs = ((InternalEObject)newEvidence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__EVIDENCE, null, msgs);
			msgs = basicSetEvidence(newEvidence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__EVIDENCE, newEvidence, newEvidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EvidenceReport getEvidenceReport() {
		return evidenceReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvidenceReport(EvidenceReport newEvidenceReport, NotificationChain msgs) {
		EvidenceReport oldEvidenceReport = evidenceReport;
		evidenceReport = newEvidenceReport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__EVIDENCE_REPORT, oldEvidenceReport, newEvidenceReport);
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
	public void setEvidenceReport(EvidenceReport newEvidenceReport) {
		if (newEvidenceReport != evidenceReport) {
			NotificationChain msgs = null;
			if (evidenceReport != null)
				msgs = ((InternalEObject)evidenceReport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__EVIDENCE_REPORT, null, msgs);
			if (newEvidenceReport != null)
				msgs = ((InternalEObject)newEvidenceReport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__EVIDENCE_REPORT, null, msgs);
			msgs = basicSetEvidenceReport(newEvidenceReport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__EVIDENCE_REPORT, newEvidenceReport, newEvidenceReport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EvidenceVariable getEvidenceVariable() {
		return evidenceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvidenceVariable(EvidenceVariable newEvidenceVariable, NotificationChain msgs) {
		EvidenceVariable oldEvidenceVariable = evidenceVariable;
		evidenceVariable = newEvidenceVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__EVIDENCE_VARIABLE, oldEvidenceVariable, newEvidenceVariable);
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
	public void setEvidenceVariable(EvidenceVariable newEvidenceVariable) {
		if (newEvidenceVariable != evidenceVariable) {
			NotificationChain msgs = null;
			if (evidenceVariable != null)
				msgs = ((InternalEObject)evidenceVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__EVIDENCE_VARIABLE, null, msgs);
			if (newEvidenceVariable != null)
				msgs = ((InternalEObject)newEvidenceVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__EVIDENCE_VARIABLE, null, msgs);
			msgs = basicSetEvidenceVariable(newEvidenceVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__EVIDENCE_VARIABLE, newEvidenceVariable, newEvidenceVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExampleScenario getExampleScenario() {
		return exampleScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleScenario(ExampleScenario newExampleScenario, NotificationChain msgs) {
		ExampleScenario oldExampleScenario = exampleScenario;
		exampleScenario = newExampleScenario;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__EXAMPLE_SCENARIO, oldExampleScenario, newExampleScenario);
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
	public void setExampleScenario(ExampleScenario newExampleScenario) {
		if (newExampleScenario != exampleScenario) {
			NotificationChain msgs = null;
			if (exampleScenario != null)
				msgs = ((InternalEObject)exampleScenario).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__EXAMPLE_SCENARIO, null, msgs);
			if (newExampleScenario != null)
				msgs = ((InternalEObject)newExampleScenario).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__EXAMPLE_SCENARIO, null, msgs);
			msgs = basicSetExampleScenario(newExampleScenario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__EXAMPLE_SCENARIO, newExampleScenario, newExampleScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefit getExplanationOfBenefit() {
		return explanationOfBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExplanationOfBenefit(ExplanationOfBenefit newExplanationOfBenefit, NotificationChain msgs) {
		ExplanationOfBenefit oldExplanationOfBenefit = explanationOfBenefit;
		explanationOfBenefit = newExplanationOfBenefit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__EXPLANATION_OF_BENEFIT, oldExplanationOfBenefit, newExplanationOfBenefit);
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
	public void setExplanationOfBenefit(ExplanationOfBenefit newExplanationOfBenefit) {
		if (newExplanationOfBenefit != explanationOfBenefit) {
			NotificationChain msgs = null;
			if (explanationOfBenefit != null)
				msgs = ((InternalEObject)explanationOfBenefit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__EXPLANATION_OF_BENEFIT, null, msgs);
			if (newExplanationOfBenefit != null)
				msgs = ((InternalEObject)newExplanationOfBenefit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__EXPLANATION_OF_BENEFIT, null, msgs);
			msgs = basicSetExplanationOfBenefit(newExplanationOfBenefit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__EXPLANATION_OF_BENEFIT, newExplanationOfBenefit, newExplanationOfBenefit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilyMemberHistory getFamilyMemberHistory() {
		return familyMemberHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFamilyMemberHistory(FamilyMemberHistory newFamilyMemberHistory, NotificationChain msgs) {
		FamilyMemberHistory oldFamilyMemberHistory = familyMemberHistory;
		familyMemberHistory = newFamilyMemberHistory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__FAMILY_MEMBER_HISTORY, oldFamilyMemberHistory, newFamilyMemberHistory);
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
	public void setFamilyMemberHistory(FamilyMemberHistory newFamilyMemberHistory) {
		if (newFamilyMemberHistory != familyMemberHistory) {
			NotificationChain msgs = null;
			if (familyMemberHistory != null)
				msgs = ((InternalEObject)familyMemberHistory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__FAMILY_MEMBER_HISTORY, null, msgs);
			if (newFamilyMemberHistory != null)
				msgs = ((InternalEObject)newFamilyMemberHistory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__FAMILY_MEMBER_HISTORY, null, msgs);
			msgs = basicSetFamilyMemberHistory(newFamilyMemberHistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__FAMILY_MEMBER_HISTORY, newFamilyMemberHistory, newFamilyMemberHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Flag getFlag() {
		return flag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlag(Flag newFlag, NotificationChain msgs) {
		Flag oldFlag = flag;
		flag = newFlag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__FLAG, oldFlag, newFlag);
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
	public void setFlag(Flag newFlag) {
		if (newFlag != flag) {
			NotificationChain msgs = null;
			if (flag != null)
				msgs = ((InternalEObject)flag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__FLAG, null, msgs);
			if (newFlag != null)
				msgs = ((InternalEObject)newFlag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__FLAG, null, msgs);
			msgs = basicSetFlag(newFlag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__FLAG, newFlag, newFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormularyItem getFormularyItem() {
		return formularyItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormularyItem(FormularyItem newFormularyItem, NotificationChain msgs) {
		FormularyItem oldFormularyItem = formularyItem;
		formularyItem = newFormularyItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__FORMULARY_ITEM, oldFormularyItem, newFormularyItem);
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
	public void setFormularyItem(FormularyItem newFormularyItem) {
		if (newFormularyItem != formularyItem) {
			NotificationChain msgs = null;
			if (formularyItem != null)
				msgs = ((InternalEObject)formularyItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__FORMULARY_ITEM, null, msgs);
			if (newFormularyItem != null)
				msgs = ((InternalEObject)newFormularyItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__FORMULARY_ITEM, null, msgs);
			msgs = basicSetFormularyItem(newFormularyItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__FORMULARY_ITEM, newFormularyItem, newFormularyItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenomicStudy getGenomicStudy() {
		return genomicStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenomicStudy(GenomicStudy newGenomicStudy, NotificationChain msgs) {
		GenomicStudy oldGenomicStudy = genomicStudy;
		genomicStudy = newGenomicStudy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__GENOMIC_STUDY, oldGenomicStudy, newGenomicStudy);
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
	public void setGenomicStudy(GenomicStudy newGenomicStudy) {
		if (newGenomicStudy != genomicStudy) {
			NotificationChain msgs = null;
			if (genomicStudy != null)
				msgs = ((InternalEObject)genomicStudy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__GENOMIC_STUDY, null, msgs);
			if (newGenomicStudy != null)
				msgs = ((InternalEObject)newGenomicStudy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__GENOMIC_STUDY, null, msgs);
			msgs = basicSetGenomicStudy(newGenomicStudy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__GENOMIC_STUDY, newGenomicStudy, newGenomicStudy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal getGoal() {
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoal(Goal newGoal, NotificationChain msgs) {
		Goal oldGoal = goal;
		goal = newGoal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__GOAL, oldGoal, newGoal);
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
	public void setGoal(Goal newGoal) {
		if (newGoal != goal) {
			NotificationChain msgs = null;
			if (goal != null)
				msgs = ((InternalEObject)goal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__GOAL, null, msgs);
			if (newGoal != null)
				msgs = ((InternalEObject)newGoal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__GOAL, null, msgs);
			msgs = basicSetGoal(newGoal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__GOAL, newGoal, newGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphDefinition getGraphDefinition() {
		return graphDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphDefinition(GraphDefinition newGraphDefinition, NotificationChain msgs) {
		GraphDefinition oldGraphDefinition = graphDefinition;
		graphDefinition = newGraphDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__GRAPH_DEFINITION, oldGraphDefinition, newGraphDefinition);
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
	public void setGraphDefinition(GraphDefinition newGraphDefinition) {
		if (newGraphDefinition != graphDefinition) {
			NotificationChain msgs = null;
			if (graphDefinition != null)
				msgs = ((InternalEObject)graphDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__GRAPH_DEFINITION, null, msgs);
			if (newGraphDefinition != null)
				msgs = ((InternalEObject)newGraphDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__GRAPH_DEFINITION, null, msgs);
			msgs = basicSetGraphDefinition(newGraphDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__GRAPH_DEFINITION, newGraphDefinition, newGraphDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Group getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group newGroup, NotificationChain msgs) {
		Group oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__GROUP, oldGroup, newGroup);
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
	public void setGroup(Group newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject)group).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__GROUP, null, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__GROUP, null, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuidanceResponse getGuidanceResponse() {
		return guidanceResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuidanceResponse(GuidanceResponse newGuidanceResponse, NotificationChain msgs) {
		GuidanceResponse oldGuidanceResponse = guidanceResponse;
		guidanceResponse = newGuidanceResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__GUIDANCE_RESPONSE, oldGuidanceResponse, newGuidanceResponse);
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
	public void setGuidanceResponse(GuidanceResponse newGuidanceResponse) {
		if (newGuidanceResponse != guidanceResponse) {
			NotificationChain msgs = null;
			if (guidanceResponse != null)
				msgs = ((InternalEObject)guidanceResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__GUIDANCE_RESPONSE, null, msgs);
			if (newGuidanceResponse != null)
				msgs = ((InternalEObject)newGuidanceResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__GUIDANCE_RESPONSE, null, msgs);
			msgs = basicSetGuidanceResponse(newGuidanceResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__GUIDANCE_RESPONSE, newGuidanceResponse, newGuidanceResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthcareService getHealthcareService() {
		return healthcareService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHealthcareService(HealthcareService newHealthcareService, NotificationChain msgs) {
		HealthcareService oldHealthcareService = healthcareService;
		healthcareService = newHealthcareService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__HEALTHCARE_SERVICE, oldHealthcareService, newHealthcareService);
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
	public void setHealthcareService(HealthcareService newHealthcareService) {
		if (newHealthcareService != healthcareService) {
			NotificationChain msgs = null;
			if (healthcareService != null)
				msgs = ((InternalEObject)healthcareService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__HEALTHCARE_SERVICE, null, msgs);
			if (newHealthcareService != null)
				msgs = ((InternalEObject)newHealthcareService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__HEALTHCARE_SERVICE, null, msgs);
			msgs = basicSetHealthcareService(newHealthcareService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__HEALTHCARE_SERVICE, newHealthcareService, newHealthcareService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImagingSelection getImagingSelection() {
		return imagingSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagingSelection(ImagingSelection newImagingSelection, NotificationChain msgs) {
		ImagingSelection oldImagingSelection = imagingSelection;
		imagingSelection = newImagingSelection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__IMAGING_SELECTION, oldImagingSelection, newImagingSelection);
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
	public void setImagingSelection(ImagingSelection newImagingSelection) {
		if (newImagingSelection != imagingSelection) {
			NotificationChain msgs = null;
			if (imagingSelection != null)
				msgs = ((InternalEObject)imagingSelection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__IMAGING_SELECTION, null, msgs);
			if (newImagingSelection != null)
				msgs = ((InternalEObject)newImagingSelection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__IMAGING_SELECTION, null, msgs);
			msgs = basicSetImagingSelection(newImagingSelection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__IMAGING_SELECTION, newImagingSelection, newImagingSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImagingStudy getImagingStudy() {
		return imagingStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagingStudy(ImagingStudy newImagingStudy, NotificationChain msgs) {
		ImagingStudy oldImagingStudy = imagingStudy;
		imagingStudy = newImagingStudy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__IMAGING_STUDY, oldImagingStudy, newImagingStudy);
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
	public void setImagingStudy(ImagingStudy newImagingStudy) {
		if (newImagingStudy != imagingStudy) {
			NotificationChain msgs = null;
			if (imagingStudy != null)
				msgs = ((InternalEObject)imagingStudy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__IMAGING_STUDY, null, msgs);
			if (newImagingStudy != null)
				msgs = ((InternalEObject)newImagingStudy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__IMAGING_STUDY, null, msgs);
			msgs = basicSetImagingStudy(newImagingStudy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__IMAGING_STUDY, newImagingStudy, newImagingStudy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Immunization getImmunization() {
		return immunization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImmunization(Immunization newImmunization, NotificationChain msgs) {
		Immunization oldImmunization = immunization;
		immunization = newImmunization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION, oldImmunization, newImmunization);
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
	public void setImmunization(Immunization newImmunization) {
		if (newImmunization != immunization) {
			NotificationChain msgs = null;
			if (immunization != null)
				msgs = ((InternalEObject)immunization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION, null, msgs);
			if (newImmunization != null)
				msgs = ((InternalEObject)newImmunization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION, null, msgs);
			msgs = basicSetImmunization(newImmunization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION, newImmunization, newImmunization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationEvaluation getImmunizationEvaluation() {
		return immunizationEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImmunizationEvaluation(ImmunizationEvaluation newImmunizationEvaluation, NotificationChain msgs) {
		ImmunizationEvaluation oldImmunizationEvaluation = immunizationEvaluation;
		immunizationEvaluation = newImmunizationEvaluation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_EVALUATION, oldImmunizationEvaluation, newImmunizationEvaluation);
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
	public void setImmunizationEvaluation(ImmunizationEvaluation newImmunizationEvaluation) {
		if (newImmunizationEvaluation != immunizationEvaluation) {
			NotificationChain msgs = null;
			if (immunizationEvaluation != null)
				msgs = ((InternalEObject)immunizationEvaluation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_EVALUATION, null, msgs);
			if (newImmunizationEvaluation != null)
				msgs = ((InternalEObject)newImmunizationEvaluation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_EVALUATION, null, msgs);
			msgs = basicSetImmunizationEvaluation(newImmunizationEvaluation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_EVALUATION, newImmunizationEvaluation, newImmunizationEvaluation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationRecommendation getImmunizationRecommendation() {
		return immunizationRecommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImmunizationRecommendation(ImmunizationRecommendation newImmunizationRecommendation, NotificationChain msgs) {
		ImmunizationRecommendation oldImmunizationRecommendation = immunizationRecommendation;
		immunizationRecommendation = newImmunizationRecommendation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_RECOMMENDATION, oldImmunizationRecommendation, newImmunizationRecommendation);
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
	public void setImmunizationRecommendation(ImmunizationRecommendation newImmunizationRecommendation) {
		if (newImmunizationRecommendation != immunizationRecommendation) {
			NotificationChain msgs = null;
			if (immunizationRecommendation != null)
				msgs = ((InternalEObject)immunizationRecommendation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_RECOMMENDATION, null, msgs);
			if (newImmunizationRecommendation != null)
				msgs = ((InternalEObject)newImmunizationRecommendation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_RECOMMENDATION, null, msgs);
			msgs = basicSetImmunizationRecommendation(newImmunizationRecommendation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_RECOMMENDATION, newImmunizationRecommendation, newImmunizationRecommendation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuide getImplementationGuide() {
		return implementationGuide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementationGuide(ImplementationGuide newImplementationGuide, NotificationChain msgs) {
		ImplementationGuide oldImplementationGuide = implementationGuide;
		implementationGuide = newImplementationGuide;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__IMPLEMENTATION_GUIDE, oldImplementationGuide, newImplementationGuide);
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
	public void setImplementationGuide(ImplementationGuide newImplementationGuide) {
		if (newImplementationGuide != implementationGuide) {
			NotificationChain msgs = null;
			if (implementationGuide != null)
				msgs = ((InternalEObject)implementationGuide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__IMPLEMENTATION_GUIDE, null, msgs);
			if (newImplementationGuide != null)
				msgs = ((InternalEObject)newImplementationGuide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__IMPLEMENTATION_GUIDE, null, msgs);
			msgs = basicSetImplementationGuide(newImplementationGuide, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__IMPLEMENTATION_GUIDE, newImplementationGuide, newImplementationGuide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ingredient getIngredient() {
		return ingredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIngredient(Ingredient newIngredient, NotificationChain msgs) {
		Ingredient oldIngredient = ingredient;
		ingredient = newIngredient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__INGREDIENT, oldIngredient, newIngredient);
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
	public void setIngredient(Ingredient newIngredient) {
		if (newIngredient != ingredient) {
			NotificationChain msgs = null;
			if (ingredient != null)
				msgs = ((InternalEObject)ingredient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__INGREDIENT, null, msgs);
			if (newIngredient != null)
				msgs = ((InternalEObject)newIngredient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__INGREDIENT, null, msgs);
			msgs = basicSetIngredient(newIngredient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__INGREDIENT, newIngredient, newIngredient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsurancePlan getInsurancePlan() {
		return insurancePlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsurancePlan(InsurancePlan newInsurancePlan, NotificationChain msgs) {
		InsurancePlan oldInsurancePlan = insurancePlan;
		insurancePlan = newInsurancePlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__INSURANCE_PLAN, oldInsurancePlan, newInsurancePlan);
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
	public void setInsurancePlan(InsurancePlan newInsurancePlan) {
		if (newInsurancePlan != insurancePlan) {
			NotificationChain msgs = null;
			if (insurancePlan != null)
				msgs = ((InternalEObject)insurancePlan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__INSURANCE_PLAN, null, msgs);
			if (newInsurancePlan != null)
				msgs = ((InternalEObject)newInsurancePlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__INSURANCE_PLAN, null, msgs);
			msgs = basicSetInsurancePlan(newInsurancePlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__INSURANCE_PLAN, newInsurancePlan, newInsurancePlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItem getInventoryItem() {
		return inventoryItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInventoryItem(InventoryItem newInventoryItem, NotificationChain msgs) {
		InventoryItem oldInventoryItem = inventoryItem;
		inventoryItem = newInventoryItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__INVENTORY_ITEM, oldInventoryItem, newInventoryItem);
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
	public void setInventoryItem(InventoryItem newInventoryItem) {
		if (newInventoryItem != inventoryItem) {
			NotificationChain msgs = null;
			if (inventoryItem != null)
				msgs = ((InternalEObject)inventoryItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__INVENTORY_ITEM, null, msgs);
			if (newInventoryItem != null)
				msgs = ((InternalEObject)newInventoryItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__INVENTORY_ITEM, null, msgs);
			msgs = basicSetInventoryItem(newInventoryItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__INVENTORY_ITEM, newInventoryItem, newInventoryItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryReport getInventoryReport() {
		return inventoryReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInventoryReport(InventoryReport newInventoryReport, NotificationChain msgs) {
		InventoryReport oldInventoryReport = inventoryReport;
		inventoryReport = newInventoryReport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__INVENTORY_REPORT, oldInventoryReport, newInventoryReport);
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
	public void setInventoryReport(InventoryReport newInventoryReport) {
		if (newInventoryReport != inventoryReport) {
			NotificationChain msgs = null;
			if (inventoryReport != null)
				msgs = ((InternalEObject)inventoryReport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__INVENTORY_REPORT, null, msgs);
			if (newInventoryReport != null)
				msgs = ((InternalEObject)newInventoryReport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__INVENTORY_REPORT, null, msgs);
			msgs = basicSetInventoryReport(newInventoryReport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__INVENTORY_REPORT, newInventoryReport, newInventoryReport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Invoice getInvoice() {
		return invoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvoice(Invoice newInvoice, NotificationChain msgs) {
		Invoice oldInvoice = invoice;
		invoice = newInvoice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__INVOICE, oldInvoice, newInvoice);
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
	public void setInvoice(Invoice newInvoice) {
		if (newInvoice != invoice) {
			NotificationChain msgs = null;
			if (invoice != null)
				msgs = ((InternalEObject)invoice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__INVOICE, null, msgs);
			if (newInvoice != null)
				msgs = ((InternalEObject)newInvoice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__INVOICE, null, msgs);
			msgs = basicSetInvoice(newInvoice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__INVOICE, newInvoice, newInvoice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Library getLibrary() {
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibrary(Library newLibrary, NotificationChain msgs) {
		Library oldLibrary = library;
		library = newLibrary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__LIBRARY, oldLibrary, newLibrary);
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
	public void setLibrary(Library newLibrary) {
		if (newLibrary != library) {
			NotificationChain msgs = null;
			if (library != null)
				msgs = ((InternalEObject)library).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__LIBRARY, null, msgs);
			if (newLibrary != null)
				msgs = ((InternalEObject)newLibrary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__LIBRARY, null, msgs);
			msgs = basicSetLibrary(newLibrary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__LIBRARY, newLibrary, newLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Linkage getLinkage() {
		return linkage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkage(Linkage newLinkage, NotificationChain msgs) {
		Linkage oldLinkage = linkage;
		linkage = newLinkage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__LINKAGE, oldLinkage, newLinkage);
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
	public void setLinkage(Linkage newLinkage) {
		if (newLinkage != linkage) {
			NotificationChain msgs = null;
			if (linkage != null)
				msgs = ((InternalEObject)linkage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__LINKAGE, null, msgs);
			if (newLinkage != null)
				msgs = ((InternalEObject)newLinkage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__LINKAGE, null, msgs);
			msgs = basicSetLinkage(newLinkage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__LINKAGE, newLinkage, newLinkage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List getList() {
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(List newList, NotificationChain msgs) {
		List oldList = list;
		list = newList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__LIST, oldList, newList);
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
	public void setList(List newList) {
		if (newList != list) {
			NotificationChain msgs = null;
			if (list != null)
				msgs = ((InternalEObject)list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__LIST, null, msgs);
			if (newList != null)
				msgs = ((InternalEObject)newList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__LIST, null, msgs);
			msgs = basicSetList(newList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__LIST, newList, newList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__LOCATION, oldLocation, newLocation);
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
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManufacturedItemDefinition getManufacturedItemDefinition() {
		return manufacturedItemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturedItemDefinition(ManufacturedItemDefinition newManufacturedItemDefinition, NotificationChain msgs) {
		ManufacturedItemDefinition oldManufacturedItemDefinition = manufacturedItemDefinition;
		manufacturedItemDefinition = newManufacturedItemDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MANUFACTURED_ITEM_DEFINITION, oldManufacturedItemDefinition, newManufacturedItemDefinition);
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
	public void setManufacturedItemDefinition(ManufacturedItemDefinition newManufacturedItemDefinition) {
		if (newManufacturedItemDefinition != manufacturedItemDefinition) {
			NotificationChain msgs = null;
			if (manufacturedItemDefinition != null)
				msgs = ((InternalEObject)manufacturedItemDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MANUFACTURED_ITEM_DEFINITION, null, msgs);
			if (newManufacturedItemDefinition != null)
				msgs = ((InternalEObject)newManufacturedItemDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MANUFACTURED_ITEM_DEFINITION, null, msgs);
			msgs = basicSetManufacturedItemDefinition(newManufacturedItemDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MANUFACTURED_ITEM_DEFINITION, newManufacturedItemDefinition, newManufacturedItemDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Measure getMeasure() {
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasure(Measure newMeasure, NotificationChain msgs) {
		Measure oldMeasure = measure;
		measure = newMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEASURE, oldMeasure, newMeasure);
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
	public void setMeasure(Measure newMeasure) {
		if (newMeasure != measure) {
			NotificationChain msgs = null;
			if (measure != null)
				msgs = ((InternalEObject)measure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEASURE, null, msgs);
			if (newMeasure != null)
				msgs = ((InternalEObject)newMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEASURE, null, msgs);
			msgs = basicSetMeasure(newMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEASURE, newMeasure, newMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureReport getMeasureReport() {
		return measureReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureReport(MeasureReport newMeasureReport, NotificationChain msgs) {
		MeasureReport oldMeasureReport = measureReport;
		measureReport = newMeasureReport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEASURE_REPORT, oldMeasureReport, newMeasureReport);
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
	public void setMeasureReport(MeasureReport newMeasureReport) {
		if (newMeasureReport != measureReport) {
			NotificationChain msgs = null;
			if (measureReport != null)
				msgs = ((InternalEObject)measureReport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEASURE_REPORT, null, msgs);
			if (newMeasureReport != null)
				msgs = ((InternalEObject)newMeasureReport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEASURE_REPORT, null, msgs);
			msgs = basicSetMeasureReport(newMeasureReport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEASURE_REPORT, newMeasureReport, newMeasureReport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Medication getMedication() {
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedication(Medication newMedication, NotificationChain msgs) {
		Medication oldMedication = medication;
		medication = newMedication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDICATION, oldMedication, newMedication);
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
	public void setMedication(Medication newMedication) {
		if (newMedication != medication) {
			NotificationChain msgs = null;
			if (medication != null)
				msgs = ((InternalEObject)medication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDICATION, null, msgs);
			if (newMedication != null)
				msgs = ((InternalEObject)newMedication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDICATION, null, msgs);
			msgs = basicSetMedication(newMedication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDICATION, newMedication, newMedication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationAdministration getMedicationAdministration() {
		return medicationAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationAdministration(MedicationAdministration newMedicationAdministration, NotificationChain msgs) {
		MedicationAdministration oldMedicationAdministration = medicationAdministration;
		medicationAdministration = newMedicationAdministration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDICATION_ADMINISTRATION, oldMedicationAdministration, newMedicationAdministration);
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
	public void setMedicationAdministration(MedicationAdministration newMedicationAdministration) {
		if (newMedicationAdministration != medicationAdministration) {
			NotificationChain msgs = null;
			if (medicationAdministration != null)
				msgs = ((InternalEObject)medicationAdministration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDICATION_ADMINISTRATION, null, msgs);
			if (newMedicationAdministration != null)
				msgs = ((InternalEObject)newMedicationAdministration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDICATION_ADMINISTRATION, null, msgs);
			msgs = basicSetMedicationAdministration(newMedicationAdministration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDICATION_ADMINISTRATION, newMedicationAdministration, newMedicationAdministration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationDispense getMedicationDispense() {
		return medicationDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationDispense(MedicationDispense newMedicationDispense, NotificationChain msgs) {
		MedicationDispense oldMedicationDispense = medicationDispense;
		medicationDispense = newMedicationDispense;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDICATION_DISPENSE, oldMedicationDispense, newMedicationDispense);
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
	public void setMedicationDispense(MedicationDispense newMedicationDispense) {
		if (newMedicationDispense != medicationDispense) {
			NotificationChain msgs = null;
			if (medicationDispense != null)
				msgs = ((InternalEObject)medicationDispense).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDICATION_DISPENSE, null, msgs);
			if (newMedicationDispense != null)
				msgs = ((InternalEObject)newMedicationDispense).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDICATION_DISPENSE, null, msgs);
			msgs = basicSetMedicationDispense(newMedicationDispense, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDICATION_DISPENSE, newMedicationDispense, newMedicationDispense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledge getMedicationKnowledge() {
		return medicationKnowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationKnowledge(MedicationKnowledge newMedicationKnowledge, NotificationChain msgs) {
		MedicationKnowledge oldMedicationKnowledge = medicationKnowledge;
		medicationKnowledge = newMedicationKnowledge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDICATION_KNOWLEDGE, oldMedicationKnowledge, newMedicationKnowledge);
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
	public void setMedicationKnowledge(MedicationKnowledge newMedicationKnowledge) {
		if (newMedicationKnowledge != medicationKnowledge) {
			NotificationChain msgs = null;
			if (medicationKnowledge != null)
				msgs = ((InternalEObject)medicationKnowledge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDICATION_KNOWLEDGE, null, msgs);
			if (newMedicationKnowledge != null)
				msgs = ((InternalEObject)newMedicationKnowledge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDICATION_KNOWLEDGE, null, msgs);
			msgs = basicSetMedicationKnowledge(newMedicationKnowledge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDICATION_KNOWLEDGE, newMedicationKnowledge, newMedicationKnowledge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationRequest getMedicationRequest() {
		return medicationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationRequest(MedicationRequest newMedicationRequest, NotificationChain msgs) {
		MedicationRequest oldMedicationRequest = medicationRequest;
		medicationRequest = newMedicationRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDICATION_REQUEST, oldMedicationRequest, newMedicationRequest);
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
	public void setMedicationRequest(MedicationRequest newMedicationRequest) {
		if (newMedicationRequest != medicationRequest) {
			NotificationChain msgs = null;
			if (medicationRequest != null)
				msgs = ((InternalEObject)medicationRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDICATION_REQUEST, null, msgs);
			if (newMedicationRequest != null)
				msgs = ((InternalEObject)newMedicationRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDICATION_REQUEST, null, msgs);
			msgs = basicSetMedicationRequest(newMedicationRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDICATION_REQUEST, newMedicationRequest, newMedicationRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationStatement getMedicationStatement() {
		return medicationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationStatement(MedicationStatement newMedicationStatement, NotificationChain msgs) {
		MedicationStatement oldMedicationStatement = medicationStatement;
		medicationStatement = newMedicationStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDICATION_STATEMENT, oldMedicationStatement, newMedicationStatement);
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
	public void setMedicationStatement(MedicationStatement newMedicationStatement) {
		if (newMedicationStatement != medicationStatement) {
			NotificationChain msgs = null;
			if (medicationStatement != null)
				msgs = ((InternalEObject)medicationStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDICATION_STATEMENT, null, msgs);
			if (newMedicationStatement != null)
				msgs = ((InternalEObject)newMedicationStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDICATION_STATEMENT, null, msgs);
			msgs = basicSetMedicationStatement(newMedicationStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDICATION_STATEMENT, newMedicationStatement, newMedicationStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductDefinition getMedicinalProductDefinition() {
		return medicinalProductDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicinalProductDefinition(MedicinalProductDefinition newMedicinalProductDefinition, NotificationChain msgs) {
		MedicinalProductDefinition oldMedicinalProductDefinition = medicinalProductDefinition;
		medicinalProductDefinition = newMedicinalProductDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDICINAL_PRODUCT_DEFINITION, oldMedicinalProductDefinition, newMedicinalProductDefinition);
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
	public void setMedicinalProductDefinition(MedicinalProductDefinition newMedicinalProductDefinition) {
		if (newMedicinalProductDefinition != medicinalProductDefinition) {
			NotificationChain msgs = null;
			if (medicinalProductDefinition != null)
				msgs = ((InternalEObject)medicinalProductDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDICINAL_PRODUCT_DEFINITION, null, msgs);
			if (newMedicinalProductDefinition != null)
				msgs = ((InternalEObject)newMedicinalProductDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDICINAL_PRODUCT_DEFINITION, null, msgs);
			msgs = basicSetMedicinalProductDefinition(newMedicinalProductDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDICINAL_PRODUCT_DEFINITION, newMedicinalProductDefinition, newMedicinalProductDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageDefinition getMessageDefinition() {
		return messageDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageDefinition(MessageDefinition newMessageDefinition, NotificationChain msgs) {
		MessageDefinition oldMessageDefinition = messageDefinition;
		messageDefinition = newMessageDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MESSAGE_DEFINITION, oldMessageDefinition, newMessageDefinition);
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
	public void setMessageDefinition(MessageDefinition newMessageDefinition) {
		if (newMessageDefinition != messageDefinition) {
			NotificationChain msgs = null;
			if (messageDefinition != null)
				msgs = ((InternalEObject)messageDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MESSAGE_DEFINITION, null, msgs);
			if (newMessageDefinition != null)
				msgs = ((InternalEObject)newMessageDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MESSAGE_DEFINITION, null, msgs);
			msgs = basicSetMessageDefinition(newMessageDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MESSAGE_DEFINITION, newMessageDefinition, newMessageDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageHeader getMessageHeader() {
		return messageHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageHeader(MessageHeader newMessageHeader, NotificationChain msgs) {
		MessageHeader oldMessageHeader = messageHeader;
		messageHeader = newMessageHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MESSAGE_HEADER, oldMessageHeader, newMessageHeader);
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
	public void setMessageHeader(MessageHeader newMessageHeader) {
		if (newMessageHeader != messageHeader) {
			NotificationChain msgs = null;
			if (messageHeader != null)
				msgs = ((InternalEObject)messageHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MESSAGE_HEADER, null, msgs);
			if (newMessageHeader != null)
				msgs = ((InternalEObject)newMessageHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MESSAGE_HEADER, null, msgs);
			msgs = basicSetMessageHeader(newMessageHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MESSAGE_HEADER, newMessageHeader, newMessageHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequence getMolecularSequence() {
		return molecularSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMolecularSequence(MolecularSequence newMolecularSequence, NotificationChain msgs) {
		MolecularSequence oldMolecularSequence = molecularSequence;
		molecularSequence = newMolecularSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MOLECULAR_SEQUENCE, oldMolecularSequence, newMolecularSequence);
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
	public void setMolecularSequence(MolecularSequence newMolecularSequence) {
		if (newMolecularSequence != molecularSequence) {
			NotificationChain msgs = null;
			if (molecularSequence != null)
				msgs = ((InternalEObject)molecularSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MOLECULAR_SEQUENCE, null, msgs);
			if (newMolecularSequence != null)
				msgs = ((InternalEObject)newMolecularSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MOLECULAR_SEQUENCE, null, msgs);
			msgs = basicSetMolecularSequence(newMolecularSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MOLECULAR_SEQUENCE, newMolecularSequence, newMolecularSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamingSystem getNamingSystem() {
		return namingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamingSystem(NamingSystem newNamingSystem, NotificationChain msgs) {
		NamingSystem oldNamingSystem = namingSystem;
		namingSystem = newNamingSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__NAMING_SYSTEM, oldNamingSystem, newNamingSystem);
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
	public void setNamingSystem(NamingSystem newNamingSystem) {
		if (newNamingSystem != namingSystem) {
			NotificationChain msgs = null;
			if (namingSystem != null)
				msgs = ((InternalEObject)namingSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__NAMING_SYSTEM, null, msgs);
			if (newNamingSystem != null)
				msgs = ((InternalEObject)newNamingSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__NAMING_SYSTEM, null, msgs);
			msgs = basicSetNamingSystem(newNamingSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__NAMING_SYSTEM, newNamingSystem, newNamingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionIntake getNutritionIntake() {
		return nutritionIntake;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNutritionIntake(NutritionIntake newNutritionIntake, NotificationChain msgs) {
		NutritionIntake oldNutritionIntake = nutritionIntake;
		nutritionIntake = newNutritionIntake;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__NUTRITION_INTAKE, oldNutritionIntake, newNutritionIntake);
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
	public void setNutritionIntake(NutritionIntake newNutritionIntake) {
		if (newNutritionIntake != nutritionIntake) {
			NotificationChain msgs = null;
			if (nutritionIntake != null)
				msgs = ((InternalEObject)nutritionIntake).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__NUTRITION_INTAKE, null, msgs);
			if (newNutritionIntake != null)
				msgs = ((InternalEObject)newNutritionIntake).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__NUTRITION_INTAKE, null, msgs);
			msgs = basicSetNutritionIntake(newNutritionIntake, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__NUTRITION_INTAKE, newNutritionIntake, newNutritionIntake));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionOrder getNutritionOrder() {
		return nutritionOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNutritionOrder(NutritionOrder newNutritionOrder, NotificationChain msgs) {
		NutritionOrder oldNutritionOrder = nutritionOrder;
		nutritionOrder = newNutritionOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__NUTRITION_ORDER, oldNutritionOrder, newNutritionOrder);
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
	public void setNutritionOrder(NutritionOrder newNutritionOrder) {
		if (newNutritionOrder != nutritionOrder) {
			NotificationChain msgs = null;
			if (nutritionOrder != null)
				msgs = ((InternalEObject)nutritionOrder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__NUTRITION_ORDER, null, msgs);
			if (newNutritionOrder != null)
				msgs = ((InternalEObject)newNutritionOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__NUTRITION_ORDER, null, msgs);
			msgs = basicSetNutritionOrder(newNutritionOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__NUTRITION_ORDER, newNutritionOrder, newNutritionOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionProduct getNutritionProduct() {
		return nutritionProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNutritionProduct(NutritionProduct newNutritionProduct, NotificationChain msgs) {
		NutritionProduct oldNutritionProduct = nutritionProduct;
		nutritionProduct = newNutritionProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__NUTRITION_PRODUCT, oldNutritionProduct, newNutritionProduct);
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
	public void setNutritionProduct(NutritionProduct newNutritionProduct) {
		if (newNutritionProduct != nutritionProduct) {
			NotificationChain msgs = null;
			if (nutritionProduct != null)
				msgs = ((InternalEObject)nutritionProduct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__NUTRITION_PRODUCT, null, msgs);
			if (newNutritionProduct != null)
				msgs = ((InternalEObject)newNutritionProduct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__NUTRITION_PRODUCT, null, msgs);
			msgs = basicSetNutritionProduct(newNutritionProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__NUTRITION_PRODUCT, newNutritionProduct, newNutritionProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Observation getObservation() {
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObservation(Observation newObservation, NotificationChain msgs) {
		Observation oldObservation = observation;
		observation = newObservation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__OBSERVATION, oldObservation, newObservation);
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
	public void setObservation(Observation newObservation) {
		if (newObservation != observation) {
			NotificationChain msgs = null;
			if (observation != null)
				msgs = ((InternalEObject)observation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__OBSERVATION, null, msgs);
			if (newObservation != null)
				msgs = ((InternalEObject)newObservation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__OBSERVATION, null, msgs);
			msgs = basicSetObservation(newObservation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__OBSERVATION, newObservation, newObservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObservationDefinition getObservationDefinition() {
		return observationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObservationDefinition(ObservationDefinition newObservationDefinition, NotificationChain msgs) {
		ObservationDefinition oldObservationDefinition = observationDefinition;
		observationDefinition = newObservationDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__OBSERVATION_DEFINITION, oldObservationDefinition, newObservationDefinition);
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
	public void setObservationDefinition(ObservationDefinition newObservationDefinition) {
		if (newObservationDefinition != observationDefinition) {
			NotificationChain msgs = null;
			if (observationDefinition != null)
				msgs = ((InternalEObject)observationDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__OBSERVATION_DEFINITION, null, msgs);
			if (newObservationDefinition != null)
				msgs = ((InternalEObject)newObservationDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__OBSERVATION_DEFINITION, null, msgs);
			msgs = basicSetObservationDefinition(newObservationDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__OBSERVATION_DEFINITION, newObservationDefinition, newObservationDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationDefinition getOperationDefinition() {
		return operationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationDefinition(OperationDefinition newOperationDefinition, NotificationChain msgs) {
		OperationDefinition oldOperationDefinition = operationDefinition;
		operationDefinition = newOperationDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__OPERATION_DEFINITION, oldOperationDefinition, newOperationDefinition);
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
	public void setOperationDefinition(OperationDefinition newOperationDefinition) {
		if (newOperationDefinition != operationDefinition) {
			NotificationChain msgs = null;
			if (operationDefinition != null)
				msgs = ((InternalEObject)operationDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__OPERATION_DEFINITION, null, msgs);
			if (newOperationDefinition != null)
				msgs = ((InternalEObject)newOperationDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__OPERATION_DEFINITION, null, msgs);
			msgs = basicSetOperationDefinition(newOperationDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__OPERATION_DEFINITION, newOperationDefinition, newOperationDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationOutcome getOperationOutcome() {
		return operationOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationOutcome(OperationOutcome newOperationOutcome, NotificationChain msgs) {
		OperationOutcome oldOperationOutcome = operationOutcome;
		operationOutcome = newOperationOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__OPERATION_OUTCOME, oldOperationOutcome, newOperationOutcome);
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
	public void setOperationOutcome(OperationOutcome newOperationOutcome) {
		if (newOperationOutcome != operationOutcome) {
			NotificationChain msgs = null;
			if (operationOutcome != null)
				msgs = ((InternalEObject)operationOutcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__OPERATION_OUTCOME, null, msgs);
			if (newOperationOutcome != null)
				msgs = ((InternalEObject)newOperationOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__OPERATION_OUTCOME, null, msgs);
			msgs = basicSetOperationOutcome(newOperationOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__OPERATION_OUTCOME, newOperationOutcome, newOperationOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Organization getOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(Organization newOrganization, NotificationChain msgs) {
		Organization oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ORGANIZATION, oldOrganization, newOrganization);
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
	public void setOrganization(Organization newOrganization) {
		if (newOrganization != organization) {
			NotificationChain msgs = null;
			if (organization != null)
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationAffiliation getOrganizationAffiliation() {
		return organizationAffiliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationAffiliation(OrganizationAffiliation newOrganizationAffiliation, NotificationChain msgs) {
		OrganizationAffiliation oldOrganizationAffiliation = organizationAffiliation;
		organizationAffiliation = newOrganizationAffiliation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ORGANIZATION_AFFILIATION, oldOrganizationAffiliation, newOrganizationAffiliation);
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
	public void setOrganizationAffiliation(OrganizationAffiliation newOrganizationAffiliation) {
		if (newOrganizationAffiliation != organizationAffiliation) {
			NotificationChain msgs = null;
			if (organizationAffiliation != null)
				msgs = ((InternalEObject)organizationAffiliation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ORGANIZATION_AFFILIATION, null, msgs);
			if (newOrganizationAffiliation != null)
				msgs = ((InternalEObject)newOrganizationAffiliation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ORGANIZATION_AFFILIATION, null, msgs);
			msgs = basicSetOrganizationAffiliation(newOrganizationAffiliation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ORGANIZATION_AFFILIATION, newOrganizationAffiliation, newOrganizationAffiliation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackagedProductDefinition getPackagedProductDefinition() {
		return packagedProductDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackagedProductDefinition(PackagedProductDefinition newPackagedProductDefinition, NotificationChain msgs) {
		PackagedProductDefinition oldPackagedProductDefinition = packagedProductDefinition;
		packagedProductDefinition = newPackagedProductDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PACKAGED_PRODUCT_DEFINITION, oldPackagedProductDefinition, newPackagedProductDefinition);
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
	public void setPackagedProductDefinition(PackagedProductDefinition newPackagedProductDefinition) {
		if (newPackagedProductDefinition != packagedProductDefinition) {
			NotificationChain msgs = null;
			if (packagedProductDefinition != null)
				msgs = ((InternalEObject)packagedProductDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PACKAGED_PRODUCT_DEFINITION, null, msgs);
			if (newPackagedProductDefinition != null)
				msgs = ((InternalEObject)newPackagedProductDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PACKAGED_PRODUCT_DEFINITION, null, msgs);
			msgs = basicSetPackagedProductDefinition(newPackagedProductDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PACKAGED_PRODUCT_DEFINITION, newPackagedProductDefinition, newPackagedProductDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Patient getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Patient newPatient, NotificationChain msgs) {
		Patient oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PATIENT, oldPatient, newPatient);
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
	public void setPatient(Patient newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentNotice getPaymentNotice() {
		return paymentNotice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentNotice(PaymentNotice newPaymentNotice, NotificationChain msgs) {
		PaymentNotice oldPaymentNotice = paymentNotice;
		paymentNotice = newPaymentNotice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PAYMENT_NOTICE, oldPaymentNotice, newPaymentNotice);
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
	public void setPaymentNotice(PaymentNotice newPaymentNotice) {
		if (newPaymentNotice != paymentNotice) {
			NotificationChain msgs = null;
			if (paymentNotice != null)
				msgs = ((InternalEObject)paymentNotice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PAYMENT_NOTICE, null, msgs);
			if (newPaymentNotice != null)
				msgs = ((InternalEObject)newPaymentNotice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PAYMENT_NOTICE, null, msgs);
			msgs = basicSetPaymentNotice(newPaymentNotice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PAYMENT_NOTICE, newPaymentNotice, newPaymentNotice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentReconciliation getPaymentReconciliation() {
		return paymentReconciliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentReconciliation(PaymentReconciliation newPaymentReconciliation, NotificationChain msgs) {
		PaymentReconciliation oldPaymentReconciliation = paymentReconciliation;
		paymentReconciliation = newPaymentReconciliation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PAYMENT_RECONCILIATION, oldPaymentReconciliation, newPaymentReconciliation);
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
	public void setPaymentReconciliation(PaymentReconciliation newPaymentReconciliation) {
		if (newPaymentReconciliation != paymentReconciliation) {
			NotificationChain msgs = null;
			if (paymentReconciliation != null)
				msgs = ((InternalEObject)paymentReconciliation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PAYMENT_RECONCILIATION, null, msgs);
			if (newPaymentReconciliation != null)
				msgs = ((InternalEObject)newPaymentReconciliation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PAYMENT_RECONCILIATION, null, msgs);
			msgs = basicSetPaymentReconciliation(newPaymentReconciliation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PAYMENT_RECONCILIATION, newPaymentReconciliation, newPaymentReconciliation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permission getPermission() {
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPermission(Permission newPermission, NotificationChain msgs) {
		Permission oldPermission = permission;
		permission = newPermission;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PERMISSION, oldPermission, newPermission);
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
	public void setPermission(Permission newPermission) {
		if (newPermission != permission) {
			NotificationChain msgs = null;
			if (permission != null)
				msgs = ((InternalEObject)permission).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PERMISSION, null, msgs);
			if (newPermission != null)
				msgs = ((InternalEObject)newPermission).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PERMISSION, null, msgs);
			msgs = basicSetPermission(newPermission, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PERMISSION, newPermission, newPermission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(Person newPerson, NotificationChain msgs) {
		Person oldPerson = person;
		person = newPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PERSON, oldPerson, newPerson);
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
	public void setPerson(Person newPerson) {
		if (newPerson != person) {
			NotificationChain msgs = null;
			if (person != null)
				msgs = ((InternalEObject)person).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PERSON, null, msgs);
			if (newPerson != null)
				msgs = ((InternalEObject)newPerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PERSON, null, msgs);
			msgs = basicSetPerson(newPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PERSON, newPerson, newPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanDefinition getPlanDefinition() {
		return planDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanDefinition(PlanDefinition newPlanDefinition, NotificationChain msgs) {
		PlanDefinition oldPlanDefinition = planDefinition;
		planDefinition = newPlanDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PLAN_DEFINITION, oldPlanDefinition, newPlanDefinition);
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
	public void setPlanDefinition(PlanDefinition newPlanDefinition) {
		if (newPlanDefinition != planDefinition) {
			NotificationChain msgs = null;
			if (planDefinition != null)
				msgs = ((InternalEObject)planDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PLAN_DEFINITION, null, msgs);
			if (newPlanDefinition != null)
				msgs = ((InternalEObject)newPlanDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PLAN_DEFINITION, null, msgs);
			msgs = basicSetPlanDefinition(newPlanDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PLAN_DEFINITION, newPlanDefinition, newPlanDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Practitioner getPractitioner() {
		return practitioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPractitioner(Practitioner newPractitioner, NotificationChain msgs) {
		Practitioner oldPractitioner = practitioner;
		practitioner = newPractitioner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PRACTITIONER, oldPractitioner, newPractitioner);
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
	public void setPractitioner(Practitioner newPractitioner) {
		if (newPractitioner != practitioner) {
			NotificationChain msgs = null;
			if (practitioner != null)
				msgs = ((InternalEObject)practitioner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PRACTITIONER, null, msgs);
			if (newPractitioner != null)
				msgs = ((InternalEObject)newPractitioner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PRACTITIONER, null, msgs);
			msgs = basicSetPractitioner(newPractitioner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PRACTITIONER, newPractitioner, newPractitioner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PractitionerRole getPractitionerRole() {
		return practitionerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPractitionerRole(PractitionerRole newPractitionerRole, NotificationChain msgs) {
		PractitionerRole oldPractitionerRole = practitionerRole;
		practitionerRole = newPractitionerRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PRACTITIONER_ROLE, oldPractitionerRole, newPractitionerRole);
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
	public void setPractitionerRole(PractitionerRole newPractitionerRole) {
		if (newPractitionerRole != practitionerRole) {
			NotificationChain msgs = null;
			if (practitionerRole != null)
				msgs = ((InternalEObject)practitionerRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PRACTITIONER_ROLE, null, msgs);
			if (newPractitionerRole != null)
				msgs = ((InternalEObject)newPractitionerRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PRACTITIONER_ROLE, null, msgs);
			msgs = basicSetPractitionerRole(newPractitionerRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PRACTITIONER_ROLE, newPractitionerRole, newPractitionerRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Procedure getProcedure() {
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedure(Procedure newProcedure, NotificationChain msgs) {
		Procedure oldProcedure = procedure;
		procedure = newProcedure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PROCEDURE, oldProcedure, newProcedure);
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
	public void setProcedure(Procedure newProcedure) {
		if (newProcedure != procedure) {
			NotificationChain msgs = null;
			if (procedure != null)
				msgs = ((InternalEObject)procedure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PROCEDURE, null, msgs);
			if (newProcedure != null)
				msgs = ((InternalEObject)newProcedure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PROCEDURE, null, msgs);
			msgs = basicSetProcedure(newProcedure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PROCEDURE, newProcedure, newProcedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Provenance getProvenance() {
		return provenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvenance(Provenance newProvenance, NotificationChain msgs) {
		Provenance oldProvenance = provenance;
		provenance = newProvenance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PROVENANCE, oldProvenance, newProvenance);
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
	public void setProvenance(Provenance newProvenance) {
		if (newProvenance != provenance) {
			NotificationChain msgs = null;
			if (provenance != null)
				msgs = ((InternalEObject)provenance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PROVENANCE, null, msgs);
			if (newProvenance != null)
				msgs = ((InternalEObject)newProvenance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PROVENANCE, null, msgs);
			msgs = basicSetProvenance(newProvenance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PROVENANCE, newProvenance, newProvenance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Questionnaire getQuestionnaire() {
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestionnaire(Questionnaire newQuestionnaire, NotificationChain msgs) {
		Questionnaire oldQuestionnaire = questionnaire;
		questionnaire = newQuestionnaire;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE, oldQuestionnaire, newQuestionnaire);
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
	public void setQuestionnaire(Questionnaire newQuestionnaire) {
		if (newQuestionnaire != questionnaire) {
			NotificationChain msgs = null;
			if (questionnaire != null)
				msgs = ((InternalEObject)questionnaire).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE, null, msgs);
			if (newQuestionnaire != null)
				msgs = ((InternalEObject)newQuestionnaire).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE, null, msgs);
			msgs = basicSetQuestionnaire(newQuestionnaire, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE, newQuestionnaire, newQuestionnaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireResponse getQuestionnaireResponse() {
		return questionnaireResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestionnaireResponse(QuestionnaireResponse newQuestionnaireResponse, NotificationChain msgs) {
		QuestionnaireResponse oldQuestionnaireResponse = questionnaireResponse;
		questionnaireResponse = newQuestionnaireResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE_RESPONSE, oldQuestionnaireResponse, newQuestionnaireResponse);
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
	public void setQuestionnaireResponse(QuestionnaireResponse newQuestionnaireResponse) {
		if (newQuestionnaireResponse != questionnaireResponse) {
			NotificationChain msgs = null;
			if (questionnaireResponse != null)
				msgs = ((InternalEObject)questionnaireResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE_RESPONSE, null, msgs);
			if (newQuestionnaireResponse != null)
				msgs = ((InternalEObject)newQuestionnaireResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE_RESPONSE, null, msgs);
			msgs = basicSetQuestionnaireResponse(newQuestionnaireResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE_RESPONSE, newQuestionnaireResponse, newQuestionnaireResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegulatedAuthorization getRegulatedAuthorization() {
		return regulatedAuthorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegulatedAuthorization(RegulatedAuthorization newRegulatedAuthorization, NotificationChain msgs) {
		RegulatedAuthorization oldRegulatedAuthorization = regulatedAuthorization;
		regulatedAuthorization = newRegulatedAuthorization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__REGULATED_AUTHORIZATION, oldRegulatedAuthorization, newRegulatedAuthorization);
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
	public void setRegulatedAuthorization(RegulatedAuthorization newRegulatedAuthorization) {
		if (newRegulatedAuthorization != regulatedAuthorization) {
			NotificationChain msgs = null;
			if (regulatedAuthorization != null)
				msgs = ((InternalEObject)regulatedAuthorization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__REGULATED_AUTHORIZATION, null, msgs);
			if (newRegulatedAuthorization != null)
				msgs = ((InternalEObject)newRegulatedAuthorization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__REGULATED_AUTHORIZATION, null, msgs);
			msgs = basicSetRegulatedAuthorization(newRegulatedAuthorization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__REGULATED_AUTHORIZATION, newRegulatedAuthorization, newRegulatedAuthorization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedPerson getRelatedPerson() {
		return relatedPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedPerson(RelatedPerson newRelatedPerson, NotificationChain msgs) {
		RelatedPerson oldRelatedPerson = relatedPerson;
		relatedPerson = newRelatedPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__RELATED_PERSON, oldRelatedPerson, newRelatedPerson);
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
	public void setRelatedPerson(RelatedPerson newRelatedPerson) {
		if (newRelatedPerson != relatedPerson) {
			NotificationChain msgs = null;
			if (relatedPerson != null)
				msgs = ((InternalEObject)relatedPerson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__RELATED_PERSON, null, msgs);
			if (newRelatedPerson != null)
				msgs = ((InternalEObject)newRelatedPerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__RELATED_PERSON, null, msgs);
			msgs = basicSetRelatedPerson(newRelatedPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__RELATED_PERSON, newRelatedPerson, newRelatedPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestOrchestration getRequestOrchestration() {
		return requestOrchestration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestOrchestration(RequestOrchestration newRequestOrchestration, NotificationChain msgs) {
		RequestOrchestration oldRequestOrchestration = requestOrchestration;
		requestOrchestration = newRequestOrchestration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__REQUEST_ORCHESTRATION, oldRequestOrchestration, newRequestOrchestration);
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
	public void setRequestOrchestration(RequestOrchestration newRequestOrchestration) {
		if (newRequestOrchestration != requestOrchestration) {
			NotificationChain msgs = null;
			if (requestOrchestration != null)
				msgs = ((InternalEObject)requestOrchestration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__REQUEST_ORCHESTRATION, null, msgs);
			if (newRequestOrchestration != null)
				msgs = ((InternalEObject)newRequestOrchestration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__REQUEST_ORCHESTRATION, null, msgs);
			msgs = basicSetRequestOrchestration(newRequestOrchestration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__REQUEST_ORCHESTRATION, newRequestOrchestration, newRequestOrchestration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Requirements getRequirements() {
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirements(Requirements newRequirements, NotificationChain msgs) {
		Requirements oldRequirements = requirements;
		requirements = newRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__REQUIREMENTS, oldRequirements, newRequirements);
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
	public void setRequirements(Requirements newRequirements) {
		if (newRequirements != requirements) {
			NotificationChain msgs = null;
			if (requirements != null)
				msgs = ((InternalEObject)requirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__REQUIREMENTS, null, msgs);
			if (newRequirements != null)
				msgs = ((InternalEObject)newRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__REQUIREMENTS, null, msgs);
			msgs = basicSetRequirements(newRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__REQUIREMENTS, newRequirements, newRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResearchStudy getResearchStudy() {
		return researchStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResearchStudy(ResearchStudy newResearchStudy, NotificationChain msgs) {
		ResearchStudy oldResearchStudy = researchStudy;
		researchStudy = newResearchStudy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__RESEARCH_STUDY, oldResearchStudy, newResearchStudy);
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
	public void setResearchStudy(ResearchStudy newResearchStudy) {
		if (newResearchStudy != researchStudy) {
			NotificationChain msgs = null;
			if (researchStudy != null)
				msgs = ((InternalEObject)researchStudy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__RESEARCH_STUDY, null, msgs);
			if (newResearchStudy != null)
				msgs = ((InternalEObject)newResearchStudy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__RESEARCH_STUDY, null, msgs);
			msgs = basicSetResearchStudy(newResearchStudy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__RESEARCH_STUDY, newResearchStudy, newResearchStudy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResearchSubject getResearchSubject() {
		return researchSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResearchSubject(ResearchSubject newResearchSubject, NotificationChain msgs) {
		ResearchSubject oldResearchSubject = researchSubject;
		researchSubject = newResearchSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__RESEARCH_SUBJECT, oldResearchSubject, newResearchSubject);
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
	public void setResearchSubject(ResearchSubject newResearchSubject) {
		if (newResearchSubject != researchSubject) {
			NotificationChain msgs = null;
			if (researchSubject != null)
				msgs = ((InternalEObject)researchSubject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__RESEARCH_SUBJECT, null, msgs);
			if (newResearchSubject != null)
				msgs = ((InternalEObject)newResearchSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__RESEARCH_SUBJECT, null, msgs);
			msgs = basicSetResearchSubject(newResearchSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__RESEARCH_SUBJECT, newResearchSubject, newResearchSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskAssessment getRiskAssessment() {
		return riskAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRiskAssessment(RiskAssessment newRiskAssessment, NotificationChain msgs) {
		RiskAssessment oldRiskAssessment = riskAssessment;
		riskAssessment = newRiskAssessment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__RISK_ASSESSMENT, oldRiskAssessment, newRiskAssessment);
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
	public void setRiskAssessment(RiskAssessment newRiskAssessment) {
		if (newRiskAssessment != riskAssessment) {
			NotificationChain msgs = null;
			if (riskAssessment != null)
				msgs = ((InternalEObject)riskAssessment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__RISK_ASSESSMENT, null, msgs);
			if (newRiskAssessment != null)
				msgs = ((InternalEObject)newRiskAssessment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__RISK_ASSESSMENT, null, msgs);
			msgs = basicSetRiskAssessment(newRiskAssessment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__RISK_ASSESSMENT, newRiskAssessment, newRiskAssessment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schedule getSchedule() {
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedule(Schedule newSchedule, NotificationChain msgs) {
		Schedule oldSchedule = schedule;
		schedule = newSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SCHEDULE, oldSchedule, newSchedule);
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
	public void setSchedule(Schedule newSchedule) {
		if (newSchedule != schedule) {
			NotificationChain msgs = null;
			if (schedule != null)
				msgs = ((InternalEObject)schedule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SCHEDULE, null, msgs);
			if (newSchedule != null)
				msgs = ((InternalEObject)newSchedule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SCHEDULE, null, msgs);
			msgs = basicSetSchedule(newSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SCHEDULE, newSchedule, newSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SearchParameter getSearchParameter() {
		return searchParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSearchParameter(SearchParameter newSearchParameter, NotificationChain msgs) {
		SearchParameter oldSearchParameter = searchParameter;
		searchParameter = newSearchParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SEARCH_PARAMETER, oldSearchParameter, newSearchParameter);
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
	public void setSearchParameter(SearchParameter newSearchParameter) {
		if (newSearchParameter != searchParameter) {
			NotificationChain msgs = null;
			if (searchParameter != null)
				msgs = ((InternalEObject)searchParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SEARCH_PARAMETER, null, msgs);
			if (newSearchParameter != null)
				msgs = ((InternalEObject)newSearchParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SEARCH_PARAMETER, null, msgs);
			msgs = basicSetSearchParameter(newSearchParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SEARCH_PARAMETER, newSearchParameter, newSearchParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceRequest getServiceRequest() {
		return serviceRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceRequest(ServiceRequest newServiceRequest, NotificationChain msgs) {
		ServiceRequest oldServiceRequest = serviceRequest;
		serviceRequest = newServiceRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SERVICE_REQUEST, oldServiceRequest, newServiceRequest);
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
	public void setServiceRequest(ServiceRequest newServiceRequest) {
		if (newServiceRequest != serviceRequest) {
			NotificationChain msgs = null;
			if (serviceRequest != null)
				msgs = ((InternalEObject)serviceRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SERVICE_REQUEST, null, msgs);
			if (newServiceRequest != null)
				msgs = ((InternalEObject)newServiceRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SERVICE_REQUEST, null, msgs);
			msgs = basicSetServiceRequest(newServiceRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SERVICE_REQUEST, newServiceRequest, newServiceRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Slot getSlot() {
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlot(Slot newSlot, NotificationChain msgs) {
		Slot oldSlot = slot;
		slot = newSlot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SLOT, oldSlot, newSlot);
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
	public void setSlot(Slot newSlot) {
		if (newSlot != slot) {
			NotificationChain msgs = null;
			if (slot != null)
				msgs = ((InternalEObject)slot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SLOT, null, msgs);
			if (newSlot != null)
				msgs = ((InternalEObject)newSlot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SLOT, null, msgs);
			msgs = basicSetSlot(newSlot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SLOT, newSlot, newSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specimen getSpecimen() {
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecimen(Specimen newSpecimen, NotificationChain msgs) {
		Specimen oldSpecimen = specimen;
		specimen = newSpecimen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SPECIMEN, oldSpecimen, newSpecimen);
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
	public void setSpecimen(Specimen newSpecimen) {
		if (newSpecimen != specimen) {
			NotificationChain msgs = null;
			if (specimen != null)
				msgs = ((InternalEObject)specimen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SPECIMEN, null, msgs);
			if (newSpecimen != null)
				msgs = ((InternalEObject)newSpecimen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SPECIMEN, null, msgs);
			msgs = basicSetSpecimen(newSpecimen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SPECIMEN, newSpecimen, newSpecimen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenDefinition getSpecimenDefinition() {
		return specimenDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecimenDefinition(SpecimenDefinition newSpecimenDefinition, NotificationChain msgs) {
		SpecimenDefinition oldSpecimenDefinition = specimenDefinition;
		specimenDefinition = newSpecimenDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SPECIMEN_DEFINITION, oldSpecimenDefinition, newSpecimenDefinition);
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
	public void setSpecimenDefinition(SpecimenDefinition newSpecimenDefinition) {
		if (newSpecimenDefinition != specimenDefinition) {
			NotificationChain msgs = null;
			if (specimenDefinition != null)
				msgs = ((InternalEObject)specimenDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SPECIMEN_DEFINITION, null, msgs);
			if (newSpecimenDefinition != null)
				msgs = ((InternalEObject)newSpecimenDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SPECIMEN_DEFINITION, null, msgs);
			msgs = basicSetSpecimenDefinition(newSpecimenDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SPECIMEN_DEFINITION, newSpecimenDefinition, newSpecimenDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureDefinition getStructureDefinition() {
		return structureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructureDefinition(StructureDefinition newStructureDefinition, NotificationChain msgs) {
		StructureDefinition oldStructureDefinition = structureDefinition;
		structureDefinition = newStructureDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__STRUCTURE_DEFINITION, oldStructureDefinition, newStructureDefinition);
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
	public void setStructureDefinition(StructureDefinition newStructureDefinition) {
		if (newStructureDefinition != structureDefinition) {
			NotificationChain msgs = null;
			if (structureDefinition != null)
				msgs = ((InternalEObject)structureDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__STRUCTURE_DEFINITION, null, msgs);
			if (newStructureDefinition != null)
				msgs = ((InternalEObject)newStructureDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__STRUCTURE_DEFINITION, null, msgs);
			msgs = basicSetStructureDefinition(newStructureDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__STRUCTURE_DEFINITION, newStructureDefinition, newStructureDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMap getStructureMap() {
		return structureMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructureMap(StructureMap newStructureMap, NotificationChain msgs) {
		StructureMap oldStructureMap = structureMap;
		structureMap = newStructureMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__STRUCTURE_MAP, oldStructureMap, newStructureMap);
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
	public void setStructureMap(StructureMap newStructureMap) {
		if (newStructureMap != structureMap) {
			NotificationChain msgs = null;
			if (structureMap != null)
				msgs = ((InternalEObject)structureMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__STRUCTURE_MAP, null, msgs);
			if (newStructureMap != null)
				msgs = ((InternalEObject)newStructureMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__STRUCTURE_MAP, null, msgs);
			msgs = basicSetStructureMap(newStructureMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__STRUCTURE_MAP, newStructureMap, newStructureMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subscription getSubscription() {
		return subscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscription(Subscription newSubscription, NotificationChain msgs) {
		Subscription oldSubscription = subscription;
		subscription = newSubscription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION, oldSubscription, newSubscription);
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
	public void setSubscription(Subscription newSubscription) {
		if (newSubscription != subscription) {
			NotificationChain msgs = null;
			if (subscription != null)
				msgs = ((InternalEObject)subscription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION, null, msgs);
			if (newSubscription != null)
				msgs = ((InternalEObject)newSubscription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION, null, msgs);
			msgs = basicSetSubscription(newSubscription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION, newSubscription, newSubscription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionStatus getSubscriptionStatus() {
		return subscriptionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscriptionStatus(SubscriptionStatus newSubscriptionStatus, NotificationChain msgs) {
		SubscriptionStatus oldSubscriptionStatus = subscriptionStatus;
		subscriptionStatus = newSubscriptionStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION_STATUS, oldSubscriptionStatus, newSubscriptionStatus);
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
	public void setSubscriptionStatus(SubscriptionStatus newSubscriptionStatus) {
		if (newSubscriptionStatus != subscriptionStatus) {
			NotificationChain msgs = null;
			if (subscriptionStatus != null)
				msgs = ((InternalEObject)subscriptionStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION_STATUS, null, msgs);
			if (newSubscriptionStatus != null)
				msgs = ((InternalEObject)newSubscriptionStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION_STATUS, null, msgs);
			msgs = basicSetSubscriptionStatus(newSubscriptionStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION_STATUS, newSubscriptionStatus, newSubscriptionStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionTopic getSubscriptionTopic() {
		return subscriptionTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscriptionTopic(SubscriptionTopic newSubscriptionTopic, NotificationChain msgs) {
		SubscriptionTopic oldSubscriptionTopic = subscriptionTopic;
		subscriptionTopic = newSubscriptionTopic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION_TOPIC, oldSubscriptionTopic, newSubscriptionTopic);
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
	public void setSubscriptionTopic(SubscriptionTopic newSubscriptionTopic) {
		if (newSubscriptionTopic != subscriptionTopic) {
			NotificationChain msgs = null;
			if (subscriptionTopic != null)
				msgs = ((InternalEObject)subscriptionTopic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION_TOPIC, null, msgs);
			if (newSubscriptionTopic != null)
				msgs = ((InternalEObject)newSubscriptionTopic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION_TOPIC, null, msgs);
			msgs = basicSetSubscriptionTopic(newSubscriptionTopic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION_TOPIC, newSubscriptionTopic, newSubscriptionTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Substance getSubstance() {
		return substance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstance(Substance newSubstance, NotificationChain msgs) {
		Substance oldSubstance = substance;
		substance = newSubstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUBSTANCE, oldSubstance, newSubstance);
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
	public void setSubstance(Substance newSubstance) {
		if (newSubstance != substance) {
			NotificationChain msgs = null;
			if (substance != null)
				msgs = ((InternalEObject)substance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUBSTANCE, null, msgs);
			if (newSubstance != null)
				msgs = ((InternalEObject)newSubstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUBSTANCE, null, msgs);
			msgs = basicSetSubstance(newSubstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUBSTANCE, newSubstance, newSubstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceDefinition getSubstanceDefinition() {
		return substanceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstanceDefinition(SubstanceDefinition newSubstanceDefinition, NotificationChain msgs) {
		SubstanceDefinition oldSubstanceDefinition = substanceDefinition;
		substanceDefinition = newSubstanceDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_DEFINITION, oldSubstanceDefinition, newSubstanceDefinition);
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
	public void setSubstanceDefinition(SubstanceDefinition newSubstanceDefinition) {
		if (newSubstanceDefinition != substanceDefinition) {
			NotificationChain msgs = null;
			if (substanceDefinition != null)
				msgs = ((InternalEObject)substanceDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_DEFINITION, null, msgs);
			if (newSubstanceDefinition != null)
				msgs = ((InternalEObject)newSubstanceDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_DEFINITION, null, msgs);
			msgs = basicSetSubstanceDefinition(newSubstanceDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_DEFINITION, newSubstanceDefinition, newSubstanceDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceNucleicAcid getSubstanceNucleicAcid() {
		return substanceNucleicAcid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstanceNucleicAcid(SubstanceNucleicAcid newSubstanceNucleicAcid, NotificationChain msgs) {
		SubstanceNucleicAcid oldSubstanceNucleicAcid = substanceNucleicAcid;
		substanceNucleicAcid = newSubstanceNucleicAcid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_NUCLEIC_ACID, oldSubstanceNucleicAcid, newSubstanceNucleicAcid);
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
	public void setSubstanceNucleicAcid(SubstanceNucleicAcid newSubstanceNucleicAcid) {
		if (newSubstanceNucleicAcid != substanceNucleicAcid) {
			NotificationChain msgs = null;
			if (substanceNucleicAcid != null)
				msgs = ((InternalEObject)substanceNucleicAcid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_NUCLEIC_ACID, null, msgs);
			if (newSubstanceNucleicAcid != null)
				msgs = ((InternalEObject)newSubstanceNucleicAcid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_NUCLEIC_ACID, null, msgs);
			msgs = basicSetSubstanceNucleicAcid(newSubstanceNucleicAcid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_NUCLEIC_ACID, newSubstanceNucleicAcid, newSubstanceNucleicAcid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstancePolymer getSubstancePolymer() {
		return substancePolymer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstancePolymer(SubstancePolymer newSubstancePolymer, NotificationChain msgs) {
		SubstancePolymer oldSubstancePolymer = substancePolymer;
		substancePolymer = newSubstancePolymer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_POLYMER, oldSubstancePolymer, newSubstancePolymer);
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
	public void setSubstancePolymer(SubstancePolymer newSubstancePolymer) {
		if (newSubstancePolymer != substancePolymer) {
			NotificationChain msgs = null;
			if (substancePolymer != null)
				msgs = ((InternalEObject)substancePolymer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_POLYMER, null, msgs);
			if (newSubstancePolymer != null)
				msgs = ((InternalEObject)newSubstancePolymer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_POLYMER, null, msgs);
			msgs = basicSetSubstancePolymer(newSubstancePolymer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_POLYMER, newSubstancePolymer, newSubstancePolymer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceProtein getSubstanceProtein() {
		return substanceProtein;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstanceProtein(SubstanceProtein newSubstanceProtein, NotificationChain msgs) {
		SubstanceProtein oldSubstanceProtein = substanceProtein;
		substanceProtein = newSubstanceProtein;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_PROTEIN, oldSubstanceProtein, newSubstanceProtein);
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
	public void setSubstanceProtein(SubstanceProtein newSubstanceProtein) {
		if (newSubstanceProtein != substanceProtein) {
			NotificationChain msgs = null;
			if (substanceProtein != null)
				msgs = ((InternalEObject)substanceProtein).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_PROTEIN, null, msgs);
			if (newSubstanceProtein != null)
				msgs = ((InternalEObject)newSubstanceProtein).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_PROTEIN, null, msgs);
			msgs = basicSetSubstanceProtein(newSubstanceProtein, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_PROTEIN, newSubstanceProtein, newSubstanceProtein));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceReferenceInformation getSubstanceReferenceInformation() {
		return substanceReferenceInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstanceReferenceInformation(SubstanceReferenceInformation newSubstanceReferenceInformation, NotificationChain msgs) {
		SubstanceReferenceInformation oldSubstanceReferenceInformation = substanceReferenceInformation;
		substanceReferenceInformation = newSubstanceReferenceInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_REFERENCE_INFORMATION, oldSubstanceReferenceInformation, newSubstanceReferenceInformation);
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
	public void setSubstanceReferenceInformation(SubstanceReferenceInformation newSubstanceReferenceInformation) {
		if (newSubstanceReferenceInformation != substanceReferenceInformation) {
			NotificationChain msgs = null;
			if (substanceReferenceInformation != null)
				msgs = ((InternalEObject)substanceReferenceInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_REFERENCE_INFORMATION, null, msgs);
			if (newSubstanceReferenceInformation != null)
				msgs = ((InternalEObject)newSubstanceReferenceInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_REFERENCE_INFORMATION, null, msgs);
			msgs = basicSetSubstanceReferenceInformation(newSubstanceReferenceInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_REFERENCE_INFORMATION, newSubstanceReferenceInformation, newSubstanceReferenceInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSourceMaterial getSubstanceSourceMaterial() {
		return substanceSourceMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstanceSourceMaterial(SubstanceSourceMaterial newSubstanceSourceMaterial, NotificationChain msgs) {
		SubstanceSourceMaterial oldSubstanceSourceMaterial = substanceSourceMaterial;
		substanceSourceMaterial = newSubstanceSourceMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_SOURCE_MATERIAL, oldSubstanceSourceMaterial, newSubstanceSourceMaterial);
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
	public void setSubstanceSourceMaterial(SubstanceSourceMaterial newSubstanceSourceMaterial) {
		if (newSubstanceSourceMaterial != substanceSourceMaterial) {
			NotificationChain msgs = null;
			if (substanceSourceMaterial != null)
				msgs = ((InternalEObject)substanceSourceMaterial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_SOURCE_MATERIAL, null, msgs);
			if (newSubstanceSourceMaterial != null)
				msgs = ((InternalEObject)newSubstanceSourceMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_SOURCE_MATERIAL, null, msgs);
			msgs = basicSetSubstanceSourceMaterial(newSubstanceSourceMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_SOURCE_MATERIAL, newSubstanceSourceMaterial, newSubstanceSourceMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplyDelivery getSupplyDelivery() {
		return supplyDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplyDelivery(SupplyDelivery newSupplyDelivery, NotificationChain msgs) {
		SupplyDelivery oldSupplyDelivery = supplyDelivery;
		supplyDelivery = newSupplyDelivery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUPPLY_DELIVERY, oldSupplyDelivery, newSupplyDelivery);
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
	public void setSupplyDelivery(SupplyDelivery newSupplyDelivery) {
		if (newSupplyDelivery != supplyDelivery) {
			NotificationChain msgs = null;
			if (supplyDelivery != null)
				msgs = ((InternalEObject)supplyDelivery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUPPLY_DELIVERY, null, msgs);
			if (newSupplyDelivery != null)
				msgs = ((InternalEObject)newSupplyDelivery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUPPLY_DELIVERY, null, msgs);
			msgs = basicSetSupplyDelivery(newSupplyDelivery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUPPLY_DELIVERY, newSupplyDelivery, newSupplyDelivery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplyRequest getSupplyRequest() {
		return supplyRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplyRequest(SupplyRequest newSupplyRequest, NotificationChain msgs) {
		SupplyRequest oldSupplyRequest = supplyRequest;
		supplyRequest = newSupplyRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUPPLY_REQUEST, oldSupplyRequest, newSupplyRequest);
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
	public void setSupplyRequest(SupplyRequest newSupplyRequest) {
		if (newSupplyRequest != supplyRequest) {
			NotificationChain msgs = null;
			if (supplyRequest != null)
				msgs = ((InternalEObject)supplyRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUPPLY_REQUEST, null, msgs);
			if (newSupplyRequest != null)
				msgs = ((InternalEObject)newSupplyRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUPPLY_REQUEST, null, msgs);
			msgs = basicSetSupplyRequest(newSupplyRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUPPLY_REQUEST, newSupplyRequest, newSupplyRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task getTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(Task newTask, NotificationChain msgs) {
		Task oldTask = task;
		task = newTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__TASK, oldTask, newTask);
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
	public void setTask(Task newTask) {
		if (newTask != task) {
			NotificationChain msgs = null;
			if (task != null)
				msgs = ((InternalEObject)task).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__TASK, null, msgs);
			if (newTask != null)
				msgs = ((InternalEObject)newTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__TASK, null, msgs);
			msgs = basicSetTask(newTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__TASK, newTask, newTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilities getTerminologyCapabilities() {
		return terminologyCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminologyCapabilities(TerminologyCapabilities newTerminologyCapabilities, NotificationChain msgs) {
		TerminologyCapabilities oldTerminologyCapabilities = terminologyCapabilities;
		terminologyCapabilities = newTerminologyCapabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__TERMINOLOGY_CAPABILITIES, oldTerminologyCapabilities, newTerminologyCapabilities);
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
	public void setTerminologyCapabilities(TerminologyCapabilities newTerminologyCapabilities) {
		if (newTerminologyCapabilities != terminologyCapabilities) {
			NotificationChain msgs = null;
			if (terminologyCapabilities != null)
				msgs = ((InternalEObject)terminologyCapabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__TERMINOLOGY_CAPABILITIES, null, msgs);
			if (newTerminologyCapabilities != null)
				msgs = ((InternalEObject)newTerminologyCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__TERMINOLOGY_CAPABILITIES, null, msgs);
			msgs = basicSetTerminologyCapabilities(newTerminologyCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__TERMINOLOGY_CAPABILITIES, newTerminologyCapabilities, newTerminologyCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestPlan getTestPlan() {
		return testPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestPlan(TestPlan newTestPlan, NotificationChain msgs) {
		TestPlan oldTestPlan = testPlan;
		testPlan = newTestPlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__TEST_PLAN, oldTestPlan, newTestPlan);
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
	public void setTestPlan(TestPlan newTestPlan) {
		if (newTestPlan != testPlan) {
			NotificationChain msgs = null;
			if (testPlan != null)
				msgs = ((InternalEObject)testPlan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__TEST_PLAN, null, msgs);
			if (newTestPlan != null)
				msgs = ((InternalEObject)newTestPlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__TEST_PLAN, null, msgs);
			msgs = basicSetTestPlan(newTestPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__TEST_PLAN, newTestPlan, newTestPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReport getTestReport() {
		return testReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestReport(TestReport newTestReport, NotificationChain msgs) {
		TestReport oldTestReport = testReport;
		testReport = newTestReport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__TEST_REPORT, oldTestReport, newTestReport);
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
	public void setTestReport(TestReport newTestReport) {
		if (newTestReport != testReport) {
			NotificationChain msgs = null;
			if (testReport != null)
				msgs = ((InternalEObject)testReport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__TEST_REPORT, null, msgs);
			if (newTestReport != null)
				msgs = ((InternalEObject)newTestReport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__TEST_REPORT, null, msgs);
			msgs = basicSetTestReport(newTestReport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__TEST_REPORT, newTestReport, newTestReport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScript getTestScript() {
		return testScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestScript(TestScript newTestScript, NotificationChain msgs) {
		TestScript oldTestScript = testScript;
		testScript = newTestScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__TEST_SCRIPT, oldTestScript, newTestScript);
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
	public void setTestScript(TestScript newTestScript) {
		if (newTestScript != testScript) {
			NotificationChain msgs = null;
			if (testScript != null)
				msgs = ((InternalEObject)testScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__TEST_SCRIPT, null, msgs);
			if (newTestScript != null)
				msgs = ((InternalEObject)newTestScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__TEST_SCRIPT, null, msgs);
			msgs = basicSetTestScript(newTestScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__TEST_SCRIPT, newTestScript, newTestScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transport getTransport() {
		return transport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransport(Transport newTransport, NotificationChain msgs) {
		Transport oldTransport = transport;
		transport = newTransport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__TRANSPORT, oldTransport, newTransport);
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
	public void setTransport(Transport newTransport) {
		if (newTransport != transport) {
			NotificationChain msgs = null;
			if (transport != null)
				msgs = ((InternalEObject)transport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__TRANSPORT, null, msgs);
			if (newTransport != null)
				msgs = ((InternalEObject)newTransport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__TRANSPORT, null, msgs);
			msgs = basicSetTransport(newTransport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__TRANSPORT, newTransport, newTransport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSet getValueSet() {
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSet(ValueSet newValueSet, NotificationChain msgs) {
		ValueSet oldValueSet = valueSet;
		valueSet = newValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__VALUE_SET, oldValueSet, newValueSet);
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
	public void setValueSet(ValueSet newValueSet) {
		if (newValueSet != valueSet) {
			NotificationChain msgs = null;
			if (valueSet != null)
				msgs = ((InternalEObject)valueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__VALUE_SET, null, msgs);
			if (newValueSet != null)
				msgs = ((InternalEObject)newValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__VALUE_SET, null, msgs);
			msgs = basicSetValueSet(newValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__VALUE_SET, newValueSet, newValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerificationResult getVerificationResult() {
		return verificationResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerificationResult(VerificationResult newVerificationResult, NotificationChain msgs) {
		VerificationResult oldVerificationResult = verificationResult;
		verificationResult = newVerificationResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__VERIFICATION_RESULT, oldVerificationResult, newVerificationResult);
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
	public void setVerificationResult(VerificationResult newVerificationResult) {
		if (newVerificationResult != verificationResult) {
			NotificationChain msgs = null;
			if (verificationResult != null)
				msgs = ((InternalEObject)verificationResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__VERIFICATION_RESULT, null, msgs);
			if (newVerificationResult != null)
				msgs = ((InternalEObject)newVerificationResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__VERIFICATION_RESULT, null, msgs);
			msgs = basicSetVerificationResult(newVerificationResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__VERIFICATION_RESULT, newVerificationResult, newVerificationResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisionPrescription getVisionPrescription() {
		return visionPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisionPrescription(VisionPrescription newVisionPrescription, NotificationChain msgs) {
		VisionPrescription oldVisionPrescription = visionPrescription;
		visionPrescription = newVisionPrescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__VISION_PRESCRIPTION, oldVisionPrescription, newVisionPrescription);
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
	public void setVisionPrescription(VisionPrescription newVisionPrescription) {
		if (newVisionPrescription != visionPrescription) {
			NotificationChain msgs = null;
			if (visionPrescription != null)
				msgs = ((InternalEObject)visionPrescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__VISION_PRESCRIPTION, null, msgs);
			if (newVisionPrescription != null)
				msgs = ((InternalEObject)newVisionPrescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__VISION_PRESCRIPTION, null, msgs);
			msgs = basicSetVisionPrescription(newVisionPrescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__VISION_PRESCRIPTION, newVisionPrescription, newVisionPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameters getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameters(Parameters newParameters, NotificationChain msgs) {
		Parameters oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PARAMETERS, oldParameters, newParameters);
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
	public void setParameters(Parameters newParameters) {
		if (newParameters != parameters) {
			NotificationChain msgs = null;
			if (parameters != null)
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PARAMETERS, newParameters, newParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.RESOURCE_CONTAINER__ACCOUNT:
				return basicSetAccount(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__ACTIVITY_DEFINITION:
				return basicSetActivityDefinition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__ACTOR_DEFINITION:
				return basicSetActorDefinition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__ADMINISTRABLE_PRODUCT_DEFINITION:
				return basicSetAdministrableProductDefinition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__ADVERSE_EVENT:
				return basicSetAdverseEvent(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__ALLERGY_INTOLERANCE:
				return basicSetAllergyIntolerance(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__APPOINTMENT:
				return basicSetAppointment(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__APPOINTMENT_RESPONSE:
				return basicSetAppointmentResponse(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__ARTIFACT_ASSESSMENT:
				return basicSetArtifactAssessment(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__AUDIT_EVENT:
				return basicSetAuditEvent(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__BASIC:
				return basicSetBasic(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__BINARY:
				return basicSetBinary(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__BIOLOGICALLY_DERIVED_PRODUCT:
				return basicSetBiologicallyDerivedProduct(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE:
				return basicSetBiologicallyDerivedProductDispense(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__BODY_STRUCTURE:
				return basicSetBodyStructure(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__BUNDLE:
				return basicSetBundle(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CAPABILITY_STATEMENT:
				return basicSetCapabilityStatement(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CARE_PLAN:
				return basicSetCarePlan(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CARE_TEAM:
				return basicSetCareTeam(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CHARGE_ITEM:
				return basicSetChargeItem(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CHARGE_ITEM_DEFINITION:
				return basicSetChargeItemDefinition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CITATION:
				return basicSetCitation(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CLAIM:
				return basicSetClaim(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CLAIM_RESPONSE:
				return basicSetClaimResponse(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CLINICAL_IMPRESSION:
				return basicSetClinicalImpression(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CLINICAL_USE_DEFINITION:
				return basicSetClinicalUseDefinition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CODE_SYSTEM:
				return basicSetCodeSystem(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__COMMUNICATION:
				return basicSetCommunication(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__COMMUNICATION_REQUEST:
				return basicSetCommunicationRequest(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__COMPARTMENT_DEFINITION:
				return basicSetCompartmentDefinition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__COMPOSITION:
				return basicSetComposition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CONCEPT_MAP:
				return basicSetConceptMap(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CONDITION:
				return basicSetCondition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CONDITION_DEFINITION:
				return basicSetConditionDefinition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CONSENT:
				return basicSetConsent(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CONTRACT:
				return basicSetContract(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__COVERAGE:
				return basicSetCoverage(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__COVERAGE_ELIGIBILITY_REQUEST:
				return basicSetCoverageEligibilityRequest(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__COVERAGE_ELIGIBILITY_RESPONSE:
				return basicSetCoverageEligibilityResponse(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__DETECTED_ISSUE:
				return basicSetDetectedIssue(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__DEVICE:
				return basicSetDevice(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_ASSOCIATION:
				return basicSetDeviceAssociation(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_DEFINITION:
				return basicSetDeviceDefinition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_DISPENSE:
				return basicSetDeviceDispense(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_METRIC:
				return basicSetDeviceMetric(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_REQUEST:
				return basicSetDeviceRequest(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_USAGE:
				return basicSetDeviceUsage(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_REPORT:
				return basicSetDiagnosticReport(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__DOCUMENT_REFERENCE:
				return basicSetDocumentReference(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__ENCOUNTER_HISTORY:
				return basicSetEncounterHistory(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__ENDPOINT:
				return basicSetEndpoint(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_REQUEST:
				return basicSetEnrollmentRequest(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_RESPONSE:
				return basicSetEnrollmentResponse(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__EPISODE_OF_CARE:
				return basicSetEpisodeOfCare(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__EVENT_DEFINITION:
				return basicSetEventDefinition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__EVIDENCE:
				return basicSetEvidence(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__EVIDENCE_REPORT:
				return basicSetEvidenceReport(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__EVIDENCE_VARIABLE:
				return basicSetEvidenceVariable(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__EXAMPLE_SCENARIO:
				return basicSetExampleScenario(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__EXPLANATION_OF_BENEFIT:
				return basicSetExplanationOfBenefit(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__FAMILY_MEMBER_HISTORY:
				return basicSetFamilyMemberHistory(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__FLAG:
				return basicSetFlag(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__FORMULARY_ITEM:
				return basicSetFormularyItem(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__GENOMIC_STUDY:
				return basicSetGenomicStudy(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__GOAL:
				return basicSetGoal(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__GRAPH_DEFINITION:
				return basicSetGraphDefinition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__GROUP:
				return basicSetGroup(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__GUIDANCE_RESPONSE:
				return basicSetGuidanceResponse(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__HEALTHCARE_SERVICE:
				return basicSetHealthcareService(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__IMAGING_SELECTION:
				return basicSetImagingSelection(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__IMAGING_STUDY:
				return basicSetImagingStudy(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION:
				return basicSetImmunization(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_EVALUATION:
				return basicSetImmunizationEvaluation(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_RECOMMENDATION:
				return basicSetImmunizationRecommendation(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__IMPLEMENTATION_GUIDE:
				return basicSetImplementationGuide(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__INGREDIENT:
				return basicSetIngredient(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__INSURANCE_PLAN:
				return basicSetInsurancePlan(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__INVENTORY_ITEM:
				return basicSetInventoryItem(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__INVENTORY_REPORT:
				return basicSetInventoryReport(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__INVOICE:
				return basicSetInvoice(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__LIBRARY:
				return basicSetLibrary(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__LINKAGE:
				return basicSetLinkage(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__LIST:
				return basicSetList(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__MANUFACTURED_ITEM_DEFINITION:
				return basicSetManufacturedItemDefinition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__MEASURE:
				return basicSetMeasure(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__MEASURE_REPORT:
				return basicSetMeasureReport(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION:
				return basicSetMedication(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_ADMINISTRATION:
				return basicSetMedicationAdministration(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_DISPENSE:
				return basicSetMedicationDispense(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_KNOWLEDGE:
				return basicSetMedicationKnowledge(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_REQUEST:
				return basicSetMedicationRequest(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_STATEMENT:
				return basicSetMedicationStatement(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__MEDICINAL_PRODUCT_DEFINITION:
				return basicSetMedicinalProductDefinition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__MESSAGE_DEFINITION:
				return basicSetMessageDefinition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__MESSAGE_HEADER:
				return basicSetMessageHeader(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__MOLECULAR_SEQUENCE:
				return basicSetMolecularSequence(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__NAMING_SYSTEM:
				return basicSetNamingSystem(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__NUTRITION_INTAKE:
				return basicSetNutritionIntake(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__NUTRITION_ORDER:
				return basicSetNutritionOrder(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__NUTRITION_PRODUCT:
				return basicSetNutritionProduct(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__OBSERVATION:
				return basicSetObservation(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__OBSERVATION_DEFINITION:
				return basicSetObservationDefinition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__OPERATION_DEFINITION:
				return basicSetOperationDefinition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__OPERATION_OUTCOME:
				return basicSetOperationOutcome(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__ORGANIZATION_AFFILIATION:
				return basicSetOrganizationAffiliation(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__PACKAGED_PRODUCT_DEFINITION:
				return basicSetPackagedProductDefinition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__PAYMENT_NOTICE:
				return basicSetPaymentNotice(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__PAYMENT_RECONCILIATION:
				return basicSetPaymentReconciliation(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__PERMISSION:
				return basicSetPermission(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__PERSON:
				return basicSetPerson(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__PLAN_DEFINITION:
				return basicSetPlanDefinition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__PRACTITIONER:
				return basicSetPractitioner(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__PRACTITIONER_ROLE:
				return basicSetPractitionerRole(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__PROCEDURE:
				return basicSetProcedure(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__PROVENANCE:
				return basicSetProvenance(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE:
				return basicSetQuestionnaire(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE_RESPONSE:
				return basicSetQuestionnaireResponse(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__REGULATED_AUTHORIZATION:
				return basicSetRegulatedAuthorization(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__RELATED_PERSON:
				return basicSetRelatedPerson(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__REQUEST_ORCHESTRATION:
				return basicSetRequestOrchestration(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__REQUIREMENTS:
				return basicSetRequirements(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__RESEARCH_STUDY:
				return basicSetResearchStudy(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__RESEARCH_SUBJECT:
				return basicSetResearchSubject(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__RISK_ASSESSMENT:
				return basicSetRiskAssessment(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SCHEDULE:
				return basicSetSchedule(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SEARCH_PARAMETER:
				return basicSetSearchParameter(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SERVICE_REQUEST:
				return basicSetServiceRequest(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SLOT:
				return basicSetSlot(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SPECIMEN:
				return basicSetSpecimen(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SPECIMEN_DEFINITION:
				return basicSetSpecimenDefinition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__STRUCTURE_DEFINITION:
				return basicSetStructureDefinition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__STRUCTURE_MAP:
				return basicSetStructureMap(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION:
				return basicSetSubscription(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION_STATUS:
				return basicSetSubscriptionStatus(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION_TOPIC:
				return basicSetSubscriptionTopic(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE:
				return basicSetSubstance(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_DEFINITION:
				return basicSetSubstanceDefinition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_NUCLEIC_ACID:
				return basicSetSubstanceNucleicAcid(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_POLYMER:
				return basicSetSubstancePolymer(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_PROTEIN:
				return basicSetSubstanceProtein(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_REFERENCE_INFORMATION:
				return basicSetSubstanceReferenceInformation(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_SOURCE_MATERIAL:
				return basicSetSubstanceSourceMaterial(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SUPPLY_DELIVERY:
				return basicSetSupplyDelivery(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SUPPLY_REQUEST:
				return basicSetSupplyRequest(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__TASK:
				return basicSetTask(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__TERMINOLOGY_CAPABILITIES:
				return basicSetTerminologyCapabilities(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__TEST_PLAN:
				return basicSetTestPlan(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__TEST_REPORT:
				return basicSetTestReport(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__TEST_SCRIPT:
				return basicSetTestScript(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__TRANSPORT:
				return basicSetTransport(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__VALUE_SET:
				return basicSetValueSet(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__VERIFICATION_RESULT:
				return basicSetVerificationResult(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__VISION_PRESCRIPTION:
				return basicSetVisionPrescription(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__PARAMETERS:
				return basicSetParameters(null, msgs);
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
			case FhirPackage.RESOURCE_CONTAINER__ACCOUNT:
				return getAccount();
			case FhirPackage.RESOURCE_CONTAINER__ACTIVITY_DEFINITION:
				return getActivityDefinition();
			case FhirPackage.RESOURCE_CONTAINER__ACTOR_DEFINITION:
				return getActorDefinition();
			case FhirPackage.RESOURCE_CONTAINER__ADMINISTRABLE_PRODUCT_DEFINITION:
				return getAdministrableProductDefinition();
			case FhirPackage.RESOURCE_CONTAINER__ADVERSE_EVENT:
				return getAdverseEvent();
			case FhirPackage.RESOURCE_CONTAINER__ALLERGY_INTOLERANCE:
				return getAllergyIntolerance();
			case FhirPackage.RESOURCE_CONTAINER__APPOINTMENT:
				return getAppointment();
			case FhirPackage.RESOURCE_CONTAINER__APPOINTMENT_RESPONSE:
				return getAppointmentResponse();
			case FhirPackage.RESOURCE_CONTAINER__ARTIFACT_ASSESSMENT:
				return getArtifactAssessment();
			case FhirPackage.RESOURCE_CONTAINER__AUDIT_EVENT:
				return getAuditEvent();
			case FhirPackage.RESOURCE_CONTAINER__BASIC:
				return getBasic();
			case FhirPackage.RESOURCE_CONTAINER__BINARY:
				return getBinary();
			case FhirPackage.RESOURCE_CONTAINER__BIOLOGICALLY_DERIVED_PRODUCT:
				return getBiologicallyDerivedProduct();
			case FhirPackage.RESOURCE_CONTAINER__BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE:
				return getBiologicallyDerivedProductDispense();
			case FhirPackage.RESOURCE_CONTAINER__BODY_STRUCTURE:
				return getBodyStructure();
			case FhirPackage.RESOURCE_CONTAINER__BUNDLE:
				return getBundle();
			case FhirPackage.RESOURCE_CONTAINER__CAPABILITY_STATEMENT:
				return getCapabilityStatement();
			case FhirPackage.RESOURCE_CONTAINER__CARE_PLAN:
				return getCarePlan();
			case FhirPackage.RESOURCE_CONTAINER__CARE_TEAM:
				return getCareTeam();
			case FhirPackage.RESOURCE_CONTAINER__CHARGE_ITEM:
				return getChargeItem();
			case FhirPackage.RESOURCE_CONTAINER__CHARGE_ITEM_DEFINITION:
				return getChargeItemDefinition();
			case FhirPackage.RESOURCE_CONTAINER__CITATION:
				return getCitation();
			case FhirPackage.RESOURCE_CONTAINER__CLAIM:
				return getClaim();
			case FhirPackage.RESOURCE_CONTAINER__CLAIM_RESPONSE:
				return getClaimResponse();
			case FhirPackage.RESOURCE_CONTAINER__CLINICAL_IMPRESSION:
				return getClinicalImpression();
			case FhirPackage.RESOURCE_CONTAINER__CLINICAL_USE_DEFINITION:
				return getClinicalUseDefinition();
			case FhirPackage.RESOURCE_CONTAINER__CODE_SYSTEM:
				return getCodeSystem();
			case FhirPackage.RESOURCE_CONTAINER__COMMUNICATION:
				return getCommunication();
			case FhirPackage.RESOURCE_CONTAINER__COMMUNICATION_REQUEST:
				return getCommunicationRequest();
			case FhirPackage.RESOURCE_CONTAINER__COMPARTMENT_DEFINITION:
				return getCompartmentDefinition();
			case FhirPackage.RESOURCE_CONTAINER__COMPOSITION:
				return getComposition();
			case FhirPackage.RESOURCE_CONTAINER__CONCEPT_MAP:
				return getConceptMap();
			case FhirPackage.RESOURCE_CONTAINER__CONDITION:
				return getCondition();
			case FhirPackage.RESOURCE_CONTAINER__CONDITION_DEFINITION:
				return getConditionDefinition();
			case FhirPackage.RESOURCE_CONTAINER__CONSENT:
				return getConsent();
			case FhirPackage.RESOURCE_CONTAINER__CONTRACT:
				return getContract();
			case FhirPackage.RESOURCE_CONTAINER__COVERAGE:
				return getCoverage();
			case FhirPackage.RESOURCE_CONTAINER__COVERAGE_ELIGIBILITY_REQUEST:
				return getCoverageEligibilityRequest();
			case FhirPackage.RESOURCE_CONTAINER__COVERAGE_ELIGIBILITY_RESPONSE:
				return getCoverageEligibilityResponse();
			case FhirPackage.RESOURCE_CONTAINER__DETECTED_ISSUE:
				return getDetectedIssue();
			case FhirPackage.RESOURCE_CONTAINER__DEVICE:
				return getDevice();
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_ASSOCIATION:
				return getDeviceAssociation();
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_DEFINITION:
				return getDeviceDefinition();
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_DISPENSE:
				return getDeviceDispense();
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_METRIC:
				return getDeviceMetric();
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_REQUEST:
				return getDeviceRequest();
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_USAGE:
				return getDeviceUsage();
			case FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_REPORT:
				return getDiagnosticReport();
			case FhirPackage.RESOURCE_CONTAINER__DOCUMENT_REFERENCE:
				return getDocumentReference();
			case FhirPackage.RESOURCE_CONTAINER__ENCOUNTER:
				return getEncounter();
			case FhirPackage.RESOURCE_CONTAINER__ENCOUNTER_HISTORY:
				return getEncounterHistory();
			case FhirPackage.RESOURCE_CONTAINER__ENDPOINT:
				return getEndpoint();
			case FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_REQUEST:
				return getEnrollmentRequest();
			case FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_RESPONSE:
				return getEnrollmentResponse();
			case FhirPackage.RESOURCE_CONTAINER__EPISODE_OF_CARE:
				return getEpisodeOfCare();
			case FhirPackage.RESOURCE_CONTAINER__EVENT_DEFINITION:
				return getEventDefinition();
			case FhirPackage.RESOURCE_CONTAINER__EVIDENCE:
				return getEvidence();
			case FhirPackage.RESOURCE_CONTAINER__EVIDENCE_REPORT:
				return getEvidenceReport();
			case FhirPackage.RESOURCE_CONTAINER__EVIDENCE_VARIABLE:
				return getEvidenceVariable();
			case FhirPackage.RESOURCE_CONTAINER__EXAMPLE_SCENARIO:
				return getExampleScenario();
			case FhirPackage.RESOURCE_CONTAINER__EXPLANATION_OF_BENEFIT:
				return getExplanationOfBenefit();
			case FhirPackage.RESOURCE_CONTAINER__FAMILY_MEMBER_HISTORY:
				return getFamilyMemberHistory();
			case FhirPackage.RESOURCE_CONTAINER__FLAG:
				return getFlag();
			case FhirPackage.RESOURCE_CONTAINER__FORMULARY_ITEM:
				return getFormularyItem();
			case FhirPackage.RESOURCE_CONTAINER__GENOMIC_STUDY:
				return getGenomicStudy();
			case FhirPackage.RESOURCE_CONTAINER__GOAL:
				return getGoal();
			case FhirPackage.RESOURCE_CONTAINER__GRAPH_DEFINITION:
				return getGraphDefinition();
			case FhirPackage.RESOURCE_CONTAINER__GROUP:
				return getGroup();
			case FhirPackage.RESOURCE_CONTAINER__GUIDANCE_RESPONSE:
				return getGuidanceResponse();
			case FhirPackage.RESOURCE_CONTAINER__HEALTHCARE_SERVICE:
				return getHealthcareService();
			case FhirPackage.RESOURCE_CONTAINER__IMAGING_SELECTION:
				return getImagingSelection();
			case FhirPackage.RESOURCE_CONTAINER__IMAGING_STUDY:
				return getImagingStudy();
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION:
				return getImmunization();
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_EVALUATION:
				return getImmunizationEvaluation();
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_RECOMMENDATION:
				return getImmunizationRecommendation();
			case FhirPackage.RESOURCE_CONTAINER__IMPLEMENTATION_GUIDE:
				return getImplementationGuide();
			case FhirPackage.RESOURCE_CONTAINER__INGREDIENT:
				return getIngredient();
			case FhirPackage.RESOURCE_CONTAINER__INSURANCE_PLAN:
				return getInsurancePlan();
			case FhirPackage.RESOURCE_CONTAINER__INVENTORY_ITEM:
				return getInventoryItem();
			case FhirPackage.RESOURCE_CONTAINER__INVENTORY_REPORT:
				return getInventoryReport();
			case FhirPackage.RESOURCE_CONTAINER__INVOICE:
				return getInvoice();
			case FhirPackage.RESOURCE_CONTAINER__LIBRARY:
				return getLibrary();
			case FhirPackage.RESOURCE_CONTAINER__LINKAGE:
				return getLinkage();
			case FhirPackage.RESOURCE_CONTAINER__LIST:
				return getList();
			case FhirPackage.RESOURCE_CONTAINER__LOCATION:
				return getLocation();
			case FhirPackage.RESOURCE_CONTAINER__MANUFACTURED_ITEM_DEFINITION:
				return getManufacturedItemDefinition();
			case FhirPackage.RESOURCE_CONTAINER__MEASURE:
				return getMeasure();
			case FhirPackage.RESOURCE_CONTAINER__MEASURE_REPORT:
				return getMeasureReport();
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION:
				return getMedication();
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_ADMINISTRATION:
				return getMedicationAdministration();
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_DISPENSE:
				return getMedicationDispense();
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_KNOWLEDGE:
				return getMedicationKnowledge();
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_REQUEST:
				return getMedicationRequest();
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_STATEMENT:
				return getMedicationStatement();
			case FhirPackage.RESOURCE_CONTAINER__MEDICINAL_PRODUCT_DEFINITION:
				return getMedicinalProductDefinition();
			case FhirPackage.RESOURCE_CONTAINER__MESSAGE_DEFINITION:
				return getMessageDefinition();
			case FhirPackage.RESOURCE_CONTAINER__MESSAGE_HEADER:
				return getMessageHeader();
			case FhirPackage.RESOURCE_CONTAINER__MOLECULAR_SEQUENCE:
				return getMolecularSequence();
			case FhirPackage.RESOURCE_CONTAINER__NAMING_SYSTEM:
				return getNamingSystem();
			case FhirPackage.RESOURCE_CONTAINER__NUTRITION_INTAKE:
				return getNutritionIntake();
			case FhirPackage.RESOURCE_CONTAINER__NUTRITION_ORDER:
				return getNutritionOrder();
			case FhirPackage.RESOURCE_CONTAINER__NUTRITION_PRODUCT:
				return getNutritionProduct();
			case FhirPackage.RESOURCE_CONTAINER__OBSERVATION:
				return getObservation();
			case FhirPackage.RESOURCE_CONTAINER__OBSERVATION_DEFINITION:
				return getObservationDefinition();
			case FhirPackage.RESOURCE_CONTAINER__OPERATION_DEFINITION:
				return getOperationDefinition();
			case FhirPackage.RESOURCE_CONTAINER__OPERATION_OUTCOME:
				return getOperationOutcome();
			case FhirPackage.RESOURCE_CONTAINER__ORGANIZATION:
				return getOrganization();
			case FhirPackage.RESOURCE_CONTAINER__ORGANIZATION_AFFILIATION:
				return getOrganizationAffiliation();
			case FhirPackage.RESOURCE_CONTAINER__PACKAGED_PRODUCT_DEFINITION:
				return getPackagedProductDefinition();
			case FhirPackage.RESOURCE_CONTAINER__PATIENT:
				return getPatient();
			case FhirPackage.RESOURCE_CONTAINER__PAYMENT_NOTICE:
				return getPaymentNotice();
			case FhirPackage.RESOURCE_CONTAINER__PAYMENT_RECONCILIATION:
				return getPaymentReconciliation();
			case FhirPackage.RESOURCE_CONTAINER__PERMISSION:
				return getPermission();
			case FhirPackage.RESOURCE_CONTAINER__PERSON:
				return getPerson();
			case FhirPackage.RESOURCE_CONTAINER__PLAN_DEFINITION:
				return getPlanDefinition();
			case FhirPackage.RESOURCE_CONTAINER__PRACTITIONER:
				return getPractitioner();
			case FhirPackage.RESOURCE_CONTAINER__PRACTITIONER_ROLE:
				return getPractitionerRole();
			case FhirPackage.RESOURCE_CONTAINER__PROCEDURE:
				return getProcedure();
			case FhirPackage.RESOURCE_CONTAINER__PROVENANCE:
				return getProvenance();
			case FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE:
				return getQuestionnaire();
			case FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE_RESPONSE:
				return getQuestionnaireResponse();
			case FhirPackage.RESOURCE_CONTAINER__REGULATED_AUTHORIZATION:
				return getRegulatedAuthorization();
			case FhirPackage.RESOURCE_CONTAINER__RELATED_PERSON:
				return getRelatedPerson();
			case FhirPackage.RESOURCE_CONTAINER__REQUEST_ORCHESTRATION:
				return getRequestOrchestration();
			case FhirPackage.RESOURCE_CONTAINER__REQUIREMENTS:
				return getRequirements();
			case FhirPackage.RESOURCE_CONTAINER__RESEARCH_STUDY:
				return getResearchStudy();
			case FhirPackage.RESOURCE_CONTAINER__RESEARCH_SUBJECT:
				return getResearchSubject();
			case FhirPackage.RESOURCE_CONTAINER__RISK_ASSESSMENT:
				return getRiskAssessment();
			case FhirPackage.RESOURCE_CONTAINER__SCHEDULE:
				return getSchedule();
			case FhirPackage.RESOURCE_CONTAINER__SEARCH_PARAMETER:
				return getSearchParameter();
			case FhirPackage.RESOURCE_CONTAINER__SERVICE_REQUEST:
				return getServiceRequest();
			case FhirPackage.RESOURCE_CONTAINER__SLOT:
				return getSlot();
			case FhirPackage.RESOURCE_CONTAINER__SPECIMEN:
				return getSpecimen();
			case FhirPackage.RESOURCE_CONTAINER__SPECIMEN_DEFINITION:
				return getSpecimenDefinition();
			case FhirPackage.RESOURCE_CONTAINER__STRUCTURE_DEFINITION:
				return getStructureDefinition();
			case FhirPackage.RESOURCE_CONTAINER__STRUCTURE_MAP:
				return getStructureMap();
			case FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION:
				return getSubscription();
			case FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION_STATUS:
				return getSubscriptionStatus();
			case FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION_TOPIC:
				return getSubscriptionTopic();
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE:
				return getSubstance();
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_DEFINITION:
				return getSubstanceDefinition();
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_NUCLEIC_ACID:
				return getSubstanceNucleicAcid();
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_POLYMER:
				return getSubstancePolymer();
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_PROTEIN:
				return getSubstanceProtein();
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_REFERENCE_INFORMATION:
				return getSubstanceReferenceInformation();
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_SOURCE_MATERIAL:
				return getSubstanceSourceMaterial();
			case FhirPackage.RESOURCE_CONTAINER__SUPPLY_DELIVERY:
				return getSupplyDelivery();
			case FhirPackage.RESOURCE_CONTAINER__SUPPLY_REQUEST:
				return getSupplyRequest();
			case FhirPackage.RESOURCE_CONTAINER__TASK:
				return getTask();
			case FhirPackage.RESOURCE_CONTAINER__TERMINOLOGY_CAPABILITIES:
				return getTerminologyCapabilities();
			case FhirPackage.RESOURCE_CONTAINER__TEST_PLAN:
				return getTestPlan();
			case FhirPackage.RESOURCE_CONTAINER__TEST_REPORT:
				return getTestReport();
			case FhirPackage.RESOURCE_CONTAINER__TEST_SCRIPT:
				return getTestScript();
			case FhirPackage.RESOURCE_CONTAINER__TRANSPORT:
				return getTransport();
			case FhirPackage.RESOURCE_CONTAINER__VALUE_SET:
				return getValueSet();
			case FhirPackage.RESOURCE_CONTAINER__VERIFICATION_RESULT:
				return getVerificationResult();
			case FhirPackage.RESOURCE_CONTAINER__VISION_PRESCRIPTION:
				return getVisionPrescription();
			case FhirPackage.RESOURCE_CONTAINER__PARAMETERS:
				return getParameters();
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
			case FhirPackage.RESOURCE_CONTAINER__ACCOUNT:
				setAccount((Account)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ACTIVITY_DEFINITION:
				setActivityDefinition((ActivityDefinition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ACTOR_DEFINITION:
				setActorDefinition((ActorDefinition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ADMINISTRABLE_PRODUCT_DEFINITION:
				setAdministrableProductDefinition((AdministrableProductDefinition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ADVERSE_EVENT:
				setAdverseEvent((AdverseEvent)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ALLERGY_INTOLERANCE:
				setAllergyIntolerance((AllergyIntolerance)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__APPOINTMENT:
				setAppointment((Appointment)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__APPOINTMENT_RESPONSE:
				setAppointmentResponse((AppointmentResponse)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ARTIFACT_ASSESSMENT:
				setArtifactAssessment((ArtifactAssessment)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__AUDIT_EVENT:
				setAuditEvent((AuditEvent)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__BASIC:
				setBasic((Basic)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__BINARY:
				setBinary((Binary)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__BIOLOGICALLY_DERIVED_PRODUCT:
				setBiologicallyDerivedProduct((BiologicallyDerivedProduct)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE:
				setBiologicallyDerivedProductDispense((BiologicallyDerivedProductDispense)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__BODY_STRUCTURE:
				setBodyStructure((BodyStructure)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__BUNDLE:
				setBundle((Bundle)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CAPABILITY_STATEMENT:
				setCapabilityStatement((CapabilityStatement)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CARE_PLAN:
				setCarePlan((CarePlan)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CARE_TEAM:
				setCareTeam((CareTeam)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CHARGE_ITEM:
				setChargeItem((ChargeItem)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CHARGE_ITEM_DEFINITION:
				setChargeItemDefinition((ChargeItemDefinition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CITATION:
				setCitation((Citation)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CLAIM:
				setClaim((Claim)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CLAIM_RESPONSE:
				setClaimResponse((ClaimResponse)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CLINICAL_IMPRESSION:
				setClinicalImpression((ClinicalImpression)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CLINICAL_USE_DEFINITION:
				setClinicalUseDefinition((ClinicalUseDefinition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CODE_SYSTEM:
				setCodeSystem((CodeSystem)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__COMMUNICATION:
				setCommunication((Communication)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__COMMUNICATION_REQUEST:
				setCommunicationRequest((CommunicationRequest)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__COMPARTMENT_DEFINITION:
				setCompartmentDefinition((CompartmentDefinition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__COMPOSITION:
				setComposition((Composition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CONCEPT_MAP:
				setConceptMap((ConceptMap)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CONDITION:
				setCondition((Condition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CONDITION_DEFINITION:
				setConditionDefinition((ConditionDefinition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CONSENT:
				setConsent((Consent)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CONTRACT:
				setContract((Contract)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__COVERAGE:
				setCoverage((Coverage)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__COVERAGE_ELIGIBILITY_REQUEST:
				setCoverageEligibilityRequest((CoverageEligibilityRequest)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__COVERAGE_ELIGIBILITY_RESPONSE:
				setCoverageEligibilityResponse((CoverageEligibilityResponse)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DETECTED_ISSUE:
				setDetectedIssue((DetectedIssue)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE:
				setDevice((Device)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_ASSOCIATION:
				setDeviceAssociation((DeviceAssociation)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_DEFINITION:
				setDeviceDefinition((DeviceDefinition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_DISPENSE:
				setDeviceDispense((DeviceDispense)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_METRIC:
				setDeviceMetric((DeviceMetric)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_REQUEST:
				setDeviceRequest((DeviceRequest)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_USAGE:
				setDeviceUsage((DeviceUsage)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_REPORT:
				setDiagnosticReport((DiagnosticReport)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DOCUMENT_REFERENCE:
				setDocumentReference((DocumentReference)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ENCOUNTER:
				setEncounter((Encounter)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ENCOUNTER_HISTORY:
				setEncounterHistory((EncounterHistory)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ENDPOINT:
				setEndpoint((Endpoint)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_REQUEST:
				setEnrollmentRequest((EnrollmentRequest)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_RESPONSE:
				setEnrollmentResponse((EnrollmentResponse)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__EPISODE_OF_CARE:
				setEpisodeOfCare((EpisodeOfCare)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__EVENT_DEFINITION:
				setEventDefinition((EventDefinition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__EVIDENCE:
				setEvidence((Evidence)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__EVIDENCE_REPORT:
				setEvidenceReport((EvidenceReport)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__EVIDENCE_VARIABLE:
				setEvidenceVariable((EvidenceVariable)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__EXAMPLE_SCENARIO:
				setExampleScenario((ExampleScenario)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__EXPLANATION_OF_BENEFIT:
				setExplanationOfBenefit((ExplanationOfBenefit)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__FAMILY_MEMBER_HISTORY:
				setFamilyMemberHistory((FamilyMemberHistory)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__FLAG:
				setFlag((Flag)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__FORMULARY_ITEM:
				setFormularyItem((FormularyItem)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__GENOMIC_STUDY:
				setGenomicStudy((GenomicStudy)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__GOAL:
				setGoal((Goal)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__GRAPH_DEFINITION:
				setGraphDefinition((GraphDefinition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__GROUP:
				setGroup((Group)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__GUIDANCE_RESPONSE:
				setGuidanceResponse((GuidanceResponse)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__HEALTHCARE_SERVICE:
				setHealthcareService((HealthcareService)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__IMAGING_SELECTION:
				setImagingSelection((ImagingSelection)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__IMAGING_STUDY:
				setImagingStudy((ImagingStudy)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION:
				setImmunization((Immunization)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_EVALUATION:
				setImmunizationEvaluation((ImmunizationEvaluation)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_RECOMMENDATION:
				setImmunizationRecommendation((ImmunizationRecommendation)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__IMPLEMENTATION_GUIDE:
				setImplementationGuide((ImplementationGuide)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__INGREDIENT:
				setIngredient((Ingredient)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__INSURANCE_PLAN:
				setInsurancePlan((InsurancePlan)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__INVENTORY_ITEM:
				setInventoryItem((InventoryItem)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__INVENTORY_REPORT:
				setInventoryReport((InventoryReport)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__INVOICE:
				setInvoice((Invoice)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__LIBRARY:
				setLibrary((Library)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__LINKAGE:
				setLinkage((Linkage)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__LIST:
				setList((List)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__LOCATION:
				setLocation((Location)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MANUFACTURED_ITEM_DEFINITION:
				setManufacturedItemDefinition((ManufacturedItemDefinition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEASURE:
				setMeasure((Measure)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEASURE_REPORT:
				setMeasureReport((MeasureReport)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION:
				setMedication((Medication)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_ADMINISTRATION:
				setMedicationAdministration((MedicationAdministration)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_DISPENSE:
				setMedicationDispense((MedicationDispense)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_KNOWLEDGE:
				setMedicationKnowledge((MedicationKnowledge)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_REQUEST:
				setMedicationRequest((MedicationRequest)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_STATEMENT:
				setMedicationStatement((MedicationStatement)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDICINAL_PRODUCT_DEFINITION:
				setMedicinalProductDefinition((MedicinalProductDefinition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MESSAGE_DEFINITION:
				setMessageDefinition((MessageDefinition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MESSAGE_HEADER:
				setMessageHeader((MessageHeader)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MOLECULAR_SEQUENCE:
				setMolecularSequence((MolecularSequence)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__NAMING_SYSTEM:
				setNamingSystem((NamingSystem)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__NUTRITION_INTAKE:
				setNutritionIntake((NutritionIntake)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__NUTRITION_ORDER:
				setNutritionOrder((NutritionOrder)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__NUTRITION_PRODUCT:
				setNutritionProduct((NutritionProduct)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__OBSERVATION:
				setObservation((Observation)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__OBSERVATION_DEFINITION:
				setObservationDefinition((ObservationDefinition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__OPERATION_DEFINITION:
				setOperationDefinition((OperationDefinition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__OPERATION_OUTCOME:
				setOperationOutcome((OperationOutcome)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ORGANIZATION_AFFILIATION:
				setOrganizationAffiliation((OrganizationAffiliation)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PACKAGED_PRODUCT_DEFINITION:
				setPackagedProductDefinition((PackagedProductDefinition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PATIENT:
				setPatient((Patient)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PAYMENT_NOTICE:
				setPaymentNotice((PaymentNotice)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PAYMENT_RECONCILIATION:
				setPaymentReconciliation((PaymentReconciliation)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PERMISSION:
				setPermission((Permission)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PERSON:
				setPerson((Person)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PLAN_DEFINITION:
				setPlanDefinition((PlanDefinition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PRACTITIONER:
				setPractitioner((Practitioner)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PRACTITIONER_ROLE:
				setPractitionerRole((PractitionerRole)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PROCEDURE:
				setProcedure((Procedure)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PROVENANCE:
				setProvenance((Provenance)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE:
				setQuestionnaire((Questionnaire)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE_RESPONSE:
				setQuestionnaireResponse((QuestionnaireResponse)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__REGULATED_AUTHORIZATION:
				setRegulatedAuthorization((RegulatedAuthorization)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__RELATED_PERSON:
				setRelatedPerson((RelatedPerson)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__REQUEST_ORCHESTRATION:
				setRequestOrchestration((RequestOrchestration)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__REQUIREMENTS:
				setRequirements((Requirements)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__RESEARCH_STUDY:
				setResearchStudy((ResearchStudy)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__RESEARCH_SUBJECT:
				setResearchSubject((ResearchSubject)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__RISK_ASSESSMENT:
				setRiskAssessment((RiskAssessment)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SCHEDULE:
				setSchedule((Schedule)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SEARCH_PARAMETER:
				setSearchParameter((SearchParameter)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SERVICE_REQUEST:
				setServiceRequest((ServiceRequest)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SLOT:
				setSlot((Slot)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SPECIMEN:
				setSpecimen((Specimen)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SPECIMEN_DEFINITION:
				setSpecimenDefinition((SpecimenDefinition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__STRUCTURE_DEFINITION:
				setStructureDefinition((StructureDefinition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__STRUCTURE_MAP:
				setStructureMap((StructureMap)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION:
				setSubscription((Subscription)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION_STATUS:
				setSubscriptionStatus((SubscriptionStatus)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION_TOPIC:
				setSubscriptionTopic((SubscriptionTopic)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE:
				setSubstance((Substance)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_DEFINITION:
				setSubstanceDefinition((SubstanceDefinition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_NUCLEIC_ACID:
				setSubstanceNucleicAcid((SubstanceNucleicAcid)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_POLYMER:
				setSubstancePolymer((SubstancePolymer)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_PROTEIN:
				setSubstanceProtein((SubstanceProtein)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_REFERENCE_INFORMATION:
				setSubstanceReferenceInformation((SubstanceReferenceInformation)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_SOURCE_MATERIAL:
				setSubstanceSourceMaterial((SubstanceSourceMaterial)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUPPLY_DELIVERY:
				setSupplyDelivery((SupplyDelivery)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUPPLY_REQUEST:
				setSupplyRequest((SupplyRequest)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__TASK:
				setTask((Task)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__TERMINOLOGY_CAPABILITIES:
				setTerminologyCapabilities((TerminologyCapabilities)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__TEST_PLAN:
				setTestPlan((TestPlan)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__TEST_REPORT:
				setTestReport((TestReport)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__TEST_SCRIPT:
				setTestScript((TestScript)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__TRANSPORT:
				setTransport((Transport)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__VALUE_SET:
				setValueSet((ValueSet)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__VERIFICATION_RESULT:
				setVerificationResult((VerificationResult)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__VISION_PRESCRIPTION:
				setVisionPrescription((VisionPrescription)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PARAMETERS:
				setParameters((Parameters)newValue);
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
			case FhirPackage.RESOURCE_CONTAINER__ACCOUNT:
				setAccount((Account)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ACTIVITY_DEFINITION:
				setActivityDefinition((ActivityDefinition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ACTOR_DEFINITION:
				setActorDefinition((ActorDefinition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ADMINISTRABLE_PRODUCT_DEFINITION:
				setAdministrableProductDefinition((AdministrableProductDefinition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ADVERSE_EVENT:
				setAdverseEvent((AdverseEvent)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ALLERGY_INTOLERANCE:
				setAllergyIntolerance((AllergyIntolerance)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__APPOINTMENT:
				setAppointment((Appointment)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__APPOINTMENT_RESPONSE:
				setAppointmentResponse((AppointmentResponse)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ARTIFACT_ASSESSMENT:
				setArtifactAssessment((ArtifactAssessment)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__AUDIT_EVENT:
				setAuditEvent((AuditEvent)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__BASIC:
				setBasic((Basic)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__BINARY:
				setBinary((Binary)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__BIOLOGICALLY_DERIVED_PRODUCT:
				setBiologicallyDerivedProduct((BiologicallyDerivedProduct)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE:
				setBiologicallyDerivedProductDispense((BiologicallyDerivedProductDispense)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__BODY_STRUCTURE:
				setBodyStructure((BodyStructure)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__BUNDLE:
				setBundle((Bundle)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CAPABILITY_STATEMENT:
				setCapabilityStatement((CapabilityStatement)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CARE_PLAN:
				setCarePlan((CarePlan)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CARE_TEAM:
				setCareTeam((CareTeam)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CHARGE_ITEM:
				setChargeItem((ChargeItem)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CHARGE_ITEM_DEFINITION:
				setChargeItemDefinition((ChargeItemDefinition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CITATION:
				setCitation((Citation)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CLAIM:
				setClaim((Claim)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CLAIM_RESPONSE:
				setClaimResponse((ClaimResponse)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CLINICAL_IMPRESSION:
				setClinicalImpression((ClinicalImpression)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CLINICAL_USE_DEFINITION:
				setClinicalUseDefinition((ClinicalUseDefinition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CODE_SYSTEM:
				setCodeSystem((CodeSystem)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__COMMUNICATION:
				setCommunication((Communication)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__COMMUNICATION_REQUEST:
				setCommunicationRequest((CommunicationRequest)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__COMPARTMENT_DEFINITION:
				setCompartmentDefinition((CompartmentDefinition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__COMPOSITION:
				setComposition((Composition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CONCEPT_MAP:
				setConceptMap((ConceptMap)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CONDITION:
				setCondition((Condition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CONDITION_DEFINITION:
				setConditionDefinition((ConditionDefinition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CONSENT:
				setConsent((Consent)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CONTRACT:
				setContract((Contract)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__COVERAGE:
				setCoverage((Coverage)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__COVERAGE_ELIGIBILITY_REQUEST:
				setCoverageEligibilityRequest((CoverageEligibilityRequest)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__COVERAGE_ELIGIBILITY_RESPONSE:
				setCoverageEligibilityResponse((CoverageEligibilityResponse)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DETECTED_ISSUE:
				setDetectedIssue((DetectedIssue)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE:
				setDevice((Device)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_ASSOCIATION:
				setDeviceAssociation((DeviceAssociation)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_DEFINITION:
				setDeviceDefinition((DeviceDefinition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_DISPENSE:
				setDeviceDispense((DeviceDispense)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_METRIC:
				setDeviceMetric((DeviceMetric)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_REQUEST:
				setDeviceRequest((DeviceRequest)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_USAGE:
				setDeviceUsage((DeviceUsage)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_REPORT:
				setDiagnosticReport((DiagnosticReport)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DOCUMENT_REFERENCE:
				setDocumentReference((DocumentReference)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ENCOUNTER:
				setEncounter((Encounter)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ENCOUNTER_HISTORY:
				setEncounterHistory((EncounterHistory)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ENDPOINT:
				setEndpoint((Endpoint)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_REQUEST:
				setEnrollmentRequest((EnrollmentRequest)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_RESPONSE:
				setEnrollmentResponse((EnrollmentResponse)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__EPISODE_OF_CARE:
				setEpisodeOfCare((EpisodeOfCare)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__EVENT_DEFINITION:
				setEventDefinition((EventDefinition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__EVIDENCE:
				setEvidence((Evidence)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__EVIDENCE_REPORT:
				setEvidenceReport((EvidenceReport)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__EVIDENCE_VARIABLE:
				setEvidenceVariable((EvidenceVariable)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__EXAMPLE_SCENARIO:
				setExampleScenario((ExampleScenario)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__EXPLANATION_OF_BENEFIT:
				setExplanationOfBenefit((ExplanationOfBenefit)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__FAMILY_MEMBER_HISTORY:
				setFamilyMemberHistory((FamilyMemberHistory)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__FLAG:
				setFlag((Flag)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__FORMULARY_ITEM:
				setFormularyItem((FormularyItem)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__GENOMIC_STUDY:
				setGenomicStudy((GenomicStudy)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__GOAL:
				setGoal((Goal)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__GRAPH_DEFINITION:
				setGraphDefinition((GraphDefinition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__GROUP:
				setGroup((Group)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__GUIDANCE_RESPONSE:
				setGuidanceResponse((GuidanceResponse)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__HEALTHCARE_SERVICE:
				setHealthcareService((HealthcareService)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__IMAGING_SELECTION:
				setImagingSelection((ImagingSelection)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__IMAGING_STUDY:
				setImagingStudy((ImagingStudy)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION:
				setImmunization((Immunization)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_EVALUATION:
				setImmunizationEvaluation((ImmunizationEvaluation)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_RECOMMENDATION:
				setImmunizationRecommendation((ImmunizationRecommendation)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__IMPLEMENTATION_GUIDE:
				setImplementationGuide((ImplementationGuide)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__INGREDIENT:
				setIngredient((Ingredient)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__INSURANCE_PLAN:
				setInsurancePlan((InsurancePlan)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__INVENTORY_ITEM:
				setInventoryItem((InventoryItem)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__INVENTORY_REPORT:
				setInventoryReport((InventoryReport)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__INVOICE:
				setInvoice((Invoice)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__LIBRARY:
				setLibrary((Library)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__LINKAGE:
				setLinkage((Linkage)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__LIST:
				setList((List)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__LOCATION:
				setLocation((Location)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MANUFACTURED_ITEM_DEFINITION:
				setManufacturedItemDefinition((ManufacturedItemDefinition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEASURE:
				setMeasure((Measure)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEASURE_REPORT:
				setMeasureReport((MeasureReport)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION:
				setMedication((Medication)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_ADMINISTRATION:
				setMedicationAdministration((MedicationAdministration)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_DISPENSE:
				setMedicationDispense((MedicationDispense)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_KNOWLEDGE:
				setMedicationKnowledge((MedicationKnowledge)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_REQUEST:
				setMedicationRequest((MedicationRequest)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_STATEMENT:
				setMedicationStatement((MedicationStatement)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDICINAL_PRODUCT_DEFINITION:
				setMedicinalProductDefinition((MedicinalProductDefinition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MESSAGE_DEFINITION:
				setMessageDefinition((MessageDefinition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MESSAGE_HEADER:
				setMessageHeader((MessageHeader)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MOLECULAR_SEQUENCE:
				setMolecularSequence((MolecularSequence)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__NAMING_SYSTEM:
				setNamingSystem((NamingSystem)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__NUTRITION_INTAKE:
				setNutritionIntake((NutritionIntake)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__NUTRITION_ORDER:
				setNutritionOrder((NutritionOrder)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__NUTRITION_PRODUCT:
				setNutritionProduct((NutritionProduct)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__OBSERVATION:
				setObservation((Observation)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__OBSERVATION_DEFINITION:
				setObservationDefinition((ObservationDefinition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__OPERATION_DEFINITION:
				setOperationDefinition((OperationDefinition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__OPERATION_OUTCOME:
				setOperationOutcome((OperationOutcome)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ORGANIZATION_AFFILIATION:
				setOrganizationAffiliation((OrganizationAffiliation)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PACKAGED_PRODUCT_DEFINITION:
				setPackagedProductDefinition((PackagedProductDefinition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PATIENT:
				setPatient((Patient)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PAYMENT_NOTICE:
				setPaymentNotice((PaymentNotice)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PAYMENT_RECONCILIATION:
				setPaymentReconciliation((PaymentReconciliation)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PERMISSION:
				setPermission((Permission)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PERSON:
				setPerson((Person)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PLAN_DEFINITION:
				setPlanDefinition((PlanDefinition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PRACTITIONER:
				setPractitioner((Practitioner)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PRACTITIONER_ROLE:
				setPractitionerRole((PractitionerRole)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PROCEDURE:
				setProcedure((Procedure)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PROVENANCE:
				setProvenance((Provenance)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE:
				setQuestionnaire((Questionnaire)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE_RESPONSE:
				setQuestionnaireResponse((QuestionnaireResponse)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__REGULATED_AUTHORIZATION:
				setRegulatedAuthorization((RegulatedAuthorization)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__RELATED_PERSON:
				setRelatedPerson((RelatedPerson)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__REQUEST_ORCHESTRATION:
				setRequestOrchestration((RequestOrchestration)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__REQUIREMENTS:
				setRequirements((Requirements)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__RESEARCH_STUDY:
				setResearchStudy((ResearchStudy)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__RESEARCH_SUBJECT:
				setResearchSubject((ResearchSubject)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__RISK_ASSESSMENT:
				setRiskAssessment((RiskAssessment)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SCHEDULE:
				setSchedule((Schedule)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SEARCH_PARAMETER:
				setSearchParameter((SearchParameter)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SERVICE_REQUEST:
				setServiceRequest((ServiceRequest)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SLOT:
				setSlot((Slot)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SPECIMEN:
				setSpecimen((Specimen)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SPECIMEN_DEFINITION:
				setSpecimenDefinition((SpecimenDefinition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__STRUCTURE_DEFINITION:
				setStructureDefinition((StructureDefinition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__STRUCTURE_MAP:
				setStructureMap((StructureMap)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION:
				setSubscription((Subscription)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION_STATUS:
				setSubscriptionStatus((SubscriptionStatus)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION_TOPIC:
				setSubscriptionTopic((SubscriptionTopic)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE:
				setSubstance((Substance)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_DEFINITION:
				setSubstanceDefinition((SubstanceDefinition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_NUCLEIC_ACID:
				setSubstanceNucleicAcid((SubstanceNucleicAcid)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_POLYMER:
				setSubstancePolymer((SubstancePolymer)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_PROTEIN:
				setSubstanceProtein((SubstanceProtein)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_REFERENCE_INFORMATION:
				setSubstanceReferenceInformation((SubstanceReferenceInformation)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_SOURCE_MATERIAL:
				setSubstanceSourceMaterial((SubstanceSourceMaterial)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUPPLY_DELIVERY:
				setSupplyDelivery((SupplyDelivery)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUPPLY_REQUEST:
				setSupplyRequest((SupplyRequest)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__TASK:
				setTask((Task)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__TERMINOLOGY_CAPABILITIES:
				setTerminologyCapabilities((TerminologyCapabilities)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__TEST_PLAN:
				setTestPlan((TestPlan)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__TEST_REPORT:
				setTestReport((TestReport)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__TEST_SCRIPT:
				setTestScript((TestScript)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__TRANSPORT:
				setTransport((Transport)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__VALUE_SET:
				setValueSet((ValueSet)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__VERIFICATION_RESULT:
				setVerificationResult((VerificationResult)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__VISION_PRESCRIPTION:
				setVisionPrescription((VisionPrescription)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PARAMETERS:
				setParameters((Parameters)null);
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
			case FhirPackage.RESOURCE_CONTAINER__ACCOUNT:
				return account != null;
			case FhirPackage.RESOURCE_CONTAINER__ACTIVITY_DEFINITION:
				return activityDefinition != null;
			case FhirPackage.RESOURCE_CONTAINER__ACTOR_DEFINITION:
				return actorDefinition != null;
			case FhirPackage.RESOURCE_CONTAINER__ADMINISTRABLE_PRODUCT_DEFINITION:
				return administrableProductDefinition != null;
			case FhirPackage.RESOURCE_CONTAINER__ADVERSE_EVENT:
				return adverseEvent != null;
			case FhirPackage.RESOURCE_CONTAINER__ALLERGY_INTOLERANCE:
				return allergyIntolerance != null;
			case FhirPackage.RESOURCE_CONTAINER__APPOINTMENT:
				return appointment != null;
			case FhirPackage.RESOURCE_CONTAINER__APPOINTMENT_RESPONSE:
				return appointmentResponse != null;
			case FhirPackage.RESOURCE_CONTAINER__ARTIFACT_ASSESSMENT:
				return artifactAssessment != null;
			case FhirPackage.RESOURCE_CONTAINER__AUDIT_EVENT:
				return auditEvent != null;
			case FhirPackage.RESOURCE_CONTAINER__BASIC:
				return basic != null;
			case FhirPackage.RESOURCE_CONTAINER__BINARY:
				return binary != null;
			case FhirPackage.RESOURCE_CONTAINER__BIOLOGICALLY_DERIVED_PRODUCT:
				return biologicallyDerivedProduct != null;
			case FhirPackage.RESOURCE_CONTAINER__BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE:
				return biologicallyDerivedProductDispense != null;
			case FhirPackage.RESOURCE_CONTAINER__BODY_STRUCTURE:
				return bodyStructure != null;
			case FhirPackage.RESOURCE_CONTAINER__BUNDLE:
				return bundle != null;
			case FhirPackage.RESOURCE_CONTAINER__CAPABILITY_STATEMENT:
				return capabilityStatement != null;
			case FhirPackage.RESOURCE_CONTAINER__CARE_PLAN:
				return carePlan != null;
			case FhirPackage.RESOURCE_CONTAINER__CARE_TEAM:
				return careTeam != null;
			case FhirPackage.RESOURCE_CONTAINER__CHARGE_ITEM:
				return chargeItem != null;
			case FhirPackage.RESOURCE_CONTAINER__CHARGE_ITEM_DEFINITION:
				return chargeItemDefinition != null;
			case FhirPackage.RESOURCE_CONTAINER__CITATION:
				return citation != null;
			case FhirPackage.RESOURCE_CONTAINER__CLAIM:
				return claim != null;
			case FhirPackage.RESOURCE_CONTAINER__CLAIM_RESPONSE:
				return claimResponse != null;
			case FhirPackage.RESOURCE_CONTAINER__CLINICAL_IMPRESSION:
				return clinicalImpression != null;
			case FhirPackage.RESOURCE_CONTAINER__CLINICAL_USE_DEFINITION:
				return clinicalUseDefinition != null;
			case FhirPackage.RESOURCE_CONTAINER__CODE_SYSTEM:
				return codeSystem != null;
			case FhirPackage.RESOURCE_CONTAINER__COMMUNICATION:
				return communication != null;
			case FhirPackage.RESOURCE_CONTAINER__COMMUNICATION_REQUEST:
				return communicationRequest != null;
			case FhirPackage.RESOURCE_CONTAINER__COMPARTMENT_DEFINITION:
				return compartmentDefinition != null;
			case FhirPackage.RESOURCE_CONTAINER__COMPOSITION:
				return composition != null;
			case FhirPackage.RESOURCE_CONTAINER__CONCEPT_MAP:
				return conceptMap != null;
			case FhirPackage.RESOURCE_CONTAINER__CONDITION:
				return condition != null;
			case FhirPackage.RESOURCE_CONTAINER__CONDITION_DEFINITION:
				return conditionDefinition != null;
			case FhirPackage.RESOURCE_CONTAINER__CONSENT:
				return consent != null;
			case FhirPackage.RESOURCE_CONTAINER__CONTRACT:
				return contract != null;
			case FhirPackage.RESOURCE_CONTAINER__COVERAGE:
				return coverage != null;
			case FhirPackage.RESOURCE_CONTAINER__COVERAGE_ELIGIBILITY_REQUEST:
				return coverageEligibilityRequest != null;
			case FhirPackage.RESOURCE_CONTAINER__COVERAGE_ELIGIBILITY_RESPONSE:
				return coverageEligibilityResponse != null;
			case FhirPackage.RESOURCE_CONTAINER__DETECTED_ISSUE:
				return detectedIssue != null;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE:
				return device != null;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_ASSOCIATION:
				return deviceAssociation != null;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_DEFINITION:
				return deviceDefinition != null;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_DISPENSE:
				return deviceDispense != null;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_METRIC:
				return deviceMetric != null;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_REQUEST:
				return deviceRequest != null;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_USAGE:
				return deviceUsage != null;
			case FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_REPORT:
				return diagnosticReport != null;
			case FhirPackage.RESOURCE_CONTAINER__DOCUMENT_REFERENCE:
				return documentReference != null;
			case FhirPackage.RESOURCE_CONTAINER__ENCOUNTER:
				return encounter != null;
			case FhirPackage.RESOURCE_CONTAINER__ENCOUNTER_HISTORY:
				return encounterHistory != null;
			case FhirPackage.RESOURCE_CONTAINER__ENDPOINT:
				return endpoint != null;
			case FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_REQUEST:
				return enrollmentRequest != null;
			case FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_RESPONSE:
				return enrollmentResponse != null;
			case FhirPackage.RESOURCE_CONTAINER__EPISODE_OF_CARE:
				return episodeOfCare != null;
			case FhirPackage.RESOURCE_CONTAINER__EVENT_DEFINITION:
				return eventDefinition != null;
			case FhirPackage.RESOURCE_CONTAINER__EVIDENCE:
				return evidence != null;
			case FhirPackage.RESOURCE_CONTAINER__EVIDENCE_REPORT:
				return evidenceReport != null;
			case FhirPackage.RESOURCE_CONTAINER__EVIDENCE_VARIABLE:
				return evidenceVariable != null;
			case FhirPackage.RESOURCE_CONTAINER__EXAMPLE_SCENARIO:
				return exampleScenario != null;
			case FhirPackage.RESOURCE_CONTAINER__EXPLANATION_OF_BENEFIT:
				return explanationOfBenefit != null;
			case FhirPackage.RESOURCE_CONTAINER__FAMILY_MEMBER_HISTORY:
				return familyMemberHistory != null;
			case FhirPackage.RESOURCE_CONTAINER__FLAG:
				return flag != null;
			case FhirPackage.RESOURCE_CONTAINER__FORMULARY_ITEM:
				return formularyItem != null;
			case FhirPackage.RESOURCE_CONTAINER__GENOMIC_STUDY:
				return genomicStudy != null;
			case FhirPackage.RESOURCE_CONTAINER__GOAL:
				return goal != null;
			case FhirPackage.RESOURCE_CONTAINER__GRAPH_DEFINITION:
				return graphDefinition != null;
			case FhirPackage.RESOURCE_CONTAINER__GROUP:
				return group != null;
			case FhirPackage.RESOURCE_CONTAINER__GUIDANCE_RESPONSE:
				return guidanceResponse != null;
			case FhirPackage.RESOURCE_CONTAINER__HEALTHCARE_SERVICE:
				return healthcareService != null;
			case FhirPackage.RESOURCE_CONTAINER__IMAGING_SELECTION:
				return imagingSelection != null;
			case FhirPackage.RESOURCE_CONTAINER__IMAGING_STUDY:
				return imagingStudy != null;
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION:
				return immunization != null;
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_EVALUATION:
				return immunizationEvaluation != null;
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_RECOMMENDATION:
				return immunizationRecommendation != null;
			case FhirPackage.RESOURCE_CONTAINER__IMPLEMENTATION_GUIDE:
				return implementationGuide != null;
			case FhirPackage.RESOURCE_CONTAINER__INGREDIENT:
				return ingredient != null;
			case FhirPackage.RESOURCE_CONTAINER__INSURANCE_PLAN:
				return insurancePlan != null;
			case FhirPackage.RESOURCE_CONTAINER__INVENTORY_ITEM:
				return inventoryItem != null;
			case FhirPackage.RESOURCE_CONTAINER__INVENTORY_REPORT:
				return inventoryReport != null;
			case FhirPackage.RESOURCE_CONTAINER__INVOICE:
				return invoice != null;
			case FhirPackage.RESOURCE_CONTAINER__LIBRARY:
				return library != null;
			case FhirPackage.RESOURCE_CONTAINER__LINKAGE:
				return linkage != null;
			case FhirPackage.RESOURCE_CONTAINER__LIST:
				return list != null;
			case FhirPackage.RESOURCE_CONTAINER__LOCATION:
				return location != null;
			case FhirPackage.RESOURCE_CONTAINER__MANUFACTURED_ITEM_DEFINITION:
				return manufacturedItemDefinition != null;
			case FhirPackage.RESOURCE_CONTAINER__MEASURE:
				return measure != null;
			case FhirPackage.RESOURCE_CONTAINER__MEASURE_REPORT:
				return measureReport != null;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION:
				return medication != null;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_ADMINISTRATION:
				return medicationAdministration != null;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_DISPENSE:
				return medicationDispense != null;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_KNOWLEDGE:
				return medicationKnowledge != null;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_REQUEST:
				return medicationRequest != null;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_STATEMENT:
				return medicationStatement != null;
			case FhirPackage.RESOURCE_CONTAINER__MEDICINAL_PRODUCT_DEFINITION:
				return medicinalProductDefinition != null;
			case FhirPackage.RESOURCE_CONTAINER__MESSAGE_DEFINITION:
				return messageDefinition != null;
			case FhirPackage.RESOURCE_CONTAINER__MESSAGE_HEADER:
				return messageHeader != null;
			case FhirPackage.RESOURCE_CONTAINER__MOLECULAR_SEQUENCE:
				return molecularSequence != null;
			case FhirPackage.RESOURCE_CONTAINER__NAMING_SYSTEM:
				return namingSystem != null;
			case FhirPackage.RESOURCE_CONTAINER__NUTRITION_INTAKE:
				return nutritionIntake != null;
			case FhirPackage.RESOURCE_CONTAINER__NUTRITION_ORDER:
				return nutritionOrder != null;
			case FhirPackage.RESOURCE_CONTAINER__NUTRITION_PRODUCT:
				return nutritionProduct != null;
			case FhirPackage.RESOURCE_CONTAINER__OBSERVATION:
				return observation != null;
			case FhirPackage.RESOURCE_CONTAINER__OBSERVATION_DEFINITION:
				return observationDefinition != null;
			case FhirPackage.RESOURCE_CONTAINER__OPERATION_DEFINITION:
				return operationDefinition != null;
			case FhirPackage.RESOURCE_CONTAINER__OPERATION_OUTCOME:
				return operationOutcome != null;
			case FhirPackage.RESOURCE_CONTAINER__ORGANIZATION:
				return organization != null;
			case FhirPackage.RESOURCE_CONTAINER__ORGANIZATION_AFFILIATION:
				return organizationAffiliation != null;
			case FhirPackage.RESOURCE_CONTAINER__PACKAGED_PRODUCT_DEFINITION:
				return packagedProductDefinition != null;
			case FhirPackage.RESOURCE_CONTAINER__PATIENT:
				return patient != null;
			case FhirPackage.RESOURCE_CONTAINER__PAYMENT_NOTICE:
				return paymentNotice != null;
			case FhirPackage.RESOURCE_CONTAINER__PAYMENT_RECONCILIATION:
				return paymentReconciliation != null;
			case FhirPackage.RESOURCE_CONTAINER__PERMISSION:
				return permission != null;
			case FhirPackage.RESOURCE_CONTAINER__PERSON:
				return person != null;
			case FhirPackage.RESOURCE_CONTAINER__PLAN_DEFINITION:
				return planDefinition != null;
			case FhirPackage.RESOURCE_CONTAINER__PRACTITIONER:
				return practitioner != null;
			case FhirPackage.RESOURCE_CONTAINER__PRACTITIONER_ROLE:
				return practitionerRole != null;
			case FhirPackage.RESOURCE_CONTAINER__PROCEDURE:
				return procedure != null;
			case FhirPackage.RESOURCE_CONTAINER__PROVENANCE:
				return provenance != null;
			case FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE:
				return questionnaire != null;
			case FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE_RESPONSE:
				return questionnaireResponse != null;
			case FhirPackage.RESOURCE_CONTAINER__REGULATED_AUTHORIZATION:
				return regulatedAuthorization != null;
			case FhirPackage.RESOURCE_CONTAINER__RELATED_PERSON:
				return relatedPerson != null;
			case FhirPackage.RESOURCE_CONTAINER__REQUEST_ORCHESTRATION:
				return requestOrchestration != null;
			case FhirPackage.RESOURCE_CONTAINER__REQUIREMENTS:
				return requirements != null;
			case FhirPackage.RESOURCE_CONTAINER__RESEARCH_STUDY:
				return researchStudy != null;
			case FhirPackage.RESOURCE_CONTAINER__RESEARCH_SUBJECT:
				return researchSubject != null;
			case FhirPackage.RESOURCE_CONTAINER__RISK_ASSESSMENT:
				return riskAssessment != null;
			case FhirPackage.RESOURCE_CONTAINER__SCHEDULE:
				return schedule != null;
			case FhirPackage.RESOURCE_CONTAINER__SEARCH_PARAMETER:
				return searchParameter != null;
			case FhirPackage.RESOURCE_CONTAINER__SERVICE_REQUEST:
				return serviceRequest != null;
			case FhirPackage.RESOURCE_CONTAINER__SLOT:
				return slot != null;
			case FhirPackage.RESOURCE_CONTAINER__SPECIMEN:
				return specimen != null;
			case FhirPackage.RESOURCE_CONTAINER__SPECIMEN_DEFINITION:
				return specimenDefinition != null;
			case FhirPackage.RESOURCE_CONTAINER__STRUCTURE_DEFINITION:
				return structureDefinition != null;
			case FhirPackage.RESOURCE_CONTAINER__STRUCTURE_MAP:
				return structureMap != null;
			case FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION:
				return subscription != null;
			case FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION_STATUS:
				return subscriptionStatus != null;
			case FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION_TOPIC:
				return subscriptionTopic != null;
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE:
				return substance != null;
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_DEFINITION:
				return substanceDefinition != null;
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_NUCLEIC_ACID:
				return substanceNucleicAcid != null;
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_POLYMER:
				return substancePolymer != null;
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_PROTEIN:
				return substanceProtein != null;
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_REFERENCE_INFORMATION:
				return substanceReferenceInformation != null;
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE_SOURCE_MATERIAL:
				return substanceSourceMaterial != null;
			case FhirPackage.RESOURCE_CONTAINER__SUPPLY_DELIVERY:
				return supplyDelivery != null;
			case FhirPackage.RESOURCE_CONTAINER__SUPPLY_REQUEST:
				return supplyRequest != null;
			case FhirPackage.RESOURCE_CONTAINER__TASK:
				return task != null;
			case FhirPackage.RESOURCE_CONTAINER__TERMINOLOGY_CAPABILITIES:
				return terminologyCapabilities != null;
			case FhirPackage.RESOURCE_CONTAINER__TEST_PLAN:
				return testPlan != null;
			case FhirPackage.RESOURCE_CONTAINER__TEST_REPORT:
				return testReport != null;
			case FhirPackage.RESOURCE_CONTAINER__TEST_SCRIPT:
				return testScript != null;
			case FhirPackage.RESOURCE_CONTAINER__TRANSPORT:
				return transport != null;
			case FhirPackage.RESOURCE_CONTAINER__VALUE_SET:
				return valueSet != null;
			case FhirPackage.RESOURCE_CONTAINER__VERIFICATION_RESULT:
				return verificationResult != null;
			case FhirPackage.RESOURCE_CONTAINER__VISION_PRESCRIPTION:
				return visionPrescription != null;
			case FhirPackage.RESOURCE_CONTAINER__PARAMETERS:
				return parameters != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceContainerImpl
