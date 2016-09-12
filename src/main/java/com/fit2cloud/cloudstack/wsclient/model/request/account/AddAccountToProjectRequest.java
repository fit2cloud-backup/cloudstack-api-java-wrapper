package com.fit2cloud.cloudstack.wsclient.model.request.account;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class AddAccountToProjectRequest extends Request {
	private String projectid;
	public String getProjectid() {
		return projectid;
	}
	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}
	private String account;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
