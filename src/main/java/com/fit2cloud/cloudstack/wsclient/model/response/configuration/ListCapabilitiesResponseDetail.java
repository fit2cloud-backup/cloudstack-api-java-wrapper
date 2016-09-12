package com.fit2cloud.cloudstack.wsclient.model.response.configuration;

import com.fit2cloud.cloudstack.wsclient.domain.model.Capability;

public class ListCapabilitiesResponseDetail {
	private Capability capability;

	public Capability getCapability() {
		return capability;
	}

	public void setCapability(Capability capability) {
		this.capability = capability;
	}
}
