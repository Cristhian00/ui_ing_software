/**
 */
package ui_concreta.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ui_concreta.ModelFactory;
import ui_concreta.UI_Diagram;
import ui_concreta.Ui_concretaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ui_concreta.impl.ModelFactoryImpl#getLstUI_Diagrams <em>Lst UI Diagrams</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFactoryImpl extends EObjectImpl implements ModelFactory {
	/**
	 * The cached value of the '{@link #getLstUI_Diagrams() <em>Lst UI Diagrams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstUI_Diagrams()
	 * @generated
	 * @ordered
	 */
	protected EList<UI_Diagram> lstUI_Diagrams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ui_concretaPackage.Literals.MODEL_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UI_Diagram> getLstUI_Diagrams() {
		if (lstUI_Diagrams == null) {
			lstUI_Diagrams = new EObjectContainmentEList<UI_Diagram>(UI_Diagram.class, this, Ui_concretaPackage.MODEL_FACTORY__LST_UI_DIAGRAMS);
		}
		return lstUI_Diagrams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ui_concretaPackage.MODEL_FACTORY__LST_UI_DIAGRAMS:
				return ((InternalEList<?>)getLstUI_Diagrams()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ui_concretaPackage.MODEL_FACTORY__LST_UI_DIAGRAMS:
				return getLstUI_Diagrams();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ui_concretaPackage.MODEL_FACTORY__LST_UI_DIAGRAMS:
				getLstUI_Diagrams().clear();
				getLstUI_Diagrams().addAll((Collection<? extends UI_Diagram>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Ui_concretaPackage.MODEL_FACTORY__LST_UI_DIAGRAMS:
				getLstUI_Diagrams().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Ui_concretaPackage.MODEL_FACTORY__LST_UI_DIAGRAMS:
				return lstUI_Diagrams != null && !lstUI_Diagrams.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelFactoryImpl
