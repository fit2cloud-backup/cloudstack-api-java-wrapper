package com.fit2cloud.cloudstack.wsclient.model.response.host;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListHostsResponse extends Response {
	private ListHostsResponseDetail listhostsresponse;

	public ListHostsResponseDetail getListhostsresponse() {
		return listhostsresponse;
	}

	public void setListhostsresponse(ListHostsResponseDetail listhostsresponse) {
		this.listhostsresponse = listhostsresponse;
	}
}
