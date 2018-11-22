package com.armin.sap.ds.builder.api.models.domain;

import java.io.Serializable;

public interface IModel extends Serializable {
	public String getId();
	public void setId(String id);
	public String getName();
	public void setName(String name);
}
