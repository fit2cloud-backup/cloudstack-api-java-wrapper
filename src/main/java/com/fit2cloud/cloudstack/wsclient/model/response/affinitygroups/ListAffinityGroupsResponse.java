package com.fit2cloud.cloudstack.wsclient.model.response.affinitygroups;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListAffinityGroupsResponse extends Response {
	private ListAffinityGroupsResponseDetail listaffinitygroupsresponse;

	public ListAffinityGroupsResponseDetail getListaffinitygroupsresponse() {
		return listaffinitygroupsresponse;
	}

	public void setListaffinitygroupsresponse(ListAffinityGroupsResponseDetail listaffinitygroupsresponse) {
		this.listaffinitygroupsresponse = listaffinitygroupsresponse;
	}
}
