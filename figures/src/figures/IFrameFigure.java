
package figures;

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

import figures.activator.PluginActivator;

/**
 * @generated
 */
public class IFrameFigure extends RoundedRectangle {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureIFrameLabelFigure;
	/**
	 * @generated
	 */
	private RectangleFigure fIFrameLstChildModelElementsCompartmentFigure;

	/**
	 * @generated
	 */
	public IFrameFigure() {
		//super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "images/iframe.png").createImage(), 0);
		this.setCornerDimensions(new Dimension(8, 8));
		this.setBorder(new MarginBorder(5, 5, 5, 5));
		createContents();
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureIFrameLabelFigure = new WrappingLabel();

		fFigureIFrameLabelFigure.setText("IFrame");
		fFigureIFrameLabelFigure.setMaximumSize(new Dimension(10000, 50));

		this.add(fFigureIFrameLabelFigure);

		fIFrameLstChildModelElementsCompartmentFigure = new RectangleFigure();

		fIFrameLstChildModelElementsCompartmentFigure.setOutline(false);

		this.add(fIFrameLstChildModelElementsCompartmentFigure);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureIFrameLabelFigure() {
		return fFigureIFrameLabelFigure;
	}

	/**
	 * @generated
	 */
	public RectangleFigure getIFrameLstChildModelElementsCompartmentFigure() {
		return fIFrameLstChildModelElementsCompartmentFigure;
	}

}
