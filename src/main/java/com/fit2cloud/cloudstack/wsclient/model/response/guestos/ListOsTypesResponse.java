package com.fit2cloud.cloudstack.wsclient.model.response.guestos;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListOsTypesResponse extends Response {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String description;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private String oscategoryid;
	public String getOscategoryid() {
		return oscategoryid;
	}
	public void setOscategoryid(String oscategoryid) {
		this.oscategoryid = oscategoryid;
	}

}
