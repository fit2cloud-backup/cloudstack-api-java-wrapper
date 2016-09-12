package com.fit2cloud.cloudstack.wsclient.model.request.network;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class UpdateNetworkRequest extends Request {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String changecidr;
	public String getChangecidr() {
		return changecidr;
	}
	public void setChangecidr(String changecidr) {
		this.changecidr = changecidr;
	}
	private String displaynetwork;
	public String getDisplaynetwork() {
		return displaynetwork;
	}
	public void setDisplaynetwork(String displaynetwork) {
		this.displaynetwork = displaynetwork;
	}
	private String displaytext;
	public String getDisplaytext() {
		return displaytext;
	}
	public void setDisplaytext(String displaytext) {
		this.displaytext = displaytext;
	}
	private String guestvmcidr;
	public String getGuestvmcidr() {
		return guestvmcidr;
	}
	public void setGuestvmcidr(String guestvmcidr) {
		this.guestvmcidr = guestvmcidr;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String networkdomain;
	public String getNetworkdomain() {
		return networkdomain;
	}
	public void setNetworkdomain(String networkdomain) {
		this.networkdomain = networkdomain;
	}
	private String networkofferingid;
	public String getNetworkofferingid() {
		return networkofferingid;
	}
	public void setNetworkofferingid(String networkofferingid) {
		this.networkofferingid = networkofferingid;
	}

}
