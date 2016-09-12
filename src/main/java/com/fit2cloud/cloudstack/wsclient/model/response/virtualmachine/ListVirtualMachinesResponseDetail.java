package com.fit2cloud.cloudstack.wsclient.model.response.virtualmachine;

import java.util.List;

import com.fit2cloud.cloudstack.wsclient.domain.model.VirtualMachine;

public class ListVirtualMachinesResponseDetail {
	private int count;
	private List<VirtualMachine> virtualmachine;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<VirtualMachine> getVirtualmachine() {
		return virtualmachine;
	}
	public void setVirtualmachine(List<VirtualMachine> virtualmachine) {
		this.virtualmachine = virtualmachine;
	}
}
