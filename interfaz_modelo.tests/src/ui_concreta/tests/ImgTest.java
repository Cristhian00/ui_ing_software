/**
 */
package ui_concreta.tests;

import junit.textui.TestRunner;

import ui_concreta.Img;
import ui_concreta.Ui_concretaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Img</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImgTest extends GraphicalIndividualTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImgTest.class);
	}

	/**
	 * Constructs a new Img test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImgTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Img test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Img getFixture() {
		return (Img)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Ui_concretaFactory.eINSTANCE.createImg());
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

} //ImgTest
