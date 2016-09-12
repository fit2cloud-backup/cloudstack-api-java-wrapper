package com.fit2cloud.cloudstack.wsclient.model.response.limit;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class GetApiLimitResponse extends Response {
	private String account;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	private String accountid;
	public String getAccountid() {
		return accountid;
	}
	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}
	private String apiAllowed;
	public String getApiAllowed() {
		return apiAllowed;
	}
	public void setApiAllowed(String apiAllowed) {
		this.apiAllowed = apiAllowed;
	}
	private String apiIssued;
	public String getApiIssued() {
		return apiIssued;
	}
	public void setApiIssued(String apiIssued) {
		this.apiIssued = apiIssued;
	}
	private String expireAfter;
	public String getExpireAfter() {
		return expireAfter;
	}
	public void setExpireAfter(String expireAfter) {
		this.expireAfter = expireAfter;
	}

}
