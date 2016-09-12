package com.fit2cloud.cloudstack.wsclient.model.response.account;

import com.fit2cloud.cloudstack.wsclient.domain.model.User;
import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListAccountsResponse extends Response {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String accountdetails;
	public String getAccountdetails() {
		return accountdetails;
	}
	public void setAccountdetails(String accountdetails) {
		this.accountdetails = accountdetails;
	}
	private String accounttype;
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	private String cpuavailable;
	public String getCpuavailable() {
		return cpuavailable;
	}
	public void setCpuavailable(String cpuavailable) {
		this.cpuavailable = cpuavailable;
	}
	private String cpulimit;
	public String getCpulimit() {
		return cpulimit;
	}
	public void setCpulimit(String cpulimit) {
		this.cpulimit = cpulimit;
	}
	private String cputotal;
	public String getCputotal() {
		return cputotal;
	}
	public void setCputotal(String cputotal) {
		this.cputotal = cputotal;
	}
	private String defaultzoneid;
	public String getDefaultzoneid() {
		return defaultzoneid;
	}
	public void setDefaultzoneid(String defaultzoneid) {
		this.defaultzoneid = defaultzoneid;
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
	private String ipavailable;
	public String getIpavailable() {
		return ipavailable;
	}
	public void setIpavailable(String ipavailable) {
		this.ipavailable = ipavailable;
	}
	private String iplimit;
	public String getIplimit() {
		return iplimit;
	}
	public void setIplimit(String iplimit) {
		this.iplimit = iplimit;
	}
	private String iptotal;
	public String getIptotal() {
		return iptotal;
	}
	public void setIptotal(String iptotal) {
		this.iptotal = iptotal;
	}
	private String iscleanuprequired;
	public String getIscleanuprequired() {
		return iscleanuprequired;
	}
	public void setIscleanuprequired(String iscleanuprequired) {
		this.iscleanuprequired = iscleanuprequired;
	}
	private String isdefault;
	public String getIsdefault() {
		return isdefault;
	}
	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}
	private String memoryavailable;
	public String getMemoryavailable() {
		return memoryavailable;
	}
	public void setMemoryavailable(String memoryavailable) {
		this.memoryavailable = memoryavailable;
	}
	private String memorylimit;
	public String getMemorylimit() {
		return memorylimit;
	}
	public void setMemorylimit(String memorylimit) {
		this.memorylimit = memorylimit;
	}
	private String memorytotal;
	public String getMemorytotal() {
		return memorytotal;
	}
	public void setMemorytotal(String memorytotal) {
		this.memorytotal = memorytotal;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String networkavailable;
	public String getNetworkavailable() {
		return networkavailable;
	}
	public void setNetworkavailable(String networkavailable) {
		this.networkavailable = networkavailable;
	}
	private String networkdomain;
	public String getNetworkdomain() {
		return networkdomain;
	}
	public void setNetworkdomain(String networkdomain) {
		this.networkdomain = networkdomain;
	}
	private String networklimit;
	public String getNetworklimit() {
		return networklimit;
	}
	public void setNetworklimit(String networklimit) {
		this.networklimit = networklimit;
	}
	private String networktotal;
	public String getNetworktotal() {
		return networktotal;
	}
	public void setNetworktotal(String networktotal) {
		this.networktotal = networktotal;
	}
	private String primarystorageavailable;
	public String getPrimarystorageavailable() {
		return primarystorageavailable;
	}
	public void setPrimarystorageavailable(String primarystorageavailable) {
		this.primarystorageavailable = primarystorageavailable;
	}
	private String primarystoragelimit;
	public String getPrimarystoragelimit() {
		return primarystoragelimit;
	}
	public void setPrimarystoragelimit(String primarystoragelimit) {
		this.primarystoragelimit = primarystoragelimit;
	}
	private String primarystoragetotal;
	public String getPrimarystoragetotal() {
		return primarystoragetotal;
	}
	public void setPrimarystoragetotal(String primarystoragetotal) {
		this.primarystoragetotal = primarystoragetotal;
	}
	private String projectavailable;
	public String getProjectavailable() {
		return projectavailable;
	}
	public void setProjectavailable(String projectavailable) {
		this.projectavailable = projectavailable;
	}
	private String projectlimit;
	public String getProjectlimit() {
		return projectlimit;
	}
	public void setProjectlimit(String projectlimit) {
		this.projectlimit = projectlimit;
	}
	private String projecttotal;
	public String getProjecttotal() {
		return projecttotal;
	}
	public void setProjecttotal(String projecttotal) {
		this.projecttotal = projecttotal;
	}
	private String receivedbytes;
	public String getReceivedbytes() {
		return receivedbytes;
	}
	public void setReceivedbytes(String receivedbytes) {
		this.receivedbytes = receivedbytes;
	}
	private String secondarystorageavailable;
	public String getSecondarystorageavailable() {
		return secondarystorageavailable;
	}
	public void setSecondarystorageavailable(String secondarystorageavailable) {
		this.secondarystorageavailable = secondarystorageavailable;
	}
	private String secondarystoragelimit;
	public String getSecondarystoragelimit() {
		return secondarystoragelimit;
	}
	public void setSecondarystoragelimit(String secondarystoragelimit) {
		this.secondarystoragelimit = secondarystoragelimit;
	}
	private String secondarystoragetotal;
	public String getSecondarystoragetotal() {
		return secondarystoragetotal;
	}
	public void setSecondarystoragetotal(String secondarystoragetotal) {
		this.secondarystoragetotal = secondarystoragetotal;
	}
	private String sentbytes;
	public String getSentbytes() {
		return sentbytes;
	}
	public void setSentbytes(String sentbytes) {
		this.sentbytes = sentbytes;
	}
	private String snapshotavailable;
	public String getSnapshotavailable() {
		return snapshotavailable;
	}
	public void setSnapshotavailable(String snapshotavailable) {
		this.snapshotavailable = snapshotavailable;
	}
	private String snapshotlimit;
	public String getSnapshotlimit() {
		return snapshotlimit;
	}
	public void setSnapshotlimit(String snapshotlimit) {
		this.snapshotlimit = snapshotlimit;
	}
	private String snapshottotal;
	public String getSnapshottotal() {
		return snapshottotal;
	}
	public void setSnapshottotal(String snapshottotal) {
		this.snapshottotal = snapshottotal;
	}
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private String templateavailable;
	public String getTemplateavailable() {
		return templateavailable;
	}
	public void setTemplateavailable(String templateavailable) {
		this.templateavailable = templateavailable;
	}
	private String templatelimit;
	public String getTemplatelimit() {
		return templatelimit;
	}
	public void setTemplatelimit(String templatelimit) {
		this.templatelimit = templatelimit;
	}
	private String templatetotal;
	public String getTemplatetotal() {
		return templatetotal;
	}
	public void setTemplatetotal(String templatetotal) {
		this.templatetotal = templatetotal;
	}
	private String vmavailable;
	public String getVmavailable() {
		return vmavailable;
	}
	public void setVmavailable(String vmavailable) {
		this.vmavailable = vmavailable;
	}
	private String vmlimit;
	public String getVmlimit() {
		return vmlimit;
	}
	public void setVmlimit(String vmlimit) {
		this.vmlimit = vmlimit;
	}
	private String vmrunning;
	public String getVmrunning() {
		return vmrunning;
	}
	public void setVmrunning(String vmrunning) {
		this.vmrunning = vmrunning;
	}
	private String vmstopped;
	public String getVmstopped() {
		return vmstopped;
	}
	public void setVmstopped(String vmstopped) {
		this.vmstopped = vmstopped;
	}
	private String vmtotal;
	public String getVmtotal() {
		return vmtotal;
	}
	public void setVmtotal(String vmtotal) {
		this.vmtotal = vmtotal;
	}
	private String volumeavailable;
	public String getVolumeavailable() {
		return volumeavailable;
	}
	public void setVolumeavailable(String volumeavailable) {
		this.volumeavailable = volumeavailable;
	}
	private String volumelimit;
	public String getVolumelimit() {
		return volumelimit;
	}
	public void setVolumelimit(String volumelimit) {
		this.volumelimit = volumelimit;
	}
	private String volumetotal;
	public String getVolumetotal() {
		return volumetotal;
	}
	public void setVolumetotal(String volumetotal) {
		this.volumetotal = volumetotal;
	}
	private String vpcavailable;
	public String getVpcavailable() {
		return vpcavailable;
	}
	public void setVpcavailable(String vpcavailable) {
		this.vpcavailable = vpcavailable;
	}
	private String vpclimit;
	public String getVpclimit() {
		return vpclimit;
	}
	public void setVpclimit(String vpclimit) {
		this.vpclimit = vpclimit;
	}
	private String vpctotal;
	public String getVpctotal() {
		return vpctotal;
	}
	public void setVpctotal(String vpctotal) {
		this.vpctotal = vpctotal;
	}
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

}
