package com.fit2cloud.cloudstack.wsclient.model.response.guestos;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListOsCategoriesResponse extends Response {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
