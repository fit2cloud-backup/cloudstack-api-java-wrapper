package com.fit2cloud.cloudstack.wsclient.model.request.iso;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class ListIsoPermissionsRequest extends Request {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
