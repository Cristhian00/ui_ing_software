
package figures;

import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * @generated
 */
public class UserInterfaceFigure extends RoundedRectangle {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureUserInterfaceLabelFigure;
	/**
	 * @generated
	 */
	private RectangleFigure fUserInterfaceLstModelElementsCompartmentFigure;

	/**
	 * @generated
	 */
	public UserInterfaceFigure() {
		this.setCornerDimensions(new Dimension(8, 8));
		this.setBorder(new MarginBorder(5, 5, 5, 5));
		createContents();
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureUserInterfaceLabelFigure = new WrappingLabel();

		fFigureUserInterfaceLabelFigure.setText("UserInterface");
		fFigureUserInterfaceLabelFigure.setMaximumSize(new Dimension(10000, 50));

		this.add(fFigureUserInterfaceLabelFigure);

		fUserInterfaceLstModelElementsCompartmentFigure = new RectangleFigure();

		fUserInterfaceLstModelElementsCompartmentFigure.setOutline(false);

		this.add(fUserInterfaceLstModelElementsCompartmentFigure);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureUserInterfaceLabelFigure() {
		return fFigureUserInterfaceLabelFigure;
	}

	/**
	 * @generated
	 */
	public RectangleFigure getUserInterfaceLstModelElementsCompartmentFigure() {
		return fUserInterfaceLstModelElementsCompartmentFigure;
	}

}
