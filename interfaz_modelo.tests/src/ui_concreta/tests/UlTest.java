/**
 */
package ui_concreta.tests;

import junit.textui.TestRunner;

import ui_concreta.Ui_concretaFactory;
import ui_concreta.Ul;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ul</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UlTest extends GraphicalIndividualTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UlTest.class);
	}

	/**
	 * Constructs a new Ul test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UlTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ul test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Ul getFixture() {
		return (Ul)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Ui_concretaFactory.eINSTANCE.createUl());
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

} //UlTest
