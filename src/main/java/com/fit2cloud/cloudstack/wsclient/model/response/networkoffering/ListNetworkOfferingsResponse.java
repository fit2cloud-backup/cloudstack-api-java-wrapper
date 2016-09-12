package com.fit2cloud.cloudstack.wsclient.model.response.networkoffering;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListNetworkOfferingsResponse extends Response {
	private ListNetworkOfferingsResponseDetail listnetworkofferingsresponse;

	public ListNetworkOfferingsResponseDetail getListnetworkofferingsresponse() {
		return listnetworkofferingsresponse;
	}

	public void setListnetworkofferingsresponse(ListNetworkOfferingsResponseDetail listnetworkofferingsresponse) {
		this.listnetworkofferingsresponse = listnetworkofferingsresponse;
	}
}
