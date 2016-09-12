package com.fit2cloud.cloudstack.wsclient.model.response.network;

import java.util.List;

import com.fit2cloud.cloudstack.wsclient.domain.model.Network;

public class ListNetworksResponseDetail {
	private int count;
	private List<Network> network;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Network> getNetwork() {
		return network;
	}
	public void setNetwork(List<Network> network) {
		this.network = network;
	}
}
