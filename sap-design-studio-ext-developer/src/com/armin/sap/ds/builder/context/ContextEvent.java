package com.armin.sap.ds.builder.context;

import java.util.EventObject;

public class ContextEvent extends EventObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4496186817738888153L;
	private Object _source;
	private String _contextKey;
	private Object _contextValue;
	private Object _oldContextValue;
		
	public ContextEvent(Object source, String contextKey, Object contextValue, Object oldContextValue) {
		super(source);
		_source = source;
		_contextKey = contextKey;
		_contextValue = contextValue;
		_oldContextValue = oldContextValue;
	}
	
	public Object getSource() {
		return _source;
	}
	
	public String getContextKey() {
		return _contextKey;
	}
	
	public Object getContextValue() {
		return _contextValue;
	}
	
	public Object getOldContextValue() {
		return _oldContextValue;
	}

}








