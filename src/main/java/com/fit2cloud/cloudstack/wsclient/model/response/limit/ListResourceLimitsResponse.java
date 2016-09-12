package com.fit2cloud.cloudstack.wsclient.model.response.limit;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListResourceLimitsResponse extends Response {
	private String account;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	private String domain;
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	private String domainid;
	public String getDomainid() {
		return domainid;
	}
	public void setDomainid(String domainid) {
		this.domainid = domainid;
	}
	private String max;
	public String getMax() {
		return max;
	}
	public void setMax(String max) {
		this.max = max;
	}
	private String project;
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	private String projectid;
	public String getProjectid() {
		return projectid;
	}
	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}
	private String resourcetype;
	public String getResourcetype() {
		return resourcetype;
	}
	public void setResourcetype(String resourcetype) {
		this.resourcetype = resourcetype;
	}

}
