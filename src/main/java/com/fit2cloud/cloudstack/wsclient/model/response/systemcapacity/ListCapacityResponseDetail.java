package com.fit2cloud.cloudstack.wsclient.model.response.systemcapacity;

import java.util.List;

import com.fit2cloud.cloudstack.wsclient.domain.model.Capacity;

public class ListCapacityResponseDetail {
	private int count;
	private List<Capacity> capacity;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Capacity> getCapacity() {
		return capacity;
	}
	public void setCapacity(List<Capacity> capacity) {
		this.capacity = capacity;
	}
}
