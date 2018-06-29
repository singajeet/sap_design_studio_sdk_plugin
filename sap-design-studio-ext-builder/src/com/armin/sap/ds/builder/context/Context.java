package com.armin.sap.ds.builder.context;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Context {

	private String _key;
	private Object _value;
	private Object _source;
	private List<ContextEventListener> _listeners;
	
	public Context(String key) {
		_key = key;
		_listeners = new ArrayList<ContextEventListener>();
	}
	
	public Context(String key, Object value) {
		_key = key;
		_value = value;
		_listeners = new ArrayList<ContextEventListener>();
	}
	
	public Context(Object source, String key) {
		_key = key;
		_source = source;
		_listeners = new ArrayList<ContextEventListener>();
	}
	
	public Context(Object source, String key, Object value) {
		_key = key;
		_value = value;
		_source = source;
		_listeners = new ArrayList<ContextEventListener>();
	}
	
	public void setValue(Object value, Object source) {
		_source = source;
		fireEvent(value);
	}
	
	public synchronized void addEventListener(ContextEventListener listener) {
		_listeners.add(listener);
	}
	
	public synchronized void removeEventListener(ContextEventListener listener) {
		_listeners.remove(listener);
	}
	
	private synchronized void fireEvent(Object newValue) {
		ContextEvent event = new ContextEvent(_source, _key, _value, newValue);
		Iterator<ContextEventListener> itr = _listeners.iterator();
		
		while(itr.hasNext()) {
			((ContextEventListener) itr.next()).contextValueChanged(event);
		}
	}

}