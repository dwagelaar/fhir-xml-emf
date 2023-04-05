/**
 */
package org.hl7.emf.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Related Artifact Type Expanded Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.emf.fhir.FhirPackage#getRelatedArtifactTypeExpandedEnum()
 * @model extendedMetaData="name='RelatedArtifactTypeExpandedEnum'"
 * @generated
 */
public enum RelatedArtifactTypeExpandedEnum implements Enumerator {
	/**
	 * The '<em><b>Documentation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Documentation
	 * <!-- end-model-doc -->
	 * @see #DOCUMENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENTATION(0, "documentation", "documentation"),

	/**
	 * The '<em><b>Justification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Justification
	 * <!-- end-model-doc -->
	 * @see #JUSTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	JUSTIFICATION(1, "justification", "justification"),

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
	CITATION(2, "citation", "citation"),

	/**
	 * The '<em><b>Predecessor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Predecessor
	 * <!-- end-model-doc -->
	 * @see #PREDECESSOR_VALUE
	 * @generated
	 * @ordered
	 */
	PREDECESSOR(3, "predecessor", "predecessor"),

	/**
	 * The '<em><b>Successor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Successor
	 * <!-- end-model-doc -->
	 * @see #SUCCESSOR_VALUE
	 * @generated
	 * @ordered
	 */
	SUCCESSOR(4, "successor", "successor"),

	/**
	 * The '<em><b>Derived From</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derived From
	 * <!-- end-model-doc -->
	 * @see #DERIVED_FROM_VALUE
	 * @generated
	 * @ordered
	 */
	DERIVED_FROM(5, "derivedFrom", "derived-from"),

	/**
	 * The '<em><b>Depends On</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Depends On
	 * <!-- end-model-doc -->
	 * @see #DEPENDS_ON_VALUE
	 * @generated
	 * @ordered
	 */
	DEPENDS_ON(6, "dependsOn", "depends-on"),

	/**
	 * The '<em><b>Composed Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Composed Of
	 * <!-- end-model-doc -->
	 * @see #COMPOSED_OF_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOSED_OF(7, "composedOf", "composed-of"),

	/**
	 * The '<em><b>Part Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Part Of
	 * <!-- end-model-doc -->
	 * @see #PART_OF_VALUE
	 * @generated
	 * @ordered
	 */
	PART_OF(8, "partOf", "part-of"),

	/**
	 * The '<em><b>Amends</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amends
	 * <!-- end-model-doc -->
	 * @see #AMENDS_VALUE
	 * @generated
	 * @ordered
	 */
	AMENDS(9, "amends", "amends"),

	/**
	 * The '<em><b>Amended With</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amended With
	 * <!-- end-model-doc -->
	 * @see #AMENDED_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	AMENDED_WITH(10, "amendedWith", "amended-with"),

	/**
	 * The '<em><b>Appends</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appends
	 * <!-- end-model-doc -->
	 * @see #APPENDS_VALUE
	 * @generated
	 * @ordered
	 */
	APPENDS(11, "appends", "appends"),

	/**
	 * The '<em><b>Appended With</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appended With
	 * <!-- end-model-doc -->
	 * @see #APPENDED_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	APPENDED_WITH(12, "appendedWith", "appended-with"),

	/**
	 * The '<em><b>Cites</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cites
	 * <!-- end-model-doc -->
	 * @see #CITES_VALUE
	 * @generated
	 * @ordered
	 */
	CITES(13, "cites", "cites"),

	/**
	 * The '<em><b>Cited By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cited By
	 * <!-- end-model-doc -->
	 * @see #CITED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	CITED_BY(14, "citedBy", "cited-by"),

	/**
	 * The '<em><b>Comments On</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is Comment On
	 * <!-- end-model-doc -->
	 * @see #COMMENTS_ON_VALUE
	 * @generated
	 * @ordered
	 */
	COMMENTS_ON(15, "commentsOn", "comments-on"),

	/**
	 * The '<em><b>Comment In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Has Comment In
	 * <!-- end-model-doc -->
	 * @see #COMMENT_IN_VALUE
	 * @generated
	 * @ordered
	 */
	COMMENT_IN(16, "commentIn", "comment-in"),

	/**
	 * The '<em><b>Contains</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains
	 * <!-- end-model-doc -->
	 * @see #CONTAINS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINS(17, "contains", "contains"),

	/**
	 * The '<em><b>Contained In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contained In
	 * <!-- end-model-doc -->
	 * @see #CONTAINED_IN_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINED_IN(18, "containedIn", "contained-in"),

	/**
	 * The '<em><b>Corrects</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Corrects
	 * <!-- end-model-doc -->
	 * @see #CORRECTS_VALUE
	 * @generated
	 * @ordered
	 */
	CORRECTS(19, "corrects", "corrects"),

	/**
	 * The '<em><b>Correction In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Correction In
	 * <!-- end-model-doc -->
	 * @see #CORRECTION_IN_VALUE
	 * @generated
	 * @ordered
	 */
	CORRECTION_IN(20, "correctionIn", "correction-in"),

	/**
	 * The '<em><b>Replaces</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Replaces
	 * <!-- end-model-doc -->
	 * @see #REPLACES_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACES(21, "replaces", "replaces"),

	/**
	 * The '<em><b>Replaced With</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Replaced With
	 * <!-- end-model-doc -->
	 * @see #REPLACED_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACED_WITH(22, "replacedWith", "replaced-with"),

	/**
	 * The '<em><b>Retracts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retracts
	 * <!-- end-model-doc -->
	 * @see #RETRACTS_VALUE
	 * @generated
	 * @ordered
	 */
	RETRACTS(23, "retracts", "retracts"),

	/**
	 * The '<em><b>Retracted By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retracted By
	 * <!-- end-model-doc -->
	 * @see #RETRACTED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	RETRACTED_BY(24, "retractedBy", "retracted-by"),

	/**
	 * The '<em><b>Signs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Signs
	 * <!-- end-model-doc -->
	 * @see #SIGNS_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNS(25, "signs", "signs"),

	/**
	 * The '<em><b>Similar To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Similar To
	 * <!-- end-model-doc -->
	 * @see #SIMILAR_TO_VALUE
	 * @generated
	 * @ordered
	 */
	SIMILAR_TO(26, "similarTo", "similar-to"),

	/**
	 * The '<em><b>Supports</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supports
	 * <!-- end-model-doc -->
	 * @see #SUPPORTS_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPORTS(27, "supports", "supports"),

	/**
	 * The '<em><b>Supported With</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supported With
	 * <!-- end-model-doc -->
	 * @see #SUPPORTED_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPORTED_WITH(28, "supportedWith", "supported-with"),

	/**
	 * The '<em><b>Transforms</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transforms
	 * <!-- end-model-doc -->
	 * @see #TRANSFORMS_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFORMS(29, "transforms", "transforms"),

	/**
	 * The '<em><b>Transformed Into</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transformed Into
	 * <!-- end-model-doc -->
	 * @see #TRANSFORMED_INTO_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFORMED_INTO(30, "transformedInto", "transformed-into"),

	/**
	 * The '<em><b>Transformed With</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transformed With
	 * <!-- end-model-doc -->
	 * @see #TRANSFORMED_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFORMED_WITH(31, "transformedWith", "transformed-with"),

	/**
	 * The '<em><b>Documents</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Documents
	 * <!-- end-model-doc -->
	 * @see #DOCUMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENTS(32, "documents", "documents"),

	/**
	 * The '<em><b>Specification Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification Of
	 * <!-- end-model-doc -->
	 * @see #SPECIFICATION_OF_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIFICATION_OF(33, "specificationOf", "specification-of"),

	/**
	 * The '<em><b>Created With</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Created With
	 * <!-- end-model-doc -->
	 * @see #CREATED_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	CREATED_WITH(34, "createdWith", "created-with"),

	/**
	 * The '<em><b>Cite As</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cite As
	 * <!-- end-model-doc -->
	 * @see #CITE_AS_VALUE
	 * @generated
	 * @ordered
	 */
	CITE_AS(35, "citeAs", "cite-as"),

	/**
	 * The '<em><b>Reprint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reprint
	 * <!-- end-model-doc -->
	 * @see #REPRINT_VALUE
	 * @generated
	 * @ordered
	 */
	REPRINT(36, "reprint", "reprint"),

	/**
	 * The '<em><b>Reprint Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reprint Of
	 * <!-- end-model-doc -->
	 * @see #REPRINT_OF_VALUE
	 * @generated
	 * @ordered
	 */
	REPRINT_OF(37, "reprintOf", "reprint-of");

	/**
	 * The '<em><b>Documentation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Documentation
	 * <!-- end-model-doc -->
	 * @see #DOCUMENTATION
	 * @model name="documentation"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENTATION_VALUE = 0;

	/**
	 * The '<em><b>Justification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Justification
	 * <!-- end-model-doc -->
	 * @see #JUSTIFICATION
	 * @model name="justification"
	 * @generated
	 * @ordered
	 */
	public static final int JUSTIFICATION_VALUE = 1;

	/**
	 * The '<em><b>Citation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Citation
	 * <!-- end-model-doc -->
	 * @see #CITATION
	 * @model name="citation"
	 * @generated
	 * @ordered
	 */
	public static final int CITATION_VALUE = 2;

	/**
	 * The '<em><b>Predecessor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Predecessor
	 * <!-- end-model-doc -->
	 * @see #PREDECESSOR
	 * @model name="predecessor"
	 * @generated
	 * @ordered
	 */
	public static final int PREDECESSOR_VALUE = 3;

	/**
	 * The '<em><b>Successor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Successor
	 * <!-- end-model-doc -->
	 * @see #SUCCESSOR
	 * @model name="successor"
	 * @generated
	 * @ordered
	 */
	public static final int SUCCESSOR_VALUE = 4;

	/**
	 * The '<em><b>Derived From</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derived From
	 * <!-- end-model-doc -->
	 * @see #DERIVED_FROM
	 * @model name="derivedFrom" literal="derived-from"
	 * @generated
	 * @ordered
	 */
	public static final int DERIVED_FROM_VALUE = 5;

	/**
	 * The '<em><b>Depends On</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Depends On
	 * <!-- end-model-doc -->
	 * @see #DEPENDS_ON
	 * @model name="dependsOn" literal="depends-on"
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDS_ON_VALUE = 6;

	/**
	 * The '<em><b>Composed Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Composed Of
	 * <!-- end-model-doc -->
	 * @see #COMPOSED_OF
	 * @model name="composedOf" literal="composed-of"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSED_OF_VALUE = 7;

	/**
	 * The '<em><b>Part Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Part Of
	 * <!-- end-model-doc -->
	 * @see #PART_OF
	 * @model name="partOf" literal="part-of"
	 * @generated
	 * @ordered
	 */
	public static final int PART_OF_VALUE = 8;

	/**
	 * The '<em><b>Amends</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amends
	 * <!-- end-model-doc -->
	 * @see #AMENDS
	 * @model name="amends"
	 * @generated
	 * @ordered
	 */
	public static final int AMENDS_VALUE = 9;

	/**
	 * The '<em><b>Amended With</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amended With
	 * <!-- end-model-doc -->
	 * @see #AMENDED_WITH
	 * @model name="amendedWith" literal="amended-with"
	 * @generated
	 * @ordered
	 */
	public static final int AMENDED_WITH_VALUE = 10;

	/**
	 * The '<em><b>Appends</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appends
	 * <!-- end-model-doc -->
	 * @see #APPENDS
	 * @model name="appends"
	 * @generated
	 * @ordered
	 */
	public static final int APPENDS_VALUE = 11;

	/**
	 * The '<em><b>Appended With</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appended With
	 * <!-- end-model-doc -->
	 * @see #APPENDED_WITH
	 * @model name="appendedWith" literal="appended-with"
	 * @generated
	 * @ordered
	 */
	public static final int APPENDED_WITH_VALUE = 12;

	/**
	 * The '<em><b>Cites</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cites
	 * <!-- end-model-doc -->
	 * @see #CITES
	 * @model name="cites"
	 * @generated
	 * @ordered
	 */
	public static final int CITES_VALUE = 13;

	/**
	 * The '<em><b>Cited By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cited By
	 * <!-- end-model-doc -->
	 * @see #CITED_BY
	 * @model name="citedBy" literal="cited-by"
	 * @generated
	 * @ordered
	 */
	public static final int CITED_BY_VALUE = 14;

	/**
	 * The '<em><b>Comments On</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is Comment On
	 * <!-- end-model-doc -->
	 * @see #COMMENTS_ON
	 * @model name="commentsOn" literal="comments-on"
	 * @generated
	 * @ordered
	 */
	public static final int COMMENTS_ON_VALUE = 15;

	/**
	 * The '<em><b>Comment In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Has Comment In
	 * <!-- end-model-doc -->
	 * @see #COMMENT_IN
	 * @model name="commentIn" literal="comment-in"
	 * @generated
	 * @ordered
	 */
	public static final int COMMENT_IN_VALUE = 16;

	/**
	 * The '<em><b>Contains</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains
	 * <!-- end-model-doc -->
	 * @see #CONTAINS
	 * @model name="contains"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINS_VALUE = 17;

	/**
	 * The '<em><b>Contained In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contained In
	 * <!-- end-model-doc -->
	 * @see #CONTAINED_IN
	 * @model name="containedIn" literal="contained-in"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINED_IN_VALUE = 18;

	/**
	 * The '<em><b>Corrects</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Corrects
	 * <!-- end-model-doc -->
	 * @see #CORRECTS
	 * @model name="corrects"
	 * @generated
	 * @ordered
	 */
	public static final int CORRECTS_VALUE = 19;

	/**
	 * The '<em><b>Correction In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Correction In
	 * <!-- end-model-doc -->
	 * @see #CORRECTION_IN
	 * @model name="correctionIn" literal="correction-in"
	 * @generated
	 * @ordered
	 */
	public static final int CORRECTION_IN_VALUE = 20;

	/**
	 * The '<em><b>Replaces</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Replaces
	 * <!-- end-model-doc -->
	 * @see #REPLACES
	 * @model name="replaces"
	 * @generated
	 * @ordered
	 */
	public static final int REPLACES_VALUE = 21;

	/**
	 * The '<em><b>Replaced With</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Replaced With
	 * <!-- end-model-doc -->
	 * @see #REPLACED_WITH
	 * @model name="replacedWith" literal="replaced-with"
	 * @generated
	 * @ordered
	 */
	public static final int REPLACED_WITH_VALUE = 22;

	/**
	 * The '<em><b>Retracts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retracts
	 * <!-- end-model-doc -->
	 * @see #RETRACTS
	 * @model name="retracts"
	 * @generated
	 * @ordered
	 */
	public static final int RETRACTS_VALUE = 23;

	/**
	 * The '<em><b>Retracted By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retracted By
	 * <!-- end-model-doc -->
	 * @see #RETRACTED_BY
	 * @model name="retractedBy" literal="retracted-by"
	 * @generated
	 * @ordered
	 */
	public static final int RETRACTED_BY_VALUE = 24;

	/**
	 * The '<em><b>Signs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Signs
	 * <!-- end-model-doc -->
	 * @see #SIGNS
	 * @model name="signs"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNS_VALUE = 25;

	/**
	 * The '<em><b>Similar To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Similar To
	 * <!-- end-model-doc -->
	 * @see #SIMILAR_TO
	 * @model name="similarTo" literal="similar-to"
	 * @generated
	 * @ordered
	 */
	public static final int SIMILAR_TO_VALUE = 26;

	/**
	 * The '<em><b>Supports</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supports
	 * <!-- end-model-doc -->
	 * @see #SUPPORTS
	 * @model name="supports"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPORTS_VALUE = 27;

	/**
	 * The '<em><b>Supported With</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supported With
	 * <!-- end-model-doc -->
	 * @see #SUPPORTED_WITH
	 * @model name="supportedWith" literal="supported-with"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPORTED_WITH_VALUE = 28;

	/**
	 * The '<em><b>Transforms</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transforms
	 * <!-- end-model-doc -->
	 * @see #TRANSFORMS
	 * @model name="transforms"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMS_VALUE = 29;

	/**
	 * The '<em><b>Transformed Into</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transformed Into
	 * <!-- end-model-doc -->
	 * @see #TRANSFORMED_INTO
	 * @model name="transformedInto" literal="transformed-into"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMED_INTO_VALUE = 30;

	/**
	 * The '<em><b>Transformed With</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transformed With
	 * <!-- end-model-doc -->
	 * @see #TRANSFORMED_WITH
	 * @model name="transformedWith" literal="transformed-with"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMED_WITH_VALUE = 31;

	/**
	 * The '<em><b>Documents</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Documents
	 * <!-- end-model-doc -->
	 * @see #DOCUMENTS
	 * @model name="documents"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENTS_VALUE = 32;

	/**
	 * The '<em><b>Specification Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification Of
	 * <!-- end-model-doc -->
	 * @see #SPECIFICATION_OF
	 * @model name="specificationOf" literal="specification-of"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION_OF_VALUE = 33;

	/**
	 * The '<em><b>Created With</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Created With
	 * <!-- end-model-doc -->
	 * @see #CREATED_WITH
	 * @model name="createdWith" literal="created-with"
	 * @generated
	 * @ordered
	 */
	public static final int CREATED_WITH_VALUE = 34;

	/**
	 * The '<em><b>Cite As</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cite As
	 * <!-- end-model-doc -->
	 * @see #CITE_AS
	 * @model name="citeAs" literal="cite-as"
	 * @generated
	 * @ordered
	 */
	public static final int CITE_AS_VALUE = 35;

	/**
	 * The '<em><b>Reprint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reprint
	 * <!-- end-model-doc -->
	 * @see #REPRINT
	 * @model name="reprint"
	 * @generated
	 * @ordered
	 */
	public static final int REPRINT_VALUE = 36;

	/**
	 * The '<em><b>Reprint Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reprint Of
	 * <!-- end-model-doc -->
	 * @see #REPRINT_OF
	 * @model name="reprintOf" literal="reprint-of"
	 * @generated
	 * @ordered
	 */
	public static final int REPRINT_OF_VALUE = 37;

	/**
	 * An array of all the '<em><b>Related Artifact Type Expanded Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelatedArtifactTypeExpandedEnum[] VALUES_ARRAY =
		new RelatedArtifactTypeExpandedEnum[] {
			DOCUMENTATION,
			JUSTIFICATION,
			CITATION,
			PREDECESSOR,
			SUCCESSOR,
			DERIVED_FROM,
			DEPENDS_ON,
			COMPOSED_OF,
			PART_OF,
			AMENDS,
			AMENDED_WITH,
			APPENDS,
			APPENDED_WITH,
			CITES,
			CITED_BY,
			COMMENTS_ON,
			COMMENT_IN,
			CONTAINS,
			CONTAINED_IN,
			CORRECTS,
			CORRECTION_IN,
			REPLACES,
			REPLACED_WITH,
			RETRACTS,
			RETRACTED_BY,
			SIGNS,
			SIMILAR_TO,
			SUPPORTS,
			SUPPORTED_WITH,
			TRANSFORMS,
			TRANSFORMED_INTO,
			TRANSFORMED_WITH,
			DOCUMENTS,
			SPECIFICATION_OF,
			CREATED_WITH,
			CITE_AS,
			REPRINT,
			REPRINT_OF,
		};

	/**
	 * A public read-only list of all the '<em><b>Related Artifact Type Expanded Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelatedArtifactTypeExpandedEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Related Artifact Type Expanded Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelatedArtifactTypeExpandedEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelatedArtifactTypeExpandedEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Related Artifact Type Expanded Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelatedArtifactTypeExpandedEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelatedArtifactTypeExpandedEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Related Artifact Type Expanded Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelatedArtifactTypeExpandedEnum get(int value) {
		switch (value) {
			case DOCUMENTATION_VALUE: return DOCUMENTATION;
			case JUSTIFICATION_VALUE: return JUSTIFICATION;
			case CITATION_VALUE: return CITATION;
			case PREDECESSOR_VALUE: return PREDECESSOR;
			case SUCCESSOR_VALUE: return SUCCESSOR;
			case DERIVED_FROM_VALUE: return DERIVED_FROM;
			case DEPENDS_ON_VALUE: return DEPENDS_ON;
			case COMPOSED_OF_VALUE: return COMPOSED_OF;
			case PART_OF_VALUE: return PART_OF;
			case AMENDS_VALUE: return AMENDS;
			case AMENDED_WITH_VALUE: return AMENDED_WITH;
			case APPENDS_VALUE: return APPENDS;
			case APPENDED_WITH_VALUE: return APPENDED_WITH;
			case CITES_VALUE: return CITES;
			case CITED_BY_VALUE: return CITED_BY;
			case COMMENTS_ON_VALUE: return COMMENTS_ON;
			case COMMENT_IN_VALUE: return COMMENT_IN;
			case CONTAINS_VALUE: return CONTAINS;
			case CONTAINED_IN_VALUE: return CONTAINED_IN;
			case CORRECTS_VALUE: return CORRECTS;
			case CORRECTION_IN_VALUE: return CORRECTION_IN;
			case REPLACES_VALUE: return REPLACES;
			case REPLACED_WITH_VALUE: return REPLACED_WITH;
			case RETRACTS_VALUE: return RETRACTS;
			case RETRACTED_BY_VALUE: return RETRACTED_BY;
			case SIGNS_VALUE: return SIGNS;
			case SIMILAR_TO_VALUE: return SIMILAR_TO;
			case SUPPORTS_VALUE: return SUPPORTS;
			case SUPPORTED_WITH_VALUE: return SUPPORTED_WITH;
			case TRANSFORMS_VALUE: return TRANSFORMS;
			case TRANSFORMED_INTO_VALUE: return TRANSFORMED_INTO;
			case TRANSFORMED_WITH_VALUE: return TRANSFORMED_WITH;
			case DOCUMENTS_VALUE: return DOCUMENTS;
			case SPECIFICATION_OF_VALUE: return SPECIFICATION_OF;
			case CREATED_WITH_VALUE: return CREATED_WITH;
			case CITE_AS_VALUE: return CITE_AS;
			case REPRINT_VALUE: return REPRINT;
			case REPRINT_OF_VALUE: return REPRINT_OF;
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
	private RelatedArtifactTypeExpandedEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //RelatedArtifactTypeExpandedEnum
