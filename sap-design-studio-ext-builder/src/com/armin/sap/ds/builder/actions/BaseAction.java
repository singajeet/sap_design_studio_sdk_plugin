package com.armin.sap.ds.builder.actions;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.CommandEvent;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.ICommandListener;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.State;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.commands.ICommandService;

import com.armin.sap.ds.builder.Activator;

public class BaseAction extends Action implements IWorkbenchAction {

	protected Command _cmd;
	protected ExecutionEvent _event;
	protected String _commandId;
	protected String _paramId;
	protected String _paramValue;
	
	public BaseAction(String commandId, String paramId, String paramValue) {
		super(commandId);
		this._commandId = commandId;
		this._paramId = paramId;
		this._paramValue = paramValue;
		this.init();
	}
	
	public BaseAction(String text, String commandId, String paramId, String paramValue) {
		super(text);
		this._commandId = commandId;
		this._paramId = paramId;
		this._paramValue = paramValue;
		this.init();
	}
	
	public BaseAction(String text, String commandId) {
		this(text, commandId, null, null);
		this.init();
	}
	
	public BaseAction() {
		super();
		this.init();
	}

	public BaseAction(String text) {
		super(text);
		this.init();
	}

	public BaseAction(String text, ImageDescriptor image) {
		super(text, image);
		this.init();
	}
	
	public BaseAction(String text, ImageDescriptor image, String commandId) {
		super(text, image);
		this._commandId = commandId;
		this.init();
	}
	
	public BaseAction(ImageDescriptor image, String commandId) {
		super(commandId, image);
		this._commandId = commandId;
		this.init();
	}
	
	public BaseAction(String text, ImageDescriptor image, String commandId, String paramId, String paramValue) {
		super(text, image);
		this._commandId = commandId;
		this._paramId = paramId;
		this._paramValue = paramValue;
		this.init();
	}

	public BaseAction(String text, int style) {
		super(text, style);
		this.init();
	}
	
	public BaseAction(String text, int style, String commandId) {
		super(text, style);
		this._commandId = commandId;
		this.init();
	}
	
	public BaseAction(String text, int style, String commandId, String paramId, String paramValue) {
		super(text, style);
		this._commandId = commandId;
		this._paramId = paramId;
		this._paramValue = paramValue;
		this.init();
	}

	@Override
	public void dispose() {	

	}
	
	protected void init() {
		if(this._commandId != null && Activator.getDefault() != null) {
			_cmd = Activator.getDefault().getWorkbench().getService(ICommandService.class).getCommand(this._commandId);
			Map<String, String> param = new HashMap<String, String>();
			if(this._paramId != null) {
				param.put(this._paramId, this._paramValue);
			}
			_event = new ExecutionEvent(null, param, null, null);
			BaseAction _action = this;
			
			_cmd.addCommandListener(new ICommandListener() {
	
				@Override
				public void commandChanged(CommandEvent commandEvent) {
					if(commandEvent.isEnabledChanged()) {
						State cmdState = commandEvent.getCommand().getState(ENABLED);
						if(cmdState != null) {
							String stateVal = (String)cmdState.getValue();
							if(stateVal.equalsIgnoreCase(ENABLED))
								_action.setEnabled(true);
							else
								_action.setEnabled(false);
						}
						
					}
					
				}
				
			});
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		if(_cmd != null) {
			if(_cmd.isDefined() && _cmd.isEnabled()) {
				try {
					_cmd.executeWithChecks(_event);
				} catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
