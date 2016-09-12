package com.fit2cloud.cloudstack.wsclient.model.request.networkoffering;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class ListNetworkOfferingsRequest extends Request {
	private String availability;
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	private String displaytext;
	public String getDisplaytext() {
		return displaytext;
	}
	public void setDisplaytext(String displaytext) {
		this.displaytext = displaytext;
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
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String isdefault;
	public String getIsdefault() {
		return isdefault;
	}
	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}
	private String istagged;
	public String getIstagged() {
		return istagged;
	}
	public void setIstagged(String istagged) {
		this.istagged = istagged;
	}
	private String keyword;
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String networkid;
	public String getNetworkid() {
		return networkid;
	}
	public void setNetworkid(String networkid) {
		this.networkid = networkid;
	}
	private String page;
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	private String pagesize;
	public String getPagesize() {
		return pagesize;
	}
	public void setPagesize(String pagesize) {
		this.pagesize = pagesize;
	}
	private String sourcenatsupported;
	public String getSourcenatsupported() {
		return sourcenatsupported;
	}
	public void setSourcenatsupported(String sourcenatsupported) {
		this.sourcenatsupported = sourcenatsupported;
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
	private String supportedservices;
	public String getSupportedservices() {
		return supportedservices;
	}
	public void setSupportedservices(String supportedservices) {
		this.supportedservices = supportedservices;
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
	private String zoneid;
	public String getZoneid() {
		return zoneid;
	}
	public void setZoneid(String zoneid) {
		this.zoneid = zoneid;
	}

}
