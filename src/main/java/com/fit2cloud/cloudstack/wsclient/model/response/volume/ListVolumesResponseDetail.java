package com.fit2cloud.cloudstack.wsclient.model.response.volume;

import java.util.List;

import com.fit2cloud.cloudstack.wsclient.domain.model.Volume;

public class ListVolumesResponseDetail {
	private int count;
	private List<Volume> volume;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Volume> getVolume() {
		return volume;
	}
	public void setVolume(List<Volume> volume) {
		this.volume = volume;
	}
}
