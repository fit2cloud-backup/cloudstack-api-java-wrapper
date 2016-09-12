package com.fit2cloud.cloudstack.wsclient.model.response.virtualmachine;

import com.fit2cloud.cloudstack.wsclient.domain.model.AsyncJobResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class StartVirtualMachineResponse extends Response {
	private AsyncJobResponse startvirtualmachineresponse;

	public AsyncJobResponse getStartvirtualmachineresponse() {
		return startvirtualmachineresponse;
	}

	public void setStartvirtualmachineresponse(AsyncJobResponse startvirtualmachineresponse) {
		this.startvirtualmachineresponse = startvirtualmachineresponse;
	}
}
