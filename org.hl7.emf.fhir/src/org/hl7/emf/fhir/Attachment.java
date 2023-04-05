/**
 */
package org.hl7.emf.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * For referring to data content defined in other formats.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.emf.fhir.Attachment#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Attachment#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Attachment#getData <em>Data</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Attachment#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Attachment#getSize <em>Size</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Attachment#getHash <em>Hash</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Attachment#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Attachment#getCreation <em>Creation</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Attachment#getHeight <em>Height</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Attachment#getWidth <em>Width</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Attachment#getFrames <em>Frames</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Attachment#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.hl7.emf.fhir.Attachment#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @see org.hl7.emf.fhir.FhirPackage#getAttachment()
 * @model extendedMetaData="name='Attachment' kind='elementOnly'"
 * @generated
 */
public interface Attachment extends DataType {
	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the type of the data in the attachment and allows a method to be chosen to interpret or render the data. Includes mime type parameters such as charset where appropriate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Type</em>' containment reference.
	 * @see #setContentType(Code)
	 * @see org.hl7.emf.fhir.FhirPackage#getAttachment_ContentType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentType' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getContentType();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Attachment#getContentType <em>Content Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' containment reference.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(Code value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The human language of the content. The value can be any valid value according to BCP 47.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(Code)
	 * @see org.hl7.emf.fhir.FhirPackage#getAttachment_Language()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getLanguage();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Attachment#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Code value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual data of the attachment - a sequence of bytes, base64 encoded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(Base64Binary)
	 * @see org.hl7.emf.fhir.FhirPackage#getAttachment_Data()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getData();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Attachment#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A location where the data can be accessed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Url)
	 * @see org.hl7.emf.fhir.FhirPackage#getAttachment_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Url getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Attachment#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Url value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of bytes of data that make up this attachment (before base64 encoding, if that is done).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(Integer64)
	 * @see org.hl7.emf.fhir.FhirPackage#getAttachment_Size()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='size' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer64 getSize();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Attachment#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Integer64 value);

	/**
	 * Returns the value of the '<em><b>Hash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The calculated hash of the data using SHA-1. Represented using base64.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hash</em>' containment reference.
	 * @see #setHash(Base64Binary)
	 * @see org.hl7.emf.fhir.FhirPackage#getAttachment_Hash()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hash' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getHash();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Attachment#getHash <em>Hash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash</em>' containment reference.
	 * @see #getHash()
	 * @generated
	 */
	void setHash(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A label or set of text to display in place of the data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.emf.fhir.String)
	 * @see org.hl7.emf.fhir.FhirPackage#getAttachment_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.emf.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Attachment#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.emf.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Creation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date that the attachment was first created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation</em>' containment reference.
	 * @see #setCreation(DateTime)
	 * @see org.hl7.emf.fhir.FhirPackage#getAttachment_Creation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='creation' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCreation();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Attachment#getCreation <em>Creation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation</em>' containment reference.
	 * @see #getCreation()
	 * @generated
	 */
	void setCreation(DateTime value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Height of the image in pixels (photo/video).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' containment reference.
	 * @see #setHeight(PositiveInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getAttachment_Height()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='height' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getHeight();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Attachment#getHeight <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' containment reference.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Width of the image in pixels (photo/video).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' containment reference.
	 * @see #setWidth(PositiveInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getAttachment_Width()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='width' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getWidth();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Attachment#getWidth <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' containment reference.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Frames</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of frames in a photo. This is used with a multi-page fax, or an imaging acquisition context that takes multiple slices in a single image, or an animated gif. If there is more than one frame, this SHALL have a value in order to alert interface software that a multi-frame capable rendering widget is required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frames</em>' containment reference.
	 * @see #setFrames(PositiveInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getAttachment_Frames()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='frames' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getFrames();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Attachment#getFrames <em>Frames</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frames</em>' containment reference.
	 * @see #getFrames()
	 * @generated
	 */
	void setFrames(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The duration of the recording in seconds - for audio and video.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(Decimal)
	 * @see org.hl7.emf.fhir.FhirPackage#getAttachment_Duration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getDuration();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Attachment#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Decimal value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of pages when printed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference.
	 * @see #setPages(PositiveInt)
	 * @see org.hl7.emf.fhir.FhirPackage#getAttachment_Pages()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pages' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getPages();

	/**
	 * Sets the value of the '{@link org.hl7.emf.fhir.Attachment#getPages <em>Pages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pages</em>' containment reference.
	 * @see #getPages()
	 * @generated
	 */
	void setPages(PositiveInt value);

} // Attachment
