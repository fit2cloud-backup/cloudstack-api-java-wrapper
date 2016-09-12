package com.fit2cloud.cloudstack.wsclient.model.response.volume;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListVolumesResponse extends Response {
	
	private ListVolumesResponseDetail listvolumesresponse;

	public ListVolumesResponseDetail getListvolumesresponse() {
		return listvolumesresponse;
	}

	public void setListvolumesresponse(ListVolumesResponseDetail listvolumesresponse) {
		this.listvolumesresponse = listvolumesresponse;
	}
}
