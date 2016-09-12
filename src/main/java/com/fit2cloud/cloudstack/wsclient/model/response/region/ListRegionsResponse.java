package com.fit2cloud.cloudstack.wsclient.model.response.region;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListRegionsResponse extends Response {
	private ListRegionsResponseDetail listregionsresponse;

	public ListRegionsResponseDetail getListregionsresponse() {
		return listregionsresponse;
	}

	public void setListregionsresponse(ListRegionsResponseDetail listregionsresponse) {
		this.listregionsresponse = listregionsresponse;
	}
}
