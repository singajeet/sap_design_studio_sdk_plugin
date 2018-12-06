package com.armin.sap.ds.builder.models.domain;

import java.io.Serializable;

public interface IModel extends Serializable {
	public String getId();
	public void setId(String id);
	public String getName();
	public void setName(String name);
}
