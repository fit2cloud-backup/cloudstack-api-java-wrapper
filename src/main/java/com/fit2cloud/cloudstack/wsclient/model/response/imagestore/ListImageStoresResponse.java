package com.fit2cloud.cloudstack.wsclient.model.response.imagestore;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListImageStoresResponse extends Response {
	private ListImageStoresResponseDetail listimagestoresresponse;

	public ListImageStoresResponseDetail getListimagestoresresponse() {
		return listimagestoresresponse;
	}

	public void setListimagestoresresponse(ListImageStoresResponseDetail listimagestoresresponse) {
		this.listimagestoresresponse = listimagestoresresponse;
	}
}
