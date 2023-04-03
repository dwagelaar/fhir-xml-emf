/**
 */
package org.hl7.fhir;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getAccount <em>Account</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getActivityDefinition <em>Activity Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getActorDefinition <em>Actor Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getAdministrableProductDefinition <em>Administrable Product Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getAdverseEvent <em>Adverse Event</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getAllergyIntolerance <em>Allergy Intolerance</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getAppointmentResponse <em>Appointment Response</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getArtifactAssessment <em>Artifact Assessment</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getAuditEvent <em>Audit Event</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getBinary <em>Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getBiologicallyDerivedProduct <em>Biologically Derived Product</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getBiologicallyDerivedProductDispense <em>Biologically Derived Product Dispense</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getBodyStructure <em>Body Structure</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getBundle <em>Bundle</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getCapabilityStatement <em>Capability Statement</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getCarePlan <em>Care Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getCareTeam <em>Care Team</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getChargeItem <em>Charge Item</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getChargeItemDefinition <em>Charge Item Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getCitation <em>Citation</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getClaim <em>Claim</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getClaimResponse <em>Claim Response</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getClinicalImpression <em>Clinical Impression</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getClinicalUseDefinition <em>Clinical Use Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getCommunication <em>Communication</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getCommunicationRequest <em>Communication Request</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getCompartmentDefinition <em>Compartment Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getComposition <em>Composition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getConceptMap <em>Concept Map</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getConditionDefinition <em>Condition Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getConsent <em>Consent</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getContract <em>Contract</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getCoverageEligibilityRequest <em>Coverage Eligibility Request</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getCoverageEligibilityResponse <em>Coverage Eligibility Response</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getDetectedIssue <em>Detected Issue</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getDeviceAssociation <em>Device Association</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getDeviceDefinition <em>Device Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getDeviceDispense <em>Device Dispense</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getDeviceMetric <em>Device Metric</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getDeviceRequest <em>Device Request</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getDeviceUsage <em>Device Usage</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getDiagnosticReport <em>Diagnostic Report</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getDocumentReference <em>Document Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getEncounterHistory <em>Encounter History</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getEnrollmentRequest <em>Enrollment Request</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getEnrollmentResponse <em>Enrollment Response</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getEpisodeOfCare <em>Episode Of Care</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getEventDefinition <em>Event Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getEvidenceReport <em>Evidence Report</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getEvidenceVariable <em>Evidence Variable</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getExampleScenario <em>Example Scenario</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getExplanationOfBenefit <em>Explanation Of Benefit</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getFamilyMemberHistory <em>Family Member History</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getFlag <em>Flag</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getFormularyItem <em>Formulary Item</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getGenomicStudy <em>Genomic Study</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getGraphDefinition <em>Graph Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getGuidanceResponse <em>Guidance Response</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getHealthcareService <em>Healthcare Service</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getImagingSelection <em>Imaging Selection</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getImagingStudy <em>Imaging Study</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getImmunization <em>Immunization</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getImmunizationEvaluation <em>Immunization Evaluation</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getImmunizationRecommendation <em>Immunization Recommendation</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getImplementationGuide <em>Implementation Guide</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getInsurancePlan <em>Insurance Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getInventoryItem <em>Inventory Item</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getInventoryReport <em>Inventory Report</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getInvoice <em>Invoice</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getLinkage <em>Linkage</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getList <em>List</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getManufacturedItemDefinition <em>Manufactured Item Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMeasureReport <em>Measure Report</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMedication <em>Medication</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMedicationAdministration <em>Medication Administration</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMedicationDispense <em>Medication Dispense</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMedicationKnowledge <em>Medication Knowledge</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMedicationRequest <em>Medication Request</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMedicationStatement <em>Medication Statement</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMedicinalProductDefinition <em>Medicinal Product Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMessageDefinition <em>Message Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMessageHeader <em>Message Header</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getMolecularSequence <em>Molecular Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getNamingSystem <em>Naming System</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getNutritionIntake <em>Nutrition Intake</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getNutritionOrder <em>Nutrition Order</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getNutritionProduct <em>Nutrition Product</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getObservation <em>Observation</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getObservationDefinition <em>Observation Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getOperationDefinition <em>Operation Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getOperationOutcome <em>Operation Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getOrganizationAffiliation <em>Organization Affiliation</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getPackagedProductDefinition <em>Packaged Product Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getPaymentNotice <em>Payment Notice</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getPaymentReconciliation <em>Payment Reconciliation</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getPermission <em>Permission</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getPerson <em>Person</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getPlanDefinition <em>Plan Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getPractitioner <em>Practitioner</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getPractitionerRole <em>Practitioner Role</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getProvenance <em>Provenance</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getQuestionnaireResponse <em>Questionnaire Response</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getRegulatedAuthorization <em>Regulated Authorization</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getRelatedPerson <em>Related Person</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getRequestOrchestration <em>Request Orchestration</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getResearchStudy <em>Research Study</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getResearchSubject <em>Research Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getRiskAssessment <em>Risk Assessment</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSearchParameter <em>Search Parameter</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getServiceRequest <em>Service Request</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSlot <em>Slot</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSpecimenDefinition <em>Specimen Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getStructureDefinition <em>Structure Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getStructureMap <em>Structure Map</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSubscription <em>Subscription</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSubscriptionStatus <em>Subscription Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSubscriptionTopic <em>Subscription Topic</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSubstance <em>Substance</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSubstanceDefinition <em>Substance Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSubstanceNucleicAcid <em>Substance Nucleic Acid</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSubstancePolymer <em>Substance Polymer</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSubstanceProtein <em>Substance Protein</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSubstanceReferenceInformation <em>Substance Reference Information</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSubstanceSourceMaterial <em>Substance Source Material</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSupplyDelivery <em>Supply Delivery</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getSupplyRequest <em>Supply Request</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getTask <em>Task</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getTerminologyCapabilities <em>Terminology Capabilities</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getTestPlan <em>Test Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getTestReport <em>Test Report</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getTestScript <em>Test Script</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getTransport <em>Transport</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getVerificationResult <em>Verification Result</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getVisionPrescription <em>Vision Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.ResourceContainer#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getResourceContainer()
 * @model extendedMetaData="name='ResourceContainer' kind='elementOnly'"
 * @generated
 */
public interface ResourceContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Account</em>' containment reference.
	 * @see #setAccount(Account)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Account()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Account' namespace='##targetNamespace'"
	 * @generated
	 */
	Account getAccount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getAccount <em>Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' containment reference.
	 * @see #getAccount()
	 * @generated
	 */
	void setAccount(Account value);

	/**
	 * Returns the value of the '<em><b>Activity Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Definition</em>' containment reference.
	 * @see #setActivityDefinition(ActivityDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ActivityDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ActivityDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ActivityDefinition getActivityDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getActivityDefinition <em>Activity Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Definition</em>' containment reference.
	 * @see #getActivityDefinition()
	 * @generated
	 */
	void setActivityDefinition(ActivityDefinition value);

	/**
	 * Returns the value of the '<em><b>Actor Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes an actor - a human or an application that plays a role in data exchange, and that may have obligations associated with the role the actor plays.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor Definition</em>' containment reference.
	 * @see #setActorDefinition(ActorDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ActorDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ActorDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ActorDefinition getActorDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getActorDefinition <em>Actor Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor Definition</em>' containment reference.
	 * @see #getActorDefinition()
	 * @generated
	 */
	void setActorDefinition(ActorDefinition value);

	/**
	 * Returns the value of the '<em><b>Administrable Product Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A medicinal product in the final form which is suitable for administering to a patient (after any mixing of multiple components, dissolution etc. has been performed).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Administrable Product Definition</em>' containment reference.
	 * @see #setAdministrableProductDefinition(AdministrableProductDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_AdministrableProductDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdministrableProductDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	AdministrableProductDefinition getAdministrableProductDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getAdministrableProductDefinition <em>Administrable Product Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administrable Product Definition</em>' containment reference.
	 * @see #getAdministrableProductDefinition()
	 * @generated
	 */
	void setAdministrableProductDefinition(AdministrableProductDefinition value);

	/**
	 * Returns the value of the '<em><b>Adverse Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An event (i.e. any change to current patient status) that may be related to unintended effects on a patient or research participant. The unintended effects may require additional monitoring, treatment, hospitalization, or may result in death. The AdverseEvent resource also extends to potential or avoided events that could have had such effects. There are two major domains where the AdverseEvent resource is expected to be used. One is in clinical care reported adverse events and the other is in reporting adverse events in clinical  research trial management. Adverse events can be reported by healthcare providers, patients, caregivers or by medical products manufacturers. Given the differences between these two concepts, we recommend consulting the domain specific implementation guides when implementing the AdverseEvent Resource. The implementation guides include specific extensions, value sets and constraints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adverse Event</em>' containment reference.
	 * @see #setAdverseEvent(AdverseEvent)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_AdverseEvent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdverseEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	AdverseEvent getAdverseEvent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getAdverseEvent <em>Adverse Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adverse Event</em>' containment reference.
	 * @see #getAdverseEvent()
	 * @generated
	 */
	void setAdverseEvent(AdverseEvent value);

	/**
	 * Returns the value of the '<em><b>Allergy Intolerance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Risk of harmful or undesirable physiological response which is specific to an individual and associated with exposure to a substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allergy Intolerance</em>' containment reference.
	 * @see #setAllergyIntolerance(AllergyIntolerance)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_AllergyIntolerance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AllergyIntolerance' namespace='##targetNamespace'"
	 * @generated
	 */
	AllergyIntolerance getAllergyIntolerance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getAllergyIntolerance <em>Allergy Intolerance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allergy Intolerance</em>' containment reference.
	 * @see #getAllergyIntolerance()
	 * @generated
	 */
	void setAllergyIntolerance(AllergyIntolerance value);

	/**
	 * Returns the value of the '<em><b>Appointment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Appointment</em>' containment reference.
	 * @see #setAppointment(Appointment)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Appointment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Appointment' namespace='##targetNamespace'"
	 * @generated
	 */
	Appointment getAppointment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getAppointment <em>Appointment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment</em>' containment reference.
	 * @see #getAppointment()
	 * @generated
	 */
	void setAppointment(Appointment value);

	/**
	 * Returns the value of the '<em><b>Appointment Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Appointment Response</em>' containment reference.
	 * @see #setAppointmentResponse(AppointmentResponse)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_AppointmentResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AppointmentResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	AppointmentResponse getAppointmentResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getAppointmentResponse <em>Appointment Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment Response</em>' containment reference.
	 * @see #getAppointmentResponse()
	 * @generated
	 */
	void setAppointmentResponse(AppointmentResponse value);

	/**
	 * Returns the value of the '<em><b>Artifact Assessment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This Resource provides one or more comments, classifiers or ratings about a Resource and supports attribution and rights management metadata for the added content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifact Assessment</em>' containment reference.
	 * @see #setArtifactAssessment(ArtifactAssessment)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ArtifactAssessment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ArtifactAssessment' namespace='##targetNamespace'"
	 * @generated
	 */
	ArtifactAssessment getArtifactAssessment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getArtifactAssessment <em>Artifact Assessment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Assessment</em>' containment reference.
	 * @see #getArtifactAssessment()
	 * @generated
	 */
	void setArtifactAssessment(ArtifactAssessment value);

	/**
	 * Returns the value of the '<em><b>Audit Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of an event relevant for purposes such as operations, privacy, security, maintenance, and performance analysis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audit Event</em>' containment reference.
	 * @see #setAuditEvent(AuditEvent)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_AuditEvent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AuditEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditEvent getAuditEvent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getAuditEvent <em>Audit Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audit Event</em>' containment reference.
	 * @see #getAuditEvent()
	 * @generated
	 */
	void setAuditEvent(AuditEvent value);

	/**
	 * Returns the value of the '<em><b>Basic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basic</em>' containment reference.
	 * @see #setBasic(Basic)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Basic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Basic' namespace='##targetNamespace'"
	 * @generated
	 */
	Basic getBasic();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getBasic <em>Basic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic</em>' containment reference.
	 * @see #getBasic()
	 * @generated
	 */
	void setBasic(Basic value);

	/**
	 * Returns the value of the '<em><b>Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A resource that represents the data of a single raw artifact as digital content accessible in its native format.  A Binary resource can contain any content, whether text, image, pdf, zip archive, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary</em>' containment reference.
	 * @see #setBinary(Binary)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Binary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Binary' namespace='##targetNamespace'"
	 * @generated
	 */
	Binary getBinary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getBinary <em>Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary</em>' containment reference.
	 * @see #getBinary()
	 * @generated
	 */
	void setBinary(Binary value);

	/**
	 * Returns the value of the '<em><b>Biologically Derived Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource reflects an instance of a biologically derived product. A material substance originating from a biological entity intended to be transplanted or infused
	 * into another (possibly the same) biological entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Biologically Derived Product</em>' containment reference.
	 * @see #setBiologicallyDerivedProduct(BiologicallyDerivedProduct)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_BiologicallyDerivedProduct()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BiologicallyDerivedProduct' namespace='##targetNamespace'"
	 * @generated
	 */
	BiologicallyDerivedProduct getBiologicallyDerivedProduct();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getBiologicallyDerivedProduct <em>Biologically Derived Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Biologically Derived Product</em>' containment reference.
	 * @see #getBiologicallyDerivedProduct()
	 * @generated
	 */
	void setBiologicallyDerivedProduct(BiologicallyDerivedProduct value);

	/**
	 * Returns the value of the '<em><b>Biologically Derived Product Dispense</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource reflects an instance of a biologically derived product dispense. The supply or dispense of a biologically derived product from the supply organization or department (e.g. hospital transfusion laboratory) to the clinical team responsible for clinical application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Biologically Derived Product Dispense</em>' containment reference.
	 * @see #setBiologicallyDerivedProductDispense(BiologicallyDerivedProductDispense)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_BiologicallyDerivedProductDispense()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BiologicallyDerivedProductDispense' namespace='##targetNamespace'"
	 * @generated
	 */
	BiologicallyDerivedProductDispense getBiologicallyDerivedProductDispense();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getBiologicallyDerivedProductDispense <em>Biologically Derived Product Dispense</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Biologically Derived Product Dispense</em>' containment reference.
	 * @see #getBiologicallyDerivedProductDispense()
	 * @generated
	 */
	void setBiologicallyDerivedProductDispense(BiologicallyDerivedProductDispense value);

	/**
	 * Returns the value of the '<em><b>Body Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Record details about an anatomical structure.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Structure</em>' containment reference.
	 * @see #setBodyStructure(BodyStructure)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_BodyStructure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BodyStructure' namespace='##targetNamespace'"
	 * @generated
	 */
	BodyStructure getBodyStructure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getBodyStructure <em>Body Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Structure</em>' containment reference.
	 * @see #getBodyStructure()
	 * @generated
	 */
	void setBodyStructure(BodyStructure value);

	/**
	 * Returns the value of the '<em><b>Bundle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for a collection of resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bundle</em>' containment reference.
	 * @see #setBundle(Bundle)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Bundle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bundle' namespace='##targetNamespace'"
	 * @generated
	 */
	Bundle getBundle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getBundle <em>Bundle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle</em>' containment reference.
	 * @see #getBundle()
	 * @generated
	 */
	void setBundle(Bundle value);

	/**
	 * Returns the value of the '<em><b>Capability Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server or Client for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Statement</em>' containment reference.
	 * @see #setCapabilityStatement(CapabilityStatement)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_CapabilityStatement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CapabilityStatement' namespace='##targetNamespace'"
	 * @generated
	 */
	CapabilityStatement getCapabilityStatement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getCapabilityStatement <em>Capability Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Statement</em>' containment reference.
	 * @see #getCapabilityStatement()
	 * @generated
	 */
	void setCapabilityStatement(CapabilityStatement value);

	/**
	 * Returns the value of the '<em><b>Care Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Care Plan</em>' containment reference.
	 * @see #setCarePlan(CarePlan)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_CarePlan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CarePlan' namespace='##targetNamespace'"
	 * @generated
	 */
	CarePlan getCarePlan();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getCarePlan <em>Care Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Care Plan</em>' containment reference.
	 * @see #getCarePlan()
	 * @generated
	 */
	void setCarePlan(CarePlan value);

	/**
	 * Returns the value of the '<em><b>Care Team</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Care Team</em>' containment reference.
	 * @see #setCareTeam(CareTeam)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_CareTeam()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CareTeam' namespace='##targetNamespace'"
	 * @generated
	 */
	CareTeam getCareTeam();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getCareTeam <em>Care Team</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Care Team</em>' containment reference.
	 * @see #getCareTeam()
	 * @generated
	 */
	void setCareTeam(CareTeam value);

	/**
	 * Returns the value of the '<em><b>Charge Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Charge Item</em>' containment reference.
	 * @see #setChargeItem(ChargeItem)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ChargeItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChargeItem' namespace='##targetNamespace'"
	 * @generated
	 */
	ChargeItem getChargeItem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getChargeItem <em>Charge Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Item</em>' containment reference.
	 * @see #getChargeItem()
	 * @generated
	 */
	void setChargeItem(ChargeItem value);

	/**
	 * Returns the value of the '<em><b>Charge Item Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate costs and prices. The properties may differ largely depending on type and realm, therefore this resource gives only a rough structure and requires profiling for each type of billing code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Charge Item Definition</em>' containment reference.
	 * @see #setChargeItemDefinition(ChargeItemDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ChargeItemDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChargeItemDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ChargeItemDefinition getChargeItemDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getChargeItemDefinition <em>Charge Item Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Item Definition</em>' containment reference.
	 * @see #getChargeItemDefinition()
	 * @generated
	 */
	void setChargeItemDefinition(ChargeItemDefinition value);

	/**
	 * Returns the value of the '<em><b>Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Citation Resource enables reference to any knowledge artifact for purposes of identification and attribution. The Citation Resource supports existing reference structures and developing publication practices such as versioning, expressing complex contributorship roles, and referencing computable resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Citation</em>' containment reference.
	 * @see #setCitation(Citation)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Citation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Citation' namespace='##targetNamespace'"
	 * @generated
	 */
	Citation getCitation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getCitation <em>Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citation</em>' containment reference.
	 * @see #getCitation()
	 * @generated
	 */
	void setCitation(Citation value);

	/**
	 * Returns the value of the '<em><b>Claim</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim</em>' containment reference.
	 * @see #setClaim(Claim)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Claim()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Claim' namespace='##targetNamespace'"
	 * @generated
	 */
	Claim getClaim();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getClaim <em>Claim</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim</em>' containment reference.
	 * @see #getClaim()
	 * @generated
	 */
	void setClaim(Claim value);

	/**
	 * Returns the value of the '<em><b>Claim Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource provides the adjudication details from the processing of a Claim resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim Response</em>' containment reference.
	 * @see #setClaimResponse(ClaimResponse)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ClaimResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ClaimResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ClaimResponse getClaimResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getClaimResponse <em>Claim Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Response</em>' containment reference.
	 * @see #getClaimResponse()
	 * @generated
	 */
	void setClaimResponse(ClaimResponse value);

	/**
	 * Returns the value of the '<em><b>Clinical Impression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clinical Impression</em>' containment reference.
	 * @see #setClinicalImpression(ClinicalImpression)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ClinicalImpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ClinicalImpression' namespace='##targetNamespace'"
	 * @generated
	 */
	ClinicalImpression getClinicalImpression();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getClinicalImpression <em>Clinical Impression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinical Impression</em>' containment reference.
	 * @see #getClinicalImpression()
	 * @generated
	 */
	void setClinicalImpression(ClinicalImpression value);

	/**
	 * Returns the value of the '<em><b>Clinical Use Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A single issue - either an indication, contraindication, interaction or an undesirable effect for a medicinal product, medication, device or procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clinical Use Definition</em>' containment reference.
	 * @see #setClinicalUseDefinition(ClinicalUseDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ClinicalUseDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ClinicalUseDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ClinicalUseDefinition getClinicalUseDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getClinicalUseDefinition <em>Clinical Use Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinical Use Definition</em>' containment reference.
	 * @see #getClinicalUseDefinition()
	 * @generated
	 */
	void setClinicalUseDefinition(ClinicalUseDefinition value);

	/**
	 * Returns the value of the '<em><b>Code System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code System</em>' containment reference.
	 * @see #setCodeSystem(CodeSystem)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_CodeSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CodeSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystem getCodeSystem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getCodeSystem <em>Code System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code System</em>' containment reference.
	 * @see #getCodeSystem()
	 * @generated
	 */
	void setCodeSystem(CodeSystem value);

	/**
	 * Returns the value of the '<em><b>Communication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A clinical or business level record of information being transmitted or shared; e.g. an alert that was sent to a responsible provider, a public health agency communication to a provider/reporter in response to a case report for a reportable condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication</em>' containment reference.
	 * @see #setCommunication(Communication)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Communication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Communication' namespace='##targetNamespace'"
	 * @generated
	 */
	Communication getCommunication();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getCommunication <em>Communication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication</em>' containment reference.
	 * @see #getCommunication()
	 * @generated
	 */
	void setCommunication(Communication value);

	/**
	 * Returns the value of the '<em><b>Communication Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication Request</em>' containment reference.
	 * @see #setCommunicationRequest(CommunicationRequest)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_CommunicationRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CommunicationRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	CommunicationRequest getCommunicationRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getCommunicationRequest <em>Communication Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Request</em>' containment reference.
	 * @see #getCommunicationRequest()
	 * @generated
	 */
	void setCommunicationRequest(CommunicationRequest value);

	/**
	 * Returns the value of the '<em><b>Compartment Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A compartment definition that defines how resources are accessed on a server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compartment Definition</em>' containment reference.
	 * @see #setCompartmentDefinition(CompartmentDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_CompartmentDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CompartmentDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	CompartmentDefinition getCompartmentDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getCompartmentDefinition <em>Compartment Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartment Definition</em>' containment reference.
	 * @see #getCompartmentDefinition()
	 * @generated
	 */
	void setCompartmentDefinition(CompartmentDefinition value);

	/**
	 * Returns the value of the '<em><b>Composition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Composition</em>' containment reference.
	 * @see #setComposition(Composition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Composition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Composition' namespace='##targetNamespace'"
	 * @generated
	 */
	Composition getComposition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getComposition <em>Composition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composition</em>' containment reference.
	 * @see #getComposition()
	 * @generated
	 */
	void setComposition(Composition value);

	/**
	 * Returns the value of the '<em><b>Concept Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept Map</em>' containment reference.
	 * @see #setConceptMap(ConceptMap)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ConceptMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConceptMap' namespace='##targetNamespace'"
	 * @generated
	 */
	ConceptMap getConceptMap();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getConceptMap <em>Concept Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept Map</em>' containment reference.
	 * @see #getConceptMap()
	 * @generated
	 */
	void setConceptMap(ConceptMap value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Condition' namespace='##targetNamespace'"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Condition Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A definition of a condition and information relevant to managing it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition Definition</em>' containment reference.
	 * @see #setConditionDefinition(ConditionDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ConditionDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConditionDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ConditionDefinition getConditionDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getConditionDefinition <em>Condition Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Definition</em>' containment reference.
	 * @see #getConditionDefinition()
	 * @generated
	 */
	void setConditionDefinition(ConditionDefinition value);

	/**
	 * Returns the value of the '<em><b>Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of a healthcare consumer’s  choices  or choices made on their behalf by a third party, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consent</em>' containment reference.
	 * @see #setConsent(Consent)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Consent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Consent' namespace='##targetNamespace'"
	 * @generated
	 */
	Consent getConsent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getConsent <em>Consent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consent</em>' containment reference.
	 * @see #getConsent()
	 * @generated
	 */
	void setConsent(Consent value);

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference.
	 * @see #setContract(Contract)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Contract()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Contract' namespace='##targetNamespace'"
	 * @generated
	 */
	Contract getContract();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getContract <em>Contract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' containment reference.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(Contract value);

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference.
	 * @see #setCoverage(Coverage)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Coverage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	Coverage getCoverage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(Coverage value);

	/**
	 * Returns the value of the '<em><b>Coverage Eligibility Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage Eligibility Request</em>' containment reference.
	 * @see #setCoverageEligibilityRequest(CoverageEligibilityRequest)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_CoverageEligibilityRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CoverageEligibilityRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	CoverageEligibilityRequest getCoverageEligibilityRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getCoverageEligibilityRequest <em>Coverage Eligibility Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Eligibility Request</em>' containment reference.
	 * @see #getCoverageEligibilityRequest()
	 * @generated
	 */
	void setCoverageEligibilityRequest(CoverageEligibilityRequest value);

	/**
	 * Returns the value of the '<em><b>Coverage Eligibility Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage Eligibility Response</em>' containment reference.
	 * @see #setCoverageEligibilityResponse(CoverageEligibilityResponse)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_CoverageEligibilityResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CoverageEligibilityResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	CoverageEligibilityResponse getCoverageEligibilityResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getCoverageEligibilityResponse <em>Coverage Eligibility Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Eligibility Response</em>' containment reference.
	 * @see #getCoverageEligibilityResponse()
	 * @generated
	 */
	void setCoverageEligibilityResponse(CoverageEligibilityResponse value);

	/**
	 * Returns the value of the '<em><b>Detected Issue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, gaps in care, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detected Issue</em>' containment reference.
	 * @see #setDetectedIssue(DetectedIssue)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_DetectedIssue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DetectedIssue' namespace='##targetNamespace'"
	 * @generated
	 */
	DetectedIssue getDetectedIssue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getDetectedIssue <em>Detected Issue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detected Issue</em>' containment reference.
	 * @see #getDetectedIssue()
	 * @generated
	 */
	void setDetectedIssue(DetectedIssue value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(Device)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Device()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Device' namespace='##targetNamespace'"
	 * @generated
	 */
	Device getDevice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getDevice <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' containment reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Device value);

	/**
	 * Returns the value of the '<em><b>Device Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of association or dissociation of a device with a patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Association</em>' containment reference.
	 * @see #setDeviceAssociation(DeviceAssociation)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_DeviceAssociation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceAssociation' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceAssociation getDeviceAssociation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getDeviceAssociation <em>Device Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Association</em>' containment reference.
	 * @see #getDeviceAssociation()
	 * @generated
	 */
	void setDeviceAssociation(DeviceAssociation value);

	/**
	 * Returns the value of the '<em><b>Device Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The characteristics, operational status and capabilities of a medical-related component of a medical device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Definition</em>' containment reference.
	 * @see #setDeviceDefinition(DeviceDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_DeviceDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceDefinition getDeviceDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getDeviceDefinition <em>Device Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Definition</em>' containment reference.
	 * @see #getDeviceDefinition()
	 * @generated
	 */
	void setDeviceDefinition(DeviceDefinition value);

	/**
	 * Returns the value of the '<em><b>Device Dispense</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of dispensation of a device - i.e., assigning a device to a patient, or to a professional for their use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Dispense</em>' containment reference.
	 * @see #setDeviceDispense(DeviceDispense)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_DeviceDispense()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceDispense' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceDispense getDeviceDispense();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getDeviceDispense <em>Device Dispense</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Dispense</em>' containment reference.
	 * @see #getDeviceDispense()
	 * @generated
	 */
	void setDeviceDispense(DeviceDispense value);

	/**
	 * Returns the value of the '<em><b>Device Metric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes a measurement, calculation or setting capability of a device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Metric</em>' containment reference.
	 * @see #setDeviceMetric(DeviceMetric)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_DeviceMetric()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceMetric' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceMetric getDeviceMetric();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getDeviceMetric <em>Device Metric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Metric</em>' containment reference.
	 * @see #getDeviceMetric()
	 * @generated
	 */
	void setDeviceMetric(DeviceMetric value);

	/**
	 * Returns the value of the '<em><b>Device Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Request</em>' containment reference.
	 * @see #setDeviceRequest(DeviceRequest)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_DeviceRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceRequest getDeviceRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getDeviceRequest <em>Device Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Request</em>' containment reference.
	 * @see #getDeviceRequest()
	 * @generated
	 */
	void setDeviceRequest(DeviceRequest value);

	/**
	 * Returns the value of the '<em><b>Device Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of a device being used by a patient where the record is the result of a report from the patient or a clinician.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Usage</em>' containment reference.
	 * @see #setDeviceUsage(DeviceUsage)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_DeviceUsage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceUsage' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceUsage getDeviceUsage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getDeviceUsage <em>Device Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Usage</em>' containment reference.
	 * @see #getDeviceUsage()
	 * @generated
	 */
	void setDeviceUsage(DeviceUsage value);

	/**
	 * Returns the value of the '<em><b>Diagnostic Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The findings and interpretation of diagnostic tests performed on patients, groups of patients, products, substances, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports. The report also includes non-clinical context such as batch analysis and stability reporting of products and substances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnostic Report</em>' containment reference.
	 * @see #setDiagnosticReport(DiagnosticReport)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_DiagnosticReport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DiagnosticReport' namespace='##targetNamespace'"
	 * @generated
	 */
	DiagnosticReport getDiagnosticReport();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getDiagnosticReport <em>Diagnostic Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostic Report</em>' containment reference.
	 * @see #getDiagnosticReport()
	 * @generated
	 */
	void setDiagnosticReport(DiagnosticReport value);

	/**
	 * Returns the value of the '<em><b>Document Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a document of any kind for any purpose. While the term “document” implies a more narrow focus, for this resource this "document" encompasses *any* serialized object with a mime-type, it includes formal patient-centric documents (CDA), clinical notes, scanned paper, non-patient specific documents like policy text, as well as a photo, video, or audio recording acquired or used in healthcare.  The DocumentReference resource provides metadata about the document so that the document can be discovered and managed.  The actual content may be inline base64 encoded data or provided by direct reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Reference</em>' containment reference.
	 * @see #setDocumentReference(DocumentReference)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_DocumentReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentReference' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentReference getDocumentReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getDocumentReference <em>Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Reference</em>' containment reference.
	 * @see #getDocumentReference()
	 * @generated
	 */
	void setDocumentReference(DocumentReference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.  Encounter is primarily used to record information about the actual activities that occurred, where Appointment is used to record planned activities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Encounter)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Encounter getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Encounter value);

	/**
	 * Returns the value of the '<em><b>Encounter History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of significant events/milestones key data throughout the history of an Encounter, often tracked for specific purposes such as billing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter History</em>' containment reference.
	 * @see #setEncounterHistory(EncounterHistory)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_EncounterHistory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EncounterHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	EncounterHistory getEncounterHistory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getEncounterHistory <em>Encounter History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter History</em>' containment reference.
	 * @see #getEncounterHistory()
	 * @generated
	 */
	void setEncounterHistory(EncounterHistory value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b, a REST endpoint for another FHIR server, or a s/Mime email address. This may include any security context information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference.
	 * @see #setEndpoint(Endpoint)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Endpoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	Endpoint getEndpoint();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getEndpoint <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' containment reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(Endpoint value);

	/**
	 * Returns the value of the '<em><b>Enrollment Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource provides the insurance enrollment details to the insurer regarding a specified coverage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enrollment Request</em>' containment reference.
	 * @see #setEnrollmentRequest(EnrollmentRequest)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_EnrollmentRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EnrollmentRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	EnrollmentRequest getEnrollmentRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getEnrollmentRequest <em>Enrollment Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enrollment Request</em>' containment reference.
	 * @see #getEnrollmentRequest()
	 * @generated
	 */
	void setEnrollmentRequest(EnrollmentRequest value);

	/**
	 * Returns the value of the '<em><b>Enrollment Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource provides enrollment and plan details from the processing of an EnrollmentRequest resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enrollment Response</em>' containment reference.
	 * @see #setEnrollmentResponse(EnrollmentResponse)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_EnrollmentResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EnrollmentResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	EnrollmentResponse getEnrollmentResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getEnrollmentResponse <em>Enrollment Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enrollment Response</em>' containment reference.
	 * @see #getEnrollmentResponse()
	 * @generated
	 */
	void setEnrollmentResponse(EnrollmentResponse value);

	/**
	 * Returns the value of the '<em><b>Episode Of Care</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Episode Of Care</em>' containment reference.
	 * @see #setEpisodeOfCare(EpisodeOfCare)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_EpisodeOfCare()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EpisodeOfCare' namespace='##targetNamespace'"
	 * @generated
	 */
	EpisodeOfCare getEpisodeOfCare();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getEpisodeOfCare <em>Episode Of Care</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Episode Of Care</em>' containment reference.
	 * @see #getEpisodeOfCare()
	 * @generated
	 */
	void setEpisodeOfCare(EpisodeOfCare value);

	/**
	 * Returns the value of the '<em><b>Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The EventDefinition resource provides a reusable description of when a particular event can occur.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Definition</em>' containment reference.
	 * @see #setEventDefinition(EventDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_EventDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EventDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EventDefinition getEventDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getEventDefinition <em>Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Definition</em>' containment reference.
	 * @see #getEventDefinition()
	 * @generated
	 */
	void setEventDefinition(EventDefinition value);

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Evidence Resource provides a machine-interpretable expression of an evidence concept including the evidence variables (e.g., population, exposures/interventions, comparators, outcomes, measured variables, confounding variables), the statistics, and the certainty of this evidence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evidence</em>' containment reference.
	 * @see #setEvidence(Evidence)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Evidence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Evidence' namespace='##targetNamespace'"
	 * @generated
	 */
	Evidence getEvidence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getEvidence <em>Evidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evidence</em>' containment reference.
	 * @see #getEvidence()
	 * @generated
	 */
	void setEvidence(Evidence value);

	/**
	 * Returns the value of the '<em><b>Evidence Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The EvidenceReport Resource is a specialized container for a collection of resources and codeable concepts, adapted to support compositions of Evidence, EvidenceVariable, and Citation resources and related concepts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evidence Report</em>' containment reference.
	 * @see #setEvidenceReport(EvidenceReport)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_EvidenceReport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EvidenceReport' namespace='##targetNamespace'"
	 * @generated
	 */
	EvidenceReport getEvidenceReport();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getEvidenceReport <em>Evidence Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evidence Report</em>' containment reference.
	 * @see #getEvidenceReport()
	 * @generated
	 */
	void setEvidenceReport(EvidenceReport value);

	/**
	 * Returns the value of the '<em><b>Evidence Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The EvidenceVariable resource describes an element that knowledge (Evidence) is about.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evidence Variable</em>' containment reference.
	 * @see #setEvidenceVariable(EvidenceVariable)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_EvidenceVariable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EvidenceVariable' namespace='##targetNamespace'"
	 * @generated
	 */
	EvidenceVariable getEvidenceVariable();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getEvidenceVariable <em>Evidence Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evidence Variable</em>' containment reference.
	 * @see #getEvidenceVariable()
	 * @generated
	 */
	void setEvidenceVariable(EvidenceVariable value);

	/**
	 * Returns the value of the '<em><b>Example Scenario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Example of workflow instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Example Scenario</em>' containment reference.
	 * @see #setExampleScenario(ExampleScenario)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ExampleScenario()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExampleScenario' namespace='##targetNamespace'"
	 * @generated
	 */
	ExampleScenario getExampleScenario();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getExampleScenario <em>Example Scenario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Scenario</em>' containment reference.
	 * @see #getExampleScenario()
	 * @generated
	 */
	void setExampleScenario(ExampleScenario value);

	/**
	 * Returns the value of the '<em><b>Explanation Of Benefit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Explanation Of Benefit</em>' containment reference.
	 * @see #setExplanationOfBenefit(ExplanationOfBenefit)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ExplanationOfBenefit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExplanationOfBenefit' namespace='##targetNamespace'"
	 * @generated
	 */
	ExplanationOfBenefit getExplanationOfBenefit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getExplanationOfBenefit <em>Explanation Of Benefit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explanation Of Benefit</em>' containment reference.
	 * @see #getExplanationOfBenefit()
	 * @generated
	 */
	void setExplanationOfBenefit(ExplanationOfBenefit value);

	/**
	 * Returns the value of the '<em><b>Family Member History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Significant health conditions for a person related to the patient relevant in the context of care for the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Family Member History</em>' containment reference.
	 * @see #setFamilyMemberHistory(FamilyMemberHistory)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_FamilyMemberHistory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FamilyMemberHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	FamilyMemberHistory getFamilyMemberHistory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getFamilyMemberHistory <em>Family Member History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family Member History</em>' containment reference.
	 * @see #getFamilyMemberHistory()
	 * @generated
	 */
	void setFamilyMemberHistory(FamilyMemberHistory value);

	/**
	 * Returns the value of the '<em><b>Flag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prospective warnings of potential issues when providing care to the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flag</em>' containment reference.
	 * @see #setFlag(Flag)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Flag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Flag' namespace='##targetNamespace'"
	 * @generated
	 */
	Flag getFlag();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getFlag <em>Flag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flag</em>' containment reference.
	 * @see #getFlag()
	 * @generated
	 */
	void setFlag(Flag value);

	/**
	 * Returns the value of the '<em><b>Formulary Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource describes a product or service that is available through a program and includes the conditions and constraints of availability.  All of the information in this resource is specific to the inclusion of the item in the formulary and is not inherent to the item itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formulary Item</em>' containment reference.
	 * @see #setFormularyItem(FormularyItem)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_FormularyItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FormularyItem' namespace='##targetNamespace'"
	 * @generated
	 */
	FormularyItem getFormularyItem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getFormularyItem <em>Formulary Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formulary Item</em>' containment reference.
	 * @see #getFormularyItem()
	 * @generated
	 */
	void setFormularyItem(FormularyItem value);

	/**
	 * Returns the value of the '<em><b>Genomic Study</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A GenomicStudy is a set of analyses performed to analyze and generate genomic data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Genomic Study</em>' containment reference.
	 * @see #setGenomicStudy(GenomicStudy)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_GenomicStudy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GenomicStudy' namespace='##targetNamespace'"
	 * @generated
	 */
	GenomicStudy getGenomicStudy();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getGenomicStudy <em>Genomic Study</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genomic Study</em>' containment reference.
	 * @see #getGenomicStudy()
	 * @generated
	 */
	void setGenomicStudy(GenomicStudy value);

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Goal</em>' containment reference.
	 * @see #setGoal(Goal)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Goal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Goal' namespace='##targetNamespace'"
	 * @generated
	 */
	Goal getGoal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getGoal <em>Goal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' containment reference.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(Goal value);

	/**
	 * Returns the value of the '<em><b>Graph Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graph Definition</em>' containment reference.
	 * @see #setGraphDefinition(GraphDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_GraphDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GraphDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	GraphDefinition getGraphDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getGraphDefinition <em>Graph Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Definition</em>' containment reference.
	 * @see #getGraphDefinition()
	 * @generated
	 */
	void setGraphDefinition(GraphDefinition value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively, and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(Group)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Group' namespace='##targetNamespace'"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

	/**
	 * Returns the value of the '<em><b>Guidance Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guidance Response</em>' containment reference.
	 * @see #setGuidanceResponse(GuidanceResponse)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_GuidanceResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GuidanceResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GuidanceResponse getGuidanceResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getGuidanceResponse <em>Guidance Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guidance Response</em>' containment reference.
	 * @see #getGuidanceResponse()
	 * @generated
	 */
	void setGuidanceResponse(GuidanceResponse value);

	/**
	 * Returns the value of the '<em><b>Healthcare Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The details of a healthcare service available at a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Healthcare Service</em>' containment reference.
	 * @see #setHealthcareService(HealthcareService)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_HealthcareService()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HealthcareService' namespace='##targetNamespace'"
	 * @generated
	 */
	HealthcareService getHealthcareService();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getHealthcareService <em>Healthcare Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Healthcare Service</em>' containment reference.
	 * @see #getHealthcareService()
	 * @generated
	 */
	void setHealthcareService(HealthcareService value);

	/**
	 * Returns the value of the '<em><b>Imaging Selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A selection of DICOM SOP instances and/or frames within a single Study and Series. This might include additional specifics such as an image region, an Observation UID or a Segmentation Number, allowing linkage to an Observation Resource or transferring this information along with the ImagingStudy Resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imaging Selection</em>' containment reference.
	 * @see #setImagingSelection(ImagingSelection)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ImagingSelection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImagingSelection' namespace='##targetNamespace'"
	 * @generated
	 */
	ImagingSelection getImagingSelection();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getImagingSelection <em>Imaging Selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imaging Selection</em>' containment reference.
	 * @see #getImagingSelection()
	 * @generated
	 */
	void setImagingSelection(ImagingSelection value);

	/**
	 * Returns the value of the '<em><b>Imaging Study</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imaging Study</em>' containment reference.
	 * @see #setImagingStudy(ImagingStudy)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ImagingStudy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImagingStudy' namespace='##targetNamespace'"
	 * @generated
	 */
	ImagingStudy getImagingStudy();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getImagingStudy <em>Imaging Study</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imaging Study</em>' containment reference.
	 * @see #getImagingStudy()
	 * @generated
	 */
	void setImagingStudy(ImagingStudy value);

	/**
	 * Returns the value of the '<em><b>Immunization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Immunization</em>' containment reference.
	 * @see #setImmunization(Immunization)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Immunization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Immunization' namespace='##targetNamespace'"
	 * @generated
	 */
	Immunization getImmunization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getImmunization <em>Immunization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immunization</em>' containment reference.
	 * @see #getImmunization()
	 * @generated
	 */
	void setImmunization(Immunization value);

	/**
	 * Returns the value of the '<em><b>Immunization Evaluation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes a comparison of an immunization event against published recommendations to determine if the administration is "valid" in relation to those  recommendations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Immunization Evaluation</em>' containment reference.
	 * @see #setImmunizationEvaluation(ImmunizationEvaluation)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ImmunizationEvaluation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImmunizationEvaluation' namespace='##targetNamespace'"
	 * @generated
	 */
	ImmunizationEvaluation getImmunizationEvaluation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getImmunizationEvaluation <em>Immunization Evaluation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immunization Evaluation</em>' containment reference.
	 * @see #getImmunizationEvaluation()
	 * @generated
	 */
	void setImmunizationEvaluation(ImmunizationEvaluation value);

	/**
	 * Returns the value of the '<em><b>Immunization Recommendation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional supporting justification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Immunization Recommendation</em>' containment reference.
	 * @see #setImmunizationRecommendation(ImmunizationRecommendation)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ImmunizationRecommendation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImmunizationRecommendation' namespace='##targetNamespace'"
	 * @generated
	 */
	ImmunizationRecommendation getImmunizationRecommendation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getImmunizationRecommendation <em>Immunization Recommendation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immunization Recommendation</em>' containment reference.
	 * @see #getImmunizationRecommendation()
	 * @generated
	 */
	void setImmunizationRecommendation(ImmunizationRecommendation value);

	/**
	 * Returns the value of the '<em><b>Implementation Guide</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation Guide</em>' containment reference.
	 * @see #setImplementationGuide(ImplementationGuide)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ImplementationGuide()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImplementationGuide' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplementationGuide getImplementationGuide();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getImplementationGuide <em>Implementation Guide</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Guide</em>' containment reference.
	 * @see #getImplementationGuide()
	 * @generated
	 */
	void setImplementationGuide(ImplementationGuide value);

	/**
	 * Returns the value of the '<em><b>Ingredient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ingredient of a manufactured item or pharmaceutical product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ingredient</em>' containment reference.
	 * @see #setIngredient(Ingredient)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Ingredient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Ingredient' namespace='##targetNamespace'"
	 * @generated
	 */
	Ingredient getIngredient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getIngredient <em>Ingredient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ingredient</em>' containment reference.
	 * @see #getIngredient()
	 * @generated
	 */
	void setIngredient(Ingredient value);

	/**
	 * Returns the value of the '<em><b>Insurance Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details of a Health Insurance product/plan provided by an organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance Plan</em>' containment reference.
	 * @see #setInsurancePlan(InsurancePlan)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_InsurancePlan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InsurancePlan' namespace='##targetNamespace'"
	 * @generated
	 */
	InsurancePlan getInsurancePlan();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getInsurancePlan <em>Insurance Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurance Plan</em>' containment reference.
	 * @see #getInsurancePlan()
	 * @generated
	 */
	void setInsurancePlan(InsurancePlan value);

	/**
	 * Returns the value of the '<em><b>Inventory Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A functional description of an inventory item used in inventory and supply-related workflows.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inventory Item</em>' containment reference.
	 * @see #setInventoryItem(InventoryItem)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_InventoryItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InventoryItem' namespace='##targetNamespace'"
	 * @generated
	 */
	InventoryItem getInventoryItem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getInventoryItem <em>Inventory Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item</em>' containment reference.
	 * @see #getInventoryItem()
	 * @generated
	 */
	void setInventoryItem(InventoryItem value);

	/**
	 * Returns the value of the '<em><b>Inventory Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A report of inventory or stock items.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inventory Report</em>' containment reference.
	 * @see #setInventoryReport(InventoryReport)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_InventoryReport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InventoryReport' namespace='##targetNamespace'"
	 * @generated
	 */
	InventoryReport getInventoryReport();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getInventoryReport <em>Inventory Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Report</em>' containment reference.
	 * @see #getInventoryReport()
	 * @generated
	 */
	void setInventoryReport(InventoryReport value);

	/**
	 * Returns the value of the '<em><b>Invoice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice</em>' containment reference.
	 * @see #setInvoice(Invoice)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Invoice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Invoice' namespace='##targetNamespace'"
	 * @generated
	 */
	Invoice getInvoice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getInvoice <em>Invoice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice</em>' containment reference.
	 * @see #getInvoice()
	 * @generated
	 */
	void setInvoice(Invoice value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Library resource is a general-purpose container for knowledge asset definitions. It can be used to describe and expose existing knowledge assets such as logic libraries and information model descriptions, as well as to describe a collection of knowledge assets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Library</em>' containment reference.
	 * @see #setLibrary(Library)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Library()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Library' namespace='##targetNamespace'"
	 * @generated
	 */
	Library getLibrary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getLibrary <em>Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' containment reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(Library value);

	/**
	 * Returns the value of the '<em><b>Linkage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies two or more records (resource instances) that refer to the same real-world "occurrence".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linkage</em>' containment reference.
	 * @see #setLinkage(Linkage)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Linkage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Linkage' namespace='##targetNamespace'"
	 * @generated
	 */
	Linkage getLinkage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getLinkage <em>Linkage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linkage</em>' containment reference.
	 * @see #getLinkage()
	 * @generated
	 */
	void setLinkage(Linkage value);

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A List is a curated collection of resources, for things such as problem lists, allergy lists, facility list, organization list, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(List)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_List()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='List' namespace='##targetNamespace'"
	 * @generated
	 */
	List getList();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(List value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details and position information for a place where services are provided and resources and participants may be stored, found, contained, or accommodated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Location' namespace='##targetNamespace'"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Manufactured Item Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The definition and characteristics of a medicinal manufactured item, such as a tablet or capsule, as contained in a packaged medicinal product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufactured Item Definition</em>' containment reference.
	 * @see #setManufacturedItemDefinition(ManufacturedItemDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ManufacturedItemDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ManufacturedItemDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ManufacturedItemDefinition getManufacturedItemDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getManufacturedItemDefinition <em>Manufactured Item Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufactured Item Definition</em>' containment reference.
	 * @see #getManufacturedItemDefinition()
	 * @generated
	 */
	void setManufacturedItemDefinition(ManufacturedItemDefinition value);

	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Measure resource provides the definition of a quality measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference.
	 * @see #setMeasure(Measure)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Measure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Measure' namespace='##targetNamespace'"
	 * @generated
	 */
	Measure getMeasure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMeasure <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' containment reference.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(Measure value);

	/**
	 * Returns the value of the '<em><b>Measure Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure Report</em>' containment reference.
	 * @see #setMeasureReport(MeasureReport)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MeasureReport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MeasureReport' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureReport getMeasureReport();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMeasureReport <em>Measure Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Report</em>' containment reference.
	 * @see #getMeasureReport()
	 * @generated
	 */
	void setMeasureReport(MeasureReport value);

	/**
	 * Returns the value of the '<em><b>Medication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource is primarily used for the identification and definition of a medication, including ingredients, for the purposes of prescribing, dispensing, and administering a medication as well as for making statements about medication use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication</em>' containment reference.
	 * @see #setMedication(Medication)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Medication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Medication' namespace='##targetNamespace'"
	 * @generated
	 */
	Medication getMedication();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMedication <em>Medication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication</em>' containment reference.
	 * @see #getMedication()
	 * @generated
	 */
	void setMedication(Medication value);

	/**
	 * Returns the value of the '<em><b>Medication Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication Administration</em>' containment reference.
	 * @see #setMedicationAdministration(MedicationAdministration)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MedicationAdministration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicationAdministration' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationAdministration getMedicationAdministration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMedicationAdministration <em>Medication Administration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Administration</em>' containment reference.
	 * @see #getMedicationAdministration()
	 * @generated
	 */
	void setMedicationAdministration(MedicationAdministration value);

	/**
	 * Returns the value of the '<em><b>Medication Dispense</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication Dispense</em>' containment reference.
	 * @see #setMedicationDispense(MedicationDispense)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MedicationDispense()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicationDispense' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationDispense getMedicationDispense();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMedicationDispense <em>Medication Dispense</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Dispense</em>' containment reference.
	 * @see #getMedicationDispense()
	 * @generated
	 */
	void setMedicationDispense(MedicationDispense value);

	/**
	 * Returns the value of the '<em><b>Medication Knowledge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about a medication that is used to support knowledge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication Knowledge</em>' containment reference.
	 * @see #setMedicationKnowledge(MedicationKnowledge)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MedicationKnowledge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicationKnowledge' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationKnowledge getMedicationKnowledge();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMedicationKnowledge <em>Medication Knowledge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Knowledge</em>' containment reference.
	 * @see #getMedicationKnowledge()
	 * @generated
	 */
	void setMedicationKnowledge(MedicationKnowledge value);

	/**
	 * Returns the value of the '<em><b>Medication Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication Request</em>' containment reference.
	 * @see #setMedicationRequest(MedicationRequest)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MedicationRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicationRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationRequest getMedicationRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMedicationRequest <em>Medication Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Request</em>' containment reference.
	 * @see #getMedicationRequest()
	 * @generated
	 */
	void setMedicationRequest(MedicationRequest value);

	/**
	 * Returns the value of the '<em><b>Medication Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of a medication that is being consumed by a patient.   A MedicationStatement may indicate that the patient may be taking the medication now or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from sources such as the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains. 
	 * 
	 * The primary difference between a medicationstatement and a medicationadministration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medicationstatement is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the Medication Statement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information.
	 * 
	 * The MedicationStatement resource was previously called MedicationStatement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication Statement</em>' containment reference.
	 * @see #setMedicationStatement(MedicationStatement)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MedicationStatement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicationStatement' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationStatement getMedicationStatement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMedicationStatement <em>Medication Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Statement</em>' containment reference.
	 * @see #getMedicationStatement()
	 * @generated
	 */
	void setMedicationStatement(MedicationStatement value);

	/**
	 * Returns the value of the '<em><b>Medicinal Product Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A medicinal product, being a substance or combination of substances that is intended to treat, prevent or diagnose a disease, or to restore, correct or modify physiological functions by exerting a pharmacological, immunological or metabolic action. This resource is intended to define and detail such products and their properties, for uses other than direct patient care (e.g. regulatory use, or drug catalogs).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medicinal Product Definition</em>' containment reference.
	 * @see #setMedicinalProductDefinition(MedicinalProductDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MedicinalProductDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicinalProductDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicinalProductDefinition getMedicinalProductDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMedicinalProductDefinition <em>Medicinal Product Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicinal Product Definition</em>' containment reference.
	 * @see #getMedicinalProductDefinition()
	 * @generated
	 */
	void setMedicinalProductDefinition(MedicinalProductDefinition value);

	/**
	 * Returns the value of the '<em><b>Message Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Definition</em>' containment reference.
	 * @see #setMessageDefinition(MessageDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MessageDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MessageDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageDefinition getMessageDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMessageDefinition <em>Message Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Definition</em>' containment reference.
	 * @see #getMessageDefinition()
	 * @generated
	 */
	void setMessageDefinition(MessageDefinition value);

	/**
	 * Returns the value of the '<em><b>Message Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Header</em>' containment reference.
	 * @see #setMessageHeader(MessageHeader)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MessageHeader()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MessageHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageHeader getMessageHeader();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMessageHeader <em>Message Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Header</em>' containment reference.
	 * @see #getMessageHeader()
	 * @generated
	 */
	void setMessageHeader(MessageHeader value);

	/**
	 * Returns the value of the '<em><b>Molecular Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Representation of a molecular sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Molecular Sequence</em>' containment reference.
	 * @see #setMolecularSequence(MolecularSequence)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_MolecularSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MolecularSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	MolecularSequence getMolecularSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getMolecularSequence <em>Molecular Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Molecular Sequence</em>' containment reference.
	 * @see #getMolecularSequence()
	 * @generated
	 */
	void setMolecularSequence(MolecularSequence value);

	/**
	 * Returns the value of the '<em><b>Naming System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a "System" used within the Identifier and Coding data types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Naming System</em>' containment reference.
	 * @see #setNamingSystem(NamingSystem)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_NamingSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NamingSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	NamingSystem getNamingSystem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getNamingSystem <em>Naming System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Naming System</em>' containment reference.
	 * @see #getNamingSystem()
	 * @generated
	 */
	void setNamingSystem(NamingSystem value);

	/**
	 * Returns the value of the '<em><b>Nutrition Intake</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of food or fluid that is being consumed by a patient.   A NutritionIntake may indicate that the patient may be consuming the food or fluid now or has consumed the food or fluid in the past.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay or through an app that tracks food or fluids consumed.   The consumption information may come from sources such as the patient's memory, from a nutrition label,  or from a clinician documenting observed intake.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nutrition Intake</em>' containment reference.
	 * @see #setNutritionIntake(NutritionIntake)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_NutritionIntake()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NutritionIntake' namespace='##targetNamespace'"
	 * @generated
	 */
	NutritionIntake getNutritionIntake();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getNutritionIntake <em>Nutrition Intake</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nutrition Intake</em>' containment reference.
	 * @see #getNutritionIntake()
	 * @generated
	 */
	void setNutritionIntake(NutritionIntake value);

	/**
	 * Returns the value of the '<em><b>Nutrition Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nutrition Order</em>' containment reference.
	 * @see #setNutritionOrder(NutritionOrder)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_NutritionOrder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NutritionOrder' namespace='##targetNamespace'"
	 * @generated
	 */
	NutritionOrder getNutritionOrder();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getNutritionOrder <em>Nutrition Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nutrition Order</em>' containment reference.
	 * @see #getNutritionOrder()
	 * @generated
	 */
	void setNutritionOrder(NutritionOrder value);

	/**
	 * Returns the value of the '<em><b>Nutrition Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A food or supplement that is consumed by patients.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nutrition Product</em>' containment reference.
	 * @see #setNutritionProduct(NutritionProduct)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_NutritionProduct()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NutritionProduct' namespace='##targetNamespace'"
	 * @generated
	 */
	NutritionProduct getNutritionProduct();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getNutritionProduct <em>Nutrition Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nutrition Product</em>' containment reference.
	 * @see #getNutritionProduct()
	 * @generated
	 */
	void setNutritionProduct(NutritionProduct value);

	/**
	 * Returns the value of the '<em><b>Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measurements and simple assertions made about a patient, device or other subject.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Observation</em>' containment reference.
	 * @see #setObservation(Observation)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Observation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Observation' namespace='##targetNamespace'"
	 * @generated
	 */
	Observation getObservation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getObservation <em>Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation</em>' containment reference.
	 * @see #getObservation()
	 * @generated
	 */
	void setObservation(Observation value);

	/**
	 * Returns the value of the '<em><b>Observation Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Observation Definition</em>' containment reference.
	 * @see #setObservationDefinition(ObservationDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ObservationDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ObservationDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ObservationDefinition getObservationDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getObservationDefinition <em>Observation Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation Definition</em>' containment reference.
	 * @see #getObservationDefinition()
	 * @generated
	 */
	void setObservationDefinition(ObservationDefinition value);

	/**
	 * Returns the value of the '<em><b>Operation Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Definition</em>' containment reference.
	 * @see #setOperationDefinition(OperationDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_OperationDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OperationDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationDefinition getOperationDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getOperationDefinition <em>Operation Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Definition</em>' containment reference.
	 * @see #getOperationDefinition()
	 * @generated
	 */
	void setOperationDefinition(OperationDefinition value);

	/**
	 * Returns the value of the '<em><b>Operation Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of error, warning, or information messages that result from a system action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Outcome</em>' containment reference.
	 * @see #setOperationOutcome(OperationOutcome)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_OperationOutcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OperationOutcome' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationOutcome getOperationOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getOperationOutcome <em>Operation Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Outcome</em>' containment reference.
	 * @see #getOperationOutcome()
	 * @generated
	 */
	void setOperationOutcome(OperationOutcome value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, payer/insurer, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(Organization)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Organization' namespace='##targetNamespace'"
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Organization Affiliation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines an affiliation/association/relationship between 2 distinct organizations, that is not a part-of relationship/sub-division relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Affiliation</em>' containment reference.
	 * @see #setOrganizationAffiliation(OrganizationAffiliation)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_OrganizationAffiliation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OrganizationAffiliation' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationAffiliation getOrganizationAffiliation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getOrganizationAffiliation <em>Organization Affiliation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Affiliation</em>' containment reference.
	 * @see #getOrganizationAffiliation()
	 * @generated
	 */
	void setOrganizationAffiliation(OrganizationAffiliation value);

	/**
	 * Returns the value of the '<em><b>Packaged Product Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A medically related item or items, in a container or package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packaged Product Definition</em>' containment reference.
	 * @see #setPackagedProductDefinition(PackagedProductDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_PackagedProductDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PackagedProductDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	PackagedProductDefinition getPackagedProductDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getPackagedProductDefinition <em>Packaged Product Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packaged Product Definition</em>' containment reference.
	 * @see #getPackagedProductDefinition()
	 * @generated
	 */
	void setPackagedProductDefinition(PackagedProductDefinition value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Patient)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Patient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Patient getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Patient value);

	/**
	 * Returns the value of the '<em><b>Payment Notice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource provides the status of the payment for goods and services rendered, and the request and response resource references.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Notice</em>' containment reference.
	 * @see #setPaymentNotice(PaymentNotice)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_PaymentNotice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PaymentNotice' namespace='##targetNamespace'"
	 * @generated
	 */
	PaymentNotice getPaymentNotice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getPaymentNotice <em>Payment Notice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Notice</em>' containment reference.
	 * @see #getPaymentNotice()
	 * @generated
	 */
	void setPaymentNotice(PaymentNotice value);

	/**
	 * Returns the value of the '<em><b>Payment Reconciliation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource provides the details including amount of a payment and allocates the payment items being paid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Reconciliation</em>' containment reference.
	 * @see #setPaymentReconciliation(PaymentReconciliation)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_PaymentReconciliation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PaymentReconciliation' namespace='##targetNamespace'"
	 * @generated
	 */
	PaymentReconciliation getPaymentReconciliation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getPaymentReconciliation <em>Payment Reconciliation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Reconciliation</em>' containment reference.
	 * @see #getPaymentReconciliation()
	 * @generated
	 */
	void setPaymentReconciliation(PaymentReconciliation value);

	/**
	 * Returns the value of the '<em><b>Permission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Permission resource holds access rules for a given data and context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Permission</em>' containment reference.
	 * @see #setPermission(Permission)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Permission()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Permission' namespace='##targetNamespace'"
	 * @generated
	 */
	Permission getPermission();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getPermission <em>Permission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission</em>' containment reference.
	 * @see #getPermission()
	 * @generated
	 */
	void setPermission(Permission value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Demographics and administrative information about a person independent of a specific health-related context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person</em>' containment reference.
	 * @see #setPerson(Person)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Person()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Person' namespace='##targetNamespace'"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getPerson <em>Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' containment reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

	/**
	 * Returns the value of the '<em><b>Plan Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical and non-clinical artifacts such as clinical decision support rules, order sets, protocols, and drug quality specifications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plan Definition</em>' containment reference.
	 * @see #setPlanDefinition(PlanDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_PlanDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PlanDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	PlanDefinition getPlanDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getPlanDefinition <em>Plan Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Definition</em>' containment reference.
	 * @see #getPlanDefinition()
	 * @generated
	 */
	void setPlanDefinition(PlanDefinition value);

	/**
	 * Returns the value of the '<em><b>Practitioner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person who is directly or indirectly involved in the provisioning of healthcare or related services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Practitioner</em>' containment reference.
	 * @see #setPractitioner(Practitioner)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Practitioner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Practitioner' namespace='##targetNamespace'"
	 * @generated
	 */
	Practitioner getPractitioner();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getPractitioner <em>Practitioner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Practitioner</em>' containment reference.
	 * @see #getPractitioner()
	 * @generated
	 */
	void setPractitioner(Practitioner value);

	/**
	 * Returns the value of the '<em><b>Practitioner Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Practitioner Role</em>' containment reference.
	 * @see #setPractitionerRole(PractitionerRole)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_PractitionerRole()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PractitionerRole' namespace='##targetNamespace'"
	 * @generated
	 */
	PractitionerRole getPractitionerRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getPractitionerRole <em>Practitioner Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Practitioner Role</em>' containment reference.
	 * @see #getPractitionerRole()
	 * @generated
	 */
	void setPractitionerRole(PractitionerRole value);

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An action that is or was performed on or for a patient, practitioner, device, organization, or location. For example, this can be a physical intervention on a patient like an operation, or less invasive like long term services, counseling, or hypnotherapy.  This can be a quality or safety inspection for a location, organization, or device.  This can be an accreditation procedure on a practitioner for licensing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference.
	 * @see #setProcedure(Procedure)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Procedure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Procedure' namespace='##targetNamespace'"
	 * @generated
	 */
	Procedure getProcedure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getProcedure <em>Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure</em>' containment reference.
	 * @see #getProcedure()
	 * @generated
	 */
	void setProcedure(Procedure value);

	/**
	 * Returns the value of the '<em><b>Provenance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provenance</em>' containment reference.
	 * @see #setProvenance(Provenance)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Provenance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Provenance' namespace='##targetNamespace'"
	 * @generated
	 */
	Provenance getProvenance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getProvenance <em>Provenance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provenance</em>' containment reference.
	 * @see #getProvenance()
	 * @generated
	 */
	void setProvenance(Provenance value);

	/**
	 * Returns the value of the '<em><b>Questionnaire</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Questionnaire</em>' containment reference.
	 * @see #setQuestionnaire(Questionnaire)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Questionnaire()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Questionnaire' namespace='##targetNamespace'"
	 * @generated
	 */
	Questionnaire getQuestionnaire();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getQuestionnaire <em>Questionnaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questionnaire</em>' containment reference.
	 * @see #getQuestionnaire()
	 * @generated
	 */
	void setQuestionnaire(Questionnaire value);

	/**
	 * Returns the value of the '<em><b>Questionnaire Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Questionnaire Response</em>' containment reference.
	 * @see #setQuestionnaireResponse(QuestionnaireResponse)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_QuestionnaireResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QuestionnaireResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	QuestionnaireResponse getQuestionnaireResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getQuestionnaireResponse <em>Questionnaire Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questionnaire Response</em>' containment reference.
	 * @see #getQuestionnaireResponse()
	 * @generated
	 */
	void setQuestionnaireResponse(QuestionnaireResponse value);

	/**
	 * Returns the value of the '<em><b>Regulated Authorization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Regulatory approval, clearance or licencing related to a regulated product, treatment, facility or activity that is cited in a guidance, regulation, rule or legislative act. An example is Market Authorization relating to a Medicinal Product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regulated Authorization</em>' containment reference.
	 * @see #setRegulatedAuthorization(RegulatedAuthorization)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_RegulatedAuthorization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RegulatedAuthorization' namespace='##targetNamespace'"
	 * @generated
	 */
	RegulatedAuthorization getRegulatedAuthorization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getRegulatedAuthorization <em>Regulated Authorization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulated Authorization</em>' containment reference.
	 * @see #getRegulatedAuthorization()
	 * @generated
	 */
	void setRegulatedAuthorization(RegulatedAuthorization value);

	/**
	 * Returns the value of the '<em><b>Related Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about a person that is involved in a patient's health or the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Person</em>' containment reference.
	 * @see #setRelatedPerson(RelatedPerson)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_RelatedPerson()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RelatedPerson' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedPerson getRelatedPerson();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getRelatedPerson <em>Related Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Person</em>' containment reference.
	 * @see #getRelatedPerson()
	 * @generated
	 */
	void setRelatedPerson(RelatedPerson value);

	/**
	 * Returns the value of the '<em><b>Request Orchestration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of related requests that can be used to capture intended activities that have inter-dependencies such as "give this medication after that one".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Orchestration</em>' containment reference.
	 * @see #setRequestOrchestration(RequestOrchestration)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_RequestOrchestration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RequestOrchestration' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestOrchestration getRequestOrchestration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getRequestOrchestration <em>Request Orchestration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Orchestration</em>' containment reference.
	 * @see #getRequestOrchestration()
	 * @generated
	 */
	void setRequestOrchestration(RequestOrchestration value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of requirements - a list of features or behaviors of designed systems that are necessary to achieve organizational or regulatory goals.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference.
	 * @see #setRequirements(Requirements)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Requirements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Requirements' namespace='##targetNamespace'"
	 * @generated
	 */
	Requirements getRequirements();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getRequirements <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' containment reference.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(Requirements value);

	/**
	 * Returns the value of the '<em><b>Research Study</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A scientific study of nature that sometimes includes processes involved in health and disease. For example, clinical trials are research studies that involve people. These studies may be related to new ways to screen, prevent, diagnose, and treat disease. They may also study certain outcomes and certain groups of people by looking at data collected in the past or future.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Research Study</em>' containment reference.
	 * @see #setResearchStudy(ResearchStudy)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ResearchStudy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ResearchStudy' namespace='##targetNamespace'"
	 * @generated
	 */
	ResearchStudy getResearchStudy();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getResearchStudy <em>Research Study</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Research Study</em>' containment reference.
	 * @see #getResearchStudy()
	 * @generated
	 */
	void setResearchStudy(ResearchStudy value);

	/**
	 * Returns the value of the '<em><b>Research Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A ResearchSubject is a participant or object which is the recipient of investigative activities in a research study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Research Subject</em>' containment reference.
	 * @see #setResearchSubject(ResearchSubject)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ResearchSubject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ResearchSubject' namespace='##targetNamespace'"
	 * @generated
	 */
	ResearchSubject getResearchSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getResearchSubject <em>Research Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Research Subject</em>' containment reference.
	 * @see #getResearchSubject()
	 * @generated
	 */
	void setResearchSubject(ResearchSubject value);

	/**
	 * Returns the value of the '<em><b>Risk Assessment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Risk Assessment</em>' containment reference.
	 * @see #setRiskAssessment(RiskAssessment)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_RiskAssessment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RiskAssessment' namespace='##targetNamespace'"
	 * @generated
	 */
	RiskAssessment getRiskAssessment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getRiskAssessment <em>Risk Assessment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Assessment</em>' containment reference.
	 * @see #getRiskAssessment()
	 * @generated
	 */
	void setRiskAssessment(RiskAssessment value);

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for slots of time that may be available for booking appointments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule</em>' containment reference.
	 * @see #setSchedule(Schedule)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Schedule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schedule' namespace='##targetNamespace'"
	 * @generated
	 */
	Schedule getSchedule();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSchedule <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' containment reference.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(Schedule value);

	/**
	 * Returns the value of the '<em><b>Search Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A search parameter that defines a named search item that can be used to search/filter on a resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Search Parameter</em>' containment reference.
	 * @see #setSearchParameter(SearchParameter)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_SearchParameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SearchParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	SearchParameter getSearchParameter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSearchParameter <em>Search Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Parameter</em>' containment reference.
	 * @see #getSearchParameter()
	 * @generated
	 */
	void setSearchParameter(SearchParameter value);

	/**
	 * Returns the value of the '<em><b>Service Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Request</em>' containment reference.
	 * @see #setServiceRequest(ServiceRequest)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ServiceRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ServiceRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceRequest getServiceRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getServiceRequest <em>Service Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Request</em>' containment reference.
	 * @see #getServiceRequest()
	 * @generated
	 */
	void setServiceRequest(ServiceRequest value);

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A slot of time on a schedule that may be available for booking appointments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference.
	 * @see #setSlot(Slot)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Slot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Slot' namespace='##targetNamespace'"
	 * @generated
	 */
	Slot getSlot();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSlot <em>Slot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot</em>' containment reference.
	 * @see #getSlot()
	 * @generated
	 */
	void setSlot(Slot value);

	/**
	 * Returns the value of the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A sample to be used for analysis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specimen</em>' containment reference.
	 * @see #setSpecimen(Specimen)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Specimen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Specimen' namespace='##targetNamespace'"
	 * @generated
	 */
	Specimen getSpecimen();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSpecimen <em>Specimen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specimen</em>' containment reference.
	 * @see #getSpecimen()
	 * @generated
	 */
	void setSpecimen(Specimen value);

	/**
	 * Returns the value of the '<em><b>Specimen Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A kind of specimen with associated set of requirements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specimen Definition</em>' containment reference.
	 * @see #setSpecimenDefinition(SpecimenDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_SpecimenDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SpecimenDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecimenDefinition getSpecimenDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSpecimenDefinition <em>Specimen Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specimen Definition</em>' containment reference.
	 * @see #getSpecimenDefinition()
	 * @generated
	 */
	void setSpecimenDefinition(SpecimenDefinition value);

	/**
	 * Returns the value of the '<em><b>Structure Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structure Definition</em>' containment reference.
	 * @see #setStructureDefinition(StructureDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_StructureDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StructureDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	StructureDefinition getStructureDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getStructureDefinition <em>Structure Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Definition</em>' containment reference.
	 * @see #getStructureDefinition()
	 * @generated
	 */
	void setStructureDefinition(StructureDefinition value);

	/**
	 * Returns the value of the '<em><b>Structure Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Map of relationships between 2 structures that can be used to transform data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structure Map</em>' containment reference.
	 * @see #setStructureMap(StructureMap)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_StructureMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StructureMap' namespace='##targetNamespace'"
	 * @generated
	 */
	StructureMap getStructureMap();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getStructureMap <em>Structure Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Map</em>' containment reference.
	 * @see #getStructureMap()
	 * @generated
	 */
	void setStructureMap(StructureMap value);

	/**
	 * Returns the value of the '<em><b>Subscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subscription resource describes a particular client's request to be notified about a SubscriptionTopic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscription</em>' containment reference.
	 * @see #setSubscription(Subscription)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Subscription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Subscription' namespace='##targetNamespace'"
	 * @generated
	 */
	Subscription getSubscription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSubscription <em>Subscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription</em>' containment reference.
	 * @see #getSubscription()
	 * @generated
	 */
	void setSubscription(Subscription value);

	/**
	 * Returns the value of the '<em><b>Subscription Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SubscriptionStatus resource describes the state of a Subscription during notifications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscription Status</em>' containment reference.
	 * @see #setSubscriptionStatus(SubscriptionStatus)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_SubscriptionStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubscriptionStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	SubscriptionStatus getSubscriptionStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSubscriptionStatus <em>Subscription Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Status</em>' containment reference.
	 * @see #getSubscriptionStatus()
	 * @generated
	 */
	void setSubscriptionStatus(SubscriptionStatus value);

	/**
	 * Returns the value of the '<em><b>Subscription Topic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes a stream of resource state changes or events and annotated with labels useful to filter projections from this topic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscription Topic</em>' containment reference.
	 * @see #setSubscriptionTopic(SubscriptionTopic)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_SubscriptionTopic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubscriptionTopic' namespace='##targetNamespace'"
	 * @generated
	 */
	SubscriptionTopic getSubscriptionTopic();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSubscriptionTopic <em>Subscription Topic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Topic</em>' containment reference.
	 * @see #getSubscriptionTopic()
	 * @generated
	 */
	void setSubscriptionTopic(SubscriptionTopic value);

	/**
	 * Returns the value of the '<em><b>Substance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A homogeneous material with a definite composition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance</em>' containment reference.
	 * @see #setSubstance(Substance)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Substance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Substance' namespace='##targetNamespace'"
	 * @generated
	 */
	Substance getSubstance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSubstance <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance</em>' containment reference.
	 * @see #getSubstance()
	 * @generated
	 */
	void setSubstance(Substance value);

	/**
	 * Returns the value of the '<em><b>Substance Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Definition</em>' containment reference.
	 * @see #setSubstanceDefinition(SubstanceDefinition)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_SubstanceDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubstanceDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceDefinition getSubstanceDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSubstanceDefinition <em>Substance Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance Definition</em>' containment reference.
	 * @see #getSubstanceDefinition()
	 * @generated
	 */
	void setSubstanceDefinition(SubstanceDefinition value);

	/**
	 * Returns the value of the '<em><b>Substance Nucleic Acid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be always entered in the 5’-3’ direction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Nucleic Acid</em>' containment reference.
	 * @see #setSubstanceNucleicAcid(SubstanceNucleicAcid)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_SubstanceNucleicAcid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubstanceNucleicAcid' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceNucleicAcid getSubstanceNucleicAcid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSubstanceNucleicAcid <em>Substance Nucleic Acid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance Nucleic Acid</em>' containment reference.
	 * @see #getSubstanceNucleicAcid()
	 * @generated
	 */
	void setSubstanceNucleicAcid(SubstanceNucleicAcid value);

	/**
	 * Returns the value of the '<em><b>Substance Polymer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Properties of a substance specific to it being a polymer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Polymer</em>' containment reference.
	 * @see #setSubstancePolymer(SubstancePolymer)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_SubstancePolymer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubstancePolymer' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstancePolymer getSubstancePolymer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSubstancePolymer <em>Substance Polymer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance Polymer</em>' containment reference.
	 * @see #getSubstancePolymer()
	 * @generated
	 */
	void setSubstancePolymer(SubstancePolymer value);

	/**
	 * Returns the value of the '<em><b>Substance Protein</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of subunits that are either covalently linked or have a defined invariant stoichiometric relationship. This includes all synthetic, recombinant and purified SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This set of elements will be used to describe albumins, coagulation factors, cytokines, growth factors, peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Protein</em>' containment reference.
	 * @see #setSubstanceProtein(SubstanceProtein)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_SubstanceProtein()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubstanceProtein' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceProtein getSubstanceProtein();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSubstanceProtein <em>Substance Protein</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance Protein</em>' containment reference.
	 * @see #getSubstanceProtein()
	 * @generated
	 */
	void setSubstanceProtein(SubstanceProtein value);

	/**
	 * Returns the value of the '<em><b>Substance Reference Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Reference Information</em>' containment reference.
	 * @see #setSubstanceReferenceInformation(SubstanceReferenceInformation)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_SubstanceReferenceInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubstanceReferenceInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceReferenceInformation getSubstanceReferenceInformation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSubstanceReferenceInformation <em>Substance Reference Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance Reference Information</em>' containment reference.
	 * @see #getSubstanceReferenceInformation()
	 * @generated
	 */
	void setSubstanceReferenceInformation(SubstanceReferenceInformation value);

	/**
	 * Returns the value of the '<em><b>Substance Source Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Source Material</em>' containment reference.
	 * @see #setSubstanceSourceMaterial(SubstanceSourceMaterial)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_SubstanceSourceMaterial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubstanceSourceMaterial' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceSourceMaterial getSubstanceSourceMaterial();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSubstanceSourceMaterial <em>Substance Source Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance Source Material</em>' containment reference.
	 * @see #getSubstanceSourceMaterial()
	 * @generated
	 */
	void setSubstanceSourceMaterial(SubstanceSourceMaterial value);

	/**
	 * Returns the value of the '<em><b>Supply Delivery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Record of delivery of what is supplied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supply Delivery</em>' containment reference.
	 * @see #setSupplyDelivery(SupplyDelivery)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_SupplyDelivery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SupplyDelivery' namespace='##targetNamespace'"
	 * @generated
	 */
	SupplyDelivery getSupplyDelivery();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSupplyDelivery <em>Supply Delivery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supply Delivery</em>' containment reference.
	 * @see #getSupplyDelivery()
	 * @generated
	 */
	void setSupplyDelivery(SupplyDelivery value);

	/**
	 * Returns the value of the '<em><b>Supply Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of a request to deliver a medication, substance or device used in the healthcare setting to a particular destination for a particular person or organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supply Request</em>' containment reference.
	 * @see #setSupplyRequest(SupplyRequest)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_SupplyRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SupplyRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	SupplyRequest getSupplyRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getSupplyRequest <em>Supply Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supply Request</em>' containment reference.
	 * @see #getSupplyRequest()
	 * @generated
	 */
	void setSupplyRequest(SupplyRequest value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A task to be performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task</em>' containment reference.
	 * @see #setTask(Task)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Task()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Task' namespace='##targetNamespace'"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getTask <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' containment reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>Terminology Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Terminology Capabilities</em>' containment reference.
	 * @see #setTerminologyCapabilities(TerminologyCapabilities)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_TerminologyCapabilities()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TerminologyCapabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	TerminologyCapabilities getTerminologyCapabilities();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getTerminologyCapabilities <em>Terminology Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminology Capabilities</em>' containment reference.
	 * @see #getTerminologyCapabilities()
	 * @generated
	 */
	void setTerminologyCapabilities(TerminologyCapabilities value);

	/**
	 * Returns the value of the '<em><b>Test Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A plan for executing testing on an artifact or specifications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Plan</em>' containment reference.
	 * @see #setTestPlan(TestPlan)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_TestPlan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TestPlan' namespace='##targetNamespace'"
	 * @generated
	 */
	TestPlan getTestPlan();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getTestPlan <em>Test Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Plan</em>' containment reference.
	 * @see #getTestPlan()
	 * @generated
	 */
	void setTestPlan(TestPlan value);

	/**
	 * Returns the value of the '<em><b>Test Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A summary of information based on the results of executing a TestScript.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Report</em>' containment reference.
	 * @see #setTestReport(TestReport)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_TestReport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TestReport' namespace='##targetNamespace'"
	 * @generated
	 */
	TestReport getTestReport();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getTestReport <em>Test Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Report</em>' containment reference.
	 * @see #getTestReport()
	 * @generated
	 */
	void setTestReport(TestReport value);

	/**
	 * Returns the value of the '<em><b>Test Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Script</em>' containment reference.
	 * @see #setTestScript(TestScript)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_TestScript()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TestScript' namespace='##targetNamespace'"
	 * @generated
	 */
	TestScript getTestScript();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getTestScript <em>Test Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Script</em>' containment reference.
	 * @see #getTestScript()
	 * @generated
	 */
	void setTestScript(TestScript value);

	/**
	 * Returns the value of the '<em><b>Transport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Record of transport of item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport</em>' containment reference.
	 * @see #setTransport(Transport)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Transport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Transport' namespace='##targetNamespace'"
	 * @generated
	 */
	Transport getTransport();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getTransport <em>Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport</em>' containment reference.
	 * @see #getTransport()
	 * @generated
	 */
	void setTransport(Transport value);

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [CodeSystem](codesystem.html) definitions and their use in [coded elements](terminologies.html).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference.
	 * @see #setValueSet(ValueSet)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_ValueSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ValueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSet getValueSet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getValueSet <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set</em>' containment reference.
	 * @see #getValueSet()
	 * @generated
	 */
	void setValueSet(ValueSet value);

	/**
	 * Returns the value of the '<em><b>Verification Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes validation requirements, source(s), status and dates for one or more elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verification Result</em>' containment reference.
	 * @see #setVerificationResult(VerificationResult)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_VerificationResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VerificationResult' namespace='##targetNamespace'"
	 * @generated
	 */
	VerificationResult getVerificationResult();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getVerificationResult <em>Verification Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Result</em>' containment reference.
	 * @see #getVerificationResult()
	 * @generated
	 */
	void setVerificationResult(VerificationResult value);

	/**
	 * Returns the value of the '<em><b>Vision Prescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An authorization for the provision of glasses and/or contact lenses to a patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vision Prescription</em>' containment reference.
	 * @see #setVisionPrescription(VisionPrescription)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_VisionPrescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VisionPrescription' namespace='##targetNamespace'"
	 * @generated
	 */
	VisionPrescription getVisionPrescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getVisionPrescription <em>Vision Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vision Prescription</em>' containment reference.
	 * @see #getVisionPrescription()
	 * @generated
	 */
	void setVisionPrescription(VisionPrescription value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource is used to pass information into and back from an operation (whether invoked directly from REST or within a messaging environment).  It is not persisted or allowed to be referenced by other resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(Parameters)
	 * @see org.hl7.fhir.FhirPackage#getResourceContainer_Parameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Parameters' namespace='##targetNamespace'"
	 * @generated
	 */
	Parameters getParameters();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResourceContainer#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(Parameters value);

} // ResourceContainer
