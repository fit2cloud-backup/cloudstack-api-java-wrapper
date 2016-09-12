package com.fit2cloud.cloudstack.wsclient.domain.model;

import java.util.List;
import java.util.Map;

public class Template {
	private String id;
	private String account;
	private String accountid;
	private String bootable;
	private String checksum;
	private String created;
	private String crossZones;
	private Map<String, String> details;
	private String displaytext;
	private String domain;
	private String domainid;
	private String format;
	private String hostid;
	private String hostname;
	private String hypervisor;
	private String isdynamicallyscalable;
	private String isextractable;
	private String isfeatured;
	private String ispublic;
	private String isready;
	private String name;
	private String ostypeid;
	private String ostypename;
	private String passwordenabled;
	private String project;
	private String projectid;
	private String removed;
	private String size;
	private String sourcetemplateid;
	private String sshkeyenabled;
	private String status;
	private String templatetag;
	private String templatetype;
	private String zoneid;
	private String zonename;
	private List<Tags> tags;
	private String jobid;
	private String jobstatus;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getAccountid() {
		return accountid;
	}
	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}
	public String getBootable() {
		return bootable;
	}
	public void setBootable(String bootable) {
		this.bootable = bootable;
	}
	public String getChecksum() {
		return checksum;
	}
	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getCrossZones() {
		return crossZones;
	}
	public void setCrossZones(String crossZones) {
		this.crossZones = crossZones;
	}
	public String getDisplaytext() {
		return displaytext;
	}
	public void setDisplaytext(String displaytext) {
		this.displaytext = displaytext;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getDomainid() {
		return domainid;
	}
	public void setDomainid(String domainid) {
		this.domainid = domainid;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getHostid() {
		return hostid;
	}
	public void setHostid(String hostid) {
		this.hostid = hostid;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getHypervisor() {
		return hypervisor;
	}
	public void setHypervisor(String hypervisor) {
		this.hypervisor = hypervisor;
	}
	public String getIsdynamicallyscalable() {
		return isdynamicallyscalable;
	}
	public void setIsdynamicallyscalable(String isdynamicallyscalable) {
		this.isdynamicallyscalable = isdynamicallyscalable;
	}
	public String getIsextractable() {
		return isextractable;
	}
	public void setIsextractable(String isextractable) {
		this.isextractable = isextractable;
	}
	public String getIsfeatured() {
		return isfeatured;
	}
	public void setIsfeatured(String isfeatured) {
		this.isfeatured = isfeatured;
	}
	public String getIspublic() {
		return ispublic;
	}
	public void setIspublic(String ispublic) {
		this.ispublic = ispublic;
	}
	public String getIsready() {
		return isready;
	}
	public void setIsready(String isready) {
		this.isready = isready;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOstypeid() {
		return ostypeid;
	}
	public void setOstypeid(String ostypeid) {
		this.ostypeid = ostypeid;
	}
	public String getOstypename() {
		return ostypename;
	}
	public void setOstypename(String ostypename) {
		this.ostypename = ostypename;
	}
	public String getPasswordenabled() {
		return passwordenabled;
	}
	public void setPasswordenabled(String passwordenabled) {
		this.passwordenabled = passwordenabled;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getProjectid() {
		return projectid;
	}
	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}
	public String getRemoved() {
		return removed;
	}
	public void setRemoved(String removed) {
		this.removed = removed;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getSourcetemplateid() {
		return sourcetemplateid;
	}
	public void setSourcetemplateid(String sourcetemplateid) {
		this.sourcetemplateid = sourcetemplateid;
	}
	public String getSshkeyenabled() {
		return sshkeyenabled;
	}
	public void setSshkeyenabled(String sshkeyenabled) {
		this.sshkeyenabled = sshkeyenabled;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTemplatetag() {
		return templatetag;
	}
	public void setTemplatetag(String templatetag) {
		this.templatetag = templatetag;
	}
	public String getTemplatetype() {
		return templatetype;
	}
	public void setTemplatetype(String templatetype) {
		this.templatetype = templatetype;
	}
	public String getZoneid() {
		return zoneid;
	}
	public void setZoneid(String zoneid) {
		this.zoneid = zoneid;
	}
	public String getZonename() {
		return zonename;
	}
	public void setZonename(String zonename) {
		this.zonename = zonename;
	}
	public String getJobid() {
		return jobid;
	}
	public void setJobid(String jobid) {
		this.jobid = jobid;
	}
	public String getJobstatus() {
		return jobstatus;
	}
	public void setJobstatus(String jobstatus) {
		this.jobstatus = jobstatus;
	}
	public Map<String, String> getDetails() {
		return details;
	}
	public void setDetails(Map<String, String> details) {
		this.details = details;
	}
	public List<Tags> getTags() {
		return tags;
	}
	public void setTags(List<Tags> tags) {
		this.tags = tags;
	}
}
