package com.fit2cloud.cloudstack.wsclient.model.response.serviceoffering;

import java.util.List;

import com.fit2cloud.cloudstack.wsclient.domain.model.ServiceOffering;

public class ListServiceOfferingsResponseDetail {
	private int count;
	private List<ServiceOffering> serviceoffering;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<ServiceOffering> getServiceoffering() {
		return serviceoffering;
	}
	public void setServiceoffering(List<ServiceOffering> serviceoffering) {
		this.serviceoffering = serviceoffering;
	}
}
