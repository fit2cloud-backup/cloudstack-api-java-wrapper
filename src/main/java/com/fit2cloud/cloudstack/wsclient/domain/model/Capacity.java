package com.fit2cloud.cloudstack.wsclient.domain.model;

public class Capacity {
	private String capacitytotal;
	private String capacityused;
	private String clusterid;
	private String clustername;
	private String percentused;
	private String podid;
	private String podname;
	private String type;
	private String zoneid;
	private String zonename;
	public String getCapacitytotal() {
		return capacitytotal;
	}
	public void setCapacitytotal(String capacitytotal) {
		this.capacitytotal = capacitytotal;
	}
	public String getCapacityused() {
		return capacityused;
	}
	public void setCapacityused(String capacityused) {
		this.capacityused = capacityused;
	}
	public String getClusterid() {
		return clusterid;
	}
	public void setClusterid(String clusterid) {
		this.clusterid = clusterid;
	}
	public String getClustername() {
		return clustername;
	}
	public void setClustername(String clustername) {
		this.clustername = clustername;
	}
	public String getPercentused() {
		return percentused;
	}
	public void setPercentused(String percentused) {
		this.percentused = percentused;
	}
	public String getPodid() {
		return podid;
	}
	public void setPodid(String podid) {
		this.podid = podid;
	}
	public String getPodname() {
		return podname;
	}
	public void setPodname(String podname) {
		this.podname = podname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getZoneid() {
		return zoneid;
	}
	public void setZoneid(String zoneid) {
		this.zoneid = zoneid;
	}
	public String getZonename() {
		return zonename;
	}
	public void setZonename(String zonename) {
		this.zonename = zonename;
	}
}
