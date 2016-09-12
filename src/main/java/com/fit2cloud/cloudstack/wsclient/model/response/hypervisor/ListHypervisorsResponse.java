package com.fit2cloud.cloudstack.wsclient.model.response.hypervisor;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListHypervisorsResponse extends Response {
	private ListHypervisorsResponseDetail listhypervisorsresponse;

	public ListHypervisorsResponseDetail getListhypervisorsresponse() {
		return listhypervisorsresponse;
	}

	public void setListhypervisorsresponse(ListHypervisorsResponseDetail listhypervisorsresponse) {
		this.listhypervisorsresponse = listhypervisorsresponse;
	}
}
