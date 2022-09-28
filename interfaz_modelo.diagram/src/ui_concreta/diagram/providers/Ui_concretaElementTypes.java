/*
 * 
 */
package ui_concreta.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class Ui_concretaElementTypes {

	/**
	* @generated
	*/
	private Ui_concretaElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ui_concreta.diagram.part.Ui_concretaDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType UI_Diagram_1000 = getElementType("interfaz_modelo.diagram.UI_Diagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UserInterface_2001 = getElementType("interfaz_modelo.diagram.UserInterface_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Container_3001 = getElementType("interfaz_modelo.diagram.Container_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Container_3002 = getElementType("interfaz_modelo.diagram.Container_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IFrame_3003 = getElementType("interfaz_modelo.diagram.IFrame_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Label_3004 = getElementType("interfaz_modelo.diagram.Label_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Input_3005 = getElementType("interfaz_modelo.diagram.Input_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Button_3006 = getElementType("interfaz_modelo.diagram.Button_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Select_3007 = getElementType("interfaz_modelo.diagram.Select_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Table_3008 = getElementType("interfaz_modelo.diagram.Table_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Img_3009 = getElementType("interfaz_modelo.diagram.Img_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Blockquote_3010 = getElementType("interfaz_modelo.diagram.Blockquote_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Ul_3011 = getElementType("interfaz_modelo.diagram.Ul_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IFrame_3012 = getElementType("interfaz_modelo.diagram.IFrame_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Label_3013 = getElementType("interfaz_modelo.diagram.Label_3013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Input_3014 = getElementType("interfaz_modelo.diagram.Input_3014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Button_3015 = getElementType("interfaz_modelo.diagram.Button_3015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Select_3016 = getElementType("interfaz_modelo.diagram.Select_3016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Table_3017 = getElementType("interfaz_modelo.diagram.Table_3017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Img_3018 = getElementType("interfaz_modelo.diagram.Img_3018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Blockquote_3019 = getElementType("interfaz_modelo.diagram.Blockquote_3019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Ul_3020 = getElementType("interfaz_modelo.diagram.Ul_3020"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(UI_Diagram_1000, ui_concreta.Ui_concretaPackage.eINSTANCE.getUI_Diagram());

			elements.put(UserInterface_2001, ui_concreta.Ui_concretaPackage.eINSTANCE.getUserInterface());

			elements.put(Container_3001, ui_concreta.Ui_concretaPackage.eINSTANCE.getContainer());

			elements.put(Container_3002, ui_concreta.Ui_concretaPackage.eINSTANCE.getContainer());

			elements.put(IFrame_3003, ui_concreta.Ui_concretaPackage.eINSTANCE.getIFrame());

			elements.put(Label_3004, ui_concreta.Ui_concretaPackage.eINSTANCE.getLabel());

			elements.put(Input_3005, ui_concreta.Ui_concretaPackage.eINSTANCE.getInput());

			elements.put(Button_3006, ui_concreta.Ui_concretaPackage.eINSTANCE.getButton());

			elements.put(Select_3007, ui_concreta.Ui_concretaPackage.eINSTANCE.getSelect());

			elements.put(Table_3008, ui_concreta.Ui_concretaPackage.eINSTANCE.getTable());

			elements.put(Img_3009, ui_concreta.Ui_concretaPackage.eINSTANCE.getImg());

			elements.put(Blockquote_3010, ui_concreta.Ui_concretaPackage.eINSTANCE.getBlockquote());

			elements.put(Ul_3011, ui_concreta.Ui_concretaPackage.eINSTANCE.getUl());

			elements.put(IFrame_3012, ui_concreta.Ui_concretaPackage.eINSTANCE.getIFrame());

			elements.put(Label_3013, ui_concreta.Ui_concretaPackage.eINSTANCE.getLabel());

			elements.put(Input_3014, ui_concreta.Ui_concretaPackage.eINSTANCE.getInput());

			elements.put(Button_3015, ui_concreta.Ui_concretaPackage.eINSTANCE.getButton());

			elements.put(Select_3016, ui_concreta.Ui_concretaPackage.eINSTANCE.getSelect());

			elements.put(Table_3017, ui_concreta.Ui_concretaPackage.eINSTANCE.getTable());

			elements.put(Img_3018, ui_concreta.Ui_concretaPackage.eINSTANCE.getImg());

			elements.put(Blockquote_3019, ui_concreta.Ui_concretaPackage.eINSTANCE.getBlockquote());

			elements.put(Ul_3020, ui_concreta.Ui_concretaPackage.eINSTANCE.getUl());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(UI_Diagram_1000);
			KNOWN_ELEMENT_TYPES.add(UserInterface_2001);
			KNOWN_ELEMENT_TYPES.add(Container_3001);
			KNOWN_ELEMENT_TYPES.add(Container_3002);
			KNOWN_ELEMENT_TYPES.add(IFrame_3003);
			KNOWN_ELEMENT_TYPES.add(Label_3004);
			KNOWN_ELEMENT_TYPES.add(Input_3005);
			KNOWN_ELEMENT_TYPES.add(Button_3006);
			KNOWN_ELEMENT_TYPES.add(Select_3007);
			KNOWN_ELEMENT_TYPES.add(Table_3008);
			KNOWN_ELEMENT_TYPES.add(Img_3009);
			KNOWN_ELEMENT_TYPES.add(Blockquote_3010);
			KNOWN_ELEMENT_TYPES.add(Ul_3011);
			KNOWN_ELEMENT_TYPES.add(IFrame_3012);
			KNOWN_ELEMENT_TYPES.add(Label_3013);
			KNOWN_ELEMENT_TYPES.add(Input_3014);
			KNOWN_ELEMENT_TYPES.add(Button_3015);
			KNOWN_ELEMENT_TYPES.add(Select_3016);
			KNOWN_ELEMENT_TYPES.add(Table_3017);
			KNOWN_ELEMENT_TYPES.add(Img_3018);
			KNOWN_ELEMENT_TYPES.add(Blockquote_3019);
			KNOWN_ELEMENT_TYPES.add(Ul_3020);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ui_concreta.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
			return UI_Diagram_1000;
		case ui_concreta.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID:
			return UserInterface_2001;
		case ui_concreta.diagram.edit.parts.ContainerEditPart.VISUAL_ID:
			return Container_3001;
		case ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID:
			return Container_3002;
		case ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID:
			return IFrame_3003;
		case ui_concreta.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			return Label_3004;
		case ui_concreta.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return Input_3005;
		case ui_concreta.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			return Button_3006;
		case ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID:
			return Select_3007;
		case ui_concreta.diagram.edit.parts.TableEditPart.VISUAL_ID:
			return Table_3008;
		case ui_concreta.diagram.edit.parts.ImgEditPart.VISUAL_ID:
			return Img_3009;
		case ui_concreta.diagram.edit.parts.BlockquoteEditPart.VISUAL_ID:
			return Blockquote_3010;
		case ui_concreta.diagram.edit.parts.UlEditPart.VISUAL_ID:
			return Ul_3011;
		case ui_concreta.diagram.edit.parts.IFrame2EditPart.VISUAL_ID:
			return IFrame_3012;
		case ui_concreta.diagram.edit.parts.Label2EditPart.VISUAL_ID:
			return Label_3013;
		case ui_concreta.diagram.edit.parts.Input2EditPart.VISUAL_ID:
			return Input_3014;
		case ui_concreta.diagram.edit.parts.Button2EditPart.VISUAL_ID:
			return Button_3015;
		case ui_concreta.diagram.edit.parts.Select2EditPart.VISUAL_ID:
			return Select_3016;
		case ui_concreta.diagram.edit.parts.Table2EditPart.VISUAL_ID:
			return Table_3017;
		case ui_concreta.diagram.edit.parts.Img2EditPart.VISUAL_ID:
			return Img_3018;
		case ui_concreta.diagram.edit.parts.Blockquote2EditPart.VISUAL_ID:
			return Blockquote_3019;
		case ui_concreta.diagram.edit.parts.Ul2EditPart.VISUAL_ID:
			return Ul_3020;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return ui_concreta.diagram.providers.Ui_concretaElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return ui_concreta.diagram.providers.Ui_concretaElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return ui_concreta.diagram.providers.Ui_concretaElementTypes.getElement(elementTypeAdapter);
		}
	};

}
