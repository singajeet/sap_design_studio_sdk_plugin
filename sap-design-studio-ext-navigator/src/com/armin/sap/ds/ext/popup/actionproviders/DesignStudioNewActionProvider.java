package com.armin.sap.ds.ext.popup.actionproviders;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonMenuConstants;
import org.eclipse.ui.navigator.ICommonViewerWorkbenchSite;
import org.eclipse.ui.navigator.WizardActionGroup;

public class DesignStudioNewActionProvider extends CommonActionProvider {

	private static final String NEW_MENU_NAME = "common.new.menu";//$NON-NLS-1$
	private ActionFactory.IWorkbenchAction showDialogAction;
	private WizardActionGroup newWizardActionGroup;
	private boolean contribute = false;
	
	public DesignStudioNewActionProvider() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void init(ICommonActionExtensionSite anExtensionSite) {
		if(anExtensionSite.getViewSite() instanceof ICommonViewerWorkbenchSite) {
			IWorkbenchWindow window = ((ICommonViewerWorkbenchSite)anExtensionSite.getViewSite()).getWorkbenchWindow();
			showDialogAction = ActionFactory.NEW.create(window);
			
			newWizardActionGroup = new WizardActionGroup(window, PlatformUI.getWorkbench().getNewWizardRegistry(), WizardActionGroup.TYPE_NEW, anExtensionSite.getContentService());
			contribute = true;
		}
	}
	
	@Override
	public void fillContextMenu(IMenuManager menu) {
		IMenuManager submenu = new MenuManager("New", NEW_MENU_NAME);
		
		if(!contribute) {
			return;
		}
		
		newWizardActionGroup.setContext(getContext());
		newWizardActionGroup.fillContextMenu(submenu);
		
		submenu.add(new Separator(ICommonMenuConstants.GROUP_ADDITIONS));
		submenu.add(new Separator());
		submenu.add(showDialogAction);
		
		menu.insertAfter(ICommonMenuConstants.GROUP_NEW, submenu);
	}
	
	@Override
	public void dispose() {
		if(showDialogAction != null) {
			showDialogAction.dispose();
			showDialogAction = null;
		}
		super.dispose();
	}

}
