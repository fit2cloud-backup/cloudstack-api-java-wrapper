package com.fit2cloud.cloudstack.wsclient.domain.model;

import java.util.List;

public class ServiceOffering {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String cpunumber;
	public String getCpunumber() {
		return cpunumber;
	}
	public void setCpunumber(String cpunumber) {
		this.cpunumber = cpunumber;
	}
	private String cpuspeed;
	public String getCpuspeed() {
		return cpuspeed;
	}
	public void setCpuspeed(String cpuspeed) {
		this.cpuspeed = cpuspeed;
	}
	private String created;
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	private String defaultuse;
	public String getDefaultuse() {
		return defaultuse;
	}
	public void setDefaultuse(String defaultuse) {
		this.defaultuse = defaultuse;
	}
	private String deploymentplanner;
	public String getDeploymentplanner() {
		return deploymentplanner;
	}
	public void setDeploymentplanner(String deploymentplanner) {
		this.deploymentplanner = deploymentplanner;
	}
	private String diskBytesReadRate;
	public String getDiskBytesReadRate() {
		return diskBytesReadRate;
	}
	public void setDiskBytesReadRate(String diskBytesReadRate) {
		this.diskBytesReadRate = diskBytesReadRate;
	}
	private String diskBytesWriteRate;
	public String getDiskBytesWriteRate() {
		return diskBytesWriteRate;
	}
	public void setDiskBytesWriteRate(String diskBytesWriteRate) {
		this.diskBytesWriteRate = diskBytesWriteRate;
	}
	private String diskIopsReadRate;
	public String getDiskIopsReadRate() {
		return diskIopsReadRate;
	}
	public void setDiskIopsReadRate(String diskIopsReadRate) {
		this.diskIopsReadRate = diskIopsReadRate;
	}
	private String diskIopsWriteRate;
	public String getDiskIopsWriteRate() {
		return diskIopsWriteRate;
	}
	public void setDiskIopsWriteRate(String diskIopsWriteRate) {
		this.diskIopsWriteRate = diskIopsWriteRate;
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
	private String hosttags;
	public String getHosttags() {
		return hosttags;
	}
	public void setHosttags(String hosttags) {
		this.hosttags = hosttags;
	}
	private String issystem;
	public String getIssystem() {
		return issystem;
	}
	public void setIssystem(String issystem) {
		this.issystem = issystem;
	}
	private String isvolatile;
	public String getIsvolatile() {
		return isvolatile;
	}
	public void setIsvolatile(String isvolatile) {
		this.isvolatile = isvolatile;
	}
	private String limitcpuuse;
	public String getLimitcpuuse() {
		return limitcpuuse;
	}
	public void setLimitcpuuse(String limitcpuuse) {
		this.limitcpuuse = limitcpuuse;
	}
	private String memory;
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String networkrate;
	public String getNetworkrate() {
		return networkrate;
	}
	public void setNetworkrate(String networkrate) {
		this.networkrate = networkrate;
	}
	private String offerha;
	public String getOfferha() {
		return offerha;
	}
	public void setOfferha(String offerha) {
		this.offerha = offerha;
	}
	private String serviceofferingdetails;
	public String getServiceofferingdetails() {
		return serviceofferingdetails;
	}
	public void setServiceofferingdetails(String serviceofferingdetails) {
		this.serviceofferingdetails = serviceofferingdetails;
	}
	private String storagetype;
	public String getStoragetype() {
		return storagetype;
	}
	public void setStoragetype(String storagetype) {
		this.storagetype = storagetype;
	}
	private String systemvmtype;
	public String getSystemvmtype() {
		return systemvmtype;
	}
	public void setSystemvmtype(String systemvmtype) {
		this.systemvmtype = systemvmtype;
	}
	private List<Tags> tags;
	public List<Tags> getTags() {
		return tags;
	}
	public void setTags(List<Tags> tags) {
		this.tags = tags;
	}
}
