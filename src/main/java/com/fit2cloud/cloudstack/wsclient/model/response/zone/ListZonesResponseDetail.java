package com.fit2cloud.cloudstack.wsclient.model.response.zone;

import java.util.List;

import com.fit2cloud.cloudstack.wsclient.domain.model.Zone;

public class ListZonesResponseDetail {
	private int count;
	private List<Zone> zone;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Zone> getZone() {
		return zone;
	}
	public void setZone(List<Zone> zone) {
		this.zone = zone;
	}
}
