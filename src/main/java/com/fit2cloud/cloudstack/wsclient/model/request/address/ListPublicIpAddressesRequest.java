package com.fit2cloud.cloudstack.wsclient.model.request.address;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class ListPublicIpAddressesRequest extends Request {
	private String account;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	private String allocatedonly;
	public String getAllocatedonly() {
		return allocatedonly;
	}
	public void setAllocatedonly(String allocatedonly) {
		this.allocatedonly = allocatedonly;
	}
	private String associatednetworkid;
	public String getAssociatednetworkid() {
		return associatednetworkid;
	}
	public void setAssociatednetworkid(String associatednetworkid) {
		this.associatednetworkid = associatednetworkid;
	}
	private String domainid;
	public String getDomainid() {
		return domainid;
	}
	public void setDomainid(String domainid) {
		this.domainid = domainid;
	}
	private String forloadbalancing;
	public String getForloadbalancing() {
		return forloadbalancing;
	}
	public void setForloadbalancing(String forloadbalancing) {
		this.forloadbalancing = forloadbalancing;
	}
	private String forvirtualnetwork;
	public String getForvirtualnetwork() {
		return forvirtualnetwork;
	}
	public void setForvirtualnetwork(String forvirtualnetwork) {
		this.forvirtualnetwork = forvirtualnetwork;
	}
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String ipaddress;
	public String getIpaddress() {
		return ipaddress;
	}
	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}
	private String isrecursive;
	public String getIsrecursive() {
		return isrecursive;
	}
	public void setIsrecursive(String isrecursive) {
		this.isrecursive = isrecursive;
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
	private String keyword;
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	private String listall;
	public String getListall() {
		return listall;
	}
	public void setListall(String listall) {
		this.listall = listall;
	}
	private String page;
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	private String pagesize;
	public String getPagesize() {
		return pagesize;
	}
	public void setPagesize(String pagesize) {
		this.pagesize = pagesize;
	}
	private String physicalnetworkid;
	public String getPhysicalnetworkid() {
		return physicalnetworkid;
	}
	public void setPhysicalnetworkid(String physicalnetworkid) {
		this.physicalnetworkid = physicalnetworkid;
	}
	private String projectid;
	public String getProjectid() {
		return projectid;
	}
	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}
	private String tags;
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	private String vlanid;
	public String getVlanid() {
		return vlanid;
	}
	public void setVlanid(String vlanid) {
		this.vlanid = vlanid;
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

}
