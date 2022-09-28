/**
 */
package ui_concreta.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ui_concreta.Ui_concretaFactory;
import ui_concreta.UserInterface;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>User Interface</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UserInterfaceTest extends TestCase {

	/**
	 * The fixture for this User Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserInterface fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UserInterfaceTest.class);
	}

	/**
	 * Constructs a new User Interface test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserInterfaceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this User Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UserInterface fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this User Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserInterface getFixture() {
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
		setFixture(Ui_concretaFactory.eINSTANCE.createUserInterface());
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

} //UserInterfaceTest
