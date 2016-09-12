package com.fit2cloud.cloudstack.wsclient.model.request.snapshot;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class ListSnapshotPoliciesRequest extends Request {
	private String volumeid;
	public String getVolumeid() {
		return volumeid;
	}
	public void setVolumeid(String volumeid) {
		this.volumeid = volumeid;
	}
	private String keyword;
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
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
