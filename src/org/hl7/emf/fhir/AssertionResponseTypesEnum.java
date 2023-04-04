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
 * A representation of the literals of the enumeration '<em><b>Assertion Response Types Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.emf.fhir.FhirPackage#getAssertionResponseTypesEnum()
 * @model extendedMetaData="name='AssertionResponseTypesEnum'"
 * @generated
 */
public enum AssertionResponseTypesEnum implements Enumerator {
	/**
	 * The '<em><b>Continue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Continue
	 * <!-- end-model-doc -->
	 * @see #CONTINUE_VALUE
	 * @generated
	 * @ordered
	 */
	CONTINUE(0, "continue", "continue"),

	/**
	 * The '<em><b>Switching Protocols</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Switching Protocols
	 * <!-- end-model-doc -->
	 * @see #SWITCHING_PROTOCOLS_VALUE
	 * @generated
	 * @ordered
	 */
	SWITCHING_PROTOCOLS(1, "switchingProtocols", "switchingProtocols"),

	/**
	 * The '<em><b>Okay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OK
	 * <!-- end-model-doc -->
	 * @see #OKAY_VALUE
	 * @generated
	 * @ordered
	 */
	OKAY(2, "okay", "okay"),

	/**
	 * The '<em><b>Created</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Created
	 * <!-- end-model-doc -->
	 * @see #CREATED_VALUE
	 * @generated
	 * @ordered
	 */
	CREATED(3, "created", "created"),

	/**
	 * The '<em><b>Accepted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accepted
	 * <!-- end-model-doc -->
	 * @see #ACCEPTED_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPTED(4, "accepted", "accepted"),

	/**
	 * The '<em><b>Non Authoritative Information</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Non-Authoritative Information
	 * <!-- end-model-doc -->
	 * @see #NON_AUTHORITATIVE_INFORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	NON_AUTHORITATIVE_INFORMATION(5, "nonAuthoritativeInformation", "nonAuthoritativeInformation"),

	/**
	 * The '<em><b>No Content</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No Content
	 * <!-- end-model-doc -->
	 * @see #NO_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	NO_CONTENT(6, "noContent", "noContent"),

	/**
	 * The '<em><b>Reset Content</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reset Content
	 * <!-- end-model-doc -->
	 * @see #RESET_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	RESET_CONTENT(7, "resetContent", "resetContent"),

	/**
	 * The '<em><b>Partial Content</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Partial Content
	 * <!-- end-model-doc -->
	 * @see #PARTIAL_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIAL_CONTENT(8, "partialContent", "partialContent"),

	/**
	 * The '<em><b>Multiple Choices</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Multiple Choices
	 * <!-- end-model-doc -->
	 * @see #MULTIPLE_CHOICES_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLE_CHOICES(9, "multipleChoices", "multipleChoices"),

	/**
	 * The '<em><b>Moved Permanently</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Moved Permanently
	 * <!-- end-model-doc -->
	 * @see #MOVED_PERMANENTLY_VALUE
	 * @generated
	 * @ordered
	 */
	MOVED_PERMANENTLY(10, "movedPermanently", "movedPermanently"),

	/**
	 * The '<em><b>Found</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Found
	 * <!-- end-model-doc -->
	 * @see #FOUND_VALUE
	 * @generated
	 * @ordered
	 */
	FOUND(11, "found", "found"),

	/**
	 * The '<em><b>See Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See Other
	 * <!-- end-model-doc -->
	 * @see #SEE_OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	SEE_OTHER(12, "seeOther", "seeOther"),

	/**
	 * The '<em><b>Not Modified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Modified
	 * <!-- end-model-doc -->
	 * @see #NOT_MODIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_MODIFIED(13, "notModified", "notModified"),

	/**
	 * The '<em><b>Use Proxy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use Proxy
	 * <!-- end-model-doc -->
	 * @see #USE_PROXY_VALUE
	 * @generated
	 * @ordered
	 */
	USE_PROXY(14, "useProxy", "useProxy"),

	/**
	 * The '<em><b>Temporary Redirect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Temporary Redirect
	 * <!-- end-model-doc -->
	 * @see #TEMPORARY_REDIRECT_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPORARY_REDIRECT(15, "temporaryRedirect", "temporaryRedirect"),

	/**
	 * The '<em><b>Permanent Redirect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Permanent Redirect
	 * <!-- end-model-doc -->
	 * @see #PERMANENT_REDIRECT_VALUE
	 * @generated
	 * @ordered
	 */
	PERMANENT_REDIRECT(16, "permanentRedirect", "permanentRedirect"),

	/**
	 * The '<em><b>Bad Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bad Request
	 * <!-- end-model-doc -->
	 * @see #BAD_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	BAD_REQUEST(17, "badRequest", "badRequest"),

	/**
	 * The '<em><b>Unauthorized</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unauthorized
	 * <!-- end-model-doc -->
	 * @see #UNAUTHORIZED_VALUE
	 * @generated
	 * @ordered
	 */
	UNAUTHORIZED(18, "unauthorized", "unauthorized"),

	/**
	 * The '<em><b>Payment Required</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Payment Required
	 * <!-- end-model-doc -->
	 * @see #PAYMENT_REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	PAYMENT_REQUIRED(19, "paymentRequired", "paymentRequired"),

	/**
	 * The '<em><b>Forbidden</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Forbidden
	 * <!-- end-model-doc -->
	 * @see #FORBIDDEN_VALUE
	 * @generated
	 * @ordered
	 */
	FORBIDDEN(20, "forbidden", "forbidden"),

	/**
	 * The '<em><b>Not Found</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Found
	 * <!-- end-model-doc -->
	 * @see #NOT_FOUND_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_FOUND(21, "notFound", "notFound"),

	/**
	 * The '<em><b>Method Not Allowed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method Not Allowed
	 * <!-- end-model-doc -->
	 * @see #METHOD_NOT_ALLOWED_VALUE
	 * @generated
	 * @ordered
	 */
	METHOD_NOT_ALLOWED(22, "methodNotAllowed", "methodNotAllowed"),

	/**
	 * The '<em><b>Not Acceptable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Acceptable
	 * <!-- end-model-doc -->
	 * @see #NOT_ACCEPTABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_ACCEPTABLE(23, "notAcceptable", "notAcceptable"),

	/**
	 * The '<em><b>Proxy Authentication Required</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Proxy Authentication Required
	 * <!-- end-model-doc -->
	 * @see #PROXY_AUTHENTICATION_REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	PROXY_AUTHENTICATION_REQUIRED(24, "proxyAuthenticationRequired", "proxyAuthenticationRequired"),

	/**
	 * The '<em><b>Request Timeout</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Request Timeout
	 * <!-- end-model-doc -->
	 * @see #REQUEST_TIMEOUT_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_TIMEOUT(25, "requestTimeout", "requestTimeout"),

	/**
	 * The '<em><b>Conflict</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Conflict
	 * <!-- end-model-doc -->
	 * @see #CONFLICT_VALUE
	 * @generated
	 * @ordered
	 */
	CONFLICT(26, "conflict", "conflict"),

	/**
	 * The '<em><b>Gone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gone
	 * <!-- end-model-doc -->
	 * @see #GONE_VALUE
	 * @generated
	 * @ordered
	 */
	GONE(27, "gone", "gone"),

	/**
	 * The '<em><b>Length Required</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Length Required
	 * <!-- end-model-doc -->
	 * @see #LENGTH_REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	LENGTH_REQUIRED(28, "lengthRequired", "lengthRequired"),

	/**
	 * The '<em><b>Precondition Failed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Precondition Failed
	 * <!-- end-model-doc -->
	 * @see #PRECONDITION_FAILED_VALUE
	 * @generated
	 * @ordered
	 */
	PRECONDITION_FAILED(29, "preconditionFailed", "preconditionFailed"),

	/**
	 * The '<em><b>Content Too Large</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content Too Large
	 * <!-- end-model-doc -->
	 * @see #CONTENT_TOO_LARGE_VALUE
	 * @generated
	 * @ordered
	 */
	CONTENT_TOO_LARGE(30, "contentTooLarge", "contentTooLarge"),

	/**
	 * The '<em><b>Uri Too Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI Too Long
	 * <!-- end-model-doc -->
	 * @see #URI_TOO_LONG_VALUE
	 * @generated
	 * @ordered
	 */
	URI_TOO_LONG(31, "uriTooLong", "uriTooLong"),

	/**
	 * The '<em><b>Unsupported Media Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unsupported Media Type
	 * <!-- end-model-doc -->
	 * @see #UNSUPPORTED_MEDIA_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	UNSUPPORTED_MEDIA_TYPE(32, "unsupportedMediaType", "unsupportedMediaType"),

	/**
	 * The '<em><b>Range Not Satisfiable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Range Not Satisfiable
	 * <!-- end-model-doc -->
	 * @see #RANGE_NOT_SATISFIABLE_VALUE
	 * @generated
	 * @ordered
	 */
	RANGE_NOT_SATISFIABLE(33, "rangeNotSatisfiable", "rangeNotSatisfiable"),

	/**
	 * The '<em><b>Expectation Failed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expectation Failed
	 * <!-- end-model-doc -->
	 * @see #EXPECTATION_FAILED_VALUE
	 * @generated
	 * @ordered
	 */
	EXPECTATION_FAILED(34, "expectationFailed", "expectationFailed"),

	/**
	 * The '<em><b>Misdirected Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Misdirected Request
	 * <!-- end-model-doc -->
	 * @see #MISDIRECTED_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	MISDIRECTED_REQUEST(35, "misdirectedRequest", "misdirectedRequest"),

	/**
	 * The '<em><b>Unprocessable Content</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unprocessable Content
	 * <!-- end-model-doc -->
	 * @see #UNPROCESSABLE_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	UNPROCESSABLE_CONTENT(36, "unprocessableContent", "unprocessableContent"),

	/**
	 * The '<em><b>Upgrade Required</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Upgrade Required
	 * <!-- end-model-doc -->
	 * @see #UPGRADE_REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	UPGRADE_REQUIRED(37, "upgradeRequired", "upgradeRequired"),

	/**
	 * The '<em><b>Internal Server Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Internal Server Error
	 * <!-- end-model-doc -->
	 * @see #INTERNAL_SERVER_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNAL_SERVER_ERROR(38, "internalServerError", "internalServerError"),

	/**
	 * The '<em><b>Not Implemented</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Implemented
	 * <!-- end-model-doc -->
	 * @see #NOT_IMPLEMENTED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_IMPLEMENTED(39, "notImplemented", "notImplemented"),

	/**
	 * The '<em><b>Bad Gateway</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bad Gateway
	 * <!-- end-model-doc -->
	 * @see #BAD_GATEWAY_VALUE
	 * @generated
	 * @ordered
	 */
	BAD_GATEWAY(40, "badGateway", "badGateway"),

	/**
	 * The '<em><b>Service Unavailable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Service Unavailable
	 * <!-- end-model-doc -->
	 * @see #SERVICE_UNAVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_UNAVAILABLE(41, "serviceUnavailable", "serviceUnavailable"),

	/**
	 * The '<em><b>Gateway Timeout</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gateway Timeout
	 * <!-- end-model-doc -->
	 * @see #GATEWAY_TIMEOUT_VALUE
	 * @generated
	 * @ordered
	 */
	GATEWAY_TIMEOUT(42, "gatewayTimeout", "gatewayTimeout"),

	/**
	 * The '<em><b>Http Version Not Supported</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HTTP Version Not Supported
	 * <!-- end-model-doc -->
	 * @see #HTTP_VERSION_NOT_SUPPORTED_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_VERSION_NOT_SUPPORTED(43, "httpVersionNotSupported", "httpVersionNotSupported");

	/**
	 * The '<em><b>Continue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Continue
	 * <!-- end-model-doc -->
	 * @see #CONTINUE
	 * @model name="continue"
	 * @generated
	 * @ordered
	 */
	public static final int CONTINUE_VALUE = 0;

	/**
	 * The '<em><b>Switching Protocols</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Switching Protocols
	 * <!-- end-model-doc -->
	 * @see #SWITCHING_PROTOCOLS
	 * @model name="switchingProtocols"
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_PROTOCOLS_VALUE = 1;

	/**
	 * The '<em><b>Okay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OK
	 * <!-- end-model-doc -->
	 * @see #OKAY
	 * @model name="okay"
	 * @generated
	 * @ordered
	 */
	public static final int OKAY_VALUE = 2;

	/**
	 * The '<em><b>Created</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Created
	 * <!-- end-model-doc -->
	 * @see #CREATED
	 * @model name="created"
	 * @generated
	 * @ordered
	 */
	public static final int CREATED_VALUE = 3;

	/**
	 * The '<em><b>Accepted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accepted
	 * <!-- end-model-doc -->
	 * @see #ACCEPTED
	 * @model name="accepted"
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPTED_VALUE = 4;

	/**
	 * The '<em><b>Non Authoritative Information</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Non-Authoritative Information
	 * <!-- end-model-doc -->
	 * @see #NON_AUTHORITATIVE_INFORMATION
	 * @model name="nonAuthoritativeInformation"
	 * @generated
	 * @ordered
	 */
	public static final int NON_AUTHORITATIVE_INFORMATION_VALUE = 5;

	/**
	 * The '<em><b>No Content</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No Content
	 * <!-- end-model-doc -->
	 * @see #NO_CONTENT
	 * @model name="noContent"
	 * @generated
	 * @ordered
	 */
	public static final int NO_CONTENT_VALUE = 6;

	/**
	 * The '<em><b>Reset Content</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reset Content
	 * <!-- end-model-doc -->
	 * @see #RESET_CONTENT
	 * @model name="resetContent"
	 * @generated
	 * @ordered
	 */
	public static final int RESET_CONTENT_VALUE = 7;

	/**
	 * The '<em><b>Partial Content</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Partial Content
	 * <!-- end-model-doc -->
	 * @see #PARTIAL_CONTENT
	 * @model name="partialContent"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIAL_CONTENT_VALUE = 8;

	/**
	 * The '<em><b>Multiple Choices</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Multiple Choices
	 * <!-- end-model-doc -->
	 * @see #MULTIPLE_CHOICES
	 * @model name="multipleChoices"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_CHOICES_VALUE = 9;

	/**
	 * The '<em><b>Moved Permanently</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Moved Permanently
	 * <!-- end-model-doc -->
	 * @see #MOVED_PERMANENTLY
	 * @model name="movedPermanently"
	 * @generated
	 * @ordered
	 */
	public static final int MOVED_PERMANENTLY_VALUE = 10;

	/**
	 * The '<em><b>Found</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Found
	 * <!-- end-model-doc -->
	 * @see #FOUND
	 * @model name="found"
	 * @generated
	 * @ordered
	 */
	public static final int FOUND_VALUE = 11;

	/**
	 * The '<em><b>See Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See Other
	 * <!-- end-model-doc -->
	 * @see #SEE_OTHER
	 * @model name="seeOther"
	 * @generated
	 * @ordered
	 */
	public static final int SEE_OTHER_VALUE = 12;

	/**
	 * The '<em><b>Not Modified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Modified
	 * <!-- end-model-doc -->
	 * @see #NOT_MODIFIED
	 * @model name="notModified"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_MODIFIED_VALUE = 13;

	/**
	 * The '<em><b>Use Proxy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use Proxy
	 * <!-- end-model-doc -->
	 * @see #USE_PROXY
	 * @model name="useProxy"
	 * @generated
	 * @ordered
	 */
	public static final int USE_PROXY_VALUE = 14;

	/**
	 * The '<em><b>Temporary Redirect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Temporary Redirect
	 * <!-- end-model-doc -->
	 * @see #TEMPORARY_REDIRECT
	 * @model name="temporaryRedirect"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPORARY_REDIRECT_VALUE = 15;

	/**
	 * The '<em><b>Permanent Redirect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Permanent Redirect
	 * <!-- end-model-doc -->
	 * @see #PERMANENT_REDIRECT
	 * @model name="permanentRedirect"
	 * @generated
	 * @ordered
	 */
	public static final int PERMANENT_REDIRECT_VALUE = 16;

	/**
	 * The '<em><b>Bad Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bad Request
	 * <!-- end-model-doc -->
	 * @see #BAD_REQUEST
	 * @model name="badRequest"
	 * @generated
	 * @ordered
	 */
	public static final int BAD_REQUEST_VALUE = 17;

	/**
	 * The '<em><b>Unauthorized</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unauthorized
	 * <!-- end-model-doc -->
	 * @see #UNAUTHORIZED
	 * @model name="unauthorized"
	 * @generated
	 * @ordered
	 */
	public static final int UNAUTHORIZED_VALUE = 18;

	/**
	 * The '<em><b>Payment Required</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Payment Required
	 * <!-- end-model-doc -->
	 * @see #PAYMENT_REQUIRED
	 * @model name="paymentRequired"
	 * @generated
	 * @ordered
	 */
	public static final int PAYMENT_REQUIRED_VALUE = 19;

	/**
	 * The '<em><b>Forbidden</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Forbidden
	 * <!-- end-model-doc -->
	 * @see #FORBIDDEN
	 * @model name="forbidden"
	 * @generated
	 * @ordered
	 */
	public static final int FORBIDDEN_VALUE = 20;

	/**
	 * The '<em><b>Not Found</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Found
	 * <!-- end-model-doc -->
	 * @see #NOT_FOUND
	 * @model name="notFound"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_FOUND_VALUE = 21;

	/**
	 * The '<em><b>Method Not Allowed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method Not Allowed
	 * <!-- end-model-doc -->
	 * @see #METHOD_NOT_ALLOWED
	 * @model name="methodNotAllowed"
	 * @generated
	 * @ordered
	 */
	public static final int METHOD_NOT_ALLOWED_VALUE = 22;

	/**
	 * The '<em><b>Not Acceptable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Acceptable
	 * <!-- end-model-doc -->
	 * @see #NOT_ACCEPTABLE
	 * @model name="notAcceptable"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_ACCEPTABLE_VALUE = 23;

	/**
	 * The '<em><b>Proxy Authentication Required</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Proxy Authentication Required
	 * <!-- end-model-doc -->
	 * @see #PROXY_AUTHENTICATION_REQUIRED
	 * @model name="proxyAuthenticationRequired"
	 * @generated
	 * @ordered
	 */
	public static final int PROXY_AUTHENTICATION_REQUIRED_VALUE = 24;

	/**
	 * The '<em><b>Request Timeout</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Request Timeout
	 * <!-- end-model-doc -->
	 * @see #REQUEST_TIMEOUT
	 * @model name="requestTimeout"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_TIMEOUT_VALUE = 25;

	/**
	 * The '<em><b>Conflict</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Conflict
	 * <!-- end-model-doc -->
	 * @see #CONFLICT
	 * @model name="conflict"
	 * @generated
	 * @ordered
	 */
	public static final int CONFLICT_VALUE = 26;

	/**
	 * The '<em><b>Gone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gone
	 * <!-- end-model-doc -->
	 * @see #GONE
	 * @model name="gone"
	 * @generated
	 * @ordered
	 */
	public static final int GONE_VALUE = 27;

	/**
	 * The '<em><b>Length Required</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Length Required
	 * <!-- end-model-doc -->
	 * @see #LENGTH_REQUIRED
	 * @model name="lengthRequired"
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_REQUIRED_VALUE = 28;

	/**
	 * The '<em><b>Precondition Failed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Precondition Failed
	 * <!-- end-model-doc -->
	 * @see #PRECONDITION_FAILED
	 * @model name="preconditionFailed"
	 * @generated
	 * @ordered
	 */
	public static final int PRECONDITION_FAILED_VALUE = 29;

	/**
	 * The '<em><b>Content Too Large</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content Too Large
	 * <!-- end-model-doc -->
	 * @see #CONTENT_TOO_LARGE
	 * @model name="contentTooLarge"
	 * @generated
	 * @ordered
	 */
	public static final int CONTENT_TOO_LARGE_VALUE = 30;

	/**
	 * The '<em><b>Uri Too Long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI Too Long
	 * <!-- end-model-doc -->
	 * @see #URI_TOO_LONG
	 * @model name="uriTooLong"
	 * @generated
	 * @ordered
	 */
	public static final int URI_TOO_LONG_VALUE = 31;

	/**
	 * The '<em><b>Unsupported Media Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unsupported Media Type
	 * <!-- end-model-doc -->
	 * @see #UNSUPPORTED_MEDIA_TYPE
	 * @model name="unsupportedMediaType"
	 * @generated
	 * @ordered
	 */
	public static final int UNSUPPORTED_MEDIA_TYPE_VALUE = 32;

	/**
	 * The '<em><b>Range Not Satisfiable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Range Not Satisfiable
	 * <!-- end-model-doc -->
	 * @see #RANGE_NOT_SATISFIABLE
	 * @model name="rangeNotSatisfiable"
	 * @generated
	 * @ordered
	 */
	public static final int RANGE_NOT_SATISFIABLE_VALUE = 33;

	/**
	 * The '<em><b>Expectation Failed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expectation Failed
	 * <!-- end-model-doc -->
	 * @see #EXPECTATION_FAILED
	 * @model name="expectationFailed"
	 * @generated
	 * @ordered
	 */
	public static final int EXPECTATION_FAILED_VALUE = 34;

	/**
	 * The '<em><b>Misdirected Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Misdirected Request
	 * <!-- end-model-doc -->
	 * @see #MISDIRECTED_REQUEST
	 * @model name="misdirectedRequest"
	 * @generated
	 * @ordered
	 */
	public static final int MISDIRECTED_REQUEST_VALUE = 35;

	/**
	 * The '<em><b>Unprocessable Content</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unprocessable Content
	 * <!-- end-model-doc -->
	 * @see #UNPROCESSABLE_CONTENT
	 * @model name="unprocessableContent"
	 * @generated
	 * @ordered
	 */
	public static final int UNPROCESSABLE_CONTENT_VALUE = 36;

	/**
	 * The '<em><b>Upgrade Required</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Upgrade Required
	 * <!-- end-model-doc -->
	 * @see #UPGRADE_REQUIRED
	 * @model name="upgradeRequired"
	 * @generated
	 * @ordered
	 */
	public static final int UPGRADE_REQUIRED_VALUE = 37;

	/**
	 * The '<em><b>Internal Server Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Internal Server Error
	 * <!-- end-model-doc -->
	 * @see #INTERNAL_SERVER_ERROR
	 * @model name="internalServerError"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNAL_SERVER_ERROR_VALUE = 38;

	/**
	 * The '<em><b>Not Implemented</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Implemented
	 * <!-- end-model-doc -->
	 * @see #NOT_IMPLEMENTED
	 * @model name="notImplemented"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_IMPLEMENTED_VALUE = 39;

	/**
	 * The '<em><b>Bad Gateway</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bad Gateway
	 * <!-- end-model-doc -->
	 * @see #BAD_GATEWAY
	 * @model name="badGateway"
	 * @generated
	 * @ordered
	 */
	public static final int BAD_GATEWAY_VALUE = 40;

	/**
	 * The '<em><b>Service Unavailable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Service Unavailable
	 * <!-- end-model-doc -->
	 * @see #SERVICE_UNAVAILABLE
	 * @model name="serviceUnavailable"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_UNAVAILABLE_VALUE = 41;

	/**
	 * The '<em><b>Gateway Timeout</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gateway Timeout
	 * <!-- end-model-doc -->
	 * @see #GATEWAY_TIMEOUT
	 * @model name="gatewayTimeout"
	 * @generated
	 * @ordered
	 */
	public static final int GATEWAY_TIMEOUT_VALUE = 42;

	/**
	 * The '<em><b>Http Version Not Supported</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HTTP Version Not Supported
	 * <!-- end-model-doc -->
	 * @see #HTTP_VERSION_NOT_SUPPORTED
	 * @model name="httpVersionNotSupported"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_VERSION_NOT_SUPPORTED_VALUE = 43;

	/**
	 * An array of all the '<em><b>Assertion Response Types Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AssertionResponseTypesEnum[] VALUES_ARRAY =
		new AssertionResponseTypesEnum[] {
			CONTINUE,
			SWITCHING_PROTOCOLS,
			OKAY,
			CREATED,
			ACCEPTED,
			NON_AUTHORITATIVE_INFORMATION,
			NO_CONTENT,
			RESET_CONTENT,
			PARTIAL_CONTENT,
			MULTIPLE_CHOICES,
			MOVED_PERMANENTLY,
			FOUND,
			SEE_OTHER,
			NOT_MODIFIED,
			USE_PROXY,
			TEMPORARY_REDIRECT,
			PERMANENT_REDIRECT,
			BAD_REQUEST,
			UNAUTHORIZED,
			PAYMENT_REQUIRED,
			FORBIDDEN,
			NOT_FOUND,
			METHOD_NOT_ALLOWED,
			NOT_ACCEPTABLE,
			PROXY_AUTHENTICATION_REQUIRED,
			REQUEST_TIMEOUT,
			CONFLICT,
			GONE,
			LENGTH_REQUIRED,
			PRECONDITION_FAILED,
			CONTENT_TOO_LARGE,
			URI_TOO_LONG,
			UNSUPPORTED_MEDIA_TYPE,
			RANGE_NOT_SATISFIABLE,
			EXPECTATION_FAILED,
			MISDIRECTED_REQUEST,
			UNPROCESSABLE_CONTENT,
			UPGRADE_REQUIRED,
			INTERNAL_SERVER_ERROR,
			NOT_IMPLEMENTED,
			BAD_GATEWAY,
			SERVICE_UNAVAILABLE,
			GATEWAY_TIMEOUT,
			HTTP_VERSION_NOT_SUPPORTED,
		};

	/**
	 * A public read-only list of all the '<em><b>Assertion Response Types Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AssertionResponseTypesEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Assertion Response Types Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssertionResponseTypesEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssertionResponseTypesEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Assertion Response Types Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssertionResponseTypesEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssertionResponseTypesEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Assertion Response Types Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssertionResponseTypesEnum get(int value) {
		switch (value) {
			case CONTINUE_VALUE: return CONTINUE;
			case SWITCHING_PROTOCOLS_VALUE: return SWITCHING_PROTOCOLS;
			case OKAY_VALUE: return OKAY;
			case CREATED_VALUE: return CREATED;
			case ACCEPTED_VALUE: return ACCEPTED;
			case NON_AUTHORITATIVE_INFORMATION_VALUE: return NON_AUTHORITATIVE_INFORMATION;
			case NO_CONTENT_VALUE: return NO_CONTENT;
			case RESET_CONTENT_VALUE: return RESET_CONTENT;
			case PARTIAL_CONTENT_VALUE: return PARTIAL_CONTENT;
			case MULTIPLE_CHOICES_VALUE: return MULTIPLE_CHOICES;
			case MOVED_PERMANENTLY_VALUE: return MOVED_PERMANENTLY;
			case FOUND_VALUE: return FOUND;
			case SEE_OTHER_VALUE: return SEE_OTHER;
			case NOT_MODIFIED_VALUE: return NOT_MODIFIED;
			case USE_PROXY_VALUE: return USE_PROXY;
			case TEMPORARY_REDIRECT_VALUE: return TEMPORARY_REDIRECT;
			case PERMANENT_REDIRECT_VALUE: return PERMANENT_REDIRECT;
			case BAD_REQUEST_VALUE: return BAD_REQUEST;
			case UNAUTHORIZED_VALUE: return UNAUTHORIZED;
			case PAYMENT_REQUIRED_VALUE: return PAYMENT_REQUIRED;
			case FORBIDDEN_VALUE: return FORBIDDEN;
			case NOT_FOUND_VALUE: return NOT_FOUND;
			case METHOD_NOT_ALLOWED_VALUE: return METHOD_NOT_ALLOWED;
			case NOT_ACCEPTABLE_VALUE: return NOT_ACCEPTABLE;
			case PROXY_AUTHENTICATION_REQUIRED_VALUE: return PROXY_AUTHENTICATION_REQUIRED;
			case REQUEST_TIMEOUT_VALUE: return REQUEST_TIMEOUT;
			case CONFLICT_VALUE: return CONFLICT;
			case GONE_VALUE: return GONE;
			case LENGTH_REQUIRED_VALUE: return LENGTH_REQUIRED;
			case PRECONDITION_FAILED_VALUE: return PRECONDITION_FAILED;
			case CONTENT_TOO_LARGE_VALUE: return CONTENT_TOO_LARGE;
			case URI_TOO_LONG_VALUE: return URI_TOO_LONG;
			case UNSUPPORTED_MEDIA_TYPE_VALUE: return UNSUPPORTED_MEDIA_TYPE;
			case RANGE_NOT_SATISFIABLE_VALUE: return RANGE_NOT_SATISFIABLE;
			case EXPECTATION_FAILED_VALUE: return EXPECTATION_FAILED;
			case MISDIRECTED_REQUEST_VALUE: return MISDIRECTED_REQUEST;
			case UNPROCESSABLE_CONTENT_VALUE: return UNPROCESSABLE_CONTENT;
			case UPGRADE_REQUIRED_VALUE: return UPGRADE_REQUIRED;
			case INTERNAL_SERVER_ERROR_VALUE: return INTERNAL_SERVER_ERROR;
			case NOT_IMPLEMENTED_VALUE: return NOT_IMPLEMENTED;
			case BAD_GATEWAY_VALUE: return BAD_GATEWAY;
			case SERVICE_UNAVAILABLE_VALUE: return SERVICE_UNAVAILABLE;
			case GATEWAY_TIMEOUT_VALUE: return GATEWAY_TIMEOUT;
			case HTTP_VERSION_NOT_SUPPORTED_VALUE: return HTTP_VERSION_NOT_SUPPORTED;
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
	private AssertionResponseTypesEnum(int value, String name, String literal) {
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
	
} //AssertionResponseTypesEnum
