package com.fit2cloud.cloudstack.wsclient.model.response.volume;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class DeleteVolumeResponse extends Response {
	private DeleteVolumeResponseDetail deletevolumeresponse;

	public DeleteVolumeResponseDetail getDeletevolumeresponse() {
		return deletevolumeresponse;
	}

	public void setDeletevolumeresponse(DeleteVolumeResponseDetail deletevolumeresponse) {
		this.deletevolumeresponse = deletevolumeresponse;
	}
}
