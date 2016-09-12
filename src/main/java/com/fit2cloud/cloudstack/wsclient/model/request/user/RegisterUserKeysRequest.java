package com.fit2cloud.cloudstack.wsclient.model.request.user;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class RegisterUserKeysRequest extends Request {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
