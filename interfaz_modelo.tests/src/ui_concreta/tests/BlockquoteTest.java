/**
 */
package ui_concreta.tests;

import junit.textui.TestRunner;

import ui_concreta.Blockquote;
import ui_concreta.Ui_concretaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Blockquote</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockquoteTest extends GraphicalIndividualTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BlockquoteTest.class);
	}

	/**
	 * Constructs a new Blockquote test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockquoteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Blockquote test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Blockquote getFixture() {
		return (Blockquote)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Ui_concretaFactory.eINSTANCE.createBlockquote());
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

} //BlockquoteTest
