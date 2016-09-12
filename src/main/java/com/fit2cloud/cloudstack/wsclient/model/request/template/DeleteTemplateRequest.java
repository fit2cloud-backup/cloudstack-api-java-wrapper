package com.fit2cloud.cloudstack.wsclient.model.request.template;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class DeleteTemplateRequest extends Request {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String zoneid;
	public String getZoneid() {
		return zoneid;
	}
	public void setZoneid(String zoneid) {
		this.zoneid = zoneid;
	}

}
