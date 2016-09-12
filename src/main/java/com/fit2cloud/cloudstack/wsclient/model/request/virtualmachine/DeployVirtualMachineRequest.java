package com.fit2cloud.cloudstack.wsclient.model.request.virtualmachine;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class DeployVirtualMachineRequest extends Request {
	private String serviceofferingid;
	public String getServiceofferingid() {
		return serviceofferingid;
	}
	public void setServiceofferingid(String serviceofferingid) {
		this.serviceofferingid = serviceofferingid;
	}
	private String templateid;
	public String getTemplateid() {
		return templateid;
	}
	public void setTemplateid(String templateid) {
		this.templateid = templateid;
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
	private String affinitygroupids;
	public String getAffinitygroupids() {
		return affinitygroupids;
	}
	public void setAffinitygroupids(String affinitygroupids) {
		this.affinitygroupids = affinitygroupids;
	}
	private String affinitygroupnames;
	public String getAffinitygroupnames() {
		return affinitygroupnames;
	}
	public void setAffinitygroupnames(String affinitygroupnames) {
		this.affinitygroupnames = affinitygroupnames;
	}
	private String diskofferingid;
	public String getDiskofferingid() {
		return diskofferingid;
	}
	public void setDiskofferingid(String diskofferingid) {
		this.diskofferingid = diskofferingid;
	}
	private String displayname;
	public String getDisplayname() {
		return displayname;
	}
	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}
	private String displayvm;
	public String getDisplayvm() {
		return displayvm;
	}
	public void setDisplayvm(String displayvm) {
		this.displayvm = displayvm;
	}
	private String domainid;
	public String getDomainid() {
		return domainid;
	}
	public void setDomainid(String domainid) {
		this.domainid = domainid;
	}
	private String group;
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	private String hostid;
	public String getHostid() {
		return hostid;
	}
	public void setHostid(String hostid) {
		this.hostid = hostid;
	}
	private String hypervisor;
	public String getHypervisor() {
		return hypervisor;
	}
	public void setHypervisor(String hypervisor) {
		this.hypervisor = hypervisor;
	}
	private String ip6address;
	public String getIp6address() {
		return ip6address;
	}
	public void setIp6address(String ip6address) {
		this.ip6address = ip6address;
	}
	private String ipaddress;
	public String getIpaddress() {
		return ipaddress;
	}
	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}
	private String iptonetworklist;
	public String getIptonetworklist() {
		return iptonetworklist;
	}
	public void setIptonetworklist(String iptonetworklist) {
		this.iptonetworklist = iptonetworklist;
	}
	private String keyboard;
	public String getKeyboard() {
		return keyboard;
	}
	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	private String keypair;
	public String getKeypair() {
		return keypair;
	}
	public void setKeypair(String keypair) {
		this.keypair = keypair;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String networkids;
	public String getNetworkids() {
		return networkids;
	}
	public void setNetworkids(String networkids) {
		this.networkids = networkids;
	}
	private String projectid;
	public String getProjectid() {
		return projectid;
	}
	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}
	private String securitygroupids;
	public String getSecuritygroupids() {
		return securitygroupids;
	}
	public void setSecuritygroupids(String securitygroupids) {
		this.securitygroupids = securitygroupids;
	}
	private String securitygroupnames;
	public String getSecuritygroupnames() {
		return securitygroupnames;
	}
	public void setSecuritygroupnames(String securitygroupnames) {
		this.securitygroupnames = securitygroupnames;
	}
	private String size;
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	private String startvm;
	public String getStartvm() {
		return startvm;
	}
	public void setStartvm(String startvm) {
		this.startvm = startvm;
	}
	private String userdata;
	public String getUserdata() {
		return userdata;
	}
	public void setUserdata(String userdata) {
		this.userdata = userdata;
	}

}
