package com.fit2cloud.cloudstack.wsclient.model.request.volume;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class CreateVolumeRequest extends Request {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String account;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	private String diskofferingid;
	public String getDiskofferingid() {
		return diskofferingid;
	}
	public void setDiskofferingid(String diskofferingid) {
		this.diskofferingid = diskofferingid;
	}
	private String displayvolume;
	public String getDisplayvolume() {
		return displayvolume;
	}
	public void setDisplayvolume(String displayvolume) {
		this.displayvolume = displayvolume;
	}
	private String domainid;
	public String getDomainid() {
		return domainid;
	}
	public void setDomainid(String domainid) {
		this.domainid = domainid;
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
	private String projectid;
	public String getProjectid() {
		return projectid;
	}
	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}
	private String size;
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	private String snapshotid;
	public String getSnapshotid() {
		return snapshotid;
	}
	public void setSnapshotid(String snapshotid) {
		this.snapshotid = snapshotid;
	}
	private String zoneid;
	public String getZoneid() {
		return zoneid;
	}
	public void setZoneid(String zoneid) {
		this.zoneid = zoneid;
	}

}
