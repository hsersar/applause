/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cell Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getCellType()
 * @model
 * @generated
 */
public enum CellType implements Enumerator
{
  /**
   * The '<em><b>Default</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEFAULT_VALUE
   * @generated
   * @ordered
   */
  DEFAULT(0, "default", "Default"),

  /**
   * The '<em><b>Default With Disclosure</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEFAULT_WITH_DISCLOSURE_VALUE
   * @generated
   * @ordered
   */
  DEFAULT_WITH_DISCLOSURE(1, "defaultWithDisclosure", "DefaultWithDisclosure"),

  /**
   * The '<em><b>Value2</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VALUE2_VALUE
   * @generated
   * @ordered
   */
  VALUE2(2, "value2", "Value2"),

  /**
   * The '<em><b>Double</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOUBLE_VALUE
   * @generated
   * @ordered
   */
  DOUBLE(3, "double", "Double"),

  /**
   * The '<em><b>Subtitle</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUBTITLE_VALUE
   * @generated
   * @ordered
   */
  SUBTITLE(4, "subtitle", "Subtitle");

  /**
   * The '<em><b>Default</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Default</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEFAULT
   * @model name="default" literal="Default"
   * @generated
   * @ordered
   */
  public static final int DEFAULT_VALUE = 0;

  /**
   * The '<em><b>Default With Disclosure</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Default With Disclosure</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEFAULT_WITH_DISCLOSURE
   * @model name="defaultWithDisclosure" literal="DefaultWithDisclosure"
   * @generated
   * @ordered
   */
  public static final int DEFAULT_WITH_DISCLOSURE_VALUE = 1;

  /**
   * The '<em><b>Value2</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Value2</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VALUE2
   * @model name="value2" literal="Value2"
   * @generated
   * @ordered
   */
  public static final int VALUE2_VALUE = 2;

  /**
   * The '<em><b>Double</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Double</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DOUBLE
   * @model name="double" literal="Double"
   * @generated
   * @ordered
   */
  public static final int DOUBLE_VALUE = 3;

  /**
   * The '<em><b>Subtitle</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Subtitle</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SUBTITLE
   * @model name="subtitle" literal="Subtitle"
   * @generated
   * @ordered
   */
  public static final int SUBTITLE_VALUE = 4;

  /**
   * An array of all the '<em><b>Cell Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final CellType[] VALUES_ARRAY =
    new CellType[]
    {
      DEFAULT,
      DEFAULT_WITH_DISCLOSURE,
      VALUE2,
      DOUBLE,
      SUBTITLE,
    };

  /**
   * A public read-only list of all the '<em><b>Cell Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<CellType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Cell Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CellType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      CellType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Cell Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CellType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      CellType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Cell Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CellType get(int value)
  {
    switch (value)
    {
      case DEFAULT_VALUE: return DEFAULT;
      case DEFAULT_WITH_DISCLOSURE_VALUE: return DEFAULT_WITH_DISCLOSURE;
      case VALUE2_VALUE: return VALUE2;
      case DOUBLE_VALUE: return DOUBLE;
      case SUBTITLE_VALUE: return SUBTITLE;
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
  private CellType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //CellType
