package com.fit2cloud.cloudstack.wsclient.model.response.template;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListTemplatePermissionsResponse extends Response {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	private String ispublic;
	public String getIspublic() {
		return ispublic;
	}
	public void setIspublic(String ispublic) {
		this.ispublic = ispublic;
	}
	private String projectids;
	public String getProjectids() {
		return projectids;
	}
	public void setProjectids(String projectids) {
		this.projectids = projectids;
	}

}
