package com.armin.sap.ds.builder.api.common;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import com.armin.sap.ds.builder.ui.dialogs.ComponentClientCreateFeatureDialog;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ComponentNode;

public class Prompts {

	public static Prompts INSTANCE = new Prompts();
	
	private Prompts() {
		// TODO Auto-generated constructor stub
	}
	
	public static String askStringValue(String dialogTitle, String dialogMessage, String initialValue) {
		
		String ret = null;
		Shell shell = getShell();
		InputDialog inputDialog = new InputDialog(shell, dialogTitle, dialogMessage, initialValue, null);
		int retDialog = inputDialog.open();
		if (retDialog == Window.OK) {
			ret = inputDialog.getValue();
		}
		return ret;
	}
	
	public static void askComponent(ComponentNode node) {
		ComponentClientCreateFeatureDialog d = new ComponentClientCreateFeatureDialog(getShell(), node);
		d.open();
		
	}
	
	private static Shell getShell() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	}

}
