package com.armin.sap.ds.builder.core.common;

import java.util.HashMap;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import com.armin.sap.ds.builder.diagrams.dialogs.NewComponentClientDialog;
import com.armin.sap.ds.builder.diagrams.dialogs.NewConstantDialog;
import com.armin.sap.ds.builder.models.extended.Constant;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ComponentExtendedNode;

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
	
	public static HashMap<String, String> askComponentInfo(ComponentExtendedNode node) {
		HashMap<String, String> map = new HashMap<String, String>();
		NewComponentClientDialog d = new NewComponentClientDialog(getShell(), node, map);
		d.setBlockOnOpen(true);
		int retCode = d.open();
		if(retCode == Window.OK) {
				return map;			
		}		
		return null;
	}
	
	public static HashMap<String, String> askComponentInfo() {
		HashMap<String, String> map = new HashMap<String, String>();
		NewComponentClientDialog d = new NewComponentClientDialog(getShell(), null, map);
		d.setBlockOnOpen(true);
		
		int retCode = d.open();		
		if(retCode == Window.OK) {						
			return map;			
		}
		
		return null;
	}
	
	public static HashMap<String, String> askConstantInfo() {
		HashMap<String, String> map = new HashMap<String, String>();
		NewConstantDialog d = new NewConstantDialog(getShell(), null, map);
		d.setBlockOnOpen(true);
		
		int retCode = d.open();		
		if(retCode == Window.OK) {						
			return map;			
		}
		
		return null;
	}
	
	public static HashMap<String, String> askConstantInfo(Constant existingConstant) {
		HashMap<String, String> map = new HashMap<String, String>();
		NewConstantDialog d = new NewConstantDialog(getShell(), existingConstant, map);
		d.setBlockOnOpen(true);
		
		int retCode = d.open();		
		if(retCode == Window.OK) {						
			return map;			
		}
		
		return null;
	}
	
	public static boolean askQuestion(String question) {
		
		return false;
	}
	
	
	private static Shell getShell() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	}

}
