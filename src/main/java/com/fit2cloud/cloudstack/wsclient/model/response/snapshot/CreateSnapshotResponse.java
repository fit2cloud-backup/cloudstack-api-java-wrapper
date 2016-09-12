package com.fit2cloud.cloudstack.wsclient.model.response.snapshot;

import com.fit2cloud.cloudstack.wsclient.domain.model.Tags;
import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class CreateSnapshotResponse extends Response {
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
	private String created;
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
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
	private String intervaltype;
	public String getIntervaltype() {
		return intervaltype;
	}
	public void setIntervaltype(String intervaltype) {
		this.intervaltype = intervaltype;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	private String snapshottype;
	public String getSnapshottype() {
		return snapshottype;
	}
	public void setSnapshottype(String snapshottype) {
		this.snapshottype = snapshottype;
	}
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private String volumeid;
	public String getVolumeid() {
		return volumeid;
	}
	public void setVolumeid(String volumeid) {
		this.volumeid = volumeid;
	}
	private String volumename;
	public String getVolumename() {
		return volumename;
	}
	public void setVolumename(String volumename) {
		this.volumename = volumename;
	}
	private String volumetype;
	public String getVolumetype() {
		return volumetype;
	}
	public void setVolumetype(String volumetype) {
		this.volumetype = volumetype;
	}
	private String zoneid;
	public String getZoneid() {
		return zoneid;
	}
	public void setZoneid(String zoneid) {
		this.zoneid = zoneid;
	}
	private Tags tags;
	public Tags getTags() {
		return tags;
	}
	public void setTags(Tags tags) {
		this.tags = tags;
	}
	private String jobstatus;
	public String getJobstatus() {
		return jobstatus;
	}
	public void setJobstatus(String jobstatus) {
		this.jobstatus = jobstatus;
	}

}
