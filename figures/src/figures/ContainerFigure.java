
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
public class ContainerFigure extends ImageFigure {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureContainerLabelFigure;
	/**
	 * @generated
	 */
	private RectangleFigure fContainerLstChildModelElementsCompartmentFigure;

	/**
	 * @generated
	 */
	public ContainerFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "images/container.png").createImage(), 0);
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureContainerLabelFigure = new WrappingLabel();

		fFigureContainerLabelFigure.setText("Container");
		fFigureContainerLabelFigure.setMaximumSize(new Dimension(10000, 50));

		this.add(fFigureContainerLabelFigure);

		fContainerLstChildModelElementsCompartmentFigure = new RectangleFigure();

		fContainerLstChildModelElementsCompartmentFigure.setOutline(false);

		this.add(fContainerLstChildModelElementsCompartmentFigure);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureContainerLabelFigure() {
		return fFigureContainerLabelFigure;
	}

	/**
	 * @generated
	 */
	public RectangleFigure getContainerLstChildModelElementsCompartmentFigure() {
		return fContainerLstChildModelElementsCompartmentFigure;
	}

}
