package com.fit2cloud.cloudstack.wsclient.model.response.diskoffering;

import java.util.List;

import com.fit2cloud.cloudstack.wsclient.domain.model.DiskOffering;

public class ListDiskOfferingsResponseDetail {
	private int count;
	private List<DiskOffering> diskoffering;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<DiskOffering> getDiskoffering() {
		return diskoffering;
	}
	public void setDiskoffering(List<DiskOffering> diskoffering) {
		this.diskoffering = diskoffering;
	}
}
