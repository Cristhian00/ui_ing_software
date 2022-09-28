/**
 */
package ui_concreta.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ui_concreta.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ui_concretaFactoryImpl extends EFactoryImpl implements Ui_concretaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ui_concretaFactory init() {
		try {
			Ui_concretaFactory theUi_concretaFactory = (Ui_concretaFactory)EPackage.Registry.INSTANCE.getEFactory(Ui_concretaPackage.eNS_URI);
			if (theUi_concretaFactory != null) {
				return theUi_concretaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ui_concretaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ui_concretaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Ui_concretaPackage.MODEL_FACTORY: return createModelFactory();
			case Ui_concretaPackage.UI_DIAGRAM: return createUI_Diagram();
			case Ui_concretaPackage.USER_INTERFACE: return createUserInterface();
			case Ui_concretaPackage.CONTAINER: return createContainer();
			case Ui_concretaPackage.IFRAME: return createIFrame();
			case Ui_concretaPackage.LABEL: return createLabel();
			case Ui_concretaPackage.INPUT: return createInput();
			case Ui_concretaPackage.BUTTON: return createButton();
			case Ui_concretaPackage.SELECT: return createSelect();
			case Ui_concretaPackage.TABLE: return createTable();
			case Ui_concretaPackage.IMG: return createImg();
			case Ui_concretaPackage.BLOCKQUOTE: return createBlockquote();
			case Ui_concretaPackage.UL: return createUl();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory createModelFactory() {
		ModelFactoryImpl modelFactory = new ModelFactoryImpl();
		return modelFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI_Diagram createUI_Diagram() {
		UI_DiagramImpl uI_Diagram = new UI_DiagramImpl();
		return uI_Diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserInterface createUserInterface() {
		UserInterfaceImpl userInterface = new UserInterfaceImpl();
		return userInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ui_concreta.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFrame createIFrame() {
		IFrameImpl iFrame = new IFrameImpl();
		return iFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Select createSelect() {
		SelectImpl select = new SelectImpl();
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Img createImg() {
		ImgImpl img = new ImgImpl();
		return img;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Blockquote createBlockquote() {
		BlockquoteImpl blockquote = new BlockquoteImpl();
		return blockquote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ul createUl() {
		UlImpl ul = new UlImpl();
		return ul;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ui_concretaPackage getUi_concretaPackage() {
		return (Ui_concretaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ui_concretaPackage getPackage() {
		return Ui_concretaPackage.eINSTANCE;
	}

} //Ui_concretaFactoryImpl
