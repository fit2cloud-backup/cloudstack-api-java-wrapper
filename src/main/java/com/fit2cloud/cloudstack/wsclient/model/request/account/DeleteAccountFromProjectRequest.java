package com.fit2cloud.cloudstack.wsclient.model.request.account;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class DeleteAccountFromProjectRequest extends Request {
	private String account;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	private String projectid;
	public String getProjectid() {
		return projectid;
	}
	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}

}
