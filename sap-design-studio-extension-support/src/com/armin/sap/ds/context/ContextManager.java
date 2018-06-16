package com.armin.sap.ds.context;

import java.util.HashMap;
import java.util.Map;

public class ContextManager {

	private static ContextManager _singleton;
	private Map<String, Context> _contextObjects;
	
	private ContextManager() {
		_contextObjects = new HashMap<String, Context>();
	}
	
	public static ContextManager get() {
		if(_singleton == null) {
			_singleton = new ContextManager();
		}
		
		return _singleton;
	}
	
	public Context create(String key, Object source) {
		Context ctx = null;
		if(!_contextObjects.containsKey(key)) {
			ctx = new Context(source, key);
			_contextObjects.put(key, ctx);
		}
		return ctx;
	}
	
	public Context create(String key, Object value, Object source) {
		Context ctx = null;
		if(!_contextObjects.containsKey(key)) {
			ctx = new Context(source, key, value);
			_contextObjects.put(key, ctx);
		}
		return ctx;
	}
	
	public void remove(String key) {
		if(_contextObjects.containsKey(key)) {
			_contextObjects.remove(key);
		}
	}
	
	public Context getContext(String key) {
		Context ctx = null;
		if(_contextObjects.containsKey(key)) {
			ctx = _contextObjects.get(key);
		}
		return ctx;
	}
}
