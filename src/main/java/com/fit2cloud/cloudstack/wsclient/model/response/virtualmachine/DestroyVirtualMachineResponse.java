package com.fit2cloud.cloudstack.wsclient.model.response.virtualmachine;

import com.fit2cloud.cloudstack.wsclient.domain.model.AsyncJobResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class DestroyVirtualMachineResponse extends Response {
	private AsyncJobResponse destroyvirtualmachineresponse;

	public AsyncJobResponse getDestroyvirtualmachineresponse() {
		return destroyvirtualmachineresponse;
	}

	public void setDestroyvirtualmachineresponse(AsyncJobResponse destroyvirtualmachineresponse) {
		this.destroyvirtualmachineresponse = destroyvirtualmachineresponse;
	}
}
