package com.fit2cloud.cloudstack.wsclient.model.request.systemcapacity;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class ListCapacityRequest extends Request {
	private String clusterid;
	private String fetchlatest;
	private String keyword;
	private String page;
	private String pagesize;
	private String podid;
	private String sortby;
	private String type;
	private String zoneid;
	public String getClusterid() {
		return clusterid;
	}
	public void setClusterid(String clusterid) {
		this.clusterid = clusterid;
	}
	public String getFetchlatest() {
		return fetchlatest;
	}
	public void setFetchlatest(String fetchlatest) {
		this.fetchlatest = fetchlatest;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getPagesize() {
		return pagesize;
	}
	public void setPagesize(String pagesize) {
		this.pagesize = pagesize;
	}
	public String getPodid() {
		return podid;
	}
	public void setPodid(String podid) {
		this.podid = podid;
	}
	public String getSortby() {
		return sortby;
	}
	public void setSortby(String sortby) {
		this.sortby = sortby;
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
}
