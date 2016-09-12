package com.fit2cloud.cloudstack.wsclient.model.response.host;

import java.util.List;

import com.fit2cloud.cloudstack.wsclient.domain.model.Host;

public class ListHostsResponseDetail {
	private int count;
	private List<Host> host;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Host> getHost() {
		return host;
	}
	public void setHost(List<Host> host) {
		this.host = host;
	}
}
