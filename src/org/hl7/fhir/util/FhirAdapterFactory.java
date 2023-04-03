/**
 */
package org.hl7.fhir.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.hl7.fhir.Account;
import org.hl7.fhir.AccountBalance;
import org.hl7.fhir.AccountCoverage;
import org.hl7.fhir.AccountDiagnosis;
import org.hl7.fhir.AccountGuarantor;
import org.hl7.fhir.AccountProcedure;
import org.hl7.fhir.AccountRelatedAccount;
import org.hl7.fhir.AccountStatus;
import org.hl7.fhir.ActionCardinalityBehavior;
import org.hl7.fhir.ActionConditionKind;
import org.hl7.fhir.ActionGroupingBehavior;
import org.hl7.fhir.ActionParticipantType;
import org.hl7.fhir.ActionPrecheckBehavior;
import org.hl7.fhir.ActionRelationshipType;
import org.hl7.fhir.ActionRequiredBehavior;
import org.hl7.fhir.ActionSelectionBehavior;
import org.hl7.fhir.ActivityDefinition;
import org.hl7.fhir.ActivityDefinitionDynamicValue;
import org.hl7.fhir.ActivityDefinitionParticipant;
import org.hl7.fhir.ActorDefinition;
import org.hl7.fhir.Address;
import org.hl7.fhir.AddressType;
import org.hl7.fhir.AddressUse;
import org.hl7.fhir.AdministrableProductDefinition;
import org.hl7.fhir.AdministrableProductDefinitionProperty;
import org.hl7.fhir.AdministrableProductDefinitionRouteOfAdministration;
import org.hl7.fhir.AdministrableProductDefinitionTargetSpecies;
import org.hl7.fhir.AdministrableProductDefinitionWithdrawalPeriod;
import org.hl7.fhir.AdministrativeGender;
import org.hl7.fhir.AdverseEvent;
import org.hl7.fhir.AdverseEventActuality;
import org.hl7.fhir.AdverseEventCausality;
import org.hl7.fhir.AdverseEventContributingFactor;
import org.hl7.fhir.AdverseEventMitigatingAction;
import org.hl7.fhir.AdverseEventParticipant;
import org.hl7.fhir.AdverseEventPreventiveAction;
import org.hl7.fhir.AdverseEventStatus;
import org.hl7.fhir.AdverseEventSupportingInfo;
import org.hl7.fhir.AdverseEventSuspectEntity;
import org.hl7.fhir.Age;
import org.hl7.fhir.AgeUnits;
import org.hl7.fhir.AggregationMode;
import org.hl7.fhir.AllResourceTypes;
import org.hl7.fhir.AllergyIntolerance;
import org.hl7.fhir.AllergyIntoleranceCategory;
import org.hl7.fhir.AllergyIntoleranceCriticality;
import org.hl7.fhir.AllergyIntoleranceParticipant;
import org.hl7.fhir.AllergyIntoleranceReaction;
import org.hl7.fhir.AllergyIntoleranceSeverity;
import org.hl7.fhir.Annotation;
import org.hl7.fhir.Appointment;
import org.hl7.fhir.AppointmentMonthlyTemplate;
import org.hl7.fhir.AppointmentParticipant;
import org.hl7.fhir.AppointmentRecurrenceTemplate;
import org.hl7.fhir.AppointmentResponse;
import org.hl7.fhir.AppointmentResponseStatus;
import org.hl7.fhir.AppointmentStatus;
import org.hl7.fhir.AppointmentWeeklyTemplate;
import org.hl7.fhir.AppointmentYearlyTemplate;
import org.hl7.fhir.ArtifactAssessment;
import org.hl7.fhir.ArtifactAssessmentContent;
import org.hl7.fhir.ArtifactAssessmentDisposition;
import org.hl7.fhir.ArtifactAssessmentInformationType;
import org.hl7.fhir.ArtifactAssessmentWorkflowStatus;
import org.hl7.fhir.AssertionDirectionType;
import org.hl7.fhir.AssertionManualCompletionType;
import org.hl7.fhir.AssertionOperatorType;
import org.hl7.fhir.AssertionResponseTypes;
import org.hl7.fhir.Attachment;
import org.hl7.fhir.AuditEvent;
import org.hl7.fhir.AuditEventAction;
import org.hl7.fhir.AuditEventAgent;
import org.hl7.fhir.AuditEventDetail;
import org.hl7.fhir.AuditEventEntity;
import org.hl7.fhir.AuditEventOutcome;
import org.hl7.fhir.AuditEventSeverity;
import org.hl7.fhir.AuditEventSource;
import org.hl7.fhir.Availability;
import org.hl7.fhir.AvailabilityAvailableTime;
import org.hl7.fhir.AvailabilityNotAvailableTime;
import org.hl7.fhir.BackboneElement;
import org.hl7.fhir.BackboneType;
import org.hl7.fhir.Base;
import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Basic;
import org.hl7.fhir.Binary;
import org.hl7.fhir.BindingStrength;
import org.hl7.fhir.BiologicallyDerivedProduct;
import org.hl7.fhir.BiologicallyDerivedProductCollection;
import org.hl7.fhir.BiologicallyDerivedProductDispense;
import org.hl7.fhir.BiologicallyDerivedProductDispenseCodes;
import org.hl7.fhir.BiologicallyDerivedProductDispensePerformer;
import org.hl7.fhir.BiologicallyDerivedProductProperty;
import org.hl7.fhir.BodyStructure;
import org.hl7.fhir.BodyStructureBodyLandmarkOrientation;
import org.hl7.fhir.BodyStructureDistanceFromLandmark;
import org.hl7.fhir.BodyStructureIncludedStructure;
import org.hl7.fhir.Bundle;
import org.hl7.fhir.BundleEntry;
import org.hl7.fhir.BundleLink;
import org.hl7.fhir.BundleRequest;
import org.hl7.fhir.BundleResponse;
import org.hl7.fhir.BundleSearch;
import org.hl7.fhir.BundleType;
import org.hl7.fhir.Canonical;
import org.hl7.fhir.CanonicalResource;
import org.hl7.fhir.CapabilityStatement;
import org.hl7.fhir.CapabilityStatementDocument;
import org.hl7.fhir.CapabilityStatementEndpoint;
import org.hl7.fhir.CapabilityStatementImplementation;
import org.hl7.fhir.CapabilityStatementInteraction;
import org.hl7.fhir.CapabilityStatementInteraction1;
import org.hl7.fhir.CapabilityStatementKind;
import org.hl7.fhir.CapabilityStatementMessaging;
import org.hl7.fhir.CapabilityStatementOperation;
import org.hl7.fhir.CapabilityStatementResource;
import org.hl7.fhir.CapabilityStatementRest;
import org.hl7.fhir.CapabilityStatementSearchParam;
import org.hl7.fhir.CapabilityStatementSecurity;
import org.hl7.fhir.CapabilityStatementSoftware;
import org.hl7.fhir.CapabilityStatementSupportedMessage;
import org.hl7.fhir.CarePlan;
import org.hl7.fhir.CarePlanActivity;
import org.hl7.fhir.CarePlanIntent;
import org.hl7.fhir.CareTeam;
import org.hl7.fhir.CareTeamParticipant;
import org.hl7.fhir.CareTeamStatus;
import org.hl7.fhir.CharacteristicCombination;
import org.hl7.fhir.ChargeItem;
import org.hl7.fhir.ChargeItemDefinition;
import org.hl7.fhir.ChargeItemDefinitionApplicability;
import org.hl7.fhir.ChargeItemDefinitionPropertyGroup;
import org.hl7.fhir.ChargeItemPerformer;
import org.hl7.fhir.ChargeItemStatus;
import org.hl7.fhir.Citation;
import org.hl7.fhir.CitationAbstract;
import org.hl7.fhir.CitationCitedArtifact;
import org.hl7.fhir.CitationClassification;
import org.hl7.fhir.CitationClassification1;
import org.hl7.fhir.CitationContributionInstance;
import org.hl7.fhir.CitationContributorship;
import org.hl7.fhir.CitationEntry;
import org.hl7.fhir.CitationPart;
import org.hl7.fhir.CitationPublicationForm;
import org.hl7.fhir.CitationPublishedIn;
import org.hl7.fhir.CitationRelatesTo;
import org.hl7.fhir.CitationStatusDate;
import org.hl7.fhir.CitationStatusDate1;
import org.hl7.fhir.CitationSummary;
import org.hl7.fhir.CitationSummary1;
import org.hl7.fhir.CitationTitle;
import org.hl7.fhir.CitationVersion;
import org.hl7.fhir.CitationWebLocation;
import org.hl7.fhir.Claim;
import org.hl7.fhir.ClaimAccident;
import org.hl7.fhir.ClaimBodySite;
import org.hl7.fhir.ClaimCareTeam;
import org.hl7.fhir.ClaimDetail;
import org.hl7.fhir.ClaimDiagnosis;
import org.hl7.fhir.ClaimEvent;
import org.hl7.fhir.ClaimInsurance;
import org.hl7.fhir.ClaimItem;
import org.hl7.fhir.ClaimPayee;
import org.hl7.fhir.ClaimProcedure;
import org.hl7.fhir.ClaimProcessingCodes;
import org.hl7.fhir.ClaimRelated;
import org.hl7.fhir.ClaimResponse;
import org.hl7.fhir.ClaimResponseAddItem;
import org.hl7.fhir.ClaimResponseAdjudication;
import org.hl7.fhir.ClaimResponseBodySite;
import org.hl7.fhir.ClaimResponseDetail;
import org.hl7.fhir.ClaimResponseDetail1;
import org.hl7.fhir.ClaimResponseError;
import org.hl7.fhir.ClaimResponseEvent;
import org.hl7.fhir.ClaimResponseInsurance;
import org.hl7.fhir.ClaimResponseItem;
import org.hl7.fhir.ClaimResponsePayment;
import org.hl7.fhir.ClaimResponseProcessNote;
import org.hl7.fhir.ClaimResponseReviewOutcome;
import org.hl7.fhir.ClaimResponseSubDetail;
import org.hl7.fhir.ClaimResponseSubDetail1;
import org.hl7.fhir.ClaimResponseTotal;
import org.hl7.fhir.ClaimSubDetail;
import org.hl7.fhir.ClaimSupportingInfo;
import org.hl7.fhir.ClinicalImpression;
import org.hl7.fhir.ClinicalImpressionFinding;
import org.hl7.fhir.ClinicalUseDefinition;
import org.hl7.fhir.ClinicalUseDefinitionContraindication;
import org.hl7.fhir.ClinicalUseDefinitionIndication;
import org.hl7.fhir.ClinicalUseDefinitionInteractant;
import org.hl7.fhir.ClinicalUseDefinitionInteraction;
import org.hl7.fhir.ClinicalUseDefinitionOtherTherapy;
import org.hl7.fhir.ClinicalUseDefinitionType;
import org.hl7.fhir.ClinicalUseDefinitionUndesirableEffect;
import org.hl7.fhir.ClinicalUseDefinitionWarning;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeSearchSupport;
import org.hl7.fhir.CodeSystem;
import org.hl7.fhir.CodeSystemConcept;
import org.hl7.fhir.CodeSystemContentMode;
import org.hl7.fhir.CodeSystemDesignation;
import org.hl7.fhir.CodeSystemFilter;
import org.hl7.fhir.CodeSystemHierarchyMeaning;
import org.hl7.fhir.CodeSystemProperty;
import org.hl7.fhir.CodeSystemProperty1;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.Coding;
import org.hl7.fhir.ColorCodesOrRGB;
import org.hl7.fhir.CommonLanguages;
import org.hl7.fhir.Communication;
import org.hl7.fhir.CommunicationPayload;
import org.hl7.fhir.CommunicationRequest;
import org.hl7.fhir.CommunicationRequestPayload;
import org.hl7.fhir.CompartmentDefinition;
import org.hl7.fhir.CompartmentDefinitionResource;
import org.hl7.fhir.CompartmentType;
import org.hl7.fhir.Composition;
import org.hl7.fhir.CompositionAttester;
import org.hl7.fhir.CompositionEvent;
import org.hl7.fhir.CompositionSection;
import org.hl7.fhir.CompositionStatus;
import org.hl7.fhir.ConceptMap;
import org.hl7.fhir.ConceptMapAdditionalAttribute;
import org.hl7.fhir.ConceptMapAttributeType;
import org.hl7.fhir.ConceptMapDependsOn;
import org.hl7.fhir.ConceptMapElement;
import org.hl7.fhir.ConceptMapGroup;
import org.hl7.fhir.ConceptMapGroupUnmappedMode;
import org.hl7.fhir.ConceptMapProperty;
import org.hl7.fhir.ConceptMapProperty1;
import org.hl7.fhir.ConceptMapPropertyType;
import org.hl7.fhir.ConceptMapRelationship;
import org.hl7.fhir.ConceptMapTarget;
import org.hl7.fhir.ConceptMapUnmapped;
import org.hl7.fhir.ConcreteFHIRTypes;
import org.hl7.fhir.Condition;
import org.hl7.fhir.ConditionDefinition;
import org.hl7.fhir.ConditionDefinitionMedication;
import org.hl7.fhir.ConditionDefinitionObservation;
import org.hl7.fhir.ConditionDefinitionPlan;
import org.hl7.fhir.ConditionDefinitionPrecondition;
import org.hl7.fhir.ConditionDefinitionQuestionnaire;
import org.hl7.fhir.ConditionParticipant;
import org.hl7.fhir.ConditionPreconditionType;
import org.hl7.fhir.ConditionQuestionnairePurpose;
import org.hl7.fhir.ConditionStage;
import org.hl7.fhir.ConditionalDeleteStatus;
import org.hl7.fhir.ConditionalReadStatus;
import org.hl7.fhir.ConformanceExpectation;
import org.hl7.fhir.Consent;
import org.hl7.fhir.ConsentActor;
import org.hl7.fhir.ConsentData;
import org.hl7.fhir.ConsentDataMeaning;
import org.hl7.fhir.ConsentPolicyBasis;
import org.hl7.fhir.ConsentProvision;
import org.hl7.fhir.ConsentProvisionType;
import org.hl7.fhir.ConsentState;
import org.hl7.fhir.ConsentVerification;
import org.hl7.fhir.ConstraintSeverity;
import org.hl7.fhir.ContactDetail;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.ContactPointSystem;
import org.hl7.fhir.ContactPointUse;
import org.hl7.fhir.Contract;
import org.hl7.fhir.ContractAction;
import org.hl7.fhir.ContractAnswer;
import org.hl7.fhir.ContractAsset;
import org.hl7.fhir.ContractContentDefinition;
import org.hl7.fhir.ContractContext;
import org.hl7.fhir.ContractFriendly;
import org.hl7.fhir.ContractLegal;
import org.hl7.fhir.ContractOffer;
import org.hl7.fhir.ContractParty;
import org.hl7.fhir.ContractResourcePublicationStatusCodes;
import org.hl7.fhir.ContractResourceStatusCodes;
import org.hl7.fhir.ContractRule;
import org.hl7.fhir.ContractSecurityLabel;
import org.hl7.fhir.ContractSigner;
import org.hl7.fhir.ContractSubject;
import org.hl7.fhir.ContractTerm;
import org.hl7.fhir.ContractValuedItem;
import org.hl7.fhir.Contributor;
import org.hl7.fhir.ContributorType;
import org.hl7.fhir.Count;
import org.hl7.fhir.Coverage;
import org.hl7.fhir.CoverageClass;
import org.hl7.fhir.CoverageCostToBeneficiary;
import org.hl7.fhir.CoverageEligibilityRequest;
import org.hl7.fhir.CoverageEligibilityRequestDiagnosis;
import org.hl7.fhir.CoverageEligibilityRequestEvent;
import org.hl7.fhir.CoverageEligibilityRequestInsurance;
import org.hl7.fhir.CoverageEligibilityRequestItem;
import org.hl7.fhir.CoverageEligibilityRequestSupportingInfo;
import org.hl7.fhir.CoverageEligibilityResponse;
import org.hl7.fhir.CoverageEligibilityResponseBenefit;
import org.hl7.fhir.CoverageEligibilityResponseError;
import org.hl7.fhir.CoverageEligibilityResponseEvent;
import org.hl7.fhir.CoverageEligibilityResponseInsurance;
import org.hl7.fhir.CoverageEligibilityResponseItem;
import org.hl7.fhir.CoverageException;
import org.hl7.fhir.CoveragePaymentBy;
import org.hl7.fhir.CriteriaNotExistsBehavior;
import org.hl7.fhir.DataRequirement;
import org.hl7.fhir.DataRequirementCodeFilter;
import org.hl7.fhir.DataRequirementDateFilter;
import org.hl7.fhir.DataRequirementSort;
import org.hl7.fhir.DataRequirementValueFilter;
import org.hl7.fhir.DataType;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.DefinitionResourceTypes;
import org.hl7.fhir.DetectedIssue;
import org.hl7.fhir.DetectedIssueEvidence;
import org.hl7.fhir.DetectedIssueMitigation;
import org.hl7.fhir.DetectedIssueSeverity;
import org.hl7.fhir.DetectedIssueStatus;
import org.hl7.fhir.Device;
import org.hl7.fhir.DeviceAssociation;
import org.hl7.fhir.DeviceAssociationOperation;
import org.hl7.fhir.DeviceConformsTo;
import org.hl7.fhir.DeviceCorrectiveActionScope;
import org.hl7.fhir.DeviceDefinition;
import org.hl7.fhir.DeviceDefinitionChargeItem;
import org.hl7.fhir.DeviceDefinitionClassification;
import org.hl7.fhir.DeviceDefinitionConformsTo;
import org.hl7.fhir.DeviceDefinitionCorrectiveAction;
import org.hl7.fhir.DeviceDefinitionDeviceName;
import org.hl7.fhir.DeviceDefinitionDistributor;
import org.hl7.fhir.DeviceDefinitionGuideline;
import org.hl7.fhir.DeviceDefinitionHasPart;
import org.hl7.fhir.DeviceDefinitionLink;
import org.hl7.fhir.DeviceDefinitionMarketDistribution;
import org.hl7.fhir.DeviceDefinitionMaterial;
import org.hl7.fhir.DeviceDefinitionPackaging;
import org.hl7.fhir.DeviceDefinitionProperty;
import org.hl7.fhir.DeviceDefinitionRegulatoryIdentifier;
import org.hl7.fhir.DeviceDefinitionRegulatoryIdentifierType;
import org.hl7.fhir.DeviceDefinitionUdiDeviceIdentifier;
import org.hl7.fhir.DeviceDefinitionVersion;
import org.hl7.fhir.DeviceDispense;
import org.hl7.fhir.DeviceDispensePerformer;
import org.hl7.fhir.DeviceDispenseStatusCodes;
import org.hl7.fhir.DeviceMetric;
import org.hl7.fhir.DeviceMetricCalibration;
import org.hl7.fhir.DeviceMetricCalibrationState;
import org.hl7.fhir.DeviceMetricCalibrationType;
import org.hl7.fhir.DeviceMetricCategory;
import org.hl7.fhir.DeviceMetricOperationalStatus;
import org.hl7.fhir.DeviceName;
import org.hl7.fhir.DeviceNameType;
import org.hl7.fhir.DeviceProductionIdentifierInUDI;
import org.hl7.fhir.DeviceProperty;
import org.hl7.fhir.DeviceRequest;
import org.hl7.fhir.DeviceRequestParameter;
import org.hl7.fhir.DeviceUdiCarrier;
import org.hl7.fhir.DeviceUsage;
import org.hl7.fhir.DeviceUsageAdherence;
import org.hl7.fhir.DeviceUsageStatus;
import org.hl7.fhir.DeviceVersion;
import org.hl7.fhir.DiagnosticReport;
import org.hl7.fhir.DiagnosticReportMedia;
import org.hl7.fhir.DiagnosticReportStatus;
import org.hl7.fhir.DiagnosticReportSupportingInfo;
import org.hl7.fhir.DiscriminatorType;
import org.hl7.fhir.Distance;
import org.hl7.fhir.DocumentMode;
import org.hl7.fhir.DocumentReference;
import org.hl7.fhir.DocumentReferenceAttester;
import org.hl7.fhir.DocumentReferenceContent;
import org.hl7.fhir.DocumentReferenceProfile;
import org.hl7.fhir.DocumentReferenceRelatesTo;
import org.hl7.fhir.DocumentReferenceStatus;
import org.hl7.fhir.DocumentRoot;
import org.hl7.fhir.DomainResource;
import org.hl7.fhir.Dosage;
import org.hl7.fhir.DosageDoseAndRate;
import org.hl7.fhir.Duration;
import org.hl7.fhir.Element;
import org.hl7.fhir.ElementDefinition;
import org.hl7.fhir.ElementDefinitionAdditional;
import org.hl7.fhir.ElementDefinitionBase;
import org.hl7.fhir.ElementDefinitionBinding;
import org.hl7.fhir.ElementDefinitionConstraint;
import org.hl7.fhir.ElementDefinitionDiscriminator;
import org.hl7.fhir.ElementDefinitionExample;
import org.hl7.fhir.ElementDefinitionMapping;
import org.hl7.fhir.ElementDefinitionSlicing;
import org.hl7.fhir.ElementDefinitionType;
import org.hl7.fhir.EligibilityOutcome;
import org.hl7.fhir.EligibilityRequestPurpose;
import org.hl7.fhir.EligibilityResponsePurpose;
import org.hl7.fhir.EnableWhenBehavior;
import org.hl7.fhir.Encounter;
import org.hl7.fhir.EncounterAdmission;
import org.hl7.fhir.EncounterDiagnosis;
import org.hl7.fhir.EncounterHistory;
import org.hl7.fhir.EncounterHistoryLocation;
import org.hl7.fhir.EncounterLocation;
import org.hl7.fhir.EncounterLocationStatus;
import org.hl7.fhir.EncounterParticipant;
import org.hl7.fhir.EncounterReason;
import org.hl7.fhir.EncounterStatus;
import org.hl7.fhir.Endpoint;
import org.hl7.fhir.EndpointPayload;
import org.hl7.fhir.EndpointStatus;
import org.hl7.fhir.EnrollmentOutcome;
import org.hl7.fhir.EnrollmentRequest;
import org.hl7.fhir.EnrollmentResponse;
import org.hl7.fhir.EpisodeOfCare;
import org.hl7.fhir.EpisodeOfCareDiagnosis;
import org.hl7.fhir.EpisodeOfCareReason;
import org.hl7.fhir.EpisodeOfCareStatus;
import org.hl7.fhir.EpisodeOfCareStatusHistory;
import org.hl7.fhir.EventCapabilityMode;
import org.hl7.fhir.EventDefinition;
import org.hl7.fhir.EventResourceTypes;
import org.hl7.fhir.EventStatus;
import org.hl7.fhir.EventTiming;
import org.hl7.fhir.Evidence;
import org.hl7.fhir.EvidenceAttributeEstimate;
import org.hl7.fhir.EvidenceCertainty;
import org.hl7.fhir.EvidenceModelCharacteristic;
import org.hl7.fhir.EvidenceReport;
import org.hl7.fhir.EvidenceReportCharacteristic;
import org.hl7.fhir.EvidenceReportRelatesTo;
import org.hl7.fhir.EvidenceReportSection;
import org.hl7.fhir.EvidenceReportSubject;
import org.hl7.fhir.EvidenceReportTarget;
import org.hl7.fhir.EvidenceSampleSize;
import org.hl7.fhir.EvidenceStatistic;
import org.hl7.fhir.EvidenceVariable;
import org.hl7.fhir.EvidenceVariable1;
import org.hl7.fhir.EvidenceVariableCategory;
import org.hl7.fhir.EvidenceVariableCharacteristic;
import org.hl7.fhir.EvidenceVariableDefinition;
import org.hl7.fhir.EvidenceVariableDefinitionByCombination;
import org.hl7.fhir.EvidenceVariableDefinitionByTypeAndValue;
import org.hl7.fhir.EvidenceVariableHandling;
import org.hl7.fhir.EvidenceVariableTimeFromEvent;
import org.hl7.fhir.ExampleScenario;
import org.hl7.fhir.ExampleScenarioActor;
import org.hl7.fhir.ExampleScenarioActorType;
import org.hl7.fhir.ExampleScenarioAlternative;
import org.hl7.fhir.ExampleScenarioContainedInstance;
import org.hl7.fhir.ExampleScenarioInstance;
import org.hl7.fhir.ExampleScenarioOperation;
import org.hl7.fhir.ExampleScenarioProcess;
import org.hl7.fhir.ExampleScenarioStep;
import org.hl7.fhir.ExampleScenarioVersion;
import org.hl7.fhir.ExplanationOfBenefit;
import org.hl7.fhir.ExplanationOfBenefitAccident;
import org.hl7.fhir.ExplanationOfBenefitAddItem;
import org.hl7.fhir.ExplanationOfBenefitAdjudication;
import org.hl7.fhir.ExplanationOfBenefitBenefitBalance;
import org.hl7.fhir.ExplanationOfBenefitBodySite;
import org.hl7.fhir.ExplanationOfBenefitBodySite1;
import org.hl7.fhir.ExplanationOfBenefitCareTeam;
import org.hl7.fhir.ExplanationOfBenefitDetail;
import org.hl7.fhir.ExplanationOfBenefitDetail1;
import org.hl7.fhir.ExplanationOfBenefitDiagnosis;
import org.hl7.fhir.ExplanationOfBenefitEvent;
import org.hl7.fhir.ExplanationOfBenefitFinancial;
import org.hl7.fhir.ExplanationOfBenefitInsurance;
import org.hl7.fhir.ExplanationOfBenefitItem;
import org.hl7.fhir.ExplanationOfBenefitPayee;
import org.hl7.fhir.ExplanationOfBenefitPayment;
import org.hl7.fhir.ExplanationOfBenefitProcedure;
import org.hl7.fhir.ExplanationOfBenefitProcessNote;
import org.hl7.fhir.ExplanationOfBenefitRelated;
import org.hl7.fhir.ExplanationOfBenefitReviewOutcome;
import org.hl7.fhir.ExplanationOfBenefitStatus;
import org.hl7.fhir.ExplanationOfBenefitSubDetail;
import org.hl7.fhir.ExplanationOfBenefitSubDetail1;
import org.hl7.fhir.ExplanationOfBenefitSupportingInfo;
import org.hl7.fhir.ExplanationOfBenefitTotal;
import org.hl7.fhir.Expression;
import org.hl7.fhir.ExtendedContactDetail;
import org.hl7.fhir.Extension;
import org.hl7.fhir.ExtensionContextType;
import org.hl7.fhir.FHIRDeviceStatus;
import org.hl7.fhir.FHIRPathTypes;
import org.hl7.fhir.FHIRSubstanceStatus;
import org.hl7.fhir.FHIRTypes;
import org.hl7.fhir.FHIRVersion;
import org.hl7.fhir.FamilyHistoryStatus;
import org.hl7.fhir.FamilyMemberHistory;
import org.hl7.fhir.FamilyMemberHistoryCondition;
import org.hl7.fhir.FamilyMemberHistoryParticipant;
import org.hl7.fhir.FamilyMemberHistoryProcedure;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.FilterOperator;
import org.hl7.fhir.FinancialResourceStatusCodes;
import org.hl7.fhir.Flag;
import org.hl7.fhir.FlagStatus;
import org.hl7.fhir.FormularyItem;
import org.hl7.fhir.FormularyItemStatusCodes;
import org.hl7.fhir.GenomicStudy;
import org.hl7.fhir.GenomicStudyAnalysis;
import org.hl7.fhir.GenomicStudyDevice;
import org.hl7.fhir.GenomicStudyInput;
import org.hl7.fhir.GenomicStudyOutput;
import org.hl7.fhir.GenomicStudyPerformer;
import org.hl7.fhir.GenomicStudyStatus;
import org.hl7.fhir.Goal;
import org.hl7.fhir.GoalLifecycleStatus;
import org.hl7.fhir.GoalTarget;
import org.hl7.fhir.GraphCompartmentRule;
import org.hl7.fhir.GraphCompartmentUse;
import org.hl7.fhir.GraphDefinition;
import org.hl7.fhir.GraphDefinitionCompartment;
import org.hl7.fhir.GraphDefinitionLink;
import org.hl7.fhir.GraphDefinitionNode;
import org.hl7.fhir.Group;
import org.hl7.fhir.GroupCharacteristic;
import org.hl7.fhir.GroupMember;
import org.hl7.fhir.GroupMembershipBasis;
import org.hl7.fhir.GroupType;
import org.hl7.fhir.GuidanceResponse;
import org.hl7.fhir.GuidanceResponseStatus;
import org.hl7.fhir.GuidePageGeneration;
import org.hl7.fhir.HTTPVerb;
import org.hl7.fhir.HealthcareService;
import org.hl7.fhir.HealthcareServiceEligibility;
import org.hl7.fhir.HumanName;
import org.hl7.fhir.Id;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.IdentifierUse;
import org.hl7.fhir.IdentityAssuranceLevel;
import org.hl7.fhir.ImagingSelection;
import org.hl7.fhir.ImagingSelectionDGraphicType;
import org.hl7.fhir.ImagingSelectionImageRegion2D;
import org.hl7.fhir.ImagingSelectionImageRegion3D;
import org.hl7.fhir.ImagingSelectionInstance;
import org.hl7.fhir.ImagingSelectionPerformer;
import org.hl7.fhir.ImagingSelectionStatus;
import org.hl7.fhir.ImagingStudy;
import org.hl7.fhir.ImagingStudyInstance;
import org.hl7.fhir.ImagingStudyPerformer;
import org.hl7.fhir.ImagingStudySeries;
import org.hl7.fhir.ImagingStudyStatus;
import org.hl7.fhir.Immunization;
import org.hl7.fhir.ImmunizationEvaluation;
import org.hl7.fhir.ImmunizationEvaluationStatusCodes;
import org.hl7.fhir.ImmunizationPerformer;
import org.hl7.fhir.ImmunizationProgramEligibility;
import org.hl7.fhir.ImmunizationProtocolApplied;
import org.hl7.fhir.ImmunizationReaction;
import org.hl7.fhir.ImmunizationRecommendation;
import org.hl7.fhir.ImmunizationRecommendationDateCriterion;
import org.hl7.fhir.ImmunizationRecommendationRecommendation;
import org.hl7.fhir.ImmunizationStatusCodes;
import org.hl7.fhir.ImplementationGuide;
import org.hl7.fhir.ImplementationGuideDefinition;
import org.hl7.fhir.ImplementationGuideDependsOn;
import org.hl7.fhir.ImplementationGuideGlobal;
import org.hl7.fhir.ImplementationGuideGrouping;
import org.hl7.fhir.ImplementationGuideManifest;
import org.hl7.fhir.ImplementationGuidePage;
import org.hl7.fhir.ImplementationGuidePage1;
import org.hl7.fhir.ImplementationGuideParameter;
import org.hl7.fhir.ImplementationGuideResource;
import org.hl7.fhir.ImplementationGuideResource1;
import org.hl7.fhir.ImplementationGuideTemplate;
import org.hl7.fhir.Ingredient;
import org.hl7.fhir.IngredientManufacturer;
import org.hl7.fhir.IngredientManufacturerRole;
import org.hl7.fhir.IngredientReferenceStrength;
import org.hl7.fhir.IngredientStrength;
import org.hl7.fhir.IngredientSubstance;
import org.hl7.fhir.Instant;
import org.hl7.fhir.InsurancePlan;
import org.hl7.fhir.InsurancePlanBenefit;
import org.hl7.fhir.InsurancePlanBenefit1;
import org.hl7.fhir.InsurancePlanCost;
import org.hl7.fhir.InsurancePlanCoverage;
import org.hl7.fhir.InsurancePlanGeneralCost;
import org.hl7.fhir.InsurancePlanLimit;
import org.hl7.fhir.InsurancePlanPlan;
import org.hl7.fhir.InsurancePlanSpecificCost;
import org.hl7.fhir.Integer64;
import org.hl7.fhir.InteractionTrigger;
import org.hl7.fhir.InventoryCountType;
import org.hl7.fhir.InventoryItem;
import org.hl7.fhir.InventoryItemAssociation;
import org.hl7.fhir.InventoryItemCharacteristic;
import org.hl7.fhir.InventoryItemDescription;
import org.hl7.fhir.InventoryItemInstance;
import org.hl7.fhir.InventoryItemName;
import org.hl7.fhir.InventoryItemResponsibleOrganization;
import org.hl7.fhir.InventoryItemStatusCodes;
import org.hl7.fhir.InventoryReport;
import org.hl7.fhir.InventoryReportInventoryListing;
import org.hl7.fhir.InventoryReportItem;
import org.hl7.fhir.InventoryReportStatus;
import org.hl7.fhir.Invoice;
import org.hl7.fhir.InvoiceLineItem;
import org.hl7.fhir.InvoiceParticipant;
import org.hl7.fhir.InvoiceStatus;
import org.hl7.fhir.IssueSeverity;
import org.hl7.fhir.IssueType;
import org.hl7.fhir.JurisdictionValueSet;
import org.hl7.fhir.Kind;
import org.hl7.fhir.Library;
import org.hl7.fhir.LinkRelationTypes;
import org.hl7.fhir.LinkType;
import org.hl7.fhir.Linkage;
import org.hl7.fhir.LinkageItem;
import org.hl7.fhir.LinkageType;
import org.hl7.fhir.List;
import org.hl7.fhir.ListEntry;
import org.hl7.fhir.ListMode;
import org.hl7.fhir.ListStatus;
import org.hl7.fhir.Location;
import org.hl7.fhir.LocationMode;
import org.hl7.fhir.LocationPosition;
import org.hl7.fhir.LocationStatus;
import org.hl7.fhir.ManufacturedItemDefinition;
import org.hl7.fhir.ManufacturedItemDefinitionComponent;
import org.hl7.fhir.ManufacturedItemDefinitionConstituent;
import org.hl7.fhir.ManufacturedItemDefinitionProperty;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.MarketingStatus;
import org.hl7.fhir.Measure;
import org.hl7.fhir.MeasureComponent;
import org.hl7.fhir.MeasureGroup;
import org.hl7.fhir.MeasurePopulation;
import org.hl7.fhir.MeasureReport;
import org.hl7.fhir.MeasureReportComponent;
import org.hl7.fhir.MeasureReportGroup;
import org.hl7.fhir.MeasureReportPopulation;
import org.hl7.fhir.MeasureReportPopulation1;
import org.hl7.fhir.MeasureReportStatus;
import org.hl7.fhir.MeasureReportStratifier;
import org.hl7.fhir.MeasureReportStratum;
import org.hl7.fhir.MeasureReportType;
import org.hl7.fhir.MeasureStratifier;
import org.hl7.fhir.MeasureSupplementalData;
import org.hl7.fhir.MeasureTerm;
import org.hl7.fhir.Medication;
import org.hl7.fhir.MedicationAdministration;
import org.hl7.fhir.MedicationAdministrationDosage;
import org.hl7.fhir.MedicationAdministrationPerformer;
import org.hl7.fhir.MedicationAdministrationStatusCodes;
import org.hl7.fhir.MedicationBatch;
import org.hl7.fhir.MedicationDispense;
import org.hl7.fhir.MedicationDispensePerformer;
import org.hl7.fhir.MedicationDispenseStatusCodes;
import org.hl7.fhir.MedicationDispenseSubstitution;
import org.hl7.fhir.MedicationIngredient;
import org.hl7.fhir.MedicationKnowledge;
import org.hl7.fhir.MedicationKnowledgeCost;
import org.hl7.fhir.MedicationKnowledgeDefinitional;
import org.hl7.fhir.MedicationKnowledgeDosage;
import org.hl7.fhir.MedicationKnowledgeDosingGuideline;
import org.hl7.fhir.MedicationKnowledgeDrugCharacteristic;
import org.hl7.fhir.MedicationKnowledgeEnvironmentalSetting;
import org.hl7.fhir.MedicationKnowledgeIndicationGuideline;
import org.hl7.fhir.MedicationKnowledgeIngredient;
import org.hl7.fhir.MedicationKnowledgeMaxDispense;
import org.hl7.fhir.MedicationKnowledgeMedicineClassification;
import org.hl7.fhir.MedicationKnowledgeMonitoringProgram;
import org.hl7.fhir.MedicationKnowledgeMonograph;
import org.hl7.fhir.MedicationKnowledgePackaging;
import org.hl7.fhir.MedicationKnowledgePatientCharacteristic;
import org.hl7.fhir.MedicationKnowledgeRegulatory;
import org.hl7.fhir.MedicationKnowledgeRelatedMedicationKnowledge;
import org.hl7.fhir.MedicationKnowledgeStatusCodes;
import org.hl7.fhir.MedicationKnowledgeStorageGuideline;
import org.hl7.fhir.MedicationKnowledgeSubstitution;
import org.hl7.fhir.MedicationRequest;
import org.hl7.fhir.MedicationRequestDispenseRequest;
import org.hl7.fhir.MedicationRequestInitialFill;
import org.hl7.fhir.MedicationRequestIntent;
import org.hl7.fhir.MedicationRequestSubstitution;
import org.hl7.fhir.MedicationStatement;
import org.hl7.fhir.MedicationStatementAdherence;
import org.hl7.fhir.MedicationStatementStatusCodes;
import org.hl7.fhir.MedicationStatusCodes;
import org.hl7.fhir.MedicationrequestStatus;
import org.hl7.fhir.MedicinalProductDefinition;
import org.hl7.fhir.MedicinalProductDefinitionCharacteristic;
import org.hl7.fhir.MedicinalProductDefinitionContact;
import org.hl7.fhir.MedicinalProductDefinitionCrossReference;
import org.hl7.fhir.MedicinalProductDefinitionName;
import org.hl7.fhir.MedicinalProductDefinitionOperation;
import org.hl7.fhir.MedicinalProductDefinitionPart;
import org.hl7.fhir.MedicinalProductDefinitionUsage;
import org.hl7.fhir.MessageDefinition;
import org.hl7.fhir.MessageDefinitionAllowedResponse;
import org.hl7.fhir.MessageDefinitionFocus;
import org.hl7.fhir.MessageHeader;
import org.hl7.fhir.MessageHeaderDestination;
import org.hl7.fhir.MessageHeaderResponse;
import org.hl7.fhir.MessageHeaderSource;
import org.hl7.fhir.MessageSignificanceCategory;
import org.hl7.fhir.MessageheaderResponseRequest;
import org.hl7.fhir.Meta;
import org.hl7.fhir.MetadataResource;
import org.hl7.fhir.MolecularSequence;
import org.hl7.fhir.MolecularSequenceEdit;
import org.hl7.fhir.MolecularSequenceRelative;
import org.hl7.fhir.MolecularSequenceStartingSequence;
import org.hl7.fhir.MonetaryComponent;
import org.hl7.fhir.Money;
import org.hl7.fhir.NameUse;
import org.hl7.fhir.NamingSystem;
import org.hl7.fhir.NamingSystemIdentifierType;
import org.hl7.fhir.NamingSystemType;
import org.hl7.fhir.NamingSystemUniqueId;
import org.hl7.fhir.Narrative;
import org.hl7.fhir.NarrativeStatus;
import org.hl7.fhir.NoteType;
import org.hl7.fhir.NutritionIntake;
import org.hl7.fhir.NutritionIntakeConsumedItem;
import org.hl7.fhir.NutritionIntakeIngredientLabel;
import org.hl7.fhir.NutritionIntakePerformer;
import org.hl7.fhir.NutritionOrder;
import org.hl7.fhir.NutritionOrderAdditive;
import org.hl7.fhir.NutritionOrderAdministration;
import org.hl7.fhir.NutritionOrderEnteralFormula;
import org.hl7.fhir.NutritionOrderNutrient;
import org.hl7.fhir.NutritionOrderOralDiet;
import org.hl7.fhir.NutritionOrderSchedule;
import org.hl7.fhir.NutritionOrderSchedule1;
import org.hl7.fhir.NutritionOrderSchedule2;
import org.hl7.fhir.NutritionOrderSupplement;
import org.hl7.fhir.NutritionOrderTexture;
import org.hl7.fhir.NutritionProduct;
import org.hl7.fhir.NutritionProductCharacteristic;
import org.hl7.fhir.NutritionProductIngredient;
import org.hl7.fhir.NutritionProductInstance;
import org.hl7.fhir.NutritionProductNutrient;
import org.hl7.fhir.NutritionProductStatus;
import org.hl7.fhir.Observation;
import org.hl7.fhir.ObservationComponent;
import org.hl7.fhir.ObservationDataType;
import org.hl7.fhir.ObservationDefinition;
import org.hl7.fhir.ObservationDefinitionComponent;
import org.hl7.fhir.ObservationDefinitionQualifiedValue;
import org.hl7.fhir.ObservationRangeCategory;
import org.hl7.fhir.ObservationReferenceRange;
import org.hl7.fhir.ObservationStatus;
import org.hl7.fhir.ObservationTriggeredBy;
import org.hl7.fhir.Oid;
import org.hl7.fhir.OperationDefinition;
import org.hl7.fhir.OperationDefinitionBinding;
import org.hl7.fhir.OperationDefinitionOverload;
import org.hl7.fhir.OperationDefinitionParameter;
import org.hl7.fhir.OperationDefinitionReferencedFrom;
import org.hl7.fhir.OperationKind;
import org.hl7.fhir.OperationOutcome;
import org.hl7.fhir.OperationOutcomeCodes;
import org.hl7.fhir.OperationOutcomeIssue;
import org.hl7.fhir.OperationParameterScope;
import org.hl7.fhir.OperationParameterUse;
import org.hl7.fhir.Organization;
import org.hl7.fhir.OrganizationAffiliation;
import org.hl7.fhir.OrganizationQualification;
import org.hl7.fhir.OrientationType;
import org.hl7.fhir.PackagedProductDefinition;
import org.hl7.fhir.PackagedProductDefinitionContainedItem;
import org.hl7.fhir.PackagedProductDefinitionLegalStatusOfSupply;
import org.hl7.fhir.PackagedProductDefinitionPackaging;
import org.hl7.fhir.PackagedProductDefinitionProperty;
import org.hl7.fhir.ParameterDefinition;
import org.hl7.fhir.Parameters;
import org.hl7.fhir.ParametersParameter;
import org.hl7.fhir.ParticipantResourceTypes;
import org.hl7.fhir.ParticipationStatus;
import org.hl7.fhir.Patient;
import org.hl7.fhir.PatientCommunication;
import org.hl7.fhir.PatientContact;
import org.hl7.fhir.PatientLink;
import org.hl7.fhir.PaymentNotice;
import org.hl7.fhir.PaymentOutcome;
import org.hl7.fhir.PaymentReconciliation;
import org.hl7.fhir.PaymentReconciliationAllocation;
import org.hl7.fhir.PaymentReconciliationProcessNote;
import org.hl7.fhir.Period;
import org.hl7.fhir.Permission;
import org.hl7.fhir.PermissionActivity;
import org.hl7.fhir.PermissionData;
import org.hl7.fhir.PermissionJustification;
import org.hl7.fhir.PermissionResource;
import org.hl7.fhir.PermissionRule;
import org.hl7.fhir.PermissionRuleCombining;
import org.hl7.fhir.PermissionStatus;
import org.hl7.fhir.Person;
import org.hl7.fhir.PersonCommunication;
import org.hl7.fhir.PersonLink;
import org.hl7.fhir.PlanDefinition;
import org.hl7.fhir.PlanDefinitionAction;
import org.hl7.fhir.PlanDefinitionActor;
import org.hl7.fhir.PlanDefinitionCondition;
import org.hl7.fhir.PlanDefinitionDynamicValue;
import org.hl7.fhir.PlanDefinitionGoal;
import org.hl7.fhir.PlanDefinitionInput;
import org.hl7.fhir.PlanDefinitionOption;
import org.hl7.fhir.PlanDefinitionOutput;
import org.hl7.fhir.PlanDefinitionParticipant;
import org.hl7.fhir.PlanDefinitionRelatedAction;
import org.hl7.fhir.PlanDefinitionTarget;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Practitioner;
import org.hl7.fhir.PractitionerCommunication;
import org.hl7.fhir.PractitionerQualification;
import org.hl7.fhir.PractitionerRole;
import org.hl7.fhir.PrimitiveType;
import org.hl7.fhir.Procedure;
import org.hl7.fhir.ProcedureFocalDevice;
import org.hl7.fhir.ProcedurePerformer;
import org.hl7.fhir.ProductShelfLife;
import org.hl7.fhir.PropertyRepresentation;
import org.hl7.fhir.PropertyType;
import org.hl7.fhir.Provenance;
import org.hl7.fhir.ProvenanceAgent;
import org.hl7.fhir.ProvenanceEntity;
import org.hl7.fhir.ProvenanceEntityRole;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.QuantityComparator;
import org.hl7.fhir.Questionnaire;
import org.hl7.fhir.QuestionnaireAnswerConstraint;
import org.hl7.fhir.QuestionnaireAnswerOption;
import org.hl7.fhir.QuestionnaireEnableWhen;
import org.hl7.fhir.QuestionnaireInitial;
import org.hl7.fhir.QuestionnaireItem;
import org.hl7.fhir.QuestionnaireItemDisabledDisplay;
import org.hl7.fhir.QuestionnaireItemOperator;
import org.hl7.fhir.QuestionnaireItemType;
import org.hl7.fhir.QuestionnaireResponse;
import org.hl7.fhir.QuestionnaireResponseAnswer;
import org.hl7.fhir.QuestionnaireResponseItem;
import org.hl7.fhir.QuestionnaireResponseStatus;
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.RatioRange;
import org.hl7.fhir.Reference;
import org.hl7.fhir.ReferenceHandlingPolicy;
import org.hl7.fhir.ReferenceVersionRules;
import org.hl7.fhir.RegulatedAuthorization;
import org.hl7.fhir.RegulatedAuthorizationCase;
import org.hl7.fhir.RelatedArtifact;
import org.hl7.fhir.RelatedArtifactType;
import org.hl7.fhir.RelatedArtifactTypeExpanded;
import org.hl7.fhir.RelatedPerson;
import org.hl7.fhir.RelatedPersonCommunication;
import org.hl7.fhir.RemittanceOutcome;
import org.hl7.fhir.ReportRelationshipType;
import org.hl7.fhir.RequestIntent;
import org.hl7.fhir.RequestOrchestration;
import org.hl7.fhir.RequestOrchestrationAction;
import org.hl7.fhir.RequestOrchestrationCondition;
import org.hl7.fhir.RequestOrchestrationDynamicValue;
import org.hl7.fhir.RequestOrchestrationInput;
import org.hl7.fhir.RequestOrchestrationOutput;
import org.hl7.fhir.RequestOrchestrationParticipant;
import org.hl7.fhir.RequestOrchestrationRelatedAction;
import org.hl7.fhir.RequestPriority;
import org.hl7.fhir.RequestResourceTypes;
import org.hl7.fhir.RequestStatus;
import org.hl7.fhir.Requirements;
import org.hl7.fhir.RequirementsStatement;
import org.hl7.fhir.ResearchStudy;
import org.hl7.fhir.ResearchStudyAssociatedParty;
import org.hl7.fhir.ResearchStudyComparisonGroup;
import org.hl7.fhir.ResearchStudyLabel;
import org.hl7.fhir.ResearchStudyObjective;
import org.hl7.fhir.ResearchStudyOutcomeMeasure;
import org.hl7.fhir.ResearchStudyProgressStatus;
import org.hl7.fhir.ResearchStudyRecruitment;
import org.hl7.fhir.ResearchSubject;
import org.hl7.fhir.ResearchSubjectProgress;
import org.hl7.fhir.Resource;
import org.hl7.fhir.ResourceContainer;
import org.hl7.fhir.ResourceType;
import org.hl7.fhir.ResourceVersionPolicy;
import org.hl7.fhir.ResponseType;
import org.hl7.fhir.RestfulCapabilityMode;
import org.hl7.fhir.RiskAssessment;
import org.hl7.fhir.RiskAssessmentPrediction;
import org.hl7.fhir.SPDXLicense;
import org.hl7.fhir.SampledData;
import org.hl7.fhir.SampledDataDataType;
import org.hl7.fhir.Schedule;
import org.hl7.fhir.SearchComparator;
import org.hl7.fhir.SearchEntryMode;
import org.hl7.fhir.SearchModifierCode;
import org.hl7.fhir.SearchParamType;
import org.hl7.fhir.SearchParameter;
import org.hl7.fhir.SearchParameterComponent;
import org.hl7.fhir.SearchProcessingModeType;
import org.hl7.fhir.SequenceType;
import org.hl7.fhir.ServiceRequest;
import org.hl7.fhir.ServiceRequestOrderDetail;
import org.hl7.fhir.ServiceRequestParameter;
import org.hl7.fhir.ServiceRequestPatientInstruction;
import org.hl7.fhir.Signature;
import org.hl7.fhir.SlicingRules;
import org.hl7.fhir.Slot;
import org.hl7.fhir.SlotStatus;
import org.hl7.fhir.SortDirection;
import org.hl7.fhir.Specimen;
import org.hl7.fhir.SpecimenCollection;
import org.hl7.fhir.SpecimenCombined;
import org.hl7.fhir.SpecimenContainedPreference;
import org.hl7.fhir.SpecimenContainer;
import org.hl7.fhir.SpecimenDefinition;
import org.hl7.fhir.SpecimenDefinitionAdditive;
import org.hl7.fhir.SpecimenDefinitionContainer;
import org.hl7.fhir.SpecimenDefinitionHandling;
import org.hl7.fhir.SpecimenDefinitionTypeTested;
import org.hl7.fhir.SpecimenFeature;
import org.hl7.fhir.SpecimenProcessing;
import org.hl7.fhir.SpecimenStatus;
import org.hl7.fhir.StrandType;
import org.hl7.fhir.StructureDefinition;
import org.hl7.fhir.StructureDefinitionContext;
import org.hl7.fhir.StructureDefinitionDifferential;
import org.hl7.fhir.StructureDefinitionKind;
import org.hl7.fhir.StructureDefinitionMapping;
import org.hl7.fhir.StructureDefinitionSnapshot;
import org.hl7.fhir.StructureMap;
import org.hl7.fhir.StructureMapConst;
import org.hl7.fhir.StructureMapDependent;
import org.hl7.fhir.StructureMapGroup;
import org.hl7.fhir.StructureMapGroupTypeMode;
import org.hl7.fhir.StructureMapInput;
import org.hl7.fhir.StructureMapInputMode;
import org.hl7.fhir.StructureMapModelMode;
import org.hl7.fhir.StructureMapParameter;
import org.hl7.fhir.StructureMapRule;
import org.hl7.fhir.StructureMapSource;
import org.hl7.fhir.StructureMapSourceListMode;
import org.hl7.fhir.StructureMapStructure;
import org.hl7.fhir.StructureMapTarget;
import org.hl7.fhir.StructureMapTargetListMode;
import org.hl7.fhir.StructureMapTransform;
import org.hl7.fhir.SubmitDataUpdateType;
import org.hl7.fhir.Subscription;
import org.hl7.fhir.SubscriptionFilterBy;
import org.hl7.fhir.SubscriptionNotificationType;
import org.hl7.fhir.SubscriptionParameter;
import org.hl7.fhir.SubscriptionPayloadContent;
import org.hl7.fhir.SubscriptionStatus;
import org.hl7.fhir.SubscriptionStatusCodes;
import org.hl7.fhir.SubscriptionStatusNotificationEvent;
import org.hl7.fhir.SubscriptionTopic;
import org.hl7.fhir.SubscriptionTopicCanFilterBy;
import org.hl7.fhir.SubscriptionTopicEventTrigger;
import org.hl7.fhir.SubscriptionTopicNotificationShape;
import org.hl7.fhir.SubscriptionTopicQueryCriteria;
import org.hl7.fhir.SubscriptionTopicResourceTrigger;
import org.hl7.fhir.Substance;
import org.hl7.fhir.SubstanceDefinition;
import org.hl7.fhir.SubstanceDefinitionCharacterization;
import org.hl7.fhir.SubstanceDefinitionCode;
import org.hl7.fhir.SubstanceDefinitionMoiety;
import org.hl7.fhir.SubstanceDefinitionMolecularWeight;
import org.hl7.fhir.SubstanceDefinitionName;
import org.hl7.fhir.SubstanceDefinitionOfficial;
import org.hl7.fhir.SubstanceDefinitionProperty;
import org.hl7.fhir.SubstanceDefinitionRelationship;
import org.hl7.fhir.SubstanceDefinitionRepresentation;
import org.hl7.fhir.SubstanceDefinitionSourceMaterial;
import org.hl7.fhir.SubstanceDefinitionStructure;
import org.hl7.fhir.SubstanceIngredient;
import org.hl7.fhir.SubstanceNucleicAcid;
import org.hl7.fhir.SubstanceNucleicAcidLinkage;
import org.hl7.fhir.SubstanceNucleicAcidSubunit;
import org.hl7.fhir.SubstanceNucleicAcidSugar;
import org.hl7.fhir.SubstancePolymer;
import org.hl7.fhir.SubstancePolymerDegreeOfPolymerisation;
import org.hl7.fhir.SubstancePolymerMonomerSet;
import org.hl7.fhir.SubstancePolymerRepeat;
import org.hl7.fhir.SubstancePolymerRepeatUnit;
import org.hl7.fhir.SubstancePolymerStartingMaterial;
import org.hl7.fhir.SubstancePolymerStructuralRepresentation;
import org.hl7.fhir.SubstanceProtein;
import org.hl7.fhir.SubstanceProteinSubunit;
import org.hl7.fhir.SubstanceReferenceInformation;
import org.hl7.fhir.SubstanceReferenceInformationGene;
import org.hl7.fhir.SubstanceReferenceInformationGeneElement;
import org.hl7.fhir.SubstanceReferenceInformationTarget;
import org.hl7.fhir.SubstanceSourceMaterial;
import org.hl7.fhir.SubstanceSourceMaterialAuthor;
import org.hl7.fhir.SubstanceSourceMaterialFractionDescription;
import org.hl7.fhir.SubstanceSourceMaterialHybrid;
import org.hl7.fhir.SubstanceSourceMaterialOrganism;
import org.hl7.fhir.SubstanceSourceMaterialOrganismGeneral;
import org.hl7.fhir.SubstanceSourceMaterialPartDescription;
import org.hl7.fhir.SupplyDelivery;
import org.hl7.fhir.SupplyDeliveryStatus;
import org.hl7.fhir.SupplyDeliverySuppliedItem;
import org.hl7.fhir.SupplyRequest;
import org.hl7.fhir.SupplyRequestParameter;
import org.hl7.fhir.SupplyRequestStatus;
import org.hl7.fhir.SystemRestfulInteraction;
import org.hl7.fhir.Task;
import org.hl7.fhir.TaskInput;
import org.hl7.fhir.TaskIntent;
import org.hl7.fhir.TaskOutput;
import org.hl7.fhir.TaskPerformer;
import org.hl7.fhir.TaskRestriction;
import org.hl7.fhir.TaskStatus;
import org.hl7.fhir.TerminologyCapabilities;
import org.hl7.fhir.TerminologyCapabilitiesClosure;
import org.hl7.fhir.TerminologyCapabilitiesCodeSystem;
import org.hl7.fhir.TerminologyCapabilitiesExpansion;
import org.hl7.fhir.TerminologyCapabilitiesFilter;
import org.hl7.fhir.TerminologyCapabilitiesImplementation;
import org.hl7.fhir.TerminologyCapabilitiesParameter;
import org.hl7.fhir.TerminologyCapabilitiesSoftware;
import org.hl7.fhir.TerminologyCapabilitiesTranslation;
import org.hl7.fhir.TerminologyCapabilitiesValidateCode;
import org.hl7.fhir.TerminologyCapabilitiesVersion;
import org.hl7.fhir.TestPlan;
import org.hl7.fhir.TestPlanAssertion;
import org.hl7.fhir.TestPlanDependency;
import org.hl7.fhir.TestPlanDependency1;
import org.hl7.fhir.TestPlanScript;
import org.hl7.fhir.TestPlanTestCase;
import org.hl7.fhir.TestPlanTestData;
import org.hl7.fhir.TestPlanTestRun;
import org.hl7.fhir.TestReport;
import org.hl7.fhir.TestReportAction;
import org.hl7.fhir.TestReportAction1;
import org.hl7.fhir.TestReportAction2;
import org.hl7.fhir.TestReportActionResult;
import org.hl7.fhir.TestReportAssert;
import org.hl7.fhir.TestReportOperation;
import org.hl7.fhir.TestReportParticipant;
import org.hl7.fhir.TestReportParticipantType;
import org.hl7.fhir.TestReportRequirement;
import org.hl7.fhir.TestReportResult;
import org.hl7.fhir.TestReportSetup;
import org.hl7.fhir.TestReportStatus;
import org.hl7.fhir.TestReportTeardown;
import org.hl7.fhir.TestReportTest;
import org.hl7.fhir.TestScript;
import org.hl7.fhir.TestScriptAction;
import org.hl7.fhir.TestScriptAction1;
import org.hl7.fhir.TestScriptAction2;
import org.hl7.fhir.TestScriptAssert;
import org.hl7.fhir.TestScriptCapability;
import org.hl7.fhir.TestScriptDestination;
import org.hl7.fhir.TestScriptFixture;
import org.hl7.fhir.TestScriptLink;
import org.hl7.fhir.TestScriptMetadata;
import org.hl7.fhir.TestScriptOperation;
import org.hl7.fhir.TestScriptOrigin;
import org.hl7.fhir.TestScriptRequestHeader;
import org.hl7.fhir.TestScriptRequestMethodCode;
import org.hl7.fhir.TestScriptRequirement;
import org.hl7.fhir.TestScriptScope;
import org.hl7.fhir.TestScriptSetup;
import org.hl7.fhir.TestScriptTeardown;
import org.hl7.fhir.TestScriptTest;
import org.hl7.fhir.TestScriptVariable;
import org.hl7.fhir.Time;
import org.hl7.fhir.Timing;
import org.hl7.fhir.TimingRepeat;
import org.hl7.fhir.Transport;
import org.hl7.fhir.TransportInput;
import org.hl7.fhir.TransportIntent;
import org.hl7.fhir.TransportOutput;
import org.hl7.fhir.TransportRestriction;
import org.hl7.fhir.TransportStatus;
import org.hl7.fhir.TriggerDefinition;
import org.hl7.fhir.TriggerType;
import org.hl7.fhir.TriggeredBytype;
import org.hl7.fhir.TypeDerivationRule;
import org.hl7.fhir.TypeRestfulInteraction;
import org.hl7.fhir.UDIEntryType;
import org.hl7.fhir.UnitsOfTime;
import org.hl7.fhir.UnsignedInt;
import org.hl7.fhir.Uri;
import org.hl7.fhir.Url;
import org.hl7.fhir.UsageContext;
import org.hl7.fhir.Use;
import org.hl7.fhir.Uuid;
import org.hl7.fhir.ValueSet;
import org.hl7.fhir.ValueSetCompose;
import org.hl7.fhir.ValueSetConcept;
import org.hl7.fhir.ValueSetContains;
import org.hl7.fhir.ValueSetDesignation;
import org.hl7.fhir.ValueSetExpansion;
import org.hl7.fhir.ValueSetFilter;
import org.hl7.fhir.ValueSetInclude;
import org.hl7.fhir.ValueSetParameter;
import org.hl7.fhir.ValueSetProperty;
import org.hl7.fhir.ValueSetProperty1;
import org.hl7.fhir.ValueSetScope;
import org.hl7.fhir.ValueSetSubProperty;
import org.hl7.fhir.VerificationResult;
import org.hl7.fhir.VerificationResultAttestation;
import org.hl7.fhir.VerificationResultPrimarySource;
import org.hl7.fhir.VerificationResultStatus;
import org.hl7.fhir.VerificationResultValidator;
import org.hl7.fhir.VersionIndependentResourceTypesAll;
import org.hl7.fhir.VirtualServiceDetail;
import org.hl7.fhir.VisionBase;
import org.hl7.fhir.VisionEyes;
import org.hl7.fhir.VisionPrescription;
import org.hl7.fhir.VisionPrescriptionLensSpecification;
import org.hl7.fhir.VisionPrescriptionPrism;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage
 * @generated
 */
public class FhirAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FhirPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FhirPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FhirSwitch<Adapter> modelSwitch =
		new FhirSwitch<Adapter>() {
			@Override
			public Adapter caseAccount(Account object) {
				return createAccountAdapter();
			}
			@Override
			public Adapter caseAccountBalance(AccountBalance object) {
				return createAccountBalanceAdapter();
			}
			@Override
			public Adapter caseAccountCoverage(AccountCoverage object) {
				return createAccountCoverageAdapter();
			}
			@Override
			public Adapter caseAccountDiagnosis(AccountDiagnosis object) {
				return createAccountDiagnosisAdapter();
			}
			@Override
			public Adapter caseAccountGuarantor(AccountGuarantor object) {
				return createAccountGuarantorAdapter();
			}
			@Override
			public Adapter caseAccountProcedure(AccountProcedure object) {
				return createAccountProcedureAdapter();
			}
			@Override
			public Adapter caseAccountRelatedAccount(AccountRelatedAccount object) {
				return createAccountRelatedAccountAdapter();
			}
			@Override
			public Adapter caseAccountStatus(AccountStatus object) {
				return createAccountStatusAdapter();
			}
			@Override
			public Adapter caseActionCardinalityBehavior(ActionCardinalityBehavior object) {
				return createActionCardinalityBehaviorAdapter();
			}
			@Override
			public Adapter caseActionConditionKind(ActionConditionKind object) {
				return createActionConditionKindAdapter();
			}
			@Override
			public Adapter caseActionGroupingBehavior(ActionGroupingBehavior object) {
				return createActionGroupingBehaviorAdapter();
			}
			@Override
			public Adapter caseActionParticipantType(ActionParticipantType object) {
				return createActionParticipantTypeAdapter();
			}
			@Override
			public Adapter caseActionPrecheckBehavior(ActionPrecheckBehavior object) {
				return createActionPrecheckBehaviorAdapter();
			}
			@Override
			public Adapter caseActionRelationshipType(ActionRelationshipType object) {
				return createActionRelationshipTypeAdapter();
			}
			@Override
			public Adapter caseActionRequiredBehavior(ActionRequiredBehavior object) {
				return createActionRequiredBehaviorAdapter();
			}
			@Override
			public Adapter caseActionSelectionBehavior(ActionSelectionBehavior object) {
				return createActionSelectionBehaviorAdapter();
			}
			@Override
			public Adapter caseActivityDefinition(ActivityDefinition object) {
				return createActivityDefinitionAdapter();
			}
			@Override
			public Adapter caseActivityDefinitionDynamicValue(ActivityDefinitionDynamicValue object) {
				return createActivityDefinitionDynamicValueAdapter();
			}
			@Override
			public Adapter caseActivityDefinitionParticipant(ActivityDefinitionParticipant object) {
				return createActivityDefinitionParticipantAdapter();
			}
			@Override
			public Adapter caseActorDefinition(ActorDefinition object) {
				return createActorDefinitionAdapter();
			}
			@Override
			public Adapter caseAddress(Address object) {
				return createAddressAdapter();
			}
			@Override
			public Adapter caseAddressType(AddressType object) {
				return createAddressTypeAdapter();
			}
			@Override
			public Adapter caseAddressUse(AddressUse object) {
				return createAddressUseAdapter();
			}
			@Override
			public Adapter caseAdministrableProductDefinition(AdministrableProductDefinition object) {
				return createAdministrableProductDefinitionAdapter();
			}
			@Override
			public Adapter caseAdministrableProductDefinitionProperty(AdministrableProductDefinitionProperty object) {
				return createAdministrableProductDefinitionPropertyAdapter();
			}
			@Override
			public Adapter caseAdministrableProductDefinitionRouteOfAdministration(AdministrableProductDefinitionRouteOfAdministration object) {
				return createAdministrableProductDefinitionRouteOfAdministrationAdapter();
			}
			@Override
			public Adapter caseAdministrableProductDefinitionTargetSpecies(AdministrableProductDefinitionTargetSpecies object) {
				return createAdministrableProductDefinitionTargetSpeciesAdapter();
			}
			@Override
			public Adapter caseAdministrableProductDefinitionWithdrawalPeriod(AdministrableProductDefinitionWithdrawalPeriod object) {
				return createAdministrableProductDefinitionWithdrawalPeriodAdapter();
			}
			@Override
			public Adapter caseAdministrativeGender(AdministrativeGender object) {
				return createAdministrativeGenderAdapter();
			}
			@Override
			public Adapter caseAdverseEvent(AdverseEvent object) {
				return createAdverseEventAdapter();
			}
			@Override
			public Adapter caseAdverseEventActuality(AdverseEventActuality object) {
				return createAdverseEventActualityAdapter();
			}
			@Override
			public Adapter caseAdverseEventCausality(AdverseEventCausality object) {
				return createAdverseEventCausalityAdapter();
			}
			@Override
			public Adapter caseAdverseEventContributingFactor(AdverseEventContributingFactor object) {
				return createAdverseEventContributingFactorAdapter();
			}
			@Override
			public Adapter caseAdverseEventMitigatingAction(AdverseEventMitigatingAction object) {
				return createAdverseEventMitigatingActionAdapter();
			}
			@Override
			public Adapter caseAdverseEventParticipant(AdverseEventParticipant object) {
				return createAdverseEventParticipantAdapter();
			}
			@Override
			public Adapter caseAdverseEventPreventiveAction(AdverseEventPreventiveAction object) {
				return createAdverseEventPreventiveActionAdapter();
			}
			@Override
			public Adapter caseAdverseEventStatus(AdverseEventStatus object) {
				return createAdverseEventStatusAdapter();
			}
			@Override
			public Adapter caseAdverseEventSupportingInfo(AdverseEventSupportingInfo object) {
				return createAdverseEventSupportingInfoAdapter();
			}
			@Override
			public Adapter caseAdverseEventSuspectEntity(AdverseEventSuspectEntity object) {
				return createAdverseEventSuspectEntityAdapter();
			}
			@Override
			public Adapter caseAge(Age object) {
				return createAgeAdapter();
			}
			@Override
			public Adapter caseAgeUnits(AgeUnits object) {
				return createAgeUnitsAdapter();
			}
			@Override
			public Adapter caseAggregationMode(AggregationMode object) {
				return createAggregationModeAdapter();
			}
			@Override
			public Adapter caseAllergyIntolerance(AllergyIntolerance object) {
				return createAllergyIntoleranceAdapter();
			}
			@Override
			public Adapter caseAllergyIntoleranceCategory(AllergyIntoleranceCategory object) {
				return createAllergyIntoleranceCategoryAdapter();
			}
			@Override
			public Adapter caseAllergyIntoleranceCriticality(AllergyIntoleranceCriticality object) {
				return createAllergyIntoleranceCriticalityAdapter();
			}
			@Override
			public Adapter caseAllergyIntoleranceParticipant(AllergyIntoleranceParticipant object) {
				return createAllergyIntoleranceParticipantAdapter();
			}
			@Override
			public Adapter caseAllergyIntoleranceReaction(AllergyIntoleranceReaction object) {
				return createAllergyIntoleranceReactionAdapter();
			}
			@Override
			public Adapter caseAllergyIntoleranceSeverity(AllergyIntoleranceSeverity object) {
				return createAllergyIntoleranceSeverityAdapter();
			}
			@Override
			public Adapter caseAllResourceTypes(AllResourceTypes object) {
				return createAllResourceTypesAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseAppointment(Appointment object) {
				return createAppointmentAdapter();
			}
			@Override
			public Adapter caseAppointmentMonthlyTemplate(AppointmentMonthlyTemplate object) {
				return createAppointmentMonthlyTemplateAdapter();
			}
			@Override
			public Adapter caseAppointmentParticipant(AppointmentParticipant object) {
				return createAppointmentParticipantAdapter();
			}
			@Override
			public Adapter caseAppointmentRecurrenceTemplate(AppointmentRecurrenceTemplate object) {
				return createAppointmentRecurrenceTemplateAdapter();
			}
			@Override
			public Adapter caseAppointmentResponse(AppointmentResponse object) {
				return createAppointmentResponseAdapter();
			}
			@Override
			public Adapter caseAppointmentResponseStatus(AppointmentResponseStatus object) {
				return createAppointmentResponseStatusAdapter();
			}
			@Override
			public Adapter caseAppointmentStatus(AppointmentStatus object) {
				return createAppointmentStatusAdapter();
			}
			@Override
			public Adapter caseAppointmentWeeklyTemplate(AppointmentWeeklyTemplate object) {
				return createAppointmentWeeklyTemplateAdapter();
			}
			@Override
			public Adapter caseAppointmentYearlyTemplate(AppointmentYearlyTemplate object) {
				return createAppointmentYearlyTemplateAdapter();
			}
			@Override
			public Adapter caseArtifactAssessment(ArtifactAssessment object) {
				return createArtifactAssessmentAdapter();
			}
			@Override
			public Adapter caseArtifactAssessmentContent(ArtifactAssessmentContent object) {
				return createArtifactAssessmentContentAdapter();
			}
			@Override
			public Adapter caseArtifactAssessmentDisposition(ArtifactAssessmentDisposition object) {
				return createArtifactAssessmentDispositionAdapter();
			}
			@Override
			public Adapter caseArtifactAssessmentInformationType(ArtifactAssessmentInformationType object) {
				return createArtifactAssessmentInformationTypeAdapter();
			}
			@Override
			public Adapter caseArtifactAssessmentWorkflowStatus(ArtifactAssessmentWorkflowStatus object) {
				return createArtifactAssessmentWorkflowStatusAdapter();
			}
			@Override
			public Adapter caseAssertionDirectionType(AssertionDirectionType object) {
				return createAssertionDirectionTypeAdapter();
			}
			@Override
			public Adapter caseAssertionManualCompletionType(AssertionManualCompletionType object) {
				return createAssertionManualCompletionTypeAdapter();
			}
			@Override
			public Adapter caseAssertionOperatorType(AssertionOperatorType object) {
				return createAssertionOperatorTypeAdapter();
			}
			@Override
			public Adapter caseAssertionResponseTypes(AssertionResponseTypes object) {
				return createAssertionResponseTypesAdapter();
			}
			@Override
			public Adapter caseAttachment(Attachment object) {
				return createAttachmentAdapter();
			}
			@Override
			public Adapter caseAuditEvent(AuditEvent object) {
				return createAuditEventAdapter();
			}
			@Override
			public Adapter caseAuditEventAction(AuditEventAction object) {
				return createAuditEventActionAdapter();
			}
			@Override
			public Adapter caseAuditEventAgent(AuditEventAgent object) {
				return createAuditEventAgentAdapter();
			}
			@Override
			public Adapter caseAuditEventDetail(AuditEventDetail object) {
				return createAuditEventDetailAdapter();
			}
			@Override
			public Adapter caseAuditEventEntity(AuditEventEntity object) {
				return createAuditEventEntityAdapter();
			}
			@Override
			public Adapter caseAuditEventOutcome(AuditEventOutcome object) {
				return createAuditEventOutcomeAdapter();
			}
			@Override
			public Adapter caseAuditEventSeverity(AuditEventSeverity object) {
				return createAuditEventSeverityAdapter();
			}
			@Override
			public Adapter caseAuditEventSource(AuditEventSource object) {
				return createAuditEventSourceAdapter();
			}
			@Override
			public Adapter caseAvailability(Availability object) {
				return createAvailabilityAdapter();
			}
			@Override
			public Adapter caseAvailabilityAvailableTime(AvailabilityAvailableTime object) {
				return createAvailabilityAvailableTimeAdapter();
			}
			@Override
			public Adapter caseAvailabilityNotAvailableTime(AvailabilityNotAvailableTime object) {
				return createAvailabilityNotAvailableTimeAdapter();
			}
			@Override
			public Adapter caseBackboneElement(BackboneElement object) {
				return createBackboneElementAdapter();
			}
			@Override
			public Adapter caseBackboneType(BackboneType object) {
				return createBackboneTypeAdapter();
			}
			@Override
			public Adapter caseBase(Base object) {
				return createBaseAdapter();
			}
			@Override
			public Adapter caseBase64Binary(Base64Binary object) {
				return createBase64BinaryAdapter();
			}
			@Override
			public Adapter caseBasic(Basic object) {
				return createBasicAdapter();
			}
			@Override
			public Adapter caseBinary(Binary object) {
				return createBinaryAdapter();
			}
			@Override
			public Adapter caseBindingStrength(BindingStrength object) {
				return createBindingStrengthAdapter();
			}
			@Override
			public Adapter caseBiologicallyDerivedProduct(BiologicallyDerivedProduct object) {
				return createBiologicallyDerivedProductAdapter();
			}
			@Override
			public Adapter caseBiologicallyDerivedProductCollection(BiologicallyDerivedProductCollection object) {
				return createBiologicallyDerivedProductCollectionAdapter();
			}
			@Override
			public Adapter caseBiologicallyDerivedProductDispense(BiologicallyDerivedProductDispense object) {
				return createBiologicallyDerivedProductDispenseAdapter();
			}
			@Override
			public Adapter caseBiologicallyDerivedProductDispenseCodes(BiologicallyDerivedProductDispenseCodes object) {
				return createBiologicallyDerivedProductDispenseCodesAdapter();
			}
			@Override
			public Adapter caseBiologicallyDerivedProductDispensePerformer(BiologicallyDerivedProductDispensePerformer object) {
				return createBiologicallyDerivedProductDispensePerformerAdapter();
			}
			@Override
			public Adapter caseBiologicallyDerivedProductProperty(BiologicallyDerivedProductProperty object) {
				return createBiologicallyDerivedProductPropertyAdapter();
			}
			@Override
			public Adapter caseBodyStructure(BodyStructure object) {
				return createBodyStructureAdapter();
			}
			@Override
			public Adapter caseBodyStructureBodyLandmarkOrientation(BodyStructureBodyLandmarkOrientation object) {
				return createBodyStructureBodyLandmarkOrientationAdapter();
			}
			@Override
			public Adapter caseBodyStructureDistanceFromLandmark(BodyStructureDistanceFromLandmark object) {
				return createBodyStructureDistanceFromLandmarkAdapter();
			}
			@Override
			public Adapter caseBodyStructureIncludedStructure(BodyStructureIncludedStructure object) {
				return createBodyStructureIncludedStructureAdapter();
			}
			@Override
			public Adapter caseBoolean(org.hl7.fhir.Boolean object) {
				return createBooleanAdapter();
			}
			@Override
			public Adapter caseBundle(Bundle object) {
				return createBundleAdapter();
			}
			@Override
			public Adapter caseBundleEntry(BundleEntry object) {
				return createBundleEntryAdapter();
			}
			@Override
			public Adapter caseBundleLink(BundleLink object) {
				return createBundleLinkAdapter();
			}
			@Override
			public Adapter caseBundleRequest(BundleRequest object) {
				return createBundleRequestAdapter();
			}
			@Override
			public Adapter caseBundleResponse(BundleResponse object) {
				return createBundleResponseAdapter();
			}
			@Override
			public Adapter caseBundleSearch(BundleSearch object) {
				return createBundleSearchAdapter();
			}
			@Override
			public Adapter caseBundleType(BundleType object) {
				return createBundleTypeAdapter();
			}
			@Override
			public Adapter caseCanonical(Canonical object) {
				return createCanonicalAdapter();
			}
			@Override
			public Adapter caseCanonicalResource(CanonicalResource object) {
				return createCanonicalResourceAdapter();
			}
			@Override
			public Adapter caseCapabilityStatement(CapabilityStatement object) {
				return createCapabilityStatementAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementDocument(CapabilityStatementDocument object) {
				return createCapabilityStatementDocumentAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementEndpoint(CapabilityStatementEndpoint object) {
				return createCapabilityStatementEndpointAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementImplementation(CapabilityStatementImplementation object) {
				return createCapabilityStatementImplementationAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementInteraction(CapabilityStatementInteraction object) {
				return createCapabilityStatementInteractionAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementInteraction1(CapabilityStatementInteraction1 object) {
				return createCapabilityStatementInteraction1Adapter();
			}
			@Override
			public Adapter caseCapabilityStatementKind(CapabilityStatementKind object) {
				return createCapabilityStatementKindAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementMessaging(CapabilityStatementMessaging object) {
				return createCapabilityStatementMessagingAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementOperation(CapabilityStatementOperation object) {
				return createCapabilityStatementOperationAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementResource(CapabilityStatementResource object) {
				return createCapabilityStatementResourceAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementRest(CapabilityStatementRest object) {
				return createCapabilityStatementRestAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementSearchParam(CapabilityStatementSearchParam object) {
				return createCapabilityStatementSearchParamAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementSecurity(CapabilityStatementSecurity object) {
				return createCapabilityStatementSecurityAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementSoftware(CapabilityStatementSoftware object) {
				return createCapabilityStatementSoftwareAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementSupportedMessage(CapabilityStatementSupportedMessage object) {
				return createCapabilityStatementSupportedMessageAdapter();
			}
			@Override
			public Adapter caseCarePlan(CarePlan object) {
				return createCarePlanAdapter();
			}
			@Override
			public Adapter caseCarePlanActivity(CarePlanActivity object) {
				return createCarePlanActivityAdapter();
			}
			@Override
			public Adapter caseCarePlanIntent(CarePlanIntent object) {
				return createCarePlanIntentAdapter();
			}
			@Override
			public Adapter caseCareTeam(CareTeam object) {
				return createCareTeamAdapter();
			}
			@Override
			public Adapter caseCareTeamParticipant(CareTeamParticipant object) {
				return createCareTeamParticipantAdapter();
			}
			@Override
			public Adapter caseCareTeamStatus(CareTeamStatus object) {
				return createCareTeamStatusAdapter();
			}
			@Override
			public Adapter caseCharacteristicCombination(CharacteristicCombination object) {
				return createCharacteristicCombinationAdapter();
			}
			@Override
			public Adapter caseChargeItem(ChargeItem object) {
				return createChargeItemAdapter();
			}
			@Override
			public Adapter caseChargeItemDefinition(ChargeItemDefinition object) {
				return createChargeItemDefinitionAdapter();
			}
			@Override
			public Adapter caseChargeItemDefinitionApplicability(ChargeItemDefinitionApplicability object) {
				return createChargeItemDefinitionApplicabilityAdapter();
			}
			@Override
			public Adapter caseChargeItemDefinitionPropertyGroup(ChargeItemDefinitionPropertyGroup object) {
				return createChargeItemDefinitionPropertyGroupAdapter();
			}
			@Override
			public Adapter caseChargeItemPerformer(ChargeItemPerformer object) {
				return createChargeItemPerformerAdapter();
			}
			@Override
			public Adapter caseChargeItemStatus(ChargeItemStatus object) {
				return createChargeItemStatusAdapter();
			}
			@Override
			public Adapter caseCitation(Citation object) {
				return createCitationAdapter();
			}
			@Override
			public Adapter caseCitationAbstract(CitationAbstract object) {
				return createCitationAbstractAdapter();
			}
			@Override
			public Adapter caseCitationCitedArtifact(CitationCitedArtifact object) {
				return createCitationCitedArtifactAdapter();
			}
			@Override
			public Adapter caseCitationClassification(CitationClassification object) {
				return createCitationClassificationAdapter();
			}
			@Override
			public Adapter caseCitationClassification1(CitationClassification1 object) {
				return createCitationClassification1Adapter();
			}
			@Override
			public Adapter caseCitationContributionInstance(CitationContributionInstance object) {
				return createCitationContributionInstanceAdapter();
			}
			@Override
			public Adapter caseCitationContributorship(CitationContributorship object) {
				return createCitationContributorshipAdapter();
			}
			@Override
			public Adapter caseCitationEntry(CitationEntry object) {
				return createCitationEntryAdapter();
			}
			@Override
			public Adapter caseCitationPart(CitationPart object) {
				return createCitationPartAdapter();
			}
			@Override
			public Adapter caseCitationPublicationForm(CitationPublicationForm object) {
				return createCitationPublicationFormAdapter();
			}
			@Override
			public Adapter caseCitationPublishedIn(CitationPublishedIn object) {
				return createCitationPublishedInAdapter();
			}
			@Override
			public Adapter caseCitationRelatesTo(CitationRelatesTo object) {
				return createCitationRelatesToAdapter();
			}
			@Override
			public Adapter caseCitationStatusDate(CitationStatusDate object) {
				return createCitationStatusDateAdapter();
			}
			@Override
			public Adapter caseCitationStatusDate1(CitationStatusDate1 object) {
				return createCitationStatusDate1Adapter();
			}
			@Override
			public Adapter caseCitationSummary(CitationSummary object) {
				return createCitationSummaryAdapter();
			}
			@Override
			public Adapter caseCitationSummary1(CitationSummary1 object) {
				return createCitationSummary1Adapter();
			}
			@Override
			public Adapter caseCitationTitle(CitationTitle object) {
				return createCitationTitleAdapter();
			}
			@Override
			public Adapter caseCitationVersion(CitationVersion object) {
				return createCitationVersionAdapter();
			}
			@Override
			public Adapter caseCitationWebLocation(CitationWebLocation object) {
				return createCitationWebLocationAdapter();
			}
			@Override
			public Adapter caseClaim(Claim object) {
				return createClaimAdapter();
			}
			@Override
			public Adapter caseClaimAccident(ClaimAccident object) {
				return createClaimAccidentAdapter();
			}
			@Override
			public Adapter caseClaimBodySite(ClaimBodySite object) {
				return createClaimBodySiteAdapter();
			}
			@Override
			public Adapter caseClaimCareTeam(ClaimCareTeam object) {
				return createClaimCareTeamAdapter();
			}
			@Override
			public Adapter caseClaimDetail(ClaimDetail object) {
				return createClaimDetailAdapter();
			}
			@Override
			public Adapter caseClaimDiagnosis(ClaimDiagnosis object) {
				return createClaimDiagnosisAdapter();
			}
			@Override
			public Adapter caseClaimEvent(ClaimEvent object) {
				return createClaimEventAdapter();
			}
			@Override
			public Adapter caseClaimInsurance(ClaimInsurance object) {
				return createClaimInsuranceAdapter();
			}
			@Override
			public Adapter caseClaimItem(ClaimItem object) {
				return createClaimItemAdapter();
			}
			@Override
			public Adapter caseClaimPayee(ClaimPayee object) {
				return createClaimPayeeAdapter();
			}
			@Override
			public Adapter caseClaimProcedure(ClaimProcedure object) {
				return createClaimProcedureAdapter();
			}
			@Override
			public Adapter caseClaimProcessingCodes(ClaimProcessingCodes object) {
				return createClaimProcessingCodesAdapter();
			}
			@Override
			public Adapter caseClaimRelated(ClaimRelated object) {
				return createClaimRelatedAdapter();
			}
			@Override
			public Adapter caseClaimResponse(ClaimResponse object) {
				return createClaimResponseAdapter();
			}
			@Override
			public Adapter caseClaimResponseAddItem(ClaimResponseAddItem object) {
				return createClaimResponseAddItemAdapter();
			}
			@Override
			public Adapter caseClaimResponseAdjudication(ClaimResponseAdjudication object) {
				return createClaimResponseAdjudicationAdapter();
			}
			@Override
			public Adapter caseClaimResponseBodySite(ClaimResponseBodySite object) {
				return createClaimResponseBodySiteAdapter();
			}
			@Override
			public Adapter caseClaimResponseDetail(ClaimResponseDetail object) {
				return createClaimResponseDetailAdapter();
			}
			@Override
			public Adapter caseClaimResponseDetail1(ClaimResponseDetail1 object) {
				return createClaimResponseDetail1Adapter();
			}
			@Override
			public Adapter caseClaimResponseError(ClaimResponseError object) {
				return createClaimResponseErrorAdapter();
			}
			@Override
			public Adapter caseClaimResponseEvent(ClaimResponseEvent object) {
				return createClaimResponseEventAdapter();
			}
			@Override
			public Adapter caseClaimResponseInsurance(ClaimResponseInsurance object) {
				return createClaimResponseInsuranceAdapter();
			}
			@Override
			public Adapter caseClaimResponseItem(ClaimResponseItem object) {
				return createClaimResponseItemAdapter();
			}
			@Override
			public Adapter caseClaimResponsePayment(ClaimResponsePayment object) {
				return createClaimResponsePaymentAdapter();
			}
			@Override
			public Adapter caseClaimResponseProcessNote(ClaimResponseProcessNote object) {
				return createClaimResponseProcessNoteAdapter();
			}
			@Override
			public Adapter caseClaimResponseReviewOutcome(ClaimResponseReviewOutcome object) {
				return createClaimResponseReviewOutcomeAdapter();
			}
			@Override
			public Adapter caseClaimResponseSubDetail(ClaimResponseSubDetail object) {
				return createClaimResponseSubDetailAdapter();
			}
			@Override
			public Adapter caseClaimResponseSubDetail1(ClaimResponseSubDetail1 object) {
				return createClaimResponseSubDetail1Adapter();
			}
			@Override
			public Adapter caseClaimResponseTotal(ClaimResponseTotal object) {
				return createClaimResponseTotalAdapter();
			}
			@Override
			public Adapter caseClaimSubDetail(ClaimSubDetail object) {
				return createClaimSubDetailAdapter();
			}
			@Override
			public Adapter caseClaimSupportingInfo(ClaimSupportingInfo object) {
				return createClaimSupportingInfoAdapter();
			}
			@Override
			public Adapter caseClinicalImpression(ClinicalImpression object) {
				return createClinicalImpressionAdapter();
			}
			@Override
			public Adapter caseClinicalImpressionFinding(ClinicalImpressionFinding object) {
				return createClinicalImpressionFindingAdapter();
			}
			@Override
			public Adapter caseClinicalUseDefinition(ClinicalUseDefinition object) {
				return createClinicalUseDefinitionAdapter();
			}
			@Override
			public Adapter caseClinicalUseDefinitionContraindication(ClinicalUseDefinitionContraindication object) {
				return createClinicalUseDefinitionContraindicationAdapter();
			}
			@Override
			public Adapter caseClinicalUseDefinitionIndication(ClinicalUseDefinitionIndication object) {
				return createClinicalUseDefinitionIndicationAdapter();
			}
			@Override
			public Adapter caseClinicalUseDefinitionInteractant(ClinicalUseDefinitionInteractant object) {
				return createClinicalUseDefinitionInteractantAdapter();
			}
			@Override
			public Adapter caseClinicalUseDefinitionInteraction(ClinicalUseDefinitionInteraction object) {
				return createClinicalUseDefinitionInteractionAdapter();
			}
			@Override
			public Adapter caseClinicalUseDefinitionOtherTherapy(ClinicalUseDefinitionOtherTherapy object) {
				return createClinicalUseDefinitionOtherTherapyAdapter();
			}
			@Override
			public Adapter caseClinicalUseDefinitionType(ClinicalUseDefinitionType object) {
				return createClinicalUseDefinitionTypeAdapter();
			}
			@Override
			public Adapter caseClinicalUseDefinitionUndesirableEffect(ClinicalUseDefinitionUndesirableEffect object) {
				return createClinicalUseDefinitionUndesirableEffectAdapter();
			}
			@Override
			public Adapter caseClinicalUseDefinitionWarning(ClinicalUseDefinitionWarning object) {
				return createClinicalUseDefinitionWarningAdapter();
			}
			@Override
			public Adapter caseCode(Code object) {
				return createCodeAdapter();
			}
			@Override
			public Adapter caseCodeableConcept(CodeableConcept object) {
				return createCodeableConceptAdapter();
			}
			@Override
			public Adapter caseCodeableReference(CodeableReference object) {
				return createCodeableReferenceAdapter();
			}
			@Override
			public Adapter caseCodeSearchSupport(CodeSearchSupport object) {
				return createCodeSearchSupportAdapter();
			}
			@Override
			public Adapter caseCodeSystem(CodeSystem object) {
				return createCodeSystemAdapter();
			}
			@Override
			public Adapter caseCodeSystemConcept(CodeSystemConcept object) {
				return createCodeSystemConceptAdapter();
			}
			@Override
			public Adapter caseCodeSystemContentMode(CodeSystemContentMode object) {
				return createCodeSystemContentModeAdapter();
			}
			@Override
			public Adapter caseCodeSystemDesignation(CodeSystemDesignation object) {
				return createCodeSystemDesignationAdapter();
			}
			@Override
			public Adapter caseCodeSystemFilter(CodeSystemFilter object) {
				return createCodeSystemFilterAdapter();
			}
			@Override
			public Adapter caseCodeSystemHierarchyMeaning(CodeSystemHierarchyMeaning object) {
				return createCodeSystemHierarchyMeaningAdapter();
			}
			@Override
			public Adapter caseCodeSystemProperty(CodeSystemProperty object) {
				return createCodeSystemPropertyAdapter();
			}
			@Override
			public Adapter caseCodeSystemProperty1(CodeSystemProperty1 object) {
				return createCodeSystemProperty1Adapter();
			}
			@Override
			public Adapter caseCoding(Coding object) {
				return createCodingAdapter();
			}
			@Override
			public Adapter caseColorCodesOrRGB(ColorCodesOrRGB object) {
				return createColorCodesOrRGBAdapter();
			}
			@Override
			public Adapter caseCommonLanguages(CommonLanguages object) {
				return createCommonLanguagesAdapter();
			}
			@Override
			public Adapter caseCommunication(Communication object) {
				return createCommunicationAdapter();
			}
			@Override
			public Adapter caseCommunicationPayload(CommunicationPayload object) {
				return createCommunicationPayloadAdapter();
			}
			@Override
			public Adapter caseCommunicationRequest(CommunicationRequest object) {
				return createCommunicationRequestAdapter();
			}
			@Override
			public Adapter caseCommunicationRequestPayload(CommunicationRequestPayload object) {
				return createCommunicationRequestPayloadAdapter();
			}
			@Override
			public Adapter caseCompartmentDefinition(CompartmentDefinition object) {
				return createCompartmentDefinitionAdapter();
			}
			@Override
			public Adapter caseCompartmentDefinitionResource(CompartmentDefinitionResource object) {
				return createCompartmentDefinitionResourceAdapter();
			}
			@Override
			public Adapter caseCompartmentType(CompartmentType object) {
				return createCompartmentTypeAdapter();
			}
			@Override
			public Adapter caseComposition(Composition object) {
				return createCompositionAdapter();
			}
			@Override
			public Adapter caseCompositionAttester(CompositionAttester object) {
				return createCompositionAttesterAdapter();
			}
			@Override
			public Adapter caseCompositionEvent(CompositionEvent object) {
				return createCompositionEventAdapter();
			}
			@Override
			public Adapter caseCompositionSection(CompositionSection object) {
				return createCompositionSectionAdapter();
			}
			@Override
			public Adapter caseCompositionStatus(CompositionStatus object) {
				return createCompositionStatusAdapter();
			}
			@Override
			public Adapter caseConceptMap(ConceptMap object) {
				return createConceptMapAdapter();
			}
			@Override
			public Adapter caseConceptMapAdditionalAttribute(ConceptMapAdditionalAttribute object) {
				return createConceptMapAdditionalAttributeAdapter();
			}
			@Override
			public Adapter caseConceptMapAttributeType(ConceptMapAttributeType object) {
				return createConceptMapAttributeTypeAdapter();
			}
			@Override
			public Adapter caseConceptMapDependsOn(ConceptMapDependsOn object) {
				return createConceptMapDependsOnAdapter();
			}
			@Override
			public Adapter caseConceptMapElement(ConceptMapElement object) {
				return createConceptMapElementAdapter();
			}
			@Override
			public Adapter caseConceptMapGroup(ConceptMapGroup object) {
				return createConceptMapGroupAdapter();
			}
			@Override
			public Adapter caseConceptMapGroupUnmappedMode(ConceptMapGroupUnmappedMode object) {
				return createConceptMapGroupUnmappedModeAdapter();
			}
			@Override
			public Adapter caseConceptMapProperty(ConceptMapProperty object) {
				return createConceptMapPropertyAdapter();
			}
			@Override
			public Adapter caseConceptMapProperty1(ConceptMapProperty1 object) {
				return createConceptMapProperty1Adapter();
			}
			@Override
			public Adapter caseConceptMapPropertyType(ConceptMapPropertyType object) {
				return createConceptMapPropertyTypeAdapter();
			}
			@Override
			public Adapter caseConceptMapRelationship(ConceptMapRelationship object) {
				return createConceptMapRelationshipAdapter();
			}
			@Override
			public Adapter caseConceptMapTarget(ConceptMapTarget object) {
				return createConceptMapTargetAdapter();
			}
			@Override
			public Adapter caseConceptMapUnmapped(ConceptMapUnmapped object) {
				return createConceptMapUnmappedAdapter();
			}
			@Override
			public Adapter caseConcreteFHIRTypes(ConcreteFHIRTypes object) {
				return createConcreteFHIRTypesAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseConditionalDeleteStatus(ConditionalDeleteStatus object) {
				return createConditionalDeleteStatusAdapter();
			}
			@Override
			public Adapter caseConditionalReadStatus(ConditionalReadStatus object) {
				return createConditionalReadStatusAdapter();
			}
			@Override
			public Adapter caseConditionDefinition(ConditionDefinition object) {
				return createConditionDefinitionAdapter();
			}
			@Override
			public Adapter caseConditionDefinitionMedication(ConditionDefinitionMedication object) {
				return createConditionDefinitionMedicationAdapter();
			}
			@Override
			public Adapter caseConditionDefinitionObservation(ConditionDefinitionObservation object) {
				return createConditionDefinitionObservationAdapter();
			}
			@Override
			public Adapter caseConditionDefinitionPlan(ConditionDefinitionPlan object) {
				return createConditionDefinitionPlanAdapter();
			}
			@Override
			public Adapter caseConditionDefinitionPrecondition(ConditionDefinitionPrecondition object) {
				return createConditionDefinitionPreconditionAdapter();
			}
			@Override
			public Adapter caseConditionDefinitionQuestionnaire(ConditionDefinitionQuestionnaire object) {
				return createConditionDefinitionQuestionnaireAdapter();
			}
			@Override
			public Adapter caseConditionParticipant(ConditionParticipant object) {
				return createConditionParticipantAdapter();
			}
			@Override
			public Adapter caseConditionPreconditionType(ConditionPreconditionType object) {
				return createConditionPreconditionTypeAdapter();
			}
			@Override
			public Adapter caseConditionQuestionnairePurpose(ConditionQuestionnairePurpose object) {
				return createConditionQuestionnairePurposeAdapter();
			}
			@Override
			public Adapter caseConditionStage(ConditionStage object) {
				return createConditionStageAdapter();
			}
			@Override
			public Adapter caseConformanceExpectation(ConformanceExpectation object) {
				return createConformanceExpectationAdapter();
			}
			@Override
			public Adapter caseConsent(Consent object) {
				return createConsentAdapter();
			}
			@Override
			public Adapter caseConsentActor(ConsentActor object) {
				return createConsentActorAdapter();
			}
			@Override
			public Adapter caseConsentData(ConsentData object) {
				return createConsentDataAdapter();
			}
			@Override
			public Adapter caseConsentDataMeaning(ConsentDataMeaning object) {
				return createConsentDataMeaningAdapter();
			}
			@Override
			public Adapter caseConsentPolicyBasis(ConsentPolicyBasis object) {
				return createConsentPolicyBasisAdapter();
			}
			@Override
			public Adapter caseConsentProvision(ConsentProvision object) {
				return createConsentProvisionAdapter();
			}
			@Override
			public Adapter caseConsentProvisionType(ConsentProvisionType object) {
				return createConsentProvisionTypeAdapter();
			}
			@Override
			public Adapter caseConsentState(ConsentState object) {
				return createConsentStateAdapter();
			}
			@Override
			public Adapter caseConsentVerification(ConsentVerification object) {
				return createConsentVerificationAdapter();
			}
			@Override
			public Adapter caseConstraintSeverity(ConstraintSeverity object) {
				return createConstraintSeverityAdapter();
			}
			@Override
			public Adapter caseContactDetail(ContactDetail object) {
				return createContactDetailAdapter();
			}
			@Override
			public Adapter caseContactPoint(ContactPoint object) {
				return createContactPointAdapter();
			}
			@Override
			public Adapter caseContactPointSystem(ContactPointSystem object) {
				return createContactPointSystemAdapter();
			}
			@Override
			public Adapter caseContactPointUse(ContactPointUse object) {
				return createContactPointUseAdapter();
			}
			@Override
			public Adapter caseContract(Contract object) {
				return createContractAdapter();
			}
			@Override
			public Adapter caseContractAction(ContractAction object) {
				return createContractActionAdapter();
			}
			@Override
			public Adapter caseContractAnswer(ContractAnswer object) {
				return createContractAnswerAdapter();
			}
			@Override
			public Adapter caseContractAsset(ContractAsset object) {
				return createContractAssetAdapter();
			}
			@Override
			public Adapter caseContractContentDefinition(ContractContentDefinition object) {
				return createContractContentDefinitionAdapter();
			}
			@Override
			public Adapter caseContractContext(ContractContext object) {
				return createContractContextAdapter();
			}
			@Override
			public Adapter caseContractFriendly(ContractFriendly object) {
				return createContractFriendlyAdapter();
			}
			@Override
			public Adapter caseContractLegal(ContractLegal object) {
				return createContractLegalAdapter();
			}
			@Override
			public Adapter caseContractOffer(ContractOffer object) {
				return createContractOfferAdapter();
			}
			@Override
			public Adapter caseContractParty(ContractParty object) {
				return createContractPartyAdapter();
			}
			@Override
			public Adapter caseContractResourcePublicationStatusCodes(ContractResourcePublicationStatusCodes object) {
				return createContractResourcePublicationStatusCodesAdapter();
			}
			@Override
			public Adapter caseContractResourceStatusCodes(ContractResourceStatusCodes object) {
				return createContractResourceStatusCodesAdapter();
			}
			@Override
			public Adapter caseContractRule(ContractRule object) {
				return createContractRuleAdapter();
			}
			@Override
			public Adapter caseContractSecurityLabel(ContractSecurityLabel object) {
				return createContractSecurityLabelAdapter();
			}
			@Override
			public Adapter caseContractSigner(ContractSigner object) {
				return createContractSignerAdapter();
			}
			@Override
			public Adapter caseContractSubject(ContractSubject object) {
				return createContractSubjectAdapter();
			}
			@Override
			public Adapter caseContractTerm(ContractTerm object) {
				return createContractTermAdapter();
			}
			@Override
			public Adapter caseContractValuedItem(ContractValuedItem object) {
				return createContractValuedItemAdapter();
			}
			@Override
			public Adapter caseContributor(Contributor object) {
				return createContributorAdapter();
			}
			@Override
			public Adapter caseContributorType(ContributorType object) {
				return createContributorTypeAdapter();
			}
			@Override
			public Adapter caseCount(Count object) {
				return createCountAdapter();
			}
			@Override
			public Adapter caseCoverage(Coverage object) {
				return createCoverageAdapter();
			}
			@Override
			public Adapter caseCoverageClass(CoverageClass object) {
				return createCoverageClassAdapter();
			}
			@Override
			public Adapter caseCoverageCostToBeneficiary(CoverageCostToBeneficiary object) {
				return createCoverageCostToBeneficiaryAdapter();
			}
			@Override
			public Adapter caseCoverageEligibilityRequest(CoverageEligibilityRequest object) {
				return createCoverageEligibilityRequestAdapter();
			}
			@Override
			public Adapter caseCoverageEligibilityRequestDiagnosis(CoverageEligibilityRequestDiagnosis object) {
				return createCoverageEligibilityRequestDiagnosisAdapter();
			}
			@Override
			public Adapter caseCoverageEligibilityRequestEvent(CoverageEligibilityRequestEvent object) {
				return createCoverageEligibilityRequestEventAdapter();
			}
			@Override
			public Adapter caseCoverageEligibilityRequestInsurance(CoverageEligibilityRequestInsurance object) {
				return createCoverageEligibilityRequestInsuranceAdapter();
			}
			@Override
			public Adapter caseCoverageEligibilityRequestItem(CoverageEligibilityRequestItem object) {
				return createCoverageEligibilityRequestItemAdapter();
			}
			@Override
			public Adapter caseCoverageEligibilityRequestSupportingInfo(CoverageEligibilityRequestSupportingInfo object) {
				return createCoverageEligibilityRequestSupportingInfoAdapter();
			}
			@Override
			public Adapter caseCoverageEligibilityResponse(CoverageEligibilityResponse object) {
				return createCoverageEligibilityResponseAdapter();
			}
			@Override
			public Adapter caseCoverageEligibilityResponseBenefit(CoverageEligibilityResponseBenefit object) {
				return createCoverageEligibilityResponseBenefitAdapter();
			}
			@Override
			public Adapter caseCoverageEligibilityResponseError(CoverageEligibilityResponseError object) {
				return createCoverageEligibilityResponseErrorAdapter();
			}
			@Override
			public Adapter caseCoverageEligibilityResponseEvent(CoverageEligibilityResponseEvent object) {
				return createCoverageEligibilityResponseEventAdapter();
			}
			@Override
			public Adapter caseCoverageEligibilityResponseInsurance(CoverageEligibilityResponseInsurance object) {
				return createCoverageEligibilityResponseInsuranceAdapter();
			}
			@Override
			public Adapter caseCoverageEligibilityResponseItem(CoverageEligibilityResponseItem object) {
				return createCoverageEligibilityResponseItemAdapter();
			}
			@Override
			public Adapter caseCoverageException(CoverageException object) {
				return createCoverageExceptionAdapter();
			}
			@Override
			public Adapter caseCoveragePaymentBy(CoveragePaymentBy object) {
				return createCoveragePaymentByAdapter();
			}
			@Override
			public Adapter caseCriteriaNotExistsBehavior(CriteriaNotExistsBehavior object) {
				return createCriteriaNotExistsBehaviorAdapter();
			}
			@Override
			public Adapter caseDataRequirement(DataRequirement object) {
				return createDataRequirementAdapter();
			}
			@Override
			public Adapter caseDataRequirementCodeFilter(DataRequirementCodeFilter object) {
				return createDataRequirementCodeFilterAdapter();
			}
			@Override
			public Adapter caseDataRequirementDateFilter(DataRequirementDateFilter object) {
				return createDataRequirementDateFilterAdapter();
			}
			@Override
			public Adapter caseDataRequirementSort(DataRequirementSort object) {
				return createDataRequirementSortAdapter();
			}
			@Override
			public Adapter caseDataRequirementValueFilter(DataRequirementValueFilter object) {
				return createDataRequirementValueFilterAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseDate(Date object) {
				return createDateAdapter();
			}
			@Override
			public Adapter caseDateTime(DateTime object) {
				return createDateTimeAdapter();
			}
			@Override
			public Adapter caseDecimal(Decimal object) {
				return createDecimalAdapter();
			}
			@Override
			public Adapter caseDefinitionResourceTypes(DefinitionResourceTypes object) {
				return createDefinitionResourceTypesAdapter();
			}
			@Override
			public Adapter caseDetectedIssue(DetectedIssue object) {
				return createDetectedIssueAdapter();
			}
			@Override
			public Adapter caseDetectedIssueEvidence(DetectedIssueEvidence object) {
				return createDetectedIssueEvidenceAdapter();
			}
			@Override
			public Adapter caseDetectedIssueMitigation(DetectedIssueMitigation object) {
				return createDetectedIssueMitigationAdapter();
			}
			@Override
			public Adapter caseDetectedIssueSeverity(DetectedIssueSeverity object) {
				return createDetectedIssueSeverityAdapter();
			}
			@Override
			public Adapter caseDetectedIssueStatus(DetectedIssueStatus object) {
				return createDetectedIssueStatusAdapter();
			}
			@Override
			public Adapter caseDevice(Device object) {
				return createDeviceAdapter();
			}
			@Override
			public Adapter caseDeviceAssociation(DeviceAssociation object) {
				return createDeviceAssociationAdapter();
			}
			@Override
			public Adapter caseDeviceAssociationOperation(DeviceAssociationOperation object) {
				return createDeviceAssociationOperationAdapter();
			}
			@Override
			public Adapter caseDeviceConformsTo(DeviceConformsTo object) {
				return createDeviceConformsToAdapter();
			}
			@Override
			public Adapter caseDeviceCorrectiveActionScope(DeviceCorrectiveActionScope object) {
				return createDeviceCorrectiveActionScopeAdapter();
			}
			@Override
			public Adapter caseDeviceDefinition(DeviceDefinition object) {
				return createDeviceDefinitionAdapter();
			}
			@Override
			public Adapter caseDeviceDefinitionChargeItem(DeviceDefinitionChargeItem object) {
				return createDeviceDefinitionChargeItemAdapter();
			}
			@Override
			public Adapter caseDeviceDefinitionClassification(DeviceDefinitionClassification object) {
				return createDeviceDefinitionClassificationAdapter();
			}
			@Override
			public Adapter caseDeviceDefinitionConformsTo(DeviceDefinitionConformsTo object) {
				return createDeviceDefinitionConformsToAdapter();
			}
			@Override
			public Adapter caseDeviceDefinitionCorrectiveAction(DeviceDefinitionCorrectiveAction object) {
				return createDeviceDefinitionCorrectiveActionAdapter();
			}
			@Override
			public Adapter caseDeviceDefinitionDeviceName(DeviceDefinitionDeviceName object) {
				return createDeviceDefinitionDeviceNameAdapter();
			}
			@Override
			public Adapter caseDeviceDefinitionDistributor(DeviceDefinitionDistributor object) {
				return createDeviceDefinitionDistributorAdapter();
			}
			@Override
			public Adapter caseDeviceDefinitionGuideline(DeviceDefinitionGuideline object) {
				return createDeviceDefinitionGuidelineAdapter();
			}
			@Override
			public Adapter caseDeviceDefinitionHasPart(DeviceDefinitionHasPart object) {
				return createDeviceDefinitionHasPartAdapter();
			}
			@Override
			public Adapter caseDeviceDefinitionLink(DeviceDefinitionLink object) {
				return createDeviceDefinitionLinkAdapter();
			}
			@Override
			public Adapter caseDeviceDefinitionMarketDistribution(DeviceDefinitionMarketDistribution object) {
				return createDeviceDefinitionMarketDistributionAdapter();
			}
			@Override
			public Adapter caseDeviceDefinitionMaterial(DeviceDefinitionMaterial object) {
				return createDeviceDefinitionMaterialAdapter();
			}
			@Override
			public Adapter caseDeviceDefinitionPackaging(DeviceDefinitionPackaging object) {
				return createDeviceDefinitionPackagingAdapter();
			}
			@Override
			public Adapter caseDeviceDefinitionProperty(DeviceDefinitionProperty object) {
				return createDeviceDefinitionPropertyAdapter();
			}
			@Override
			public Adapter caseDeviceDefinitionRegulatoryIdentifier(DeviceDefinitionRegulatoryIdentifier object) {
				return createDeviceDefinitionRegulatoryIdentifierAdapter();
			}
			@Override
			public Adapter caseDeviceDefinitionRegulatoryIdentifierType(DeviceDefinitionRegulatoryIdentifierType object) {
				return createDeviceDefinitionRegulatoryIdentifierTypeAdapter();
			}
			@Override
			public Adapter caseDeviceDefinitionUdiDeviceIdentifier(DeviceDefinitionUdiDeviceIdentifier object) {
				return createDeviceDefinitionUdiDeviceIdentifierAdapter();
			}
			@Override
			public Adapter caseDeviceDefinitionVersion(DeviceDefinitionVersion object) {
				return createDeviceDefinitionVersionAdapter();
			}
			@Override
			public Adapter caseDeviceDispense(DeviceDispense object) {
				return createDeviceDispenseAdapter();
			}
			@Override
			public Adapter caseDeviceDispensePerformer(DeviceDispensePerformer object) {
				return createDeviceDispensePerformerAdapter();
			}
			@Override
			public Adapter caseDeviceDispenseStatusCodes(DeviceDispenseStatusCodes object) {
				return createDeviceDispenseStatusCodesAdapter();
			}
			@Override
			public Adapter caseDeviceMetric(DeviceMetric object) {
				return createDeviceMetricAdapter();
			}
			@Override
			public Adapter caseDeviceMetricCalibration(DeviceMetricCalibration object) {
				return createDeviceMetricCalibrationAdapter();
			}
			@Override
			public Adapter caseDeviceMetricCalibrationState(DeviceMetricCalibrationState object) {
				return createDeviceMetricCalibrationStateAdapter();
			}
			@Override
			public Adapter caseDeviceMetricCalibrationType(DeviceMetricCalibrationType object) {
				return createDeviceMetricCalibrationTypeAdapter();
			}
			@Override
			public Adapter caseDeviceMetricCategory(DeviceMetricCategory object) {
				return createDeviceMetricCategoryAdapter();
			}
			@Override
			public Adapter caseDeviceMetricOperationalStatus(DeviceMetricOperationalStatus object) {
				return createDeviceMetricOperationalStatusAdapter();
			}
			@Override
			public Adapter caseDeviceName(DeviceName object) {
				return createDeviceNameAdapter();
			}
			@Override
			public Adapter caseDeviceNameType(DeviceNameType object) {
				return createDeviceNameTypeAdapter();
			}
			@Override
			public Adapter caseDeviceProductionIdentifierInUDI(DeviceProductionIdentifierInUDI object) {
				return createDeviceProductionIdentifierInUDIAdapter();
			}
			@Override
			public Adapter caseDeviceProperty(DeviceProperty object) {
				return createDevicePropertyAdapter();
			}
			@Override
			public Adapter caseDeviceRequest(DeviceRequest object) {
				return createDeviceRequestAdapter();
			}
			@Override
			public Adapter caseDeviceRequestParameter(DeviceRequestParameter object) {
				return createDeviceRequestParameterAdapter();
			}
			@Override
			public Adapter caseDeviceUdiCarrier(DeviceUdiCarrier object) {
				return createDeviceUdiCarrierAdapter();
			}
			@Override
			public Adapter caseDeviceUsage(DeviceUsage object) {
				return createDeviceUsageAdapter();
			}
			@Override
			public Adapter caseDeviceUsageAdherence(DeviceUsageAdherence object) {
				return createDeviceUsageAdherenceAdapter();
			}
			@Override
			public Adapter caseDeviceUsageStatus(DeviceUsageStatus object) {
				return createDeviceUsageStatusAdapter();
			}
			@Override
			public Adapter caseDeviceVersion(DeviceVersion object) {
				return createDeviceVersionAdapter();
			}
			@Override
			public Adapter caseDiagnosticReport(DiagnosticReport object) {
				return createDiagnosticReportAdapter();
			}
			@Override
			public Adapter caseDiagnosticReportMedia(DiagnosticReportMedia object) {
				return createDiagnosticReportMediaAdapter();
			}
			@Override
			public Adapter caseDiagnosticReportStatus(DiagnosticReportStatus object) {
				return createDiagnosticReportStatusAdapter();
			}
			@Override
			public Adapter caseDiagnosticReportSupportingInfo(DiagnosticReportSupportingInfo object) {
				return createDiagnosticReportSupportingInfoAdapter();
			}
			@Override
			public Adapter caseDiscriminatorType(DiscriminatorType object) {
				return createDiscriminatorTypeAdapter();
			}
			@Override
			public Adapter caseDistance(Distance object) {
				return createDistanceAdapter();
			}
			@Override
			public Adapter caseDocumentMode(DocumentMode object) {
				return createDocumentModeAdapter();
			}
			@Override
			public Adapter caseDocumentReference(DocumentReference object) {
				return createDocumentReferenceAdapter();
			}
			@Override
			public Adapter caseDocumentReferenceAttester(DocumentReferenceAttester object) {
				return createDocumentReferenceAttesterAdapter();
			}
			@Override
			public Adapter caseDocumentReferenceContent(DocumentReferenceContent object) {
				return createDocumentReferenceContentAdapter();
			}
			@Override
			public Adapter caseDocumentReferenceProfile(DocumentReferenceProfile object) {
				return createDocumentReferenceProfileAdapter();
			}
			@Override
			public Adapter caseDocumentReferenceRelatesTo(DocumentReferenceRelatesTo object) {
				return createDocumentReferenceRelatesToAdapter();
			}
			@Override
			public Adapter caseDocumentReferenceStatus(DocumentReferenceStatus object) {
				return createDocumentReferenceStatusAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDomainResource(DomainResource object) {
				return createDomainResourceAdapter();
			}
			@Override
			public Adapter caseDosage(Dosage object) {
				return createDosageAdapter();
			}
			@Override
			public Adapter caseDosageDoseAndRate(DosageDoseAndRate object) {
				return createDosageDoseAndRateAdapter();
			}
			@Override
			public Adapter caseDuration(Duration object) {
				return createDurationAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseElementDefinition(ElementDefinition object) {
				return createElementDefinitionAdapter();
			}
			@Override
			public Adapter caseElementDefinitionAdditional(ElementDefinitionAdditional object) {
				return createElementDefinitionAdditionalAdapter();
			}
			@Override
			public Adapter caseElementDefinitionBase(ElementDefinitionBase object) {
				return createElementDefinitionBaseAdapter();
			}
			@Override
			public Adapter caseElementDefinitionBinding(ElementDefinitionBinding object) {
				return createElementDefinitionBindingAdapter();
			}
			@Override
			public Adapter caseElementDefinitionConstraint(ElementDefinitionConstraint object) {
				return createElementDefinitionConstraintAdapter();
			}
			@Override
			public Adapter caseElementDefinitionDiscriminator(ElementDefinitionDiscriminator object) {
				return createElementDefinitionDiscriminatorAdapter();
			}
			@Override
			public Adapter caseElementDefinitionExample(ElementDefinitionExample object) {
				return createElementDefinitionExampleAdapter();
			}
			@Override
			public Adapter caseElementDefinitionMapping(ElementDefinitionMapping object) {
				return createElementDefinitionMappingAdapter();
			}
			@Override
			public Adapter caseElementDefinitionSlicing(ElementDefinitionSlicing object) {
				return createElementDefinitionSlicingAdapter();
			}
			@Override
			public Adapter caseElementDefinitionType(ElementDefinitionType object) {
				return createElementDefinitionTypeAdapter();
			}
			@Override
			public Adapter caseEligibilityOutcome(EligibilityOutcome object) {
				return createEligibilityOutcomeAdapter();
			}
			@Override
			public Adapter caseEligibilityRequestPurpose(EligibilityRequestPurpose object) {
				return createEligibilityRequestPurposeAdapter();
			}
			@Override
			public Adapter caseEligibilityResponsePurpose(EligibilityResponsePurpose object) {
				return createEligibilityResponsePurposeAdapter();
			}
			@Override
			public Adapter caseEnableWhenBehavior(EnableWhenBehavior object) {
				return createEnableWhenBehaviorAdapter();
			}
			@Override
			public Adapter caseEncounter(Encounter object) {
				return createEncounterAdapter();
			}
			@Override
			public Adapter caseEncounterAdmission(EncounterAdmission object) {
				return createEncounterAdmissionAdapter();
			}
			@Override
			public Adapter caseEncounterDiagnosis(EncounterDiagnosis object) {
				return createEncounterDiagnosisAdapter();
			}
			@Override
			public Adapter caseEncounterHistory(EncounterHistory object) {
				return createEncounterHistoryAdapter();
			}
			@Override
			public Adapter caseEncounterHistoryLocation(EncounterHistoryLocation object) {
				return createEncounterHistoryLocationAdapter();
			}
			@Override
			public Adapter caseEncounterLocation(EncounterLocation object) {
				return createEncounterLocationAdapter();
			}
			@Override
			public Adapter caseEncounterLocationStatus(EncounterLocationStatus object) {
				return createEncounterLocationStatusAdapter();
			}
			@Override
			public Adapter caseEncounterParticipant(EncounterParticipant object) {
				return createEncounterParticipantAdapter();
			}
			@Override
			public Adapter caseEncounterReason(EncounterReason object) {
				return createEncounterReasonAdapter();
			}
			@Override
			public Adapter caseEncounterStatus(EncounterStatus object) {
				return createEncounterStatusAdapter();
			}
			@Override
			public Adapter caseEndpoint(Endpoint object) {
				return createEndpointAdapter();
			}
			@Override
			public Adapter caseEndpointPayload(EndpointPayload object) {
				return createEndpointPayloadAdapter();
			}
			@Override
			public Adapter caseEndpointStatus(EndpointStatus object) {
				return createEndpointStatusAdapter();
			}
			@Override
			public Adapter caseEnrollmentOutcome(EnrollmentOutcome object) {
				return createEnrollmentOutcomeAdapter();
			}
			@Override
			public Adapter caseEnrollmentRequest(EnrollmentRequest object) {
				return createEnrollmentRequestAdapter();
			}
			@Override
			public Adapter caseEnrollmentResponse(EnrollmentResponse object) {
				return createEnrollmentResponseAdapter();
			}
			@Override
			public Adapter caseEpisodeOfCare(EpisodeOfCare object) {
				return createEpisodeOfCareAdapter();
			}
			@Override
			public Adapter caseEpisodeOfCareDiagnosis(EpisodeOfCareDiagnosis object) {
				return createEpisodeOfCareDiagnosisAdapter();
			}
			@Override
			public Adapter caseEpisodeOfCareReason(EpisodeOfCareReason object) {
				return createEpisodeOfCareReasonAdapter();
			}
			@Override
			public Adapter caseEpisodeOfCareStatus(EpisodeOfCareStatus object) {
				return createEpisodeOfCareStatusAdapter();
			}
			@Override
			public Adapter caseEpisodeOfCareStatusHistory(EpisodeOfCareStatusHistory object) {
				return createEpisodeOfCareStatusHistoryAdapter();
			}
			@Override
			public Adapter caseEventCapabilityMode(EventCapabilityMode object) {
				return createEventCapabilityModeAdapter();
			}
			@Override
			public Adapter caseEventDefinition(EventDefinition object) {
				return createEventDefinitionAdapter();
			}
			@Override
			public Adapter caseEventResourceTypes(EventResourceTypes object) {
				return createEventResourceTypesAdapter();
			}
			@Override
			public Adapter caseEventStatus(EventStatus object) {
				return createEventStatusAdapter();
			}
			@Override
			public Adapter caseEventTiming(EventTiming object) {
				return createEventTimingAdapter();
			}
			@Override
			public Adapter caseEvidence(Evidence object) {
				return createEvidenceAdapter();
			}
			@Override
			public Adapter caseEvidenceAttributeEstimate(EvidenceAttributeEstimate object) {
				return createEvidenceAttributeEstimateAdapter();
			}
			@Override
			public Adapter caseEvidenceCertainty(EvidenceCertainty object) {
				return createEvidenceCertaintyAdapter();
			}
			@Override
			public Adapter caseEvidenceModelCharacteristic(EvidenceModelCharacteristic object) {
				return createEvidenceModelCharacteristicAdapter();
			}
			@Override
			public Adapter caseEvidenceReport(EvidenceReport object) {
				return createEvidenceReportAdapter();
			}
			@Override
			public Adapter caseEvidenceReportCharacteristic(EvidenceReportCharacteristic object) {
				return createEvidenceReportCharacteristicAdapter();
			}
			@Override
			public Adapter caseEvidenceReportRelatesTo(EvidenceReportRelatesTo object) {
				return createEvidenceReportRelatesToAdapter();
			}
			@Override
			public Adapter caseEvidenceReportSection(EvidenceReportSection object) {
				return createEvidenceReportSectionAdapter();
			}
			@Override
			public Adapter caseEvidenceReportSubject(EvidenceReportSubject object) {
				return createEvidenceReportSubjectAdapter();
			}
			@Override
			public Adapter caseEvidenceReportTarget(EvidenceReportTarget object) {
				return createEvidenceReportTargetAdapter();
			}
			@Override
			public Adapter caseEvidenceSampleSize(EvidenceSampleSize object) {
				return createEvidenceSampleSizeAdapter();
			}
			@Override
			public Adapter caseEvidenceStatistic(EvidenceStatistic object) {
				return createEvidenceStatisticAdapter();
			}
			@Override
			public Adapter caseEvidenceVariable(EvidenceVariable object) {
				return createEvidenceVariableAdapter();
			}
			@Override
			public Adapter caseEvidenceVariable1(EvidenceVariable1 object) {
				return createEvidenceVariable1Adapter();
			}
			@Override
			public Adapter caseEvidenceVariableCategory(EvidenceVariableCategory object) {
				return createEvidenceVariableCategoryAdapter();
			}
			@Override
			public Adapter caseEvidenceVariableCharacteristic(EvidenceVariableCharacteristic object) {
				return createEvidenceVariableCharacteristicAdapter();
			}
			@Override
			public Adapter caseEvidenceVariableDefinition(EvidenceVariableDefinition object) {
				return createEvidenceVariableDefinitionAdapter();
			}
			@Override
			public Adapter caseEvidenceVariableDefinitionByCombination(EvidenceVariableDefinitionByCombination object) {
				return createEvidenceVariableDefinitionByCombinationAdapter();
			}
			@Override
			public Adapter caseEvidenceVariableDefinitionByTypeAndValue(EvidenceVariableDefinitionByTypeAndValue object) {
				return createEvidenceVariableDefinitionByTypeAndValueAdapter();
			}
			@Override
			public Adapter caseEvidenceVariableHandling(EvidenceVariableHandling object) {
				return createEvidenceVariableHandlingAdapter();
			}
			@Override
			public Adapter caseEvidenceVariableTimeFromEvent(EvidenceVariableTimeFromEvent object) {
				return createEvidenceVariableTimeFromEventAdapter();
			}
			@Override
			public Adapter caseExampleScenario(ExampleScenario object) {
				return createExampleScenarioAdapter();
			}
			@Override
			public Adapter caseExampleScenarioActor(ExampleScenarioActor object) {
				return createExampleScenarioActorAdapter();
			}
			@Override
			public Adapter caseExampleScenarioActorType(ExampleScenarioActorType object) {
				return createExampleScenarioActorTypeAdapter();
			}
			@Override
			public Adapter caseExampleScenarioAlternative(ExampleScenarioAlternative object) {
				return createExampleScenarioAlternativeAdapter();
			}
			@Override
			public Adapter caseExampleScenarioContainedInstance(ExampleScenarioContainedInstance object) {
				return createExampleScenarioContainedInstanceAdapter();
			}
			@Override
			public Adapter caseExampleScenarioInstance(ExampleScenarioInstance object) {
				return createExampleScenarioInstanceAdapter();
			}
			@Override
			public Adapter caseExampleScenarioOperation(ExampleScenarioOperation object) {
				return createExampleScenarioOperationAdapter();
			}
			@Override
			public Adapter caseExampleScenarioProcess(ExampleScenarioProcess object) {
				return createExampleScenarioProcessAdapter();
			}
			@Override
			public Adapter caseExampleScenarioStep(ExampleScenarioStep object) {
				return createExampleScenarioStepAdapter();
			}
			@Override
			public Adapter caseExampleScenarioVersion(ExampleScenarioVersion object) {
				return createExampleScenarioVersionAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefit(ExplanationOfBenefit object) {
				return createExplanationOfBenefitAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitAccident(ExplanationOfBenefitAccident object) {
				return createExplanationOfBenefitAccidentAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitAddItem(ExplanationOfBenefitAddItem object) {
				return createExplanationOfBenefitAddItemAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitAdjudication(ExplanationOfBenefitAdjudication object) {
				return createExplanationOfBenefitAdjudicationAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitBenefitBalance(ExplanationOfBenefitBenefitBalance object) {
				return createExplanationOfBenefitBenefitBalanceAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitBodySite(ExplanationOfBenefitBodySite object) {
				return createExplanationOfBenefitBodySiteAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitBodySite1(ExplanationOfBenefitBodySite1 object) {
				return createExplanationOfBenefitBodySite1Adapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitCareTeam(ExplanationOfBenefitCareTeam object) {
				return createExplanationOfBenefitCareTeamAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitDetail(ExplanationOfBenefitDetail object) {
				return createExplanationOfBenefitDetailAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitDetail1(ExplanationOfBenefitDetail1 object) {
				return createExplanationOfBenefitDetail1Adapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitDiagnosis(ExplanationOfBenefitDiagnosis object) {
				return createExplanationOfBenefitDiagnosisAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitEvent(ExplanationOfBenefitEvent object) {
				return createExplanationOfBenefitEventAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitFinancial(ExplanationOfBenefitFinancial object) {
				return createExplanationOfBenefitFinancialAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitInsurance(ExplanationOfBenefitInsurance object) {
				return createExplanationOfBenefitInsuranceAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitItem(ExplanationOfBenefitItem object) {
				return createExplanationOfBenefitItemAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitPayee(ExplanationOfBenefitPayee object) {
				return createExplanationOfBenefitPayeeAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitPayment(ExplanationOfBenefitPayment object) {
				return createExplanationOfBenefitPaymentAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitProcedure(ExplanationOfBenefitProcedure object) {
				return createExplanationOfBenefitProcedureAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitProcessNote(ExplanationOfBenefitProcessNote object) {
				return createExplanationOfBenefitProcessNoteAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitRelated(ExplanationOfBenefitRelated object) {
				return createExplanationOfBenefitRelatedAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitReviewOutcome(ExplanationOfBenefitReviewOutcome object) {
				return createExplanationOfBenefitReviewOutcomeAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitStatus(ExplanationOfBenefitStatus object) {
				return createExplanationOfBenefitStatusAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitSubDetail(ExplanationOfBenefitSubDetail object) {
				return createExplanationOfBenefitSubDetailAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitSubDetail1(ExplanationOfBenefitSubDetail1 object) {
				return createExplanationOfBenefitSubDetail1Adapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitSupportingInfo(ExplanationOfBenefitSupportingInfo object) {
				return createExplanationOfBenefitSupportingInfoAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitTotal(ExplanationOfBenefitTotal object) {
				return createExplanationOfBenefitTotalAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseExtendedContactDetail(ExtendedContactDetail object) {
				return createExtendedContactDetailAdapter();
			}
			@Override
			public Adapter caseExtension(Extension object) {
				return createExtensionAdapter();
			}
			@Override
			public Adapter caseExtensionContextType(ExtensionContextType object) {
				return createExtensionContextTypeAdapter();
			}
			@Override
			public Adapter caseFamilyHistoryStatus(FamilyHistoryStatus object) {
				return createFamilyHistoryStatusAdapter();
			}
			@Override
			public Adapter caseFamilyMemberHistory(FamilyMemberHistory object) {
				return createFamilyMemberHistoryAdapter();
			}
			@Override
			public Adapter caseFamilyMemberHistoryCondition(FamilyMemberHistoryCondition object) {
				return createFamilyMemberHistoryConditionAdapter();
			}
			@Override
			public Adapter caseFamilyMemberHistoryParticipant(FamilyMemberHistoryParticipant object) {
				return createFamilyMemberHistoryParticipantAdapter();
			}
			@Override
			public Adapter caseFamilyMemberHistoryProcedure(FamilyMemberHistoryProcedure object) {
				return createFamilyMemberHistoryProcedureAdapter();
			}
			@Override
			public Adapter caseFHIRDeviceStatus(FHIRDeviceStatus object) {
				return createFHIRDeviceStatusAdapter();
			}
			@Override
			public Adapter caseFHIRPathTypes(FHIRPathTypes object) {
				return createFHIRPathTypesAdapter();
			}
			@Override
			public Adapter caseFHIRSubstanceStatus(FHIRSubstanceStatus object) {
				return createFHIRSubstanceStatusAdapter();
			}
			@Override
			public Adapter caseFHIRTypes(FHIRTypes object) {
				return createFHIRTypesAdapter();
			}
			@Override
			public Adapter caseFHIRVersion(FHIRVersion object) {
				return createFHIRVersionAdapter();
			}
			@Override
			public Adapter caseFilterOperator(FilterOperator object) {
				return createFilterOperatorAdapter();
			}
			@Override
			public Adapter caseFinancialResourceStatusCodes(FinancialResourceStatusCodes object) {
				return createFinancialResourceStatusCodesAdapter();
			}
			@Override
			public Adapter caseFlag(Flag object) {
				return createFlagAdapter();
			}
			@Override
			public Adapter caseFlagStatus(FlagStatus object) {
				return createFlagStatusAdapter();
			}
			@Override
			public Adapter caseFormularyItem(FormularyItem object) {
				return createFormularyItemAdapter();
			}
			@Override
			public Adapter caseFormularyItemStatusCodes(FormularyItemStatusCodes object) {
				return createFormularyItemStatusCodesAdapter();
			}
			@Override
			public Adapter caseGenomicStudy(GenomicStudy object) {
				return createGenomicStudyAdapter();
			}
			@Override
			public Adapter caseGenomicStudyAnalysis(GenomicStudyAnalysis object) {
				return createGenomicStudyAnalysisAdapter();
			}
			@Override
			public Adapter caseGenomicStudyDevice(GenomicStudyDevice object) {
				return createGenomicStudyDeviceAdapter();
			}
			@Override
			public Adapter caseGenomicStudyInput(GenomicStudyInput object) {
				return createGenomicStudyInputAdapter();
			}
			@Override
			public Adapter caseGenomicStudyOutput(GenomicStudyOutput object) {
				return createGenomicStudyOutputAdapter();
			}
			@Override
			public Adapter caseGenomicStudyPerformer(GenomicStudyPerformer object) {
				return createGenomicStudyPerformerAdapter();
			}
			@Override
			public Adapter caseGenomicStudyStatus(GenomicStudyStatus object) {
				return createGenomicStudyStatusAdapter();
			}
			@Override
			public Adapter caseGoal(Goal object) {
				return createGoalAdapter();
			}
			@Override
			public Adapter caseGoalLifecycleStatus(GoalLifecycleStatus object) {
				return createGoalLifecycleStatusAdapter();
			}
			@Override
			public Adapter caseGoalTarget(GoalTarget object) {
				return createGoalTargetAdapter();
			}
			@Override
			public Adapter caseGraphCompartmentRule(GraphCompartmentRule object) {
				return createGraphCompartmentRuleAdapter();
			}
			@Override
			public Adapter caseGraphCompartmentUse(GraphCompartmentUse object) {
				return createGraphCompartmentUseAdapter();
			}
			@Override
			public Adapter caseGraphDefinition(GraphDefinition object) {
				return createGraphDefinitionAdapter();
			}
			@Override
			public Adapter caseGraphDefinitionCompartment(GraphDefinitionCompartment object) {
				return createGraphDefinitionCompartmentAdapter();
			}
			@Override
			public Adapter caseGraphDefinitionLink(GraphDefinitionLink object) {
				return createGraphDefinitionLinkAdapter();
			}
			@Override
			public Adapter caseGraphDefinitionNode(GraphDefinitionNode object) {
				return createGraphDefinitionNodeAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseGroupCharacteristic(GroupCharacteristic object) {
				return createGroupCharacteristicAdapter();
			}
			@Override
			public Adapter caseGroupMember(GroupMember object) {
				return createGroupMemberAdapter();
			}
			@Override
			public Adapter caseGroupMembershipBasis(GroupMembershipBasis object) {
				return createGroupMembershipBasisAdapter();
			}
			@Override
			public Adapter caseGroupType(GroupType object) {
				return createGroupTypeAdapter();
			}
			@Override
			public Adapter caseGuidanceResponse(GuidanceResponse object) {
				return createGuidanceResponseAdapter();
			}
			@Override
			public Adapter caseGuidanceResponseStatus(GuidanceResponseStatus object) {
				return createGuidanceResponseStatusAdapter();
			}
			@Override
			public Adapter caseGuidePageGeneration(GuidePageGeneration object) {
				return createGuidePageGenerationAdapter();
			}
			@Override
			public Adapter caseHealthcareService(HealthcareService object) {
				return createHealthcareServiceAdapter();
			}
			@Override
			public Adapter caseHealthcareServiceEligibility(HealthcareServiceEligibility object) {
				return createHealthcareServiceEligibilityAdapter();
			}
			@Override
			public Adapter caseHTTPVerb(HTTPVerb object) {
				return createHTTPVerbAdapter();
			}
			@Override
			public Adapter caseHumanName(HumanName object) {
				return createHumanNameAdapter();
			}
			@Override
			public Adapter caseId(Id object) {
				return createIdAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseIdentifierUse(IdentifierUse object) {
				return createIdentifierUseAdapter();
			}
			@Override
			public Adapter caseIdentityAssuranceLevel(IdentityAssuranceLevel object) {
				return createIdentityAssuranceLevelAdapter();
			}
			@Override
			public Adapter caseImagingSelection(ImagingSelection object) {
				return createImagingSelectionAdapter();
			}
			@Override
			public Adapter caseImagingSelectionDGraphicType(ImagingSelectionDGraphicType object) {
				return createImagingSelectionDGraphicTypeAdapter();
			}
			@Override
			public Adapter caseImagingSelectionImageRegion2D(ImagingSelectionImageRegion2D object) {
				return createImagingSelectionImageRegion2DAdapter();
			}
			@Override
			public Adapter caseImagingSelectionImageRegion3D(ImagingSelectionImageRegion3D object) {
				return createImagingSelectionImageRegion3DAdapter();
			}
			@Override
			public Adapter caseImagingSelectionInstance(ImagingSelectionInstance object) {
				return createImagingSelectionInstanceAdapter();
			}
			@Override
			public Adapter caseImagingSelectionPerformer(ImagingSelectionPerformer object) {
				return createImagingSelectionPerformerAdapter();
			}
			@Override
			public Adapter caseImagingSelectionStatus(ImagingSelectionStatus object) {
				return createImagingSelectionStatusAdapter();
			}
			@Override
			public Adapter caseImagingStudy(ImagingStudy object) {
				return createImagingStudyAdapter();
			}
			@Override
			public Adapter caseImagingStudyInstance(ImagingStudyInstance object) {
				return createImagingStudyInstanceAdapter();
			}
			@Override
			public Adapter caseImagingStudyPerformer(ImagingStudyPerformer object) {
				return createImagingStudyPerformerAdapter();
			}
			@Override
			public Adapter caseImagingStudySeries(ImagingStudySeries object) {
				return createImagingStudySeriesAdapter();
			}
			@Override
			public Adapter caseImagingStudyStatus(ImagingStudyStatus object) {
				return createImagingStudyStatusAdapter();
			}
			@Override
			public Adapter caseImmunization(Immunization object) {
				return createImmunizationAdapter();
			}
			@Override
			public Adapter caseImmunizationEvaluation(ImmunizationEvaluation object) {
				return createImmunizationEvaluationAdapter();
			}
			@Override
			public Adapter caseImmunizationEvaluationStatusCodes(ImmunizationEvaluationStatusCodes object) {
				return createImmunizationEvaluationStatusCodesAdapter();
			}
			@Override
			public Adapter caseImmunizationPerformer(ImmunizationPerformer object) {
				return createImmunizationPerformerAdapter();
			}
			@Override
			public Adapter caseImmunizationProgramEligibility(ImmunizationProgramEligibility object) {
				return createImmunizationProgramEligibilityAdapter();
			}
			@Override
			public Adapter caseImmunizationProtocolApplied(ImmunizationProtocolApplied object) {
				return createImmunizationProtocolAppliedAdapter();
			}
			@Override
			public Adapter caseImmunizationReaction(ImmunizationReaction object) {
				return createImmunizationReactionAdapter();
			}
			@Override
			public Adapter caseImmunizationRecommendation(ImmunizationRecommendation object) {
				return createImmunizationRecommendationAdapter();
			}
			@Override
			public Adapter caseImmunizationRecommendationDateCriterion(ImmunizationRecommendationDateCriterion object) {
				return createImmunizationRecommendationDateCriterionAdapter();
			}
			@Override
			public Adapter caseImmunizationRecommendationRecommendation(ImmunizationRecommendationRecommendation object) {
				return createImmunizationRecommendationRecommendationAdapter();
			}
			@Override
			public Adapter caseImmunizationStatusCodes(ImmunizationStatusCodes object) {
				return createImmunizationStatusCodesAdapter();
			}
			@Override
			public Adapter caseImplementationGuide(ImplementationGuide object) {
				return createImplementationGuideAdapter();
			}
			@Override
			public Adapter caseImplementationGuideDefinition(ImplementationGuideDefinition object) {
				return createImplementationGuideDefinitionAdapter();
			}
			@Override
			public Adapter caseImplementationGuideDependsOn(ImplementationGuideDependsOn object) {
				return createImplementationGuideDependsOnAdapter();
			}
			@Override
			public Adapter caseImplementationGuideGlobal(ImplementationGuideGlobal object) {
				return createImplementationGuideGlobalAdapter();
			}
			@Override
			public Adapter caseImplementationGuideGrouping(ImplementationGuideGrouping object) {
				return createImplementationGuideGroupingAdapter();
			}
			@Override
			public Adapter caseImplementationGuideManifest(ImplementationGuideManifest object) {
				return createImplementationGuideManifestAdapter();
			}
			@Override
			public Adapter caseImplementationGuidePage(ImplementationGuidePage object) {
				return createImplementationGuidePageAdapter();
			}
			@Override
			public Adapter caseImplementationGuidePage1(ImplementationGuidePage1 object) {
				return createImplementationGuidePage1Adapter();
			}
			@Override
			public Adapter caseImplementationGuideParameter(ImplementationGuideParameter object) {
				return createImplementationGuideParameterAdapter();
			}
			@Override
			public Adapter caseImplementationGuideResource(ImplementationGuideResource object) {
				return createImplementationGuideResourceAdapter();
			}
			@Override
			public Adapter caseImplementationGuideResource1(ImplementationGuideResource1 object) {
				return createImplementationGuideResource1Adapter();
			}
			@Override
			public Adapter caseImplementationGuideTemplate(ImplementationGuideTemplate object) {
				return createImplementationGuideTemplateAdapter();
			}
			@Override
			public Adapter caseIngredient(Ingredient object) {
				return createIngredientAdapter();
			}
			@Override
			public Adapter caseIngredientManufacturer(IngredientManufacturer object) {
				return createIngredientManufacturerAdapter();
			}
			@Override
			public Adapter caseIngredientManufacturerRole(IngredientManufacturerRole object) {
				return createIngredientManufacturerRoleAdapter();
			}
			@Override
			public Adapter caseIngredientReferenceStrength(IngredientReferenceStrength object) {
				return createIngredientReferenceStrengthAdapter();
			}
			@Override
			public Adapter caseIngredientStrength(IngredientStrength object) {
				return createIngredientStrengthAdapter();
			}
			@Override
			public Adapter caseIngredientSubstance(IngredientSubstance object) {
				return createIngredientSubstanceAdapter();
			}
			@Override
			public Adapter caseInstant(Instant object) {
				return createInstantAdapter();
			}
			@Override
			public Adapter caseInsurancePlan(InsurancePlan object) {
				return createInsurancePlanAdapter();
			}
			@Override
			public Adapter caseInsurancePlanBenefit(InsurancePlanBenefit object) {
				return createInsurancePlanBenefitAdapter();
			}
			@Override
			public Adapter caseInsurancePlanBenefit1(InsurancePlanBenefit1 object) {
				return createInsurancePlanBenefit1Adapter();
			}
			@Override
			public Adapter caseInsurancePlanCost(InsurancePlanCost object) {
				return createInsurancePlanCostAdapter();
			}
			@Override
			public Adapter caseInsurancePlanCoverage(InsurancePlanCoverage object) {
				return createInsurancePlanCoverageAdapter();
			}
			@Override
			public Adapter caseInsurancePlanGeneralCost(InsurancePlanGeneralCost object) {
				return createInsurancePlanGeneralCostAdapter();
			}
			@Override
			public Adapter caseInsurancePlanLimit(InsurancePlanLimit object) {
				return createInsurancePlanLimitAdapter();
			}
			@Override
			public Adapter caseInsurancePlanPlan(InsurancePlanPlan object) {
				return createInsurancePlanPlanAdapter();
			}
			@Override
			public Adapter caseInsurancePlanSpecificCost(InsurancePlanSpecificCost object) {
				return createInsurancePlanSpecificCostAdapter();
			}
			@Override
			public Adapter caseInteger(org.hl7.fhir.Integer object) {
				return createIntegerAdapter();
			}
			@Override
			public Adapter caseInteger64(Integer64 object) {
				return createInteger64Adapter();
			}
			@Override
			public Adapter caseInteractionTrigger(InteractionTrigger object) {
				return createInteractionTriggerAdapter();
			}
			@Override
			public Adapter caseInventoryCountType(InventoryCountType object) {
				return createInventoryCountTypeAdapter();
			}
			@Override
			public Adapter caseInventoryItem(InventoryItem object) {
				return createInventoryItemAdapter();
			}
			@Override
			public Adapter caseInventoryItemAssociation(InventoryItemAssociation object) {
				return createInventoryItemAssociationAdapter();
			}
			@Override
			public Adapter caseInventoryItemCharacteristic(InventoryItemCharacteristic object) {
				return createInventoryItemCharacteristicAdapter();
			}
			@Override
			public Adapter caseInventoryItemDescription(InventoryItemDescription object) {
				return createInventoryItemDescriptionAdapter();
			}
			@Override
			public Adapter caseInventoryItemInstance(InventoryItemInstance object) {
				return createInventoryItemInstanceAdapter();
			}
			@Override
			public Adapter caseInventoryItemName(InventoryItemName object) {
				return createInventoryItemNameAdapter();
			}
			@Override
			public Adapter caseInventoryItemResponsibleOrganization(InventoryItemResponsibleOrganization object) {
				return createInventoryItemResponsibleOrganizationAdapter();
			}
			@Override
			public Adapter caseInventoryItemStatusCodes(InventoryItemStatusCodes object) {
				return createInventoryItemStatusCodesAdapter();
			}
			@Override
			public Adapter caseInventoryReport(InventoryReport object) {
				return createInventoryReportAdapter();
			}
			@Override
			public Adapter caseInventoryReportInventoryListing(InventoryReportInventoryListing object) {
				return createInventoryReportInventoryListingAdapter();
			}
			@Override
			public Adapter caseInventoryReportItem(InventoryReportItem object) {
				return createInventoryReportItemAdapter();
			}
			@Override
			public Adapter caseInventoryReportStatus(InventoryReportStatus object) {
				return createInventoryReportStatusAdapter();
			}
			@Override
			public Adapter caseInvoice(Invoice object) {
				return createInvoiceAdapter();
			}
			@Override
			public Adapter caseInvoiceLineItem(InvoiceLineItem object) {
				return createInvoiceLineItemAdapter();
			}
			@Override
			public Adapter caseInvoiceParticipant(InvoiceParticipant object) {
				return createInvoiceParticipantAdapter();
			}
			@Override
			public Adapter caseInvoiceStatus(InvoiceStatus object) {
				return createInvoiceStatusAdapter();
			}
			@Override
			public Adapter caseIssueSeverity(IssueSeverity object) {
				return createIssueSeverityAdapter();
			}
			@Override
			public Adapter caseIssueType(IssueType object) {
				return createIssueTypeAdapter();
			}
			@Override
			public Adapter caseJurisdictionValueSet(JurisdictionValueSet object) {
				return createJurisdictionValueSetAdapter();
			}
			@Override
			public Adapter caseKind(Kind object) {
				return createKindAdapter();
			}
			@Override
			public Adapter caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			@Override
			public Adapter caseLinkage(Linkage object) {
				return createLinkageAdapter();
			}
			@Override
			public Adapter caseLinkageItem(LinkageItem object) {
				return createLinkageItemAdapter();
			}
			@Override
			public Adapter caseLinkageType(LinkageType object) {
				return createLinkageTypeAdapter();
			}
			@Override
			public Adapter caseLinkRelationTypes(LinkRelationTypes object) {
				return createLinkRelationTypesAdapter();
			}
			@Override
			public Adapter caseLinkType(LinkType object) {
				return createLinkTypeAdapter();
			}
			@Override
			public Adapter caseList(List object) {
				return createListAdapter();
			}
			@Override
			public Adapter caseListEntry(ListEntry object) {
				return createListEntryAdapter();
			}
			@Override
			public Adapter caseListMode(ListMode object) {
				return createListModeAdapter();
			}
			@Override
			public Adapter caseListStatus(ListStatus object) {
				return createListStatusAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseLocationMode(LocationMode object) {
				return createLocationModeAdapter();
			}
			@Override
			public Adapter caseLocationPosition(LocationPosition object) {
				return createLocationPositionAdapter();
			}
			@Override
			public Adapter caseLocationStatus(LocationStatus object) {
				return createLocationStatusAdapter();
			}
			@Override
			public Adapter caseManufacturedItemDefinition(ManufacturedItemDefinition object) {
				return createManufacturedItemDefinitionAdapter();
			}
			@Override
			public Adapter caseManufacturedItemDefinitionComponent(ManufacturedItemDefinitionComponent object) {
				return createManufacturedItemDefinitionComponentAdapter();
			}
			@Override
			public Adapter caseManufacturedItemDefinitionConstituent(ManufacturedItemDefinitionConstituent object) {
				return createManufacturedItemDefinitionConstituentAdapter();
			}
			@Override
			public Adapter caseManufacturedItemDefinitionProperty(ManufacturedItemDefinitionProperty object) {
				return createManufacturedItemDefinitionPropertyAdapter();
			}
			@Override
			public Adapter caseMarkdown(Markdown object) {
				return createMarkdownAdapter();
			}
			@Override
			public Adapter caseMarketingStatus(MarketingStatus object) {
				return createMarketingStatusAdapter();
			}
			@Override
			public Adapter caseMeasure(Measure object) {
				return createMeasureAdapter();
			}
			@Override
			public Adapter caseMeasureComponent(MeasureComponent object) {
				return createMeasureComponentAdapter();
			}
			@Override
			public Adapter caseMeasureGroup(MeasureGroup object) {
				return createMeasureGroupAdapter();
			}
			@Override
			public Adapter caseMeasurePopulation(MeasurePopulation object) {
				return createMeasurePopulationAdapter();
			}
			@Override
			public Adapter caseMeasureReport(MeasureReport object) {
				return createMeasureReportAdapter();
			}
			@Override
			public Adapter caseMeasureReportComponent(MeasureReportComponent object) {
				return createMeasureReportComponentAdapter();
			}
			@Override
			public Adapter caseMeasureReportGroup(MeasureReportGroup object) {
				return createMeasureReportGroupAdapter();
			}
			@Override
			public Adapter caseMeasureReportPopulation(MeasureReportPopulation object) {
				return createMeasureReportPopulationAdapter();
			}
			@Override
			public Adapter caseMeasureReportPopulation1(MeasureReportPopulation1 object) {
				return createMeasureReportPopulation1Adapter();
			}
			@Override
			public Adapter caseMeasureReportStatus(MeasureReportStatus object) {
				return createMeasureReportStatusAdapter();
			}
			@Override
			public Adapter caseMeasureReportStratifier(MeasureReportStratifier object) {
				return createMeasureReportStratifierAdapter();
			}
			@Override
			public Adapter caseMeasureReportStratum(MeasureReportStratum object) {
				return createMeasureReportStratumAdapter();
			}
			@Override
			public Adapter caseMeasureReportType(MeasureReportType object) {
				return createMeasureReportTypeAdapter();
			}
			@Override
			public Adapter caseMeasureStratifier(MeasureStratifier object) {
				return createMeasureStratifierAdapter();
			}
			@Override
			public Adapter caseMeasureSupplementalData(MeasureSupplementalData object) {
				return createMeasureSupplementalDataAdapter();
			}
			@Override
			public Adapter caseMeasureTerm(MeasureTerm object) {
				return createMeasureTermAdapter();
			}
			@Override
			public Adapter caseMedication(Medication object) {
				return createMedicationAdapter();
			}
			@Override
			public Adapter caseMedicationAdministration(MedicationAdministration object) {
				return createMedicationAdministrationAdapter();
			}
			@Override
			public Adapter caseMedicationAdministrationDosage(MedicationAdministrationDosage object) {
				return createMedicationAdministrationDosageAdapter();
			}
			@Override
			public Adapter caseMedicationAdministrationPerformer(MedicationAdministrationPerformer object) {
				return createMedicationAdministrationPerformerAdapter();
			}
			@Override
			public Adapter caseMedicationAdministrationStatusCodes(MedicationAdministrationStatusCodes object) {
				return createMedicationAdministrationStatusCodesAdapter();
			}
			@Override
			public Adapter caseMedicationBatch(MedicationBatch object) {
				return createMedicationBatchAdapter();
			}
			@Override
			public Adapter caseMedicationDispense(MedicationDispense object) {
				return createMedicationDispenseAdapter();
			}
			@Override
			public Adapter caseMedicationDispensePerformer(MedicationDispensePerformer object) {
				return createMedicationDispensePerformerAdapter();
			}
			@Override
			public Adapter caseMedicationDispenseStatusCodes(MedicationDispenseStatusCodes object) {
				return createMedicationDispenseStatusCodesAdapter();
			}
			@Override
			public Adapter caseMedicationDispenseSubstitution(MedicationDispenseSubstitution object) {
				return createMedicationDispenseSubstitutionAdapter();
			}
			@Override
			public Adapter caseMedicationIngredient(MedicationIngredient object) {
				return createMedicationIngredientAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledge(MedicationKnowledge object) {
				return createMedicationKnowledgeAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeCost(MedicationKnowledgeCost object) {
				return createMedicationKnowledgeCostAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeDefinitional(MedicationKnowledgeDefinitional object) {
				return createMedicationKnowledgeDefinitionalAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeDosage(MedicationKnowledgeDosage object) {
				return createMedicationKnowledgeDosageAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeDosingGuideline(MedicationKnowledgeDosingGuideline object) {
				return createMedicationKnowledgeDosingGuidelineAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeDrugCharacteristic(MedicationKnowledgeDrugCharacteristic object) {
				return createMedicationKnowledgeDrugCharacteristicAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeEnvironmentalSetting(MedicationKnowledgeEnvironmentalSetting object) {
				return createMedicationKnowledgeEnvironmentalSettingAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeIndicationGuideline(MedicationKnowledgeIndicationGuideline object) {
				return createMedicationKnowledgeIndicationGuidelineAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeIngredient(MedicationKnowledgeIngredient object) {
				return createMedicationKnowledgeIngredientAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeMaxDispense(MedicationKnowledgeMaxDispense object) {
				return createMedicationKnowledgeMaxDispenseAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeMedicineClassification(MedicationKnowledgeMedicineClassification object) {
				return createMedicationKnowledgeMedicineClassificationAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeMonitoringProgram(MedicationKnowledgeMonitoringProgram object) {
				return createMedicationKnowledgeMonitoringProgramAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeMonograph(MedicationKnowledgeMonograph object) {
				return createMedicationKnowledgeMonographAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgePackaging(MedicationKnowledgePackaging object) {
				return createMedicationKnowledgePackagingAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgePatientCharacteristic(MedicationKnowledgePatientCharacteristic object) {
				return createMedicationKnowledgePatientCharacteristicAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeRegulatory(MedicationKnowledgeRegulatory object) {
				return createMedicationKnowledgeRegulatoryAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeRelatedMedicationKnowledge(MedicationKnowledgeRelatedMedicationKnowledge object) {
				return createMedicationKnowledgeRelatedMedicationKnowledgeAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeStatusCodes(MedicationKnowledgeStatusCodes object) {
				return createMedicationKnowledgeStatusCodesAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeStorageGuideline(MedicationKnowledgeStorageGuideline object) {
				return createMedicationKnowledgeStorageGuidelineAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeSubstitution(MedicationKnowledgeSubstitution object) {
				return createMedicationKnowledgeSubstitutionAdapter();
			}
			@Override
			public Adapter caseMedicationRequest(MedicationRequest object) {
				return createMedicationRequestAdapter();
			}
			@Override
			public Adapter caseMedicationRequestDispenseRequest(MedicationRequestDispenseRequest object) {
				return createMedicationRequestDispenseRequestAdapter();
			}
			@Override
			public Adapter caseMedicationRequestInitialFill(MedicationRequestInitialFill object) {
				return createMedicationRequestInitialFillAdapter();
			}
			@Override
			public Adapter caseMedicationRequestIntent(MedicationRequestIntent object) {
				return createMedicationRequestIntentAdapter();
			}
			@Override
			public Adapter caseMedicationrequestStatus(MedicationrequestStatus object) {
				return createMedicationrequestStatusAdapter();
			}
			@Override
			public Adapter caseMedicationRequestSubstitution(MedicationRequestSubstitution object) {
				return createMedicationRequestSubstitutionAdapter();
			}
			@Override
			public Adapter caseMedicationStatement(MedicationStatement object) {
				return createMedicationStatementAdapter();
			}
			@Override
			public Adapter caseMedicationStatementAdherence(MedicationStatementAdherence object) {
				return createMedicationStatementAdherenceAdapter();
			}
			@Override
			public Adapter caseMedicationStatementStatusCodes(MedicationStatementStatusCodes object) {
				return createMedicationStatementStatusCodesAdapter();
			}
			@Override
			public Adapter caseMedicationStatusCodes(MedicationStatusCodes object) {
				return createMedicationStatusCodesAdapter();
			}
			@Override
			public Adapter caseMedicinalProductDefinition(MedicinalProductDefinition object) {
				return createMedicinalProductDefinitionAdapter();
			}
			@Override
			public Adapter caseMedicinalProductDefinitionCharacteristic(MedicinalProductDefinitionCharacteristic object) {
				return createMedicinalProductDefinitionCharacteristicAdapter();
			}
			@Override
			public Adapter caseMedicinalProductDefinitionContact(MedicinalProductDefinitionContact object) {
				return createMedicinalProductDefinitionContactAdapter();
			}
			@Override
			public Adapter caseMedicinalProductDefinitionCrossReference(MedicinalProductDefinitionCrossReference object) {
				return createMedicinalProductDefinitionCrossReferenceAdapter();
			}
			@Override
			public Adapter caseMedicinalProductDefinitionName(MedicinalProductDefinitionName object) {
				return createMedicinalProductDefinitionNameAdapter();
			}
			@Override
			public Adapter caseMedicinalProductDefinitionOperation(MedicinalProductDefinitionOperation object) {
				return createMedicinalProductDefinitionOperationAdapter();
			}
			@Override
			public Adapter caseMedicinalProductDefinitionPart(MedicinalProductDefinitionPart object) {
				return createMedicinalProductDefinitionPartAdapter();
			}
			@Override
			public Adapter caseMedicinalProductDefinitionUsage(MedicinalProductDefinitionUsage object) {
				return createMedicinalProductDefinitionUsageAdapter();
			}
			@Override
			public Adapter caseMessageDefinition(MessageDefinition object) {
				return createMessageDefinitionAdapter();
			}
			@Override
			public Adapter caseMessageDefinitionAllowedResponse(MessageDefinitionAllowedResponse object) {
				return createMessageDefinitionAllowedResponseAdapter();
			}
			@Override
			public Adapter caseMessageDefinitionFocus(MessageDefinitionFocus object) {
				return createMessageDefinitionFocusAdapter();
			}
			@Override
			public Adapter caseMessageHeader(MessageHeader object) {
				return createMessageHeaderAdapter();
			}
			@Override
			public Adapter caseMessageHeaderDestination(MessageHeaderDestination object) {
				return createMessageHeaderDestinationAdapter();
			}
			@Override
			public Adapter caseMessageHeaderResponse(MessageHeaderResponse object) {
				return createMessageHeaderResponseAdapter();
			}
			@Override
			public Adapter caseMessageheaderResponseRequest(MessageheaderResponseRequest object) {
				return createMessageheaderResponseRequestAdapter();
			}
			@Override
			public Adapter caseMessageHeaderSource(MessageHeaderSource object) {
				return createMessageHeaderSourceAdapter();
			}
			@Override
			public Adapter caseMessageSignificanceCategory(MessageSignificanceCategory object) {
				return createMessageSignificanceCategoryAdapter();
			}
			@Override
			public Adapter caseMeta(Meta object) {
				return createMetaAdapter();
			}
			@Override
			public Adapter caseMetadataResource(MetadataResource object) {
				return createMetadataResourceAdapter();
			}
			@Override
			public Adapter caseMolecularSequence(MolecularSequence object) {
				return createMolecularSequenceAdapter();
			}
			@Override
			public Adapter caseMolecularSequenceEdit(MolecularSequenceEdit object) {
				return createMolecularSequenceEditAdapter();
			}
			@Override
			public Adapter caseMolecularSequenceRelative(MolecularSequenceRelative object) {
				return createMolecularSequenceRelativeAdapter();
			}
			@Override
			public Adapter caseMolecularSequenceStartingSequence(MolecularSequenceStartingSequence object) {
				return createMolecularSequenceStartingSequenceAdapter();
			}
			@Override
			public Adapter caseMonetaryComponent(MonetaryComponent object) {
				return createMonetaryComponentAdapter();
			}
			@Override
			public Adapter caseMoney(Money object) {
				return createMoneyAdapter();
			}
			@Override
			public Adapter caseNameUse(NameUse object) {
				return createNameUseAdapter();
			}
			@Override
			public Adapter caseNamingSystem(NamingSystem object) {
				return createNamingSystemAdapter();
			}
			@Override
			public Adapter caseNamingSystemIdentifierType(NamingSystemIdentifierType object) {
				return createNamingSystemIdentifierTypeAdapter();
			}
			@Override
			public Adapter caseNamingSystemType(NamingSystemType object) {
				return createNamingSystemTypeAdapter();
			}
			@Override
			public Adapter caseNamingSystemUniqueId(NamingSystemUniqueId object) {
				return createNamingSystemUniqueIdAdapter();
			}
			@Override
			public Adapter caseNarrative(Narrative object) {
				return createNarrativeAdapter();
			}
			@Override
			public Adapter caseNarrativeStatus(NarrativeStatus object) {
				return createNarrativeStatusAdapter();
			}
			@Override
			public Adapter caseNoteType(NoteType object) {
				return createNoteTypeAdapter();
			}
			@Override
			public Adapter caseNutritionIntake(NutritionIntake object) {
				return createNutritionIntakeAdapter();
			}
			@Override
			public Adapter caseNutritionIntakeConsumedItem(NutritionIntakeConsumedItem object) {
				return createNutritionIntakeConsumedItemAdapter();
			}
			@Override
			public Adapter caseNutritionIntakeIngredientLabel(NutritionIntakeIngredientLabel object) {
				return createNutritionIntakeIngredientLabelAdapter();
			}
			@Override
			public Adapter caseNutritionIntakePerformer(NutritionIntakePerformer object) {
				return createNutritionIntakePerformerAdapter();
			}
			@Override
			public Adapter caseNutritionOrder(NutritionOrder object) {
				return createNutritionOrderAdapter();
			}
			@Override
			public Adapter caseNutritionOrderAdditive(NutritionOrderAdditive object) {
				return createNutritionOrderAdditiveAdapter();
			}
			@Override
			public Adapter caseNutritionOrderAdministration(NutritionOrderAdministration object) {
				return createNutritionOrderAdministrationAdapter();
			}
			@Override
			public Adapter caseNutritionOrderEnteralFormula(NutritionOrderEnteralFormula object) {
				return createNutritionOrderEnteralFormulaAdapter();
			}
			@Override
			public Adapter caseNutritionOrderNutrient(NutritionOrderNutrient object) {
				return createNutritionOrderNutrientAdapter();
			}
			@Override
			public Adapter caseNutritionOrderOralDiet(NutritionOrderOralDiet object) {
				return createNutritionOrderOralDietAdapter();
			}
			@Override
			public Adapter caseNutritionOrderSchedule(NutritionOrderSchedule object) {
				return createNutritionOrderScheduleAdapter();
			}
			@Override
			public Adapter caseNutritionOrderSchedule1(NutritionOrderSchedule1 object) {
				return createNutritionOrderSchedule1Adapter();
			}
			@Override
			public Adapter caseNutritionOrderSchedule2(NutritionOrderSchedule2 object) {
				return createNutritionOrderSchedule2Adapter();
			}
			@Override
			public Adapter caseNutritionOrderSupplement(NutritionOrderSupplement object) {
				return createNutritionOrderSupplementAdapter();
			}
			@Override
			public Adapter caseNutritionOrderTexture(NutritionOrderTexture object) {
				return createNutritionOrderTextureAdapter();
			}
			@Override
			public Adapter caseNutritionProduct(NutritionProduct object) {
				return createNutritionProductAdapter();
			}
			@Override
			public Adapter caseNutritionProductCharacteristic(NutritionProductCharacteristic object) {
				return createNutritionProductCharacteristicAdapter();
			}
			@Override
			public Adapter caseNutritionProductIngredient(NutritionProductIngredient object) {
				return createNutritionProductIngredientAdapter();
			}
			@Override
			public Adapter caseNutritionProductInstance(NutritionProductInstance object) {
				return createNutritionProductInstanceAdapter();
			}
			@Override
			public Adapter caseNutritionProductNutrient(NutritionProductNutrient object) {
				return createNutritionProductNutrientAdapter();
			}
			@Override
			public Adapter caseNutritionProductStatus(NutritionProductStatus object) {
				return createNutritionProductStatusAdapter();
			}
			@Override
			public Adapter caseObservation(Observation object) {
				return createObservationAdapter();
			}
			@Override
			public Adapter caseObservationComponent(ObservationComponent object) {
				return createObservationComponentAdapter();
			}
			@Override
			public Adapter caseObservationDataType(ObservationDataType object) {
				return createObservationDataTypeAdapter();
			}
			@Override
			public Adapter caseObservationDefinition(ObservationDefinition object) {
				return createObservationDefinitionAdapter();
			}
			@Override
			public Adapter caseObservationDefinitionComponent(ObservationDefinitionComponent object) {
				return createObservationDefinitionComponentAdapter();
			}
			@Override
			public Adapter caseObservationDefinitionQualifiedValue(ObservationDefinitionQualifiedValue object) {
				return createObservationDefinitionQualifiedValueAdapter();
			}
			@Override
			public Adapter caseObservationRangeCategory(ObservationRangeCategory object) {
				return createObservationRangeCategoryAdapter();
			}
			@Override
			public Adapter caseObservationReferenceRange(ObservationReferenceRange object) {
				return createObservationReferenceRangeAdapter();
			}
			@Override
			public Adapter caseObservationStatus(ObservationStatus object) {
				return createObservationStatusAdapter();
			}
			@Override
			public Adapter caseObservationTriggeredBy(ObservationTriggeredBy object) {
				return createObservationTriggeredByAdapter();
			}
			@Override
			public Adapter caseOid(Oid object) {
				return createOidAdapter();
			}
			@Override
			public Adapter caseOperationDefinition(OperationDefinition object) {
				return createOperationDefinitionAdapter();
			}
			@Override
			public Adapter caseOperationDefinitionBinding(OperationDefinitionBinding object) {
				return createOperationDefinitionBindingAdapter();
			}
			@Override
			public Adapter caseOperationDefinitionOverload(OperationDefinitionOverload object) {
				return createOperationDefinitionOverloadAdapter();
			}
			@Override
			public Adapter caseOperationDefinitionParameter(OperationDefinitionParameter object) {
				return createOperationDefinitionParameterAdapter();
			}
			@Override
			public Adapter caseOperationDefinitionReferencedFrom(OperationDefinitionReferencedFrom object) {
				return createOperationDefinitionReferencedFromAdapter();
			}
			@Override
			public Adapter caseOperationKind(OperationKind object) {
				return createOperationKindAdapter();
			}
			@Override
			public Adapter caseOperationOutcome(OperationOutcome object) {
				return createOperationOutcomeAdapter();
			}
			@Override
			public Adapter caseOperationOutcomeCodes(OperationOutcomeCodes object) {
				return createOperationOutcomeCodesAdapter();
			}
			@Override
			public Adapter caseOperationOutcomeIssue(OperationOutcomeIssue object) {
				return createOperationOutcomeIssueAdapter();
			}
			@Override
			public Adapter caseOperationParameterScope(OperationParameterScope object) {
				return createOperationParameterScopeAdapter();
			}
			@Override
			public Adapter caseOperationParameterUse(OperationParameterUse object) {
				return createOperationParameterUseAdapter();
			}
			@Override
			public Adapter caseOrganization(Organization object) {
				return createOrganizationAdapter();
			}
			@Override
			public Adapter caseOrganizationAffiliation(OrganizationAffiliation object) {
				return createOrganizationAffiliationAdapter();
			}
			@Override
			public Adapter caseOrganizationQualification(OrganizationQualification object) {
				return createOrganizationQualificationAdapter();
			}
			@Override
			public Adapter caseOrientationType(OrientationType object) {
				return createOrientationTypeAdapter();
			}
			@Override
			public Adapter casePackagedProductDefinition(PackagedProductDefinition object) {
				return createPackagedProductDefinitionAdapter();
			}
			@Override
			public Adapter casePackagedProductDefinitionContainedItem(PackagedProductDefinitionContainedItem object) {
				return createPackagedProductDefinitionContainedItemAdapter();
			}
			@Override
			public Adapter casePackagedProductDefinitionLegalStatusOfSupply(PackagedProductDefinitionLegalStatusOfSupply object) {
				return createPackagedProductDefinitionLegalStatusOfSupplyAdapter();
			}
			@Override
			public Adapter casePackagedProductDefinitionPackaging(PackagedProductDefinitionPackaging object) {
				return createPackagedProductDefinitionPackagingAdapter();
			}
			@Override
			public Adapter casePackagedProductDefinitionProperty(PackagedProductDefinitionProperty object) {
				return createPackagedProductDefinitionPropertyAdapter();
			}
			@Override
			public Adapter caseParameterDefinition(ParameterDefinition object) {
				return createParameterDefinitionAdapter();
			}
			@Override
			public Adapter caseParameters(Parameters object) {
				return createParametersAdapter();
			}
			@Override
			public Adapter caseParametersParameter(ParametersParameter object) {
				return createParametersParameterAdapter();
			}
			@Override
			public Adapter caseParticipantResourceTypes(ParticipantResourceTypes object) {
				return createParticipantResourceTypesAdapter();
			}
			@Override
			public Adapter caseParticipationStatus(ParticipationStatus object) {
				return createParticipationStatusAdapter();
			}
			@Override
			public Adapter casePatient(Patient object) {
				return createPatientAdapter();
			}
			@Override
			public Adapter casePatientCommunication(PatientCommunication object) {
				return createPatientCommunicationAdapter();
			}
			@Override
			public Adapter casePatientContact(PatientContact object) {
				return createPatientContactAdapter();
			}
			@Override
			public Adapter casePatientLink(PatientLink object) {
				return createPatientLinkAdapter();
			}
			@Override
			public Adapter casePaymentNotice(PaymentNotice object) {
				return createPaymentNoticeAdapter();
			}
			@Override
			public Adapter casePaymentOutcome(PaymentOutcome object) {
				return createPaymentOutcomeAdapter();
			}
			@Override
			public Adapter casePaymentReconciliation(PaymentReconciliation object) {
				return createPaymentReconciliationAdapter();
			}
			@Override
			public Adapter casePaymentReconciliationAllocation(PaymentReconciliationAllocation object) {
				return createPaymentReconciliationAllocationAdapter();
			}
			@Override
			public Adapter casePaymentReconciliationProcessNote(PaymentReconciliationProcessNote object) {
				return createPaymentReconciliationProcessNoteAdapter();
			}
			@Override
			public Adapter casePeriod(Period object) {
				return createPeriodAdapter();
			}
			@Override
			public Adapter casePermission(Permission object) {
				return createPermissionAdapter();
			}
			@Override
			public Adapter casePermissionActivity(PermissionActivity object) {
				return createPermissionActivityAdapter();
			}
			@Override
			public Adapter casePermissionData(PermissionData object) {
				return createPermissionDataAdapter();
			}
			@Override
			public Adapter casePermissionJustification(PermissionJustification object) {
				return createPermissionJustificationAdapter();
			}
			@Override
			public Adapter casePermissionResource(PermissionResource object) {
				return createPermissionResourceAdapter();
			}
			@Override
			public Adapter casePermissionRule(PermissionRule object) {
				return createPermissionRuleAdapter();
			}
			@Override
			public Adapter casePermissionRuleCombining(PermissionRuleCombining object) {
				return createPermissionRuleCombiningAdapter();
			}
			@Override
			public Adapter casePermissionStatus(PermissionStatus object) {
				return createPermissionStatusAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter casePersonCommunication(PersonCommunication object) {
				return createPersonCommunicationAdapter();
			}
			@Override
			public Adapter casePersonLink(PersonLink object) {
				return createPersonLinkAdapter();
			}
			@Override
			public Adapter casePlanDefinition(PlanDefinition object) {
				return createPlanDefinitionAdapter();
			}
			@Override
			public Adapter casePlanDefinitionAction(PlanDefinitionAction object) {
				return createPlanDefinitionActionAdapter();
			}
			@Override
			public Adapter casePlanDefinitionActor(PlanDefinitionActor object) {
				return createPlanDefinitionActorAdapter();
			}
			@Override
			public Adapter casePlanDefinitionCondition(PlanDefinitionCondition object) {
				return createPlanDefinitionConditionAdapter();
			}
			@Override
			public Adapter casePlanDefinitionDynamicValue(PlanDefinitionDynamicValue object) {
				return createPlanDefinitionDynamicValueAdapter();
			}
			@Override
			public Adapter casePlanDefinitionGoal(PlanDefinitionGoal object) {
				return createPlanDefinitionGoalAdapter();
			}
			@Override
			public Adapter casePlanDefinitionInput(PlanDefinitionInput object) {
				return createPlanDefinitionInputAdapter();
			}
			@Override
			public Adapter casePlanDefinitionOption(PlanDefinitionOption object) {
				return createPlanDefinitionOptionAdapter();
			}
			@Override
			public Adapter casePlanDefinitionOutput(PlanDefinitionOutput object) {
				return createPlanDefinitionOutputAdapter();
			}
			@Override
			public Adapter casePlanDefinitionParticipant(PlanDefinitionParticipant object) {
				return createPlanDefinitionParticipantAdapter();
			}
			@Override
			public Adapter casePlanDefinitionRelatedAction(PlanDefinitionRelatedAction object) {
				return createPlanDefinitionRelatedActionAdapter();
			}
			@Override
			public Adapter casePlanDefinitionTarget(PlanDefinitionTarget object) {
				return createPlanDefinitionTargetAdapter();
			}
			@Override
			public Adapter casePositiveInt(PositiveInt object) {
				return createPositiveIntAdapter();
			}
			@Override
			public Adapter casePractitioner(Practitioner object) {
				return createPractitionerAdapter();
			}
			@Override
			public Adapter casePractitionerCommunication(PractitionerCommunication object) {
				return createPractitionerCommunicationAdapter();
			}
			@Override
			public Adapter casePractitionerQualification(PractitionerQualification object) {
				return createPractitionerQualificationAdapter();
			}
			@Override
			public Adapter casePractitionerRole(PractitionerRole object) {
				return createPractitionerRoleAdapter();
			}
			@Override
			public Adapter casePrimitiveType(PrimitiveType object) {
				return createPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseProcedure(Procedure object) {
				return createProcedureAdapter();
			}
			@Override
			public Adapter caseProcedureFocalDevice(ProcedureFocalDevice object) {
				return createProcedureFocalDeviceAdapter();
			}
			@Override
			public Adapter caseProcedurePerformer(ProcedurePerformer object) {
				return createProcedurePerformerAdapter();
			}
			@Override
			public Adapter caseProductShelfLife(ProductShelfLife object) {
				return createProductShelfLifeAdapter();
			}
			@Override
			public Adapter casePropertyRepresentation(PropertyRepresentation object) {
				return createPropertyRepresentationAdapter();
			}
			@Override
			public Adapter casePropertyType(PropertyType object) {
				return createPropertyTypeAdapter();
			}
			@Override
			public Adapter caseProvenance(Provenance object) {
				return createProvenanceAdapter();
			}
			@Override
			public Adapter caseProvenanceAgent(ProvenanceAgent object) {
				return createProvenanceAgentAdapter();
			}
			@Override
			public Adapter caseProvenanceEntity(ProvenanceEntity object) {
				return createProvenanceEntityAdapter();
			}
			@Override
			public Adapter caseProvenanceEntityRole(ProvenanceEntityRole object) {
				return createProvenanceEntityRoleAdapter();
			}
			@Override
			public Adapter casePublicationStatus(PublicationStatus object) {
				return createPublicationStatusAdapter();
			}
			@Override
			public Adapter caseQuantity(Quantity object) {
				return createQuantityAdapter();
			}
			@Override
			public Adapter caseQuantityComparator(QuantityComparator object) {
				return createQuantityComparatorAdapter();
			}
			@Override
			public Adapter caseQuestionnaire(Questionnaire object) {
				return createQuestionnaireAdapter();
			}
			@Override
			public Adapter caseQuestionnaireAnswerConstraint(QuestionnaireAnswerConstraint object) {
				return createQuestionnaireAnswerConstraintAdapter();
			}
			@Override
			public Adapter caseQuestionnaireAnswerOption(QuestionnaireAnswerOption object) {
				return createQuestionnaireAnswerOptionAdapter();
			}
			@Override
			public Adapter caseQuestionnaireEnableWhen(QuestionnaireEnableWhen object) {
				return createQuestionnaireEnableWhenAdapter();
			}
			@Override
			public Adapter caseQuestionnaireInitial(QuestionnaireInitial object) {
				return createQuestionnaireInitialAdapter();
			}
			@Override
			public Adapter caseQuestionnaireItem(QuestionnaireItem object) {
				return createQuestionnaireItemAdapter();
			}
			@Override
			public Adapter caseQuestionnaireItemDisabledDisplay(QuestionnaireItemDisabledDisplay object) {
				return createQuestionnaireItemDisabledDisplayAdapter();
			}
			@Override
			public Adapter caseQuestionnaireItemOperator(QuestionnaireItemOperator object) {
				return createQuestionnaireItemOperatorAdapter();
			}
			@Override
			public Adapter caseQuestionnaireItemType(QuestionnaireItemType object) {
				return createQuestionnaireItemTypeAdapter();
			}
			@Override
			public Adapter caseQuestionnaireResponse(QuestionnaireResponse object) {
				return createQuestionnaireResponseAdapter();
			}
			@Override
			public Adapter caseQuestionnaireResponseAnswer(QuestionnaireResponseAnswer object) {
				return createQuestionnaireResponseAnswerAdapter();
			}
			@Override
			public Adapter caseQuestionnaireResponseItem(QuestionnaireResponseItem object) {
				return createQuestionnaireResponseItemAdapter();
			}
			@Override
			public Adapter caseQuestionnaireResponseStatus(QuestionnaireResponseStatus object) {
				return createQuestionnaireResponseStatusAdapter();
			}
			@Override
			public Adapter caseRange(Range object) {
				return createRangeAdapter();
			}
			@Override
			public Adapter caseRatio(Ratio object) {
				return createRatioAdapter();
			}
			@Override
			public Adapter caseRatioRange(RatioRange object) {
				return createRatioRangeAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseReferenceHandlingPolicy(ReferenceHandlingPolicy object) {
				return createReferenceHandlingPolicyAdapter();
			}
			@Override
			public Adapter caseReferenceVersionRules(ReferenceVersionRules object) {
				return createReferenceVersionRulesAdapter();
			}
			@Override
			public Adapter caseRegulatedAuthorization(RegulatedAuthorization object) {
				return createRegulatedAuthorizationAdapter();
			}
			@Override
			public Adapter caseRegulatedAuthorizationCase(RegulatedAuthorizationCase object) {
				return createRegulatedAuthorizationCaseAdapter();
			}
			@Override
			public Adapter caseRelatedArtifact(RelatedArtifact object) {
				return createRelatedArtifactAdapter();
			}
			@Override
			public Adapter caseRelatedArtifactType(RelatedArtifactType object) {
				return createRelatedArtifactTypeAdapter();
			}
			@Override
			public Adapter caseRelatedArtifactTypeExpanded(RelatedArtifactTypeExpanded object) {
				return createRelatedArtifactTypeExpandedAdapter();
			}
			@Override
			public Adapter caseRelatedPerson(RelatedPerson object) {
				return createRelatedPersonAdapter();
			}
			@Override
			public Adapter caseRelatedPersonCommunication(RelatedPersonCommunication object) {
				return createRelatedPersonCommunicationAdapter();
			}
			@Override
			public Adapter caseRemittanceOutcome(RemittanceOutcome object) {
				return createRemittanceOutcomeAdapter();
			}
			@Override
			public Adapter caseReportRelationshipType(ReportRelationshipType object) {
				return createReportRelationshipTypeAdapter();
			}
			@Override
			public Adapter caseRequestIntent(RequestIntent object) {
				return createRequestIntentAdapter();
			}
			@Override
			public Adapter caseRequestOrchestration(RequestOrchestration object) {
				return createRequestOrchestrationAdapter();
			}
			@Override
			public Adapter caseRequestOrchestrationAction(RequestOrchestrationAction object) {
				return createRequestOrchestrationActionAdapter();
			}
			@Override
			public Adapter caseRequestOrchestrationCondition(RequestOrchestrationCondition object) {
				return createRequestOrchestrationConditionAdapter();
			}
			@Override
			public Adapter caseRequestOrchestrationDynamicValue(RequestOrchestrationDynamicValue object) {
				return createRequestOrchestrationDynamicValueAdapter();
			}
			@Override
			public Adapter caseRequestOrchestrationInput(RequestOrchestrationInput object) {
				return createRequestOrchestrationInputAdapter();
			}
			@Override
			public Adapter caseRequestOrchestrationOutput(RequestOrchestrationOutput object) {
				return createRequestOrchestrationOutputAdapter();
			}
			@Override
			public Adapter caseRequestOrchestrationParticipant(RequestOrchestrationParticipant object) {
				return createRequestOrchestrationParticipantAdapter();
			}
			@Override
			public Adapter caseRequestOrchestrationRelatedAction(RequestOrchestrationRelatedAction object) {
				return createRequestOrchestrationRelatedActionAdapter();
			}
			@Override
			public Adapter caseRequestPriority(RequestPriority object) {
				return createRequestPriorityAdapter();
			}
			@Override
			public Adapter caseRequestResourceTypes(RequestResourceTypes object) {
				return createRequestResourceTypesAdapter();
			}
			@Override
			public Adapter caseRequestStatus(RequestStatus object) {
				return createRequestStatusAdapter();
			}
			@Override
			public Adapter caseRequirements(Requirements object) {
				return createRequirementsAdapter();
			}
			@Override
			public Adapter caseRequirementsStatement(RequirementsStatement object) {
				return createRequirementsStatementAdapter();
			}
			@Override
			public Adapter caseResearchStudy(ResearchStudy object) {
				return createResearchStudyAdapter();
			}
			@Override
			public Adapter caseResearchStudyAssociatedParty(ResearchStudyAssociatedParty object) {
				return createResearchStudyAssociatedPartyAdapter();
			}
			@Override
			public Adapter caseResearchStudyComparisonGroup(ResearchStudyComparisonGroup object) {
				return createResearchStudyComparisonGroupAdapter();
			}
			@Override
			public Adapter caseResearchStudyLabel(ResearchStudyLabel object) {
				return createResearchStudyLabelAdapter();
			}
			@Override
			public Adapter caseResearchStudyObjective(ResearchStudyObjective object) {
				return createResearchStudyObjectiveAdapter();
			}
			@Override
			public Adapter caseResearchStudyOutcomeMeasure(ResearchStudyOutcomeMeasure object) {
				return createResearchStudyOutcomeMeasureAdapter();
			}
			@Override
			public Adapter caseResearchStudyProgressStatus(ResearchStudyProgressStatus object) {
				return createResearchStudyProgressStatusAdapter();
			}
			@Override
			public Adapter caseResearchStudyRecruitment(ResearchStudyRecruitment object) {
				return createResearchStudyRecruitmentAdapter();
			}
			@Override
			public Adapter caseResearchSubject(ResearchSubject object) {
				return createResearchSubjectAdapter();
			}
			@Override
			public Adapter caseResearchSubjectProgress(ResearchSubjectProgress object) {
				return createResearchSubjectProgressAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseResourceContainer(ResourceContainer object) {
				return createResourceContainerAdapter();
			}
			@Override
			public Adapter caseResourceType(ResourceType object) {
				return createResourceTypeAdapter();
			}
			@Override
			public Adapter caseResourceVersionPolicy(ResourceVersionPolicy object) {
				return createResourceVersionPolicyAdapter();
			}
			@Override
			public Adapter caseResponseType(ResponseType object) {
				return createResponseTypeAdapter();
			}
			@Override
			public Adapter caseRestfulCapabilityMode(RestfulCapabilityMode object) {
				return createRestfulCapabilityModeAdapter();
			}
			@Override
			public Adapter caseRiskAssessment(RiskAssessment object) {
				return createRiskAssessmentAdapter();
			}
			@Override
			public Adapter caseRiskAssessmentPrediction(RiskAssessmentPrediction object) {
				return createRiskAssessmentPredictionAdapter();
			}
			@Override
			public Adapter caseSampledData(SampledData object) {
				return createSampledDataAdapter();
			}
			@Override
			public Adapter caseSampledDataDataType(SampledDataDataType object) {
				return createSampledDataDataTypeAdapter();
			}
			@Override
			public Adapter caseSchedule(Schedule object) {
				return createScheduleAdapter();
			}
			@Override
			public Adapter caseSearchComparator(SearchComparator object) {
				return createSearchComparatorAdapter();
			}
			@Override
			public Adapter caseSearchEntryMode(SearchEntryMode object) {
				return createSearchEntryModeAdapter();
			}
			@Override
			public Adapter caseSearchModifierCode(SearchModifierCode object) {
				return createSearchModifierCodeAdapter();
			}
			@Override
			public Adapter caseSearchParameter(SearchParameter object) {
				return createSearchParameterAdapter();
			}
			@Override
			public Adapter caseSearchParameterComponent(SearchParameterComponent object) {
				return createSearchParameterComponentAdapter();
			}
			@Override
			public Adapter caseSearchParamType(SearchParamType object) {
				return createSearchParamTypeAdapter();
			}
			@Override
			public Adapter caseSearchProcessingModeType(SearchProcessingModeType object) {
				return createSearchProcessingModeTypeAdapter();
			}
			@Override
			public Adapter caseSequenceType(SequenceType object) {
				return createSequenceTypeAdapter();
			}
			@Override
			public Adapter caseServiceRequest(ServiceRequest object) {
				return createServiceRequestAdapter();
			}
			@Override
			public Adapter caseServiceRequestOrderDetail(ServiceRequestOrderDetail object) {
				return createServiceRequestOrderDetailAdapter();
			}
			@Override
			public Adapter caseServiceRequestParameter(ServiceRequestParameter object) {
				return createServiceRequestParameterAdapter();
			}
			@Override
			public Adapter caseServiceRequestPatientInstruction(ServiceRequestPatientInstruction object) {
				return createServiceRequestPatientInstructionAdapter();
			}
			@Override
			public Adapter caseSignature(Signature object) {
				return createSignatureAdapter();
			}
			@Override
			public Adapter caseSlicingRules(SlicingRules object) {
				return createSlicingRulesAdapter();
			}
			@Override
			public Adapter caseSlot(Slot object) {
				return createSlotAdapter();
			}
			@Override
			public Adapter caseSlotStatus(SlotStatus object) {
				return createSlotStatusAdapter();
			}
			@Override
			public Adapter caseSortDirection(SortDirection object) {
				return createSortDirectionAdapter();
			}
			@Override
			public Adapter caseSPDXLicense(SPDXLicense object) {
				return createSPDXLicenseAdapter();
			}
			@Override
			public Adapter caseSpecimen(Specimen object) {
				return createSpecimenAdapter();
			}
			@Override
			public Adapter caseSpecimenCollection(SpecimenCollection object) {
				return createSpecimenCollectionAdapter();
			}
			@Override
			public Adapter caseSpecimenCombined(SpecimenCombined object) {
				return createSpecimenCombinedAdapter();
			}
			@Override
			public Adapter caseSpecimenContainedPreference(SpecimenContainedPreference object) {
				return createSpecimenContainedPreferenceAdapter();
			}
			@Override
			public Adapter caseSpecimenContainer(SpecimenContainer object) {
				return createSpecimenContainerAdapter();
			}
			@Override
			public Adapter caseSpecimenDefinition(SpecimenDefinition object) {
				return createSpecimenDefinitionAdapter();
			}
			@Override
			public Adapter caseSpecimenDefinitionAdditive(SpecimenDefinitionAdditive object) {
				return createSpecimenDefinitionAdditiveAdapter();
			}
			@Override
			public Adapter caseSpecimenDefinitionContainer(SpecimenDefinitionContainer object) {
				return createSpecimenDefinitionContainerAdapter();
			}
			@Override
			public Adapter caseSpecimenDefinitionHandling(SpecimenDefinitionHandling object) {
				return createSpecimenDefinitionHandlingAdapter();
			}
			@Override
			public Adapter caseSpecimenDefinitionTypeTested(SpecimenDefinitionTypeTested object) {
				return createSpecimenDefinitionTypeTestedAdapter();
			}
			@Override
			public Adapter caseSpecimenFeature(SpecimenFeature object) {
				return createSpecimenFeatureAdapter();
			}
			@Override
			public Adapter caseSpecimenProcessing(SpecimenProcessing object) {
				return createSpecimenProcessingAdapter();
			}
			@Override
			public Adapter caseSpecimenStatus(SpecimenStatus object) {
				return createSpecimenStatusAdapter();
			}
			@Override
			public Adapter caseStrandType(StrandType object) {
				return createStrandTypeAdapter();
			}
			@Override
			public Adapter caseString(org.hl7.fhir.String object) {
				return createStringAdapter();
			}
			@Override
			public Adapter caseStructureDefinition(StructureDefinition object) {
				return createStructureDefinitionAdapter();
			}
			@Override
			public Adapter caseStructureDefinitionContext(StructureDefinitionContext object) {
				return createStructureDefinitionContextAdapter();
			}
			@Override
			public Adapter caseStructureDefinitionDifferential(StructureDefinitionDifferential object) {
				return createStructureDefinitionDifferentialAdapter();
			}
			@Override
			public Adapter caseStructureDefinitionKind(StructureDefinitionKind object) {
				return createStructureDefinitionKindAdapter();
			}
			@Override
			public Adapter caseStructureDefinitionMapping(StructureDefinitionMapping object) {
				return createStructureDefinitionMappingAdapter();
			}
			@Override
			public Adapter caseStructureDefinitionSnapshot(StructureDefinitionSnapshot object) {
				return createStructureDefinitionSnapshotAdapter();
			}
			@Override
			public Adapter caseStructureMap(StructureMap object) {
				return createStructureMapAdapter();
			}
			@Override
			public Adapter caseStructureMapConst(StructureMapConst object) {
				return createStructureMapConstAdapter();
			}
			@Override
			public Adapter caseStructureMapDependent(StructureMapDependent object) {
				return createStructureMapDependentAdapter();
			}
			@Override
			public Adapter caseStructureMapGroup(StructureMapGroup object) {
				return createStructureMapGroupAdapter();
			}
			@Override
			public Adapter caseStructureMapGroupTypeMode(StructureMapGroupTypeMode object) {
				return createStructureMapGroupTypeModeAdapter();
			}
			@Override
			public Adapter caseStructureMapInput(StructureMapInput object) {
				return createStructureMapInputAdapter();
			}
			@Override
			public Adapter caseStructureMapInputMode(StructureMapInputMode object) {
				return createStructureMapInputModeAdapter();
			}
			@Override
			public Adapter caseStructureMapModelMode(StructureMapModelMode object) {
				return createStructureMapModelModeAdapter();
			}
			@Override
			public Adapter caseStructureMapParameter(StructureMapParameter object) {
				return createStructureMapParameterAdapter();
			}
			@Override
			public Adapter caseStructureMapRule(StructureMapRule object) {
				return createStructureMapRuleAdapter();
			}
			@Override
			public Adapter caseStructureMapSource(StructureMapSource object) {
				return createStructureMapSourceAdapter();
			}
			@Override
			public Adapter caseStructureMapSourceListMode(StructureMapSourceListMode object) {
				return createStructureMapSourceListModeAdapter();
			}
			@Override
			public Adapter caseStructureMapStructure(StructureMapStructure object) {
				return createStructureMapStructureAdapter();
			}
			@Override
			public Adapter caseStructureMapTarget(StructureMapTarget object) {
				return createStructureMapTargetAdapter();
			}
			@Override
			public Adapter caseStructureMapTargetListMode(StructureMapTargetListMode object) {
				return createStructureMapTargetListModeAdapter();
			}
			@Override
			public Adapter caseStructureMapTransform(StructureMapTransform object) {
				return createStructureMapTransformAdapter();
			}
			@Override
			public Adapter caseSubmitDataUpdateType(SubmitDataUpdateType object) {
				return createSubmitDataUpdateTypeAdapter();
			}
			@Override
			public Adapter caseSubscription(Subscription object) {
				return createSubscriptionAdapter();
			}
			@Override
			public Adapter caseSubscriptionFilterBy(SubscriptionFilterBy object) {
				return createSubscriptionFilterByAdapter();
			}
			@Override
			public Adapter caseSubscriptionNotificationType(SubscriptionNotificationType object) {
				return createSubscriptionNotificationTypeAdapter();
			}
			@Override
			public Adapter caseSubscriptionParameter(SubscriptionParameter object) {
				return createSubscriptionParameterAdapter();
			}
			@Override
			public Adapter caseSubscriptionPayloadContent(SubscriptionPayloadContent object) {
				return createSubscriptionPayloadContentAdapter();
			}
			@Override
			public Adapter caseSubscriptionStatus(SubscriptionStatus object) {
				return createSubscriptionStatusAdapter();
			}
			@Override
			public Adapter caseSubscriptionStatusCodes(SubscriptionStatusCodes object) {
				return createSubscriptionStatusCodesAdapter();
			}
			@Override
			public Adapter caseSubscriptionStatusNotificationEvent(SubscriptionStatusNotificationEvent object) {
				return createSubscriptionStatusNotificationEventAdapter();
			}
			@Override
			public Adapter caseSubscriptionTopic(SubscriptionTopic object) {
				return createSubscriptionTopicAdapter();
			}
			@Override
			public Adapter caseSubscriptionTopicCanFilterBy(SubscriptionTopicCanFilterBy object) {
				return createSubscriptionTopicCanFilterByAdapter();
			}
			@Override
			public Adapter caseSubscriptionTopicEventTrigger(SubscriptionTopicEventTrigger object) {
				return createSubscriptionTopicEventTriggerAdapter();
			}
			@Override
			public Adapter caseSubscriptionTopicNotificationShape(SubscriptionTopicNotificationShape object) {
				return createSubscriptionTopicNotificationShapeAdapter();
			}
			@Override
			public Adapter caseSubscriptionTopicQueryCriteria(SubscriptionTopicQueryCriteria object) {
				return createSubscriptionTopicQueryCriteriaAdapter();
			}
			@Override
			public Adapter caseSubscriptionTopicResourceTrigger(SubscriptionTopicResourceTrigger object) {
				return createSubscriptionTopicResourceTriggerAdapter();
			}
			@Override
			public Adapter caseSubstance(Substance object) {
				return createSubstanceAdapter();
			}
			@Override
			public Adapter caseSubstanceDefinition(SubstanceDefinition object) {
				return createSubstanceDefinitionAdapter();
			}
			@Override
			public Adapter caseSubstanceDefinitionCharacterization(SubstanceDefinitionCharacterization object) {
				return createSubstanceDefinitionCharacterizationAdapter();
			}
			@Override
			public Adapter caseSubstanceDefinitionCode(SubstanceDefinitionCode object) {
				return createSubstanceDefinitionCodeAdapter();
			}
			@Override
			public Adapter caseSubstanceDefinitionMoiety(SubstanceDefinitionMoiety object) {
				return createSubstanceDefinitionMoietyAdapter();
			}
			@Override
			public Adapter caseSubstanceDefinitionMolecularWeight(SubstanceDefinitionMolecularWeight object) {
				return createSubstanceDefinitionMolecularWeightAdapter();
			}
			@Override
			public Adapter caseSubstanceDefinitionName(SubstanceDefinitionName object) {
				return createSubstanceDefinitionNameAdapter();
			}
			@Override
			public Adapter caseSubstanceDefinitionOfficial(SubstanceDefinitionOfficial object) {
				return createSubstanceDefinitionOfficialAdapter();
			}
			@Override
			public Adapter caseSubstanceDefinitionProperty(SubstanceDefinitionProperty object) {
				return createSubstanceDefinitionPropertyAdapter();
			}
			@Override
			public Adapter caseSubstanceDefinitionRelationship(SubstanceDefinitionRelationship object) {
				return createSubstanceDefinitionRelationshipAdapter();
			}
			@Override
			public Adapter caseSubstanceDefinitionRepresentation(SubstanceDefinitionRepresentation object) {
				return createSubstanceDefinitionRepresentationAdapter();
			}
			@Override
			public Adapter caseSubstanceDefinitionSourceMaterial(SubstanceDefinitionSourceMaterial object) {
				return createSubstanceDefinitionSourceMaterialAdapter();
			}
			@Override
			public Adapter caseSubstanceDefinitionStructure(SubstanceDefinitionStructure object) {
				return createSubstanceDefinitionStructureAdapter();
			}
			@Override
			public Adapter caseSubstanceIngredient(SubstanceIngredient object) {
				return createSubstanceIngredientAdapter();
			}
			@Override
			public Adapter caseSubstanceNucleicAcid(SubstanceNucleicAcid object) {
				return createSubstanceNucleicAcidAdapter();
			}
			@Override
			public Adapter caseSubstanceNucleicAcidLinkage(SubstanceNucleicAcidLinkage object) {
				return createSubstanceNucleicAcidLinkageAdapter();
			}
			@Override
			public Adapter caseSubstanceNucleicAcidSubunit(SubstanceNucleicAcidSubunit object) {
				return createSubstanceNucleicAcidSubunitAdapter();
			}
			@Override
			public Adapter caseSubstanceNucleicAcidSugar(SubstanceNucleicAcidSugar object) {
				return createSubstanceNucleicAcidSugarAdapter();
			}
			@Override
			public Adapter caseSubstancePolymer(SubstancePolymer object) {
				return createSubstancePolymerAdapter();
			}
			@Override
			public Adapter caseSubstancePolymerDegreeOfPolymerisation(SubstancePolymerDegreeOfPolymerisation object) {
				return createSubstancePolymerDegreeOfPolymerisationAdapter();
			}
			@Override
			public Adapter caseSubstancePolymerMonomerSet(SubstancePolymerMonomerSet object) {
				return createSubstancePolymerMonomerSetAdapter();
			}
			@Override
			public Adapter caseSubstancePolymerRepeat(SubstancePolymerRepeat object) {
				return createSubstancePolymerRepeatAdapter();
			}
			@Override
			public Adapter caseSubstancePolymerRepeatUnit(SubstancePolymerRepeatUnit object) {
				return createSubstancePolymerRepeatUnitAdapter();
			}
			@Override
			public Adapter caseSubstancePolymerStartingMaterial(SubstancePolymerStartingMaterial object) {
				return createSubstancePolymerStartingMaterialAdapter();
			}
			@Override
			public Adapter caseSubstancePolymerStructuralRepresentation(SubstancePolymerStructuralRepresentation object) {
				return createSubstancePolymerStructuralRepresentationAdapter();
			}
			@Override
			public Adapter caseSubstanceProtein(SubstanceProtein object) {
				return createSubstanceProteinAdapter();
			}
			@Override
			public Adapter caseSubstanceProteinSubunit(SubstanceProteinSubunit object) {
				return createSubstanceProteinSubunitAdapter();
			}
			@Override
			public Adapter caseSubstanceReferenceInformation(SubstanceReferenceInformation object) {
				return createSubstanceReferenceInformationAdapter();
			}
			@Override
			public Adapter caseSubstanceReferenceInformationGene(SubstanceReferenceInformationGene object) {
				return createSubstanceReferenceInformationGeneAdapter();
			}
			@Override
			public Adapter caseSubstanceReferenceInformationGeneElement(SubstanceReferenceInformationGeneElement object) {
				return createSubstanceReferenceInformationGeneElementAdapter();
			}
			@Override
			public Adapter caseSubstanceReferenceInformationTarget(SubstanceReferenceInformationTarget object) {
				return createSubstanceReferenceInformationTargetAdapter();
			}
			@Override
			public Adapter caseSubstanceSourceMaterial(SubstanceSourceMaterial object) {
				return createSubstanceSourceMaterialAdapter();
			}
			@Override
			public Adapter caseSubstanceSourceMaterialAuthor(SubstanceSourceMaterialAuthor object) {
				return createSubstanceSourceMaterialAuthorAdapter();
			}
			@Override
			public Adapter caseSubstanceSourceMaterialFractionDescription(SubstanceSourceMaterialFractionDescription object) {
				return createSubstanceSourceMaterialFractionDescriptionAdapter();
			}
			@Override
			public Adapter caseSubstanceSourceMaterialHybrid(SubstanceSourceMaterialHybrid object) {
				return createSubstanceSourceMaterialHybridAdapter();
			}
			@Override
			public Adapter caseSubstanceSourceMaterialOrganism(SubstanceSourceMaterialOrganism object) {
				return createSubstanceSourceMaterialOrganismAdapter();
			}
			@Override
			public Adapter caseSubstanceSourceMaterialOrganismGeneral(SubstanceSourceMaterialOrganismGeneral object) {
				return createSubstanceSourceMaterialOrganismGeneralAdapter();
			}
			@Override
			public Adapter caseSubstanceSourceMaterialPartDescription(SubstanceSourceMaterialPartDescription object) {
				return createSubstanceSourceMaterialPartDescriptionAdapter();
			}
			@Override
			public Adapter caseSupplyDelivery(SupplyDelivery object) {
				return createSupplyDeliveryAdapter();
			}
			@Override
			public Adapter caseSupplyDeliveryStatus(SupplyDeliveryStatus object) {
				return createSupplyDeliveryStatusAdapter();
			}
			@Override
			public Adapter caseSupplyDeliverySuppliedItem(SupplyDeliverySuppliedItem object) {
				return createSupplyDeliverySuppliedItemAdapter();
			}
			@Override
			public Adapter caseSupplyRequest(SupplyRequest object) {
				return createSupplyRequestAdapter();
			}
			@Override
			public Adapter caseSupplyRequestParameter(SupplyRequestParameter object) {
				return createSupplyRequestParameterAdapter();
			}
			@Override
			public Adapter caseSupplyRequestStatus(SupplyRequestStatus object) {
				return createSupplyRequestStatusAdapter();
			}
			@Override
			public Adapter caseSystemRestfulInteraction(SystemRestfulInteraction object) {
				return createSystemRestfulInteractionAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseTaskInput(TaskInput object) {
				return createTaskInputAdapter();
			}
			@Override
			public Adapter caseTaskIntent(TaskIntent object) {
				return createTaskIntentAdapter();
			}
			@Override
			public Adapter caseTaskOutput(TaskOutput object) {
				return createTaskOutputAdapter();
			}
			@Override
			public Adapter caseTaskPerformer(TaskPerformer object) {
				return createTaskPerformerAdapter();
			}
			@Override
			public Adapter caseTaskRestriction(TaskRestriction object) {
				return createTaskRestrictionAdapter();
			}
			@Override
			public Adapter caseTaskStatus(TaskStatus object) {
				return createTaskStatusAdapter();
			}
			@Override
			public Adapter caseTerminologyCapabilities(TerminologyCapabilities object) {
				return createTerminologyCapabilitiesAdapter();
			}
			@Override
			public Adapter caseTerminologyCapabilitiesClosure(TerminologyCapabilitiesClosure object) {
				return createTerminologyCapabilitiesClosureAdapter();
			}
			@Override
			public Adapter caseTerminologyCapabilitiesCodeSystem(TerminologyCapabilitiesCodeSystem object) {
				return createTerminologyCapabilitiesCodeSystemAdapter();
			}
			@Override
			public Adapter caseTerminologyCapabilitiesExpansion(TerminologyCapabilitiesExpansion object) {
				return createTerminologyCapabilitiesExpansionAdapter();
			}
			@Override
			public Adapter caseTerminologyCapabilitiesFilter(TerminologyCapabilitiesFilter object) {
				return createTerminologyCapabilitiesFilterAdapter();
			}
			@Override
			public Adapter caseTerminologyCapabilitiesImplementation(TerminologyCapabilitiesImplementation object) {
				return createTerminologyCapabilitiesImplementationAdapter();
			}
			@Override
			public Adapter caseTerminologyCapabilitiesParameter(TerminologyCapabilitiesParameter object) {
				return createTerminologyCapabilitiesParameterAdapter();
			}
			@Override
			public Adapter caseTerminologyCapabilitiesSoftware(TerminologyCapabilitiesSoftware object) {
				return createTerminologyCapabilitiesSoftwareAdapter();
			}
			@Override
			public Adapter caseTerminologyCapabilitiesTranslation(TerminologyCapabilitiesTranslation object) {
				return createTerminologyCapabilitiesTranslationAdapter();
			}
			@Override
			public Adapter caseTerminologyCapabilitiesValidateCode(TerminologyCapabilitiesValidateCode object) {
				return createTerminologyCapabilitiesValidateCodeAdapter();
			}
			@Override
			public Adapter caseTerminologyCapabilitiesVersion(TerminologyCapabilitiesVersion object) {
				return createTerminologyCapabilitiesVersionAdapter();
			}
			@Override
			public Adapter caseTestPlan(TestPlan object) {
				return createTestPlanAdapter();
			}
			@Override
			public Adapter caseTestPlanAssertion(TestPlanAssertion object) {
				return createTestPlanAssertionAdapter();
			}
			@Override
			public Adapter caseTestPlanDependency(TestPlanDependency object) {
				return createTestPlanDependencyAdapter();
			}
			@Override
			public Adapter caseTestPlanDependency1(TestPlanDependency1 object) {
				return createTestPlanDependency1Adapter();
			}
			@Override
			public Adapter caseTestPlanScript(TestPlanScript object) {
				return createTestPlanScriptAdapter();
			}
			@Override
			public Adapter caseTestPlanTestCase(TestPlanTestCase object) {
				return createTestPlanTestCaseAdapter();
			}
			@Override
			public Adapter caseTestPlanTestData(TestPlanTestData object) {
				return createTestPlanTestDataAdapter();
			}
			@Override
			public Adapter caseTestPlanTestRun(TestPlanTestRun object) {
				return createTestPlanTestRunAdapter();
			}
			@Override
			public Adapter caseTestReport(TestReport object) {
				return createTestReportAdapter();
			}
			@Override
			public Adapter caseTestReportAction(TestReportAction object) {
				return createTestReportActionAdapter();
			}
			@Override
			public Adapter caseTestReportAction1(TestReportAction1 object) {
				return createTestReportAction1Adapter();
			}
			@Override
			public Adapter caseTestReportAction2(TestReportAction2 object) {
				return createTestReportAction2Adapter();
			}
			@Override
			public Adapter caseTestReportActionResult(TestReportActionResult object) {
				return createTestReportActionResultAdapter();
			}
			@Override
			public Adapter caseTestReportAssert(TestReportAssert object) {
				return createTestReportAssertAdapter();
			}
			@Override
			public Adapter caseTestReportOperation(TestReportOperation object) {
				return createTestReportOperationAdapter();
			}
			@Override
			public Adapter caseTestReportParticipant(TestReportParticipant object) {
				return createTestReportParticipantAdapter();
			}
			@Override
			public Adapter caseTestReportParticipantType(TestReportParticipantType object) {
				return createTestReportParticipantTypeAdapter();
			}
			@Override
			public Adapter caseTestReportRequirement(TestReportRequirement object) {
				return createTestReportRequirementAdapter();
			}
			@Override
			public Adapter caseTestReportResult(TestReportResult object) {
				return createTestReportResultAdapter();
			}
			@Override
			public Adapter caseTestReportSetup(TestReportSetup object) {
				return createTestReportSetupAdapter();
			}
			@Override
			public Adapter caseTestReportStatus(TestReportStatus object) {
				return createTestReportStatusAdapter();
			}
			@Override
			public Adapter caseTestReportTeardown(TestReportTeardown object) {
				return createTestReportTeardownAdapter();
			}
			@Override
			public Adapter caseTestReportTest(TestReportTest object) {
				return createTestReportTestAdapter();
			}
			@Override
			public Adapter caseTestScript(TestScript object) {
				return createTestScriptAdapter();
			}
			@Override
			public Adapter caseTestScriptAction(TestScriptAction object) {
				return createTestScriptActionAdapter();
			}
			@Override
			public Adapter caseTestScriptAction1(TestScriptAction1 object) {
				return createTestScriptAction1Adapter();
			}
			@Override
			public Adapter caseTestScriptAction2(TestScriptAction2 object) {
				return createTestScriptAction2Adapter();
			}
			@Override
			public Adapter caseTestScriptAssert(TestScriptAssert object) {
				return createTestScriptAssertAdapter();
			}
			@Override
			public Adapter caseTestScriptCapability(TestScriptCapability object) {
				return createTestScriptCapabilityAdapter();
			}
			@Override
			public Adapter caseTestScriptDestination(TestScriptDestination object) {
				return createTestScriptDestinationAdapter();
			}
			@Override
			public Adapter caseTestScriptFixture(TestScriptFixture object) {
				return createTestScriptFixtureAdapter();
			}
			@Override
			public Adapter caseTestScriptLink(TestScriptLink object) {
				return createTestScriptLinkAdapter();
			}
			@Override
			public Adapter caseTestScriptMetadata(TestScriptMetadata object) {
				return createTestScriptMetadataAdapter();
			}
			@Override
			public Adapter caseTestScriptOperation(TestScriptOperation object) {
				return createTestScriptOperationAdapter();
			}
			@Override
			public Adapter caseTestScriptOrigin(TestScriptOrigin object) {
				return createTestScriptOriginAdapter();
			}
			@Override
			public Adapter caseTestScriptRequestHeader(TestScriptRequestHeader object) {
				return createTestScriptRequestHeaderAdapter();
			}
			@Override
			public Adapter caseTestScriptRequestMethodCode(TestScriptRequestMethodCode object) {
				return createTestScriptRequestMethodCodeAdapter();
			}
			@Override
			public Adapter caseTestScriptRequirement(TestScriptRequirement object) {
				return createTestScriptRequirementAdapter();
			}
			@Override
			public Adapter caseTestScriptScope(TestScriptScope object) {
				return createTestScriptScopeAdapter();
			}
			@Override
			public Adapter caseTestScriptSetup(TestScriptSetup object) {
				return createTestScriptSetupAdapter();
			}
			@Override
			public Adapter caseTestScriptTeardown(TestScriptTeardown object) {
				return createTestScriptTeardownAdapter();
			}
			@Override
			public Adapter caseTestScriptTest(TestScriptTest object) {
				return createTestScriptTestAdapter();
			}
			@Override
			public Adapter caseTestScriptVariable(TestScriptVariable object) {
				return createTestScriptVariableAdapter();
			}
			@Override
			public Adapter caseTime(Time object) {
				return createTimeAdapter();
			}
			@Override
			public Adapter caseTiming(Timing object) {
				return createTimingAdapter();
			}
			@Override
			public Adapter caseTimingRepeat(TimingRepeat object) {
				return createTimingRepeatAdapter();
			}
			@Override
			public Adapter caseTransport(Transport object) {
				return createTransportAdapter();
			}
			@Override
			public Adapter caseTransportInput(TransportInput object) {
				return createTransportInputAdapter();
			}
			@Override
			public Adapter caseTransportIntent(TransportIntent object) {
				return createTransportIntentAdapter();
			}
			@Override
			public Adapter caseTransportOutput(TransportOutput object) {
				return createTransportOutputAdapter();
			}
			@Override
			public Adapter caseTransportRestriction(TransportRestriction object) {
				return createTransportRestrictionAdapter();
			}
			@Override
			public Adapter caseTransportStatus(TransportStatus object) {
				return createTransportStatusAdapter();
			}
			@Override
			public Adapter caseTriggerDefinition(TriggerDefinition object) {
				return createTriggerDefinitionAdapter();
			}
			@Override
			public Adapter caseTriggeredBytype(TriggeredBytype object) {
				return createTriggeredBytypeAdapter();
			}
			@Override
			public Adapter caseTriggerType(TriggerType object) {
				return createTriggerTypeAdapter();
			}
			@Override
			public Adapter caseTypeDerivationRule(TypeDerivationRule object) {
				return createTypeDerivationRuleAdapter();
			}
			@Override
			public Adapter caseTypeRestfulInteraction(TypeRestfulInteraction object) {
				return createTypeRestfulInteractionAdapter();
			}
			@Override
			public Adapter caseUDIEntryType(UDIEntryType object) {
				return createUDIEntryTypeAdapter();
			}
			@Override
			public Adapter caseUnitsOfTime(UnitsOfTime object) {
				return createUnitsOfTimeAdapter();
			}
			@Override
			public Adapter caseUnsignedInt(UnsignedInt object) {
				return createUnsignedIntAdapter();
			}
			@Override
			public Adapter caseUri(Uri object) {
				return createUriAdapter();
			}
			@Override
			public Adapter caseUrl(Url object) {
				return createUrlAdapter();
			}
			@Override
			public Adapter caseUsageContext(UsageContext object) {
				return createUsageContextAdapter();
			}
			@Override
			public Adapter caseUse(Use object) {
				return createUseAdapter();
			}
			@Override
			public Adapter caseUuid(Uuid object) {
				return createUuidAdapter();
			}
			@Override
			public Adapter caseValueSet(ValueSet object) {
				return createValueSetAdapter();
			}
			@Override
			public Adapter caseValueSetCompose(ValueSetCompose object) {
				return createValueSetComposeAdapter();
			}
			@Override
			public Adapter caseValueSetConcept(ValueSetConcept object) {
				return createValueSetConceptAdapter();
			}
			@Override
			public Adapter caseValueSetContains(ValueSetContains object) {
				return createValueSetContainsAdapter();
			}
			@Override
			public Adapter caseValueSetDesignation(ValueSetDesignation object) {
				return createValueSetDesignationAdapter();
			}
			@Override
			public Adapter caseValueSetExpansion(ValueSetExpansion object) {
				return createValueSetExpansionAdapter();
			}
			@Override
			public Adapter caseValueSetFilter(ValueSetFilter object) {
				return createValueSetFilterAdapter();
			}
			@Override
			public Adapter caseValueSetInclude(ValueSetInclude object) {
				return createValueSetIncludeAdapter();
			}
			@Override
			public Adapter caseValueSetParameter(ValueSetParameter object) {
				return createValueSetParameterAdapter();
			}
			@Override
			public Adapter caseValueSetProperty(ValueSetProperty object) {
				return createValueSetPropertyAdapter();
			}
			@Override
			public Adapter caseValueSetProperty1(ValueSetProperty1 object) {
				return createValueSetProperty1Adapter();
			}
			@Override
			public Adapter caseValueSetScope(ValueSetScope object) {
				return createValueSetScopeAdapter();
			}
			@Override
			public Adapter caseValueSetSubProperty(ValueSetSubProperty object) {
				return createValueSetSubPropertyAdapter();
			}
			@Override
			public Adapter caseVerificationResult(VerificationResult object) {
				return createVerificationResultAdapter();
			}
			@Override
			public Adapter caseVerificationResultAttestation(VerificationResultAttestation object) {
				return createVerificationResultAttestationAdapter();
			}
			@Override
			public Adapter caseVerificationResultPrimarySource(VerificationResultPrimarySource object) {
				return createVerificationResultPrimarySourceAdapter();
			}
			@Override
			public Adapter caseVerificationResultStatus(VerificationResultStatus object) {
				return createVerificationResultStatusAdapter();
			}
			@Override
			public Adapter caseVerificationResultValidator(VerificationResultValidator object) {
				return createVerificationResultValidatorAdapter();
			}
			@Override
			public Adapter caseVersionIndependentResourceTypesAll(VersionIndependentResourceTypesAll object) {
				return createVersionIndependentResourceTypesAllAdapter();
			}
			@Override
			public Adapter caseVirtualServiceDetail(VirtualServiceDetail object) {
				return createVirtualServiceDetailAdapter();
			}
			@Override
			public Adapter caseVisionBase(VisionBase object) {
				return createVisionBaseAdapter();
			}
			@Override
			public Adapter caseVisionEyes(VisionEyes object) {
				return createVisionEyesAdapter();
			}
			@Override
			public Adapter caseVisionPrescription(VisionPrescription object) {
				return createVisionPrescriptionAdapter();
			}
			@Override
			public Adapter caseVisionPrescriptionLensSpecification(VisionPrescriptionLensSpecification object) {
				return createVisionPrescriptionLensSpecificationAdapter();
			}
			@Override
			public Adapter caseVisionPrescriptionPrism(VisionPrescriptionPrism object) {
				return createVisionPrescriptionPrismAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Account
	 * @generated
	 */
	public Adapter createAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AccountBalance <em>Account Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AccountBalance
	 * @generated
	 */
	public Adapter createAccountBalanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AccountCoverage <em>Account Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AccountCoverage
	 * @generated
	 */
	public Adapter createAccountCoverageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AccountDiagnosis <em>Account Diagnosis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AccountDiagnosis
	 * @generated
	 */
	public Adapter createAccountDiagnosisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AccountGuarantor <em>Account Guarantor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AccountGuarantor
	 * @generated
	 */
	public Adapter createAccountGuarantorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AccountProcedure <em>Account Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AccountProcedure
	 * @generated
	 */
	public Adapter createAccountProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AccountRelatedAccount <em>Account Related Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AccountRelatedAccount
	 * @generated
	 */
	public Adapter createAccountRelatedAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AccountStatus <em>Account Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AccountStatus
	 * @generated
	 */
	public Adapter createAccountStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ActionCardinalityBehavior <em>Action Cardinality Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ActionCardinalityBehavior
	 * @generated
	 */
	public Adapter createActionCardinalityBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ActionConditionKind <em>Action Condition Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ActionConditionKind
	 * @generated
	 */
	public Adapter createActionConditionKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ActionGroupingBehavior <em>Action Grouping Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ActionGroupingBehavior
	 * @generated
	 */
	public Adapter createActionGroupingBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ActionParticipantType <em>Action Participant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ActionParticipantType
	 * @generated
	 */
	public Adapter createActionParticipantTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ActionPrecheckBehavior <em>Action Precheck Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ActionPrecheckBehavior
	 * @generated
	 */
	public Adapter createActionPrecheckBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ActionRelationshipType <em>Action Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ActionRelationshipType
	 * @generated
	 */
	public Adapter createActionRelationshipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ActionRequiredBehavior <em>Action Required Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ActionRequiredBehavior
	 * @generated
	 */
	public Adapter createActionRequiredBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ActionSelectionBehavior <em>Action Selection Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ActionSelectionBehavior
	 * @generated
	 */
	public Adapter createActionSelectionBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ActivityDefinition <em>Activity Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ActivityDefinition
	 * @generated
	 */
	public Adapter createActivityDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ActivityDefinitionDynamicValue <em>Activity Definition Dynamic Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ActivityDefinitionDynamicValue
	 * @generated
	 */
	public Adapter createActivityDefinitionDynamicValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ActivityDefinitionParticipant <em>Activity Definition Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ActivityDefinitionParticipant
	 * @generated
	 */
	public Adapter createActivityDefinitionParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ActorDefinition <em>Actor Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ActorDefinition
	 * @generated
	 */
	public Adapter createActorDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Address
	 * @generated
	 */
	public Adapter createAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AddressType
	 * @generated
	 */
	public Adapter createAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AddressUse <em>Address Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AddressUse
	 * @generated
	 */
	public Adapter createAddressUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AdministrableProductDefinition <em>Administrable Product Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AdministrableProductDefinition
	 * @generated
	 */
	public Adapter createAdministrableProductDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AdministrableProductDefinitionProperty <em>Administrable Product Definition Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AdministrableProductDefinitionProperty
	 * @generated
	 */
	public Adapter createAdministrableProductDefinitionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AdministrableProductDefinitionRouteOfAdministration <em>Administrable Product Definition Route Of Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AdministrableProductDefinitionRouteOfAdministration
	 * @generated
	 */
	public Adapter createAdministrableProductDefinitionRouteOfAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AdministrableProductDefinitionTargetSpecies <em>Administrable Product Definition Target Species</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AdministrableProductDefinitionTargetSpecies
	 * @generated
	 */
	public Adapter createAdministrableProductDefinitionTargetSpeciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AdministrableProductDefinitionWithdrawalPeriod <em>Administrable Product Definition Withdrawal Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AdministrableProductDefinitionWithdrawalPeriod
	 * @generated
	 */
	public Adapter createAdministrableProductDefinitionWithdrawalPeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AdministrativeGender <em>Administrative Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AdministrativeGender
	 * @generated
	 */
	public Adapter createAdministrativeGenderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AdverseEvent <em>Adverse Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AdverseEvent
	 * @generated
	 */
	public Adapter createAdverseEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AdverseEventActuality <em>Adverse Event Actuality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AdverseEventActuality
	 * @generated
	 */
	public Adapter createAdverseEventActualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AdverseEventCausality <em>Adverse Event Causality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AdverseEventCausality
	 * @generated
	 */
	public Adapter createAdverseEventCausalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AdverseEventContributingFactor <em>Adverse Event Contributing Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AdverseEventContributingFactor
	 * @generated
	 */
	public Adapter createAdverseEventContributingFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AdverseEventMitigatingAction <em>Adverse Event Mitigating Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AdverseEventMitigatingAction
	 * @generated
	 */
	public Adapter createAdverseEventMitigatingActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AdverseEventParticipant <em>Adverse Event Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AdverseEventParticipant
	 * @generated
	 */
	public Adapter createAdverseEventParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AdverseEventPreventiveAction <em>Adverse Event Preventive Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AdverseEventPreventiveAction
	 * @generated
	 */
	public Adapter createAdverseEventPreventiveActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AdverseEventStatus <em>Adverse Event Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AdverseEventStatus
	 * @generated
	 */
	public Adapter createAdverseEventStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AdverseEventSupportingInfo <em>Adverse Event Supporting Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AdverseEventSupportingInfo
	 * @generated
	 */
	public Adapter createAdverseEventSupportingInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AdverseEventSuspectEntity <em>Adverse Event Suspect Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AdverseEventSuspectEntity
	 * @generated
	 */
	public Adapter createAdverseEventSuspectEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Age <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Age
	 * @generated
	 */
	public Adapter createAgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AgeUnits <em>Age Units</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AgeUnits
	 * @generated
	 */
	public Adapter createAgeUnitsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AggregationMode <em>Aggregation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AggregationMode
	 * @generated
	 */
	public Adapter createAggregationModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AllergyIntolerance <em>Allergy Intolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AllergyIntolerance
	 * @generated
	 */
	public Adapter createAllergyIntoleranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AllergyIntoleranceCategory <em>Allergy Intolerance Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AllergyIntoleranceCategory
	 * @generated
	 */
	public Adapter createAllergyIntoleranceCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AllergyIntoleranceCriticality <em>Allergy Intolerance Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AllergyIntoleranceCriticality
	 * @generated
	 */
	public Adapter createAllergyIntoleranceCriticalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AllergyIntoleranceParticipant <em>Allergy Intolerance Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AllergyIntoleranceParticipant
	 * @generated
	 */
	public Adapter createAllergyIntoleranceParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AllergyIntoleranceReaction <em>Allergy Intolerance Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AllergyIntoleranceReaction
	 * @generated
	 */
	public Adapter createAllergyIntoleranceReactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AllergyIntoleranceSeverity <em>Allergy Intolerance Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AllergyIntoleranceSeverity
	 * @generated
	 */
	public Adapter createAllergyIntoleranceSeverityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AllResourceTypes <em>All Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AllResourceTypes
	 * @generated
	 */
	public Adapter createAllResourceTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Appointment <em>Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Appointment
	 * @generated
	 */
	public Adapter createAppointmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AppointmentMonthlyTemplate <em>Appointment Monthly Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AppointmentMonthlyTemplate
	 * @generated
	 */
	public Adapter createAppointmentMonthlyTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AppointmentParticipant <em>Appointment Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AppointmentParticipant
	 * @generated
	 */
	public Adapter createAppointmentParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AppointmentRecurrenceTemplate <em>Appointment Recurrence Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AppointmentRecurrenceTemplate
	 * @generated
	 */
	public Adapter createAppointmentRecurrenceTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AppointmentResponse <em>Appointment Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AppointmentResponse
	 * @generated
	 */
	public Adapter createAppointmentResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AppointmentResponseStatus <em>Appointment Response Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AppointmentResponseStatus
	 * @generated
	 */
	public Adapter createAppointmentResponseStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AppointmentStatus <em>Appointment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AppointmentStatus
	 * @generated
	 */
	public Adapter createAppointmentStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AppointmentWeeklyTemplate <em>Appointment Weekly Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AppointmentWeeklyTemplate
	 * @generated
	 */
	public Adapter createAppointmentWeeklyTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AppointmentYearlyTemplate <em>Appointment Yearly Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AppointmentYearlyTemplate
	 * @generated
	 */
	public Adapter createAppointmentYearlyTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ArtifactAssessment <em>Artifact Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ArtifactAssessment
	 * @generated
	 */
	public Adapter createArtifactAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ArtifactAssessmentContent <em>Artifact Assessment Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ArtifactAssessmentContent
	 * @generated
	 */
	public Adapter createArtifactAssessmentContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ArtifactAssessmentDisposition <em>Artifact Assessment Disposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ArtifactAssessmentDisposition
	 * @generated
	 */
	public Adapter createArtifactAssessmentDispositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ArtifactAssessmentInformationType <em>Artifact Assessment Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ArtifactAssessmentInformationType
	 * @generated
	 */
	public Adapter createArtifactAssessmentInformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ArtifactAssessmentWorkflowStatus <em>Artifact Assessment Workflow Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ArtifactAssessmentWorkflowStatus
	 * @generated
	 */
	public Adapter createArtifactAssessmentWorkflowStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AssertionDirectionType <em>Assertion Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AssertionDirectionType
	 * @generated
	 */
	public Adapter createAssertionDirectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AssertionManualCompletionType <em>Assertion Manual Completion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AssertionManualCompletionType
	 * @generated
	 */
	public Adapter createAssertionManualCompletionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AssertionOperatorType <em>Assertion Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AssertionOperatorType
	 * @generated
	 */
	public Adapter createAssertionOperatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AssertionResponseTypes <em>Assertion Response Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AssertionResponseTypes
	 * @generated
	 */
	public Adapter createAssertionResponseTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Attachment
	 * @generated
	 */
	public Adapter createAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AuditEvent <em>Audit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AuditEvent
	 * @generated
	 */
	public Adapter createAuditEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AuditEventAction <em>Audit Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AuditEventAction
	 * @generated
	 */
	public Adapter createAuditEventActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AuditEventAgent <em>Audit Event Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AuditEventAgent
	 * @generated
	 */
	public Adapter createAuditEventAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AuditEventDetail <em>Audit Event Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AuditEventDetail
	 * @generated
	 */
	public Adapter createAuditEventDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AuditEventEntity <em>Audit Event Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AuditEventEntity
	 * @generated
	 */
	public Adapter createAuditEventEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AuditEventOutcome <em>Audit Event Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AuditEventOutcome
	 * @generated
	 */
	public Adapter createAuditEventOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AuditEventSeverity <em>Audit Event Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AuditEventSeverity
	 * @generated
	 */
	public Adapter createAuditEventSeverityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AuditEventSource <em>Audit Event Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AuditEventSource
	 * @generated
	 */
	public Adapter createAuditEventSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Availability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Availability
	 * @generated
	 */
	public Adapter createAvailabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AvailabilityAvailableTime <em>Availability Available Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AvailabilityAvailableTime
	 * @generated
	 */
	public Adapter createAvailabilityAvailableTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.AvailabilityNotAvailableTime <em>Availability Not Available Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.AvailabilityNotAvailableTime
	 * @generated
	 */
	public Adapter createAvailabilityNotAvailableTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BackboneElement <em>Backbone Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BackboneElement
	 * @generated
	 */
	public Adapter createBackboneElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BackboneType <em>Backbone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BackboneType
	 * @generated
	 */
	public Adapter createBackboneTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Base <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Base
	 * @generated
	 */
	public Adapter createBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Base64Binary <em>Base64 Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Base64Binary
	 * @generated
	 */
	public Adapter createBase64BinaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Basic <em>Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Basic
	 * @generated
	 */
	public Adapter createBasicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Binary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Binary
	 * @generated
	 */
	public Adapter createBinaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BindingStrength <em>Binding Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BindingStrength
	 * @generated
	 */
	public Adapter createBindingStrengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BiologicallyDerivedProduct <em>Biologically Derived Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BiologicallyDerivedProduct
	 * @generated
	 */
	public Adapter createBiologicallyDerivedProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BiologicallyDerivedProductCollection <em>Biologically Derived Product Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BiologicallyDerivedProductCollection
	 * @generated
	 */
	public Adapter createBiologicallyDerivedProductCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BiologicallyDerivedProductDispense <em>Biologically Derived Product Dispense</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BiologicallyDerivedProductDispense
	 * @generated
	 */
	public Adapter createBiologicallyDerivedProductDispenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BiologicallyDerivedProductDispenseCodes <em>Biologically Derived Product Dispense Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BiologicallyDerivedProductDispenseCodes
	 * @generated
	 */
	public Adapter createBiologicallyDerivedProductDispenseCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BiologicallyDerivedProductDispensePerformer <em>Biologically Derived Product Dispense Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BiologicallyDerivedProductDispensePerformer
	 * @generated
	 */
	public Adapter createBiologicallyDerivedProductDispensePerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BiologicallyDerivedProductProperty <em>Biologically Derived Product Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BiologicallyDerivedProductProperty
	 * @generated
	 */
	public Adapter createBiologicallyDerivedProductPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BodyStructure <em>Body Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BodyStructure
	 * @generated
	 */
	public Adapter createBodyStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BodyStructureBodyLandmarkOrientation <em>Body Structure Body Landmark Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BodyStructureBodyLandmarkOrientation
	 * @generated
	 */
	public Adapter createBodyStructureBodyLandmarkOrientationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BodyStructureDistanceFromLandmark <em>Body Structure Distance From Landmark</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BodyStructureDistanceFromLandmark
	 * @generated
	 */
	public Adapter createBodyStructureDistanceFromLandmarkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BodyStructureIncludedStructure <em>Body Structure Included Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BodyStructureIncludedStructure
	 * @generated
	 */
	public Adapter createBodyStructureIncludedStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Bundle
	 * @generated
	 */
	public Adapter createBundleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BundleEntry <em>Bundle Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BundleEntry
	 * @generated
	 */
	public Adapter createBundleEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BundleLink <em>Bundle Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BundleLink
	 * @generated
	 */
	public Adapter createBundleLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BundleRequest <em>Bundle Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BundleRequest
	 * @generated
	 */
	public Adapter createBundleRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BundleResponse <em>Bundle Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BundleResponse
	 * @generated
	 */
	public Adapter createBundleResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BundleSearch <em>Bundle Search</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BundleSearch
	 * @generated
	 */
	public Adapter createBundleSearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.BundleType <em>Bundle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.BundleType
	 * @generated
	 */
	public Adapter createBundleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Canonical <em>Canonical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Canonical
	 * @generated
	 */
	public Adapter createCanonicalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CanonicalResource <em>Canonical Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CanonicalResource
	 * @generated
	 */
	public Adapter createCanonicalResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatement <em>Capability Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatement
	 * @generated
	 */
	public Adapter createCapabilityStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementDocument <em>Capability Statement Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementDocument
	 * @generated
	 */
	public Adapter createCapabilityStatementDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementEndpoint <em>Capability Statement Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementEndpoint
	 * @generated
	 */
	public Adapter createCapabilityStatementEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementImplementation <em>Capability Statement Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementImplementation
	 * @generated
	 */
	public Adapter createCapabilityStatementImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementInteraction <em>Capability Statement Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementInteraction
	 * @generated
	 */
	public Adapter createCapabilityStatementInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementInteraction1 <em>Capability Statement Interaction1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementInteraction1
	 * @generated
	 */
	public Adapter createCapabilityStatementInteraction1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementKind <em>Capability Statement Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementKind
	 * @generated
	 */
	public Adapter createCapabilityStatementKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementMessaging <em>Capability Statement Messaging</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementMessaging
	 * @generated
	 */
	public Adapter createCapabilityStatementMessagingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementOperation <em>Capability Statement Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementOperation
	 * @generated
	 */
	public Adapter createCapabilityStatementOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementResource <em>Capability Statement Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementResource
	 * @generated
	 */
	public Adapter createCapabilityStatementResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementRest <em>Capability Statement Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementRest
	 * @generated
	 */
	public Adapter createCapabilityStatementRestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementSearchParam <em>Capability Statement Search Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementSearchParam
	 * @generated
	 */
	public Adapter createCapabilityStatementSearchParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementSecurity <em>Capability Statement Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementSecurity
	 * @generated
	 */
	public Adapter createCapabilityStatementSecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementSoftware <em>Capability Statement Software</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementSoftware
	 * @generated
	 */
	public Adapter createCapabilityStatementSoftwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CapabilityStatementSupportedMessage <em>Capability Statement Supported Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CapabilityStatementSupportedMessage
	 * @generated
	 */
	public Adapter createCapabilityStatementSupportedMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CarePlan <em>Care Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CarePlan
	 * @generated
	 */
	public Adapter createCarePlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CarePlanActivity <em>Care Plan Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CarePlanActivity
	 * @generated
	 */
	public Adapter createCarePlanActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CarePlanIntent <em>Care Plan Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CarePlanIntent
	 * @generated
	 */
	public Adapter createCarePlanIntentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CareTeam <em>Care Team</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CareTeam
	 * @generated
	 */
	public Adapter createCareTeamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CareTeamParticipant <em>Care Team Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CareTeamParticipant
	 * @generated
	 */
	public Adapter createCareTeamParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CareTeamStatus <em>Care Team Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CareTeamStatus
	 * @generated
	 */
	public Adapter createCareTeamStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CharacteristicCombination <em>Characteristic Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CharacteristicCombination
	 * @generated
	 */
	public Adapter createCharacteristicCombinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ChargeItem <em>Charge Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ChargeItem
	 * @generated
	 */
	public Adapter createChargeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ChargeItemDefinition <em>Charge Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ChargeItemDefinition
	 * @generated
	 */
	public Adapter createChargeItemDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ChargeItemDefinitionApplicability <em>Charge Item Definition Applicability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ChargeItemDefinitionApplicability
	 * @generated
	 */
	public Adapter createChargeItemDefinitionApplicabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ChargeItemDefinitionPropertyGroup <em>Charge Item Definition Property Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ChargeItemDefinitionPropertyGroup
	 * @generated
	 */
	public Adapter createChargeItemDefinitionPropertyGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ChargeItemPerformer <em>Charge Item Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ChargeItemPerformer
	 * @generated
	 */
	public Adapter createChargeItemPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ChargeItemStatus <em>Charge Item Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ChargeItemStatus
	 * @generated
	 */
	public Adapter createChargeItemStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Citation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Citation
	 * @generated
	 */
	public Adapter createCitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CitationAbstract <em>Citation Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CitationAbstract
	 * @generated
	 */
	public Adapter createCitationAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CitationCitedArtifact <em>Citation Cited Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CitationCitedArtifact
	 * @generated
	 */
	public Adapter createCitationCitedArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CitationClassification <em>Citation Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CitationClassification
	 * @generated
	 */
	public Adapter createCitationClassificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CitationClassification1 <em>Citation Classification1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CitationClassification1
	 * @generated
	 */
	public Adapter createCitationClassification1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CitationContributionInstance <em>Citation Contribution Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CitationContributionInstance
	 * @generated
	 */
	public Adapter createCitationContributionInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CitationContributorship <em>Citation Contributorship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CitationContributorship
	 * @generated
	 */
	public Adapter createCitationContributorshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CitationEntry <em>Citation Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CitationEntry
	 * @generated
	 */
	public Adapter createCitationEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CitationPart <em>Citation Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CitationPart
	 * @generated
	 */
	public Adapter createCitationPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CitationPublicationForm <em>Citation Publication Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CitationPublicationForm
	 * @generated
	 */
	public Adapter createCitationPublicationFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CitationPublishedIn <em>Citation Published In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CitationPublishedIn
	 * @generated
	 */
	public Adapter createCitationPublishedInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CitationRelatesTo <em>Citation Relates To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CitationRelatesTo
	 * @generated
	 */
	public Adapter createCitationRelatesToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CitationStatusDate <em>Citation Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CitationStatusDate
	 * @generated
	 */
	public Adapter createCitationStatusDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CitationStatusDate1 <em>Citation Status Date1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CitationStatusDate1
	 * @generated
	 */
	public Adapter createCitationStatusDate1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CitationSummary <em>Citation Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CitationSummary
	 * @generated
	 */
	public Adapter createCitationSummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CitationSummary1 <em>Citation Summary1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CitationSummary1
	 * @generated
	 */
	public Adapter createCitationSummary1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CitationTitle <em>Citation Title</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CitationTitle
	 * @generated
	 */
	public Adapter createCitationTitleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CitationVersion <em>Citation Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CitationVersion
	 * @generated
	 */
	public Adapter createCitationVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CitationWebLocation <em>Citation Web Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CitationWebLocation
	 * @generated
	 */
	public Adapter createCitationWebLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Claim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Claim
	 * @generated
	 */
	public Adapter createClaimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimAccident <em>Claim Accident</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimAccident
	 * @generated
	 */
	public Adapter createClaimAccidentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimBodySite <em>Claim Body Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimBodySite
	 * @generated
	 */
	public Adapter createClaimBodySiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimCareTeam <em>Claim Care Team</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimCareTeam
	 * @generated
	 */
	public Adapter createClaimCareTeamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimDetail <em>Claim Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimDetail
	 * @generated
	 */
	public Adapter createClaimDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimDiagnosis <em>Claim Diagnosis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimDiagnosis
	 * @generated
	 */
	public Adapter createClaimDiagnosisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimEvent <em>Claim Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimEvent
	 * @generated
	 */
	public Adapter createClaimEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimInsurance <em>Claim Insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimInsurance
	 * @generated
	 */
	public Adapter createClaimInsuranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimItem <em>Claim Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimItem
	 * @generated
	 */
	public Adapter createClaimItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimPayee <em>Claim Payee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimPayee
	 * @generated
	 */
	public Adapter createClaimPayeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimProcedure <em>Claim Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimProcedure
	 * @generated
	 */
	public Adapter createClaimProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimProcessingCodes <em>Claim Processing Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimProcessingCodes
	 * @generated
	 */
	public Adapter createClaimProcessingCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimRelated <em>Claim Related</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimRelated
	 * @generated
	 */
	public Adapter createClaimRelatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponse <em>Claim Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponse
	 * @generated
	 */
	public Adapter createClaimResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponseAddItem <em>Claim Response Add Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponseAddItem
	 * @generated
	 */
	public Adapter createClaimResponseAddItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponseAdjudication <em>Claim Response Adjudication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponseAdjudication
	 * @generated
	 */
	public Adapter createClaimResponseAdjudicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponseBodySite <em>Claim Response Body Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponseBodySite
	 * @generated
	 */
	public Adapter createClaimResponseBodySiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponseDetail <em>Claim Response Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponseDetail
	 * @generated
	 */
	public Adapter createClaimResponseDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponseDetail1 <em>Claim Response Detail1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponseDetail1
	 * @generated
	 */
	public Adapter createClaimResponseDetail1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponseError <em>Claim Response Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponseError
	 * @generated
	 */
	public Adapter createClaimResponseErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponseEvent <em>Claim Response Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponseEvent
	 * @generated
	 */
	public Adapter createClaimResponseEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponseInsurance <em>Claim Response Insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponseInsurance
	 * @generated
	 */
	public Adapter createClaimResponseInsuranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponseItem <em>Claim Response Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponseItem
	 * @generated
	 */
	public Adapter createClaimResponseItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponsePayment <em>Claim Response Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponsePayment
	 * @generated
	 */
	public Adapter createClaimResponsePaymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponseProcessNote <em>Claim Response Process Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponseProcessNote
	 * @generated
	 */
	public Adapter createClaimResponseProcessNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponseReviewOutcome <em>Claim Response Review Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponseReviewOutcome
	 * @generated
	 */
	public Adapter createClaimResponseReviewOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponseSubDetail <em>Claim Response Sub Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponseSubDetail
	 * @generated
	 */
	public Adapter createClaimResponseSubDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponseSubDetail1 <em>Claim Response Sub Detail1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponseSubDetail1
	 * @generated
	 */
	public Adapter createClaimResponseSubDetail1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimResponseTotal <em>Claim Response Total</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimResponseTotal
	 * @generated
	 */
	public Adapter createClaimResponseTotalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimSubDetail <em>Claim Sub Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimSubDetail
	 * @generated
	 */
	public Adapter createClaimSubDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClaimSupportingInfo <em>Claim Supporting Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClaimSupportingInfo
	 * @generated
	 */
	public Adapter createClaimSupportingInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClinicalImpression <em>Clinical Impression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClinicalImpression
	 * @generated
	 */
	public Adapter createClinicalImpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClinicalImpressionFinding <em>Clinical Impression Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClinicalImpressionFinding
	 * @generated
	 */
	public Adapter createClinicalImpressionFindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClinicalUseDefinition <em>Clinical Use Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClinicalUseDefinition
	 * @generated
	 */
	public Adapter createClinicalUseDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClinicalUseDefinitionContraindication <em>Clinical Use Definition Contraindication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClinicalUseDefinitionContraindication
	 * @generated
	 */
	public Adapter createClinicalUseDefinitionContraindicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClinicalUseDefinitionIndication <em>Clinical Use Definition Indication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClinicalUseDefinitionIndication
	 * @generated
	 */
	public Adapter createClinicalUseDefinitionIndicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClinicalUseDefinitionInteractant <em>Clinical Use Definition Interactant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClinicalUseDefinitionInteractant
	 * @generated
	 */
	public Adapter createClinicalUseDefinitionInteractantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClinicalUseDefinitionInteraction <em>Clinical Use Definition Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClinicalUseDefinitionInteraction
	 * @generated
	 */
	public Adapter createClinicalUseDefinitionInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClinicalUseDefinitionOtherTherapy <em>Clinical Use Definition Other Therapy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClinicalUseDefinitionOtherTherapy
	 * @generated
	 */
	public Adapter createClinicalUseDefinitionOtherTherapyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClinicalUseDefinitionType <em>Clinical Use Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClinicalUseDefinitionType
	 * @generated
	 */
	public Adapter createClinicalUseDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClinicalUseDefinitionUndesirableEffect <em>Clinical Use Definition Undesirable Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClinicalUseDefinitionUndesirableEffect
	 * @generated
	 */
	public Adapter createClinicalUseDefinitionUndesirableEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ClinicalUseDefinitionWarning <em>Clinical Use Definition Warning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ClinicalUseDefinitionWarning
	 * @generated
	 */
	public Adapter createClinicalUseDefinitionWarningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Code
	 * @generated
	 */
	public Adapter createCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CodeableConcept <em>Codeable Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CodeableConcept
	 * @generated
	 */
	public Adapter createCodeableConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CodeableReference <em>Codeable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CodeableReference
	 * @generated
	 */
	public Adapter createCodeableReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CodeSearchSupport <em>Code Search Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CodeSearchSupport
	 * @generated
	 */
	public Adapter createCodeSearchSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CodeSystem <em>Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CodeSystem
	 * @generated
	 */
	public Adapter createCodeSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CodeSystemConcept <em>Code System Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CodeSystemConcept
	 * @generated
	 */
	public Adapter createCodeSystemConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CodeSystemContentMode <em>Code System Content Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CodeSystemContentMode
	 * @generated
	 */
	public Adapter createCodeSystemContentModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CodeSystemDesignation <em>Code System Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CodeSystemDesignation
	 * @generated
	 */
	public Adapter createCodeSystemDesignationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CodeSystemFilter <em>Code System Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CodeSystemFilter
	 * @generated
	 */
	public Adapter createCodeSystemFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CodeSystemHierarchyMeaning <em>Code System Hierarchy Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CodeSystemHierarchyMeaning
	 * @generated
	 */
	public Adapter createCodeSystemHierarchyMeaningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CodeSystemProperty <em>Code System Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CodeSystemProperty
	 * @generated
	 */
	public Adapter createCodeSystemPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CodeSystemProperty1 <em>Code System Property1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CodeSystemProperty1
	 * @generated
	 */
	public Adapter createCodeSystemProperty1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Coding <em>Coding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Coding
	 * @generated
	 */
	public Adapter createCodingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ColorCodesOrRGB <em>Color Codes Or RGB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ColorCodesOrRGB
	 * @generated
	 */
	public Adapter createColorCodesOrRGBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CommonLanguages <em>Common Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CommonLanguages
	 * @generated
	 */
	public Adapter createCommonLanguagesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Communication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Communication
	 * @generated
	 */
	public Adapter createCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CommunicationPayload <em>Communication Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CommunicationPayload
	 * @generated
	 */
	public Adapter createCommunicationPayloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CommunicationRequest <em>Communication Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CommunicationRequest
	 * @generated
	 */
	public Adapter createCommunicationRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CommunicationRequestPayload <em>Communication Request Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CommunicationRequestPayload
	 * @generated
	 */
	public Adapter createCommunicationRequestPayloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CompartmentDefinition <em>Compartment Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CompartmentDefinition
	 * @generated
	 */
	public Adapter createCompartmentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CompartmentDefinitionResource <em>Compartment Definition Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CompartmentDefinitionResource
	 * @generated
	 */
	public Adapter createCompartmentDefinitionResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CompartmentType <em>Compartment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CompartmentType
	 * @generated
	 */
	public Adapter createCompartmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Composition
	 * @generated
	 */
	public Adapter createCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CompositionAttester <em>Composition Attester</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CompositionAttester
	 * @generated
	 */
	public Adapter createCompositionAttesterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CompositionEvent <em>Composition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CompositionEvent
	 * @generated
	 */
	public Adapter createCompositionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CompositionSection <em>Composition Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CompositionSection
	 * @generated
	 */
	public Adapter createCompositionSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CompositionStatus <em>Composition Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CompositionStatus
	 * @generated
	 */
	public Adapter createCompositionStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConceptMap <em>Concept Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConceptMap
	 * @generated
	 */
	public Adapter createConceptMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConceptMapAdditionalAttribute <em>Concept Map Additional Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConceptMapAdditionalAttribute
	 * @generated
	 */
	public Adapter createConceptMapAdditionalAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConceptMapAttributeType <em>Concept Map Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConceptMapAttributeType
	 * @generated
	 */
	public Adapter createConceptMapAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConceptMapDependsOn <em>Concept Map Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConceptMapDependsOn
	 * @generated
	 */
	public Adapter createConceptMapDependsOnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConceptMapElement <em>Concept Map Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConceptMapElement
	 * @generated
	 */
	public Adapter createConceptMapElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConceptMapGroup <em>Concept Map Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConceptMapGroup
	 * @generated
	 */
	public Adapter createConceptMapGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConceptMapGroupUnmappedMode <em>Concept Map Group Unmapped Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConceptMapGroupUnmappedMode
	 * @generated
	 */
	public Adapter createConceptMapGroupUnmappedModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConceptMapProperty <em>Concept Map Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConceptMapProperty
	 * @generated
	 */
	public Adapter createConceptMapPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConceptMapProperty1 <em>Concept Map Property1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConceptMapProperty1
	 * @generated
	 */
	public Adapter createConceptMapProperty1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConceptMapPropertyType <em>Concept Map Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConceptMapPropertyType
	 * @generated
	 */
	public Adapter createConceptMapPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConceptMapRelationship <em>Concept Map Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConceptMapRelationship
	 * @generated
	 */
	public Adapter createConceptMapRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConceptMapTarget <em>Concept Map Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConceptMapTarget
	 * @generated
	 */
	public Adapter createConceptMapTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConceptMapUnmapped <em>Concept Map Unmapped</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConceptMapUnmapped
	 * @generated
	 */
	public Adapter createConceptMapUnmappedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConcreteFHIRTypes <em>Concrete FHIR Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConcreteFHIRTypes
	 * @generated
	 */
	public Adapter createConcreteFHIRTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConditionalDeleteStatus <em>Conditional Delete Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConditionalDeleteStatus
	 * @generated
	 */
	public Adapter createConditionalDeleteStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConditionalReadStatus <em>Conditional Read Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConditionalReadStatus
	 * @generated
	 */
	public Adapter createConditionalReadStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConditionDefinition <em>Condition Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConditionDefinition
	 * @generated
	 */
	public Adapter createConditionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConditionDefinitionMedication <em>Condition Definition Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConditionDefinitionMedication
	 * @generated
	 */
	public Adapter createConditionDefinitionMedicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConditionDefinitionObservation <em>Condition Definition Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConditionDefinitionObservation
	 * @generated
	 */
	public Adapter createConditionDefinitionObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConditionDefinitionPlan <em>Condition Definition Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConditionDefinitionPlan
	 * @generated
	 */
	public Adapter createConditionDefinitionPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConditionDefinitionPrecondition <em>Condition Definition Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConditionDefinitionPrecondition
	 * @generated
	 */
	public Adapter createConditionDefinitionPreconditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConditionDefinitionQuestionnaire <em>Condition Definition Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConditionDefinitionQuestionnaire
	 * @generated
	 */
	public Adapter createConditionDefinitionQuestionnaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConditionParticipant <em>Condition Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConditionParticipant
	 * @generated
	 */
	public Adapter createConditionParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConditionPreconditionType <em>Condition Precondition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConditionPreconditionType
	 * @generated
	 */
	public Adapter createConditionPreconditionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConditionQuestionnairePurpose <em>Condition Questionnaire Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConditionQuestionnairePurpose
	 * @generated
	 */
	public Adapter createConditionQuestionnairePurposeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConditionStage <em>Condition Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConditionStage
	 * @generated
	 */
	public Adapter createConditionStageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConformanceExpectation <em>Conformance Expectation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConformanceExpectation
	 * @generated
	 */
	public Adapter createConformanceExpectationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Consent <em>Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Consent
	 * @generated
	 */
	public Adapter createConsentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConsentActor <em>Consent Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConsentActor
	 * @generated
	 */
	public Adapter createConsentActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConsentData <em>Consent Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConsentData
	 * @generated
	 */
	public Adapter createConsentDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConsentDataMeaning <em>Consent Data Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConsentDataMeaning
	 * @generated
	 */
	public Adapter createConsentDataMeaningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConsentPolicyBasis <em>Consent Policy Basis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConsentPolicyBasis
	 * @generated
	 */
	public Adapter createConsentPolicyBasisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConsentProvision <em>Consent Provision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConsentProvision
	 * @generated
	 */
	public Adapter createConsentProvisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConsentProvisionType <em>Consent Provision Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConsentProvisionType
	 * @generated
	 */
	public Adapter createConsentProvisionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConsentState <em>Consent State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConsentState
	 * @generated
	 */
	public Adapter createConsentStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConsentVerification <em>Consent Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConsentVerification
	 * @generated
	 */
	public Adapter createConsentVerificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ConstraintSeverity <em>Constraint Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ConstraintSeverity
	 * @generated
	 */
	public Adapter createConstraintSeverityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContactDetail <em>Contact Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContactDetail
	 * @generated
	 */
	public Adapter createContactDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContactPoint <em>Contact Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContactPoint
	 * @generated
	 */
	public Adapter createContactPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContactPointSystem <em>Contact Point System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContactPointSystem
	 * @generated
	 */
	public Adapter createContactPointSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContactPointUse <em>Contact Point Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContactPointUse
	 * @generated
	 */
	public Adapter createContactPointUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Contract
	 * @generated
	 */
	public Adapter createContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractAction <em>Contract Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractAction
	 * @generated
	 */
	public Adapter createContractActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractAnswer <em>Contract Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractAnswer
	 * @generated
	 */
	public Adapter createContractAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractAsset <em>Contract Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractAsset
	 * @generated
	 */
	public Adapter createContractAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractContentDefinition <em>Contract Content Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractContentDefinition
	 * @generated
	 */
	public Adapter createContractContentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractContext <em>Contract Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractContext
	 * @generated
	 */
	public Adapter createContractContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractFriendly <em>Contract Friendly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractFriendly
	 * @generated
	 */
	public Adapter createContractFriendlyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractLegal <em>Contract Legal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractLegal
	 * @generated
	 */
	public Adapter createContractLegalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractOffer <em>Contract Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractOffer
	 * @generated
	 */
	public Adapter createContractOfferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractParty <em>Contract Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractParty
	 * @generated
	 */
	public Adapter createContractPartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractResourcePublicationStatusCodes <em>Contract Resource Publication Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractResourcePublicationStatusCodes
	 * @generated
	 */
	public Adapter createContractResourcePublicationStatusCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractResourceStatusCodes <em>Contract Resource Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractResourceStatusCodes
	 * @generated
	 */
	public Adapter createContractResourceStatusCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractRule <em>Contract Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractRule
	 * @generated
	 */
	public Adapter createContractRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractSecurityLabel <em>Contract Security Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractSecurityLabel
	 * @generated
	 */
	public Adapter createContractSecurityLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractSigner <em>Contract Signer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractSigner
	 * @generated
	 */
	public Adapter createContractSignerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractSubject <em>Contract Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractSubject
	 * @generated
	 */
	public Adapter createContractSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractTerm <em>Contract Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractTerm
	 * @generated
	 */
	public Adapter createContractTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContractValuedItem <em>Contract Valued Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContractValuedItem
	 * @generated
	 */
	public Adapter createContractValuedItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Contributor <em>Contributor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Contributor
	 * @generated
	 */
	public Adapter createContributorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ContributorType <em>Contributor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ContributorType
	 * @generated
	 */
	public Adapter createContributorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Count
	 * @generated
	 */
	public Adapter createCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Coverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Coverage
	 * @generated
	 */
	public Adapter createCoverageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CoverageClass <em>Coverage Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CoverageClass
	 * @generated
	 */
	public Adapter createCoverageClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CoverageCostToBeneficiary <em>Coverage Cost To Beneficiary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CoverageCostToBeneficiary
	 * @generated
	 */
	public Adapter createCoverageCostToBeneficiaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CoverageEligibilityRequest <em>Coverage Eligibility Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CoverageEligibilityRequest
	 * @generated
	 */
	public Adapter createCoverageEligibilityRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CoverageEligibilityRequestDiagnosis <em>Coverage Eligibility Request Diagnosis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CoverageEligibilityRequestDiagnosis
	 * @generated
	 */
	public Adapter createCoverageEligibilityRequestDiagnosisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CoverageEligibilityRequestEvent <em>Coverage Eligibility Request Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CoverageEligibilityRequestEvent
	 * @generated
	 */
	public Adapter createCoverageEligibilityRequestEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CoverageEligibilityRequestInsurance <em>Coverage Eligibility Request Insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CoverageEligibilityRequestInsurance
	 * @generated
	 */
	public Adapter createCoverageEligibilityRequestInsuranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CoverageEligibilityRequestItem <em>Coverage Eligibility Request Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CoverageEligibilityRequestItem
	 * @generated
	 */
	public Adapter createCoverageEligibilityRequestItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CoverageEligibilityRequestSupportingInfo <em>Coverage Eligibility Request Supporting Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CoverageEligibilityRequestSupportingInfo
	 * @generated
	 */
	public Adapter createCoverageEligibilityRequestSupportingInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CoverageEligibilityResponse <em>Coverage Eligibility Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CoverageEligibilityResponse
	 * @generated
	 */
	public Adapter createCoverageEligibilityResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CoverageEligibilityResponseBenefit <em>Coverage Eligibility Response Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CoverageEligibilityResponseBenefit
	 * @generated
	 */
	public Adapter createCoverageEligibilityResponseBenefitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CoverageEligibilityResponseError <em>Coverage Eligibility Response Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CoverageEligibilityResponseError
	 * @generated
	 */
	public Adapter createCoverageEligibilityResponseErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CoverageEligibilityResponseEvent <em>Coverage Eligibility Response Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CoverageEligibilityResponseEvent
	 * @generated
	 */
	public Adapter createCoverageEligibilityResponseEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CoverageEligibilityResponseInsurance <em>Coverage Eligibility Response Insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CoverageEligibilityResponseInsurance
	 * @generated
	 */
	public Adapter createCoverageEligibilityResponseInsuranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CoverageEligibilityResponseItem <em>Coverage Eligibility Response Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CoverageEligibilityResponseItem
	 * @generated
	 */
	public Adapter createCoverageEligibilityResponseItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CoverageException <em>Coverage Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CoverageException
	 * @generated
	 */
	public Adapter createCoverageExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CoveragePaymentBy <em>Coverage Payment By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CoveragePaymentBy
	 * @generated
	 */
	public Adapter createCoveragePaymentByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.CriteriaNotExistsBehavior <em>Criteria Not Exists Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.CriteriaNotExistsBehavior
	 * @generated
	 */
	public Adapter createCriteriaNotExistsBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DataRequirement <em>Data Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DataRequirement
	 * @generated
	 */
	public Adapter createDataRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DataRequirementCodeFilter <em>Data Requirement Code Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DataRequirementCodeFilter
	 * @generated
	 */
	public Adapter createDataRequirementCodeFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DataRequirementDateFilter <em>Data Requirement Date Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DataRequirementDateFilter
	 * @generated
	 */
	public Adapter createDataRequirementDateFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DataRequirementSort <em>Data Requirement Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DataRequirementSort
	 * @generated
	 */
	public Adapter createDataRequirementSortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DataRequirementValueFilter <em>Data Requirement Value Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DataRequirementValueFilter
	 * @generated
	 */
	public Adapter createDataRequirementValueFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Date
	 * @generated
	 */
	public Adapter createDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DateTime
	 * @generated
	 */
	public Adapter createDateTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Decimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Decimal
	 * @generated
	 */
	public Adapter createDecimalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DefinitionResourceTypes <em>Definition Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DefinitionResourceTypes
	 * @generated
	 */
	public Adapter createDefinitionResourceTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DetectedIssue <em>Detected Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DetectedIssue
	 * @generated
	 */
	public Adapter createDetectedIssueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DetectedIssueEvidence <em>Detected Issue Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DetectedIssueEvidence
	 * @generated
	 */
	public Adapter createDetectedIssueEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DetectedIssueMitigation <em>Detected Issue Mitigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DetectedIssueMitigation
	 * @generated
	 */
	public Adapter createDetectedIssueMitigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DetectedIssueSeverity <em>Detected Issue Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DetectedIssueSeverity
	 * @generated
	 */
	public Adapter createDetectedIssueSeverityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DetectedIssueStatus <em>Detected Issue Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DetectedIssueStatus
	 * @generated
	 */
	public Adapter createDetectedIssueStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceAssociation <em>Device Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceAssociation
	 * @generated
	 */
	public Adapter createDeviceAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceAssociationOperation <em>Device Association Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceAssociationOperation
	 * @generated
	 */
	public Adapter createDeviceAssociationOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceConformsTo <em>Device Conforms To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceConformsTo
	 * @generated
	 */
	public Adapter createDeviceConformsToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceCorrectiveActionScope <em>Device Corrective Action Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceCorrectiveActionScope
	 * @generated
	 */
	public Adapter createDeviceCorrectiveActionScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceDefinition <em>Device Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceDefinition
	 * @generated
	 */
	public Adapter createDeviceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceDefinitionChargeItem <em>Device Definition Charge Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceDefinitionChargeItem
	 * @generated
	 */
	public Adapter createDeviceDefinitionChargeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceDefinitionClassification <em>Device Definition Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceDefinitionClassification
	 * @generated
	 */
	public Adapter createDeviceDefinitionClassificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceDefinitionConformsTo <em>Device Definition Conforms To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceDefinitionConformsTo
	 * @generated
	 */
	public Adapter createDeviceDefinitionConformsToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceDefinitionCorrectiveAction <em>Device Definition Corrective Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceDefinitionCorrectiveAction
	 * @generated
	 */
	public Adapter createDeviceDefinitionCorrectiveActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceDefinitionDeviceName <em>Device Definition Device Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceDefinitionDeviceName
	 * @generated
	 */
	public Adapter createDeviceDefinitionDeviceNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceDefinitionDistributor <em>Device Definition Distributor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceDefinitionDistributor
	 * @generated
	 */
	public Adapter createDeviceDefinitionDistributorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceDefinitionGuideline <em>Device Definition Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceDefinitionGuideline
	 * @generated
	 */
	public Adapter createDeviceDefinitionGuidelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceDefinitionHasPart <em>Device Definition Has Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceDefinitionHasPart
	 * @generated
	 */
	public Adapter createDeviceDefinitionHasPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceDefinitionLink <em>Device Definition Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceDefinitionLink
	 * @generated
	 */
	public Adapter createDeviceDefinitionLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceDefinitionMarketDistribution <em>Device Definition Market Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceDefinitionMarketDistribution
	 * @generated
	 */
	public Adapter createDeviceDefinitionMarketDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceDefinitionMaterial <em>Device Definition Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceDefinitionMaterial
	 * @generated
	 */
	public Adapter createDeviceDefinitionMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceDefinitionPackaging <em>Device Definition Packaging</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceDefinitionPackaging
	 * @generated
	 */
	public Adapter createDeviceDefinitionPackagingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceDefinitionProperty <em>Device Definition Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceDefinitionProperty
	 * @generated
	 */
	public Adapter createDeviceDefinitionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceDefinitionRegulatoryIdentifier <em>Device Definition Regulatory Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceDefinitionRegulatoryIdentifier
	 * @generated
	 */
	public Adapter createDeviceDefinitionRegulatoryIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceDefinitionRegulatoryIdentifierType <em>Device Definition Regulatory Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceDefinitionRegulatoryIdentifierType
	 * @generated
	 */
	public Adapter createDeviceDefinitionRegulatoryIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceDefinitionUdiDeviceIdentifier <em>Device Definition Udi Device Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceDefinitionUdiDeviceIdentifier
	 * @generated
	 */
	public Adapter createDeviceDefinitionUdiDeviceIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceDefinitionVersion <em>Device Definition Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceDefinitionVersion
	 * @generated
	 */
	public Adapter createDeviceDefinitionVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceDispense <em>Device Dispense</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceDispense
	 * @generated
	 */
	public Adapter createDeviceDispenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceDispensePerformer <em>Device Dispense Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceDispensePerformer
	 * @generated
	 */
	public Adapter createDeviceDispensePerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceDispenseStatusCodes <em>Device Dispense Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceDispenseStatusCodes
	 * @generated
	 */
	public Adapter createDeviceDispenseStatusCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceMetric <em>Device Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceMetric
	 * @generated
	 */
	public Adapter createDeviceMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceMetricCalibration <em>Device Metric Calibration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceMetricCalibration
	 * @generated
	 */
	public Adapter createDeviceMetricCalibrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceMetricCalibrationState <em>Device Metric Calibration State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceMetricCalibrationState
	 * @generated
	 */
	public Adapter createDeviceMetricCalibrationStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceMetricCalibrationType <em>Device Metric Calibration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceMetricCalibrationType
	 * @generated
	 */
	public Adapter createDeviceMetricCalibrationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceMetricCategory <em>Device Metric Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceMetricCategory
	 * @generated
	 */
	public Adapter createDeviceMetricCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceMetricOperationalStatus <em>Device Metric Operational Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceMetricOperationalStatus
	 * @generated
	 */
	public Adapter createDeviceMetricOperationalStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceName <em>Device Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceName
	 * @generated
	 */
	public Adapter createDeviceNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceNameType <em>Device Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceNameType
	 * @generated
	 */
	public Adapter createDeviceNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceProductionIdentifierInUDI <em>Device Production Identifier In UDI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceProductionIdentifierInUDI
	 * @generated
	 */
	public Adapter createDeviceProductionIdentifierInUDIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceProperty <em>Device Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceProperty
	 * @generated
	 */
	public Adapter createDevicePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceRequest <em>Device Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceRequest
	 * @generated
	 */
	public Adapter createDeviceRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceRequestParameter <em>Device Request Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceRequestParameter
	 * @generated
	 */
	public Adapter createDeviceRequestParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceUdiCarrier <em>Device Udi Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceUdiCarrier
	 * @generated
	 */
	public Adapter createDeviceUdiCarrierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceUsage <em>Device Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceUsage
	 * @generated
	 */
	public Adapter createDeviceUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceUsageAdherence <em>Device Usage Adherence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceUsageAdherence
	 * @generated
	 */
	public Adapter createDeviceUsageAdherenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceUsageStatus <em>Device Usage Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceUsageStatus
	 * @generated
	 */
	public Adapter createDeviceUsageStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DeviceVersion <em>Device Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DeviceVersion
	 * @generated
	 */
	public Adapter createDeviceVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DiagnosticReport <em>Diagnostic Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DiagnosticReport
	 * @generated
	 */
	public Adapter createDiagnosticReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DiagnosticReportMedia <em>Diagnostic Report Media</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DiagnosticReportMedia
	 * @generated
	 */
	public Adapter createDiagnosticReportMediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DiagnosticReportStatus <em>Diagnostic Report Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DiagnosticReportStatus
	 * @generated
	 */
	public Adapter createDiagnosticReportStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DiagnosticReportSupportingInfo <em>Diagnostic Report Supporting Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DiagnosticReportSupportingInfo
	 * @generated
	 */
	public Adapter createDiagnosticReportSupportingInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DiscriminatorType <em>Discriminator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DiscriminatorType
	 * @generated
	 */
	public Adapter createDiscriminatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Distance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Distance
	 * @generated
	 */
	public Adapter createDistanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DocumentMode <em>Document Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DocumentMode
	 * @generated
	 */
	public Adapter createDocumentModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DocumentReference <em>Document Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DocumentReference
	 * @generated
	 */
	public Adapter createDocumentReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DocumentReferenceAttester <em>Document Reference Attester</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DocumentReferenceAttester
	 * @generated
	 */
	public Adapter createDocumentReferenceAttesterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DocumentReferenceContent <em>Document Reference Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DocumentReferenceContent
	 * @generated
	 */
	public Adapter createDocumentReferenceContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DocumentReferenceProfile <em>Document Reference Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DocumentReferenceProfile
	 * @generated
	 */
	public Adapter createDocumentReferenceProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DocumentReferenceRelatesTo <em>Document Reference Relates To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DocumentReferenceRelatesTo
	 * @generated
	 */
	public Adapter createDocumentReferenceRelatesToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DocumentReferenceStatus <em>Document Reference Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DocumentReferenceStatus
	 * @generated
	 */
	public Adapter createDocumentReferenceStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DomainResource <em>Domain Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DomainResource
	 * @generated
	 */
	public Adapter createDomainResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Dosage <em>Dosage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Dosage
	 * @generated
	 */
	public Adapter createDosageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.DosageDoseAndRate <em>Dosage Dose And Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.DosageDoseAndRate
	 * @generated
	 */
	public Adapter createDosageDoseAndRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Duration
	 * @generated
	 */
	public Adapter createDurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ElementDefinition <em>Element Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ElementDefinition
	 * @generated
	 */
	public Adapter createElementDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ElementDefinitionAdditional <em>Element Definition Additional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ElementDefinitionAdditional
	 * @generated
	 */
	public Adapter createElementDefinitionAdditionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ElementDefinitionBase <em>Element Definition Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ElementDefinitionBase
	 * @generated
	 */
	public Adapter createElementDefinitionBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ElementDefinitionBinding <em>Element Definition Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ElementDefinitionBinding
	 * @generated
	 */
	public Adapter createElementDefinitionBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ElementDefinitionConstraint <em>Element Definition Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ElementDefinitionConstraint
	 * @generated
	 */
	public Adapter createElementDefinitionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ElementDefinitionDiscriminator <em>Element Definition Discriminator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ElementDefinitionDiscriminator
	 * @generated
	 */
	public Adapter createElementDefinitionDiscriminatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ElementDefinitionExample <em>Element Definition Example</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ElementDefinitionExample
	 * @generated
	 */
	public Adapter createElementDefinitionExampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ElementDefinitionMapping <em>Element Definition Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ElementDefinitionMapping
	 * @generated
	 */
	public Adapter createElementDefinitionMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ElementDefinitionSlicing <em>Element Definition Slicing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ElementDefinitionSlicing
	 * @generated
	 */
	public Adapter createElementDefinitionSlicingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ElementDefinitionType <em>Element Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ElementDefinitionType
	 * @generated
	 */
	public Adapter createElementDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EligibilityOutcome <em>Eligibility Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EligibilityOutcome
	 * @generated
	 */
	public Adapter createEligibilityOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EligibilityRequestPurpose <em>Eligibility Request Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EligibilityRequestPurpose
	 * @generated
	 */
	public Adapter createEligibilityRequestPurposeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EligibilityResponsePurpose <em>Eligibility Response Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EligibilityResponsePurpose
	 * @generated
	 */
	public Adapter createEligibilityResponsePurposeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EnableWhenBehavior <em>Enable When Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EnableWhenBehavior
	 * @generated
	 */
	public Adapter createEnableWhenBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Encounter <em>Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Encounter
	 * @generated
	 */
	public Adapter createEncounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EncounterAdmission <em>Encounter Admission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EncounterAdmission
	 * @generated
	 */
	public Adapter createEncounterAdmissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EncounterDiagnosis <em>Encounter Diagnosis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EncounterDiagnosis
	 * @generated
	 */
	public Adapter createEncounterDiagnosisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EncounterHistory <em>Encounter History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EncounterHistory
	 * @generated
	 */
	public Adapter createEncounterHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EncounterHistoryLocation <em>Encounter History Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EncounterHistoryLocation
	 * @generated
	 */
	public Adapter createEncounterHistoryLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EncounterLocation <em>Encounter Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EncounterLocation
	 * @generated
	 */
	public Adapter createEncounterLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EncounterLocationStatus <em>Encounter Location Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EncounterLocationStatus
	 * @generated
	 */
	public Adapter createEncounterLocationStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EncounterParticipant <em>Encounter Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EncounterParticipant
	 * @generated
	 */
	public Adapter createEncounterParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EncounterReason <em>Encounter Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EncounterReason
	 * @generated
	 */
	public Adapter createEncounterReasonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EncounterStatus <em>Encounter Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EncounterStatus
	 * @generated
	 */
	public Adapter createEncounterStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Endpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Endpoint
	 * @generated
	 */
	public Adapter createEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EndpointPayload <em>Endpoint Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EndpointPayload
	 * @generated
	 */
	public Adapter createEndpointPayloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EndpointStatus <em>Endpoint Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EndpointStatus
	 * @generated
	 */
	public Adapter createEndpointStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EnrollmentOutcome <em>Enrollment Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EnrollmentOutcome
	 * @generated
	 */
	public Adapter createEnrollmentOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EnrollmentRequest <em>Enrollment Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EnrollmentRequest
	 * @generated
	 */
	public Adapter createEnrollmentRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EnrollmentResponse <em>Enrollment Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EnrollmentResponse
	 * @generated
	 */
	public Adapter createEnrollmentResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EpisodeOfCare <em>Episode Of Care</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EpisodeOfCare
	 * @generated
	 */
	public Adapter createEpisodeOfCareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EpisodeOfCareDiagnosis <em>Episode Of Care Diagnosis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EpisodeOfCareDiagnosis
	 * @generated
	 */
	public Adapter createEpisodeOfCareDiagnosisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EpisodeOfCareReason <em>Episode Of Care Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EpisodeOfCareReason
	 * @generated
	 */
	public Adapter createEpisodeOfCareReasonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EpisodeOfCareStatus <em>Episode Of Care Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EpisodeOfCareStatus
	 * @generated
	 */
	public Adapter createEpisodeOfCareStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EpisodeOfCareStatusHistory <em>Episode Of Care Status History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EpisodeOfCareStatusHistory
	 * @generated
	 */
	public Adapter createEpisodeOfCareStatusHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EventCapabilityMode <em>Event Capability Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EventCapabilityMode
	 * @generated
	 */
	public Adapter createEventCapabilityModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EventDefinition <em>Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EventDefinition
	 * @generated
	 */
	public Adapter createEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EventResourceTypes <em>Event Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EventResourceTypes
	 * @generated
	 */
	public Adapter createEventResourceTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EventStatus <em>Event Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EventStatus
	 * @generated
	 */
	public Adapter createEventStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EventTiming <em>Event Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EventTiming
	 * @generated
	 */
	public Adapter createEventTimingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Evidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Evidence
	 * @generated
	 */
	public Adapter createEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EvidenceAttributeEstimate <em>Evidence Attribute Estimate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EvidenceAttributeEstimate
	 * @generated
	 */
	public Adapter createEvidenceAttributeEstimateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EvidenceCertainty <em>Evidence Certainty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EvidenceCertainty
	 * @generated
	 */
	public Adapter createEvidenceCertaintyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EvidenceModelCharacteristic <em>Evidence Model Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EvidenceModelCharacteristic
	 * @generated
	 */
	public Adapter createEvidenceModelCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EvidenceReport <em>Evidence Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EvidenceReport
	 * @generated
	 */
	public Adapter createEvidenceReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EvidenceReportCharacteristic <em>Evidence Report Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EvidenceReportCharacteristic
	 * @generated
	 */
	public Adapter createEvidenceReportCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EvidenceReportRelatesTo <em>Evidence Report Relates To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EvidenceReportRelatesTo
	 * @generated
	 */
	public Adapter createEvidenceReportRelatesToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EvidenceReportSection <em>Evidence Report Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EvidenceReportSection
	 * @generated
	 */
	public Adapter createEvidenceReportSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EvidenceReportSubject <em>Evidence Report Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EvidenceReportSubject
	 * @generated
	 */
	public Adapter createEvidenceReportSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EvidenceReportTarget <em>Evidence Report Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EvidenceReportTarget
	 * @generated
	 */
	public Adapter createEvidenceReportTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EvidenceSampleSize <em>Evidence Sample Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EvidenceSampleSize
	 * @generated
	 */
	public Adapter createEvidenceSampleSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EvidenceStatistic <em>Evidence Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EvidenceStatistic
	 * @generated
	 */
	public Adapter createEvidenceStatisticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EvidenceVariable <em>Evidence Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EvidenceVariable
	 * @generated
	 */
	public Adapter createEvidenceVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EvidenceVariable1 <em>Evidence Variable1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EvidenceVariable1
	 * @generated
	 */
	public Adapter createEvidenceVariable1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EvidenceVariableCategory <em>Evidence Variable Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EvidenceVariableCategory
	 * @generated
	 */
	public Adapter createEvidenceVariableCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EvidenceVariableCharacteristic <em>Evidence Variable Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EvidenceVariableCharacteristic
	 * @generated
	 */
	public Adapter createEvidenceVariableCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EvidenceVariableDefinition <em>Evidence Variable Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EvidenceVariableDefinition
	 * @generated
	 */
	public Adapter createEvidenceVariableDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EvidenceVariableDefinitionByCombination <em>Evidence Variable Definition By Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EvidenceVariableDefinitionByCombination
	 * @generated
	 */
	public Adapter createEvidenceVariableDefinitionByCombinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EvidenceVariableDefinitionByTypeAndValue <em>Evidence Variable Definition By Type And Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EvidenceVariableDefinitionByTypeAndValue
	 * @generated
	 */
	public Adapter createEvidenceVariableDefinitionByTypeAndValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EvidenceVariableHandling <em>Evidence Variable Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EvidenceVariableHandling
	 * @generated
	 */
	public Adapter createEvidenceVariableHandlingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.EvidenceVariableTimeFromEvent <em>Evidence Variable Time From Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.EvidenceVariableTimeFromEvent
	 * @generated
	 */
	public Adapter createEvidenceVariableTimeFromEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExampleScenario <em>Example Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExampleScenario
	 * @generated
	 */
	public Adapter createExampleScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExampleScenarioActor <em>Example Scenario Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExampleScenarioActor
	 * @generated
	 */
	public Adapter createExampleScenarioActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExampleScenarioActorType <em>Example Scenario Actor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExampleScenarioActorType
	 * @generated
	 */
	public Adapter createExampleScenarioActorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExampleScenarioAlternative <em>Example Scenario Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExampleScenarioAlternative
	 * @generated
	 */
	public Adapter createExampleScenarioAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExampleScenarioContainedInstance <em>Example Scenario Contained Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExampleScenarioContainedInstance
	 * @generated
	 */
	public Adapter createExampleScenarioContainedInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExampleScenarioInstance <em>Example Scenario Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExampleScenarioInstance
	 * @generated
	 */
	public Adapter createExampleScenarioInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExampleScenarioOperation <em>Example Scenario Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExampleScenarioOperation
	 * @generated
	 */
	public Adapter createExampleScenarioOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExampleScenarioProcess <em>Example Scenario Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExampleScenarioProcess
	 * @generated
	 */
	public Adapter createExampleScenarioProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExampleScenarioStep <em>Example Scenario Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExampleScenarioStep
	 * @generated
	 */
	public Adapter createExampleScenarioStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExampleScenarioVersion <em>Example Scenario Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExampleScenarioVersion
	 * @generated
	 */
	public Adapter createExampleScenarioVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefit <em>Explanation Of Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefit
	 * @generated
	 */
	public Adapter createExplanationOfBenefitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitAccident <em>Explanation Of Benefit Accident</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitAccident
	 * @generated
	 */
	public Adapter createExplanationOfBenefitAccidentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitAddItem <em>Explanation Of Benefit Add Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitAddItem
	 * @generated
	 */
	public Adapter createExplanationOfBenefitAddItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitAdjudication <em>Explanation Of Benefit Adjudication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitAdjudication
	 * @generated
	 */
	public Adapter createExplanationOfBenefitAdjudicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitBenefitBalance <em>Explanation Of Benefit Benefit Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitBenefitBalance
	 * @generated
	 */
	public Adapter createExplanationOfBenefitBenefitBalanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitBodySite <em>Explanation Of Benefit Body Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitBodySite
	 * @generated
	 */
	public Adapter createExplanationOfBenefitBodySiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitBodySite1 <em>Explanation Of Benefit Body Site1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitBodySite1
	 * @generated
	 */
	public Adapter createExplanationOfBenefitBodySite1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitCareTeam <em>Explanation Of Benefit Care Team</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitCareTeam
	 * @generated
	 */
	public Adapter createExplanationOfBenefitCareTeamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitDetail <em>Explanation Of Benefit Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitDetail
	 * @generated
	 */
	public Adapter createExplanationOfBenefitDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitDetail1 <em>Explanation Of Benefit Detail1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitDetail1
	 * @generated
	 */
	public Adapter createExplanationOfBenefitDetail1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitDiagnosis <em>Explanation Of Benefit Diagnosis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitDiagnosis
	 * @generated
	 */
	public Adapter createExplanationOfBenefitDiagnosisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitEvent <em>Explanation Of Benefit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitEvent
	 * @generated
	 */
	public Adapter createExplanationOfBenefitEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitFinancial <em>Explanation Of Benefit Financial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitFinancial
	 * @generated
	 */
	public Adapter createExplanationOfBenefitFinancialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitInsurance <em>Explanation Of Benefit Insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitInsurance
	 * @generated
	 */
	public Adapter createExplanationOfBenefitInsuranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitItem <em>Explanation Of Benefit Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitItem
	 * @generated
	 */
	public Adapter createExplanationOfBenefitItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitPayee <em>Explanation Of Benefit Payee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitPayee
	 * @generated
	 */
	public Adapter createExplanationOfBenefitPayeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitPayment <em>Explanation Of Benefit Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitPayment
	 * @generated
	 */
	public Adapter createExplanationOfBenefitPaymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitProcedure <em>Explanation Of Benefit Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitProcedure
	 * @generated
	 */
	public Adapter createExplanationOfBenefitProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitProcessNote <em>Explanation Of Benefit Process Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitProcessNote
	 * @generated
	 */
	public Adapter createExplanationOfBenefitProcessNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitRelated <em>Explanation Of Benefit Related</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitRelated
	 * @generated
	 */
	public Adapter createExplanationOfBenefitRelatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitReviewOutcome <em>Explanation Of Benefit Review Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitReviewOutcome
	 * @generated
	 */
	public Adapter createExplanationOfBenefitReviewOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitStatus <em>Explanation Of Benefit Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitStatus
	 * @generated
	 */
	public Adapter createExplanationOfBenefitStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitSubDetail <em>Explanation Of Benefit Sub Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitSubDetail
	 * @generated
	 */
	public Adapter createExplanationOfBenefitSubDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitSubDetail1 <em>Explanation Of Benefit Sub Detail1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitSubDetail1
	 * @generated
	 */
	public Adapter createExplanationOfBenefitSubDetail1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitSupportingInfo <em>Explanation Of Benefit Supporting Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitSupportingInfo
	 * @generated
	 */
	public Adapter createExplanationOfBenefitSupportingInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExplanationOfBenefitTotal <em>Explanation Of Benefit Total</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExplanationOfBenefitTotal
	 * @generated
	 */
	public Adapter createExplanationOfBenefitTotalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExtendedContactDetail <em>Extended Contact Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExtendedContactDetail
	 * @generated
	 */
	public Adapter createExtendedContactDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Extension
	 * @generated
	 */
	public Adapter createExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ExtensionContextType <em>Extension Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ExtensionContextType
	 * @generated
	 */
	public Adapter createExtensionContextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.FamilyHistoryStatus <em>Family History Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.FamilyHistoryStatus
	 * @generated
	 */
	public Adapter createFamilyHistoryStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.FamilyMemberHistory <em>Family Member History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.FamilyMemberHistory
	 * @generated
	 */
	public Adapter createFamilyMemberHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.FamilyMemberHistoryCondition <em>Family Member History Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.FamilyMemberHistoryCondition
	 * @generated
	 */
	public Adapter createFamilyMemberHistoryConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.FamilyMemberHistoryParticipant <em>Family Member History Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.FamilyMemberHistoryParticipant
	 * @generated
	 */
	public Adapter createFamilyMemberHistoryParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.FamilyMemberHistoryProcedure <em>Family Member History Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.FamilyMemberHistoryProcedure
	 * @generated
	 */
	public Adapter createFamilyMemberHistoryProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.FHIRDeviceStatus <em>FHIR Device Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.FHIRDeviceStatus
	 * @generated
	 */
	public Adapter createFHIRDeviceStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.FHIRPathTypes <em>FHIR Path Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.FHIRPathTypes
	 * @generated
	 */
	public Adapter createFHIRPathTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.FHIRSubstanceStatus <em>FHIR Substance Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.FHIRSubstanceStatus
	 * @generated
	 */
	public Adapter createFHIRSubstanceStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.FHIRTypes <em>FHIR Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.FHIRTypes
	 * @generated
	 */
	public Adapter createFHIRTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.FHIRVersion <em>FHIR Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.FHIRVersion
	 * @generated
	 */
	public Adapter createFHIRVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.FilterOperator <em>Filter Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.FilterOperator
	 * @generated
	 */
	public Adapter createFilterOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.FinancialResourceStatusCodes <em>Financial Resource Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.FinancialResourceStatusCodes
	 * @generated
	 */
	public Adapter createFinancialResourceStatusCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Flag <em>Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Flag
	 * @generated
	 */
	public Adapter createFlagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.FlagStatus <em>Flag Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.FlagStatus
	 * @generated
	 */
	public Adapter createFlagStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.FormularyItem <em>Formulary Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.FormularyItem
	 * @generated
	 */
	public Adapter createFormularyItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.FormularyItemStatusCodes <em>Formulary Item Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.FormularyItemStatusCodes
	 * @generated
	 */
	public Adapter createFormularyItemStatusCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GenomicStudy <em>Genomic Study</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GenomicStudy
	 * @generated
	 */
	public Adapter createGenomicStudyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GenomicStudyAnalysis <em>Genomic Study Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GenomicStudyAnalysis
	 * @generated
	 */
	public Adapter createGenomicStudyAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GenomicStudyDevice <em>Genomic Study Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GenomicStudyDevice
	 * @generated
	 */
	public Adapter createGenomicStudyDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GenomicStudyInput <em>Genomic Study Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GenomicStudyInput
	 * @generated
	 */
	public Adapter createGenomicStudyInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GenomicStudyOutput <em>Genomic Study Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GenomicStudyOutput
	 * @generated
	 */
	public Adapter createGenomicStudyOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GenomicStudyPerformer <em>Genomic Study Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GenomicStudyPerformer
	 * @generated
	 */
	public Adapter createGenomicStudyPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GenomicStudyStatus <em>Genomic Study Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GenomicStudyStatus
	 * @generated
	 */
	public Adapter createGenomicStudyStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Goal
	 * @generated
	 */
	public Adapter createGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GoalLifecycleStatus <em>Goal Lifecycle Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GoalLifecycleStatus
	 * @generated
	 */
	public Adapter createGoalLifecycleStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GoalTarget <em>Goal Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GoalTarget
	 * @generated
	 */
	public Adapter createGoalTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GraphCompartmentRule <em>Graph Compartment Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GraphCompartmentRule
	 * @generated
	 */
	public Adapter createGraphCompartmentRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GraphCompartmentUse <em>Graph Compartment Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GraphCompartmentUse
	 * @generated
	 */
	public Adapter createGraphCompartmentUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GraphDefinition <em>Graph Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GraphDefinition
	 * @generated
	 */
	public Adapter createGraphDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GraphDefinitionCompartment <em>Graph Definition Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GraphDefinitionCompartment
	 * @generated
	 */
	public Adapter createGraphDefinitionCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GraphDefinitionLink <em>Graph Definition Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GraphDefinitionLink
	 * @generated
	 */
	public Adapter createGraphDefinitionLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GraphDefinitionNode <em>Graph Definition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GraphDefinitionNode
	 * @generated
	 */
	public Adapter createGraphDefinitionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GroupCharacteristic <em>Group Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GroupCharacteristic
	 * @generated
	 */
	public Adapter createGroupCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GroupMember <em>Group Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GroupMember
	 * @generated
	 */
	public Adapter createGroupMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GroupMembershipBasis <em>Group Membership Basis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GroupMembershipBasis
	 * @generated
	 */
	public Adapter createGroupMembershipBasisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GroupType <em>Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GroupType
	 * @generated
	 */
	public Adapter createGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GuidanceResponse <em>Guidance Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GuidanceResponse
	 * @generated
	 */
	public Adapter createGuidanceResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GuidanceResponseStatus <em>Guidance Response Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GuidanceResponseStatus
	 * @generated
	 */
	public Adapter createGuidanceResponseStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.GuidePageGeneration <em>Guide Page Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.GuidePageGeneration
	 * @generated
	 */
	public Adapter createGuidePageGenerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.HealthcareService <em>Healthcare Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.HealthcareService
	 * @generated
	 */
	public Adapter createHealthcareServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.HealthcareServiceEligibility <em>Healthcare Service Eligibility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.HealthcareServiceEligibility
	 * @generated
	 */
	public Adapter createHealthcareServiceEligibilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.HTTPVerb <em>HTTP Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.HTTPVerb
	 * @generated
	 */
	public Adapter createHTTPVerbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.HumanName <em>Human Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.HumanName
	 * @generated
	 */
	public Adapter createHumanNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Id <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Id
	 * @generated
	 */
	public Adapter createIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.IdentifierUse <em>Identifier Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.IdentifierUse
	 * @generated
	 */
	public Adapter createIdentifierUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.IdentityAssuranceLevel <em>Identity Assurance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.IdentityAssuranceLevel
	 * @generated
	 */
	public Adapter createIdentityAssuranceLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImagingSelection <em>Imaging Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImagingSelection
	 * @generated
	 */
	public Adapter createImagingSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImagingSelectionDGraphicType <em>Imaging Selection DGraphic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImagingSelectionDGraphicType
	 * @generated
	 */
	public Adapter createImagingSelectionDGraphicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImagingSelectionImageRegion2D <em>Imaging Selection Image Region2 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImagingSelectionImageRegion2D
	 * @generated
	 */
	public Adapter createImagingSelectionImageRegion2DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImagingSelectionImageRegion3D <em>Imaging Selection Image Region3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImagingSelectionImageRegion3D
	 * @generated
	 */
	public Adapter createImagingSelectionImageRegion3DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImagingSelectionInstance <em>Imaging Selection Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImagingSelectionInstance
	 * @generated
	 */
	public Adapter createImagingSelectionInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImagingSelectionPerformer <em>Imaging Selection Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImagingSelectionPerformer
	 * @generated
	 */
	public Adapter createImagingSelectionPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImagingSelectionStatus <em>Imaging Selection Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImagingSelectionStatus
	 * @generated
	 */
	public Adapter createImagingSelectionStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImagingStudy <em>Imaging Study</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImagingStudy
	 * @generated
	 */
	public Adapter createImagingStudyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImagingStudyInstance <em>Imaging Study Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImagingStudyInstance
	 * @generated
	 */
	public Adapter createImagingStudyInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImagingStudyPerformer <em>Imaging Study Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImagingStudyPerformer
	 * @generated
	 */
	public Adapter createImagingStudyPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImagingStudySeries <em>Imaging Study Series</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImagingStudySeries
	 * @generated
	 */
	public Adapter createImagingStudySeriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImagingStudyStatus <em>Imaging Study Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImagingStudyStatus
	 * @generated
	 */
	public Adapter createImagingStudyStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Immunization <em>Immunization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Immunization
	 * @generated
	 */
	public Adapter createImmunizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImmunizationEvaluation <em>Immunization Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImmunizationEvaluation
	 * @generated
	 */
	public Adapter createImmunizationEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImmunizationEvaluationStatusCodes <em>Immunization Evaluation Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImmunizationEvaluationStatusCodes
	 * @generated
	 */
	public Adapter createImmunizationEvaluationStatusCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImmunizationPerformer <em>Immunization Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImmunizationPerformer
	 * @generated
	 */
	public Adapter createImmunizationPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImmunizationProgramEligibility <em>Immunization Program Eligibility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImmunizationProgramEligibility
	 * @generated
	 */
	public Adapter createImmunizationProgramEligibilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImmunizationProtocolApplied <em>Immunization Protocol Applied</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImmunizationProtocolApplied
	 * @generated
	 */
	public Adapter createImmunizationProtocolAppliedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImmunizationReaction <em>Immunization Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImmunizationReaction
	 * @generated
	 */
	public Adapter createImmunizationReactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImmunizationRecommendation <em>Immunization Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImmunizationRecommendation
	 * @generated
	 */
	public Adapter createImmunizationRecommendationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImmunizationRecommendationDateCriterion <em>Immunization Recommendation Date Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImmunizationRecommendationDateCriterion
	 * @generated
	 */
	public Adapter createImmunizationRecommendationDateCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImmunizationRecommendationRecommendation <em>Immunization Recommendation Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImmunizationRecommendationRecommendation
	 * @generated
	 */
	public Adapter createImmunizationRecommendationRecommendationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImmunizationStatusCodes <em>Immunization Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImmunizationStatusCodes
	 * @generated
	 */
	public Adapter createImmunizationStatusCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImplementationGuide <em>Implementation Guide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImplementationGuide
	 * @generated
	 */
	public Adapter createImplementationGuideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImplementationGuideDefinition <em>Implementation Guide Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImplementationGuideDefinition
	 * @generated
	 */
	public Adapter createImplementationGuideDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImplementationGuideDependsOn <em>Implementation Guide Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImplementationGuideDependsOn
	 * @generated
	 */
	public Adapter createImplementationGuideDependsOnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImplementationGuideGlobal <em>Implementation Guide Global</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImplementationGuideGlobal
	 * @generated
	 */
	public Adapter createImplementationGuideGlobalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImplementationGuideGrouping <em>Implementation Guide Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImplementationGuideGrouping
	 * @generated
	 */
	public Adapter createImplementationGuideGroupingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImplementationGuideManifest <em>Implementation Guide Manifest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImplementationGuideManifest
	 * @generated
	 */
	public Adapter createImplementationGuideManifestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImplementationGuidePage <em>Implementation Guide Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImplementationGuidePage
	 * @generated
	 */
	public Adapter createImplementationGuidePageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImplementationGuidePage1 <em>Implementation Guide Page1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImplementationGuidePage1
	 * @generated
	 */
	public Adapter createImplementationGuidePage1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImplementationGuideParameter <em>Implementation Guide Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImplementationGuideParameter
	 * @generated
	 */
	public Adapter createImplementationGuideParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImplementationGuideResource <em>Implementation Guide Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImplementationGuideResource
	 * @generated
	 */
	public Adapter createImplementationGuideResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImplementationGuideResource1 <em>Implementation Guide Resource1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImplementationGuideResource1
	 * @generated
	 */
	public Adapter createImplementationGuideResource1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ImplementationGuideTemplate <em>Implementation Guide Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ImplementationGuideTemplate
	 * @generated
	 */
	public Adapter createImplementationGuideTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Ingredient <em>Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Ingredient
	 * @generated
	 */
	public Adapter createIngredientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.IngredientManufacturer <em>Ingredient Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.IngredientManufacturer
	 * @generated
	 */
	public Adapter createIngredientManufacturerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.IngredientManufacturerRole <em>Ingredient Manufacturer Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.IngredientManufacturerRole
	 * @generated
	 */
	public Adapter createIngredientManufacturerRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.IngredientReferenceStrength <em>Ingredient Reference Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.IngredientReferenceStrength
	 * @generated
	 */
	public Adapter createIngredientReferenceStrengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.IngredientStrength <em>Ingredient Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.IngredientStrength
	 * @generated
	 */
	public Adapter createIngredientStrengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.IngredientSubstance <em>Ingredient Substance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.IngredientSubstance
	 * @generated
	 */
	public Adapter createIngredientSubstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Instant <em>Instant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Instant
	 * @generated
	 */
	public Adapter createInstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InsurancePlan <em>Insurance Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InsurancePlan
	 * @generated
	 */
	public Adapter createInsurancePlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InsurancePlanBenefit <em>Insurance Plan Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InsurancePlanBenefit
	 * @generated
	 */
	public Adapter createInsurancePlanBenefitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InsurancePlanBenefit1 <em>Insurance Plan Benefit1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InsurancePlanBenefit1
	 * @generated
	 */
	public Adapter createInsurancePlanBenefit1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InsurancePlanCost <em>Insurance Plan Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InsurancePlanCost
	 * @generated
	 */
	public Adapter createInsurancePlanCostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InsurancePlanCoverage <em>Insurance Plan Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InsurancePlanCoverage
	 * @generated
	 */
	public Adapter createInsurancePlanCoverageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InsurancePlanGeneralCost <em>Insurance Plan General Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InsurancePlanGeneralCost
	 * @generated
	 */
	public Adapter createInsurancePlanGeneralCostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InsurancePlanLimit <em>Insurance Plan Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InsurancePlanLimit
	 * @generated
	 */
	public Adapter createInsurancePlanLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InsurancePlanPlan <em>Insurance Plan Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InsurancePlanPlan
	 * @generated
	 */
	public Adapter createInsurancePlanPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InsurancePlanSpecificCost <em>Insurance Plan Specific Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InsurancePlanSpecificCost
	 * @generated
	 */
	public Adapter createInsurancePlanSpecificCostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Integer
	 * @generated
	 */
	public Adapter createIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Integer64 <em>Integer64</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Integer64
	 * @generated
	 */
	public Adapter createInteger64Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InteractionTrigger <em>Interaction Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InteractionTrigger
	 * @generated
	 */
	public Adapter createInteractionTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InventoryCountType <em>Inventory Count Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InventoryCountType
	 * @generated
	 */
	public Adapter createInventoryCountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InventoryItem <em>Inventory Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InventoryItem
	 * @generated
	 */
	public Adapter createInventoryItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InventoryItemAssociation <em>Inventory Item Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InventoryItemAssociation
	 * @generated
	 */
	public Adapter createInventoryItemAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InventoryItemCharacteristic <em>Inventory Item Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InventoryItemCharacteristic
	 * @generated
	 */
	public Adapter createInventoryItemCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InventoryItemDescription <em>Inventory Item Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InventoryItemDescription
	 * @generated
	 */
	public Adapter createInventoryItemDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InventoryItemInstance <em>Inventory Item Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InventoryItemInstance
	 * @generated
	 */
	public Adapter createInventoryItemInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InventoryItemName <em>Inventory Item Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InventoryItemName
	 * @generated
	 */
	public Adapter createInventoryItemNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InventoryItemResponsibleOrganization <em>Inventory Item Responsible Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InventoryItemResponsibleOrganization
	 * @generated
	 */
	public Adapter createInventoryItemResponsibleOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InventoryItemStatusCodes <em>Inventory Item Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InventoryItemStatusCodes
	 * @generated
	 */
	public Adapter createInventoryItemStatusCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InventoryReport <em>Inventory Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InventoryReport
	 * @generated
	 */
	public Adapter createInventoryReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InventoryReportInventoryListing <em>Inventory Report Inventory Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InventoryReportInventoryListing
	 * @generated
	 */
	public Adapter createInventoryReportInventoryListingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InventoryReportItem <em>Inventory Report Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InventoryReportItem
	 * @generated
	 */
	public Adapter createInventoryReportItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InventoryReportStatus <em>Inventory Report Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InventoryReportStatus
	 * @generated
	 */
	public Adapter createInventoryReportStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Invoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Invoice
	 * @generated
	 */
	public Adapter createInvoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InvoiceLineItem <em>Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InvoiceLineItem
	 * @generated
	 */
	public Adapter createInvoiceLineItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InvoiceParticipant <em>Invoice Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InvoiceParticipant
	 * @generated
	 */
	public Adapter createInvoiceParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.InvoiceStatus <em>Invoice Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.InvoiceStatus
	 * @generated
	 */
	public Adapter createInvoiceStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.IssueSeverity <em>Issue Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.IssueSeverity
	 * @generated
	 */
	public Adapter createIssueSeverityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.IssueType <em>Issue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.IssueType
	 * @generated
	 */
	public Adapter createIssueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.JurisdictionValueSet <em>Jurisdiction Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.JurisdictionValueSet
	 * @generated
	 */
	public Adapter createJurisdictionValueSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Kind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Kind
	 * @generated
	 */
	public Adapter createKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Linkage <em>Linkage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Linkage
	 * @generated
	 */
	public Adapter createLinkageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.LinkageItem <em>Linkage Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.LinkageItem
	 * @generated
	 */
	public Adapter createLinkageItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.LinkageType <em>Linkage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.LinkageType
	 * @generated
	 */
	public Adapter createLinkageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.LinkRelationTypes <em>Link Relation Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.LinkRelationTypes
	 * @generated
	 */
	public Adapter createLinkRelationTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.LinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.LinkType
	 * @generated
	 */
	public Adapter createLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.List
	 * @generated
	 */
	public Adapter createListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ListEntry <em>List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ListEntry
	 * @generated
	 */
	public Adapter createListEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ListMode <em>List Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ListMode
	 * @generated
	 */
	public Adapter createListModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ListStatus <em>List Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ListStatus
	 * @generated
	 */
	public Adapter createListStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.LocationMode <em>Location Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.LocationMode
	 * @generated
	 */
	public Adapter createLocationModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.LocationPosition <em>Location Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.LocationPosition
	 * @generated
	 */
	public Adapter createLocationPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.LocationStatus <em>Location Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.LocationStatus
	 * @generated
	 */
	public Adapter createLocationStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ManufacturedItemDefinition <em>Manufactured Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ManufacturedItemDefinition
	 * @generated
	 */
	public Adapter createManufacturedItemDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ManufacturedItemDefinitionComponent <em>Manufactured Item Definition Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ManufacturedItemDefinitionComponent
	 * @generated
	 */
	public Adapter createManufacturedItemDefinitionComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ManufacturedItemDefinitionConstituent <em>Manufactured Item Definition Constituent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ManufacturedItemDefinitionConstituent
	 * @generated
	 */
	public Adapter createManufacturedItemDefinitionConstituentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ManufacturedItemDefinitionProperty <em>Manufactured Item Definition Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ManufacturedItemDefinitionProperty
	 * @generated
	 */
	public Adapter createManufacturedItemDefinitionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Markdown <em>Markdown</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Markdown
	 * @generated
	 */
	public Adapter createMarkdownAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MarketingStatus <em>Marketing Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MarketingStatus
	 * @generated
	 */
	public Adapter createMarketingStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Measure
	 * @generated
	 */
	public Adapter createMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureComponent <em>Measure Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureComponent
	 * @generated
	 */
	public Adapter createMeasureComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureGroup <em>Measure Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureGroup
	 * @generated
	 */
	public Adapter createMeasureGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasurePopulation <em>Measure Population</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasurePopulation
	 * @generated
	 */
	public Adapter createMeasurePopulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureReport <em>Measure Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureReport
	 * @generated
	 */
	public Adapter createMeasureReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureReportComponent <em>Measure Report Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureReportComponent
	 * @generated
	 */
	public Adapter createMeasureReportComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureReportGroup <em>Measure Report Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureReportGroup
	 * @generated
	 */
	public Adapter createMeasureReportGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureReportPopulation <em>Measure Report Population</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureReportPopulation
	 * @generated
	 */
	public Adapter createMeasureReportPopulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureReportPopulation1 <em>Measure Report Population1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureReportPopulation1
	 * @generated
	 */
	public Adapter createMeasureReportPopulation1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureReportStatus <em>Measure Report Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureReportStatus
	 * @generated
	 */
	public Adapter createMeasureReportStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureReportStratifier <em>Measure Report Stratifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureReportStratifier
	 * @generated
	 */
	public Adapter createMeasureReportStratifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureReportStratum <em>Measure Report Stratum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureReportStratum
	 * @generated
	 */
	public Adapter createMeasureReportStratumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureReportType <em>Measure Report Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureReportType
	 * @generated
	 */
	public Adapter createMeasureReportTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureStratifier <em>Measure Stratifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureStratifier
	 * @generated
	 */
	public Adapter createMeasureStratifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureSupplementalData <em>Measure Supplemental Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureSupplementalData
	 * @generated
	 */
	public Adapter createMeasureSupplementalDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MeasureTerm <em>Measure Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MeasureTerm
	 * @generated
	 */
	public Adapter createMeasureTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Medication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Medication
	 * @generated
	 */
	public Adapter createMedicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationAdministration <em>Medication Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationAdministration
	 * @generated
	 */
	public Adapter createMedicationAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationAdministrationDosage <em>Medication Administration Dosage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationAdministrationDosage
	 * @generated
	 */
	public Adapter createMedicationAdministrationDosageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationAdministrationPerformer <em>Medication Administration Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationAdministrationPerformer
	 * @generated
	 */
	public Adapter createMedicationAdministrationPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationAdministrationStatusCodes <em>Medication Administration Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationAdministrationStatusCodes
	 * @generated
	 */
	public Adapter createMedicationAdministrationStatusCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationBatch <em>Medication Batch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationBatch
	 * @generated
	 */
	public Adapter createMedicationBatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationDispense <em>Medication Dispense</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationDispense
	 * @generated
	 */
	public Adapter createMedicationDispenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationDispensePerformer <em>Medication Dispense Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationDispensePerformer
	 * @generated
	 */
	public Adapter createMedicationDispensePerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationDispenseStatusCodes <em>Medication Dispense Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationDispenseStatusCodes
	 * @generated
	 */
	public Adapter createMedicationDispenseStatusCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationDispenseSubstitution <em>Medication Dispense Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationDispenseSubstitution
	 * @generated
	 */
	public Adapter createMedicationDispenseSubstitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationIngredient <em>Medication Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationIngredient
	 * @generated
	 */
	public Adapter createMedicationIngredientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationKnowledge <em>Medication Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationKnowledge
	 * @generated
	 */
	public Adapter createMedicationKnowledgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationKnowledgeCost <em>Medication Knowledge Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationKnowledgeCost
	 * @generated
	 */
	public Adapter createMedicationKnowledgeCostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationKnowledgeDefinitional <em>Medication Knowledge Definitional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationKnowledgeDefinitional
	 * @generated
	 */
	public Adapter createMedicationKnowledgeDefinitionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationKnowledgeDosage <em>Medication Knowledge Dosage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationKnowledgeDosage
	 * @generated
	 */
	public Adapter createMedicationKnowledgeDosageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationKnowledgeDosingGuideline <em>Medication Knowledge Dosing Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationKnowledgeDosingGuideline
	 * @generated
	 */
	public Adapter createMedicationKnowledgeDosingGuidelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationKnowledgeDrugCharacteristic <em>Medication Knowledge Drug Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationKnowledgeDrugCharacteristic
	 * @generated
	 */
	public Adapter createMedicationKnowledgeDrugCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationKnowledgeEnvironmentalSetting <em>Medication Knowledge Environmental Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationKnowledgeEnvironmentalSetting
	 * @generated
	 */
	public Adapter createMedicationKnowledgeEnvironmentalSettingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationKnowledgeIndicationGuideline <em>Medication Knowledge Indication Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationKnowledgeIndicationGuideline
	 * @generated
	 */
	public Adapter createMedicationKnowledgeIndicationGuidelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationKnowledgeIngredient <em>Medication Knowledge Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationKnowledgeIngredient
	 * @generated
	 */
	public Adapter createMedicationKnowledgeIngredientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationKnowledgeMaxDispense <em>Medication Knowledge Max Dispense</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationKnowledgeMaxDispense
	 * @generated
	 */
	public Adapter createMedicationKnowledgeMaxDispenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationKnowledgeMedicineClassification <em>Medication Knowledge Medicine Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationKnowledgeMedicineClassification
	 * @generated
	 */
	public Adapter createMedicationKnowledgeMedicineClassificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationKnowledgeMonitoringProgram <em>Medication Knowledge Monitoring Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationKnowledgeMonitoringProgram
	 * @generated
	 */
	public Adapter createMedicationKnowledgeMonitoringProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationKnowledgeMonograph <em>Medication Knowledge Monograph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationKnowledgeMonograph
	 * @generated
	 */
	public Adapter createMedicationKnowledgeMonographAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationKnowledgePackaging <em>Medication Knowledge Packaging</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationKnowledgePackaging
	 * @generated
	 */
	public Adapter createMedicationKnowledgePackagingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationKnowledgePatientCharacteristic <em>Medication Knowledge Patient Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationKnowledgePatientCharacteristic
	 * @generated
	 */
	public Adapter createMedicationKnowledgePatientCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationKnowledgeRegulatory <em>Medication Knowledge Regulatory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationKnowledgeRegulatory
	 * @generated
	 */
	public Adapter createMedicationKnowledgeRegulatoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationKnowledgeRelatedMedicationKnowledge <em>Medication Knowledge Related Medication Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationKnowledgeRelatedMedicationKnowledge
	 * @generated
	 */
	public Adapter createMedicationKnowledgeRelatedMedicationKnowledgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationKnowledgeStatusCodes <em>Medication Knowledge Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationKnowledgeStatusCodes
	 * @generated
	 */
	public Adapter createMedicationKnowledgeStatusCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationKnowledgeStorageGuideline <em>Medication Knowledge Storage Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationKnowledgeStorageGuideline
	 * @generated
	 */
	public Adapter createMedicationKnowledgeStorageGuidelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationKnowledgeSubstitution <em>Medication Knowledge Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationKnowledgeSubstitution
	 * @generated
	 */
	public Adapter createMedicationKnowledgeSubstitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationRequest <em>Medication Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationRequest
	 * @generated
	 */
	public Adapter createMedicationRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationRequestDispenseRequest <em>Medication Request Dispense Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationRequestDispenseRequest
	 * @generated
	 */
	public Adapter createMedicationRequestDispenseRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationRequestInitialFill <em>Medication Request Initial Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationRequestInitialFill
	 * @generated
	 */
	public Adapter createMedicationRequestInitialFillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationRequestIntent <em>Medication Request Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationRequestIntent
	 * @generated
	 */
	public Adapter createMedicationRequestIntentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationrequestStatus <em>Medicationrequest Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationrequestStatus
	 * @generated
	 */
	public Adapter createMedicationrequestStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationRequestSubstitution <em>Medication Request Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationRequestSubstitution
	 * @generated
	 */
	public Adapter createMedicationRequestSubstitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationStatement <em>Medication Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationStatement
	 * @generated
	 */
	public Adapter createMedicationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationStatementAdherence <em>Medication Statement Adherence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationStatementAdherence
	 * @generated
	 */
	public Adapter createMedicationStatementAdherenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationStatementStatusCodes <em>Medication Statement Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationStatementStatusCodes
	 * @generated
	 */
	public Adapter createMedicationStatementStatusCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicationStatusCodes <em>Medication Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicationStatusCodes
	 * @generated
	 */
	public Adapter createMedicationStatusCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicinalProductDefinition <em>Medicinal Product Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicinalProductDefinition
	 * @generated
	 */
	public Adapter createMedicinalProductDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicinalProductDefinitionCharacteristic <em>Medicinal Product Definition Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicinalProductDefinitionCharacteristic
	 * @generated
	 */
	public Adapter createMedicinalProductDefinitionCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicinalProductDefinitionContact <em>Medicinal Product Definition Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicinalProductDefinitionContact
	 * @generated
	 */
	public Adapter createMedicinalProductDefinitionContactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicinalProductDefinitionCrossReference <em>Medicinal Product Definition Cross Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicinalProductDefinitionCrossReference
	 * @generated
	 */
	public Adapter createMedicinalProductDefinitionCrossReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicinalProductDefinitionName <em>Medicinal Product Definition Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicinalProductDefinitionName
	 * @generated
	 */
	public Adapter createMedicinalProductDefinitionNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicinalProductDefinitionOperation <em>Medicinal Product Definition Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicinalProductDefinitionOperation
	 * @generated
	 */
	public Adapter createMedicinalProductDefinitionOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicinalProductDefinitionPart <em>Medicinal Product Definition Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicinalProductDefinitionPart
	 * @generated
	 */
	public Adapter createMedicinalProductDefinitionPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MedicinalProductDefinitionUsage <em>Medicinal Product Definition Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MedicinalProductDefinitionUsage
	 * @generated
	 */
	public Adapter createMedicinalProductDefinitionUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MessageDefinition <em>Message Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MessageDefinition
	 * @generated
	 */
	public Adapter createMessageDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MessageDefinitionAllowedResponse <em>Message Definition Allowed Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MessageDefinitionAllowedResponse
	 * @generated
	 */
	public Adapter createMessageDefinitionAllowedResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MessageDefinitionFocus <em>Message Definition Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MessageDefinitionFocus
	 * @generated
	 */
	public Adapter createMessageDefinitionFocusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MessageHeader <em>Message Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MessageHeader
	 * @generated
	 */
	public Adapter createMessageHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MessageHeaderDestination <em>Message Header Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MessageHeaderDestination
	 * @generated
	 */
	public Adapter createMessageHeaderDestinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MessageHeaderResponse <em>Message Header Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MessageHeaderResponse
	 * @generated
	 */
	public Adapter createMessageHeaderResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MessageheaderResponseRequest <em>Messageheader Response Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MessageheaderResponseRequest
	 * @generated
	 */
	public Adapter createMessageheaderResponseRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MessageHeaderSource <em>Message Header Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MessageHeaderSource
	 * @generated
	 */
	public Adapter createMessageHeaderSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MessageSignificanceCategory <em>Message Significance Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MessageSignificanceCategory
	 * @generated
	 */
	public Adapter createMessageSignificanceCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Meta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Meta
	 * @generated
	 */
	public Adapter createMetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MetadataResource <em>Metadata Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MetadataResource
	 * @generated
	 */
	public Adapter createMetadataResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MolecularSequence <em>Molecular Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MolecularSequence
	 * @generated
	 */
	public Adapter createMolecularSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MolecularSequenceEdit <em>Molecular Sequence Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MolecularSequenceEdit
	 * @generated
	 */
	public Adapter createMolecularSequenceEditAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MolecularSequenceRelative <em>Molecular Sequence Relative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MolecularSequenceRelative
	 * @generated
	 */
	public Adapter createMolecularSequenceRelativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MolecularSequenceStartingSequence <em>Molecular Sequence Starting Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MolecularSequenceStartingSequence
	 * @generated
	 */
	public Adapter createMolecularSequenceStartingSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.MonetaryComponent <em>Monetary Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.MonetaryComponent
	 * @generated
	 */
	public Adapter createMonetaryComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Money <em>Money</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Money
	 * @generated
	 */
	public Adapter createMoneyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NameUse <em>Name Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NameUse
	 * @generated
	 */
	public Adapter createNameUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NamingSystem <em>Naming System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NamingSystem
	 * @generated
	 */
	public Adapter createNamingSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NamingSystemIdentifierType <em>Naming System Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NamingSystemIdentifierType
	 * @generated
	 */
	public Adapter createNamingSystemIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NamingSystemType <em>Naming System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NamingSystemType
	 * @generated
	 */
	public Adapter createNamingSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NamingSystemUniqueId <em>Naming System Unique Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NamingSystemUniqueId
	 * @generated
	 */
	public Adapter createNamingSystemUniqueIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Narrative <em>Narrative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Narrative
	 * @generated
	 */
	public Adapter createNarrativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NarrativeStatus <em>Narrative Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NarrativeStatus
	 * @generated
	 */
	public Adapter createNarrativeStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NoteType <em>Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NoteType
	 * @generated
	 */
	public Adapter createNoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionIntake <em>Nutrition Intake</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionIntake
	 * @generated
	 */
	public Adapter createNutritionIntakeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionIntakeConsumedItem <em>Nutrition Intake Consumed Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionIntakeConsumedItem
	 * @generated
	 */
	public Adapter createNutritionIntakeConsumedItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionIntakeIngredientLabel <em>Nutrition Intake Ingredient Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionIntakeIngredientLabel
	 * @generated
	 */
	public Adapter createNutritionIntakeIngredientLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionIntakePerformer <em>Nutrition Intake Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionIntakePerformer
	 * @generated
	 */
	public Adapter createNutritionIntakePerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionOrder <em>Nutrition Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionOrder
	 * @generated
	 */
	public Adapter createNutritionOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionOrderAdditive <em>Nutrition Order Additive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionOrderAdditive
	 * @generated
	 */
	public Adapter createNutritionOrderAdditiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionOrderAdministration <em>Nutrition Order Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionOrderAdministration
	 * @generated
	 */
	public Adapter createNutritionOrderAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionOrderEnteralFormula <em>Nutrition Order Enteral Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionOrderEnteralFormula
	 * @generated
	 */
	public Adapter createNutritionOrderEnteralFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionOrderNutrient <em>Nutrition Order Nutrient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionOrderNutrient
	 * @generated
	 */
	public Adapter createNutritionOrderNutrientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionOrderOralDiet <em>Nutrition Order Oral Diet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionOrderOralDiet
	 * @generated
	 */
	public Adapter createNutritionOrderOralDietAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionOrderSchedule <em>Nutrition Order Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionOrderSchedule
	 * @generated
	 */
	public Adapter createNutritionOrderScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionOrderSchedule1 <em>Nutrition Order Schedule1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionOrderSchedule1
	 * @generated
	 */
	public Adapter createNutritionOrderSchedule1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionOrderSchedule2 <em>Nutrition Order Schedule2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionOrderSchedule2
	 * @generated
	 */
	public Adapter createNutritionOrderSchedule2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionOrderSupplement <em>Nutrition Order Supplement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionOrderSupplement
	 * @generated
	 */
	public Adapter createNutritionOrderSupplementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionOrderTexture <em>Nutrition Order Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionOrderTexture
	 * @generated
	 */
	public Adapter createNutritionOrderTextureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionProduct <em>Nutrition Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionProduct
	 * @generated
	 */
	public Adapter createNutritionProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionProductCharacteristic <em>Nutrition Product Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionProductCharacteristic
	 * @generated
	 */
	public Adapter createNutritionProductCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionProductIngredient <em>Nutrition Product Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionProductIngredient
	 * @generated
	 */
	public Adapter createNutritionProductIngredientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionProductInstance <em>Nutrition Product Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionProductInstance
	 * @generated
	 */
	public Adapter createNutritionProductInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionProductNutrient <em>Nutrition Product Nutrient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionProductNutrient
	 * @generated
	 */
	public Adapter createNutritionProductNutrientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.NutritionProductStatus <em>Nutrition Product Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.NutritionProductStatus
	 * @generated
	 */
	public Adapter createNutritionProductStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Observation
	 * @generated
	 */
	public Adapter createObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ObservationComponent <em>Observation Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ObservationComponent
	 * @generated
	 */
	public Adapter createObservationComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ObservationDataType <em>Observation Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ObservationDataType
	 * @generated
	 */
	public Adapter createObservationDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ObservationDefinition <em>Observation Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ObservationDefinition
	 * @generated
	 */
	public Adapter createObservationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ObservationDefinitionComponent <em>Observation Definition Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ObservationDefinitionComponent
	 * @generated
	 */
	public Adapter createObservationDefinitionComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ObservationDefinitionQualifiedValue <em>Observation Definition Qualified Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ObservationDefinitionQualifiedValue
	 * @generated
	 */
	public Adapter createObservationDefinitionQualifiedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ObservationRangeCategory <em>Observation Range Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ObservationRangeCategory
	 * @generated
	 */
	public Adapter createObservationRangeCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ObservationReferenceRange <em>Observation Reference Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ObservationReferenceRange
	 * @generated
	 */
	public Adapter createObservationReferenceRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ObservationStatus <em>Observation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ObservationStatus
	 * @generated
	 */
	public Adapter createObservationStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ObservationTriggeredBy <em>Observation Triggered By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ObservationTriggeredBy
	 * @generated
	 */
	public Adapter createObservationTriggeredByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Oid <em>Oid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Oid
	 * @generated
	 */
	public Adapter createOidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.OperationDefinition <em>Operation Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.OperationDefinition
	 * @generated
	 */
	public Adapter createOperationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.OperationDefinitionBinding <em>Operation Definition Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.OperationDefinitionBinding
	 * @generated
	 */
	public Adapter createOperationDefinitionBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.OperationDefinitionOverload <em>Operation Definition Overload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.OperationDefinitionOverload
	 * @generated
	 */
	public Adapter createOperationDefinitionOverloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.OperationDefinitionParameter <em>Operation Definition Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.OperationDefinitionParameter
	 * @generated
	 */
	public Adapter createOperationDefinitionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.OperationDefinitionReferencedFrom <em>Operation Definition Referenced From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.OperationDefinitionReferencedFrom
	 * @generated
	 */
	public Adapter createOperationDefinitionReferencedFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.OperationKind <em>Operation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.OperationKind
	 * @generated
	 */
	public Adapter createOperationKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.OperationOutcome <em>Operation Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.OperationOutcome
	 * @generated
	 */
	public Adapter createOperationOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.OperationOutcomeCodes <em>Operation Outcome Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.OperationOutcomeCodes
	 * @generated
	 */
	public Adapter createOperationOutcomeCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.OperationOutcomeIssue <em>Operation Outcome Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.OperationOutcomeIssue
	 * @generated
	 */
	public Adapter createOperationOutcomeIssueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.OperationParameterScope <em>Operation Parameter Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.OperationParameterScope
	 * @generated
	 */
	public Adapter createOperationParameterScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.OperationParameterUse <em>Operation Parameter Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.OperationParameterUse
	 * @generated
	 */
	public Adapter createOperationParameterUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Organization
	 * @generated
	 */
	public Adapter createOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.OrganizationAffiliation <em>Organization Affiliation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.OrganizationAffiliation
	 * @generated
	 */
	public Adapter createOrganizationAffiliationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.OrganizationQualification <em>Organization Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.OrganizationQualification
	 * @generated
	 */
	public Adapter createOrganizationQualificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.OrientationType <em>Orientation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.OrientationType
	 * @generated
	 */
	public Adapter createOrientationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PackagedProductDefinition <em>Packaged Product Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PackagedProductDefinition
	 * @generated
	 */
	public Adapter createPackagedProductDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PackagedProductDefinitionContainedItem <em>Packaged Product Definition Contained Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PackagedProductDefinitionContainedItem
	 * @generated
	 */
	public Adapter createPackagedProductDefinitionContainedItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PackagedProductDefinitionLegalStatusOfSupply <em>Packaged Product Definition Legal Status Of Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PackagedProductDefinitionLegalStatusOfSupply
	 * @generated
	 */
	public Adapter createPackagedProductDefinitionLegalStatusOfSupplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PackagedProductDefinitionPackaging <em>Packaged Product Definition Packaging</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PackagedProductDefinitionPackaging
	 * @generated
	 */
	public Adapter createPackagedProductDefinitionPackagingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PackagedProductDefinitionProperty <em>Packaged Product Definition Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PackagedProductDefinitionProperty
	 * @generated
	 */
	public Adapter createPackagedProductDefinitionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ParameterDefinition <em>Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ParameterDefinition
	 * @generated
	 */
	public Adapter createParameterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Parameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Parameters
	 * @generated
	 */
	public Adapter createParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ParametersParameter <em>Parameters Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ParametersParameter
	 * @generated
	 */
	public Adapter createParametersParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ParticipantResourceTypes <em>Participant Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ParticipantResourceTypes
	 * @generated
	 */
	public Adapter createParticipantResourceTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ParticipationStatus <em>Participation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ParticipationStatus
	 * @generated
	 */
	public Adapter createParticipationStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Patient
	 * @generated
	 */
	public Adapter createPatientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PatientCommunication <em>Patient Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PatientCommunication
	 * @generated
	 */
	public Adapter createPatientCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PatientContact <em>Patient Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PatientContact
	 * @generated
	 */
	public Adapter createPatientContactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PatientLink <em>Patient Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PatientLink
	 * @generated
	 */
	public Adapter createPatientLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PaymentNotice <em>Payment Notice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PaymentNotice
	 * @generated
	 */
	public Adapter createPaymentNoticeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PaymentOutcome <em>Payment Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PaymentOutcome
	 * @generated
	 */
	public Adapter createPaymentOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PaymentReconciliation <em>Payment Reconciliation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PaymentReconciliation
	 * @generated
	 */
	public Adapter createPaymentReconciliationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PaymentReconciliationAllocation <em>Payment Reconciliation Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PaymentReconciliationAllocation
	 * @generated
	 */
	public Adapter createPaymentReconciliationAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PaymentReconciliationProcessNote <em>Payment Reconciliation Process Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PaymentReconciliationProcessNote
	 * @generated
	 */
	public Adapter createPaymentReconciliationProcessNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Period
	 * @generated
	 */
	public Adapter createPeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Permission
	 * @generated
	 */
	public Adapter createPermissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PermissionActivity <em>Permission Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PermissionActivity
	 * @generated
	 */
	public Adapter createPermissionActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PermissionData <em>Permission Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PermissionData
	 * @generated
	 */
	public Adapter createPermissionDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PermissionJustification <em>Permission Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PermissionJustification
	 * @generated
	 */
	public Adapter createPermissionJustificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PermissionResource <em>Permission Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PermissionResource
	 * @generated
	 */
	public Adapter createPermissionResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PermissionRule <em>Permission Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PermissionRule
	 * @generated
	 */
	public Adapter createPermissionRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PermissionRuleCombining <em>Permission Rule Combining</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PermissionRuleCombining
	 * @generated
	 */
	public Adapter createPermissionRuleCombiningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PermissionStatus <em>Permission Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PermissionStatus
	 * @generated
	 */
	public Adapter createPermissionStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PersonCommunication <em>Person Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PersonCommunication
	 * @generated
	 */
	public Adapter createPersonCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PersonLink <em>Person Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PersonLink
	 * @generated
	 */
	public Adapter createPersonLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanDefinition <em>Plan Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanDefinition
	 * @generated
	 */
	public Adapter createPlanDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanDefinitionAction <em>Plan Definition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanDefinitionAction
	 * @generated
	 */
	public Adapter createPlanDefinitionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanDefinitionActor <em>Plan Definition Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanDefinitionActor
	 * @generated
	 */
	public Adapter createPlanDefinitionActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanDefinitionCondition <em>Plan Definition Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanDefinitionCondition
	 * @generated
	 */
	public Adapter createPlanDefinitionConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanDefinitionDynamicValue <em>Plan Definition Dynamic Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanDefinitionDynamicValue
	 * @generated
	 */
	public Adapter createPlanDefinitionDynamicValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanDefinitionGoal <em>Plan Definition Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanDefinitionGoal
	 * @generated
	 */
	public Adapter createPlanDefinitionGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanDefinitionInput <em>Plan Definition Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanDefinitionInput
	 * @generated
	 */
	public Adapter createPlanDefinitionInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanDefinitionOption <em>Plan Definition Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanDefinitionOption
	 * @generated
	 */
	public Adapter createPlanDefinitionOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanDefinitionOutput <em>Plan Definition Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanDefinitionOutput
	 * @generated
	 */
	public Adapter createPlanDefinitionOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanDefinitionParticipant <em>Plan Definition Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanDefinitionParticipant
	 * @generated
	 */
	public Adapter createPlanDefinitionParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanDefinitionRelatedAction <em>Plan Definition Related Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanDefinitionRelatedAction
	 * @generated
	 */
	public Adapter createPlanDefinitionRelatedActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PlanDefinitionTarget <em>Plan Definition Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PlanDefinitionTarget
	 * @generated
	 */
	public Adapter createPlanDefinitionTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PositiveInt <em>Positive Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PositiveInt
	 * @generated
	 */
	public Adapter createPositiveIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Practitioner <em>Practitioner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Practitioner
	 * @generated
	 */
	public Adapter createPractitionerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PractitionerCommunication <em>Practitioner Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PractitionerCommunication
	 * @generated
	 */
	public Adapter createPractitionerCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PractitionerQualification <em>Practitioner Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PractitionerQualification
	 * @generated
	 */
	public Adapter createPractitionerQualificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PractitionerRole <em>Practitioner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PractitionerRole
	 * @generated
	 */
	public Adapter createPractitionerRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Procedure
	 * @generated
	 */
	public Adapter createProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ProcedureFocalDevice <em>Procedure Focal Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ProcedureFocalDevice
	 * @generated
	 */
	public Adapter createProcedureFocalDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ProcedurePerformer <em>Procedure Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ProcedurePerformer
	 * @generated
	 */
	public Adapter createProcedurePerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ProductShelfLife <em>Product Shelf Life</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ProductShelfLife
	 * @generated
	 */
	public Adapter createProductShelfLifeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PropertyRepresentation <em>Property Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PropertyRepresentation
	 * @generated
	 */
	public Adapter createPropertyRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PropertyType
	 * @generated
	 */
	public Adapter createPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Provenance <em>Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Provenance
	 * @generated
	 */
	public Adapter createProvenanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ProvenanceAgent <em>Provenance Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ProvenanceAgent
	 * @generated
	 */
	public Adapter createProvenanceAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ProvenanceEntity <em>Provenance Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ProvenanceEntity
	 * @generated
	 */
	public Adapter createProvenanceEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ProvenanceEntityRole <em>Provenance Entity Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ProvenanceEntityRole
	 * @generated
	 */
	public Adapter createProvenanceEntityRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.PublicationStatus <em>Publication Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.PublicationStatus
	 * @generated
	 */
	public Adapter createPublicationStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Quantity
	 * @generated
	 */
	public Adapter createQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.QuantityComparator <em>Quantity Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.QuantityComparator
	 * @generated
	 */
	public Adapter createQuantityComparatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Questionnaire
	 * @generated
	 */
	public Adapter createQuestionnaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.QuestionnaireAnswerConstraint <em>Questionnaire Answer Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.QuestionnaireAnswerConstraint
	 * @generated
	 */
	public Adapter createQuestionnaireAnswerConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.QuestionnaireAnswerOption <em>Questionnaire Answer Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.QuestionnaireAnswerOption
	 * @generated
	 */
	public Adapter createQuestionnaireAnswerOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.QuestionnaireEnableWhen <em>Questionnaire Enable When</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.QuestionnaireEnableWhen
	 * @generated
	 */
	public Adapter createQuestionnaireEnableWhenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.QuestionnaireInitial <em>Questionnaire Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.QuestionnaireInitial
	 * @generated
	 */
	public Adapter createQuestionnaireInitialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.QuestionnaireItem <em>Questionnaire Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.QuestionnaireItem
	 * @generated
	 */
	public Adapter createQuestionnaireItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.QuestionnaireItemDisabledDisplay <em>Questionnaire Item Disabled Display</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.QuestionnaireItemDisabledDisplay
	 * @generated
	 */
	public Adapter createQuestionnaireItemDisabledDisplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.QuestionnaireItemOperator <em>Questionnaire Item Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.QuestionnaireItemOperator
	 * @generated
	 */
	public Adapter createQuestionnaireItemOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.QuestionnaireItemType <em>Questionnaire Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.QuestionnaireItemType
	 * @generated
	 */
	public Adapter createQuestionnaireItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.QuestionnaireResponse <em>Questionnaire Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.QuestionnaireResponse
	 * @generated
	 */
	public Adapter createQuestionnaireResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.QuestionnaireResponseAnswer <em>Questionnaire Response Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.QuestionnaireResponseAnswer
	 * @generated
	 */
	public Adapter createQuestionnaireResponseAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.QuestionnaireResponseItem <em>Questionnaire Response Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.QuestionnaireResponseItem
	 * @generated
	 */
	public Adapter createQuestionnaireResponseItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.QuestionnaireResponseStatus <em>Questionnaire Response Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.QuestionnaireResponseStatus
	 * @generated
	 */
	public Adapter createQuestionnaireResponseStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Range
	 * @generated
	 */
	public Adapter createRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Ratio <em>Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Ratio
	 * @generated
	 */
	public Adapter createRatioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RatioRange <em>Ratio Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RatioRange
	 * @generated
	 */
	public Adapter createRatioRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ReferenceHandlingPolicy <em>Reference Handling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ReferenceHandlingPolicy
	 * @generated
	 */
	public Adapter createReferenceHandlingPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ReferenceVersionRules <em>Reference Version Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ReferenceVersionRules
	 * @generated
	 */
	public Adapter createReferenceVersionRulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RegulatedAuthorization <em>Regulated Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RegulatedAuthorization
	 * @generated
	 */
	public Adapter createRegulatedAuthorizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RegulatedAuthorizationCase <em>Regulated Authorization Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RegulatedAuthorizationCase
	 * @generated
	 */
	public Adapter createRegulatedAuthorizationCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RelatedArtifact <em>Related Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RelatedArtifact
	 * @generated
	 */
	public Adapter createRelatedArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RelatedArtifactType <em>Related Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RelatedArtifactType
	 * @generated
	 */
	public Adapter createRelatedArtifactTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RelatedArtifactTypeExpanded <em>Related Artifact Type Expanded</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RelatedArtifactTypeExpanded
	 * @generated
	 */
	public Adapter createRelatedArtifactTypeExpandedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RelatedPerson <em>Related Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RelatedPerson
	 * @generated
	 */
	public Adapter createRelatedPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RelatedPersonCommunication <em>Related Person Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RelatedPersonCommunication
	 * @generated
	 */
	public Adapter createRelatedPersonCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RemittanceOutcome <em>Remittance Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RemittanceOutcome
	 * @generated
	 */
	public Adapter createRemittanceOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ReportRelationshipType <em>Report Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ReportRelationshipType
	 * @generated
	 */
	public Adapter createReportRelationshipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RequestIntent <em>Request Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RequestIntent
	 * @generated
	 */
	public Adapter createRequestIntentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RequestOrchestration <em>Request Orchestration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RequestOrchestration
	 * @generated
	 */
	public Adapter createRequestOrchestrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RequestOrchestrationAction <em>Request Orchestration Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RequestOrchestrationAction
	 * @generated
	 */
	public Adapter createRequestOrchestrationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RequestOrchestrationCondition <em>Request Orchestration Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RequestOrchestrationCondition
	 * @generated
	 */
	public Adapter createRequestOrchestrationConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RequestOrchestrationDynamicValue <em>Request Orchestration Dynamic Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RequestOrchestrationDynamicValue
	 * @generated
	 */
	public Adapter createRequestOrchestrationDynamicValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RequestOrchestrationInput <em>Request Orchestration Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RequestOrchestrationInput
	 * @generated
	 */
	public Adapter createRequestOrchestrationInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RequestOrchestrationOutput <em>Request Orchestration Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RequestOrchestrationOutput
	 * @generated
	 */
	public Adapter createRequestOrchestrationOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RequestOrchestrationParticipant <em>Request Orchestration Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RequestOrchestrationParticipant
	 * @generated
	 */
	public Adapter createRequestOrchestrationParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RequestOrchestrationRelatedAction <em>Request Orchestration Related Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RequestOrchestrationRelatedAction
	 * @generated
	 */
	public Adapter createRequestOrchestrationRelatedActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RequestPriority <em>Request Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RequestPriority
	 * @generated
	 */
	public Adapter createRequestPriorityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RequestResourceTypes <em>Request Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RequestResourceTypes
	 * @generated
	 */
	public Adapter createRequestResourceTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RequestStatus <em>Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RequestStatus
	 * @generated
	 */
	public Adapter createRequestStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Requirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Requirements
	 * @generated
	 */
	public Adapter createRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RequirementsStatement <em>Requirements Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RequirementsStatement
	 * @generated
	 */
	public Adapter createRequirementsStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ResearchStudy <em>Research Study</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ResearchStudy
	 * @generated
	 */
	public Adapter createResearchStudyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ResearchStudyAssociatedParty <em>Research Study Associated Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ResearchStudyAssociatedParty
	 * @generated
	 */
	public Adapter createResearchStudyAssociatedPartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ResearchStudyComparisonGroup <em>Research Study Comparison Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ResearchStudyComparisonGroup
	 * @generated
	 */
	public Adapter createResearchStudyComparisonGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ResearchStudyLabel <em>Research Study Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ResearchStudyLabel
	 * @generated
	 */
	public Adapter createResearchStudyLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ResearchStudyObjective <em>Research Study Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ResearchStudyObjective
	 * @generated
	 */
	public Adapter createResearchStudyObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ResearchStudyOutcomeMeasure <em>Research Study Outcome Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ResearchStudyOutcomeMeasure
	 * @generated
	 */
	public Adapter createResearchStudyOutcomeMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ResearchStudyProgressStatus <em>Research Study Progress Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ResearchStudyProgressStatus
	 * @generated
	 */
	public Adapter createResearchStudyProgressStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ResearchStudyRecruitment <em>Research Study Recruitment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ResearchStudyRecruitment
	 * @generated
	 */
	public Adapter createResearchStudyRecruitmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ResearchSubject <em>Research Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ResearchSubject
	 * @generated
	 */
	public Adapter createResearchSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ResearchSubjectProgress <em>Research Subject Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ResearchSubjectProgress
	 * @generated
	 */
	public Adapter createResearchSubjectProgressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ResourceContainer <em>Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ResourceContainer
	 * @generated
	 */
	public Adapter createResourceContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ResourceType
	 * @generated
	 */
	public Adapter createResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ResourceVersionPolicy <em>Resource Version Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ResourceVersionPolicy
	 * @generated
	 */
	public Adapter createResourceVersionPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ResponseType <em>Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ResponseType
	 * @generated
	 */
	public Adapter createResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RestfulCapabilityMode <em>Restful Capability Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RestfulCapabilityMode
	 * @generated
	 */
	public Adapter createRestfulCapabilityModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RiskAssessment <em>Risk Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RiskAssessment
	 * @generated
	 */
	public Adapter createRiskAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.RiskAssessmentPrediction <em>Risk Assessment Prediction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.RiskAssessmentPrediction
	 * @generated
	 */
	public Adapter createRiskAssessmentPredictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SampledData <em>Sampled Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SampledData
	 * @generated
	 */
	public Adapter createSampledDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SampledDataDataType <em>Sampled Data Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SampledDataDataType
	 * @generated
	 */
	public Adapter createSampledDataDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Schedule
	 * @generated
	 */
	public Adapter createScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SearchComparator <em>Search Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SearchComparator
	 * @generated
	 */
	public Adapter createSearchComparatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SearchEntryMode <em>Search Entry Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SearchEntryMode
	 * @generated
	 */
	public Adapter createSearchEntryModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SearchModifierCode <em>Search Modifier Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SearchModifierCode
	 * @generated
	 */
	public Adapter createSearchModifierCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SearchParameter <em>Search Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SearchParameter
	 * @generated
	 */
	public Adapter createSearchParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SearchParameterComponent <em>Search Parameter Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SearchParameterComponent
	 * @generated
	 */
	public Adapter createSearchParameterComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SearchParamType <em>Search Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SearchParamType
	 * @generated
	 */
	public Adapter createSearchParamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SearchProcessingModeType <em>Search Processing Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SearchProcessingModeType
	 * @generated
	 */
	public Adapter createSearchProcessingModeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SequenceType
	 * @generated
	 */
	public Adapter createSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ServiceRequest <em>Service Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ServiceRequest
	 * @generated
	 */
	public Adapter createServiceRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ServiceRequestOrderDetail <em>Service Request Order Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ServiceRequestOrderDetail
	 * @generated
	 */
	public Adapter createServiceRequestOrderDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ServiceRequestParameter <em>Service Request Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ServiceRequestParameter
	 * @generated
	 */
	public Adapter createServiceRequestParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ServiceRequestPatientInstruction <em>Service Request Patient Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ServiceRequestPatientInstruction
	 * @generated
	 */
	public Adapter createServiceRequestPatientInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Signature
	 * @generated
	 */
	public Adapter createSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SlicingRules <em>Slicing Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SlicingRules
	 * @generated
	 */
	public Adapter createSlicingRulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Slot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Slot
	 * @generated
	 */
	public Adapter createSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SlotStatus <em>Slot Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SlotStatus
	 * @generated
	 */
	public Adapter createSlotStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SortDirection <em>Sort Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SortDirection
	 * @generated
	 */
	public Adapter createSortDirectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SPDXLicense <em>SPDX License</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SPDXLicense
	 * @generated
	 */
	public Adapter createSPDXLicenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Specimen <em>Specimen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Specimen
	 * @generated
	 */
	public Adapter createSpecimenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SpecimenCollection <em>Specimen Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SpecimenCollection
	 * @generated
	 */
	public Adapter createSpecimenCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SpecimenCombined <em>Specimen Combined</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SpecimenCombined
	 * @generated
	 */
	public Adapter createSpecimenCombinedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SpecimenContainedPreference <em>Specimen Contained Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SpecimenContainedPreference
	 * @generated
	 */
	public Adapter createSpecimenContainedPreferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SpecimenContainer <em>Specimen Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SpecimenContainer
	 * @generated
	 */
	public Adapter createSpecimenContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SpecimenDefinition <em>Specimen Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SpecimenDefinition
	 * @generated
	 */
	public Adapter createSpecimenDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SpecimenDefinitionAdditive <em>Specimen Definition Additive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SpecimenDefinitionAdditive
	 * @generated
	 */
	public Adapter createSpecimenDefinitionAdditiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SpecimenDefinitionContainer <em>Specimen Definition Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SpecimenDefinitionContainer
	 * @generated
	 */
	public Adapter createSpecimenDefinitionContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SpecimenDefinitionHandling <em>Specimen Definition Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SpecimenDefinitionHandling
	 * @generated
	 */
	public Adapter createSpecimenDefinitionHandlingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SpecimenDefinitionTypeTested <em>Specimen Definition Type Tested</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SpecimenDefinitionTypeTested
	 * @generated
	 */
	public Adapter createSpecimenDefinitionTypeTestedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SpecimenFeature <em>Specimen Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SpecimenFeature
	 * @generated
	 */
	public Adapter createSpecimenFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SpecimenProcessing <em>Specimen Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SpecimenProcessing
	 * @generated
	 */
	public Adapter createSpecimenProcessingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SpecimenStatus <em>Specimen Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SpecimenStatus
	 * @generated
	 */
	public Adapter createSpecimenStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StrandType <em>Strand Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StrandType
	 * @generated
	 */
	public Adapter createStrandTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureDefinition <em>Structure Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureDefinition
	 * @generated
	 */
	public Adapter createStructureDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureDefinitionContext <em>Structure Definition Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureDefinitionContext
	 * @generated
	 */
	public Adapter createStructureDefinitionContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureDefinitionDifferential <em>Structure Definition Differential</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureDefinitionDifferential
	 * @generated
	 */
	public Adapter createStructureDefinitionDifferentialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureDefinitionKind <em>Structure Definition Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureDefinitionKind
	 * @generated
	 */
	public Adapter createStructureDefinitionKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureDefinitionMapping <em>Structure Definition Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureDefinitionMapping
	 * @generated
	 */
	public Adapter createStructureDefinitionMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureDefinitionSnapshot <em>Structure Definition Snapshot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureDefinitionSnapshot
	 * @generated
	 */
	public Adapter createStructureDefinitionSnapshotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMap <em>Structure Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMap
	 * @generated
	 */
	public Adapter createStructureMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapConst <em>Structure Map Const</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapConst
	 * @generated
	 */
	public Adapter createStructureMapConstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapDependent <em>Structure Map Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapDependent
	 * @generated
	 */
	public Adapter createStructureMapDependentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapGroup <em>Structure Map Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapGroup
	 * @generated
	 */
	public Adapter createStructureMapGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapGroupTypeMode <em>Structure Map Group Type Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapGroupTypeMode
	 * @generated
	 */
	public Adapter createStructureMapGroupTypeModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapInput <em>Structure Map Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapInput
	 * @generated
	 */
	public Adapter createStructureMapInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapInputMode <em>Structure Map Input Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapInputMode
	 * @generated
	 */
	public Adapter createStructureMapInputModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapModelMode <em>Structure Map Model Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapModelMode
	 * @generated
	 */
	public Adapter createStructureMapModelModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapParameter <em>Structure Map Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapParameter
	 * @generated
	 */
	public Adapter createStructureMapParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapRule <em>Structure Map Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapRule
	 * @generated
	 */
	public Adapter createStructureMapRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapSource <em>Structure Map Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapSource
	 * @generated
	 */
	public Adapter createStructureMapSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapSourceListMode <em>Structure Map Source List Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapSourceListMode
	 * @generated
	 */
	public Adapter createStructureMapSourceListModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapStructure <em>Structure Map Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapStructure
	 * @generated
	 */
	public Adapter createStructureMapStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapTarget <em>Structure Map Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapTarget
	 * @generated
	 */
	public Adapter createStructureMapTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapTargetListMode <em>Structure Map Target List Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapTargetListMode
	 * @generated
	 */
	public Adapter createStructureMapTargetListModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.StructureMapTransform <em>Structure Map Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.StructureMapTransform
	 * @generated
	 */
	public Adapter createStructureMapTransformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubmitDataUpdateType <em>Submit Data Update Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubmitDataUpdateType
	 * @generated
	 */
	public Adapter createSubmitDataUpdateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Subscription <em>Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Subscription
	 * @generated
	 */
	public Adapter createSubscriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubscriptionFilterBy <em>Subscription Filter By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubscriptionFilterBy
	 * @generated
	 */
	public Adapter createSubscriptionFilterByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubscriptionNotificationType <em>Subscription Notification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubscriptionNotificationType
	 * @generated
	 */
	public Adapter createSubscriptionNotificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubscriptionParameter <em>Subscription Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubscriptionParameter
	 * @generated
	 */
	public Adapter createSubscriptionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubscriptionPayloadContent <em>Subscription Payload Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubscriptionPayloadContent
	 * @generated
	 */
	public Adapter createSubscriptionPayloadContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubscriptionStatus <em>Subscription Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubscriptionStatus
	 * @generated
	 */
	public Adapter createSubscriptionStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubscriptionStatusCodes <em>Subscription Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubscriptionStatusCodes
	 * @generated
	 */
	public Adapter createSubscriptionStatusCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubscriptionStatusNotificationEvent <em>Subscription Status Notification Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubscriptionStatusNotificationEvent
	 * @generated
	 */
	public Adapter createSubscriptionStatusNotificationEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubscriptionTopic <em>Subscription Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubscriptionTopic
	 * @generated
	 */
	public Adapter createSubscriptionTopicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubscriptionTopicCanFilterBy <em>Subscription Topic Can Filter By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubscriptionTopicCanFilterBy
	 * @generated
	 */
	public Adapter createSubscriptionTopicCanFilterByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubscriptionTopicEventTrigger <em>Subscription Topic Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubscriptionTopicEventTrigger
	 * @generated
	 */
	public Adapter createSubscriptionTopicEventTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubscriptionTopicNotificationShape <em>Subscription Topic Notification Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubscriptionTopicNotificationShape
	 * @generated
	 */
	public Adapter createSubscriptionTopicNotificationShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubscriptionTopicQueryCriteria <em>Subscription Topic Query Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubscriptionTopicQueryCriteria
	 * @generated
	 */
	public Adapter createSubscriptionTopicQueryCriteriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubscriptionTopicResourceTrigger <em>Subscription Topic Resource Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubscriptionTopicResourceTrigger
	 * @generated
	 */
	public Adapter createSubscriptionTopicResourceTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Substance <em>Substance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Substance
	 * @generated
	 */
	public Adapter createSubstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceDefinition <em>Substance Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceDefinition
	 * @generated
	 */
	public Adapter createSubstanceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceDefinitionCharacterization <em>Substance Definition Characterization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceDefinitionCharacterization
	 * @generated
	 */
	public Adapter createSubstanceDefinitionCharacterizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceDefinitionCode <em>Substance Definition Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceDefinitionCode
	 * @generated
	 */
	public Adapter createSubstanceDefinitionCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceDefinitionMoiety <em>Substance Definition Moiety</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceDefinitionMoiety
	 * @generated
	 */
	public Adapter createSubstanceDefinitionMoietyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceDefinitionMolecularWeight <em>Substance Definition Molecular Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceDefinitionMolecularWeight
	 * @generated
	 */
	public Adapter createSubstanceDefinitionMolecularWeightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceDefinitionName <em>Substance Definition Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceDefinitionName
	 * @generated
	 */
	public Adapter createSubstanceDefinitionNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceDefinitionOfficial <em>Substance Definition Official</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceDefinitionOfficial
	 * @generated
	 */
	public Adapter createSubstanceDefinitionOfficialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceDefinitionProperty <em>Substance Definition Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceDefinitionProperty
	 * @generated
	 */
	public Adapter createSubstanceDefinitionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceDefinitionRelationship <em>Substance Definition Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceDefinitionRelationship
	 * @generated
	 */
	public Adapter createSubstanceDefinitionRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceDefinitionRepresentation <em>Substance Definition Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceDefinitionRepresentation
	 * @generated
	 */
	public Adapter createSubstanceDefinitionRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceDefinitionSourceMaterial <em>Substance Definition Source Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceDefinitionSourceMaterial
	 * @generated
	 */
	public Adapter createSubstanceDefinitionSourceMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceDefinitionStructure <em>Substance Definition Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceDefinitionStructure
	 * @generated
	 */
	public Adapter createSubstanceDefinitionStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceIngredient <em>Substance Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceIngredient
	 * @generated
	 */
	public Adapter createSubstanceIngredientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceNucleicAcid <em>Substance Nucleic Acid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceNucleicAcid
	 * @generated
	 */
	public Adapter createSubstanceNucleicAcidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceNucleicAcidLinkage <em>Substance Nucleic Acid Linkage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceNucleicAcidLinkage
	 * @generated
	 */
	public Adapter createSubstanceNucleicAcidLinkageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceNucleicAcidSubunit <em>Substance Nucleic Acid Subunit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceNucleicAcidSubunit
	 * @generated
	 */
	public Adapter createSubstanceNucleicAcidSubunitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceNucleicAcidSugar <em>Substance Nucleic Acid Sugar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceNucleicAcidSugar
	 * @generated
	 */
	public Adapter createSubstanceNucleicAcidSugarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstancePolymer <em>Substance Polymer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstancePolymer
	 * @generated
	 */
	public Adapter createSubstancePolymerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstancePolymerDegreeOfPolymerisation <em>Substance Polymer Degree Of Polymerisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstancePolymerDegreeOfPolymerisation
	 * @generated
	 */
	public Adapter createSubstancePolymerDegreeOfPolymerisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstancePolymerMonomerSet <em>Substance Polymer Monomer Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstancePolymerMonomerSet
	 * @generated
	 */
	public Adapter createSubstancePolymerMonomerSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstancePolymerRepeat <em>Substance Polymer Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstancePolymerRepeat
	 * @generated
	 */
	public Adapter createSubstancePolymerRepeatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstancePolymerRepeatUnit <em>Substance Polymer Repeat Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstancePolymerRepeatUnit
	 * @generated
	 */
	public Adapter createSubstancePolymerRepeatUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstancePolymerStartingMaterial <em>Substance Polymer Starting Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstancePolymerStartingMaterial
	 * @generated
	 */
	public Adapter createSubstancePolymerStartingMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstancePolymerStructuralRepresentation <em>Substance Polymer Structural Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstancePolymerStructuralRepresentation
	 * @generated
	 */
	public Adapter createSubstancePolymerStructuralRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceProtein <em>Substance Protein</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceProtein
	 * @generated
	 */
	public Adapter createSubstanceProteinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceProteinSubunit <em>Substance Protein Subunit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceProteinSubunit
	 * @generated
	 */
	public Adapter createSubstanceProteinSubunitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceReferenceInformation <em>Substance Reference Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceReferenceInformation
	 * @generated
	 */
	public Adapter createSubstanceReferenceInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceReferenceInformationGene <em>Substance Reference Information Gene</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceReferenceInformationGene
	 * @generated
	 */
	public Adapter createSubstanceReferenceInformationGeneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceReferenceInformationGeneElement <em>Substance Reference Information Gene Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceReferenceInformationGeneElement
	 * @generated
	 */
	public Adapter createSubstanceReferenceInformationGeneElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceReferenceInformationTarget <em>Substance Reference Information Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceReferenceInformationTarget
	 * @generated
	 */
	public Adapter createSubstanceReferenceInformationTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceSourceMaterial <em>Substance Source Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceSourceMaterial
	 * @generated
	 */
	public Adapter createSubstanceSourceMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceSourceMaterialAuthor <em>Substance Source Material Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceSourceMaterialAuthor
	 * @generated
	 */
	public Adapter createSubstanceSourceMaterialAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceSourceMaterialFractionDescription <em>Substance Source Material Fraction Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceSourceMaterialFractionDescription
	 * @generated
	 */
	public Adapter createSubstanceSourceMaterialFractionDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceSourceMaterialHybrid <em>Substance Source Material Hybrid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceSourceMaterialHybrid
	 * @generated
	 */
	public Adapter createSubstanceSourceMaterialHybridAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceSourceMaterialOrganism <em>Substance Source Material Organism</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceSourceMaterialOrganism
	 * @generated
	 */
	public Adapter createSubstanceSourceMaterialOrganismAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceSourceMaterialOrganismGeneral <em>Substance Source Material Organism General</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceSourceMaterialOrganismGeneral
	 * @generated
	 */
	public Adapter createSubstanceSourceMaterialOrganismGeneralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SubstanceSourceMaterialPartDescription <em>Substance Source Material Part Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SubstanceSourceMaterialPartDescription
	 * @generated
	 */
	public Adapter createSubstanceSourceMaterialPartDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SupplyDelivery <em>Supply Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SupplyDelivery
	 * @generated
	 */
	public Adapter createSupplyDeliveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SupplyDeliveryStatus <em>Supply Delivery Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SupplyDeliveryStatus
	 * @generated
	 */
	public Adapter createSupplyDeliveryStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SupplyDeliverySuppliedItem <em>Supply Delivery Supplied Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SupplyDeliverySuppliedItem
	 * @generated
	 */
	public Adapter createSupplyDeliverySuppliedItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SupplyRequest <em>Supply Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SupplyRequest
	 * @generated
	 */
	public Adapter createSupplyRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SupplyRequestParameter <em>Supply Request Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SupplyRequestParameter
	 * @generated
	 */
	public Adapter createSupplyRequestParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SupplyRequestStatus <em>Supply Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SupplyRequestStatus
	 * @generated
	 */
	public Adapter createSupplyRequestStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.SystemRestfulInteraction <em>System Restful Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.SystemRestfulInteraction
	 * @generated
	 */
	public Adapter createSystemRestfulInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TaskInput <em>Task Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TaskInput
	 * @generated
	 */
	public Adapter createTaskInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TaskIntent <em>Task Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TaskIntent
	 * @generated
	 */
	public Adapter createTaskIntentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TaskOutput <em>Task Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TaskOutput
	 * @generated
	 */
	public Adapter createTaskOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TaskPerformer <em>Task Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TaskPerformer
	 * @generated
	 */
	public Adapter createTaskPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TaskRestriction <em>Task Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TaskRestriction
	 * @generated
	 */
	public Adapter createTaskRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TaskStatus <em>Task Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TaskStatus
	 * @generated
	 */
	public Adapter createTaskStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TerminologyCapabilities <em>Terminology Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TerminologyCapabilities
	 * @generated
	 */
	public Adapter createTerminologyCapabilitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TerminologyCapabilitiesClosure <em>Terminology Capabilities Closure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TerminologyCapabilitiesClosure
	 * @generated
	 */
	public Adapter createTerminologyCapabilitiesClosureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TerminologyCapabilitiesCodeSystem <em>Terminology Capabilities Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TerminologyCapabilitiesCodeSystem
	 * @generated
	 */
	public Adapter createTerminologyCapabilitiesCodeSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TerminologyCapabilitiesExpansion <em>Terminology Capabilities Expansion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TerminologyCapabilitiesExpansion
	 * @generated
	 */
	public Adapter createTerminologyCapabilitiesExpansionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TerminologyCapabilitiesFilter <em>Terminology Capabilities Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TerminologyCapabilitiesFilter
	 * @generated
	 */
	public Adapter createTerminologyCapabilitiesFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TerminologyCapabilitiesImplementation <em>Terminology Capabilities Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TerminologyCapabilitiesImplementation
	 * @generated
	 */
	public Adapter createTerminologyCapabilitiesImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TerminologyCapabilitiesParameter <em>Terminology Capabilities Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TerminologyCapabilitiesParameter
	 * @generated
	 */
	public Adapter createTerminologyCapabilitiesParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TerminologyCapabilitiesSoftware <em>Terminology Capabilities Software</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TerminologyCapabilitiesSoftware
	 * @generated
	 */
	public Adapter createTerminologyCapabilitiesSoftwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TerminologyCapabilitiesTranslation <em>Terminology Capabilities Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TerminologyCapabilitiesTranslation
	 * @generated
	 */
	public Adapter createTerminologyCapabilitiesTranslationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TerminologyCapabilitiesValidateCode <em>Terminology Capabilities Validate Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TerminologyCapabilitiesValidateCode
	 * @generated
	 */
	public Adapter createTerminologyCapabilitiesValidateCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TerminologyCapabilitiesVersion <em>Terminology Capabilities Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TerminologyCapabilitiesVersion
	 * @generated
	 */
	public Adapter createTerminologyCapabilitiesVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestPlan <em>Test Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestPlan
	 * @generated
	 */
	public Adapter createTestPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestPlanAssertion <em>Test Plan Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestPlanAssertion
	 * @generated
	 */
	public Adapter createTestPlanAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestPlanDependency <em>Test Plan Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestPlanDependency
	 * @generated
	 */
	public Adapter createTestPlanDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestPlanDependency1 <em>Test Plan Dependency1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestPlanDependency1
	 * @generated
	 */
	public Adapter createTestPlanDependency1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestPlanScript <em>Test Plan Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestPlanScript
	 * @generated
	 */
	public Adapter createTestPlanScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestPlanTestCase <em>Test Plan Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestPlanTestCase
	 * @generated
	 */
	public Adapter createTestPlanTestCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestPlanTestData <em>Test Plan Test Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestPlanTestData
	 * @generated
	 */
	public Adapter createTestPlanTestDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestPlanTestRun <em>Test Plan Test Run</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestPlanTestRun
	 * @generated
	 */
	public Adapter createTestPlanTestRunAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReport <em>Test Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReport
	 * @generated
	 */
	public Adapter createTestReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportAction <em>Test Report Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportAction
	 * @generated
	 */
	public Adapter createTestReportActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportAction1 <em>Test Report Action1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportAction1
	 * @generated
	 */
	public Adapter createTestReportAction1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportAction2 <em>Test Report Action2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportAction2
	 * @generated
	 */
	public Adapter createTestReportAction2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportActionResult <em>Test Report Action Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportActionResult
	 * @generated
	 */
	public Adapter createTestReportActionResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportAssert <em>Test Report Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportAssert
	 * @generated
	 */
	public Adapter createTestReportAssertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportOperation <em>Test Report Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportOperation
	 * @generated
	 */
	public Adapter createTestReportOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportParticipant <em>Test Report Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportParticipant
	 * @generated
	 */
	public Adapter createTestReportParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportParticipantType <em>Test Report Participant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportParticipantType
	 * @generated
	 */
	public Adapter createTestReportParticipantTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportRequirement <em>Test Report Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportRequirement
	 * @generated
	 */
	public Adapter createTestReportRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportResult <em>Test Report Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportResult
	 * @generated
	 */
	public Adapter createTestReportResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportSetup <em>Test Report Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportSetup
	 * @generated
	 */
	public Adapter createTestReportSetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportStatus <em>Test Report Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportStatus
	 * @generated
	 */
	public Adapter createTestReportStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportTeardown <em>Test Report Teardown</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportTeardown
	 * @generated
	 */
	public Adapter createTestReportTeardownAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestReportTest <em>Test Report Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestReportTest
	 * @generated
	 */
	public Adapter createTestReportTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScript <em>Test Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScript
	 * @generated
	 */
	public Adapter createTestScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptAction <em>Test Script Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptAction
	 * @generated
	 */
	public Adapter createTestScriptActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptAction1 <em>Test Script Action1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptAction1
	 * @generated
	 */
	public Adapter createTestScriptAction1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptAction2 <em>Test Script Action2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptAction2
	 * @generated
	 */
	public Adapter createTestScriptAction2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptAssert <em>Test Script Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptAssert
	 * @generated
	 */
	public Adapter createTestScriptAssertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptCapability <em>Test Script Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptCapability
	 * @generated
	 */
	public Adapter createTestScriptCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptDestination <em>Test Script Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptDestination
	 * @generated
	 */
	public Adapter createTestScriptDestinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptFixture <em>Test Script Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptFixture
	 * @generated
	 */
	public Adapter createTestScriptFixtureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptLink <em>Test Script Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptLink
	 * @generated
	 */
	public Adapter createTestScriptLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptMetadata <em>Test Script Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptMetadata
	 * @generated
	 */
	public Adapter createTestScriptMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptOperation <em>Test Script Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptOperation
	 * @generated
	 */
	public Adapter createTestScriptOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptOrigin <em>Test Script Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptOrigin
	 * @generated
	 */
	public Adapter createTestScriptOriginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptRequestHeader <em>Test Script Request Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptRequestHeader
	 * @generated
	 */
	public Adapter createTestScriptRequestHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptRequestMethodCode <em>Test Script Request Method Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptRequestMethodCode
	 * @generated
	 */
	public Adapter createTestScriptRequestMethodCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptRequirement <em>Test Script Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptRequirement
	 * @generated
	 */
	public Adapter createTestScriptRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptScope <em>Test Script Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptScope
	 * @generated
	 */
	public Adapter createTestScriptScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptSetup <em>Test Script Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptSetup
	 * @generated
	 */
	public Adapter createTestScriptSetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptTeardown <em>Test Script Teardown</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptTeardown
	 * @generated
	 */
	public Adapter createTestScriptTeardownAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptTest <em>Test Script Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptTest
	 * @generated
	 */
	public Adapter createTestScriptTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TestScriptVariable <em>Test Script Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TestScriptVariable
	 * @generated
	 */
	public Adapter createTestScriptVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Timing <em>Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Timing
	 * @generated
	 */
	public Adapter createTimingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TimingRepeat <em>Timing Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TimingRepeat
	 * @generated
	 */
	public Adapter createTimingRepeatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Transport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Transport
	 * @generated
	 */
	public Adapter createTransportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TransportInput <em>Transport Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TransportInput
	 * @generated
	 */
	public Adapter createTransportInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TransportIntent <em>Transport Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TransportIntent
	 * @generated
	 */
	public Adapter createTransportIntentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TransportOutput <em>Transport Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TransportOutput
	 * @generated
	 */
	public Adapter createTransportOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TransportRestriction <em>Transport Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TransportRestriction
	 * @generated
	 */
	public Adapter createTransportRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TransportStatus <em>Transport Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TransportStatus
	 * @generated
	 */
	public Adapter createTransportStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TriggerDefinition <em>Trigger Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TriggerDefinition
	 * @generated
	 */
	public Adapter createTriggerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TriggeredBytype <em>Triggered Bytype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TriggeredBytype
	 * @generated
	 */
	public Adapter createTriggeredBytypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TriggerType <em>Trigger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TriggerType
	 * @generated
	 */
	public Adapter createTriggerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TypeDerivationRule <em>Type Derivation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TypeDerivationRule
	 * @generated
	 */
	public Adapter createTypeDerivationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.TypeRestfulInteraction <em>Type Restful Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.TypeRestfulInteraction
	 * @generated
	 */
	public Adapter createTypeRestfulInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.UDIEntryType <em>UDI Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.UDIEntryType
	 * @generated
	 */
	public Adapter createUDIEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.UnitsOfTime <em>Units Of Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.UnitsOfTime
	 * @generated
	 */
	public Adapter createUnitsOfTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.UnsignedInt <em>Unsigned Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.UnsignedInt
	 * @generated
	 */
	public Adapter createUnsignedIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Uri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Uri
	 * @generated
	 */
	public Adapter createUriAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Url <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Url
	 * @generated
	 */
	public Adapter createUrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.UsageContext <em>Usage Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.UsageContext
	 * @generated
	 */
	public Adapter createUsageContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Use <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Use
	 * @generated
	 */
	public Adapter createUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.Uuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.Uuid
	 * @generated
	 */
	public Adapter createUuidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ValueSet
	 * @generated
	 */
	public Adapter createValueSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ValueSetCompose <em>Value Set Compose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ValueSetCompose
	 * @generated
	 */
	public Adapter createValueSetComposeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ValueSetConcept <em>Value Set Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ValueSetConcept
	 * @generated
	 */
	public Adapter createValueSetConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ValueSetContains <em>Value Set Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ValueSetContains
	 * @generated
	 */
	public Adapter createValueSetContainsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ValueSetDesignation <em>Value Set Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ValueSetDesignation
	 * @generated
	 */
	public Adapter createValueSetDesignationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ValueSetExpansion <em>Value Set Expansion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ValueSetExpansion
	 * @generated
	 */
	public Adapter createValueSetExpansionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ValueSetFilter <em>Value Set Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ValueSetFilter
	 * @generated
	 */
	public Adapter createValueSetFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ValueSetInclude <em>Value Set Include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ValueSetInclude
	 * @generated
	 */
	public Adapter createValueSetIncludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ValueSetParameter <em>Value Set Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ValueSetParameter
	 * @generated
	 */
	public Adapter createValueSetParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ValueSetProperty <em>Value Set Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ValueSetProperty
	 * @generated
	 */
	public Adapter createValueSetPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ValueSetProperty1 <em>Value Set Property1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ValueSetProperty1
	 * @generated
	 */
	public Adapter createValueSetProperty1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ValueSetScope <em>Value Set Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ValueSetScope
	 * @generated
	 */
	public Adapter createValueSetScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.ValueSetSubProperty <em>Value Set Sub Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.ValueSetSubProperty
	 * @generated
	 */
	public Adapter createValueSetSubPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.VerificationResult <em>Verification Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.VerificationResult
	 * @generated
	 */
	public Adapter createVerificationResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.VerificationResultAttestation <em>Verification Result Attestation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.VerificationResultAttestation
	 * @generated
	 */
	public Adapter createVerificationResultAttestationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.VerificationResultPrimarySource <em>Verification Result Primary Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.VerificationResultPrimarySource
	 * @generated
	 */
	public Adapter createVerificationResultPrimarySourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.VerificationResultStatus <em>Verification Result Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.VerificationResultStatus
	 * @generated
	 */
	public Adapter createVerificationResultStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.VerificationResultValidator <em>Verification Result Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.VerificationResultValidator
	 * @generated
	 */
	public Adapter createVerificationResultValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.VersionIndependentResourceTypesAll <em>Version Independent Resource Types All</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.VersionIndependentResourceTypesAll
	 * @generated
	 */
	public Adapter createVersionIndependentResourceTypesAllAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.VirtualServiceDetail <em>Virtual Service Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.VirtualServiceDetail
	 * @generated
	 */
	public Adapter createVirtualServiceDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.VisionBase <em>Vision Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.VisionBase
	 * @generated
	 */
	public Adapter createVisionBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.VisionEyes <em>Vision Eyes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.VisionEyes
	 * @generated
	 */
	public Adapter createVisionEyesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.VisionPrescription <em>Vision Prescription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.VisionPrescription
	 * @generated
	 */
	public Adapter createVisionPrescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.VisionPrescriptionLensSpecification <em>Vision Prescription Lens Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.VisionPrescriptionLensSpecification
	 * @generated
	 */
	public Adapter createVisionPrescriptionLensSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.fhir.VisionPrescriptionPrism <em>Vision Prescription Prism</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.fhir.VisionPrescriptionPrism
	 * @generated
	 */
	public Adapter createVisionPrescriptionPrismAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FhirAdapterFactory
