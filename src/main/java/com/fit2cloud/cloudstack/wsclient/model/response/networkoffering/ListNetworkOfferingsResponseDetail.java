package com.fit2cloud.cloudstack.wsclient.model.response.networkoffering;

import java.util.List;

import com.fit2cloud.cloudstack.wsclient.domain.model.NetworkOffering;

public class ListNetworkOfferingsResponseDetail {
	private int count;
	private List<NetworkOffering> networkoffering;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<NetworkOffering> getNetworkoffering() {
		return networkoffering;
	}
	public void setNetworkoffering(List<NetworkOffering> networkoffering) {
		this.networkoffering = networkoffering;
	}
}
