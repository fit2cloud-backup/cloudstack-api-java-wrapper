package com.fit2cloud.cloudstack.wsclient.model.response.vpc;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListVPCsResponse extends Response {
	private ListVPCsResponseDetail listvpcsresponse;

	public ListVPCsResponseDetail getListvpcsresponse() {
		return listvpcsresponse;
	}

	public void setListvpcsresponse(ListVPCsResponseDetail listvpcsresponse) {
		this.listvpcsresponse = listvpcsresponse;
	}
}
