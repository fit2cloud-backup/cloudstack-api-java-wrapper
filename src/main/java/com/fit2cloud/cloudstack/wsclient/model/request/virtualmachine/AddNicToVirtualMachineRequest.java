package com.fit2cloud.cloudstack.wsclient.model.request.virtualmachine;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class AddNicToVirtualMachineRequest extends Request {
	private String networkid;
	public String getNetworkid() {
		return networkid;
	}
	public void setNetworkid(String networkid) {
		this.networkid = networkid;
	}
	private String virtualmachineid;
	public String getVirtualmachineid() {
		return virtualmachineid;
	}
	public void setVirtualmachineid(String virtualmachineid) {
		this.virtualmachineid = virtualmachineid;
	}
	private String ipaddress;
	public String getIpaddress() {
		return ipaddress;
	}
	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

}
