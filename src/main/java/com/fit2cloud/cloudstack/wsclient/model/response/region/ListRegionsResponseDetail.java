package com.fit2cloud.cloudstack.wsclient.model.response.region;

import java.util.List;

import com.fit2cloud.cloudstack.wsclient.domain.model.Region;

public class ListRegionsResponseDetail {
	private int count;
	private List<Region> region;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Region> getRegion() {
		return region;
	}
	public void setRegion(List<Region> region) {
		this.region = region;
	}
}
