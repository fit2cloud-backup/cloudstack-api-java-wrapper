package com.fit2cloud.cloudstack.wsclient.model.request.guestos;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class ListOsTypesRequest extends Request {
	private String description;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String keyword;
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	private String oscategoryid;
	public String getOscategoryid() {
		return oscategoryid;
	}
	public void setOscategoryid(String oscategoryid) {
		this.oscategoryid = oscategoryid;
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

}
