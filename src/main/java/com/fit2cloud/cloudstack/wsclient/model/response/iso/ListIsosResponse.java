package com.fit2cloud.cloudstack.wsclient.model.response.iso;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListIsosResponse extends Response {
	private ListIsosResponseDetail listisosresponse;

	public ListIsosResponseDetail getListisosresponse() {
		return listisosresponse;
	}

	public void setListisosresponse(ListIsosResponseDetail listisosresponse) {
		this.listisosresponse = listisosresponse;
	}

}
