package com.fit2cloud.cloudstack.wsclient.model.response.virtualmachine;

import com.fit2cloud.cloudstack.wsclient.domain.model.Affinitygroup;
import com.fit2cloud.cloudstack.wsclient.domain.model.Nic;
import com.fit2cloud.cloudstack.wsclient.domain.model.Securitygroup;
import com.fit2cloud.cloudstack.wsclient.domain.model.Tags;
import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class UpdateVirtualMachineResponse extends Response {
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
	private String cpuused;
	public String getCpuused() {
		return cpuused;
	}
	public void setCpuused(String cpuused) {
		this.cpuused = cpuused;
	}
	private String created;
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	private String diskioread;
	public String getDiskioread() {
		return diskioread;
	}
	public void setDiskioread(String diskioread) {
		this.diskioread = diskioread;
	}
	private String diskiowrite;
	public String getDiskiowrite() {
		return diskiowrite;
	}
	public void setDiskiowrite(String diskiowrite) {
		this.diskiowrite = diskiowrite;
	}
	private String diskkbsread;
	public String getDiskkbsread() {
		return diskkbsread;
	}
	public void setDiskkbsread(String diskkbsread) {
		this.diskkbsread = diskkbsread;
	}
	private String diskkbswrite;
	public String getDiskkbswrite() {
		return diskkbswrite;
	}
	public void setDiskkbswrite(String diskkbswrite) {
		this.diskkbswrite = diskkbswrite;
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
	private String forvirtualnetwork;
	public String getForvirtualnetwork() {
		return forvirtualnetwork;
	}
	public void setForvirtualnetwork(String forvirtualnetwork) {
		this.forvirtualnetwork = forvirtualnetwork;
	}
	private String group;
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	private String groupid;
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	private String guestosid;
	public String getGuestosid() {
		return guestosid;
	}
	public void setGuestosid(String guestosid) {
		this.guestosid = guestosid;
	}
	private String haenable;
	public String getHaenable() {
		return haenable;
	}
	public void setHaenable(String haenable) {
		this.haenable = haenable;
	}
	private String hostid;
	public String getHostid() {
		return hostid;
	}
	public void setHostid(String hostid) {
		this.hostid = hostid;
	}
	private String hostname;
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	private String hypervisor;
	public String getHypervisor() {
		return hypervisor;
	}
	public void setHypervisor(String hypervisor) {
		this.hypervisor = hypervisor;
	}
	private String instancename;
	public String getInstancename() {
		return instancename;
	}
	public void setInstancename(String instancename) {
		this.instancename = instancename;
	}
	private String isdynamicallyscalable;
	public String getIsdynamicallyscalable() {
		return isdynamicallyscalable;
	}
	public void setIsdynamicallyscalable(String isdynamicallyscalable) {
		this.isdynamicallyscalable = isdynamicallyscalable;
	}
	private String isodisplaytext;
	public String getIsodisplaytext() {
		return isodisplaytext;
	}
	public void setIsodisplaytext(String isodisplaytext) {
		this.isodisplaytext = isodisplaytext;
	}
	private String isoid;
	public String getIsoid() {
		return isoid;
	}
	public void setIsoid(String isoid) {
		this.isoid = isoid;
	}
	private String isoname;
	public String getIsoname() {
		return isoname;
	}
	public void setIsoname(String isoname) {
		this.isoname = isoname;
	}
	private String keypair;
	public String getKeypair() {
		return keypair;
	}
	public void setKeypair(String keypair) {
		this.keypair = keypair;
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
	private String networkkbsread;
	public String getNetworkkbsread() {
		return networkkbsread;
	}
	public void setNetworkkbsread(String networkkbsread) {
		this.networkkbsread = networkkbsread;
	}
	private String networkkbswrite;
	public String getNetworkkbswrite() {
		return networkkbswrite;
	}
	public void setNetworkkbswrite(String networkkbswrite) {
		this.networkkbswrite = networkkbswrite;
	}
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String passwordenabled;
	public String getPasswordenabled() {
		return passwordenabled;
	}
	public void setPasswordenabled(String passwordenabled) {
		this.passwordenabled = passwordenabled;
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
	private String publicip;
	public String getPublicip() {
		return publicip;
	}
	public void setPublicip(String publicip) {
		this.publicip = publicip;
	}
	private String publicipid;
	public String getPublicipid() {
		return publicipid;
	}
	public void setPublicipid(String publicipid) {
		this.publicipid = publicipid;
	}
	private String rootdeviceid;
	public String getRootdeviceid() {
		return rootdeviceid;
	}
	public void setRootdeviceid(String rootdeviceid) {
		this.rootdeviceid = rootdeviceid;
	}
	private String rootdevicetype;
	public String getRootdevicetype() {
		return rootdevicetype;
	}
	public void setRootdevicetype(String rootdevicetype) {
		this.rootdevicetype = rootdevicetype;
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
	private String servicestate;
	public String getServicestate() {
		return servicestate;
	}
	public void setServicestate(String servicestate) {
		this.servicestate = servicestate;
	}
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private String templatedisplaytext;
	public String getTemplatedisplaytext() {
		return templatedisplaytext;
	}
	public void setTemplatedisplaytext(String templatedisplaytext) {
		this.templatedisplaytext = templatedisplaytext;
	}
	private String templateid;
	public String getTemplateid() {
		return templateid;
	}
	public void setTemplateid(String templateid) {
		this.templateid = templateid;
	}
	private String templatename;
	public String getTemplatename() {
		return templatename;
	}
	public void setTemplatename(String templatename) {
		this.templatename = templatename;
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
	private Affinitygroup affinitygroup;
	public Affinitygroup getAffinitygroup() {
		return affinitygroup;
	}
	public void setAffinitygroup(Affinitygroup affinitygroup) {
		this.affinitygroup = affinitygroup;
	}
	private Nic nic;
	public Nic getNic() {
		return nic;
	}
	public void setNic(Nic nic) {
		this.nic = nic;
	}
	private Securitygroup securitygroup;
	public Securitygroup getSecuritygroup() {
		return securitygroup;
	}
	public void setSecuritygroup(Securitygroup securitygroup) {
		this.securitygroup = securitygroup;
	}
	private Tags tags;
	public Tags getTags() {
		return tags;
	}
	public void setTags(Tags tags) {
		this.tags = tags;
	}
	private String jobid;
	public String getJobid() {
		return jobid;
	}
	public void setJobid(String jobid) {
		this.jobid = jobid;
	}
	private String jobstatus;
	public String getJobstatus() {
		return jobstatus;
	}
	public void setJobstatus(String jobstatus) {
		this.jobstatus = jobstatus;
	}
}
