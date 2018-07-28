/**
 * 
 */
package com.armin.sap.ds.builder.context;

import java.util.Map;

import org.eclipse.core.resources.IProject;

import com.armin.sap.ds.builder.api.models.Extension;

/**
 * @author armin
 *
 */
public class ExtensionsContext extends Context {

	private Map<String, Extension> _extensions;
	
	public ExtensionsContext(Map<String, Extension> extensions) {
		super("Extensions");
		_extensions = extensions;
		this._value = extensions;
	}
	
	public ExtensionsContext(IProject project, Map<String, Extension> extensions) {
		super(project.getName());		
		_extensions = extensions;
		this._value = extensions;
	}
	
	/**
	 * @param key
	 */
	public ExtensionsContext(String key) {
		super(key);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param key
	 * @param value
	 */
	public ExtensionsContext(String key, Object value) {
		super(key, value);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param source
	 * @param key
	 */
	public ExtensionsContext(Object source, String key) {
		super(source, key);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param source
	 * @param key
	 * @param value
	 */
	public ExtensionsContext(Object source, String key, Object value) {
		super(source, key, value);
		// TODO Auto-generated constructor stub
	}

	public void setContext(IProject project, Map<String, Extension> extensions) {
		this._key = project.getName();
		_extensions = extensions;
		this._value = extensions;
	}
	
	public void setContext(Map<String, Extension> extensions) {		
		_extensions = extensions;
		this._value = extensions;
		this._key = "Extensions";
	}
	
	public Map<String, Extension> getContext(){
		return _extensions;
	}
	
	public void addToContext(String key, Extension value) throws Exception {
		if(_extensions != null) {
			if(!_extensions.containsKey(key)) {
				_extensions.put(key, value);
				this.fireEvent(value);
			} else {
				throw new Exception("Provided key [" + key + "] already exist in the context map.");
			}
		} else {
			throw new Exception("Context map is not initialized yet");
		}
	}
	
	public Extension getFromContext(String key) throws Exception{
		if(key!=null) {
			return _extensions.get(key);
		} else {
			throw new Exception("Invalid value provided for key: (null)");
		}
	}
	
	public void removeFromContext(String key) {
		_extensions.remove(key);
		this.fireEvent(key);
	}
	
	public boolean has(String key) {
		if(key != null) {
			return _extensions.containsKey(key);
		} else {
			return false;
		}
	}
}
