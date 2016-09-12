package com.fit2cloud.cloudstack.wsclient.domain.model;

import java.util.List;

public class Service {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private List<ServiceCapability> capability;
	public List<ServiceCapability> getCapability() {
		return capability;
	}
	public void setCapability(List<ServiceCapability> capability) {
		this.capability = capability;
	}
	private List<Provider> provider;
	public List<Provider> getProvider() {
		return provider;
	}
	public void setProvider(List<Provider> provider) {
		this.provider = provider;
	}
}