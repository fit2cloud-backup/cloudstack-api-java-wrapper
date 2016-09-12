package com.fit2cloud.cloudstack.wsclient.model.response.network;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListNetworksResponse extends Response {
	private ListNetworksResponseDetail listnetworksresponse;

	public ListNetworksResponseDetail getListnetworksresponse() {
		return listnetworksresponse;
	}

	public void setListnetworksresponse(ListNetworksResponseDetail listnetworksresponse) {
		this.listnetworksresponse = listnetworksresponse;
	}
}
