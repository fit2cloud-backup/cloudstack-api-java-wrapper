package com.fit2cloud.cloudstack.wsclient.domain.model;

import java.util.List;

public class Network {
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
	private String broadcastdomaintype;
	public String getBroadcastdomaintype() {
		return broadcastdomaintype;
	}
	public void setBroadcastdomaintype(String broadcastdomaintype) {
		this.broadcastdomaintype = broadcastdomaintype;
	}
	private String broadcasturi;
	public String getBroadcasturi() {
		return broadcasturi;
	}
	public void setBroadcasturi(String broadcasturi) {
		this.broadcasturi = broadcasturi;
	}
	private String canusefordeploy;
	public String getCanusefordeploy() {
		return canusefordeploy;
	}
	public void setCanusefordeploy(String canusefordeploy) {
		this.canusefordeploy = canusefordeploy;
	}
	private String cidr;
	public String getCidr() {
		return cidr;
	}
	public void setCidr(String cidr) {
		this.cidr = cidr;
	}
	private String displaynetwork;
	public String getDisplaynetwork() {
		return displaynetwork;
	}
	public void setDisplaynetwork(String displaynetwork) {
		this.displaynetwork = displaynetwork;
	}
	private String displaytext;
	public String getDisplaytext() {
		return displaytext;
	}
	public void setDisplaytext(String displaytext) {
		this.displaytext = displaytext;
	}
	private String dns1;
	public String getDns1() {
		return dns1;
	}
	public void setDns1(String dns1) {
		this.dns1 = dns1;
	}
	private String dns2;
	public String getDns2() {
		return dns2;
	}
	public void setDns2(String dns2) {
		this.dns2 = dns2;
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
	private String isdefault;
	public String getIsdefault() {
		return isdefault;
	}
	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}
	private String ispersistent;
	public String getIspersistent() {
		return ispersistent;
	}
	public void setIspersistent(String ispersistent) {
		this.ispersistent = ispersistent;
	}
	private String issystem;
	public String getIssystem() {
		return issystem;
	}
	public void setIssystem(String issystem) {
		this.issystem = issystem;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String netmask;
	public String getNetmask() {
		return netmask;
	}
	public void setNetmask(String netmask) {
		this.netmask = netmask;
	}
	private String networkcidr;
	public String getNetworkcidr() {
		return networkcidr;
	}
	public void setNetworkcidr(String networkcidr) {
		this.networkcidr = networkcidr;
	}
	private String networkdomain;
	public String getNetworkdomain() {
		return networkdomain;
	}
	public void setNetworkdomain(String networkdomain) {
		this.networkdomain = networkdomain;
	}
	private String networkofferingavailability;
	public String getNetworkofferingavailability() {
		return networkofferingavailability;
	}
	public void setNetworkofferingavailability(String networkofferingavailability) {
		this.networkofferingavailability = networkofferingavailability;
	}
	private String networkofferingconservemode;
	public String getNetworkofferingconservemode() {
		return networkofferingconservemode;
	}
	public void setNetworkofferingconservemode(String networkofferingconservemode) {
		this.networkofferingconservemode = networkofferingconservemode;
	}
	private String networkofferingdisplaytext;
	public String getNetworkofferingdisplaytext() {
		return networkofferingdisplaytext;
	}
	public void setNetworkofferingdisplaytext(String networkofferingdisplaytext) {
		this.networkofferingdisplaytext = networkofferingdisplaytext;
	}
	private String networkofferingid;
	public String getNetworkofferingid() {
		return networkofferingid;
	}
	public void setNetworkofferingid(String networkofferingid) {
		this.networkofferingid = networkofferingid;
	}
	private String networkofferingname;
	public String getNetworkofferingname() {
		return networkofferingname;
	}
	public void setNetworkofferingname(String networkofferingname) {
		this.networkofferingname = networkofferingname;
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
	private String related;
	public String getRelated() {
		return related;
	}
	public void setRelated(String related) {
		this.related = related;
	}
	private String reservediprange;
	public String getReservediprange() {
		return reservediprange;
	}
	public void setReservediprange(String reservediprange) {
		this.reservediprange = reservediprange;
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
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private String subdomainaccess;
	public String getSubdomainaccess() {
		return subdomainaccess;
	}
	public void setSubdomainaccess(String subdomainaccess) {
		this.subdomainaccess = subdomainaccess;
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
	private List<Service> service;
	public List<Service> getService() {
		return service;
	}
	public void setService(List<Service> service) {
		this.service = service;
	}
	private List<Provider> provider;
	public List<Provider> getProvider() {
		return provider;
	}
	public void setProvider(List<Provider> provider) {
		this.provider = provider;
	}
	private List<Tags> tags;
	public List<Tags> getTags() {
		return tags;
	}
	public void setTags(List<Tags> tags) {
		this.tags = tags;
	}
}