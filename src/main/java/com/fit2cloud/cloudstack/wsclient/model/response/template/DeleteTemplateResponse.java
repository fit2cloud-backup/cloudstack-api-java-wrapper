package com.fit2cloud.cloudstack.wsclient.model.response.template;

import com.fit2cloud.cloudstack.wsclient.domain.model.AsyncJobResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class DeleteTemplateResponse extends Response {
	private AsyncJobResponse deletetemplateresponse;

	public AsyncJobResponse getDeletetemplateresponse() {
		return deletetemplateresponse;
	}

	public void setDeletetemplateresponse(AsyncJobResponse deletetemplateresponse) {
		this.deletetemplateresponse = deletetemplateresponse;
	}
}
