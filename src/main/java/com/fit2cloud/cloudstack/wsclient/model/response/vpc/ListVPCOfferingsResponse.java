package com.fit2cloud.cloudstack.wsclient.model.response.vpc;

import com.fit2cloud.cloudstack.wsclient.domain.model.Service;
import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListVPCOfferingsResponse extends Response {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String created;
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	private String displaytext;
	public String getDisplaytext() {
		return displaytext;
	}
	public void setDisplaytext(String displaytext) {
		this.displaytext = displaytext;
	}
	private String isdefault;
	public String getIsdefault() {
		return isdefault;
	}
	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private Service service;
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
}
