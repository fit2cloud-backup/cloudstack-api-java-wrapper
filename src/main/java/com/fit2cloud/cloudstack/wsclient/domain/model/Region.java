package com.fit2cloud.cloudstack.wsclient.domain.model;

public class Region {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String endpoint;
	public String getEndpoint() {
		return endpoint;
	}
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	private String gslbserviceenabled;
	public String getGslbserviceenabled() {
		return gslbserviceenabled;
	}
	public void setGslbserviceenabled(String gslbserviceenabled) {
		this.gslbserviceenabled = gslbserviceenabled;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String portableipserviceenabled;
	public String getPortableipserviceenabled() {
		return portableipserviceenabled;
	}
	public void setPortableipserviceenabled(String portableipserviceenabled) {
		this.portableipserviceenabled = portableipserviceenabled;
	}
}
