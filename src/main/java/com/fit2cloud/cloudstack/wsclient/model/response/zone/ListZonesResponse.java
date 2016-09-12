package com.fit2cloud.cloudstack.wsclient.model.response.zone;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListZonesResponse extends Response {
	private ListZonesResponseDetail listzonesresponse;

	public ListZonesResponseDetail getListzonesresponse() {
		return listzonesresponse;
	}

	public void setListzonesresponse(ListZonesResponseDetail listzonesresponse) {
		this.listzonesresponse = listzonesresponse;
	}
}
