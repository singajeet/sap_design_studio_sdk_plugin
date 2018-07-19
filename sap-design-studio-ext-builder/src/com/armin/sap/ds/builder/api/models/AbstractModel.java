package com.armin.sap.ds.builder.api.models;

public abstract class AbstractModel implements IModel {

	protected String _id;
	protected String _name;
	
	public AbstractModel() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return _id;
	}
	
	@Override
	public void setId(String id) {
		_id = id;
	}

	@Override
	public String getName() {
		return _name;
	}
	
	@Override
	public void setName(String name) {
		_name = name;
	}
}
