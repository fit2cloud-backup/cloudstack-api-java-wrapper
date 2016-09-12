package com.fit2cloud.cloudstack.wsclient.model.request.virtualmachine;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class RemoveNicFromVirtualMachineRequest extends Request {
	private String nicid;
	public String getNicid() {
		return nicid;
	}
	public void setNicid(String nicid) {
		this.nicid = nicid;
	}
	private String virtualmachineid;
	public String getVirtualmachineid() {
		return virtualmachineid;
	}
	public void setVirtualmachineid(String virtualmachineid) {
		this.virtualmachineid = virtualmachineid;
	}

}
