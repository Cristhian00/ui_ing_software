/*
* 
*/
package ui_concreta.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class Ui_concretaVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "interfaz_modelo.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ui_concreta.diagram.edit.parts.UI_DiagramEditPart.MODEL_ID.equals(view.getType())) {
				return ui_concreta.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ui_concreta.Ui_concretaPackage.eINSTANCE.getUI_Diagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ui_concreta.UI_Diagram) domainElement)) {
			return ui_concreta.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getModelID(containerView);
		if (!ui_concreta.diagram.edit.parts.UI_DiagramEditPart.MODEL_ID.equals(containerModelID)
				&& !"ui_concreta".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ui_concreta.diagram.edit.parts.UI_DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ui_concreta.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ui_concreta.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getUserInterface().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID;
			}
			break;
		case ui_concreta.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getContainer().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.ContainerEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getIFrame().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.IFrame2EditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.Label2EditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.Input2EditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.Button2EditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.Select2EditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.Table2EditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getImg().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.Img2EditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getBlockquote().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.Blockquote2EditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getUl().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.Ul2EditPart.VISUAL_ID;
			}
			break;
		case ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getContainer().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getIFrame().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.LabelEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.InputEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.ButtonEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.TableEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getImg().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.ImgEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getBlockquote().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.BlockquoteEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getUl().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.UlEditPart.VISUAL_ID;
			}
			break;
		case ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getContainer().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getIFrame().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.LabelEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.InputEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.ButtonEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.TableEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getImg().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.ImgEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getBlockquote().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.BlockquoteEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getUl().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.UlEditPart.VISUAL_ID;
			}
			break;
		case ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getContainer().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getIFrame().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.LabelEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.InputEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.ButtonEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.TableEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getImg().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.ImgEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getBlockquote().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.BlockquoteEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getUl().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.UlEditPart.VISUAL_ID;
			}
			break;
		case ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getContainer().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getIFrame().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.LabelEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.InputEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.ButtonEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.TableEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getImg().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.ImgEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getBlockquote().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.BlockquoteEditPart.VISUAL_ID;
			}
			if (ui_concreta.Ui_concretaPackage.eINSTANCE.getUl().isSuperTypeOf(domainElement.eClass())) {
				return ui_concreta.diagram.edit.parts.UlEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getModelID(containerView);
		if (!ui_concreta.diagram.edit.parts.UI_DiagramEditPart.MODEL_ID.equals(containerModelID)
				&& !"ui_concreta".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ui_concreta.diagram.edit.parts.UI_DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ui_concreta.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ui_concreta.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
			if (ui_concreta.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concreta.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID:
			if (ui_concreta.diagram.edit.parts.UserInterfaceTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concreta.diagram.edit.parts.ContainerEditPart.VISUAL_ID:
			if (ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID:
			if (ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID:
			if (ui_concreta.diagram.edit.parts.IFrameTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID:
			if (ui_concreta.diagram.edit.parts.SelectTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concreta.diagram.edit.parts.IFrame2EditPart.VISUAL_ID:
			if (ui_concreta.diagram.edit.parts.IFrameTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concreta.diagram.edit.parts.Select2EditPart.VISUAL_ID:
			if (ui_concreta.diagram.edit.parts.SelectTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concreta.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
			if (ui_concreta.diagram.edit.parts.ContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.IFrame2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.Label2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.Input2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.Button2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.Select2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.Table2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.Img2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.Blockquote2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.Ul2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			if (ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.ImgEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.BlockquoteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.UlEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			if (ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.ImgEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.BlockquoteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.UlEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			if (ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.ImgEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.BlockquoteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.UlEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			if (ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.ImgEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.BlockquoteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concreta.diagram.edit.parts.UlEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(ui_concreta.UI_Diagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case ui_concreta.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
		case ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID:
		case ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID:
		case ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID:
		case ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ui_concreta.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
			return false;
		case ui_concreta.diagram.edit.parts.LabelEditPart.VISUAL_ID:
		case ui_concreta.diagram.edit.parts.InputEditPart.VISUAL_ID:
		case ui_concreta.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
		case ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID:
		case ui_concreta.diagram.edit.parts.TableEditPart.VISUAL_ID:
		case ui_concreta.diagram.edit.parts.ImgEditPart.VISUAL_ID:
		case ui_concreta.diagram.edit.parts.BlockquoteEditPart.VISUAL_ID:
		case ui_concreta.diagram.edit.parts.UlEditPart.VISUAL_ID:
		case ui_concreta.diagram.edit.parts.Label2EditPart.VISUAL_ID:
		case ui_concreta.diagram.edit.parts.Input2EditPart.VISUAL_ID:
		case ui_concreta.diagram.edit.parts.Button2EditPart.VISUAL_ID:
		case ui_concreta.diagram.edit.parts.Select2EditPart.VISUAL_ID:
		case ui_concreta.diagram.edit.parts.Table2EditPart.VISUAL_ID:
		case ui_concreta.diagram.edit.parts.Img2EditPart.VISUAL_ID:
		case ui_concreta.diagram.edit.parts.Blockquote2EditPart.VISUAL_ID:
		case ui_concreta.diagram.edit.parts.Ul2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
