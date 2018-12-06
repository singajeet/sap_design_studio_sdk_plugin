package com.armin.sap.ds.builder.core.common;

import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.navigator.INavigatorContentService;

import com.armin.sap.ds.builder.ui.navigation.tree.nodes.IProjectItemNode;

public class UIHelper {

	public static UIHelper INSTANCE = new UIHelper();
	private static final String NAVIGATOR_VIEW = "com.armin.sap.ds.builder.project.navigator.view";
	
	private IProjectItemNode rootTreeNode;
	
	private UIHelper() {
		// TODO Auto-generated constructor stub
	}
	
	public CommonNavigator getCommonNavigator() {
		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow wd =  wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = wd.getActivePage();
		if(page != null) {
			IViewPart view = page.findView(NAVIGATOR_VIEW);
			if(view != null && view instanceof CommonNavigator)
				return (CommonNavigator)view;
		}
		return null;
	}
	
	public INavigatorContentService getNavigatorContentService() {
		CommonNavigator navigator = getCommonNavigator();		
		return navigator.getNavigatorContentService();
	}

	public void refreshCommonView() {
		getCommonNavigator().getCommonViewer().refresh();
	}
	
	public void updateCommonNavigator() {
		getNavigatorContentService().update();
	}
	
	public void setRootTreeNode(IProjectItemNode node) {
		this.rootTreeNode = node;
	}
	
	public IProjectItemNode getRootTreeNode() {
		return this.rootTreeNode;
	}
}
