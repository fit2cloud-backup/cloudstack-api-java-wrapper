package com.fit2cloud.cloudstack.wsclient.model.response.template;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ExtractTemplateResponse extends Response {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String accountid;
	public String getAccountid() {
		return accountid;
	}
	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}
	private String created;
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	private String extractId;
	public String getExtractId() {
		return extractId;
	}
	public void setExtractId(String extractId) {
		this.extractId = extractId;
	}
	private String extractMode;
	public String getExtractMode() {
		return extractMode;
	}
	public void setExtractMode(String extractMode) {
		this.extractMode = extractMode;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	private String storagetype;
	public String getStoragetype() {
		return storagetype;
	}
	public void setStoragetype(String storagetype) {
		this.storagetype = storagetype;
	}
	private String uploadpercentage;
	public String getUploadpercentage() {
		return uploadpercentage;
	}
	public void setUploadpercentage(String uploadpercentage) {
		this.uploadpercentage = uploadpercentage;
	}
	private String url;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
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

}
