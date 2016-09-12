package com.fit2cloud.cloudstack.wsclient.model.response.hypervisor;

import java.util.List;

import com.fit2cloud.cloudstack.wsclient.domain.model.Hypervisor;

public class ListHypervisorsResponseDetail {
	private int count;
	private List<Hypervisor> hypervisor;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Hypervisor> getHypervisor() {
		return hypervisor;
	}
	public void setHypervisor(List<Hypervisor> hypervisor) {
		this.hypervisor = hypervisor;
	}
}
