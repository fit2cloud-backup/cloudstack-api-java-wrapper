package com.fit2cloud.cloudstack.wsclient.model.response.virtualmachine;

import com.fit2cloud.cloudstack.wsclient.domain.model.AsyncJobResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class StopVirtualMachineResponse extends Response {
	private AsyncJobResponse stopvirtualmachineresponse;

	public AsyncJobResponse getStopvirtualmachineresponse() {
		return stopvirtualmachineresponse;
	}

	public void setStopvirtualmachineresponse(AsyncJobResponse stopvirtualmachineresponse) {
		this.stopvirtualmachineresponse = stopvirtualmachineresponse;
	}
}
