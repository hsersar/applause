/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.applausedsl.applauseDsl.SectionCell#getType <em>Type</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.SectionCell#getIterator <em>Iterator</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.SectionCell#getText <em>Text</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.SectionCell#getDetails <em>Details</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.SectionCell#getImage <em>Image</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.SectionCell#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getSectionCell()
 * @model
 * @generated
 */
public interface SectionCell extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.applause.applausedsl.applauseDsl.CellType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.applause.applausedsl.applauseDsl.CellType
   * @see #setType(CellType)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getSectionCell_Type()
   * @model
   * @generated
   */
  CellType getType();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.SectionCell#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.applause.applausedsl.applauseDsl.CellType
   * @see #getType()
   * @generated
   */
  void setType(CellType value);

  /**
   * Returns the value of the '<em><b>Iterator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iterator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iterator</em>' containment reference.
   * @see #setIterator(CollectionIterator)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getSectionCell_Iterator()
   * @model containment="true"
   * @generated
   */
  CollectionIterator getIterator();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.SectionCell#getIterator <em>Iterator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iterator</em>' containment reference.
   * @see #getIterator()
   * @generated
   */
  void setIterator(CollectionIterator value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' containment reference.
   * @see #setText(ScalarExpression)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getSectionCell_Text()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getText();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.SectionCell#getText <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' containment reference.
   * @see #getText()
   * @generated
   */
  void setText(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Details</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Details</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Details</em>' containment reference.
   * @see #setDetails(ScalarExpression)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getSectionCell_Details()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getDetails();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.SectionCell#getDetails <em>Details</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Details</em>' containment reference.
   * @see #getDetails()
   * @generated
   */
  void setDetails(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Image</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image</em>' containment reference.
   * @see #setImage(ScalarExpression)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getSectionCell_Image()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getImage();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.SectionCell#getImage <em>Image</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image</em>' containment reference.
   * @see #getImage()
   * @generated
   */
  void setImage(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(ViewAction)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getSectionCell_Action()
   * @model containment="true"
   * @generated
   */
  ViewAction getAction();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.SectionCell#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(ViewAction value);

} // SectionCell
