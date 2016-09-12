package com.fit2cloud.cloudstack.wsclient.model.request.virtualmachine;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class DestroyVirtualMachineRequest extends Request {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String expunge;
	public String getExpunge() {
		return expunge;
	}
	public void setExpunge(String expunge) {
		this.expunge = expunge;
	}
}
