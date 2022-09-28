
/*
 * 
 */
package ui_concreta.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class Ui_concretaPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(ui_concreta.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createBlockquote1CreationTool());
		paletteContainer.add(createButton2CreationTool());
		paletteContainer.add(createContainer3CreationTool());
		paletteContainer.add(createIFrame4CreationTool());
		paletteContainer.add(createImg5CreationTool());
		paletteContainer.add(createInput6CreationTool());
		paletteContainer.add(createLabel7CreationTool());
		paletteContainer.add(createSelect8CreationTool());
		paletteContainer.add(createTable9CreationTool());
		paletteContainer.add(createUl10CreationTool());
		paletteContainer.add(createUserInterface11CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createBlockquote1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_concreta.diagram.providers.Ui_concretaElementTypes.Blockquote_3010);
		types.add(ui_concreta.diagram.providers.Ui_concretaElementTypes.Blockquote_3019);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_concreta.diagram.part.Messages.Blockquote1CreationTool_title,
				ui_concreta.diagram.part.Messages.Blockquote1CreationTool_desc, types);
		entry.setId("createBlockquote1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_concreta.diagram.providers.Ui_concretaElementTypes
				.getImageDescriptor(ui_concreta.diagram.providers.Ui_concretaElementTypes.Blockquote_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createButton2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_concreta.diagram.providers.Ui_concretaElementTypes.Button_3006);
		types.add(ui_concreta.diagram.providers.Ui_concretaElementTypes.Button_3015);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_concreta.diagram.part.Messages.Button2CreationTool_title,
				ui_concreta.diagram.part.Messages.Button2CreationTool_desc, types);
		entry.setId("createButton2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_concreta.diagram.providers.Ui_concretaElementTypes
				.getImageDescriptor(ui_concreta.diagram.providers.Ui_concretaElementTypes.Button_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContainer3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_concreta.diagram.providers.Ui_concretaElementTypes.Container_3001);
		types.add(ui_concreta.diagram.providers.Ui_concretaElementTypes.Container_3002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_concreta.diagram.part.Messages.Container3CreationTool_title,
				ui_concreta.diagram.part.Messages.Container3CreationTool_desc, types);
		entry.setId("createContainer3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_concreta.diagram.providers.Ui_concretaElementTypes
				.getImageDescriptor(ui_concreta.diagram.providers.Ui_concretaElementTypes.Container_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIFrame4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_concreta.diagram.providers.Ui_concretaElementTypes.IFrame_3003);
		types.add(ui_concreta.diagram.providers.Ui_concretaElementTypes.IFrame_3012);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_concreta.diagram.part.Messages.IFrame4CreationTool_title,
				ui_concreta.diagram.part.Messages.IFrame4CreationTool_desc, types);
		entry.setId("createIFrame4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_concreta.diagram.providers.Ui_concretaElementTypes
				.getImageDescriptor(ui_concreta.diagram.providers.Ui_concretaElementTypes.IFrame_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImg5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_concreta.diagram.providers.Ui_concretaElementTypes.Img_3009);
		types.add(ui_concreta.diagram.providers.Ui_concretaElementTypes.Img_3018);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(ui_concreta.diagram.part.Messages.Img5CreationTool_title,
				ui_concreta.diagram.part.Messages.Img5CreationTool_desc, types);
		entry.setId("createImg5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_concreta.diagram.providers.Ui_concretaElementTypes
				.getImageDescriptor(ui_concreta.diagram.providers.Ui_concretaElementTypes.Img_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInput6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_concreta.diagram.providers.Ui_concretaElementTypes.Input_3005);
		types.add(ui_concreta.diagram.providers.Ui_concretaElementTypes.Input_3014);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_concreta.diagram.part.Messages.Input6CreationTool_title,
				ui_concreta.diagram.part.Messages.Input6CreationTool_desc, types);
		entry.setId("createInput6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_concreta.diagram.providers.Ui_concretaElementTypes
				.getImageDescriptor(ui_concreta.diagram.providers.Ui_concretaElementTypes.Input_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLabel7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_concreta.diagram.providers.Ui_concretaElementTypes.Label_3004);
		types.add(ui_concreta.diagram.providers.Ui_concretaElementTypes.Label_3013);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_concreta.diagram.part.Messages.Label7CreationTool_title,
				ui_concreta.diagram.part.Messages.Label7CreationTool_desc, types);
		entry.setId("createLabel7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_concreta.diagram.providers.Ui_concretaElementTypes
				.getImageDescriptor(ui_concreta.diagram.providers.Ui_concretaElementTypes.Label_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSelect8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_concreta.diagram.providers.Ui_concretaElementTypes.Select_3007);
		types.add(ui_concreta.diagram.providers.Ui_concretaElementTypes.Select_3016);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_concreta.diagram.part.Messages.Select8CreationTool_title,
				ui_concreta.diagram.part.Messages.Select8CreationTool_desc, types);
		entry.setId("createSelect8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_concreta.diagram.providers.Ui_concretaElementTypes
				.getImageDescriptor(ui_concreta.diagram.providers.Ui_concretaElementTypes.Select_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTable9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_concreta.diagram.providers.Ui_concretaElementTypes.Table_3008);
		types.add(ui_concreta.diagram.providers.Ui_concretaElementTypes.Table_3017);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_concreta.diagram.part.Messages.Table9CreationTool_title,
				ui_concreta.diagram.part.Messages.Table9CreationTool_desc, types);
		entry.setId("createTable9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_concreta.diagram.providers.Ui_concretaElementTypes
				.getImageDescriptor(ui_concreta.diagram.providers.Ui_concretaElementTypes.Table_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUl10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_concreta.diagram.providers.Ui_concretaElementTypes.Ul_3011);
		types.add(ui_concreta.diagram.providers.Ui_concretaElementTypes.Ul_3020);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(ui_concreta.diagram.part.Messages.Ul10CreationTool_title,
				ui_concreta.diagram.part.Messages.Ul10CreationTool_desc, types);
		entry.setId("createUl10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_concreta.diagram.providers.Ui_concretaElementTypes
				.getImageDescriptor(ui_concreta.diagram.providers.Ui_concretaElementTypes.Ul_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserInterface11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_concreta.diagram.part.Messages.UserInterface11CreationTool_title,
				ui_concreta.diagram.part.Messages.UserInterface11CreationTool_desc,
				Collections.singletonList(ui_concreta.diagram.providers.Ui_concretaElementTypes.UserInterface_2001));
		entry.setId("createUserInterface11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_concreta.diagram.providers.Ui_concretaElementTypes
				.getImageDescriptor(ui_concreta.diagram.providers.Ui_concretaElementTypes.UserInterface_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
