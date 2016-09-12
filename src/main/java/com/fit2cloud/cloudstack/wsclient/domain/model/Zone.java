package com.fit2cloud.cloudstack.wsclient.domain.model;

public class Zone {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String affinitygroupid;
	public String getAffinitygroupid() {
		return affinitygroupid;
	}
	public void setAffinitygroupid(String affinitygroupid) {
		this.affinitygroupid = affinitygroupid;
	}
	private String allocationstate;
	public String getAllocationstate() {
		return allocationstate;
	}
	public void setAllocationstate(String allocationstate) {
		this.allocationstate = allocationstate;
	}
	private String description;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private String dhcpprovider;
	public String getDhcpprovider() {
		return dhcpprovider;
	}
	public void setDhcpprovider(String dhcpprovider) {
		this.dhcpprovider = dhcpprovider;
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
	private String domainname;
	public String getDomainname() {
		return domainname;
	}
	public void setDomainname(String domainname) {
		this.domainname = domainname;
	}
	private String guestcidraddress;
	public String getGuestcidraddress() {
		return guestcidraddress;
	}
	public void setGuestcidraddress(String guestcidraddress) {
		this.guestcidraddress = guestcidraddress;
	}
	private String internaldns1;
	public String getInternaldns1() {
		return internaldns1;
	}
	public void setInternaldns1(String internaldns1) {
		this.internaldns1 = internaldns1;
	}
	private String internaldns2;
	public String getInternaldns2() {
		return internaldns2;
	}
	public void setInternaldns2(String internaldns2) {
		this.internaldns2 = internaldns2;
	}
	private String ip6dns1;
	public String getIp6dns1() {
		return ip6dns1;
	}
	public void setIp6dns1(String ip6dns1) {
		this.ip6dns1 = ip6dns1;
	}
	private String ip6dns2;
	public String getIp6dns2() {
		return ip6dns2;
	}
	public void setIp6dns2(String ip6dns2) {
		this.ip6dns2 = ip6dns2;
	}
	private String localstorageenabled;
	public String getLocalstorageenabled() {
		return localstorageenabled;
	}
	public void setLocalstorageenabled(String localstorageenabled) {
		this.localstorageenabled = localstorageenabled;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String networktype;
	public String getNetworktype() {
		return networktype;
	}
	public void setNetworktype(String networktype) {
		this.networktype = networktype;
	}
	private String securitygroupsenabled;
	public String getSecuritygroupsenabled() {
		return securitygroupsenabled;
	}
	public void setSecuritygroupsenabled(String securitygroupsenabled) {
		this.securitygroupsenabled = securitygroupsenabled;
	}
	private String vlan;
	public String getVlan() {
		return vlan;
	}
	public void setVlan(String vlan) {
		this.vlan = vlan;
	}
	private String zonetoken;
	public String getZonetoken() {
		return zonetoken;
	}
	public void setZonetoken(String zonetoken) {
		this.zonetoken = zonetoken;
	}
	private Capacity capacity;
	public Capacity getCapacity() {
		return capacity;
	}
	public void setCapacity(Capacity capacity) {
		this.capacity = capacity;
	}
}
