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
 * A representation of the literals of the enumeration '<em><b>Link Relation Types Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getLinkRelationTypesEnum()
 * @model extendedMetaData="name='LinkRelationTypesEnum'"
 * @generated
 */
public enum LinkRelationTypesEnum implements Enumerator {
	/**
	 * The '<em><b>About</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource that is the subject of the link's context.
	 * <!-- end-model-doc -->
	 * @see #ABOUT_VALUE
	 * @generated
	 * @ordered
	 */
	ABOUT(0, "about", "about"),

	/**
	 * The '<em><b>Acl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Asserts that the link target provides an access control description for the link context.
	 * <!-- end-model-doc -->
	 * @see #ACL_VALUE
	 * @generated
	 * @ordered
	 */
	ACL(1, "acl", "acl"),

	/**
	 * The '<em><b>Alternate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a substitute for this context
	 * <!-- end-model-doc -->
	 * @see #ALTERNATE_VALUE
	 * @generated
	 * @ordered
	 */
	ALTERNATE(2, "alternate", "alternate"),

	/**
	 * The '<em><b>Amphtml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to reference alternative content that uses the AMP profile of the HTML format.
	 * <!-- end-model-doc -->
	 * @see #AMPHTML_VALUE
	 * @generated
	 * @ordered
	 */
	AMPHTML(3, "amphtml", "amphtml"),

	/**
	 * The '<em><b>Appendix</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to an appendix.
	 * <!-- end-model-doc -->
	 * @see #APPENDIX_VALUE
	 * @generated
	 * @ordered
	 */
	APPENDIX(4, "appendix", "appendix"),

	/**
	 * The '<em><b>Apple Touch Icon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to an icon for the context. Synonym for icon.
	 * <!-- end-model-doc -->
	 * @see #APPLE_TOUCH_ICON_VALUE
	 * @generated
	 * @ordered
	 */
	APPLE_TOUCH_ICON(5, "appleTouchIcon", "apple-touch-icon"),

	/**
	 * The '<em><b>Apple Touch Startup Image</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a launch screen for the context.
	 * <!-- end-model-doc -->
	 * @see #APPLE_TOUCH_STARTUP_IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	APPLE_TOUCH_STARTUP_IMAGE(6, "appleTouchStartupImage", "apple-touch-startup-image"),

	/**
	 * The '<em><b>Archives</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a collection of records, documents, or other
	 *       materials of historical interest.
	 * <!-- end-model-doc -->
	 * @see #ARCHIVES_VALUE
	 * @generated
	 * @ordered
	 */
	ARCHIVES(7, "archives", "archives"),

	/**
	 * The '<em><b>Author</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the context's author.
	 * <!-- end-model-doc -->
	 * @see #AUTHOR_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHOR(8, "author", "author"),

	/**
	 * The '<em><b>Blocked By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the entity that blocks access to a resource
	 *       following receipt of a legal demand.
	 * <!-- end-model-doc -->
	 * @see #BLOCKED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	BLOCKED_BY(9, "blockedBy", "blocked-by"),

	/**
	 * The '<em><b>Bookmark</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gives a permanent link to use for bookmarking purposes.
	 * <!-- end-model-doc -->
	 * @see #BOOKMARK_VALUE
	 * @generated
	 * @ordered
	 */
	BOOKMARK(10, "bookmark", "bookmark"),

	/**
	 * The '<em><b>Canonical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designates the preferred version of a resource (the IRI and its contents).
	 * <!-- end-model-doc -->
	 * @see #CANONICAL_VALUE
	 * @generated
	 * @ordered
	 */
	CANONICAL(11, "canonical", "canonical"),

	/**
	 * The '<em><b>Chapter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a chapter in a collection of resources.
	 * <!-- end-model-doc -->
	 * @see #CHAPTER_VALUE
	 * @generated
	 * @ordered
	 */
	CHAPTER(12, "chapter", "chapter"),

	/**
	 * The '<em><b>Cite As</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the link target is preferred over the link context for the purpose of permanent citation.
	 * <!-- end-model-doc -->
	 * @see #CITE_AS_VALUE
	 * @generated
	 * @ordered
	 */
	CITE_AS(13, "citeAs", "cite-as"),

	/**
	 * The '<em><b>Collection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target IRI points to a resource which represents the collection resource for the context IRI.
	 * <!-- end-model-doc -->
	 * @see #COLLECTION_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION(14, "collection", "collection"),

	/**
	 * The '<em><b>Contents</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a table of contents.
	 * <!-- end-model-doc -->
	 * @see #CONTENTS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTENTS(15, "contents", "contents"),

	/**
	 * The '<em><b>Converted From</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The document linked to was later converted to the
	 *       document that contains this link relation.  For example, an RFC can
	 *       have a link to the Internet-Draft that became the RFC; in that case,
	 *       the link relation would be "convertedFrom".
	 * <!-- end-model-doc -->
	 * @see #CONVERTED_FROM_VALUE
	 * @generated
	 * @ordered
	 */
	CONVERTED_FROM(16, "convertedFrom", "convertedFrom"),

	/**
	 * The '<em><b>Copyright</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a copyright statement that applies to the
	 *     link's context.
	 * <!-- end-model-doc -->
	 * @see #COPYRIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	COPYRIGHT(17, "copyright", "copyright"),

	/**
	 * The '<em><b>Create Form</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target IRI points to a resource where a submission form can be obtained.
	 * <!-- end-model-doc -->
	 * @see #CREATE_FORM_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE_FORM(18, "createForm", "create-form"),

	/**
	 * The '<em><b>Current</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource containing the most recent
	 *       item(s) in a collection of resources.
	 * <!-- end-model-doc -->
	 * @see #CURRENT_VALUE
	 * @generated
	 * @ordered
	 */
	CURRENT(19, "current", "current"),

	/**
	 * The '<em><b>Describedby</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource providing information about the
	 *       link's context.
	 * <!-- end-model-doc -->
	 * @see #DESCRIBEDBY_VALUE
	 * @generated
	 * @ordered
	 */
	DESCRIBEDBY(20, "describedby", "describedby"),

	/**
	 * The '<em><b>Describes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship A 'describes' B asserts that
	 *       resource A provides a description of resource B. There are no
	 *       constraints on the format or representation of either A or B,
	 *       neither are there any further constraints on either resource.
	 * <!-- end-model-doc -->
	 * @see #DESCRIBES_VALUE
	 * @generated
	 * @ordered
	 */
	DESCRIBES(21, "describes", "describes"),

	/**
	 * The '<em><b>Disclosure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a list of patent disclosures made with respect to 
	 *       material for which 'disclosure' relation is specified.
	 * <!-- end-model-doc -->
	 * @see #DISCLOSURE_VALUE
	 * @generated
	 * @ordered
	 */
	DISCLOSURE(22, "disclosure", "disclosure"),

	/**
	 * The '<em><b>Dns Prefetch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to indicate an origin that will be used to fetch required 
	 *       resources for the link context, and that the user agent ought to resolve 
	 *       as early as possible.
	 * <!-- end-model-doc -->
	 * @see #DNS_PREFETCH_VALUE
	 * @generated
	 * @ordered
	 */
	DNS_PREFETCH(23, "dnsPrefetch", "dns-prefetch"),

	/**
	 * The '<em><b>Duplicate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource whose available representations
	 *       are byte-for-byte identical with the corresponding representations of
	 *       the context IRI.
	 * <!-- end-model-doc -->
	 * @see #DUPLICATE_VALUE
	 * @generated
	 * @ordered
	 */
	DUPLICATE(24, "duplicate", "duplicate"),

	/**
	 * The '<em><b>Edit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource that can be used to edit the
	 *       link's context.
	 * <!-- end-model-doc -->
	 * @see #EDIT_VALUE
	 * @generated
	 * @ordered
	 */
	EDIT(25, "edit", "edit"),

	/**
	 * The '<em><b>Edit Form</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target IRI points to a resource where a submission form for
	 *       editing associated resource can be obtained.
	 * <!-- end-model-doc -->
	 * @see #EDIT_FORM_VALUE
	 * @generated
	 * @ordered
	 */
	EDIT_FORM(26, "editForm", "edit-form"),

	/**
	 * The '<em><b>Edit Media</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource that can be used to edit media
	 *       associated with the link's context.
	 * <!-- end-model-doc -->
	 * @see #EDIT_MEDIA_VALUE
	 * @generated
	 * @ordered
	 */
	EDIT_MEDIA(27, "editMedia", "edit-media"),

	/**
	 * The '<em><b>Enclosure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a related resource that is potentially
	 *       large and might require special handling.
	 * <!-- end-model-doc -->
	 * @see #ENCLOSURE_VALUE
	 * @generated
	 * @ordered
	 */
	ENCLOSURE(28, "enclosure", "enclosure"),

	/**
	 * The '<em><b>External</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource that is not part of the same site as the current context.
	 * <!-- end-model-doc -->
	 * @see #EXTERNAL_VALUE
	 * @generated
	 * @ordered
	 */
	EXTERNAL(29, "external", "external"),

	/**
	 * The '<em><b>First</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An IRI that refers to the furthest preceding resource
	 *     in a series of resources.
	 * <!-- end-model-doc -->
	 * @see #FIRST_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST(30, "first", "first"),

	/**
	 * The '<em><b>Glossary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a glossary of terms.
	 * <!-- end-model-doc -->
	 * @see #GLOSSARY_VALUE
	 * @generated
	 * @ordered
	 */
	GLOSSARY(31, "glossary", "glossary"),

	/**
	 * The '<em><b>Help</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to context-sensitive help.
	 * <!-- end-model-doc -->
	 * @see #HELP_VALUE
	 * @generated
	 * @ordered
	 */
	HELP(32, "help", "help"),

	/**
	 * The '<em><b>Hosts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource hosted by the server indicated by
	 *       the link context.
	 * <!-- end-model-doc -->
	 * @see #HOSTS_VALUE
	 * @generated
	 * @ordered
	 */
	HOSTS(33, "hosts", "hosts"),

	/**
	 * The '<em><b>Hub</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a hub that enables registration for
	 *     notification of updates to the context.
	 * <!-- end-model-doc -->
	 * @see #HUB_VALUE
	 * @generated
	 * @ordered
	 */
	HUB(34, "hub", "hub"),

	/**
	 * The '<em><b>Icon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to an icon representing the link's context.
	 * <!-- end-model-doc -->
	 * @see #ICON_VALUE
	 * @generated
	 * @ordered
	 */
	ICON(35, "icon", "icon"),

	/**
	 * The '<em><b>Index</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to an index.
	 * <!-- end-model-doc -->
	 * @see #INDEX_VALUE
	 * @generated
	 * @ordered
	 */
	INDEX(36, "index", "index"),

	/**
	 * The '<em><b>Interval After</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval that ends before the beginning of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_AFTER_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVAL_AFTER(37, "intervalAfter", "intervalAfter"),

	/**
	 * The '<em><b>Interval Before</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval that begins after the end of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_BEFORE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVAL_BEFORE(38, "intervalBefore", "intervalBefore"),

	/**
	 * The '<em><b>Interval Contains</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval that begins after the beginning of the time interval associated with the context resource, and ends before the end of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_CONTAINS_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVAL_CONTAINS(39, "intervalContains", "intervalContains"),

	/**
	 * The '<em><b>Interval Disjoint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval that begins after the end of the time interval associated with the context resource, or ends before the beginning of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_DISJOINT_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVAL_DISJOINT(40, "intervalDisjoint", "intervalDisjoint"),

	/**
	 * The '<em><b>Interval During</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval that begins before the beginning of the time interval associated with the context resource, and ends after the end of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_DURING_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVAL_DURING(41, "intervalDuring", "intervalDuring"),

	/**
	 * The '<em><b>Interval Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval whose beginning coincides with the beginning of the time interval associated with the context resource, and whose end coincides with the end of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVAL_EQUALS(42, "intervalEquals", "intervalEquals"),

	/**
	 * The '<em><b>Interval Finished By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval that begins after the beginning of the time interval associated with the context resource, and whose end coincides with the end of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_FINISHED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVAL_FINISHED_BY(43, "intervalFinishedBy", "intervalFinishedBy"),

	/**
	 * The '<em><b>Interval Finishes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval that begins before the beginning of the time interval associated with the context resource, and whose end coincides with the end of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_FINISHES_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVAL_FINISHES(44, "intervalFinishes", "intervalFinishes"),

	/**
	 * The '<em><b>Interval In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval that begins before or is coincident with the beginning of the time interval associated with the context resource, and ends after or is coincident with the end of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_IN_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVAL_IN(45, "intervalIn", "intervalIn"),

	/**
	 * The '<em><b>Interval Meets</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval whose beginning coincides with the end of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_MEETS_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVAL_MEETS(46, "intervalMeets", "intervalMeets"),

	/**
	 * The '<em><b>Interval Met By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval whose end coincides with the beginning of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_MET_BY_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVAL_MET_BY(47, "intervalMetBy", "intervalMetBy"),

	/**
	 * The '<em><b>Interval Overlapped By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval that begins before the beginning of the time interval associated with the context resource, and ends after the beginning of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_OVERLAPPED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVAL_OVERLAPPED_BY(48, "intervalOverlappedBy", "intervalOverlappedBy"),

	/**
	 * The '<em><b>Interval Overlaps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval that begins before the end of the time interval associated with the context resource, and ends after the end of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_OVERLAPS_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVAL_OVERLAPS(49, "intervalOverlaps", "intervalOverlaps"),

	/**
	 * The '<em><b>Interval Started By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval whose beginning coincides with the beginning of the time interval associated with the context resource, and ends before the end of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_STARTED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVAL_STARTED_BY(50, "intervalStartedBy", "intervalStartedBy"),

	/**
	 * The '<em><b>Interval Starts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval whose beginning coincides with the beginning of the time interval associated with the context resource, and ends after the end of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_STARTS_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVAL_STARTS(51, "intervalStarts", "intervalStarts"),

	/**
	 * The '<em><b>Item</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target IRI points to a resource that is a member of the collection represented by the context IRI.
	 * <!-- end-model-doc -->
	 * @see #ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	ITEM(52, "item", "item"),

	/**
	 * The '<em><b>Last</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An IRI that refers to the furthest following resource
	 *       in a series of resources.
	 * <!-- end-model-doc -->
	 * @see #LAST_VALUE
	 * @generated
	 * @ordered
	 */
	LAST(53, "last", "last"),

	/**
	 * The '<em><b>Latest Version</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Points to a resource containing the latest (e.g.,
	 *       current) version of the context.
	 * <!-- end-model-doc -->
	 * @see #LATEST_VERSION_VALUE
	 * @generated
	 * @ordered
	 */
	LATEST_VERSION(54, "latestVersion", "latest-version"),

	/**
	 * The '<em><b>License</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a license associated with this context.
	 * <!-- end-model-doc -->
	 * @see #LICENSE_VALUE
	 * @generated
	 * @ordered
	 */
	LICENSE(55, "license", "license"),

	/**
	 * The '<em><b>Linkset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The link target of a link with the "linkset" relation
	 *       type provides a set of links, including links in which the link
	 *       context of the link participates.
	 *     
	 * <!-- end-model-doc -->
	 * @see #LINKSET_VALUE
	 * @generated
	 * @ordered
	 */
	LINKSET(56, "linkset", "linkset"),

	/**
	 * The '<em><b>Lrdd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to further information about the link's context,
	 *       expressed as a LRDD ("Link-based Resource Descriptor Document")
	 *       resource.  See  for information about
	 *       processing this relation type in host-meta documents. When used
	 *       elsewhere, it refers to additional links and other metadata.
	 *       Multiple instances indicate additional LRDD resources. LRDD
	 *       resources MUST have an "application/xrd+xml" representation, and
	 *       MAY have others.
	 * <!-- end-model-doc -->
	 * @see #LRDD_VALUE
	 * @generated
	 * @ordered
	 */
	LRDD(57, "lrdd", "lrdd"),

	/**
	 * The '<em><b>Manifest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Links to a manifest file for the context.
	 * <!-- end-model-doc -->
	 * @see #MANIFEST_VALUE
	 * @generated
	 * @ordered
	 */
	MANIFEST(58, "manifest", "manifest"),

	/**
	 * The '<em><b>Mask Icon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a mask that can be applied to the icon for the context.
	 * <!-- end-model-doc -->
	 * @see #MASK_ICON_VALUE
	 * @generated
	 * @ordered
	 */
	MASK_ICON(59, "maskIcon", "mask-icon"),

	/**
	 * The '<em><b>Media Feed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a feed of personalised media recommendations relevant to the link context.
	 * <!-- end-model-doc -->
	 * @see #MEDIA_FEED_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIA_FEED(60, "mediaFeed", "media-feed"),

	/**
	 * The '<em><b>Memento</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Target IRI points to a Memento, a fixed resource that will not change state anymore.
	 * <!-- end-model-doc -->
	 * @see #MEMENTO_VALUE
	 * @generated
	 * @ordered
	 */
	MEMENTO(61, "memento", "memento"),

	/**
	 * The '<em><b>Micropub</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Links to the context's Micropub endpoint.
	 * <!-- end-model-doc -->
	 * @see #MICROPUB_VALUE
	 * @generated
	 * @ordered
	 */
	MICROPUB(62, "micropub", "micropub"),

	/**
	 * The '<em><b>Modulepreload</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a module that the user agent is to preemptively fetch and store for use in the current context.
	 * <!-- end-model-doc -->
	 * @see #MODULEPRELOAD_VALUE
	 * @generated
	 * @ordered
	 */
	MODULEPRELOAD(63, "modulepreload", "modulepreload"),

	/**
	 * The '<em><b>Monitor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource that can be used to monitor changes in an HTTP resource.
	 *     
	 * <!-- end-model-doc -->
	 * @see #MONITOR_VALUE
	 * @generated
	 * @ordered
	 */
	MONITOR(64, "monitor", "monitor"),

	/**
	 * The '<em><b>Monitor Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource that can be used to monitor changes in a specified group of HTTP resources.
	 *     
	 * <!-- end-model-doc -->
	 * @see #MONITOR_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	MONITOR_GROUP(65, "monitorGroup", "monitor-group"),

	/**
	 * The '<em><b>Next</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the link's context is a part of a series, and
	 *       that the next in the series is the link target.
	 *     
	 * <!-- end-model-doc -->
	 * @see #NEXT_VALUE
	 * @generated
	 * @ordered
	 */
	NEXT(66, "next", "next"),

	/**
	 * The '<em><b>Next Archive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the immediately following archive resource.
	 * <!-- end-model-doc -->
	 * @see #NEXT_ARCHIVE_VALUE
	 * @generated
	 * @ordered
	 */
	NEXT_ARCHIVE(67, "nextArchive", "next-archive"),

	/**
	 * The '<em><b>Nofollow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the context’s original author or publisher does not endorse the link target.
	 * <!-- end-model-doc -->
	 * @see #NOFOLLOW_VALUE
	 * @generated
	 * @ordered
	 */
	NOFOLLOW(68, "nofollow", "nofollow"),

	/**
	 * The '<em><b>Noopener</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that any newly created top-level browsing context which results from following the link will not be an auxiliary browsing context.
	 * <!-- end-model-doc -->
	 * @see #NOOPENER_VALUE
	 * @generated
	 * @ordered
	 */
	NOOPENER(69, "noopener", "noopener"),

	/**
	 * The '<em><b>Noreferrer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that no referrer information is to be leaked when following the link.
	 * <!-- end-model-doc -->
	 * @see #NOREFERRER_VALUE
	 * @generated
	 * @ordered
	 */
	NOREFERRER(70, "noreferrer", "noreferrer"),

	/**
	 * The '<em><b>Opener</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that any newly created top-level browsing context which results from following the link will be an auxiliary browsing context.
	 * <!-- end-model-doc -->
	 * @see #OPENER_VALUE
	 * @generated
	 * @ordered
	 */
	OPENER(71, "opener", "opener"),

	/**
	 * The '<em><b>Openid2 Local Id</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to an OpenID Authentication server on which the context relies for an assertion that the end user controls an Identifier.
	 * <!-- end-model-doc -->
	 * @see #OPENID2_LOCAL_ID_VALUE
	 * @generated
	 * @ordered
	 */
	OPENID2_LOCAL_ID(72, "openid2LocalId", "openid2.local_id"),

	/**
	 * The '<em><b>Openid2 Provider</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource which accepts OpenID Authentication protocol messages for the context.
	 * <!-- end-model-doc -->
	 * @see #OPENID2_PROVIDER_VALUE
	 * @generated
	 * @ordered
	 */
	OPENID2_PROVIDER(73, "openid2Provider", "openid2.provider"),

	/**
	 * The '<em><b>Original</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Target IRI points to an Original Resource.
	 * <!-- end-model-doc -->
	 * @see #ORIGINAL_VALUE
	 * @generated
	 * @ordered
	 */
	ORIGINAL(74, "original", "original"),

	/**
	 * The '<em><b>P3 Pv1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a P3P privacy policy for the context.
	 * <!-- end-model-doc -->
	 * @see #P3_PV1_VALUE
	 * @generated
	 * @ordered
	 */
	P3_PV1(75, "P3Pv1", "P3Pv1"),

	/**
	 * The '<em><b>Payment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates a resource where payment is accepted.
	 * <!-- end-model-doc -->
	 * @see #PAYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	PAYMENT(76, "payment", "payment"),

	/**
	 * The '<em><b>Pingback</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gives the address of the pingback resource for the link context.
	 * <!-- end-model-doc -->
	 * @see #PINGBACK_VALUE
	 * @generated
	 * @ordered
	 */
	PINGBACK(77, "pingback", "pingback"),

	/**
	 * The '<em><b>Preconnect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to indicate an origin that will be used to fetch required 
	 *       resources for the link context. Initiating an early connection, which 
	 *       includes the DNS lookup, TCP handshake, and optional TLS negotiation, 
	 *       allows the user agent to mask the high latency costs of establishing a 
	 *       connection.
	 * <!-- end-model-doc -->
	 * @see #PRECONNECT_VALUE
	 * @generated
	 * @ordered
	 */
	PRECONNECT(78, "preconnect", "preconnect"),

	/**
	 * The '<em><b>Predecessor Version</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Points to a resource containing the predecessor
	 *       version in the version history.
	 *     
	 * <!-- end-model-doc -->
	 * @see #PREDECESSOR_VERSION_VALUE
	 * @generated
	 * @ordered
	 */
	PREDECESSOR_VERSION(79, "predecessorVersion", "predecessor-version"),

	/**
	 * The '<em><b>Prefetch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The prefetch link relation type is used to identify a resource 
	 *       that might be required by the next navigation from the link context, and 
	 *       that the user agent ought to fetch, such that the user agent can deliver a 
	 *       faster response once the resource is requested in the future.
	 * <!-- end-model-doc -->
	 * @see #PREFETCH_VALUE
	 * @generated
	 * @ordered
	 */
	PREFETCH(80, "prefetch", "prefetch"),

	/**
	 * The '<em><b>Preload</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource that should be loaded early in the 
	 *       processing of the link's context, without blocking rendering.
	 * <!-- end-model-doc -->
	 * @see #PRELOAD_VALUE
	 * @generated
	 * @ordered
	 */
	PRELOAD(81, "preload", "preload"),

	/**
	 * The '<em><b>Prerender</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to identify a resource that might be required by the next 
	 *       navigation from the link context, and that the user agent ought to fetch 
	 *       and execute, such that the user agent can deliver a faster response once 
	 *       the resource is requested in the future.
	 * <!-- end-model-doc -->
	 * @see #PRERENDER_VALUE
	 * @generated
	 * @ordered
	 */
	PRERENDER(82, "prerender", "prerender"),

	/**
	 * The '<em><b>Prev</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the link's context is a part of a series, and
	 *       that the previous in the series is the link target.
	 *     
	 * <!-- end-model-doc -->
	 * @see #PREV_VALUE
	 * @generated
	 * @ordered
	 */
	PREV(83, "prev", "prev"),

	/**
	 * The '<em><b>Preview</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource that provides a preview of the link's context.
	 * <!-- end-model-doc -->
	 * @see #PREVIEW_VALUE
	 * @generated
	 * @ordered
	 */
	PREVIEW(84, "preview", "preview"),

	/**
	 * The '<em><b>Previous</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the previous resource in an ordered series
	 *       of resources.  Synonym for "prev".
	 * <!-- end-model-doc -->
	 * @see #PREVIOUS_VALUE
	 * @generated
	 * @ordered
	 */
	PREVIOUS(85, "previous", "previous"),

	/**
	 * The '<em><b>Prev Archive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the immediately preceding archive resource.
	 * <!-- end-model-doc -->
	 * @see #PREV_ARCHIVE_VALUE
	 * @generated
	 * @ordered
	 */
	PREV_ARCHIVE(86, "prevArchive", "prev-archive"),

	/**
	 * The '<em><b>Privacy Policy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a privacy policy associated with the link's context.
	 * <!-- end-model-doc -->
	 * @see #PRIVACY_POLICY_VALUE
	 * @generated
	 * @ordered
	 */
	PRIVACY_POLICY(87, "privacyPolicy", "privacy-policy"),

	/**
	 * The '<em><b>Profile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifying that a resource representation conforms
	 * to a certain profile, without affecting the non-profile semantics
	 * of the resource representation.
	 * <!-- end-model-doc -->
	 * @see #PROFILE_VALUE
	 * @generated
	 * @ordered
	 */
	PROFILE(88, "profile", "profile"),

	/**
	 * The '<em><b>Publication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Links to a publication manifest. A manifest represents 
	 *       structured information about a publication, such as informative metadata, 
	 *       a list of resources, and a default reading order.
	 * <!-- end-model-doc -->
	 * @see #PUBLICATION_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLICATION(89, "publication", "publication"),

	/**
	 * The '<em><b>Related</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a related resource.
	 * <!-- end-model-doc -->
	 * @see #RELATED_VALUE
	 * @generated
	 * @ordered
	 */
	RELATED(90, "related", "related"),

	/**
	 * The '<em><b>Restconf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the root of RESTCONF API as configured on this HTTP server.
	 *       The "restconf" relation defines the root of the API defined in RFC8040.
	 *       Subsequent revisions of RESTCONF will use alternate relation values to support 
	 *       protocol versioning.
	 * <!-- end-model-doc -->
	 * @see #RESTCONF_VALUE
	 * @generated
	 * @ordered
	 */
	RESTCONF(91, "restconf", "restconf"),

	/**
	 * The '<em><b>Replies</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a resource that is a reply to the context
	 *       of the link.
	 *     
	 * <!-- end-model-doc -->
	 * @see #REPLIES_VALUE
	 * @generated
	 * @ordered
	 */
	REPLIES(92, "replies", "replies"),

	/**
	 * The '<em><b>Ruleinput</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource identified by the link target provides an input value to an 
	 *     instance of a rule, where the resource which represents the rule instance is 
	 *     identified by the link context.
	 *     
	 * <!-- end-model-doc -->
	 * @see #RULEINPUT_VALUE
	 * @generated
	 * @ordered
	 */
	RULEINPUT(93, "ruleinput", "ruleinput"),

	/**
	 * The '<em><b>Search</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource that can be used to search through
	 *       the link's context and related resources.
	 * <!-- end-model-doc -->
	 * @see #SEARCH_VALUE
	 * @generated
	 * @ordered
	 */
	SEARCH(94, "search", "search"),

	/**
	 * The '<em><b>Section</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a section in a collection of resources.
	 * <!-- end-model-doc -->
	 * @see #SECTION_VALUE
	 * @generated
	 * @ordered
	 */
	SECTION(95, "section", "section"),

	/**
	 * The '<em><b>Self</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Conveys an identifier for the link's context.
	 *     
	 * <!-- end-model-doc -->
	 * @see #SELF_VALUE
	 * @generated
	 * @ordered
	 */
	SELF(96, "self", "self"),

	/**
	 * The '<em><b>Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates a URI that can be used to retrieve a
	 *       service document.
	 * <!-- end-model-doc -->
	 * @see #SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE(97, "service", "service"),

	/**
	 * The '<em><b>Service Desc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies service description for the context that
	 *       is primarily intended for consumption by machines.
	 * <!-- end-model-doc -->
	 * @see #SERVICE_DESC_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_DESC(98, "serviceDesc", "service-desc"),

	/**
	 * The '<em><b>Service Doc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies service documentation for the context that
	 *       is primarily intended for human consumption.
	 * <!-- end-model-doc -->
	 * @see #SERVICE_DOC_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_DOC(99, "serviceDoc", "service-doc"),

	/**
	 * The '<em><b>Service Meta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies general metadata for the context that is
	 *       primarily intended for consumption by machines.
	 * <!-- end-model-doc -->
	 * @see #SERVICE_META_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_META(100, "serviceMeta", "service-meta"),

	/**
	 * The '<em><b>Sponsored</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource that is within a context that is 
	 * 		sponsored (such as advertising or another compensation agreement).
	 * <!-- end-model-doc -->
	 * @see #SPONSORED_VALUE
	 * @generated
	 * @ordered
	 */
	SPONSORED(101, "sponsored", "sponsored"),

	/**
	 * The '<em><b>Start</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the first resource in a collection of
	 *       resources.
	 * <!-- end-model-doc -->
	 * @see #START_VALUE
	 * @generated
	 * @ordered
	 */
	START(102, "start", "start"),

	/**
	 * The '<em><b>Status</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a resource that represents the context's
	 *       status.
	 * <!-- end-model-doc -->
	 * @see #STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	STATUS(103, "status", "status"),

	/**
	 * The '<em><b>Stylesheet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a stylesheet.
	 * <!-- end-model-doc -->
	 * @see #STYLESHEET_VALUE
	 * @generated
	 * @ordered
	 */
	STYLESHEET(104, "stylesheet", "stylesheet"),

	/**
	 * The '<em><b>Subsection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource serving as a subsection in a
	 *       collection of resources.
	 * <!-- end-model-doc -->
	 * @see #SUBSECTION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSECTION(105, "subsection", "subsection"),

	/**
	 * The '<em><b>Successor Version</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Points to a resource containing the successor version
	 *       in the version history.
	 *     
	 * <!-- end-model-doc -->
	 * @see #SUCCESSOR_VERSION_VALUE
	 * @generated
	 * @ordered
	 */
	SUCCESSOR_VERSION(106, "successorVersion", "successor-version"),

	/**
	 * The '<em><b>Sunset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a resource that provides information about
	 *       the context's retirement policy.
	 *     
	 * <!-- end-model-doc -->
	 * @see #SUNSET_VALUE
	 * @generated
	 * @ordered
	 */
	SUNSET(107, "sunset", "sunset"),

	/**
	 * The '<em><b>Tag</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gives a tag (identified by the given address) that applies to
	 *       the current document.
	 *     
	 * <!-- end-model-doc -->
	 * @see #TAG_VALUE
	 * @generated
	 * @ordered
	 */
	TAG(108, "tag", "tag"),

	/**
	 * The '<em><b>Terms Of Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the terms of service associated with the link's context.
	 * <!-- end-model-doc -->
	 * @see #TERMS_OF_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	TERMS_OF_SERVICE(109, "termsOfService", "terms-of-service"),

	/**
	 * The '<em><b>Timegate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Target IRI points to a TimeGate for an Original Resource.
	 * <!-- end-model-doc -->
	 * @see #TIMEGATE_VALUE
	 * @generated
	 * @ordered
	 */
	TIMEGATE(110, "timegate", "timegate"),

	/**
	 * The '<em><b>Timemap</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Target IRI points to a TimeMap for an Original Resource.
	 * <!-- end-model-doc -->
	 * @see #TIMEMAP_VALUE
	 * @generated
	 * @ordered
	 */
	TIMEMAP(111, "timemap", "timemap"),

	/**
	 * The '<em><b>Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource identifying the abstract semantic type of which the link's context is considered to be an instance.
	 * <!-- end-model-doc -->
	 * @see #TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE(112, "type", "type"),

	/**
	 * The '<em><b>Ugc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource that is within a context that is User Generated Content.
	 *     
	 * <!-- end-model-doc -->
	 * @see #UGC_VALUE
	 * @generated
	 * @ordered
	 */
	UGC(113, "ugc", "ugc"),

	/**
	 * The '<em><b>Up</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a parent document in a hierarchy of
	 *       documents.
	 *     
	 * <!-- end-model-doc -->
	 * @see #UP_VALUE
	 * @generated
	 * @ordered
	 */
	UP(114, "up", "up"),

	/**
	 * The '<em><b>Version History</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Points to a resource containing the version history
	 *       for the context.
	 *     
	 * <!-- end-model-doc -->
	 * @see #VERSION_HISTORY_VALUE
	 * @generated
	 * @ordered
	 */
	VERSION_HISTORY(115, "versionHistory", "version-history"),

	/**
	 * The '<em><b>Via</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a resource that is the source of the
	 *       information in the link's context.
	 *     
	 * <!-- end-model-doc -->
	 * @see #VIA_VALUE
	 * @generated
	 * @ordered
	 */
	VIA(116, "via", "via"),

	/**
	 * The '<em><b>Webmention</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a target URI that supports the Webmention protocol.
	 *     This allows clients that mention a resource in some form of publishing process
	 *     to contact that endpoint and inform it that this resource has been mentioned.
	 * <!-- end-model-doc -->
	 * @see #WEBMENTION_VALUE
	 * @generated
	 * @ordered
	 */
	WEBMENTION(117, "webmention", "webmention"),

	/**
	 * The '<em><b>Working Copy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Points to a working copy for this resource.
	 * <!-- end-model-doc -->
	 * @see #WORKING_COPY_VALUE
	 * @generated
	 * @ordered
	 */
	WORKING_COPY(118, "workingCopy", "working-copy"),

	/**
	 * The '<em><b>Working Copy Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Points to the versioned resource from which this
	 *       working copy was obtained.
	 *     
	 * <!-- end-model-doc -->
	 * @see #WORKING_COPY_OF_VALUE
	 * @generated
	 * @ordered
	 */
	WORKING_COPY_OF(119, "workingCopyOf", "working-copy-of");

	/**
	 * The '<em><b>About</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource that is the subject of the link's context.
	 * <!-- end-model-doc -->
	 * @see #ABOUT
	 * @model name="about"
	 * @generated
	 * @ordered
	 */
	public static final int ABOUT_VALUE = 0;

	/**
	 * The '<em><b>Acl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Asserts that the link target provides an access control description for the link context.
	 * <!-- end-model-doc -->
	 * @see #ACL
	 * @model name="acl"
	 * @generated
	 * @ordered
	 */
	public static final int ACL_VALUE = 1;

	/**
	 * The '<em><b>Alternate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a substitute for this context
	 * <!-- end-model-doc -->
	 * @see #ALTERNATE
	 * @model name="alternate"
	 * @generated
	 * @ordered
	 */
	public static final int ALTERNATE_VALUE = 2;

	/**
	 * The '<em><b>Amphtml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to reference alternative content that uses the AMP profile of the HTML format.
	 * <!-- end-model-doc -->
	 * @see #AMPHTML
	 * @model name="amphtml"
	 * @generated
	 * @ordered
	 */
	public static final int AMPHTML_VALUE = 3;

	/**
	 * The '<em><b>Appendix</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to an appendix.
	 * <!-- end-model-doc -->
	 * @see #APPENDIX
	 * @model name="appendix"
	 * @generated
	 * @ordered
	 */
	public static final int APPENDIX_VALUE = 4;

	/**
	 * The '<em><b>Apple Touch Icon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to an icon for the context. Synonym for icon.
	 * <!-- end-model-doc -->
	 * @see #APPLE_TOUCH_ICON
	 * @model name="appleTouchIcon" literal="apple-touch-icon"
	 * @generated
	 * @ordered
	 */
	public static final int APPLE_TOUCH_ICON_VALUE = 5;

	/**
	 * The '<em><b>Apple Touch Startup Image</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a launch screen for the context.
	 * <!-- end-model-doc -->
	 * @see #APPLE_TOUCH_STARTUP_IMAGE
	 * @model name="appleTouchStartupImage" literal="apple-touch-startup-image"
	 * @generated
	 * @ordered
	 */
	public static final int APPLE_TOUCH_STARTUP_IMAGE_VALUE = 6;

	/**
	 * The '<em><b>Archives</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a collection of records, documents, or other
	 *       materials of historical interest.
	 * <!-- end-model-doc -->
	 * @see #ARCHIVES
	 * @model name="archives"
	 * @generated
	 * @ordered
	 */
	public static final int ARCHIVES_VALUE = 7;

	/**
	 * The '<em><b>Author</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the context's author.
	 * <!-- end-model-doc -->
	 * @see #AUTHOR
	 * @model name="author"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHOR_VALUE = 8;

	/**
	 * The '<em><b>Blocked By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the entity that blocks access to a resource
	 *       following receipt of a legal demand.
	 * <!-- end-model-doc -->
	 * @see #BLOCKED_BY
	 * @model name="blockedBy" literal="blocked-by"
	 * @generated
	 * @ordered
	 */
	public static final int BLOCKED_BY_VALUE = 9;

	/**
	 * The '<em><b>Bookmark</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gives a permanent link to use for bookmarking purposes.
	 * <!-- end-model-doc -->
	 * @see #BOOKMARK
	 * @model name="bookmark"
	 * @generated
	 * @ordered
	 */
	public static final int BOOKMARK_VALUE = 10;

	/**
	 * The '<em><b>Canonical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designates the preferred version of a resource (the IRI and its contents).
	 * <!-- end-model-doc -->
	 * @see #CANONICAL
	 * @model name="canonical"
	 * @generated
	 * @ordered
	 */
	public static final int CANONICAL_VALUE = 11;

	/**
	 * The '<em><b>Chapter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a chapter in a collection of resources.
	 * <!-- end-model-doc -->
	 * @see #CHAPTER
	 * @model name="chapter"
	 * @generated
	 * @ordered
	 */
	public static final int CHAPTER_VALUE = 12;

	/**
	 * The '<em><b>Cite As</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the link target is preferred over the link context for the purpose of permanent citation.
	 * <!-- end-model-doc -->
	 * @see #CITE_AS
	 * @model name="citeAs" literal="cite-as"
	 * @generated
	 * @ordered
	 */
	public static final int CITE_AS_VALUE = 13;

	/**
	 * The '<em><b>Collection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target IRI points to a resource which represents the collection resource for the context IRI.
	 * <!-- end-model-doc -->
	 * @see #COLLECTION
	 * @model name="collection"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_VALUE = 14;

	/**
	 * The '<em><b>Contents</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a table of contents.
	 * <!-- end-model-doc -->
	 * @see #CONTENTS
	 * @model name="contents"
	 * @generated
	 * @ordered
	 */
	public static final int CONTENTS_VALUE = 15;

	/**
	 * The '<em><b>Converted From</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The document linked to was later converted to the
	 *       document that contains this link relation.  For example, an RFC can
	 *       have a link to the Internet-Draft that became the RFC; in that case,
	 *       the link relation would be "convertedFrom".
	 * <!-- end-model-doc -->
	 * @see #CONVERTED_FROM
	 * @model name="convertedFrom"
	 * @generated
	 * @ordered
	 */
	public static final int CONVERTED_FROM_VALUE = 16;

	/**
	 * The '<em><b>Copyright</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a copyright statement that applies to the
	 *     link's context.
	 * <!-- end-model-doc -->
	 * @see #COPYRIGHT
	 * @model name="copyright"
	 * @generated
	 * @ordered
	 */
	public static final int COPYRIGHT_VALUE = 17;

	/**
	 * The '<em><b>Create Form</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target IRI points to a resource where a submission form can be obtained.
	 * <!-- end-model-doc -->
	 * @see #CREATE_FORM
	 * @model name="createForm" literal="create-form"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_FORM_VALUE = 18;

	/**
	 * The '<em><b>Current</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource containing the most recent
	 *       item(s) in a collection of resources.
	 * <!-- end-model-doc -->
	 * @see #CURRENT
	 * @model name="current"
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_VALUE = 19;

	/**
	 * The '<em><b>Describedby</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource providing information about the
	 *       link's context.
	 * <!-- end-model-doc -->
	 * @see #DESCRIBEDBY
	 * @model name="describedby"
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIBEDBY_VALUE = 20;

	/**
	 * The '<em><b>Describes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship A 'describes' B asserts that
	 *       resource A provides a description of resource B. There are no
	 *       constraints on the format or representation of either A or B,
	 *       neither are there any further constraints on either resource.
	 * <!-- end-model-doc -->
	 * @see #DESCRIBES
	 * @model name="describes"
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIBES_VALUE = 21;

	/**
	 * The '<em><b>Disclosure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a list of patent disclosures made with respect to 
	 *       material for which 'disclosure' relation is specified.
	 * <!-- end-model-doc -->
	 * @see #DISCLOSURE
	 * @model name="disclosure"
	 * @generated
	 * @ordered
	 */
	public static final int DISCLOSURE_VALUE = 22;

	/**
	 * The '<em><b>Dns Prefetch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to indicate an origin that will be used to fetch required 
	 *       resources for the link context, and that the user agent ought to resolve 
	 *       as early as possible.
	 * <!-- end-model-doc -->
	 * @see #DNS_PREFETCH
	 * @model name="dnsPrefetch" literal="dns-prefetch"
	 * @generated
	 * @ordered
	 */
	public static final int DNS_PREFETCH_VALUE = 23;

	/**
	 * The '<em><b>Duplicate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource whose available representations
	 *       are byte-for-byte identical with the corresponding representations of
	 *       the context IRI.
	 * <!-- end-model-doc -->
	 * @see #DUPLICATE
	 * @model name="duplicate"
	 * @generated
	 * @ordered
	 */
	public static final int DUPLICATE_VALUE = 24;

	/**
	 * The '<em><b>Edit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource that can be used to edit the
	 *       link's context.
	 * <!-- end-model-doc -->
	 * @see #EDIT
	 * @model name="edit"
	 * @generated
	 * @ordered
	 */
	public static final int EDIT_VALUE = 25;

	/**
	 * The '<em><b>Edit Form</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target IRI points to a resource where a submission form for
	 *       editing associated resource can be obtained.
	 * <!-- end-model-doc -->
	 * @see #EDIT_FORM
	 * @model name="editForm" literal="edit-form"
	 * @generated
	 * @ordered
	 */
	public static final int EDIT_FORM_VALUE = 26;

	/**
	 * The '<em><b>Edit Media</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource that can be used to edit media
	 *       associated with the link's context.
	 * <!-- end-model-doc -->
	 * @see #EDIT_MEDIA
	 * @model name="editMedia" literal="edit-media"
	 * @generated
	 * @ordered
	 */
	public static final int EDIT_MEDIA_VALUE = 27;

	/**
	 * The '<em><b>Enclosure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a related resource that is potentially
	 *       large and might require special handling.
	 * <!-- end-model-doc -->
	 * @see #ENCLOSURE
	 * @model name="enclosure"
	 * @generated
	 * @ordered
	 */
	public static final int ENCLOSURE_VALUE = 28;

	/**
	 * The '<em><b>External</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource that is not part of the same site as the current context.
	 * <!-- end-model-doc -->
	 * @see #EXTERNAL
	 * @model name="external"
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_VALUE = 29;

	/**
	 * The '<em><b>First</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An IRI that refers to the furthest preceding resource
	 *     in a series of resources.
	 * <!-- end-model-doc -->
	 * @see #FIRST
	 * @model name="first"
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_VALUE = 30;

	/**
	 * The '<em><b>Glossary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a glossary of terms.
	 * <!-- end-model-doc -->
	 * @see #GLOSSARY
	 * @model name="glossary"
	 * @generated
	 * @ordered
	 */
	public static final int GLOSSARY_VALUE = 31;

	/**
	 * The '<em><b>Help</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to context-sensitive help.
	 * <!-- end-model-doc -->
	 * @see #HELP
	 * @model name="help"
	 * @generated
	 * @ordered
	 */
	public static final int HELP_VALUE = 32;

	/**
	 * The '<em><b>Hosts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource hosted by the server indicated by
	 *       the link context.
	 * <!-- end-model-doc -->
	 * @see #HOSTS
	 * @model name="hosts"
	 * @generated
	 * @ordered
	 */
	public static final int HOSTS_VALUE = 33;

	/**
	 * The '<em><b>Hub</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a hub that enables registration for
	 *     notification of updates to the context.
	 * <!-- end-model-doc -->
	 * @see #HUB
	 * @model name="hub"
	 * @generated
	 * @ordered
	 */
	public static final int HUB_VALUE = 34;

	/**
	 * The '<em><b>Icon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to an icon representing the link's context.
	 * <!-- end-model-doc -->
	 * @see #ICON
	 * @model name="icon"
	 * @generated
	 * @ordered
	 */
	public static final int ICON_VALUE = 35;

	/**
	 * The '<em><b>Index</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to an index.
	 * <!-- end-model-doc -->
	 * @see #INDEX
	 * @model name="index"
	 * @generated
	 * @ordered
	 */
	public static final int INDEX_VALUE = 36;

	/**
	 * The '<em><b>Interval After</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval that ends before the beginning of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_AFTER
	 * @model name="intervalAfter"
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_AFTER_VALUE = 37;

	/**
	 * The '<em><b>Interval Before</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval that begins after the end of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_BEFORE
	 * @model name="intervalBefore"
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_BEFORE_VALUE = 38;

	/**
	 * The '<em><b>Interval Contains</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval that begins after the beginning of the time interval associated with the context resource, and ends before the end of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_CONTAINS
	 * @model name="intervalContains"
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_CONTAINS_VALUE = 39;

	/**
	 * The '<em><b>Interval Disjoint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval that begins after the end of the time interval associated with the context resource, or ends before the beginning of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_DISJOINT
	 * @model name="intervalDisjoint"
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_DISJOINT_VALUE = 40;

	/**
	 * The '<em><b>Interval During</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval that begins before the beginning of the time interval associated with the context resource, and ends after the end of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_DURING
	 * @model name="intervalDuring"
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_DURING_VALUE = 41;

	/**
	 * The '<em><b>Interval Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval whose beginning coincides with the beginning of the time interval associated with the context resource, and whose end coincides with the end of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_EQUALS
	 * @model name="intervalEquals"
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_EQUALS_VALUE = 42;

	/**
	 * The '<em><b>Interval Finished By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval that begins after the beginning of the time interval associated with the context resource, and whose end coincides with the end of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_FINISHED_BY
	 * @model name="intervalFinishedBy"
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_FINISHED_BY_VALUE = 43;

	/**
	 * The '<em><b>Interval Finishes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval that begins before the beginning of the time interval associated with the context resource, and whose end coincides with the end of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_FINISHES
	 * @model name="intervalFinishes"
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_FINISHES_VALUE = 44;

	/**
	 * The '<em><b>Interval In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval that begins before or is coincident with the beginning of the time interval associated with the context resource, and ends after or is coincident with the end of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_IN
	 * @model name="intervalIn"
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_IN_VALUE = 45;

	/**
	 * The '<em><b>Interval Meets</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval whose beginning coincides with the end of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_MEETS
	 * @model name="intervalMeets"
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_MEETS_VALUE = 46;

	/**
	 * The '<em><b>Interval Met By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval whose end coincides with the beginning of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_MET_BY
	 * @model name="intervalMetBy"
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_MET_BY_VALUE = 47;

	/**
	 * The '<em><b>Interval Overlapped By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval that begins before the beginning of the time interval associated with the context resource, and ends after the beginning of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_OVERLAPPED_BY
	 * @model name="intervalOverlappedBy"
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_OVERLAPPED_BY_VALUE = 48;

	/**
	 * The '<em><b>Interval Overlaps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval that begins before the end of the time interval associated with the context resource, and ends after the end of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_OVERLAPS
	 * @model name="intervalOverlaps"
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_OVERLAPS_VALUE = 49;

	/**
	 * The '<em><b>Interval Started By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval whose beginning coincides with the beginning of the time interval associated with the context resource, and ends before the end of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_STARTED_BY
	 * @model name="intervalStartedBy"
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_STARTED_BY_VALUE = 50;

	/**
	 * The '<em><b>Interval Starts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * refers to a resource associated with a time interval whose beginning coincides with the beginning of the time interval associated with the context resource, and ends after the end of the time interval associated with the context resource
	 * <!-- end-model-doc -->
	 * @see #INTERVAL_STARTS
	 * @model name="intervalStarts"
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_STARTS_VALUE = 51;

	/**
	 * The '<em><b>Item</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target IRI points to a resource that is a member of the collection represented by the context IRI.
	 * <!-- end-model-doc -->
	 * @see #ITEM
	 * @model name="item"
	 * @generated
	 * @ordered
	 */
	public static final int ITEM_VALUE = 52;

	/**
	 * The '<em><b>Last</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An IRI that refers to the furthest following resource
	 *       in a series of resources.
	 * <!-- end-model-doc -->
	 * @see #LAST
	 * @model name="last"
	 * @generated
	 * @ordered
	 */
	public static final int LAST_VALUE = 53;

	/**
	 * The '<em><b>Latest Version</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Points to a resource containing the latest (e.g.,
	 *       current) version of the context.
	 * <!-- end-model-doc -->
	 * @see #LATEST_VERSION
	 * @model name="latestVersion" literal="latest-version"
	 * @generated
	 * @ordered
	 */
	public static final int LATEST_VERSION_VALUE = 54;

	/**
	 * The '<em><b>License</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a license associated with this context.
	 * <!-- end-model-doc -->
	 * @see #LICENSE
	 * @model name="license"
	 * @generated
	 * @ordered
	 */
	public static final int LICENSE_VALUE = 55;

	/**
	 * The '<em><b>Linkset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The link target of a link with the "linkset" relation
	 *       type provides a set of links, including links in which the link
	 *       context of the link participates.
	 *     
	 * <!-- end-model-doc -->
	 * @see #LINKSET
	 * @model name="linkset"
	 * @generated
	 * @ordered
	 */
	public static final int LINKSET_VALUE = 56;

	/**
	 * The '<em><b>Lrdd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to further information about the link's context,
	 *       expressed as a LRDD ("Link-based Resource Descriptor Document")
	 *       resource.  See  for information about
	 *       processing this relation type in host-meta documents. When used
	 *       elsewhere, it refers to additional links and other metadata.
	 *       Multiple instances indicate additional LRDD resources. LRDD
	 *       resources MUST have an "application/xrd+xml" representation, and
	 *       MAY have others.
	 * <!-- end-model-doc -->
	 * @see #LRDD
	 * @model name="lrdd"
	 * @generated
	 * @ordered
	 */
	public static final int LRDD_VALUE = 57;

	/**
	 * The '<em><b>Manifest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Links to a manifest file for the context.
	 * <!-- end-model-doc -->
	 * @see #MANIFEST
	 * @model name="manifest"
	 * @generated
	 * @ordered
	 */
	public static final int MANIFEST_VALUE = 58;

	/**
	 * The '<em><b>Mask Icon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a mask that can be applied to the icon for the context.
	 * <!-- end-model-doc -->
	 * @see #MASK_ICON
	 * @model name="maskIcon" literal="mask-icon"
	 * @generated
	 * @ordered
	 */
	public static final int MASK_ICON_VALUE = 59;

	/**
	 * The '<em><b>Media Feed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a feed of personalised media recommendations relevant to the link context.
	 * <!-- end-model-doc -->
	 * @see #MEDIA_FEED
	 * @model name="mediaFeed" literal="media-feed"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIA_FEED_VALUE = 60;

	/**
	 * The '<em><b>Memento</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Target IRI points to a Memento, a fixed resource that will not change state anymore.
	 * <!-- end-model-doc -->
	 * @see #MEMENTO
	 * @model name="memento"
	 * @generated
	 * @ordered
	 */
	public static final int MEMENTO_VALUE = 61;

	/**
	 * The '<em><b>Micropub</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Links to the context's Micropub endpoint.
	 * <!-- end-model-doc -->
	 * @see #MICROPUB
	 * @model name="micropub"
	 * @generated
	 * @ordered
	 */
	public static final int MICROPUB_VALUE = 62;

	/**
	 * The '<em><b>Modulepreload</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a module that the user agent is to preemptively fetch and store for use in the current context.
	 * <!-- end-model-doc -->
	 * @see #MODULEPRELOAD
	 * @model name="modulepreload"
	 * @generated
	 * @ordered
	 */
	public static final int MODULEPRELOAD_VALUE = 63;

	/**
	 * The '<em><b>Monitor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource that can be used to monitor changes in an HTTP resource.
	 *     
	 * <!-- end-model-doc -->
	 * @see #MONITOR
	 * @model name="monitor"
	 * @generated
	 * @ordered
	 */
	public static final int MONITOR_VALUE = 64;

	/**
	 * The '<em><b>Monitor Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource that can be used to monitor changes in a specified group of HTTP resources.
	 *     
	 * <!-- end-model-doc -->
	 * @see #MONITOR_GROUP
	 * @model name="monitorGroup" literal="monitor-group"
	 * @generated
	 * @ordered
	 */
	public static final int MONITOR_GROUP_VALUE = 65;

	/**
	 * The '<em><b>Next</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the link's context is a part of a series, and
	 *       that the next in the series is the link target.
	 *     
	 * <!-- end-model-doc -->
	 * @see #NEXT
	 * @model name="next"
	 * @generated
	 * @ordered
	 */
	public static final int NEXT_VALUE = 66;

	/**
	 * The '<em><b>Next Archive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the immediately following archive resource.
	 * <!-- end-model-doc -->
	 * @see #NEXT_ARCHIVE
	 * @model name="nextArchive" literal="next-archive"
	 * @generated
	 * @ordered
	 */
	public static final int NEXT_ARCHIVE_VALUE = 67;

	/**
	 * The '<em><b>Nofollow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the context’s original author or publisher does not endorse the link target.
	 * <!-- end-model-doc -->
	 * @see #NOFOLLOW
	 * @model name="nofollow"
	 * @generated
	 * @ordered
	 */
	public static final int NOFOLLOW_VALUE = 68;

	/**
	 * The '<em><b>Noopener</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that any newly created top-level browsing context which results from following the link will not be an auxiliary browsing context.
	 * <!-- end-model-doc -->
	 * @see #NOOPENER
	 * @model name="noopener"
	 * @generated
	 * @ordered
	 */
	public static final int NOOPENER_VALUE = 69;

	/**
	 * The '<em><b>Noreferrer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that no referrer information is to be leaked when following the link.
	 * <!-- end-model-doc -->
	 * @see #NOREFERRER
	 * @model name="noreferrer"
	 * @generated
	 * @ordered
	 */
	public static final int NOREFERRER_VALUE = 70;

	/**
	 * The '<em><b>Opener</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that any newly created top-level browsing context which results from following the link will be an auxiliary browsing context.
	 * <!-- end-model-doc -->
	 * @see #OPENER
	 * @model name="opener"
	 * @generated
	 * @ordered
	 */
	public static final int OPENER_VALUE = 71;

	/**
	 * The '<em><b>Openid2 Local Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to an OpenID Authentication server on which the context relies for an assertion that the end user controls an Identifier.
	 * <!-- end-model-doc -->
	 * @see #OPENID2_LOCAL_ID
	 * @model name="openid2LocalId" literal="openid2.local_id"
	 * @generated
	 * @ordered
	 */
	public static final int OPENID2_LOCAL_ID_VALUE = 72;

	/**
	 * The '<em><b>Openid2 Provider</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource which accepts OpenID Authentication protocol messages for the context.
	 * <!-- end-model-doc -->
	 * @see #OPENID2_PROVIDER
	 * @model name="openid2Provider" literal="openid2.provider"
	 * @generated
	 * @ordered
	 */
	public static final int OPENID2_PROVIDER_VALUE = 73;

	/**
	 * The '<em><b>Original</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Target IRI points to an Original Resource.
	 * <!-- end-model-doc -->
	 * @see #ORIGINAL
	 * @model name="original"
	 * @generated
	 * @ordered
	 */
	public static final int ORIGINAL_VALUE = 74;

	/**
	 * The '<em><b>P3 Pv1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a P3P privacy policy for the context.
	 * <!-- end-model-doc -->
	 * @see #P3_PV1
	 * @model name="P3Pv1"
	 * @generated
	 * @ordered
	 */
	public static final int P3_PV1_VALUE = 75;

	/**
	 * The '<em><b>Payment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates a resource where payment is accepted.
	 * <!-- end-model-doc -->
	 * @see #PAYMENT
	 * @model name="payment"
	 * @generated
	 * @ordered
	 */
	public static final int PAYMENT_VALUE = 76;

	/**
	 * The '<em><b>Pingback</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gives the address of the pingback resource for the link context.
	 * <!-- end-model-doc -->
	 * @see #PINGBACK
	 * @model name="pingback"
	 * @generated
	 * @ordered
	 */
	public static final int PINGBACK_VALUE = 77;

	/**
	 * The '<em><b>Preconnect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to indicate an origin that will be used to fetch required 
	 *       resources for the link context. Initiating an early connection, which 
	 *       includes the DNS lookup, TCP handshake, and optional TLS negotiation, 
	 *       allows the user agent to mask the high latency costs of establishing a 
	 *       connection.
	 * <!-- end-model-doc -->
	 * @see #PRECONNECT
	 * @model name="preconnect"
	 * @generated
	 * @ordered
	 */
	public static final int PRECONNECT_VALUE = 78;

	/**
	 * The '<em><b>Predecessor Version</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Points to a resource containing the predecessor
	 *       version in the version history.
	 *     
	 * <!-- end-model-doc -->
	 * @see #PREDECESSOR_VERSION
	 * @model name="predecessorVersion" literal="predecessor-version"
	 * @generated
	 * @ordered
	 */
	public static final int PREDECESSOR_VERSION_VALUE = 79;

	/**
	 * The '<em><b>Prefetch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The prefetch link relation type is used to identify a resource 
	 *       that might be required by the next navigation from the link context, and 
	 *       that the user agent ought to fetch, such that the user agent can deliver a 
	 *       faster response once the resource is requested in the future.
	 * <!-- end-model-doc -->
	 * @see #PREFETCH
	 * @model name="prefetch"
	 * @generated
	 * @ordered
	 */
	public static final int PREFETCH_VALUE = 80;

	/**
	 * The '<em><b>Preload</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource that should be loaded early in the 
	 *       processing of the link's context, without blocking rendering.
	 * <!-- end-model-doc -->
	 * @see #PRELOAD
	 * @model name="preload"
	 * @generated
	 * @ordered
	 */
	public static final int PRELOAD_VALUE = 81;

	/**
	 * The '<em><b>Prerender</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to identify a resource that might be required by the next 
	 *       navigation from the link context, and that the user agent ought to fetch 
	 *       and execute, such that the user agent can deliver a faster response once 
	 *       the resource is requested in the future.
	 * <!-- end-model-doc -->
	 * @see #PRERENDER
	 * @model name="prerender"
	 * @generated
	 * @ordered
	 */
	public static final int PRERENDER_VALUE = 82;

	/**
	 * The '<em><b>Prev</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the link's context is a part of a series, and
	 *       that the previous in the series is the link target.
	 *     
	 * <!-- end-model-doc -->
	 * @see #PREV
	 * @model name="prev"
	 * @generated
	 * @ordered
	 */
	public static final int PREV_VALUE = 83;

	/**
	 * The '<em><b>Preview</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource that provides a preview of the link's context.
	 * <!-- end-model-doc -->
	 * @see #PREVIEW
	 * @model name="preview"
	 * @generated
	 * @ordered
	 */
	public static final int PREVIEW_VALUE = 84;

	/**
	 * The '<em><b>Previous</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the previous resource in an ordered series
	 *       of resources.  Synonym for "prev".
	 * <!-- end-model-doc -->
	 * @see #PREVIOUS
	 * @model name="previous"
	 * @generated
	 * @ordered
	 */
	public static final int PREVIOUS_VALUE = 85;

	/**
	 * The '<em><b>Prev Archive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the immediately preceding archive resource.
	 * <!-- end-model-doc -->
	 * @see #PREV_ARCHIVE
	 * @model name="prevArchive" literal="prev-archive"
	 * @generated
	 * @ordered
	 */
	public static final int PREV_ARCHIVE_VALUE = 86;

	/**
	 * The '<em><b>Privacy Policy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a privacy policy associated with the link's context.
	 * <!-- end-model-doc -->
	 * @see #PRIVACY_POLICY
	 * @model name="privacyPolicy" literal="privacy-policy"
	 * @generated
	 * @ordered
	 */
	public static final int PRIVACY_POLICY_VALUE = 87;

	/**
	 * The '<em><b>Profile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifying that a resource representation conforms
	 * to a certain profile, without affecting the non-profile semantics
	 * of the resource representation.
	 * <!-- end-model-doc -->
	 * @see #PROFILE
	 * @model name="profile"
	 * @generated
	 * @ordered
	 */
	public static final int PROFILE_VALUE = 88;

	/**
	 * The '<em><b>Publication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Links to a publication manifest. A manifest represents 
	 *       structured information about a publication, such as informative metadata, 
	 *       a list of resources, and a default reading order.
	 * <!-- end-model-doc -->
	 * @see #PUBLICATION
	 * @model name="publication"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLICATION_VALUE = 89;

	/**
	 * The '<em><b>Related</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a related resource.
	 * <!-- end-model-doc -->
	 * @see #RELATED
	 * @model name="related"
	 * @generated
	 * @ordered
	 */
	public static final int RELATED_VALUE = 90;

	/**
	 * The '<em><b>Restconf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the root of RESTCONF API as configured on this HTTP server.
	 *       The "restconf" relation defines the root of the API defined in RFC8040.
	 *       Subsequent revisions of RESTCONF will use alternate relation values to support 
	 *       protocol versioning.
	 * <!-- end-model-doc -->
	 * @see #RESTCONF
	 * @model name="restconf"
	 * @generated
	 * @ordered
	 */
	public static final int RESTCONF_VALUE = 91;

	/**
	 * The '<em><b>Replies</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a resource that is a reply to the context
	 *       of the link.
	 *     
	 * <!-- end-model-doc -->
	 * @see #REPLIES
	 * @model name="replies"
	 * @generated
	 * @ordered
	 */
	public static final int REPLIES_VALUE = 92;

	/**
	 * The '<em><b>Ruleinput</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource identified by the link target provides an input value to an 
	 *     instance of a rule, where the resource which represents the rule instance is 
	 *     identified by the link context.
	 *     
	 * <!-- end-model-doc -->
	 * @see #RULEINPUT
	 * @model name="ruleinput"
	 * @generated
	 * @ordered
	 */
	public static final int RULEINPUT_VALUE = 93;

	/**
	 * The '<em><b>Search</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource that can be used to search through
	 *       the link's context and related resources.
	 * <!-- end-model-doc -->
	 * @see #SEARCH
	 * @model name="search"
	 * @generated
	 * @ordered
	 */
	public static final int SEARCH_VALUE = 94;

	/**
	 * The '<em><b>Section</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a section in a collection of resources.
	 * <!-- end-model-doc -->
	 * @see #SECTION
	 * @model name="section"
	 * @generated
	 * @ordered
	 */
	public static final int SECTION_VALUE = 95;

	/**
	 * The '<em><b>Self</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Conveys an identifier for the link's context.
	 *     
	 * <!-- end-model-doc -->
	 * @see #SELF
	 * @model name="self"
	 * @generated
	 * @ordered
	 */
	public static final int SELF_VALUE = 96;

	/**
	 * The '<em><b>Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates a URI that can be used to retrieve a
	 *       service document.
	 * <!-- end-model-doc -->
	 * @see #SERVICE
	 * @model name="service"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_VALUE = 97;

	/**
	 * The '<em><b>Service Desc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies service description for the context that
	 *       is primarily intended for consumption by machines.
	 * <!-- end-model-doc -->
	 * @see #SERVICE_DESC
	 * @model name="serviceDesc" literal="service-desc"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DESC_VALUE = 98;

	/**
	 * The '<em><b>Service Doc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies service documentation for the context that
	 *       is primarily intended for human consumption.
	 * <!-- end-model-doc -->
	 * @see #SERVICE_DOC
	 * @model name="serviceDoc" literal="service-doc"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DOC_VALUE = 99;

	/**
	 * The '<em><b>Service Meta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies general metadata for the context that is
	 *       primarily intended for consumption by machines.
	 * <!-- end-model-doc -->
	 * @see #SERVICE_META
	 * @model name="serviceMeta" literal="service-meta"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_META_VALUE = 100;

	/**
	 * The '<em><b>Sponsored</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource that is within a context that is 
	 * 		sponsored (such as advertising or another compensation agreement).
	 * <!-- end-model-doc -->
	 * @see #SPONSORED
	 * @model name="sponsored"
	 * @generated
	 * @ordered
	 */
	public static final int SPONSORED_VALUE = 101;

	/**
	 * The '<em><b>Start</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the first resource in a collection of
	 *       resources.
	 * <!-- end-model-doc -->
	 * @see #START
	 * @model name="start"
	 * @generated
	 * @ordered
	 */
	public static final int START_VALUE = 102;

	/**
	 * The '<em><b>Status</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a resource that represents the context's
	 *       status.
	 * <!-- end-model-doc -->
	 * @see #STATUS
	 * @model name="status"
	 * @generated
	 * @ordered
	 */
	public static final int STATUS_VALUE = 103;

	/**
	 * The '<em><b>Stylesheet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a stylesheet.
	 * <!-- end-model-doc -->
	 * @see #STYLESHEET
	 * @model name="stylesheet"
	 * @generated
	 * @ordered
	 */
	public static final int STYLESHEET_VALUE = 104;

	/**
	 * The '<em><b>Subsection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource serving as a subsection in a
	 *       collection of resources.
	 * <!-- end-model-doc -->
	 * @see #SUBSECTION
	 * @model name="subsection"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSECTION_VALUE = 105;

	/**
	 * The '<em><b>Successor Version</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Points to a resource containing the successor version
	 *       in the version history.
	 *     
	 * <!-- end-model-doc -->
	 * @see #SUCCESSOR_VERSION
	 * @model name="successorVersion" literal="successor-version"
	 * @generated
	 * @ordered
	 */
	public static final int SUCCESSOR_VERSION_VALUE = 106;

	/**
	 * The '<em><b>Sunset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a resource that provides information about
	 *       the context's retirement policy.
	 *     
	 * <!-- end-model-doc -->
	 * @see #SUNSET
	 * @model name="sunset"
	 * @generated
	 * @ordered
	 */
	public static final int SUNSET_VALUE = 107;

	/**
	 * The '<em><b>Tag</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gives a tag (identified by the given address) that applies to
	 *       the current document.
	 *     
	 * <!-- end-model-doc -->
	 * @see #TAG
	 * @model name="tag"
	 * @generated
	 * @ordered
	 */
	public static final int TAG_VALUE = 108;

	/**
	 * The '<em><b>Terms Of Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the terms of service associated with the link's context.
	 * <!-- end-model-doc -->
	 * @see #TERMS_OF_SERVICE
	 * @model name="termsOfService" literal="terms-of-service"
	 * @generated
	 * @ordered
	 */
	public static final int TERMS_OF_SERVICE_VALUE = 109;

	/**
	 * The '<em><b>Timegate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Target IRI points to a TimeGate for an Original Resource.
	 * <!-- end-model-doc -->
	 * @see #TIMEGATE
	 * @model name="timegate"
	 * @generated
	 * @ordered
	 */
	public static final int TIMEGATE_VALUE = 110;

	/**
	 * The '<em><b>Timemap</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Target IRI points to a TimeMap for an Original Resource.
	 * <!-- end-model-doc -->
	 * @see #TIMEMAP
	 * @model name="timemap"
	 * @generated
	 * @ordered
	 */
	public static final int TIMEMAP_VALUE = 111;

	/**
	 * The '<em><b>Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource identifying the abstract semantic type of which the link's context is considered to be an instance.
	 * <!-- end-model-doc -->
	 * @see #TYPE
	 * @model name="type"
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_VALUE = 112;

	/**
	 * The '<em><b>Ugc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a resource that is within a context that is User Generated Content.
	 *     
	 * <!-- end-model-doc -->
	 * @see #UGC
	 * @model name="ugc"
	 * @generated
	 * @ordered
	 */
	public static final int UGC_VALUE = 113;

	/**
	 * The '<em><b>Up</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to a parent document in a hierarchy of
	 *       documents.
	 *     
	 * <!-- end-model-doc -->
	 * @see #UP
	 * @model name="up"
	 * @generated
	 * @ordered
	 */
	public static final int UP_VALUE = 114;

	/**
	 * The '<em><b>Version History</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Points to a resource containing the version history
	 *       for the context.
	 *     
	 * <!-- end-model-doc -->
	 * @see #VERSION_HISTORY
	 * @model name="versionHistory" literal="version-history"
	 * @generated
	 * @ordered
	 */
	public static final int VERSION_HISTORY_VALUE = 115;

	/**
	 * The '<em><b>Via</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a resource that is the source of the
	 *       information in the link's context.
	 *     
	 * <!-- end-model-doc -->
	 * @see #VIA
	 * @model name="via"
	 * @generated
	 * @ordered
	 */
	public static final int VIA_VALUE = 116;

	/**
	 * The '<em><b>Webmention</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a target URI that supports the Webmention protocol.
	 *     This allows clients that mention a resource in some form of publishing process
	 *     to contact that endpoint and inform it that this resource has been mentioned.
	 * <!-- end-model-doc -->
	 * @see #WEBMENTION
	 * @model name="webmention"
	 * @generated
	 * @ordered
	 */
	public static final int WEBMENTION_VALUE = 117;

	/**
	 * The '<em><b>Working Copy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Points to a working copy for this resource.
	 * <!-- end-model-doc -->
	 * @see #WORKING_COPY
	 * @model name="workingCopy" literal="working-copy"
	 * @generated
	 * @ordered
	 */
	public static final int WORKING_COPY_VALUE = 118;

	/**
	 * The '<em><b>Working Copy Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Points to the versioned resource from which this
	 *       working copy was obtained.
	 *     
	 * <!-- end-model-doc -->
	 * @see #WORKING_COPY_OF
	 * @model name="workingCopyOf" literal="working-copy-of"
	 * @generated
	 * @ordered
	 */
	public static final int WORKING_COPY_OF_VALUE = 119;

	/**
	 * An array of all the '<em><b>Link Relation Types Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LinkRelationTypesEnum[] VALUES_ARRAY =
		new LinkRelationTypesEnum[] {
			ABOUT,
			ACL,
			ALTERNATE,
			AMPHTML,
			APPENDIX,
			APPLE_TOUCH_ICON,
			APPLE_TOUCH_STARTUP_IMAGE,
			ARCHIVES,
			AUTHOR,
			BLOCKED_BY,
			BOOKMARK,
			CANONICAL,
			CHAPTER,
			CITE_AS,
			COLLECTION,
			CONTENTS,
			CONVERTED_FROM,
			COPYRIGHT,
			CREATE_FORM,
			CURRENT,
			DESCRIBEDBY,
			DESCRIBES,
			DISCLOSURE,
			DNS_PREFETCH,
			DUPLICATE,
			EDIT,
			EDIT_FORM,
			EDIT_MEDIA,
			ENCLOSURE,
			EXTERNAL,
			FIRST,
			GLOSSARY,
			HELP,
			HOSTS,
			HUB,
			ICON,
			INDEX,
			INTERVAL_AFTER,
			INTERVAL_BEFORE,
			INTERVAL_CONTAINS,
			INTERVAL_DISJOINT,
			INTERVAL_DURING,
			INTERVAL_EQUALS,
			INTERVAL_FINISHED_BY,
			INTERVAL_FINISHES,
			INTERVAL_IN,
			INTERVAL_MEETS,
			INTERVAL_MET_BY,
			INTERVAL_OVERLAPPED_BY,
			INTERVAL_OVERLAPS,
			INTERVAL_STARTED_BY,
			INTERVAL_STARTS,
			ITEM,
			LAST,
			LATEST_VERSION,
			LICENSE,
			LINKSET,
			LRDD,
			MANIFEST,
			MASK_ICON,
			MEDIA_FEED,
			MEMENTO,
			MICROPUB,
			MODULEPRELOAD,
			MONITOR,
			MONITOR_GROUP,
			NEXT,
			NEXT_ARCHIVE,
			NOFOLLOW,
			NOOPENER,
			NOREFERRER,
			OPENER,
			OPENID2_LOCAL_ID,
			OPENID2_PROVIDER,
			ORIGINAL,
			P3_PV1,
			PAYMENT,
			PINGBACK,
			PRECONNECT,
			PREDECESSOR_VERSION,
			PREFETCH,
			PRELOAD,
			PRERENDER,
			PREV,
			PREVIEW,
			PREVIOUS,
			PREV_ARCHIVE,
			PRIVACY_POLICY,
			PROFILE,
			PUBLICATION,
			RELATED,
			RESTCONF,
			REPLIES,
			RULEINPUT,
			SEARCH,
			SECTION,
			SELF,
			SERVICE,
			SERVICE_DESC,
			SERVICE_DOC,
			SERVICE_META,
			SPONSORED,
			START,
			STATUS,
			STYLESHEET,
			SUBSECTION,
			SUCCESSOR_VERSION,
			SUNSET,
			TAG,
			TERMS_OF_SERVICE,
			TIMEGATE,
			TIMEMAP,
			TYPE,
			UGC,
			UP,
			VERSION_HISTORY,
			VIA,
			WEBMENTION,
			WORKING_COPY,
			WORKING_COPY_OF,
		};

	/**
	 * A public read-only list of all the '<em><b>Link Relation Types Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LinkRelationTypesEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Link Relation Types Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LinkRelationTypesEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LinkRelationTypesEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Link Relation Types Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LinkRelationTypesEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LinkRelationTypesEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Link Relation Types Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LinkRelationTypesEnum get(int value) {
		switch (value) {
			case ABOUT_VALUE: return ABOUT;
			case ACL_VALUE: return ACL;
			case ALTERNATE_VALUE: return ALTERNATE;
			case AMPHTML_VALUE: return AMPHTML;
			case APPENDIX_VALUE: return APPENDIX;
			case APPLE_TOUCH_ICON_VALUE: return APPLE_TOUCH_ICON;
			case APPLE_TOUCH_STARTUP_IMAGE_VALUE: return APPLE_TOUCH_STARTUP_IMAGE;
			case ARCHIVES_VALUE: return ARCHIVES;
			case AUTHOR_VALUE: return AUTHOR;
			case BLOCKED_BY_VALUE: return BLOCKED_BY;
			case BOOKMARK_VALUE: return BOOKMARK;
			case CANONICAL_VALUE: return CANONICAL;
			case CHAPTER_VALUE: return CHAPTER;
			case CITE_AS_VALUE: return CITE_AS;
			case COLLECTION_VALUE: return COLLECTION;
			case CONTENTS_VALUE: return CONTENTS;
			case CONVERTED_FROM_VALUE: return CONVERTED_FROM;
			case COPYRIGHT_VALUE: return COPYRIGHT;
			case CREATE_FORM_VALUE: return CREATE_FORM;
			case CURRENT_VALUE: return CURRENT;
			case DESCRIBEDBY_VALUE: return DESCRIBEDBY;
			case DESCRIBES_VALUE: return DESCRIBES;
			case DISCLOSURE_VALUE: return DISCLOSURE;
			case DNS_PREFETCH_VALUE: return DNS_PREFETCH;
			case DUPLICATE_VALUE: return DUPLICATE;
			case EDIT_VALUE: return EDIT;
			case EDIT_FORM_VALUE: return EDIT_FORM;
			case EDIT_MEDIA_VALUE: return EDIT_MEDIA;
			case ENCLOSURE_VALUE: return ENCLOSURE;
			case EXTERNAL_VALUE: return EXTERNAL;
			case FIRST_VALUE: return FIRST;
			case GLOSSARY_VALUE: return GLOSSARY;
			case HELP_VALUE: return HELP;
			case HOSTS_VALUE: return HOSTS;
			case HUB_VALUE: return HUB;
			case ICON_VALUE: return ICON;
			case INDEX_VALUE: return INDEX;
			case INTERVAL_AFTER_VALUE: return INTERVAL_AFTER;
			case INTERVAL_BEFORE_VALUE: return INTERVAL_BEFORE;
			case INTERVAL_CONTAINS_VALUE: return INTERVAL_CONTAINS;
			case INTERVAL_DISJOINT_VALUE: return INTERVAL_DISJOINT;
			case INTERVAL_DURING_VALUE: return INTERVAL_DURING;
			case INTERVAL_EQUALS_VALUE: return INTERVAL_EQUALS;
			case INTERVAL_FINISHED_BY_VALUE: return INTERVAL_FINISHED_BY;
			case INTERVAL_FINISHES_VALUE: return INTERVAL_FINISHES;
			case INTERVAL_IN_VALUE: return INTERVAL_IN;
			case INTERVAL_MEETS_VALUE: return INTERVAL_MEETS;
			case INTERVAL_MET_BY_VALUE: return INTERVAL_MET_BY;
			case INTERVAL_OVERLAPPED_BY_VALUE: return INTERVAL_OVERLAPPED_BY;
			case INTERVAL_OVERLAPS_VALUE: return INTERVAL_OVERLAPS;
			case INTERVAL_STARTED_BY_VALUE: return INTERVAL_STARTED_BY;
			case INTERVAL_STARTS_VALUE: return INTERVAL_STARTS;
			case ITEM_VALUE: return ITEM;
			case LAST_VALUE: return LAST;
			case LATEST_VERSION_VALUE: return LATEST_VERSION;
			case LICENSE_VALUE: return LICENSE;
			case LINKSET_VALUE: return LINKSET;
			case LRDD_VALUE: return LRDD;
			case MANIFEST_VALUE: return MANIFEST;
			case MASK_ICON_VALUE: return MASK_ICON;
			case MEDIA_FEED_VALUE: return MEDIA_FEED;
			case MEMENTO_VALUE: return MEMENTO;
			case MICROPUB_VALUE: return MICROPUB;
			case MODULEPRELOAD_VALUE: return MODULEPRELOAD;
			case MONITOR_VALUE: return MONITOR;
			case MONITOR_GROUP_VALUE: return MONITOR_GROUP;
			case NEXT_VALUE: return NEXT;
			case NEXT_ARCHIVE_VALUE: return NEXT_ARCHIVE;
			case NOFOLLOW_VALUE: return NOFOLLOW;
			case NOOPENER_VALUE: return NOOPENER;
			case NOREFERRER_VALUE: return NOREFERRER;
			case OPENER_VALUE: return OPENER;
			case OPENID2_LOCAL_ID_VALUE: return OPENID2_LOCAL_ID;
			case OPENID2_PROVIDER_VALUE: return OPENID2_PROVIDER;
			case ORIGINAL_VALUE: return ORIGINAL;
			case P3_PV1_VALUE: return P3_PV1;
			case PAYMENT_VALUE: return PAYMENT;
			case PINGBACK_VALUE: return PINGBACK;
			case PRECONNECT_VALUE: return PRECONNECT;
			case PREDECESSOR_VERSION_VALUE: return PREDECESSOR_VERSION;
			case PREFETCH_VALUE: return PREFETCH;
			case PRELOAD_VALUE: return PRELOAD;
			case PRERENDER_VALUE: return PRERENDER;
			case PREV_VALUE: return PREV;
			case PREVIEW_VALUE: return PREVIEW;
			case PREVIOUS_VALUE: return PREVIOUS;
			case PREV_ARCHIVE_VALUE: return PREV_ARCHIVE;
			case PRIVACY_POLICY_VALUE: return PRIVACY_POLICY;
			case PROFILE_VALUE: return PROFILE;
			case PUBLICATION_VALUE: return PUBLICATION;
			case RELATED_VALUE: return RELATED;
			case RESTCONF_VALUE: return RESTCONF;
			case REPLIES_VALUE: return REPLIES;
			case RULEINPUT_VALUE: return RULEINPUT;
			case SEARCH_VALUE: return SEARCH;
			case SECTION_VALUE: return SECTION;
			case SELF_VALUE: return SELF;
			case SERVICE_VALUE: return SERVICE;
			case SERVICE_DESC_VALUE: return SERVICE_DESC;
			case SERVICE_DOC_VALUE: return SERVICE_DOC;
			case SERVICE_META_VALUE: return SERVICE_META;
			case SPONSORED_VALUE: return SPONSORED;
			case START_VALUE: return START;
			case STATUS_VALUE: return STATUS;
			case STYLESHEET_VALUE: return STYLESHEET;
			case SUBSECTION_VALUE: return SUBSECTION;
			case SUCCESSOR_VERSION_VALUE: return SUCCESSOR_VERSION;
			case SUNSET_VALUE: return SUNSET;
			case TAG_VALUE: return TAG;
			case TERMS_OF_SERVICE_VALUE: return TERMS_OF_SERVICE;
			case TIMEGATE_VALUE: return TIMEGATE;
			case TIMEMAP_VALUE: return TIMEMAP;
			case TYPE_VALUE: return TYPE;
			case UGC_VALUE: return UGC;
			case UP_VALUE: return UP;
			case VERSION_HISTORY_VALUE: return VERSION_HISTORY;
			case VIA_VALUE: return VIA;
			case WEBMENTION_VALUE: return WEBMENTION;
			case WORKING_COPY_VALUE: return WORKING_COPY;
			case WORKING_COPY_OF_VALUE: return WORKING_COPY_OF;
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
	private LinkRelationTypesEnum(int value, String name, String literal) {
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
	
} //LinkRelationTypesEnum
