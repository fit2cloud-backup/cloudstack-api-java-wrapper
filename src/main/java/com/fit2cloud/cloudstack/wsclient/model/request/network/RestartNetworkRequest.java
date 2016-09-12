package com.fit2cloud.cloudstack.wsclient.model.request.network;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class RestartNetworkRequest extends Request {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String cleanup;
	public String getCleanup() {
		return cleanup;
	}
	public void setCleanup(String cleanup) {
		this.cleanup = cleanup;
	}

}
