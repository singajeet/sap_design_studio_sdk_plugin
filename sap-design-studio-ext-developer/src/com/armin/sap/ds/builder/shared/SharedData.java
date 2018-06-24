package com.armin.sap.ds.builder.shared;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SharedData implements ISharedData {

	private Map<String, Object> _dataMap;
	private List<ISharedDataSubscriber> _subscribers;
	
	public SharedData() {
		_dataMap = new HashMap<String, Object>();
		_subscribers = new ArrayList<ISharedDataSubscriber>();
	}

	/* (non-Javadoc)
	 * @see com.armin.sap.ds.wizard.pages.ISharedData#getData(java.lang.String)
	 */
	@Override
	public Object getData(String key) {
		return _dataMap.get(key);
	}

	/* (non-Javadoc)
	 * @see com.armin.sap.ds.wizard.pages.ISharedData#setData(java.lang.String, java.lang.Object)
	 */
	@Override
	public void setData(String key, Object data) {
		_dataMap.put(key, data);
		notifySubscribers(key, data);
	}
	
	@Override
	public void registerSubscriber(ISharedDataSubscriber subscriber) {
		_subscribers.add(subscriber);
		
	}
	
	@Override
	public void unregisterSubscriber(ISharedDataSubscriber subscriber) {
		_subscribers.remove(subscriber);
		
	}

	@Override
	public void notifySubscribers(String key, Object value) {
		for (ISharedDataSubscriber subscriber : _subscribers) {
			subscriber.onSharedDataChanged(key, value);
		}
		
	}


}
