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
 * A representation of the literals of the enumeration '<em><b>FHIR Types Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getFHIRTypesEnum()
 * @model extendedMetaData="name='FHIRTypesEnum'"
 * @generated
 */
public enum FHIRTypesEnum implements Enumerator {
	/**
	 * The '<em><b>Base</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Base
	 * <!-- end-model-doc -->
	 * @see #BASE_VALUE
	 * @generated
	 * @ordered
	 */
	BASE(0, "Base", "Base"),

	/**
	 * The '<em><b>Element</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element
	 * <!-- end-model-doc -->
	 * @see #ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ELEMENT(1, "Element", "Element"),

	/**
	 * The '<em><b>Backbone Element</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BackboneElement
	 * <!-- end-model-doc -->
	 * @see #BACKBONE_ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	BACKBONE_ELEMENT(2, "BackboneElement", "BackboneElement"),

	/**
	 * The '<em><b>Data Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DataType
	 * <!-- end-model-doc -->
	 * @see #DATA_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_TYPE(3, "DataType", "DataType"),

	/**
	 * The '<em><b>Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Address
	 * <!-- end-model-doc -->
	 * @see #ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	ADDRESS(4, "Address", "Address"),

	/**
	 * The '<em><b>Annotation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Annotation
	 * <!-- end-model-doc -->
	 * @see #ANNOTATION_VALUE
	 * @generated
	 * @ordered
	 */
	ANNOTATION(5, "Annotation", "Annotation"),

	/**
	 * The '<em><b>Attachment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attachment
	 * <!-- end-model-doc -->
	 * @see #ATTACHMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ATTACHMENT(6, "Attachment", "Attachment"),

	/**
	 * The '<em><b>Availability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Availability
	 * <!-- end-model-doc -->
	 * @see #AVAILABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	AVAILABILITY(7, "Availability", "Availability"),

	/**
	 * The '<em><b>Backbone Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BackboneType
	 * <!-- end-model-doc -->
	 * @see #BACKBONE_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	BACKBONE_TYPE(8, "BackboneType", "BackboneType"),

	/**
	 * The '<em><b>Dosage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dosage
	 * <!-- end-model-doc -->
	 * @see #DOSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	DOSAGE(9, "Dosage", "Dosage"),

	/**
	 * The '<em><b>Element Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ElementDefinition
	 * <!-- end-model-doc -->
	 * @see #ELEMENT_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	ELEMENT_DEFINITION(10, "ElementDefinition", "ElementDefinition"),

	/**
	 * The '<em><b>Marketing Status</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MarketingStatus
	 * <!-- end-model-doc -->
	 * @see #MARKETING_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	MARKETING_STATUS(11, "MarketingStatus", "MarketingStatus"),

	/**
	 * The '<em><b>Product Shelf Life</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ProductShelfLife
	 * <!-- end-model-doc -->
	 * @see #PRODUCT_SHELF_LIFE_VALUE
	 * @generated
	 * @ordered
	 */
	PRODUCT_SHELF_LIFE(12, "ProductShelfLife", "ProductShelfLife"),

	/**
	 * The '<em><b>Timing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Timing
	 * <!-- end-model-doc -->
	 * @see #TIMING_VALUE
	 * @generated
	 * @ordered
	 */
	TIMING(13, "Timing", "Timing"),

	/**
	 * The '<em><b>Codeable Concept</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CodeableConcept
	 * <!-- end-model-doc -->
	 * @see #CODEABLE_CONCEPT_VALUE
	 * @generated
	 * @ordered
	 */
	CODEABLE_CONCEPT(14, "CodeableConcept", "CodeableConcept"),

	/**
	 * The '<em><b>Codeable Reference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CodeableReference
	 * <!-- end-model-doc -->
	 * @see #CODEABLE_REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	CODEABLE_REFERENCE(15, "CodeableReference", "CodeableReference"),

	/**
	 * The '<em><b>Coding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coding
	 * <!-- end-model-doc -->
	 * @see #CODING_VALUE
	 * @generated
	 * @ordered
	 */
	CODING(16, "Coding", "Coding"),

	/**
	 * The '<em><b>Contact Detail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ContactDetail
	 * <!-- end-model-doc -->
	 * @see #CONTACT_DETAIL_VALUE
	 * @generated
	 * @ordered
	 */
	CONTACT_DETAIL(17, "ContactDetail", "ContactDetail"),

	/**
	 * The '<em><b>Contact Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ContactPoint
	 * <!-- end-model-doc -->
	 * @see #CONTACT_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTACT_POINT(18, "ContactPoint", "ContactPoint"),

	/**
	 * The '<em><b>Contributor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contributor
	 * <!-- end-model-doc -->
	 * @see #CONTRIBUTOR_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRIBUTOR(19, "Contributor", "Contributor"),

	/**
	 * The '<em><b>Data Requirement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DataRequirement
	 * <!-- end-model-doc -->
	 * @see #DATA_REQUIREMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_REQUIREMENT(20, "DataRequirement", "DataRequirement"),

	/**
	 * The '<em><b>Expression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expression
	 * <!-- end-model-doc -->
	 * @see #EXPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	EXPRESSION(21, "Expression", "Expression"),

	/**
	 * The '<em><b>Extended Contact Detail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExtendedContactDetail
	 * <!-- end-model-doc -->
	 * @see #EXTENDED_CONTACT_DETAIL_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENDED_CONTACT_DETAIL(22, "ExtendedContactDetail", "ExtendedContactDetail"),

	/**
	 * The '<em><b>Extension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extension
	 * <!-- end-model-doc -->
	 * @see #EXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENSION(23, "Extension", "Extension"),

	/**
	 * The '<em><b>Human Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HumanName
	 * <!-- end-model-doc -->
	 * @see #HUMAN_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	HUMAN_NAME(24, "HumanName", "HumanName"),

	/**
	 * The '<em><b>Identifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier
	 * <!-- end-model-doc -->
	 * @see #IDENTIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	IDENTIFIER(25, "Identifier", "Identifier"),

	/**
	 * The '<em><b>Meta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Meta
	 * <!-- end-model-doc -->
	 * @see #META_VALUE
	 * @generated
	 * @ordered
	 */
	META(26, "Meta", "Meta"),

	/**
	 * The '<em><b>Monetary Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MonetaryComponent
	 * <!-- end-model-doc -->
	 * @see #MONETARY_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	MONETARY_COMPONENT(27, "MonetaryComponent", "MonetaryComponent"),

	/**
	 * The '<em><b>Money</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Money
	 * <!-- end-model-doc -->
	 * @see #MONEY_VALUE
	 * @generated
	 * @ordered
	 */
	MONEY(28, "Money", "Money"),

	/**
	 * The '<em><b>Narrative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Narrative
	 * <!-- end-model-doc -->
	 * @see #NARRATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	NARRATIVE(29, "Narrative", "Narrative"),

	/**
	 * The '<em><b>Parameter Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ParameterDefinition
	 * <!-- end-model-doc -->
	 * @see #PARAMETER_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	PARAMETER_DEFINITION(30, "ParameterDefinition", "ParameterDefinition"),

	/**
	 * The '<em><b>Period</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Period
	 * <!-- end-model-doc -->
	 * @see #PERIOD_VALUE
	 * @generated
	 * @ordered
	 */
	PERIOD(31, "Period", "Period"),

	/**
	 * The '<em><b>Primitive Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PrimitiveType
	 * <!-- end-model-doc -->
	 * @see #PRIMITIVE_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMITIVE_TYPE(32, "PrimitiveType", "PrimitiveType"),

	/**
	 * The '<em><b>Base64 Binary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * base64Binary
	 * <!-- end-model-doc -->
	 * @see #BASE64_BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	BASE64_BINARY(33, "base64Binary", "base64Binary"),

	/**
	 * The '<em><b>Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * boolean
	 * <!-- end-model-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(34, "boolean", "boolean"),

	/**
	 * The '<em><b>Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * date
	 * <!-- end-model-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(35, "date", "date"),

	/**
	 * The '<em><b>Date Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * dateTime
	 * <!-- end-model-doc -->
	 * @see #DATE_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_TIME(36, "dateTime", "dateTime"),

	/**
	 * The '<em><b>Decimal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decimal
	 * <!-- end-model-doc -->
	 * @see #DECIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	DECIMAL(37, "decimal", "decimal"),

	/**
	 * The '<em><b>Instant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * instant
	 * <!-- end-model-doc -->
	 * @see #INSTANT_VALUE
	 * @generated
	 * @ordered
	 */
	INSTANT(38, "instant", "instant"),

	/**
	 * The '<em><b>Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * integer
	 * <!-- end-model-doc -->
	 * @see #INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER(39, "integer", "integer"),

	/**
	 * The '<em><b>Positive Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * positiveInt
	 * <!-- end-model-doc -->
	 * @see #POSITIVE_INT_VALUE
	 * @generated
	 * @ordered
	 */
	POSITIVE_INT(40, "positiveInt", "positiveInt"),

	/**
	 * The '<em><b>Unsigned Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * unsignedInt
	 * <!-- end-model-doc -->
	 * @see #UNSIGNED_INT_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_INT(41, "unsignedInt", "unsignedInt"),

	/**
	 * The '<em><b>Integer64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * integer64
	 * <!-- end-model-doc -->
	 * @see #INTEGER64_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER64(42, "integer64", "integer64"),

	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * string
	 * <!-- end-model-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(43, "string", "string"),

	/**
	 * The '<em><b>Code</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * code
	 * <!-- end-model-doc -->
	 * @see #CODE_VALUE
	 * @generated
	 * @ordered
	 */
	CODE(44, "code", "code"),

	/**
	 * The '<em><b>Id</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * id
	 * <!-- end-model-doc -->
	 * @see #ID_VALUE
	 * @generated
	 * @ordered
	 */
	ID(45, "id", "id"),

	/**
	 * The '<em><b>Markdown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * markdown
	 * <!-- end-model-doc -->
	 * @see #MARKDOWN_VALUE
	 * @generated
	 * @ordered
	 */
	MARKDOWN(46, "markdown", "markdown"),

	/**
	 * The '<em><b>Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * time
	 * <!-- end-model-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(47, "time", "time"),

	/**
	 * The '<em><b>Uri</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * uri
	 * <!-- end-model-doc -->
	 * @see #URI_VALUE
	 * @generated
	 * @ordered
	 */
	URI(48, "uri", "uri"),

	/**
	 * The '<em><b>Canonical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * canonical
	 * <!-- end-model-doc -->
	 * @see #CANONICAL_VALUE
	 * @generated
	 * @ordered
	 */
	CANONICAL(49, "canonical", "canonical"),

	/**
	 * The '<em><b>Oid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * oid
	 * <!-- end-model-doc -->
	 * @see #OID_VALUE
	 * @generated
	 * @ordered
	 */
	OID(50, "oid", "oid"),

	/**
	 * The '<em><b>Url</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * url
	 * <!-- end-model-doc -->
	 * @see #URL_VALUE
	 * @generated
	 * @ordered
	 */
	URL(51, "url", "url"),

	/**
	 * The '<em><b>Uuid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * uuid
	 * <!-- end-model-doc -->
	 * @see #UUID_VALUE
	 * @generated
	 * @ordered
	 */
	UUID(52, "uuid", "uuid"),

	/**
	 * The '<em><b>Quantity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quantity
	 * <!-- end-model-doc -->
	 * @see #QUANTITY_VALUE
	 * @generated
	 * @ordered
	 */
	QUANTITY(53, "Quantity", "Quantity"),

	/**
	 * The '<em><b>Age</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Age
	 * <!-- end-model-doc -->
	 * @see #AGE_VALUE
	 * @generated
	 * @ordered
	 */
	AGE(54, "Age", "Age"),

	/**
	 * The '<em><b>Count</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Count
	 * <!-- end-model-doc -->
	 * @see #COUNT_VALUE
	 * @generated
	 * @ordered
	 */
	COUNT(55, "Count", "Count"),

	/**
	 * The '<em><b>Distance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Distance
	 * <!-- end-model-doc -->
	 * @see #DISTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	DISTANCE(56, "Distance", "Distance"),

	/**
	 * The '<em><b>Duration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Duration
	 * <!-- end-model-doc -->
	 * @see #DURATION_VALUE
	 * @generated
	 * @ordered
	 */
	DURATION(57, "Duration", "Duration"),

	/**
	 * The '<em><b>Range</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Range
	 * <!-- end-model-doc -->
	 * @see #RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	RANGE(58, "Range", "Range"),

	/**
	 * The '<em><b>Ratio</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ratio
	 * <!-- end-model-doc -->
	 * @see #RATIO_VALUE
	 * @generated
	 * @ordered
	 */
	RATIO(59, "Ratio", "Ratio"),

	/**
	 * The '<em><b>Ratio Range</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RatioRange
	 * <!-- end-model-doc -->
	 * @see #RATIO_RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	RATIO_RANGE(60, "RatioRange", "RatioRange"),

	/**
	 * The '<em><b>Reference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference
	 * <!-- end-model-doc -->
	 * @see #REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCE(61, "Reference", "Reference"),

	/**
	 * The '<em><b>Related Artifact</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RelatedArtifact
	 * <!-- end-model-doc -->
	 * @see #RELATED_ARTIFACT_VALUE
	 * @generated
	 * @ordered
	 */
	RELATED_ARTIFACT(62, "RelatedArtifact", "RelatedArtifact"),

	/**
	 * The '<em><b>Sampled Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SampledData
	 * <!-- end-model-doc -->
	 * @see #SAMPLED_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	SAMPLED_DATA(63, "SampledData", "SampledData"),

	/**
	 * The '<em><b>Signature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Signature
	 * <!-- end-model-doc -->
	 * @see #SIGNATURE_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNATURE(64, "Signature", "Signature"),

	/**
	 * The '<em><b>Trigger Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TriggerDefinition
	 * <!-- end-model-doc -->
	 * @see #TRIGGER_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	TRIGGER_DEFINITION(65, "TriggerDefinition", "TriggerDefinition"),

	/**
	 * The '<em><b>Usage Context</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UsageContext
	 * <!-- end-model-doc -->
	 * @see #USAGE_CONTEXT_VALUE
	 * @generated
	 * @ordered
	 */
	USAGE_CONTEXT(66, "UsageContext", "UsageContext"),

	/**
	 * The '<em><b>Virtual Service Detail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VirtualServiceDetail
	 * <!-- end-model-doc -->
	 * @see #VIRTUAL_SERVICE_DETAIL_VALUE
	 * @generated
	 * @ordered
	 */
	VIRTUAL_SERVICE_DETAIL(67, "VirtualServiceDetail", "VirtualServiceDetail"),

	/**
	 * The '<em><b>Xhtml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * xhtml
	 * <!-- end-model-doc -->
	 * @see #XHTML_VALUE
	 * @generated
	 * @ordered
	 */
	XHTML(68, "xhtml", "xhtml"),

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
	RESOURCE(69, "Resource", "Resource"),

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
	BINARY(70, "Binary", "Binary"),

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
	BUNDLE(71, "Bundle", "Bundle"),

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
	DOMAIN_RESOURCE(72, "DomainResource", "DomainResource"),

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
	ACCOUNT(73, "Account", "Account"),

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
	ACTIVITY_DEFINITION(74, "ActivityDefinition", "ActivityDefinition"),

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
	ACTOR_DEFINITION(75, "ActorDefinition", "ActorDefinition"),

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
	ADMINISTRABLE_PRODUCT_DEFINITION(76, "AdministrableProductDefinition", "AdministrableProductDefinition"),

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
	ADVERSE_EVENT(77, "AdverseEvent", "AdverseEvent"),

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
	ALLERGY_INTOLERANCE(78, "AllergyIntolerance", "AllergyIntolerance"),

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
	APPOINTMENT(79, "Appointment", "Appointment"),

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
	APPOINTMENT_RESPONSE(80, "AppointmentResponse", "AppointmentResponse"),

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
	ARTIFACT_ASSESSMENT(81, "ArtifactAssessment", "ArtifactAssessment"),

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
	AUDIT_EVENT(82, "AuditEvent", "AuditEvent"),

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
	BASIC(83, "Basic", "Basic"),

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
	BIOLOGICALLY_DERIVED_PRODUCT(84, "BiologicallyDerivedProduct", "BiologicallyDerivedProduct"),

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
	BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE(85, "BiologicallyDerivedProductDispense", "BiologicallyDerivedProductDispense"),

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
	BODY_STRUCTURE(86, "BodyStructure", "BodyStructure"),

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
	CANONICAL_RESOURCE(87, "CanonicalResource", "CanonicalResource"),

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
	CAPABILITY_STATEMENT(88, "CapabilityStatement", "CapabilityStatement"),

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
	CARE_PLAN(89, "CarePlan", "CarePlan"),

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
	CARE_TEAM(90, "CareTeam", "CareTeam"),

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
	CHARGE_ITEM(91, "ChargeItem", "ChargeItem"),

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
	CHARGE_ITEM_DEFINITION(92, "ChargeItemDefinition", "ChargeItemDefinition"),

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
	CITATION(93, "Citation", "Citation"),

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
	CLAIM(94, "Claim", "Claim"),

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
	CLAIM_RESPONSE(95, "ClaimResponse", "ClaimResponse"),

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
	CLINICAL_IMPRESSION(96, "ClinicalImpression", "ClinicalImpression"),

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
	CLINICAL_USE_DEFINITION(97, "ClinicalUseDefinition", "ClinicalUseDefinition"),

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
	CODE_SYSTEM(98, "CodeSystem", "CodeSystem"),

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
	COMMUNICATION(99, "Communication", "Communication"),

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
	COMMUNICATION_REQUEST(100, "CommunicationRequest", "CommunicationRequest"),

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
	COMPARTMENT_DEFINITION(101, "CompartmentDefinition", "CompartmentDefinition"),

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
	COMPOSITION(102, "Composition", "Composition"),

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
	CONCEPT_MAP(103, "ConceptMap", "ConceptMap"),

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
	CONDITION(104, "Condition", "Condition"),

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
	CONDITION_DEFINITION(105, "ConditionDefinition", "ConditionDefinition"),

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
	CONSENT(106, "Consent", "Consent"),

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
	CONTRACT(107, "Contract", "Contract"),

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
	COVERAGE(108, "Coverage", "Coverage"),

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
	COVERAGE_ELIGIBILITY_REQUEST(109, "CoverageEligibilityRequest", "CoverageEligibilityRequest"),

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
	COVERAGE_ELIGIBILITY_RESPONSE(110, "CoverageEligibilityResponse", "CoverageEligibilityResponse"),

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
	DETECTED_ISSUE(111, "DetectedIssue", "DetectedIssue"),

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
	DEVICE(112, "Device", "Device"),

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
	DEVICE_ASSOCIATION(113, "DeviceAssociation", "DeviceAssociation"),

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
	DEVICE_DEFINITION(114, "DeviceDefinition", "DeviceDefinition"),

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
	DEVICE_DISPENSE(115, "DeviceDispense", "DeviceDispense"),

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
	DEVICE_METRIC(116, "DeviceMetric", "DeviceMetric"),

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
	DEVICE_REQUEST(117, "DeviceRequest", "DeviceRequest"),

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
	DEVICE_USAGE(118, "DeviceUsage", "DeviceUsage"),

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
	DIAGNOSTIC_REPORT(119, "DiagnosticReport", "DiagnosticReport"),

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
	DOCUMENT_REFERENCE(120, "DocumentReference", "DocumentReference"),

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
	ENCOUNTER(121, "Encounter", "Encounter"),

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
	ENCOUNTER_HISTORY(122, "EncounterHistory", "EncounterHistory"),

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
	ENDPOINT(123, "Endpoint", "Endpoint"),

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
	ENROLLMENT_REQUEST(124, "EnrollmentRequest", "EnrollmentRequest"),

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
	ENROLLMENT_RESPONSE(125, "EnrollmentResponse", "EnrollmentResponse"),

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
	EPISODE_OF_CARE(126, "EpisodeOfCare", "EpisodeOfCare"),

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
	EVENT_DEFINITION(127, "EventDefinition", "EventDefinition"),

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
	EVIDENCE(128, "Evidence", "Evidence"),

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
	EVIDENCE_REPORT(129, "EvidenceReport", "EvidenceReport"),

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
	EVIDENCE_VARIABLE(130, "EvidenceVariable", "EvidenceVariable"),

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
	EXAMPLE_SCENARIO(131, "ExampleScenario", "ExampleScenario"),

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
	EXPLANATION_OF_BENEFIT(132, "ExplanationOfBenefit", "ExplanationOfBenefit"),

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
	FAMILY_MEMBER_HISTORY(133, "FamilyMemberHistory", "FamilyMemberHistory"),

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
	FLAG(134, "Flag", "Flag"),

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
	FORMULARY_ITEM(135, "FormularyItem", "FormularyItem"),

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
	GENOMIC_STUDY(136, "GenomicStudy", "GenomicStudy"),

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
	GOAL(137, "Goal", "Goal"),

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
	GRAPH_DEFINITION(138, "GraphDefinition", "GraphDefinition"),

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
	GROUP(139, "Group", "Group"),

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
	GUIDANCE_RESPONSE(140, "GuidanceResponse", "GuidanceResponse"),

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
	HEALTHCARE_SERVICE(141, "HealthcareService", "HealthcareService"),

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
	IMAGING_SELECTION(142, "ImagingSelection", "ImagingSelection"),

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
	IMAGING_STUDY(143, "ImagingStudy", "ImagingStudy"),

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
	IMMUNIZATION(144, "Immunization", "Immunization"),

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
	IMMUNIZATION_EVALUATION(145, "ImmunizationEvaluation", "ImmunizationEvaluation"),

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
	IMMUNIZATION_RECOMMENDATION(146, "ImmunizationRecommendation", "ImmunizationRecommendation"),

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
	IMPLEMENTATION_GUIDE(147, "ImplementationGuide", "ImplementationGuide"),

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
	INGREDIENT(148, "Ingredient", "Ingredient"),

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
	INSURANCE_PLAN(149, "InsurancePlan", "InsurancePlan"),

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
	INVENTORY_ITEM(150, "InventoryItem", "InventoryItem"),

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
	INVENTORY_REPORT(151, "InventoryReport", "InventoryReport"),

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
	INVOICE(152, "Invoice", "Invoice"),

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
	LIBRARY(153, "Library", "Library"),

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
	LINKAGE(154, "Linkage", "Linkage"),

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
	LIST(155, "List", "List"),

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
	LOCATION(156, "Location", "Location"),

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
	MANUFACTURED_ITEM_DEFINITION(157, "ManufacturedItemDefinition", "ManufacturedItemDefinition"),

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
	MEASURE(158, "Measure", "Measure"),

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
	MEASURE_REPORT(159, "MeasureReport", "MeasureReport"),

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
	MEDICATION(160, "Medication", "Medication"),

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
	MEDICATION_ADMINISTRATION(161, "MedicationAdministration", "MedicationAdministration"),

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
	MEDICATION_DISPENSE(162, "MedicationDispense", "MedicationDispense"),

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
	MEDICATION_KNOWLEDGE(163, "MedicationKnowledge", "MedicationKnowledge"),

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
	MEDICATION_REQUEST(164, "MedicationRequest", "MedicationRequest"),

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
	MEDICATION_STATEMENT(165, "MedicationStatement", "MedicationStatement"),

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
	MEDICINAL_PRODUCT_DEFINITION(166, "MedicinalProductDefinition", "MedicinalProductDefinition"),

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
	MESSAGE_DEFINITION(167, "MessageDefinition", "MessageDefinition"),

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
	MESSAGE_HEADER(168, "MessageHeader", "MessageHeader"),

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
	METADATA_RESOURCE(169, "MetadataResource", "MetadataResource"),

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
	MOLECULAR_SEQUENCE(170, "MolecularSequence", "MolecularSequence"),

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
	NAMING_SYSTEM(171, "NamingSystem", "NamingSystem"),

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
	NUTRITION_INTAKE(172, "NutritionIntake", "NutritionIntake"),

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
	NUTRITION_ORDER(173, "NutritionOrder", "NutritionOrder"),

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
	NUTRITION_PRODUCT(174, "NutritionProduct", "NutritionProduct"),

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
	OBSERVATION(175, "Observation", "Observation"),

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
	OBSERVATION_DEFINITION(176, "ObservationDefinition", "ObservationDefinition"),

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
	OPERATION_DEFINITION(177, "OperationDefinition", "OperationDefinition"),

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
	OPERATION_OUTCOME(178, "OperationOutcome", "OperationOutcome"),

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
	ORGANIZATION(179, "Organization", "Organization"),

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
	ORGANIZATION_AFFILIATION(180, "OrganizationAffiliation", "OrganizationAffiliation"),

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
	PACKAGED_PRODUCT_DEFINITION(181, "PackagedProductDefinition", "PackagedProductDefinition"),

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
	PATIENT(182, "Patient", "Patient"),

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
	PAYMENT_NOTICE(183, "PaymentNotice", "PaymentNotice"),

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
	PAYMENT_RECONCILIATION(184, "PaymentReconciliation", "PaymentReconciliation"),

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
	PERMISSION(185, "Permission", "Permission"),

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
	PERSON(186, "Person", "Person"),

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
	PLAN_DEFINITION(187, "PlanDefinition", "PlanDefinition"),

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
	PRACTITIONER(188, "Practitioner", "Practitioner"),

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
	PRACTITIONER_ROLE(189, "PractitionerRole", "PractitionerRole"),

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
	PROCEDURE(190, "Procedure", "Procedure"),

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
	PROVENANCE(191, "Provenance", "Provenance"),

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
	QUESTIONNAIRE(192, "Questionnaire", "Questionnaire"),

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
	QUESTIONNAIRE_RESPONSE(193, "QuestionnaireResponse", "QuestionnaireResponse"),

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
	REGULATED_AUTHORIZATION(194, "RegulatedAuthorization", "RegulatedAuthorization"),

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
	RELATED_PERSON(195, "RelatedPerson", "RelatedPerson"),

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
	REQUEST_ORCHESTRATION(196, "RequestOrchestration", "RequestOrchestration"),

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
	REQUIREMENTS(197, "Requirements", "Requirements"),

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
	RESEARCH_STUDY(198, "ResearchStudy", "ResearchStudy"),

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
	RESEARCH_SUBJECT(199, "ResearchSubject", "ResearchSubject"),

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
	RISK_ASSESSMENT(200, "RiskAssessment", "RiskAssessment"),

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
	SCHEDULE(201, "Schedule", "Schedule"),

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
	SEARCH_PARAMETER(202, "SearchParameter", "SearchParameter"),

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
	SERVICE_REQUEST(203, "ServiceRequest", "ServiceRequest"),

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
	SLOT(204, "Slot", "Slot"),

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
	SPECIMEN(205, "Specimen", "Specimen"),

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
	SPECIMEN_DEFINITION(206, "SpecimenDefinition", "SpecimenDefinition"),

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
	STRUCTURE_DEFINITION(207, "StructureDefinition", "StructureDefinition"),

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
	STRUCTURE_MAP(208, "StructureMap", "StructureMap"),

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
	SUBSCRIPTION(209, "Subscription", "Subscription"),

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
	SUBSCRIPTION_STATUS(210, "SubscriptionStatus", "SubscriptionStatus"),

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
	SUBSCRIPTION_TOPIC(211, "SubscriptionTopic", "SubscriptionTopic"),

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
	SUBSTANCE(212, "Substance", "Substance"),

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
	SUBSTANCE_DEFINITION(213, "SubstanceDefinition", "SubstanceDefinition"),

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
	SUBSTANCE_NUCLEIC_ACID(214, "SubstanceNucleicAcid", "SubstanceNucleicAcid"),

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
	SUBSTANCE_POLYMER(215, "SubstancePolymer", "SubstancePolymer"),

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
	SUBSTANCE_PROTEIN(216, "SubstanceProtein", "SubstanceProtein"),

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
	SUBSTANCE_REFERENCE_INFORMATION(217, "SubstanceReferenceInformation", "SubstanceReferenceInformation"),

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
	SUBSTANCE_SOURCE_MATERIAL(218, "SubstanceSourceMaterial", "SubstanceSourceMaterial"),

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
	SUPPLY_DELIVERY(219, "SupplyDelivery", "SupplyDelivery"),

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
	SUPPLY_REQUEST(220, "SupplyRequest", "SupplyRequest"),

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
	TASK(221, "Task", "Task"),

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
	TERMINOLOGY_CAPABILITIES(222, "TerminologyCapabilities", "TerminologyCapabilities"),

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
	TEST_PLAN(223, "TestPlan", "TestPlan"),

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
	TEST_REPORT(224, "TestReport", "TestReport"),

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
	TEST_SCRIPT(225, "TestScript", "TestScript"),

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
	TRANSPORT(226, "Transport", "Transport"),

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
	VALUE_SET(227, "ValueSet", "ValueSet"),

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
	VERIFICATION_RESULT(228, "VerificationResult", "VerificationResult"),

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
	VISION_PRESCRIPTION(229, "VisionPrescription", "VisionPrescription"),

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
	PARAMETERS(230, "Parameters", "Parameters");

	/**
	 * The '<em><b>Base</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Base
	 * <!-- end-model-doc -->
	 * @see #BASE
	 * @model name="Base"
	 * @generated
	 * @ordered
	 */
	public static final int BASE_VALUE = 0;

	/**
	 * The '<em><b>Element</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element
	 * <!-- end-model-doc -->
	 * @see #ELEMENT
	 * @model name="Element"
	 * @generated
	 * @ordered
	 */
	public static final int ELEMENT_VALUE = 1;

	/**
	 * The '<em><b>Backbone Element</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BackboneElement
	 * <!-- end-model-doc -->
	 * @see #BACKBONE_ELEMENT
	 * @model name="BackboneElement"
	 * @generated
	 * @ordered
	 */
	public static final int BACKBONE_ELEMENT_VALUE = 2;

	/**
	 * The '<em><b>Data Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DataType
	 * <!-- end-model-doc -->
	 * @see #DATA_TYPE
	 * @model name="DataType"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_TYPE_VALUE = 3;

	/**
	 * The '<em><b>Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Address
	 * <!-- end-model-doc -->
	 * @see #ADDRESS
	 * @model name="Address"
	 * @generated
	 * @ordered
	 */
	public static final int ADDRESS_VALUE = 4;

	/**
	 * The '<em><b>Annotation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Annotation
	 * <!-- end-model-doc -->
	 * @see #ANNOTATION
	 * @model name="Annotation"
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION_VALUE = 5;

	/**
	 * The '<em><b>Attachment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attachment
	 * <!-- end-model-doc -->
	 * @see #ATTACHMENT
	 * @model name="Attachment"
	 * @generated
	 * @ordered
	 */
	public static final int ATTACHMENT_VALUE = 6;

	/**
	 * The '<em><b>Availability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Availability
	 * <!-- end-model-doc -->
	 * @see #AVAILABILITY
	 * @model name="Availability"
	 * @generated
	 * @ordered
	 */
	public static final int AVAILABILITY_VALUE = 7;

	/**
	 * The '<em><b>Backbone Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BackboneType
	 * <!-- end-model-doc -->
	 * @see #BACKBONE_TYPE
	 * @model name="BackboneType"
	 * @generated
	 * @ordered
	 */
	public static final int BACKBONE_TYPE_VALUE = 8;

	/**
	 * The '<em><b>Dosage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dosage
	 * <!-- end-model-doc -->
	 * @see #DOSAGE
	 * @model name="Dosage"
	 * @generated
	 * @ordered
	 */
	public static final int DOSAGE_VALUE = 9;

	/**
	 * The '<em><b>Element Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ElementDefinition
	 * <!-- end-model-doc -->
	 * @see #ELEMENT_DEFINITION
	 * @model name="ElementDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int ELEMENT_DEFINITION_VALUE = 10;

	/**
	 * The '<em><b>Marketing Status</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MarketingStatus
	 * <!-- end-model-doc -->
	 * @see #MARKETING_STATUS
	 * @model name="MarketingStatus"
	 * @generated
	 * @ordered
	 */
	public static final int MARKETING_STATUS_VALUE = 11;

	/**
	 * The '<em><b>Product Shelf Life</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ProductShelfLife
	 * <!-- end-model-doc -->
	 * @see #PRODUCT_SHELF_LIFE
	 * @model name="ProductShelfLife"
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_SHELF_LIFE_VALUE = 12;

	/**
	 * The '<em><b>Timing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Timing
	 * <!-- end-model-doc -->
	 * @see #TIMING
	 * @model name="Timing"
	 * @generated
	 * @ordered
	 */
	public static final int TIMING_VALUE = 13;

	/**
	 * The '<em><b>Codeable Concept</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CodeableConcept
	 * <!-- end-model-doc -->
	 * @see #CODEABLE_CONCEPT
	 * @model name="CodeableConcept"
	 * @generated
	 * @ordered
	 */
	public static final int CODEABLE_CONCEPT_VALUE = 14;

	/**
	 * The '<em><b>Codeable Reference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CodeableReference
	 * <!-- end-model-doc -->
	 * @see #CODEABLE_REFERENCE
	 * @model name="CodeableReference"
	 * @generated
	 * @ordered
	 */
	public static final int CODEABLE_REFERENCE_VALUE = 15;

	/**
	 * The '<em><b>Coding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coding
	 * <!-- end-model-doc -->
	 * @see #CODING
	 * @model name="Coding"
	 * @generated
	 * @ordered
	 */
	public static final int CODING_VALUE = 16;

	/**
	 * The '<em><b>Contact Detail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ContactDetail
	 * <!-- end-model-doc -->
	 * @see #CONTACT_DETAIL
	 * @model name="ContactDetail"
	 * @generated
	 * @ordered
	 */
	public static final int CONTACT_DETAIL_VALUE = 17;

	/**
	 * The '<em><b>Contact Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ContactPoint
	 * <!-- end-model-doc -->
	 * @see #CONTACT_POINT
	 * @model name="ContactPoint"
	 * @generated
	 * @ordered
	 */
	public static final int CONTACT_POINT_VALUE = 18;

	/**
	 * The '<em><b>Contributor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contributor
	 * <!-- end-model-doc -->
	 * @see #CONTRIBUTOR
	 * @model name="Contributor"
	 * @generated
	 * @ordered
	 */
	public static final int CONTRIBUTOR_VALUE = 19;

	/**
	 * The '<em><b>Data Requirement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DataRequirement
	 * <!-- end-model-doc -->
	 * @see #DATA_REQUIREMENT
	 * @model name="DataRequirement"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_REQUIREMENT_VALUE = 20;

	/**
	 * The '<em><b>Expression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expression
	 * <!-- end-model-doc -->
	 * @see #EXPRESSION
	 * @model name="Expression"
	 * @generated
	 * @ordered
	 */
	public static final int EXPRESSION_VALUE = 21;

	/**
	 * The '<em><b>Extended Contact Detail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExtendedContactDetail
	 * <!-- end-model-doc -->
	 * @see #EXTENDED_CONTACT_DETAIL
	 * @model name="ExtendedContactDetail"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENDED_CONTACT_DETAIL_VALUE = 22;

	/**
	 * The '<em><b>Extension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extension
	 * <!-- end-model-doc -->
	 * @see #EXTENSION
	 * @model name="Extension"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION_VALUE = 23;

	/**
	 * The '<em><b>Human Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HumanName
	 * <!-- end-model-doc -->
	 * @see #HUMAN_NAME
	 * @model name="HumanName"
	 * @generated
	 * @ordered
	 */
	public static final int HUMAN_NAME_VALUE = 24;

	/**
	 * The '<em><b>Identifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier
	 * <!-- end-model-doc -->
	 * @see #IDENTIFIER
	 * @model name="Identifier"
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIER_VALUE = 25;

	/**
	 * The '<em><b>Meta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Meta
	 * <!-- end-model-doc -->
	 * @see #META
	 * @model name="Meta"
	 * @generated
	 * @ordered
	 */
	public static final int META_VALUE = 26;

	/**
	 * The '<em><b>Monetary Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MonetaryComponent
	 * <!-- end-model-doc -->
	 * @see #MONETARY_COMPONENT
	 * @model name="MonetaryComponent"
	 * @generated
	 * @ordered
	 */
	public static final int MONETARY_COMPONENT_VALUE = 27;

	/**
	 * The '<em><b>Money</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Money
	 * <!-- end-model-doc -->
	 * @see #MONEY
	 * @model name="Money"
	 * @generated
	 * @ordered
	 */
	public static final int MONEY_VALUE = 28;

	/**
	 * The '<em><b>Narrative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Narrative
	 * <!-- end-model-doc -->
	 * @see #NARRATIVE
	 * @model name="Narrative"
	 * @generated
	 * @ordered
	 */
	public static final int NARRATIVE_VALUE = 29;

	/**
	 * The '<em><b>Parameter Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ParameterDefinition
	 * <!-- end-model-doc -->
	 * @see #PARAMETER_DEFINITION
	 * @model name="ParameterDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_DEFINITION_VALUE = 30;

	/**
	 * The '<em><b>Period</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Period
	 * <!-- end-model-doc -->
	 * @see #PERIOD
	 * @model name="Period"
	 * @generated
	 * @ordered
	 */
	public static final int PERIOD_VALUE = 31;

	/**
	 * The '<em><b>Primitive Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PrimitiveType
	 * <!-- end-model-doc -->
	 * @see #PRIMITIVE_TYPE
	 * @model name="PrimitiveType"
	 * @generated
	 * @ordered
	 */
	public static final int PRIMITIVE_TYPE_VALUE = 32;

	/**
	 * The '<em><b>Base64 Binary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * base64Binary
	 * <!-- end-model-doc -->
	 * @see #BASE64_BINARY
	 * @model name="base64Binary"
	 * @generated
	 * @ordered
	 */
	public static final int BASE64_BINARY_VALUE = 33;

	/**
	 * The '<em><b>Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * boolean
	 * <!-- end-model-doc -->
	 * @see #BOOLEAN
	 * @model name="boolean"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 34;

	/**
	 * The '<em><b>Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * date
	 * <!-- end-model-doc -->
	 * @see #DATE
	 * @model name="date"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 35;

	/**
	 * The '<em><b>Date Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * dateTime
	 * <!-- end-model-doc -->
	 * @see #DATE_TIME
	 * @model name="dateTime"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_TIME_VALUE = 36;

	/**
	 * The '<em><b>Decimal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decimal
	 * <!-- end-model-doc -->
	 * @see #DECIMAL
	 * @model name="decimal"
	 * @generated
	 * @ordered
	 */
	public static final int DECIMAL_VALUE = 37;

	/**
	 * The '<em><b>Instant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * instant
	 * <!-- end-model-doc -->
	 * @see #INSTANT
	 * @model name="instant"
	 * @generated
	 * @ordered
	 */
	public static final int INSTANT_VALUE = 38;

	/**
	 * The '<em><b>Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * integer
	 * <!-- end-model-doc -->
	 * @see #INTEGER
	 * @model name="integer"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_VALUE = 39;

	/**
	 * The '<em><b>Positive Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * positiveInt
	 * <!-- end-model-doc -->
	 * @see #POSITIVE_INT
	 * @model name="positiveInt"
	 * @generated
	 * @ordered
	 */
	public static final int POSITIVE_INT_VALUE = 40;

	/**
	 * The '<em><b>Unsigned Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * unsignedInt
	 * <!-- end-model-doc -->
	 * @see #UNSIGNED_INT
	 * @model name="unsignedInt"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_INT_VALUE = 41;

	/**
	 * The '<em><b>Integer64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * integer64
	 * <!-- end-model-doc -->
	 * @see #INTEGER64
	 * @model name="integer64"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER64_VALUE = 42;

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * string
	 * <!-- end-model-doc -->
	 * @see #STRING
	 * @model name="string"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 43;

	/**
	 * The '<em><b>Code</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * code
	 * <!-- end-model-doc -->
	 * @see #CODE
	 * @model name="code"
	 * @generated
	 * @ordered
	 */
	public static final int CODE_VALUE = 44;

	/**
	 * The '<em><b>Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * id
	 * <!-- end-model-doc -->
	 * @see #ID
	 * @model name="id"
	 * @generated
	 * @ordered
	 */
	public static final int ID_VALUE = 45;

	/**
	 * The '<em><b>Markdown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * markdown
	 * <!-- end-model-doc -->
	 * @see #MARKDOWN
	 * @model name="markdown"
	 * @generated
	 * @ordered
	 */
	public static final int MARKDOWN_VALUE = 46;

	/**
	 * The '<em><b>Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * time
	 * <!-- end-model-doc -->
	 * @see #TIME
	 * @model name="time"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_VALUE = 47;

	/**
	 * The '<em><b>Uri</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * uri
	 * <!-- end-model-doc -->
	 * @see #URI
	 * @model name="uri"
	 * @generated
	 * @ordered
	 */
	public static final int URI_VALUE = 48;

	/**
	 * The '<em><b>Canonical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * canonical
	 * <!-- end-model-doc -->
	 * @see #CANONICAL
	 * @model name="canonical"
	 * @generated
	 * @ordered
	 */
	public static final int CANONICAL_VALUE = 49;

	/**
	 * The '<em><b>Oid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * oid
	 * <!-- end-model-doc -->
	 * @see #OID
	 * @model name="oid"
	 * @generated
	 * @ordered
	 */
	public static final int OID_VALUE = 50;

	/**
	 * The '<em><b>Url</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * url
	 * <!-- end-model-doc -->
	 * @see #URL
	 * @model name="url"
	 * @generated
	 * @ordered
	 */
	public static final int URL_VALUE = 51;

	/**
	 * The '<em><b>Uuid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * uuid
	 * <!-- end-model-doc -->
	 * @see #UUID
	 * @model name="uuid"
	 * @generated
	 * @ordered
	 */
	public static final int UUID_VALUE = 52;

	/**
	 * The '<em><b>Quantity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quantity
	 * <!-- end-model-doc -->
	 * @see #QUANTITY
	 * @model name="Quantity"
	 * @generated
	 * @ordered
	 */
	public static final int QUANTITY_VALUE = 53;

	/**
	 * The '<em><b>Age</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Age
	 * <!-- end-model-doc -->
	 * @see #AGE
	 * @model name="Age"
	 * @generated
	 * @ordered
	 */
	public static final int AGE_VALUE = 54;

	/**
	 * The '<em><b>Count</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Count
	 * <!-- end-model-doc -->
	 * @see #COUNT
	 * @model name="Count"
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_VALUE = 55;

	/**
	 * The '<em><b>Distance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Distance
	 * <!-- end-model-doc -->
	 * @see #DISTANCE
	 * @model name="Distance"
	 * @generated
	 * @ordered
	 */
	public static final int DISTANCE_VALUE = 56;

	/**
	 * The '<em><b>Duration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Duration
	 * <!-- end-model-doc -->
	 * @see #DURATION
	 * @model name="Duration"
	 * @generated
	 * @ordered
	 */
	public static final int DURATION_VALUE = 57;

	/**
	 * The '<em><b>Range</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Range
	 * <!-- end-model-doc -->
	 * @see #RANGE
	 * @model name="Range"
	 * @generated
	 * @ordered
	 */
	public static final int RANGE_VALUE = 58;

	/**
	 * The '<em><b>Ratio</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ratio
	 * <!-- end-model-doc -->
	 * @see #RATIO
	 * @model name="Ratio"
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_VALUE = 59;

	/**
	 * The '<em><b>Ratio Range</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RatioRange
	 * <!-- end-model-doc -->
	 * @see #RATIO_RANGE
	 * @model name="RatioRange"
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_RANGE_VALUE = 60;

	/**
	 * The '<em><b>Reference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference
	 * <!-- end-model-doc -->
	 * @see #REFERENCE
	 * @model name="Reference"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE_VALUE = 61;

	/**
	 * The '<em><b>Related Artifact</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RelatedArtifact
	 * <!-- end-model-doc -->
	 * @see #RELATED_ARTIFACT
	 * @model name="RelatedArtifact"
	 * @generated
	 * @ordered
	 */
	public static final int RELATED_ARTIFACT_VALUE = 62;

	/**
	 * The '<em><b>Sampled Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SampledData
	 * <!-- end-model-doc -->
	 * @see #SAMPLED_DATA
	 * @model name="SampledData"
	 * @generated
	 * @ordered
	 */
	public static final int SAMPLED_DATA_VALUE = 63;

	/**
	 * The '<em><b>Signature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Signature
	 * <!-- end-model-doc -->
	 * @see #SIGNATURE
	 * @model name="Signature"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNATURE_VALUE = 64;

	/**
	 * The '<em><b>Trigger Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TriggerDefinition
	 * <!-- end-model-doc -->
	 * @see #TRIGGER_DEFINITION
	 * @model name="TriggerDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int TRIGGER_DEFINITION_VALUE = 65;

	/**
	 * The '<em><b>Usage Context</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UsageContext
	 * <!-- end-model-doc -->
	 * @see #USAGE_CONTEXT
	 * @model name="UsageContext"
	 * @generated
	 * @ordered
	 */
	public static final int USAGE_CONTEXT_VALUE = 66;

	/**
	 * The '<em><b>Virtual Service Detail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VirtualServiceDetail
	 * <!-- end-model-doc -->
	 * @see #VIRTUAL_SERVICE_DETAIL
	 * @model name="VirtualServiceDetail"
	 * @generated
	 * @ordered
	 */
	public static final int VIRTUAL_SERVICE_DETAIL_VALUE = 67;

	/**
	 * The '<em><b>Xhtml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * xhtml
	 * <!-- end-model-doc -->
	 * @see #XHTML
	 * @model name="xhtml"
	 * @generated
	 * @ordered
	 */
	public static final int XHTML_VALUE = 68;

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
	public static final int RESOURCE_VALUE = 69;

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
	public static final int BINARY_VALUE = 70;

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
	public static final int BUNDLE_VALUE = 71;

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
	public static final int DOMAIN_RESOURCE_VALUE = 72;

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
	public static final int ACCOUNT_VALUE = 73;

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
	public static final int ACTIVITY_DEFINITION_VALUE = 74;

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
	public static final int ACTOR_DEFINITION_VALUE = 75;

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
	public static final int ADMINISTRABLE_PRODUCT_DEFINITION_VALUE = 76;

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
	public static final int ADVERSE_EVENT_VALUE = 77;

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
	public static final int ALLERGY_INTOLERANCE_VALUE = 78;

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
	public static final int APPOINTMENT_VALUE = 79;

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
	public static final int APPOINTMENT_RESPONSE_VALUE = 80;

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
	public static final int ARTIFACT_ASSESSMENT_VALUE = 81;

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
	public static final int AUDIT_EVENT_VALUE = 82;

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
	public static final int BASIC_VALUE = 83;

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
	public static final int BIOLOGICALLY_DERIVED_PRODUCT_VALUE = 84;

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
	public static final int BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE_VALUE = 85;

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
	public static final int BODY_STRUCTURE_VALUE = 86;

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
	public static final int CANONICAL_RESOURCE_VALUE = 87;

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
	public static final int CAPABILITY_STATEMENT_VALUE = 88;

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
	public static final int CARE_PLAN_VALUE = 89;

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
	public static final int CARE_TEAM_VALUE = 90;

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
	public static final int CHARGE_ITEM_VALUE = 91;

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
	public static final int CHARGE_ITEM_DEFINITION_VALUE = 92;

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
	public static final int CITATION_VALUE = 93;

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
	public static final int CLAIM_VALUE = 94;

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
	public static final int CLAIM_RESPONSE_VALUE = 95;

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
	public static final int CLINICAL_IMPRESSION_VALUE = 96;

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
	public static final int CLINICAL_USE_DEFINITION_VALUE = 97;

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
	public static final int CODE_SYSTEM_VALUE = 98;

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
	public static final int COMMUNICATION_VALUE = 99;

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
	public static final int COMMUNICATION_REQUEST_VALUE = 100;

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
	public static final int COMPARTMENT_DEFINITION_VALUE = 101;

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
	public static final int COMPOSITION_VALUE = 102;

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
	public static final int CONCEPT_MAP_VALUE = 103;

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
	public static final int CONDITION_VALUE = 104;

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
	public static final int CONDITION_DEFINITION_VALUE = 105;

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
	public static final int CONSENT_VALUE = 106;

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
	public static final int CONTRACT_VALUE = 107;

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
	public static final int COVERAGE_VALUE = 108;

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
	public static final int COVERAGE_ELIGIBILITY_REQUEST_VALUE = 109;

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
	public static final int COVERAGE_ELIGIBILITY_RESPONSE_VALUE = 110;

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
	public static final int DETECTED_ISSUE_VALUE = 111;

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
	public static final int DEVICE_VALUE = 112;

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
	public static final int DEVICE_ASSOCIATION_VALUE = 113;

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
	public static final int DEVICE_DEFINITION_VALUE = 114;

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
	public static final int DEVICE_DISPENSE_VALUE = 115;

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
	public static final int DEVICE_METRIC_VALUE = 116;

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
	public static final int DEVICE_REQUEST_VALUE = 117;

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
	public static final int DEVICE_USAGE_VALUE = 118;

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
	public static final int DIAGNOSTIC_REPORT_VALUE = 119;

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
	public static final int DOCUMENT_REFERENCE_VALUE = 120;

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
	public static final int ENCOUNTER_VALUE = 121;

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
	public static final int ENCOUNTER_HISTORY_VALUE = 122;

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
	public static final int ENDPOINT_VALUE = 123;

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
	public static final int ENROLLMENT_REQUEST_VALUE = 124;

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
	public static final int ENROLLMENT_RESPONSE_VALUE = 125;

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
	public static final int EPISODE_OF_CARE_VALUE = 126;

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
	public static final int EVENT_DEFINITION_VALUE = 127;

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
	public static final int EVIDENCE_VALUE = 128;

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
	public static final int EVIDENCE_REPORT_VALUE = 129;

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
	public static final int EVIDENCE_VARIABLE_VALUE = 130;

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
	public static final int EXAMPLE_SCENARIO_VALUE = 131;

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
	public static final int EXPLANATION_OF_BENEFIT_VALUE = 132;

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
	public static final int FAMILY_MEMBER_HISTORY_VALUE = 133;

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
	public static final int FLAG_VALUE = 134;

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
	public static final int FORMULARY_ITEM_VALUE = 135;

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
	public static final int GENOMIC_STUDY_VALUE = 136;

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
	public static final int GOAL_VALUE = 137;

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
	public static final int GRAPH_DEFINITION_VALUE = 138;

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
	public static final int GROUP_VALUE = 139;

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
	public static final int GUIDANCE_RESPONSE_VALUE = 140;

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
	public static final int HEALTHCARE_SERVICE_VALUE = 141;

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
	public static final int IMAGING_SELECTION_VALUE = 142;

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
	public static final int IMAGING_STUDY_VALUE = 143;

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
	public static final int IMMUNIZATION_VALUE = 144;

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
	public static final int IMMUNIZATION_EVALUATION_VALUE = 145;

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
	public static final int IMMUNIZATION_RECOMMENDATION_VALUE = 146;

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
	public static final int IMPLEMENTATION_GUIDE_VALUE = 147;

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
	public static final int INGREDIENT_VALUE = 148;

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
	public static final int INSURANCE_PLAN_VALUE = 149;

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
	public static final int INVENTORY_ITEM_VALUE = 150;

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
	public static final int INVENTORY_REPORT_VALUE = 151;

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
	public static final int INVOICE_VALUE = 152;

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
	public static final int LIBRARY_VALUE = 153;

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
	public static final int LINKAGE_VALUE = 154;

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
	public static final int LIST_VALUE = 155;

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
	public static final int LOCATION_VALUE = 156;

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
	public static final int MANUFACTURED_ITEM_DEFINITION_VALUE = 157;

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
	public static final int MEASURE_VALUE = 158;

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
	public static final int MEASURE_REPORT_VALUE = 159;

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
	public static final int MEDICATION_VALUE = 160;

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
	public static final int MEDICATION_ADMINISTRATION_VALUE = 161;

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
	public static final int MEDICATION_DISPENSE_VALUE = 162;

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
	public static final int MEDICATION_KNOWLEDGE_VALUE = 163;

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
	public static final int MEDICATION_REQUEST_VALUE = 164;

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
	public static final int MEDICATION_STATEMENT_VALUE = 165;

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
	public static final int MEDICINAL_PRODUCT_DEFINITION_VALUE = 166;

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
	public static final int MESSAGE_DEFINITION_VALUE = 167;

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
	public static final int MESSAGE_HEADER_VALUE = 168;

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
	public static final int METADATA_RESOURCE_VALUE = 169;

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
	public static final int MOLECULAR_SEQUENCE_VALUE = 170;

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
	public static final int NAMING_SYSTEM_VALUE = 171;

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
	public static final int NUTRITION_INTAKE_VALUE = 172;

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
	public static final int NUTRITION_ORDER_VALUE = 173;

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
	public static final int NUTRITION_PRODUCT_VALUE = 174;

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
	public static final int OBSERVATION_VALUE = 175;

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
	public static final int OBSERVATION_DEFINITION_VALUE = 176;

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
	public static final int OPERATION_DEFINITION_VALUE = 177;

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
	public static final int OPERATION_OUTCOME_VALUE = 178;

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
	public static final int ORGANIZATION_VALUE = 179;

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
	public static final int ORGANIZATION_AFFILIATION_VALUE = 180;

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
	public static final int PACKAGED_PRODUCT_DEFINITION_VALUE = 181;

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
	public static final int PATIENT_VALUE = 182;

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
	public static final int PAYMENT_NOTICE_VALUE = 183;

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
	public static final int PAYMENT_RECONCILIATION_VALUE = 184;

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
	public static final int PERMISSION_VALUE = 185;

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
	public static final int PERSON_VALUE = 186;

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
	public static final int PLAN_DEFINITION_VALUE = 187;

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
	public static final int PRACTITIONER_VALUE = 188;

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
	public static final int PRACTITIONER_ROLE_VALUE = 189;

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
	public static final int PROCEDURE_VALUE = 190;

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
	public static final int PROVENANCE_VALUE = 191;

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
	public static final int QUESTIONNAIRE_VALUE = 192;

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
	public static final int QUESTIONNAIRE_RESPONSE_VALUE = 193;

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
	public static final int REGULATED_AUTHORIZATION_VALUE = 194;

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
	public static final int RELATED_PERSON_VALUE = 195;

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
	public static final int REQUEST_ORCHESTRATION_VALUE = 196;

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
	public static final int REQUIREMENTS_VALUE = 197;

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
	public static final int RESEARCH_STUDY_VALUE = 198;

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
	public static final int RESEARCH_SUBJECT_VALUE = 199;

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
	public static final int RISK_ASSESSMENT_VALUE = 200;

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
	public static final int SCHEDULE_VALUE = 201;

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
	public static final int SEARCH_PARAMETER_VALUE = 202;

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
	public static final int SERVICE_REQUEST_VALUE = 203;

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
	public static final int SLOT_VALUE = 204;

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
	public static final int SPECIMEN_VALUE = 205;

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
	public static final int SPECIMEN_DEFINITION_VALUE = 206;

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
	public static final int STRUCTURE_DEFINITION_VALUE = 207;

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
	public static final int STRUCTURE_MAP_VALUE = 208;

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
	public static final int SUBSCRIPTION_VALUE = 209;

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
	public static final int SUBSCRIPTION_STATUS_VALUE = 210;

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
	public static final int SUBSCRIPTION_TOPIC_VALUE = 211;

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
	public static final int SUBSTANCE_VALUE = 212;

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
	public static final int SUBSTANCE_DEFINITION_VALUE = 213;

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
	public static final int SUBSTANCE_NUCLEIC_ACID_VALUE = 214;

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
	public static final int SUBSTANCE_POLYMER_VALUE = 215;

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
	public static final int SUBSTANCE_PROTEIN_VALUE = 216;

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
	public static final int SUBSTANCE_REFERENCE_INFORMATION_VALUE = 217;

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
	public static final int SUBSTANCE_SOURCE_MATERIAL_VALUE = 218;

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
	public static final int SUPPLY_DELIVERY_VALUE = 219;

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
	public static final int SUPPLY_REQUEST_VALUE = 220;

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
	public static final int TASK_VALUE = 221;

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
	public static final int TERMINOLOGY_CAPABILITIES_VALUE = 222;

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
	public static final int TEST_PLAN_VALUE = 223;

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
	public static final int TEST_REPORT_VALUE = 224;

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
	public static final int TEST_SCRIPT_VALUE = 225;

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
	public static final int TRANSPORT_VALUE = 226;

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
	public static final int VALUE_SET_VALUE = 227;

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
	public static final int VERIFICATION_RESULT_VALUE = 228;

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
	public static final int VISION_PRESCRIPTION_VALUE = 229;

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
	public static final int PARAMETERS_VALUE = 230;

	/**
	 * An array of all the '<em><b>FHIR Types Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FHIRTypesEnum[] VALUES_ARRAY =
		new FHIRTypesEnum[] {
			BASE,
			ELEMENT,
			BACKBONE_ELEMENT,
			DATA_TYPE,
			ADDRESS,
			ANNOTATION,
			ATTACHMENT,
			AVAILABILITY,
			BACKBONE_TYPE,
			DOSAGE,
			ELEMENT_DEFINITION,
			MARKETING_STATUS,
			PRODUCT_SHELF_LIFE,
			TIMING,
			CODEABLE_CONCEPT,
			CODEABLE_REFERENCE,
			CODING,
			CONTACT_DETAIL,
			CONTACT_POINT,
			CONTRIBUTOR,
			DATA_REQUIREMENT,
			EXPRESSION,
			EXTENDED_CONTACT_DETAIL,
			EXTENSION,
			HUMAN_NAME,
			IDENTIFIER,
			META,
			MONETARY_COMPONENT,
			MONEY,
			NARRATIVE,
			PARAMETER_DEFINITION,
			PERIOD,
			PRIMITIVE_TYPE,
			BASE64_BINARY,
			BOOLEAN,
			DATE,
			DATE_TIME,
			DECIMAL,
			INSTANT,
			INTEGER,
			POSITIVE_INT,
			UNSIGNED_INT,
			INTEGER64,
			STRING,
			CODE,
			ID,
			MARKDOWN,
			TIME,
			URI,
			CANONICAL,
			OID,
			URL,
			UUID,
			QUANTITY,
			AGE,
			COUNT,
			DISTANCE,
			DURATION,
			RANGE,
			RATIO,
			RATIO_RANGE,
			REFERENCE,
			RELATED_ARTIFACT,
			SAMPLED_DATA,
			SIGNATURE,
			TRIGGER_DEFINITION,
			USAGE_CONTEXT,
			VIRTUAL_SERVICE_DETAIL,
			XHTML,
			RESOURCE,
			BINARY,
			BUNDLE,
			DOMAIN_RESOURCE,
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
			BIOLOGICALLY_DERIVED_PRODUCT,
			BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE,
			BODY_STRUCTURE,
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
			PARAMETERS,
		};

	/**
	 * A public read-only list of all the '<em><b>FHIR Types Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FHIRTypesEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>FHIR Types Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FHIRTypesEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FHIRTypesEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FHIR Types Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FHIRTypesEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FHIRTypesEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FHIR Types Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FHIRTypesEnum get(int value) {
		switch (value) {
			case BASE_VALUE: return BASE;
			case ELEMENT_VALUE: return ELEMENT;
			case BACKBONE_ELEMENT_VALUE: return BACKBONE_ELEMENT;
			case DATA_TYPE_VALUE: return DATA_TYPE;
			case ADDRESS_VALUE: return ADDRESS;
			case ANNOTATION_VALUE: return ANNOTATION;
			case ATTACHMENT_VALUE: return ATTACHMENT;
			case AVAILABILITY_VALUE: return AVAILABILITY;
			case BACKBONE_TYPE_VALUE: return BACKBONE_TYPE;
			case DOSAGE_VALUE: return DOSAGE;
			case ELEMENT_DEFINITION_VALUE: return ELEMENT_DEFINITION;
			case MARKETING_STATUS_VALUE: return MARKETING_STATUS;
			case PRODUCT_SHELF_LIFE_VALUE: return PRODUCT_SHELF_LIFE;
			case TIMING_VALUE: return TIMING;
			case CODEABLE_CONCEPT_VALUE: return CODEABLE_CONCEPT;
			case CODEABLE_REFERENCE_VALUE: return CODEABLE_REFERENCE;
			case CODING_VALUE: return CODING;
			case CONTACT_DETAIL_VALUE: return CONTACT_DETAIL;
			case CONTACT_POINT_VALUE: return CONTACT_POINT;
			case CONTRIBUTOR_VALUE: return CONTRIBUTOR;
			case DATA_REQUIREMENT_VALUE: return DATA_REQUIREMENT;
			case EXPRESSION_VALUE: return EXPRESSION;
			case EXTENDED_CONTACT_DETAIL_VALUE: return EXTENDED_CONTACT_DETAIL;
			case EXTENSION_VALUE: return EXTENSION;
			case HUMAN_NAME_VALUE: return HUMAN_NAME;
			case IDENTIFIER_VALUE: return IDENTIFIER;
			case META_VALUE: return META;
			case MONETARY_COMPONENT_VALUE: return MONETARY_COMPONENT;
			case MONEY_VALUE: return MONEY;
			case NARRATIVE_VALUE: return NARRATIVE;
			case PARAMETER_DEFINITION_VALUE: return PARAMETER_DEFINITION;
			case PERIOD_VALUE: return PERIOD;
			case PRIMITIVE_TYPE_VALUE: return PRIMITIVE_TYPE;
			case BASE64_BINARY_VALUE: return BASE64_BINARY;
			case BOOLEAN_VALUE: return BOOLEAN;
			case DATE_VALUE: return DATE;
			case DATE_TIME_VALUE: return DATE_TIME;
			case DECIMAL_VALUE: return DECIMAL;
			case INSTANT_VALUE: return INSTANT;
			case INTEGER_VALUE: return INTEGER;
			case POSITIVE_INT_VALUE: return POSITIVE_INT;
			case UNSIGNED_INT_VALUE: return UNSIGNED_INT;
			case INTEGER64_VALUE: return INTEGER64;
			case STRING_VALUE: return STRING;
			case CODE_VALUE: return CODE;
			case ID_VALUE: return ID;
			case MARKDOWN_VALUE: return MARKDOWN;
			case TIME_VALUE: return TIME;
			case URI_VALUE: return URI;
			case CANONICAL_VALUE: return CANONICAL;
			case OID_VALUE: return OID;
			case URL_VALUE: return URL;
			case UUID_VALUE: return UUID;
			case QUANTITY_VALUE: return QUANTITY;
			case AGE_VALUE: return AGE;
			case COUNT_VALUE: return COUNT;
			case DISTANCE_VALUE: return DISTANCE;
			case DURATION_VALUE: return DURATION;
			case RANGE_VALUE: return RANGE;
			case RATIO_VALUE: return RATIO;
			case RATIO_RANGE_VALUE: return RATIO_RANGE;
			case REFERENCE_VALUE: return REFERENCE;
			case RELATED_ARTIFACT_VALUE: return RELATED_ARTIFACT;
			case SAMPLED_DATA_VALUE: return SAMPLED_DATA;
			case SIGNATURE_VALUE: return SIGNATURE;
			case TRIGGER_DEFINITION_VALUE: return TRIGGER_DEFINITION;
			case USAGE_CONTEXT_VALUE: return USAGE_CONTEXT;
			case VIRTUAL_SERVICE_DETAIL_VALUE: return VIRTUAL_SERVICE_DETAIL;
			case XHTML_VALUE: return XHTML;
			case RESOURCE_VALUE: return RESOURCE;
			case BINARY_VALUE: return BINARY;
			case BUNDLE_VALUE: return BUNDLE;
			case DOMAIN_RESOURCE_VALUE: return DOMAIN_RESOURCE;
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
			case BIOLOGICALLY_DERIVED_PRODUCT_VALUE: return BIOLOGICALLY_DERIVED_PRODUCT;
			case BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE_VALUE: return BIOLOGICALLY_DERIVED_PRODUCT_DISPENSE;
			case BODY_STRUCTURE_VALUE: return BODY_STRUCTURE;
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
			case PARAMETERS_VALUE: return PARAMETERS;
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
	private FHIRTypesEnum(int value, String name, String literal) {
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
	
} //FHIRTypesEnum
