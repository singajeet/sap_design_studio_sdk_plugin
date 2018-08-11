package com.armin.sap.ds.builder.actions;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.commands.ICommandService;

import com.armin.sap.ds.builder.Activator;

public class CreateNewExtensionAction extends BaseAction {

	IEditorPart _editor;
	
	public CreateNewExtensionAction() {
		// TODO Auto-generated constructor stub
	}

	public CreateNewExtensionAction(IEditorPart editor) {
		this._editor = editor;
	}
	
	public CreateNewExtensionAction(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public CreateNewExtensionAction(String text, ImageDescriptor image) {
		super(text, image);
		// TODO Auto-generated constructor stub
	}

	public CreateNewExtensionAction(String text, int style) {
		super(text, style);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		Command newCmd = Activator.getDefault().getWorkbench().getService(ICommandService.class).getCommand("org.eclipse.ui.newWizard");
		Map<String, String> param = new HashMap<String, String>();
		param.put("newWizardId", "com.armin.sap.ds.builder.wizards.new_extension_wizard");
		ExecutionEvent event = new ExecutionEvent(null, param, null, null);		
		try {
			newCmd.executeWithChecks(event);
		} catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
