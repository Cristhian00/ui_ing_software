/*
* 
*/
package ui_concreta.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class Ui_concretaNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public Ui_concretaNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<ui_concreta.diagram.navigator.Ui_concretaNavigatorItem> result = new ArrayList<ui_concreta.diagram.navigator.Ui_concretaNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, ui_concreta.diagram.edit.parts.UI_DiagramEditPart.MODEL_ID), file,
					false));
			return result.toArray();
		}

		if (parentElement instanceof ui_concreta.diagram.navigator.Ui_concretaNavigatorGroup) {
			ui_concreta.diagram.navigator.Ui_concretaNavigatorGroup group = (ui_concreta.diagram.navigator.Ui_concretaNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof ui_concreta.diagram.navigator.Ui_concretaNavigatorItem) {
			ui_concreta.diagram.navigator.Ui_concretaNavigatorItem navigatorItem = (ui_concreta.diagram.navigator.Ui_concretaNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getVisualID(view)) {

		case ui_concreta.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID: {
			LinkedList<ui_concreta.diagram.navigator.Ui_concretaAbstractNavigatorItem> result = new LinkedList<ui_concreta.diagram.navigator.Ui_concretaAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
							.getType(ui_concreta.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ui_concreta.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID: {
			LinkedList<ui_concreta.diagram.navigator.Ui_concretaAbstractNavigatorItem> result = new LinkedList<ui_concreta.diagram.navigator.Ui_concretaAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.ContainerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.IFrame2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.Label2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.Input2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.Button2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.Select2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.Table2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.Img2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.Blockquote2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.Ul2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ui_concreta.diagram.edit.parts.ContainerEditPart.VISUAL_ID: {
			LinkedList<ui_concreta.diagram.navigator.Ui_concretaAbstractNavigatorItem> result = new LinkedList<ui_concreta.diagram.navigator.Ui_concretaAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.LabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.ButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.TableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.ImgEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.BlockquoteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.UlEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID: {
			LinkedList<ui_concreta.diagram.navigator.Ui_concretaAbstractNavigatorItem> result = new LinkedList<ui_concreta.diagram.navigator.Ui_concretaAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.LabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.ButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.TableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.ImgEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.BlockquoteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.UlEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID: {
			LinkedList<ui_concreta.diagram.navigator.Ui_concretaAbstractNavigatorItem> result = new LinkedList<ui_concreta.diagram.navigator.Ui_concretaAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.LabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.ButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.TableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.ImgEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.BlockquoteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.UlEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ui_concreta.diagram.edit.parts.IFrame2EditPart.VISUAL_ID: {
			LinkedList<ui_concreta.diagram.navigator.Ui_concretaAbstractNavigatorItem> result = new LinkedList<ui_concreta.diagram.navigator.Ui_concretaAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.Container2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.IFrameEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.LabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.ButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.SelectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.TableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.ImgEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.BlockquoteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getType(
							ui_concreta.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ui_concreta.diagram.part.Ui_concretaVisualIDRegistry
					.getType(ui_concreta.diagram.edit.parts.UlEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ui_concreta.diagram.edit.parts.UI_DiagramEditPart.MODEL_ID
				.equals(ui_concreta.diagram.part.Ui_concretaVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<ui_concreta.diagram.navigator.Ui_concretaNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<ui_concreta.diagram.navigator.Ui_concretaNavigatorItem> result = new ArrayList<ui_concreta.diagram.navigator.Ui_concretaNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new ui_concreta.diagram.navigator.Ui_concretaNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<ui_concreta.diagram.navigator.Ui_concretaNavigatorItem> getForeignShortcuts(Diagram diagram,
			Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof ui_concreta.diagram.navigator.Ui_concretaAbstractNavigatorItem) {
			ui_concreta.diagram.navigator.Ui_concretaAbstractNavigatorItem abstractNavigatorItem = (ui_concreta.diagram.navigator.Ui_concretaAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
