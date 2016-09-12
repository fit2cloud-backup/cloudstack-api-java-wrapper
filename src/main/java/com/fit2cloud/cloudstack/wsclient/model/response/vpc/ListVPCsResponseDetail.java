package com.fit2cloud.cloudstack.wsclient.model.response.vpc;

import java.util.List;

import com.fit2cloud.cloudstack.wsclient.domain.model.VPC;

public class ListVPCsResponseDetail {
	private int count;
	private List<VPC> vpc;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<VPC> getVpc() {
		return vpc;
	}
	public void setVpc(List<VPC> vpc) {
		this.vpc = vpc;
	}
}
