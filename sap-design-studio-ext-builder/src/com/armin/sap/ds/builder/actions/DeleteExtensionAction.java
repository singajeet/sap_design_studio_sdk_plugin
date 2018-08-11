package com.armin.sap.ds.builder.actions;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.commands.ICommandService;

import com.armin.sap.ds.builder.Activator;

public class DeleteExtensionAction extends BaseAction {

	public DeleteExtensionAction() {
		// TODO Auto-generated constructor stub
	}

	public DeleteExtensionAction(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public DeleteExtensionAction(String text, ImageDescriptor image) {
		super(text, image);
		// TODO Auto-generated constructor stub
	}

	public DeleteExtensionAction(String text, int style) {
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
		Command deleteCmd = Activator.getDefault().getWorkbench().getService(ICommandService.class).getCommand("org.eclipse.ui.edit.delete");
		Map<String, String> param = new HashMap<String, String>();
		ExecutionEvent event = new ExecutionEvent(null, param, null, null);		
		try {
			deleteCmd.executeWithChecks(event);
		} catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
