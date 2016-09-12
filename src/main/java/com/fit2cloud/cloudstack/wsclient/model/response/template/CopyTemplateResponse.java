package com.fit2cloud.cloudstack.wsclient.model.response.template;

import com.fit2cloud.cloudstack.wsclient.domain.model.Tags;
import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class CopyTemplateResponse extends Response {
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
	private String accountid;
	public String getAccountid() {
		return accountid;
	}
	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}
	private String bootable;
	public String getBootable() {
		return bootable;
	}
	public void setBootable(String bootable) {
		this.bootable = bootable;
	}
	private String checksum;
	public String getChecksum() {
		return checksum;
	}
	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}
	private String created;
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	private String crossZones;
	public String getCrossZones() {
		return crossZones;
	}
	public void setCrossZones(String crossZones) {
		this.crossZones = crossZones;
	}
	private String details;
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	private String displaytext;
	public String getDisplaytext() {
		return displaytext;
	}
	public void setDisplaytext(String displaytext) {
		this.displaytext = displaytext;
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
	private String format;
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	private String hostid;
	public String getHostid() {
		return hostid;
	}
	public void setHostid(String hostid) {
		this.hostid = hostid;
	}
	private String hostname;
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	private String hypervisor;
	public String getHypervisor() {
		return hypervisor;
	}
	public void setHypervisor(String hypervisor) {
		this.hypervisor = hypervisor;
	}
	private String isdynamicallyscalable;
	public String getIsdynamicallyscalable() {
		return isdynamicallyscalable;
	}
	public void setIsdynamicallyscalable(String isdynamicallyscalable) {
		this.isdynamicallyscalable = isdynamicallyscalable;
	}
	private String isextractable;
	public String getIsextractable() {
		return isextractable;
	}
	public void setIsextractable(String isextractable) {
		this.isextractable = isextractable;
	}
	private String isfeatured;
	public String getIsfeatured() {
		return isfeatured;
	}
	public void setIsfeatured(String isfeatured) {
		this.isfeatured = isfeatured;
	}
	private String ispublic;
	public String getIspublic() {
		return ispublic;
	}
	public void setIspublic(String ispublic) {
		this.ispublic = ispublic;
	}
	private String isready;
	public String getIsready() {
		return isready;
	}
	public void setIsready(String isready) {
		this.isready = isready;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String ostypeid;
	public String getOstypeid() {
		return ostypeid;
	}
	public void setOstypeid(String ostypeid) {
		this.ostypeid = ostypeid;
	}
	private String ostypename;
	public String getOstypename() {
		return ostypename;
	}
	public void setOstypename(String ostypename) {
		this.ostypename = ostypename;
	}
	private String passwordenabled;
	public String getPasswordenabled() {
		return passwordenabled;
	}
	public void setPasswordenabled(String passwordenabled) {
		this.passwordenabled = passwordenabled;
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
	private String removed;
	public String getRemoved() {
		return removed;
	}
	public void setRemoved(String removed) {
		this.removed = removed;
	}
	private String size;
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	private String sourcetemplateid;
	public String getSourcetemplateid() {
		return sourcetemplateid;
	}
	public void setSourcetemplateid(String sourcetemplateid) {
		this.sourcetemplateid = sourcetemplateid;
	}
	private String sshkeyenabled;
	public String getSshkeyenabled() {
		return sshkeyenabled;
	}
	public void setSshkeyenabled(String sshkeyenabled) {
		this.sshkeyenabled = sshkeyenabled;
	}
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private String templatetag;
	public String getTemplatetag() {
		return templatetag;
	}
	public void setTemplatetag(String templatetag) {
		this.templatetag = templatetag;
	}
	private String templatetype;
	public String getTemplatetype() {
		return templatetype;
	}
	public void setTemplatetype(String templatetype) {
		this.templatetype = templatetype;
	}
	private String zoneid;
	public String getZoneid() {
		return zoneid;
	}
	public void setZoneid(String zoneid) {
		this.zoneid = zoneid;
	}
	private String zonename;
	public String getZonename() {
		return zonename;
	}
	public void setZonename(String zonename) {
		this.zonename = zonename;
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
