/**
 */
package ui_concreta.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ui_concreta.UI_Diagram;
import ui_concreta.Ui_concretaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>UI Diagram</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UI_DiagramTest extends TestCase {

	/**
	 * The fixture for this UI Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UI_Diagram fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UI_DiagramTest.class);
	}

	/**
	 * Constructs a new UI Diagram test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI_DiagramTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this UI Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UI_Diagram fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this UI Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UI_Diagram getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Ui_concretaFactory.eINSTANCE.createUI_Diagram());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //UI_DiagramTest
