package com.fit2cloud.cloudstack.wsclient.model.request.network;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class CreateNetworkRequest extends Request {
	private String displaytext;
	public String getDisplaytext() {
		return displaytext;
	}
	public void setDisplaytext(String displaytext) {
		this.displaytext = displaytext;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String networkofferingid;
	public String getNetworkofferingid() {
		return networkofferingid;
	}
	public void setNetworkofferingid(String networkofferingid) {
		this.networkofferingid = networkofferingid;
	}
	private String zoneid;
	public String getZoneid() {
		return zoneid;
	}
	public void setZoneid(String zoneid) {
		this.zoneid = zoneid;
	}
	private String account;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	private String aclid;
	public String getAclid() {
		return aclid;
	}
	public void setAclid(String aclid) {
		this.aclid = aclid;
	}
	private String acltype;
	public String getAcltype() {
		return acltype;
	}
	public void setAcltype(String acltype) {
		this.acltype = acltype;
	}
	private String displaynetwork;
	public String getDisplaynetwork() {
		return displaynetwork;
	}
	public void setDisplaynetwork(String displaynetwork) {
		this.displaynetwork = displaynetwork;
	}
	private String domainid;
	public String getDomainid() {
		return domainid;
	}
	public void setDomainid(String domainid) {
		this.domainid = domainid;
	}
	private String endip;
	public String getEndip() {
		return endip;
	}
	public void setEndip(String endip) {
		this.endip = endip;
	}
	private String endipv6;
	public String getEndipv6() {
		return endipv6;
	}
	public void setEndipv6(String endipv6) {
		this.endipv6 = endipv6;
	}
	private String gateway;
	public String getGateway() {
		return gateway;
	}
	public void setGateway(String gateway) {
		this.gateway = gateway;
	}
	private String ip6cidr;
	public String getIp6cidr() {
		return ip6cidr;
	}
	public void setIp6cidr(String ip6cidr) {
		this.ip6cidr = ip6cidr;
	}
	private String ip6gateway;
	public String getIp6gateway() {
		return ip6gateway;
	}
	public void setIp6gateway(String ip6gateway) {
		this.ip6gateway = ip6gateway;
	}
	private String isolatedpvlan;
	public String getIsolatedpvlan() {
		return isolatedpvlan;
	}
	public void setIsolatedpvlan(String isolatedpvlan) {
		this.isolatedpvlan = isolatedpvlan;
	}
	private String netmask;
	public String getNetmask() {
		return netmask;
	}
	public void setNetmask(String netmask) {
		this.netmask = netmask;
	}
	private String networkdomain;
	public String getNetworkdomain() {
		return networkdomain;
	}
	public void setNetworkdomain(String networkdomain) {
		this.networkdomain = networkdomain;
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
	private String startip;
	public String getStartip() {
		return startip;
	}
	public void setStartip(String startip) {
		this.startip = startip;
	}
	private String startipv6;
	public String getStartipv6() {
		return startipv6;
	}
	public void setStartipv6(String startipv6) {
		this.startipv6 = startipv6;
	}
	private String subdomainaccess;
	public String getSubdomainaccess() {
		return subdomainaccess;
	}
	public void setSubdomainaccess(String subdomainaccess) {
		this.subdomainaccess = subdomainaccess;
	}
	private String vlan;
	public String getVlan() {
		return vlan;
	}
	public void setVlan(String vlan) {
		this.vlan = vlan;
	}
	private String vpcid;
	public String getVpcid() {
		return vpcid;
	}
	public void setVpcid(String vpcid) {
		this.vpcid = vpcid;
	}

}
