package com.fit2cloud.cloudstack.wsclient.model.response.serviceoffering;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListServiceOfferingsResponse extends Response {
	
	private ListServiceOfferingsResponseDetail listserviceofferingsresponse;

	public ListServiceOfferingsResponseDetail getListserviceofferingsresponse() {
		return listserviceofferingsresponse;
	}

	public void setListserviceofferingsresponse(ListServiceOfferingsResponseDetail listserviceofferingsresponse) {
		this.listserviceofferingsresponse = listserviceofferingsresponse;
	}
}
