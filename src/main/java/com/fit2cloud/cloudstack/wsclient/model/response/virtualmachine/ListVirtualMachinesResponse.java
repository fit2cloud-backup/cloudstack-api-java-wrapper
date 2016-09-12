package com.fit2cloud.cloudstack.wsclient.model.response.virtualmachine;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListVirtualMachinesResponse extends Response {
	private ListVirtualMachinesResponseDetail listvirtualmachinesresponse;

	public ListVirtualMachinesResponseDetail getListvirtualmachinesresponse() {
		return listvirtualmachinesresponse;
	}

	public void setListvirtualmachinesresponse(ListVirtualMachinesResponseDetail listvirtualmachinesresponse) {
		this.listvirtualmachinesresponse = listvirtualmachinesresponse;
	}
}
