package com.armin.sap.ds.builder.command;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.ui.commands.ICommandService;

import com.armin.sap.ds.builder.Activator;

public class CommandFactory {

	private static CommandFactory _instance;
	
	private CommandFactory() {
		
	}
	
	public static CommandFactory getFactory() {
		if(_instance == null) {
			_instance = new CommandFactory();
		}
		return _instance;
	}
	
	public Command getCommand(String commandId) {
		if(commandId != null && Activator.getDefault() != null) {
			Command cmd = Activator.getDefault().getWorkbench().getService(ICommandService.class).getCommand(commandId);
			return cmd;
		}
		return null;
	}
	
	public Object executeAndReturnVal(String commandId) throws Exception{
		Command cmd = getCommand(commandId);
		ExecutionEvent event = getDefaultExecutionEvent();
		return cmd.executeWithChecks(event);		
	}
	
	public Object executeAndReturnVal(String commandId, String paramId, String paramVal) throws Exception{
		Command cmd = getCommand(commandId);
		ExecutionEvent event = getExecutionEvent(paramId, paramVal);
		return cmd.executeWithChecks(event);		
	}
	
	public ExecutionEvent getDefaultExecutionEvent() {
		Map<String, String> params = new HashMap<String, String>();
		return new ExecutionEvent(null, params, null, null);
	}
	
	public ExecutionEvent getExecutionEvent(String paramId, String paramVal) {
		Map<String, String> params = new HashMap<String, String>();
		params.put(paramId, paramVal);
		return new ExecutionEvent(null, params, null, null);
	}
	
	public ExecutionEvent getExecutionEvent(String[] paramIds, String[] paramVals) {
		Map<String, String> params = new HashMap<String, String>();
		for(int i=0; i<paramIds.length; i++) {
			if(i < paramVals.length) {
				params.put(paramIds[i], paramVals[i]);
			}
		}
		return new ExecutionEvent(null, params, null, null);
	}

}
