package com.fit2cloud.cloudstack.wsclient.domain.model;

import java.util.List;

public class NetworkOffering {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String availability;
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	private String conservemode;
	public String getConservemode() {
		return conservemode;
	}
	public void setConservemode(String conservemode) {
		this.conservemode = conservemode;
	}
	private String created;
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	private String details;
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	private String displaytext;
	public String getDisplaytext() {
		return displaytext;
	}
	public void setDisplaytext(String displaytext) {
		this.displaytext = displaytext;
	}
	private String egressdefaultpolicy;
	public String getEgressdefaultpolicy() {
		return egressdefaultpolicy;
	}
	public void setEgressdefaultpolicy(String egressdefaultpolicy) {
		this.egressdefaultpolicy = egressdefaultpolicy;
	}
	private String forvpc;
	public String getForvpc() {
		return forvpc;
	}
	public void setForvpc(String forvpc) {
		this.forvpc = forvpc;
	}
	private String guestiptype;
	public String getGuestiptype() {
		return guestiptype;
	}
	public void setGuestiptype(String guestiptype) {
		this.guestiptype = guestiptype;
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
	private String maxconnections;
	public String getMaxconnections() {
		return maxconnections;
	}
	public void setMaxconnections(String maxconnections) {
		this.maxconnections = maxconnections;
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
	private String serviceofferingid;
	public String getServiceofferingid() {
		return serviceofferingid;
	}
	public void setServiceofferingid(String serviceofferingid) {
		this.serviceofferingid = serviceofferingid;
	}
	private String specifyipranges;
	public String getSpecifyipranges() {
		return specifyipranges;
	}
	public void setSpecifyipranges(String specifyipranges) {
		this.specifyipranges = specifyipranges;
	}
	private String specifyvlan;
	public String getSpecifyvlan() {
		return specifyvlan;
	}
	public void setSpecifyvlan(String specifyvlan) {
		this.specifyvlan = specifyvlan;
	}
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private String tags;
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	private String traffictype;
	public String getTraffictype() {
		return traffictype;
	}
	public void setTraffictype(String traffictype) {
		this.traffictype = traffictype;
	}
	private List<Service> service;
	public List<Service> getService() {
		return service;
	}
	public void setService(List<Service> service) {
		this.service = service;
	}
}
