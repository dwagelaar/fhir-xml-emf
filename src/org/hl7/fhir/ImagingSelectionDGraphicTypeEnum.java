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
 * A representation of the literals of the enumeration '<em><b>Imaging Selection DGraphic Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getImagingSelectionDGraphicTypeEnum()
 * @model extendedMetaData="name='ImagingSelectionDGraphicTypeEnum'"
 * @generated
 */
public enum ImagingSelectionDGraphicTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * POINT
	 * <!-- end-model-doc -->
	 * @see #POINT_VALUE
	 * @generated
	 * @ordered
	 */
	POINT(0, "point", "point"),

	/**
	 * The '<em><b>Multipoint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MULTIPOINT
	 * <!-- end-model-doc -->
	 * @see #MULTIPOINT_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPOINT(1, "multipoint", "multipoint"),

	/**
	 * The '<em><b>Polyline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * POLYLINE
	 * <!-- end-model-doc -->
	 * @see #POLYLINE_VALUE
	 * @generated
	 * @ordered
	 */
	POLYLINE(2, "polyline", "polyline"),

	/**
	 * The '<em><b>Polygon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * POLYGON
	 * <!-- end-model-doc -->
	 * @see #POLYGON_VALUE
	 * @generated
	 * @ordered
	 */
	POLYGON(3, "polygon", "polygon"),

	/**
	 * The '<em><b>Ellipse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ELLIPSE
	 * <!-- end-model-doc -->
	 * @see #ELLIPSE_VALUE
	 * @generated
	 * @ordered
	 */
	ELLIPSE(4, "ellipse", "ellipse"),

	/**
	 * The '<em><b>Ellipsoid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ELLIPSOID
	 * <!-- end-model-doc -->
	 * @see #ELLIPSOID_VALUE
	 * @generated
	 * @ordered
	 */
	ELLIPSOID(5, "ellipsoid", "ellipsoid");

	/**
	 * The '<em><b>Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * POINT
	 * <!-- end-model-doc -->
	 * @see #POINT
	 * @model name="point"
	 * @generated
	 * @ordered
	 */
	public static final int POINT_VALUE = 0;

	/**
	 * The '<em><b>Multipoint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MULTIPOINT
	 * <!-- end-model-doc -->
	 * @see #MULTIPOINT
	 * @model name="multipoint"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPOINT_VALUE = 1;

	/**
	 * The '<em><b>Polyline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * POLYLINE
	 * <!-- end-model-doc -->
	 * @see #POLYLINE
	 * @model name="polyline"
	 * @generated
	 * @ordered
	 */
	public static final int POLYLINE_VALUE = 2;

	/**
	 * The '<em><b>Polygon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * POLYGON
	 * <!-- end-model-doc -->
	 * @see #POLYGON
	 * @model name="polygon"
	 * @generated
	 * @ordered
	 */
	public static final int POLYGON_VALUE = 3;

	/**
	 * The '<em><b>Ellipse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ELLIPSE
	 * <!-- end-model-doc -->
	 * @see #ELLIPSE
	 * @model name="ellipse"
	 * @generated
	 * @ordered
	 */
	public static final int ELLIPSE_VALUE = 4;

	/**
	 * The '<em><b>Ellipsoid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ELLIPSOID
	 * <!-- end-model-doc -->
	 * @see #ELLIPSOID
	 * @model name="ellipsoid"
	 * @generated
	 * @ordered
	 */
	public static final int ELLIPSOID_VALUE = 5;

	/**
	 * An array of all the '<em><b>Imaging Selection DGraphic Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImagingSelectionDGraphicTypeEnum[] VALUES_ARRAY =
		new ImagingSelectionDGraphicTypeEnum[] {
			POINT,
			MULTIPOINT,
			POLYLINE,
			POLYGON,
			ELLIPSE,
			ELLIPSOID,
		};

	/**
	 * A public read-only list of all the '<em><b>Imaging Selection DGraphic Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImagingSelectionDGraphicTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Imaging Selection DGraphic Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImagingSelectionDGraphicTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImagingSelectionDGraphicTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Imaging Selection DGraphic Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImagingSelectionDGraphicTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImagingSelectionDGraphicTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Imaging Selection DGraphic Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImagingSelectionDGraphicTypeEnum get(int value) {
		switch (value) {
			case POINT_VALUE: return POINT;
			case MULTIPOINT_VALUE: return MULTIPOINT;
			case POLYLINE_VALUE: return POLYLINE;
			case POLYGON_VALUE: return POLYGON;
			case ELLIPSE_VALUE: return ELLIPSE;
			case ELLIPSOID_VALUE: return ELLIPSOID;
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
	private ImagingSelectionDGraphicTypeEnum(int value, String name, String literal) {
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
	
} //ImagingSelectionDGraphicTypeEnum
