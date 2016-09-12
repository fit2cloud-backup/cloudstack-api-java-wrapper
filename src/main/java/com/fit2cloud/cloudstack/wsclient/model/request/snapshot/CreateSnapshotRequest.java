package com.fit2cloud.cloudstack.wsclient.model.request.snapshot;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class CreateSnapshotRequest extends Request {
	private String volumeid;
	public String getVolumeid() {
		return volumeid;
	}
	public void setVolumeid(String volumeid) {
		this.volumeid = volumeid;
	}
	private String account;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	private String domainid;
	public String getDomainid() {
		return domainid;
	}
	public void setDomainid(String domainid) {
		this.domainid = domainid;
	}
	private String policyid;
	public String getPolicyid() {
		return policyid;
	}
	public void setPolicyid(String policyid) {
		this.policyid = policyid;
	}

}
