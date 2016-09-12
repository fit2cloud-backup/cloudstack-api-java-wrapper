package com.fit2cloud.cloudstack.wsclient.model.request.hypervisor;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class ListHypervisorsRequest extends Request {
	private String zoneid;
	public String getZoneid() {
		return zoneid;
	}
	public void setZoneid(String zoneid) {
		this.zoneid = zoneid;
	}

}
