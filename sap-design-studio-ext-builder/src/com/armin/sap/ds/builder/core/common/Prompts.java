package com.armin.sap.ds.builder.core.common;

import java.util.HashMap;
import java.util.List;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import com.armin.sap.ds.builder.models.domain.Component;
import com.armin.sap.ds.builder.ui.dialogs.ClientComponentCreateFeatureDialog;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ComponentNode;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ExtensionNode;

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
	
	public static HashMap<String, String> askComponentIdAndTitle(ComponentNode node) {
		HashMap<String, String> map = new HashMap<String, String>();
		ClientComponentCreateFeatureDialog d = new ClientComponentCreateFeatureDialog(getShell(), node, map);
		
		int retCode = d.open();
		if(retCode == Window.OK) {
				return map;			
		}		
		return null;
	}
	
	public static HashMap<String, String> askComponentIdAndTitle(ExtensionNode node) {
		HashMap<String, String> map = new HashMap<String, String>();
		ClientComponentCreateFeatureDialog d = new ClientComponentCreateFeatureDialog(getShell(), node, map);
		d.setBlockOnOpen(true);
		
		int retCode = d.open();		
		if(retCode == Window.OK) {						
			return map;			
		}
		
		return null;
	}
	
	public static HashMap<String, String> askComponentIdAndTitle(List<Component> node) {
		HashMap<String, String> map = new HashMap<String, String>();
		ClientComponentCreateFeatureDialog d = new ClientComponentCreateFeatureDialog(getShell(), node, map);
		
		int retCode = d.open();
		if(retCode == Window.OK) {
			return map;			
		}
		
		return null;
	}
	
	private static Shell getShell() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	}

}
