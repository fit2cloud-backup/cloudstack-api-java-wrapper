package com.fit2cloud.cloudstack.wsclient.model.response.diskoffering;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListDiskOfferingsResponse extends Response {
	private ListDiskOfferingsResponseDetail listdiskofferingsresponse;

	public ListDiskOfferingsResponseDetail getListdiskofferingsresponse() {
		return listdiskofferingsresponse;
	}

	public void setListdiskofferingsresponse(ListDiskOfferingsResponseDetail listdiskofferingsresponse) {
		this.listdiskofferingsresponse = listdiskofferingsresponse;
	}
}
