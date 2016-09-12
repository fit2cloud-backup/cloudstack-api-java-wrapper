package com.fit2cloud.cloudstack.wsclient.model.response.virtualmachine;

import com.fit2cloud.cloudstack.wsclient.domain.model.AsyncJobResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class DeployVirtualMachineResponse extends Response {
	private AsyncJobResponse deployvirtualmachineresponse;

	public AsyncJobResponse getDeployvirtualmachineresponse() {
		return deployvirtualmachineresponse;
	}

	public void setDeployvirtualmachineresponse(AsyncJobResponse deployvirtualmachineresponse) {
		this.deployvirtualmachineresponse = deployvirtualmachineresponse;
	}
}
