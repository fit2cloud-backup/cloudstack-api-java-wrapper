package com.fit2cloud.cloudstack.wsclient.model.response.systemcapacity;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListCapacityResponse extends Response {
	private ListCapacityResponseDetail listcapacityresponse;

	public ListCapacityResponseDetail getListcapacityresponse() {
		return listcapacityresponse;
	}

	public void setListcapacityresponse(ListCapacityResponseDetail listcapacityresponse) {
		this.listcapacityresponse = listcapacityresponse;
	}
}
