/**
 */
package org.hl7.fhir.impl;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.hl7.fhir.Account;
import org.hl7.fhir.AccountBalance;
import org.hl7.fhir.AccountCoverage;
import org.hl7.fhir.AccountDiagnosis;
import org.hl7.fhir.AccountGuarantor;
import org.hl7.fhir.AccountProcedure;
import org.hl7.fhir.AccountRelatedAccount;
import org.hl7.fhir.AccountStatus;
import org.hl7.fhir.AccountStatusEnum;
import org.hl7.fhir.ActionCardinalityBehavior;
import org.hl7.fhir.ActionCardinalityBehaviorEnum;
import org.hl7.fhir.ActionConditionKind;
import org.hl7.fhir.ActionConditionKindEnum;
import org.hl7.fhir.ActionGroupingBehavior;
import org.hl7.fhir.ActionGroupingBehaviorEnum;
import org.hl7.fhir.ActionParticipantType;
import org.hl7.fhir.ActionParticipantTypeEnum;
import org.hl7.fhir.ActionPrecheckBehavior;
import org.hl7.fhir.ActionPrecheckBehaviorEnum;
import org.hl7.fhir.ActionRelationshipType;
import org.hl7.fhir.ActionRelationshipTypeEnum;
import org.hl7.fhir.ActionRequiredBehavior;
import org.hl7.fhir.ActionRequiredBehaviorEnum;
import org.hl7.fhir.ActionSelectionBehavior;
import org.hl7.fhir.ActionSelectionBehaviorEnum;
import org.hl7.fhir.ActivityDefinition;
import org.hl7.fhir.ActivityDefinitionDynamicValue;
import org.hl7.fhir.ActivityDefinitionParticipant;
import org.hl7.fhir.ActorDefinition;
import org.hl7.fhir.Address;
import org.hl7.fhir.AddressType;
import org.hl7.fhir.AddressTypeEnum;
import org.hl7.fhir.AddressUse;
import org.hl7.fhir.AddressUseEnum;
import org.hl7.fhir.AdministrableProductDefinition;
import org.hl7.fhir.AdministrableProductDefinitionProperty;
import org.hl7.fhir.AdministrableProductDefinitionRouteOfAdministration;
import org.hl7.fhir.AdministrableProductDefinitionTargetSpecies;
import org.hl7.fhir.AdministrableProductDefinitionWithdrawalPeriod;
import org.hl7.fhir.AdministrativeGender;
import org.hl7.fhir.AdministrativeGenderEnum;
import org.hl7.fhir.AdverseEvent;
import org.hl7.fhir.AdverseEventActuality;
import org.hl7.fhir.AdverseEventActualityEnum;
import org.hl7.fhir.AdverseEventCausality;
import org.hl7.fhir.AdverseEventContributingFactor;
import org.hl7.fhir.AdverseEventMitigatingAction;
import org.hl7.fhir.AdverseEventParticipant;
import org.hl7.fhir.AdverseEventPreventiveAction;
import org.hl7.fhir.AdverseEventStatus;
import org.hl7.fhir.AdverseEventStatusEnum;
import org.hl7.fhir.AdverseEventSupportingInfo;
import org.hl7.fhir.AdverseEventSuspectEntity;
import org.hl7.fhir.Age;
import org.hl7.fhir.AgeUnits;
import org.hl7.fhir.AgeUnitsEnum;
import org.hl7.fhir.AggregationMode;
import org.hl7.fhir.AggregationModeEnum;
import org.hl7.fhir.AllResourceTypes;
import org.hl7.fhir.AllResourceTypesEnum;
import org.hl7.fhir.AllergyIntolerance;
import org.hl7.fhir.AllergyIntoleranceCategory;
import org.hl7.fhir.AllergyIntoleranceCategoryEnum;
import org.hl7.fhir.AllergyIntoleranceCriticality;
import org.hl7.fhir.AllergyIntoleranceCriticalityEnum;
import org.hl7.fhir.AllergyIntoleranceParticipant;
import org.hl7.fhir.AllergyIntoleranceReaction;
import org.hl7.fhir.AllergyIntoleranceSeverity;
import org.hl7.fhir.AllergyIntoleranceSeverityEnum;
import org.hl7.fhir.Annotation;
import org.hl7.fhir.Appointment;
import org.hl7.fhir.AppointmentMonthlyTemplate;
import org.hl7.fhir.AppointmentParticipant;
import org.hl7.fhir.AppointmentRecurrenceTemplate;
import org.hl7.fhir.AppointmentResponse;
import org.hl7.fhir.AppointmentResponseStatus;
import org.hl7.fhir.AppointmentResponseStatusEnum;
import org.hl7.fhir.AppointmentStatus;
import org.hl7.fhir.AppointmentStatusEnum;
import org.hl7.fhir.AppointmentWeeklyTemplate;
import org.hl7.fhir.AppointmentYearlyTemplate;
import org.hl7.fhir.ArtifactAssessment;
import org.hl7.fhir.ArtifactAssessmentContent;
import org.hl7.fhir.ArtifactAssessmentDisposition;
import org.hl7.fhir.ArtifactAssessmentDispositionEnum;
import org.hl7.fhir.ArtifactAssessmentInformationType;
import org.hl7.fhir.ArtifactAssessmentInformationTypeEnum;
import org.hl7.fhir.ArtifactAssessmentWorkflowStatus;
import org.hl7.fhir.ArtifactAssessmentWorkflowStatusEnum;
import org.hl7.fhir.AssertionDirectionType;
import org.hl7.fhir.AssertionDirectionTypeEnum;
import org.hl7.fhir.AssertionManualCompletionType;
import org.hl7.fhir.AssertionManualCompletionTypeEnum;
import org.hl7.fhir.AssertionOperatorType;
import org.hl7.fhir.AssertionOperatorTypeEnum;
import org.hl7.fhir.AssertionResponseTypes;
import org.hl7.fhir.AssertionResponseTypesEnum;
import org.hl7.fhir.Attachment;
import org.hl7.fhir.AuditEvent;
import org.hl7.fhir.AuditEventAction;
import org.hl7.fhir.AuditEventActionEnum;
import org.hl7.fhir.AuditEventAgent;
import org.hl7.fhir.AuditEventDetail;
import org.hl7.fhir.AuditEventEntity;
import org.hl7.fhir.AuditEventOutcome;
import org.hl7.fhir.AuditEventSeverity;
import org.hl7.fhir.AuditEventSeverityEnum;
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
import org.hl7.fhir.BindingStrengthEnum;
import org.hl7.fhir.BiologicallyDerivedProduct;
import org.hl7.fhir.BiologicallyDerivedProductCollection;
import org.hl7.fhir.BiologicallyDerivedProductDispense;
import org.hl7.fhir.BiologicallyDerivedProductDispenseCodes;
import org.hl7.fhir.BiologicallyDerivedProductDispenseCodesEnum;
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
import org.hl7.fhir.BundleTypeEnum;
import org.hl7.fhir.Canonical;
import org.hl7.fhir.CanonicalResource;
import org.hl7.fhir.CapabilityStatement;
import org.hl7.fhir.CapabilityStatementDocument;
import org.hl7.fhir.CapabilityStatementEndpoint;
import org.hl7.fhir.CapabilityStatementImplementation;
import org.hl7.fhir.CapabilityStatementInteraction;
import org.hl7.fhir.CapabilityStatementInteraction1;
import org.hl7.fhir.CapabilityStatementKind;
import org.hl7.fhir.CapabilityStatementKindEnum;
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
import org.hl7.fhir.CarePlanIntentEnum;
import org.hl7.fhir.CareTeam;
import org.hl7.fhir.CareTeamParticipant;
import org.hl7.fhir.CareTeamStatus;
import org.hl7.fhir.CareTeamStatusEnum;
import org.hl7.fhir.CharacteristicCombination;
import org.hl7.fhir.CharacteristicCombinationEnum;
import org.hl7.fhir.ChargeItem;
import org.hl7.fhir.ChargeItemDefinition;
import org.hl7.fhir.ChargeItemDefinitionApplicability;
import org.hl7.fhir.ChargeItemDefinitionPropertyGroup;
import org.hl7.fhir.ChargeItemPerformer;
import org.hl7.fhir.ChargeItemStatus;
import org.hl7.fhir.ChargeItemStatusEnum;
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
import org.hl7.fhir.ClaimProcessingCodesEnum;
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
import org.hl7.fhir.ClinicalUseDefinitionTypeEnum;
import org.hl7.fhir.ClinicalUseDefinitionUndesirableEffect;
import org.hl7.fhir.ClinicalUseDefinitionWarning;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeSearchSupport;
import org.hl7.fhir.CodeSearchSupportEnum;
import org.hl7.fhir.CodeSystem;
import org.hl7.fhir.CodeSystemConcept;
import org.hl7.fhir.CodeSystemContentMode;
import org.hl7.fhir.CodeSystemContentModeEnum;
import org.hl7.fhir.CodeSystemDesignation;
import org.hl7.fhir.CodeSystemFilter;
import org.hl7.fhir.CodeSystemHierarchyMeaning;
import org.hl7.fhir.CodeSystemHierarchyMeaningEnum;
import org.hl7.fhir.CodeSystemProperty;
import org.hl7.fhir.CodeSystemProperty1;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.Coding;
import org.hl7.fhir.ColorCodesOrRGB;
import org.hl7.fhir.CommonLanguages;
import org.hl7.fhir.CommonLanguagesEnum;
import org.hl7.fhir.Communication;
import org.hl7.fhir.CommunicationPayload;
import org.hl7.fhir.CommunicationRequest;
import org.hl7.fhir.CommunicationRequestPayload;
import org.hl7.fhir.CompartmentDefinition;
import org.hl7.fhir.CompartmentDefinitionResource;
import org.hl7.fhir.CompartmentType;
import org.hl7.fhir.CompartmentTypeEnum;
import org.hl7.fhir.Composition;
import org.hl7.fhir.CompositionAttester;
import org.hl7.fhir.CompositionEvent;
import org.hl7.fhir.CompositionSection;
import org.hl7.fhir.CompositionStatus;
import org.hl7.fhir.CompositionStatusEnum;
import org.hl7.fhir.ConceptMap;
import org.hl7.fhir.ConceptMapAdditionalAttribute;
import org.hl7.fhir.ConceptMapAttributeType;
import org.hl7.fhir.ConceptMapAttributeTypeEnum;
import org.hl7.fhir.ConceptMapDependsOn;
import org.hl7.fhir.ConceptMapElement;
import org.hl7.fhir.ConceptMapGroup;
import org.hl7.fhir.ConceptMapGroupUnmappedMode;
import org.hl7.fhir.ConceptMapGroupUnmappedModeEnum;
import org.hl7.fhir.ConceptMapProperty;
import org.hl7.fhir.ConceptMapProperty1;
import org.hl7.fhir.ConceptMapPropertyType;
import org.hl7.fhir.ConceptMapPropertyTypeEnum;
import org.hl7.fhir.ConceptMapRelationship;
import org.hl7.fhir.ConceptMapRelationshipEnum;
import org.hl7.fhir.ConceptMapTarget;
import org.hl7.fhir.ConceptMapUnmapped;
import org.hl7.fhir.ConcreteFHIRTypes;
import org.hl7.fhir.ConcreteFHIRTypesEnum;
import org.hl7.fhir.Condition;
import org.hl7.fhir.ConditionDefinition;
import org.hl7.fhir.ConditionDefinitionMedication;
import org.hl7.fhir.ConditionDefinitionObservation;
import org.hl7.fhir.ConditionDefinitionPlan;
import org.hl7.fhir.ConditionDefinitionPrecondition;
import org.hl7.fhir.ConditionDefinitionQuestionnaire;
import org.hl7.fhir.ConditionParticipant;
import org.hl7.fhir.ConditionPreconditionType;
import org.hl7.fhir.ConditionPreconditionTypeEnum;
import org.hl7.fhir.ConditionQuestionnairePurpose;
import org.hl7.fhir.ConditionQuestionnairePurposeEnum;
import org.hl7.fhir.ConditionStage;
import org.hl7.fhir.ConditionalDeleteStatus;
import org.hl7.fhir.ConditionalDeleteStatusEnum;
import org.hl7.fhir.ConditionalReadStatus;
import org.hl7.fhir.ConditionalReadStatusEnum;
import org.hl7.fhir.ConformanceExpectation;
import org.hl7.fhir.ConformanceExpectationEnum;
import org.hl7.fhir.Consent;
import org.hl7.fhir.ConsentActor;
import org.hl7.fhir.ConsentData;
import org.hl7.fhir.ConsentDataMeaning;
import org.hl7.fhir.ConsentDataMeaningEnum;
import org.hl7.fhir.ConsentPolicyBasis;
import org.hl7.fhir.ConsentProvision;
import org.hl7.fhir.ConsentProvisionType;
import org.hl7.fhir.ConsentProvisionTypeEnum;
import org.hl7.fhir.ConsentState;
import org.hl7.fhir.ConsentStateEnum;
import org.hl7.fhir.ConsentVerification;
import org.hl7.fhir.ConstraintSeverity;
import org.hl7.fhir.ConstraintSeverityEnum;
import org.hl7.fhir.ContactDetail;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.ContactPointSystem;
import org.hl7.fhir.ContactPointSystemEnum;
import org.hl7.fhir.ContactPointUse;
import org.hl7.fhir.ContactPointUseEnum;
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
import org.hl7.fhir.ContractResourcePublicationStatusCodesEnum;
import org.hl7.fhir.ContractResourceStatusCodes;
import org.hl7.fhir.ContractResourceStatusCodesEnum;
import org.hl7.fhir.ContractRule;
import org.hl7.fhir.ContractSecurityLabel;
import org.hl7.fhir.ContractSigner;
import org.hl7.fhir.ContractSubject;
import org.hl7.fhir.ContractTerm;
import org.hl7.fhir.ContractValuedItem;
import org.hl7.fhir.Contributor;
import org.hl7.fhir.ContributorType;
import org.hl7.fhir.ContributorTypeEnum;
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
import org.hl7.fhir.CriteriaNotExistsBehaviorEnum;
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
import org.hl7.fhir.DefinitionResourceTypesEnum;
import org.hl7.fhir.DetectedIssue;
import org.hl7.fhir.DetectedIssueEvidence;
import org.hl7.fhir.DetectedIssueMitigation;
import org.hl7.fhir.DetectedIssueSeverity;
import org.hl7.fhir.DetectedIssueSeverityEnum;
import org.hl7.fhir.DetectedIssueStatus;
import org.hl7.fhir.DetectedIssueStatusEnum;
import org.hl7.fhir.Device;
import org.hl7.fhir.DeviceAssociation;
import org.hl7.fhir.DeviceAssociationOperation;
import org.hl7.fhir.DeviceConformsTo;
import org.hl7.fhir.DeviceCorrectiveActionScope;
import org.hl7.fhir.DeviceCorrectiveActionScopeEnum;
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
import org.hl7.fhir.DeviceDefinitionRegulatoryIdentifierTypeEnum;
import org.hl7.fhir.DeviceDefinitionUdiDeviceIdentifier;
import org.hl7.fhir.DeviceDefinitionVersion;
import org.hl7.fhir.DeviceDispense;
import org.hl7.fhir.DeviceDispensePerformer;
import org.hl7.fhir.DeviceDispenseStatusCodes;
import org.hl7.fhir.DeviceDispenseStatusCodesEnum;
import org.hl7.fhir.DeviceMetric;
import org.hl7.fhir.DeviceMetricCalibration;
import org.hl7.fhir.DeviceMetricCalibrationState;
import org.hl7.fhir.DeviceMetricCalibrationStateEnum;
import org.hl7.fhir.DeviceMetricCalibrationType;
import org.hl7.fhir.DeviceMetricCalibrationTypeEnum;
import org.hl7.fhir.DeviceMetricCategory;
import org.hl7.fhir.DeviceMetricCategoryEnum;
import org.hl7.fhir.DeviceMetricOperationalStatus;
import org.hl7.fhir.DeviceMetricOperationalStatusEnum;
import org.hl7.fhir.DeviceName;
import org.hl7.fhir.DeviceNameType;
import org.hl7.fhir.DeviceNameTypeEnum;
import org.hl7.fhir.DeviceProductionIdentifierInUDI;
import org.hl7.fhir.DeviceProductionIdentifierInUDIEnum;
import org.hl7.fhir.DeviceProperty;
import org.hl7.fhir.DeviceRequest;
import org.hl7.fhir.DeviceRequestParameter;
import org.hl7.fhir.DeviceUdiCarrier;
import org.hl7.fhir.DeviceUsage;
import org.hl7.fhir.DeviceUsageAdherence;
import org.hl7.fhir.DeviceUsageStatus;
import org.hl7.fhir.DeviceUsageStatusEnum;
import org.hl7.fhir.DeviceVersion;
import org.hl7.fhir.DiagnosticReport;
import org.hl7.fhir.DiagnosticReportMedia;
import org.hl7.fhir.DiagnosticReportStatus;
import org.hl7.fhir.DiagnosticReportStatusEnum;
import org.hl7.fhir.DiagnosticReportSupportingInfo;
import org.hl7.fhir.DiscriminatorType;
import org.hl7.fhir.DiscriminatorTypeEnum;
import org.hl7.fhir.Distance;
import org.hl7.fhir.DocumentMode;
import org.hl7.fhir.DocumentModeEnum;
import org.hl7.fhir.DocumentReference;
import org.hl7.fhir.DocumentReferenceAttester;
import org.hl7.fhir.DocumentReferenceContent;
import org.hl7.fhir.DocumentReferenceProfile;
import org.hl7.fhir.DocumentReferenceRelatesTo;
import org.hl7.fhir.DocumentReferenceStatus;
import org.hl7.fhir.DocumentReferenceStatusEnum;
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
import org.hl7.fhir.EligibilityOutcomeEnum;
import org.hl7.fhir.EligibilityRequestPurpose;
import org.hl7.fhir.EligibilityRequestPurposeEnum;
import org.hl7.fhir.EligibilityResponsePurpose;
import org.hl7.fhir.EligibilityResponsePurposeEnum;
import org.hl7.fhir.EnableWhenBehavior;
import org.hl7.fhir.EnableWhenBehaviorEnum;
import org.hl7.fhir.Encounter;
import org.hl7.fhir.EncounterAdmission;
import org.hl7.fhir.EncounterDiagnosis;
import org.hl7.fhir.EncounterHistory;
import org.hl7.fhir.EncounterHistoryLocation;
import org.hl7.fhir.EncounterLocation;
import org.hl7.fhir.EncounterLocationStatus;
import org.hl7.fhir.EncounterLocationStatusEnum;
import org.hl7.fhir.EncounterParticipant;
import org.hl7.fhir.EncounterReason;
import org.hl7.fhir.EncounterStatus;
import org.hl7.fhir.EncounterStatusEnum;
import org.hl7.fhir.Endpoint;
import org.hl7.fhir.EndpointPayload;
import org.hl7.fhir.EndpointStatus;
import org.hl7.fhir.EndpointStatusEnum;
import org.hl7.fhir.EnrollmentOutcome;
import org.hl7.fhir.EnrollmentOutcomeEnum;
import org.hl7.fhir.EnrollmentRequest;
import org.hl7.fhir.EnrollmentResponse;
import org.hl7.fhir.EpisodeOfCare;
import org.hl7.fhir.EpisodeOfCareDiagnosis;
import org.hl7.fhir.EpisodeOfCareReason;
import org.hl7.fhir.EpisodeOfCareStatus;
import org.hl7.fhir.EpisodeOfCareStatusEnum;
import org.hl7.fhir.EpisodeOfCareStatusHistory;
import org.hl7.fhir.EventCapabilityMode;
import org.hl7.fhir.EventCapabilityModeEnum;
import org.hl7.fhir.EventDefinition;
import org.hl7.fhir.EventResourceTypes;
import org.hl7.fhir.EventResourceTypesEnum;
import org.hl7.fhir.EventStatus;
import org.hl7.fhir.EventStatusEnum;
import org.hl7.fhir.EventTiming;
import org.hl7.fhir.EventTimingEnum;
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
import org.hl7.fhir.EvidenceVariableHandlingEnum;
import org.hl7.fhir.EvidenceVariableTimeFromEvent;
import org.hl7.fhir.ExampleScenario;
import org.hl7.fhir.ExampleScenarioActor;
import org.hl7.fhir.ExampleScenarioActorType;
import org.hl7.fhir.ExampleScenarioActorTypeEnum;
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
import org.hl7.fhir.ExplanationOfBenefitStatusEnum;
import org.hl7.fhir.ExplanationOfBenefitSubDetail;
import org.hl7.fhir.ExplanationOfBenefitSubDetail1;
import org.hl7.fhir.ExplanationOfBenefitSupportingInfo;
import org.hl7.fhir.ExplanationOfBenefitTotal;
import org.hl7.fhir.Expression;
import org.hl7.fhir.ExtendedContactDetail;
import org.hl7.fhir.Extension;
import org.hl7.fhir.ExtensionContextType;
import org.hl7.fhir.ExtensionContextTypeEnum;
import org.hl7.fhir.FHIRDeviceStatus;
import org.hl7.fhir.FHIRDeviceStatusEnum;
import org.hl7.fhir.FHIRPathTypes;
import org.hl7.fhir.FHIRPathTypesEnum;
import org.hl7.fhir.FHIRSubstanceStatus;
import org.hl7.fhir.FHIRSubstanceStatusEnum;
import org.hl7.fhir.FHIRTypes;
import org.hl7.fhir.FHIRTypesEnum;
import org.hl7.fhir.FHIRVersion;
import org.hl7.fhir.FHIRVersionEnum;
import org.hl7.fhir.FamilyHistoryStatus;
import org.hl7.fhir.FamilyHistoryStatusEnum;
import org.hl7.fhir.FamilyMemberHistory;
import org.hl7.fhir.FamilyMemberHistoryCondition;
import org.hl7.fhir.FamilyMemberHistoryParticipant;
import org.hl7.fhir.FamilyMemberHistoryProcedure;
import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.FilterOperator;
import org.hl7.fhir.FilterOperatorEnum;
import org.hl7.fhir.FinancialResourceStatusCodes;
import org.hl7.fhir.FinancialResourceStatusCodesEnum;
import org.hl7.fhir.Flag;
import org.hl7.fhir.FlagStatus;
import org.hl7.fhir.FlagStatusEnum;
import org.hl7.fhir.FormularyItem;
import org.hl7.fhir.FormularyItemStatusCodes;
import org.hl7.fhir.FormularyItemStatusCodesEnum;
import org.hl7.fhir.GenomicStudy;
import org.hl7.fhir.GenomicStudyAnalysis;
import org.hl7.fhir.GenomicStudyDevice;
import org.hl7.fhir.GenomicStudyInput;
import org.hl7.fhir.GenomicStudyOutput;
import org.hl7.fhir.GenomicStudyPerformer;
import org.hl7.fhir.GenomicStudyStatus;
import org.hl7.fhir.GenomicStudyStatusEnum;
import org.hl7.fhir.Goal;
import org.hl7.fhir.GoalLifecycleStatus;
import org.hl7.fhir.GoalLifecycleStatusEnum;
import org.hl7.fhir.GoalTarget;
import org.hl7.fhir.GraphCompartmentRule;
import org.hl7.fhir.GraphCompartmentRuleEnum;
import org.hl7.fhir.GraphCompartmentUse;
import org.hl7.fhir.GraphCompartmentUseEnum;
import org.hl7.fhir.GraphDefinition;
import org.hl7.fhir.GraphDefinitionCompartment;
import org.hl7.fhir.GraphDefinitionLink;
import org.hl7.fhir.GraphDefinitionNode;
import org.hl7.fhir.Group;
import org.hl7.fhir.GroupCharacteristic;
import org.hl7.fhir.GroupMember;
import org.hl7.fhir.GroupMembershipBasis;
import org.hl7.fhir.GroupMembershipBasisEnum;
import org.hl7.fhir.GroupType;
import org.hl7.fhir.GroupTypeEnum;
import org.hl7.fhir.GuidanceResponse;
import org.hl7.fhir.GuidanceResponseStatus;
import org.hl7.fhir.GuidanceResponseStatusEnum;
import org.hl7.fhir.GuidePageGeneration;
import org.hl7.fhir.GuidePageGenerationEnum;
import org.hl7.fhir.HTTPVerb;
import org.hl7.fhir.HTTPVerbEnum;
import org.hl7.fhir.HealthcareService;
import org.hl7.fhir.HealthcareServiceEligibility;
import org.hl7.fhir.HumanName;
import org.hl7.fhir.Id;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.IdentifierUse;
import org.hl7.fhir.IdentifierUseEnum;
import org.hl7.fhir.IdentityAssuranceLevel;
import org.hl7.fhir.IdentityAssuranceLevelEnum;
import org.hl7.fhir.ImagingSelection;
import org.hl7.fhir.ImagingSelectionDGraphicType;
import org.hl7.fhir.ImagingSelectionDGraphicTypeEnum;
import org.hl7.fhir.ImagingSelectionImageRegion2D;
import org.hl7.fhir.ImagingSelectionImageRegion3D;
import org.hl7.fhir.ImagingSelectionInstance;
import org.hl7.fhir.ImagingSelectionPerformer;
import org.hl7.fhir.ImagingSelectionStatus;
import org.hl7.fhir.ImagingSelectionStatusEnum;
import org.hl7.fhir.ImagingStudy;
import org.hl7.fhir.ImagingStudyInstance;
import org.hl7.fhir.ImagingStudyPerformer;
import org.hl7.fhir.ImagingStudySeries;
import org.hl7.fhir.ImagingStudyStatus;
import org.hl7.fhir.ImagingStudyStatusEnum;
import org.hl7.fhir.Immunization;
import org.hl7.fhir.ImmunizationEvaluation;
import org.hl7.fhir.ImmunizationEvaluationStatusCodes;
import org.hl7.fhir.ImmunizationEvaluationStatusCodesEnum;
import org.hl7.fhir.ImmunizationPerformer;
import org.hl7.fhir.ImmunizationProgramEligibility;
import org.hl7.fhir.ImmunizationProtocolApplied;
import org.hl7.fhir.ImmunizationReaction;
import org.hl7.fhir.ImmunizationRecommendation;
import org.hl7.fhir.ImmunizationRecommendationDateCriterion;
import org.hl7.fhir.ImmunizationRecommendationRecommendation;
import org.hl7.fhir.ImmunizationStatusCodes;
import org.hl7.fhir.ImmunizationStatusCodesEnum;
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
import org.hl7.fhir.IngredientManufacturerRoleEnum;
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
import org.hl7.fhir.InteractionTriggerEnum;
import org.hl7.fhir.InventoryCountType;
import org.hl7.fhir.InventoryCountTypeEnum;
import org.hl7.fhir.InventoryItem;
import org.hl7.fhir.InventoryItemAssociation;
import org.hl7.fhir.InventoryItemCharacteristic;
import org.hl7.fhir.InventoryItemDescription;
import org.hl7.fhir.InventoryItemInstance;
import org.hl7.fhir.InventoryItemName;
import org.hl7.fhir.InventoryItemResponsibleOrganization;
import org.hl7.fhir.InventoryItemStatusCodes;
import org.hl7.fhir.InventoryItemStatusCodesEnum;
import org.hl7.fhir.InventoryReport;
import org.hl7.fhir.InventoryReportInventoryListing;
import org.hl7.fhir.InventoryReportItem;
import org.hl7.fhir.InventoryReportStatus;
import org.hl7.fhir.InventoryReportStatusEnum;
import org.hl7.fhir.Invoice;
import org.hl7.fhir.InvoiceLineItem;
import org.hl7.fhir.InvoiceParticipant;
import org.hl7.fhir.InvoiceStatus;
import org.hl7.fhir.InvoiceStatusEnum;
import org.hl7.fhir.IssueSeverity;
import org.hl7.fhir.IssueSeverityEnum;
import org.hl7.fhir.IssueType;
import org.hl7.fhir.IssueTypeEnum;
import org.hl7.fhir.JurisdictionValueSet;
import org.hl7.fhir.JurisdictionValueSetEnum;
import org.hl7.fhir.Kind;
import org.hl7.fhir.KindEnum;
import org.hl7.fhir.Library;
import org.hl7.fhir.LinkRelationTypes;
import org.hl7.fhir.LinkRelationTypesEnum;
import org.hl7.fhir.LinkType;
import org.hl7.fhir.LinkTypeEnum;
import org.hl7.fhir.Linkage;
import org.hl7.fhir.LinkageItem;
import org.hl7.fhir.LinkageType;
import org.hl7.fhir.LinkageTypeEnum;
import org.hl7.fhir.List;
import org.hl7.fhir.ListEntry;
import org.hl7.fhir.ListMode;
import org.hl7.fhir.ListModeEnum;
import org.hl7.fhir.ListStatus;
import org.hl7.fhir.ListStatusEnum;
import org.hl7.fhir.Location;
import org.hl7.fhir.LocationMode;
import org.hl7.fhir.LocationModeEnum;
import org.hl7.fhir.LocationPosition;
import org.hl7.fhir.LocationStatus;
import org.hl7.fhir.LocationStatusEnum;
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
import org.hl7.fhir.MeasureReportStatusEnum;
import org.hl7.fhir.MeasureReportStratifier;
import org.hl7.fhir.MeasureReportStratum;
import org.hl7.fhir.MeasureReportType;
import org.hl7.fhir.MeasureReportTypeEnum;
import org.hl7.fhir.MeasureStratifier;
import org.hl7.fhir.MeasureSupplementalData;
import org.hl7.fhir.MeasureTerm;
import org.hl7.fhir.Medication;
import org.hl7.fhir.MedicationAdministration;
import org.hl7.fhir.MedicationAdministrationDosage;
import org.hl7.fhir.MedicationAdministrationPerformer;
import org.hl7.fhir.MedicationAdministrationStatusCodes;
import org.hl7.fhir.MedicationAdministrationStatusCodesEnum;
import org.hl7.fhir.MedicationBatch;
import org.hl7.fhir.MedicationDispense;
import org.hl7.fhir.MedicationDispensePerformer;
import org.hl7.fhir.MedicationDispenseStatusCodes;
import org.hl7.fhir.MedicationDispenseStatusCodesEnum;
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
import org.hl7.fhir.MedicationKnowledgeStatusCodesEnum;
import org.hl7.fhir.MedicationKnowledgeStorageGuideline;
import org.hl7.fhir.MedicationKnowledgeSubstitution;
import org.hl7.fhir.MedicationRequest;
import org.hl7.fhir.MedicationRequestDispenseRequest;
import org.hl7.fhir.MedicationRequestInitialFill;
import org.hl7.fhir.MedicationRequestIntent;
import org.hl7.fhir.MedicationRequestIntentEnum;
import org.hl7.fhir.MedicationRequestSubstitution;
import org.hl7.fhir.MedicationStatement;
import org.hl7.fhir.MedicationStatementAdherence;
import org.hl7.fhir.MedicationStatementStatusCodes;
import org.hl7.fhir.MedicationStatementStatusCodesEnum;
import org.hl7.fhir.MedicationStatusCodes;
import org.hl7.fhir.MedicationStatusCodesEnum;
import org.hl7.fhir.MedicationrequestStatus;
import org.hl7.fhir.MedicationrequestStatusEnum;
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
import org.hl7.fhir.MessageSignificanceCategoryEnum;
import org.hl7.fhir.MessageheaderResponseRequest;
import org.hl7.fhir.MessageheaderResponseRequestEnum;
import org.hl7.fhir.Meta;
import org.hl7.fhir.MetadataResource;
import org.hl7.fhir.MolecularSequence;
import org.hl7.fhir.MolecularSequenceEdit;
import org.hl7.fhir.MolecularSequenceRelative;
import org.hl7.fhir.MolecularSequenceStartingSequence;
import org.hl7.fhir.MonetaryComponent;
import org.hl7.fhir.Money;
import org.hl7.fhir.NameUse;
import org.hl7.fhir.NameUseEnum;
import org.hl7.fhir.NamingSystem;
import org.hl7.fhir.NamingSystemIdentifierType;
import org.hl7.fhir.NamingSystemIdentifierTypeEnum;
import org.hl7.fhir.NamingSystemType;
import org.hl7.fhir.NamingSystemTypeEnum;
import org.hl7.fhir.NamingSystemUniqueId;
import org.hl7.fhir.Narrative;
import org.hl7.fhir.NarrativeStatus;
import org.hl7.fhir.NarrativeStatusEnum;
import org.hl7.fhir.NoteType;
import org.hl7.fhir.NoteTypeEnum;
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
import org.hl7.fhir.NutritionProductStatusEnum;
import org.hl7.fhir.Observation;
import org.hl7.fhir.ObservationComponent;
import org.hl7.fhir.ObservationDataType;
import org.hl7.fhir.ObservationDataTypeEnum;
import org.hl7.fhir.ObservationDefinition;
import org.hl7.fhir.ObservationDefinitionComponent;
import org.hl7.fhir.ObservationDefinitionQualifiedValue;
import org.hl7.fhir.ObservationRangeCategory;
import org.hl7.fhir.ObservationRangeCategoryEnum;
import org.hl7.fhir.ObservationReferenceRange;
import org.hl7.fhir.ObservationStatus;
import org.hl7.fhir.ObservationStatusEnum;
import org.hl7.fhir.ObservationTriggeredBy;
import org.hl7.fhir.Oid;
import org.hl7.fhir.OperationDefinition;
import org.hl7.fhir.OperationDefinitionBinding;
import org.hl7.fhir.OperationDefinitionOverload;
import org.hl7.fhir.OperationDefinitionParameter;
import org.hl7.fhir.OperationDefinitionReferencedFrom;
import org.hl7.fhir.OperationKind;
import org.hl7.fhir.OperationKindEnum;
import org.hl7.fhir.OperationOutcome;
import org.hl7.fhir.OperationOutcomeCodes;
import org.hl7.fhir.OperationOutcomeCodesEnum;
import org.hl7.fhir.OperationOutcomeIssue;
import org.hl7.fhir.OperationParameterScope;
import org.hl7.fhir.OperationParameterScopeEnum;
import org.hl7.fhir.OperationParameterUse;
import org.hl7.fhir.OperationParameterUseEnum;
import org.hl7.fhir.Organization;
import org.hl7.fhir.OrganizationAffiliation;
import org.hl7.fhir.OrganizationQualification;
import org.hl7.fhir.OrientationType;
import org.hl7.fhir.OrientationTypeEnum;
import org.hl7.fhir.PackagedProductDefinition;
import org.hl7.fhir.PackagedProductDefinitionContainedItem;
import org.hl7.fhir.PackagedProductDefinitionLegalStatusOfSupply;
import org.hl7.fhir.PackagedProductDefinitionPackaging;
import org.hl7.fhir.PackagedProductDefinitionProperty;
import org.hl7.fhir.ParameterDefinition;
import org.hl7.fhir.Parameters;
import org.hl7.fhir.ParametersParameter;
import org.hl7.fhir.ParticipantResourceTypes;
import org.hl7.fhir.ParticipantResourceTypesEnum;
import org.hl7.fhir.ParticipationStatus;
import org.hl7.fhir.ParticipationStatusEnum;
import org.hl7.fhir.Patient;
import org.hl7.fhir.PatientCommunication;
import org.hl7.fhir.PatientContact;
import org.hl7.fhir.PatientLink;
import org.hl7.fhir.PaymentNotice;
import org.hl7.fhir.PaymentOutcome;
import org.hl7.fhir.PaymentOutcomeEnum;
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
import org.hl7.fhir.PermissionRuleCombiningEnum;
import org.hl7.fhir.PermissionStatus;
import org.hl7.fhir.PermissionStatusEnum;
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
import org.hl7.fhir.PropertyRepresentationEnum;
import org.hl7.fhir.PropertyType;
import org.hl7.fhir.PropertyTypeEnum;
import org.hl7.fhir.Provenance;
import org.hl7.fhir.ProvenanceAgent;
import org.hl7.fhir.ProvenanceEntity;
import org.hl7.fhir.ProvenanceEntityRole;
import org.hl7.fhir.ProvenanceEntityRoleEnum;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.PublicationStatusEnum;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.QuantityComparator;
import org.hl7.fhir.QuantityComparatorEnum;
import org.hl7.fhir.Questionnaire;
import org.hl7.fhir.QuestionnaireAnswerConstraint;
import org.hl7.fhir.QuestionnaireAnswerConstraintEnum;
import org.hl7.fhir.QuestionnaireAnswerOption;
import org.hl7.fhir.QuestionnaireEnableWhen;
import org.hl7.fhir.QuestionnaireInitial;
import org.hl7.fhir.QuestionnaireItem;
import org.hl7.fhir.QuestionnaireItemDisabledDisplay;
import org.hl7.fhir.QuestionnaireItemDisabledDisplayEnum;
import org.hl7.fhir.QuestionnaireItemOperator;
import org.hl7.fhir.QuestionnaireItemOperatorEnum;
import org.hl7.fhir.QuestionnaireItemType;
import org.hl7.fhir.QuestionnaireItemTypeEnum;
import org.hl7.fhir.QuestionnaireResponse;
import org.hl7.fhir.QuestionnaireResponseAnswer;
import org.hl7.fhir.QuestionnaireResponseItem;
import org.hl7.fhir.QuestionnaireResponseStatus;
import org.hl7.fhir.QuestionnaireResponseStatusEnum;
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.RatioRange;
import org.hl7.fhir.Reference;
import org.hl7.fhir.ReferenceHandlingPolicy;
import org.hl7.fhir.ReferenceHandlingPolicyEnum;
import org.hl7.fhir.ReferenceVersionRules;
import org.hl7.fhir.ReferenceVersionRulesEnum;
import org.hl7.fhir.RegulatedAuthorization;
import org.hl7.fhir.RegulatedAuthorizationCase;
import org.hl7.fhir.RelatedArtifact;
import org.hl7.fhir.RelatedArtifactType;
import org.hl7.fhir.RelatedArtifactTypeEnum;
import org.hl7.fhir.RelatedArtifactTypeExpanded;
import org.hl7.fhir.RelatedArtifactTypeExpandedEnum;
import org.hl7.fhir.RelatedPerson;
import org.hl7.fhir.RelatedPersonCommunication;
import org.hl7.fhir.RemittanceOutcome;
import org.hl7.fhir.RemittanceOutcomeEnum;
import org.hl7.fhir.ReportRelationshipType;
import org.hl7.fhir.ReportRelationshipTypeEnum;
import org.hl7.fhir.RequestIntent;
import org.hl7.fhir.RequestIntentEnum;
import org.hl7.fhir.RequestOrchestration;
import org.hl7.fhir.RequestOrchestrationAction;
import org.hl7.fhir.RequestOrchestrationCondition;
import org.hl7.fhir.RequestOrchestrationDynamicValue;
import org.hl7.fhir.RequestOrchestrationInput;
import org.hl7.fhir.RequestOrchestrationOutput;
import org.hl7.fhir.RequestOrchestrationParticipant;
import org.hl7.fhir.RequestOrchestrationRelatedAction;
import org.hl7.fhir.RequestPriority;
import org.hl7.fhir.RequestPriorityEnum;
import org.hl7.fhir.RequestResourceTypes;
import org.hl7.fhir.RequestResourceTypesEnum;
import org.hl7.fhir.RequestStatus;
import org.hl7.fhir.RequestStatusEnum;
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
import org.hl7.fhir.ResourceTypeEnum;
import org.hl7.fhir.ResourceVersionPolicy;
import org.hl7.fhir.ResourceVersionPolicyEnum;
import org.hl7.fhir.ResponseType;
import org.hl7.fhir.ResponseTypeEnum;
import org.hl7.fhir.RestfulCapabilityMode;
import org.hl7.fhir.RestfulCapabilityModeEnum;
import org.hl7.fhir.RiskAssessment;
import org.hl7.fhir.RiskAssessmentPrediction;
import org.hl7.fhir.SPDXLicense;
import org.hl7.fhir.SPDXLicenseEnum;
import org.hl7.fhir.SampledData;
import org.hl7.fhir.SampledDataDataType;
import org.hl7.fhir.Schedule;
import org.hl7.fhir.SearchComparator;
import org.hl7.fhir.SearchComparatorEnum;
import org.hl7.fhir.SearchEntryMode;
import org.hl7.fhir.SearchEntryModeEnum;
import org.hl7.fhir.SearchModifierCode;
import org.hl7.fhir.SearchModifierCodeEnum;
import org.hl7.fhir.SearchParamType;
import org.hl7.fhir.SearchParamTypeEnum;
import org.hl7.fhir.SearchParameter;
import org.hl7.fhir.SearchParameterComponent;
import org.hl7.fhir.SearchProcessingModeType;
import org.hl7.fhir.SearchProcessingModeTypeEnum;
import org.hl7.fhir.SequenceType;
import org.hl7.fhir.SequenceTypeEnum;
import org.hl7.fhir.ServiceRequest;
import org.hl7.fhir.ServiceRequestOrderDetail;
import org.hl7.fhir.ServiceRequestParameter;
import org.hl7.fhir.ServiceRequestPatientInstruction;
import org.hl7.fhir.Signature;
import org.hl7.fhir.SlicingRules;
import org.hl7.fhir.SlicingRulesEnum;
import org.hl7.fhir.Slot;
import org.hl7.fhir.SlotStatus;
import org.hl7.fhir.SlotStatusEnum;
import org.hl7.fhir.SortDirection;
import org.hl7.fhir.SortDirectionEnum;
import org.hl7.fhir.Specimen;
import org.hl7.fhir.SpecimenCollection;
import org.hl7.fhir.SpecimenCombined;
import org.hl7.fhir.SpecimenCombinedEnum;
import org.hl7.fhir.SpecimenContainedPreference;
import org.hl7.fhir.SpecimenContainedPreferenceEnum;
import org.hl7.fhir.SpecimenContainer;
import org.hl7.fhir.SpecimenDefinition;
import org.hl7.fhir.SpecimenDefinitionAdditive;
import org.hl7.fhir.SpecimenDefinitionContainer;
import org.hl7.fhir.SpecimenDefinitionHandling;
import org.hl7.fhir.SpecimenDefinitionTypeTested;
import org.hl7.fhir.SpecimenFeature;
import org.hl7.fhir.SpecimenProcessing;
import org.hl7.fhir.SpecimenStatus;
import org.hl7.fhir.SpecimenStatusEnum;
import org.hl7.fhir.StrandType;
import org.hl7.fhir.StrandTypeEnum;
import org.hl7.fhir.StructureDefinition;
import org.hl7.fhir.StructureDefinitionContext;
import org.hl7.fhir.StructureDefinitionDifferential;
import org.hl7.fhir.StructureDefinitionKind;
import org.hl7.fhir.StructureDefinitionKindEnum;
import org.hl7.fhir.StructureDefinitionMapping;
import org.hl7.fhir.StructureDefinitionSnapshot;
import org.hl7.fhir.StructureMap;
import org.hl7.fhir.StructureMapConst;
import org.hl7.fhir.StructureMapDependent;
import org.hl7.fhir.StructureMapGroup;
import org.hl7.fhir.StructureMapGroupTypeMode;
import org.hl7.fhir.StructureMapGroupTypeModeEnum;
import org.hl7.fhir.StructureMapInput;
import org.hl7.fhir.StructureMapInputMode;
import org.hl7.fhir.StructureMapInputModeEnum;
import org.hl7.fhir.StructureMapModelMode;
import org.hl7.fhir.StructureMapModelModeEnum;
import org.hl7.fhir.StructureMapParameter;
import org.hl7.fhir.StructureMapRule;
import org.hl7.fhir.StructureMapSource;
import org.hl7.fhir.StructureMapSourceListMode;
import org.hl7.fhir.StructureMapSourceListModeEnum;
import org.hl7.fhir.StructureMapStructure;
import org.hl7.fhir.StructureMapTarget;
import org.hl7.fhir.StructureMapTargetListMode;
import org.hl7.fhir.StructureMapTargetListModeEnum;
import org.hl7.fhir.StructureMapTransform;
import org.hl7.fhir.StructureMapTransformEnum;
import org.hl7.fhir.SubmitDataUpdateType;
import org.hl7.fhir.SubmitDataUpdateTypeEnum;
import org.hl7.fhir.Subscription;
import org.hl7.fhir.SubscriptionFilterBy;
import org.hl7.fhir.SubscriptionNotificationType;
import org.hl7.fhir.SubscriptionNotificationTypeEnum;
import org.hl7.fhir.SubscriptionParameter;
import org.hl7.fhir.SubscriptionPayloadContent;
import org.hl7.fhir.SubscriptionPayloadContentEnum;
import org.hl7.fhir.SubscriptionStatus;
import org.hl7.fhir.SubscriptionStatusCodes;
import org.hl7.fhir.SubscriptionStatusCodesEnum;
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
import org.hl7.fhir.SupplyDeliveryStatusEnum;
import org.hl7.fhir.SupplyDeliverySuppliedItem;
import org.hl7.fhir.SupplyRequest;
import org.hl7.fhir.SupplyRequestParameter;
import org.hl7.fhir.SupplyRequestStatus;
import org.hl7.fhir.SupplyRequestStatusEnum;
import org.hl7.fhir.SystemRestfulInteraction;
import org.hl7.fhir.SystemRestfulInteractionEnum;
import org.hl7.fhir.Task;
import org.hl7.fhir.TaskInput;
import org.hl7.fhir.TaskIntent;
import org.hl7.fhir.TaskIntentEnum;
import org.hl7.fhir.TaskOutput;
import org.hl7.fhir.TaskPerformer;
import org.hl7.fhir.TaskRestriction;
import org.hl7.fhir.TaskStatus;
import org.hl7.fhir.TaskStatusEnum;
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
import org.hl7.fhir.TestReportActionResultEnum;
import org.hl7.fhir.TestReportAssert;
import org.hl7.fhir.TestReportOperation;
import org.hl7.fhir.TestReportParticipant;
import org.hl7.fhir.TestReportParticipantType;
import org.hl7.fhir.TestReportParticipantTypeEnum;
import org.hl7.fhir.TestReportRequirement;
import org.hl7.fhir.TestReportResult;
import org.hl7.fhir.TestReportResultEnum;
import org.hl7.fhir.TestReportSetup;
import org.hl7.fhir.TestReportStatus;
import org.hl7.fhir.TestReportStatusEnum;
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
import org.hl7.fhir.TestScriptRequestMethodCodeEnum;
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
import org.hl7.fhir.TransportIntentEnum;
import org.hl7.fhir.TransportOutput;
import org.hl7.fhir.TransportRestriction;
import org.hl7.fhir.TransportStatus;
import org.hl7.fhir.TransportStatusEnum;
import org.hl7.fhir.TriggerDefinition;
import org.hl7.fhir.TriggerType;
import org.hl7.fhir.TriggerTypeEnum;
import org.hl7.fhir.TriggeredBytype;
import org.hl7.fhir.TriggeredBytypeEnum;
import org.hl7.fhir.TypeDerivationRule;
import org.hl7.fhir.TypeDerivationRuleEnum;
import org.hl7.fhir.TypeRestfulInteraction;
import org.hl7.fhir.TypeRestfulInteractionEnum;
import org.hl7.fhir.UDIEntryType;
import org.hl7.fhir.UDIEntryTypeEnum;
import org.hl7.fhir.UnitsOfTime;
import org.hl7.fhir.UnitsOfTimeEnum;
import org.hl7.fhir.UnsignedInt;
import org.hl7.fhir.Uri;
import org.hl7.fhir.Url;
import org.hl7.fhir.UsageContext;
import org.hl7.fhir.Use;
import org.hl7.fhir.UseEnum;
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
import org.hl7.fhir.VerificationResultStatusEnum;
import org.hl7.fhir.VerificationResultValidator;
import org.hl7.fhir.VersionIndependentResourceTypesAll;
import org.hl7.fhir.VersionIndependentResourceTypesAllEnum;
import org.hl7.fhir.VirtualServiceDetail;
import org.hl7.fhir.VisionBase;
import org.hl7.fhir.VisionBaseEnum;
import org.hl7.fhir.VisionEyes;
import org.hl7.fhir.VisionEyesEnum;
import org.hl7.fhir.VisionPrescription;
import org.hl7.fhir.VisionPrescriptionLensSpecification;
import org.hl7.fhir.VisionPrescriptionPrism;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FhirFactoryImpl extends EFactoryImpl implements FhirFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FhirFactory init() {
		try {
			FhirFactory theFhirFactory = (FhirFactory)EPackage.Registry.INSTANCE.getEFactory(FhirPackage.eNS_URI);
			if (theFhirFactory != null) {
				return theFhirFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FhirFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FhirPackage.ACCOUNT: return createAccount();
			case FhirPackage.ACCOUNT_BALANCE: return createAccountBalance();
			case FhirPackage.ACCOUNT_COVERAGE: return createAccountCoverage();
			case FhirPackage.ACCOUNT_DIAGNOSIS: return createAccountDiagnosis();
			case FhirPackage.ACCOUNT_GUARANTOR: return createAccountGuarantor();
			case FhirPackage.ACCOUNT_PROCEDURE: return createAccountProcedure();
			case FhirPackage.ACCOUNT_RELATED_ACCOUNT: return createAccountRelatedAccount();
			case FhirPackage.ACCOUNT_STATUS: return createAccountStatus();
			case FhirPackage.ACTION_CARDINALITY_BEHAVIOR: return createActionCardinalityBehavior();
			case FhirPackage.ACTION_CONDITION_KIND: return createActionConditionKind();
			case FhirPackage.ACTION_GROUPING_BEHAVIOR: return createActionGroupingBehavior();
			case FhirPackage.ACTION_PARTICIPANT_TYPE: return createActionParticipantType();
			case FhirPackage.ACTION_PRECHECK_BEHAVIOR: return createActionPrecheckBehavior();
			case FhirPackage.ACTION_RELATIONSHIP_TYPE: return createActionRelationshipType();
			case FhirPackage.ACTION_REQUIRED_BEHAVIOR: return createActionRequiredBehavior();
			case FhirPackage.ACTION_SELECTION_BEHAVIOR: return createActionSelectionBehavior();
			case FhirPackage.ACTIVITY_DEFINITION: return createActivityDefinition();
			case FhirPackage.ACTIVITY_DEFINITION_DYNAMIC_VALUE: return createActivityDefinitionDynamicValue();
			case FhirPackage.ACTIVITY_DEFINITION_PARTICIPANT: return createActivityDefinitionParticipant();
			case FhirPackage.ACTOR_DEFINITION: return createActorDefinition();
			case FhirPackage.ADDRESS: return createAddress();
			case FhirPackage.ADDRESS_TYPE: return createAddressType();
			case FhirPackage.ADDRESS_USE: return createAddressUse();
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION: return createAdministrableProductDefinition();
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION_PROPERTY: return createAdministrableProductDefinitionProperty();
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION_ROUTE_OF_ADMINISTRATION: return createAdministrableProductDefinitionRouteOfAdministration();
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION_TARGET_SPECIES: return createAdministrableProductDefinitionTargetSpecies();
			case FhirPackage.ADMINISTRABLE_PRODUCT_DEFINITION_WITHDRAWAL_PERIOD: return createAdministrableProductDefinitionWithdrawalPeriod();
			case FhirPackage.ADMINISTRATIVE_GENDER: return createAdministrativeGender();
			case FhirPackage.ADVERSE_EVENT: return createAdverseEvent();
			case FhirPackage.ADVERSE_EVENT_ACTUALITY: return createAdverseEventActuality();
			case FhirPackage.ADVERSE_EVENT_CAUSALITY: return createAdverseEventCausality();
			case FhirPackage.ADVERSE_EVENT_CONTRIBUTING_FACTOR: return createAdverseEventContributingFactor();
			case FhirPackage.ADVERSE_EVENT_MITIGATING_ACTION: return createAdverseEventMitigatingAction();
			case FhirPackage.ADVERSE_EVENT_PARTICIPANT: return createAdverseEventParticipant();
			case FhirPackage.ADVERSE_EVENT_PREVENTIVE_ACTION: return createAdverseEventPreventiveAction();
			case FhirPackage.ADVERSE_EVENT_STATUS: return createAdverseEventStatus();
			case FhirPackage.ADVERSE_EVENT_SUPPORTING_INFO: return createAdverseEventSupportingInfo();
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY: return createAdverseEventSuspectEntity();
			case FhirPackage.AGE: return createAge();
			case FhirPackage.AGE_UNITS: return createAgeUnits();
			case FhirPackage.AGGREGATION_MODE: return createAggregationMode();
			case FhirPackage.ALLERGY_INTOLERANCE: return createAllergyIntolerance();
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY: return createAllergyIntoleranceCategory();
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY: return createAllergyIntoleranceCriticality();
			case FhirPackage.ALLERGY_INTOLERANCE_PARTICIPANT: return createAllergyIntoleranceParticipant();
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION: return createAllergyIntoleranceReaction();
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY: return createAllergyIntoleranceSeverity();
			case FhirPackage.ALL_RESOURCE_TYPES: return createAllResourceTypes();
			case FhirPackage.ANNOTATION: return createAnnotation();
			case FhirPackage.APPOINTMENT: return createAppointment();
			case FhirPackage.APPOINTMENT_MONTHLY_TEMPLATE: return createAppointmentMonthlyTemplate();
			case FhirPackage.APPOINTMENT_PARTICIPANT: return createAppointmentParticipant();
			case FhirPackage.APPOINTMENT_RECURRENCE_TEMPLATE: return createAppointmentRecurrenceTemplate();
			case FhirPackage.APPOINTMENT_RESPONSE: return createAppointmentResponse();
			case FhirPackage.APPOINTMENT_RESPONSE_STATUS: return createAppointmentResponseStatus();
			case FhirPackage.APPOINTMENT_STATUS: return createAppointmentStatus();
			case FhirPackage.APPOINTMENT_WEEKLY_TEMPLATE: return createAppointmentWeeklyTemplate();
			case FhirPackage.APPOINTMENT_YEARLY_TEMPLATE: return createAppointmentYearlyTemplate();
			case FhirPackage.ARTIFACT_ASSESSMENT: return createArtifactAssessment();
			case FhirPackage.ARTIFACT_ASSESSMENT_CONTENT: return createArtifactAssessmentContent();
			case FhirPackage.ARTIFACT_ASSESSMENT_DISPOSITION: return createArtifactAssessmentDisposition();
			case FhirPackage.ARTIFACT_ASSESSMENT_INFORMATION_TYPE: return createArtifactAssessmentInformationType();
			case FhirPackage.ARTIFACT_ASSESSMENT_WORKFLOW_STATUS: return createArtifactAssessmentWorkflowStatus();
			case FhirPackage.ASSERTION_DIRECTION_TYPE: return createAssertionDirectionType();
			case FhirPackage.ASSERTION_MANUAL_COMPLETION_TYPE: return createAssertionManualCompletionType();
			case FhirPackage.ASSERTION_OPERATOR_TYPE: return createAssertionOperatorType();
			case FhirPackage.ASSERTION_RESPONSE_TYPES: return createAssertionResponseTypes();
			case FhirPackage.ATTACHMENT: return createAttachment();
			case FhirPackage.AUDIT_EVENT: return createAuditEvent();
			case FhirPackage.AUDIT_EVENT_ACTION: return createAuditEventAction();
			case FhirPackage.AUDIT_EVENT_AGENT: return createAuditEventAgent();
			case FhirPackage.AUDIT_EVENT_DETAIL: return createAuditEventDetail();
			case FhirPackage.AUDIT_EVENT_ENTITY: return createAuditEventEntity();
			case FhirPackage.AUDIT_EVENT_OUTCOME: return createAuditEventOutcome();
			case FhirPackage.AUDIT_EVENT_SEVERITY: return createAuditEventSeverity();
			case FhirPackage.AUDIT_EVENT_SOURCE: return createAuditEventSource();
			case FhirPackage.AVAILABILITY: return createAvailability();
			case FhirPackage.AVAILABILITY_AVAILABLE_TIME: return createAvailabilityAvailableTime();
			case FhirPackage.AVAILABILITY_NOT_AVAILABLE_TIME: return createAvailabilityNotAvailableTime();
			case FhirPackage.BACKBONE_ELEMENT: return createBackboneElement();
			case FhirPackage.BACKBONE_TYPE: return createBackboneType();
			case FhirPackage.BASE: return createBase();
			case FhirPackage.BASE64_BINARY: return createBase64Binary();
			case FhirPackage.BASIC: return createBasic();
			case FhirPackage.BINARY: return createBinary();
			case FhirPackage.BINDING_STRENGTH: return createBindingStrength();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT: return createBiologicallyDerivedProduct();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION: return createBiologicallyDerivedProductCollection();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE: return createBiologicallyDerivedProductDispense();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE_CODES: return createBiologicallyDerivedProductDispenseCodes();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE_PERFORMER: return createBiologicallyDerivedProductDispensePerformer();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROPERTY: return createBiologicallyDerivedProductProperty();
			case FhirPackage.BODY_STRUCTURE: return createBodyStructure();
			case FhirPackage.BODY_STRUCTURE_BODY_LANDMARK_ORIENTATION: return createBodyStructureBodyLandmarkOrientation();
			case FhirPackage.BODY_STRUCTURE_DISTANCE_FROM_LANDMARK: return createBodyStructureDistanceFromLandmark();
			case FhirPackage.BODY_STRUCTURE_INCLUDED_STRUCTURE: return createBodyStructureIncludedStructure();
			case FhirPackage.BOOLEAN: return createBoolean();
			case FhirPackage.BUNDLE: return createBundle();
			case FhirPackage.BUNDLE_ENTRY: return createBundleEntry();
			case FhirPackage.BUNDLE_LINK: return createBundleLink();
			case FhirPackage.BUNDLE_REQUEST: return createBundleRequest();
			case FhirPackage.BUNDLE_RESPONSE: return createBundleResponse();
			case FhirPackage.BUNDLE_SEARCH: return createBundleSearch();
			case FhirPackage.BUNDLE_TYPE: return createBundleType();
			case FhirPackage.CANONICAL: return createCanonical();
			case FhirPackage.CANONICAL_RESOURCE: return createCanonicalResource();
			case FhirPackage.CAPABILITY_STATEMENT: return createCapabilityStatement();
			case FhirPackage.CAPABILITY_STATEMENT_DOCUMENT: return createCapabilityStatementDocument();
			case FhirPackage.CAPABILITY_STATEMENT_ENDPOINT: return createCapabilityStatementEndpoint();
			case FhirPackage.CAPABILITY_STATEMENT_IMPLEMENTATION: return createCapabilityStatementImplementation();
			case FhirPackage.CAPABILITY_STATEMENT_INTERACTION: return createCapabilityStatementInteraction();
			case FhirPackage.CAPABILITY_STATEMENT_INTERACTION1: return createCapabilityStatementInteraction1();
			case FhirPackage.CAPABILITY_STATEMENT_KIND: return createCapabilityStatementKind();
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING: return createCapabilityStatementMessaging();
			case FhirPackage.CAPABILITY_STATEMENT_OPERATION: return createCapabilityStatementOperation();
			case FhirPackage.CAPABILITY_STATEMENT_RESOURCE: return createCapabilityStatementResource();
			case FhirPackage.CAPABILITY_STATEMENT_REST: return createCapabilityStatementRest();
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM: return createCapabilityStatementSearchParam();
			case FhirPackage.CAPABILITY_STATEMENT_SECURITY: return createCapabilityStatementSecurity();
			case FhirPackage.CAPABILITY_STATEMENT_SOFTWARE: return createCapabilityStatementSoftware();
			case FhirPackage.CAPABILITY_STATEMENT_SUPPORTED_MESSAGE: return createCapabilityStatementSupportedMessage();
			case FhirPackage.CARE_PLAN: return createCarePlan();
			case FhirPackage.CARE_PLAN_ACTIVITY: return createCarePlanActivity();
			case FhirPackage.CARE_PLAN_INTENT: return createCarePlanIntent();
			case FhirPackage.CARE_TEAM: return createCareTeam();
			case FhirPackage.CARE_TEAM_PARTICIPANT: return createCareTeamParticipant();
			case FhirPackage.CARE_TEAM_STATUS: return createCareTeamStatus();
			case FhirPackage.CHARACTERISTIC_COMBINATION: return createCharacteristicCombination();
			case FhirPackage.CHARGE_ITEM: return createChargeItem();
			case FhirPackage.CHARGE_ITEM_DEFINITION: return createChargeItemDefinition();
			case FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY: return createChargeItemDefinitionApplicability();
			case FhirPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP: return createChargeItemDefinitionPropertyGroup();
			case FhirPackage.CHARGE_ITEM_PERFORMER: return createChargeItemPerformer();
			case FhirPackage.CHARGE_ITEM_STATUS: return createChargeItemStatus();
			case FhirPackage.CITATION: return createCitation();
			case FhirPackage.CITATION_ABSTRACT: return createCitationAbstract();
			case FhirPackage.CITATION_CITED_ARTIFACT: return createCitationCitedArtifact();
			case FhirPackage.CITATION_CLASSIFICATION: return createCitationClassification();
			case FhirPackage.CITATION_CLASSIFICATION1: return createCitationClassification1();
			case FhirPackage.CITATION_CONTRIBUTION_INSTANCE: return createCitationContributionInstance();
			case FhirPackage.CITATION_CONTRIBUTORSHIP: return createCitationContributorship();
			case FhirPackage.CITATION_ENTRY: return createCitationEntry();
			case FhirPackage.CITATION_PART: return createCitationPart();
			case FhirPackage.CITATION_PUBLICATION_FORM: return createCitationPublicationForm();
			case FhirPackage.CITATION_PUBLISHED_IN: return createCitationPublishedIn();
			case FhirPackage.CITATION_RELATES_TO: return createCitationRelatesTo();
			case FhirPackage.CITATION_STATUS_DATE: return createCitationStatusDate();
			case FhirPackage.CITATION_STATUS_DATE1: return createCitationStatusDate1();
			case FhirPackage.CITATION_SUMMARY: return createCitationSummary();
			case FhirPackage.CITATION_SUMMARY1: return createCitationSummary1();
			case FhirPackage.CITATION_TITLE: return createCitationTitle();
			case FhirPackage.CITATION_VERSION: return createCitationVersion();
			case FhirPackage.CITATION_WEB_LOCATION: return createCitationWebLocation();
			case FhirPackage.CLAIM: return createClaim();
			case FhirPackage.CLAIM_ACCIDENT: return createClaimAccident();
			case FhirPackage.CLAIM_BODY_SITE: return createClaimBodySite();
			case FhirPackage.CLAIM_CARE_TEAM: return createClaimCareTeam();
			case FhirPackage.CLAIM_DETAIL: return createClaimDetail();
			case FhirPackage.CLAIM_DIAGNOSIS: return createClaimDiagnosis();
			case FhirPackage.CLAIM_EVENT: return createClaimEvent();
			case FhirPackage.CLAIM_INSURANCE: return createClaimInsurance();
			case FhirPackage.CLAIM_ITEM: return createClaimItem();
			case FhirPackage.CLAIM_PAYEE: return createClaimPayee();
			case FhirPackage.CLAIM_PROCEDURE: return createClaimProcedure();
			case FhirPackage.CLAIM_PROCESSING_CODES: return createClaimProcessingCodes();
			case FhirPackage.CLAIM_RELATED: return createClaimRelated();
			case FhirPackage.CLAIM_RESPONSE: return createClaimResponse();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM: return createClaimResponseAddItem();
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION: return createClaimResponseAdjudication();
			case FhirPackage.CLAIM_RESPONSE_BODY_SITE: return createClaimResponseBodySite();
			case FhirPackage.CLAIM_RESPONSE_DETAIL: return createClaimResponseDetail();
			case FhirPackage.CLAIM_RESPONSE_DETAIL1: return createClaimResponseDetail1();
			case FhirPackage.CLAIM_RESPONSE_ERROR: return createClaimResponseError();
			case FhirPackage.CLAIM_RESPONSE_EVENT: return createClaimResponseEvent();
			case FhirPackage.CLAIM_RESPONSE_INSURANCE: return createClaimResponseInsurance();
			case FhirPackage.CLAIM_RESPONSE_ITEM: return createClaimResponseItem();
			case FhirPackage.CLAIM_RESPONSE_PAYMENT: return createClaimResponsePayment();
			case FhirPackage.CLAIM_RESPONSE_PROCESS_NOTE: return createClaimResponseProcessNote();
			case FhirPackage.CLAIM_RESPONSE_REVIEW_OUTCOME: return createClaimResponseReviewOutcome();
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL: return createClaimResponseSubDetail();
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL1: return createClaimResponseSubDetail1();
			case FhirPackage.CLAIM_RESPONSE_TOTAL: return createClaimResponseTotal();
			case FhirPackage.CLAIM_SUB_DETAIL: return createClaimSubDetail();
			case FhirPackage.CLAIM_SUPPORTING_INFO: return createClaimSupportingInfo();
			case FhirPackage.CLINICAL_IMPRESSION: return createClinicalImpression();
			case FhirPackage.CLINICAL_IMPRESSION_FINDING: return createClinicalImpressionFinding();
			case FhirPackage.CLINICAL_USE_DEFINITION: return createClinicalUseDefinition();
			case FhirPackage.CLINICAL_USE_DEFINITION_CONTRAINDICATION: return createClinicalUseDefinitionContraindication();
			case FhirPackage.CLINICAL_USE_DEFINITION_INDICATION: return createClinicalUseDefinitionIndication();
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTANT: return createClinicalUseDefinitionInteractant();
			case FhirPackage.CLINICAL_USE_DEFINITION_INTERACTION: return createClinicalUseDefinitionInteraction();
			case FhirPackage.CLINICAL_USE_DEFINITION_OTHER_THERAPY: return createClinicalUseDefinitionOtherTherapy();
			case FhirPackage.CLINICAL_USE_DEFINITION_TYPE: return createClinicalUseDefinitionType();
			case FhirPackage.CLINICAL_USE_DEFINITION_UNDESIRABLE_EFFECT: return createClinicalUseDefinitionUndesirableEffect();
			case FhirPackage.CLINICAL_USE_DEFINITION_WARNING: return createClinicalUseDefinitionWarning();
			case FhirPackage.CODE: return createCode();
			case FhirPackage.CODEABLE_CONCEPT: return createCodeableConcept();
			case FhirPackage.CODEABLE_REFERENCE: return createCodeableReference();
			case FhirPackage.CODE_SEARCH_SUPPORT: return createCodeSearchSupport();
			case FhirPackage.CODE_SYSTEM: return createCodeSystem();
			case FhirPackage.CODE_SYSTEM_CONCEPT: return createCodeSystemConcept();
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE: return createCodeSystemContentMode();
			case FhirPackage.CODE_SYSTEM_DESIGNATION: return createCodeSystemDesignation();
			case FhirPackage.CODE_SYSTEM_FILTER: return createCodeSystemFilter();
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING: return createCodeSystemHierarchyMeaning();
			case FhirPackage.CODE_SYSTEM_PROPERTY: return createCodeSystemProperty();
			case FhirPackage.CODE_SYSTEM_PROPERTY1: return createCodeSystemProperty1();
			case FhirPackage.CODING: return createCoding();
			case FhirPackage.COLOR_CODES_OR_RGB: return createColorCodesOrRGB();
			case FhirPackage.COMMON_LANGUAGES: return createCommonLanguages();
			case FhirPackage.COMMUNICATION: return createCommunication();
			case FhirPackage.COMMUNICATION_PAYLOAD: return createCommunicationPayload();
			case FhirPackage.COMMUNICATION_REQUEST: return createCommunicationRequest();
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD: return createCommunicationRequestPayload();
			case FhirPackage.COMPARTMENT_DEFINITION: return createCompartmentDefinition();
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE: return createCompartmentDefinitionResource();
			case FhirPackage.COMPARTMENT_TYPE: return createCompartmentType();
			case FhirPackage.COMPOSITION: return createComposition();
			case FhirPackage.COMPOSITION_ATTESTER: return createCompositionAttester();
			case FhirPackage.COMPOSITION_EVENT: return createCompositionEvent();
			case FhirPackage.COMPOSITION_SECTION: return createCompositionSection();
			case FhirPackage.COMPOSITION_STATUS: return createCompositionStatus();
			case FhirPackage.CONCEPT_MAP: return createConceptMap();
			case FhirPackage.CONCEPT_MAP_ADDITIONAL_ATTRIBUTE: return createConceptMapAdditionalAttribute();
			case FhirPackage.CONCEPT_MAP_ATTRIBUTE_TYPE: return createConceptMapAttributeType();
			case FhirPackage.CONCEPT_MAP_DEPENDS_ON: return createConceptMapDependsOn();
			case FhirPackage.CONCEPT_MAP_ELEMENT: return createConceptMapElement();
			case FhirPackage.CONCEPT_MAP_GROUP: return createConceptMapGroup();
			case FhirPackage.CONCEPT_MAP_GROUP_UNMAPPED_MODE: return createConceptMapGroupUnmappedMode();
			case FhirPackage.CONCEPT_MAP_PROPERTY: return createConceptMapProperty();
			case FhirPackage.CONCEPT_MAP_PROPERTY1: return createConceptMapProperty1();
			case FhirPackage.CONCEPT_MAP_PROPERTY_TYPE: return createConceptMapPropertyType();
			case FhirPackage.CONCEPT_MAP_RELATIONSHIP: return createConceptMapRelationship();
			case FhirPackage.CONCEPT_MAP_TARGET: return createConceptMapTarget();
			case FhirPackage.CONCEPT_MAP_UNMAPPED: return createConceptMapUnmapped();
			case FhirPackage.CONCRETE_FHIR_TYPES: return createConcreteFHIRTypes();
			case FhirPackage.CONDITION: return createCondition();
			case FhirPackage.CONDITIONAL_DELETE_STATUS: return createConditionalDeleteStatus();
			case FhirPackage.CONDITIONAL_READ_STATUS: return createConditionalReadStatus();
			case FhirPackage.CONDITION_DEFINITION: return createConditionDefinition();
			case FhirPackage.CONDITION_DEFINITION_MEDICATION: return createConditionDefinitionMedication();
			case FhirPackage.CONDITION_DEFINITION_OBSERVATION: return createConditionDefinitionObservation();
			case FhirPackage.CONDITION_DEFINITION_PLAN: return createConditionDefinitionPlan();
			case FhirPackage.CONDITION_DEFINITION_PRECONDITION: return createConditionDefinitionPrecondition();
			case FhirPackage.CONDITION_DEFINITION_QUESTIONNAIRE: return createConditionDefinitionQuestionnaire();
			case FhirPackage.CONDITION_PARTICIPANT: return createConditionParticipant();
			case FhirPackage.CONDITION_PRECONDITION_TYPE: return createConditionPreconditionType();
			case FhirPackage.CONDITION_QUESTIONNAIRE_PURPOSE: return createConditionQuestionnairePurpose();
			case FhirPackage.CONDITION_STAGE: return createConditionStage();
			case FhirPackage.CONFORMANCE_EXPECTATION: return createConformanceExpectation();
			case FhirPackage.CONSENT: return createConsent();
			case FhirPackage.CONSENT_ACTOR: return createConsentActor();
			case FhirPackage.CONSENT_DATA: return createConsentData();
			case FhirPackage.CONSENT_DATA_MEANING: return createConsentDataMeaning();
			case FhirPackage.CONSENT_POLICY_BASIS: return createConsentPolicyBasis();
			case FhirPackage.CONSENT_PROVISION: return createConsentProvision();
			case FhirPackage.CONSENT_PROVISION_TYPE: return createConsentProvisionType();
			case FhirPackage.CONSENT_STATE: return createConsentState();
			case FhirPackage.CONSENT_VERIFICATION: return createConsentVerification();
			case FhirPackage.CONSTRAINT_SEVERITY: return createConstraintSeverity();
			case FhirPackage.CONTACT_DETAIL: return createContactDetail();
			case FhirPackage.CONTACT_POINT: return createContactPoint();
			case FhirPackage.CONTACT_POINT_SYSTEM: return createContactPointSystem();
			case FhirPackage.CONTACT_POINT_USE: return createContactPointUse();
			case FhirPackage.CONTRACT: return createContract();
			case FhirPackage.CONTRACT_ACTION: return createContractAction();
			case FhirPackage.CONTRACT_ANSWER: return createContractAnswer();
			case FhirPackage.CONTRACT_ASSET: return createContractAsset();
			case FhirPackage.CONTRACT_CONTENT_DEFINITION: return createContractContentDefinition();
			case FhirPackage.CONTRACT_CONTEXT: return createContractContext();
			case FhirPackage.CONTRACT_FRIENDLY: return createContractFriendly();
			case FhirPackage.CONTRACT_LEGAL: return createContractLegal();
			case FhirPackage.CONTRACT_OFFER: return createContractOffer();
			case FhirPackage.CONTRACT_PARTY: return createContractParty();
			case FhirPackage.CONTRACT_RESOURCE_PUBLICATION_STATUS_CODES: return createContractResourcePublicationStatusCodes();
			case FhirPackage.CONTRACT_RESOURCE_STATUS_CODES: return createContractResourceStatusCodes();
			case FhirPackage.CONTRACT_RULE: return createContractRule();
			case FhirPackage.CONTRACT_SECURITY_LABEL: return createContractSecurityLabel();
			case FhirPackage.CONTRACT_SIGNER: return createContractSigner();
			case FhirPackage.CONTRACT_SUBJECT: return createContractSubject();
			case FhirPackage.CONTRACT_TERM: return createContractTerm();
			case FhirPackage.CONTRACT_VALUED_ITEM: return createContractValuedItem();
			case FhirPackage.CONTRIBUTOR: return createContributor();
			case FhirPackage.CONTRIBUTOR_TYPE: return createContributorType();
			case FhirPackage.COUNT: return createCount();
			case FhirPackage.COVERAGE: return createCoverage();
			case FhirPackage.COVERAGE_CLASS: return createCoverageClass();
			case FhirPackage.COVERAGE_COST_TO_BENEFICIARY: return createCoverageCostToBeneficiary();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST: return createCoverageEligibilityRequest();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_DIAGNOSIS: return createCoverageEligibilityRequestDiagnosis();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_EVENT: return createCoverageEligibilityRequestEvent();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_INSURANCE: return createCoverageEligibilityRequestInsurance();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM: return createCoverageEligibilityRequestItem();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO: return createCoverageEligibilityRequestSupportingInfo();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE: return createCoverageEligibilityResponse();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT: return createCoverageEligibilityResponseBenefit();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ERROR: return createCoverageEligibilityResponseError();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_EVENT: return createCoverageEligibilityResponseEvent();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE: return createCoverageEligibilityResponseInsurance();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM: return createCoverageEligibilityResponseItem();
			case FhirPackage.COVERAGE_EXCEPTION: return createCoverageException();
			case FhirPackage.COVERAGE_PAYMENT_BY: return createCoveragePaymentBy();
			case FhirPackage.CRITERIA_NOT_EXISTS_BEHAVIOR: return createCriteriaNotExistsBehavior();
			case FhirPackage.DATA_REQUIREMENT: return createDataRequirement();
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER: return createDataRequirementCodeFilter();
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER: return createDataRequirementDateFilter();
			case FhirPackage.DATA_REQUIREMENT_SORT: return createDataRequirementSort();
			case FhirPackage.DATA_REQUIREMENT_VALUE_FILTER: return createDataRequirementValueFilter();
			case FhirPackage.DATA_TYPE: return createDataType();
			case FhirPackage.DATE: return createDate();
			case FhirPackage.DATE_TIME: return createDateTime();
			case FhirPackage.DECIMAL: return createDecimal();
			case FhirPackage.DEFINITION_RESOURCE_TYPES: return createDefinitionResourceTypes();
			case FhirPackage.DETECTED_ISSUE: return createDetectedIssue();
			case FhirPackage.DETECTED_ISSUE_EVIDENCE: return createDetectedIssueEvidence();
			case FhirPackage.DETECTED_ISSUE_MITIGATION: return createDetectedIssueMitigation();
			case FhirPackage.DETECTED_ISSUE_SEVERITY: return createDetectedIssueSeverity();
			case FhirPackage.DETECTED_ISSUE_STATUS: return createDetectedIssueStatus();
			case FhirPackage.DEVICE: return createDevice();
			case FhirPackage.DEVICE_ASSOCIATION: return createDeviceAssociation();
			case FhirPackage.DEVICE_ASSOCIATION_OPERATION: return createDeviceAssociationOperation();
			case FhirPackage.DEVICE_CONFORMS_TO: return createDeviceConformsTo();
			case FhirPackage.DEVICE_CORRECTIVE_ACTION_SCOPE: return createDeviceCorrectiveActionScope();
			case FhirPackage.DEVICE_DEFINITION: return createDeviceDefinition();
			case FhirPackage.DEVICE_DEFINITION_CHARGE_ITEM: return createDeviceDefinitionChargeItem();
			case FhirPackage.DEVICE_DEFINITION_CLASSIFICATION: return createDeviceDefinitionClassification();
			case FhirPackage.DEVICE_DEFINITION_CONFORMS_TO: return createDeviceDefinitionConformsTo();
			case FhirPackage.DEVICE_DEFINITION_CORRECTIVE_ACTION: return createDeviceDefinitionCorrectiveAction();
			case FhirPackage.DEVICE_DEFINITION_DEVICE_NAME: return createDeviceDefinitionDeviceName();
			case FhirPackage.DEVICE_DEFINITION_DISTRIBUTOR: return createDeviceDefinitionDistributor();
			case FhirPackage.DEVICE_DEFINITION_GUIDELINE: return createDeviceDefinitionGuideline();
			case FhirPackage.DEVICE_DEFINITION_HAS_PART: return createDeviceDefinitionHasPart();
			case FhirPackage.DEVICE_DEFINITION_LINK: return createDeviceDefinitionLink();
			case FhirPackage.DEVICE_DEFINITION_MARKET_DISTRIBUTION: return createDeviceDefinitionMarketDistribution();
			case FhirPackage.DEVICE_DEFINITION_MATERIAL: return createDeviceDefinitionMaterial();
			case FhirPackage.DEVICE_DEFINITION_PACKAGING: return createDeviceDefinitionPackaging();
			case FhirPackage.DEVICE_DEFINITION_PROPERTY: return createDeviceDefinitionProperty();
			case FhirPackage.DEVICE_DEFINITION_REGULATORY_IDENTIFIER: return createDeviceDefinitionRegulatoryIdentifier();
			case FhirPackage.DEVICE_DEFINITION_REGULATORY_IDENTIFIER_TYPE: return createDeviceDefinitionRegulatoryIdentifierType();
			case FhirPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER: return createDeviceDefinitionUdiDeviceIdentifier();
			case FhirPackage.DEVICE_DEFINITION_VERSION: return createDeviceDefinitionVersion();
			case FhirPackage.DEVICE_DISPENSE: return createDeviceDispense();
			case FhirPackage.DEVICE_DISPENSE_PERFORMER: return createDeviceDispensePerformer();
			case FhirPackage.DEVICE_DISPENSE_STATUS_CODES: return createDeviceDispenseStatusCodes();
			case FhirPackage.DEVICE_METRIC: return createDeviceMetric();
			case FhirPackage.DEVICE_METRIC_CALIBRATION: return createDeviceMetricCalibration();
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE: return createDeviceMetricCalibrationState();
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE: return createDeviceMetricCalibrationType();
			case FhirPackage.DEVICE_METRIC_CATEGORY: return createDeviceMetricCategory();
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS: return createDeviceMetricOperationalStatus();
			case FhirPackage.DEVICE_NAME: return createDeviceName();
			case FhirPackage.DEVICE_NAME_TYPE: return createDeviceNameType();
			case FhirPackage.DEVICE_PRODUCTION_IDENTIFIER_IN_UDI: return createDeviceProductionIdentifierInUDI();
			case FhirPackage.DEVICE_PROPERTY: return createDeviceProperty();
			case FhirPackage.DEVICE_REQUEST: return createDeviceRequest();
			case FhirPackage.DEVICE_REQUEST_PARAMETER: return createDeviceRequestParameter();
			case FhirPackage.DEVICE_UDI_CARRIER: return createDeviceUdiCarrier();
			case FhirPackage.DEVICE_USAGE: return createDeviceUsage();
			case FhirPackage.DEVICE_USAGE_ADHERENCE: return createDeviceUsageAdherence();
			case FhirPackage.DEVICE_USAGE_STATUS: return createDeviceUsageStatus();
			case FhirPackage.DEVICE_VERSION: return createDeviceVersion();
			case FhirPackage.DIAGNOSTIC_REPORT: return createDiagnosticReport();
			case FhirPackage.DIAGNOSTIC_REPORT_MEDIA: return createDiagnosticReportMedia();
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS: return createDiagnosticReportStatus();
			case FhirPackage.DIAGNOSTIC_REPORT_SUPPORTING_INFO: return createDiagnosticReportSupportingInfo();
			case FhirPackage.DISCRIMINATOR_TYPE: return createDiscriminatorType();
			case FhirPackage.DISTANCE: return createDistance();
			case FhirPackage.DOCUMENT_MODE: return createDocumentMode();
			case FhirPackage.DOCUMENT_REFERENCE: return createDocumentReference();
			case FhirPackage.DOCUMENT_REFERENCE_ATTESTER: return createDocumentReferenceAttester();
			case FhirPackage.DOCUMENT_REFERENCE_CONTENT: return createDocumentReferenceContent();
			case FhirPackage.DOCUMENT_REFERENCE_PROFILE: return createDocumentReferenceProfile();
			case FhirPackage.DOCUMENT_REFERENCE_RELATES_TO: return createDocumentReferenceRelatesTo();
			case FhirPackage.DOCUMENT_REFERENCE_STATUS: return createDocumentReferenceStatus();
			case FhirPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case FhirPackage.DOMAIN_RESOURCE: return createDomainResource();
			case FhirPackage.DOSAGE: return createDosage();
			case FhirPackage.DOSAGE_DOSE_AND_RATE: return createDosageDoseAndRate();
			case FhirPackage.DURATION: return createDuration();
			case FhirPackage.ELEMENT: return createElement();
			case FhirPackage.ELEMENT_DEFINITION: return createElementDefinition();
			case FhirPackage.ELEMENT_DEFINITION_ADDITIONAL: return createElementDefinitionAdditional();
			case FhirPackage.ELEMENT_DEFINITION_BASE: return createElementDefinitionBase();
			case FhirPackage.ELEMENT_DEFINITION_BINDING: return createElementDefinitionBinding();
			case FhirPackage.ELEMENT_DEFINITION_CONSTRAINT: return createElementDefinitionConstraint();
			case FhirPackage.ELEMENT_DEFINITION_DISCRIMINATOR: return createElementDefinitionDiscriminator();
			case FhirPackage.ELEMENT_DEFINITION_EXAMPLE: return createElementDefinitionExample();
			case FhirPackage.ELEMENT_DEFINITION_MAPPING: return createElementDefinitionMapping();
			case FhirPackage.ELEMENT_DEFINITION_SLICING: return createElementDefinitionSlicing();
			case FhirPackage.ELEMENT_DEFINITION_TYPE: return createElementDefinitionType();
			case FhirPackage.ELIGIBILITY_OUTCOME: return createEligibilityOutcome();
			case FhirPackage.ELIGIBILITY_REQUEST_PURPOSE: return createEligibilityRequestPurpose();
			case FhirPackage.ELIGIBILITY_RESPONSE_PURPOSE: return createEligibilityResponsePurpose();
			case FhirPackage.ENABLE_WHEN_BEHAVIOR: return createEnableWhenBehavior();
			case FhirPackage.ENCOUNTER: return createEncounter();
			case FhirPackage.ENCOUNTER_ADMISSION: return createEncounterAdmission();
			case FhirPackage.ENCOUNTER_DIAGNOSIS: return createEncounterDiagnosis();
			case FhirPackage.ENCOUNTER_HISTORY: return createEncounterHistory();
			case FhirPackage.ENCOUNTER_HISTORY_LOCATION: return createEncounterHistoryLocation();
			case FhirPackage.ENCOUNTER_LOCATION: return createEncounterLocation();
			case FhirPackage.ENCOUNTER_LOCATION_STATUS: return createEncounterLocationStatus();
			case FhirPackage.ENCOUNTER_PARTICIPANT: return createEncounterParticipant();
			case FhirPackage.ENCOUNTER_REASON: return createEncounterReason();
			case FhirPackage.ENCOUNTER_STATUS: return createEncounterStatus();
			case FhirPackage.ENDPOINT: return createEndpoint();
			case FhirPackage.ENDPOINT_PAYLOAD: return createEndpointPayload();
			case FhirPackage.ENDPOINT_STATUS: return createEndpointStatus();
			case FhirPackage.ENROLLMENT_OUTCOME: return createEnrollmentOutcome();
			case FhirPackage.ENROLLMENT_REQUEST: return createEnrollmentRequest();
			case FhirPackage.ENROLLMENT_RESPONSE: return createEnrollmentResponse();
			case FhirPackage.EPISODE_OF_CARE: return createEpisodeOfCare();
			case FhirPackage.EPISODE_OF_CARE_DIAGNOSIS: return createEpisodeOfCareDiagnosis();
			case FhirPackage.EPISODE_OF_CARE_REASON: return createEpisodeOfCareReason();
			case FhirPackage.EPISODE_OF_CARE_STATUS: return createEpisodeOfCareStatus();
			case FhirPackage.EPISODE_OF_CARE_STATUS_HISTORY: return createEpisodeOfCareStatusHistory();
			case FhirPackage.EVENT_CAPABILITY_MODE: return createEventCapabilityMode();
			case FhirPackage.EVENT_DEFINITION: return createEventDefinition();
			case FhirPackage.EVENT_RESOURCE_TYPES: return createEventResourceTypes();
			case FhirPackage.EVENT_STATUS: return createEventStatus();
			case FhirPackage.EVENT_TIMING: return createEventTiming();
			case FhirPackage.EVIDENCE: return createEvidence();
			case FhirPackage.EVIDENCE_ATTRIBUTE_ESTIMATE: return createEvidenceAttributeEstimate();
			case FhirPackage.EVIDENCE_CERTAINTY: return createEvidenceCertainty();
			case FhirPackage.EVIDENCE_MODEL_CHARACTERISTIC: return createEvidenceModelCharacteristic();
			case FhirPackage.EVIDENCE_REPORT: return createEvidenceReport();
			case FhirPackage.EVIDENCE_REPORT_CHARACTERISTIC: return createEvidenceReportCharacteristic();
			case FhirPackage.EVIDENCE_REPORT_RELATES_TO: return createEvidenceReportRelatesTo();
			case FhirPackage.EVIDENCE_REPORT_SECTION: return createEvidenceReportSection();
			case FhirPackage.EVIDENCE_REPORT_SUBJECT: return createEvidenceReportSubject();
			case FhirPackage.EVIDENCE_REPORT_TARGET: return createEvidenceReportTarget();
			case FhirPackage.EVIDENCE_SAMPLE_SIZE: return createEvidenceSampleSize();
			case FhirPackage.EVIDENCE_STATISTIC: return createEvidenceStatistic();
			case FhirPackage.EVIDENCE_VARIABLE: return createEvidenceVariable();
			case FhirPackage.EVIDENCE_VARIABLE1: return createEvidenceVariable1();
			case FhirPackage.EVIDENCE_VARIABLE_CATEGORY: return createEvidenceVariableCategory();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC: return createEvidenceVariableCharacteristic();
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION: return createEvidenceVariableDefinition();
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_COMBINATION: return createEvidenceVariableDefinitionByCombination();
			case FhirPackage.EVIDENCE_VARIABLE_DEFINITION_BY_TYPE_AND_VALUE: return createEvidenceVariableDefinitionByTypeAndValue();
			case FhirPackage.EVIDENCE_VARIABLE_HANDLING: return createEvidenceVariableHandling();
			case FhirPackage.EVIDENCE_VARIABLE_TIME_FROM_EVENT: return createEvidenceVariableTimeFromEvent();
			case FhirPackage.EXAMPLE_SCENARIO: return createExampleScenario();
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR: return createExampleScenarioActor();
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR_TYPE: return createExampleScenarioActorType();
			case FhirPackage.EXAMPLE_SCENARIO_ALTERNATIVE: return createExampleScenarioAlternative();
			case FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE: return createExampleScenarioContainedInstance();
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE: return createExampleScenarioInstance();
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION: return createExampleScenarioOperation();
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS: return createExampleScenarioProcess();
			case FhirPackage.EXAMPLE_SCENARIO_STEP: return createExampleScenarioStep();
			case FhirPackage.EXAMPLE_SCENARIO_VERSION: return createExampleScenarioVersion();
			case FhirPackage.EXPLANATION_OF_BENEFIT: return createExplanationOfBenefit();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT: return createExplanationOfBenefitAccident();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADD_ITEM: return createExplanationOfBenefitAddItem();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADJUDICATION: return createExplanationOfBenefitAdjudication();
			case FhirPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE: return createExplanationOfBenefitBenefitBalance();
			case FhirPackage.EXPLANATION_OF_BENEFIT_BODY_SITE: return createExplanationOfBenefitBodySite();
			case FhirPackage.EXPLANATION_OF_BENEFIT_BODY_SITE1: return createExplanationOfBenefitBodySite1();
			case FhirPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM: return createExplanationOfBenefitCareTeam();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL: return createExplanationOfBenefitDetail();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL1: return createExplanationOfBenefitDetail1();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS: return createExplanationOfBenefitDiagnosis();
			case FhirPackage.EXPLANATION_OF_BENEFIT_EVENT: return createExplanationOfBenefitEvent();
			case FhirPackage.EXPLANATION_OF_BENEFIT_FINANCIAL: return createExplanationOfBenefitFinancial();
			case FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE: return createExplanationOfBenefitInsurance();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM: return createExplanationOfBenefitItem();
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE: return createExplanationOfBenefitPayee();
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYMENT: return createExplanationOfBenefitPayment();
			case FhirPackage.EXPLANATION_OF_BENEFIT_PROCEDURE: return createExplanationOfBenefitProcedure();
			case FhirPackage.EXPLANATION_OF_BENEFIT_PROCESS_NOTE: return createExplanationOfBenefitProcessNote();
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED: return createExplanationOfBenefitRelated();
			case FhirPackage.EXPLANATION_OF_BENEFIT_REVIEW_OUTCOME: return createExplanationOfBenefitReviewOutcome();
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS: return createExplanationOfBenefitStatus();
			case FhirPackage.EXPLANATION_OF_BENEFIT_SUB_DETAIL: return createExplanationOfBenefitSubDetail();
			case FhirPackage.EXPLANATION_OF_BENEFIT_SUB_DETAIL1: return createExplanationOfBenefitSubDetail1();
			case FhirPackage.EXPLANATION_OF_BENEFIT_SUPPORTING_INFO: return createExplanationOfBenefitSupportingInfo();
			case FhirPackage.EXPLANATION_OF_BENEFIT_TOTAL: return createExplanationOfBenefitTotal();
			case FhirPackage.EXPRESSION: return createExpression();
			case FhirPackage.EXTENDED_CONTACT_DETAIL: return createExtendedContactDetail();
			case FhirPackage.EXTENSION: return createExtension();
			case FhirPackage.EXTENSION_CONTEXT_TYPE: return createExtensionContextType();
			case FhirPackage.FAMILY_HISTORY_STATUS: return createFamilyHistoryStatus();
			case FhirPackage.FAMILY_MEMBER_HISTORY: return createFamilyMemberHistory();
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION: return createFamilyMemberHistoryCondition();
			case FhirPackage.FAMILY_MEMBER_HISTORY_PARTICIPANT: return createFamilyMemberHistoryParticipant();
			case FhirPackage.FAMILY_MEMBER_HISTORY_PROCEDURE: return createFamilyMemberHistoryProcedure();
			case FhirPackage.FHIR_DEVICE_STATUS: return createFHIRDeviceStatus();
			case FhirPackage.FHIR_PATH_TYPES: return createFHIRPathTypes();
			case FhirPackage.FHIR_SUBSTANCE_STATUS: return createFHIRSubstanceStatus();
			case FhirPackage.FHIR_TYPES: return createFHIRTypes();
			case FhirPackage.FHIR_VERSION: return createFHIRVersion();
			case FhirPackage.FILTER_OPERATOR: return createFilterOperator();
			case FhirPackage.FINANCIAL_RESOURCE_STATUS_CODES: return createFinancialResourceStatusCodes();
			case FhirPackage.FLAG: return createFlag();
			case FhirPackage.FLAG_STATUS: return createFlagStatus();
			case FhirPackage.FORMULARY_ITEM: return createFormularyItem();
			case FhirPackage.FORMULARY_ITEM_STATUS_CODES: return createFormularyItemStatusCodes();
			case FhirPackage.GENOMIC_STUDY: return createGenomicStudy();
			case FhirPackage.GENOMIC_STUDY_ANALYSIS: return createGenomicStudyAnalysis();
			case FhirPackage.GENOMIC_STUDY_DEVICE: return createGenomicStudyDevice();
			case FhirPackage.GENOMIC_STUDY_INPUT: return createGenomicStudyInput();
			case FhirPackage.GENOMIC_STUDY_OUTPUT: return createGenomicStudyOutput();
			case FhirPackage.GENOMIC_STUDY_PERFORMER: return createGenomicStudyPerformer();
			case FhirPackage.GENOMIC_STUDY_STATUS: return createGenomicStudyStatus();
			case FhirPackage.GOAL: return createGoal();
			case FhirPackage.GOAL_LIFECYCLE_STATUS: return createGoalLifecycleStatus();
			case FhirPackage.GOAL_TARGET: return createGoalTarget();
			case FhirPackage.GRAPH_COMPARTMENT_RULE: return createGraphCompartmentRule();
			case FhirPackage.GRAPH_COMPARTMENT_USE: return createGraphCompartmentUse();
			case FhirPackage.GRAPH_DEFINITION: return createGraphDefinition();
			case FhirPackage.GRAPH_DEFINITION_COMPARTMENT: return createGraphDefinitionCompartment();
			case FhirPackage.GRAPH_DEFINITION_LINK: return createGraphDefinitionLink();
			case FhirPackage.GRAPH_DEFINITION_NODE: return createGraphDefinitionNode();
			case FhirPackage.GROUP: return createGroup();
			case FhirPackage.GROUP_CHARACTERISTIC: return createGroupCharacteristic();
			case FhirPackage.GROUP_MEMBER: return createGroupMember();
			case FhirPackage.GROUP_MEMBERSHIP_BASIS: return createGroupMembershipBasis();
			case FhirPackage.GROUP_TYPE: return createGroupType();
			case FhirPackage.GUIDANCE_RESPONSE: return createGuidanceResponse();
			case FhirPackage.GUIDANCE_RESPONSE_STATUS: return createGuidanceResponseStatus();
			case FhirPackage.GUIDE_PAGE_GENERATION: return createGuidePageGeneration();
			case FhirPackage.HEALTHCARE_SERVICE: return createHealthcareService();
			case FhirPackage.HEALTHCARE_SERVICE_ELIGIBILITY: return createHealthcareServiceEligibility();
			case FhirPackage.HTTP_VERB: return createHTTPVerb();
			case FhirPackage.HUMAN_NAME: return createHumanName();
			case FhirPackage.ID: return createId();
			case FhirPackage.IDENTIFIER: return createIdentifier();
			case FhirPackage.IDENTIFIER_USE: return createIdentifierUse();
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL: return createIdentityAssuranceLevel();
			case FhirPackage.IMAGING_SELECTION: return createImagingSelection();
			case FhirPackage.IMAGING_SELECTION_DGRAPHIC_TYPE: return createImagingSelectionDGraphicType();
			case FhirPackage.IMAGING_SELECTION_IMAGE_REGION2_D: return createImagingSelectionImageRegion2D();
			case FhirPackage.IMAGING_SELECTION_IMAGE_REGION3_D: return createImagingSelectionImageRegion3D();
			case FhirPackage.IMAGING_SELECTION_INSTANCE: return createImagingSelectionInstance();
			case FhirPackage.IMAGING_SELECTION_PERFORMER: return createImagingSelectionPerformer();
			case FhirPackage.IMAGING_SELECTION_STATUS: return createImagingSelectionStatus();
			case FhirPackage.IMAGING_STUDY: return createImagingStudy();
			case FhirPackage.IMAGING_STUDY_INSTANCE: return createImagingStudyInstance();
			case FhirPackage.IMAGING_STUDY_PERFORMER: return createImagingStudyPerformer();
			case FhirPackage.IMAGING_STUDY_SERIES: return createImagingStudySeries();
			case FhirPackage.IMAGING_STUDY_STATUS: return createImagingStudyStatus();
			case FhirPackage.IMMUNIZATION: return createImmunization();
			case FhirPackage.IMMUNIZATION_EVALUATION: return createImmunizationEvaluation();
			case FhirPackage.IMMUNIZATION_EVALUATION_STATUS_CODES: return createImmunizationEvaluationStatusCodes();
			case FhirPackage.IMMUNIZATION_PERFORMER: return createImmunizationPerformer();
			case FhirPackage.IMMUNIZATION_PROGRAM_ELIGIBILITY: return createImmunizationProgramEligibility();
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED: return createImmunizationProtocolApplied();
			case FhirPackage.IMMUNIZATION_REACTION: return createImmunizationReaction();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION: return createImmunizationRecommendation();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_DATE_CRITERION: return createImmunizationRecommendationDateCriterion();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION: return createImmunizationRecommendationRecommendation();
			case FhirPackage.IMMUNIZATION_STATUS_CODES: return createImmunizationStatusCodes();
			case FhirPackage.IMPLEMENTATION_GUIDE: return createImplementationGuide();
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION: return createImplementationGuideDefinition();
			case FhirPackage.IMPLEMENTATION_GUIDE_DEPENDS_ON: return createImplementationGuideDependsOn();
			case FhirPackage.IMPLEMENTATION_GUIDE_GLOBAL: return createImplementationGuideGlobal();
			case FhirPackage.IMPLEMENTATION_GUIDE_GROUPING: return createImplementationGuideGrouping();
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST: return createImplementationGuideManifest();
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE: return createImplementationGuidePage();
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE1: return createImplementationGuidePage1();
			case FhirPackage.IMPLEMENTATION_GUIDE_PARAMETER: return createImplementationGuideParameter();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE: return createImplementationGuideResource();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1: return createImplementationGuideResource1();
			case FhirPackage.IMPLEMENTATION_GUIDE_TEMPLATE: return createImplementationGuideTemplate();
			case FhirPackage.INGREDIENT: return createIngredient();
			case FhirPackage.INGREDIENT_MANUFACTURER: return createIngredientManufacturer();
			case FhirPackage.INGREDIENT_MANUFACTURER_ROLE: return createIngredientManufacturerRole();
			case FhirPackage.INGREDIENT_REFERENCE_STRENGTH: return createIngredientReferenceStrength();
			case FhirPackage.INGREDIENT_STRENGTH: return createIngredientStrength();
			case FhirPackage.INGREDIENT_SUBSTANCE: return createIngredientSubstance();
			case FhirPackage.INSTANT: return createInstant();
			case FhirPackage.INSURANCE_PLAN: return createInsurancePlan();
			case FhirPackage.INSURANCE_PLAN_BENEFIT: return createInsurancePlanBenefit();
			case FhirPackage.INSURANCE_PLAN_BENEFIT1: return createInsurancePlanBenefit1();
			case FhirPackage.INSURANCE_PLAN_COST: return createInsurancePlanCost();
			case FhirPackage.INSURANCE_PLAN_COVERAGE: return createInsurancePlanCoverage();
			case FhirPackage.INSURANCE_PLAN_GENERAL_COST: return createInsurancePlanGeneralCost();
			case FhirPackage.INSURANCE_PLAN_LIMIT: return createInsurancePlanLimit();
			case FhirPackage.INSURANCE_PLAN_PLAN: return createInsurancePlanPlan();
			case FhirPackage.INSURANCE_PLAN_SPECIFIC_COST: return createInsurancePlanSpecificCost();
			case FhirPackage.INTEGER: return createInteger();
			case FhirPackage.INTEGER64: return createInteger64();
			case FhirPackage.INTERACTION_TRIGGER: return createInteractionTrigger();
			case FhirPackage.INVENTORY_COUNT_TYPE: return createInventoryCountType();
			case FhirPackage.INVENTORY_ITEM: return createInventoryItem();
			case FhirPackage.INVENTORY_ITEM_ASSOCIATION: return createInventoryItemAssociation();
			case FhirPackage.INVENTORY_ITEM_CHARACTERISTIC: return createInventoryItemCharacteristic();
			case FhirPackage.INVENTORY_ITEM_DESCRIPTION: return createInventoryItemDescription();
			case FhirPackage.INVENTORY_ITEM_INSTANCE: return createInventoryItemInstance();
			case FhirPackage.INVENTORY_ITEM_NAME: return createInventoryItemName();
			case FhirPackage.INVENTORY_ITEM_RESPONSIBLE_ORGANIZATION: return createInventoryItemResponsibleOrganization();
			case FhirPackage.INVENTORY_ITEM_STATUS_CODES: return createInventoryItemStatusCodes();
			case FhirPackage.INVENTORY_REPORT: return createInventoryReport();
			case FhirPackage.INVENTORY_REPORT_INVENTORY_LISTING: return createInventoryReportInventoryListing();
			case FhirPackage.INVENTORY_REPORT_ITEM: return createInventoryReportItem();
			case FhirPackage.INVENTORY_REPORT_STATUS: return createInventoryReportStatus();
			case FhirPackage.INVOICE: return createInvoice();
			case FhirPackage.INVOICE_LINE_ITEM: return createInvoiceLineItem();
			case FhirPackage.INVOICE_PARTICIPANT: return createInvoiceParticipant();
			case FhirPackage.INVOICE_STATUS: return createInvoiceStatus();
			case FhirPackage.ISSUE_SEVERITY: return createIssueSeverity();
			case FhirPackage.ISSUE_TYPE: return createIssueType();
			case FhirPackage.JURISDICTION_VALUE_SET: return createJurisdictionValueSet();
			case FhirPackage.KIND: return createKind();
			case FhirPackage.LIBRARY: return createLibrary();
			case FhirPackage.LINKAGE: return createLinkage();
			case FhirPackage.LINKAGE_ITEM: return createLinkageItem();
			case FhirPackage.LINKAGE_TYPE: return createLinkageType();
			case FhirPackage.LINK_RELATION_TYPES: return createLinkRelationTypes();
			case FhirPackage.LINK_TYPE: return createLinkType();
			case FhirPackage.LIST: return createList();
			case FhirPackage.LIST_ENTRY: return createListEntry();
			case FhirPackage.LIST_MODE: return createListMode();
			case FhirPackage.LIST_STATUS: return createListStatus();
			case FhirPackage.LOCATION: return createLocation();
			case FhirPackage.LOCATION_MODE: return createLocationMode();
			case FhirPackage.LOCATION_POSITION: return createLocationPosition();
			case FhirPackage.LOCATION_STATUS: return createLocationStatus();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION: return createManufacturedItemDefinition();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_COMPONENT: return createManufacturedItemDefinitionComponent();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_CONSTITUENT: return createManufacturedItemDefinitionConstituent();
			case FhirPackage.MANUFACTURED_ITEM_DEFINITION_PROPERTY: return createManufacturedItemDefinitionProperty();
			case FhirPackage.MARKDOWN: return createMarkdown();
			case FhirPackage.MARKETING_STATUS: return createMarketingStatus();
			case FhirPackage.MEASURE: return createMeasure();
			case FhirPackage.MEASURE_COMPONENT: return createMeasureComponent();
			case FhirPackage.MEASURE_GROUP: return createMeasureGroup();
			case FhirPackage.MEASURE_POPULATION: return createMeasurePopulation();
			case FhirPackage.MEASURE_REPORT: return createMeasureReport();
			case FhirPackage.MEASURE_REPORT_COMPONENT: return createMeasureReportComponent();
			case FhirPackage.MEASURE_REPORT_GROUP: return createMeasureReportGroup();
			case FhirPackage.MEASURE_REPORT_POPULATION: return createMeasureReportPopulation();
			case FhirPackage.MEASURE_REPORT_POPULATION1: return createMeasureReportPopulation1();
			case FhirPackage.MEASURE_REPORT_STATUS: return createMeasureReportStatus();
			case FhirPackage.MEASURE_REPORT_STRATIFIER: return createMeasureReportStratifier();
			case FhirPackage.MEASURE_REPORT_STRATUM: return createMeasureReportStratum();
			case FhirPackage.MEASURE_REPORT_TYPE: return createMeasureReportType();
			case FhirPackage.MEASURE_STRATIFIER: return createMeasureStratifier();
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA: return createMeasureSupplementalData();
			case FhirPackage.MEASURE_TERM: return createMeasureTerm();
			case FhirPackage.MEDICATION: return createMedication();
			case FhirPackage.MEDICATION_ADMINISTRATION: return createMedicationAdministration();
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE: return createMedicationAdministrationDosage();
			case FhirPackage.MEDICATION_ADMINISTRATION_PERFORMER: return createMedicationAdministrationPerformer();
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS_CODES: return createMedicationAdministrationStatusCodes();
			case FhirPackage.MEDICATION_BATCH: return createMedicationBatch();
			case FhirPackage.MEDICATION_DISPENSE: return createMedicationDispense();
			case FhirPackage.MEDICATION_DISPENSE_PERFORMER: return createMedicationDispensePerformer();
			case FhirPackage.MEDICATION_DISPENSE_STATUS_CODES: return createMedicationDispenseStatusCodes();
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION: return createMedicationDispenseSubstitution();
			case FhirPackage.MEDICATION_INGREDIENT: return createMedicationIngredient();
			case FhirPackage.MEDICATION_KNOWLEDGE: return createMedicationKnowledge();
			case FhirPackage.MEDICATION_KNOWLEDGE_COST: return createMedicationKnowledgeCost();
			case FhirPackage.MEDICATION_KNOWLEDGE_DEFINITIONAL: return createMedicationKnowledgeDefinitional();
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSAGE: return createMedicationKnowledgeDosage();
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSING_GUIDELINE: return createMedicationKnowledgeDosingGuideline();
			case FhirPackage.MEDICATION_KNOWLEDGE_DRUG_CHARACTERISTIC: return createMedicationKnowledgeDrugCharacteristic();
			case FhirPackage.MEDICATION_KNOWLEDGE_ENVIRONMENTAL_SETTING: return createMedicationKnowledgeEnvironmentalSetting();
			case FhirPackage.MEDICATION_KNOWLEDGE_INDICATION_GUIDELINE: return createMedicationKnowledgeIndicationGuideline();
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT: return createMedicationKnowledgeIngredient();
			case FhirPackage.MEDICATION_KNOWLEDGE_MAX_DISPENSE: return createMedicationKnowledgeMaxDispense();
			case FhirPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION: return createMedicationKnowledgeMedicineClassification();
			case FhirPackage.MEDICATION_KNOWLEDGE_MONITORING_PROGRAM: return createMedicationKnowledgeMonitoringProgram();
			case FhirPackage.MEDICATION_KNOWLEDGE_MONOGRAPH: return createMedicationKnowledgeMonograph();
			case FhirPackage.MEDICATION_KNOWLEDGE_PACKAGING: return createMedicationKnowledgePackaging();
			case FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTIC: return createMedicationKnowledgePatientCharacteristic();
			case FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY: return createMedicationKnowledgeRegulatory();
			case FhirPackage.MEDICATION_KNOWLEDGE_RELATED_MEDICATION_KNOWLEDGE: return createMedicationKnowledgeRelatedMedicationKnowledge();
			case FhirPackage.MEDICATION_KNOWLEDGE_STATUS_CODES: return createMedicationKnowledgeStatusCodes();
			case FhirPackage.MEDICATION_KNOWLEDGE_STORAGE_GUIDELINE: return createMedicationKnowledgeStorageGuideline();
			case FhirPackage.MEDICATION_KNOWLEDGE_SUBSTITUTION: return createMedicationKnowledgeSubstitution();
			case FhirPackage.MEDICATION_REQUEST: return createMedicationRequest();
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST: return createMedicationRequestDispenseRequest();
			case FhirPackage.MEDICATION_REQUEST_INITIAL_FILL: return createMedicationRequestInitialFill();
			case FhirPackage.MEDICATION_REQUEST_INTENT: return createMedicationRequestIntent();
			case FhirPackage.MEDICATIONREQUEST_STATUS: return createMedicationrequestStatus();
			case FhirPackage.MEDICATION_REQUEST_SUBSTITUTION: return createMedicationRequestSubstitution();
			case FhirPackage.MEDICATION_STATEMENT: return createMedicationStatement();
			case FhirPackage.MEDICATION_STATEMENT_ADHERENCE: return createMedicationStatementAdherence();
			case FhirPackage.MEDICATION_STATEMENT_STATUS_CODES: return createMedicationStatementStatusCodes();
			case FhirPackage.MEDICATION_STATUS_CODES: return createMedicationStatusCodes();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION: return createMedicinalProductDefinition();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CHARACTERISTIC: return createMedicinalProductDefinitionCharacteristic();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CONTACT: return createMedicinalProductDefinitionContact();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_CROSS_REFERENCE: return createMedicinalProductDefinitionCrossReference();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_NAME: return createMedicinalProductDefinitionName();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_OPERATION: return createMedicinalProductDefinitionOperation();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_PART: return createMedicinalProductDefinitionPart();
			case FhirPackage.MEDICINAL_PRODUCT_DEFINITION_USAGE: return createMedicinalProductDefinitionUsage();
			case FhirPackage.MESSAGE_DEFINITION: return createMessageDefinition();
			case FhirPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE: return createMessageDefinitionAllowedResponse();
			case FhirPackage.MESSAGE_DEFINITION_FOCUS: return createMessageDefinitionFocus();
			case FhirPackage.MESSAGE_HEADER: return createMessageHeader();
			case FhirPackage.MESSAGE_HEADER_DESTINATION: return createMessageHeaderDestination();
			case FhirPackage.MESSAGE_HEADER_RESPONSE: return createMessageHeaderResponse();
			case FhirPackage.MESSAGEHEADER_RESPONSE_REQUEST: return createMessageheaderResponseRequest();
			case FhirPackage.MESSAGE_HEADER_SOURCE: return createMessageHeaderSource();
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY: return createMessageSignificanceCategory();
			case FhirPackage.META: return createMeta();
			case FhirPackage.METADATA_RESOURCE: return createMetadataResource();
			case FhirPackage.MOLECULAR_SEQUENCE: return createMolecularSequence();
			case FhirPackage.MOLECULAR_SEQUENCE_EDIT: return createMolecularSequenceEdit();
			case FhirPackage.MOLECULAR_SEQUENCE_RELATIVE: return createMolecularSequenceRelative();
			case FhirPackage.MOLECULAR_SEQUENCE_STARTING_SEQUENCE: return createMolecularSequenceStartingSequence();
			case FhirPackage.MONETARY_COMPONENT: return createMonetaryComponent();
			case FhirPackage.MONEY: return createMoney();
			case FhirPackage.NAME_USE: return createNameUse();
			case FhirPackage.NAMING_SYSTEM: return createNamingSystem();
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE: return createNamingSystemIdentifierType();
			case FhirPackage.NAMING_SYSTEM_TYPE: return createNamingSystemType();
			case FhirPackage.NAMING_SYSTEM_UNIQUE_ID: return createNamingSystemUniqueId();
			case FhirPackage.NARRATIVE: return createNarrative();
			case FhirPackage.NARRATIVE_STATUS: return createNarrativeStatus();
			case FhirPackage.NOTE_TYPE: return createNoteType();
			case FhirPackage.NUTRITION_INTAKE: return createNutritionIntake();
			case FhirPackage.NUTRITION_INTAKE_CONSUMED_ITEM: return createNutritionIntakeConsumedItem();
			case FhirPackage.NUTRITION_INTAKE_INGREDIENT_LABEL: return createNutritionIntakeIngredientLabel();
			case FhirPackage.NUTRITION_INTAKE_PERFORMER: return createNutritionIntakePerformer();
			case FhirPackage.NUTRITION_ORDER: return createNutritionOrder();
			case FhirPackage.NUTRITION_ORDER_ADDITIVE: return createNutritionOrderAdditive();
			case FhirPackage.NUTRITION_ORDER_ADMINISTRATION: return createNutritionOrderAdministration();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA: return createNutritionOrderEnteralFormula();
			case FhirPackage.NUTRITION_ORDER_NUTRIENT: return createNutritionOrderNutrient();
			case FhirPackage.NUTRITION_ORDER_ORAL_DIET: return createNutritionOrderOralDiet();
			case FhirPackage.NUTRITION_ORDER_SCHEDULE: return createNutritionOrderSchedule();
			case FhirPackage.NUTRITION_ORDER_SCHEDULE1: return createNutritionOrderSchedule1();
			case FhirPackage.NUTRITION_ORDER_SCHEDULE2: return createNutritionOrderSchedule2();
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT: return createNutritionOrderSupplement();
			case FhirPackage.NUTRITION_ORDER_TEXTURE: return createNutritionOrderTexture();
			case FhirPackage.NUTRITION_PRODUCT: return createNutritionProduct();
			case FhirPackage.NUTRITION_PRODUCT_CHARACTERISTIC: return createNutritionProductCharacteristic();
			case FhirPackage.NUTRITION_PRODUCT_INGREDIENT: return createNutritionProductIngredient();
			case FhirPackage.NUTRITION_PRODUCT_INSTANCE: return createNutritionProductInstance();
			case FhirPackage.NUTRITION_PRODUCT_NUTRIENT: return createNutritionProductNutrient();
			case FhirPackage.NUTRITION_PRODUCT_STATUS: return createNutritionProductStatus();
			case FhirPackage.OBSERVATION: return createObservation();
			case FhirPackage.OBSERVATION_COMPONENT: return createObservationComponent();
			case FhirPackage.OBSERVATION_DATA_TYPE: return createObservationDataType();
			case FhirPackage.OBSERVATION_DEFINITION: return createObservationDefinition();
			case FhirPackage.OBSERVATION_DEFINITION_COMPONENT: return createObservationDefinitionComponent();
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_VALUE: return createObservationDefinitionQualifiedValue();
			case FhirPackage.OBSERVATION_RANGE_CATEGORY: return createObservationRangeCategory();
			case FhirPackage.OBSERVATION_REFERENCE_RANGE: return createObservationReferenceRange();
			case FhirPackage.OBSERVATION_STATUS: return createObservationStatus();
			case FhirPackage.OBSERVATION_TRIGGERED_BY: return createObservationTriggeredBy();
			case FhirPackage.OID: return createOid();
			case FhirPackage.OPERATION_DEFINITION: return createOperationDefinition();
			case FhirPackage.OPERATION_DEFINITION_BINDING: return createOperationDefinitionBinding();
			case FhirPackage.OPERATION_DEFINITION_OVERLOAD: return createOperationDefinitionOverload();
			case FhirPackage.OPERATION_DEFINITION_PARAMETER: return createOperationDefinitionParameter();
			case FhirPackage.OPERATION_DEFINITION_REFERENCED_FROM: return createOperationDefinitionReferencedFrom();
			case FhirPackage.OPERATION_KIND: return createOperationKind();
			case FhirPackage.OPERATION_OUTCOME: return createOperationOutcome();
			case FhirPackage.OPERATION_OUTCOME_CODES: return createOperationOutcomeCodes();
			case FhirPackage.OPERATION_OUTCOME_ISSUE: return createOperationOutcomeIssue();
			case FhirPackage.OPERATION_PARAMETER_SCOPE: return createOperationParameterScope();
			case FhirPackage.OPERATION_PARAMETER_USE: return createOperationParameterUse();
			case FhirPackage.ORGANIZATION: return createOrganization();
			case FhirPackage.ORGANIZATION_AFFILIATION: return createOrganizationAffiliation();
			case FhirPackage.ORGANIZATION_QUALIFICATION: return createOrganizationQualification();
			case FhirPackage.ORIENTATION_TYPE: return createOrientationType();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION: return createPackagedProductDefinition();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_CONTAINED_ITEM: return createPackagedProductDefinitionContainedItem();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_LEGAL_STATUS_OF_SUPPLY: return createPackagedProductDefinitionLegalStatusOfSupply();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PACKAGING: return createPackagedProductDefinitionPackaging();
			case FhirPackage.PACKAGED_PRODUCT_DEFINITION_PROPERTY: return createPackagedProductDefinitionProperty();
			case FhirPackage.PARAMETER_DEFINITION: return createParameterDefinition();
			case FhirPackage.PARAMETERS: return createParameters();
			case FhirPackage.PARAMETERS_PARAMETER: return createParametersParameter();
			case FhirPackage.PARTICIPANT_RESOURCE_TYPES: return createParticipantResourceTypes();
			case FhirPackage.PARTICIPATION_STATUS: return createParticipationStatus();
			case FhirPackage.PATIENT: return createPatient();
			case FhirPackage.PATIENT_COMMUNICATION: return createPatientCommunication();
			case FhirPackage.PATIENT_CONTACT: return createPatientContact();
			case FhirPackage.PATIENT_LINK: return createPatientLink();
			case FhirPackage.PAYMENT_NOTICE: return createPaymentNotice();
			case FhirPackage.PAYMENT_OUTCOME: return createPaymentOutcome();
			case FhirPackage.PAYMENT_RECONCILIATION: return createPaymentReconciliation();
			case FhirPackage.PAYMENT_RECONCILIATION_ALLOCATION: return createPaymentReconciliationAllocation();
			case FhirPackage.PAYMENT_RECONCILIATION_PROCESS_NOTE: return createPaymentReconciliationProcessNote();
			case FhirPackage.PERIOD: return createPeriod();
			case FhirPackage.PERMISSION: return createPermission();
			case FhirPackage.PERMISSION_ACTIVITY: return createPermissionActivity();
			case FhirPackage.PERMISSION_DATA: return createPermissionData();
			case FhirPackage.PERMISSION_JUSTIFICATION: return createPermissionJustification();
			case FhirPackage.PERMISSION_RESOURCE: return createPermissionResource();
			case FhirPackage.PERMISSION_RULE: return createPermissionRule();
			case FhirPackage.PERMISSION_RULE_COMBINING: return createPermissionRuleCombining();
			case FhirPackage.PERMISSION_STATUS: return createPermissionStatus();
			case FhirPackage.PERSON: return createPerson();
			case FhirPackage.PERSON_COMMUNICATION: return createPersonCommunication();
			case FhirPackage.PERSON_LINK: return createPersonLink();
			case FhirPackage.PLAN_DEFINITION: return createPlanDefinition();
			case FhirPackage.PLAN_DEFINITION_ACTION: return createPlanDefinitionAction();
			case FhirPackage.PLAN_DEFINITION_ACTOR: return createPlanDefinitionActor();
			case FhirPackage.PLAN_DEFINITION_CONDITION: return createPlanDefinitionCondition();
			case FhirPackage.PLAN_DEFINITION_DYNAMIC_VALUE: return createPlanDefinitionDynamicValue();
			case FhirPackage.PLAN_DEFINITION_GOAL: return createPlanDefinitionGoal();
			case FhirPackage.PLAN_DEFINITION_INPUT: return createPlanDefinitionInput();
			case FhirPackage.PLAN_DEFINITION_OPTION: return createPlanDefinitionOption();
			case FhirPackage.PLAN_DEFINITION_OUTPUT: return createPlanDefinitionOutput();
			case FhirPackage.PLAN_DEFINITION_PARTICIPANT: return createPlanDefinitionParticipant();
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION: return createPlanDefinitionRelatedAction();
			case FhirPackage.PLAN_DEFINITION_TARGET: return createPlanDefinitionTarget();
			case FhirPackage.POSITIVE_INT: return createPositiveInt();
			case FhirPackage.PRACTITIONER: return createPractitioner();
			case FhirPackage.PRACTITIONER_COMMUNICATION: return createPractitionerCommunication();
			case FhirPackage.PRACTITIONER_QUALIFICATION: return createPractitionerQualification();
			case FhirPackage.PRACTITIONER_ROLE: return createPractitionerRole();
			case FhirPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case FhirPackage.PROCEDURE: return createProcedure();
			case FhirPackage.PROCEDURE_FOCAL_DEVICE: return createProcedureFocalDevice();
			case FhirPackage.PROCEDURE_PERFORMER: return createProcedurePerformer();
			case FhirPackage.PRODUCT_SHELF_LIFE: return createProductShelfLife();
			case FhirPackage.PROPERTY_REPRESENTATION: return createPropertyRepresentation();
			case FhirPackage.PROPERTY_TYPE: return createPropertyType();
			case FhirPackage.PROVENANCE: return createProvenance();
			case FhirPackage.PROVENANCE_AGENT: return createProvenanceAgent();
			case FhirPackage.PROVENANCE_ENTITY: return createProvenanceEntity();
			case FhirPackage.PROVENANCE_ENTITY_ROLE: return createProvenanceEntityRole();
			case FhirPackage.PUBLICATION_STATUS: return createPublicationStatus();
			case FhirPackage.QUANTITY: return createQuantity();
			case FhirPackage.QUANTITY_COMPARATOR: return createQuantityComparator();
			case FhirPackage.QUESTIONNAIRE: return createQuestionnaire();
			case FhirPackage.QUESTIONNAIRE_ANSWER_CONSTRAINT: return createQuestionnaireAnswerConstraint();
			case FhirPackage.QUESTIONNAIRE_ANSWER_OPTION: return createQuestionnaireAnswerOption();
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN: return createQuestionnaireEnableWhen();
			case FhirPackage.QUESTIONNAIRE_INITIAL: return createQuestionnaireInitial();
			case FhirPackage.QUESTIONNAIRE_ITEM: return createQuestionnaireItem();
			case FhirPackage.QUESTIONNAIRE_ITEM_DISABLED_DISPLAY: return createQuestionnaireItemDisabledDisplay();
			case FhirPackage.QUESTIONNAIRE_ITEM_OPERATOR: return createQuestionnaireItemOperator();
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE: return createQuestionnaireItemType();
			case FhirPackage.QUESTIONNAIRE_RESPONSE: return createQuestionnaireResponse();
			case FhirPackage.QUESTIONNAIRE_RESPONSE_ANSWER: return createQuestionnaireResponseAnswer();
			case FhirPackage.QUESTIONNAIRE_RESPONSE_ITEM: return createQuestionnaireResponseItem();
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS: return createQuestionnaireResponseStatus();
			case FhirPackage.RANGE: return createRange();
			case FhirPackage.RATIO: return createRatio();
			case FhirPackage.RATIO_RANGE: return createRatioRange();
			case FhirPackage.REFERENCE: return createReference();
			case FhirPackage.REFERENCE_HANDLING_POLICY: return createReferenceHandlingPolicy();
			case FhirPackage.REFERENCE_VERSION_RULES: return createReferenceVersionRules();
			case FhirPackage.REGULATED_AUTHORIZATION: return createRegulatedAuthorization();
			case FhirPackage.REGULATED_AUTHORIZATION_CASE: return createRegulatedAuthorizationCase();
			case FhirPackage.RELATED_ARTIFACT: return createRelatedArtifact();
			case FhirPackage.RELATED_ARTIFACT_TYPE: return createRelatedArtifactType();
			case FhirPackage.RELATED_ARTIFACT_TYPE_EXPANDED: return createRelatedArtifactTypeExpanded();
			case FhirPackage.RELATED_PERSON: return createRelatedPerson();
			case FhirPackage.RELATED_PERSON_COMMUNICATION: return createRelatedPersonCommunication();
			case FhirPackage.REMITTANCE_OUTCOME: return createRemittanceOutcome();
			case FhirPackage.REPORT_RELATIONSHIP_TYPE: return createReportRelationshipType();
			case FhirPackage.REQUEST_INTENT: return createRequestIntent();
			case FhirPackage.REQUEST_ORCHESTRATION: return createRequestOrchestration();
			case FhirPackage.REQUEST_ORCHESTRATION_ACTION: return createRequestOrchestrationAction();
			case FhirPackage.REQUEST_ORCHESTRATION_CONDITION: return createRequestOrchestrationCondition();
			case FhirPackage.REQUEST_ORCHESTRATION_DYNAMIC_VALUE: return createRequestOrchestrationDynamicValue();
			case FhirPackage.REQUEST_ORCHESTRATION_INPUT: return createRequestOrchestrationInput();
			case FhirPackage.REQUEST_ORCHESTRATION_OUTPUT: return createRequestOrchestrationOutput();
			case FhirPackage.REQUEST_ORCHESTRATION_PARTICIPANT: return createRequestOrchestrationParticipant();
			case FhirPackage.REQUEST_ORCHESTRATION_RELATED_ACTION: return createRequestOrchestrationRelatedAction();
			case FhirPackage.REQUEST_PRIORITY: return createRequestPriority();
			case FhirPackage.REQUEST_RESOURCE_TYPES: return createRequestResourceTypes();
			case FhirPackage.REQUEST_STATUS: return createRequestStatus();
			case FhirPackage.REQUIREMENTS: return createRequirements();
			case FhirPackage.REQUIREMENTS_STATEMENT: return createRequirementsStatement();
			case FhirPackage.RESEARCH_STUDY: return createResearchStudy();
			case FhirPackage.RESEARCH_STUDY_ASSOCIATED_PARTY: return createResearchStudyAssociatedParty();
			case FhirPackage.RESEARCH_STUDY_COMPARISON_GROUP: return createResearchStudyComparisonGroup();
			case FhirPackage.RESEARCH_STUDY_LABEL: return createResearchStudyLabel();
			case FhirPackage.RESEARCH_STUDY_OBJECTIVE: return createResearchStudyObjective();
			case FhirPackage.RESEARCH_STUDY_OUTCOME_MEASURE: return createResearchStudyOutcomeMeasure();
			case FhirPackage.RESEARCH_STUDY_PROGRESS_STATUS: return createResearchStudyProgressStatus();
			case FhirPackage.RESEARCH_STUDY_RECRUITMENT: return createResearchStudyRecruitment();
			case FhirPackage.RESEARCH_SUBJECT: return createResearchSubject();
			case FhirPackage.RESEARCH_SUBJECT_PROGRESS: return createResearchSubjectProgress();
			case FhirPackage.RESOURCE: return createResource();
			case FhirPackage.RESOURCE_CONTAINER: return createResourceContainer();
			case FhirPackage.RESOURCE_TYPE: return createResourceType();
			case FhirPackage.RESOURCE_VERSION_POLICY: return createResourceVersionPolicy();
			case FhirPackage.RESPONSE_TYPE: return createResponseType();
			case FhirPackage.RESTFUL_CAPABILITY_MODE: return createRestfulCapabilityMode();
			case FhirPackage.RISK_ASSESSMENT: return createRiskAssessment();
			case FhirPackage.RISK_ASSESSMENT_PREDICTION: return createRiskAssessmentPrediction();
			case FhirPackage.SAMPLED_DATA: return createSampledData();
			case FhirPackage.SAMPLED_DATA_DATA_TYPE: return createSampledDataDataType();
			case FhirPackage.SCHEDULE: return createSchedule();
			case FhirPackage.SEARCH_COMPARATOR: return createSearchComparator();
			case FhirPackage.SEARCH_ENTRY_MODE: return createSearchEntryMode();
			case FhirPackage.SEARCH_MODIFIER_CODE: return createSearchModifierCode();
			case FhirPackage.SEARCH_PARAMETER: return createSearchParameter();
			case FhirPackage.SEARCH_PARAMETER_COMPONENT: return createSearchParameterComponent();
			case FhirPackage.SEARCH_PARAM_TYPE: return createSearchParamType();
			case FhirPackage.SEARCH_PROCESSING_MODE_TYPE: return createSearchProcessingModeType();
			case FhirPackage.SEQUENCE_TYPE: return createSequenceType();
			case FhirPackage.SERVICE_REQUEST: return createServiceRequest();
			case FhirPackage.SERVICE_REQUEST_ORDER_DETAIL: return createServiceRequestOrderDetail();
			case FhirPackage.SERVICE_REQUEST_PARAMETER: return createServiceRequestParameter();
			case FhirPackage.SERVICE_REQUEST_PATIENT_INSTRUCTION: return createServiceRequestPatientInstruction();
			case FhirPackage.SIGNATURE: return createSignature();
			case FhirPackage.SLICING_RULES: return createSlicingRules();
			case FhirPackage.SLOT: return createSlot();
			case FhirPackage.SLOT_STATUS: return createSlotStatus();
			case FhirPackage.SORT_DIRECTION: return createSortDirection();
			case FhirPackage.SPDX_LICENSE: return createSPDXLicense();
			case FhirPackage.SPECIMEN: return createSpecimen();
			case FhirPackage.SPECIMEN_COLLECTION: return createSpecimenCollection();
			case FhirPackage.SPECIMEN_COMBINED: return createSpecimenCombined();
			case FhirPackage.SPECIMEN_CONTAINED_PREFERENCE: return createSpecimenContainedPreference();
			case FhirPackage.SPECIMEN_CONTAINER: return createSpecimenContainer();
			case FhirPackage.SPECIMEN_DEFINITION: return createSpecimenDefinition();
			case FhirPackage.SPECIMEN_DEFINITION_ADDITIVE: return createSpecimenDefinitionAdditive();
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER: return createSpecimenDefinitionContainer();
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING: return createSpecimenDefinitionHandling();
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED: return createSpecimenDefinitionTypeTested();
			case FhirPackage.SPECIMEN_FEATURE: return createSpecimenFeature();
			case FhirPackage.SPECIMEN_PROCESSING: return createSpecimenProcessing();
			case FhirPackage.SPECIMEN_STATUS: return createSpecimenStatus();
			case FhirPackage.STRAND_TYPE: return createStrandType();
			case FhirPackage.STRING: return createString();
			case FhirPackage.STRUCTURE_DEFINITION: return createStructureDefinition();
			case FhirPackage.STRUCTURE_DEFINITION_CONTEXT: return createStructureDefinitionContext();
			case FhirPackage.STRUCTURE_DEFINITION_DIFFERENTIAL: return createStructureDefinitionDifferential();
			case FhirPackage.STRUCTURE_DEFINITION_KIND: return createStructureDefinitionKind();
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING: return createStructureDefinitionMapping();
			case FhirPackage.STRUCTURE_DEFINITION_SNAPSHOT: return createStructureDefinitionSnapshot();
			case FhirPackage.STRUCTURE_MAP: return createStructureMap();
			case FhirPackage.STRUCTURE_MAP_CONST: return createStructureMapConst();
			case FhirPackage.STRUCTURE_MAP_DEPENDENT: return createStructureMapDependent();
			case FhirPackage.STRUCTURE_MAP_GROUP: return createStructureMapGroup();
			case FhirPackage.STRUCTURE_MAP_GROUP_TYPE_MODE: return createStructureMapGroupTypeMode();
			case FhirPackage.STRUCTURE_MAP_INPUT: return createStructureMapInput();
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE: return createStructureMapInputMode();
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE: return createStructureMapModelMode();
			case FhirPackage.STRUCTURE_MAP_PARAMETER: return createStructureMapParameter();
			case FhirPackage.STRUCTURE_MAP_RULE: return createStructureMapRule();
			case FhirPackage.STRUCTURE_MAP_SOURCE: return createStructureMapSource();
			case FhirPackage.STRUCTURE_MAP_SOURCE_LIST_MODE: return createStructureMapSourceListMode();
			case FhirPackage.STRUCTURE_MAP_STRUCTURE: return createStructureMapStructure();
			case FhirPackage.STRUCTURE_MAP_TARGET: return createStructureMapTarget();
			case FhirPackage.STRUCTURE_MAP_TARGET_LIST_MODE: return createStructureMapTargetListMode();
			case FhirPackage.STRUCTURE_MAP_TRANSFORM: return createStructureMapTransform();
			case FhirPackage.SUBMIT_DATA_UPDATE_TYPE: return createSubmitDataUpdateType();
			case FhirPackage.SUBSCRIPTION: return createSubscription();
			case FhirPackage.SUBSCRIPTION_FILTER_BY: return createSubscriptionFilterBy();
			case FhirPackage.SUBSCRIPTION_NOTIFICATION_TYPE: return createSubscriptionNotificationType();
			case FhirPackage.SUBSCRIPTION_PARAMETER: return createSubscriptionParameter();
			case FhirPackage.SUBSCRIPTION_PAYLOAD_CONTENT: return createSubscriptionPayloadContent();
			case FhirPackage.SUBSCRIPTION_STATUS: return createSubscriptionStatus();
			case FhirPackage.SUBSCRIPTION_STATUS_CODES: return createSubscriptionStatusCodes();
			case FhirPackage.SUBSCRIPTION_STATUS_NOTIFICATION_EVENT: return createSubscriptionStatusNotificationEvent();
			case FhirPackage.SUBSCRIPTION_TOPIC: return createSubscriptionTopic();
			case FhirPackage.SUBSCRIPTION_TOPIC_CAN_FILTER_BY: return createSubscriptionTopicCanFilterBy();
			case FhirPackage.SUBSCRIPTION_TOPIC_EVENT_TRIGGER: return createSubscriptionTopicEventTrigger();
			case FhirPackage.SUBSCRIPTION_TOPIC_NOTIFICATION_SHAPE: return createSubscriptionTopicNotificationShape();
			case FhirPackage.SUBSCRIPTION_TOPIC_QUERY_CRITERIA: return createSubscriptionTopicQueryCriteria();
			case FhirPackage.SUBSCRIPTION_TOPIC_RESOURCE_TRIGGER: return createSubscriptionTopicResourceTrigger();
			case FhirPackage.SUBSTANCE: return createSubstance();
			case FhirPackage.SUBSTANCE_DEFINITION: return createSubstanceDefinition();
			case FhirPackage.SUBSTANCE_DEFINITION_CHARACTERIZATION: return createSubstanceDefinitionCharacterization();
			case FhirPackage.SUBSTANCE_DEFINITION_CODE: return createSubstanceDefinitionCode();
			case FhirPackage.SUBSTANCE_DEFINITION_MOIETY: return createSubstanceDefinitionMoiety();
			case FhirPackage.SUBSTANCE_DEFINITION_MOLECULAR_WEIGHT: return createSubstanceDefinitionMolecularWeight();
			case FhirPackage.SUBSTANCE_DEFINITION_NAME: return createSubstanceDefinitionName();
			case FhirPackage.SUBSTANCE_DEFINITION_OFFICIAL: return createSubstanceDefinitionOfficial();
			case FhirPackage.SUBSTANCE_DEFINITION_PROPERTY: return createSubstanceDefinitionProperty();
			case FhirPackage.SUBSTANCE_DEFINITION_RELATIONSHIP: return createSubstanceDefinitionRelationship();
			case FhirPackage.SUBSTANCE_DEFINITION_REPRESENTATION: return createSubstanceDefinitionRepresentation();
			case FhirPackage.SUBSTANCE_DEFINITION_SOURCE_MATERIAL: return createSubstanceDefinitionSourceMaterial();
			case FhirPackage.SUBSTANCE_DEFINITION_STRUCTURE: return createSubstanceDefinitionStructure();
			case FhirPackage.SUBSTANCE_INGREDIENT: return createSubstanceIngredient();
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID: return createSubstanceNucleicAcid();
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE: return createSubstanceNucleicAcidLinkage();
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT: return createSubstanceNucleicAcidSubunit();
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUGAR: return createSubstanceNucleicAcidSugar();
			case FhirPackage.SUBSTANCE_POLYMER: return createSubstancePolymer();
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION: return createSubstancePolymerDegreeOfPolymerisation();
			case FhirPackage.SUBSTANCE_POLYMER_MONOMER_SET: return createSubstancePolymerMonomerSet();
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT: return createSubstancePolymerRepeat();
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT: return createSubstancePolymerRepeatUnit();
			case FhirPackage.SUBSTANCE_POLYMER_STARTING_MATERIAL: return createSubstancePolymerStartingMaterial();
			case FhirPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION: return createSubstancePolymerStructuralRepresentation();
			case FhirPackage.SUBSTANCE_PROTEIN: return createSubstanceProtein();
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT: return createSubstanceProteinSubunit();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION: return createSubstanceReferenceInformation();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE: return createSubstanceReferenceInformationGene();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE_ELEMENT: return createSubstanceReferenceInformationGeneElement();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET: return createSubstanceReferenceInformationTarget();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL: return createSubstanceSourceMaterial();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_AUTHOR: return createSubstanceSourceMaterialAuthor();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION: return createSubstanceSourceMaterialFractionDescription();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID: return createSubstanceSourceMaterialHybrid();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM: return createSubstanceSourceMaterialOrganism();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL: return createSubstanceSourceMaterialOrganismGeneral();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_PART_DESCRIPTION: return createSubstanceSourceMaterialPartDescription();
			case FhirPackage.SUPPLY_DELIVERY: return createSupplyDelivery();
			case FhirPackage.SUPPLY_DELIVERY_STATUS: return createSupplyDeliveryStatus();
			case FhirPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM: return createSupplyDeliverySuppliedItem();
			case FhirPackage.SUPPLY_REQUEST: return createSupplyRequest();
			case FhirPackage.SUPPLY_REQUEST_PARAMETER: return createSupplyRequestParameter();
			case FhirPackage.SUPPLY_REQUEST_STATUS: return createSupplyRequestStatus();
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION: return createSystemRestfulInteraction();
			case FhirPackage.TASK: return createTask();
			case FhirPackage.TASK_INPUT: return createTaskInput();
			case FhirPackage.TASK_INTENT: return createTaskIntent();
			case FhirPackage.TASK_OUTPUT: return createTaskOutput();
			case FhirPackage.TASK_PERFORMER: return createTaskPerformer();
			case FhirPackage.TASK_RESTRICTION: return createTaskRestriction();
			case FhirPackage.TASK_STATUS: return createTaskStatus();
			case FhirPackage.TERMINOLOGY_CAPABILITIES: return createTerminologyCapabilities();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_CLOSURE: return createTerminologyCapabilitiesClosure();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM: return createTerminologyCapabilitiesCodeSystem();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION: return createTerminologyCapabilitiesExpansion();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_FILTER: return createTerminologyCapabilitiesFilter();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_IMPLEMENTATION: return createTerminologyCapabilitiesImplementation();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_PARAMETER: return createTerminologyCapabilitiesParameter();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_SOFTWARE: return createTerminologyCapabilitiesSoftware();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_TRANSLATION: return createTerminologyCapabilitiesTranslation();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VALIDATE_CODE: return createTerminologyCapabilitiesValidateCode();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION: return createTerminologyCapabilitiesVersion();
			case FhirPackage.TEST_PLAN: return createTestPlan();
			case FhirPackage.TEST_PLAN_ASSERTION: return createTestPlanAssertion();
			case FhirPackage.TEST_PLAN_DEPENDENCY: return createTestPlanDependency();
			case FhirPackage.TEST_PLAN_DEPENDENCY1: return createTestPlanDependency1();
			case FhirPackage.TEST_PLAN_SCRIPT: return createTestPlanScript();
			case FhirPackage.TEST_PLAN_TEST_CASE: return createTestPlanTestCase();
			case FhirPackage.TEST_PLAN_TEST_DATA: return createTestPlanTestData();
			case FhirPackage.TEST_PLAN_TEST_RUN: return createTestPlanTestRun();
			case FhirPackage.TEST_REPORT: return createTestReport();
			case FhirPackage.TEST_REPORT_ACTION: return createTestReportAction();
			case FhirPackage.TEST_REPORT_ACTION1: return createTestReportAction1();
			case FhirPackage.TEST_REPORT_ACTION2: return createTestReportAction2();
			case FhirPackage.TEST_REPORT_ACTION_RESULT: return createTestReportActionResult();
			case FhirPackage.TEST_REPORT_ASSERT: return createTestReportAssert();
			case FhirPackage.TEST_REPORT_OPERATION: return createTestReportOperation();
			case FhirPackage.TEST_REPORT_PARTICIPANT: return createTestReportParticipant();
			case FhirPackage.TEST_REPORT_PARTICIPANT_TYPE: return createTestReportParticipantType();
			case FhirPackage.TEST_REPORT_REQUIREMENT: return createTestReportRequirement();
			case FhirPackage.TEST_REPORT_RESULT: return createTestReportResult();
			case FhirPackage.TEST_REPORT_SETUP: return createTestReportSetup();
			case FhirPackage.TEST_REPORT_STATUS: return createTestReportStatus();
			case FhirPackage.TEST_REPORT_TEARDOWN: return createTestReportTeardown();
			case FhirPackage.TEST_REPORT_TEST: return createTestReportTest();
			case FhirPackage.TEST_SCRIPT: return createTestScript();
			case FhirPackage.TEST_SCRIPT_ACTION: return createTestScriptAction();
			case FhirPackage.TEST_SCRIPT_ACTION1: return createTestScriptAction1();
			case FhirPackage.TEST_SCRIPT_ACTION2: return createTestScriptAction2();
			case FhirPackage.TEST_SCRIPT_ASSERT: return createTestScriptAssert();
			case FhirPackage.TEST_SCRIPT_CAPABILITY: return createTestScriptCapability();
			case FhirPackage.TEST_SCRIPT_DESTINATION: return createTestScriptDestination();
			case FhirPackage.TEST_SCRIPT_FIXTURE: return createTestScriptFixture();
			case FhirPackage.TEST_SCRIPT_LINK: return createTestScriptLink();
			case FhirPackage.TEST_SCRIPT_METADATA: return createTestScriptMetadata();
			case FhirPackage.TEST_SCRIPT_OPERATION: return createTestScriptOperation();
			case FhirPackage.TEST_SCRIPT_ORIGIN: return createTestScriptOrigin();
			case FhirPackage.TEST_SCRIPT_REQUEST_HEADER: return createTestScriptRequestHeader();
			case FhirPackage.TEST_SCRIPT_REQUEST_METHOD_CODE: return createTestScriptRequestMethodCode();
			case FhirPackage.TEST_SCRIPT_REQUIREMENT: return createTestScriptRequirement();
			case FhirPackage.TEST_SCRIPT_SCOPE: return createTestScriptScope();
			case FhirPackage.TEST_SCRIPT_SETUP: return createTestScriptSetup();
			case FhirPackage.TEST_SCRIPT_TEARDOWN: return createTestScriptTeardown();
			case FhirPackage.TEST_SCRIPT_TEST: return createTestScriptTest();
			case FhirPackage.TEST_SCRIPT_VARIABLE: return createTestScriptVariable();
			case FhirPackage.TIME: return createTime();
			case FhirPackage.TIMING: return createTiming();
			case FhirPackage.TIMING_REPEAT: return createTimingRepeat();
			case FhirPackage.TRANSPORT: return createTransport();
			case FhirPackage.TRANSPORT_INPUT: return createTransportInput();
			case FhirPackage.TRANSPORT_INTENT: return createTransportIntent();
			case FhirPackage.TRANSPORT_OUTPUT: return createTransportOutput();
			case FhirPackage.TRANSPORT_RESTRICTION: return createTransportRestriction();
			case FhirPackage.TRANSPORT_STATUS: return createTransportStatus();
			case FhirPackage.TRIGGER_DEFINITION: return createTriggerDefinition();
			case FhirPackage.TRIGGERED_BYTYPE: return createTriggeredBytype();
			case FhirPackage.TRIGGER_TYPE: return createTriggerType();
			case FhirPackage.TYPE_DERIVATION_RULE: return createTypeDerivationRule();
			case FhirPackage.TYPE_RESTFUL_INTERACTION: return createTypeRestfulInteraction();
			case FhirPackage.UDI_ENTRY_TYPE: return createUDIEntryType();
			case FhirPackage.UNITS_OF_TIME: return createUnitsOfTime();
			case FhirPackage.UNSIGNED_INT: return createUnsignedInt();
			case FhirPackage.URI: return createUri();
			case FhirPackage.URL: return createUrl();
			case FhirPackage.USAGE_CONTEXT: return createUsageContext();
			case FhirPackage.USE: return createUse();
			case FhirPackage.UUID: return createUuid();
			case FhirPackage.VALUE_SET: return createValueSet();
			case FhirPackage.VALUE_SET_COMPOSE: return createValueSetCompose();
			case FhirPackage.VALUE_SET_CONCEPT: return createValueSetConcept();
			case FhirPackage.VALUE_SET_CONTAINS: return createValueSetContains();
			case FhirPackage.VALUE_SET_DESIGNATION: return createValueSetDesignation();
			case FhirPackage.VALUE_SET_EXPANSION: return createValueSetExpansion();
			case FhirPackage.VALUE_SET_FILTER: return createValueSetFilter();
			case FhirPackage.VALUE_SET_INCLUDE: return createValueSetInclude();
			case FhirPackage.VALUE_SET_PARAMETER: return createValueSetParameter();
			case FhirPackage.VALUE_SET_PROPERTY: return createValueSetProperty();
			case FhirPackage.VALUE_SET_PROPERTY1: return createValueSetProperty1();
			case FhirPackage.VALUE_SET_SCOPE: return createValueSetScope();
			case FhirPackage.VALUE_SET_SUB_PROPERTY: return createValueSetSubProperty();
			case FhirPackage.VERIFICATION_RESULT: return createVerificationResult();
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION: return createVerificationResultAttestation();
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE: return createVerificationResultPrimarySource();
			case FhirPackage.VERIFICATION_RESULT_STATUS: return createVerificationResultStatus();
			case FhirPackage.VERIFICATION_RESULT_VALIDATOR: return createVerificationResultValidator();
			case FhirPackage.VERSION_INDEPENDENT_RESOURCE_TYPES_ALL: return createVersionIndependentResourceTypesAll();
			case FhirPackage.VIRTUAL_SERVICE_DETAIL: return createVirtualServiceDetail();
			case FhirPackage.VISION_BASE: return createVisionBase();
			case FhirPackage.VISION_EYES: return createVisionEyes();
			case FhirPackage.VISION_PRESCRIPTION: return createVisionPrescription();
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION: return createVisionPrescriptionLensSpecification();
			case FhirPackage.VISION_PRESCRIPTION_PRISM: return createVisionPrescriptionPrism();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FhirPackage.ACCOUNT_STATUS_ENUM:
				return createAccountStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.ACTION_CARDINALITY_BEHAVIOR_ENUM:
				return createActionCardinalityBehaviorEnumFromString(eDataType, initialValue);
			case FhirPackage.ACTION_CONDITION_KIND_ENUM:
				return createActionConditionKindEnumFromString(eDataType, initialValue);
			case FhirPackage.ACTION_GROUPING_BEHAVIOR_ENUM:
				return createActionGroupingBehaviorEnumFromString(eDataType, initialValue);
			case FhirPackage.ACTION_PARTICIPANT_TYPE_ENUM:
				return createActionParticipantTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.ACTION_PRECHECK_BEHAVIOR_ENUM:
				return createActionPrecheckBehaviorEnumFromString(eDataType, initialValue);
			case FhirPackage.ACTION_RELATIONSHIP_TYPE_ENUM:
				return createActionRelationshipTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.ACTION_REQUIRED_BEHAVIOR_ENUM:
				return createActionRequiredBehaviorEnumFromString(eDataType, initialValue);
			case FhirPackage.ACTION_SELECTION_BEHAVIOR_ENUM:
				return createActionSelectionBehaviorEnumFromString(eDataType, initialValue);
			case FhirPackage.ADDRESS_TYPE_ENUM:
				return createAddressTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.ADDRESS_USE_ENUM:
				return createAddressUseEnumFromString(eDataType, initialValue);
			case FhirPackage.ADMINISTRATIVE_GENDER_ENUM:
				return createAdministrativeGenderEnumFromString(eDataType, initialValue);
			case FhirPackage.ADVERSE_EVENT_ACTUALITY_ENUM:
				return createAdverseEventActualityEnumFromString(eDataType, initialValue);
			case FhirPackage.ADVERSE_EVENT_STATUS_ENUM:
				return createAdverseEventStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.AGE_UNITS_ENUM:
				return createAgeUnitsEnumFromString(eDataType, initialValue);
			case FhirPackage.AGGREGATION_MODE_ENUM:
				return createAggregationModeEnumFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_ENUM:
				return createAllergyIntoleranceCategoryEnumFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_ENUM:
				return createAllergyIntoleranceCriticalityEnumFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_ENUM:
				return createAllergyIntoleranceSeverityEnumFromString(eDataType, initialValue);
			case FhirPackage.ALL_RESOURCE_TYPES_ENUM:
				return createAllResourceTypesEnumFromString(eDataType, initialValue);
			case FhirPackage.APPOINTMENT_RESPONSE_STATUS_ENUM:
				return createAppointmentResponseStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.APPOINTMENT_STATUS_ENUM:
				return createAppointmentStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.ARTIFACT_ASSESSMENT_DISPOSITION_ENUM:
				return createArtifactAssessmentDispositionEnumFromString(eDataType, initialValue);
			case FhirPackage.ARTIFACT_ASSESSMENT_INFORMATION_TYPE_ENUM:
				return createArtifactAssessmentInformationTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.ARTIFACT_ASSESSMENT_WORKFLOW_STATUS_ENUM:
				return createArtifactAssessmentWorkflowStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_DIRECTION_TYPE_ENUM:
				return createAssertionDirectionTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_MANUAL_COMPLETION_TYPE_ENUM:
				return createAssertionManualCompletionTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_OPERATOR_TYPE_ENUM:
				return createAssertionOperatorTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_RESPONSE_TYPES_ENUM:
				return createAssertionResponseTypesEnumFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_ACTION_ENUM:
				return createAuditEventActionEnumFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_SEVERITY_ENUM:
				return createAuditEventSeverityEnumFromString(eDataType, initialValue);
			case FhirPackage.BINDING_STRENGTH_ENUM:
				return createBindingStrengthEnumFromString(eDataType, initialValue);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE_CODES_ENUM:
				return createBiologicallyDerivedProductDispenseCodesEnumFromString(eDataType, initialValue);
			case FhirPackage.BUNDLE_TYPE_ENUM:
				return createBundleTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.CAPABILITY_STATEMENT_KIND_ENUM:
				return createCapabilityStatementKindEnumFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_INTENT_ENUM:
				return createCarePlanIntentEnumFromString(eDataType, initialValue);
			case FhirPackage.CARE_TEAM_STATUS_ENUM:
				return createCareTeamStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.CHARACTERISTIC_COMBINATION_ENUM:
				return createCharacteristicCombinationEnumFromString(eDataType, initialValue);
			case FhirPackage.CHARGE_ITEM_STATUS_ENUM:
				return createChargeItemStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.CLAIM_PROCESSING_CODES_ENUM:
				return createClaimProcessingCodesEnumFromString(eDataType, initialValue);
			case FhirPackage.CLINICAL_USE_DEFINITION_TYPE_ENUM:
				return createClinicalUseDefinitionTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.CODE_SEARCH_SUPPORT_ENUM:
				return createCodeSearchSupportEnumFromString(eDataType, initialValue);
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE_ENUM:
				return createCodeSystemContentModeEnumFromString(eDataType, initialValue);
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING_ENUM:
				return createCodeSystemHierarchyMeaningEnumFromString(eDataType, initialValue);
			case FhirPackage.COMMON_LANGUAGES_ENUM:
				return createCommonLanguagesEnumFromString(eDataType, initialValue);
			case FhirPackage.COMPARTMENT_TYPE_ENUM:
				return createCompartmentTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.COMPOSITION_STATUS_ENUM:
				return createCompositionStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.CONCEPT_MAP_ATTRIBUTE_TYPE_ENUM:
				return createConceptMapAttributeTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.CONCEPT_MAP_GROUP_UNMAPPED_MODE_ENUM:
				return createConceptMapGroupUnmappedModeEnumFromString(eDataType, initialValue);
			case FhirPackage.CONCEPT_MAP_PROPERTY_TYPE_ENUM:
				return createConceptMapPropertyTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.CONCEPT_MAP_RELATIONSHIP_ENUM:
				return createConceptMapRelationshipEnumFromString(eDataType, initialValue);
			case FhirPackage.CONCRETE_FHIR_TYPES_ENUM:
				return createConcreteFHIRTypesEnumFromString(eDataType, initialValue);
			case FhirPackage.CONDITIONAL_DELETE_STATUS_ENUM:
				return createConditionalDeleteStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.CONDITIONAL_READ_STATUS_ENUM:
				return createConditionalReadStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.CONDITION_PRECONDITION_TYPE_ENUM:
				return createConditionPreconditionTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.CONDITION_QUESTIONNAIRE_PURPOSE_ENUM:
				return createConditionQuestionnairePurposeEnumFromString(eDataType, initialValue);
			case FhirPackage.CONFORMANCE_EXPECTATION_ENUM:
				return createConformanceExpectationEnumFromString(eDataType, initialValue);
			case FhirPackage.CONSENT_DATA_MEANING_ENUM:
				return createConsentDataMeaningEnumFromString(eDataType, initialValue);
			case FhirPackage.CONSENT_PROVISION_TYPE_ENUM:
				return createConsentProvisionTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.CONSENT_STATE_ENUM:
				return createConsentStateEnumFromString(eDataType, initialValue);
			case FhirPackage.CONSTRAINT_SEVERITY_ENUM:
				return createConstraintSeverityEnumFromString(eDataType, initialValue);
			case FhirPackage.CONTACT_POINT_SYSTEM_ENUM:
				return createContactPointSystemEnumFromString(eDataType, initialValue);
			case FhirPackage.CONTACT_POINT_USE_ENUM:
				return createContactPointUseEnumFromString(eDataType, initialValue);
			case FhirPackage.CONTRACT_RESOURCE_PUBLICATION_STATUS_CODES_ENUM:
				return createContractResourcePublicationStatusCodesEnumFromString(eDataType, initialValue);
			case FhirPackage.CONTRACT_RESOURCE_STATUS_CODES_ENUM:
				return createContractResourceStatusCodesEnumFromString(eDataType, initialValue);
			case FhirPackage.CONTRIBUTOR_TYPE_ENUM:
				return createContributorTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.CRITERIA_NOT_EXISTS_BEHAVIOR_ENUM:
				return createCriteriaNotExistsBehaviorEnumFromString(eDataType, initialValue);
			case FhirPackage.DEFINITION_RESOURCE_TYPES_ENUM:
				return createDefinitionResourceTypesEnumFromString(eDataType, initialValue);
			case FhirPackage.DETECTED_ISSUE_SEVERITY_ENUM:
				return createDetectedIssueSeverityEnumFromString(eDataType, initialValue);
			case FhirPackage.DETECTED_ISSUE_STATUS_ENUM:
				return createDetectedIssueStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_CORRECTIVE_ACTION_SCOPE_ENUM:
				return createDeviceCorrectiveActionScopeEnumFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_DEFINITION_REGULATORY_IDENTIFIER_TYPE_ENUM:
				return createDeviceDefinitionRegulatoryIdentifierTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_DISPENSE_STATUS_CODES_ENUM:
				return createDeviceDispenseStatusCodesEnumFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_ENUM:
				return createDeviceMetricCalibrationStateEnumFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_ENUM:
				return createDeviceMetricCalibrationTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CATEGORY_ENUM:
				return createDeviceMetricCategoryEnumFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_ENUM:
				return createDeviceMetricOperationalStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_NAME_TYPE_ENUM:
				return createDeviceNameTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_PRODUCTION_IDENTIFIER_IN_UDI_ENUM:
				return createDeviceProductionIdentifierInUDIEnumFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_USAGE_STATUS_ENUM:
				return createDeviceUsageStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_ENUM:
				return createDiagnosticReportStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.DISCRIMINATOR_TYPE_ENUM:
				return createDiscriminatorTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_MODE_ENUM:
				return createDocumentModeEnumFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_ENUM:
				return createDocumentReferenceStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.ELIGIBILITY_OUTCOME_ENUM:
				return createEligibilityOutcomeEnumFromString(eDataType, initialValue);
			case FhirPackage.ELIGIBILITY_REQUEST_PURPOSE_ENUM:
				return createEligibilityRequestPurposeEnumFromString(eDataType, initialValue);
			case FhirPackage.ELIGIBILITY_RESPONSE_PURPOSE_ENUM:
				return createEligibilityResponsePurposeEnumFromString(eDataType, initialValue);
			case FhirPackage.ENABLE_WHEN_BEHAVIOR_ENUM:
				return createEnableWhenBehaviorEnumFromString(eDataType, initialValue);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_ENUM:
				return createEncounterLocationStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.ENCOUNTER_STATUS_ENUM:
				return createEncounterStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.ENDPOINT_STATUS_ENUM:
				return createEndpointStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.ENROLLMENT_OUTCOME_ENUM:
				return createEnrollmentOutcomeEnumFromString(eDataType, initialValue);
			case FhirPackage.EPISODE_OF_CARE_STATUS_ENUM:
				return createEpisodeOfCareStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.EVENT_CAPABILITY_MODE_ENUM:
				return createEventCapabilityModeEnumFromString(eDataType, initialValue);
			case FhirPackage.EVENT_RESOURCE_TYPES_ENUM:
				return createEventResourceTypesEnumFromString(eDataType, initialValue);
			case FhirPackage.EVENT_STATUS_ENUM:
				return createEventStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.EVENT_TIMING_ENUM:
				return createEventTimingEnumFromString(eDataType, initialValue);
			case FhirPackage.EVIDENCE_VARIABLE_HANDLING_ENUM:
				return createEvidenceVariableHandlingEnumFromString(eDataType, initialValue);
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR_TYPE_ENUM:
				return createExampleScenarioActorTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS_ENUM:
				return createExplanationOfBenefitStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.EXTENSION_CONTEXT_TYPE_ENUM:
				return createExtensionContextTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.FAMILY_HISTORY_STATUS_ENUM:
				return createFamilyHistoryStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.FHIR_DEVICE_STATUS_ENUM:
				return createFHIRDeviceStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.FHIR_PATH_TYPES_ENUM:
				return createFHIRPathTypesEnumFromString(eDataType, initialValue);
			case FhirPackage.FHIR_SUBSTANCE_STATUS_ENUM:
				return createFHIRSubstanceStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.FHIR_TYPES_ENUM:
				return createFHIRTypesEnumFromString(eDataType, initialValue);
			case FhirPackage.FHIR_VERSION_ENUM:
				return createFHIRVersionEnumFromString(eDataType, initialValue);
			case FhirPackage.FILTER_OPERATOR_ENUM:
				return createFilterOperatorEnumFromString(eDataType, initialValue);
			case FhirPackage.FINANCIAL_RESOURCE_STATUS_CODES_ENUM:
				return createFinancialResourceStatusCodesEnumFromString(eDataType, initialValue);
			case FhirPackage.FLAG_STATUS_ENUM:
				return createFlagStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.FORMULARY_ITEM_STATUS_CODES_ENUM:
				return createFormularyItemStatusCodesEnumFromString(eDataType, initialValue);
			case FhirPackage.GENOMIC_STUDY_STATUS_ENUM:
				return createGenomicStudyStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.GOAL_LIFECYCLE_STATUS_ENUM:
				return createGoalLifecycleStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.GRAPH_COMPARTMENT_RULE_ENUM:
				return createGraphCompartmentRuleEnumFromString(eDataType, initialValue);
			case FhirPackage.GRAPH_COMPARTMENT_USE_ENUM:
				return createGraphCompartmentUseEnumFromString(eDataType, initialValue);
			case FhirPackage.GROUP_MEMBERSHIP_BASIS_ENUM:
				return createGroupMembershipBasisEnumFromString(eDataType, initialValue);
			case FhirPackage.GROUP_TYPE_ENUM:
				return createGroupTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.GUIDANCE_RESPONSE_STATUS_ENUM:
				return createGuidanceResponseStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.GUIDE_PAGE_GENERATION_ENUM:
				return createGuidePageGenerationEnumFromString(eDataType, initialValue);
			case FhirPackage.HTTP_VERB_ENUM:
				return createHTTPVerbEnumFromString(eDataType, initialValue);
			case FhirPackage.IDENTIFIER_USE_ENUM:
				return createIdentifierUseEnumFromString(eDataType, initialValue);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_ENUM:
				return createIdentityAssuranceLevelEnumFromString(eDataType, initialValue);
			case FhirPackage.IMAGING_SELECTION_DGRAPHIC_TYPE_ENUM:
				return createImagingSelectionDGraphicTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.IMAGING_SELECTION_STATUS_ENUM:
				return createImagingSelectionStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.IMAGING_STUDY_STATUS_ENUM:
				return createImagingStudyStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.IMMUNIZATION_EVALUATION_STATUS_CODES_ENUM:
				return createImmunizationEvaluationStatusCodesEnumFromString(eDataType, initialValue);
			case FhirPackage.IMMUNIZATION_STATUS_CODES_ENUM:
				return createImmunizationStatusCodesEnumFromString(eDataType, initialValue);
			case FhirPackage.INGREDIENT_MANUFACTURER_ROLE_ENUM:
				return createIngredientManufacturerRoleEnumFromString(eDataType, initialValue);
			case FhirPackage.INTERACTION_TRIGGER_ENUM:
				return createInteractionTriggerEnumFromString(eDataType, initialValue);
			case FhirPackage.INVENTORY_COUNT_TYPE_ENUM:
				return createInventoryCountTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.INVENTORY_ITEM_STATUS_CODES_ENUM:
				return createInventoryItemStatusCodesEnumFromString(eDataType, initialValue);
			case FhirPackage.INVENTORY_REPORT_STATUS_ENUM:
				return createInventoryReportStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.INVOICE_STATUS_ENUM:
				return createInvoiceStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.ISSUE_SEVERITY_ENUM:
				return createIssueSeverityEnumFromString(eDataType, initialValue);
			case FhirPackage.ISSUE_TYPE_ENUM:
				return createIssueTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.JURISDICTION_VALUE_SET_ENUM:
				return createJurisdictionValueSetEnumFromString(eDataType, initialValue);
			case FhirPackage.KIND_ENUM:
				return createKindEnumFromString(eDataType, initialValue);
			case FhirPackage.LINKAGE_TYPE_ENUM:
				return createLinkageTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.LINK_RELATION_TYPES_ENUM:
				return createLinkRelationTypesEnumFromString(eDataType, initialValue);
			case FhirPackage.LINK_TYPE_ENUM:
				return createLinkTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.LIST_MODE_ENUM:
				return createListModeEnumFromString(eDataType, initialValue);
			case FhirPackage.LIST_STATUS_ENUM:
				return createListStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.LOCATION_MODE_ENUM:
				return createLocationModeEnumFromString(eDataType, initialValue);
			case FhirPackage.LOCATION_STATUS_ENUM:
				return createLocationStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.MEASURE_REPORT_STATUS_ENUM:
				return createMeasureReportStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.MEASURE_REPORT_TYPE_ENUM:
				return createMeasureReportTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS_CODES_ENUM:
				return createMedicationAdministrationStatusCodesEnumFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_DISPENSE_STATUS_CODES_ENUM:
				return createMedicationDispenseStatusCodesEnumFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_KNOWLEDGE_STATUS_CODES_ENUM:
				return createMedicationKnowledgeStatusCodesEnumFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_REQUEST_INTENT_ENUM:
				return createMedicationRequestIntentEnumFromString(eDataType, initialValue);
			case FhirPackage.MEDICATIONREQUEST_STATUS_ENUM:
				return createMedicationrequestStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_STATEMENT_STATUS_CODES_ENUM:
				return createMedicationStatementStatusCodesEnumFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_STATUS_CODES_ENUM:
				return createMedicationStatusCodesEnumFromString(eDataType, initialValue);
			case FhirPackage.MESSAGEHEADER_RESPONSE_REQUEST_ENUM:
				return createMessageheaderResponseRequestEnumFromString(eDataType, initialValue);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_ENUM:
				return createMessageSignificanceCategoryEnumFromString(eDataType, initialValue);
			case FhirPackage.NAME_USE_ENUM:
				return createNameUseEnumFromString(eDataType, initialValue);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_ENUM:
				return createNamingSystemIdentifierTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.NAMING_SYSTEM_TYPE_ENUM:
				return createNamingSystemTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.NARRATIVE_STATUS_ENUM:
				return createNarrativeStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.NOTE_TYPE_ENUM:
				return createNoteTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.NUTRITION_PRODUCT_STATUS_ENUM:
				return createNutritionProductStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_DATA_TYPE_ENUM:
				return createObservationDataTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_RANGE_CATEGORY_ENUM:
				return createObservationRangeCategoryEnumFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_STATUS_ENUM:
				return createObservationStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.OPERATION_KIND_ENUM:
				return createOperationKindEnumFromString(eDataType, initialValue);
			case FhirPackage.OPERATION_OUTCOME_CODES_ENUM:
				return createOperationOutcomeCodesEnumFromString(eDataType, initialValue);
			case FhirPackage.OPERATION_PARAMETER_SCOPE_ENUM:
				return createOperationParameterScopeEnumFromString(eDataType, initialValue);
			case FhirPackage.OPERATION_PARAMETER_USE_ENUM:
				return createOperationParameterUseEnumFromString(eDataType, initialValue);
			case FhirPackage.ORIENTATION_TYPE_ENUM:
				return createOrientationTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.PARTICIPANT_RESOURCE_TYPES_ENUM:
				return createParticipantResourceTypesEnumFromString(eDataType, initialValue);
			case FhirPackage.PARTICIPATION_STATUS_ENUM:
				return createParticipationStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.PAYMENT_OUTCOME_ENUM:
				return createPaymentOutcomeEnumFromString(eDataType, initialValue);
			case FhirPackage.PERMISSION_RULE_COMBINING_ENUM:
				return createPermissionRuleCombiningEnumFromString(eDataType, initialValue);
			case FhirPackage.PERMISSION_STATUS_ENUM:
				return createPermissionStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.PROPERTY_REPRESENTATION_ENUM:
				return createPropertyRepresentationEnumFromString(eDataType, initialValue);
			case FhirPackage.PROPERTY_TYPE_ENUM:
				return createPropertyTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_ENUM:
				return createProvenanceEntityRoleEnumFromString(eDataType, initialValue);
			case FhirPackage.PUBLICATION_STATUS_ENUM:
				return createPublicationStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.QUANTITY_COMPARATOR_ENUM:
				return createQuantityComparatorEnumFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_ANSWER_CONSTRAINT_ENUM:
				return createQuestionnaireAnswerConstraintEnumFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_DISABLED_DISPLAY_ENUM:
				return createQuestionnaireItemDisabledDisplayEnumFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_OPERATOR_ENUM:
				return createQuestionnaireItemOperatorEnumFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE_ENUM:
				return createQuestionnaireItemTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS_ENUM:
				return createQuestionnaireResponseStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.REFERENCE_HANDLING_POLICY_ENUM:
				return createReferenceHandlingPolicyEnumFromString(eDataType, initialValue);
			case FhirPackage.REFERENCE_VERSION_RULES_ENUM:
				return createReferenceVersionRulesEnumFromString(eDataType, initialValue);
			case FhirPackage.RELATED_ARTIFACT_TYPE_ENUM:
				return createRelatedArtifactTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.RELATED_ARTIFACT_TYPE_EXPANDED_ENUM:
				return createRelatedArtifactTypeExpandedEnumFromString(eDataType, initialValue);
			case FhirPackage.REMITTANCE_OUTCOME_ENUM:
				return createRemittanceOutcomeEnumFromString(eDataType, initialValue);
			case FhirPackage.REPORT_RELATIONSHIP_TYPE_ENUM:
				return createReportRelationshipTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.REQUEST_INTENT_ENUM:
				return createRequestIntentEnumFromString(eDataType, initialValue);
			case FhirPackage.REQUEST_PRIORITY_ENUM:
				return createRequestPriorityEnumFromString(eDataType, initialValue);
			case FhirPackage.REQUEST_RESOURCE_TYPES_ENUM:
				return createRequestResourceTypesEnumFromString(eDataType, initialValue);
			case FhirPackage.REQUEST_STATUS_ENUM:
				return createRequestStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.RESOURCE_TYPE_ENUM:
				return createResourceTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.RESOURCE_VERSION_POLICY_ENUM:
				return createResourceVersionPolicyEnumFromString(eDataType, initialValue);
			case FhirPackage.RESPONSE_TYPE_ENUM:
				return createResponseTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.RESTFUL_CAPABILITY_MODE_ENUM:
				return createRestfulCapabilityModeEnumFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_COMPARATOR_ENUM:
				return createSearchComparatorEnumFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_ENTRY_MODE_ENUM:
				return createSearchEntryModeEnumFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_MODIFIER_CODE_ENUM:
				return createSearchModifierCodeEnumFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_PARAM_TYPE_ENUM:
				return createSearchParamTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_PROCESSING_MODE_TYPE_ENUM:
				return createSearchProcessingModeTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.SEQUENCE_TYPE_ENUM:
				return createSequenceTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.SLICING_RULES_ENUM:
				return createSlicingRulesEnumFromString(eDataType, initialValue);
			case FhirPackage.SLOT_STATUS_ENUM:
				return createSlotStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.SORT_DIRECTION_ENUM:
				return createSortDirectionEnumFromString(eDataType, initialValue);
			case FhirPackage.SPDX_LICENSE_ENUM:
				return createSPDXLicenseEnumFromString(eDataType, initialValue);
			case FhirPackage.SPECIMEN_COMBINED_ENUM:
				return createSpecimenCombinedEnumFromString(eDataType, initialValue);
			case FhirPackage.SPECIMEN_CONTAINED_PREFERENCE_ENUM:
				return createSpecimenContainedPreferenceEnumFromString(eDataType, initialValue);
			case FhirPackage.SPECIMEN_STATUS_ENUM:
				return createSpecimenStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.STRAND_TYPE_ENUM:
				return createStrandTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_DEFINITION_KIND_ENUM:
				return createStructureDefinitionKindEnumFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_GROUP_TYPE_MODE_ENUM:
				return createStructureMapGroupTypeModeEnumFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE_ENUM:
				return createStructureMapInputModeEnumFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE_ENUM:
				return createStructureMapModelModeEnumFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_SOURCE_LIST_MODE_ENUM:
				return createStructureMapSourceListModeEnumFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_TARGET_LIST_MODE_ENUM:
				return createStructureMapTargetListModeEnumFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_TRANSFORM_ENUM:
				return createStructureMapTransformEnumFromString(eDataType, initialValue);
			case FhirPackage.SUBMIT_DATA_UPDATE_TYPE_ENUM:
				return createSubmitDataUpdateTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.SUBSCRIPTION_NOTIFICATION_TYPE_ENUM:
				return createSubscriptionNotificationTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.SUBSCRIPTION_PAYLOAD_CONTENT_ENUM:
				return createSubscriptionPayloadContentEnumFromString(eDataType, initialValue);
			case FhirPackage.SUBSCRIPTION_STATUS_CODES_ENUM:
				return createSubscriptionStatusCodesEnumFromString(eDataType, initialValue);
			case FhirPackage.SUPPLY_DELIVERY_STATUS_ENUM:
				return createSupplyDeliveryStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.SUPPLY_REQUEST_STATUS_ENUM:
				return createSupplyRequestStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_ENUM:
				return createSystemRestfulInteractionEnumFromString(eDataType, initialValue);
			case FhirPackage.TASK_INTENT_ENUM:
				return createTaskIntentEnumFromString(eDataType, initialValue);
			case FhirPackage.TASK_STATUS_ENUM:
				return createTaskStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.TEST_REPORT_ACTION_RESULT_ENUM:
				return createTestReportActionResultEnumFromString(eDataType, initialValue);
			case FhirPackage.TEST_REPORT_PARTICIPANT_TYPE_ENUM:
				return createTestReportParticipantTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.TEST_REPORT_RESULT_ENUM:
				return createTestReportResultEnumFromString(eDataType, initialValue);
			case FhirPackage.TEST_REPORT_STATUS_ENUM:
				return createTestReportStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.TEST_SCRIPT_REQUEST_METHOD_CODE_ENUM:
				return createTestScriptRequestMethodCodeEnumFromString(eDataType, initialValue);
			case FhirPackage.TRANSPORT_INTENT_ENUM:
				return createTransportIntentEnumFromString(eDataType, initialValue);
			case FhirPackage.TRANSPORT_STATUS_ENUM:
				return createTransportStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.TRIGGERED_BYTYPE_ENUM:
				return createTriggeredBytypeEnumFromString(eDataType, initialValue);
			case FhirPackage.TRIGGER_TYPE_ENUM:
				return createTriggerTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.TYPE_DERIVATION_RULE_ENUM:
				return createTypeDerivationRuleEnumFromString(eDataType, initialValue);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_ENUM:
				return createTypeRestfulInteractionEnumFromString(eDataType, initialValue);
			case FhirPackage.UDI_ENTRY_TYPE_ENUM:
				return createUDIEntryTypeEnumFromString(eDataType, initialValue);
			case FhirPackage.UNITS_OF_TIME_ENUM:
				return createUnitsOfTimeEnumFromString(eDataType, initialValue);
			case FhirPackage.USE_ENUM:
				return createUseEnumFromString(eDataType, initialValue);
			case FhirPackage.VERIFICATION_RESULT_STATUS_ENUM:
				return createVerificationResultStatusEnumFromString(eDataType, initialValue);
			case FhirPackage.VERSION_INDEPENDENT_RESOURCE_TYPES_ALL_ENUM:
				return createVersionIndependentResourceTypesAllEnumFromString(eDataType, initialValue);
			case FhirPackage.VISION_BASE_ENUM:
				return createVisionBaseEnumFromString(eDataType, initialValue);
			case FhirPackage.VISION_EYES_ENUM:
				return createVisionEyesEnumFromString(eDataType, initialValue);
			case FhirPackage.ACCOUNT_STATUS_ENUM_OBJECT:
				return createAccountStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_CARDINALITY_BEHAVIOR_ENUM_OBJECT:
				return createActionCardinalityBehaviorEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_CONDITION_KIND_ENUM_OBJECT:
				return createActionConditionKindEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_GROUPING_BEHAVIOR_ENUM_OBJECT:
				return createActionGroupingBehaviorEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_PARTICIPANT_TYPE_ENUM_OBJECT:
				return createActionParticipantTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_PRECHECK_BEHAVIOR_ENUM_OBJECT:
				return createActionPrecheckBehaviorEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_RELATIONSHIP_TYPE_ENUM_OBJECT:
				return createActionRelationshipTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_REQUIRED_BEHAVIOR_ENUM_OBJECT:
				return createActionRequiredBehaviorEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_SELECTION_BEHAVIOR_ENUM_OBJECT:
				return createActionSelectionBehaviorEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ADDRESS_TYPE_ENUM_OBJECT:
				return createAddressTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ADDRESS_USE_ENUM_OBJECT:
				return createAddressUseEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ADMINISTRATIVE_GENDER_ENUM_OBJECT:
				return createAdministrativeGenderEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ADVERSE_EVENT_ACTUALITY_ENUM_OBJECT:
				return createAdverseEventActualityEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ADVERSE_EVENT_STATUS_ENUM_OBJECT:
				return createAdverseEventStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.AGE_UNITS_ENUM_OBJECT:
				return createAgeUnitsEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.AGGREGATION_MODE_ENUM_OBJECT:
				return createAggregationModeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_ENUM_OBJECT:
				return createAllergyIntoleranceCategoryEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_ENUM_OBJECT:
				return createAllergyIntoleranceCriticalityEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_ENUM_OBJECT:
				return createAllergyIntoleranceSeverityEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ALL_RESOURCE_TYPES_ENUM_OBJECT:
				return createAllResourceTypesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.APPOINTMENT_RESPONSE_STATUS_ENUM_OBJECT:
				return createAppointmentResponseStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.APPOINTMENT_STATUS_ENUM_OBJECT:
				return createAppointmentStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ARTIFACT_ASSESSMENT_DISPOSITION_ENUM_OBJECT:
				return createArtifactAssessmentDispositionEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ARTIFACT_ASSESSMENT_INFORMATION_TYPE_ENUM_OBJECT:
				return createArtifactAssessmentInformationTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ARTIFACT_ASSESSMENT_WORKFLOW_STATUS_ENUM_OBJECT:
				return createArtifactAssessmentWorkflowStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_DIRECTION_TYPE_ENUM_OBJECT:
				return createAssertionDirectionTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_MANUAL_COMPLETION_TYPE_ENUM_OBJECT:
				return createAssertionManualCompletionTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_OPERATOR_TYPE_ENUM_OBJECT:
				return createAssertionOperatorTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_RESPONSE_TYPES_ENUM_OBJECT:
				return createAssertionResponseTypesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_ACTION_ENUM_OBJECT:
				return createAuditEventActionEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_SEVERITY_ENUM_OBJECT:
				return createAuditEventSeverityEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.BASE64_BINARY_PRIMITIVE:
				return createBase64BinaryPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.BINDING_STRENGTH_ENUM_OBJECT:
				return createBindingStrengthEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE_CODES_ENUM_OBJECT:
				return createBiologicallyDerivedProductDispenseCodesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.BOOLEAN_PRIMITIVE:
				return createBooleanPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.BOOLEAN_PRIMITIVE_OBJECT:
				return createBooleanPrimitiveObjectFromString(eDataType, initialValue);
			case FhirPackage.BUNDLE_TYPE_ENUM_OBJECT:
				return createBundleTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CANONICAL_PRIMITIVE:
				return createCanonicalPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.CAPABILITY_STATEMENT_KIND_ENUM_OBJECT:
				return createCapabilityStatementKindEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_INTENT_ENUM_OBJECT:
				return createCarePlanIntentEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CARE_TEAM_STATUS_ENUM_OBJECT:
				return createCareTeamStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CHARACTERISTIC_COMBINATION_ENUM_OBJECT:
				return createCharacteristicCombinationEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CHARGE_ITEM_STATUS_ENUM_OBJECT:
				return createChargeItemStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CLAIM_PROCESSING_CODES_ENUM_OBJECT:
				return createClaimProcessingCodesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CLINICAL_USE_DEFINITION_TYPE_ENUM_OBJECT:
				return createClinicalUseDefinitionTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CODE_PRIMITIVE:
				return createCodePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.CODE_SEARCH_SUPPORT_ENUM_OBJECT:
				return createCodeSearchSupportEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE_ENUM_OBJECT:
				return createCodeSystemContentModeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING_ENUM_OBJECT:
				return createCodeSystemHierarchyMeaningEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.COLOR_CODES_OR_RGB_ENUM:
				return createColorCodesOrRGBEnumFromString(eDataType, initialValue);
			case FhirPackage.COMMON_LANGUAGES_ENUM_OBJECT:
				return createCommonLanguagesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.COMPARTMENT_TYPE_ENUM_OBJECT:
				return createCompartmentTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.COMPOSITION_STATUS_ENUM_OBJECT:
				return createCompositionStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CONCEPT_MAP_ATTRIBUTE_TYPE_ENUM_OBJECT:
				return createConceptMapAttributeTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CONCEPT_MAP_GROUP_UNMAPPED_MODE_ENUM_OBJECT:
				return createConceptMapGroupUnmappedModeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CONCEPT_MAP_PROPERTY_TYPE_ENUM_OBJECT:
				return createConceptMapPropertyTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CONCEPT_MAP_RELATIONSHIP_ENUM_OBJECT:
				return createConceptMapRelationshipEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CONCRETE_FHIR_TYPES_ENUM_OBJECT:
				return createConcreteFHIRTypesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CONDITIONAL_DELETE_STATUS_ENUM_OBJECT:
				return createConditionalDeleteStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CONDITIONAL_READ_STATUS_ENUM_OBJECT:
				return createConditionalReadStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CONDITION_PRECONDITION_TYPE_ENUM_OBJECT:
				return createConditionPreconditionTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CONDITION_QUESTIONNAIRE_PURPOSE_ENUM_OBJECT:
				return createConditionQuestionnairePurposeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CONFORMANCE_EXPECTATION_ENUM_OBJECT:
				return createConformanceExpectationEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CONSENT_DATA_MEANING_ENUM_OBJECT:
				return createConsentDataMeaningEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CONSENT_PROVISION_TYPE_ENUM_OBJECT:
				return createConsentProvisionTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CONSENT_STATE_ENUM_OBJECT:
				return createConsentStateEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CONSTRAINT_SEVERITY_ENUM_OBJECT:
				return createConstraintSeverityEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CONTACT_POINT_SYSTEM_ENUM_OBJECT:
				return createContactPointSystemEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CONTACT_POINT_USE_ENUM_OBJECT:
				return createContactPointUseEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CONTRACT_RESOURCE_PUBLICATION_STATUS_CODES_ENUM_OBJECT:
				return createContractResourcePublicationStatusCodesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CONTRACT_RESOURCE_STATUS_CODES_ENUM_OBJECT:
				return createContractResourceStatusCodesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CONTRIBUTOR_TYPE_ENUM_OBJECT:
				return createContributorTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.CRITERIA_NOT_EXISTS_BEHAVIOR_ENUM_OBJECT:
				return createCriteriaNotExistsBehaviorEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.DATE_PRIMITIVE:
				return createDatePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.DATE_PRIMITIVE_BASE:
				return createDatePrimitiveBaseFromString(eDataType, initialValue);
			case FhirPackage.DATE_TIME_PRIMITIVE:
				return createDateTimePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.DATE_TIME_PRIMITIVE_BASE:
				return createDateTimePrimitiveBaseFromString(eDataType, initialValue);
			case FhirPackage.DECIMAL_PRIMITIVE:
				return createDecimalPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.DEFINITION_RESOURCE_TYPES_ENUM_OBJECT:
				return createDefinitionResourceTypesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.DETECTED_ISSUE_SEVERITY_ENUM_OBJECT:
				return createDetectedIssueSeverityEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.DETECTED_ISSUE_STATUS_ENUM_OBJECT:
				return createDetectedIssueStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_CORRECTIVE_ACTION_SCOPE_ENUM_OBJECT:
				return createDeviceCorrectiveActionScopeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_DEFINITION_REGULATORY_IDENTIFIER_TYPE_ENUM_OBJECT:
				return createDeviceDefinitionRegulatoryIdentifierTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_DISPENSE_STATUS_CODES_ENUM_OBJECT:
				return createDeviceDispenseStatusCodesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_ENUM_OBJECT:
				return createDeviceMetricCalibrationStateEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_ENUM_OBJECT:
				return createDeviceMetricCalibrationTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CATEGORY_ENUM_OBJECT:
				return createDeviceMetricCategoryEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_ENUM_OBJECT:
				return createDeviceMetricOperationalStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_NAME_TYPE_ENUM_OBJECT:
				return createDeviceNameTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_PRODUCTION_IDENTIFIER_IN_UDI_ENUM_OBJECT:
				return createDeviceProductionIdentifierInUDIEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_USAGE_STATUS_ENUM_OBJECT:
				return createDeviceUsageStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_ENUM_OBJECT:
				return createDiagnosticReportStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.DISCRIMINATOR_TYPE_ENUM_OBJECT:
				return createDiscriminatorTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_MODE_ENUM_OBJECT:
				return createDocumentModeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_ENUM_OBJECT:
				return createDocumentReferenceStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ELIGIBILITY_OUTCOME_ENUM_OBJECT:
				return createEligibilityOutcomeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ELIGIBILITY_REQUEST_PURPOSE_ENUM_OBJECT:
				return createEligibilityRequestPurposeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ELIGIBILITY_RESPONSE_PURPOSE_ENUM_OBJECT:
				return createEligibilityResponsePurposeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ENABLE_WHEN_BEHAVIOR_ENUM_OBJECT:
				return createEnableWhenBehaviorEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_ENUM_OBJECT:
				return createEncounterLocationStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ENCOUNTER_STATUS_ENUM_OBJECT:
				return createEncounterStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ENDPOINT_STATUS_ENUM_OBJECT:
				return createEndpointStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ENROLLMENT_OUTCOME_ENUM_OBJECT:
				return createEnrollmentOutcomeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.EPISODE_OF_CARE_STATUS_ENUM_OBJECT:
				return createEpisodeOfCareStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.EVENT_CAPABILITY_MODE_ENUM_OBJECT:
				return createEventCapabilityModeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.EVENT_RESOURCE_TYPES_ENUM_OBJECT:
				return createEventResourceTypesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.EVENT_STATUS_ENUM_OBJECT:
				return createEventStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.EVENT_TIMING_ENUM_OBJECT:
				return createEventTimingEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.EVIDENCE_VARIABLE_HANDLING_ENUM_OBJECT:
				return createEvidenceVariableHandlingEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR_TYPE_ENUM_OBJECT:
				return createExampleScenarioActorTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS_ENUM_OBJECT:
				return createExplanationOfBenefitStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.EXTENSION_CONTEXT_TYPE_ENUM_OBJECT:
				return createExtensionContextTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.FAMILY_HISTORY_STATUS_ENUM_OBJECT:
				return createFamilyHistoryStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.FHIR_DEVICE_STATUS_ENUM_OBJECT:
				return createFHIRDeviceStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.FHIR_PATH_TYPES_ENUM_OBJECT:
				return createFHIRPathTypesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.FHIR_SUBSTANCE_STATUS_ENUM_OBJECT:
				return createFHIRSubstanceStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.FHIR_TYPES_ENUM_OBJECT:
				return createFHIRTypesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.FHIR_VERSION_ENUM_OBJECT:
				return createFHIRVersionEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.FILTER_OPERATOR_ENUM_OBJECT:
				return createFilterOperatorEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.FINANCIAL_RESOURCE_STATUS_CODES_ENUM_OBJECT:
				return createFinancialResourceStatusCodesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.FLAG_STATUS_ENUM_OBJECT:
				return createFlagStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.FORMULARY_ITEM_STATUS_CODES_ENUM_OBJECT:
				return createFormularyItemStatusCodesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.GENOMIC_STUDY_STATUS_ENUM_OBJECT:
				return createGenomicStudyStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.GOAL_LIFECYCLE_STATUS_ENUM_OBJECT:
				return createGoalLifecycleStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.GRAPH_COMPARTMENT_RULE_ENUM_OBJECT:
				return createGraphCompartmentRuleEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.GRAPH_COMPARTMENT_USE_ENUM_OBJECT:
				return createGraphCompartmentUseEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.GROUP_MEMBERSHIP_BASIS_ENUM_OBJECT:
				return createGroupMembershipBasisEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.GROUP_TYPE_ENUM_OBJECT:
				return createGroupTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.GUIDANCE_RESPONSE_STATUS_ENUM_OBJECT:
				return createGuidanceResponseStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.GUIDE_PAGE_GENERATION_ENUM_OBJECT:
				return createGuidePageGenerationEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.HTTP_VERB_ENUM_OBJECT:
				return createHTTPVerbEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.IDENTIFIER_USE_ENUM_OBJECT:
				return createIdentifierUseEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_ENUM_OBJECT:
				return createIdentityAssuranceLevelEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ID_PRIMITIVE:
				return createIdPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.IMAGING_SELECTION_DGRAPHIC_TYPE_ENUM_OBJECT:
				return createImagingSelectionDGraphicTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.IMAGING_SELECTION_STATUS_ENUM_OBJECT:
				return createImagingSelectionStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.IMAGING_STUDY_STATUS_ENUM_OBJECT:
				return createImagingStudyStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.IMMUNIZATION_EVALUATION_STATUS_CODES_ENUM_OBJECT:
				return createImmunizationEvaluationStatusCodesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.IMMUNIZATION_STATUS_CODES_ENUM_OBJECT:
				return createImmunizationStatusCodesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.INGREDIENT_MANUFACTURER_ROLE_ENUM_OBJECT:
				return createIngredientManufacturerRoleEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.INSTANT_PRIMITIVE:
				return createInstantPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.INTEGER64_PRIMITIVE:
				return createInteger64PrimitiveFromString(eDataType, initialValue);
			case FhirPackage.INTEGER64_PRIMITIVE_OBJECT:
				return createInteger64PrimitiveObjectFromString(eDataType, initialValue);
			case FhirPackage.INTEGER_PRIMITIVE:
				return createIntegerPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.INTEGER_PRIMITIVE_OBJECT:
				return createIntegerPrimitiveObjectFromString(eDataType, initialValue);
			case FhirPackage.INTERACTION_TRIGGER_ENUM_OBJECT:
				return createInteractionTriggerEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.INVENTORY_COUNT_TYPE_ENUM_OBJECT:
				return createInventoryCountTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.INVENTORY_ITEM_STATUS_CODES_ENUM_OBJECT:
				return createInventoryItemStatusCodesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.INVENTORY_REPORT_STATUS_ENUM_OBJECT:
				return createInventoryReportStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.INVOICE_STATUS_ENUM_OBJECT:
				return createInvoiceStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ISSUE_SEVERITY_ENUM_OBJECT:
				return createIssueSeverityEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ISSUE_TYPE_ENUM_OBJECT:
				return createIssueTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.JURISDICTION_VALUE_SET_ENUM_OBJECT:
				return createJurisdictionValueSetEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.KIND_ENUM_OBJECT:
				return createKindEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.LINKAGE_TYPE_ENUM_OBJECT:
				return createLinkageTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.LINK_RELATION_TYPES_ENUM_OBJECT:
				return createLinkRelationTypesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.LINK_TYPE_ENUM_OBJECT:
				return createLinkTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.LIST_MODE_ENUM_OBJECT:
				return createListModeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.LIST_STATUS_ENUM_OBJECT:
				return createListStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.LOCATION_MODE_ENUM_OBJECT:
				return createLocationModeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.LOCATION_STATUS_ENUM_OBJECT:
				return createLocationStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.MARKDOWN_PRIMITIVE:
				return createMarkdownPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.MEASURE_REPORT_STATUS_ENUM_OBJECT:
				return createMeasureReportStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.MEASURE_REPORT_TYPE_ENUM_OBJECT:
				return createMeasureReportTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS_CODES_ENUM_OBJECT:
				return createMedicationAdministrationStatusCodesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_DISPENSE_STATUS_CODES_ENUM_OBJECT:
				return createMedicationDispenseStatusCodesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_KNOWLEDGE_STATUS_CODES_ENUM_OBJECT:
				return createMedicationKnowledgeStatusCodesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_REQUEST_INTENT_ENUM_OBJECT:
				return createMedicationRequestIntentEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATIONREQUEST_STATUS_ENUM_OBJECT:
				return createMedicationrequestStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_STATEMENT_STATUS_CODES_ENUM_OBJECT:
				return createMedicationStatementStatusCodesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_STATUS_CODES_ENUM_OBJECT:
				return createMedicationStatusCodesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.MESSAGEHEADER_RESPONSE_REQUEST_ENUM_OBJECT:
				return createMessageheaderResponseRequestEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_ENUM_OBJECT:
				return createMessageSignificanceCategoryEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.NAME_USE_ENUM_OBJECT:
				return createNameUseEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_ENUM_OBJECT:
				return createNamingSystemIdentifierTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.NAMING_SYSTEM_TYPE_ENUM_OBJECT:
				return createNamingSystemTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.NARRATIVE_STATUS_ENUM_OBJECT:
				return createNarrativeStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.NOTE_TYPE_ENUM_OBJECT:
				return createNoteTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.NUTRITION_PRODUCT_STATUS_ENUM_OBJECT:
				return createNutritionProductStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_DATA_TYPE_ENUM_OBJECT:
				return createObservationDataTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_RANGE_CATEGORY_ENUM_OBJECT:
				return createObservationRangeCategoryEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_STATUS_ENUM_OBJECT:
				return createObservationStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.OID_PRIMITIVE:
				return createOidPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.OPERATION_KIND_ENUM_OBJECT:
				return createOperationKindEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.OPERATION_OUTCOME_CODES_ENUM_OBJECT:
				return createOperationOutcomeCodesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.OPERATION_PARAMETER_SCOPE_ENUM_OBJECT:
				return createOperationParameterScopeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.OPERATION_PARAMETER_USE_ENUM_OBJECT:
				return createOperationParameterUseEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.ORIENTATION_TYPE_ENUM_OBJECT:
				return createOrientationTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.PARTICIPANT_RESOURCE_TYPES_ENUM_OBJECT:
				return createParticipantResourceTypesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.PARTICIPATION_STATUS_ENUM_OBJECT:
				return createParticipationStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.PAYMENT_OUTCOME_ENUM_OBJECT:
				return createPaymentOutcomeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.PERMISSION_RULE_COMBINING_ENUM_OBJECT:
				return createPermissionRuleCombiningEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.PERMISSION_STATUS_ENUM_OBJECT:
				return createPermissionStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.POSITIVE_INT_PRIMITIVE:
				return createPositiveIntPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.PROPERTY_REPRESENTATION_ENUM_OBJECT:
				return createPropertyRepresentationEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.PROPERTY_TYPE_ENUM_OBJECT:
				return createPropertyTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_ENUM_OBJECT:
				return createProvenanceEntityRoleEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.PUBLICATION_STATUS_ENUM_OBJECT:
				return createPublicationStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.QUANTITY_COMPARATOR_ENUM_OBJECT:
				return createQuantityComparatorEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_ANSWER_CONSTRAINT_ENUM_OBJECT:
				return createQuestionnaireAnswerConstraintEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_DISABLED_DISPLAY_ENUM_OBJECT:
				return createQuestionnaireItemDisabledDisplayEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_OPERATOR_ENUM_OBJECT:
				return createQuestionnaireItemOperatorEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE_ENUM_OBJECT:
				return createQuestionnaireItemTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS_ENUM_OBJECT:
				return createQuestionnaireResponseStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.REFERENCE_HANDLING_POLICY_ENUM_OBJECT:
				return createReferenceHandlingPolicyEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.REFERENCE_VERSION_RULES_ENUM_OBJECT:
				return createReferenceVersionRulesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.RELATED_ARTIFACT_TYPE_ENUM_OBJECT:
				return createRelatedArtifactTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.RELATED_ARTIFACT_TYPE_EXPANDED_ENUM_OBJECT:
				return createRelatedArtifactTypeExpandedEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.REMITTANCE_OUTCOME_ENUM_OBJECT:
				return createRemittanceOutcomeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.REPORT_RELATIONSHIP_TYPE_ENUM_OBJECT:
				return createReportRelationshipTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.REQUEST_INTENT_ENUM_OBJECT:
				return createRequestIntentEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.REQUEST_PRIORITY_ENUM_OBJECT:
				return createRequestPriorityEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.REQUEST_RESOURCE_TYPES_ENUM_OBJECT:
				return createRequestResourceTypesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.REQUEST_STATUS_ENUM_OBJECT:
				return createRequestStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.RESOURCE_TYPE_ENUM_OBJECT:
				return createResourceTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.RESOURCE_VERSION_POLICY_ENUM_OBJECT:
				return createResourceVersionPolicyEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.RESPONSE_TYPE_ENUM_OBJECT:
				return createResponseTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.RESTFUL_CAPABILITY_MODE_ENUM_OBJECT:
				return createRestfulCapabilityModeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.SAMPLED_DATA_DATA_TYPE_PRIMITIVE:
				return createSampledDataDataTypePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_COMPARATOR_ENUM_OBJECT:
				return createSearchComparatorEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_ENTRY_MODE_ENUM_OBJECT:
				return createSearchEntryModeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_MODIFIER_CODE_ENUM_OBJECT:
				return createSearchModifierCodeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_PARAM_TYPE_ENUM_OBJECT:
				return createSearchParamTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_PROCESSING_MODE_TYPE_ENUM_OBJECT:
				return createSearchProcessingModeTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.SEQUENCE_TYPE_ENUM_OBJECT:
				return createSequenceTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.SLICING_RULES_ENUM_OBJECT:
				return createSlicingRulesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.SLOT_STATUS_ENUM_OBJECT:
				return createSlotStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.SORT_DIRECTION_ENUM_OBJECT:
				return createSortDirectionEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.SPDX_LICENSE_ENUM_OBJECT:
				return createSPDXLicenseEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.SPECIMEN_COMBINED_ENUM_OBJECT:
				return createSpecimenCombinedEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.SPECIMEN_CONTAINED_PREFERENCE_ENUM_OBJECT:
				return createSpecimenContainedPreferenceEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.SPECIMEN_STATUS_ENUM_OBJECT:
				return createSpecimenStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.STRAND_TYPE_ENUM_OBJECT:
				return createStrandTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.STRING_PRIMITIVE:
				return createStringPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_DEFINITION_KIND_ENUM_OBJECT:
				return createStructureDefinitionKindEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_GROUP_TYPE_MODE_ENUM_OBJECT:
				return createStructureMapGroupTypeModeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE_ENUM_OBJECT:
				return createStructureMapInputModeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE_ENUM_OBJECT:
				return createStructureMapModelModeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_SOURCE_LIST_MODE_ENUM_OBJECT:
				return createStructureMapSourceListModeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_TARGET_LIST_MODE_ENUM_OBJECT:
				return createStructureMapTargetListModeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_TRANSFORM_ENUM_OBJECT:
				return createStructureMapTransformEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.SUBMIT_DATA_UPDATE_TYPE_ENUM_OBJECT:
				return createSubmitDataUpdateTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.SUBSCRIPTION_NOTIFICATION_TYPE_ENUM_OBJECT:
				return createSubscriptionNotificationTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.SUBSCRIPTION_PAYLOAD_CONTENT_ENUM_OBJECT:
				return createSubscriptionPayloadContentEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.SUBSCRIPTION_STATUS_CODES_ENUM_OBJECT:
				return createSubscriptionStatusCodesEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.SUPPLY_DELIVERY_STATUS_ENUM_OBJECT:
				return createSupplyDeliveryStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.SUPPLY_REQUEST_STATUS_ENUM_OBJECT:
				return createSupplyRequestStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_ENUM_OBJECT:
				return createSystemRestfulInteractionEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.TASK_INTENT_ENUM_OBJECT:
				return createTaskIntentEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.TASK_STATUS_ENUM_OBJECT:
				return createTaskStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.TEST_REPORT_ACTION_RESULT_ENUM_OBJECT:
				return createTestReportActionResultEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.TEST_REPORT_PARTICIPANT_TYPE_ENUM_OBJECT:
				return createTestReportParticipantTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.TEST_REPORT_RESULT_ENUM_OBJECT:
				return createTestReportResultEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.TEST_REPORT_STATUS_ENUM_OBJECT:
				return createTestReportStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.TEST_SCRIPT_REQUEST_METHOD_CODE_ENUM_OBJECT:
				return createTestScriptRequestMethodCodeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.TIME_PRIMITIVE:
				return createTimePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.TRANSPORT_INTENT_ENUM_OBJECT:
				return createTransportIntentEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.TRANSPORT_STATUS_ENUM_OBJECT:
				return createTransportStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.TRIGGERED_BYTYPE_ENUM_OBJECT:
				return createTriggeredBytypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.TRIGGER_TYPE_ENUM_OBJECT:
				return createTriggerTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.TYPE_DERIVATION_RULE_ENUM_OBJECT:
				return createTypeDerivationRuleEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_ENUM_OBJECT:
				return createTypeRestfulInteractionEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.UDI_ENTRY_TYPE_ENUM_OBJECT:
				return createUDIEntryTypeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.UNITS_OF_TIME_ENUM_OBJECT:
				return createUnitsOfTimeEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.UNSIGNED_INT_PRIMITIVE:
				return createUnsignedIntPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.URI_PRIMITIVE:
				return createUriPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.URL_PRIMITIVE:
				return createUrlPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.USE_ENUM_OBJECT:
				return createUseEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.UUID_PRIMITIVE:
				return createUuidPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.VERIFICATION_RESULT_STATUS_ENUM_OBJECT:
				return createVerificationResultStatusEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.VERSION_INDEPENDENT_RESOURCE_TYPES_ALL_ENUM_OBJECT:
				return createVersionIndependentResourceTypesAllEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.VISION_BASE_ENUM_OBJECT:
				return createVisionBaseEnumObjectFromString(eDataType, initialValue);
			case FhirPackage.VISION_EYES_ENUM_OBJECT:
				return createVisionEyesEnumObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FhirPackage.ACCOUNT_STATUS_ENUM:
				return convertAccountStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.ACTION_CARDINALITY_BEHAVIOR_ENUM:
				return convertActionCardinalityBehaviorEnumToString(eDataType, instanceValue);
			case FhirPackage.ACTION_CONDITION_KIND_ENUM:
				return convertActionConditionKindEnumToString(eDataType, instanceValue);
			case FhirPackage.ACTION_GROUPING_BEHAVIOR_ENUM:
				return convertActionGroupingBehaviorEnumToString(eDataType, instanceValue);
			case FhirPackage.ACTION_PARTICIPANT_TYPE_ENUM:
				return convertActionParticipantTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.ACTION_PRECHECK_BEHAVIOR_ENUM:
				return convertActionPrecheckBehaviorEnumToString(eDataType, instanceValue);
			case FhirPackage.ACTION_RELATIONSHIP_TYPE_ENUM:
				return convertActionRelationshipTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.ACTION_REQUIRED_BEHAVIOR_ENUM:
				return convertActionRequiredBehaviorEnumToString(eDataType, instanceValue);
			case FhirPackage.ACTION_SELECTION_BEHAVIOR_ENUM:
				return convertActionSelectionBehaviorEnumToString(eDataType, instanceValue);
			case FhirPackage.ADDRESS_TYPE_ENUM:
				return convertAddressTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.ADDRESS_USE_ENUM:
				return convertAddressUseEnumToString(eDataType, instanceValue);
			case FhirPackage.ADMINISTRATIVE_GENDER_ENUM:
				return convertAdministrativeGenderEnumToString(eDataType, instanceValue);
			case FhirPackage.ADVERSE_EVENT_ACTUALITY_ENUM:
				return convertAdverseEventActualityEnumToString(eDataType, instanceValue);
			case FhirPackage.ADVERSE_EVENT_STATUS_ENUM:
				return convertAdverseEventStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.AGE_UNITS_ENUM:
				return convertAgeUnitsEnumToString(eDataType, instanceValue);
			case FhirPackage.AGGREGATION_MODE_ENUM:
				return convertAggregationModeEnumToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_ENUM:
				return convertAllergyIntoleranceCategoryEnumToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_ENUM:
				return convertAllergyIntoleranceCriticalityEnumToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_ENUM:
				return convertAllergyIntoleranceSeverityEnumToString(eDataType, instanceValue);
			case FhirPackage.ALL_RESOURCE_TYPES_ENUM:
				return convertAllResourceTypesEnumToString(eDataType, instanceValue);
			case FhirPackage.APPOINTMENT_RESPONSE_STATUS_ENUM:
				return convertAppointmentResponseStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.APPOINTMENT_STATUS_ENUM:
				return convertAppointmentStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.ARTIFACT_ASSESSMENT_DISPOSITION_ENUM:
				return convertArtifactAssessmentDispositionEnumToString(eDataType, instanceValue);
			case FhirPackage.ARTIFACT_ASSESSMENT_INFORMATION_TYPE_ENUM:
				return convertArtifactAssessmentInformationTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.ARTIFACT_ASSESSMENT_WORKFLOW_STATUS_ENUM:
				return convertArtifactAssessmentWorkflowStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_DIRECTION_TYPE_ENUM:
				return convertAssertionDirectionTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_MANUAL_COMPLETION_TYPE_ENUM:
				return convertAssertionManualCompletionTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_OPERATOR_TYPE_ENUM:
				return convertAssertionOperatorTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_RESPONSE_TYPES_ENUM:
				return convertAssertionResponseTypesEnumToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_ACTION_ENUM:
				return convertAuditEventActionEnumToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_SEVERITY_ENUM:
				return convertAuditEventSeverityEnumToString(eDataType, instanceValue);
			case FhirPackage.BINDING_STRENGTH_ENUM:
				return convertBindingStrengthEnumToString(eDataType, instanceValue);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE_CODES_ENUM:
				return convertBiologicallyDerivedProductDispenseCodesEnumToString(eDataType, instanceValue);
			case FhirPackage.BUNDLE_TYPE_ENUM:
				return convertBundleTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.CAPABILITY_STATEMENT_KIND_ENUM:
				return convertCapabilityStatementKindEnumToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_INTENT_ENUM:
				return convertCarePlanIntentEnumToString(eDataType, instanceValue);
			case FhirPackage.CARE_TEAM_STATUS_ENUM:
				return convertCareTeamStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.CHARACTERISTIC_COMBINATION_ENUM:
				return convertCharacteristicCombinationEnumToString(eDataType, instanceValue);
			case FhirPackage.CHARGE_ITEM_STATUS_ENUM:
				return convertChargeItemStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.CLAIM_PROCESSING_CODES_ENUM:
				return convertClaimProcessingCodesEnumToString(eDataType, instanceValue);
			case FhirPackage.CLINICAL_USE_DEFINITION_TYPE_ENUM:
				return convertClinicalUseDefinitionTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.CODE_SEARCH_SUPPORT_ENUM:
				return convertCodeSearchSupportEnumToString(eDataType, instanceValue);
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE_ENUM:
				return convertCodeSystemContentModeEnumToString(eDataType, instanceValue);
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING_ENUM:
				return convertCodeSystemHierarchyMeaningEnumToString(eDataType, instanceValue);
			case FhirPackage.COMMON_LANGUAGES_ENUM:
				return convertCommonLanguagesEnumToString(eDataType, instanceValue);
			case FhirPackage.COMPARTMENT_TYPE_ENUM:
				return convertCompartmentTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.COMPOSITION_STATUS_ENUM:
				return convertCompositionStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.CONCEPT_MAP_ATTRIBUTE_TYPE_ENUM:
				return convertConceptMapAttributeTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.CONCEPT_MAP_GROUP_UNMAPPED_MODE_ENUM:
				return convertConceptMapGroupUnmappedModeEnumToString(eDataType, instanceValue);
			case FhirPackage.CONCEPT_MAP_PROPERTY_TYPE_ENUM:
				return convertConceptMapPropertyTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.CONCEPT_MAP_RELATIONSHIP_ENUM:
				return convertConceptMapRelationshipEnumToString(eDataType, instanceValue);
			case FhirPackage.CONCRETE_FHIR_TYPES_ENUM:
				return convertConcreteFHIRTypesEnumToString(eDataType, instanceValue);
			case FhirPackage.CONDITIONAL_DELETE_STATUS_ENUM:
				return convertConditionalDeleteStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.CONDITIONAL_READ_STATUS_ENUM:
				return convertConditionalReadStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.CONDITION_PRECONDITION_TYPE_ENUM:
				return convertConditionPreconditionTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.CONDITION_QUESTIONNAIRE_PURPOSE_ENUM:
				return convertConditionQuestionnairePurposeEnumToString(eDataType, instanceValue);
			case FhirPackage.CONFORMANCE_EXPECTATION_ENUM:
				return convertConformanceExpectationEnumToString(eDataType, instanceValue);
			case FhirPackage.CONSENT_DATA_MEANING_ENUM:
				return convertConsentDataMeaningEnumToString(eDataType, instanceValue);
			case FhirPackage.CONSENT_PROVISION_TYPE_ENUM:
				return convertConsentProvisionTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.CONSENT_STATE_ENUM:
				return convertConsentStateEnumToString(eDataType, instanceValue);
			case FhirPackage.CONSTRAINT_SEVERITY_ENUM:
				return convertConstraintSeverityEnumToString(eDataType, instanceValue);
			case FhirPackage.CONTACT_POINT_SYSTEM_ENUM:
				return convertContactPointSystemEnumToString(eDataType, instanceValue);
			case FhirPackage.CONTACT_POINT_USE_ENUM:
				return convertContactPointUseEnumToString(eDataType, instanceValue);
			case FhirPackage.CONTRACT_RESOURCE_PUBLICATION_STATUS_CODES_ENUM:
				return convertContractResourcePublicationStatusCodesEnumToString(eDataType, instanceValue);
			case FhirPackage.CONTRACT_RESOURCE_STATUS_CODES_ENUM:
				return convertContractResourceStatusCodesEnumToString(eDataType, instanceValue);
			case FhirPackage.CONTRIBUTOR_TYPE_ENUM:
				return convertContributorTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.CRITERIA_NOT_EXISTS_BEHAVIOR_ENUM:
				return convertCriteriaNotExistsBehaviorEnumToString(eDataType, instanceValue);
			case FhirPackage.DEFINITION_RESOURCE_TYPES_ENUM:
				return convertDefinitionResourceTypesEnumToString(eDataType, instanceValue);
			case FhirPackage.DETECTED_ISSUE_SEVERITY_ENUM:
				return convertDetectedIssueSeverityEnumToString(eDataType, instanceValue);
			case FhirPackage.DETECTED_ISSUE_STATUS_ENUM:
				return convertDetectedIssueStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_CORRECTIVE_ACTION_SCOPE_ENUM:
				return convertDeviceCorrectiveActionScopeEnumToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_DEFINITION_REGULATORY_IDENTIFIER_TYPE_ENUM:
				return convertDeviceDefinitionRegulatoryIdentifierTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_DISPENSE_STATUS_CODES_ENUM:
				return convertDeviceDispenseStatusCodesEnumToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_ENUM:
				return convertDeviceMetricCalibrationStateEnumToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_ENUM:
				return convertDeviceMetricCalibrationTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CATEGORY_ENUM:
				return convertDeviceMetricCategoryEnumToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_ENUM:
				return convertDeviceMetricOperationalStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_NAME_TYPE_ENUM:
				return convertDeviceNameTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_PRODUCTION_IDENTIFIER_IN_UDI_ENUM:
				return convertDeviceProductionIdentifierInUDIEnumToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_USAGE_STATUS_ENUM:
				return convertDeviceUsageStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_ENUM:
				return convertDiagnosticReportStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.DISCRIMINATOR_TYPE_ENUM:
				return convertDiscriminatorTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_MODE_ENUM:
				return convertDocumentModeEnumToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_ENUM:
				return convertDocumentReferenceStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.ELIGIBILITY_OUTCOME_ENUM:
				return convertEligibilityOutcomeEnumToString(eDataType, instanceValue);
			case FhirPackage.ELIGIBILITY_REQUEST_PURPOSE_ENUM:
				return convertEligibilityRequestPurposeEnumToString(eDataType, instanceValue);
			case FhirPackage.ELIGIBILITY_RESPONSE_PURPOSE_ENUM:
				return convertEligibilityResponsePurposeEnumToString(eDataType, instanceValue);
			case FhirPackage.ENABLE_WHEN_BEHAVIOR_ENUM:
				return convertEnableWhenBehaviorEnumToString(eDataType, instanceValue);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_ENUM:
				return convertEncounterLocationStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.ENCOUNTER_STATUS_ENUM:
				return convertEncounterStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.ENDPOINT_STATUS_ENUM:
				return convertEndpointStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.ENROLLMENT_OUTCOME_ENUM:
				return convertEnrollmentOutcomeEnumToString(eDataType, instanceValue);
			case FhirPackage.EPISODE_OF_CARE_STATUS_ENUM:
				return convertEpisodeOfCareStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.EVENT_CAPABILITY_MODE_ENUM:
				return convertEventCapabilityModeEnumToString(eDataType, instanceValue);
			case FhirPackage.EVENT_RESOURCE_TYPES_ENUM:
				return convertEventResourceTypesEnumToString(eDataType, instanceValue);
			case FhirPackage.EVENT_STATUS_ENUM:
				return convertEventStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.EVENT_TIMING_ENUM:
				return convertEventTimingEnumToString(eDataType, instanceValue);
			case FhirPackage.EVIDENCE_VARIABLE_HANDLING_ENUM:
				return convertEvidenceVariableHandlingEnumToString(eDataType, instanceValue);
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR_TYPE_ENUM:
				return convertExampleScenarioActorTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS_ENUM:
				return convertExplanationOfBenefitStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.EXTENSION_CONTEXT_TYPE_ENUM:
				return convertExtensionContextTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.FAMILY_HISTORY_STATUS_ENUM:
				return convertFamilyHistoryStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.FHIR_DEVICE_STATUS_ENUM:
				return convertFHIRDeviceStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.FHIR_PATH_TYPES_ENUM:
				return convertFHIRPathTypesEnumToString(eDataType, instanceValue);
			case FhirPackage.FHIR_SUBSTANCE_STATUS_ENUM:
				return convertFHIRSubstanceStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.FHIR_TYPES_ENUM:
				return convertFHIRTypesEnumToString(eDataType, instanceValue);
			case FhirPackage.FHIR_VERSION_ENUM:
				return convertFHIRVersionEnumToString(eDataType, instanceValue);
			case FhirPackage.FILTER_OPERATOR_ENUM:
				return convertFilterOperatorEnumToString(eDataType, instanceValue);
			case FhirPackage.FINANCIAL_RESOURCE_STATUS_CODES_ENUM:
				return convertFinancialResourceStatusCodesEnumToString(eDataType, instanceValue);
			case FhirPackage.FLAG_STATUS_ENUM:
				return convertFlagStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.FORMULARY_ITEM_STATUS_CODES_ENUM:
				return convertFormularyItemStatusCodesEnumToString(eDataType, instanceValue);
			case FhirPackage.GENOMIC_STUDY_STATUS_ENUM:
				return convertGenomicStudyStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.GOAL_LIFECYCLE_STATUS_ENUM:
				return convertGoalLifecycleStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.GRAPH_COMPARTMENT_RULE_ENUM:
				return convertGraphCompartmentRuleEnumToString(eDataType, instanceValue);
			case FhirPackage.GRAPH_COMPARTMENT_USE_ENUM:
				return convertGraphCompartmentUseEnumToString(eDataType, instanceValue);
			case FhirPackage.GROUP_MEMBERSHIP_BASIS_ENUM:
				return convertGroupMembershipBasisEnumToString(eDataType, instanceValue);
			case FhirPackage.GROUP_TYPE_ENUM:
				return convertGroupTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.GUIDANCE_RESPONSE_STATUS_ENUM:
				return convertGuidanceResponseStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.GUIDE_PAGE_GENERATION_ENUM:
				return convertGuidePageGenerationEnumToString(eDataType, instanceValue);
			case FhirPackage.HTTP_VERB_ENUM:
				return convertHTTPVerbEnumToString(eDataType, instanceValue);
			case FhirPackage.IDENTIFIER_USE_ENUM:
				return convertIdentifierUseEnumToString(eDataType, instanceValue);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_ENUM:
				return convertIdentityAssuranceLevelEnumToString(eDataType, instanceValue);
			case FhirPackage.IMAGING_SELECTION_DGRAPHIC_TYPE_ENUM:
				return convertImagingSelectionDGraphicTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.IMAGING_SELECTION_STATUS_ENUM:
				return convertImagingSelectionStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.IMAGING_STUDY_STATUS_ENUM:
				return convertImagingStudyStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.IMMUNIZATION_EVALUATION_STATUS_CODES_ENUM:
				return convertImmunizationEvaluationStatusCodesEnumToString(eDataType, instanceValue);
			case FhirPackage.IMMUNIZATION_STATUS_CODES_ENUM:
				return convertImmunizationStatusCodesEnumToString(eDataType, instanceValue);
			case FhirPackage.INGREDIENT_MANUFACTURER_ROLE_ENUM:
				return convertIngredientManufacturerRoleEnumToString(eDataType, instanceValue);
			case FhirPackage.INTERACTION_TRIGGER_ENUM:
				return convertInteractionTriggerEnumToString(eDataType, instanceValue);
			case FhirPackage.INVENTORY_COUNT_TYPE_ENUM:
				return convertInventoryCountTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.INVENTORY_ITEM_STATUS_CODES_ENUM:
				return convertInventoryItemStatusCodesEnumToString(eDataType, instanceValue);
			case FhirPackage.INVENTORY_REPORT_STATUS_ENUM:
				return convertInventoryReportStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.INVOICE_STATUS_ENUM:
				return convertInvoiceStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.ISSUE_SEVERITY_ENUM:
				return convertIssueSeverityEnumToString(eDataType, instanceValue);
			case FhirPackage.ISSUE_TYPE_ENUM:
				return convertIssueTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.JURISDICTION_VALUE_SET_ENUM:
				return convertJurisdictionValueSetEnumToString(eDataType, instanceValue);
			case FhirPackage.KIND_ENUM:
				return convertKindEnumToString(eDataType, instanceValue);
			case FhirPackage.LINKAGE_TYPE_ENUM:
				return convertLinkageTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.LINK_RELATION_TYPES_ENUM:
				return convertLinkRelationTypesEnumToString(eDataType, instanceValue);
			case FhirPackage.LINK_TYPE_ENUM:
				return convertLinkTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.LIST_MODE_ENUM:
				return convertListModeEnumToString(eDataType, instanceValue);
			case FhirPackage.LIST_STATUS_ENUM:
				return convertListStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.LOCATION_MODE_ENUM:
				return convertLocationModeEnumToString(eDataType, instanceValue);
			case FhirPackage.LOCATION_STATUS_ENUM:
				return convertLocationStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.MEASURE_REPORT_STATUS_ENUM:
				return convertMeasureReportStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.MEASURE_REPORT_TYPE_ENUM:
				return convertMeasureReportTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS_CODES_ENUM:
				return convertMedicationAdministrationStatusCodesEnumToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_DISPENSE_STATUS_CODES_ENUM:
				return convertMedicationDispenseStatusCodesEnumToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_KNOWLEDGE_STATUS_CODES_ENUM:
				return convertMedicationKnowledgeStatusCodesEnumToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_REQUEST_INTENT_ENUM:
				return convertMedicationRequestIntentEnumToString(eDataType, instanceValue);
			case FhirPackage.MEDICATIONREQUEST_STATUS_ENUM:
				return convertMedicationrequestStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_STATEMENT_STATUS_CODES_ENUM:
				return convertMedicationStatementStatusCodesEnumToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_STATUS_CODES_ENUM:
				return convertMedicationStatusCodesEnumToString(eDataType, instanceValue);
			case FhirPackage.MESSAGEHEADER_RESPONSE_REQUEST_ENUM:
				return convertMessageheaderResponseRequestEnumToString(eDataType, instanceValue);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_ENUM:
				return convertMessageSignificanceCategoryEnumToString(eDataType, instanceValue);
			case FhirPackage.NAME_USE_ENUM:
				return convertNameUseEnumToString(eDataType, instanceValue);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_ENUM:
				return convertNamingSystemIdentifierTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.NAMING_SYSTEM_TYPE_ENUM:
				return convertNamingSystemTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.NARRATIVE_STATUS_ENUM:
				return convertNarrativeStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.NOTE_TYPE_ENUM:
				return convertNoteTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.NUTRITION_PRODUCT_STATUS_ENUM:
				return convertNutritionProductStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_DATA_TYPE_ENUM:
				return convertObservationDataTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_RANGE_CATEGORY_ENUM:
				return convertObservationRangeCategoryEnumToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_STATUS_ENUM:
				return convertObservationStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.OPERATION_KIND_ENUM:
				return convertOperationKindEnumToString(eDataType, instanceValue);
			case FhirPackage.OPERATION_OUTCOME_CODES_ENUM:
				return convertOperationOutcomeCodesEnumToString(eDataType, instanceValue);
			case FhirPackage.OPERATION_PARAMETER_SCOPE_ENUM:
				return convertOperationParameterScopeEnumToString(eDataType, instanceValue);
			case FhirPackage.OPERATION_PARAMETER_USE_ENUM:
				return convertOperationParameterUseEnumToString(eDataType, instanceValue);
			case FhirPackage.ORIENTATION_TYPE_ENUM:
				return convertOrientationTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.PARTICIPANT_RESOURCE_TYPES_ENUM:
				return convertParticipantResourceTypesEnumToString(eDataType, instanceValue);
			case FhirPackage.PARTICIPATION_STATUS_ENUM:
				return convertParticipationStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.PAYMENT_OUTCOME_ENUM:
				return convertPaymentOutcomeEnumToString(eDataType, instanceValue);
			case FhirPackage.PERMISSION_RULE_COMBINING_ENUM:
				return convertPermissionRuleCombiningEnumToString(eDataType, instanceValue);
			case FhirPackage.PERMISSION_STATUS_ENUM:
				return convertPermissionStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.PROPERTY_REPRESENTATION_ENUM:
				return convertPropertyRepresentationEnumToString(eDataType, instanceValue);
			case FhirPackage.PROPERTY_TYPE_ENUM:
				return convertPropertyTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_ENUM:
				return convertProvenanceEntityRoleEnumToString(eDataType, instanceValue);
			case FhirPackage.PUBLICATION_STATUS_ENUM:
				return convertPublicationStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.QUANTITY_COMPARATOR_ENUM:
				return convertQuantityComparatorEnumToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_ANSWER_CONSTRAINT_ENUM:
				return convertQuestionnaireAnswerConstraintEnumToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_DISABLED_DISPLAY_ENUM:
				return convertQuestionnaireItemDisabledDisplayEnumToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_OPERATOR_ENUM:
				return convertQuestionnaireItemOperatorEnumToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE_ENUM:
				return convertQuestionnaireItemTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS_ENUM:
				return convertQuestionnaireResponseStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.REFERENCE_HANDLING_POLICY_ENUM:
				return convertReferenceHandlingPolicyEnumToString(eDataType, instanceValue);
			case FhirPackage.REFERENCE_VERSION_RULES_ENUM:
				return convertReferenceVersionRulesEnumToString(eDataType, instanceValue);
			case FhirPackage.RELATED_ARTIFACT_TYPE_ENUM:
				return convertRelatedArtifactTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.RELATED_ARTIFACT_TYPE_EXPANDED_ENUM:
				return convertRelatedArtifactTypeExpandedEnumToString(eDataType, instanceValue);
			case FhirPackage.REMITTANCE_OUTCOME_ENUM:
				return convertRemittanceOutcomeEnumToString(eDataType, instanceValue);
			case FhirPackage.REPORT_RELATIONSHIP_TYPE_ENUM:
				return convertReportRelationshipTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.REQUEST_INTENT_ENUM:
				return convertRequestIntentEnumToString(eDataType, instanceValue);
			case FhirPackage.REQUEST_PRIORITY_ENUM:
				return convertRequestPriorityEnumToString(eDataType, instanceValue);
			case FhirPackage.REQUEST_RESOURCE_TYPES_ENUM:
				return convertRequestResourceTypesEnumToString(eDataType, instanceValue);
			case FhirPackage.REQUEST_STATUS_ENUM:
				return convertRequestStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.RESOURCE_TYPE_ENUM:
				return convertResourceTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.RESOURCE_VERSION_POLICY_ENUM:
				return convertResourceVersionPolicyEnumToString(eDataType, instanceValue);
			case FhirPackage.RESPONSE_TYPE_ENUM:
				return convertResponseTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.RESTFUL_CAPABILITY_MODE_ENUM:
				return convertRestfulCapabilityModeEnumToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_COMPARATOR_ENUM:
				return convertSearchComparatorEnumToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_ENTRY_MODE_ENUM:
				return convertSearchEntryModeEnumToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_MODIFIER_CODE_ENUM:
				return convertSearchModifierCodeEnumToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_PARAM_TYPE_ENUM:
				return convertSearchParamTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_PROCESSING_MODE_TYPE_ENUM:
				return convertSearchProcessingModeTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.SEQUENCE_TYPE_ENUM:
				return convertSequenceTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.SLICING_RULES_ENUM:
				return convertSlicingRulesEnumToString(eDataType, instanceValue);
			case FhirPackage.SLOT_STATUS_ENUM:
				return convertSlotStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.SORT_DIRECTION_ENUM:
				return convertSortDirectionEnumToString(eDataType, instanceValue);
			case FhirPackage.SPDX_LICENSE_ENUM:
				return convertSPDXLicenseEnumToString(eDataType, instanceValue);
			case FhirPackage.SPECIMEN_COMBINED_ENUM:
				return convertSpecimenCombinedEnumToString(eDataType, instanceValue);
			case FhirPackage.SPECIMEN_CONTAINED_PREFERENCE_ENUM:
				return convertSpecimenContainedPreferenceEnumToString(eDataType, instanceValue);
			case FhirPackage.SPECIMEN_STATUS_ENUM:
				return convertSpecimenStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.STRAND_TYPE_ENUM:
				return convertStrandTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_DEFINITION_KIND_ENUM:
				return convertStructureDefinitionKindEnumToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_GROUP_TYPE_MODE_ENUM:
				return convertStructureMapGroupTypeModeEnumToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE_ENUM:
				return convertStructureMapInputModeEnumToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE_ENUM:
				return convertStructureMapModelModeEnumToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_SOURCE_LIST_MODE_ENUM:
				return convertStructureMapSourceListModeEnumToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_TARGET_LIST_MODE_ENUM:
				return convertStructureMapTargetListModeEnumToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_TRANSFORM_ENUM:
				return convertStructureMapTransformEnumToString(eDataType, instanceValue);
			case FhirPackage.SUBMIT_DATA_UPDATE_TYPE_ENUM:
				return convertSubmitDataUpdateTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.SUBSCRIPTION_NOTIFICATION_TYPE_ENUM:
				return convertSubscriptionNotificationTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.SUBSCRIPTION_PAYLOAD_CONTENT_ENUM:
				return convertSubscriptionPayloadContentEnumToString(eDataType, instanceValue);
			case FhirPackage.SUBSCRIPTION_STATUS_CODES_ENUM:
				return convertSubscriptionStatusCodesEnumToString(eDataType, instanceValue);
			case FhirPackage.SUPPLY_DELIVERY_STATUS_ENUM:
				return convertSupplyDeliveryStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.SUPPLY_REQUEST_STATUS_ENUM:
				return convertSupplyRequestStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_ENUM:
				return convertSystemRestfulInteractionEnumToString(eDataType, instanceValue);
			case FhirPackage.TASK_INTENT_ENUM:
				return convertTaskIntentEnumToString(eDataType, instanceValue);
			case FhirPackage.TASK_STATUS_ENUM:
				return convertTaskStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.TEST_REPORT_ACTION_RESULT_ENUM:
				return convertTestReportActionResultEnumToString(eDataType, instanceValue);
			case FhirPackage.TEST_REPORT_PARTICIPANT_TYPE_ENUM:
				return convertTestReportParticipantTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.TEST_REPORT_RESULT_ENUM:
				return convertTestReportResultEnumToString(eDataType, instanceValue);
			case FhirPackage.TEST_REPORT_STATUS_ENUM:
				return convertTestReportStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.TEST_SCRIPT_REQUEST_METHOD_CODE_ENUM:
				return convertTestScriptRequestMethodCodeEnumToString(eDataType, instanceValue);
			case FhirPackage.TRANSPORT_INTENT_ENUM:
				return convertTransportIntentEnumToString(eDataType, instanceValue);
			case FhirPackage.TRANSPORT_STATUS_ENUM:
				return convertTransportStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.TRIGGERED_BYTYPE_ENUM:
				return convertTriggeredBytypeEnumToString(eDataType, instanceValue);
			case FhirPackage.TRIGGER_TYPE_ENUM:
				return convertTriggerTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.TYPE_DERIVATION_RULE_ENUM:
				return convertTypeDerivationRuleEnumToString(eDataType, instanceValue);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_ENUM:
				return convertTypeRestfulInteractionEnumToString(eDataType, instanceValue);
			case FhirPackage.UDI_ENTRY_TYPE_ENUM:
				return convertUDIEntryTypeEnumToString(eDataType, instanceValue);
			case FhirPackage.UNITS_OF_TIME_ENUM:
				return convertUnitsOfTimeEnumToString(eDataType, instanceValue);
			case FhirPackage.USE_ENUM:
				return convertUseEnumToString(eDataType, instanceValue);
			case FhirPackage.VERIFICATION_RESULT_STATUS_ENUM:
				return convertVerificationResultStatusEnumToString(eDataType, instanceValue);
			case FhirPackage.VERSION_INDEPENDENT_RESOURCE_TYPES_ALL_ENUM:
				return convertVersionIndependentResourceTypesAllEnumToString(eDataType, instanceValue);
			case FhirPackage.VISION_BASE_ENUM:
				return convertVisionBaseEnumToString(eDataType, instanceValue);
			case FhirPackage.VISION_EYES_ENUM:
				return convertVisionEyesEnumToString(eDataType, instanceValue);
			case FhirPackage.ACCOUNT_STATUS_ENUM_OBJECT:
				return convertAccountStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_CARDINALITY_BEHAVIOR_ENUM_OBJECT:
				return convertActionCardinalityBehaviorEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_CONDITION_KIND_ENUM_OBJECT:
				return convertActionConditionKindEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_GROUPING_BEHAVIOR_ENUM_OBJECT:
				return convertActionGroupingBehaviorEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_PARTICIPANT_TYPE_ENUM_OBJECT:
				return convertActionParticipantTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_PRECHECK_BEHAVIOR_ENUM_OBJECT:
				return convertActionPrecheckBehaviorEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_RELATIONSHIP_TYPE_ENUM_OBJECT:
				return convertActionRelationshipTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_REQUIRED_BEHAVIOR_ENUM_OBJECT:
				return convertActionRequiredBehaviorEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_SELECTION_BEHAVIOR_ENUM_OBJECT:
				return convertActionSelectionBehaviorEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ADDRESS_TYPE_ENUM_OBJECT:
				return convertAddressTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ADDRESS_USE_ENUM_OBJECT:
				return convertAddressUseEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ADMINISTRATIVE_GENDER_ENUM_OBJECT:
				return convertAdministrativeGenderEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ADVERSE_EVENT_ACTUALITY_ENUM_OBJECT:
				return convertAdverseEventActualityEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ADVERSE_EVENT_STATUS_ENUM_OBJECT:
				return convertAdverseEventStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.AGE_UNITS_ENUM_OBJECT:
				return convertAgeUnitsEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.AGGREGATION_MODE_ENUM_OBJECT:
				return convertAggregationModeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_ENUM_OBJECT:
				return convertAllergyIntoleranceCategoryEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_ENUM_OBJECT:
				return convertAllergyIntoleranceCriticalityEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_ENUM_OBJECT:
				return convertAllergyIntoleranceSeverityEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ALL_RESOURCE_TYPES_ENUM_OBJECT:
				return convertAllResourceTypesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.APPOINTMENT_RESPONSE_STATUS_ENUM_OBJECT:
				return convertAppointmentResponseStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.APPOINTMENT_STATUS_ENUM_OBJECT:
				return convertAppointmentStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ARTIFACT_ASSESSMENT_DISPOSITION_ENUM_OBJECT:
				return convertArtifactAssessmentDispositionEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ARTIFACT_ASSESSMENT_INFORMATION_TYPE_ENUM_OBJECT:
				return convertArtifactAssessmentInformationTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ARTIFACT_ASSESSMENT_WORKFLOW_STATUS_ENUM_OBJECT:
				return convertArtifactAssessmentWorkflowStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_DIRECTION_TYPE_ENUM_OBJECT:
				return convertAssertionDirectionTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_MANUAL_COMPLETION_TYPE_ENUM_OBJECT:
				return convertAssertionManualCompletionTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_OPERATOR_TYPE_ENUM_OBJECT:
				return convertAssertionOperatorTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_RESPONSE_TYPES_ENUM_OBJECT:
				return convertAssertionResponseTypesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_ACTION_ENUM_OBJECT:
				return convertAuditEventActionEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_SEVERITY_ENUM_OBJECT:
				return convertAuditEventSeverityEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.BASE64_BINARY_PRIMITIVE:
				return convertBase64BinaryPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.BINDING_STRENGTH_ENUM_OBJECT:
				return convertBindingStrengthEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE_CODES_ENUM_OBJECT:
				return convertBiologicallyDerivedProductDispenseCodesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.BOOLEAN_PRIMITIVE:
				return convertBooleanPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.BOOLEAN_PRIMITIVE_OBJECT:
				return convertBooleanPrimitiveObjectToString(eDataType, instanceValue);
			case FhirPackage.BUNDLE_TYPE_ENUM_OBJECT:
				return convertBundleTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CANONICAL_PRIMITIVE:
				return convertCanonicalPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.CAPABILITY_STATEMENT_KIND_ENUM_OBJECT:
				return convertCapabilityStatementKindEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_INTENT_ENUM_OBJECT:
				return convertCarePlanIntentEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CARE_TEAM_STATUS_ENUM_OBJECT:
				return convertCareTeamStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CHARACTERISTIC_COMBINATION_ENUM_OBJECT:
				return convertCharacteristicCombinationEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CHARGE_ITEM_STATUS_ENUM_OBJECT:
				return convertChargeItemStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CLAIM_PROCESSING_CODES_ENUM_OBJECT:
				return convertClaimProcessingCodesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CLINICAL_USE_DEFINITION_TYPE_ENUM_OBJECT:
				return convertClinicalUseDefinitionTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CODE_PRIMITIVE:
				return convertCodePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.CODE_SEARCH_SUPPORT_ENUM_OBJECT:
				return convertCodeSearchSupportEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE_ENUM_OBJECT:
				return convertCodeSystemContentModeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING_ENUM_OBJECT:
				return convertCodeSystemHierarchyMeaningEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.COLOR_CODES_OR_RGB_ENUM:
				return convertColorCodesOrRGBEnumToString(eDataType, instanceValue);
			case FhirPackage.COMMON_LANGUAGES_ENUM_OBJECT:
				return convertCommonLanguagesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.COMPARTMENT_TYPE_ENUM_OBJECT:
				return convertCompartmentTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.COMPOSITION_STATUS_ENUM_OBJECT:
				return convertCompositionStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CONCEPT_MAP_ATTRIBUTE_TYPE_ENUM_OBJECT:
				return convertConceptMapAttributeTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CONCEPT_MAP_GROUP_UNMAPPED_MODE_ENUM_OBJECT:
				return convertConceptMapGroupUnmappedModeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CONCEPT_MAP_PROPERTY_TYPE_ENUM_OBJECT:
				return convertConceptMapPropertyTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CONCEPT_MAP_RELATIONSHIP_ENUM_OBJECT:
				return convertConceptMapRelationshipEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CONCRETE_FHIR_TYPES_ENUM_OBJECT:
				return convertConcreteFHIRTypesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CONDITIONAL_DELETE_STATUS_ENUM_OBJECT:
				return convertConditionalDeleteStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CONDITIONAL_READ_STATUS_ENUM_OBJECT:
				return convertConditionalReadStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CONDITION_PRECONDITION_TYPE_ENUM_OBJECT:
				return convertConditionPreconditionTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CONDITION_QUESTIONNAIRE_PURPOSE_ENUM_OBJECT:
				return convertConditionQuestionnairePurposeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CONFORMANCE_EXPECTATION_ENUM_OBJECT:
				return convertConformanceExpectationEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CONSENT_DATA_MEANING_ENUM_OBJECT:
				return convertConsentDataMeaningEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CONSENT_PROVISION_TYPE_ENUM_OBJECT:
				return convertConsentProvisionTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CONSENT_STATE_ENUM_OBJECT:
				return convertConsentStateEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CONSTRAINT_SEVERITY_ENUM_OBJECT:
				return convertConstraintSeverityEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CONTACT_POINT_SYSTEM_ENUM_OBJECT:
				return convertContactPointSystemEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CONTACT_POINT_USE_ENUM_OBJECT:
				return convertContactPointUseEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CONTRACT_RESOURCE_PUBLICATION_STATUS_CODES_ENUM_OBJECT:
				return convertContractResourcePublicationStatusCodesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CONTRACT_RESOURCE_STATUS_CODES_ENUM_OBJECT:
				return convertContractResourceStatusCodesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CONTRIBUTOR_TYPE_ENUM_OBJECT:
				return convertContributorTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.CRITERIA_NOT_EXISTS_BEHAVIOR_ENUM_OBJECT:
				return convertCriteriaNotExistsBehaviorEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.DATE_PRIMITIVE:
				return convertDatePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.DATE_PRIMITIVE_BASE:
				return convertDatePrimitiveBaseToString(eDataType, instanceValue);
			case FhirPackage.DATE_TIME_PRIMITIVE:
				return convertDateTimePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.DATE_TIME_PRIMITIVE_BASE:
				return convertDateTimePrimitiveBaseToString(eDataType, instanceValue);
			case FhirPackage.DECIMAL_PRIMITIVE:
				return convertDecimalPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.DEFINITION_RESOURCE_TYPES_ENUM_OBJECT:
				return convertDefinitionResourceTypesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.DETECTED_ISSUE_SEVERITY_ENUM_OBJECT:
				return convertDetectedIssueSeverityEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.DETECTED_ISSUE_STATUS_ENUM_OBJECT:
				return convertDetectedIssueStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_CORRECTIVE_ACTION_SCOPE_ENUM_OBJECT:
				return convertDeviceCorrectiveActionScopeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_DEFINITION_REGULATORY_IDENTIFIER_TYPE_ENUM_OBJECT:
				return convertDeviceDefinitionRegulatoryIdentifierTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_DISPENSE_STATUS_CODES_ENUM_OBJECT:
				return convertDeviceDispenseStatusCodesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_ENUM_OBJECT:
				return convertDeviceMetricCalibrationStateEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_ENUM_OBJECT:
				return convertDeviceMetricCalibrationTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CATEGORY_ENUM_OBJECT:
				return convertDeviceMetricCategoryEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_ENUM_OBJECT:
				return convertDeviceMetricOperationalStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_NAME_TYPE_ENUM_OBJECT:
				return convertDeviceNameTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_PRODUCTION_IDENTIFIER_IN_UDI_ENUM_OBJECT:
				return convertDeviceProductionIdentifierInUDIEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_USAGE_STATUS_ENUM_OBJECT:
				return convertDeviceUsageStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_ENUM_OBJECT:
				return convertDiagnosticReportStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.DISCRIMINATOR_TYPE_ENUM_OBJECT:
				return convertDiscriminatorTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_MODE_ENUM_OBJECT:
				return convertDocumentModeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_ENUM_OBJECT:
				return convertDocumentReferenceStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ELIGIBILITY_OUTCOME_ENUM_OBJECT:
				return convertEligibilityOutcomeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ELIGIBILITY_REQUEST_PURPOSE_ENUM_OBJECT:
				return convertEligibilityRequestPurposeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ELIGIBILITY_RESPONSE_PURPOSE_ENUM_OBJECT:
				return convertEligibilityResponsePurposeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ENABLE_WHEN_BEHAVIOR_ENUM_OBJECT:
				return convertEnableWhenBehaviorEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_ENUM_OBJECT:
				return convertEncounterLocationStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ENCOUNTER_STATUS_ENUM_OBJECT:
				return convertEncounterStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ENDPOINT_STATUS_ENUM_OBJECT:
				return convertEndpointStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ENROLLMENT_OUTCOME_ENUM_OBJECT:
				return convertEnrollmentOutcomeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.EPISODE_OF_CARE_STATUS_ENUM_OBJECT:
				return convertEpisodeOfCareStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.EVENT_CAPABILITY_MODE_ENUM_OBJECT:
				return convertEventCapabilityModeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.EVENT_RESOURCE_TYPES_ENUM_OBJECT:
				return convertEventResourceTypesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.EVENT_STATUS_ENUM_OBJECT:
				return convertEventStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.EVENT_TIMING_ENUM_OBJECT:
				return convertEventTimingEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.EVIDENCE_VARIABLE_HANDLING_ENUM_OBJECT:
				return convertEvidenceVariableHandlingEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR_TYPE_ENUM_OBJECT:
				return convertExampleScenarioActorTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS_ENUM_OBJECT:
				return convertExplanationOfBenefitStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.EXTENSION_CONTEXT_TYPE_ENUM_OBJECT:
				return convertExtensionContextTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.FAMILY_HISTORY_STATUS_ENUM_OBJECT:
				return convertFamilyHistoryStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.FHIR_DEVICE_STATUS_ENUM_OBJECT:
				return convertFHIRDeviceStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.FHIR_PATH_TYPES_ENUM_OBJECT:
				return convertFHIRPathTypesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.FHIR_SUBSTANCE_STATUS_ENUM_OBJECT:
				return convertFHIRSubstanceStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.FHIR_TYPES_ENUM_OBJECT:
				return convertFHIRTypesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.FHIR_VERSION_ENUM_OBJECT:
				return convertFHIRVersionEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.FILTER_OPERATOR_ENUM_OBJECT:
				return convertFilterOperatorEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.FINANCIAL_RESOURCE_STATUS_CODES_ENUM_OBJECT:
				return convertFinancialResourceStatusCodesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.FLAG_STATUS_ENUM_OBJECT:
				return convertFlagStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.FORMULARY_ITEM_STATUS_CODES_ENUM_OBJECT:
				return convertFormularyItemStatusCodesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.GENOMIC_STUDY_STATUS_ENUM_OBJECT:
				return convertGenomicStudyStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.GOAL_LIFECYCLE_STATUS_ENUM_OBJECT:
				return convertGoalLifecycleStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.GRAPH_COMPARTMENT_RULE_ENUM_OBJECT:
				return convertGraphCompartmentRuleEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.GRAPH_COMPARTMENT_USE_ENUM_OBJECT:
				return convertGraphCompartmentUseEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.GROUP_MEMBERSHIP_BASIS_ENUM_OBJECT:
				return convertGroupMembershipBasisEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.GROUP_TYPE_ENUM_OBJECT:
				return convertGroupTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.GUIDANCE_RESPONSE_STATUS_ENUM_OBJECT:
				return convertGuidanceResponseStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.GUIDE_PAGE_GENERATION_ENUM_OBJECT:
				return convertGuidePageGenerationEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.HTTP_VERB_ENUM_OBJECT:
				return convertHTTPVerbEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.IDENTIFIER_USE_ENUM_OBJECT:
				return convertIdentifierUseEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_ENUM_OBJECT:
				return convertIdentityAssuranceLevelEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ID_PRIMITIVE:
				return convertIdPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.IMAGING_SELECTION_DGRAPHIC_TYPE_ENUM_OBJECT:
				return convertImagingSelectionDGraphicTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.IMAGING_SELECTION_STATUS_ENUM_OBJECT:
				return convertImagingSelectionStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.IMAGING_STUDY_STATUS_ENUM_OBJECT:
				return convertImagingStudyStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.IMMUNIZATION_EVALUATION_STATUS_CODES_ENUM_OBJECT:
				return convertImmunizationEvaluationStatusCodesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.IMMUNIZATION_STATUS_CODES_ENUM_OBJECT:
				return convertImmunizationStatusCodesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.INGREDIENT_MANUFACTURER_ROLE_ENUM_OBJECT:
				return convertIngredientManufacturerRoleEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.INSTANT_PRIMITIVE:
				return convertInstantPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.INTEGER64_PRIMITIVE:
				return convertInteger64PrimitiveToString(eDataType, instanceValue);
			case FhirPackage.INTEGER64_PRIMITIVE_OBJECT:
				return convertInteger64PrimitiveObjectToString(eDataType, instanceValue);
			case FhirPackage.INTEGER_PRIMITIVE:
				return convertIntegerPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.INTEGER_PRIMITIVE_OBJECT:
				return convertIntegerPrimitiveObjectToString(eDataType, instanceValue);
			case FhirPackage.INTERACTION_TRIGGER_ENUM_OBJECT:
				return convertInteractionTriggerEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.INVENTORY_COUNT_TYPE_ENUM_OBJECT:
				return convertInventoryCountTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.INVENTORY_ITEM_STATUS_CODES_ENUM_OBJECT:
				return convertInventoryItemStatusCodesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.INVENTORY_REPORT_STATUS_ENUM_OBJECT:
				return convertInventoryReportStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.INVOICE_STATUS_ENUM_OBJECT:
				return convertInvoiceStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ISSUE_SEVERITY_ENUM_OBJECT:
				return convertIssueSeverityEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ISSUE_TYPE_ENUM_OBJECT:
				return convertIssueTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.JURISDICTION_VALUE_SET_ENUM_OBJECT:
				return convertJurisdictionValueSetEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.KIND_ENUM_OBJECT:
				return convertKindEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.LINKAGE_TYPE_ENUM_OBJECT:
				return convertLinkageTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.LINK_RELATION_TYPES_ENUM_OBJECT:
				return convertLinkRelationTypesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.LINK_TYPE_ENUM_OBJECT:
				return convertLinkTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.LIST_MODE_ENUM_OBJECT:
				return convertListModeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.LIST_STATUS_ENUM_OBJECT:
				return convertListStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.LOCATION_MODE_ENUM_OBJECT:
				return convertLocationModeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.LOCATION_STATUS_ENUM_OBJECT:
				return convertLocationStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.MARKDOWN_PRIMITIVE:
				return convertMarkdownPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.MEASURE_REPORT_STATUS_ENUM_OBJECT:
				return convertMeasureReportStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.MEASURE_REPORT_TYPE_ENUM_OBJECT:
				return convertMeasureReportTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS_CODES_ENUM_OBJECT:
				return convertMedicationAdministrationStatusCodesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_DISPENSE_STATUS_CODES_ENUM_OBJECT:
				return convertMedicationDispenseStatusCodesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_KNOWLEDGE_STATUS_CODES_ENUM_OBJECT:
				return convertMedicationKnowledgeStatusCodesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_REQUEST_INTENT_ENUM_OBJECT:
				return convertMedicationRequestIntentEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATIONREQUEST_STATUS_ENUM_OBJECT:
				return convertMedicationrequestStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_STATEMENT_STATUS_CODES_ENUM_OBJECT:
				return convertMedicationStatementStatusCodesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_STATUS_CODES_ENUM_OBJECT:
				return convertMedicationStatusCodesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.MESSAGEHEADER_RESPONSE_REQUEST_ENUM_OBJECT:
				return convertMessageheaderResponseRequestEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_ENUM_OBJECT:
				return convertMessageSignificanceCategoryEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.NAME_USE_ENUM_OBJECT:
				return convertNameUseEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_ENUM_OBJECT:
				return convertNamingSystemIdentifierTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.NAMING_SYSTEM_TYPE_ENUM_OBJECT:
				return convertNamingSystemTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.NARRATIVE_STATUS_ENUM_OBJECT:
				return convertNarrativeStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.NOTE_TYPE_ENUM_OBJECT:
				return convertNoteTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.NUTRITION_PRODUCT_STATUS_ENUM_OBJECT:
				return convertNutritionProductStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_DATA_TYPE_ENUM_OBJECT:
				return convertObservationDataTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_RANGE_CATEGORY_ENUM_OBJECT:
				return convertObservationRangeCategoryEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_STATUS_ENUM_OBJECT:
				return convertObservationStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.OID_PRIMITIVE:
				return convertOidPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.OPERATION_KIND_ENUM_OBJECT:
				return convertOperationKindEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.OPERATION_OUTCOME_CODES_ENUM_OBJECT:
				return convertOperationOutcomeCodesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.OPERATION_PARAMETER_SCOPE_ENUM_OBJECT:
				return convertOperationParameterScopeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.OPERATION_PARAMETER_USE_ENUM_OBJECT:
				return convertOperationParameterUseEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.ORIENTATION_TYPE_ENUM_OBJECT:
				return convertOrientationTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.PARTICIPANT_RESOURCE_TYPES_ENUM_OBJECT:
				return convertParticipantResourceTypesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.PARTICIPATION_STATUS_ENUM_OBJECT:
				return convertParticipationStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.PAYMENT_OUTCOME_ENUM_OBJECT:
				return convertPaymentOutcomeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.PERMISSION_RULE_COMBINING_ENUM_OBJECT:
				return convertPermissionRuleCombiningEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.PERMISSION_STATUS_ENUM_OBJECT:
				return convertPermissionStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.POSITIVE_INT_PRIMITIVE:
				return convertPositiveIntPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.PROPERTY_REPRESENTATION_ENUM_OBJECT:
				return convertPropertyRepresentationEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.PROPERTY_TYPE_ENUM_OBJECT:
				return convertPropertyTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_ENUM_OBJECT:
				return convertProvenanceEntityRoleEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.PUBLICATION_STATUS_ENUM_OBJECT:
				return convertPublicationStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.QUANTITY_COMPARATOR_ENUM_OBJECT:
				return convertQuantityComparatorEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_ANSWER_CONSTRAINT_ENUM_OBJECT:
				return convertQuestionnaireAnswerConstraintEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_DISABLED_DISPLAY_ENUM_OBJECT:
				return convertQuestionnaireItemDisabledDisplayEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_OPERATOR_ENUM_OBJECT:
				return convertQuestionnaireItemOperatorEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE_ENUM_OBJECT:
				return convertQuestionnaireItemTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS_ENUM_OBJECT:
				return convertQuestionnaireResponseStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.REFERENCE_HANDLING_POLICY_ENUM_OBJECT:
				return convertReferenceHandlingPolicyEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.REFERENCE_VERSION_RULES_ENUM_OBJECT:
				return convertReferenceVersionRulesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.RELATED_ARTIFACT_TYPE_ENUM_OBJECT:
				return convertRelatedArtifactTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.RELATED_ARTIFACT_TYPE_EXPANDED_ENUM_OBJECT:
				return convertRelatedArtifactTypeExpandedEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.REMITTANCE_OUTCOME_ENUM_OBJECT:
				return convertRemittanceOutcomeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.REPORT_RELATIONSHIP_TYPE_ENUM_OBJECT:
				return convertReportRelationshipTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.REQUEST_INTENT_ENUM_OBJECT:
				return convertRequestIntentEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.REQUEST_PRIORITY_ENUM_OBJECT:
				return convertRequestPriorityEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.REQUEST_RESOURCE_TYPES_ENUM_OBJECT:
				return convertRequestResourceTypesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.REQUEST_STATUS_ENUM_OBJECT:
				return convertRequestStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.RESOURCE_TYPE_ENUM_OBJECT:
				return convertResourceTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.RESOURCE_VERSION_POLICY_ENUM_OBJECT:
				return convertResourceVersionPolicyEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.RESPONSE_TYPE_ENUM_OBJECT:
				return convertResponseTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.RESTFUL_CAPABILITY_MODE_ENUM_OBJECT:
				return convertRestfulCapabilityModeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.SAMPLED_DATA_DATA_TYPE_PRIMITIVE:
				return convertSampledDataDataTypePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_COMPARATOR_ENUM_OBJECT:
				return convertSearchComparatorEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_ENTRY_MODE_ENUM_OBJECT:
				return convertSearchEntryModeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_MODIFIER_CODE_ENUM_OBJECT:
				return convertSearchModifierCodeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_PARAM_TYPE_ENUM_OBJECT:
				return convertSearchParamTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_PROCESSING_MODE_TYPE_ENUM_OBJECT:
				return convertSearchProcessingModeTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.SEQUENCE_TYPE_ENUM_OBJECT:
				return convertSequenceTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.SLICING_RULES_ENUM_OBJECT:
				return convertSlicingRulesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.SLOT_STATUS_ENUM_OBJECT:
				return convertSlotStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.SORT_DIRECTION_ENUM_OBJECT:
				return convertSortDirectionEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.SPDX_LICENSE_ENUM_OBJECT:
				return convertSPDXLicenseEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.SPECIMEN_COMBINED_ENUM_OBJECT:
				return convertSpecimenCombinedEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.SPECIMEN_CONTAINED_PREFERENCE_ENUM_OBJECT:
				return convertSpecimenContainedPreferenceEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.SPECIMEN_STATUS_ENUM_OBJECT:
				return convertSpecimenStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.STRAND_TYPE_ENUM_OBJECT:
				return convertStrandTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.STRING_PRIMITIVE:
				return convertStringPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_DEFINITION_KIND_ENUM_OBJECT:
				return convertStructureDefinitionKindEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_GROUP_TYPE_MODE_ENUM_OBJECT:
				return convertStructureMapGroupTypeModeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE_ENUM_OBJECT:
				return convertStructureMapInputModeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE_ENUM_OBJECT:
				return convertStructureMapModelModeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_SOURCE_LIST_MODE_ENUM_OBJECT:
				return convertStructureMapSourceListModeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_TARGET_LIST_MODE_ENUM_OBJECT:
				return convertStructureMapTargetListModeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_TRANSFORM_ENUM_OBJECT:
				return convertStructureMapTransformEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.SUBMIT_DATA_UPDATE_TYPE_ENUM_OBJECT:
				return convertSubmitDataUpdateTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.SUBSCRIPTION_NOTIFICATION_TYPE_ENUM_OBJECT:
				return convertSubscriptionNotificationTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.SUBSCRIPTION_PAYLOAD_CONTENT_ENUM_OBJECT:
				return convertSubscriptionPayloadContentEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.SUBSCRIPTION_STATUS_CODES_ENUM_OBJECT:
				return convertSubscriptionStatusCodesEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.SUPPLY_DELIVERY_STATUS_ENUM_OBJECT:
				return convertSupplyDeliveryStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.SUPPLY_REQUEST_STATUS_ENUM_OBJECT:
				return convertSupplyRequestStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_ENUM_OBJECT:
				return convertSystemRestfulInteractionEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.TASK_INTENT_ENUM_OBJECT:
				return convertTaskIntentEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.TASK_STATUS_ENUM_OBJECT:
				return convertTaskStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.TEST_REPORT_ACTION_RESULT_ENUM_OBJECT:
				return convertTestReportActionResultEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.TEST_REPORT_PARTICIPANT_TYPE_ENUM_OBJECT:
				return convertTestReportParticipantTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.TEST_REPORT_RESULT_ENUM_OBJECT:
				return convertTestReportResultEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.TEST_REPORT_STATUS_ENUM_OBJECT:
				return convertTestReportStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.TEST_SCRIPT_REQUEST_METHOD_CODE_ENUM_OBJECT:
				return convertTestScriptRequestMethodCodeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.TIME_PRIMITIVE:
				return convertTimePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.TRANSPORT_INTENT_ENUM_OBJECT:
				return convertTransportIntentEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.TRANSPORT_STATUS_ENUM_OBJECT:
				return convertTransportStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.TRIGGERED_BYTYPE_ENUM_OBJECT:
				return convertTriggeredBytypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.TRIGGER_TYPE_ENUM_OBJECT:
				return convertTriggerTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.TYPE_DERIVATION_RULE_ENUM_OBJECT:
				return convertTypeDerivationRuleEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_ENUM_OBJECT:
				return convertTypeRestfulInteractionEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.UDI_ENTRY_TYPE_ENUM_OBJECT:
				return convertUDIEntryTypeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.UNITS_OF_TIME_ENUM_OBJECT:
				return convertUnitsOfTimeEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.UNSIGNED_INT_PRIMITIVE:
				return convertUnsignedIntPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.URI_PRIMITIVE:
				return convertUriPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.URL_PRIMITIVE:
				return convertUrlPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.USE_ENUM_OBJECT:
				return convertUseEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.UUID_PRIMITIVE:
				return convertUuidPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.VERIFICATION_RESULT_STATUS_ENUM_OBJECT:
				return convertVerificationResultStatusEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.VERSION_INDEPENDENT_RESOURCE_TYPES_ALL_ENUM_OBJECT:
				return convertVersionIndependentResourceTypesAllEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.VISION_BASE_ENUM_OBJECT:
				return convertVisionBaseEnumObjectToString(eDataType, instanceValue);
			case FhirPackage.VISION_EYES_ENUM_OBJECT:
				return convertVisionEyesEnumObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account createAccount() {
		AccountImpl account = new AccountImpl();
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountBalance createAccountBalance() {
		AccountBalanceImpl accountBalance = new AccountBalanceImpl();
		return accountBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountCoverage createAccountCoverage() {
		AccountCoverageImpl accountCoverage = new AccountCoverageImpl();
		return accountCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountDiagnosis createAccountDiagnosis() {
		AccountDiagnosisImpl accountDiagnosis = new AccountDiagnosisImpl();
		return accountDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountGuarantor createAccountGuarantor() {
		AccountGuarantorImpl accountGuarantor = new AccountGuarantorImpl();
		return accountGuarantor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountProcedure createAccountProcedure() {
		AccountProcedureImpl accountProcedure = new AccountProcedureImpl();
		return accountProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountRelatedAccount createAccountRelatedAccount() {
		AccountRelatedAccountImpl accountRelatedAccount = new AccountRelatedAccountImpl();
		return accountRelatedAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountStatus createAccountStatus() {
		AccountStatusImpl accountStatus = new AccountStatusImpl();
		return accountStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionCardinalityBehavior createActionCardinalityBehavior() {
		ActionCardinalityBehaviorImpl actionCardinalityBehavior = new ActionCardinalityBehaviorImpl();
		return actionCardinalityBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionConditionKind createActionConditionKind() {
		ActionConditionKindImpl actionConditionKind = new ActionConditionKindImpl();
		return actionConditionKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGroupingBehavior createActionGroupingBehavior() {
		ActionGroupingBehaviorImpl actionGroupingBehavior = new ActionGroupingBehaviorImpl();
		return actionGroupingBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionParticipantType createActionParticipantType() {
		ActionParticipantTypeImpl actionParticipantType = new ActionParticipantTypeImpl();
		return actionParticipantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionPrecheckBehavior createActionPrecheckBehavior() {
		ActionPrecheckBehaviorImpl actionPrecheckBehavior = new ActionPrecheckBehaviorImpl();
		return actionPrecheckBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRelationshipType createActionRelationshipType() {
		ActionRelationshipTypeImpl actionRelationshipType = new ActionRelationshipTypeImpl();
		return actionRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRequiredBehavior createActionRequiredBehavior() {
		ActionRequiredBehaviorImpl actionRequiredBehavior = new ActionRequiredBehaviorImpl();
		return actionRequiredBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSelectionBehavior createActionSelectionBehavior() {
		ActionSelectionBehaviorImpl actionSelectionBehavior = new ActionSelectionBehaviorImpl();
		return actionSelectionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDefinition createActivityDefinition() {
		ActivityDefinitionImpl activityDefinition = new ActivityDefinitionImpl();
		return activityDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDefinitionDynamicValue createActivityDefinitionDynamicValue() {
		ActivityDefinitionDynamicValueImpl activityDefinitionDynamicValue = new ActivityDefinitionDynamicValueImpl();
		return activityDefinitionDynamicValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDefinitionParticipant createActivityDefinitionParticipant() {
		ActivityDefinitionParticipantImpl activityDefinitionParticipant = new ActivityDefinitionParticipantImpl();
		return activityDefinitionParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorDefinition createActorDefinition() {
		ActorDefinitionImpl actorDefinition = new ActorDefinitionImpl();
		return actorDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressType createAddressType() {
		AddressTypeImpl addressType = new AddressTypeImpl();
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressUse createAddressUse() {
		AddressUseImpl addressUse = new AddressUseImpl();
		return addressUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrableProductDefinition createAdministrableProductDefinition() {
		AdministrableProductDefinitionImpl administrableProductDefinition = new AdministrableProductDefinitionImpl();
		return administrableProductDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrableProductDefinitionProperty createAdministrableProductDefinitionProperty() {
		AdministrableProductDefinitionPropertyImpl administrableProductDefinitionProperty = new AdministrableProductDefinitionPropertyImpl();
		return administrableProductDefinitionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrableProductDefinitionRouteOfAdministration createAdministrableProductDefinitionRouteOfAdministration() {
		AdministrableProductDefinitionRouteOfAdministrationImpl administrableProductDefinitionRouteOfAdministration = new AdministrableProductDefinitionRouteOfAdministrationImpl();
		return administrableProductDefinitionRouteOfAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrableProductDefinitionTargetSpecies createAdministrableProductDefinitionTargetSpecies() {
		AdministrableProductDefinitionTargetSpeciesImpl administrableProductDefinitionTargetSpecies = new AdministrableProductDefinitionTargetSpeciesImpl();
		return administrableProductDefinitionTargetSpecies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrableProductDefinitionWithdrawalPeriod createAdministrableProductDefinitionWithdrawalPeriod() {
		AdministrableProductDefinitionWithdrawalPeriodImpl administrableProductDefinitionWithdrawalPeriod = new AdministrableProductDefinitionWithdrawalPeriodImpl();
		return administrableProductDefinitionWithdrawalPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeGender createAdministrativeGender() {
		AdministrativeGenderImpl administrativeGender = new AdministrativeGenderImpl();
		return administrativeGender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEvent createAdverseEvent() {
		AdverseEventImpl adverseEvent = new AdverseEventImpl();
		return adverseEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventActuality createAdverseEventActuality() {
		AdverseEventActualityImpl adverseEventActuality = new AdverseEventActualityImpl();
		return adverseEventActuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventCausality createAdverseEventCausality() {
		AdverseEventCausalityImpl adverseEventCausality = new AdverseEventCausalityImpl();
		return adverseEventCausality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventContributingFactor createAdverseEventContributingFactor() {
		AdverseEventContributingFactorImpl adverseEventContributingFactor = new AdverseEventContributingFactorImpl();
		return adverseEventContributingFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventMitigatingAction createAdverseEventMitigatingAction() {
		AdverseEventMitigatingActionImpl adverseEventMitigatingAction = new AdverseEventMitigatingActionImpl();
		return adverseEventMitigatingAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventParticipant createAdverseEventParticipant() {
		AdverseEventParticipantImpl adverseEventParticipant = new AdverseEventParticipantImpl();
		return adverseEventParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventPreventiveAction createAdverseEventPreventiveAction() {
		AdverseEventPreventiveActionImpl adverseEventPreventiveAction = new AdverseEventPreventiveActionImpl();
		return adverseEventPreventiveAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventStatus createAdverseEventStatus() {
		AdverseEventStatusImpl adverseEventStatus = new AdverseEventStatusImpl();
		return adverseEventStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventSupportingInfo createAdverseEventSupportingInfo() {
		AdverseEventSupportingInfoImpl adverseEventSupportingInfo = new AdverseEventSupportingInfoImpl();
		return adverseEventSupportingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventSuspectEntity createAdverseEventSuspectEntity() {
		AdverseEventSuspectEntityImpl adverseEventSuspectEntity = new AdverseEventSuspectEntityImpl();
		return adverseEventSuspectEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Age createAge() {
		AgeImpl age = new AgeImpl();
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgeUnits createAgeUnits() {
		AgeUnitsImpl ageUnits = new AgeUnitsImpl();
		return ageUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationMode createAggregationMode() {
		AggregationModeImpl aggregationMode = new AggregationModeImpl();
		return aggregationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntolerance createAllergyIntolerance() {
		AllergyIntoleranceImpl allergyIntolerance = new AllergyIntoleranceImpl();
		return allergyIntolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCategory createAllergyIntoleranceCategory() {
		AllergyIntoleranceCategoryImpl allergyIntoleranceCategory = new AllergyIntoleranceCategoryImpl();
		return allergyIntoleranceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCriticality createAllergyIntoleranceCriticality() {
		AllergyIntoleranceCriticalityImpl allergyIntoleranceCriticality = new AllergyIntoleranceCriticalityImpl();
		return allergyIntoleranceCriticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceParticipant createAllergyIntoleranceParticipant() {
		AllergyIntoleranceParticipantImpl allergyIntoleranceParticipant = new AllergyIntoleranceParticipantImpl();
		return allergyIntoleranceParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceReaction createAllergyIntoleranceReaction() {
		AllergyIntoleranceReactionImpl allergyIntoleranceReaction = new AllergyIntoleranceReactionImpl();
		return allergyIntoleranceReaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceSeverity createAllergyIntoleranceSeverity() {
		AllergyIntoleranceSeverityImpl allergyIntoleranceSeverity = new AllergyIntoleranceSeverityImpl();
		return allergyIntoleranceSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllResourceTypes createAllResourceTypes() {
		AllResourceTypesImpl allResourceTypes = new AllResourceTypesImpl();
		return allResourceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appointment createAppointment() {
		AppointmentImpl appointment = new AppointmentImpl();
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentMonthlyTemplate createAppointmentMonthlyTemplate() {
		AppointmentMonthlyTemplateImpl appointmentMonthlyTemplate = new AppointmentMonthlyTemplateImpl();
		return appointmentMonthlyTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentParticipant createAppointmentParticipant() {
		AppointmentParticipantImpl appointmentParticipant = new AppointmentParticipantImpl();
		return appointmentParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentRecurrenceTemplate createAppointmentRecurrenceTemplate() {
		AppointmentRecurrenceTemplateImpl appointmentRecurrenceTemplate = new AppointmentRecurrenceTemplateImpl();
		return appointmentRecurrenceTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentResponse createAppointmentResponse() {
		AppointmentResponseImpl appointmentResponse = new AppointmentResponseImpl();
		return appointmentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentResponseStatus createAppointmentResponseStatus() {
		AppointmentResponseStatusImpl appointmentResponseStatus = new AppointmentResponseStatusImpl();
		return appointmentResponseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentStatus createAppointmentStatus() {
		AppointmentStatusImpl appointmentStatus = new AppointmentStatusImpl();
		return appointmentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentWeeklyTemplate createAppointmentWeeklyTemplate() {
		AppointmentWeeklyTemplateImpl appointmentWeeklyTemplate = new AppointmentWeeklyTemplateImpl();
		return appointmentWeeklyTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentYearlyTemplate createAppointmentYearlyTemplate() {
		AppointmentYearlyTemplateImpl appointmentYearlyTemplate = new AppointmentYearlyTemplateImpl();
		return appointmentYearlyTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactAssessment createArtifactAssessment() {
		ArtifactAssessmentImpl artifactAssessment = new ArtifactAssessmentImpl();
		return artifactAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactAssessmentContent createArtifactAssessmentContent() {
		ArtifactAssessmentContentImpl artifactAssessmentContent = new ArtifactAssessmentContentImpl();
		return artifactAssessmentContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactAssessmentDisposition createArtifactAssessmentDisposition() {
		ArtifactAssessmentDispositionImpl artifactAssessmentDisposition = new ArtifactAssessmentDispositionImpl();
		return artifactAssessmentDisposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactAssessmentInformationType createArtifactAssessmentInformationType() {
		ArtifactAssessmentInformationTypeImpl artifactAssessmentInformationType = new ArtifactAssessmentInformationTypeImpl();
		return artifactAssessmentInformationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactAssessmentWorkflowStatus createArtifactAssessmentWorkflowStatus() {
		ArtifactAssessmentWorkflowStatusImpl artifactAssessmentWorkflowStatus = new ArtifactAssessmentWorkflowStatusImpl();
		return artifactAssessmentWorkflowStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionDirectionType createAssertionDirectionType() {
		AssertionDirectionTypeImpl assertionDirectionType = new AssertionDirectionTypeImpl();
		return assertionDirectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionManualCompletionType createAssertionManualCompletionType() {
		AssertionManualCompletionTypeImpl assertionManualCompletionType = new AssertionManualCompletionTypeImpl();
		return assertionManualCompletionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionOperatorType createAssertionOperatorType() {
		AssertionOperatorTypeImpl assertionOperatorType = new AssertionOperatorTypeImpl();
		return assertionOperatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionResponseTypes createAssertionResponseTypes() {
		AssertionResponseTypesImpl assertionResponseTypes = new AssertionResponseTypesImpl();
		return assertionResponseTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachment() {
		AttachmentImpl attachment = new AttachmentImpl();
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEvent createAuditEvent() {
		AuditEventImpl auditEvent = new AuditEventImpl();
		return auditEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventAction createAuditEventAction() {
		AuditEventActionImpl auditEventAction = new AuditEventActionImpl();
		return auditEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventAgent createAuditEventAgent() {
		AuditEventAgentImpl auditEventAgent = new AuditEventAgentImpl();
		return auditEventAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventDetail createAuditEventDetail() {
		AuditEventDetailImpl auditEventDetail = new AuditEventDetailImpl();
		return auditEventDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventEntity createAuditEventEntity() {
		AuditEventEntityImpl auditEventEntity = new AuditEventEntityImpl();
		return auditEventEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventOutcome createAuditEventOutcome() {
		AuditEventOutcomeImpl auditEventOutcome = new AuditEventOutcomeImpl();
		return auditEventOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventSeverity createAuditEventSeverity() {
		AuditEventSeverityImpl auditEventSeverity = new AuditEventSeverityImpl();
		return auditEventSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventSource createAuditEventSource() {
		AuditEventSourceImpl auditEventSource = new AuditEventSourceImpl();
		return auditEventSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Availability createAvailability() {
		AvailabilityImpl availability = new AvailabilityImpl();
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailabilityAvailableTime createAvailabilityAvailableTime() {
		AvailabilityAvailableTimeImpl availabilityAvailableTime = new AvailabilityAvailableTimeImpl();
		return availabilityAvailableTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailabilityNotAvailableTime createAvailabilityNotAvailableTime() {
		AvailabilityNotAvailableTimeImpl availabilityNotAvailableTime = new AvailabilityNotAvailableTimeImpl();
		return availabilityNotAvailableTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackboneElement createBackboneElement() {
		BackboneElementImpl backboneElement = new BackboneElementImpl();
		return backboneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackboneType createBackboneType() {
		BackboneTypeImpl backboneType = new BackboneTypeImpl();
		return backboneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base createBase() {
		BaseImpl base = new BaseImpl();
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary createBase64Binary() {
		Base64BinaryImpl base64Binary = new Base64BinaryImpl();
		return base64Binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basic createBasic() {
		BasicImpl basic = new BasicImpl();
		return basic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binary createBinary() {
		BinaryImpl binary = new BinaryImpl();
		return binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingStrength createBindingStrength() {
		BindingStrengthImpl bindingStrength = new BindingStrengthImpl();
		return bindingStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiologicallyDerivedProduct createBiologicallyDerivedProduct() {
		BiologicallyDerivedProductImpl biologicallyDerivedProduct = new BiologicallyDerivedProductImpl();
		return biologicallyDerivedProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiologicallyDerivedProductCollection createBiologicallyDerivedProductCollection() {
		BiologicallyDerivedProductCollectionImpl biologicallyDerivedProductCollection = new BiologicallyDerivedProductCollectionImpl();
		return biologicallyDerivedProductCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiologicallyDerivedProductDispense createBiologicallyDerivedProductDispense() {
		BiologicallyDerivedProductDispenseImpl biologicallyDerivedProductDispense = new BiologicallyDerivedProductDispenseImpl();
		return biologicallyDerivedProductDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiologicallyDerivedProductDispenseCodes createBiologicallyDerivedProductDispenseCodes() {
		BiologicallyDerivedProductDispenseCodesImpl biologicallyDerivedProductDispenseCodes = new BiologicallyDerivedProductDispenseCodesImpl();
		return biologicallyDerivedProductDispenseCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiologicallyDerivedProductDispensePerformer createBiologicallyDerivedProductDispensePerformer() {
		BiologicallyDerivedProductDispensePerformerImpl biologicallyDerivedProductDispensePerformer = new BiologicallyDerivedProductDispensePerformerImpl();
		return biologicallyDerivedProductDispensePerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiologicallyDerivedProductProperty createBiologicallyDerivedProductProperty() {
		BiologicallyDerivedProductPropertyImpl biologicallyDerivedProductProperty = new BiologicallyDerivedProductPropertyImpl();
		return biologicallyDerivedProductProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyStructure createBodyStructure() {
		BodyStructureImpl bodyStructure = new BodyStructureImpl();
		return bodyStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyStructureBodyLandmarkOrientation createBodyStructureBodyLandmarkOrientation() {
		BodyStructureBodyLandmarkOrientationImpl bodyStructureBodyLandmarkOrientation = new BodyStructureBodyLandmarkOrientationImpl();
		return bodyStructureBodyLandmarkOrientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyStructureDistanceFromLandmark createBodyStructureDistanceFromLandmark() {
		BodyStructureDistanceFromLandmarkImpl bodyStructureDistanceFromLandmark = new BodyStructureDistanceFromLandmarkImpl();
		return bodyStructureDistanceFromLandmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyStructureIncludedStructure createBodyStructureIncludedStructure() {
		BodyStructureIncludedStructureImpl bodyStructureIncludedStructure = new BodyStructureIncludedStructureImpl();
		return bodyStructureIncludedStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle createBundle() {
		BundleImpl bundle = new BundleImpl();
		return bundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleEntry createBundleEntry() {
		BundleEntryImpl bundleEntry = new BundleEntryImpl();
		return bundleEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleLink createBundleLink() {
		BundleLinkImpl bundleLink = new BundleLinkImpl();
		return bundleLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleRequest createBundleRequest() {
		BundleRequestImpl bundleRequest = new BundleRequestImpl();
		return bundleRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleResponse createBundleResponse() {
		BundleResponseImpl bundleResponse = new BundleResponseImpl();
		return bundleResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleSearch createBundleSearch() {
		BundleSearchImpl bundleSearch = new BundleSearchImpl();
		return bundleSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleType createBundleType() {
		BundleTypeImpl bundleType = new BundleTypeImpl();
		return bundleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canonical createCanonical() {
		CanonicalImpl canonical = new CanonicalImpl();
		return canonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanonicalResource createCanonicalResource() {
		CanonicalResourceImpl canonicalResource = new CanonicalResourceImpl();
		return canonicalResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatement createCapabilityStatement() {
		CapabilityStatementImpl capabilityStatement = new CapabilityStatementImpl();
		return capabilityStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementDocument createCapabilityStatementDocument() {
		CapabilityStatementDocumentImpl capabilityStatementDocument = new CapabilityStatementDocumentImpl();
		return capabilityStatementDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementEndpoint createCapabilityStatementEndpoint() {
		CapabilityStatementEndpointImpl capabilityStatementEndpoint = new CapabilityStatementEndpointImpl();
		return capabilityStatementEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementImplementation createCapabilityStatementImplementation() {
		CapabilityStatementImplementationImpl capabilityStatementImplementation = new CapabilityStatementImplementationImpl();
		return capabilityStatementImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementInteraction createCapabilityStatementInteraction() {
		CapabilityStatementInteractionImpl capabilityStatementInteraction = new CapabilityStatementInteractionImpl();
		return capabilityStatementInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementInteraction1 createCapabilityStatementInteraction1() {
		CapabilityStatementInteraction1Impl capabilityStatementInteraction1 = new CapabilityStatementInteraction1Impl();
		return capabilityStatementInteraction1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementKind createCapabilityStatementKind() {
		CapabilityStatementKindImpl capabilityStatementKind = new CapabilityStatementKindImpl();
		return capabilityStatementKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementMessaging createCapabilityStatementMessaging() {
		CapabilityStatementMessagingImpl capabilityStatementMessaging = new CapabilityStatementMessagingImpl();
		return capabilityStatementMessaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementOperation createCapabilityStatementOperation() {
		CapabilityStatementOperationImpl capabilityStatementOperation = new CapabilityStatementOperationImpl();
		return capabilityStatementOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementResource createCapabilityStatementResource() {
		CapabilityStatementResourceImpl capabilityStatementResource = new CapabilityStatementResourceImpl();
		return capabilityStatementResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementRest createCapabilityStatementRest() {
		CapabilityStatementRestImpl capabilityStatementRest = new CapabilityStatementRestImpl();
		return capabilityStatementRest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementSearchParam createCapabilityStatementSearchParam() {
		CapabilityStatementSearchParamImpl capabilityStatementSearchParam = new CapabilityStatementSearchParamImpl();
		return capabilityStatementSearchParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementSecurity createCapabilityStatementSecurity() {
		CapabilityStatementSecurityImpl capabilityStatementSecurity = new CapabilityStatementSecurityImpl();
		return capabilityStatementSecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementSoftware createCapabilityStatementSoftware() {
		CapabilityStatementSoftwareImpl capabilityStatementSoftware = new CapabilityStatementSoftwareImpl();
		return capabilityStatementSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementSupportedMessage createCapabilityStatementSupportedMessage() {
		CapabilityStatementSupportedMessageImpl capabilityStatementSupportedMessage = new CapabilityStatementSupportedMessageImpl();
		return capabilityStatementSupportedMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlan createCarePlan() {
		CarePlanImpl carePlan = new CarePlanImpl();
		return carePlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivity createCarePlanActivity() {
		CarePlanActivityImpl carePlanActivity = new CarePlanActivityImpl();
		return carePlanActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanIntent createCarePlanIntent() {
		CarePlanIntentImpl carePlanIntent = new CarePlanIntentImpl();
		return carePlanIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeam createCareTeam() {
		CareTeamImpl careTeam = new CareTeamImpl();
		return careTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamParticipant createCareTeamParticipant() {
		CareTeamParticipantImpl careTeamParticipant = new CareTeamParticipantImpl();
		return careTeamParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamStatus createCareTeamStatus() {
		CareTeamStatusImpl careTeamStatus = new CareTeamStatusImpl();
		return careTeamStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicCombination createCharacteristicCombination() {
		CharacteristicCombinationImpl characteristicCombination = new CharacteristicCombinationImpl();
		return characteristicCombination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeItem createChargeItem() {
		ChargeItemImpl chargeItem = new ChargeItemImpl();
		return chargeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeItemDefinition createChargeItemDefinition() {
		ChargeItemDefinitionImpl chargeItemDefinition = new ChargeItemDefinitionImpl();
		return chargeItemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeItemDefinitionApplicability createChargeItemDefinitionApplicability() {
		ChargeItemDefinitionApplicabilityImpl chargeItemDefinitionApplicability = new ChargeItemDefinitionApplicabilityImpl();
		return chargeItemDefinitionApplicability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeItemDefinitionPropertyGroup createChargeItemDefinitionPropertyGroup() {
		ChargeItemDefinitionPropertyGroupImpl chargeItemDefinitionPropertyGroup = new ChargeItemDefinitionPropertyGroupImpl();
		return chargeItemDefinitionPropertyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeItemPerformer createChargeItemPerformer() {
		ChargeItemPerformerImpl chargeItemPerformer = new ChargeItemPerformerImpl();
		return chargeItemPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeItemStatus createChargeItemStatus() {
		ChargeItemStatusImpl chargeItemStatus = new ChargeItemStatusImpl();
		return chargeItemStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Citation createCitation() {
		CitationImpl citation = new CitationImpl();
		return citation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitationAbstract createCitationAbstract() {
		CitationAbstractImpl citationAbstract = new CitationAbstractImpl();
		return citationAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitationCitedArtifact createCitationCitedArtifact() {
		CitationCitedArtifactImpl citationCitedArtifact = new CitationCitedArtifactImpl();
		return citationCitedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitationClassification createCitationClassification() {
		CitationClassificationImpl citationClassification = new CitationClassificationImpl();
		return citationClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitationClassification1 createCitationClassification1() {
		CitationClassification1Impl citationClassification1 = new CitationClassification1Impl();
		return citationClassification1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitationContributionInstance createCitationContributionInstance() {
		CitationContributionInstanceImpl citationContributionInstance = new CitationContributionInstanceImpl();
		return citationContributionInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitationContributorship createCitationContributorship() {
		CitationContributorshipImpl citationContributorship = new CitationContributorshipImpl();
		return citationContributorship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitationEntry createCitationEntry() {
		CitationEntryImpl citationEntry = new CitationEntryImpl();
		return citationEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitationPart createCitationPart() {
		CitationPartImpl citationPart = new CitationPartImpl();
		return citationPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitationPublicationForm createCitationPublicationForm() {
		CitationPublicationFormImpl citationPublicationForm = new CitationPublicationFormImpl();
		return citationPublicationForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitationPublishedIn createCitationPublishedIn() {
		CitationPublishedInImpl citationPublishedIn = new CitationPublishedInImpl();
		return citationPublishedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitationRelatesTo createCitationRelatesTo() {
		CitationRelatesToImpl citationRelatesTo = new CitationRelatesToImpl();
		return citationRelatesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitationStatusDate createCitationStatusDate() {
		CitationStatusDateImpl citationStatusDate = new CitationStatusDateImpl();
		return citationStatusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitationStatusDate1 createCitationStatusDate1() {
		CitationStatusDate1Impl citationStatusDate1 = new CitationStatusDate1Impl();
		return citationStatusDate1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitationSummary createCitationSummary() {
		CitationSummaryImpl citationSummary = new CitationSummaryImpl();
		return citationSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitationSummary1 createCitationSummary1() {
		CitationSummary1Impl citationSummary1 = new CitationSummary1Impl();
		return citationSummary1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitationTitle createCitationTitle() {
		CitationTitleImpl citationTitle = new CitationTitleImpl();
		return citationTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitationVersion createCitationVersion() {
		CitationVersionImpl citationVersion = new CitationVersionImpl();
		return citationVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitationWebLocation createCitationWebLocation() {
		CitationWebLocationImpl citationWebLocation = new CitationWebLocationImpl();
		return citationWebLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim createClaim() {
		ClaimImpl claim = new ClaimImpl();
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimAccident createClaimAccident() {
		ClaimAccidentImpl claimAccident = new ClaimAccidentImpl();
		return claimAccident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimBodySite createClaimBodySite() {
		ClaimBodySiteImpl claimBodySite = new ClaimBodySiteImpl();
		return claimBodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimCareTeam createClaimCareTeam() {
		ClaimCareTeamImpl claimCareTeam = new ClaimCareTeamImpl();
		return claimCareTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimDetail createClaimDetail() {
		ClaimDetailImpl claimDetail = new ClaimDetailImpl();
		return claimDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimDiagnosis createClaimDiagnosis() {
		ClaimDiagnosisImpl claimDiagnosis = new ClaimDiagnosisImpl();
		return claimDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimEvent createClaimEvent() {
		ClaimEventImpl claimEvent = new ClaimEventImpl();
		return claimEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimInsurance createClaimInsurance() {
		ClaimInsuranceImpl claimInsurance = new ClaimInsuranceImpl();
		return claimInsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimItem createClaimItem() {
		ClaimItemImpl claimItem = new ClaimItemImpl();
		return claimItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimPayee createClaimPayee() {
		ClaimPayeeImpl claimPayee = new ClaimPayeeImpl();
		return claimPayee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimProcedure createClaimProcedure() {
		ClaimProcedureImpl claimProcedure = new ClaimProcedureImpl();
		return claimProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimProcessingCodes createClaimProcessingCodes() {
		ClaimProcessingCodesImpl claimProcessingCodes = new ClaimProcessingCodesImpl();
		return claimProcessingCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimRelated createClaimRelated() {
		ClaimRelatedImpl claimRelated = new ClaimRelatedImpl();
		return claimRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponse createClaimResponse() {
		ClaimResponseImpl claimResponse = new ClaimResponseImpl();
		return claimResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseAddItem createClaimResponseAddItem() {
		ClaimResponseAddItemImpl claimResponseAddItem = new ClaimResponseAddItemImpl();
		return claimResponseAddItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseAdjudication createClaimResponseAdjudication() {
		ClaimResponseAdjudicationImpl claimResponseAdjudication = new ClaimResponseAdjudicationImpl();
		return claimResponseAdjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseBodySite createClaimResponseBodySite() {
		ClaimResponseBodySiteImpl claimResponseBodySite = new ClaimResponseBodySiteImpl();
		return claimResponseBodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseDetail createClaimResponseDetail() {
		ClaimResponseDetailImpl claimResponseDetail = new ClaimResponseDetailImpl();
		return claimResponseDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseDetail1 createClaimResponseDetail1() {
		ClaimResponseDetail1Impl claimResponseDetail1 = new ClaimResponseDetail1Impl();
		return claimResponseDetail1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseError createClaimResponseError() {
		ClaimResponseErrorImpl claimResponseError = new ClaimResponseErrorImpl();
		return claimResponseError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseEvent createClaimResponseEvent() {
		ClaimResponseEventImpl claimResponseEvent = new ClaimResponseEventImpl();
		return claimResponseEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseInsurance createClaimResponseInsurance() {
		ClaimResponseInsuranceImpl claimResponseInsurance = new ClaimResponseInsuranceImpl();
		return claimResponseInsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseItem createClaimResponseItem() {
		ClaimResponseItemImpl claimResponseItem = new ClaimResponseItemImpl();
		return claimResponseItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponsePayment createClaimResponsePayment() {
		ClaimResponsePaymentImpl claimResponsePayment = new ClaimResponsePaymentImpl();
		return claimResponsePayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseProcessNote createClaimResponseProcessNote() {
		ClaimResponseProcessNoteImpl claimResponseProcessNote = new ClaimResponseProcessNoteImpl();
		return claimResponseProcessNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseReviewOutcome createClaimResponseReviewOutcome() {
		ClaimResponseReviewOutcomeImpl claimResponseReviewOutcome = new ClaimResponseReviewOutcomeImpl();
		return claimResponseReviewOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseSubDetail createClaimResponseSubDetail() {
		ClaimResponseSubDetailImpl claimResponseSubDetail = new ClaimResponseSubDetailImpl();
		return claimResponseSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseSubDetail1 createClaimResponseSubDetail1() {
		ClaimResponseSubDetail1Impl claimResponseSubDetail1 = new ClaimResponseSubDetail1Impl();
		return claimResponseSubDetail1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseTotal createClaimResponseTotal() {
		ClaimResponseTotalImpl claimResponseTotal = new ClaimResponseTotalImpl();
		return claimResponseTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimSubDetail createClaimSubDetail() {
		ClaimSubDetailImpl claimSubDetail = new ClaimSubDetailImpl();
		return claimSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimSupportingInfo createClaimSupportingInfo() {
		ClaimSupportingInfoImpl claimSupportingInfo = new ClaimSupportingInfoImpl();
		return claimSupportingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpression createClinicalImpression() {
		ClinicalImpressionImpl clinicalImpression = new ClinicalImpressionImpl();
		return clinicalImpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionFinding createClinicalImpressionFinding() {
		ClinicalImpressionFindingImpl clinicalImpressionFinding = new ClinicalImpressionFindingImpl();
		return clinicalImpressionFinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalUseDefinition createClinicalUseDefinition() {
		ClinicalUseDefinitionImpl clinicalUseDefinition = new ClinicalUseDefinitionImpl();
		return clinicalUseDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalUseDefinitionContraindication createClinicalUseDefinitionContraindication() {
		ClinicalUseDefinitionContraindicationImpl clinicalUseDefinitionContraindication = new ClinicalUseDefinitionContraindicationImpl();
		return clinicalUseDefinitionContraindication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalUseDefinitionIndication createClinicalUseDefinitionIndication() {
		ClinicalUseDefinitionIndicationImpl clinicalUseDefinitionIndication = new ClinicalUseDefinitionIndicationImpl();
		return clinicalUseDefinitionIndication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalUseDefinitionInteractant createClinicalUseDefinitionInteractant() {
		ClinicalUseDefinitionInteractantImpl clinicalUseDefinitionInteractant = new ClinicalUseDefinitionInteractantImpl();
		return clinicalUseDefinitionInteractant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalUseDefinitionInteraction createClinicalUseDefinitionInteraction() {
		ClinicalUseDefinitionInteractionImpl clinicalUseDefinitionInteraction = new ClinicalUseDefinitionInteractionImpl();
		return clinicalUseDefinitionInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalUseDefinitionOtherTherapy createClinicalUseDefinitionOtherTherapy() {
		ClinicalUseDefinitionOtherTherapyImpl clinicalUseDefinitionOtherTherapy = new ClinicalUseDefinitionOtherTherapyImpl();
		return clinicalUseDefinitionOtherTherapy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalUseDefinitionType createClinicalUseDefinitionType() {
		ClinicalUseDefinitionTypeImpl clinicalUseDefinitionType = new ClinicalUseDefinitionTypeImpl();
		return clinicalUseDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalUseDefinitionUndesirableEffect createClinicalUseDefinitionUndesirableEffect() {
		ClinicalUseDefinitionUndesirableEffectImpl clinicalUseDefinitionUndesirableEffect = new ClinicalUseDefinitionUndesirableEffectImpl();
		return clinicalUseDefinitionUndesirableEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalUseDefinitionWarning createClinicalUseDefinitionWarning() {
		ClinicalUseDefinitionWarningImpl clinicalUseDefinitionWarning = new ClinicalUseDefinitionWarningImpl();
		return clinicalUseDefinitionWarning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept createCodeableConcept() {
		CodeableConceptImpl codeableConcept = new CodeableConceptImpl();
		return codeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableReference createCodeableReference() {
		CodeableReferenceImpl codeableReference = new CodeableReferenceImpl();
		return codeableReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSearchSupport createCodeSearchSupport() {
		CodeSearchSupportImpl codeSearchSupport = new CodeSearchSupportImpl();
		return codeSearchSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystem createCodeSystem() {
		CodeSystemImpl codeSystem = new CodeSystemImpl();
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemConcept createCodeSystemConcept() {
		CodeSystemConceptImpl codeSystemConcept = new CodeSystemConceptImpl();
		return codeSystemConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemContentMode createCodeSystemContentMode() {
		CodeSystemContentModeImpl codeSystemContentMode = new CodeSystemContentModeImpl();
		return codeSystemContentMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemDesignation createCodeSystemDesignation() {
		CodeSystemDesignationImpl codeSystemDesignation = new CodeSystemDesignationImpl();
		return codeSystemDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemFilter createCodeSystemFilter() {
		CodeSystemFilterImpl codeSystemFilter = new CodeSystemFilterImpl();
		return codeSystemFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemHierarchyMeaning createCodeSystemHierarchyMeaning() {
		CodeSystemHierarchyMeaningImpl codeSystemHierarchyMeaning = new CodeSystemHierarchyMeaningImpl();
		return codeSystemHierarchyMeaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemProperty createCodeSystemProperty() {
		CodeSystemPropertyImpl codeSystemProperty = new CodeSystemPropertyImpl();
		return codeSystemProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemProperty1 createCodeSystemProperty1() {
		CodeSystemProperty1Impl codeSystemProperty1 = new CodeSystemProperty1Impl();
		return codeSystemProperty1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding createCoding() {
		CodingImpl coding = new CodingImpl();
		return coding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorCodesOrRGB createColorCodesOrRGB() {
		ColorCodesOrRGBImpl colorCodesOrRGB = new ColorCodesOrRGBImpl();
		return colorCodesOrRGB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonLanguages createCommonLanguages() {
		CommonLanguagesImpl commonLanguages = new CommonLanguagesImpl();
		return commonLanguages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communication createCommunication() {
		CommunicationImpl communication = new CommunicationImpl();
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPayload createCommunicationPayload() {
		CommunicationPayloadImpl communicationPayload = new CommunicationPayloadImpl();
		return communicationPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequest createCommunicationRequest() {
		CommunicationRequestImpl communicationRequest = new CommunicationRequestImpl();
		return communicationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequestPayload createCommunicationRequestPayload() {
		CommunicationRequestPayloadImpl communicationRequestPayload = new CommunicationRequestPayloadImpl();
		return communicationRequestPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentDefinition createCompartmentDefinition() {
		CompartmentDefinitionImpl compartmentDefinition = new CompartmentDefinitionImpl();
		return compartmentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentDefinitionResource createCompartmentDefinitionResource() {
		CompartmentDefinitionResourceImpl compartmentDefinitionResource = new CompartmentDefinitionResourceImpl();
		return compartmentDefinitionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentType createCompartmentType() {
		CompartmentTypeImpl compartmentType = new CompartmentTypeImpl();
		return compartmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionAttester createCompositionAttester() {
		CompositionAttesterImpl compositionAttester = new CompositionAttesterImpl();
		return compositionAttester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionEvent createCompositionEvent() {
		CompositionEventImpl compositionEvent = new CompositionEventImpl();
		return compositionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionSection createCompositionSection() {
		CompositionSectionImpl compositionSection = new CompositionSectionImpl();
		return compositionSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionStatus createCompositionStatus() {
		CompositionStatusImpl compositionStatus = new CompositionStatusImpl();
		return compositionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMap createConceptMap() {
		ConceptMapImpl conceptMap = new ConceptMapImpl();
		return conceptMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapAdditionalAttribute createConceptMapAdditionalAttribute() {
		ConceptMapAdditionalAttributeImpl conceptMapAdditionalAttribute = new ConceptMapAdditionalAttributeImpl();
		return conceptMapAdditionalAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapAttributeType createConceptMapAttributeType() {
		ConceptMapAttributeTypeImpl conceptMapAttributeType = new ConceptMapAttributeTypeImpl();
		return conceptMapAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapDependsOn createConceptMapDependsOn() {
		ConceptMapDependsOnImpl conceptMapDependsOn = new ConceptMapDependsOnImpl();
		return conceptMapDependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapElement createConceptMapElement() {
		ConceptMapElementImpl conceptMapElement = new ConceptMapElementImpl();
		return conceptMapElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapGroup createConceptMapGroup() {
		ConceptMapGroupImpl conceptMapGroup = new ConceptMapGroupImpl();
		return conceptMapGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapGroupUnmappedMode createConceptMapGroupUnmappedMode() {
		ConceptMapGroupUnmappedModeImpl conceptMapGroupUnmappedMode = new ConceptMapGroupUnmappedModeImpl();
		return conceptMapGroupUnmappedMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapProperty createConceptMapProperty() {
		ConceptMapPropertyImpl conceptMapProperty = new ConceptMapPropertyImpl();
		return conceptMapProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapProperty1 createConceptMapProperty1() {
		ConceptMapProperty1Impl conceptMapProperty1 = new ConceptMapProperty1Impl();
		return conceptMapProperty1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapPropertyType createConceptMapPropertyType() {
		ConceptMapPropertyTypeImpl conceptMapPropertyType = new ConceptMapPropertyTypeImpl();
		return conceptMapPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapRelationship createConceptMapRelationship() {
		ConceptMapRelationshipImpl conceptMapRelationship = new ConceptMapRelationshipImpl();
		return conceptMapRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapTarget createConceptMapTarget() {
		ConceptMapTargetImpl conceptMapTarget = new ConceptMapTargetImpl();
		return conceptMapTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapUnmapped createConceptMapUnmapped() {
		ConceptMapUnmappedImpl conceptMapUnmapped = new ConceptMapUnmappedImpl();
		return conceptMapUnmapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteFHIRTypes createConcreteFHIRTypes() {
		ConcreteFHIRTypesImpl concreteFHIRTypes = new ConcreteFHIRTypesImpl();
		return concreteFHIRTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalDeleteStatus createConditionalDeleteStatus() {
		ConditionalDeleteStatusImpl conditionalDeleteStatus = new ConditionalDeleteStatusImpl();
		return conditionalDeleteStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalReadStatus createConditionalReadStatus() {
		ConditionalReadStatusImpl conditionalReadStatus = new ConditionalReadStatusImpl();
		return conditionalReadStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionDefinition createConditionDefinition() {
		ConditionDefinitionImpl conditionDefinition = new ConditionDefinitionImpl();
		return conditionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionDefinitionMedication createConditionDefinitionMedication() {
		ConditionDefinitionMedicationImpl conditionDefinitionMedication = new ConditionDefinitionMedicationImpl();
		return conditionDefinitionMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionDefinitionObservation createConditionDefinitionObservation() {
		ConditionDefinitionObservationImpl conditionDefinitionObservation = new ConditionDefinitionObservationImpl();
		return conditionDefinitionObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionDefinitionPlan createConditionDefinitionPlan() {
		ConditionDefinitionPlanImpl conditionDefinitionPlan = new ConditionDefinitionPlanImpl();
		return conditionDefinitionPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionDefinitionPrecondition createConditionDefinitionPrecondition() {
		ConditionDefinitionPreconditionImpl conditionDefinitionPrecondition = new ConditionDefinitionPreconditionImpl();
		return conditionDefinitionPrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionDefinitionQuestionnaire createConditionDefinitionQuestionnaire() {
		ConditionDefinitionQuestionnaireImpl conditionDefinitionQuestionnaire = new ConditionDefinitionQuestionnaireImpl();
		return conditionDefinitionQuestionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionParticipant createConditionParticipant() {
		ConditionParticipantImpl conditionParticipant = new ConditionParticipantImpl();
		return conditionParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionPreconditionType createConditionPreconditionType() {
		ConditionPreconditionTypeImpl conditionPreconditionType = new ConditionPreconditionTypeImpl();
		return conditionPreconditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionQuestionnairePurpose createConditionQuestionnairePurpose() {
		ConditionQuestionnairePurposeImpl conditionQuestionnairePurpose = new ConditionQuestionnairePurposeImpl();
		return conditionQuestionnairePurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionStage createConditionStage() {
		ConditionStageImpl conditionStage = new ConditionStageImpl();
		return conditionStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceExpectation createConformanceExpectation() {
		ConformanceExpectationImpl conformanceExpectation = new ConformanceExpectationImpl();
		return conformanceExpectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consent createConsent() {
		ConsentImpl consent = new ConsentImpl();
		return consent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentActor createConsentActor() {
		ConsentActorImpl consentActor = new ConsentActorImpl();
		return consentActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentData createConsentData() {
		ConsentDataImpl consentData = new ConsentDataImpl();
		return consentData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentDataMeaning createConsentDataMeaning() {
		ConsentDataMeaningImpl consentDataMeaning = new ConsentDataMeaningImpl();
		return consentDataMeaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentPolicyBasis createConsentPolicyBasis() {
		ConsentPolicyBasisImpl consentPolicyBasis = new ConsentPolicyBasisImpl();
		return consentPolicyBasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentProvision createConsentProvision() {
		ConsentProvisionImpl consentProvision = new ConsentProvisionImpl();
		return consentProvision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentProvisionType createConsentProvisionType() {
		ConsentProvisionTypeImpl consentProvisionType = new ConsentProvisionTypeImpl();
		return consentProvisionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentState createConsentState() {
		ConsentStateImpl consentState = new ConsentStateImpl();
		return consentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentVerification createConsentVerification() {
		ConsentVerificationImpl consentVerification = new ConsentVerificationImpl();
		return consentVerification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSeverity createConstraintSeverity() {
		ConstraintSeverityImpl constraintSeverity = new ConstraintSeverityImpl();
		return constraintSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactDetail createContactDetail() {
		ContactDetailImpl contactDetail = new ContactDetailImpl();
		return contactDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPoint createContactPoint() {
		ContactPointImpl contactPoint = new ContactPointImpl();
		return contactPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointSystem createContactPointSystem() {
		ContactPointSystemImpl contactPointSystem = new ContactPointSystemImpl();
		return contactPointSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointUse createContactPointUse() {
		ContactPointUseImpl contactPointUse = new ContactPointUseImpl();
		return contactPointUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contract createContract() {
		ContractImpl contract = new ContractImpl();
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractAction createContractAction() {
		ContractActionImpl contractAction = new ContractActionImpl();
		return contractAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractAnswer createContractAnswer() {
		ContractAnswerImpl contractAnswer = new ContractAnswerImpl();
		return contractAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractAsset createContractAsset() {
		ContractAssetImpl contractAsset = new ContractAssetImpl();
		return contractAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractContentDefinition createContractContentDefinition() {
		ContractContentDefinitionImpl contractContentDefinition = new ContractContentDefinitionImpl();
		return contractContentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractContext createContractContext() {
		ContractContextImpl contractContext = new ContractContextImpl();
		return contractContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractFriendly createContractFriendly() {
		ContractFriendlyImpl contractFriendly = new ContractFriendlyImpl();
		return contractFriendly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractLegal createContractLegal() {
		ContractLegalImpl contractLegal = new ContractLegalImpl();
		return contractLegal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractOffer createContractOffer() {
		ContractOfferImpl contractOffer = new ContractOfferImpl();
		return contractOffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractParty createContractParty() {
		ContractPartyImpl contractParty = new ContractPartyImpl();
		return contractParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourcePublicationStatusCodes createContractResourcePublicationStatusCodes() {
		ContractResourcePublicationStatusCodesImpl contractResourcePublicationStatusCodes = new ContractResourcePublicationStatusCodesImpl();
		return contractResourcePublicationStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourceStatusCodes createContractResourceStatusCodes() {
		ContractResourceStatusCodesImpl contractResourceStatusCodes = new ContractResourceStatusCodesImpl();
		return contractResourceStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractRule createContractRule() {
		ContractRuleImpl contractRule = new ContractRuleImpl();
		return contractRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractSecurityLabel createContractSecurityLabel() {
		ContractSecurityLabelImpl contractSecurityLabel = new ContractSecurityLabelImpl();
		return contractSecurityLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractSigner createContractSigner() {
		ContractSignerImpl contractSigner = new ContractSignerImpl();
		return contractSigner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractSubject createContractSubject() {
		ContractSubjectImpl contractSubject = new ContractSubjectImpl();
		return contractSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractTerm createContractTerm() {
		ContractTermImpl contractTerm = new ContractTermImpl();
		return contractTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractValuedItem createContractValuedItem() {
		ContractValuedItemImpl contractValuedItem = new ContractValuedItemImpl();
		return contractValuedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contributor createContributor() {
		ContributorImpl contributor = new ContributorImpl();
		return contributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributorType createContributorType() {
		ContributorTypeImpl contributorType = new ContributorTypeImpl();
		return contributorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Count createCount() {
		CountImpl count = new CountImpl();
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coverage createCoverage() {
		CoverageImpl coverage = new CoverageImpl();
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageClass createCoverageClass() {
		CoverageClassImpl coverageClass = new CoverageClassImpl();
		return coverageClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageCostToBeneficiary createCoverageCostToBeneficiary() {
		CoverageCostToBeneficiaryImpl coverageCostToBeneficiary = new CoverageCostToBeneficiaryImpl();
		return coverageCostToBeneficiary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageEligibilityRequest createCoverageEligibilityRequest() {
		CoverageEligibilityRequestImpl coverageEligibilityRequest = new CoverageEligibilityRequestImpl();
		return coverageEligibilityRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageEligibilityRequestDiagnosis createCoverageEligibilityRequestDiagnosis() {
		CoverageEligibilityRequestDiagnosisImpl coverageEligibilityRequestDiagnosis = new CoverageEligibilityRequestDiagnosisImpl();
		return coverageEligibilityRequestDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageEligibilityRequestEvent createCoverageEligibilityRequestEvent() {
		CoverageEligibilityRequestEventImpl coverageEligibilityRequestEvent = new CoverageEligibilityRequestEventImpl();
		return coverageEligibilityRequestEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageEligibilityRequestInsurance createCoverageEligibilityRequestInsurance() {
		CoverageEligibilityRequestInsuranceImpl coverageEligibilityRequestInsurance = new CoverageEligibilityRequestInsuranceImpl();
		return coverageEligibilityRequestInsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageEligibilityRequestItem createCoverageEligibilityRequestItem() {
		CoverageEligibilityRequestItemImpl coverageEligibilityRequestItem = new CoverageEligibilityRequestItemImpl();
		return coverageEligibilityRequestItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageEligibilityRequestSupportingInfo createCoverageEligibilityRequestSupportingInfo() {
		CoverageEligibilityRequestSupportingInfoImpl coverageEligibilityRequestSupportingInfo = new CoverageEligibilityRequestSupportingInfoImpl();
		return coverageEligibilityRequestSupportingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageEligibilityResponse createCoverageEligibilityResponse() {
		CoverageEligibilityResponseImpl coverageEligibilityResponse = new CoverageEligibilityResponseImpl();
		return coverageEligibilityResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageEligibilityResponseBenefit createCoverageEligibilityResponseBenefit() {
		CoverageEligibilityResponseBenefitImpl coverageEligibilityResponseBenefit = new CoverageEligibilityResponseBenefitImpl();
		return coverageEligibilityResponseBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageEligibilityResponseError createCoverageEligibilityResponseError() {
		CoverageEligibilityResponseErrorImpl coverageEligibilityResponseError = new CoverageEligibilityResponseErrorImpl();
		return coverageEligibilityResponseError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageEligibilityResponseEvent createCoverageEligibilityResponseEvent() {
		CoverageEligibilityResponseEventImpl coverageEligibilityResponseEvent = new CoverageEligibilityResponseEventImpl();
		return coverageEligibilityResponseEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageEligibilityResponseInsurance createCoverageEligibilityResponseInsurance() {
		CoverageEligibilityResponseInsuranceImpl coverageEligibilityResponseInsurance = new CoverageEligibilityResponseInsuranceImpl();
		return coverageEligibilityResponseInsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageEligibilityResponseItem createCoverageEligibilityResponseItem() {
		CoverageEligibilityResponseItemImpl coverageEligibilityResponseItem = new CoverageEligibilityResponseItemImpl();
		return coverageEligibilityResponseItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageException createCoverageException() {
		CoverageExceptionImpl coverageException = new CoverageExceptionImpl();
		return coverageException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoveragePaymentBy createCoveragePaymentBy() {
		CoveragePaymentByImpl coveragePaymentBy = new CoveragePaymentByImpl();
		return coveragePaymentBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriteriaNotExistsBehavior createCriteriaNotExistsBehavior() {
		CriteriaNotExistsBehaviorImpl criteriaNotExistsBehavior = new CriteriaNotExistsBehaviorImpl();
		return criteriaNotExistsBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRequirement createDataRequirement() {
		DataRequirementImpl dataRequirement = new DataRequirementImpl();
		return dataRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRequirementCodeFilter createDataRequirementCodeFilter() {
		DataRequirementCodeFilterImpl dataRequirementCodeFilter = new DataRequirementCodeFilterImpl();
		return dataRequirementCodeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRequirementDateFilter createDataRequirementDateFilter() {
		DataRequirementDateFilterImpl dataRequirementDateFilter = new DataRequirementDateFilterImpl();
		return dataRequirementDateFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRequirementSort createDataRequirementSort() {
		DataRequirementSortImpl dataRequirementSort = new DataRequirementSortImpl();
		return dataRequirementSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRequirementValueFilter createDataRequirementValueFilter() {
		DataRequirementValueFilterImpl dataRequirementValueFilter = new DataRequirementValueFilterImpl();
		return dataRequirementValueFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime createDateTime() {
		DateTimeImpl dateTime = new DateTimeImpl();
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal createDecimal() {
		DecimalImpl decimal = new DecimalImpl();
		return decimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionResourceTypes createDefinitionResourceTypes() {
		DefinitionResourceTypesImpl definitionResourceTypes = new DefinitionResourceTypesImpl();
		return definitionResourceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssue createDetectedIssue() {
		DetectedIssueImpl detectedIssue = new DetectedIssueImpl();
		return detectedIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueEvidence createDetectedIssueEvidence() {
		DetectedIssueEvidenceImpl detectedIssueEvidence = new DetectedIssueEvidenceImpl();
		return detectedIssueEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueMitigation createDetectedIssueMitigation() {
		DetectedIssueMitigationImpl detectedIssueMitigation = new DetectedIssueMitigationImpl();
		return detectedIssueMitigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueSeverity createDetectedIssueSeverity() {
		DetectedIssueSeverityImpl detectedIssueSeverity = new DetectedIssueSeverityImpl();
		return detectedIssueSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueStatus createDetectedIssueStatus() {
		DetectedIssueStatusImpl detectedIssueStatus = new DetectedIssueStatusImpl();
		return detectedIssueStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceAssociation createDeviceAssociation() {
		DeviceAssociationImpl deviceAssociation = new DeviceAssociationImpl();
		return deviceAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceAssociationOperation createDeviceAssociationOperation() {
		DeviceAssociationOperationImpl deviceAssociationOperation = new DeviceAssociationOperationImpl();
		return deviceAssociationOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceConformsTo createDeviceConformsTo() {
		DeviceConformsToImpl deviceConformsTo = new DeviceConformsToImpl();
		return deviceConformsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceCorrectiveActionScope createDeviceCorrectiveActionScope() {
		DeviceCorrectiveActionScopeImpl deviceCorrectiveActionScope = new DeviceCorrectiveActionScopeImpl();
		return deviceCorrectiveActionScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDefinition createDeviceDefinition() {
		DeviceDefinitionImpl deviceDefinition = new DeviceDefinitionImpl();
		return deviceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDefinitionChargeItem createDeviceDefinitionChargeItem() {
		DeviceDefinitionChargeItemImpl deviceDefinitionChargeItem = new DeviceDefinitionChargeItemImpl();
		return deviceDefinitionChargeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDefinitionClassification createDeviceDefinitionClassification() {
		DeviceDefinitionClassificationImpl deviceDefinitionClassification = new DeviceDefinitionClassificationImpl();
		return deviceDefinitionClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDefinitionConformsTo createDeviceDefinitionConformsTo() {
		DeviceDefinitionConformsToImpl deviceDefinitionConformsTo = new DeviceDefinitionConformsToImpl();
		return deviceDefinitionConformsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDefinitionCorrectiveAction createDeviceDefinitionCorrectiveAction() {
		DeviceDefinitionCorrectiveActionImpl deviceDefinitionCorrectiveAction = new DeviceDefinitionCorrectiveActionImpl();
		return deviceDefinitionCorrectiveAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDefinitionDeviceName createDeviceDefinitionDeviceName() {
		DeviceDefinitionDeviceNameImpl deviceDefinitionDeviceName = new DeviceDefinitionDeviceNameImpl();
		return deviceDefinitionDeviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDefinitionDistributor createDeviceDefinitionDistributor() {
		DeviceDefinitionDistributorImpl deviceDefinitionDistributor = new DeviceDefinitionDistributorImpl();
		return deviceDefinitionDistributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDefinitionGuideline createDeviceDefinitionGuideline() {
		DeviceDefinitionGuidelineImpl deviceDefinitionGuideline = new DeviceDefinitionGuidelineImpl();
		return deviceDefinitionGuideline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDefinitionHasPart createDeviceDefinitionHasPart() {
		DeviceDefinitionHasPartImpl deviceDefinitionHasPart = new DeviceDefinitionHasPartImpl();
		return deviceDefinitionHasPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDefinitionLink createDeviceDefinitionLink() {
		DeviceDefinitionLinkImpl deviceDefinitionLink = new DeviceDefinitionLinkImpl();
		return deviceDefinitionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDefinitionMarketDistribution createDeviceDefinitionMarketDistribution() {
		DeviceDefinitionMarketDistributionImpl deviceDefinitionMarketDistribution = new DeviceDefinitionMarketDistributionImpl();
		return deviceDefinitionMarketDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDefinitionMaterial createDeviceDefinitionMaterial() {
		DeviceDefinitionMaterialImpl deviceDefinitionMaterial = new DeviceDefinitionMaterialImpl();
		return deviceDefinitionMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDefinitionPackaging createDeviceDefinitionPackaging() {
		DeviceDefinitionPackagingImpl deviceDefinitionPackaging = new DeviceDefinitionPackagingImpl();
		return deviceDefinitionPackaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDefinitionProperty createDeviceDefinitionProperty() {
		DeviceDefinitionPropertyImpl deviceDefinitionProperty = new DeviceDefinitionPropertyImpl();
		return deviceDefinitionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDefinitionRegulatoryIdentifier createDeviceDefinitionRegulatoryIdentifier() {
		DeviceDefinitionRegulatoryIdentifierImpl deviceDefinitionRegulatoryIdentifier = new DeviceDefinitionRegulatoryIdentifierImpl();
		return deviceDefinitionRegulatoryIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDefinitionRegulatoryIdentifierType createDeviceDefinitionRegulatoryIdentifierType() {
		DeviceDefinitionRegulatoryIdentifierTypeImpl deviceDefinitionRegulatoryIdentifierType = new DeviceDefinitionRegulatoryIdentifierTypeImpl();
		return deviceDefinitionRegulatoryIdentifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDefinitionUdiDeviceIdentifier createDeviceDefinitionUdiDeviceIdentifier() {
		DeviceDefinitionUdiDeviceIdentifierImpl deviceDefinitionUdiDeviceIdentifier = new DeviceDefinitionUdiDeviceIdentifierImpl();
		return deviceDefinitionUdiDeviceIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDefinitionVersion createDeviceDefinitionVersion() {
		DeviceDefinitionVersionImpl deviceDefinitionVersion = new DeviceDefinitionVersionImpl();
		return deviceDefinitionVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDispense createDeviceDispense() {
		DeviceDispenseImpl deviceDispense = new DeviceDispenseImpl();
		return deviceDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDispensePerformer createDeviceDispensePerformer() {
		DeviceDispensePerformerImpl deviceDispensePerformer = new DeviceDispensePerformerImpl();
		return deviceDispensePerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDispenseStatusCodes createDeviceDispenseStatusCodes() {
		DeviceDispenseStatusCodesImpl deviceDispenseStatusCodes = new DeviceDispenseStatusCodesImpl();
		return deviceDispenseStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetric createDeviceMetric() {
		DeviceMetricImpl deviceMetric = new DeviceMetricImpl();
		return deviceMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibration createDeviceMetricCalibration() {
		DeviceMetricCalibrationImpl deviceMetricCalibration = new DeviceMetricCalibrationImpl();
		return deviceMetricCalibration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationState createDeviceMetricCalibrationState() {
		DeviceMetricCalibrationStateImpl deviceMetricCalibrationState = new DeviceMetricCalibrationStateImpl();
		return deviceMetricCalibrationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationType createDeviceMetricCalibrationType() {
		DeviceMetricCalibrationTypeImpl deviceMetricCalibrationType = new DeviceMetricCalibrationTypeImpl();
		return deviceMetricCalibrationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCategory createDeviceMetricCategory() {
		DeviceMetricCategoryImpl deviceMetricCategory = new DeviceMetricCategoryImpl();
		return deviceMetricCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricOperationalStatus createDeviceMetricOperationalStatus() {
		DeviceMetricOperationalStatusImpl deviceMetricOperationalStatus = new DeviceMetricOperationalStatusImpl();
		return deviceMetricOperationalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceName createDeviceName() {
		DeviceNameImpl deviceName = new DeviceNameImpl();
		return deviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceNameType createDeviceNameType() {
		DeviceNameTypeImpl deviceNameType = new DeviceNameTypeImpl();
		return deviceNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceProductionIdentifierInUDI createDeviceProductionIdentifierInUDI() {
		DeviceProductionIdentifierInUDIImpl deviceProductionIdentifierInUDI = new DeviceProductionIdentifierInUDIImpl();
		return deviceProductionIdentifierInUDI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceProperty createDeviceProperty() {
		DevicePropertyImpl deviceProperty = new DevicePropertyImpl();
		return deviceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceRequest createDeviceRequest() {
		DeviceRequestImpl deviceRequest = new DeviceRequestImpl();
		return deviceRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceRequestParameter createDeviceRequestParameter() {
		DeviceRequestParameterImpl deviceRequestParameter = new DeviceRequestParameterImpl();
		return deviceRequestParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUdiCarrier createDeviceUdiCarrier() {
		DeviceUdiCarrierImpl deviceUdiCarrier = new DeviceUdiCarrierImpl();
		return deviceUdiCarrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUsage createDeviceUsage() {
		DeviceUsageImpl deviceUsage = new DeviceUsageImpl();
		return deviceUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUsageAdherence createDeviceUsageAdherence() {
		DeviceUsageAdherenceImpl deviceUsageAdherence = new DeviceUsageAdherenceImpl();
		return deviceUsageAdherence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUsageStatus createDeviceUsageStatus() {
		DeviceUsageStatusImpl deviceUsageStatus = new DeviceUsageStatusImpl();
		return deviceUsageStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceVersion createDeviceVersion() {
		DeviceVersionImpl deviceVersion = new DeviceVersionImpl();
		return deviceVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReport createDiagnosticReport() {
		DiagnosticReportImpl diagnosticReport = new DiagnosticReportImpl();
		return diagnosticReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportMedia createDiagnosticReportMedia() {
		DiagnosticReportMediaImpl diagnosticReportMedia = new DiagnosticReportMediaImpl();
		return diagnosticReportMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportStatus createDiagnosticReportStatus() {
		DiagnosticReportStatusImpl diagnosticReportStatus = new DiagnosticReportStatusImpl();
		return diagnosticReportStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportSupportingInfo createDiagnosticReportSupportingInfo() {
		DiagnosticReportSupportingInfoImpl diagnosticReportSupportingInfo = new DiagnosticReportSupportingInfoImpl();
		return diagnosticReportSupportingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscriminatorType createDiscriminatorType() {
		DiscriminatorTypeImpl discriminatorType = new DiscriminatorTypeImpl();
		return discriminatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distance createDistance() {
		DistanceImpl distance = new DistanceImpl();
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentMode createDocumentMode() {
		DocumentModeImpl documentMode = new DocumentModeImpl();
		return documentMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReference createDocumentReference() {
		DocumentReferenceImpl documentReference = new DocumentReferenceImpl();
		return documentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceAttester createDocumentReferenceAttester() {
		DocumentReferenceAttesterImpl documentReferenceAttester = new DocumentReferenceAttesterImpl();
		return documentReferenceAttester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceContent createDocumentReferenceContent() {
		DocumentReferenceContentImpl documentReferenceContent = new DocumentReferenceContentImpl();
		return documentReferenceContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceProfile createDocumentReferenceProfile() {
		DocumentReferenceProfileImpl documentReferenceProfile = new DocumentReferenceProfileImpl();
		return documentReferenceProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceRelatesTo createDocumentReferenceRelatesTo() {
		DocumentReferenceRelatesToImpl documentReferenceRelatesTo = new DocumentReferenceRelatesToImpl();
		return documentReferenceRelatesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceStatus createDocumentReferenceStatus() {
		DocumentReferenceStatusImpl documentReferenceStatus = new DocumentReferenceStatusImpl();
		return documentReferenceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainResource createDomainResource() {
		DomainResourceImpl domainResource = new DomainResourceImpl();
		return domainResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dosage createDosage() {
		DosageImpl dosage = new DosageImpl();
		return dosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DosageDoseAndRate createDosageDoseAndRate() {
		DosageDoseAndRateImpl dosageDoseAndRate = new DosageDoseAndRateImpl();
		return dosageDoseAndRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDuration() {
		DurationImpl duration = new DurationImpl();
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinition createElementDefinition() {
		ElementDefinitionImpl elementDefinition = new ElementDefinitionImpl();
		return elementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionAdditional createElementDefinitionAdditional() {
		ElementDefinitionAdditionalImpl elementDefinitionAdditional = new ElementDefinitionAdditionalImpl();
		return elementDefinitionAdditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionBase createElementDefinitionBase() {
		ElementDefinitionBaseImpl elementDefinitionBase = new ElementDefinitionBaseImpl();
		return elementDefinitionBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionBinding createElementDefinitionBinding() {
		ElementDefinitionBindingImpl elementDefinitionBinding = new ElementDefinitionBindingImpl();
		return elementDefinitionBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionConstraint createElementDefinitionConstraint() {
		ElementDefinitionConstraintImpl elementDefinitionConstraint = new ElementDefinitionConstraintImpl();
		return elementDefinitionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionDiscriminator createElementDefinitionDiscriminator() {
		ElementDefinitionDiscriminatorImpl elementDefinitionDiscriminator = new ElementDefinitionDiscriminatorImpl();
		return elementDefinitionDiscriminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionExample createElementDefinitionExample() {
		ElementDefinitionExampleImpl elementDefinitionExample = new ElementDefinitionExampleImpl();
		return elementDefinitionExample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionMapping createElementDefinitionMapping() {
		ElementDefinitionMappingImpl elementDefinitionMapping = new ElementDefinitionMappingImpl();
		return elementDefinitionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionSlicing createElementDefinitionSlicing() {
		ElementDefinitionSlicingImpl elementDefinitionSlicing = new ElementDefinitionSlicingImpl();
		return elementDefinitionSlicing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionType createElementDefinitionType() {
		ElementDefinitionTypeImpl elementDefinitionType = new ElementDefinitionTypeImpl();
		return elementDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityOutcome createEligibilityOutcome() {
		EligibilityOutcomeImpl eligibilityOutcome = new EligibilityOutcomeImpl();
		return eligibilityOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityRequestPurpose createEligibilityRequestPurpose() {
		EligibilityRequestPurposeImpl eligibilityRequestPurpose = new EligibilityRequestPurposeImpl();
		return eligibilityRequestPurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponsePurpose createEligibilityResponsePurpose() {
		EligibilityResponsePurposeImpl eligibilityResponsePurpose = new EligibilityResponsePurposeImpl();
		return eligibilityResponsePurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableWhenBehavior createEnableWhenBehavior() {
		EnableWhenBehaviorImpl enableWhenBehavior = new EnableWhenBehaviorImpl();
		return enableWhenBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter createEncounter() {
		EncounterImpl encounter = new EncounterImpl();
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterAdmission createEncounterAdmission() {
		EncounterAdmissionImpl encounterAdmission = new EncounterAdmissionImpl();
		return encounterAdmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterDiagnosis createEncounterDiagnosis() {
		EncounterDiagnosisImpl encounterDiagnosis = new EncounterDiagnosisImpl();
		return encounterDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterHistory createEncounterHistory() {
		EncounterHistoryImpl encounterHistory = new EncounterHistoryImpl();
		return encounterHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterHistoryLocation createEncounterHistoryLocation() {
		EncounterHistoryLocationImpl encounterHistoryLocation = new EncounterHistoryLocationImpl();
		return encounterHistoryLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocation createEncounterLocation() {
		EncounterLocationImpl encounterLocation = new EncounterLocationImpl();
		return encounterLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocationStatus createEncounterLocationStatus() {
		EncounterLocationStatusImpl encounterLocationStatus = new EncounterLocationStatusImpl();
		return encounterLocationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterParticipant createEncounterParticipant() {
		EncounterParticipantImpl encounterParticipant = new EncounterParticipantImpl();
		return encounterParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterReason createEncounterReason() {
		EncounterReasonImpl encounterReason = new EncounterReasonImpl();
		return encounterReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterStatus createEncounterStatus() {
		EncounterStatusImpl encounterStatus = new EncounterStatusImpl();
		return encounterStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint createEndpoint() {
		EndpointImpl endpoint = new EndpointImpl();
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointPayload createEndpointPayload() {
		EndpointPayloadImpl endpointPayload = new EndpointPayloadImpl();
		return endpointPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointStatus createEndpointStatus() {
		EndpointStatusImpl endpointStatus = new EndpointStatusImpl();
		return endpointStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentOutcome createEnrollmentOutcome() {
		EnrollmentOutcomeImpl enrollmentOutcome = new EnrollmentOutcomeImpl();
		return enrollmentOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentRequest createEnrollmentRequest() {
		EnrollmentRequestImpl enrollmentRequest = new EnrollmentRequestImpl();
		return enrollmentRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentResponse createEnrollmentResponse() {
		EnrollmentResponseImpl enrollmentResponse = new EnrollmentResponseImpl();
		return enrollmentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCare createEpisodeOfCare() {
		EpisodeOfCareImpl episodeOfCare = new EpisodeOfCareImpl();
		return episodeOfCare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareDiagnosis createEpisodeOfCareDiagnosis() {
		EpisodeOfCareDiagnosisImpl episodeOfCareDiagnosis = new EpisodeOfCareDiagnosisImpl();
		return episodeOfCareDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareReason createEpisodeOfCareReason() {
		EpisodeOfCareReasonImpl episodeOfCareReason = new EpisodeOfCareReasonImpl();
		return episodeOfCareReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareStatus createEpisodeOfCareStatus() {
		EpisodeOfCareStatusImpl episodeOfCareStatus = new EpisodeOfCareStatusImpl();
		return episodeOfCareStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareStatusHistory createEpisodeOfCareStatusHistory() {
		EpisodeOfCareStatusHistoryImpl episodeOfCareStatusHistory = new EpisodeOfCareStatusHistoryImpl();
		return episodeOfCareStatusHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventCapabilityMode createEventCapabilityMode() {
		EventCapabilityModeImpl eventCapabilityMode = new EventCapabilityModeImpl();
		return eventCapabilityMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDefinition createEventDefinition() {
		EventDefinitionImpl eventDefinition = new EventDefinitionImpl();
		return eventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventResourceTypes createEventResourceTypes() {
		EventResourceTypesImpl eventResourceTypes = new EventResourceTypesImpl();
		return eventResourceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventStatus createEventStatus() {
		EventStatusImpl eventStatus = new EventStatusImpl();
		return eventStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTiming createEventTiming() {
		EventTimingImpl eventTiming = new EventTimingImpl();
		return eventTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evidence createEvidence() {
		EvidenceImpl evidence = new EvidenceImpl();
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceAttributeEstimate createEvidenceAttributeEstimate() {
		EvidenceAttributeEstimateImpl evidenceAttributeEstimate = new EvidenceAttributeEstimateImpl();
		return evidenceAttributeEstimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceCertainty createEvidenceCertainty() {
		EvidenceCertaintyImpl evidenceCertainty = new EvidenceCertaintyImpl();
		return evidenceCertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceModelCharacteristic createEvidenceModelCharacteristic() {
		EvidenceModelCharacteristicImpl evidenceModelCharacteristic = new EvidenceModelCharacteristicImpl();
		return evidenceModelCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceReport createEvidenceReport() {
		EvidenceReportImpl evidenceReport = new EvidenceReportImpl();
		return evidenceReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceReportCharacteristic createEvidenceReportCharacteristic() {
		EvidenceReportCharacteristicImpl evidenceReportCharacteristic = new EvidenceReportCharacteristicImpl();
		return evidenceReportCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceReportRelatesTo createEvidenceReportRelatesTo() {
		EvidenceReportRelatesToImpl evidenceReportRelatesTo = new EvidenceReportRelatesToImpl();
		return evidenceReportRelatesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceReportSection createEvidenceReportSection() {
		EvidenceReportSectionImpl evidenceReportSection = new EvidenceReportSectionImpl();
		return evidenceReportSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceReportSubject createEvidenceReportSubject() {
		EvidenceReportSubjectImpl evidenceReportSubject = new EvidenceReportSubjectImpl();
		return evidenceReportSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceReportTarget createEvidenceReportTarget() {
		EvidenceReportTargetImpl evidenceReportTarget = new EvidenceReportTargetImpl();
		return evidenceReportTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceSampleSize createEvidenceSampleSize() {
		EvidenceSampleSizeImpl evidenceSampleSize = new EvidenceSampleSizeImpl();
		return evidenceSampleSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceStatistic createEvidenceStatistic() {
		EvidenceStatisticImpl evidenceStatistic = new EvidenceStatisticImpl();
		return evidenceStatistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceVariable createEvidenceVariable() {
		EvidenceVariableImpl evidenceVariable = new EvidenceVariableImpl();
		return evidenceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceVariable1 createEvidenceVariable1() {
		EvidenceVariable1Impl evidenceVariable1 = new EvidenceVariable1Impl();
		return evidenceVariable1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceVariableCategory createEvidenceVariableCategory() {
		EvidenceVariableCategoryImpl evidenceVariableCategory = new EvidenceVariableCategoryImpl();
		return evidenceVariableCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceVariableCharacteristic createEvidenceVariableCharacteristic() {
		EvidenceVariableCharacteristicImpl evidenceVariableCharacteristic = new EvidenceVariableCharacteristicImpl();
		return evidenceVariableCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceVariableDefinition createEvidenceVariableDefinition() {
		EvidenceVariableDefinitionImpl evidenceVariableDefinition = new EvidenceVariableDefinitionImpl();
		return evidenceVariableDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceVariableDefinitionByCombination createEvidenceVariableDefinitionByCombination() {
		EvidenceVariableDefinitionByCombinationImpl evidenceVariableDefinitionByCombination = new EvidenceVariableDefinitionByCombinationImpl();
		return evidenceVariableDefinitionByCombination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceVariableDefinitionByTypeAndValue createEvidenceVariableDefinitionByTypeAndValue() {
		EvidenceVariableDefinitionByTypeAndValueImpl evidenceVariableDefinitionByTypeAndValue = new EvidenceVariableDefinitionByTypeAndValueImpl();
		return evidenceVariableDefinitionByTypeAndValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceVariableHandling createEvidenceVariableHandling() {
		EvidenceVariableHandlingImpl evidenceVariableHandling = new EvidenceVariableHandlingImpl();
		return evidenceVariableHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceVariableTimeFromEvent createEvidenceVariableTimeFromEvent() {
		EvidenceVariableTimeFromEventImpl evidenceVariableTimeFromEvent = new EvidenceVariableTimeFromEventImpl();
		return evidenceVariableTimeFromEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleScenario createExampleScenario() {
		ExampleScenarioImpl exampleScenario = new ExampleScenarioImpl();
		return exampleScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleScenarioActor createExampleScenarioActor() {
		ExampleScenarioActorImpl exampleScenarioActor = new ExampleScenarioActorImpl();
		return exampleScenarioActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleScenarioActorType createExampleScenarioActorType() {
		ExampleScenarioActorTypeImpl exampleScenarioActorType = new ExampleScenarioActorTypeImpl();
		return exampleScenarioActorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleScenarioAlternative createExampleScenarioAlternative() {
		ExampleScenarioAlternativeImpl exampleScenarioAlternative = new ExampleScenarioAlternativeImpl();
		return exampleScenarioAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleScenarioContainedInstance createExampleScenarioContainedInstance() {
		ExampleScenarioContainedInstanceImpl exampleScenarioContainedInstance = new ExampleScenarioContainedInstanceImpl();
		return exampleScenarioContainedInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleScenarioInstance createExampleScenarioInstance() {
		ExampleScenarioInstanceImpl exampleScenarioInstance = new ExampleScenarioInstanceImpl();
		return exampleScenarioInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleScenarioOperation createExampleScenarioOperation() {
		ExampleScenarioOperationImpl exampleScenarioOperation = new ExampleScenarioOperationImpl();
		return exampleScenarioOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleScenarioProcess createExampleScenarioProcess() {
		ExampleScenarioProcessImpl exampleScenarioProcess = new ExampleScenarioProcessImpl();
		return exampleScenarioProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleScenarioStep createExampleScenarioStep() {
		ExampleScenarioStepImpl exampleScenarioStep = new ExampleScenarioStepImpl();
		return exampleScenarioStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleScenarioVersion createExampleScenarioVersion() {
		ExampleScenarioVersionImpl exampleScenarioVersion = new ExampleScenarioVersionImpl();
		return exampleScenarioVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefit createExplanationOfBenefit() {
		ExplanationOfBenefitImpl explanationOfBenefit = new ExplanationOfBenefitImpl();
		return explanationOfBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitAccident createExplanationOfBenefitAccident() {
		ExplanationOfBenefitAccidentImpl explanationOfBenefitAccident = new ExplanationOfBenefitAccidentImpl();
		return explanationOfBenefitAccident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitAddItem createExplanationOfBenefitAddItem() {
		ExplanationOfBenefitAddItemImpl explanationOfBenefitAddItem = new ExplanationOfBenefitAddItemImpl();
		return explanationOfBenefitAddItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitAdjudication createExplanationOfBenefitAdjudication() {
		ExplanationOfBenefitAdjudicationImpl explanationOfBenefitAdjudication = new ExplanationOfBenefitAdjudicationImpl();
		return explanationOfBenefitAdjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitBenefitBalance createExplanationOfBenefitBenefitBalance() {
		ExplanationOfBenefitBenefitBalanceImpl explanationOfBenefitBenefitBalance = new ExplanationOfBenefitBenefitBalanceImpl();
		return explanationOfBenefitBenefitBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitBodySite createExplanationOfBenefitBodySite() {
		ExplanationOfBenefitBodySiteImpl explanationOfBenefitBodySite = new ExplanationOfBenefitBodySiteImpl();
		return explanationOfBenefitBodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitBodySite1 createExplanationOfBenefitBodySite1() {
		ExplanationOfBenefitBodySite1Impl explanationOfBenefitBodySite1 = new ExplanationOfBenefitBodySite1Impl();
		return explanationOfBenefitBodySite1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitCareTeam createExplanationOfBenefitCareTeam() {
		ExplanationOfBenefitCareTeamImpl explanationOfBenefitCareTeam = new ExplanationOfBenefitCareTeamImpl();
		return explanationOfBenefitCareTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitDetail createExplanationOfBenefitDetail() {
		ExplanationOfBenefitDetailImpl explanationOfBenefitDetail = new ExplanationOfBenefitDetailImpl();
		return explanationOfBenefitDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitDetail1 createExplanationOfBenefitDetail1() {
		ExplanationOfBenefitDetail1Impl explanationOfBenefitDetail1 = new ExplanationOfBenefitDetail1Impl();
		return explanationOfBenefitDetail1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitDiagnosis createExplanationOfBenefitDiagnosis() {
		ExplanationOfBenefitDiagnosisImpl explanationOfBenefitDiagnosis = new ExplanationOfBenefitDiagnosisImpl();
		return explanationOfBenefitDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitEvent createExplanationOfBenefitEvent() {
		ExplanationOfBenefitEventImpl explanationOfBenefitEvent = new ExplanationOfBenefitEventImpl();
		return explanationOfBenefitEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitFinancial createExplanationOfBenefitFinancial() {
		ExplanationOfBenefitFinancialImpl explanationOfBenefitFinancial = new ExplanationOfBenefitFinancialImpl();
		return explanationOfBenefitFinancial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitInsurance createExplanationOfBenefitInsurance() {
		ExplanationOfBenefitInsuranceImpl explanationOfBenefitInsurance = new ExplanationOfBenefitInsuranceImpl();
		return explanationOfBenefitInsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitItem createExplanationOfBenefitItem() {
		ExplanationOfBenefitItemImpl explanationOfBenefitItem = new ExplanationOfBenefitItemImpl();
		return explanationOfBenefitItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitPayee createExplanationOfBenefitPayee() {
		ExplanationOfBenefitPayeeImpl explanationOfBenefitPayee = new ExplanationOfBenefitPayeeImpl();
		return explanationOfBenefitPayee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitPayment createExplanationOfBenefitPayment() {
		ExplanationOfBenefitPaymentImpl explanationOfBenefitPayment = new ExplanationOfBenefitPaymentImpl();
		return explanationOfBenefitPayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitProcedure createExplanationOfBenefitProcedure() {
		ExplanationOfBenefitProcedureImpl explanationOfBenefitProcedure = new ExplanationOfBenefitProcedureImpl();
		return explanationOfBenefitProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitProcessNote createExplanationOfBenefitProcessNote() {
		ExplanationOfBenefitProcessNoteImpl explanationOfBenefitProcessNote = new ExplanationOfBenefitProcessNoteImpl();
		return explanationOfBenefitProcessNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitRelated createExplanationOfBenefitRelated() {
		ExplanationOfBenefitRelatedImpl explanationOfBenefitRelated = new ExplanationOfBenefitRelatedImpl();
		return explanationOfBenefitRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitReviewOutcome createExplanationOfBenefitReviewOutcome() {
		ExplanationOfBenefitReviewOutcomeImpl explanationOfBenefitReviewOutcome = new ExplanationOfBenefitReviewOutcomeImpl();
		return explanationOfBenefitReviewOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitStatus createExplanationOfBenefitStatus() {
		ExplanationOfBenefitStatusImpl explanationOfBenefitStatus = new ExplanationOfBenefitStatusImpl();
		return explanationOfBenefitStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitSubDetail createExplanationOfBenefitSubDetail() {
		ExplanationOfBenefitSubDetailImpl explanationOfBenefitSubDetail = new ExplanationOfBenefitSubDetailImpl();
		return explanationOfBenefitSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitSubDetail1 createExplanationOfBenefitSubDetail1() {
		ExplanationOfBenefitSubDetail1Impl explanationOfBenefitSubDetail1 = new ExplanationOfBenefitSubDetail1Impl();
		return explanationOfBenefitSubDetail1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitSupportingInfo createExplanationOfBenefitSupportingInfo() {
		ExplanationOfBenefitSupportingInfoImpl explanationOfBenefitSupportingInfo = new ExplanationOfBenefitSupportingInfoImpl();
		return explanationOfBenefitSupportingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitTotal createExplanationOfBenefitTotal() {
		ExplanationOfBenefitTotalImpl explanationOfBenefitTotal = new ExplanationOfBenefitTotalImpl();
		return explanationOfBenefitTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedContactDetail createExtendedContactDetail() {
		ExtendedContactDetailImpl extendedContactDetail = new ExtendedContactDetailImpl();
		return extendedContactDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionContextType createExtensionContextType() {
		ExtensionContextTypeImpl extensionContextType = new ExtensionContextTypeImpl();
		return extensionContextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryStatus createFamilyHistoryStatus() {
		FamilyHistoryStatusImpl familyHistoryStatus = new FamilyHistoryStatusImpl();
		return familyHistoryStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMemberHistory createFamilyMemberHistory() {
		FamilyMemberHistoryImpl familyMemberHistory = new FamilyMemberHistoryImpl();
		return familyMemberHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMemberHistoryCondition createFamilyMemberHistoryCondition() {
		FamilyMemberHistoryConditionImpl familyMemberHistoryCondition = new FamilyMemberHistoryConditionImpl();
		return familyMemberHistoryCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMemberHistoryParticipant createFamilyMemberHistoryParticipant() {
		FamilyMemberHistoryParticipantImpl familyMemberHistoryParticipant = new FamilyMemberHistoryParticipantImpl();
		return familyMemberHistoryParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMemberHistoryProcedure createFamilyMemberHistoryProcedure() {
		FamilyMemberHistoryProcedureImpl familyMemberHistoryProcedure = new FamilyMemberHistoryProcedureImpl();
		return familyMemberHistoryProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRDeviceStatus createFHIRDeviceStatus() {
		FHIRDeviceStatusImpl fhirDeviceStatus = new FHIRDeviceStatusImpl();
		return fhirDeviceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRPathTypes createFHIRPathTypes() {
		FHIRPathTypesImpl fhirPathTypes = new FHIRPathTypesImpl();
		return fhirPathTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRSubstanceStatus createFHIRSubstanceStatus() {
		FHIRSubstanceStatusImpl fhirSubstanceStatus = new FHIRSubstanceStatusImpl();
		return fhirSubstanceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRTypes createFHIRTypes() {
		FHIRTypesImpl fhirTypes = new FHIRTypesImpl();
		return fhirTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRVersion createFHIRVersion() {
		FHIRVersionImpl fhirVersion = new FHIRVersionImpl();
		return fhirVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperator createFilterOperator() {
		FilterOperatorImpl filterOperator = new FilterOperatorImpl();
		return filterOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialResourceStatusCodes createFinancialResourceStatusCodes() {
		FinancialResourceStatusCodesImpl financialResourceStatusCodes = new FinancialResourceStatusCodesImpl();
		return financialResourceStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flag createFlag() {
		FlagImpl flag = new FlagImpl();
		return flag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagStatus createFlagStatus() {
		FlagStatusImpl flagStatus = new FlagStatusImpl();
		return flagStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormularyItem createFormularyItem() {
		FormularyItemImpl formularyItem = new FormularyItemImpl();
		return formularyItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormularyItemStatusCodes createFormularyItemStatusCodes() {
		FormularyItemStatusCodesImpl formularyItemStatusCodes = new FormularyItemStatusCodesImpl();
		return formularyItemStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenomicStudy createGenomicStudy() {
		GenomicStudyImpl genomicStudy = new GenomicStudyImpl();
		return genomicStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenomicStudyAnalysis createGenomicStudyAnalysis() {
		GenomicStudyAnalysisImpl genomicStudyAnalysis = new GenomicStudyAnalysisImpl();
		return genomicStudyAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenomicStudyDevice createGenomicStudyDevice() {
		GenomicStudyDeviceImpl genomicStudyDevice = new GenomicStudyDeviceImpl();
		return genomicStudyDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenomicStudyInput createGenomicStudyInput() {
		GenomicStudyInputImpl genomicStudyInput = new GenomicStudyInputImpl();
		return genomicStudyInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenomicStudyOutput createGenomicStudyOutput() {
		GenomicStudyOutputImpl genomicStudyOutput = new GenomicStudyOutputImpl();
		return genomicStudyOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenomicStudyPerformer createGenomicStudyPerformer() {
		GenomicStudyPerformerImpl genomicStudyPerformer = new GenomicStudyPerformerImpl();
		return genomicStudyPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenomicStudyStatus createGenomicStudyStatus() {
		GenomicStudyStatusImpl genomicStudyStatus = new GenomicStudyStatusImpl();
		return genomicStudyStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalLifecycleStatus createGoalLifecycleStatus() {
		GoalLifecycleStatusImpl goalLifecycleStatus = new GoalLifecycleStatusImpl();
		return goalLifecycleStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalTarget createGoalTarget() {
		GoalTargetImpl goalTarget = new GoalTargetImpl();
		return goalTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphCompartmentRule createGraphCompartmentRule() {
		GraphCompartmentRuleImpl graphCompartmentRule = new GraphCompartmentRuleImpl();
		return graphCompartmentRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphCompartmentUse createGraphCompartmentUse() {
		GraphCompartmentUseImpl graphCompartmentUse = new GraphCompartmentUseImpl();
		return graphCompartmentUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphDefinition createGraphDefinition() {
		GraphDefinitionImpl graphDefinition = new GraphDefinitionImpl();
		return graphDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphDefinitionCompartment createGraphDefinitionCompartment() {
		GraphDefinitionCompartmentImpl graphDefinitionCompartment = new GraphDefinitionCompartmentImpl();
		return graphDefinitionCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphDefinitionLink createGraphDefinitionLink() {
		GraphDefinitionLinkImpl graphDefinitionLink = new GraphDefinitionLinkImpl();
		return graphDefinitionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphDefinitionNode createGraphDefinitionNode() {
		GraphDefinitionNodeImpl graphDefinitionNode = new GraphDefinitionNodeImpl();
		return graphDefinitionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupCharacteristic createGroupCharacteristic() {
		GroupCharacteristicImpl groupCharacteristic = new GroupCharacteristicImpl();
		return groupCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupMember createGroupMember() {
		GroupMemberImpl groupMember = new GroupMemberImpl();
		return groupMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupMembershipBasis createGroupMembershipBasis() {
		GroupMembershipBasisImpl groupMembershipBasis = new GroupMembershipBasisImpl();
		return groupMembershipBasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupType createGroupType() {
		GroupTypeImpl groupType = new GroupTypeImpl();
		return groupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponse createGuidanceResponse() {
		GuidanceResponseImpl guidanceResponse = new GuidanceResponseImpl();
		return guidanceResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponseStatus createGuidanceResponseStatus() {
		GuidanceResponseStatusImpl guidanceResponseStatus = new GuidanceResponseStatusImpl();
		return guidanceResponseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidePageGeneration createGuidePageGeneration() {
		GuidePageGenerationImpl guidePageGeneration = new GuidePageGenerationImpl();
		return guidePageGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareService createHealthcareService() {
		HealthcareServiceImpl healthcareService = new HealthcareServiceImpl();
		return healthcareService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareServiceEligibility createHealthcareServiceEligibility() {
		HealthcareServiceEligibilityImpl healthcareServiceEligibility = new HealthcareServiceEligibilityImpl();
		return healthcareServiceEligibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerb createHTTPVerb() {
		HTTPVerbImpl httpVerb = new HTTPVerbImpl();
		return httpVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanName createHumanName() {
		HumanNameImpl humanName = new HumanNameImpl();
		return humanName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id createId() {
		IdImpl id = new IdImpl();
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier createIdentifier() {
		IdentifierImpl identifier = new IdentifierImpl();
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierUse createIdentifierUse() {
		IdentifierUseImpl identifierUse = new IdentifierUseImpl();
		return identifierUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityAssuranceLevel createIdentityAssuranceLevel() {
		IdentityAssuranceLevelImpl identityAssuranceLevel = new IdentityAssuranceLevelImpl();
		return identityAssuranceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingSelection createImagingSelection() {
		ImagingSelectionImpl imagingSelection = new ImagingSelectionImpl();
		return imagingSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingSelectionDGraphicType createImagingSelectionDGraphicType() {
		ImagingSelectionDGraphicTypeImpl imagingSelectionDGraphicType = new ImagingSelectionDGraphicTypeImpl();
		return imagingSelectionDGraphicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingSelectionImageRegion2D createImagingSelectionImageRegion2D() {
		ImagingSelectionImageRegion2DImpl imagingSelectionImageRegion2D = new ImagingSelectionImageRegion2DImpl();
		return imagingSelectionImageRegion2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingSelectionImageRegion3D createImagingSelectionImageRegion3D() {
		ImagingSelectionImageRegion3DImpl imagingSelectionImageRegion3D = new ImagingSelectionImageRegion3DImpl();
		return imagingSelectionImageRegion3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingSelectionInstance createImagingSelectionInstance() {
		ImagingSelectionInstanceImpl imagingSelectionInstance = new ImagingSelectionInstanceImpl();
		return imagingSelectionInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingSelectionPerformer createImagingSelectionPerformer() {
		ImagingSelectionPerformerImpl imagingSelectionPerformer = new ImagingSelectionPerformerImpl();
		return imagingSelectionPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingSelectionStatus createImagingSelectionStatus() {
		ImagingSelectionStatusImpl imagingSelectionStatus = new ImagingSelectionStatusImpl();
		return imagingSelectionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudy createImagingStudy() {
		ImagingStudyImpl imagingStudy = new ImagingStudyImpl();
		return imagingStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudyInstance createImagingStudyInstance() {
		ImagingStudyInstanceImpl imagingStudyInstance = new ImagingStudyInstanceImpl();
		return imagingStudyInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudyPerformer createImagingStudyPerformer() {
		ImagingStudyPerformerImpl imagingStudyPerformer = new ImagingStudyPerformerImpl();
		return imagingStudyPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudySeries createImagingStudySeries() {
		ImagingStudySeriesImpl imagingStudySeries = new ImagingStudySeriesImpl();
		return imagingStudySeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudyStatus createImagingStudyStatus() {
		ImagingStudyStatusImpl imagingStudyStatus = new ImagingStudyStatusImpl();
		return imagingStudyStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Immunization createImmunization() {
		ImmunizationImpl immunization = new ImmunizationImpl();
		return immunization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationEvaluation createImmunizationEvaluation() {
		ImmunizationEvaluationImpl immunizationEvaluation = new ImmunizationEvaluationImpl();
		return immunizationEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationEvaluationStatusCodes createImmunizationEvaluationStatusCodes() {
		ImmunizationEvaluationStatusCodesImpl immunizationEvaluationStatusCodes = new ImmunizationEvaluationStatusCodesImpl();
		return immunizationEvaluationStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationPerformer createImmunizationPerformer() {
		ImmunizationPerformerImpl immunizationPerformer = new ImmunizationPerformerImpl();
		return immunizationPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationProgramEligibility createImmunizationProgramEligibility() {
		ImmunizationProgramEligibilityImpl immunizationProgramEligibility = new ImmunizationProgramEligibilityImpl();
		return immunizationProgramEligibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationProtocolApplied createImmunizationProtocolApplied() {
		ImmunizationProtocolAppliedImpl immunizationProtocolApplied = new ImmunizationProtocolAppliedImpl();
		return immunizationProtocolApplied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationReaction createImmunizationReaction() {
		ImmunizationReactionImpl immunizationReaction = new ImmunizationReactionImpl();
		return immunizationReaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendation createImmunizationRecommendation() {
		ImmunizationRecommendationImpl immunizationRecommendation = new ImmunizationRecommendationImpl();
		return immunizationRecommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationDateCriterion createImmunizationRecommendationDateCriterion() {
		ImmunizationRecommendationDateCriterionImpl immunizationRecommendationDateCriterion = new ImmunizationRecommendationDateCriterionImpl();
		return immunizationRecommendationDateCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationRecommendation createImmunizationRecommendationRecommendation() {
		ImmunizationRecommendationRecommendationImpl immunizationRecommendationRecommendation = new ImmunizationRecommendationRecommendationImpl();
		return immunizationRecommendationRecommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationStatusCodes createImmunizationStatusCodes() {
		ImmunizationStatusCodesImpl immunizationStatusCodes = new ImmunizationStatusCodesImpl();
		return immunizationStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuide createImplementationGuide() {
		ImplementationGuideImpl implementationGuide = new ImplementationGuideImpl();
		return implementationGuide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuideDefinition createImplementationGuideDefinition() {
		ImplementationGuideDefinitionImpl implementationGuideDefinition = new ImplementationGuideDefinitionImpl();
		return implementationGuideDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuideDependsOn createImplementationGuideDependsOn() {
		ImplementationGuideDependsOnImpl implementationGuideDependsOn = new ImplementationGuideDependsOnImpl();
		return implementationGuideDependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuideGlobal createImplementationGuideGlobal() {
		ImplementationGuideGlobalImpl implementationGuideGlobal = new ImplementationGuideGlobalImpl();
		return implementationGuideGlobal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuideGrouping createImplementationGuideGrouping() {
		ImplementationGuideGroupingImpl implementationGuideGrouping = new ImplementationGuideGroupingImpl();
		return implementationGuideGrouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuideManifest createImplementationGuideManifest() {
		ImplementationGuideManifestImpl implementationGuideManifest = new ImplementationGuideManifestImpl();
		return implementationGuideManifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuidePage createImplementationGuidePage() {
		ImplementationGuidePageImpl implementationGuidePage = new ImplementationGuidePageImpl();
		return implementationGuidePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuidePage1 createImplementationGuidePage1() {
		ImplementationGuidePage1Impl implementationGuidePage1 = new ImplementationGuidePage1Impl();
		return implementationGuidePage1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuideParameter createImplementationGuideParameter() {
		ImplementationGuideParameterImpl implementationGuideParameter = new ImplementationGuideParameterImpl();
		return implementationGuideParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuideResource createImplementationGuideResource() {
		ImplementationGuideResourceImpl implementationGuideResource = new ImplementationGuideResourceImpl();
		return implementationGuideResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuideResource1 createImplementationGuideResource1() {
		ImplementationGuideResource1Impl implementationGuideResource1 = new ImplementationGuideResource1Impl();
		return implementationGuideResource1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuideTemplate createImplementationGuideTemplate() {
		ImplementationGuideTemplateImpl implementationGuideTemplate = new ImplementationGuideTemplateImpl();
		return implementationGuideTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ingredient createIngredient() {
		IngredientImpl ingredient = new IngredientImpl();
		return ingredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IngredientManufacturer createIngredientManufacturer() {
		IngredientManufacturerImpl ingredientManufacturer = new IngredientManufacturerImpl();
		return ingredientManufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IngredientManufacturerRole createIngredientManufacturerRole() {
		IngredientManufacturerRoleImpl ingredientManufacturerRole = new IngredientManufacturerRoleImpl();
		return ingredientManufacturerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IngredientReferenceStrength createIngredientReferenceStrength() {
		IngredientReferenceStrengthImpl ingredientReferenceStrength = new IngredientReferenceStrengthImpl();
		return ingredientReferenceStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IngredientStrength createIngredientStrength() {
		IngredientStrengthImpl ingredientStrength = new IngredientStrengthImpl();
		return ingredientStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IngredientSubstance createIngredientSubstance() {
		IngredientSubstanceImpl ingredientSubstance = new IngredientSubstanceImpl();
		return ingredientSubstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant createInstant() {
		InstantImpl instant = new InstantImpl();
		return instant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsurancePlan createInsurancePlan() {
		InsurancePlanImpl insurancePlan = new InsurancePlanImpl();
		return insurancePlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsurancePlanBenefit createInsurancePlanBenefit() {
		InsurancePlanBenefitImpl insurancePlanBenefit = new InsurancePlanBenefitImpl();
		return insurancePlanBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsurancePlanBenefit1 createInsurancePlanBenefit1() {
		InsurancePlanBenefit1Impl insurancePlanBenefit1 = new InsurancePlanBenefit1Impl();
		return insurancePlanBenefit1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsurancePlanCost createInsurancePlanCost() {
		InsurancePlanCostImpl insurancePlanCost = new InsurancePlanCostImpl();
		return insurancePlanCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsurancePlanCoverage createInsurancePlanCoverage() {
		InsurancePlanCoverageImpl insurancePlanCoverage = new InsurancePlanCoverageImpl();
		return insurancePlanCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsurancePlanGeneralCost createInsurancePlanGeneralCost() {
		InsurancePlanGeneralCostImpl insurancePlanGeneralCost = new InsurancePlanGeneralCostImpl();
		return insurancePlanGeneralCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsurancePlanLimit createInsurancePlanLimit() {
		InsurancePlanLimitImpl insurancePlanLimit = new InsurancePlanLimitImpl();
		return insurancePlanLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsurancePlanPlan createInsurancePlanPlan() {
		InsurancePlanPlanImpl insurancePlanPlan = new InsurancePlanPlanImpl();
		return insurancePlanPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsurancePlanSpecificCost createInsurancePlanSpecificCost() {
		InsurancePlanSpecificCostImpl insurancePlanSpecificCost = new InsurancePlanSpecificCostImpl();
		return insurancePlanSpecificCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer64 createInteger64() {
		Integer64Impl integer64 = new Integer64Impl();
		return integer64;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionTrigger createInteractionTrigger() {
		InteractionTriggerImpl interactionTrigger = new InteractionTriggerImpl();
		return interactionTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryCountType createInventoryCountType() {
		InventoryCountTypeImpl inventoryCountType = new InventoryCountTypeImpl();
		return inventoryCountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryItem createInventoryItem() {
		InventoryItemImpl inventoryItem = new InventoryItemImpl();
		return inventoryItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryItemAssociation createInventoryItemAssociation() {
		InventoryItemAssociationImpl inventoryItemAssociation = new InventoryItemAssociationImpl();
		return inventoryItemAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryItemCharacteristic createInventoryItemCharacteristic() {
		InventoryItemCharacteristicImpl inventoryItemCharacteristic = new InventoryItemCharacteristicImpl();
		return inventoryItemCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryItemDescription createInventoryItemDescription() {
		InventoryItemDescriptionImpl inventoryItemDescription = new InventoryItemDescriptionImpl();
		return inventoryItemDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryItemInstance createInventoryItemInstance() {
		InventoryItemInstanceImpl inventoryItemInstance = new InventoryItemInstanceImpl();
		return inventoryItemInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryItemName createInventoryItemName() {
		InventoryItemNameImpl inventoryItemName = new InventoryItemNameImpl();
		return inventoryItemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryItemResponsibleOrganization createInventoryItemResponsibleOrganization() {
		InventoryItemResponsibleOrganizationImpl inventoryItemResponsibleOrganization = new InventoryItemResponsibleOrganizationImpl();
		return inventoryItemResponsibleOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryItemStatusCodes createInventoryItemStatusCodes() {
		InventoryItemStatusCodesImpl inventoryItemStatusCodes = new InventoryItemStatusCodesImpl();
		return inventoryItemStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryReport createInventoryReport() {
		InventoryReportImpl inventoryReport = new InventoryReportImpl();
		return inventoryReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryReportInventoryListing createInventoryReportInventoryListing() {
		InventoryReportInventoryListingImpl inventoryReportInventoryListing = new InventoryReportInventoryListingImpl();
		return inventoryReportInventoryListing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryReportItem createInventoryReportItem() {
		InventoryReportItemImpl inventoryReportItem = new InventoryReportItemImpl();
		return inventoryReportItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryReportStatus createInventoryReportStatus() {
		InventoryReportStatusImpl inventoryReportStatus = new InventoryReportStatusImpl();
		return inventoryReportStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoice createInvoice() {
		InvoiceImpl invoice = new InvoiceImpl();
		return invoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceLineItem createInvoiceLineItem() {
		InvoiceLineItemImpl invoiceLineItem = new InvoiceLineItemImpl();
		return invoiceLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceParticipant createInvoiceParticipant() {
		InvoiceParticipantImpl invoiceParticipant = new InvoiceParticipantImpl();
		return invoiceParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceStatus createInvoiceStatus() {
		InvoiceStatusImpl invoiceStatus = new InvoiceStatusImpl();
		return invoiceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueSeverity createIssueSeverity() {
		IssueSeverityImpl issueSeverity = new IssueSeverityImpl();
		return issueSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueType createIssueType() {
		IssueTypeImpl issueType = new IssueTypeImpl();
		return issueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JurisdictionValueSet createJurisdictionValueSet() {
		JurisdictionValueSetImpl jurisdictionValueSet = new JurisdictionValueSetImpl();
		return jurisdictionValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind createKind() {
		KindImpl kind = new KindImpl();
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Linkage createLinkage() {
		LinkageImpl linkage = new LinkageImpl();
		return linkage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkageItem createLinkageItem() {
		LinkageItemImpl linkageItem = new LinkageItemImpl();
		return linkageItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkageType createLinkageType() {
		LinkageTypeImpl linkageType = new LinkageTypeImpl();
		return linkageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkRelationTypes createLinkRelationTypes() {
		LinkRelationTypesImpl linkRelationTypes = new LinkRelationTypesImpl();
		return linkRelationTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType createLinkType() {
		LinkTypeImpl linkType = new LinkTypeImpl();
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListEntry createListEntry() {
		ListEntryImpl listEntry = new ListEntryImpl();
		return listEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListMode createListMode() {
		ListModeImpl listMode = new ListModeImpl();
		return listMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStatus createListStatus() {
		ListStatusImpl listStatus = new ListStatusImpl();
		return listStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationMode createLocationMode() {
		LocationModeImpl locationMode = new LocationModeImpl();
		return locationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationPosition createLocationPosition() {
		LocationPositionImpl locationPosition = new LocationPositionImpl();
		return locationPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationStatus createLocationStatus() {
		LocationStatusImpl locationStatus = new LocationStatusImpl();
		return locationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturedItemDefinition createManufacturedItemDefinition() {
		ManufacturedItemDefinitionImpl manufacturedItemDefinition = new ManufacturedItemDefinitionImpl();
		return manufacturedItemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturedItemDefinitionComponent createManufacturedItemDefinitionComponent() {
		ManufacturedItemDefinitionComponentImpl manufacturedItemDefinitionComponent = new ManufacturedItemDefinitionComponentImpl();
		return manufacturedItemDefinitionComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturedItemDefinitionConstituent createManufacturedItemDefinitionConstituent() {
		ManufacturedItemDefinitionConstituentImpl manufacturedItemDefinitionConstituent = new ManufacturedItemDefinitionConstituentImpl();
		return manufacturedItemDefinitionConstituent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturedItemDefinitionProperty createManufacturedItemDefinitionProperty() {
		ManufacturedItemDefinitionPropertyImpl manufacturedItemDefinitionProperty = new ManufacturedItemDefinitionPropertyImpl();
		return manufacturedItemDefinitionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown createMarkdown() {
		MarkdownImpl markdown = new MarkdownImpl();
		return markdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketingStatus createMarketingStatus() {
		MarketingStatusImpl marketingStatus = new MarketingStatusImpl();
		return marketingStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure createMeasure() {
		MeasureImpl measure = new MeasureImpl();
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureComponent createMeasureComponent() {
		MeasureComponentImpl measureComponent = new MeasureComponentImpl();
		return measureComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureGroup createMeasureGroup() {
		MeasureGroupImpl measureGroup = new MeasureGroupImpl();
		return measureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurePopulation createMeasurePopulation() {
		MeasurePopulationImpl measurePopulation = new MeasurePopulationImpl();
		return measurePopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReport createMeasureReport() {
		MeasureReportImpl measureReport = new MeasureReportImpl();
		return measureReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportComponent createMeasureReportComponent() {
		MeasureReportComponentImpl measureReportComponent = new MeasureReportComponentImpl();
		return measureReportComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportGroup createMeasureReportGroup() {
		MeasureReportGroupImpl measureReportGroup = new MeasureReportGroupImpl();
		return measureReportGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportPopulation createMeasureReportPopulation() {
		MeasureReportPopulationImpl measureReportPopulation = new MeasureReportPopulationImpl();
		return measureReportPopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportPopulation1 createMeasureReportPopulation1() {
		MeasureReportPopulation1Impl measureReportPopulation1 = new MeasureReportPopulation1Impl();
		return measureReportPopulation1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportStatus createMeasureReportStatus() {
		MeasureReportStatusImpl measureReportStatus = new MeasureReportStatusImpl();
		return measureReportStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportStratifier createMeasureReportStratifier() {
		MeasureReportStratifierImpl measureReportStratifier = new MeasureReportStratifierImpl();
		return measureReportStratifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportStratum createMeasureReportStratum() {
		MeasureReportStratumImpl measureReportStratum = new MeasureReportStratumImpl();
		return measureReportStratum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportType createMeasureReportType() {
		MeasureReportTypeImpl measureReportType = new MeasureReportTypeImpl();
		return measureReportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureStratifier createMeasureStratifier() {
		MeasureStratifierImpl measureStratifier = new MeasureStratifierImpl();
		return measureStratifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureSupplementalData createMeasureSupplementalData() {
		MeasureSupplementalDataImpl measureSupplementalData = new MeasureSupplementalDataImpl();
		return measureSupplementalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureTerm createMeasureTerm() {
		MeasureTermImpl measureTerm = new MeasureTermImpl();
		return measureTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medication createMedication() {
		MedicationImpl medication = new MedicationImpl();
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministration createMedicationAdministration() {
		MedicationAdministrationImpl medicationAdministration = new MedicationAdministrationImpl();
		return medicationAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationDosage createMedicationAdministrationDosage() {
		MedicationAdministrationDosageImpl medicationAdministrationDosage = new MedicationAdministrationDosageImpl();
		return medicationAdministrationDosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationPerformer createMedicationAdministrationPerformer() {
		MedicationAdministrationPerformerImpl medicationAdministrationPerformer = new MedicationAdministrationPerformerImpl();
		return medicationAdministrationPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationStatusCodes createMedicationAdministrationStatusCodes() {
		MedicationAdministrationStatusCodesImpl medicationAdministrationStatusCodes = new MedicationAdministrationStatusCodesImpl();
		return medicationAdministrationStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationBatch createMedicationBatch() {
		MedicationBatchImpl medicationBatch = new MedicationBatchImpl();
		return medicationBatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispense createMedicationDispense() {
		MedicationDispenseImpl medicationDispense = new MedicationDispenseImpl();
		return medicationDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispensePerformer createMedicationDispensePerformer() {
		MedicationDispensePerformerImpl medicationDispensePerformer = new MedicationDispensePerformerImpl();
		return medicationDispensePerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseStatusCodes createMedicationDispenseStatusCodes() {
		MedicationDispenseStatusCodesImpl medicationDispenseStatusCodes = new MedicationDispenseStatusCodesImpl();
		return medicationDispenseStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseSubstitution createMedicationDispenseSubstitution() {
		MedicationDispenseSubstitutionImpl medicationDispenseSubstitution = new MedicationDispenseSubstitutionImpl();
		return medicationDispenseSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationIngredient createMedicationIngredient() {
		MedicationIngredientImpl medicationIngredient = new MedicationIngredientImpl();
		return medicationIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledge createMedicationKnowledge() {
		MedicationKnowledgeImpl medicationKnowledge = new MedicationKnowledgeImpl();
		return medicationKnowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgeCost createMedicationKnowledgeCost() {
		MedicationKnowledgeCostImpl medicationKnowledgeCost = new MedicationKnowledgeCostImpl();
		return medicationKnowledgeCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgeDefinitional createMedicationKnowledgeDefinitional() {
		MedicationKnowledgeDefinitionalImpl medicationKnowledgeDefinitional = new MedicationKnowledgeDefinitionalImpl();
		return medicationKnowledgeDefinitional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgeDosage createMedicationKnowledgeDosage() {
		MedicationKnowledgeDosageImpl medicationKnowledgeDosage = new MedicationKnowledgeDosageImpl();
		return medicationKnowledgeDosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgeDosingGuideline createMedicationKnowledgeDosingGuideline() {
		MedicationKnowledgeDosingGuidelineImpl medicationKnowledgeDosingGuideline = new MedicationKnowledgeDosingGuidelineImpl();
		return medicationKnowledgeDosingGuideline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgeDrugCharacteristic createMedicationKnowledgeDrugCharacteristic() {
		MedicationKnowledgeDrugCharacteristicImpl medicationKnowledgeDrugCharacteristic = new MedicationKnowledgeDrugCharacteristicImpl();
		return medicationKnowledgeDrugCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgeEnvironmentalSetting createMedicationKnowledgeEnvironmentalSetting() {
		MedicationKnowledgeEnvironmentalSettingImpl medicationKnowledgeEnvironmentalSetting = new MedicationKnowledgeEnvironmentalSettingImpl();
		return medicationKnowledgeEnvironmentalSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgeIndicationGuideline createMedicationKnowledgeIndicationGuideline() {
		MedicationKnowledgeIndicationGuidelineImpl medicationKnowledgeIndicationGuideline = new MedicationKnowledgeIndicationGuidelineImpl();
		return medicationKnowledgeIndicationGuideline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgeIngredient createMedicationKnowledgeIngredient() {
		MedicationKnowledgeIngredientImpl medicationKnowledgeIngredient = new MedicationKnowledgeIngredientImpl();
		return medicationKnowledgeIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgeMaxDispense createMedicationKnowledgeMaxDispense() {
		MedicationKnowledgeMaxDispenseImpl medicationKnowledgeMaxDispense = new MedicationKnowledgeMaxDispenseImpl();
		return medicationKnowledgeMaxDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgeMedicineClassification createMedicationKnowledgeMedicineClassification() {
		MedicationKnowledgeMedicineClassificationImpl medicationKnowledgeMedicineClassification = new MedicationKnowledgeMedicineClassificationImpl();
		return medicationKnowledgeMedicineClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgeMonitoringProgram createMedicationKnowledgeMonitoringProgram() {
		MedicationKnowledgeMonitoringProgramImpl medicationKnowledgeMonitoringProgram = new MedicationKnowledgeMonitoringProgramImpl();
		return medicationKnowledgeMonitoringProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgeMonograph createMedicationKnowledgeMonograph() {
		MedicationKnowledgeMonographImpl medicationKnowledgeMonograph = new MedicationKnowledgeMonographImpl();
		return medicationKnowledgeMonograph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgePackaging createMedicationKnowledgePackaging() {
		MedicationKnowledgePackagingImpl medicationKnowledgePackaging = new MedicationKnowledgePackagingImpl();
		return medicationKnowledgePackaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgePatientCharacteristic createMedicationKnowledgePatientCharacteristic() {
		MedicationKnowledgePatientCharacteristicImpl medicationKnowledgePatientCharacteristic = new MedicationKnowledgePatientCharacteristicImpl();
		return medicationKnowledgePatientCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgeRegulatory createMedicationKnowledgeRegulatory() {
		MedicationKnowledgeRegulatoryImpl medicationKnowledgeRegulatory = new MedicationKnowledgeRegulatoryImpl();
		return medicationKnowledgeRegulatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgeRelatedMedicationKnowledge createMedicationKnowledgeRelatedMedicationKnowledge() {
		MedicationKnowledgeRelatedMedicationKnowledgeImpl medicationKnowledgeRelatedMedicationKnowledge = new MedicationKnowledgeRelatedMedicationKnowledgeImpl();
		return medicationKnowledgeRelatedMedicationKnowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgeStatusCodes createMedicationKnowledgeStatusCodes() {
		MedicationKnowledgeStatusCodesImpl medicationKnowledgeStatusCodes = new MedicationKnowledgeStatusCodesImpl();
		return medicationKnowledgeStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgeStorageGuideline createMedicationKnowledgeStorageGuideline() {
		MedicationKnowledgeStorageGuidelineImpl medicationKnowledgeStorageGuideline = new MedicationKnowledgeStorageGuidelineImpl();
		return medicationKnowledgeStorageGuideline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgeSubstitution createMedicationKnowledgeSubstitution() {
		MedicationKnowledgeSubstitutionImpl medicationKnowledgeSubstitution = new MedicationKnowledgeSubstitutionImpl();
		return medicationKnowledgeSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequest createMedicationRequest() {
		MedicationRequestImpl medicationRequest = new MedicationRequestImpl();
		return medicationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestDispenseRequest createMedicationRequestDispenseRequest() {
		MedicationRequestDispenseRequestImpl medicationRequestDispenseRequest = new MedicationRequestDispenseRequestImpl();
		return medicationRequestDispenseRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestInitialFill createMedicationRequestInitialFill() {
		MedicationRequestInitialFillImpl medicationRequestInitialFill = new MedicationRequestInitialFillImpl();
		return medicationRequestInitialFill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestIntent createMedicationRequestIntent() {
		MedicationRequestIntentImpl medicationRequestIntent = new MedicationRequestIntentImpl();
		return medicationRequestIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationrequestStatus createMedicationrequestStatus() {
		MedicationrequestStatusImpl medicationrequestStatus = new MedicationrequestStatusImpl();
		return medicationrequestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestSubstitution createMedicationRequestSubstitution() {
		MedicationRequestSubstitutionImpl medicationRequestSubstitution = new MedicationRequestSubstitutionImpl();
		return medicationRequestSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatement createMedicationStatement() {
		MedicationStatementImpl medicationStatement = new MedicationStatementImpl();
		return medicationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementAdherence createMedicationStatementAdherence() {
		MedicationStatementAdherenceImpl medicationStatementAdherence = new MedicationStatementAdherenceImpl();
		return medicationStatementAdherence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementStatusCodes createMedicationStatementStatusCodes() {
		MedicationStatementStatusCodesImpl medicationStatementStatusCodes = new MedicationStatementStatusCodesImpl();
		return medicationStatementStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatusCodes createMedicationStatusCodes() {
		MedicationStatusCodesImpl medicationStatusCodes = new MedicationStatusCodesImpl();
		return medicationStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicinalProductDefinition createMedicinalProductDefinition() {
		MedicinalProductDefinitionImpl medicinalProductDefinition = new MedicinalProductDefinitionImpl();
		return medicinalProductDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicinalProductDefinitionCharacteristic createMedicinalProductDefinitionCharacteristic() {
		MedicinalProductDefinitionCharacteristicImpl medicinalProductDefinitionCharacteristic = new MedicinalProductDefinitionCharacteristicImpl();
		return medicinalProductDefinitionCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicinalProductDefinitionContact createMedicinalProductDefinitionContact() {
		MedicinalProductDefinitionContactImpl medicinalProductDefinitionContact = new MedicinalProductDefinitionContactImpl();
		return medicinalProductDefinitionContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicinalProductDefinitionCrossReference createMedicinalProductDefinitionCrossReference() {
		MedicinalProductDefinitionCrossReferenceImpl medicinalProductDefinitionCrossReference = new MedicinalProductDefinitionCrossReferenceImpl();
		return medicinalProductDefinitionCrossReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicinalProductDefinitionName createMedicinalProductDefinitionName() {
		MedicinalProductDefinitionNameImpl medicinalProductDefinitionName = new MedicinalProductDefinitionNameImpl();
		return medicinalProductDefinitionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicinalProductDefinitionOperation createMedicinalProductDefinitionOperation() {
		MedicinalProductDefinitionOperationImpl medicinalProductDefinitionOperation = new MedicinalProductDefinitionOperationImpl();
		return medicinalProductDefinitionOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicinalProductDefinitionPart createMedicinalProductDefinitionPart() {
		MedicinalProductDefinitionPartImpl medicinalProductDefinitionPart = new MedicinalProductDefinitionPartImpl();
		return medicinalProductDefinitionPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicinalProductDefinitionUsage createMedicinalProductDefinitionUsage() {
		MedicinalProductDefinitionUsageImpl medicinalProductDefinitionUsage = new MedicinalProductDefinitionUsageImpl();
		return medicinalProductDefinitionUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDefinition createMessageDefinition() {
		MessageDefinitionImpl messageDefinition = new MessageDefinitionImpl();
		return messageDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDefinitionAllowedResponse createMessageDefinitionAllowedResponse() {
		MessageDefinitionAllowedResponseImpl messageDefinitionAllowedResponse = new MessageDefinitionAllowedResponseImpl();
		return messageDefinitionAllowedResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDefinitionFocus createMessageDefinitionFocus() {
		MessageDefinitionFocusImpl messageDefinitionFocus = new MessageDefinitionFocusImpl();
		return messageDefinitionFocus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeader createMessageHeader() {
		MessageHeaderImpl messageHeader = new MessageHeaderImpl();
		return messageHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeaderDestination createMessageHeaderDestination() {
		MessageHeaderDestinationImpl messageHeaderDestination = new MessageHeaderDestinationImpl();
		return messageHeaderDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeaderResponse createMessageHeaderResponse() {
		MessageHeaderResponseImpl messageHeaderResponse = new MessageHeaderResponseImpl();
		return messageHeaderResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageheaderResponseRequest createMessageheaderResponseRequest() {
		MessageheaderResponseRequestImpl messageheaderResponseRequest = new MessageheaderResponseRequestImpl();
		return messageheaderResponseRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeaderSource createMessageHeaderSource() {
		MessageHeaderSourceImpl messageHeaderSource = new MessageHeaderSourceImpl();
		return messageHeaderSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSignificanceCategory createMessageSignificanceCategory() {
		MessageSignificanceCategoryImpl messageSignificanceCategory = new MessageSignificanceCategoryImpl();
		return messageSignificanceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meta createMeta() {
		MetaImpl meta = new MetaImpl();
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataResource createMetadataResource() {
		MetadataResourceImpl metadataResource = new MetadataResourceImpl();
		return metadataResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolecularSequence createMolecularSequence() {
		MolecularSequenceImpl molecularSequence = new MolecularSequenceImpl();
		return molecularSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolecularSequenceEdit createMolecularSequenceEdit() {
		MolecularSequenceEditImpl molecularSequenceEdit = new MolecularSequenceEditImpl();
		return molecularSequenceEdit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolecularSequenceRelative createMolecularSequenceRelative() {
		MolecularSequenceRelativeImpl molecularSequenceRelative = new MolecularSequenceRelativeImpl();
		return molecularSequenceRelative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolecularSequenceStartingSequence createMolecularSequenceStartingSequence() {
		MolecularSequenceStartingSequenceImpl molecularSequenceStartingSequence = new MolecularSequenceStartingSequenceImpl();
		return molecularSequenceStartingSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonetaryComponent createMonetaryComponent() {
		MonetaryComponentImpl monetaryComponent = new MonetaryComponentImpl();
		return monetaryComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money createMoney() {
		MoneyImpl money = new MoneyImpl();
		return money;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameUse createNameUse() {
		NameUseImpl nameUse = new NameUseImpl();
		return nameUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystem createNamingSystem() {
		NamingSystemImpl namingSystem = new NamingSystemImpl();
		return namingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemIdentifierType createNamingSystemIdentifierType() {
		NamingSystemIdentifierTypeImpl namingSystemIdentifierType = new NamingSystemIdentifierTypeImpl();
		return namingSystemIdentifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemType createNamingSystemType() {
		NamingSystemTypeImpl namingSystemType = new NamingSystemTypeImpl();
		return namingSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemUniqueId createNamingSystemUniqueId() {
		NamingSystemUniqueIdImpl namingSystemUniqueId = new NamingSystemUniqueIdImpl();
		return namingSystemUniqueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Narrative createNarrative() {
		NarrativeImpl narrative = new NarrativeImpl();
		return narrative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NarrativeStatus createNarrativeStatus() {
		NarrativeStatusImpl narrativeStatus = new NarrativeStatusImpl();
		return narrativeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteType createNoteType() {
		NoteTypeImpl noteType = new NoteTypeImpl();
		return noteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionIntake createNutritionIntake() {
		NutritionIntakeImpl nutritionIntake = new NutritionIntakeImpl();
		return nutritionIntake;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionIntakeConsumedItem createNutritionIntakeConsumedItem() {
		NutritionIntakeConsumedItemImpl nutritionIntakeConsumedItem = new NutritionIntakeConsumedItemImpl();
		return nutritionIntakeConsumedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionIntakeIngredientLabel createNutritionIntakeIngredientLabel() {
		NutritionIntakeIngredientLabelImpl nutritionIntakeIngredientLabel = new NutritionIntakeIngredientLabelImpl();
		return nutritionIntakeIngredientLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionIntakePerformer createNutritionIntakePerformer() {
		NutritionIntakePerformerImpl nutritionIntakePerformer = new NutritionIntakePerformerImpl();
		return nutritionIntakePerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrder createNutritionOrder() {
		NutritionOrderImpl nutritionOrder = new NutritionOrderImpl();
		return nutritionOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderAdditive createNutritionOrderAdditive() {
		NutritionOrderAdditiveImpl nutritionOrderAdditive = new NutritionOrderAdditiveImpl();
		return nutritionOrderAdditive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderAdministration createNutritionOrderAdministration() {
		NutritionOrderAdministrationImpl nutritionOrderAdministration = new NutritionOrderAdministrationImpl();
		return nutritionOrderAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderEnteralFormula createNutritionOrderEnteralFormula() {
		NutritionOrderEnteralFormulaImpl nutritionOrderEnteralFormula = new NutritionOrderEnteralFormulaImpl();
		return nutritionOrderEnteralFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderNutrient createNutritionOrderNutrient() {
		NutritionOrderNutrientImpl nutritionOrderNutrient = new NutritionOrderNutrientImpl();
		return nutritionOrderNutrient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderOralDiet createNutritionOrderOralDiet() {
		NutritionOrderOralDietImpl nutritionOrderOralDiet = new NutritionOrderOralDietImpl();
		return nutritionOrderOralDiet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderSchedule createNutritionOrderSchedule() {
		NutritionOrderScheduleImpl nutritionOrderSchedule = new NutritionOrderScheduleImpl();
		return nutritionOrderSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderSchedule1 createNutritionOrderSchedule1() {
		NutritionOrderSchedule1Impl nutritionOrderSchedule1 = new NutritionOrderSchedule1Impl();
		return nutritionOrderSchedule1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderSchedule2 createNutritionOrderSchedule2() {
		NutritionOrderSchedule2Impl nutritionOrderSchedule2 = new NutritionOrderSchedule2Impl();
		return nutritionOrderSchedule2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderSupplement createNutritionOrderSupplement() {
		NutritionOrderSupplementImpl nutritionOrderSupplement = new NutritionOrderSupplementImpl();
		return nutritionOrderSupplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderTexture createNutritionOrderTexture() {
		NutritionOrderTextureImpl nutritionOrderTexture = new NutritionOrderTextureImpl();
		return nutritionOrderTexture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionProduct createNutritionProduct() {
		NutritionProductImpl nutritionProduct = new NutritionProductImpl();
		return nutritionProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionProductCharacteristic createNutritionProductCharacteristic() {
		NutritionProductCharacteristicImpl nutritionProductCharacteristic = new NutritionProductCharacteristicImpl();
		return nutritionProductCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionProductIngredient createNutritionProductIngredient() {
		NutritionProductIngredientImpl nutritionProductIngredient = new NutritionProductIngredientImpl();
		return nutritionProductIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionProductInstance createNutritionProductInstance() {
		NutritionProductInstanceImpl nutritionProductInstance = new NutritionProductInstanceImpl();
		return nutritionProductInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionProductNutrient createNutritionProductNutrient() {
		NutritionProductNutrientImpl nutritionProductNutrient = new NutritionProductNutrientImpl();
		return nutritionProductNutrient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionProductStatus createNutritionProductStatus() {
		NutritionProductStatusImpl nutritionProductStatus = new NutritionProductStatusImpl();
		return nutritionProductStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation createObservation() {
		ObservationImpl observation = new ObservationImpl();
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationComponent createObservationComponent() {
		ObservationComponentImpl observationComponent = new ObservationComponentImpl();
		return observationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationDataType createObservationDataType() {
		ObservationDataTypeImpl observationDataType = new ObservationDataTypeImpl();
		return observationDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationDefinition createObservationDefinition() {
		ObservationDefinitionImpl observationDefinition = new ObservationDefinitionImpl();
		return observationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationDefinitionComponent createObservationDefinitionComponent() {
		ObservationDefinitionComponentImpl observationDefinitionComponent = new ObservationDefinitionComponentImpl();
		return observationDefinitionComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationDefinitionQualifiedValue createObservationDefinitionQualifiedValue() {
		ObservationDefinitionQualifiedValueImpl observationDefinitionQualifiedValue = new ObservationDefinitionQualifiedValueImpl();
		return observationDefinitionQualifiedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationRangeCategory createObservationRangeCategory() {
		ObservationRangeCategoryImpl observationRangeCategory = new ObservationRangeCategoryImpl();
		return observationRangeCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationReferenceRange createObservationReferenceRange() {
		ObservationReferenceRangeImpl observationReferenceRange = new ObservationReferenceRangeImpl();
		return observationReferenceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationStatus createObservationStatus() {
		ObservationStatusImpl observationStatus = new ObservationStatusImpl();
		return observationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationTriggeredBy createObservationTriggeredBy() {
		ObservationTriggeredByImpl observationTriggeredBy = new ObservationTriggeredByImpl();
		return observationTriggeredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid createOid() {
		OidImpl oid = new OidImpl();
		return oid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinition createOperationDefinition() {
		OperationDefinitionImpl operationDefinition = new OperationDefinitionImpl();
		return operationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinitionBinding createOperationDefinitionBinding() {
		OperationDefinitionBindingImpl operationDefinitionBinding = new OperationDefinitionBindingImpl();
		return operationDefinitionBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinitionOverload createOperationDefinitionOverload() {
		OperationDefinitionOverloadImpl operationDefinitionOverload = new OperationDefinitionOverloadImpl();
		return operationDefinitionOverload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinitionParameter createOperationDefinitionParameter() {
		OperationDefinitionParameterImpl operationDefinitionParameter = new OperationDefinitionParameterImpl();
		return operationDefinitionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinitionReferencedFrom createOperationDefinitionReferencedFrom() {
		OperationDefinitionReferencedFromImpl operationDefinitionReferencedFrom = new OperationDefinitionReferencedFromImpl();
		return operationDefinitionReferencedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationKind createOperationKind() {
		OperationKindImpl operationKind = new OperationKindImpl();
		return operationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationOutcome createOperationOutcome() {
		OperationOutcomeImpl operationOutcome = new OperationOutcomeImpl();
		return operationOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationOutcomeCodes createOperationOutcomeCodes() {
		OperationOutcomeCodesImpl operationOutcomeCodes = new OperationOutcomeCodesImpl();
		return operationOutcomeCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationOutcomeIssue createOperationOutcomeIssue() {
		OperationOutcomeIssueImpl operationOutcomeIssue = new OperationOutcomeIssueImpl();
		return operationOutcomeIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterScope createOperationParameterScope() {
		OperationParameterScopeImpl operationParameterScope = new OperationParameterScopeImpl();
		return operationParameterScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterUse createOperationParameterUse() {
		OperationParameterUseImpl operationParameterUse = new OperationParameterUseImpl();
		return operationParameterUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationAffiliation createOrganizationAffiliation() {
		OrganizationAffiliationImpl organizationAffiliation = new OrganizationAffiliationImpl();
		return organizationAffiliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationQualification createOrganizationQualification() {
		OrganizationQualificationImpl organizationQualification = new OrganizationQualificationImpl();
		return organizationQualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType createOrientationType() {
		OrientationTypeImpl orientationType = new OrientationTypeImpl();
		return orientationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagedProductDefinition createPackagedProductDefinition() {
		PackagedProductDefinitionImpl packagedProductDefinition = new PackagedProductDefinitionImpl();
		return packagedProductDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagedProductDefinitionContainedItem createPackagedProductDefinitionContainedItem() {
		PackagedProductDefinitionContainedItemImpl packagedProductDefinitionContainedItem = new PackagedProductDefinitionContainedItemImpl();
		return packagedProductDefinitionContainedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagedProductDefinitionLegalStatusOfSupply createPackagedProductDefinitionLegalStatusOfSupply() {
		PackagedProductDefinitionLegalStatusOfSupplyImpl packagedProductDefinitionLegalStatusOfSupply = new PackagedProductDefinitionLegalStatusOfSupplyImpl();
		return packagedProductDefinitionLegalStatusOfSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagedProductDefinitionPackaging createPackagedProductDefinitionPackaging() {
		PackagedProductDefinitionPackagingImpl packagedProductDefinitionPackaging = new PackagedProductDefinitionPackagingImpl();
		return packagedProductDefinitionPackaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagedProductDefinitionProperty createPackagedProductDefinitionProperty() {
		PackagedProductDefinitionPropertyImpl packagedProductDefinitionProperty = new PackagedProductDefinitionPropertyImpl();
		return packagedProductDefinitionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDefinition createParameterDefinition() {
		ParameterDefinitionImpl parameterDefinition = new ParameterDefinitionImpl();
		return parameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameters createParameters() {
		ParametersImpl parameters = new ParametersImpl();
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersParameter createParametersParameter() {
		ParametersParameterImpl parametersParameter = new ParametersParameterImpl();
		return parametersParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantResourceTypes createParticipantResourceTypes() {
		ParticipantResourceTypesImpl participantResourceTypes = new ParticipantResourceTypesImpl();
		return participantResourceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipationStatus createParticipationStatus() {
		ParticipationStatusImpl participationStatus = new ParticipationStatusImpl();
		return participationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient createPatient() {
		PatientImpl patient = new PatientImpl();
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientCommunication createPatientCommunication() {
		PatientCommunicationImpl patientCommunication = new PatientCommunicationImpl();
		return patientCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientContact createPatientContact() {
		PatientContactImpl patientContact = new PatientContactImpl();
		return patientContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientLink createPatientLink() {
		PatientLinkImpl patientLink = new PatientLinkImpl();
		return patientLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentNotice createPaymentNotice() {
		PaymentNoticeImpl paymentNotice = new PaymentNoticeImpl();
		return paymentNotice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentOutcome createPaymentOutcome() {
		PaymentOutcomeImpl paymentOutcome = new PaymentOutcomeImpl();
		return paymentOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentReconciliation createPaymentReconciliation() {
		PaymentReconciliationImpl paymentReconciliation = new PaymentReconciliationImpl();
		return paymentReconciliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentReconciliationAllocation createPaymentReconciliationAllocation() {
		PaymentReconciliationAllocationImpl paymentReconciliationAllocation = new PaymentReconciliationAllocationImpl();
		return paymentReconciliationAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentReconciliationProcessNote createPaymentReconciliationProcessNote() {
		PaymentReconciliationProcessNoteImpl paymentReconciliationProcessNote = new PaymentReconciliationProcessNoteImpl();
		return paymentReconciliationProcessNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period createPeriod() {
		PeriodImpl period = new PeriodImpl();
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permission createPermission() {
		PermissionImpl permission = new PermissionImpl();
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionActivity createPermissionActivity() {
		PermissionActivityImpl permissionActivity = new PermissionActivityImpl();
		return permissionActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionData createPermissionData() {
		PermissionDataImpl permissionData = new PermissionDataImpl();
		return permissionData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionJustification createPermissionJustification() {
		PermissionJustificationImpl permissionJustification = new PermissionJustificationImpl();
		return permissionJustification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionResource createPermissionResource() {
		PermissionResourceImpl permissionResource = new PermissionResourceImpl();
		return permissionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionRule createPermissionRule() {
		PermissionRuleImpl permissionRule = new PermissionRuleImpl();
		return permissionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionRuleCombining createPermissionRuleCombining() {
		PermissionRuleCombiningImpl permissionRuleCombining = new PermissionRuleCombiningImpl();
		return permissionRuleCombining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionStatus createPermissionStatus() {
		PermissionStatusImpl permissionStatus = new PermissionStatusImpl();
		return permissionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonCommunication createPersonCommunication() {
		PersonCommunicationImpl personCommunication = new PersonCommunicationImpl();
		return personCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonLink createPersonLink() {
		PersonLinkImpl personLink = new PersonLinkImpl();
		return personLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinition createPlanDefinition() {
		PlanDefinitionImpl planDefinition = new PlanDefinitionImpl();
		return planDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionAction createPlanDefinitionAction() {
		PlanDefinitionActionImpl planDefinitionAction = new PlanDefinitionActionImpl();
		return planDefinitionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionActor createPlanDefinitionActor() {
		PlanDefinitionActorImpl planDefinitionActor = new PlanDefinitionActorImpl();
		return planDefinitionActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionCondition createPlanDefinitionCondition() {
		PlanDefinitionConditionImpl planDefinitionCondition = new PlanDefinitionConditionImpl();
		return planDefinitionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionDynamicValue createPlanDefinitionDynamicValue() {
		PlanDefinitionDynamicValueImpl planDefinitionDynamicValue = new PlanDefinitionDynamicValueImpl();
		return planDefinitionDynamicValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionGoal createPlanDefinitionGoal() {
		PlanDefinitionGoalImpl planDefinitionGoal = new PlanDefinitionGoalImpl();
		return planDefinitionGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionInput createPlanDefinitionInput() {
		PlanDefinitionInputImpl planDefinitionInput = new PlanDefinitionInputImpl();
		return planDefinitionInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionOption createPlanDefinitionOption() {
		PlanDefinitionOptionImpl planDefinitionOption = new PlanDefinitionOptionImpl();
		return planDefinitionOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionOutput createPlanDefinitionOutput() {
		PlanDefinitionOutputImpl planDefinitionOutput = new PlanDefinitionOutputImpl();
		return planDefinitionOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionParticipant createPlanDefinitionParticipant() {
		PlanDefinitionParticipantImpl planDefinitionParticipant = new PlanDefinitionParticipantImpl();
		return planDefinitionParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionRelatedAction createPlanDefinitionRelatedAction() {
		PlanDefinitionRelatedActionImpl planDefinitionRelatedAction = new PlanDefinitionRelatedActionImpl();
		return planDefinitionRelatedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionTarget createPlanDefinitionTarget() {
		PlanDefinitionTargetImpl planDefinitionTarget = new PlanDefinitionTargetImpl();
		return planDefinitionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt createPositiveInt() {
		PositiveIntImpl positiveInt = new PositiveIntImpl();
		return positiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner createPractitioner() {
		PractitionerImpl practitioner = new PractitionerImpl();
		return practitioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerCommunication createPractitionerCommunication() {
		PractitionerCommunicationImpl practitionerCommunication = new PractitionerCommunicationImpl();
		return practitionerCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerQualification createPractitionerQualification() {
		PractitionerQualificationImpl practitionerQualification = new PractitionerQualificationImpl();
		return practitionerQualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerRole createPractitionerRole() {
		PractitionerRoleImpl practitionerRole = new PractitionerRoleImpl();
		return practitionerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureFocalDevice createProcedureFocalDevice() {
		ProcedureFocalDeviceImpl procedureFocalDevice = new ProcedureFocalDeviceImpl();
		return procedureFocalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedurePerformer createProcedurePerformer() {
		ProcedurePerformerImpl procedurePerformer = new ProcedurePerformerImpl();
		return procedurePerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductShelfLife createProductShelfLife() {
		ProductShelfLifeImpl productShelfLife = new ProductShelfLifeImpl();
		return productShelfLife;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRepresentation createPropertyRepresentation() {
		PropertyRepresentationImpl propertyRepresentation = new PropertyRepresentationImpl();
		return propertyRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provenance createProvenance() {
		ProvenanceImpl provenance = new ProvenanceImpl();
		return provenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceAgent createProvenanceAgent() {
		ProvenanceAgentImpl provenanceAgent = new ProvenanceAgentImpl();
		return provenanceAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceEntity createProvenanceEntity() {
		ProvenanceEntityImpl provenanceEntity = new ProvenanceEntityImpl();
		return provenanceEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceEntityRole createProvenanceEntityRole() {
		ProvenanceEntityRoleImpl provenanceEntityRole = new ProvenanceEntityRoleImpl();
		return provenanceEntityRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationStatus createPublicationStatus() {
		PublicationStatusImpl publicationStatus = new PublicationStatusImpl();
		return publicationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity createQuantity() {
		QuantityImpl quantity = new QuantityImpl();
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityComparator createQuantityComparator() {
		QuantityComparatorImpl quantityComparator = new QuantityComparatorImpl();
		return quantityComparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire createQuestionnaire() {
		QuestionnaireImpl questionnaire = new QuestionnaireImpl();
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireAnswerConstraint createQuestionnaireAnswerConstraint() {
		QuestionnaireAnswerConstraintImpl questionnaireAnswerConstraint = new QuestionnaireAnswerConstraintImpl();
		return questionnaireAnswerConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireAnswerOption createQuestionnaireAnswerOption() {
		QuestionnaireAnswerOptionImpl questionnaireAnswerOption = new QuestionnaireAnswerOptionImpl();
		return questionnaireAnswerOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireEnableWhen createQuestionnaireEnableWhen() {
		QuestionnaireEnableWhenImpl questionnaireEnableWhen = new QuestionnaireEnableWhenImpl();
		return questionnaireEnableWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireInitial createQuestionnaireInitial() {
		QuestionnaireInitialImpl questionnaireInitial = new QuestionnaireInitialImpl();
		return questionnaireInitial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItem createQuestionnaireItem() {
		QuestionnaireItemImpl questionnaireItem = new QuestionnaireItemImpl();
		return questionnaireItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItemDisabledDisplay createQuestionnaireItemDisabledDisplay() {
		QuestionnaireItemDisabledDisplayImpl questionnaireItemDisabledDisplay = new QuestionnaireItemDisabledDisplayImpl();
		return questionnaireItemDisabledDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItemOperator createQuestionnaireItemOperator() {
		QuestionnaireItemOperatorImpl questionnaireItemOperator = new QuestionnaireItemOperatorImpl();
		return questionnaireItemOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItemType createQuestionnaireItemType() {
		QuestionnaireItemTypeImpl questionnaireItemType = new QuestionnaireItemTypeImpl();
		return questionnaireItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponse createQuestionnaireResponse() {
		QuestionnaireResponseImpl questionnaireResponse = new QuestionnaireResponseImpl();
		return questionnaireResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseAnswer createQuestionnaireResponseAnswer() {
		QuestionnaireResponseAnswerImpl questionnaireResponseAnswer = new QuestionnaireResponseAnswerImpl();
		return questionnaireResponseAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseItem createQuestionnaireResponseItem() {
		QuestionnaireResponseItemImpl questionnaireResponseItem = new QuestionnaireResponseItemImpl();
		return questionnaireResponseItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseStatus createQuestionnaireResponseStatus() {
		QuestionnaireResponseStatusImpl questionnaireResponseStatus = new QuestionnaireResponseStatusImpl();
		return questionnaireResponseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range createRange() {
		RangeImpl range = new RangeImpl();
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio createRatio() {
		RatioImpl ratio = new RatioImpl();
		return ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RatioRange createRatioRange() {
		RatioRangeImpl ratioRange = new RatioRangeImpl();
		return ratioRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceHandlingPolicy createReferenceHandlingPolicy() {
		ReferenceHandlingPolicyImpl referenceHandlingPolicy = new ReferenceHandlingPolicyImpl();
		return referenceHandlingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceVersionRules createReferenceVersionRules() {
		ReferenceVersionRulesImpl referenceVersionRules = new ReferenceVersionRulesImpl();
		return referenceVersionRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatedAuthorization createRegulatedAuthorization() {
		RegulatedAuthorizationImpl regulatedAuthorization = new RegulatedAuthorizationImpl();
		return regulatedAuthorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatedAuthorizationCase createRegulatedAuthorizationCase() {
		RegulatedAuthorizationCaseImpl regulatedAuthorizationCase = new RegulatedAuthorizationCaseImpl();
		return regulatedAuthorizationCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedArtifact createRelatedArtifact() {
		RelatedArtifactImpl relatedArtifact = new RelatedArtifactImpl();
		return relatedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedArtifactType createRelatedArtifactType() {
		RelatedArtifactTypeImpl relatedArtifactType = new RelatedArtifactTypeImpl();
		return relatedArtifactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedArtifactTypeExpanded createRelatedArtifactTypeExpanded() {
		RelatedArtifactTypeExpandedImpl relatedArtifactTypeExpanded = new RelatedArtifactTypeExpandedImpl();
		return relatedArtifactTypeExpanded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedPerson createRelatedPerson() {
		RelatedPersonImpl relatedPerson = new RelatedPersonImpl();
		return relatedPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedPersonCommunication createRelatedPersonCommunication() {
		RelatedPersonCommunicationImpl relatedPersonCommunication = new RelatedPersonCommunicationImpl();
		return relatedPersonCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemittanceOutcome createRemittanceOutcome() {
		RemittanceOutcomeImpl remittanceOutcome = new RemittanceOutcomeImpl();
		return remittanceOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportRelationshipType createReportRelationshipType() {
		ReportRelationshipTypeImpl reportRelationshipType = new ReportRelationshipTypeImpl();
		return reportRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestIntent createRequestIntent() {
		RequestIntentImpl requestIntent = new RequestIntentImpl();
		return requestIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestOrchestration createRequestOrchestration() {
		RequestOrchestrationImpl requestOrchestration = new RequestOrchestrationImpl();
		return requestOrchestration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestOrchestrationAction createRequestOrchestrationAction() {
		RequestOrchestrationActionImpl requestOrchestrationAction = new RequestOrchestrationActionImpl();
		return requestOrchestrationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestOrchestrationCondition createRequestOrchestrationCondition() {
		RequestOrchestrationConditionImpl requestOrchestrationCondition = new RequestOrchestrationConditionImpl();
		return requestOrchestrationCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestOrchestrationDynamicValue createRequestOrchestrationDynamicValue() {
		RequestOrchestrationDynamicValueImpl requestOrchestrationDynamicValue = new RequestOrchestrationDynamicValueImpl();
		return requestOrchestrationDynamicValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestOrchestrationInput createRequestOrchestrationInput() {
		RequestOrchestrationInputImpl requestOrchestrationInput = new RequestOrchestrationInputImpl();
		return requestOrchestrationInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestOrchestrationOutput createRequestOrchestrationOutput() {
		RequestOrchestrationOutputImpl requestOrchestrationOutput = new RequestOrchestrationOutputImpl();
		return requestOrchestrationOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestOrchestrationParticipant createRequestOrchestrationParticipant() {
		RequestOrchestrationParticipantImpl requestOrchestrationParticipant = new RequestOrchestrationParticipantImpl();
		return requestOrchestrationParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestOrchestrationRelatedAction createRequestOrchestrationRelatedAction() {
		RequestOrchestrationRelatedActionImpl requestOrchestrationRelatedAction = new RequestOrchestrationRelatedActionImpl();
		return requestOrchestrationRelatedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestPriority createRequestPriority() {
		RequestPriorityImpl requestPriority = new RequestPriorityImpl();
		return requestPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestResourceTypes createRequestResourceTypes() {
		RequestResourceTypesImpl requestResourceTypes = new RequestResourceTypesImpl();
		return requestResourceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestStatus createRequestStatus() {
		RequestStatusImpl requestStatus = new RequestStatusImpl();
		return requestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirements createRequirements() {
		RequirementsImpl requirements = new RequirementsImpl();
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsStatement createRequirementsStatement() {
		RequirementsStatementImpl requirementsStatement = new RequirementsStatementImpl();
		return requirementsStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudy createResearchStudy() {
		ResearchStudyImpl researchStudy = new ResearchStudyImpl();
		return researchStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudyAssociatedParty createResearchStudyAssociatedParty() {
		ResearchStudyAssociatedPartyImpl researchStudyAssociatedParty = new ResearchStudyAssociatedPartyImpl();
		return researchStudyAssociatedParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudyComparisonGroup createResearchStudyComparisonGroup() {
		ResearchStudyComparisonGroupImpl researchStudyComparisonGroup = new ResearchStudyComparisonGroupImpl();
		return researchStudyComparisonGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudyLabel createResearchStudyLabel() {
		ResearchStudyLabelImpl researchStudyLabel = new ResearchStudyLabelImpl();
		return researchStudyLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudyObjective createResearchStudyObjective() {
		ResearchStudyObjectiveImpl researchStudyObjective = new ResearchStudyObjectiveImpl();
		return researchStudyObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudyOutcomeMeasure createResearchStudyOutcomeMeasure() {
		ResearchStudyOutcomeMeasureImpl researchStudyOutcomeMeasure = new ResearchStudyOutcomeMeasureImpl();
		return researchStudyOutcomeMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudyProgressStatus createResearchStudyProgressStatus() {
		ResearchStudyProgressStatusImpl researchStudyProgressStatus = new ResearchStudyProgressStatusImpl();
		return researchStudyProgressStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudyRecruitment createResearchStudyRecruitment() {
		ResearchStudyRecruitmentImpl researchStudyRecruitment = new ResearchStudyRecruitmentImpl();
		return researchStudyRecruitment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchSubject createResearchSubject() {
		ResearchSubjectImpl researchSubject = new ResearchSubjectImpl();
		return researchSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchSubjectProgress createResearchSubjectProgress() {
		ResearchSubjectProgressImpl researchSubjectProgress = new ResearchSubjectProgressImpl();
		return researchSubjectProgress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainer createResourceContainer() {
		ResourceContainerImpl resourceContainer = new ResourceContainerImpl();
		return resourceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType createResourceType() {
		ResourceTypeImpl resourceType = new ResourceTypeImpl();
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceVersionPolicy createResourceVersionPolicy() {
		ResourceVersionPolicyImpl resourceVersionPolicy = new ResourceVersionPolicyImpl();
		return resourceVersionPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseType createResponseType() {
		ResponseTypeImpl responseType = new ResponseTypeImpl();
		return responseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestfulCapabilityMode createRestfulCapabilityMode() {
		RestfulCapabilityModeImpl restfulCapabilityMode = new RestfulCapabilityModeImpl();
		return restfulCapabilityMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessment createRiskAssessment() {
		RiskAssessmentImpl riskAssessment = new RiskAssessmentImpl();
		return riskAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessmentPrediction createRiskAssessmentPrediction() {
		RiskAssessmentPredictionImpl riskAssessmentPrediction = new RiskAssessmentPredictionImpl();
		return riskAssessmentPrediction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampledData createSampledData() {
		SampledDataImpl sampledData = new SampledDataImpl();
		return sampledData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampledDataDataType createSampledDataDataType() {
		SampledDataDataTypeImpl sampledDataDataType = new SampledDataDataTypeImpl();
		return sampledDataDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule createSchedule() {
		ScheduleImpl schedule = new ScheduleImpl();
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchComparator createSearchComparator() {
		SearchComparatorImpl searchComparator = new SearchComparatorImpl();
		return searchComparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchEntryMode createSearchEntryMode() {
		SearchEntryModeImpl searchEntryMode = new SearchEntryModeImpl();
		return searchEntryMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchModifierCode createSearchModifierCode() {
		SearchModifierCodeImpl searchModifierCode = new SearchModifierCodeImpl();
		return searchModifierCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParameter createSearchParameter() {
		SearchParameterImpl searchParameter = new SearchParameterImpl();
		return searchParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParameterComponent createSearchParameterComponent() {
		SearchParameterComponentImpl searchParameterComponent = new SearchParameterComponentImpl();
		return searchParameterComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParamType createSearchParamType() {
		SearchParamTypeImpl searchParamType = new SearchParamTypeImpl();
		return searchParamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchProcessingModeType createSearchProcessingModeType() {
		SearchProcessingModeTypeImpl searchProcessingModeType = new SearchProcessingModeTypeImpl();
		return searchProcessingModeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceType createSequenceType() {
		SequenceTypeImpl sequenceType = new SequenceTypeImpl();
		return sequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRequest createServiceRequest() {
		ServiceRequestImpl serviceRequest = new ServiceRequestImpl();
		return serviceRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRequestOrderDetail createServiceRequestOrderDetail() {
		ServiceRequestOrderDetailImpl serviceRequestOrderDetail = new ServiceRequestOrderDetailImpl();
		return serviceRequestOrderDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRequestParameter createServiceRequestParameter() {
		ServiceRequestParameterImpl serviceRequestParameter = new ServiceRequestParameterImpl();
		return serviceRequestParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRequestPatientInstruction createServiceRequestPatientInstruction() {
		ServiceRequestPatientInstructionImpl serviceRequestPatientInstruction = new ServiceRequestPatientInstructionImpl();
		return serviceRequestPatientInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature createSignature() {
		SignatureImpl signature = new SignatureImpl();
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingRules createSlicingRules() {
		SlicingRulesImpl slicingRules = new SlicingRulesImpl();
		return slicingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot createSlot() {
		SlotImpl slot = new SlotImpl();
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotStatus createSlotStatus() {
		SlotStatusImpl slotStatus = new SlotStatusImpl();
		return slotStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortDirection createSortDirection() {
		SortDirectionImpl sortDirection = new SortDirectionImpl();
		return sortDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPDXLicense createSPDXLicense() {
		SPDXLicenseImpl spdxLicense = new SPDXLicenseImpl();
		return spdxLicense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specimen createSpecimen() {
		SpecimenImpl specimen = new SpecimenImpl();
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenCollection createSpecimenCollection() {
		SpecimenCollectionImpl specimenCollection = new SpecimenCollectionImpl();
		return specimenCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenCombined createSpecimenCombined() {
		SpecimenCombinedImpl specimenCombined = new SpecimenCombinedImpl();
		return specimenCombined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenContainedPreference createSpecimenContainedPreference() {
		SpecimenContainedPreferenceImpl specimenContainedPreference = new SpecimenContainedPreferenceImpl();
		return specimenContainedPreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenContainer createSpecimenContainer() {
		SpecimenContainerImpl specimenContainer = new SpecimenContainerImpl();
		return specimenContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenDefinition createSpecimenDefinition() {
		SpecimenDefinitionImpl specimenDefinition = new SpecimenDefinitionImpl();
		return specimenDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenDefinitionAdditive createSpecimenDefinitionAdditive() {
		SpecimenDefinitionAdditiveImpl specimenDefinitionAdditive = new SpecimenDefinitionAdditiveImpl();
		return specimenDefinitionAdditive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenDefinitionContainer createSpecimenDefinitionContainer() {
		SpecimenDefinitionContainerImpl specimenDefinitionContainer = new SpecimenDefinitionContainerImpl();
		return specimenDefinitionContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenDefinitionHandling createSpecimenDefinitionHandling() {
		SpecimenDefinitionHandlingImpl specimenDefinitionHandling = new SpecimenDefinitionHandlingImpl();
		return specimenDefinitionHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenDefinitionTypeTested createSpecimenDefinitionTypeTested() {
		SpecimenDefinitionTypeTestedImpl specimenDefinitionTypeTested = new SpecimenDefinitionTypeTestedImpl();
		return specimenDefinitionTypeTested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenFeature createSpecimenFeature() {
		SpecimenFeatureImpl specimenFeature = new SpecimenFeatureImpl();
		return specimenFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenProcessing createSpecimenProcessing() {
		SpecimenProcessingImpl specimenProcessing = new SpecimenProcessingImpl();
		return specimenProcessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenStatus createSpecimenStatus() {
		SpecimenStatusImpl specimenStatus = new SpecimenStatusImpl();
		return specimenStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrandType createStrandType() {
		StrandTypeImpl strandType = new StrandTypeImpl();
		return strandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition createStructureDefinition() {
		StructureDefinitionImpl structureDefinition = new StructureDefinitionImpl();
		return structureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionContext createStructureDefinitionContext() {
		StructureDefinitionContextImpl structureDefinitionContext = new StructureDefinitionContextImpl();
		return structureDefinitionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionDifferential createStructureDefinitionDifferential() {
		StructureDefinitionDifferentialImpl structureDefinitionDifferential = new StructureDefinitionDifferentialImpl();
		return structureDefinitionDifferential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionKind createStructureDefinitionKind() {
		StructureDefinitionKindImpl structureDefinitionKind = new StructureDefinitionKindImpl();
		return structureDefinitionKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionMapping createStructureDefinitionMapping() {
		StructureDefinitionMappingImpl structureDefinitionMapping = new StructureDefinitionMappingImpl();
		return structureDefinitionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionSnapshot createStructureDefinitionSnapshot() {
		StructureDefinitionSnapshotImpl structureDefinitionSnapshot = new StructureDefinitionSnapshotImpl();
		return structureDefinitionSnapshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMap createStructureMap() {
		StructureMapImpl structureMap = new StructureMapImpl();
		return structureMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapConst createStructureMapConst() {
		StructureMapConstImpl structureMapConst = new StructureMapConstImpl();
		return structureMapConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapDependent createStructureMapDependent() {
		StructureMapDependentImpl structureMapDependent = new StructureMapDependentImpl();
		return structureMapDependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapGroup createStructureMapGroup() {
		StructureMapGroupImpl structureMapGroup = new StructureMapGroupImpl();
		return structureMapGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapGroupTypeMode createStructureMapGroupTypeMode() {
		StructureMapGroupTypeModeImpl structureMapGroupTypeMode = new StructureMapGroupTypeModeImpl();
		return structureMapGroupTypeMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapInput createStructureMapInput() {
		StructureMapInputImpl structureMapInput = new StructureMapInputImpl();
		return structureMapInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapInputMode createStructureMapInputMode() {
		StructureMapInputModeImpl structureMapInputMode = new StructureMapInputModeImpl();
		return structureMapInputMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapModelMode createStructureMapModelMode() {
		StructureMapModelModeImpl structureMapModelMode = new StructureMapModelModeImpl();
		return structureMapModelMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapParameter createStructureMapParameter() {
		StructureMapParameterImpl structureMapParameter = new StructureMapParameterImpl();
		return structureMapParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapRule createStructureMapRule() {
		StructureMapRuleImpl structureMapRule = new StructureMapRuleImpl();
		return structureMapRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapSource createStructureMapSource() {
		StructureMapSourceImpl structureMapSource = new StructureMapSourceImpl();
		return structureMapSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapSourceListMode createStructureMapSourceListMode() {
		StructureMapSourceListModeImpl structureMapSourceListMode = new StructureMapSourceListModeImpl();
		return structureMapSourceListMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapStructure createStructureMapStructure() {
		StructureMapStructureImpl structureMapStructure = new StructureMapStructureImpl();
		return structureMapStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapTarget createStructureMapTarget() {
		StructureMapTargetImpl structureMapTarget = new StructureMapTargetImpl();
		return structureMapTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapTargetListMode createStructureMapTargetListMode() {
		StructureMapTargetListModeImpl structureMapTargetListMode = new StructureMapTargetListModeImpl();
		return structureMapTargetListMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapTransform createStructureMapTransform() {
		StructureMapTransformImpl structureMapTransform = new StructureMapTransformImpl();
		return structureMapTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmitDataUpdateType createSubmitDataUpdateType() {
		SubmitDataUpdateTypeImpl submitDataUpdateType = new SubmitDataUpdateTypeImpl();
		return submitDataUpdateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscription createSubscription() {
		SubscriptionImpl subscription = new SubscriptionImpl();
		return subscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionFilterBy createSubscriptionFilterBy() {
		SubscriptionFilterByImpl subscriptionFilterBy = new SubscriptionFilterByImpl();
		return subscriptionFilterBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionNotificationType createSubscriptionNotificationType() {
		SubscriptionNotificationTypeImpl subscriptionNotificationType = new SubscriptionNotificationTypeImpl();
		return subscriptionNotificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionParameter createSubscriptionParameter() {
		SubscriptionParameterImpl subscriptionParameter = new SubscriptionParameterImpl();
		return subscriptionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionPayloadContent createSubscriptionPayloadContent() {
		SubscriptionPayloadContentImpl subscriptionPayloadContent = new SubscriptionPayloadContentImpl();
		return subscriptionPayloadContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionStatus createSubscriptionStatus() {
		SubscriptionStatusImpl subscriptionStatus = new SubscriptionStatusImpl();
		return subscriptionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionStatusCodes createSubscriptionStatusCodes() {
		SubscriptionStatusCodesImpl subscriptionStatusCodes = new SubscriptionStatusCodesImpl();
		return subscriptionStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionStatusNotificationEvent createSubscriptionStatusNotificationEvent() {
		SubscriptionStatusNotificationEventImpl subscriptionStatusNotificationEvent = new SubscriptionStatusNotificationEventImpl();
		return subscriptionStatusNotificationEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionTopic createSubscriptionTopic() {
		SubscriptionTopicImpl subscriptionTopic = new SubscriptionTopicImpl();
		return subscriptionTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionTopicCanFilterBy createSubscriptionTopicCanFilterBy() {
		SubscriptionTopicCanFilterByImpl subscriptionTopicCanFilterBy = new SubscriptionTopicCanFilterByImpl();
		return subscriptionTopicCanFilterBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionTopicEventTrigger createSubscriptionTopicEventTrigger() {
		SubscriptionTopicEventTriggerImpl subscriptionTopicEventTrigger = new SubscriptionTopicEventTriggerImpl();
		return subscriptionTopicEventTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionTopicNotificationShape createSubscriptionTopicNotificationShape() {
		SubscriptionTopicNotificationShapeImpl subscriptionTopicNotificationShape = new SubscriptionTopicNotificationShapeImpl();
		return subscriptionTopicNotificationShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionTopicQueryCriteria createSubscriptionTopicQueryCriteria() {
		SubscriptionTopicQueryCriteriaImpl subscriptionTopicQueryCriteria = new SubscriptionTopicQueryCriteriaImpl();
		return subscriptionTopicQueryCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionTopicResourceTrigger createSubscriptionTopicResourceTrigger() {
		SubscriptionTopicResourceTriggerImpl subscriptionTopicResourceTrigger = new SubscriptionTopicResourceTriggerImpl();
		return subscriptionTopicResourceTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substance createSubstance() {
		SubstanceImpl substance = new SubstanceImpl();
		return substance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceDefinition createSubstanceDefinition() {
		SubstanceDefinitionImpl substanceDefinition = new SubstanceDefinitionImpl();
		return substanceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceDefinitionCharacterization createSubstanceDefinitionCharacterization() {
		SubstanceDefinitionCharacterizationImpl substanceDefinitionCharacterization = new SubstanceDefinitionCharacterizationImpl();
		return substanceDefinitionCharacterization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceDefinitionCode createSubstanceDefinitionCode() {
		SubstanceDefinitionCodeImpl substanceDefinitionCode = new SubstanceDefinitionCodeImpl();
		return substanceDefinitionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceDefinitionMoiety createSubstanceDefinitionMoiety() {
		SubstanceDefinitionMoietyImpl substanceDefinitionMoiety = new SubstanceDefinitionMoietyImpl();
		return substanceDefinitionMoiety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceDefinitionMolecularWeight createSubstanceDefinitionMolecularWeight() {
		SubstanceDefinitionMolecularWeightImpl substanceDefinitionMolecularWeight = new SubstanceDefinitionMolecularWeightImpl();
		return substanceDefinitionMolecularWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceDefinitionName createSubstanceDefinitionName() {
		SubstanceDefinitionNameImpl substanceDefinitionName = new SubstanceDefinitionNameImpl();
		return substanceDefinitionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceDefinitionOfficial createSubstanceDefinitionOfficial() {
		SubstanceDefinitionOfficialImpl substanceDefinitionOfficial = new SubstanceDefinitionOfficialImpl();
		return substanceDefinitionOfficial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceDefinitionProperty createSubstanceDefinitionProperty() {
		SubstanceDefinitionPropertyImpl substanceDefinitionProperty = new SubstanceDefinitionPropertyImpl();
		return substanceDefinitionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceDefinitionRelationship createSubstanceDefinitionRelationship() {
		SubstanceDefinitionRelationshipImpl substanceDefinitionRelationship = new SubstanceDefinitionRelationshipImpl();
		return substanceDefinitionRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceDefinitionRepresentation createSubstanceDefinitionRepresentation() {
		SubstanceDefinitionRepresentationImpl substanceDefinitionRepresentation = new SubstanceDefinitionRepresentationImpl();
		return substanceDefinitionRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceDefinitionSourceMaterial createSubstanceDefinitionSourceMaterial() {
		SubstanceDefinitionSourceMaterialImpl substanceDefinitionSourceMaterial = new SubstanceDefinitionSourceMaterialImpl();
		return substanceDefinitionSourceMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceDefinitionStructure createSubstanceDefinitionStructure() {
		SubstanceDefinitionStructureImpl substanceDefinitionStructure = new SubstanceDefinitionStructureImpl();
		return substanceDefinitionStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceIngredient createSubstanceIngredient() {
		SubstanceIngredientImpl substanceIngredient = new SubstanceIngredientImpl();
		return substanceIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceNucleicAcid createSubstanceNucleicAcid() {
		SubstanceNucleicAcidImpl substanceNucleicAcid = new SubstanceNucleicAcidImpl();
		return substanceNucleicAcid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceNucleicAcidLinkage createSubstanceNucleicAcidLinkage() {
		SubstanceNucleicAcidLinkageImpl substanceNucleicAcidLinkage = new SubstanceNucleicAcidLinkageImpl();
		return substanceNucleicAcidLinkage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceNucleicAcidSubunit createSubstanceNucleicAcidSubunit() {
		SubstanceNucleicAcidSubunitImpl substanceNucleicAcidSubunit = new SubstanceNucleicAcidSubunitImpl();
		return substanceNucleicAcidSubunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceNucleicAcidSugar createSubstanceNucleicAcidSugar() {
		SubstanceNucleicAcidSugarImpl substanceNucleicAcidSugar = new SubstanceNucleicAcidSugarImpl();
		return substanceNucleicAcidSugar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstancePolymer createSubstancePolymer() {
		SubstancePolymerImpl substancePolymer = new SubstancePolymerImpl();
		return substancePolymer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstancePolymerDegreeOfPolymerisation createSubstancePolymerDegreeOfPolymerisation() {
		SubstancePolymerDegreeOfPolymerisationImpl substancePolymerDegreeOfPolymerisation = new SubstancePolymerDegreeOfPolymerisationImpl();
		return substancePolymerDegreeOfPolymerisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstancePolymerMonomerSet createSubstancePolymerMonomerSet() {
		SubstancePolymerMonomerSetImpl substancePolymerMonomerSet = new SubstancePolymerMonomerSetImpl();
		return substancePolymerMonomerSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstancePolymerRepeat createSubstancePolymerRepeat() {
		SubstancePolymerRepeatImpl substancePolymerRepeat = new SubstancePolymerRepeatImpl();
		return substancePolymerRepeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstancePolymerRepeatUnit createSubstancePolymerRepeatUnit() {
		SubstancePolymerRepeatUnitImpl substancePolymerRepeatUnit = new SubstancePolymerRepeatUnitImpl();
		return substancePolymerRepeatUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstancePolymerStartingMaterial createSubstancePolymerStartingMaterial() {
		SubstancePolymerStartingMaterialImpl substancePolymerStartingMaterial = new SubstancePolymerStartingMaterialImpl();
		return substancePolymerStartingMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstancePolymerStructuralRepresentation createSubstancePolymerStructuralRepresentation() {
		SubstancePolymerStructuralRepresentationImpl substancePolymerStructuralRepresentation = new SubstancePolymerStructuralRepresentationImpl();
		return substancePolymerStructuralRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceProtein createSubstanceProtein() {
		SubstanceProteinImpl substanceProtein = new SubstanceProteinImpl();
		return substanceProtein;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceProteinSubunit createSubstanceProteinSubunit() {
		SubstanceProteinSubunitImpl substanceProteinSubunit = new SubstanceProteinSubunitImpl();
		return substanceProteinSubunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceReferenceInformation createSubstanceReferenceInformation() {
		SubstanceReferenceInformationImpl substanceReferenceInformation = new SubstanceReferenceInformationImpl();
		return substanceReferenceInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceReferenceInformationGene createSubstanceReferenceInformationGene() {
		SubstanceReferenceInformationGeneImpl substanceReferenceInformationGene = new SubstanceReferenceInformationGeneImpl();
		return substanceReferenceInformationGene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceReferenceInformationGeneElement createSubstanceReferenceInformationGeneElement() {
		SubstanceReferenceInformationGeneElementImpl substanceReferenceInformationGeneElement = new SubstanceReferenceInformationGeneElementImpl();
		return substanceReferenceInformationGeneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceReferenceInformationTarget createSubstanceReferenceInformationTarget() {
		SubstanceReferenceInformationTargetImpl substanceReferenceInformationTarget = new SubstanceReferenceInformationTargetImpl();
		return substanceReferenceInformationTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceSourceMaterial createSubstanceSourceMaterial() {
		SubstanceSourceMaterialImpl substanceSourceMaterial = new SubstanceSourceMaterialImpl();
		return substanceSourceMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceSourceMaterialAuthor createSubstanceSourceMaterialAuthor() {
		SubstanceSourceMaterialAuthorImpl substanceSourceMaterialAuthor = new SubstanceSourceMaterialAuthorImpl();
		return substanceSourceMaterialAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceSourceMaterialFractionDescription createSubstanceSourceMaterialFractionDescription() {
		SubstanceSourceMaterialFractionDescriptionImpl substanceSourceMaterialFractionDescription = new SubstanceSourceMaterialFractionDescriptionImpl();
		return substanceSourceMaterialFractionDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceSourceMaterialHybrid createSubstanceSourceMaterialHybrid() {
		SubstanceSourceMaterialHybridImpl substanceSourceMaterialHybrid = new SubstanceSourceMaterialHybridImpl();
		return substanceSourceMaterialHybrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceSourceMaterialOrganism createSubstanceSourceMaterialOrganism() {
		SubstanceSourceMaterialOrganismImpl substanceSourceMaterialOrganism = new SubstanceSourceMaterialOrganismImpl();
		return substanceSourceMaterialOrganism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceSourceMaterialOrganismGeneral createSubstanceSourceMaterialOrganismGeneral() {
		SubstanceSourceMaterialOrganismGeneralImpl substanceSourceMaterialOrganismGeneral = new SubstanceSourceMaterialOrganismGeneralImpl();
		return substanceSourceMaterialOrganismGeneral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceSourceMaterialPartDescription createSubstanceSourceMaterialPartDescription() {
		SubstanceSourceMaterialPartDescriptionImpl substanceSourceMaterialPartDescription = new SubstanceSourceMaterialPartDescriptionImpl();
		return substanceSourceMaterialPartDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDelivery createSupplyDelivery() {
		SupplyDeliveryImpl supplyDelivery = new SupplyDeliveryImpl();
		return supplyDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDeliveryStatus createSupplyDeliveryStatus() {
		SupplyDeliveryStatusImpl supplyDeliveryStatus = new SupplyDeliveryStatusImpl();
		return supplyDeliveryStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDeliverySuppliedItem createSupplyDeliverySuppliedItem() {
		SupplyDeliverySuppliedItemImpl supplyDeliverySuppliedItem = new SupplyDeliverySuppliedItemImpl();
		return supplyDeliverySuppliedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequest createSupplyRequest() {
		SupplyRequestImpl supplyRequest = new SupplyRequestImpl();
		return supplyRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequestParameter createSupplyRequestParameter() {
		SupplyRequestParameterImpl supplyRequestParameter = new SupplyRequestParameterImpl();
		return supplyRequestParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequestStatus createSupplyRequestStatus() {
		SupplyRequestStatusImpl supplyRequestStatus = new SupplyRequestStatusImpl();
		return supplyRequestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRestfulInteraction createSystemRestfulInteraction() {
		SystemRestfulInteractionImpl systemRestfulInteraction = new SystemRestfulInteractionImpl();
		return systemRestfulInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskInput createTaskInput() {
		TaskInputImpl taskInput = new TaskInputImpl();
		return taskInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskIntent createTaskIntent() {
		TaskIntentImpl taskIntent = new TaskIntentImpl();
		return taskIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskOutput createTaskOutput() {
		TaskOutputImpl taskOutput = new TaskOutputImpl();
		return taskOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskPerformer createTaskPerformer() {
		TaskPerformerImpl taskPerformer = new TaskPerformerImpl();
		return taskPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRestriction createTaskRestriction() {
		TaskRestrictionImpl taskRestriction = new TaskRestrictionImpl();
		return taskRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStatus createTaskStatus() {
		TaskStatusImpl taskStatus = new TaskStatusImpl();
		return taskStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyCapabilities createTerminologyCapabilities() {
		TerminologyCapabilitiesImpl terminologyCapabilities = new TerminologyCapabilitiesImpl();
		return terminologyCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyCapabilitiesClosure createTerminologyCapabilitiesClosure() {
		TerminologyCapabilitiesClosureImpl terminologyCapabilitiesClosure = new TerminologyCapabilitiesClosureImpl();
		return terminologyCapabilitiesClosure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyCapabilitiesCodeSystem createTerminologyCapabilitiesCodeSystem() {
		TerminologyCapabilitiesCodeSystemImpl terminologyCapabilitiesCodeSystem = new TerminologyCapabilitiesCodeSystemImpl();
		return terminologyCapabilitiesCodeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyCapabilitiesExpansion createTerminologyCapabilitiesExpansion() {
		TerminologyCapabilitiesExpansionImpl terminologyCapabilitiesExpansion = new TerminologyCapabilitiesExpansionImpl();
		return terminologyCapabilitiesExpansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyCapabilitiesFilter createTerminologyCapabilitiesFilter() {
		TerminologyCapabilitiesFilterImpl terminologyCapabilitiesFilter = new TerminologyCapabilitiesFilterImpl();
		return terminologyCapabilitiesFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyCapabilitiesImplementation createTerminologyCapabilitiesImplementation() {
		TerminologyCapabilitiesImplementationImpl terminologyCapabilitiesImplementation = new TerminologyCapabilitiesImplementationImpl();
		return terminologyCapabilitiesImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyCapabilitiesParameter createTerminologyCapabilitiesParameter() {
		TerminologyCapabilitiesParameterImpl terminologyCapabilitiesParameter = new TerminologyCapabilitiesParameterImpl();
		return terminologyCapabilitiesParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyCapabilitiesSoftware createTerminologyCapabilitiesSoftware() {
		TerminologyCapabilitiesSoftwareImpl terminologyCapabilitiesSoftware = new TerminologyCapabilitiesSoftwareImpl();
		return terminologyCapabilitiesSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyCapabilitiesTranslation createTerminologyCapabilitiesTranslation() {
		TerminologyCapabilitiesTranslationImpl terminologyCapabilitiesTranslation = new TerminologyCapabilitiesTranslationImpl();
		return terminologyCapabilitiesTranslation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyCapabilitiesValidateCode createTerminologyCapabilitiesValidateCode() {
		TerminologyCapabilitiesValidateCodeImpl terminologyCapabilitiesValidateCode = new TerminologyCapabilitiesValidateCodeImpl();
		return terminologyCapabilitiesValidateCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyCapabilitiesVersion createTerminologyCapabilitiesVersion() {
		TerminologyCapabilitiesVersionImpl terminologyCapabilitiesVersion = new TerminologyCapabilitiesVersionImpl();
		return terminologyCapabilitiesVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestPlan createTestPlan() {
		TestPlanImpl testPlan = new TestPlanImpl();
		return testPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestPlanAssertion createTestPlanAssertion() {
		TestPlanAssertionImpl testPlanAssertion = new TestPlanAssertionImpl();
		return testPlanAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestPlanDependency createTestPlanDependency() {
		TestPlanDependencyImpl testPlanDependency = new TestPlanDependencyImpl();
		return testPlanDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestPlanDependency1 createTestPlanDependency1() {
		TestPlanDependency1Impl testPlanDependency1 = new TestPlanDependency1Impl();
		return testPlanDependency1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestPlanScript createTestPlanScript() {
		TestPlanScriptImpl testPlanScript = new TestPlanScriptImpl();
		return testPlanScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestPlanTestCase createTestPlanTestCase() {
		TestPlanTestCaseImpl testPlanTestCase = new TestPlanTestCaseImpl();
		return testPlanTestCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestPlanTestData createTestPlanTestData() {
		TestPlanTestDataImpl testPlanTestData = new TestPlanTestDataImpl();
		return testPlanTestData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestPlanTestRun createTestPlanTestRun() {
		TestPlanTestRunImpl testPlanTestRun = new TestPlanTestRunImpl();
		return testPlanTestRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReport createTestReport() {
		TestReportImpl testReport = new TestReportImpl();
		return testReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportAction createTestReportAction() {
		TestReportActionImpl testReportAction = new TestReportActionImpl();
		return testReportAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportAction1 createTestReportAction1() {
		TestReportAction1Impl testReportAction1 = new TestReportAction1Impl();
		return testReportAction1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportAction2 createTestReportAction2() {
		TestReportAction2Impl testReportAction2 = new TestReportAction2Impl();
		return testReportAction2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportActionResult createTestReportActionResult() {
		TestReportActionResultImpl testReportActionResult = new TestReportActionResultImpl();
		return testReportActionResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportAssert createTestReportAssert() {
		TestReportAssertImpl testReportAssert = new TestReportAssertImpl();
		return testReportAssert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportOperation createTestReportOperation() {
		TestReportOperationImpl testReportOperation = new TestReportOperationImpl();
		return testReportOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportParticipant createTestReportParticipant() {
		TestReportParticipantImpl testReportParticipant = new TestReportParticipantImpl();
		return testReportParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportParticipantType createTestReportParticipantType() {
		TestReportParticipantTypeImpl testReportParticipantType = new TestReportParticipantTypeImpl();
		return testReportParticipantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportRequirement createTestReportRequirement() {
		TestReportRequirementImpl testReportRequirement = new TestReportRequirementImpl();
		return testReportRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportResult createTestReportResult() {
		TestReportResultImpl testReportResult = new TestReportResultImpl();
		return testReportResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportSetup createTestReportSetup() {
		TestReportSetupImpl testReportSetup = new TestReportSetupImpl();
		return testReportSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportStatus createTestReportStatus() {
		TestReportStatusImpl testReportStatus = new TestReportStatusImpl();
		return testReportStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportTeardown createTestReportTeardown() {
		TestReportTeardownImpl testReportTeardown = new TestReportTeardownImpl();
		return testReportTeardown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportTest createTestReportTest() {
		TestReportTestImpl testReportTest = new TestReportTestImpl();
		return testReportTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScript createTestScript() {
		TestScriptImpl testScript = new TestScriptImpl();
		return testScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptAction createTestScriptAction() {
		TestScriptActionImpl testScriptAction = new TestScriptActionImpl();
		return testScriptAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptAction1 createTestScriptAction1() {
		TestScriptAction1Impl testScriptAction1 = new TestScriptAction1Impl();
		return testScriptAction1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptAction2 createTestScriptAction2() {
		TestScriptAction2Impl testScriptAction2 = new TestScriptAction2Impl();
		return testScriptAction2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptAssert createTestScriptAssert() {
		TestScriptAssertImpl testScriptAssert = new TestScriptAssertImpl();
		return testScriptAssert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptCapability createTestScriptCapability() {
		TestScriptCapabilityImpl testScriptCapability = new TestScriptCapabilityImpl();
		return testScriptCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptDestination createTestScriptDestination() {
		TestScriptDestinationImpl testScriptDestination = new TestScriptDestinationImpl();
		return testScriptDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptFixture createTestScriptFixture() {
		TestScriptFixtureImpl testScriptFixture = new TestScriptFixtureImpl();
		return testScriptFixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptLink createTestScriptLink() {
		TestScriptLinkImpl testScriptLink = new TestScriptLinkImpl();
		return testScriptLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptMetadata createTestScriptMetadata() {
		TestScriptMetadataImpl testScriptMetadata = new TestScriptMetadataImpl();
		return testScriptMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptOperation createTestScriptOperation() {
		TestScriptOperationImpl testScriptOperation = new TestScriptOperationImpl();
		return testScriptOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptOrigin createTestScriptOrigin() {
		TestScriptOriginImpl testScriptOrigin = new TestScriptOriginImpl();
		return testScriptOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRequestHeader createTestScriptRequestHeader() {
		TestScriptRequestHeaderImpl testScriptRequestHeader = new TestScriptRequestHeaderImpl();
		return testScriptRequestHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRequestMethodCode createTestScriptRequestMethodCode() {
		TestScriptRequestMethodCodeImpl testScriptRequestMethodCode = new TestScriptRequestMethodCodeImpl();
		return testScriptRequestMethodCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRequirement createTestScriptRequirement() {
		TestScriptRequirementImpl testScriptRequirement = new TestScriptRequirementImpl();
		return testScriptRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptScope createTestScriptScope() {
		TestScriptScopeImpl testScriptScope = new TestScriptScopeImpl();
		return testScriptScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptSetup createTestScriptSetup() {
		TestScriptSetupImpl testScriptSetup = new TestScriptSetupImpl();
		return testScriptSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptTeardown createTestScriptTeardown() {
		TestScriptTeardownImpl testScriptTeardown = new TestScriptTeardownImpl();
		return testScriptTeardown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptTest createTestScriptTest() {
		TestScriptTestImpl testScriptTest = new TestScriptTestImpl();
		return testScriptTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptVariable createTestScriptVariable() {
		TestScriptVariableImpl testScriptVariable = new TestScriptVariableImpl();
		return testScriptVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing createTiming() {
		TimingImpl timing = new TimingImpl();
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingRepeat createTimingRepeat() {
		TimingRepeatImpl timingRepeat = new TimingRepeatImpl();
		return timingRepeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transport createTransport() {
		TransportImpl transport = new TransportImpl();
		return transport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportInput createTransportInput() {
		TransportInputImpl transportInput = new TransportInputImpl();
		return transportInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportIntent createTransportIntent() {
		TransportIntentImpl transportIntent = new TransportIntentImpl();
		return transportIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportOutput createTransportOutput() {
		TransportOutputImpl transportOutput = new TransportOutputImpl();
		return transportOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportRestriction createTransportRestriction() {
		TransportRestrictionImpl transportRestriction = new TransportRestrictionImpl();
		return transportRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportStatus createTransportStatus() {
		TransportStatusImpl transportStatus = new TransportStatusImpl();
		return transportStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerDefinition createTriggerDefinition() {
		TriggerDefinitionImpl triggerDefinition = new TriggerDefinitionImpl();
		return triggerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggeredBytype createTriggeredBytype() {
		TriggeredBytypeImpl triggeredBytype = new TriggeredBytypeImpl();
		return triggeredBytype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerType createTriggerType() {
		TriggerTypeImpl triggerType = new TriggerTypeImpl();
		return triggerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDerivationRule createTypeDerivationRule() {
		TypeDerivationRuleImpl typeDerivationRule = new TypeDerivationRuleImpl();
		return typeDerivationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRestfulInteraction createTypeRestfulInteraction() {
		TypeRestfulInteractionImpl typeRestfulInteraction = new TypeRestfulInteractionImpl();
		return typeRestfulInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDIEntryType createUDIEntryType() {
		UDIEntryTypeImpl udiEntryType = new UDIEntryTypeImpl();
		return udiEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsOfTime createUnitsOfTime() {
		UnitsOfTimeImpl unitsOfTime = new UnitsOfTimeImpl();
		return unitsOfTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt createUnsignedInt() {
		UnsignedIntImpl unsignedInt = new UnsignedIntImpl();
		return unsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri createUri() {
		UriImpl uri = new UriImpl();
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Url createUrl() {
		UrlImpl url = new UrlImpl();
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageContext createUsageContext() {
		UsageContextImpl usageContext = new UsageContextImpl();
		return usageContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Use createUse() {
		UseImpl use = new UseImpl();
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uuid createUuid() {
		UuidImpl uuid = new UuidImpl();
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSet createValueSet() {
		ValueSetImpl valueSet = new ValueSetImpl();
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetCompose createValueSetCompose() {
		ValueSetComposeImpl valueSetCompose = new ValueSetComposeImpl();
		return valueSetCompose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetConcept createValueSetConcept() {
		ValueSetConceptImpl valueSetConcept = new ValueSetConceptImpl();
		return valueSetConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetContains createValueSetContains() {
		ValueSetContainsImpl valueSetContains = new ValueSetContainsImpl();
		return valueSetContains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetDesignation createValueSetDesignation() {
		ValueSetDesignationImpl valueSetDesignation = new ValueSetDesignationImpl();
		return valueSetDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetExpansion createValueSetExpansion() {
		ValueSetExpansionImpl valueSetExpansion = new ValueSetExpansionImpl();
		return valueSetExpansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetFilter createValueSetFilter() {
		ValueSetFilterImpl valueSetFilter = new ValueSetFilterImpl();
		return valueSetFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetInclude createValueSetInclude() {
		ValueSetIncludeImpl valueSetInclude = new ValueSetIncludeImpl();
		return valueSetInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetParameter createValueSetParameter() {
		ValueSetParameterImpl valueSetParameter = new ValueSetParameterImpl();
		return valueSetParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetProperty createValueSetProperty() {
		ValueSetPropertyImpl valueSetProperty = new ValueSetPropertyImpl();
		return valueSetProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetProperty1 createValueSetProperty1() {
		ValueSetProperty1Impl valueSetProperty1 = new ValueSetProperty1Impl();
		return valueSetProperty1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetScope createValueSetScope() {
		ValueSetScopeImpl valueSetScope = new ValueSetScopeImpl();
		return valueSetScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetSubProperty createValueSetSubProperty() {
		ValueSetSubPropertyImpl valueSetSubProperty = new ValueSetSubPropertyImpl();
		return valueSetSubProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationResult createVerificationResult() {
		VerificationResultImpl verificationResult = new VerificationResultImpl();
		return verificationResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationResultAttestation createVerificationResultAttestation() {
		VerificationResultAttestationImpl verificationResultAttestation = new VerificationResultAttestationImpl();
		return verificationResultAttestation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationResultPrimarySource createVerificationResultPrimarySource() {
		VerificationResultPrimarySourceImpl verificationResultPrimarySource = new VerificationResultPrimarySourceImpl();
		return verificationResultPrimarySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationResultStatus createVerificationResultStatus() {
		VerificationResultStatusImpl verificationResultStatus = new VerificationResultStatusImpl();
		return verificationResultStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationResultValidator createVerificationResultValidator() {
		VerificationResultValidatorImpl verificationResultValidator = new VerificationResultValidatorImpl();
		return verificationResultValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionIndependentResourceTypesAll createVersionIndependentResourceTypesAll() {
		VersionIndependentResourceTypesAllImpl versionIndependentResourceTypesAll = new VersionIndependentResourceTypesAllImpl();
		return versionIndependentResourceTypesAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualServiceDetail createVirtualServiceDetail() {
		VirtualServiceDetailImpl virtualServiceDetail = new VirtualServiceDetailImpl();
		return virtualServiceDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionBase createVisionBase() {
		VisionBaseImpl visionBase = new VisionBaseImpl();
		return visionBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionEyes createVisionEyes() {
		VisionEyesImpl visionEyes = new VisionEyesImpl();
		return visionEyes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionPrescription createVisionPrescription() {
		VisionPrescriptionImpl visionPrescription = new VisionPrescriptionImpl();
		return visionPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionPrescriptionLensSpecification createVisionPrescriptionLensSpecification() {
		VisionPrescriptionLensSpecificationImpl visionPrescriptionLensSpecification = new VisionPrescriptionLensSpecificationImpl();
		return visionPrescriptionLensSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionPrescriptionPrism createVisionPrescriptionPrism() {
		VisionPrescriptionPrismImpl visionPrescriptionPrism = new VisionPrescriptionPrismImpl();
		return visionPrescriptionPrism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountStatusEnum createAccountStatusEnumFromString(EDataType eDataType, String initialValue) {
		AccountStatusEnum result = AccountStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccountStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionCardinalityBehaviorEnum createActionCardinalityBehaviorEnumFromString(EDataType eDataType, String initialValue) {
		ActionCardinalityBehaviorEnum result = ActionCardinalityBehaviorEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionCardinalityBehaviorEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionConditionKindEnum createActionConditionKindEnumFromString(EDataType eDataType, String initialValue) {
		ActionConditionKindEnum result = ActionConditionKindEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionConditionKindEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGroupingBehaviorEnum createActionGroupingBehaviorEnumFromString(EDataType eDataType, String initialValue) {
		ActionGroupingBehaviorEnum result = ActionGroupingBehaviorEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionGroupingBehaviorEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionParticipantTypeEnum createActionParticipantTypeEnumFromString(EDataType eDataType, String initialValue) {
		ActionParticipantTypeEnum result = ActionParticipantTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionParticipantTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionPrecheckBehaviorEnum createActionPrecheckBehaviorEnumFromString(EDataType eDataType, String initialValue) {
		ActionPrecheckBehaviorEnum result = ActionPrecheckBehaviorEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionPrecheckBehaviorEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRelationshipTypeEnum createActionRelationshipTypeEnumFromString(EDataType eDataType, String initialValue) {
		ActionRelationshipTypeEnum result = ActionRelationshipTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionRelationshipTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRequiredBehaviorEnum createActionRequiredBehaviorEnumFromString(EDataType eDataType, String initialValue) {
		ActionRequiredBehaviorEnum result = ActionRequiredBehaviorEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionRequiredBehaviorEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSelectionBehaviorEnum createActionSelectionBehaviorEnumFromString(EDataType eDataType, String initialValue) {
		ActionSelectionBehaviorEnum result = ActionSelectionBehaviorEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionSelectionBehaviorEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressTypeEnum createAddressTypeEnumFromString(EDataType eDataType, String initialValue) {
		AddressTypeEnum result = AddressTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressUseEnum createAddressUseEnumFromString(EDataType eDataType, String initialValue) {
		AddressUseEnum result = AddressUseEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressUseEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeGenderEnum createAdministrativeGenderEnumFromString(EDataType eDataType, String initialValue) {
		AdministrativeGenderEnum result = AdministrativeGenderEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdministrativeGenderEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventActualityEnum createAdverseEventActualityEnumFromString(EDataType eDataType, String initialValue) {
		AdverseEventActualityEnum result = AdverseEventActualityEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdverseEventActualityEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventStatusEnum createAdverseEventStatusEnumFromString(EDataType eDataType, String initialValue) {
		AdverseEventStatusEnum result = AdverseEventStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdverseEventStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgeUnitsEnum createAgeUnitsEnumFromString(EDataType eDataType, String initialValue) {
		AgeUnitsEnum result = AgeUnitsEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAgeUnitsEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationModeEnum createAggregationModeEnumFromString(EDataType eDataType, String initialValue) {
		AggregationModeEnum result = AggregationModeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationModeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCategoryEnum createAllergyIntoleranceCategoryEnumFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceCategoryEnum result = AllergyIntoleranceCategoryEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCategoryEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCriticalityEnum createAllergyIntoleranceCriticalityEnumFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceCriticalityEnum result = AllergyIntoleranceCriticalityEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCriticalityEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceSeverityEnum createAllergyIntoleranceSeverityEnumFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceSeverityEnum result = AllergyIntoleranceSeverityEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceSeverityEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllResourceTypesEnum createAllResourceTypesEnumFromString(EDataType eDataType, String initialValue) {
		AllResourceTypesEnum result = AllResourceTypesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllResourceTypesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentResponseStatusEnum createAppointmentResponseStatusEnumFromString(EDataType eDataType, String initialValue) {
		AppointmentResponseStatusEnum result = AppointmentResponseStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAppointmentResponseStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentStatusEnum createAppointmentStatusEnumFromString(EDataType eDataType, String initialValue) {
		AppointmentStatusEnum result = AppointmentStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAppointmentStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactAssessmentDispositionEnum createArtifactAssessmentDispositionEnumFromString(EDataType eDataType, String initialValue) {
		ArtifactAssessmentDispositionEnum result = ArtifactAssessmentDispositionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactAssessmentDispositionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactAssessmentInformationTypeEnum createArtifactAssessmentInformationTypeEnumFromString(EDataType eDataType, String initialValue) {
		ArtifactAssessmentInformationTypeEnum result = ArtifactAssessmentInformationTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactAssessmentInformationTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactAssessmentWorkflowStatusEnum createArtifactAssessmentWorkflowStatusEnumFromString(EDataType eDataType, String initialValue) {
		ArtifactAssessmentWorkflowStatusEnum result = ArtifactAssessmentWorkflowStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactAssessmentWorkflowStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionDirectionTypeEnum createAssertionDirectionTypeEnumFromString(EDataType eDataType, String initialValue) {
		AssertionDirectionTypeEnum result = AssertionDirectionTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionDirectionTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionManualCompletionTypeEnum createAssertionManualCompletionTypeEnumFromString(EDataType eDataType, String initialValue) {
		AssertionManualCompletionTypeEnum result = AssertionManualCompletionTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionManualCompletionTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionOperatorTypeEnum createAssertionOperatorTypeEnumFromString(EDataType eDataType, String initialValue) {
		AssertionOperatorTypeEnum result = AssertionOperatorTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionOperatorTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionResponseTypesEnum createAssertionResponseTypesEnumFromString(EDataType eDataType, String initialValue) {
		AssertionResponseTypesEnum result = AssertionResponseTypesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionResponseTypesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventActionEnum createAuditEventActionEnumFromString(EDataType eDataType, String initialValue) {
		AuditEventActionEnum result = AuditEventActionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventActionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventSeverityEnum createAuditEventSeverityEnumFromString(EDataType eDataType, String initialValue) {
		AuditEventSeverityEnum result = AuditEventSeverityEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventSeverityEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingStrengthEnum createBindingStrengthEnumFromString(EDataType eDataType, String initialValue) {
		BindingStrengthEnum result = BindingStrengthEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindingStrengthEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiologicallyDerivedProductDispenseCodesEnum createBiologicallyDerivedProductDispenseCodesEnumFromString(EDataType eDataType, String initialValue) {
		BiologicallyDerivedProductDispenseCodesEnum result = BiologicallyDerivedProductDispenseCodesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBiologicallyDerivedProductDispenseCodesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleTypeEnum createBundleTypeEnumFromString(EDataType eDataType, String initialValue) {
		BundleTypeEnum result = BundleTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBundleTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementKindEnum createCapabilityStatementKindEnumFromString(EDataType eDataType, String initialValue) {
		CapabilityStatementKindEnum result = CapabilityStatementKindEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCapabilityStatementKindEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanIntentEnum createCarePlanIntentEnumFromString(EDataType eDataType, String initialValue) {
		CarePlanIntentEnum result = CarePlanIntentEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanIntentEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamStatusEnum createCareTeamStatusEnumFromString(EDataType eDataType, String initialValue) {
		CareTeamStatusEnum result = CareTeamStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCareTeamStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicCombinationEnum createCharacteristicCombinationEnumFromString(EDataType eDataType, String initialValue) {
		CharacteristicCombinationEnum result = CharacteristicCombinationEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharacteristicCombinationEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeItemStatusEnum createChargeItemStatusEnumFromString(EDataType eDataType, String initialValue) {
		ChargeItemStatusEnum result = ChargeItemStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChargeItemStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimProcessingCodesEnum createClaimProcessingCodesEnumFromString(EDataType eDataType, String initialValue) {
		ClaimProcessingCodesEnum result = ClaimProcessingCodesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClaimProcessingCodesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalUseDefinitionTypeEnum createClinicalUseDefinitionTypeEnumFromString(EDataType eDataType, String initialValue) {
		ClinicalUseDefinitionTypeEnum result = ClinicalUseDefinitionTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClinicalUseDefinitionTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSearchSupportEnum createCodeSearchSupportEnumFromString(EDataType eDataType, String initialValue) {
		CodeSearchSupportEnum result = CodeSearchSupportEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeSearchSupportEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemContentModeEnum createCodeSystemContentModeEnumFromString(EDataType eDataType, String initialValue) {
		CodeSystemContentModeEnum result = CodeSystemContentModeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeSystemContentModeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemHierarchyMeaningEnum createCodeSystemHierarchyMeaningEnumFromString(EDataType eDataType, String initialValue) {
		CodeSystemHierarchyMeaningEnum result = CodeSystemHierarchyMeaningEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeSystemHierarchyMeaningEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonLanguagesEnum createCommonLanguagesEnumFromString(EDataType eDataType, String initialValue) {
		CommonLanguagesEnum result = CommonLanguagesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommonLanguagesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentTypeEnum createCompartmentTypeEnumFromString(EDataType eDataType, String initialValue) {
		CompartmentTypeEnum result = CompartmentTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompartmentTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionStatusEnum createCompositionStatusEnumFromString(EDataType eDataType, String initialValue) {
		CompositionStatusEnum result = CompositionStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositionStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapAttributeTypeEnum createConceptMapAttributeTypeEnumFromString(EDataType eDataType, String initialValue) {
		ConceptMapAttributeTypeEnum result = ConceptMapAttributeTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptMapAttributeTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapGroupUnmappedModeEnum createConceptMapGroupUnmappedModeEnumFromString(EDataType eDataType, String initialValue) {
		ConceptMapGroupUnmappedModeEnum result = ConceptMapGroupUnmappedModeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptMapGroupUnmappedModeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapPropertyTypeEnum createConceptMapPropertyTypeEnumFromString(EDataType eDataType, String initialValue) {
		ConceptMapPropertyTypeEnum result = ConceptMapPropertyTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptMapPropertyTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapRelationshipEnum createConceptMapRelationshipEnumFromString(EDataType eDataType, String initialValue) {
		ConceptMapRelationshipEnum result = ConceptMapRelationshipEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptMapRelationshipEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteFHIRTypesEnum createConcreteFHIRTypesEnumFromString(EDataType eDataType, String initialValue) {
		ConcreteFHIRTypesEnum result = ConcreteFHIRTypesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConcreteFHIRTypesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalDeleteStatusEnum createConditionalDeleteStatusEnumFromString(EDataType eDataType, String initialValue) {
		ConditionalDeleteStatusEnum result = ConditionalDeleteStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionalDeleteStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalReadStatusEnum createConditionalReadStatusEnumFromString(EDataType eDataType, String initialValue) {
		ConditionalReadStatusEnum result = ConditionalReadStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionalReadStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionPreconditionTypeEnum createConditionPreconditionTypeEnumFromString(EDataType eDataType, String initialValue) {
		ConditionPreconditionTypeEnum result = ConditionPreconditionTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionPreconditionTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionQuestionnairePurposeEnum createConditionQuestionnairePurposeEnumFromString(EDataType eDataType, String initialValue) {
		ConditionQuestionnairePurposeEnum result = ConditionQuestionnairePurposeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionQuestionnairePurposeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceExpectationEnum createConformanceExpectationEnumFromString(EDataType eDataType, String initialValue) {
		ConformanceExpectationEnum result = ConformanceExpectationEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConformanceExpectationEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentDataMeaningEnum createConsentDataMeaningEnumFromString(EDataType eDataType, String initialValue) {
		ConsentDataMeaningEnum result = ConsentDataMeaningEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentDataMeaningEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentProvisionTypeEnum createConsentProvisionTypeEnumFromString(EDataType eDataType, String initialValue) {
		ConsentProvisionTypeEnum result = ConsentProvisionTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentProvisionTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentStateEnum createConsentStateEnumFromString(EDataType eDataType, String initialValue) {
		ConsentStateEnum result = ConsentStateEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentStateEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSeverityEnum createConstraintSeverityEnumFromString(EDataType eDataType, String initialValue) {
		ConstraintSeverityEnum result = ConstraintSeverityEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintSeverityEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointSystemEnum createContactPointSystemEnumFromString(EDataType eDataType, String initialValue) {
		ContactPointSystemEnum result = ContactPointSystemEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactPointSystemEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointUseEnum createContactPointUseEnumFromString(EDataType eDataType, String initialValue) {
		ContactPointUseEnum result = ContactPointUseEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactPointUseEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourcePublicationStatusCodesEnum createContractResourcePublicationStatusCodesEnumFromString(EDataType eDataType, String initialValue) {
		ContractResourcePublicationStatusCodesEnum result = ContractResourcePublicationStatusCodesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourcePublicationStatusCodesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourceStatusCodesEnum createContractResourceStatusCodesEnumFromString(EDataType eDataType, String initialValue) {
		ContractResourceStatusCodesEnum result = ContractResourceStatusCodesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourceStatusCodesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributorTypeEnum createContributorTypeEnumFromString(EDataType eDataType, String initialValue) {
		ContributorTypeEnum result = ContributorTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContributorTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriteriaNotExistsBehaviorEnum createCriteriaNotExistsBehaviorEnumFromString(EDataType eDataType, String initialValue) {
		CriteriaNotExistsBehaviorEnum result = CriteriaNotExistsBehaviorEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCriteriaNotExistsBehaviorEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionResourceTypesEnum createDefinitionResourceTypesEnumFromString(EDataType eDataType, String initialValue) {
		DefinitionResourceTypesEnum result = DefinitionResourceTypesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefinitionResourceTypesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueSeverityEnum createDetectedIssueSeverityEnumFromString(EDataType eDataType, String initialValue) {
		DetectedIssueSeverityEnum result = DetectedIssueSeverityEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDetectedIssueSeverityEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueStatusEnum createDetectedIssueStatusEnumFromString(EDataType eDataType, String initialValue) {
		DetectedIssueStatusEnum result = DetectedIssueStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDetectedIssueStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceCorrectiveActionScopeEnum createDeviceCorrectiveActionScopeEnumFromString(EDataType eDataType, String initialValue) {
		DeviceCorrectiveActionScopeEnum result = DeviceCorrectiveActionScopeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceCorrectiveActionScopeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDefinitionRegulatoryIdentifierTypeEnum createDeviceDefinitionRegulatoryIdentifierTypeEnumFromString(EDataType eDataType, String initialValue) {
		DeviceDefinitionRegulatoryIdentifierTypeEnum result = DeviceDefinitionRegulatoryIdentifierTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceDefinitionRegulatoryIdentifierTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDispenseStatusCodesEnum createDeviceDispenseStatusCodesEnumFromString(EDataType eDataType, String initialValue) {
		DeviceDispenseStatusCodesEnum result = DeviceDispenseStatusCodesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceDispenseStatusCodesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationStateEnum createDeviceMetricCalibrationStateEnumFromString(EDataType eDataType, String initialValue) {
		DeviceMetricCalibrationStateEnum result = DeviceMetricCalibrationStateEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCalibrationStateEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationTypeEnum createDeviceMetricCalibrationTypeEnumFromString(EDataType eDataType, String initialValue) {
		DeviceMetricCalibrationTypeEnum result = DeviceMetricCalibrationTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCalibrationTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCategoryEnum createDeviceMetricCategoryEnumFromString(EDataType eDataType, String initialValue) {
		DeviceMetricCategoryEnum result = DeviceMetricCategoryEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCategoryEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricOperationalStatusEnum createDeviceMetricOperationalStatusEnumFromString(EDataType eDataType, String initialValue) {
		DeviceMetricOperationalStatusEnum result = DeviceMetricOperationalStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricOperationalStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceNameTypeEnum createDeviceNameTypeEnumFromString(EDataType eDataType, String initialValue) {
		DeviceNameTypeEnum result = DeviceNameTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceNameTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceProductionIdentifierInUDIEnum createDeviceProductionIdentifierInUDIEnumFromString(EDataType eDataType, String initialValue) {
		DeviceProductionIdentifierInUDIEnum result = DeviceProductionIdentifierInUDIEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceProductionIdentifierInUDIEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUsageStatusEnum createDeviceUsageStatusEnumFromString(EDataType eDataType, String initialValue) {
		DeviceUsageStatusEnum result = DeviceUsageStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceUsageStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportStatusEnum createDiagnosticReportStatusEnumFromString(EDataType eDataType, String initialValue) {
		DiagnosticReportStatusEnum result = DiagnosticReportStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticReportStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscriminatorTypeEnum createDiscriminatorTypeEnumFromString(EDataType eDataType, String initialValue) {
		DiscriminatorTypeEnum result = DiscriminatorTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiscriminatorTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentModeEnum createDocumentModeEnumFromString(EDataType eDataType, String initialValue) {
		DocumentModeEnum result = DocumentModeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentModeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceStatusEnum createDocumentReferenceStatusEnumFromString(EDataType eDataType, String initialValue) {
		DocumentReferenceStatusEnum result = DocumentReferenceStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentReferenceStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityOutcomeEnum createEligibilityOutcomeEnumFromString(EDataType eDataType, String initialValue) {
		EligibilityOutcomeEnum result = EligibilityOutcomeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEligibilityOutcomeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityRequestPurposeEnum createEligibilityRequestPurposeEnumFromString(EDataType eDataType, String initialValue) {
		EligibilityRequestPurposeEnum result = EligibilityRequestPurposeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEligibilityRequestPurposeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponsePurposeEnum createEligibilityResponsePurposeEnumFromString(EDataType eDataType, String initialValue) {
		EligibilityResponsePurposeEnum result = EligibilityResponsePurposeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEligibilityResponsePurposeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableWhenBehaviorEnum createEnableWhenBehaviorEnumFromString(EDataType eDataType, String initialValue) {
		EnableWhenBehaviorEnum result = EnableWhenBehaviorEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnableWhenBehaviorEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocationStatusEnum createEncounterLocationStatusEnumFromString(EDataType eDataType, String initialValue) {
		EncounterLocationStatusEnum result = EncounterLocationStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterLocationStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterStatusEnum createEncounterStatusEnumFromString(EDataType eDataType, String initialValue) {
		EncounterStatusEnum result = EncounterStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointStatusEnum createEndpointStatusEnumFromString(EDataType eDataType, String initialValue) {
		EndpointStatusEnum result = EndpointStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndpointStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentOutcomeEnum createEnrollmentOutcomeEnumFromString(EDataType eDataType, String initialValue) {
		EnrollmentOutcomeEnum result = EnrollmentOutcomeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnrollmentOutcomeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareStatusEnum createEpisodeOfCareStatusEnumFromString(EDataType eDataType, String initialValue) {
		EpisodeOfCareStatusEnum result = EpisodeOfCareStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEpisodeOfCareStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventCapabilityModeEnum createEventCapabilityModeEnumFromString(EDataType eDataType, String initialValue) {
		EventCapabilityModeEnum result = EventCapabilityModeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventCapabilityModeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventResourceTypesEnum createEventResourceTypesEnumFromString(EDataType eDataType, String initialValue) {
		EventResourceTypesEnum result = EventResourceTypesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventResourceTypesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventStatusEnum createEventStatusEnumFromString(EDataType eDataType, String initialValue) {
		EventStatusEnum result = EventStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTimingEnum createEventTimingEnumFromString(EDataType eDataType, String initialValue) {
		EventTimingEnum result = EventTimingEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTimingEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceVariableHandlingEnum createEvidenceVariableHandlingEnumFromString(EDataType eDataType, String initialValue) {
		EvidenceVariableHandlingEnum result = EvidenceVariableHandlingEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvidenceVariableHandlingEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleScenarioActorTypeEnum createExampleScenarioActorTypeEnumFromString(EDataType eDataType, String initialValue) {
		ExampleScenarioActorTypeEnum result = ExampleScenarioActorTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleScenarioActorTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitStatusEnum createExplanationOfBenefitStatusEnumFromString(EDataType eDataType, String initialValue) {
		ExplanationOfBenefitStatusEnum result = ExplanationOfBenefitStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExplanationOfBenefitStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionContextTypeEnum createExtensionContextTypeEnumFromString(EDataType eDataType, String initialValue) {
		ExtensionContextTypeEnum result = ExtensionContextTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtensionContextTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryStatusEnum createFamilyHistoryStatusEnumFromString(EDataType eDataType, String initialValue) {
		FamilyHistoryStatusEnum result = FamilyHistoryStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFamilyHistoryStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRDeviceStatusEnum createFHIRDeviceStatusEnumFromString(EDataType eDataType, String initialValue) {
		FHIRDeviceStatusEnum result = FHIRDeviceStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRDeviceStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRPathTypesEnum createFHIRPathTypesEnumFromString(EDataType eDataType, String initialValue) {
		FHIRPathTypesEnum result = FHIRPathTypesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRPathTypesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRSubstanceStatusEnum createFHIRSubstanceStatusEnumFromString(EDataType eDataType, String initialValue) {
		FHIRSubstanceStatusEnum result = FHIRSubstanceStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRSubstanceStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRTypesEnum createFHIRTypesEnumFromString(EDataType eDataType, String initialValue) {
		FHIRTypesEnum result = FHIRTypesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRTypesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRVersionEnum createFHIRVersionEnumFromString(EDataType eDataType, String initialValue) {
		FHIRVersionEnum result = FHIRVersionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRVersionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperatorEnum createFilterOperatorEnumFromString(EDataType eDataType, String initialValue) {
		FilterOperatorEnum result = FilterOperatorEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterOperatorEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialResourceStatusCodesEnum createFinancialResourceStatusCodesEnumFromString(EDataType eDataType, String initialValue) {
		FinancialResourceStatusCodesEnum result = FinancialResourceStatusCodesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFinancialResourceStatusCodesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagStatusEnum createFlagStatusEnumFromString(EDataType eDataType, String initialValue) {
		FlagStatusEnum result = FlagStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlagStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormularyItemStatusCodesEnum createFormularyItemStatusCodesEnumFromString(EDataType eDataType, String initialValue) {
		FormularyItemStatusCodesEnum result = FormularyItemStatusCodesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormularyItemStatusCodesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenomicStudyStatusEnum createGenomicStudyStatusEnumFromString(EDataType eDataType, String initialValue) {
		GenomicStudyStatusEnum result = GenomicStudyStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenomicStudyStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalLifecycleStatusEnum createGoalLifecycleStatusEnumFromString(EDataType eDataType, String initialValue) {
		GoalLifecycleStatusEnum result = GoalLifecycleStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalLifecycleStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphCompartmentRuleEnum createGraphCompartmentRuleEnumFromString(EDataType eDataType, String initialValue) {
		GraphCompartmentRuleEnum result = GraphCompartmentRuleEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGraphCompartmentRuleEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphCompartmentUseEnum createGraphCompartmentUseEnumFromString(EDataType eDataType, String initialValue) {
		GraphCompartmentUseEnum result = GraphCompartmentUseEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGraphCompartmentUseEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupMembershipBasisEnum createGroupMembershipBasisEnumFromString(EDataType eDataType, String initialValue) {
		GroupMembershipBasisEnum result = GroupMembershipBasisEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupMembershipBasisEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupTypeEnum createGroupTypeEnumFromString(EDataType eDataType, String initialValue) {
		GroupTypeEnum result = GroupTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponseStatusEnum createGuidanceResponseStatusEnumFromString(EDataType eDataType, String initialValue) {
		GuidanceResponseStatusEnum result = GuidanceResponseStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuidanceResponseStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidePageGenerationEnum createGuidePageGenerationEnumFromString(EDataType eDataType, String initialValue) {
		GuidePageGenerationEnum result = GuidePageGenerationEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuidePageGenerationEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerbEnum createHTTPVerbEnumFromString(EDataType eDataType, String initialValue) {
		HTTPVerbEnum result = HTTPVerbEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHTTPVerbEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierUseEnum createIdentifierUseEnumFromString(EDataType eDataType, String initialValue) {
		IdentifierUseEnum result = IdentifierUseEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierUseEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityAssuranceLevelEnum createIdentityAssuranceLevelEnumFromString(EDataType eDataType, String initialValue) {
		IdentityAssuranceLevelEnum result = IdentityAssuranceLevelEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentityAssuranceLevelEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingSelectionDGraphicTypeEnum createImagingSelectionDGraphicTypeEnumFromString(EDataType eDataType, String initialValue) {
		ImagingSelectionDGraphicTypeEnum result = ImagingSelectionDGraphicTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImagingSelectionDGraphicTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingSelectionStatusEnum createImagingSelectionStatusEnumFromString(EDataType eDataType, String initialValue) {
		ImagingSelectionStatusEnum result = ImagingSelectionStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImagingSelectionStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudyStatusEnum createImagingStudyStatusEnumFromString(EDataType eDataType, String initialValue) {
		ImagingStudyStatusEnum result = ImagingStudyStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImagingStudyStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationEvaluationStatusCodesEnum createImmunizationEvaluationStatusCodesEnumFromString(EDataType eDataType, String initialValue) {
		ImmunizationEvaluationStatusCodesEnum result = ImmunizationEvaluationStatusCodesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationEvaluationStatusCodesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationStatusCodesEnum createImmunizationStatusCodesEnumFromString(EDataType eDataType, String initialValue) {
		ImmunizationStatusCodesEnum result = ImmunizationStatusCodesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationStatusCodesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IngredientManufacturerRoleEnum createIngredientManufacturerRoleEnumFromString(EDataType eDataType, String initialValue) {
		IngredientManufacturerRoleEnum result = IngredientManufacturerRoleEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIngredientManufacturerRoleEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionTriggerEnum createInteractionTriggerEnumFromString(EDataType eDataType, String initialValue) {
		InteractionTriggerEnum result = InteractionTriggerEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInteractionTriggerEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryCountTypeEnum createInventoryCountTypeEnumFromString(EDataType eDataType, String initialValue) {
		InventoryCountTypeEnum result = InventoryCountTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInventoryCountTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryItemStatusCodesEnum createInventoryItemStatusCodesEnumFromString(EDataType eDataType, String initialValue) {
		InventoryItemStatusCodesEnum result = InventoryItemStatusCodesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInventoryItemStatusCodesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryReportStatusEnum createInventoryReportStatusEnumFromString(EDataType eDataType, String initialValue) {
		InventoryReportStatusEnum result = InventoryReportStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInventoryReportStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceStatusEnum createInvoiceStatusEnumFromString(EDataType eDataType, String initialValue) {
		InvoiceStatusEnum result = InvoiceStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvoiceStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueSeverityEnum createIssueSeverityEnumFromString(EDataType eDataType, String initialValue) {
		IssueSeverityEnum result = IssueSeverityEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueSeverityEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueTypeEnum createIssueTypeEnumFromString(EDataType eDataType, String initialValue) {
		IssueTypeEnum result = IssueTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JurisdictionValueSetEnum createJurisdictionValueSetEnumFromString(EDataType eDataType, String initialValue) {
		JurisdictionValueSetEnum result = JurisdictionValueSetEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJurisdictionValueSetEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindEnum createKindEnumFromString(EDataType eDataType, String initialValue) {
		KindEnum result = KindEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkageTypeEnum createLinkageTypeEnumFromString(EDataType eDataType, String initialValue) {
		LinkageTypeEnum result = LinkageTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkageTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkRelationTypesEnum createLinkRelationTypesEnumFromString(EDataType eDataType, String initialValue) {
		LinkRelationTypesEnum result = LinkRelationTypesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkRelationTypesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkTypeEnum createLinkTypeEnumFromString(EDataType eDataType, String initialValue) {
		LinkTypeEnum result = LinkTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListModeEnum createListModeEnumFromString(EDataType eDataType, String initialValue) {
		ListModeEnum result = ListModeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListModeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStatusEnum createListStatusEnumFromString(EDataType eDataType, String initialValue) {
		ListStatusEnum result = ListStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationModeEnum createLocationModeEnumFromString(EDataType eDataType, String initialValue) {
		LocationModeEnum result = LocationModeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationModeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationStatusEnum createLocationStatusEnumFromString(EDataType eDataType, String initialValue) {
		LocationStatusEnum result = LocationStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportStatusEnum createMeasureReportStatusEnumFromString(EDataType eDataType, String initialValue) {
		MeasureReportStatusEnum result = MeasureReportStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureReportStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportTypeEnum createMeasureReportTypeEnumFromString(EDataType eDataType, String initialValue) {
		MeasureReportTypeEnum result = MeasureReportTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureReportTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationStatusCodesEnum createMedicationAdministrationStatusCodesEnumFromString(EDataType eDataType, String initialValue) {
		MedicationAdministrationStatusCodesEnum result = MedicationAdministrationStatusCodesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationAdministrationStatusCodesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseStatusCodesEnum createMedicationDispenseStatusCodesEnumFromString(EDataType eDataType, String initialValue) {
		MedicationDispenseStatusCodesEnum result = MedicationDispenseStatusCodesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationDispenseStatusCodesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgeStatusCodesEnum createMedicationKnowledgeStatusCodesEnumFromString(EDataType eDataType, String initialValue) {
		MedicationKnowledgeStatusCodesEnum result = MedicationKnowledgeStatusCodesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationKnowledgeStatusCodesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestIntentEnum createMedicationRequestIntentEnumFromString(EDataType eDataType, String initialValue) {
		MedicationRequestIntentEnum result = MedicationRequestIntentEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationRequestIntentEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationrequestStatusEnum createMedicationrequestStatusEnumFromString(EDataType eDataType, String initialValue) {
		MedicationrequestStatusEnum result = MedicationrequestStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationrequestStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementStatusCodesEnum createMedicationStatementStatusCodesEnumFromString(EDataType eDataType, String initialValue) {
		MedicationStatementStatusCodesEnum result = MedicationStatementStatusCodesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationStatementStatusCodesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatusCodesEnum createMedicationStatusCodesEnumFromString(EDataType eDataType, String initialValue) {
		MedicationStatusCodesEnum result = MedicationStatusCodesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationStatusCodesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageheaderResponseRequestEnum createMessageheaderResponseRequestEnumFromString(EDataType eDataType, String initialValue) {
		MessageheaderResponseRequestEnum result = MessageheaderResponseRequestEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageheaderResponseRequestEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSignificanceCategoryEnum createMessageSignificanceCategoryEnumFromString(EDataType eDataType, String initialValue) {
		MessageSignificanceCategoryEnum result = MessageSignificanceCategoryEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSignificanceCategoryEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameUseEnum createNameUseEnumFromString(EDataType eDataType, String initialValue) {
		NameUseEnum result = NameUseEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameUseEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemIdentifierTypeEnum createNamingSystemIdentifierTypeEnumFromString(EDataType eDataType, String initialValue) {
		NamingSystemIdentifierTypeEnum result = NamingSystemIdentifierTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingSystemIdentifierTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemTypeEnum createNamingSystemTypeEnumFromString(EDataType eDataType, String initialValue) {
		NamingSystemTypeEnum result = NamingSystemTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingSystemTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NarrativeStatusEnum createNarrativeStatusEnumFromString(EDataType eDataType, String initialValue) {
		NarrativeStatusEnum result = NarrativeStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNarrativeStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteTypeEnum createNoteTypeEnumFromString(EDataType eDataType, String initialValue) {
		NoteTypeEnum result = NoteTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoteTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionProductStatusEnum createNutritionProductStatusEnumFromString(EDataType eDataType, String initialValue) {
		NutritionProductStatusEnum result = NutritionProductStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNutritionProductStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationDataTypeEnum createObservationDataTypeEnumFromString(EDataType eDataType, String initialValue) {
		ObservationDataTypeEnum result = ObservationDataTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationDataTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationRangeCategoryEnum createObservationRangeCategoryEnumFromString(EDataType eDataType, String initialValue) {
		ObservationRangeCategoryEnum result = ObservationRangeCategoryEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationRangeCategoryEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationStatusEnum createObservationStatusEnumFromString(EDataType eDataType, String initialValue) {
		ObservationStatusEnum result = ObservationStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationKindEnum createOperationKindEnumFromString(EDataType eDataType, String initialValue) {
		OperationKindEnum result = OperationKindEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationKindEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationOutcomeCodesEnum createOperationOutcomeCodesEnumFromString(EDataType eDataType, String initialValue) {
		OperationOutcomeCodesEnum result = OperationOutcomeCodesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationOutcomeCodesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterScopeEnum createOperationParameterScopeEnumFromString(EDataType eDataType, String initialValue) {
		OperationParameterScopeEnum result = OperationParameterScopeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationParameterScopeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterUseEnum createOperationParameterUseEnumFromString(EDataType eDataType, String initialValue) {
		OperationParameterUseEnum result = OperationParameterUseEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationParameterUseEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationTypeEnum createOrientationTypeEnumFromString(EDataType eDataType, String initialValue) {
		OrientationTypeEnum result = OrientationTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantResourceTypesEnum createParticipantResourceTypesEnumFromString(EDataType eDataType, String initialValue) {
		ParticipantResourceTypesEnum result = ParticipantResourceTypesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantResourceTypesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipationStatusEnum createParticipationStatusEnumFromString(EDataType eDataType, String initialValue) {
		ParticipationStatusEnum result = ParticipationStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipationStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentOutcomeEnum createPaymentOutcomeEnumFromString(EDataType eDataType, String initialValue) {
		PaymentOutcomeEnum result = PaymentOutcomeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentOutcomeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionRuleCombiningEnum createPermissionRuleCombiningEnumFromString(EDataType eDataType, String initialValue) {
		PermissionRuleCombiningEnum result = PermissionRuleCombiningEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPermissionRuleCombiningEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionStatusEnum createPermissionStatusEnumFromString(EDataType eDataType, String initialValue) {
		PermissionStatusEnum result = PermissionStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPermissionStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRepresentationEnum createPropertyRepresentationEnumFromString(EDataType eDataType, String initialValue) {
		PropertyRepresentationEnum result = PropertyRepresentationEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyRepresentationEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTypeEnum createPropertyTypeEnumFromString(EDataType eDataType, String initialValue) {
		PropertyTypeEnum result = PropertyTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceEntityRoleEnum createProvenanceEntityRoleEnumFromString(EDataType eDataType, String initialValue) {
		ProvenanceEntityRoleEnum result = ProvenanceEntityRoleEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProvenanceEntityRoleEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationStatusEnum createPublicationStatusEnumFromString(EDataType eDataType, String initialValue) {
		PublicationStatusEnum result = PublicationStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPublicationStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityComparatorEnum createQuantityComparatorEnumFromString(EDataType eDataType, String initialValue) {
		QuantityComparatorEnum result = QuantityComparatorEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantityComparatorEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireAnswerConstraintEnum createQuestionnaireAnswerConstraintEnumFromString(EDataType eDataType, String initialValue) {
		QuestionnaireAnswerConstraintEnum result = QuestionnaireAnswerConstraintEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireAnswerConstraintEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItemDisabledDisplayEnum createQuestionnaireItemDisabledDisplayEnumFromString(EDataType eDataType, String initialValue) {
		QuestionnaireItemDisabledDisplayEnum result = QuestionnaireItemDisabledDisplayEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireItemDisabledDisplayEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItemOperatorEnum createQuestionnaireItemOperatorEnumFromString(EDataType eDataType, String initialValue) {
		QuestionnaireItemOperatorEnum result = QuestionnaireItemOperatorEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireItemOperatorEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItemTypeEnum createQuestionnaireItemTypeEnumFromString(EDataType eDataType, String initialValue) {
		QuestionnaireItemTypeEnum result = QuestionnaireItemTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireItemTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseStatusEnum createQuestionnaireResponseStatusEnumFromString(EDataType eDataType, String initialValue) {
		QuestionnaireResponseStatusEnum result = QuestionnaireResponseStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireResponseStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceHandlingPolicyEnum createReferenceHandlingPolicyEnumFromString(EDataType eDataType, String initialValue) {
		ReferenceHandlingPolicyEnum result = ReferenceHandlingPolicyEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceHandlingPolicyEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceVersionRulesEnum createReferenceVersionRulesEnumFromString(EDataType eDataType, String initialValue) {
		ReferenceVersionRulesEnum result = ReferenceVersionRulesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceVersionRulesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedArtifactTypeEnum createRelatedArtifactTypeEnumFromString(EDataType eDataType, String initialValue) {
		RelatedArtifactTypeEnum result = RelatedArtifactTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelatedArtifactTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedArtifactTypeExpandedEnum createRelatedArtifactTypeExpandedEnumFromString(EDataType eDataType, String initialValue) {
		RelatedArtifactTypeExpandedEnum result = RelatedArtifactTypeExpandedEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelatedArtifactTypeExpandedEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemittanceOutcomeEnum createRemittanceOutcomeEnumFromString(EDataType eDataType, String initialValue) {
		RemittanceOutcomeEnum result = RemittanceOutcomeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRemittanceOutcomeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportRelationshipTypeEnum createReportRelationshipTypeEnumFromString(EDataType eDataType, String initialValue) {
		ReportRelationshipTypeEnum result = ReportRelationshipTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReportRelationshipTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestIntentEnum createRequestIntentEnumFromString(EDataType eDataType, String initialValue) {
		RequestIntentEnum result = RequestIntentEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestIntentEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestPriorityEnum createRequestPriorityEnumFromString(EDataType eDataType, String initialValue) {
		RequestPriorityEnum result = RequestPriorityEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestPriorityEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestResourceTypesEnum createRequestResourceTypesEnumFromString(EDataType eDataType, String initialValue) {
		RequestResourceTypesEnum result = RequestResourceTypesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestResourceTypesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestStatusEnum createRequestStatusEnumFromString(EDataType eDataType, String initialValue) {
		RequestStatusEnum result = RequestStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTypeEnum createResourceTypeEnumFromString(EDataType eDataType, String initialValue) {
		ResourceTypeEnum result = ResourceTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceVersionPolicyEnum createResourceVersionPolicyEnumFromString(EDataType eDataType, String initialValue) {
		ResourceVersionPolicyEnum result = ResourceVersionPolicyEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceVersionPolicyEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseTypeEnum createResponseTypeEnumFromString(EDataType eDataType, String initialValue) {
		ResponseTypeEnum result = ResponseTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResponseTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestfulCapabilityModeEnum createRestfulCapabilityModeEnumFromString(EDataType eDataType, String initialValue) {
		RestfulCapabilityModeEnum result = RestfulCapabilityModeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestfulCapabilityModeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchComparatorEnum createSearchComparatorEnumFromString(EDataType eDataType, String initialValue) {
		SearchComparatorEnum result = SearchComparatorEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchComparatorEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchEntryModeEnum createSearchEntryModeEnumFromString(EDataType eDataType, String initialValue) {
		SearchEntryModeEnum result = SearchEntryModeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchEntryModeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchModifierCodeEnum createSearchModifierCodeEnumFromString(EDataType eDataType, String initialValue) {
		SearchModifierCodeEnum result = SearchModifierCodeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchModifierCodeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParamTypeEnum createSearchParamTypeEnumFromString(EDataType eDataType, String initialValue) {
		SearchParamTypeEnum result = SearchParamTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchParamTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchProcessingModeTypeEnum createSearchProcessingModeTypeEnumFromString(EDataType eDataType, String initialValue) {
		SearchProcessingModeTypeEnum result = SearchProcessingModeTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchProcessingModeTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceTypeEnum createSequenceTypeEnumFromString(EDataType eDataType, String initialValue) {
		SequenceTypeEnum result = SequenceTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSequenceTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingRulesEnum createSlicingRulesEnumFromString(EDataType eDataType, String initialValue) {
		SlicingRulesEnum result = SlicingRulesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlicingRulesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotStatusEnum createSlotStatusEnumFromString(EDataType eDataType, String initialValue) {
		SlotStatusEnum result = SlotStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlotStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortDirectionEnum createSortDirectionEnumFromString(EDataType eDataType, String initialValue) {
		SortDirectionEnum result = SortDirectionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortDirectionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPDXLicenseEnum createSPDXLicenseEnumFromString(EDataType eDataType, String initialValue) {
		SPDXLicenseEnum result = SPDXLicenseEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSPDXLicenseEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenCombinedEnum createSpecimenCombinedEnumFromString(EDataType eDataType, String initialValue) {
		SpecimenCombinedEnum result = SpecimenCombinedEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenCombinedEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenContainedPreferenceEnum createSpecimenContainedPreferenceEnumFromString(EDataType eDataType, String initialValue) {
		SpecimenContainedPreferenceEnum result = SpecimenContainedPreferenceEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenContainedPreferenceEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenStatusEnum createSpecimenStatusEnumFromString(EDataType eDataType, String initialValue) {
		SpecimenStatusEnum result = SpecimenStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrandTypeEnum createStrandTypeEnumFromString(EDataType eDataType, String initialValue) {
		StrandTypeEnum result = StrandTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrandTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionKindEnum createStructureDefinitionKindEnumFromString(EDataType eDataType, String initialValue) {
		StructureDefinitionKindEnum result = StructureDefinitionKindEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureDefinitionKindEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapGroupTypeModeEnum createStructureMapGroupTypeModeEnumFromString(EDataType eDataType, String initialValue) {
		StructureMapGroupTypeModeEnum result = StructureMapGroupTypeModeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapGroupTypeModeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapInputModeEnum createStructureMapInputModeEnumFromString(EDataType eDataType, String initialValue) {
		StructureMapInputModeEnum result = StructureMapInputModeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapInputModeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapModelModeEnum createStructureMapModelModeEnumFromString(EDataType eDataType, String initialValue) {
		StructureMapModelModeEnum result = StructureMapModelModeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapModelModeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapSourceListModeEnum createStructureMapSourceListModeEnumFromString(EDataType eDataType, String initialValue) {
		StructureMapSourceListModeEnum result = StructureMapSourceListModeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapSourceListModeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapTargetListModeEnum createStructureMapTargetListModeEnumFromString(EDataType eDataType, String initialValue) {
		StructureMapTargetListModeEnum result = StructureMapTargetListModeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapTargetListModeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapTransformEnum createStructureMapTransformEnumFromString(EDataType eDataType, String initialValue) {
		StructureMapTransformEnum result = StructureMapTransformEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapTransformEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmitDataUpdateTypeEnum createSubmitDataUpdateTypeEnumFromString(EDataType eDataType, String initialValue) {
		SubmitDataUpdateTypeEnum result = SubmitDataUpdateTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubmitDataUpdateTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionNotificationTypeEnum createSubscriptionNotificationTypeEnumFromString(EDataType eDataType, String initialValue) {
		SubscriptionNotificationTypeEnum result = SubscriptionNotificationTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionNotificationTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionPayloadContentEnum createSubscriptionPayloadContentEnumFromString(EDataType eDataType, String initialValue) {
		SubscriptionPayloadContentEnum result = SubscriptionPayloadContentEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionPayloadContentEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionStatusCodesEnum createSubscriptionStatusCodesEnumFromString(EDataType eDataType, String initialValue) {
		SubscriptionStatusCodesEnum result = SubscriptionStatusCodesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionStatusCodesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDeliveryStatusEnum createSupplyDeliveryStatusEnumFromString(EDataType eDataType, String initialValue) {
		SupplyDeliveryStatusEnum result = SupplyDeliveryStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyDeliveryStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequestStatusEnum createSupplyRequestStatusEnumFromString(EDataType eDataType, String initialValue) {
		SupplyRequestStatusEnum result = SupplyRequestStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyRequestStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRestfulInteractionEnum createSystemRestfulInteractionEnumFromString(EDataType eDataType, String initialValue) {
		SystemRestfulInteractionEnum result = SystemRestfulInteractionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemRestfulInteractionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskIntentEnum createTaskIntentEnumFromString(EDataType eDataType, String initialValue) {
		TaskIntentEnum result = TaskIntentEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskIntentEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStatusEnum createTaskStatusEnumFromString(EDataType eDataType, String initialValue) {
		TaskStatusEnum result = TaskStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportActionResultEnum createTestReportActionResultEnumFromString(EDataType eDataType, String initialValue) {
		TestReportActionResultEnum result = TestReportActionResultEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportActionResultEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportParticipantTypeEnum createTestReportParticipantTypeEnumFromString(EDataType eDataType, String initialValue) {
		TestReportParticipantTypeEnum result = TestReportParticipantTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportParticipantTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportResultEnum createTestReportResultEnumFromString(EDataType eDataType, String initialValue) {
		TestReportResultEnum result = TestReportResultEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportResultEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportStatusEnum createTestReportStatusEnumFromString(EDataType eDataType, String initialValue) {
		TestReportStatusEnum result = TestReportStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRequestMethodCodeEnum createTestScriptRequestMethodCodeEnumFromString(EDataType eDataType, String initialValue) {
		TestScriptRequestMethodCodeEnum result = TestScriptRequestMethodCodeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestScriptRequestMethodCodeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportIntentEnum createTransportIntentEnumFromString(EDataType eDataType, String initialValue) {
		TransportIntentEnum result = TransportIntentEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransportIntentEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportStatusEnum createTransportStatusEnumFromString(EDataType eDataType, String initialValue) {
		TransportStatusEnum result = TransportStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransportStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggeredBytypeEnum createTriggeredBytypeEnumFromString(EDataType eDataType, String initialValue) {
		TriggeredBytypeEnum result = TriggeredBytypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggeredBytypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerTypeEnum createTriggerTypeEnumFromString(EDataType eDataType, String initialValue) {
		TriggerTypeEnum result = TriggerTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDerivationRuleEnum createTypeDerivationRuleEnumFromString(EDataType eDataType, String initialValue) {
		TypeDerivationRuleEnum result = TypeDerivationRuleEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDerivationRuleEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRestfulInteractionEnum createTypeRestfulInteractionEnumFromString(EDataType eDataType, String initialValue) {
		TypeRestfulInteractionEnum result = TypeRestfulInteractionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRestfulInteractionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDIEntryTypeEnum createUDIEntryTypeEnumFromString(EDataType eDataType, String initialValue) {
		UDIEntryTypeEnum result = UDIEntryTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUDIEntryTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsOfTimeEnum createUnitsOfTimeEnumFromString(EDataType eDataType, String initialValue) {
		UnitsOfTimeEnum result = UnitsOfTimeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsOfTimeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseEnum createUseEnumFromString(EDataType eDataType, String initialValue) {
		UseEnum result = UseEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUseEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationResultStatusEnum createVerificationResultStatusEnumFromString(EDataType eDataType, String initialValue) {
		VerificationResultStatusEnum result = VerificationResultStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerificationResultStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionIndependentResourceTypesAllEnum createVersionIndependentResourceTypesAllEnumFromString(EDataType eDataType, String initialValue) {
		VersionIndependentResourceTypesAllEnum result = VersionIndependentResourceTypesAllEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionIndependentResourceTypesAllEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionBaseEnum createVisionBaseEnumFromString(EDataType eDataType, String initialValue) {
		VisionBaseEnum result = VisionBaseEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionBaseEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionEyesEnum createVisionEyesEnumFromString(EDataType eDataType, String initialValue) {
		VisionEyesEnum result = VisionEyesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionEyesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountStatusEnum createAccountStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createAccountStatusEnumFromString(FhirPackage.eINSTANCE.getAccountStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccountStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAccountStatusEnumToString(FhirPackage.eINSTANCE.getAccountStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionCardinalityBehaviorEnum createActionCardinalityBehaviorEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createActionCardinalityBehaviorEnumFromString(FhirPackage.eINSTANCE.getActionCardinalityBehaviorEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionCardinalityBehaviorEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionCardinalityBehaviorEnumToString(FhirPackage.eINSTANCE.getActionCardinalityBehaviorEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionConditionKindEnum createActionConditionKindEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createActionConditionKindEnumFromString(FhirPackage.eINSTANCE.getActionConditionKindEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionConditionKindEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionConditionKindEnumToString(FhirPackage.eINSTANCE.getActionConditionKindEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGroupingBehaviorEnum createActionGroupingBehaviorEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createActionGroupingBehaviorEnumFromString(FhirPackage.eINSTANCE.getActionGroupingBehaviorEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionGroupingBehaviorEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionGroupingBehaviorEnumToString(FhirPackage.eINSTANCE.getActionGroupingBehaviorEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionParticipantTypeEnum createActionParticipantTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createActionParticipantTypeEnumFromString(FhirPackage.eINSTANCE.getActionParticipantTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionParticipantTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionParticipantTypeEnumToString(FhirPackage.eINSTANCE.getActionParticipantTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionPrecheckBehaviorEnum createActionPrecheckBehaviorEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createActionPrecheckBehaviorEnumFromString(FhirPackage.eINSTANCE.getActionPrecheckBehaviorEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionPrecheckBehaviorEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionPrecheckBehaviorEnumToString(FhirPackage.eINSTANCE.getActionPrecheckBehaviorEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRelationshipTypeEnum createActionRelationshipTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createActionRelationshipTypeEnumFromString(FhirPackage.eINSTANCE.getActionRelationshipTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionRelationshipTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionRelationshipTypeEnumToString(FhirPackage.eINSTANCE.getActionRelationshipTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRequiredBehaviorEnum createActionRequiredBehaviorEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createActionRequiredBehaviorEnumFromString(FhirPackage.eINSTANCE.getActionRequiredBehaviorEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionRequiredBehaviorEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionRequiredBehaviorEnumToString(FhirPackage.eINSTANCE.getActionRequiredBehaviorEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSelectionBehaviorEnum createActionSelectionBehaviorEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createActionSelectionBehaviorEnumFromString(FhirPackage.eINSTANCE.getActionSelectionBehaviorEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionSelectionBehaviorEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionSelectionBehaviorEnumToString(FhirPackage.eINSTANCE.getActionSelectionBehaviorEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressTypeEnum createAddressTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createAddressTypeEnumFromString(FhirPackage.eINSTANCE.getAddressTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAddressTypeEnumToString(FhirPackage.eINSTANCE.getAddressTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressUseEnum createAddressUseEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createAddressUseEnumFromString(FhirPackage.eINSTANCE.getAddressUseEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressUseEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAddressUseEnumToString(FhirPackage.eINSTANCE.getAddressUseEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeGenderEnum createAdministrativeGenderEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createAdministrativeGenderEnumFromString(FhirPackage.eINSTANCE.getAdministrativeGenderEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdministrativeGenderEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAdministrativeGenderEnumToString(FhirPackage.eINSTANCE.getAdministrativeGenderEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventActualityEnum createAdverseEventActualityEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createAdverseEventActualityEnumFromString(FhirPackage.eINSTANCE.getAdverseEventActualityEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdverseEventActualityEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAdverseEventActualityEnumToString(FhirPackage.eINSTANCE.getAdverseEventActualityEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventStatusEnum createAdverseEventStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createAdverseEventStatusEnumFromString(FhirPackage.eINSTANCE.getAdverseEventStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdverseEventStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAdverseEventStatusEnumToString(FhirPackage.eINSTANCE.getAdverseEventStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgeUnitsEnum createAgeUnitsEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createAgeUnitsEnumFromString(FhirPackage.eINSTANCE.getAgeUnitsEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAgeUnitsEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAgeUnitsEnumToString(FhirPackage.eINSTANCE.getAgeUnitsEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationModeEnum createAggregationModeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createAggregationModeEnumFromString(FhirPackage.eINSTANCE.getAggregationModeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationModeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAggregationModeEnumToString(FhirPackage.eINSTANCE.getAggregationModeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCategoryEnum createAllergyIntoleranceCategoryEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceCategoryEnumFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceCategoryEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCategoryEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceCategoryEnumToString(FhirPackage.eINSTANCE.getAllergyIntoleranceCategoryEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCriticalityEnum createAllergyIntoleranceCriticalityEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceCriticalityEnumFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceCriticalityEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCriticalityEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceCriticalityEnumToString(FhirPackage.eINSTANCE.getAllergyIntoleranceCriticalityEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceSeverityEnum createAllergyIntoleranceSeverityEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceSeverityEnumFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceSeverityEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceSeverityEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceSeverityEnumToString(FhirPackage.eINSTANCE.getAllergyIntoleranceSeverityEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllResourceTypesEnum createAllResourceTypesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createAllResourceTypesEnumFromString(FhirPackage.eINSTANCE.getAllResourceTypesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllResourceTypesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllResourceTypesEnumToString(FhirPackage.eINSTANCE.getAllResourceTypesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentResponseStatusEnum createAppointmentResponseStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createAppointmentResponseStatusEnumFromString(FhirPackage.eINSTANCE.getAppointmentResponseStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAppointmentResponseStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAppointmentResponseStatusEnumToString(FhirPackage.eINSTANCE.getAppointmentResponseStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentStatusEnum createAppointmentStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createAppointmentStatusEnumFromString(FhirPackage.eINSTANCE.getAppointmentStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAppointmentStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAppointmentStatusEnumToString(FhirPackage.eINSTANCE.getAppointmentStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactAssessmentDispositionEnum createArtifactAssessmentDispositionEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createArtifactAssessmentDispositionEnumFromString(FhirPackage.eINSTANCE.getArtifactAssessmentDispositionEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactAssessmentDispositionEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertArtifactAssessmentDispositionEnumToString(FhirPackage.eINSTANCE.getArtifactAssessmentDispositionEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactAssessmentInformationTypeEnum createArtifactAssessmentInformationTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createArtifactAssessmentInformationTypeEnumFromString(FhirPackage.eINSTANCE.getArtifactAssessmentInformationTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactAssessmentInformationTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertArtifactAssessmentInformationTypeEnumToString(FhirPackage.eINSTANCE.getArtifactAssessmentInformationTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactAssessmentWorkflowStatusEnum createArtifactAssessmentWorkflowStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createArtifactAssessmentWorkflowStatusEnumFromString(FhirPackage.eINSTANCE.getArtifactAssessmentWorkflowStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactAssessmentWorkflowStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertArtifactAssessmentWorkflowStatusEnumToString(FhirPackage.eINSTANCE.getArtifactAssessmentWorkflowStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionDirectionTypeEnum createAssertionDirectionTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createAssertionDirectionTypeEnumFromString(FhirPackage.eINSTANCE.getAssertionDirectionTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionDirectionTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAssertionDirectionTypeEnumToString(FhirPackage.eINSTANCE.getAssertionDirectionTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionManualCompletionTypeEnum createAssertionManualCompletionTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createAssertionManualCompletionTypeEnumFromString(FhirPackage.eINSTANCE.getAssertionManualCompletionTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionManualCompletionTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAssertionManualCompletionTypeEnumToString(FhirPackage.eINSTANCE.getAssertionManualCompletionTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionOperatorTypeEnum createAssertionOperatorTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createAssertionOperatorTypeEnumFromString(FhirPackage.eINSTANCE.getAssertionOperatorTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionOperatorTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAssertionOperatorTypeEnumToString(FhirPackage.eINSTANCE.getAssertionOperatorTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionResponseTypesEnum createAssertionResponseTypesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createAssertionResponseTypesEnumFromString(FhirPackage.eINSTANCE.getAssertionResponseTypesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionResponseTypesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAssertionResponseTypesEnumToString(FhirPackage.eINSTANCE.getAssertionResponseTypesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventActionEnum createAuditEventActionEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createAuditEventActionEnumFromString(FhirPackage.eINSTANCE.getAuditEventActionEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventActionEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuditEventActionEnumToString(FhirPackage.eINSTANCE.getAuditEventActionEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventSeverityEnum createAuditEventSeverityEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createAuditEventSeverityEnumFromString(FhirPackage.eINSTANCE.getAuditEventSeverityEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventSeverityEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuditEventSeverityEnumToString(FhirPackage.eINSTANCE.getAuditEventSeverityEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createBase64BinaryPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBase64BinaryPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BASE64_BINARY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingStrengthEnum createBindingStrengthEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createBindingStrengthEnumFromString(FhirPackage.eINSTANCE.getBindingStrengthEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindingStrengthEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBindingStrengthEnumToString(FhirPackage.eINSTANCE.getBindingStrengthEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiologicallyDerivedProductDispenseCodesEnum createBiologicallyDerivedProductDispenseCodesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createBiologicallyDerivedProductDispenseCodesEnumFromString(FhirPackage.eINSTANCE.getBiologicallyDerivedProductDispenseCodesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBiologicallyDerivedProductDispenseCodesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBiologicallyDerivedProductDispenseCodesEnumToString(FhirPackage.eINSTANCE.getBiologicallyDerivedProductDispenseCodesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanPrimitiveObjectFromString(EDataType eDataType, String initialValue) {
		return createBooleanPrimitiveFromString(FhirPackage.eINSTANCE.getBooleanPrimitive(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanPrimitiveObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBooleanPrimitiveToString(FhirPackage.eINSTANCE.getBooleanPrimitive(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleTypeEnum createBundleTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createBundleTypeEnumFromString(FhirPackage.eINSTANCE.getBundleTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBundleTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBundleTypeEnumToString(FhirPackage.eINSTANCE.getBundleTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCanonicalPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCanonicalPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementKindEnum createCapabilityStatementKindEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createCapabilityStatementKindEnumFromString(FhirPackage.eINSTANCE.getCapabilityStatementKindEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCapabilityStatementKindEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCapabilityStatementKindEnumToString(FhirPackage.eINSTANCE.getCapabilityStatementKindEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanIntentEnum createCarePlanIntentEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createCarePlanIntentEnumFromString(FhirPackage.eINSTANCE.getCarePlanIntentEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanIntentEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCarePlanIntentEnumToString(FhirPackage.eINSTANCE.getCarePlanIntentEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamStatusEnum createCareTeamStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createCareTeamStatusEnumFromString(FhirPackage.eINSTANCE.getCareTeamStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCareTeamStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCareTeamStatusEnumToString(FhirPackage.eINSTANCE.getCareTeamStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicCombinationEnum createCharacteristicCombinationEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createCharacteristicCombinationEnumFromString(FhirPackage.eINSTANCE.getCharacteristicCombinationEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharacteristicCombinationEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCharacteristicCombinationEnumToString(FhirPackage.eINSTANCE.getCharacteristicCombinationEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeItemStatusEnum createChargeItemStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createChargeItemStatusEnumFromString(FhirPackage.eINSTANCE.getChargeItemStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChargeItemStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertChargeItemStatusEnumToString(FhirPackage.eINSTANCE.getChargeItemStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimProcessingCodesEnum createClaimProcessingCodesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createClaimProcessingCodesEnumFromString(FhirPackage.eINSTANCE.getClaimProcessingCodesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClaimProcessingCodesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertClaimProcessingCodesEnumToString(FhirPackage.eINSTANCE.getClaimProcessingCodesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalUseDefinitionTypeEnum createClinicalUseDefinitionTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createClinicalUseDefinitionTypeEnumFromString(FhirPackage.eINSTANCE.getClinicalUseDefinitionTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClinicalUseDefinitionTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertClinicalUseDefinitionTypeEnumToString(FhirPackage.eINSTANCE.getClinicalUseDefinitionTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCodePrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSearchSupportEnum createCodeSearchSupportEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createCodeSearchSupportEnumFromString(FhirPackage.eINSTANCE.getCodeSearchSupportEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeSearchSupportEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCodeSearchSupportEnumToString(FhirPackage.eINSTANCE.getCodeSearchSupportEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemContentModeEnum createCodeSystemContentModeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createCodeSystemContentModeEnumFromString(FhirPackage.eINSTANCE.getCodeSystemContentModeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeSystemContentModeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCodeSystemContentModeEnumToString(FhirPackage.eINSTANCE.getCodeSystemContentModeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemHierarchyMeaningEnum createCodeSystemHierarchyMeaningEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createCodeSystemHierarchyMeaningEnumFromString(FhirPackage.eINSTANCE.getCodeSystemHierarchyMeaningEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeSystemHierarchyMeaningEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCodeSystemHierarchyMeaningEnumToString(FhirPackage.eINSTANCE.getCodeSystemHierarchyMeaningEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createColorCodesOrRGBEnumFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorCodesOrRGBEnumToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonLanguagesEnum createCommonLanguagesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createCommonLanguagesEnumFromString(FhirPackage.eINSTANCE.getCommonLanguagesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommonLanguagesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCommonLanguagesEnumToString(FhirPackage.eINSTANCE.getCommonLanguagesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentTypeEnum createCompartmentTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createCompartmentTypeEnumFromString(FhirPackage.eINSTANCE.getCompartmentTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompartmentTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCompartmentTypeEnumToString(FhirPackage.eINSTANCE.getCompartmentTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionStatusEnum createCompositionStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createCompositionStatusEnumFromString(FhirPackage.eINSTANCE.getCompositionStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositionStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCompositionStatusEnumToString(FhirPackage.eINSTANCE.getCompositionStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapAttributeTypeEnum createConceptMapAttributeTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createConceptMapAttributeTypeEnumFromString(FhirPackage.eINSTANCE.getConceptMapAttributeTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptMapAttributeTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConceptMapAttributeTypeEnumToString(FhirPackage.eINSTANCE.getConceptMapAttributeTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapGroupUnmappedModeEnum createConceptMapGroupUnmappedModeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createConceptMapGroupUnmappedModeEnumFromString(FhirPackage.eINSTANCE.getConceptMapGroupUnmappedModeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptMapGroupUnmappedModeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConceptMapGroupUnmappedModeEnumToString(FhirPackage.eINSTANCE.getConceptMapGroupUnmappedModeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapPropertyTypeEnum createConceptMapPropertyTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createConceptMapPropertyTypeEnumFromString(FhirPackage.eINSTANCE.getConceptMapPropertyTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptMapPropertyTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConceptMapPropertyTypeEnumToString(FhirPackage.eINSTANCE.getConceptMapPropertyTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapRelationshipEnum createConceptMapRelationshipEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createConceptMapRelationshipEnumFromString(FhirPackage.eINSTANCE.getConceptMapRelationshipEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptMapRelationshipEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConceptMapRelationshipEnumToString(FhirPackage.eINSTANCE.getConceptMapRelationshipEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteFHIRTypesEnum createConcreteFHIRTypesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createConcreteFHIRTypesEnumFromString(FhirPackage.eINSTANCE.getConcreteFHIRTypesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConcreteFHIRTypesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConcreteFHIRTypesEnumToString(FhirPackage.eINSTANCE.getConcreteFHIRTypesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalDeleteStatusEnum createConditionalDeleteStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createConditionalDeleteStatusEnumFromString(FhirPackage.eINSTANCE.getConditionalDeleteStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionalDeleteStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConditionalDeleteStatusEnumToString(FhirPackage.eINSTANCE.getConditionalDeleteStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalReadStatusEnum createConditionalReadStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createConditionalReadStatusEnumFromString(FhirPackage.eINSTANCE.getConditionalReadStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionalReadStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConditionalReadStatusEnumToString(FhirPackage.eINSTANCE.getConditionalReadStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionPreconditionTypeEnum createConditionPreconditionTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createConditionPreconditionTypeEnumFromString(FhirPackage.eINSTANCE.getConditionPreconditionTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionPreconditionTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConditionPreconditionTypeEnumToString(FhirPackage.eINSTANCE.getConditionPreconditionTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionQuestionnairePurposeEnum createConditionQuestionnairePurposeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createConditionQuestionnairePurposeEnumFromString(FhirPackage.eINSTANCE.getConditionQuestionnairePurposeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionQuestionnairePurposeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConditionQuestionnairePurposeEnumToString(FhirPackage.eINSTANCE.getConditionQuestionnairePurposeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceExpectationEnum createConformanceExpectationEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createConformanceExpectationEnumFromString(FhirPackage.eINSTANCE.getConformanceExpectationEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConformanceExpectationEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConformanceExpectationEnumToString(FhirPackage.eINSTANCE.getConformanceExpectationEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentDataMeaningEnum createConsentDataMeaningEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createConsentDataMeaningEnumFromString(FhirPackage.eINSTANCE.getConsentDataMeaningEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentDataMeaningEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConsentDataMeaningEnumToString(FhirPackage.eINSTANCE.getConsentDataMeaningEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentProvisionTypeEnum createConsentProvisionTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createConsentProvisionTypeEnumFromString(FhirPackage.eINSTANCE.getConsentProvisionTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentProvisionTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConsentProvisionTypeEnumToString(FhirPackage.eINSTANCE.getConsentProvisionTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentStateEnum createConsentStateEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createConsentStateEnumFromString(FhirPackage.eINSTANCE.getConsentStateEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentStateEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConsentStateEnumToString(FhirPackage.eINSTANCE.getConsentStateEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSeverityEnum createConstraintSeverityEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createConstraintSeverityEnumFromString(FhirPackage.eINSTANCE.getConstraintSeverityEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintSeverityEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConstraintSeverityEnumToString(FhirPackage.eINSTANCE.getConstraintSeverityEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointSystemEnum createContactPointSystemEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createContactPointSystemEnumFromString(FhirPackage.eINSTANCE.getContactPointSystemEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactPointSystemEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContactPointSystemEnumToString(FhirPackage.eINSTANCE.getContactPointSystemEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointUseEnum createContactPointUseEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createContactPointUseEnumFromString(FhirPackage.eINSTANCE.getContactPointUseEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactPointUseEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContactPointUseEnumToString(FhirPackage.eINSTANCE.getContactPointUseEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourcePublicationStatusCodesEnum createContractResourcePublicationStatusCodesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createContractResourcePublicationStatusCodesEnumFromString(FhirPackage.eINSTANCE.getContractResourcePublicationStatusCodesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourcePublicationStatusCodesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContractResourcePublicationStatusCodesEnumToString(FhirPackage.eINSTANCE.getContractResourcePublicationStatusCodesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourceStatusCodesEnum createContractResourceStatusCodesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createContractResourceStatusCodesEnumFromString(FhirPackage.eINSTANCE.getContractResourceStatusCodesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourceStatusCodesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContractResourceStatusCodesEnumToString(FhirPackage.eINSTANCE.getContractResourceStatusCodesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributorTypeEnum createContributorTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createContributorTypeEnumFromString(FhirPackage.eINSTANCE.getContributorTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContributorTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContributorTypeEnumToString(FhirPackage.eINSTANCE.getContributorTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriteriaNotExistsBehaviorEnum createCriteriaNotExistsBehaviorEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createCriteriaNotExistsBehaviorEnumFromString(FhirPackage.eINSTANCE.getCriteriaNotExistsBehaviorEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCriteriaNotExistsBehaviorEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCriteriaNotExistsBehaviorEnumToString(FhirPackage.eINSTANCE.getCriteriaNotExistsBehaviorEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDatePrimitiveFromString(EDataType eDataType, String initialValue) {
		return createDatePrimitiveBaseFromString(FhirPackage.eINSTANCE.getDatePrimitiveBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return convertDatePrimitiveBaseToString(FhirPackage.eINSTANCE.getDatePrimitiveBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDatePrimitiveBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		XMLGregorianCalendar result = null;
		RuntimeException exception = null;
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR_MONTH, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatePrimitiveBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.GYEAR.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR_MONTH, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DATE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateTimePrimitiveFromString(EDataType eDataType, String initialValue) {
		return createDateTimePrimitiveBaseFromString(FhirPackage.eINSTANCE.getDateTimePrimitiveBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return convertDateTimePrimitiveBaseToString(FhirPackage.eINSTANCE.getDateTimePrimitiveBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateTimePrimitiveBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		XMLGregorianCalendar result = null;
		RuntimeException exception = null;
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR_MONTH, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimePrimitiveBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.GYEAR.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR_MONTH, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DATE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DATE_TIME.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createDecimalPrimitiveFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalPrimitiveToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.DECIMAL.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DOUBLE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionResourceTypesEnum createDefinitionResourceTypesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createDefinitionResourceTypesEnumFromString(FhirPackage.eINSTANCE.getDefinitionResourceTypesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefinitionResourceTypesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDefinitionResourceTypesEnumToString(FhirPackage.eINSTANCE.getDefinitionResourceTypesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueSeverityEnum createDetectedIssueSeverityEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createDetectedIssueSeverityEnumFromString(FhirPackage.eINSTANCE.getDetectedIssueSeverityEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDetectedIssueSeverityEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDetectedIssueSeverityEnumToString(FhirPackage.eINSTANCE.getDetectedIssueSeverityEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueStatusEnum createDetectedIssueStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createDetectedIssueStatusEnumFromString(FhirPackage.eINSTANCE.getDetectedIssueStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDetectedIssueStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDetectedIssueStatusEnumToString(FhirPackage.eINSTANCE.getDetectedIssueStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceCorrectiveActionScopeEnum createDeviceCorrectiveActionScopeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceCorrectiveActionScopeEnumFromString(FhirPackage.eINSTANCE.getDeviceCorrectiveActionScopeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceCorrectiveActionScopeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceCorrectiveActionScopeEnumToString(FhirPackage.eINSTANCE.getDeviceCorrectiveActionScopeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDefinitionRegulatoryIdentifierTypeEnum createDeviceDefinitionRegulatoryIdentifierTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceDefinitionRegulatoryIdentifierTypeEnumFromString(FhirPackage.eINSTANCE.getDeviceDefinitionRegulatoryIdentifierTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceDefinitionRegulatoryIdentifierTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceDefinitionRegulatoryIdentifierTypeEnumToString(FhirPackage.eINSTANCE.getDeviceDefinitionRegulatoryIdentifierTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDispenseStatusCodesEnum createDeviceDispenseStatusCodesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceDispenseStatusCodesEnumFromString(FhirPackage.eINSTANCE.getDeviceDispenseStatusCodesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceDispenseStatusCodesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceDispenseStatusCodesEnumToString(FhirPackage.eINSTANCE.getDeviceDispenseStatusCodesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationStateEnum createDeviceMetricCalibrationStateEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceMetricCalibrationStateEnumFromString(FhirPackage.eINSTANCE.getDeviceMetricCalibrationStateEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCalibrationStateEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceMetricCalibrationStateEnumToString(FhirPackage.eINSTANCE.getDeviceMetricCalibrationStateEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationTypeEnum createDeviceMetricCalibrationTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceMetricCalibrationTypeEnumFromString(FhirPackage.eINSTANCE.getDeviceMetricCalibrationTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCalibrationTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceMetricCalibrationTypeEnumToString(FhirPackage.eINSTANCE.getDeviceMetricCalibrationTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCategoryEnum createDeviceMetricCategoryEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceMetricCategoryEnumFromString(FhirPackage.eINSTANCE.getDeviceMetricCategoryEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCategoryEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceMetricCategoryEnumToString(FhirPackage.eINSTANCE.getDeviceMetricCategoryEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricOperationalStatusEnum createDeviceMetricOperationalStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceMetricOperationalStatusEnumFromString(FhirPackage.eINSTANCE.getDeviceMetricOperationalStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricOperationalStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceMetricOperationalStatusEnumToString(FhirPackage.eINSTANCE.getDeviceMetricOperationalStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceNameTypeEnum createDeviceNameTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceNameTypeEnumFromString(FhirPackage.eINSTANCE.getDeviceNameTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceNameTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceNameTypeEnumToString(FhirPackage.eINSTANCE.getDeviceNameTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceProductionIdentifierInUDIEnum createDeviceProductionIdentifierInUDIEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceProductionIdentifierInUDIEnumFromString(FhirPackage.eINSTANCE.getDeviceProductionIdentifierInUDIEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceProductionIdentifierInUDIEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceProductionIdentifierInUDIEnumToString(FhirPackage.eINSTANCE.getDeviceProductionIdentifierInUDIEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUsageStatusEnum createDeviceUsageStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceUsageStatusEnumFromString(FhirPackage.eINSTANCE.getDeviceUsageStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceUsageStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceUsageStatusEnumToString(FhirPackage.eINSTANCE.getDeviceUsageStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportStatusEnum createDiagnosticReportStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createDiagnosticReportStatusEnumFromString(FhirPackage.eINSTANCE.getDiagnosticReportStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticReportStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDiagnosticReportStatusEnumToString(FhirPackage.eINSTANCE.getDiagnosticReportStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscriminatorTypeEnum createDiscriminatorTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createDiscriminatorTypeEnumFromString(FhirPackage.eINSTANCE.getDiscriminatorTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiscriminatorTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDiscriminatorTypeEnumToString(FhirPackage.eINSTANCE.getDiscriminatorTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentModeEnum createDocumentModeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createDocumentModeEnumFromString(FhirPackage.eINSTANCE.getDocumentModeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentModeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDocumentModeEnumToString(FhirPackage.eINSTANCE.getDocumentModeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceStatusEnum createDocumentReferenceStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createDocumentReferenceStatusEnumFromString(FhirPackage.eINSTANCE.getDocumentReferenceStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentReferenceStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDocumentReferenceStatusEnumToString(FhirPackage.eINSTANCE.getDocumentReferenceStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityOutcomeEnum createEligibilityOutcomeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createEligibilityOutcomeEnumFromString(FhirPackage.eINSTANCE.getEligibilityOutcomeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEligibilityOutcomeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEligibilityOutcomeEnumToString(FhirPackage.eINSTANCE.getEligibilityOutcomeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityRequestPurposeEnum createEligibilityRequestPurposeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createEligibilityRequestPurposeEnumFromString(FhirPackage.eINSTANCE.getEligibilityRequestPurposeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEligibilityRequestPurposeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEligibilityRequestPurposeEnumToString(FhirPackage.eINSTANCE.getEligibilityRequestPurposeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponsePurposeEnum createEligibilityResponsePurposeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createEligibilityResponsePurposeEnumFromString(FhirPackage.eINSTANCE.getEligibilityResponsePurposeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEligibilityResponsePurposeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEligibilityResponsePurposeEnumToString(FhirPackage.eINSTANCE.getEligibilityResponsePurposeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableWhenBehaviorEnum createEnableWhenBehaviorEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createEnableWhenBehaviorEnumFromString(FhirPackage.eINSTANCE.getEnableWhenBehaviorEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnableWhenBehaviorEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEnableWhenBehaviorEnumToString(FhirPackage.eINSTANCE.getEnableWhenBehaviorEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocationStatusEnum createEncounterLocationStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createEncounterLocationStatusEnumFromString(FhirPackage.eINSTANCE.getEncounterLocationStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterLocationStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEncounterLocationStatusEnumToString(FhirPackage.eINSTANCE.getEncounterLocationStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterStatusEnum createEncounterStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createEncounterStatusEnumFromString(FhirPackage.eINSTANCE.getEncounterStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEncounterStatusEnumToString(FhirPackage.eINSTANCE.getEncounterStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointStatusEnum createEndpointStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createEndpointStatusEnumFromString(FhirPackage.eINSTANCE.getEndpointStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndpointStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEndpointStatusEnumToString(FhirPackage.eINSTANCE.getEndpointStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentOutcomeEnum createEnrollmentOutcomeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createEnrollmentOutcomeEnumFromString(FhirPackage.eINSTANCE.getEnrollmentOutcomeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnrollmentOutcomeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEnrollmentOutcomeEnumToString(FhirPackage.eINSTANCE.getEnrollmentOutcomeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareStatusEnum createEpisodeOfCareStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createEpisodeOfCareStatusEnumFromString(FhirPackage.eINSTANCE.getEpisodeOfCareStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEpisodeOfCareStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEpisodeOfCareStatusEnumToString(FhirPackage.eINSTANCE.getEpisodeOfCareStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventCapabilityModeEnum createEventCapabilityModeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createEventCapabilityModeEnumFromString(FhirPackage.eINSTANCE.getEventCapabilityModeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventCapabilityModeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEventCapabilityModeEnumToString(FhirPackage.eINSTANCE.getEventCapabilityModeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventResourceTypesEnum createEventResourceTypesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createEventResourceTypesEnumFromString(FhirPackage.eINSTANCE.getEventResourceTypesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventResourceTypesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEventResourceTypesEnumToString(FhirPackage.eINSTANCE.getEventResourceTypesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventStatusEnum createEventStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createEventStatusEnumFromString(FhirPackage.eINSTANCE.getEventStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEventStatusEnumToString(FhirPackage.eINSTANCE.getEventStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTimingEnum createEventTimingEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createEventTimingEnumFromString(FhirPackage.eINSTANCE.getEventTimingEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTimingEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEventTimingEnumToString(FhirPackage.eINSTANCE.getEventTimingEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceVariableHandlingEnum createEvidenceVariableHandlingEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createEvidenceVariableHandlingEnumFromString(FhirPackage.eINSTANCE.getEvidenceVariableHandlingEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvidenceVariableHandlingEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEvidenceVariableHandlingEnumToString(FhirPackage.eINSTANCE.getEvidenceVariableHandlingEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleScenarioActorTypeEnum createExampleScenarioActorTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createExampleScenarioActorTypeEnumFromString(FhirPackage.eINSTANCE.getExampleScenarioActorTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleScenarioActorTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExampleScenarioActorTypeEnumToString(FhirPackage.eINSTANCE.getExampleScenarioActorTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitStatusEnum createExplanationOfBenefitStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createExplanationOfBenefitStatusEnumFromString(FhirPackage.eINSTANCE.getExplanationOfBenefitStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExplanationOfBenefitStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExplanationOfBenefitStatusEnumToString(FhirPackage.eINSTANCE.getExplanationOfBenefitStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionContextTypeEnum createExtensionContextTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createExtensionContextTypeEnumFromString(FhirPackage.eINSTANCE.getExtensionContextTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtensionContextTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExtensionContextTypeEnumToString(FhirPackage.eINSTANCE.getExtensionContextTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryStatusEnum createFamilyHistoryStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createFamilyHistoryStatusEnumFromString(FhirPackage.eINSTANCE.getFamilyHistoryStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFamilyHistoryStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFamilyHistoryStatusEnumToString(FhirPackage.eINSTANCE.getFamilyHistoryStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRDeviceStatusEnum createFHIRDeviceStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createFHIRDeviceStatusEnumFromString(FhirPackage.eINSTANCE.getFHIRDeviceStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRDeviceStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFHIRDeviceStatusEnumToString(FhirPackage.eINSTANCE.getFHIRDeviceStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRPathTypesEnum createFHIRPathTypesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createFHIRPathTypesEnumFromString(FhirPackage.eINSTANCE.getFHIRPathTypesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRPathTypesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFHIRPathTypesEnumToString(FhirPackage.eINSTANCE.getFHIRPathTypesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRSubstanceStatusEnum createFHIRSubstanceStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createFHIRSubstanceStatusEnumFromString(FhirPackage.eINSTANCE.getFHIRSubstanceStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRSubstanceStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFHIRSubstanceStatusEnumToString(FhirPackage.eINSTANCE.getFHIRSubstanceStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRTypesEnum createFHIRTypesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createFHIRTypesEnumFromString(FhirPackage.eINSTANCE.getFHIRTypesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRTypesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFHIRTypesEnumToString(FhirPackage.eINSTANCE.getFHIRTypesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRVersionEnum createFHIRVersionEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createFHIRVersionEnumFromString(FhirPackage.eINSTANCE.getFHIRVersionEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRVersionEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFHIRVersionEnumToString(FhirPackage.eINSTANCE.getFHIRVersionEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperatorEnum createFilterOperatorEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createFilterOperatorEnumFromString(FhirPackage.eINSTANCE.getFilterOperatorEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterOperatorEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFilterOperatorEnumToString(FhirPackage.eINSTANCE.getFilterOperatorEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialResourceStatusCodesEnum createFinancialResourceStatusCodesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createFinancialResourceStatusCodesEnumFromString(FhirPackage.eINSTANCE.getFinancialResourceStatusCodesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFinancialResourceStatusCodesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFinancialResourceStatusCodesEnumToString(FhirPackage.eINSTANCE.getFinancialResourceStatusCodesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagStatusEnum createFlagStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createFlagStatusEnumFromString(FhirPackage.eINSTANCE.getFlagStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlagStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFlagStatusEnumToString(FhirPackage.eINSTANCE.getFlagStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormularyItemStatusCodesEnum createFormularyItemStatusCodesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createFormularyItemStatusCodesEnumFromString(FhirPackage.eINSTANCE.getFormularyItemStatusCodesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormularyItemStatusCodesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFormularyItemStatusCodesEnumToString(FhirPackage.eINSTANCE.getFormularyItemStatusCodesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenomicStudyStatusEnum createGenomicStudyStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createGenomicStudyStatusEnumFromString(FhirPackage.eINSTANCE.getGenomicStudyStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenomicStudyStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGenomicStudyStatusEnumToString(FhirPackage.eINSTANCE.getGenomicStudyStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalLifecycleStatusEnum createGoalLifecycleStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createGoalLifecycleStatusEnumFromString(FhirPackage.eINSTANCE.getGoalLifecycleStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalLifecycleStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGoalLifecycleStatusEnumToString(FhirPackage.eINSTANCE.getGoalLifecycleStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphCompartmentRuleEnum createGraphCompartmentRuleEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createGraphCompartmentRuleEnumFromString(FhirPackage.eINSTANCE.getGraphCompartmentRuleEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGraphCompartmentRuleEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGraphCompartmentRuleEnumToString(FhirPackage.eINSTANCE.getGraphCompartmentRuleEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphCompartmentUseEnum createGraphCompartmentUseEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createGraphCompartmentUseEnumFromString(FhirPackage.eINSTANCE.getGraphCompartmentUseEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGraphCompartmentUseEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGraphCompartmentUseEnumToString(FhirPackage.eINSTANCE.getGraphCompartmentUseEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupMembershipBasisEnum createGroupMembershipBasisEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createGroupMembershipBasisEnumFromString(FhirPackage.eINSTANCE.getGroupMembershipBasisEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupMembershipBasisEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGroupMembershipBasisEnumToString(FhirPackage.eINSTANCE.getGroupMembershipBasisEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupTypeEnum createGroupTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createGroupTypeEnumFromString(FhirPackage.eINSTANCE.getGroupTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGroupTypeEnumToString(FhirPackage.eINSTANCE.getGroupTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponseStatusEnum createGuidanceResponseStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createGuidanceResponseStatusEnumFromString(FhirPackage.eINSTANCE.getGuidanceResponseStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuidanceResponseStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGuidanceResponseStatusEnumToString(FhirPackage.eINSTANCE.getGuidanceResponseStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidePageGenerationEnum createGuidePageGenerationEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createGuidePageGenerationEnumFromString(FhirPackage.eINSTANCE.getGuidePageGenerationEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuidePageGenerationEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGuidePageGenerationEnumToString(FhirPackage.eINSTANCE.getGuidePageGenerationEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerbEnum createHTTPVerbEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createHTTPVerbEnumFromString(FhirPackage.eINSTANCE.getHTTPVerbEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHTTPVerbEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHTTPVerbEnumToString(FhirPackage.eINSTANCE.getHTTPVerbEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierUseEnum createIdentifierUseEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIdentifierUseEnumFromString(FhirPackage.eINSTANCE.getIdentifierUseEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierUseEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIdentifierUseEnumToString(FhirPackage.eINSTANCE.getIdentifierUseEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityAssuranceLevelEnum createIdentityAssuranceLevelEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIdentityAssuranceLevelEnumFromString(FhirPackage.eINSTANCE.getIdentityAssuranceLevelEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentityAssuranceLevelEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIdentityAssuranceLevelEnumToString(FhirPackage.eINSTANCE.getIdentityAssuranceLevelEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIdPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingSelectionDGraphicTypeEnum createImagingSelectionDGraphicTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createImagingSelectionDGraphicTypeEnumFromString(FhirPackage.eINSTANCE.getImagingSelectionDGraphicTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImagingSelectionDGraphicTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertImagingSelectionDGraphicTypeEnumToString(FhirPackage.eINSTANCE.getImagingSelectionDGraphicTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingSelectionStatusEnum createImagingSelectionStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createImagingSelectionStatusEnumFromString(FhirPackage.eINSTANCE.getImagingSelectionStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImagingSelectionStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertImagingSelectionStatusEnumToString(FhirPackage.eINSTANCE.getImagingSelectionStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudyStatusEnum createImagingStudyStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createImagingStudyStatusEnumFromString(FhirPackage.eINSTANCE.getImagingStudyStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImagingStudyStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertImagingStudyStatusEnumToString(FhirPackage.eINSTANCE.getImagingStudyStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationEvaluationStatusCodesEnum createImmunizationEvaluationStatusCodesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createImmunizationEvaluationStatusCodesEnumFromString(FhirPackage.eINSTANCE.getImmunizationEvaluationStatusCodesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationEvaluationStatusCodesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertImmunizationEvaluationStatusCodesEnumToString(FhirPackage.eINSTANCE.getImmunizationEvaluationStatusCodesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationStatusCodesEnum createImmunizationStatusCodesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createImmunizationStatusCodesEnumFromString(FhirPackage.eINSTANCE.getImmunizationStatusCodesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationStatusCodesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertImmunizationStatusCodesEnumToString(FhirPackage.eINSTANCE.getImmunizationStatusCodesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IngredientManufacturerRoleEnum createIngredientManufacturerRoleEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIngredientManufacturerRoleEnumFromString(FhirPackage.eINSTANCE.getIngredientManufacturerRoleEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIngredientManufacturerRoleEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIngredientManufacturerRoleEnumToString(FhirPackage.eINSTANCE.getIngredientManufacturerRoleEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createInstantPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstantPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createInteger64PrimitiveFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LONG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInteger64PrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LONG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createInteger64PrimitiveObjectFromString(EDataType eDataType, String initialValue) {
		return createInteger64PrimitiveFromString(FhirPackage.eINSTANCE.getInteger64Primitive(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInteger64PrimitiveObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInteger64PrimitiveToString(FhirPackage.eINSTANCE.getInteger64Primitive(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerPrimitiveObjectFromString(EDataType eDataType, String initialValue) {
		return createIntegerPrimitiveFromString(FhirPackage.eINSTANCE.getIntegerPrimitive(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerPrimitiveObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIntegerPrimitiveToString(FhirPackage.eINSTANCE.getIntegerPrimitive(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionTriggerEnum createInteractionTriggerEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createInteractionTriggerEnumFromString(FhirPackage.eINSTANCE.getInteractionTriggerEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInteractionTriggerEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInteractionTriggerEnumToString(FhirPackage.eINSTANCE.getInteractionTriggerEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryCountTypeEnum createInventoryCountTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createInventoryCountTypeEnumFromString(FhirPackage.eINSTANCE.getInventoryCountTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInventoryCountTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInventoryCountTypeEnumToString(FhirPackage.eINSTANCE.getInventoryCountTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryItemStatusCodesEnum createInventoryItemStatusCodesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createInventoryItemStatusCodesEnumFromString(FhirPackage.eINSTANCE.getInventoryItemStatusCodesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInventoryItemStatusCodesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInventoryItemStatusCodesEnumToString(FhirPackage.eINSTANCE.getInventoryItemStatusCodesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryReportStatusEnum createInventoryReportStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createInventoryReportStatusEnumFromString(FhirPackage.eINSTANCE.getInventoryReportStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInventoryReportStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInventoryReportStatusEnumToString(FhirPackage.eINSTANCE.getInventoryReportStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceStatusEnum createInvoiceStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createInvoiceStatusEnumFromString(FhirPackage.eINSTANCE.getInvoiceStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvoiceStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInvoiceStatusEnumToString(FhirPackage.eINSTANCE.getInvoiceStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueSeverityEnum createIssueSeverityEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIssueSeverityEnumFromString(FhirPackage.eINSTANCE.getIssueSeverityEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueSeverityEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIssueSeverityEnumToString(FhirPackage.eINSTANCE.getIssueSeverityEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueTypeEnum createIssueTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIssueTypeEnumFromString(FhirPackage.eINSTANCE.getIssueTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIssueTypeEnumToString(FhirPackage.eINSTANCE.getIssueTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JurisdictionValueSetEnum createJurisdictionValueSetEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createJurisdictionValueSetEnumFromString(FhirPackage.eINSTANCE.getJurisdictionValueSetEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJurisdictionValueSetEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertJurisdictionValueSetEnumToString(FhirPackage.eINSTANCE.getJurisdictionValueSetEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindEnum createKindEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createKindEnumFromString(FhirPackage.eINSTANCE.getKindEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertKindEnumToString(FhirPackage.eINSTANCE.getKindEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkageTypeEnum createLinkageTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createLinkageTypeEnumFromString(FhirPackage.eINSTANCE.getLinkageTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkageTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLinkageTypeEnumToString(FhirPackage.eINSTANCE.getLinkageTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkRelationTypesEnum createLinkRelationTypesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createLinkRelationTypesEnumFromString(FhirPackage.eINSTANCE.getLinkRelationTypesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkRelationTypesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLinkRelationTypesEnumToString(FhirPackage.eINSTANCE.getLinkRelationTypesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkTypeEnum createLinkTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createLinkTypeEnumFromString(FhirPackage.eINSTANCE.getLinkTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLinkTypeEnumToString(FhirPackage.eINSTANCE.getLinkTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListModeEnum createListModeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createListModeEnumFromString(FhirPackage.eINSTANCE.getListModeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListModeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertListModeEnumToString(FhirPackage.eINSTANCE.getListModeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStatusEnum createListStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createListStatusEnumFromString(FhirPackage.eINSTANCE.getListStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertListStatusEnumToString(FhirPackage.eINSTANCE.getListStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationModeEnum createLocationModeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createLocationModeEnumFromString(FhirPackage.eINSTANCE.getLocationModeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationModeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLocationModeEnumToString(FhirPackage.eINSTANCE.getLocationModeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationStatusEnum createLocationStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createLocationStatusEnumFromString(FhirPackage.eINSTANCE.getLocationStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLocationStatusEnumToString(FhirPackage.eINSTANCE.getLocationStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMarkdownPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMarkdownPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportStatusEnum createMeasureReportStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createMeasureReportStatusEnumFromString(FhirPackage.eINSTANCE.getMeasureReportStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureReportStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMeasureReportStatusEnumToString(FhirPackage.eINSTANCE.getMeasureReportStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportTypeEnum createMeasureReportTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createMeasureReportTypeEnumFromString(FhirPackage.eINSTANCE.getMeasureReportTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureReportTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMeasureReportTypeEnumToString(FhirPackage.eINSTANCE.getMeasureReportTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationStatusCodesEnum createMedicationAdministrationStatusCodesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationAdministrationStatusCodesEnumFromString(FhirPackage.eINSTANCE.getMedicationAdministrationStatusCodesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationAdministrationStatusCodesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationAdministrationStatusCodesEnumToString(FhirPackage.eINSTANCE.getMedicationAdministrationStatusCodesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseStatusCodesEnum createMedicationDispenseStatusCodesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationDispenseStatusCodesEnumFromString(FhirPackage.eINSTANCE.getMedicationDispenseStatusCodesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationDispenseStatusCodesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationDispenseStatusCodesEnumToString(FhirPackage.eINSTANCE.getMedicationDispenseStatusCodesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgeStatusCodesEnum createMedicationKnowledgeStatusCodesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationKnowledgeStatusCodesEnumFromString(FhirPackage.eINSTANCE.getMedicationKnowledgeStatusCodesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationKnowledgeStatusCodesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationKnowledgeStatusCodesEnumToString(FhirPackage.eINSTANCE.getMedicationKnowledgeStatusCodesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestIntentEnum createMedicationRequestIntentEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationRequestIntentEnumFromString(FhirPackage.eINSTANCE.getMedicationRequestIntentEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationRequestIntentEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationRequestIntentEnumToString(FhirPackage.eINSTANCE.getMedicationRequestIntentEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationrequestStatusEnum createMedicationrequestStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationrequestStatusEnumFromString(FhirPackage.eINSTANCE.getMedicationrequestStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationrequestStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationrequestStatusEnumToString(FhirPackage.eINSTANCE.getMedicationrequestStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementStatusCodesEnum createMedicationStatementStatusCodesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationStatementStatusCodesEnumFromString(FhirPackage.eINSTANCE.getMedicationStatementStatusCodesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationStatementStatusCodesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationStatementStatusCodesEnumToString(FhirPackage.eINSTANCE.getMedicationStatementStatusCodesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatusCodesEnum createMedicationStatusCodesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationStatusCodesEnumFromString(FhirPackage.eINSTANCE.getMedicationStatusCodesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationStatusCodesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationStatusCodesEnumToString(FhirPackage.eINSTANCE.getMedicationStatusCodesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageheaderResponseRequestEnum createMessageheaderResponseRequestEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createMessageheaderResponseRequestEnumFromString(FhirPackage.eINSTANCE.getMessageheaderResponseRequestEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageheaderResponseRequestEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMessageheaderResponseRequestEnumToString(FhirPackage.eINSTANCE.getMessageheaderResponseRequestEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSignificanceCategoryEnum createMessageSignificanceCategoryEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createMessageSignificanceCategoryEnumFromString(FhirPackage.eINSTANCE.getMessageSignificanceCategoryEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSignificanceCategoryEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMessageSignificanceCategoryEnumToString(FhirPackage.eINSTANCE.getMessageSignificanceCategoryEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameUseEnum createNameUseEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createNameUseEnumFromString(FhirPackage.eINSTANCE.getNameUseEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameUseEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNameUseEnumToString(FhirPackage.eINSTANCE.getNameUseEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemIdentifierTypeEnum createNamingSystemIdentifierTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createNamingSystemIdentifierTypeEnumFromString(FhirPackage.eINSTANCE.getNamingSystemIdentifierTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingSystemIdentifierTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNamingSystemIdentifierTypeEnumToString(FhirPackage.eINSTANCE.getNamingSystemIdentifierTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemTypeEnum createNamingSystemTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createNamingSystemTypeEnumFromString(FhirPackage.eINSTANCE.getNamingSystemTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingSystemTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNamingSystemTypeEnumToString(FhirPackage.eINSTANCE.getNamingSystemTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NarrativeStatusEnum createNarrativeStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createNarrativeStatusEnumFromString(FhirPackage.eINSTANCE.getNarrativeStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNarrativeStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNarrativeStatusEnumToString(FhirPackage.eINSTANCE.getNarrativeStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteTypeEnum createNoteTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createNoteTypeEnumFromString(FhirPackage.eINSTANCE.getNoteTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoteTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNoteTypeEnumToString(FhirPackage.eINSTANCE.getNoteTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionProductStatusEnum createNutritionProductStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createNutritionProductStatusEnumFromString(FhirPackage.eINSTANCE.getNutritionProductStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNutritionProductStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNutritionProductStatusEnumToString(FhirPackage.eINSTANCE.getNutritionProductStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationDataTypeEnum createObservationDataTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createObservationDataTypeEnumFromString(FhirPackage.eINSTANCE.getObservationDataTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationDataTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertObservationDataTypeEnumToString(FhirPackage.eINSTANCE.getObservationDataTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationRangeCategoryEnum createObservationRangeCategoryEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createObservationRangeCategoryEnumFromString(FhirPackage.eINSTANCE.getObservationRangeCategoryEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationRangeCategoryEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertObservationRangeCategoryEnumToString(FhirPackage.eINSTANCE.getObservationRangeCategoryEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationStatusEnum createObservationStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createObservationStatusEnumFromString(FhirPackage.eINSTANCE.getObservationStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertObservationStatusEnumToString(FhirPackage.eINSTANCE.getObservationStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOidPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOidPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationKindEnum createOperationKindEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createOperationKindEnumFromString(FhirPackage.eINSTANCE.getOperationKindEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationKindEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOperationKindEnumToString(FhirPackage.eINSTANCE.getOperationKindEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationOutcomeCodesEnum createOperationOutcomeCodesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createOperationOutcomeCodesEnumFromString(FhirPackage.eINSTANCE.getOperationOutcomeCodesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationOutcomeCodesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOperationOutcomeCodesEnumToString(FhirPackage.eINSTANCE.getOperationOutcomeCodesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterScopeEnum createOperationParameterScopeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createOperationParameterScopeEnumFromString(FhirPackage.eINSTANCE.getOperationParameterScopeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationParameterScopeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOperationParameterScopeEnumToString(FhirPackage.eINSTANCE.getOperationParameterScopeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterUseEnum createOperationParameterUseEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createOperationParameterUseEnumFromString(FhirPackage.eINSTANCE.getOperationParameterUseEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationParameterUseEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOperationParameterUseEnumToString(FhirPackage.eINSTANCE.getOperationParameterUseEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationTypeEnum createOrientationTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createOrientationTypeEnumFromString(FhirPackage.eINSTANCE.getOrientationTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOrientationTypeEnumToString(FhirPackage.eINSTANCE.getOrientationTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantResourceTypesEnum createParticipantResourceTypesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createParticipantResourceTypesEnumFromString(FhirPackage.eINSTANCE.getParticipantResourceTypesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantResourceTypesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertParticipantResourceTypesEnumToString(FhirPackage.eINSTANCE.getParticipantResourceTypesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipationStatusEnum createParticipationStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createParticipationStatusEnumFromString(FhirPackage.eINSTANCE.getParticipationStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipationStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertParticipationStatusEnumToString(FhirPackage.eINSTANCE.getParticipationStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentOutcomeEnum createPaymentOutcomeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createPaymentOutcomeEnumFromString(FhirPackage.eINSTANCE.getPaymentOutcomeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentOutcomeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPaymentOutcomeEnumToString(FhirPackage.eINSTANCE.getPaymentOutcomeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionRuleCombiningEnum createPermissionRuleCombiningEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createPermissionRuleCombiningEnumFromString(FhirPackage.eINSTANCE.getPermissionRuleCombiningEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPermissionRuleCombiningEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPermissionRuleCombiningEnumToString(FhirPackage.eINSTANCE.getPermissionRuleCombiningEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionStatusEnum createPermissionStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createPermissionStatusEnumFromString(FhirPackage.eINSTANCE.getPermissionStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPermissionStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPermissionStatusEnumToString(FhirPackage.eINSTANCE.getPermissionStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPositiveIntPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveIntPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRepresentationEnum createPropertyRepresentationEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createPropertyRepresentationEnumFromString(FhirPackage.eINSTANCE.getPropertyRepresentationEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyRepresentationEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPropertyRepresentationEnumToString(FhirPackage.eINSTANCE.getPropertyRepresentationEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTypeEnum createPropertyTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createPropertyTypeEnumFromString(FhirPackage.eINSTANCE.getPropertyTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPropertyTypeEnumToString(FhirPackage.eINSTANCE.getPropertyTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceEntityRoleEnum createProvenanceEntityRoleEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createProvenanceEntityRoleEnumFromString(FhirPackage.eINSTANCE.getProvenanceEntityRoleEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProvenanceEntityRoleEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProvenanceEntityRoleEnumToString(FhirPackage.eINSTANCE.getProvenanceEntityRoleEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationStatusEnum createPublicationStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createPublicationStatusEnumFromString(FhirPackage.eINSTANCE.getPublicationStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPublicationStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPublicationStatusEnumToString(FhirPackage.eINSTANCE.getPublicationStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityComparatorEnum createQuantityComparatorEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createQuantityComparatorEnumFromString(FhirPackage.eINSTANCE.getQuantityComparatorEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantityComparatorEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQuantityComparatorEnumToString(FhirPackage.eINSTANCE.getQuantityComparatorEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireAnswerConstraintEnum createQuestionnaireAnswerConstraintEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createQuestionnaireAnswerConstraintEnumFromString(FhirPackage.eINSTANCE.getQuestionnaireAnswerConstraintEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireAnswerConstraintEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQuestionnaireAnswerConstraintEnumToString(FhirPackage.eINSTANCE.getQuestionnaireAnswerConstraintEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItemDisabledDisplayEnum createQuestionnaireItemDisabledDisplayEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createQuestionnaireItemDisabledDisplayEnumFromString(FhirPackage.eINSTANCE.getQuestionnaireItemDisabledDisplayEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireItemDisabledDisplayEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQuestionnaireItemDisabledDisplayEnumToString(FhirPackage.eINSTANCE.getQuestionnaireItemDisabledDisplayEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItemOperatorEnum createQuestionnaireItemOperatorEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createQuestionnaireItemOperatorEnumFromString(FhirPackage.eINSTANCE.getQuestionnaireItemOperatorEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireItemOperatorEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQuestionnaireItemOperatorEnumToString(FhirPackage.eINSTANCE.getQuestionnaireItemOperatorEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItemTypeEnum createQuestionnaireItemTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createQuestionnaireItemTypeEnumFromString(FhirPackage.eINSTANCE.getQuestionnaireItemTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireItemTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQuestionnaireItemTypeEnumToString(FhirPackage.eINSTANCE.getQuestionnaireItemTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseStatusEnum createQuestionnaireResponseStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createQuestionnaireResponseStatusEnumFromString(FhirPackage.eINSTANCE.getQuestionnaireResponseStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireResponseStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQuestionnaireResponseStatusEnumToString(FhirPackage.eINSTANCE.getQuestionnaireResponseStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceHandlingPolicyEnum createReferenceHandlingPolicyEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createReferenceHandlingPolicyEnumFromString(FhirPackage.eINSTANCE.getReferenceHandlingPolicyEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceHandlingPolicyEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReferenceHandlingPolicyEnumToString(FhirPackage.eINSTANCE.getReferenceHandlingPolicyEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceVersionRulesEnum createReferenceVersionRulesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createReferenceVersionRulesEnumFromString(FhirPackage.eINSTANCE.getReferenceVersionRulesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceVersionRulesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReferenceVersionRulesEnumToString(FhirPackage.eINSTANCE.getReferenceVersionRulesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedArtifactTypeEnum createRelatedArtifactTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createRelatedArtifactTypeEnumFromString(FhirPackage.eINSTANCE.getRelatedArtifactTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelatedArtifactTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRelatedArtifactTypeEnumToString(FhirPackage.eINSTANCE.getRelatedArtifactTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedArtifactTypeExpandedEnum createRelatedArtifactTypeExpandedEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createRelatedArtifactTypeExpandedEnumFromString(FhirPackage.eINSTANCE.getRelatedArtifactTypeExpandedEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelatedArtifactTypeExpandedEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRelatedArtifactTypeExpandedEnumToString(FhirPackage.eINSTANCE.getRelatedArtifactTypeExpandedEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemittanceOutcomeEnum createRemittanceOutcomeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createRemittanceOutcomeEnumFromString(FhirPackage.eINSTANCE.getRemittanceOutcomeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRemittanceOutcomeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRemittanceOutcomeEnumToString(FhirPackage.eINSTANCE.getRemittanceOutcomeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportRelationshipTypeEnum createReportRelationshipTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createReportRelationshipTypeEnumFromString(FhirPackage.eINSTANCE.getReportRelationshipTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReportRelationshipTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReportRelationshipTypeEnumToString(FhirPackage.eINSTANCE.getReportRelationshipTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestIntentEnum createRequestIntentEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createRequestIntentEnumFromString(FhirPackage.eINSTANCE.getRequestIntentEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestIntentEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRequestIntentEnumToString(FhirPackage.eINSTANCE.getRequestIntentEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestPriorityEnum createRequestPriorityEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createRequestPriorityEnumFromString(FhirPackage.eINSTANCE.getRequestPriorityEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestPriorityEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRequestPriorityEnumToString(FhirPackage.eINSTANCE.getRequestPriorityEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestResourceTypesEnum createRequestResourceTypesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createRequestResourceTypesEnumFromString(FhirPackage.eINSTANCE.getRequestResourceTypesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestResourceTypesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRequestResourceTypesEnumToString(FhirPackage.eINSTANCE.getRequestResourceTypesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestStatusEnum createRequestStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createRequestStatusEnumFromString(FhirPackage.eINSTANCE.getRequestStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRequestStatusEnumToString(FhirPackage.eINSTANCE.getRequestStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTypeEnum createResourceTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createResourceTypeEnumFromString(FhirPackage.eINSTANCE.getResourceTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResourceTypeEnumToString(FhirPackage.eINSTANCE.getResourceTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceVersionPolicyEnum createResourceVersionPolicyEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createResourceVersionPolicyEnumFromString(FhirPackage.eINSTANCE.getResourceVersionPolicyEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceVersionPolicyEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResourceVersionPolicyEnumToString(FhirPackage.eINSTANCE.getResourceVersionPolicyEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseTypeEnum createResponseTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createResponseTypeEnumFromString(FhirPackage.eINSTANCE.getResponseTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResponseTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResponseTypeEnumToString(FhirPackage.eINSTANCE.getResponseTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestfulCapabilityModeEnum createRestfulCapabilityModeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createRestfulCapabilityModeEnumFromString(FhirPackage.eINSTANCE.getRestfulCapabilityModeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestfulCapabilityModeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRestfulCapabilityModeEnumToString(FhirPackage.eINSTANCE.getRestfulCapabilityModeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSampledDataDataTypePrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSampledDataDataTypePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchComparatorEnum createSearchComparatorEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createSearchComparatorEnumFromString(FhirPackage.eINSTANCE.getSearchComparatorEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchComparatorEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSearchComparatorEnumToString(FhirPackage.eINSTANCE.getSearchComparatorEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchEntryModeEnum createSearchEntryModeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createSearchEntryModeEnumFromString(FhirPackage.eINSTANCE.getSearchEntryModeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchEntryModeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSearchEntryModeEnumToString(FhirPackage.eINSTANCE.getSearchEntryModeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchModifierCodeEnum createSearchModifierCodeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createSearchModifierCodeEnumFromString(FhirPackage.eINSTANCE.getSearchModifierCodeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchModifierCodeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSearchModifierCodeEnumToString(FhirPackage.eINSTANCE.getSearchModifierCodeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParamTypeEnum createSearchParamTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createSearchParamTypeEnumFromString(FhirPackage.eINSTANCE.getSearchParamTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchParamTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSearchParamTypeEnumToString(FhirPackage.eINSTANCE.getSearchParamTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchProcessingModeTypeEnum createSearchProcessingModeTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createSearchProcessingModeTypeEnumFromString(FhirPackage.eINSTANCE.getSearchProcessingModeTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchProcessingModeTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSearchProcessingModeTypeEnumToString(FhirPackage.eINSTANCE.getSearchProcessingModeTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceTypeEnum createSequenceTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createSequenceTypeEnumFromString(FhirPackage.eINSTANCE.getSequenceTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSequenceTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSequenceTypeEnumToString(FhirPackage.eINSTANCE.getSequenceTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingRulesEnum createSlicingRulesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createSlicingRulesEnumFromString(FhirPackage.eINSTANCE.getSlicingRulesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlicingRulesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSlicingRulesEnumToString(FhirPackage.eINSTANCE.getSlicingRulesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotStatusEnum createSlotStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createSlotStatusEnumFromString(FhirPackage.eINSTANCE.getSlotStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlotStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSlotStatusEnumToString(FhirPackage.eINSTANCE.getSlotStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortDirectionEnum createSortDirectionEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createSortDirectionEnumFromString(FhirPackage.eINSTANCE.getSortDirectionEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortDirectionEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSortDirectionEnumToString(FhirPackage.eINSTANCE.getSortDirectionEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPDXLicenseEnum createSPDXLicenseEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createSPDXLicenseEnumFromString(FhirPackage.eINSTANCE.getSPDXLicenseEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSPDXLicenseEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSPDXLicenseEnumToString(FhirPackage.eINSTANCE.getSPDXLicenseEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenCombinedEnum createSpecimenCombinedEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createSpecimenCombinedEnumFromString(FhirPackage.eINSTANCE.getSpecimenCombinedEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenCombinedEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSpecimenCombinedEnumToString(FhirPackage.eINSTANCE.getSpecimenCombinedEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenContainedPreferenceEnum createSpecimenContainedPreferenceEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createSpecimenContainedPreferenceEnumFromString(FhirPackage.eINSTANCE.getSpecimenContainedPreferenceEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenContainedPreferenceEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSpecimenContainedPreferenceEnumToString(FhirPackage.eINSTANCE.getSpecimenContainedPreferenceEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenStatusEnum createSpecimenStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createSpecimenStatusEnumFromString(FhirPackage.eINSTANCE.getSpecimenStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSpecimenStatusEnumToString(FhirPackage.eINSTANCE.getSpecimenStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrandTypeEnum createStrandTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createStrandTypeEnumFromString(FhirPackage.eINSTANCE.getStrandTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrandTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStrandTypeEnumToString(FhirPackage.eINSTANCE.getStrandTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionKindEnum createStructureDefinitionKindEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureDefinitionKindEnumFromString(FhirPackage.eINSTANCE.getStructureDefinitionKindEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureDefinitionKindEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureDefinitionKindEnumToString(FhirPackage.eINSTANCE.getStructureDefinitionKindEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapGroupTypeModeEnum createStructureMapGroupTypeModeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapGroupTypeModeEnumFromString(FhirPackage.eINSTANCE.getStructureMapGroupTypeModeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapGroupTypeModeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapGroupTypeModeEnumToString(FhirPackage.eINSTANCE.getStructureMapGroupTypeModeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapInputModeEnum createStructureMapInputModeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapInputModeEnumFromString(FhirPackage.eINSTANCE.getStructureMapInputModeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapInputModeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapInputModeEnumToString(FhirPackage.eINSTANCE.getStructureMapInputModeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapModelModeEnum createStructureMapModelModeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapModelModeEnumFromString(FhirPackage.eINSTANCE.getStructureMapModelModeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapModelModeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapModelModeEnumToString(FhirPackage.eINSTANCE.getStructureMapModelModeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapSourceListModeEnum createStructureMapSourceListModeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapSourceListModeEnumFromString(FhirPackage.eINSTANCE.getStructureMapSourceListModeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapSourceListModeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapSourceListModeEnumToString(FhirPackage.eINSTANCE.getStructureMapSourceListModeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapTargetListModeEnum createStructureMapTargetListModeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapTargetListModeEnumFromString(FhirPackage.eINSTANCE.getStructureMapTargetListModeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapTargetListModeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapTargetListModeEnumToString(FhirPackage.eINSTANCE.getStructureMapTargetListModeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapTransformEnum createStructureMapTransformEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapTransformEnumFromString(FhirPackage.eINSTANCE.getStructureMapTransformEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapTransformEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapTransformEnumToString(FhirPackage.eINSTANCE.getStructureMapTransformEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmitDataUpdateTypeEnum createSubmitDataUpdateTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createSubmitDataUpdateTypeEnumFromString(FhirPackage.eINSTANCE.getSubmitDataUpdateTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubmitDataUpdateTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSubmitDataUpdateTypeEnumToString(FhirPackage.eINSTANCE.getSubmitDataUpdateTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionNotificationTypeEnum createSubscriptionNotificationTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createSubscriptionNotificationTypeEnumFromString(FhirPackage.eINSTANCE.getSubscriptionNotificationTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionNotificationTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSubscriptionNotificationTypeEnumToString(FhirPackage.eINSTANCE.getSubscriptionNotificationTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionPayloadContentEnum createSubscriptionPayloadContentEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createSubscriptionPayloadContentEnumFromString(FhirPackage.eINSTANCE.getSubscriptionPayloadContentEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionPayloadContentEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSubscriptionPayloadContentEnumToString(FhirPackage.eINSTANCE.getSubscriptionPayloadContentEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionStatusCodesEnum createSubscriptionStatusCodesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createSubscriptionStatusCodesEnumFromString(FhirPackage.eINSTANCE.getSubscriptionStatusCodesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionStatusCodesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSubscriptionStatusCodesEnumToString(FhirPackage.eINSTANCE.getSubscriptionStatusCodesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDeliveryStatusEnum createSupplyDeliveryStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createSupplyDeliveryStatusEnumFromString(FhirPackage.eINSTANCE.getSupplyDeliveryStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyDeliveryStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSupplyDeliveryStatusEnumToString(FhirPackage.eINSTANCE.getSupplyDeliveryStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequestStatusEnum createSupplyRequestStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createSupplyRequestStatusEnumFromString(FhirPackage.eINSTANCE.getSupplyRequestStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyRequestStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSupplyRequestStatusEnumToString(FhirPackage.eINSTANCE.getSupplyRequestStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRestfulInteractionEnum createSystemRestfulInteractionEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createSystemRestfulInteractionEnumFromString(FhirPackage.eINSTANCE.getSystemRestfulInteractionEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemRestfulInteractionEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSystemRestfulInteractionEnumToString(FhirPackage.eINSTANCE.getSystemRestfulInteractionEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskIntentEnum createTaskIntentEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTaskIntentEnumFromString(FhirPackage.eINSTANCE.getTaskIntentEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskIntentEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTaskIntentEnumToString(FhirPackage.eINSTANCE.getTaskIntentEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStatusEnum createTaskStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTaskStatusEnumFromString(FhirPackage.eINSTANCE.getTaskStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTaskStatusEnumToString(FhirPackage.eINSTANCE.getTaskStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportActionResultEnum createTestReportActionResultEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTestReportActionResultEnumFromString(FhirPackage.eINSTANCE.getTestReportActionResultEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportActionResultEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTestReportActionResultEnumToString(FhirPackage.eINSTANCE.getTestReportActionResultEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportParticipantTypeEnum createTestReportParticipantTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTestReportParticipantTypeEnumFromString(FhirPackage.eINSTANCE.getTestReportParticipantTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportParticipantTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTestReportParticipantTypeEnumToString(FhirPackage.eINSTANCE.getTestReportParticipantTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportResultEnum createTestReportResultEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTestReportResultEnumFromString(FhirPackage.eINSTANCE.getTestReportResultEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportResultEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTestReportResultEnumToString(FhirPackage.eINSTANCE.getTestReportResultEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportStatusEnum createTestReportStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTestReportStatusEnumFromString(FhirPackage.eINSTANCE.getTestReportStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTestReportStatusEnumToString(FhirPackage.eINSTANCE.getTestReportStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRequestMethodCodeEnum createTestScriptRequestMethodCodeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTestScriptRequestMethodCodeEnumFromString(FhirPackage.eINSTANCE.getTestScriptRequestMethodCodeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestScriptRequestMethodCodeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTestScriptRequestMethodCodeEnumToString(FhirPackage.eINSTANCE.getTestScriptRequestMethodCodeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createTimePrimitiveFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportIntentEnum createTransportIntentEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTransportIntentEnumFromString(FhirPackage.eINSTANCE.getTransportIntentEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransportIntentEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransportIntentEnumToString(FhirPackage.eINSTANCE.getTransportIntentEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportStatusEnum createTransportStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTransportStatusEnumFromString(FhirPackage.eINSTANCE.getTransportStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransportStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransportStatusEnumToString(FhirPackage.eINSTANCE.getTransportStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggeredBytypeEnum createTriggeredBytypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTriggeredBytypeEnumFromString(FhirPackage.eINSTANCE.getTriggeredBytypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggeredBytypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTriggeredBytypeEnumToString(FhirPackage.eINSTANCE.getTriggeredBytypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerTypeEnum createTriggerTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTriggerTypeEnumFromString(FhirPackage.eINSTANCE.getTriggerTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTriggerTypeEnumToString(FhirPackage.eINSTANCE.getTriggerTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDerivationRuleEnum createTypeDerivationRuleEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeDerivationRuleEnumFromString(FhirPackage.eINSTANCE.getTypeDerivationRuleEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDerivationRuleEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeDerivationRuleEnumToString(FhirPackage.eINSTANCE.getTypeDerivationRuleEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRestfulInteractionEnum createTypeRestfulInteractionEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeRestfulInteractionEnumFromString(FhirPackage.eINSTANCE.getTypeRestfulInteractionEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRestfulInteractionEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeRestfulInteractionEnumToString(FhirPackage.eINSTANCE.getTypeRestfulInteractionEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDIEntryTypeEnum createUDIEntryTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createUDIEntryTypeEnumFromString(FhirPackage.eINSTANCE.getUDIEntryTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUDIEntryTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUDIEntryTypeEnumToString(FhirPackage.eINSTANCE.getUDIEntryTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsOfTimeEnum createUnitsOfTimeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitsOfTimeEnumFromString(FhirPackage.eINSTANCE.getUnitsOfTimeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsOfTimeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitsOfTimeEnumToString(FhirPackage.eINSTANCE.getUnitsOfTimeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createUnsignedIntPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnsignedIntPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUriPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUriPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUrlPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUrlPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseEnum createUseEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createUseEnumFromString(FhirPackage.eINSTANCE.getUseEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUseEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUseEnumToString(FhirPackage.eINSTANCE.getUseEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUuidPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUuidPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationResultStatusEnum createVerificationResultStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createVerificationResultStatusEnumFromString(FhirPackage.eINSTANCE.getVerificationResultStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerificationResultStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVerificationResultStatusEnumToString(FhirPackage.eINSTANCE.getVerificationResultStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionIndependentResourceTypesAllEnum createVersionIndependentResourceTypesAllEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createVersionIndependentResourceTypesAllEnumFromString(FhirPackage.eINSTANCE.getVersionIndependentResourceTypesAllEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionIndependentResourceTypesAllEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVersionIndependentResourceTypesAllEnumToString(FhirPackage.eINSTANCE.getVersionIndependentResourceTypesAllEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionBaseEnum createVisionBaseEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createVisionBaseEnumFromString(FhirPackage.eINSTANCE.getVisionBaseEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionBaseEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVisionBaseEnumToString(FhirPackage.eINSTANCE.getVisionBaseEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionEyesEnum createVisionEyesEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createVisionEyesEnumFromString(FhirPackage.eINSTANCE.getVisionEyesEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionEyesEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVisionEyesEnumToString(FhirPackage.eINSTANCE.getVisionEyesEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirPackage getFhirPackage() {
		return (FhirPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FhirPackage getPackage() {
		return FhirPackage.eINSTANCE;
	}

} //FhirFactoryImpl
