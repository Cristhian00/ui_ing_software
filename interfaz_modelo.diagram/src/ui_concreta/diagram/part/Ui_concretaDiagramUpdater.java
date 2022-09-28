/*
* 
*/
package ui_concreta.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class Ui_concretaDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<ui_concreta.diagram.part.Ui_concretaNodeDescriptor> getSemanticChildren(View view) {
		switch (ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getVisualID(view)) {
		case ui_concreta.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
			return getUI_Diagram_1000SemanticChildren(view);
		case ui_concreta.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
			return getUserInterfaceUserInterfaceLstModelElementsCompartment_7001SemanticChildren(view);
		case ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			return getContainerContainerLstChildModelElementsCompartment_7002SemanticChildren(view);
		case ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			return getContainerContainerLstChildModelElementsCompartment_7003SemanticChildren(view);
		case ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			return getIFrameIFrameLstChildModelElementsCompartment_7004SemanticChildren(view);
		case ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			return getIFrameIFrameLstChildModelElementsCompartment_7005SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ui_concreta.diagram.part.Ui_concretaNodeDescriptor> getUI_Diagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ui_concreta.UI_Diagram modelElement = (ui_concreta.UI_Diagram) view.getElement();
		LinkedList<ui_concreta.diagram.part.Ui_concretaNodeDescriptor> result = new LinkedList<ui_concreta.diagram.part.Ui_concretaNodeDescriptor>();
		{
			ui_concreta.UserInterface childElement = modelElement.getUserInterface();
			int visualID = ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ui_concreta.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ui_concreta.diagram.part.Ui_concretaNodeDescriptor> getUserInterfaceUserInterfaceLstModelElementsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ui_concreta.UserInterface modelElement = (ui_concreta.UserInterface) containerView.getElement();
		LinkedList<ui_concreta.diagram.part.Ui_concretaNodeDescriptor> result = new LinkedList<ui_concreta.diagram.part.Ui_concretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstModelElements().iterator(); it.hasNext();) {
			ui_concreta.ModelElement childElement = (ui_concreta.ModelElement) it.next();
			int visualID = ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ui_concreta.diagram.edit.parts.ContainerEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.IFrame2EditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.Label2EditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.Input2EditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.Button2EditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.Select2EditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.Table2EditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.Img2EditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.Blockquote2EditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.Ul2EditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ui_concreta.diagram.part.Ui_concretaNodeDescriptor> getContainerContainerLstChildModelElementsCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ui_concreta.Container modelElement = (ui_concreta.Container) containerView.getElement();
		LinkedList<ui_concreta.diagram.part.Ui_concretaNodeDescriptor> result = new LinkedList<ui_concreta.diagram.part.Ui_concretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstChildModelElements().iterator(); it.hasNext();) {
			ui_concreta.ModelElement childElement = (ui_concreta.ModelElement) it.next();
			int visualID = ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.LabelEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.InputEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.ButtonEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.TableEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.ImgEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.BlockquoteEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.UlEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ui_concreta.diagram.part.Ui_concretaNodeDescriptor> getContainerContainerLstChildModelElementsCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ui_concreta.Container modelElement = (ui_concreta.Container) containerView.getElement();
		LinkedList<ui_concreta.diagram.part.Ui_concretaNodeDescriptor> result = new LinkedList<ui_concreta.diagram.part.Ui_concretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstChildModelElements().iterator(); it.hasNext();) {
			ui_concreta.ModelElement childElement = (ui_concreta.ModelElement) it.next();
			int visualID = ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.LabelEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.InputEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.ButtonEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.TableEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.ImgEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.BlockquoteEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.UlEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ui_concreta.diagram.part.Ui_concretaNodeDescriptor> getIFrameIFrameLstChildModelElementsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ui_concreta.IFrame modelElement = (ui_concreta.IFrame) containerView.getElement();
		LinkedList<ui_concreta.diagram.part.Ui_concretaNodeDescriptor> result = new LinkedList<ui_concreta.diagram.part.Ui_concretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstChildModelElements().iterator(); it.hasNext();) {
			ui_concreta.ModelElement childElement = (ui_concreta.ModelElement) it.next();
			int visualID = ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.LabelEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.InputEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.ButtonEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.TableEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.ImgEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.BlockquoteEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.UlEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ui_concreta.diagram.part.Ui_concretaNodeDescriptor> getIFrameIFrameLstChildModelElementsCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ui_concreta.IFrame modelElement = (ui_concreta.IFrame) containerView.getElement();
		LinkedList<ui_concreta.diagram.part.Ui_concretaNodeDescriptor> result = new LinkedList<ui_concreta.diagram.part.Ui_concretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstChildModelElements().iterator(); it.hasNext();) {
			ui_concreta.ModelElement childElement = (ui_concreta.ModelElement) it.next();
			int visualID = ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.LabelEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.InputEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.ButtonEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.TableEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.ImgEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.BlockquoteEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concreta.diagram.edit.parts.UlEditPart.VISUAL_ID) {
				result.add(new ui_concreta.diagram.part.Ui_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getContainedLinks(View view) {
		switch (ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getVisualID(view)) {
		case ui_concreta.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
			return getUI_Diagram_1000ContainedLinks(view);
		case ui_concreta.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001ContainedLinks(view);
		case ui_concreta.diagram.edit.parts.ContainerEditPart.VISUAL_ID:
			return getContainer_3001ContainedLinks(view);
		case ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID:
			return getContainer_3002ContainedLinks(view);
		case ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID:
			return getIFrame_3003ContainedLinks(view);
		case ui_concreta.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			return getLabel_3004ContainedLinks(view);
		case ui_concreta.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getInput_3005ContainedLinks(view);
		case ui_concreta.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			return getButton_3006ContainedLinks(view);
		case ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID:
			return getSelect_3007ContainedLinks(view);
		case ui_concreta.diagram.edit.parts.TableEditPart.VISUAL_ID:
			return getTable_3008ContainedLinks(view);
		case ui_concreta.diagram.edit.parts.ImgEditPart.VISUAL_ID:
			return getImg_3009ContainedLinks(view);
		case ui_concreta.diagram.edit.parts.BlockquoteEditPart.VISUAL_ID:
			return getBlockquote_3010ContainedLinks(view);
		case ui_concreta.diagram.edit.parts.UlEditPart.VISUAL_ID:
			return getUl_3011ContainedLinks(view);
		case ui_concreta.diagram.edit.parts.IFrame2EditPart.VISUAL_ID:
			return getIFrame_3012ContainedLinks(view);
		case ui_concreta.diagram.edit.parts.Label2EditPart.VISUAL_ID:
			return getLabel_3013ContainedLinks(view);
		case ui_concreta.diagram.edit.parts.Input2EditPart.VISUAL_ID:
			return getInput_3014ContainedLinks(view);
		case ui_concreta.diagram.edit.parts.Button2EditPart.VISUAL_ID:
			return getButton_3015ContainedLinks(view);
		case ui_concreta.diagram.edit.parts.Select2EditPart.VISUAL_ID:
			return getSelect_3016ContainedLinks(view);
		case ui_concreta.diagram.edit.parts.Table2EditPart.VISUAL_ID:
			return getTable_3017ContainedLinks(view);
		case ui_concreta.diagram.edit.parts.Img2EditPart.VISUAL_ID:
			return getImg_3018ContainedLinks(view);
		case ui_concreta.diagram.edit.parts.Blockquote2EditPart.VISUAL_ID:
			return getBlockquote_3019ContainedLinks(view);
		case ui_concreta.diagram.edit.parts.Ul2EditPart.VISUAL_ID:
			return getUl_3020ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getIncomingLinks(View view) {
		switch (ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getVisualID(view)) {
		case ui_concreta.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001IncomingLinks(view);
		case ui_concreta.diagram.edit.parts.ContainerEditPart.VISUAL_ID:
			return getContainer_3001IncomingLinks(view);
		case ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID:
			return getContainer_3002IncomingLinks(view);
		case ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID:
			return getIFrame_3003IncomingLinks(view);
		case ui_concreta.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			return getLabel_3004IncomingLinks(view);
		case ui_concreta.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getInput_3005IncomingLinks(view);
		case ui_concreta.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			return getButton_3006IncomingLinks(view);
		case ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID:
			return getSelect_3007IncomingLinks(view);
		case ui_concreta.diagram.edit.parts.TableEditPart.VISUAL_ID:
			return getTable_3008IncomingLinks(view);
		case ui_concreta.diagram.edit.parts.ImgEditPart.VISUAL_ID:
			return getImg_3009IncomingLinks(view);
		case ui_concreta.diagram.edit.parts.BlockquoteEditPart.VISUAL_ID:
			return getBlockquote_3010IncomingLinks(view);
		case ui_concreta.diagram.edit.parts.UlEditPart.VISUAL_ID:
			return getUl_3011IncomingLinks(view);
		case ui_concreta.diagram.edit.parts.IFrame2EditPart.VISUAL_ID:
			return getIFrame_3012IncomingLinks(view);
		case ui_concreta.diagram.edit.parts.Label2EditPart.VISUAL_ID:
			return getLabel_3013IncomingLinks(view);
		case ui_concreta.diagram.edit.parts.Input2EditPart.VISUAL_ID:
			return getInput_3014IncomingLinks(view);
		case ui_concreta.diagram.edit.parts.Button2EditPart.VISUAL_ID:
			return getButton_3015IncomingLinks(view);
		case ui_concreta.diagram.edit.parts.Select2EditPart.VISUAL_ID:
			return getSelect_3016IncomingLinks(view);
		case ui_concreta.diagram.edit.parts.Table2EditPart.VISUAL_ID:
			return getTable_3017IncomingLinks(view);
		case ui_concreta.diagram.edit.parts.Img2EditPart.VISUAL_ID:
			return getImg_3018IncomingLinks(view);
		case ui_concreta.diagram.edit.parts.Blockquote2EditPart.VISUAL_ID:
			return getBlockquote_3019IncomingLinks(view);
		case ui_concreta.diagram.edit.parts.Ul2EditPart.VISUAL_ID:
			return getUl_3020IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getOutgoingLinks(View view) {
		switch (ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getVisualID(view)) {
		case ui_concreta.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001OutgoingLinks(view);
		case ui_concreta.diagram.edit.parts.ContainerEditPart.VISUAL_ID:
			return getContainer_3001OutgoingLinks(view);
		case ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID:
			return getContainer_3002OutgoingLinks(view);
		case ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID:
			return getIFrame_3003OutgoingLinks(view);
		case ui_concreta.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			return getLabel_3004OutgoingLinks(view);
		case ui_concreta.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getInput_3005OutgoingLinks(view);
		case ui_concreta.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			return getButton_3006OutgoingLinks(view);
		case ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID:
			return getSelect_3007OutgoingLinks(view);
		case ui_concreta.diagram.edit.parts.TableEditPart.VISUAL_ID:
			return getTable_3008OutgoingLinks(view);
		case ui_concreta.diagram.edit.parts.ImgEditPart.VISUAL_ID:
			return getImg_3009OutgoingLinks(view);
		case ui_concreta.diagram.edit.parts.BlockquoteEditPart.VISUAL_ID:
			return getBlockquote_3010OutgoingLinks(view);
		case ui_concreta.diagram.edit.parts.UlEditPart.VISUAL_ID:
			return getUl_3011OutgoingLinks(view);
		case ui_concreta.diagram.edit.parts.IFrame2EditPart.VISUAL_ID:
			return getIFrame_3012OutgoingLinks(view);
		case ui_concreta.diagram.edit.parts.Label2EditPart.VISUAL_ID:
			return getLabel_3013OutgoingLinks(view);
		case ui_concreta.diagram.edit.parts.Input2EditPart.VISUAL_ID:
			return getInput_3014OutgoingLinks(view);
		case ui_concreta.diagram.edit.parts.Button2EditPart.VISUAL_ID:
			return getButton_3015OutgoingLinks(view);
		case ui_concreta.diagram.edit.parts.Select2EditPart.VISUAL_ID:
			return getSelect_3016OutgoingLinks(view);
		case ui_concreta.diagram.edit.parts.Table2EditPart.VISUAL_ID:
			return getTable_3017OutgoingLinks(view);
		case ui_concreta.diagram.edit.parts.Img2EditPart.VISUAL_ID:
			return getImg_3018OutgoingLinks(view);
		case ui_concreta.diagram.edit.parts.Blockquote2EditPart.VISUAL_ID:
			return getBlockquote_3019OutgoingLinks(view);
		case ui_concreta.diagram.edit.parts.Ul2EditPart.VISUAL_ID:
			return getUl_3020OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getUI_Diagram_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getUserInterface_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getContainer_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getContainer_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getIFrame_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getLabel_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getInput_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getButton_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getSelect_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getTable_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getImg_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getBlockquote_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getUl_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getIFrame_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getLabel_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getInput_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getButton_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getSelect_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getTable_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getImg_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getBlockquote_3019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getUl_3020ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getUserInterface_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getContainer_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getContainer_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getIFrame_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getLabel_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getInput_3005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getButton_3006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getSelect_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getTable_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getImg_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getBlockquote_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getUl_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getIFrame_3012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getLabel_3013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getInput_3014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getButton_3015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getSelect_3016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getTable_3017IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getImg_3018IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getBlockquote_3019IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getUl_3020IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getUserInterface_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getContainer_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getContainer_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getIFrame_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getLabel_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getInput_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getButton_3006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getSelect_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getTable_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getImg_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getBlockquote_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getUl_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getIFrame_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getLabel_3013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getInput_3014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getButton_3015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getSelect_3016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getTable_3017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getImg_3018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getBlockquote_3019OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getUl_3020OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<ui_concreta.diagram.part.Ui_concretaNodeDescriptor> getSemanticChildren(View view) {
			return Ui_concretaDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getContainedLinks(View view) {
			return Ui_concretaDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getIncomingLinks(View view) {
			return Ui_concretaDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ui_concreta.diagram.part.Ui_concretaLinkDescriptor> getOutgoingLinks(View view) {
			return Ui_concretaDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
