package com.armin.sap.ds.builder.context;

import java.util.HashMap;
import java.util.Map;

import com.armin.sap.ds.builder.api.models.Extension;

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
	
	public Context create(String projectName, Map<String, Extension> extensions) {
		Context ctx = null;
		if(!_contextObjects.containsKey(projectName)) {
			ctx = new ExtensionsContext(projectName, extensions);
			_contextObjects.put(projectName, ctx);
		}
		return ctx;
	}
	
	public Context createForExtensions(String projectName) {
		Map<String, Extension> extensions = new HashMap<String, Extension>();
		return this.create(projectName, extensions);
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
