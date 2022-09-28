/**
 */
package ui_concreta.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ui_concreta.Blockquote;
import ui_concreta.Button;
import ui_concreta.GraphicalContainer;
import ui_concreta.GraphicalIndividual;
import ui_concreta.IFrame;
import ui_concreta.Img;
import ui_concreta.Input;
import ui_concreta.Label;
import ui_concreta.ModelElement;
import ui_concreta.ModelFactory;
import ui_concreta.Select;
import ui_concreta.Table;
import ui_concreta.UI_Diagram;
import ui_concreta.Ui_concretaFactory;
import ui_concreta.Ui_concretaPackage;
import ui_concreta.Ul;
import ui_concreta.UserInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ui_concretaPackageImpl extends EPackageImpl implements Ui_concretaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uI_DiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicalContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicalIndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iFrameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockquoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ulEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ui_concreta.Ui_concretaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Ui_concretaPackageImpl() {
		super(eNS_URI, Ui_concretaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Ui_concretaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Ui_concretaPackage init() {
		if (isInited) return (Ui_concretaPackage)EPackage.Registry.INSTANCE.getEPackage(Ui_concretaPackage.eNS_URI);

		// Obtain or create and register package
		Ui_concretaPackageImpl theUi_concretaPackage = (Ui_concretaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Ui_concretaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Ui_concretaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theUi_concretaPackage.createPackageContents();

		// Initialize created meta-data
		theUi_concretaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUi_concretaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Ui_concretaPackage.eNS_URI, theUi_concretaPackage);
		return theUi_concretaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFactory() {
		return modelFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactory_LstUI_Diagrams() {
		return (EReference)modelFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUI_Diagram() {
		return uI_DiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUI_Diagram_Nombre() {
		return (EAttribute)uI_DiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_Diagram_UserInterface() {
		return (EReference)uI_DiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserInterface() {
		return userInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterface_Title() {
		return (EAttribute)userInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterface_PositionX() {
		return (EAttribute)userInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterface_PositionY() {
		return (EAttribute)userInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterface_Width() {
		return (EAttribute)userInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterface_Heigth() {
		return (EAttribute)userInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterface_BackgroundColor() {
		return (EAttribute)userInterfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterface_TitleFont() {
		return (EAttribute)userInterfaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterface_TitleFontSize() {
		return (EAttribute)userInterfaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserInterface_LstModelElements() {
		return (EReference)userInterfaceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Title() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_PositionX() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_PositionY() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Width() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Heigth() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_BackgroundColor() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_TitleFont() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_TitleFontSize() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicalContainer() {
		return graphicalContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphicalContainer_LstChildModelElements() {
		return (EReference)graphicalContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicalIndividual() {
		return graphicalIndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIFrame() {
		return iFrameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelect() {
		return selectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImg() {
		return imgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockquote() {
		return blockquoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUl() {
		return ulEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ui_concretaFactory getUi_concretaFactory() {
		return (Ui_concretaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelFactoryEClass = createEClass(MODEL_FACTORY);
		createEReference(modelFactoryEClass, MODEL_FACTORY__LST_UI_DIAGRAMS);

		uI_DiagramEClass = createEClass(UI_DIAGRAM);
		createEAttribute(uI_DiagramEClass, UI_DIAGRAM__NOMBRE);
		createEReference(uI_DiagramEClass, UI_DIAGRAM__USER_INTERFACE);

		userInterfaceEClass = createEClass(USER_INTERFACE);
		createEAttribute(userInterfaceEClass, USER_INTERFACE__TITLE);
		createEAttribute(userInterfaceEClass, USER_INTERFACE__POSITION_X);
		createEAttribute(userInterfaceEClass, USER_INTERFACE__POSITION_Y);
		createEAttribute(userInterfaceEClass, USER_INTERFACE__WIDTH);
		createEAttribute(userInterfaceEClass, USER_INTERFACE__HEIGTH);
		createEAttribute(userInterfaceEClass, USER_INTERFACE__BACKGROUND_COLOR);
		createEAttribute(userInterfaceEClass, USER_INTERFACE__TITLE_FONT);
		createEAttribute(userInterfaceEClass, USER_INTERFACE__TITLE_FONT_SIZE);
		createEReference(userInterfaceEClass, USER_INTERFACE__LST_MODEL_ELEMENTS);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__TITLE);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__POSITION_X);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__POSITION_Y);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__WIDTH);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__HEIGTH);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__BACKGROUND_COLOR);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__TITLE_FONT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__TITLE_FONT_SIZE);

		graphicalContainerEClass = createEClass(GRAPHICAL_CONTAINER);
		createEReference(graphicalContainerEClass, GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS);

		graphicalIndividualEClass = createEClass(GRAPHICAL_INDIVIDUAL);

		containerEClass = createEClass(CONTAINER);

		iFrameEClass = createEClass(IFRAME);

		labelEClass = createEClass(LABEL);

		inputEClass = createEClass(INPUT);

		buttonEClass = createEClass(BUTTON);

		selectEClass = createEClass(SELECT);

		tableEClass = createEClass(TABLE);

		imgEClass = createEClass(IMG);

		blockquoteEClass = createEClass(BLOCKQUOTE);

		ulEClass = createEClass(UL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		graphicalContainerEClass.getESuperTypes().add(this.getModelElement());
		graphicalIndividualEClass.getESuperTypes().add(this.getModelElement());
		containerEClass.getESuperTypes().add(this.getGraphicalContainer());
		iFrameEClass.getESuperTypes().add(this.getGraphicalContainer());
		labelEClass.getESuperTypes().add(this.getGraphicalIndividual());
		inputEClass.getESuperTypes().add(this.getGraphicalIndividual());
		buttonEClass.getESuperTypes().add(this.getGraphicalIndividual());
		selectEClass.getESuperTypes().add(this.getGraphicalIndividual());
		tableEClass.getESuperTypes().add(this.getGraphicalIndividual());
		imgEClass.getESuperTypes().add(this.getGraphicalIndividual());
		blockquoteEClass.getESuperTypes().add(this.getGraphicalIndividual());
		ulEClass.getESuperTypes().add(this.getGraphicalIndividual());

		// Initialize classes and features; add operations and parameters
		initEClass(modelFactoryEClass, ModelFactory.class, "ModelFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelFactory_LstUI_Diagrams(), this.getUI_Diagram(), null, "lstUI_Diagrams", null, 0, -1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uI_DiagramEClass, UI_Diagram.class, "UI_Diagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUI_Diagram_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, UI_Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_Diagram_UserInterface(), this.getUserInterface(), null, "userInterface", null, 0, 1, UI_Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userInterfaceEClass, UserInterface.class, "UserInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserInterface_Title(), ecorePackage.getEString(), "title", null, 0, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserInterface_PositionX(), ecorePackage.getEString(), "positionX", null, 0, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserInterface_PositionY(), ecorePackage.getEString(), "positionY", null, 0, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserInterface_Width(), ecorePackage.getEString(), "width", null, 0, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserInterface_Heigth(), ecorePackage.getEString(), "heigth", null, 0, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserInterface_BackgroundColor(), ecorePackage.getEString(), "backgroundColor", null, 0, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserInterface_TitleFont(), ecorePackage.getEString(), "titleFont", null, 0, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserInterface_TitleFontSize(), ecorePackage.getEString(), "titleFontSize", null, 0, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserInterface_LstModelElements(), this.getModelElement(), null, "lstModelElements", null, 0, -1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Title(), ecorePackage.getEString(), "title", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_PositionX(), ecorePackage.getEString(), "positionX", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_PositionY(), ecorePackage.getEString(), "positionY", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Width(), ecorePackage.getEString(), "width", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Heigth(), ecorePackage.getEString(), "heigth", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_BackgroundColor(), ecorePackage.getEString(), "backgroundColor", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_TitleFont(), ecorePackage.getEString(), "titleFont", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_TitleFontSize(), ecorePackage.getEString(), "titleFontSize", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicalContainerEClass, GraphicalContainer.class, "GraphicalContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphicalContainer_LstChildModelElements(), this.getModelElement(), null, "lstChildModelElements", null, 0, -1, GraphicalContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicalIndividualEClass, GraphicalIndividual.class, "GraphicalIndividual", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerEClass, ui_concreta.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iFrameEClass, IFrame.class, "IFrame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectEClass, Select.class, "Select", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(imgEClass, Img.class, "Img", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockquoteEClass, Blockquote.class, "Blockquote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ulEClass, Ul.class, "Ul", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (uI_DiagramEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (userInterfaceEClass, 
		   source, 
		   new String[] {
			 "label", "title"
		   });	
		addAnnotation
		  (containerEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.ContainerFigure",
			 "label", "title",
			 "label.icon", "false",
			 "label.placement", "none"
		   });	
		addAnnotation
		  (iFrameEClass, 
		   source, 
		   new String[] {
			 "label", "title"
		   });	
		addAnnotation
		  (labelEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.LabelFigure",
			 "label", "title",
			 "label.icon", "false",
			 "label.placement", "none"
		   });	
		addAnnotation
		  (inputEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.InputFigure",
			 "label", "title",
			 "label.icon", "false",
			 "label.placement", "none"
		   });	
		addAnnotation
		  (buttonEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.ButtonFigure",
			 "label", "title",
			 "label.icon", "false",
			 "label.placement", "none"
		   });	
		addAnnotation
		  (selectEClass, 
		   source, 
		   new String[] {
			 "label", "title"
		   });	
		addAnnotation
		  (tableEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.TableFigure",
			 "label", "title",
			 "label.icon", "false",
			 "label.placement", "none"
		   });	
		addAnnotation
		  (imgEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.ImgFigure",
			 "label", "title",
			 "label.icon", "false",
			 "label.placement", "none"
		   });	
		addAnnotation
		  (blockquoteEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.BlockquoteFigure",
			 "label", "title",
			 "label.icon", "false",
			 "label.placement", "none"
		   });	
		addAnnotation
		  (ulEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.UlFigure",
			 "label", "title",
			 "label.icon", "false",
			 "label.placement", "none"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getUserInterface_LstModelElements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGraphicalContainer_LstChildModelElements(), 
		   source, 
		   new String[] {
		   });
	}

} //Ui_concretaPackageImpl
