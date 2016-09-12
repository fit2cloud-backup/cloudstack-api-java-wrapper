package com.fit2cloud.cloudstack.wsclient.model.request.network;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class ListNetworksRequest extends Request {
	private String account;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	private String acltype;
	public String getAcltype() {
		return acltype;
	}
	public void setAcltype(String acltype) {
		this.acltype = acltype;
	}
	private String canusefordeploy;
	public String getCanusefordeploy() {
		return canusefordeploy;
	}
	public void setCanusefordeploy(String canusefordeploy) {
		this.canusefordeploy = canusefordeploy;
	}
	private String domainid;
	public String getDomainid() {
		return domainid;
	}
	public void setDomainid(String domainid) {
		this.domainid = domainid;
	}
	private String forvpc;
	public String getForvpc() {
		return forvpc;
	}
	public void setForvpc(String forvpc) {
		this.forvpc = forvpc;
	}
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String isrecursive;
	public String getIsrecursive() {
		return isrecursive;
	}
	public void setIsrecursive(String isrecursive) {
		this.isrecursive = isrecursive;
	}
	private String issystem;
	public String getIssystem() {
		return issystem;
	}
	public void setIssystem(String issystem) {
		this.issystem = issystem;
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
	private String restartrequired;
	public String getRestartrequired() {
		return restartrequired;
	}
	public void setRestartrequired(String restartrequired) {
		this.restartrequired = restartrequired;
	}
	private String specifyipranges;
	public String getSpecifyipranges() {
		return specifyipranges;
	}
	public void setSpecifyipranges(String specifyipranges) {
		this.specifyipranges = specifyipranges;
	}
	private String supportedservices;
	public String getSupportedservices() {
		return supportedservices;
	}
	public void setSupportedservices(String supportedservices) {
		this.supportedservices = supportedservices;
	}
	private String tags;
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	private String traffictype;
	public String getTraffictype() {
		return traffictype;
	}
	public void setTraffictype(String traffictype) {
		this.traffictype = traffictype;
	}
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
