package com.fit2cloud.cloudstack.wsclient.model.response.address;

import com.fit2cloud.cloudstack.wsclient.domain.model.Tags;
import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListPublicIpAddressesResponse extends Response {
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
	private String allocated;
	public String getAllocated() {
		return allocated;
	}
	public void setAllocated(String allocated) {
		this.allocated = allocated;
	}
	private String associatednetworkid;
	public String getAssociatednetworkid() {
		return associatednetworkid;
	}
	public void setAssociatednetworkid(String associatednetworkid) {
		this.associatednetworkid = associatednetworkid;
	}
	private String associatednetworkname;
	public String getAssociatednetworkname() {
		return associatednetworkname;
	}
	public void setAssociatednetworkname(String associatednetworkname) {
		this.associatednetworkname = associatednetworkname;
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
	private String forvirtualnetwork;
	public String getForvirtualnetwork() {
		return forvirtualnetwork;
	}
	public void setForvirtualnetwork(String forvirtualnetwork) {
		this.forvirtualnetwork = forvirtualnetwork;
	}
	private String ipaddress;
	public String getIpaddress() {
		return ipaddress;
	}
	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}
	private String isportable;
	public String getIsportable() {
		return isportable;
	}
	public void setIsportable(String isportable) {
		this.isportable = isportable;
	}
	private String issourcenat;
	public String getIssourcenat() {
		return issourcenat;
	}
	public void setIssourcenat(String issourcenat) {
		this.issourcenat = issourcenat;
	}
	private String isstaticnat;
	public String getIsstaticnat() {
		return isstaticnat;
	}
	public void setIsstaticnat(String isstaticnat) {
		this.isstaticnat = isstaticnat;
	}
	private String issystem;
	public String getIssystem() {
		return issystem;
	}
	public void setIssystem(String issystem) {
		this.issystem = issystem;
	}
	private String networkid;
	public String getNetworkid() {
		return networkid;
	}
	public void setNetworkid(String networkid) {
		this.networkid = networkid;
	}
	private String physicalnetworkid;
	public String getPhysicalnetworkid() {
		return physicalnetworkid;
	}
	public void setPhysicalnetworkid(String physicalnetworkid) {
		this.physicalnetworkid = physicalnetworkid;
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
	private String purpose;
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private String virtualmachinedisplayname;
	public String getVirtualmachinedisplayname() {
		return virtualmachinedisplayname;
	}
	public void setVirtualmachinedisplayname(String virtualmachinedisplayname) {
		this.virtualmachinedisplayname = virtualmachinedisplayname;
	}
	private String virtualmachineid;
	public String getVirtualmachineid() {
		return virtualmachineid;
	}
	public void setVirtualmachineid(String virtualmachineid) {
		this.virtualmachineid = virtualmachineid;
	}
	private String virtualmachinename;
	public String getVirtualmachinename() {
		return virtualmachinename;
	}
	public void setVirtualmachinename(String virtualmachinename) {
		this.virtualmachinename = virtualmachinename;
	}
	private String vlanid;
	public String getVlanid() {
		return vlanid;
	}
	public void setVlanid(String vlanid) {
		this.vlanid = vlanid;
	}
	private String vlanname;
	public String getVlanname() {
		return vlanname;
	}
	public void setVlanname(String vlanname) {
		this.vlanname = vlanname;
	}
	private String vmipaddress;
	public String getVmipaddress() {
		return vmipaddress;
	}
	public void setVmipaddress(String vmipaddress) {
		this.vmipaddress = vmipaddress;
	}
	private String vpcid;
	public String getVpcid() {
		return vpcid;
	}
	public void setVpcid(String vpcid) {
		this.vpcid = vpcid;
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
