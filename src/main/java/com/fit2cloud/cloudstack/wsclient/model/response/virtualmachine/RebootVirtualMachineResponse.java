package com.fit2cloud.cloudstack.wsclient.model.response.virtualmachine;

import com.fit2cloud.cloudstack.wsclient.domain.model.AsyncJobResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class RebootVirtualMachineResponse extends Response {
	private AsyncJobResponse rebootvirtualmachineresponse;

	public AsyncJobResponse getRebootvirtualmachineresponse() {
		return rebootvirtualmachineresponse;
	}

	public void setRebootvirtualmachineresponse(AsyncJobResponse rebootvirtualmachineresponse) {
		this.rebootvirtualmachineresponse = rebootvirtualmachineresponse;
	}
}
