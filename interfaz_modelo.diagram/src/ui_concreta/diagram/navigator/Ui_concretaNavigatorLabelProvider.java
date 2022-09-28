/*
* 
*/
package ui_concreta.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class Ui_concretaNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ui_concreta.diagram.navigator.Ui_concretaNavigatorItem
				&& !isOwnView(((ui_concreta.diagram.navigator.Ui_concretaNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ui_concreta.diagram.navigator.Ui_concretaNavigatorGroup) {
			ui_concreta.diagram.navigator.Ui_concretaNavigatorGroup group = (ui_concreta.diagram.navigator.Ui_concretaNavigatorGroup) element;
			return ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof ui_concreta.diagram.navigator.Ui_concretaNavigatorItem) {
			ui_concreta.diagram.navigator.Ui_concretaNavigatorItem navigatorItem = (ui_concreta.diagram.navigator.Ui_concretaNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getVisualID(view)) {
		case ui_concreta.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?ui_concreta?UI_Diagram", //$NON-NLS-1$
					ui_concreta.diagram.providers.Ui_concretaElementTypes.UI_Diagram_1000);
		case ui_concreta.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?ui_concreta?UserInterface", //$NON-NLS-1$
					ui_concreta.diagram.providers.Ui_concretaElementTypes.UserInterface_2001);
		case ui_concreta.diagram.edit.parts.ContainerEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concreta?Container", //$NON-NLS-1$
					ui_concreta.diagram.providers.Ui_concretaElementTypes.Container_3001);
		case ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concreta?Container", //$NON-NLS-1$
					ui_concreta.diagram.providers.Ui_concretaElementTypes.Container_3002);
		case ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concreta?IFrame", //$NON-NLS-1$
					ui_concreta.diagram.providers.Ui_concretaElementTypes.IFrame_3003);
		case ui_concreta.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concreta?Label", //$NON-NLS-1$
					ui_concreta.diagram.providers.Ui_concretaElementTypes.Label_3004);
		case ui_concreta.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concreta?Input", //$NON-NLS-1$
					ui_concreta.diagram.providers.Ui_concretaElementTypes.Input_3005);
		case ui_concreta.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concreta?Button", //$NON-NLS-1$
					ui_concreta.diagram.providers.Ui_concretaElementTypes.Button_3006);
		case ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concreta?Select", //$NON-NLS-1$
					ui_concreta.diagram.providers.Ui_concretaElementTypes.Select_3007);
		case ui_concreta.diagram.edit.parts.TableEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concreta?Table", //$NON-NLS-1$
					ui_concreta.diagram.providers.Ui_concretaElementTypes.Table_3008);
		case ui_concreta.diagram.edit.parts.ImgEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concreta?Img", //$NON-NLS-1$
					ui_concreta.diagram.providers.Ui_concretaElementTypes.Img_3009);
		case ui_concreta.diagram.edit.parts.BlockquoteEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concreta?Blockquote", //$NON-NLS-1$
					ui_concreta.diagram.providers.Ui_concretaElementTypes.Blockquote_3010);
		case ui_concreta.diagram.edit.parts.UlEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concreta?Ul", //$NON-NLS-1$
					ui_concreta.diagram.providers.Ui_concretaElementTypes.Ul_3011);
		case ui_concreta.diagram.edit.parts.IFrame2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concreta?IFrame", //$NON-NLS-1$
					ui_concreta.diagram.providers.Ui_concretaElementTypes.IFrame_3012);
		case ui_concreta.diagram.edit.parts.Label2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concreta?Label", //$NON-NLS-1$
					ui_concreta.diagram.providers.Ui_concretaElementTypes.Label_3013);
		case ui_concreta.diagram.edit.parts.Input2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concreta?Input", //$NON-NLS-1$
					ui_concreta.diagram.providers.Ui_concretaElementTypes.Input_3014);
		case ui_concreta.diagram.edit.parts.Button2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concreta?Button", //$NON-NLS-1$
					ui_concreta.diagram.providers.Ui_concretaElementTypes.Button_3015);
		case ui_concreta.diagram.edit.parts.Select2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concreta?Select", //$NON-NLS-1$
					ui_concreta.diagram.providers.Ui_concretaElementTypes.Select_3016);
		case ui_concreta.diagram.edit.parts.Table2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concreta?Table", //$NON-NLS-1$
					ui_concreta.diagram.providers.Ui_concretaElementTypes.Table_3017);
		case ui_concreta.diagram.edit.parts.Img2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concreta?Img", //$NON-NLS-1$
					ui_concreta.diagram.providers.Ui_concretaElementTypes.Img_3018);
		case ui_concreta.diagram.edit.parts.Blockquote2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concreta?Blockquote", //$NON-NLS-1$
					ui_concreta.diagram.providers.Ui_concretaElementTypes.Blockquote_3019);
		case ui_concreta.diagram.edit.parts.Ul2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concreta?Ul", //$NON-NLS-1$
					ui_concreta.diagram.providers.Ui_concretaElementTypes.Ul_3020);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ui_concreta.diagram.providers.Ui_concretaElementTypes.isKnownElementType(elementType)) {
			image = ui_concreta.diagram.providers.Ui_concretaElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof ui_concreta.diagram.navigator.Ui_concretaNavigatorGroup) {
			ui_concreta.diagram.navigator.Ui_concretaNavigatorGroup group = (ui_concreta.diagram.navigator.Ui_concretaNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ui_concreta.diagram.navigator.Ui_concretaNavigatorItem) {
			ui_concreta.diagram.navigator.Ui_concretaNavigatorItem navigatorItem = (ui_concreta.diagram.navigator.Ui_concretaNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getVisualID(view)) {
		case ui_concreta.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
			return getUI_Diagram_1000Text(view);
		case ui_concreta.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001Text(view);
		case ui_concreta.diagram.edit.parts.ContainerEditPart.VISUAL_ID:
			return getContainer_3001Text(view);
		case ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID:
			return getContainer_3002Text(view);
		case ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID:
			return getIFrame_3003Text(view);
		case ui_concreta.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			return getLabel_3004Text(view);
		case ui_concreta.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getInput_3005Text(view);
		case ui_concreta.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			return getButton_3006Text(view);
		case ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID:
			return getSelect_3007Text(view);
		case ui_concreta.diagram.edit.parts.TableEditPart.VISUAL_ID:
			return getTable_3008Text(view);
		case ui_concreta.diagram.edit.parts.ImgEditPart.VISUAL_ID:
			return getImg_3009Text(view);
		case ui_concreta.diagram.edit.parts.BlockquoteEditPart.VISUAL_ID:
			return getBlockquote_3010Text(view);
		case ui_concreta.diagram.edit.parts.UlEditPart.VISUAL_ID:
			return getUl_3011Text(view);
		case ui_concreta.diagram.edit.parts.IFrame2EditPart.VISUAL_ID:
			return getIFrame_3012Text(view);
		case ui_concreta.diagram.edit.parts.Label2EditPart.VISUAL_ID:
			return getLabel_3013Text(view);
		case ui_concreta.diagram.edit.parts.Input2EditPart.VISUAL_ID:
			return getInput_3014Text(view);
		case ui_concreta.diagram.edit.parts.Button2EditPart.VISUAL_ID:
			return getButton_3015Text(view);
		case ui_concreta.diagram.edit.parts.Select2EditPart.VISUAL_ID:
			return getSelect_3016Text(view);
		case ui_concreta.diagram.edit.parts.Table2EditPart.VISUAL_ID:
			return getTable_3017Text(view);
		case ui_concreta.diagram.edit.parts.Img2EditPart.VISUAL_ID:
			return getImg_3018Text(view);
		case ui_concreta.diagram.edit.parts.Blockquote2EditPart.VISUAL_ID:
			return getBlockquote_3019Text(view);
		case ui_concreta.diagram.edit.parts.Ul2EditPart.VISUAL_ID:
			return getUl_3020Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getUI_Diagram_1000Text(View view) {
		ui_concreta.UI_Diagram domainModelElement = (ui_concreta.UI_Diagram) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNombre();
		} else {
			ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUserInterface_2001Text(View view) {
		IParser parser = ui_concreta.diagram.providers.Ui_concretaParserProvider.getParser(
				ui_concreta.diagram.providers.Ui_concretaElementTypes.UserInterface_2001,
				view.getElement() != null ? view.getElement() : view,
				ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
						.getType(ui_concreta.diagram.edit.parts.UserInterfaceTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContainer_3001Text(View view) {
		ui_concreta.Container domainModelElement = (ui_concreta.Container) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTitle();
		} else {
			ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContainer_3002Text(View view) {
		ui_concreta.Container domainModelElement = (ui_concreta.Container) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTitle();
		} else {
			ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIFrame_3003Text(View view) {
		IParser parser = ui_concreta.diagram.providers.Ui_concretaParserProvider.getParser(
				ui_concreta.diagram.providers.Ui_concretaElementTypes.IFrame_3003,
				view.getElement() != null ? view.getElement() : view,
				ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
						.getType(ui_concreta.diagram.edit.parts.IFrameTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabel_3004Text(View view) {
		ui_concreta.Label domainModelElement = (ui_concreta.Label) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTitle();
		} else {
			ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInput_3005Text(View view) {
		ui_concreta.Input domainModelElement = (ui_concreta.Input) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTitle();
		} else {
			ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getButton_3006Text(View view) {
		ui_concreta.Button domainModelElement = (ui_concreta.Button) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTitle();
		} else {
			ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelect_3007Text(View view) {
		IParser parser = ui_concreta.diagram.providers.Ui_concretaParserProvider.getParser(
				ui_concreta.diagram.providers.Ui_concretaElementTypes.Select_3007,
				view.getElement() != null ? view.getElement() : view,
				ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
						.getType(ui_concreta.diagram.edit.parts.SelectTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTable_3008Text(View view) {
		ui_concreta.Table domainModelElement = (ui_concreta.Table) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTitle();
		} else {
			ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImg_3009Text(View view) {
		ui_concreta.Img domainModelElement = (ui_concreta.Img) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTitle();
		} else {
			ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBlockquote_3010Text(View view) {
		ui_concreta.Blockquote domainModelElement = (ui_concreta.Blockquote) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTitle();
		} else {
			ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUl_3011Text(View view) {
		ui_concreta.Ul domainModelElement = (ui_concreta.Ul) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTitle();
		} else {
			ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIFrame_3012Text(View view) {
		IParser parser = ui_concreta.diagram.providers.Ui_concretaParserProvider.getParser(
				ui_concreta.diagram.providers.Ui_concretaElementTypes.IFrame_3012,
				view.getElement() != null ? view.getElement() : view,
				ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
						.getType(ui_concreta.diagram.edit.parts.IFrameTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabel_3013Text(View view) {
		ui_concreta.Label domainModelElement = (ui_concreta.Label) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTitle();
		} else {
			ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInput_3014Text(View view) {
		ui_concreta.Input domainModelElement = (ui_concreta.Input) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTitle();
		} else {
			ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getButton_3015Text(View view) {
		ui_concreta.Button domainModelElement = (ui_concreta.Button) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTitle();
		} else {
			ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelect_3016Text(View view) {
		IParser parser = ui_concreta.diagram.providers.Ui_concretaParserProvider.getParser(
				ui_concreta.diagram.providers.Ui_concretaElementTypes.Select_3016,
				view.getElement() != null ? view.getElement() : view,
				ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
						.getType(ui_concreta.diagram.edit.parts.SelectTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTable_3017Text(View view) {
		ui_concreta.Table domainModelElement = (ui_concreta.Table) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTitle();
		} else {
			ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImg_3018Text(View view) {
		ui_concreta.Img domainModelElement = (ui_concreta.Img) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTitle();
		} else {
			ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBlockquote_3019Text(View view) {
		ui_concreta.Blockquote domainModelElement = (ui_concreta.Blockquote) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTitle();
		} else {
			ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUl_3020Text(View view) {
		ui_concreta.Ul domainModelElement = (ui_concreta.Ul) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTitle();
		} else {
			ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return ui_concreta.diagram.edit.parts.UI_DiagramEditPart.MODEL_ID
				.equals(ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getModelID(view));
	}

}
