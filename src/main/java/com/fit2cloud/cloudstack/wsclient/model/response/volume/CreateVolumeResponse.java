package com.fit2cloud.cloudstack.wsclient.model.response.volume;

import com.fit2cloud.cloudstack.wsclient.domain.model.Tags;
import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class CreateVolumeResponse extends Response {
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
	private String attached;
	public String getAttached() {
		return attached;
	}
	public void setAttached(String attached) {
		this.attached = attached;
	}
	private String created;
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	private String destroyed;
	public String getDestroyed() {
		return destroyed;
	}
	public void setDestroyed(String destroyed) {
		this.destroyed = destroyed;
	}
	private String deviceid;
	public String getDeviceid() {
		return deviceid;
	}
	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
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
	private String diskofferingdisplaytext;
	public String getDiskofferingdisplaytext() {
		return diskofferingdisplaytext;
	}
	public void setDiskofferingdisplaytext(String diskofferingdisplaytext) {
		this.diskofferingdisplaytext = diskofferingdisplaytext;
	}
	private String diskofferingid;
	public String getDiskofferingid() {
		return diskofferingid;
	}
	public void setDiskofferingid(String diskofferingid) {
		this.diskofferingid = diskofferingid;
	}
	private String diskofferingname;
	public String getDiskofferingname() {
		return diskofferingname;
	}
	public void setDiskofferingname(String diskofferingname) {
		this.diskofferingname = diskofferingname;
	}
	private String displayvolume;
	public String getDisplayvolume() {
		return displayvolume;
	}
	public void setDisplayvolume(String displayvolume) {
		this.displayvolume = displayvolume;
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
	private String hypervisor;
	public String getHypervisor() {
		return hypervisor;
	}
	public void setHypervisor(String hypervisor) {
		this.hypervisor = hypervisor;
	}
	private String isextractable;
	public String getIsextractable() {
		return isextractable;
	}
	public void setIsextractable(String isextractable) {
		this.isextractable = isextractable;
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
	private String serviceofferingdisplaytext;
	public String getServiceofferingdisplaytext() {
		return serviceofferingdisplaytext;
	}
	public void setServiceofferingdisplaytext(String serviceofferingdisplaytext) {
		this.serviceofferingdisplaytext = serviceofferingdisplaytext;
	}
	private String serviceofferingid;
	public String getServiceofferingid() {
		return serviceofferingid;
	}
	public void setServiceofferingid(String serviceofferingid) {
		this.serviceofferingid = serviceofferingid;
	}
	private String serviceofferingname;
	public String getServiceofferingname() {
		return serviceofferingname;
	}
	public void setServiceofferingname(String serviceofferingname) {
		this.serviceofferingname = serviceofferingname;
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
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private String storage;
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	private String storagetype;
	public String getStoragetype() {
		return storagetype;
	}
	public void setStoragetype(String storagetype) {
		this.storagetype = storagetype;
	}
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private String virtualmachineid;
	public String getVirtualmachineid() {
		return virtualmachineid;
	}
	public void setVirtualmachineid(String virtualmachineid) {
		this.virtualmachineid = virtualmachineid;
	}
	private String vmdisplayname;
	public String getVmdisplayname() {
		return vmdisplayname;
	}
	public void setVmdisplayname(String vmdisplayname) {
		this.vmdisplayname = vmdisplayname;
	}
	private String vmname;
	public String getVmname() {
		return vmname;
	}
	public void setVmname(String vmname) {
		this.vmname = vmname;
	}
	private String vmstate;
	public String getVmstate() {
		return vmstate;
	}
	public void setVmstate(String vmstate) {
		this.vmstate = vmstate;
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
	private Tags tags;
	public Tags getTags() {
		return tags;
	}
	public void setTags(Tags tags) {
		this.tags = tags;
	}
	private String jobstatus;
	public String getJobstatus() {
		return jobstatus;
	}
	public void setJobstatus(String jobstatus) {
		this.jobstatus = jobstatus;
	}

}
