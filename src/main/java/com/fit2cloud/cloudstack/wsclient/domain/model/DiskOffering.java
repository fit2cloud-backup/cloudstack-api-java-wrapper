package com.fit2cloud.cloudstack.wsclient.domain.model;

import java.util.List;

public class DiskOffering {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String created;
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
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
	private String disksize;
	public String getDisksize() {
		return disksize;
	}
	public void setDisksize(String disksize) {
		this.disksize = disksize;
	}
	private String displayoffering;
	public String getDisplayoffering() {
		return displayoffering;
	}
	public void setDisplayoffering(String displayoffering) {
		this.displayoffering = displayoffering;
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
	private String iscustomized;
	public String getIscustomized() {
		return iscustomized;
	}
	public void setIscustomized(String iscustomized) {
		this.iscustomized = iscustomized;
	}
	private String iscustomizediops;
	public String getIscustomizediops() {
		return iscustomizediops;
	}
	public void setIscustomizediops(String iscustomizediops) {
		this.iscustomizediops = iscustomizediops;
	}
	private String maxiops;
	public String getMaxiops() {
		return maxiops;
	}
	public void setMaxiops(String maxiops) {
		this.maxiops = maxiops;
	}
	private String miniops;
	public String getMiniops() {
		return miniops;
	}
	public void setMiniops(String miniops) {
		this.miniops = miniops;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String storagetype;
	public String getStoragetype() {
		return storagetype;
	}
	public void setStoragetype(String storagetype) {
		this.storagetype = storagetype;
	}
	private List<Tags> tags;
	public List<Tags> getTags() {
		return tags;
	}
	public void setTags(List<Tags> tags) {
		this.tags = tags;
	}
}
