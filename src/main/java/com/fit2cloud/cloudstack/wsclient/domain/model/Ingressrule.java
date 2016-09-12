package com.fit2cloud.cloudstack.wsclient.domain.model;
public class Ingressrule {
	private String account;
	private String cidr;
	private String endport;
	private String icmpcode;
	private String icmptype;
	private String protocol;
	private String ruleid;
	private String securitygroupname;
	private String startport;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getCidr() {
		return cidr;
	}
	public void setCidr(String cidr) {
		this.cidr = cidr;
	}
	public String getEndport() {
		return endport;
	}
	public void setEndport(String endport) {
		this.endport = endport;
	}
	public String getIcmpcode() {
		return icmpcode;
	}
	public void setIcmpcode(String icmpcode) {
		this.icmpcode = icmpcode;
	}
	public String getIcmptype() {
		return icmptype;
	}
	public void setIcmptype(String icmptype) {
		this.icmptype = icmptype;
	}
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public String getRuleid() {
		return ruleid;
	}
	public void setRuleid(String ruleid) {
		this.ruleid = ruleid;
	}
	public String getSecuritygroupname() {
		return securitygroupname;
	}
	public void setSecuritygroupname(String securitygroupname) {
		this.securitygroupname = securitygroupname;
	}
	public String getStartport() {
		return startport;
	}
	public void setStartport(String startport) {
		this.startport = startport;
	}
}