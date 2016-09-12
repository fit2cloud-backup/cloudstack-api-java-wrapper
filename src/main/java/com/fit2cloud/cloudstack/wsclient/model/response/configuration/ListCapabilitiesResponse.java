package com.fit2cloud.cloudstack.wsclient.model.response.configuration;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListCapabilitiesResponse extends Response {
	private ListCapabilitiesResponseDetail listcapabilitiesresponse;

	public ListCapabilitiesResponseDetail getListcapabilitiesresponse() {
		return listcapabilitiesresponse;
	}

	public void setListcapabilitiesresponse(ListCapabilitiesResponseDetail listcapabilitiesresponse) {
		this.listcapabilitiesresponse = listcapabilitiesresponse;
	}
}
