package com.armin.sap.ds.builder.api.models;

public class Error implements IModel {

	private String _id;
	private String _name;
	
	public Error() {		
	}
	
	public Error(String id) {
		_id = id;
		_name = id;
	}

	public Error(String id, String name) {
		_id = id;
		_name = name;
	}
	
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return _id;
	}

	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		_id = id;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return _name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		_name = name;
	}

}
