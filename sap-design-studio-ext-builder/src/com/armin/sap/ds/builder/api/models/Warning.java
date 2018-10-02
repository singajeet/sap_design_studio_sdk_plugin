package com.armin.sap.ds.builder.api.models;

public class Warning implements IModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4936824738607594797L;
	private String _id;
	private String _name;

	
	public Warning() {
		// TODO Auto-generated constructor stub
	}

	public Warning(String id) {
		_id = id;
		_name = id;
	}

	public Warning(String id, String name) {
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
